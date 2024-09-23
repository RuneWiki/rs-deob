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

    @OriginalMember(owner = "client", name = "J", descriptor = "Z")
    private boolean field1233 = false;

    @OriginalMember(owner = "client", name = "R", descriptor = "Z")
    private boolean field1241 = false;

    @OriginalMember(owner = "client", name = "T", descriptor = "Llb;")
    private Packet field1243 = Packet.method215(-929, 1);

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    private int[] field1248 = new int[1000];

    @OriginalMember(owner = "client", name = "Z", descriptor = "[I")
    private int[] field1249 = new int[1000];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field1250 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "B")
    private byte field1251 = -83;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1254 = -1;

    @OriginalMember(owner = "client", name = "hb", descriptor = "[Ljb;")
    private Pix8[] field1257 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ib", descriptor = "[I")
    private int[] field1258 = new int[500];

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field1259 = new int[500];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1260 = new int[500];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1261 = new int[500];

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1265 = 3353893;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1267 = new int[50];

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field1268 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private int[] field1270 = new int[7];

    @OriginalMember(owner = "client", name = "vb", descriptor = "Llb;")
    private Packet field1271 = Packet.method215(-929, 1);

    @OriginalMember(owner = "client", name = "wb", descriptor = "[I")
    private int[] field1272 = new int[Stats.field1167];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    public boolean field1284 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[Lib;")
    private Pix32[] field1288 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1289 = new int[151];

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Lib;")
    private Pix32[] field1293 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1295 = 78;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field1302 = new int[151];

    @OriginalMember(owner = "client", name = "cc", descriptor = "B")
    private byte field1304 = -127;

    @OriginalMember(owner = "client", name = "dc", descriptor = "B")
    private byte field1305 = 38;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[[I")
    private int[][] field1306 = new int[104][104];

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field1307 = false;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1310 = -1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field1314 = false;

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field1315 = new int[200];

    @OriginalMember(owner = "client", name = "qc", descriptor = "[Ljava/lang/String;")
    private String[] field1318 = new String[500];

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private boolean field1319 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1321 = -1;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1323 = 70;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[I")
    private int[] field1331 = new int[33];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Lob;")
    private LinkList field1339 = new LinkList(-199);

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[Ljava/lang/String;")
    private String[] field1340 = new String[5];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[Z")
    private boolean[] field1341 = new boolean[5];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field1343 = false;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1345 = -1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "B")
    private byte field1346 = 1;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1350 = 128;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    public boolean field1355 = true;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field1356 = false;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1359 = new int[5];

    @OriginalMember(owner = "client", name = "gd", descriptor = "Ljava/lang/String;")
    private String field1360 = "";

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    public int[] field1362 = new int[1000];

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field1364 = new int[5];

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field1367 = false;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1369 = -587;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    private boolean field1371 = true;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1372 = new CRC32();

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1381 = 2;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field1382 = new int[33];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1383 = 817;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1384 = -1;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1386 = -1;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1390 = -8033;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1395 = 8;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[[I")
    private int[][] field1396 = new int[104][104];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field1397 = new int[5];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "B")
    private byte field1398 = 8;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[J")
    private long[] field1400 = new long[200];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private boolean field1401 = false;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private boolean field1406 = true;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    private boolean field1408 = false;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1421 = 2301979;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1422 = new int[5];

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field1423 = new int[100];

    @OriginalMember(owner = "client", name = "se", descriptor = "[Ljava/lang/String;")
    private String[] field1424 = new String[100];

    @OriginalMember(owner = "client", name = "te", descriptor = "[Ljava/lang/String;")
    private String[] field1425 = new String[100];

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field1427 = new int[50];

    @OriginalMember(owner = "client", name = "we", descriptor = "Ljava/lang/String;")
    private String field1428 = "";

    @OriginalMember(owner = "client", name = "xe", descriptor = "[Lz;")
    private NpcEntity[] field1429 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    public int[] field1431 = new int[16384];

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1433 = 2;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private final int field1436 = 100;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field1437 = new int[100];

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field1439 = new int[256];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1440 = 661;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field1441 = new int[4000];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field1442 = new int[4000];

    @OriginalMember(owner = "client", name = "Le", descriptor = "[Ljc;")
    private CollisionMap[] field1443 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field1445 = new int[2000];

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1448 = 3;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[I")
    private int[] field1456 = new int[Stats.field1167];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field1457 = true;

    @OriginalMember(owner = "client", name = "ff", descriptor = "B")
    private byte field1463 = -71;

    @OriginalMember(owner = "client", name = "hf", descriptor = "[Ljava/lang/String;")
    private String[] field1465 = new String[200];

    @OriginalMember(owner = "client", name = "nf", descriptor = "Z")
    private boolean field1470 = false;

    @OriginalMember(owner = "client", name = "of", descriptor = "Z")
    private boolean field1471 = true;

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field1472 = new int[9];

    @OriginalMember(owner = "client", name = "qf", descriptor = "[Lib;")
    private Pix32[] field1473 = new Pix32[100];

    @OriginalMember(owner = "client", name = "rf", descriptor = "B")
    private byte field1474 = 29;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lob;")
    private LinkList field1475 = new LinkList(-199);

    @OriginalMember(owner = "client", name = "tf", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1477 = 513;

    @OriginalMember(owner = "client", name = "vf", descriptor = "Z")
    private boolean field1478 = true;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field1481 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Af", descriptor = "Z")
    private boolean field1483 = false;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1485 = -1;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1486 = -1;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Ljava/lang/String;")
    private String field1492 = "";

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Ljava/lang/String;")
    private String field1493 = "";

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1495 = -940;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1497 = 1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field1505 = false;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1506 = 7759444;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "B")
    private byte field1507 = 38;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field1511 = new int[Stats.field1167];

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1512 = 37395;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ljava/lang/String;")
    private String field1513 = "";

    @OriginalMember(owner = "client", name = "kg", descriptor = "B")
    private byte field1519 = 29;

    @OriginalMember(owner = "client", name = "ng", descriptor = "B")
    private byte field1522 = 6;

    @OriginalMember(owner = "client", name = "og", descriptor = "Ljava/lang/String;")
    private String field1523 = "";

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1528 = 1;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[Lib;")
    private Pix32[] field1529 = new Pix32[20];

    @OriginalMember(owner = "client", name = "vg", descriptor = "[B")
    private byte[] field1530 = new byte[16384];

    @OriginalMember(owner = "client", name = "wg", descriptor = "Ljava/lang/String;")
    private String field1531 = "";

    @OriginalMember(owner = "client", name = "xg", descriptor = "Ljava/lang/String;")
    private String field1532 = "";

    @OriginalMember(owner = "client", name = "zg", descriptor = "[[I")
    private int[][] field1534 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1536 = -1;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lob;")
    private LinkList field1537 = new LinkList(-199);

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Llb;")
    private Packet field1553 = Packet.method215(-929, 1);

    @OriginalMember(owner = "client", name = "bh", descriptor = "Ljava/lang/String;")
    private String field1562 = "";

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private final int[] field1563 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "gh", descriptor = "[[[Lob;")
    private LinkList[][][] field1567 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1568 = false;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1574 = -6002;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private boolean field1575 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field1577 = false;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1579 = 50;

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field1580 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field1581 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field1582 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field1583 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1584 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1585 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "zh", descriptor = "[I")
    private int[] field1586 = new int[this.field1579];

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[Ljava/lang/String;")
    private String[] field1587 = new String[this.field1579];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Z")
    private boolean field1595 = false;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1598 = -1;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field1599 = true;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field1600 = true;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "B")
    private byte field1603 = 2;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[Lib;")
    private Pix32[] field1604 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field1612 = true;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[I")
    private int[] field1614 = new int[50];

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1620 = -1;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1621 = 5063219;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Ld;")
    private Component field1622 = new Component();

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1623 = 9;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field1624 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field1627 = new int[5];

    @OriginalMember(owner = "client", name = "qi", descriptor = "[Lvb;")
    public FileStream[] field1629 = new FileStream[5];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[Z")
    private boolean[] field1630 = new boolean[5];

    @OriginalMember(owner = "client", name = "vi", descriptor = "B")
    private byte field1634 = 1;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    public int[] field1635 = new int[2000];

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1637 = 2;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1638 = -1;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1644 = 2048;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1645 = 2047;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[Lab;")
    private PlayerEntity[] field1646 = new PlayerEntity[this.field1644];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    public int[] field1648 = new int[this.field1644];

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field1650 = new int[this.field1644];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[Llb;")
    private Packet[] field1651 = new Packet[this.field1644];

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private boolean field1658 = false;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[Ljb;")
    private Pix8[] field1662 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1664 = 831;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1665 = 393;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1668 = -282;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1674 = -1;

    @OriginalMember(owner = "client", name = "kj", descriptor = "[J")
    private long[] field1675 = new long[100];

    @OriginalMember(owner = "client", name = "sj", descriptor = "Z")
    private boolean field1683 = false;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Z")
    private boolean field1696 = false;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[Ljb;")
    private Pix8[] field1697 = new Pix8[13];

    @OriginalMember(owner = "client", name = "qd", descriptor = "B")
    private static byte field1370 = -48;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private static int field1379 = 1;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Ljava/lang/String;")
    private static String field1387 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private static int[] field1405 = new int[99];

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    public static final int[] field1464;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1466;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[[I")
    public static final int[][] field1494;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    public static int[] field1509;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1556;

    @OriginalMember(owner = "client", name = "ci", descriptor = "B")
    private static byte field1615;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private static int field1653;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private static boolean field1655;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private static int field1667;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private static int field1242;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private static int field1266;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private static int field1291;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private static int field1294;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private static int field1344;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private static int field1365;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private static int field1407;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private static int field1450;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private static int field1467;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private static int field1508;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private static int field1521;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private static int field1535;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private static int field1588;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private static int field1601;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private static int field1625;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private static int field1628;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field1659;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private static int field1695;

    @OriginalMember(owner = "client", name = "K", descriptor = "J")
    private long field1234;

    @OriginalMember(owner = "client", name = "Id", descriptor = "J")
    private long field1388;

    @OriginalMember(owner = "client", name = "mf", descriptor = "J")
    private long field1469;

    @OriginalMember(owner = "client", name = "If", descriptor = "J")
    private long field1491;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "J")
    public long field1602;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Le;")
    private ClientStream field1520;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Lwb;")
    private Isaac field1348;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lxb;")
    private Jagfile field1538;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Lfc;")
    public MouseTracking field1287;

    @OriginalMember(owner = "client", name = "L", descriptor = "Lub;")
    private OnDemand field1235;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Lib;")
    private Pix32 field1334;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lib;")
    private Pix32 field1409;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lib;")
    private Pix32 field1446;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lib;")
    private Pix32 field1447;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Lib;")
    private Pix32 field1498;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Lib;")
    private Pix32 field1499;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lib;")
    private Pix32 field1500;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lib;")
    private Pix32 field1501;

    @OriginalMember(owner = "client", name = "si", descriptor = "Lib;")
    private Pix32 field1631;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Lib;")
    private Pix32 field1632;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Lib;")
    private Pix32 field1682;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Lib;")
    private Pix32 field1698;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Lib;")
    private Pix32 field1699;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Ljb;")
    private Pix8 field1273;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Ljb;")
    private Pix8 field1274;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Ljb;")
    private Pix8 field1275;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Ljb;")
    private Pix8 field1276;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Ljb;")
    private Pix8 field1277;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljb;")
    private Pix8 field1312;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Ljb;")
    private Pix8 field1313;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Ljb;")
    private Pix8 field1324;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Ljb;")
    private Pix8 field1325;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljb;")
    private Pix8 field1326;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Ljb;")
    private Pix8 field1479;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ljb;")
    private Pix8 field1480;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljb;")
    private Pix8 field1557;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Ljb;")
    private Pix8 field1558;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Ljb;")
    private Pix8 field1559;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Ljb;")
    private Pix8 field1560;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Ljb;")
    private Pix8 field1561;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Ljb;")
    private Pix8 field1564;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Ljb;")
    private Pix8 field1565;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljb;")
    private Pix8 field1566;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Lkb;")
    private PixFont field1676;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Lkb;")
    private PixFont field1677;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Lkb;")
    private PixFont field1678;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Lkb;")
    private PixFont field1679;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lqb;")
    private PixMap field1279;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lqb;")
    private PixMap field1280;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Lqb;")
    private PixMap field1281;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lqb;")
    private PixMap field1544;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Lqb;")
    private PixMap field1545;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lqb;")
    private PixMap field1546;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Lqb;")
    private PixMap field1547;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lqb;")
    private PixMap field1548;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Lqb;")
    private PixMap field1549;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Lqb;")
    private PixMap field1550;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Lqb;")
    private PixMap field1551;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Lqb;")
    private PixMap field1552;

    @OriginalMember(owner = "client", name = "di", descriptor = "Lqb;")
    private PixMap field1616;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Lqb;")
    private PixMap field1617;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Lqb;")
    private PixMap field1618;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Lqb;")
    private PixMap field1619;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Lqb;")
    private PixMap field1684;

    @OriginalMember(owner = "client", name = "uj", descriptor = "Lqb;")
    private PixMap field1685;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Lqb;")
    private PixMap field1686;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Lqb;")
    private PixMap field1687;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Lqb;")
    private PixMap field1688;

    @OriginalMember(owner = "client", name = "yj", descriptor = "Lqb;")
    private PixMap field1689;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Lqb;")
    private PixMap field1690;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Lqb;")
    private PixMap field1691;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Lqb;")
    private PixMap field1692;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lab;")
    public static PlayerEntity field1468;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Lr;")
    private World3D field1613;

    @OriginalMember(owner = "client", name = "U", descriptor = "Ljava/lang/String;")
    private String field1244;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field1347;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Ljava/lang/String;")
    public String field1377;

    @OriginalMember(owner = "client", name = "me", descriptor = "Ljava/lang/String;")
    public String field1418;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Ljava/net/Socket;")
    private Socket field1434;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private static boolean field1317;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Z")
    public static boolean field1358;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Z")
    private static boolean field1482;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Z")
    private static boolean field1656;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Z")
    public static boolean field1700;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field1335;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1337;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[I")
    private int[] field1460;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field1461;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field1462;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field1555;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[I")
    private int[] field1639;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field1640;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field1641;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field1642;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field1693;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[I")
    private int[] field1694;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[Ljb;")
    private Pix8[] field1285;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[[B")
    private byte[][] field1394;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[[B")
    private byte[][] field1402;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[[[B")
    private byte[][][] field1292;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[[[I")
    private int[][][] field1286;

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1653 = Integer.parseInt(this.getParameter("nodeid"));
        field1654 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method542(field1615);
        } else {
            method475(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1655 = false;
        } else {
            field1655 = true;
        }
        this.method2(true, 765, 503);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != 9) {
            this.field1591 = this.field1553.method227();
        }
        if (!this.field1657 && !this.field1476 && !this.field1241) {
            ++field1661;
            if (!this.field1284) {
                this.method508((byte) 122);
            } else {
                this.method467(this.field1477);
            }
            this.method504(false);
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method425(byte arg0) {
        if (arg0 != 1) {
            field1667 = 98;
        }
        if (this.field1516 == 0) {
            int var2 = super.field27;
            if (this.field1415 == 1 && super.field28 >= 516 && super.field29 >= 160 && super.field28 <= 765 && super.field29 <= 205) {
                var2 = 0;
            }
            if (this.field1367) {
                if (var2 != 1) {
                    int var3 = super.field21;
                    int var4 = super.field22;
                    if (this.field1451 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1451 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1451 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1452 - 10 || var3 > this.field1454 + this.field1452 + 10 || var4 < this.field1453 - 10 || var4 > this.field1455 + this.field1453 + 10) {
                        this.field1367 = false;
                        if (this.field1451 == 1) {
                            this.field1319 = true;
                        }
                        if (this.field1451 == 2) {
                            this.field1470 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1452;
                    int var6 = this.field1453;
                    int var7 = this.field1454;
                    int var8 = super.field28;
                    int var9 = super.field29;
                    if (this.field1451 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1451 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1451 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1392; ++var11) {
                        int var12 = (this.field1392 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method545(var10, 725);
                    }
                    this.field1367 = false;
                    if (this.field1451 == 1) {
                        this.field1319 = true;
                    }
                    if (this.field1451 == 2) {
                        this.field1470 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1392 > 0) {
                    int var13 = this.field1260[this.field1392 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1258[this.field1392 - 1];
                        int var15 = this.field1259[this.field1392 - 1];
                        Component var16 = Component.field67[var15];
                        if (var16.field94 || var16.field97) {
                            this.field1268 = false;
                            this.field1399 = 0;
                            this.field1514 = var15;
                            this.field1515 = var14;
                            this.field1516 = 2;
                            this.field1517 = super.field28;
                            this.field1518 = super.field29;
                            if (Component.field67[var15].field73 == this.field1620) {
                                this.field1516 = 1;
                            }
                            if (Component.field67[var15].field73 == this.field1674) {
                                this.field1516 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1283 == 1 || this.method437(this.field1392 - 1, -40)) && this.field1392 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1392 > 0) {
                    this.method545(this.field1392 - 1, 725);
                }
                if (var2 != 2 || this.field1392 <= 0) {
                    return;
                }
                this.method500(this.field1320);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;II)V")
    public final void method426(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (arg3 != 0) {
            this.field1271.method217(121);
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1380 + this.field1351 & 2047;
            int var7 = Model.field599[var6];
            int var8 = Model.field600[var6];
            int var9 = var7 * 256 / (this.field1496 + 256);
            int var10 = var8 * 256 / (this.field1496 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1682.method190(15, var13, 20, 256, 15, var15 + 94 + 4 - 10, (byte) 8, 20, 83 - var16 - 20);
        } else {
            this.method552(arg0, arg1, 139, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method427(int arg0) {
        this.method474(-411);
        if (this.field1239 == 1) {
            this.field1288[this.field1238 / 100].method185(this.field1237 - 8 - 4, this.field1634, this.field1236 - 8 - 4);
        }
        if (this.field1239 == 2) {
            this.field1288[this.field1238 / 100 + 4].method185(this.field1237 - 8 - 4, this.field1634, this.field1236 - 8 - 4);
            ++field1344;
            if (field1344 > 57) {
                field1344 = 0;
                this.field1271.method216(-34003, 85);
            }
        }
        if (this.field1345 != -1) {
            this.method476(this.field1245, this.field1345, (byte) -103);
            this.method448(6, 0, 0, Component.field67[this.field1345], 0);
        }
        if (this.field1620 != -1) {
            this.method476(this.field1245, this.field1620, (byte) -103);
            this.method448(6, 0, 0, Component.field67[this.field1620], 0);
        }
        this.method435((byte) -128);
        if (this.field1390 != arg0) {
            this.field1271.method217(186);
        }
        if (!this.field1367) {
            this.method465((byte) 6);
            this.method463(521);
        } else if (this.field1451 == 0) {
            this.method526(393);
        }
        if (this.field1533 == 1) {
            this.field1604[1].method185(296, this.field1634, 472);
        }
        if (this.field1419 != 0) {
            int var2 = this.field1419 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1677.method204((byte) -104, 16776960, "System update in: " + var3 + ":0" + var4, 4, 329);
            } else {
                this.field1677.method204((byte) -104, 16776960, "System update in: " + var3 + ":" + var4, 4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)V")
    public final void method428(int arg0, byte arg1, String arg2, String arg3) {
        if (arg0 == 0 && this.field1386 != -1) {
            this.field1244 = arg2;
            super.field27 = 0;
        }
        if (this.field1674 == -1) {
            this.field1470 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1423[var5] = this.field1423[var5 - 1];
            this.field1424[var5] = this.field1424[var5 - 1];
            this.field1425[var5] = this.field1425[var5 - 1];
        }
        if (arg1 != -115) {
            this.field1591 = this.field1553.method227();
        }
        this.field1423[0] = arg0;
        this.field1424[0] = arg3;
        this.field1425[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method429(int arg0) {
        this.field1590 += arg0;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)Z")
    public final boolean method430(byte arg0, Component arg1) {
        if (arg0 != -16) {
            this.field1567 = null;
        }
        int var3 = arg1.field76;
        if (this.field1526 == 2) {
            if (var3 == 201) {
                this.field1470 = true;
                this.field1401 = false;
                this.field1643 = true;
                this.field1428 = "";
                this.field1301 = 1;
                this.field1523 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1470 = true;
                this.field1401 = false;
                this.field1643 = true;
                this.field1428 = "";
                this.field1301 = 2;
                this.field1523 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1594 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1470 = true;
                this.field1401 = false;
                this.field1643 = true;
                this.field1428 = "";
                this.field1301 = 4;
                this.field1523 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1470 = true;
                this.field1401 = false;
                this.field1643 = true;
                this.field1428 = "";
                this.field1301 = 5;
                this.field1523 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1270[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1127 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1127) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1128[var6].field1134 && IdkType.field1128[var6].field1129 == var4 + (this.field1600 ? 0 : 7)) {
                            this.field1270[var4] = var6;
                            this.field1233 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1359[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1494[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1494[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1359[var7] = var9;
                this.field1233 = true;
            }
            if (var3 == 324 && !this.field1600) {
                this.field1600 = true;
                this.method481(this.field1304);
            }
            if (var3 == 325 && this.field1600) {
                this.field1600 = false;
                this.method481(this.field1304);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1408 = !this.field1408;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method439(3);
                    if (this.field1360.length() > 0) {
                        this.field1271.method216(-34003, 94);
                        this.field1271.method223(JString.method298(this.field1360), true);
                        this.field1271.method217(var3 - 601);
                        this.field1271.method217(this.field1408 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1271.method216(-34003, 27);
                this.field1271.method217(this.field1600 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1271.method217(this.field1270[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1271.method217(this.field1359[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method431(int arg0) {
        for (int var2 = -1; var2 < this.field1647; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1645;
            } else {
                var6 = this.field1648[var2];
            }
            PlayerEntity var7 = this.field1646[var6];
            if (var7 != null && var7.field409 > 0) {
                --var7.field409;
                if (var7.field409 == 0) {
                    var7.field408 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1430; ++var3) {
            int var4 = this.field1431[var3];
            NpcEntity var5 = this.field1429[var4];
            if (var5 != null && var5.field409 > 0) {
                --var5.field409;
                if (var5.field409 == 0) {
                    var5.field408 = null;
                }
            }
        }
        if (arg0 != 0) {
            this.field1271.method217(252);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1479.method198(arg0, this.field1634, arg1);
        this.field1480.method198(arg0 + arg4 - 16, this.field1634, arg1);
        Pix2D.method156(this.field1421, 210, arg0 + 16, arg4 - 32, arg1, 16);
        int var7 = (arg4 - 32) * arg4 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg2 / (arg3 - arg4);
        Pix2D.method156(this.field1621, 210, arg0 + 16 + var8, var7, arg1, 16);
        Pix2D.method161(arg0 + 16 + var8, arg1, this.field1506, var7, 0);
        Pix2D.method161(arg0 + 16 + var8, arg1 + 1, this.field1506, var7, 0);
        Pix2D.method159(16, arg1, this.field1506, true, arg0 + 16 + var8);
        Pix2D.method159(16, arg1, this.field1506, true, arg0 + 17 + var8);
        Pix2D.method161(arg0 + 16 + var8, arg1 + 15, this.field1265, var7, 0);
        Pix2D.method161(arg0 + 17 + var8, arg1 + 14, this.field1265, var7 - 1, 0);
        Pix2D.method159(16, arg1, this.field1265, true, arg0 + 15 + var8 + var7);
        Pix2D.method159(15, arg1 + 1, this.field1265, true, arg0 + 14 + var8 + var7);
        if (arg5 != 3) {
            this.field1567 = null;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method433(byte arg0) {
        try {
            if (this.field1520 != null) {
                this.field1520.method38();
            }
        } catch (Exception var3) {
        }
        this.field1520 = null;
        this.field1284 = false;
        this.field1435 = 0;
        this.field1492 = "";
        this.field1493 = "";
        this.method487(this.field1463);
        this.field1613.method50(true);
        if (arg0 != 25) {
            this.field1591 = -1;
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1443[var2].method355(3);
        }
        System.gc();
        this.method429(0);
        this.field1384 = -1;
        this.field1611 = -1;
        this.field1363 = 0;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    private final void method434(int arg0) {
        if (arg0 <= 0) {
            this.field1383 = -451;
        }
        if (this.field1303 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1537.method246(); var2 != null; var2 = (LocSpawned) this.field1537.method248(false)) {
                if (var2.field739 > 0) {
                    --var2.field739;
                }
                if (var2.field739 == 0) {
                    if (var2.field732 < 0 || World.method30(var2.field732, var2.field734, 677)) {
                        this.method484(var2.field733, 0, var2.field734, var2.field728, var2.field732, var2.field730, var2.field729, var2.field731);
                        var2.method106();
                    }
                } else {
                    if (var2.field738 > 0) {
                        --var2.field738;
                    }
                    if (var2.field738 == 0 && var2.field730 >= 1 && var2.field731 >= 1 && var2.field730 <= 102 && var2.field731 <= 102 && (var2.field735 < 0 || World.method30(var2.field735, var2.field737, 677))) {
                        this.method484(var2.field736, 0, var2.field737, var2.field728, var2.field735, var2.field730, var2.field729, var2.field731);
                        var2.field738 = -1;
                        if (var2.field735 == var2.field732 && var2.field732 == -1) {
                            var2.method106();
                        } else if (var2.field735 == var2.field732 && var2.field736 == var2.field733 && var2.field737 == var2.field734) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method435(byte arg0) {
        if (arg0 != -128) {
            this.field1668 = this.field1348.method293();
        }
        this.field1666 = 0;
        int var2 = (field1468.field396 >> 7) + this.field1605;
        int var3 = (field1468.field397 >> 7) + this.field1606;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1666 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1666 = 1;
        }
        if (this.field1666 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1666 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method436(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field1693[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field1693[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field1694[var15] = (this.field1693[var15 - 1] + this.field1693[var15 + 1] + this.field1693[var15 - 128] + this.field1693[var15 + 128]) / 4;
            }
        }
        this.field1311 += 128;
        int var6 = 27 / arg0;
        if (this.field1311 > this.field1554.length) {
            this.field1311 -= this.field1554.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method520(this.field1285[var7], 34809);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field1694[var12 + 128] - this.field1554[this.field1311 + var12 & this.field1554.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field1693[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field1439[var9] = this.field1439[var9 + 1];
        }
        this.field1439[var2 - 1] = (int) (Math.sin((double) field1661 / 14.0D) * 16.0D + Math.sin((double) field1661 / 15.0D) * 14.0D + Math.sin((double) field1661 / 16.0D) * 12.0D);
        if (this.field1680 > 0) {
            this.field1680 -= 4;
        }
        if (this.field1681 > 0) {
            this.field1681 -= 4;
        }
        if (this.field1680 == 0 && this.field1681 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field1680 = 1024;
            }
            if (var10 == 1) {
                this.field1681 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Z")
    public final boolean method437(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1260[arg0];
            if (arg1 >= 0) {
                this.field1663 = this.field1348.method293();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method438(byte arg0) {
        int var2 = 5;
        this.field1472[8] = 0;
        if (arg0 != -48) {
            this.field1591 = this.field1553.method227();
        }
        int var3 = 0;
        while (this.field1472[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(false, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method488("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 289);
                Packet var6 = new Packet(new byte[40], 15787);
                var5.readFully(var6.field709, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1472[var7] = var6.method232();
                }
                int var8 = var6.method232();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1472[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1472[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1472[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1472[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1472[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1472[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(false, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method13(false, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field1343 = !this.field1343;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field1567 = null;
        }
        this.field1271.method216(-34003, 93);
        if (this.field1310 != -1) {
            this.field1310 = -1;
            this.field1319 = true;
            this.field1356 = false;
            this.field1575 = true;
        }
        if (this.field1674 != -1) {
            this.field1674 = -1;
            this.field1470 = true;
            this.field1356 = false;
        }
        this.field1620 = -1;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public void method440(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1366);
        if (this.field1235 != null) {
            System.out.println("Od-cycle:" + this.field1235.field845);
        }
        System.out.println("loop-cycle:" + field1661);
        System.out.println("draw-cycle:" + field1596);
        System.out.println("ptype:" + this.field1591);
        System.out.println("psize:" + this.field1590);
        if (this.field1520 != null) {
            this.field1520.method43((byte) -11);
        }
        super.field10 = true;
        if (arg0 != -11) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1599 = !this.field1599;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;III)V")
    public final void method441(int arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg3.field74 == 0 && arg3.field89 != null && !arg3.field88) {
            if (arg2 >= arg0 && arg5 >= arg4 && arg2 <= arg3.field77 + arg0 && arg5 <= arg3.field78 + arg4) {
                int var8 = arg3.field89.length;
                if (arg6 > 0) {
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg3.field90[var9] + arg0;
                        int var11 = arg3.field91[var9] + arg4 - arg1;
                        Component var12 = Component.field67[arg3.field89[var9]];
                        int var13 = var12.field80 + var10;
                        int var14 = var12.field81 + var11;
                        if ((var12.field85 >= 0 || var12.field112 != 0) && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                            if (var12.field85 >= 0) {
                                this.field1246 = var12.field85;
                            } else {
                                this.field1246 = var12.field72;
                            }
                        }
                        if (var12.field74 == 0) {
                            this.method441(var13, var12.field87, arg2, var12, var14, arg5, 792);
                            if (var12.field86 > var12.field78) {
                                this.method492(var14, arg2, var12, var12.field77 + var13, true, var12.field78, this.field1251, arg5, var12.field86);
                            }
                        } else {
                            if (var12.field75 == 1 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                boolean var15 = false;
                                if (var12.field76 != 0) {
                                    var15 = this.method518(var12, true);
                                }
                                if (!var15) {
                                    this.field1318[this.field1392] = var12.field128;
                                    this.field1260[this.field1392] = 231;
                                    this.field1259[this.field1392] = var12.field72;
                                    ++this.field1392;
                                }
                            }
                            if (var12.field75 == 2 && this.field1415 == 0 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                String var16 = var12.field125;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field1318[this.field1392] = var16 + " @gre@" + var12.field126;
                                this.field1260[this.field1392] = 274;
                                this.field1259[this.field1392] = var12.field72;
                                ++this.field1392;
                            }
                            if (var12.field75 == 3 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1318[this.field1392] = "Close";
                                this.field1260[this.field1392] = 737;
                                this.field1259[this.field1392] = var12.field72;
                                ++this.field1392;
                            }
                            if (var12.field75 == 4 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1318[this.field1392] = var12.field128;
                                this.field1260[this.field1392] = 435;
                                this.field1259[this.field1392] = var12.field72;
                                ++this.field1392;
                            }
                            if (var12.field75 == 5 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1318[this.field1392] = var12.field128;
                                this.field1260[this.field1392] = 225;
                                this.field1259[this.field1392] = var12.field72;
                                ++this.field1392;
                            }
                            if (var12.field75 == 6 && !this.field1356 && arg2 >= var13 && arg5 >= var14 && arg2 < var12.field77 + var13 && arg5 < var12.field78 + var14) {
                                this.field1318[this.field1392] = var12.field128;
                                this.field1260[this.field1392] = 997;
                                this.field1259[this.field1392] = var12.field72;
                                ++this.field1392;
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
                                        if (arg2 >= var20 && arg5 >= var21 && arg2 < var20 + 32 && arg5 < var21 + 32) {
                                            this.field1403 = var17;
                                            this.field1404 = var12.field72;
                                            if (var12.field68[var17] > 0) {
                                                ObjType var22 = ObjType.method344(var12.field68[var17] - 1);
                                                if (this.field1373 == 1 && var12.field95) {
                                                    if (this.field1375 != var12.field72 || this.field1374 != var17) {
                                                        this.field1318[this.field1392] = "Use " + this.field1377 + " with @lre@" + var22.field1052;
                                                        this.field1260[this.field1392] = 398;
                                                        this.field1261[this.field1392] = var22.field1050;
                                                        this.field1258[this.field1392] = var17;
                                                        this.field1259[this.field1392] = var12.field72;
                                                        ++this.field1392;
                                                    }
                                                } else if (this.field1415 == 1 && var12.field95) {
                                                    if ((this.field1417 & 16) == 16) {
                                                        this.field1318[this.field1392] = this.field1418 + " @lre@" + var22.field1052;
                                                        this.field1260[this.field1392] = 563;
                                                        this.field1261[this.field1392] = var22.field1050;
                                                        this.field1258[this.field1392] = var17;
                                                        this.field1259[this.field1392] = var12.field72;
                                                        ++this.field1392;
                                                    }
                                                } else {
                                                    if (var12.field95) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1067 != null && var22.field1067[var23] != null) {
                                                                this.field1318[this.field1392] = var22.field1067[var23] + " @lre@" + var22.field1052;
                                                                if (var23 == 3) {
                                                                    this.field1260[this.field1392] = 681;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field1260[this.field1392] = 100;
                                                                }
                                                                this.field1261[this.field1392] = var22.field1050;
                                                                this.field1258[this.field1392] = var17;
                                                                this.field1259[this.field1392] = var12.field72;
                                                                ++this.field1392;
                                                            } else if (var23 == 4) {
                                                                this.field1318[this.field1392] = "Drop @lre@" + var22.field1052;
                                                                this.field1260[this.field1392] = 100;
                                                                this.field1261[this.field1392] = var22.field1050;
                                                                this.field1258[this.field1392] = var17;
                                                                this.field1259[this.field1392] = var12.field72;
                                                                ++this.field1392;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field96) {
                                                        this.field1318[this.field1392] = "Use @lre@" + var22.field1052;
                                                        this.field1260[this.field1392] = 102;
                                                        this.field1261[this.field1392] = var22.field1050;
                                                        this.field1258[this.field1392] = var17;
                                                        this.field1259[this.field1392] = var12.field72;
                                                        ++this.field1392;
                                                    }
                                                    if (var12.field95 && var22.field1067 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1067[var24] != null) {
                                                                this.field1318[this.field1392] = var22.field1067[var24] + " @lre@" + var22.field1052;
                                                                if (var24 == 0) {
                                                                    this.field1260[this.field1392] = 694;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field1260[this.field1392] = 962;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field1260[this.field1392] = 795;
                                                                }
                                                                this.field1261[this.field1392] = var22.field1050;
                                                                this.field1258[this.field1392] = var17;
                                                                this.field1259[this.field1392] = var12.field72;
                                                                ++this.field1392;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field103 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field103[var25] != null) {
                                                                this.field1318[this.field1392] = var12.field103[var25] + " @lre@" + var22.field1052;
                                                                if (var25 == 0) {
                                                                    this.field1260[this.field1392] = 582;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field1260[this.field1392] = 113;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field1260[this.field1392] = 555;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field1260[this.field1392] = 331;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field1260[this.field1392] = 354;
                                                                }
                                                                this.field1261[this.field1392] = var22.field1050;
                                                                this.field1258[this.field1392] = var17;
                                                                this.field1259[this.field1392] = var12.field72;
                                                                ++this.field1392;
                                                            }
                                                        }
                                                    }
                                                    this.field1318[this.field1392] = "Examine @lre@" + var22.field1052;
                                                    this.field1260[this.field1392] = 1328;
                                                    this.field1261[this.field1392] = var22.field1050;
                                                    this.field1258[this.field1392] = var17;
                                                    this.field1259[this.field1392] = var12.field72;
                                                    ++this.field1392;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Z")
    public final boolean method442(boolean arg0) {
        this.field1284 &= arg0;
        if (this.field1520 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1520.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1591 == -1) {
                    this.field1520.method41(this.field1553.field709, 0, 1);
                    this.field1591 = this.field1553.field709[0] & 255;
                    if (this.field1348 != null) {
                        this.field1591 = this.field1591 - this.field1348.method293() & 255;
                    }
                    this.field1590 = Protocol.field1093[this.field1591];
                    --var2;
                }
                if (this.field1590 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1520.method41(this.field1553.field709, 0, 1);
                    this.field1590 = this.field1553.field709[0] & 255;
                    --var2;
                }
                if (this.field1590 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1520.method41(this.field1553.field709, 0, 2);
                    this.field1553.field710 = 0;
                    this.field1590 = this.field1553.method229();
                    var2 -= 2;
                }
                if (var2 < this.field1590) {
                    return false;
                }
                this.field1553.field710 = 0;
                this.field1520.method41(this.field1553.field709, 0, this.field1590);
                this.field1592 = 0;
                this.field1490 = this.field1489;
                this.field1489 = this.field1488;
                this.field1488 = this.field1591;
                if (this.field1591 == 55) {
                    int var3 = this.field1553.method229();
                    int var4 = this.field1553.method229();
                    if (this.field1674 != -1) {
                        this.field1674 = -1;
                        this.field1470 = true;
                    }
                    if (this.field1401) {
                        this.field1401 = false;
                        this.field1470 = true;
                    }
                    this.field1620 = var3;
                    this.field1310 = var4;
                    this.field1319 = true;
                    this.field1575 = true;
                    this.field1356 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 13) {
                    this.field1264 = this.field1553.method227();
                    this.field1316 = this.field1553.method227();
                    this.field1589 = this.field1553.method227();
                    this.field1483 = true;
                    this.field1470 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 195) {
                    if (this.field1448 == 12) {
                        this.field1319 = true;
                    }
                    this.field1357 = this.field1553.method227();
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 46) {
                    if (this.field1448 == 12) {
                        this.field1319 = true;
                    }
                    this.field1626 = this.field1553.method230();
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 59) {
                    int var5 = this.field1553.method229();
                    String var6 = this.field1553.method234();
                    Component.field67[var5].field108 = var6;
                    if (this.field1481[this.field1448] == Component.field67[var5].field73) {
                        this.field1319 = true;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 120) {
                    this.field1536 = this.field1553.method229();
                    this.field1510 = this.field1553.method227();
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 79) {
                    int var7 = this.field1553.method229();
                    int var8 = this.field1553.method230();
                    int var9 = this.field1553.method230();
                    Component var10 = Component.field67[var7];
                    var10.field80 = var8;
                    var10.field81 = var9;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 252) {
                    int var11 = this.field1553.method229();
                    this.method515(var11, -44196);
                    if (this.field1674 != -1) {
                        this.field1674 = -1;
                        this.field1470 = true;
                    }
                    if (this.field1401) {
                        this.field1401 = false;
                        this.field1470 = true;
                    }
                    this.field1310 = var11;
                    this.field1319 = true;
                    this.field1575 = true;
                    this.field1620 = -1;
                    this.field1356 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 115) {
                    this.field1426 = this.field1553.method227();
                    if (this.field1426 == 1) {
                        this.field1322 = this.field1553.method229();
                    }
                    if (this.field1426 >= 2 && this.field1426 <= 6) {
                        if (this.field1426 == 2) {
                            this.field1672 = 64;
                            this.field1673 = 64;
                        }
                        if (this.field1426 == 3) {
                            this.field1672 = 0;
                            this.field1673 = 64;
                        }
                        if (this.field1426 == 4) {
                            this.field1672 = 128;
                            this.field1673 = 64;
                        }
                        if (this.field1426 == 5) {
                            this.field1672 = 64;
                            this.field1673 = 0;
                        }
                        if (this.field1426 == 6) {
                            this.field1672 = 64;
                            this.field1673 = 128;
                        }
                        this.field1426 = 2;
                        this.field1669 = this.field1553.method229();
                        this.field1670 = this.field1553.method229();
                        this.field1671 = this.field1553.method227();
                    }
                    if (this.field1426 == 10) {
                        this.field1330 = this.field1553.method229();
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 211) {
                    int var12 = this.field1553.method229();
                    int var13 = this.field1553.method230();
                    Component var14 = Component.field67[var12];
                    var14.field120 = var13;
                    if (var13 == -1) {
                        var14.field70 = 0;
                        var14.field71 = 0;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 136) {
                    this.field1269 = this.field1553.method227();
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 91 || this.field1591 == 117 || this.field1591 == 83 || this.field1591 == 176 || this.field1591 == 233 || this.field1591 == 87 || this.field1591 == 71 || this.field1591 == 60 || this.field1591 == 106 || this.field1591 == 194 || this.field1591 == 90) {
                    this.method478(this.field1553, -6563, this.field1591);
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 28) {
                    int var15 = this.field1553.method229();
                    Component var16 = Component.field67[var15];
                    for (int var17 = 0; var17 < var16.field68.length; ++var17) {
                        var16.field68[var17] = -1;
                        var16.field68[var17] = 0;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 144) {
                    this.field1458 = this.field1553.method227();
                    this.field1459 = this.field1553.method227();
                    for (int var18 = this.field1458; var18 < this.field1458 + 8; ++var18) {
                        for (int var19 = this.field1459; var19 < this.field1459 + 8; ++var19) {
                            if (this.field1567[this.field1576][var18][var19] != null) {
                                this.field1567[this.field1576][var18][var19] = null;
                                this.method503(var18, var19);
                            }
                        }
                    }
                    for (LocSpawned var20 = (LocSpawned) this.field1537.method246(); var20 != null; var20 = (LocSpawned) this.field1537.method248(false)) {
                        if (var20.field730 >= this.field1458 && var20.field730 < this.field1458 + 8 && var20.field731 >= this.field1459 && var20.field731 < this.field1459 + 8 && this.field1576 == var20.field728) {
                            var20.field739 = 0;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 154) {
                    this.field1319 = true;
                    int var21 = this.field1553.method227();
                    int var22 = this.field1553.method232();
                    int var23 = this.field1553.method227();
                    this.field1272[var21] = var22;
                    this.field1456[var21] = var23;
                    this.field1511[var21] = 1;
                    for (int var24 = 0; var24 < 98; ++var24) {
                        if (var22 >= field1405[var24]) {
                            this.field1511[var21] = var24 + 2;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 181) {
                    this.field1254 = this.field1553.method227();
                    if (this.field1448 == this.field1254) {
                        if (this.field1254 == 3) {
                            this.field1448 = 1;
                        } else {
                            this.field1448 = 3;
                        }
                        this.field1319 = true;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 73) {
                    this.field1250 = true;
                    this.field1539 = this.field1553.method227();
                    this.field1540 = this.field1553.method227();
                    this.field1541 = this.field1553.method229();
                    this.field1542 = this.field1553.method227();
                    this.field1543 = this.field1553.method227();
                    if (this.field1543 >= 100) {
                        this.field1296 = this.field1539 * 128 + 64;
                        this.field1298 = this.field1540 * 128 + 64;
                        this.field1297 = this.method462(false, this.field1298, this.field1296, this.field1576) - this.field1541;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 188) {
                    this.method468(this.field1590, (byte) 7, this.field1553);
                    this.field1696 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 244) {
                    int var25 = this.field1553.method229();
                    int var26 = this.field1553.method229();
                    Component.field67[var25].field116 = 2;
                    Component.field67[var25].field117 = var26;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 121) {
                    this.method433((byte) 25);
                    this.field1591 = -1;
                    return false;
                }
                if (this.field1591 == 119) {
                    int var27 = this.field1553.method229();
                    this.method515(var27, -44196);
                    if (this.field1310 != -1) {
                        this.field1310 = -1;
                        this.field1319 = true;
                        this.field1575 = true;
                    }
                    if (this.field1674 != -1) {
                        this.field1674 = -1;
                        this.field1470 = true;
                    }
                    if (this.field1401) {
                        this.field1401 = false;
                        this.field1470 = true;
                    }
                    this.field1620 = var27;
                    this.field1356 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 168) {
                    long var28 = this.field1553.method233(true);
                    int var30 = this.field1553.method227();
                    String var31 = JString.method302(JString.method299(var28, true), true);
                    for (int var32 = 0; var32 < this.field1525; ++var32) {
                        if (this.field1400[var32] == var28) {
                            if (this.field1315[var32] != var30) {
                                this.field1315[var32] = var30;
                                this.field1319 = true;
                                if (var30 > 0) {
                                    this.method428(5, (byte) -115, var31 + " has logged in.", "");
                                }
                                if (var30 == 0) {
                                    this.method428(5, (byte) -115, var31 + " has logged out.", "");
                                }
                            }
                            var31 = null;
                            break;
                        }
                    }
                    if (var31 != null && this.field1525 < 200) {
                        this.field1400[this.field1525] = var28;
                        this.field1465[this.field1525] = var31;
                        this.field1315[this.field1525] = var30;
                        ++this.field1525;
                        this.field1319 = true;
                    }
                    boolean var33 = false;
                    while (!var33) {
                        var33 = true;
                        for (int var34 = 0; var34 < this.field1525 - 1; ++var34) {
                            if (this.field1315[var34] != field1653 && this.field1315[var34 + 1] == field1653 || this.field1315[var34] == 0 && this.field1315[var34 + 1] != 0) {
                                int var35 = this.field1315[var34];
                                this.field1315[var34] = this.field1315[var34 + 1];
                                this.field1315[var34 + 1] = var35;
                                String var36 = this.field1465[var34];
                                this.field1465[var34] = this.field1465[var34 + 1];
                                this.field1465[var34 + 1] = var36;
                                long var37 = this.field1400[var34];
                                this.field1400[var34] = this.field1400[var34 + 1];
                                this.field1400[var34 + 1] = var37;
                                this.field1319 = true;
                                var33 = false;
                            }
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 164) {
                    this.field1332 = 0;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 243) {
                    long var39 = this.field1553.method233(true);
                    int var41 = this.field1553.method232();
                    int var42 = this.field1553.method227();
                    boolean var43 = false;
                    for (int var44 = 0; var44 < 100; ++var44) {
                        if (this.field1437[var44] == var41) {
                            var43 = true;
                            break;
                        }
                    }
                    if (var42 <= 1) {
                        for (int var45 = 0; var45 < this.field1378; ++var45) {
                            if (this.field1675[var45] == var39) {
                                var43 = true;
                                break;
                            }
                        }
                    }
                    if (!var43 && this.field1666 == 0) {
                        try {
                            this.field1437[this.field1349] = var41;
                            this.field1349 = (this.field1349 + 1) % 100;
                            String var46 = WordPack.method304((byte) -94, this.field1553, this.field1590 - 13);
                            String var47 = WordFilter.method397(var46, this.field1663);
                            if (var42 != 2 && var42 != 3) {
                                if (var42 == 1) {
                                    this.method428(7, (byte) -115, var47, "@cr1@" + JString.method302(JString.method299(var39, true), true));
                                } else {
                                    this.method428(3, (byte) -115, var47, JString.method302(JString.method299(var39, true), true));
                                }
                            } else {
                                this.method428(7, (byte) -115, var47, "@cr2@" + JString.method302(JString.method299(var39, true), true));
                            }
                        } catch (Exception var164) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 208) {
                    int var49 = this.field1553.method227();
                    int var50 = this.field1553.method227();
                    int var51 = this.field1553.method227();
                    int var52 = this.field1553.method227();
                    this.field1630[var49] = true;
                    this.field1397[var49] = var50;
                    this.field1627[var49] = var51;
                    this.field1364[var49] = var52;
                    this.field1422[var49] = 0;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 107) {
                    this.field1319 = true;
                    int var53 = this.field1553.method229();
                    Component var54 = Component.field67[var53];
                    int var55 = this.field1553.method229();
                    for (int var56 = 0; var56 < var55; ++var56) {
                        var54.field68[var56] = this.field1553.method229();
                        int var57 = this.field1553.method227();
                        if (var57 == 255) {
                            var57 = this.field1553.method232();
                        }
                        var54.field69[var56] = var57;
                    }
                    for (int var58 = var55; var58 < var54.field68.length; ++var58) {
                        var54.field68[var58] = 0;
                        var54.field69[var58] = 0;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 12) {
                    int var59 = this.field1553.method230();
                    this.field1386 = var59;
                    this.field1470 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 219) {
                    int var60 = this.field1553.method229();
                    int var61 = this.field1553.method229();
                    if (this.field1262 == var60 && this.field1263 == var61 && this.field1303 == 2) {
                        this.field1591 = -1;
                        return true;
                    }
                    this.field1262 = var60;
                    this.field1263 = var61;
                    this.field1605 = (this.field1262 - 6) * 8;
                    this.field1606 = (this.field1263 - 6) * 8;
                    this.field1327 = false;
                    if ((this.field1262 / 8 == 48 || this.field1262 / 8 == 49) && this.field1263 / 8 == 48) {
                        this.field1327 = true;
                    }
                    if (this.field1262 / 8 == 48 && this.field1263 / 8 == 148) {
                        this.field1327 = true;
                    }
                    this.field1303 = 1;
                    this.field1491 = System.currentTimeMillis();
                    this.field1618.method256((byte) 5);
                    this.field1677.method200(257, "Loading - please wait.", -31546, 0, 151);
                    this.field1677.method200(256, "Loading - please wait.", -31546, 16777215, 150);
                    this.field1618.method257(-781, 4, 4, super.field13);
                    int var62 = 0;
                    for (int var63 = (this.field1262 - 6) / 8; var63 <= (this.field1262 + 6) / 8; ++var63) {
                        for (int var64 = (this.field1263 - 6) / 8; var64 <= (this.field1263 + 6) / 8; ++var64) {
                            ++var62;
                        }
                    }
                    this.field1402 = new byte[var62][];
                    this.field1394 = new byte[var62][];
                    this.field1460 = new int[var62];
                    this.field1461 = new int[var62];
                    this.field1462 = new int[var62];
                    int var65 = 0;
                    for (int var66 = (this.field1262 - 6) / 8; var66 <= (this.field1262 + 6) / 8; ++var66) {
                        for (int var67 = (this.field1263 - 6) / 8; var67 <= (this.field1263 + 6) / 8; ++var67) {
                            this.field1460[var65] = (var66 << 8) + var67;
                            if (this.field1327 && (var67 == 49 || var67 == 149 || var67 == 147 || var66 == 50 || var66 == 49 && var67 == 47)) {
                                this.field1461[var65] = -1;
                                this.field1462[var65] = -1;
                                ++var65;
                            } else {
                                int var68 = this.field1461[var65] = this.field1235.method272(var67, -942, var66, 0);
                                if (var68 != -1) {
                                    this.field1235.method277(3, var68);
                                }
                                int var69 = this.field1462[var65] = this.field1235.method272(var67, -942, var66, 1);
                                if (var69 != -1) {
                                    this.field1235.method277(3, var69);
                                }
                                ++var65;
                            }
                        }
                    }
                    int var70 = this.field1605 - this.field1607;
                    int var71 = this.field1606 - this.field1608;
                    this.field1607 = this.field1605;
                    this.field1608 = this.field1606;
                    for (int var72 = 0; var72 < 16384; ++var72) {
                        NpcEntity var73 = this.field1429[var72];
                        if (var73 != null) {
                            for (int var74 = 0; var74 < 10; ++var74) {
                                var73.field446[var74] -= var70;
                                var73.field447[var74] -= var71;
                            }
                            var73.field396 -= var70 * 128;
                            var73.field397 -= var71 * 128;
                        }
                    }
                    for (int var75 = 0; var75 < this.field1644; ++var75) {
                        PlayerEntity var76 = this.field1646[var75];
                        if (var76 != null) {
                            for (int var77 = 0; var77 < 10; ++var77) {
                                var76.field446[var77] -= var70;
                                var76.field447[var77] -= var71;
                            }
                            var76.field396 -= var70 * 128;
                            var76.field397 -= var71 * 128;
                        }
                    }
                    this.field1696 = true;
                    byte var78 = 0;
                    byte var79 = 104;
                    byte var80 = 1;
                    if (var70 < 0) {
                        var78 = 103;
                        var79 = -1;
                        var80 = -1;
                    }
                    byte var81 = 0;
                    byte var82 = 104;
                    byte var83 = 1;
                    if (var71 < 0) {
                        var81 = 103;
                        var82 = -1;
                        var83 = -1;
                    }
                    for (int var84 = var78; var79 != var84; var84 += var80) {
                        for (int var85 = var81; var82 != var85; var85 += var83) {
                            int var86 = var70 + var84;
                            int var87 = var71 + var85;
                            for (int var88 = 0; var88 < 4; ++var88) {
                                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                                    this.field1567[var88][var84][var85] = this.field1567[var88][var86][var87];
                                } else {
                                    this.field1567[var88][var84][var85] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var89 = (LocSpawned) this.field1537.method246(); var89 != null; var89 = (LocSpawned) this.field1537.method248(false)) {
                        var89.field730 -= var70;
                        var89.field731 -= var71;
                        if (var89.field730 < 0 || var89.field731 < 0 || var89.field730 >= 104 || var89.field731 >= 104) {
                            var89.method106();
                        }
                    }
                    if (this.field1332 != 0) {
                        this.field1332 -= var70;
                        this.field1333 -= var71;
                    }
                    this.field1250 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 63) {
                    int var90 = this.field1553.method229();
                    int var91 = this.field1553.method227();
                    if (var90 == 65535) {
                        var90 = -1;
                    }
                    this.field1481[var91] = var90;
                    this.field1319 = true;
                    this.field1575 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 184) {
                    int var92 = this.field1553.method229();
                    int var93 = this.field1553.method229();
                    Component var94 = Component.field67[var92];
                    if (var94 != null && var94.field74 == 0) {
                        if (var93 < 0) {
                            var93 = 0;
                        }
                        if (var93 > var94.field86 - var94.field78) {
                            var93 = var94.field86 - var94.field78;
                        }
                        var94.field87 = var93;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 204) {
                    this.field1419 = this.field1553.method229() * 30;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 253) {
                    this.field1652 = this.field1553.method232();
                    this.field1368 = this.field1553.method229();
                    this.field1290 = this.field1553.method227();
                    this.field1444 = this.field1553.method229();
                    this.field1338 = this.field1553.method227();
                    if (this.field1652 != 0 && this.field1620 == -1) {
                        signlink.dnslookup(JString.method301(this.field1652, (byte) 1));
                        this.method439(3);
                        short var95 = 650;
                        if (this.field1290 != 201 || this.field1338 == 1) {
                            var95 = 655;
                        }
                        this.field1360 = "";
                        this.field1408 = false;
                        for (int var96 = 0; var96 < Component.field67.length; ++var96) {
                            if (Component.field67[var96] != null && Component.field67[var96].field76 == var95) {
                                this.field1620 = Component.field67[var96].field73;
                                break;
                            }
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 30) {
                    int var97 = this.field1553.method229();
                    Component.field67[var97].field116 = 3;
                    if (field1468.field479 == null) {
                        Component.field67[var97].field117 = (field1468.field461[8] << 6) + (field1468.field461[0] << 12) + (field1468.field462[0] << 24) + (field1468.field462[4] << 18) + field1468.field461[11];
                    } else {
                        Component.field67[var97].field117 = (int) (field1468.field479.field1010 + 305419896L);
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 23) {
                    if (this.field1310 != -1) {
                        this.field1310 = -1;
                        this.field1319 = true;
                        this.field1575 = true;
                    }
                    if (this.field1674 != -1) {
                        this.field1674 = -1;
                        this.field1470 = true;
                    }
                    if (this.field1401) {
                        this.field1401 = false;
                        this.field1470 = true;
                    }
                    this.field1620 = -1;
                    this.field1356 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 21) {
                    int var98 = this.field1553.method227();
                    int var99 = this.field1553.method227();
                    String var100 = this.field1553.method234();
                    if (var98 >= 1 && var98 <= 5) {
                        if (var100.equalsIgnoreCase("null")) {
                            var100 = null;
                        }
                        this.field1340[var98 - 1] = var100;
                        this.field1341[var98 - 1] = var99 == 0;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 189) {
                    this.field1448 = this.field1553.method227();
                    this.field1319 = true;
                    this.field1575 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 196) {
                    String var101 = this.field1553.method234();
                    if (var101.endsWith(":tradereq:")) {
                        String var102 = var101.substring(0, var101.indexOf(":"));
                        long var103 = JString.method298(var102);
                        boolean var105 = false;
                        for (int var106 = 0; var106 < this.field1378; ++var106) {
                            if (this.field1675[var106] == var103) {
                                var105 = true;
                                break;
                            }
                        }
                        if (!var105 && this.field1666 == 0) {
                            this.method428(4, (byte) -115, "wishes to trade with you.", var102);
                        }
                    } else if (var101.endsWith(":duelreq:")) {
                        String var107 = var101.substring(0, var101.indexOf(":"));
                        long var108 = JString.method298(var107);
                        boolean var110 = false;
                        for (int var111 = 0; var111 < this.field1378; ++var111) {
                            if (this.field1675[var111] == var108) {
                                var110 = true;
                                break;
                            }
                        }
                        if (!var110 && this.field1666 == 0) {
                            this.method428(8, (byte) -115, "wishes to duel with you.", var107);
                        }
                    } else if (!var101.endsWith(":chalreq:")) {
                        this.method428(0, (byte) -115, var101, "");
                    } else {
                        String var112 = var101.substring(0, var101.indexOf(":"));
                        long var113 = JString.method298(var112);
                        boolean var115 = false;
                        for (int var116 = 0; var116 < this.field1378; ++var116) {
                            if (this.field1675[var116] == var113) {
                                var115 = true;
                                break;
                            }
                        }
                        if (!var115 && this.field1666 == 0) {
                            String var117 = var101.substring(var101.indexOf(":") + 1, var101.length() - 9);
                            this.method428(8, (byte) -115, var117, var112);
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 18) {
                    int var118 = this.field1553.method229();
                    int var119 = this.field1553.method229();
                    int var120 = this.field1553.method229();
                    if (var119 == 65535) {
                        Component.field67[var118].field116 = 0;
                        this.field1591 = -1;
                        return true;
                    }
                    ObjType var121 = ObjType.method344(var119);
                    Component.field67[var118].field116 = 4;
                    Component.field67[var118].field117 = var119;
                    Component.field67[var118].field123 = var121.field1057;
                    Component.field67[var118].field124 = var121.field1058;
                    Component.field67[var118].field122 = var121.field1056 * 100 / var120;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 187) {
                    int var122 = this.field1553.method229();
                    if (var122 == 65535) {
                        var122 = -1;
                    }
                    if (this.field1384 != var122 && this.field1478 && !field1656 && this.field1363 == 0) {
                        this.field1611 = var122;
                        this.field1612 = true;
                        this.field1235.method277(2, this.field1611);
                    }
                    this.field1384 = var122;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 29) {
                    int var123 = this.field1553.method229();
                    int var124 = this.field1553.method229();
                    if (this.field1478 && !field1656) {
                        this.field1611 = var123;
                        this.field1612 = false;
                        this.field1235.method277(2, this.field1611);
                        this.field1363 = var124;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 177) {
                    int var125 = this.field1553.method229();
                    int var126 = this.field1553.method227();
                    int var127 = this.field1553.method229();
                    if (this.field1471 && !field1656 && this.field1389 < 50) {
                        this.field1267[this.field1389] = var125;
                        this.field1427[this.field1389] = var126;
                        this.field1614[this.field1389] = Wave.field912[var125] + var127;
                        ++this.field1389;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 112) {
                    this.field1458 = this.field1553.method227();
                    this.field1459 = this.field1553.method227();
                    while (this.field1553.field710 < this.field1590) {
                        int var128 = this.field1553.method227();
                        this.method478(this.field1553, -6563, var128);
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 172) {
                    for (int var129 = 0; var129 < this.field1635.length; ++var129) {
                        if (this.field1635[var129] != this.field1445[var129]) {
                            this.field1635[var129] = this.field1445[var129];
                            this.method558(true, var129);
                            this.field1319 = true;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 160) {
                    int var130 = this.field1553.method229();
                    int var131 = this.field1553.method229();
                    int var132 = var131 >> 10 & 31;
                    int var133 = var131 >> 5 & 31;
                    int var134 = var131 & 31;
                    Component.field67[var130].field110 = (var134 << 3) + (var132 << 19) + (var133 << 11);
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 47) {
                    this.field1378 = this.field1590 / 8;
                    for (int var135 = 0; var135 < this.field1378; ++var135) {
                        this.field1675[var135] = this.field1553.method233(true);
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 65) {
                    this.method516(true, this.field1590, this.field1553);
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 222) {
                    int var136 = this.field1553.method229();
                    int var137 = this.field1553.method229();
                    Component.field67[var136].field116 = 1;
                    Component.field67[var136].field117 = var137;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 127) {
                    int var138 = this.field1553.method230();
                    if (var138 >= 0) {
                        this.method515(var138, -44196);
                    }
                    this.field1345 = var138;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 75) {
                    int var139 = this.field1553.method229();
                    byte var140 = this.field1553.method228();
                    this.field1445[var139] = var140;
                    if (this.field1635[var139] != var140) {
                        this.field1635[var139] = var140;
                        this.method558(true, var139);
                        this.field1319 = true;
                        if (this.field1386 != -1) {
                            this.field1470 = true;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 82) {
                    this.field1250 = true;
                    this.field1410 = this.field1553.method227();
                    this.field1411 = this.field1553.method227();
                    this.field1412 = this.field1553.method229();
                    this.field1413 = this.field1553.method227();
                    this.field1414 = this.field1553.method227();
                    if (this.field1414 >= 100) {
                        int var141 = this.field1410 * 128 + 64;
                        int var142 = this.field1411 * 128 + 64;
                        int var143 = this.method462(false, var142, var141, this.field1576) - this.field1412;
                        int var144 = var141 - this.field1296;
                        int var145 = var143 - this.field1297;
                        int var146 = var142 - this.field1298;
                        int var147 = (int) Math.sqrt((double) (var144 * var144 + var146 * var146));
                        this.field1299 = (int) (Math.atan2((double) var145, (double) var147) * 325.949D) & 2047;
                        this.field1300 = (int) (Math.atan2((double) var144, (double) var146) * -325.949D) & 2047;
                        if (this.field1299 < 128) {
                            this.field1299 = 128;
                        }
                        if (this.field1299 > 383) {
                            this.field1299 = 383;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 81) {
                    int var148 = this.field1553.method229();
                    this.method515(var148, -44196);
                    if (this.field1310 != -1) {
                        this.field1310 = -1;
                        this.field1319 = true;
                        this.field1575 = true;
                    }
                    this.field1674 = var148;
                    this.field1470 = true;
                    this.field1620 = -1;
                    this.field1356 = false;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 138) {
                    int var149 = this.field1553.method229();
                    boolean var150 = this.field1553.method227() == 1;
                    Component.field67[var149].field88 = var150;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 247) {
                    this.field1533 = this.field1553.method227();
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 235) {
                    this.field1526 = this.field1553.method227();
                    this.field1319 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 76) {
                    this.field1319 = true;
                    int var151 = this.field1553.method229();
                    Component var152 = Component.field67[var151];
                    while (this.field1553.field710 < this.field1590) {
                        int var153 = this.field1553.method241();
                        int var154 = this.field1553.method229();
                        int var155 = this.field1553.method227();
                        if (var155 == 255) {
                            var155 = this.field1553.method232();
                        }
                        if (var153 >= 0 && var153 < var152.field68.length) {
                            var152.field68[var153] = var154;
                            var152.field69[var153] = var155;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 201) {
                    for (int var156 = 0; var156 < this.field1646.length; ++var156) {
                        if (this.field1646[var156] != null) {
                            this.field1646[var156].field424 = -1;
                        }
                    }
                    for (int var157 = 0; var157 < this.field1429.length; ++var157) {
                        if (this.field1429[var157] != null) {
                            this.field1429[var157].field424 = -1;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 35) {
                    this.field1643 = false;
                    this.field1401 = true;
                    this.field1513 = "";
                    this.field1470 = true;
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 133) {
                    this.field1250 = false;
                    for (int var158 = 0; var158 < 5; ++var158) {
                        this.field1630[var158] = false;
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 97) {
                    int var159 = this.field1553.method229();
                    int var160 = this.field1553.method232();
                    this.field1445[var159] = var160;
                    if (this.field1635[var159] != var160) {
                        this.field1635[var159] = var160;
                        this.method558(true, var159);
                        this.field1319 = true;
                        if (this.field1386 != -1) {
                            this.field1470 = true;
                        }
                    }
                    this.field1591 = -1;
                    return true;
                }
                if (this.field1591 == 155) {
                    this.field1458 = this.field1553.method227();
                    this.field1459 = this.field1553.method227();
                    this.field1591 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1591 + "," + this.field1590 + " - " + this.field1489 + "," + this.field1490);
                this.method433((byte) 25);
            } catch (IOException var165) {
                this.method510((byte) 7);
            } catch (Exception var166) {
                String var162 = "T2 - " + this.field1591 + "," + this.field1489 + "," + this.field1490 + " - " + this.field1590 + "," + (field1468.field446[0] + this.field1605) + "," + (field1468.field447[0] + this.field1606) + " - ";
                for (int var163 = 0; var163 < this.field1590 && var163 < 50; ++var163) {
                    var162 = var162 + this.field1553.field709[var163] + ",";
                }
                signlink.reporterror(var162);
                this.method433((byte) 25);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method443(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BZ)V")
    public final void method444(byte arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 27) {
            this.field1591 = -1;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method445(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(false, 20, "Starting up");
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (field1317) {
            this.field1657 = true;
        } else {
            field1317 = true;
            boolean var1 = false;
            String var2 = this.method513(974);
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
                this.field1241 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1629[var3] = new FileStream(signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1, (byte) 4);
                    }
                }
                try {
                    this.method438(field1370);
                    this.field1538 = this.method536((byte) -9, "title screen", 1, "title", 25, this.field1472[1]);
                    this.field1676 = new PixFont(9, "p11_full", false, this.field1538);
                    this.field1677 = new PixFont(9, "p12_full", false, this.field1538);
                    this.field1678 = new PixFont(9, "b12_full", false, this.field1538);
                    this.field1679 = new PixFont(9, "q8_full", true, this.field1538);
                    this.method479(0);
                    this.method459(-532);
                    Jagfile var4 = this.method536((byte) -9, "config", 2, "config", 30, this.field1472[2]);
                    Jagfile var5 = this.method536((byte) -9, "interface", 3, "interface", 35, this.field1472[3]);
                    Jagfile var6 = this.method536((byte) -9, "2d graphics", 4, "media", 40, this.field1472[4]);
                    Jagfile var7 = this.method536((byte) -9, "textures", 6, "textures", 45, this.field1472[6]);
                    Jagfile var8 = this.method536((byte) -9, "chat system", 7, "wordenc", 50, this.field1472[7]);
                    Jagfile var9 = this.method536((byte) -9, "sound effects", 8, "sounds", 55, this.field1472[8]);
                    this.field1292 = new byte[4][104][104];
                    this.field1286 = new int[4][105][105];
                    this.field1613 = new World3D(104, 4, this.field1286, 104, field1667);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1443[var10] = new CollisionMap(99, 104, 104);
                    }
                    this.field1334 = new Pix32(512, 512);
                    Jagfile var11 = this.method536((byte) -9, "update list", 5, "versionlist", 60, this.field1472[5]);
                    this.method13(false, 60, "Connecting to update server");
                    this.field1235 = new OnDemand();
                    this.field1235.method268(var11, this);
                    AnimFrame.method44(this.field1235.method271(7));
                    Model.method122(this.field1235.method270(0, (byte) 7), this.field1235);
                    if (!field1656) {
                        this.field1611 = 0;
                        try {
                            this.field1611 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1612 = true;
                        this.field1235.method277(2, this.field1611);
                        while (this.field1235.method278() > 0) {
                            this.method504(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1235.field836 > 3) {
                                this.method443("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(false, 65, "Requesting animations");
                    int var12 = this.field1235.method270(1, (byte) 7);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1235.method277(1, var13);
                    }
                    while (this.field1235.method278() > 0) {
                        int var14 = var12 - this.field1235.method278();
                        if (var14 > 0) {
                            this.method13(false, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method504(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1235.field836 > 3) {
                            this.method443("ondemand");
                            return;
                        }
                    }
                    this.method13(false, 70, "Requesting models");
                    int var15 = this.field1235.method270(0, (byte) 7);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1235.method275(var16, -600);
                        if ((var17 & 1) != 0) {
                            this.field1235.method277(0, var16);
                        }
                    }
                    int var18 = this.field1235.method278();
                    while (this.field1235.method278() > 0) {
                        int var19 = var18 - this.field1235.method278();
                        if (var19 > 0) {
                            this.method13(false, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method504(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1629[0] != null) {
                        this.method13(false, 75, "Requesting maps");
                        this.field1235.method277(3, this.field1235.method272(48, -942, 47, 0));
                        this.field1235.method277(3, this.field1235.method272(48, -942, 47, 1));
                        this.field1235.method277(3, this.field1235.method272(48, -942, 48, 0));
                        this.field1235.method277(3, this.field1235.method272(48, -942, 48, 1));
                        this.field1235.method277(3, this.field1235.method272(48, -942, 49, 0));
                        this.field1235.method277(3, this.field1235.method272(48, -942, 49, 1));
                        this.field1235.method277(3, this.field1235.method272(47, -942, 47, 0));
                        this.field1235.method277(3, this.field1235.method272(47, -942, 47, 1));
                        this.field1235.method277(3, this.field1235.method272(47, -942, 48, 0));
                        this.field1235.method277(3, this.field1235.method272(47, -942, 48, 1));
                        this.field1235.method277(3, this.field1235.method272(148, -942, 48, 0));
                        this.field1235.method277(3, this.field1235.method272(148, -942, 48, 1));
                        int var20 = this.field1235.method278();
                        while (this.field1235.method278() > 0) {
                            int var21 = var20 - this.field1235.method278();
                            if (var21 > 0) {
                                this.method13(false, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method504(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1235.method270(0, (byte) 7);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1235.method275(var23, -600);
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
                            this.field1235.method280(7, 0, var25, var23);
                        }
                    }
                    this.field1235.method273(false, field1655);
                    if (!field1656) {
                        int var26 = this.field1235.method270(2, (byte) 7);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1235.method276(var27, 324)) {
                                this.field1235.method280(7, 2, (byte) 1, var27);
                            }
                        }
                    }
                    this.method13(false, 80, "Unpacking media");
                    this.field1564 = new Pix8(var6, "invback", 0);
                    this.field1566 = new Pix8(var6, "chatback", 0);
                    this.field1565 = new Pix8(var6, "mapback", 0);
                    this.field1324 = new Pix8(var6, "backbase1", 0);
                    this.field1325 = new Pix8(var6, "backbase2", 0);
                    this.field1326 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1697[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1409 = new Pix32(var6, "compass", 0);
                    this.field1682 = new Pix32(var6, "mapedge", 0);
                    this.field1682.method182(-15744);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1662[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1473[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1529[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1604[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1631 = new Pix32(var6, "mapmarker", 0);
                    this.field1632 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1288[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1498 = new Pix32(var6, "mapdots", 0);
                    this.field1499 = new Pix32(var6, "mapdots", 1);
                    this.field1500 = new Pix32(var6, "mapdots", 2);
                    this.field1501 = new Pix32(var6, "mapdots", 3);
                    this.field1479 = new Pix8(var6, "scrollbar", 0);
                    this.field1480 = new Pix8(var6, "scrollbar", 1);
                    this.field1557 = new Pix8(var6, "redstone1", 0);
                    this.field1558 = new Pix8(var6, "redstone2", 0);
                    this.field1559 = new Pix8(var6, "redstone3", 0);
                    this.field1560 = new Pix8(var6, "redstone1", 0);
                    this.field1560.method195(6);
                    this.field1561 = new Pix8(var6, "redstone2", 0);
                    this.field1561.method195(6);
                    this.field1273 = new Pix8(var6, "redstone1", 0);
                    this.field1273.method196(35509);
                    this.field1274 = new Pix8(var6, "redstone2", 0);
                    this.field1274.method196(35509);
                    this.field1275 = new Pix8(var6, "redstone3", 0);
                    this.field1275.method196(35509);
                    this.field1276 = new Pix8(var6, "redstone1", 0);
                    this.field1276.method195(6);
                    this.field1276.method196(35509);
                    this.field1277 = new Pix8(var6, "redstone2", 0);
                    this.field1277.method195(6);
                    this.field1277.method196(35509);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1257[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1544 = new PixMap(this.method11(7), var35.field666, var35.field667, 2);
                    var35.method183(0, 0, 8);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1545 = new PixMap(this.method11(7), var36.field666, var36.field667, 2);
                    var36.method183(0, 0, 8);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1546 = new PixMap(this.method11(7), var37.field666, var37.field667, 2);
                    var37.method183(0, 0, 8);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1547 = new PixMap(this.method11(7), var38.field666, var38.field667, 2);
                    var38.method183(0, 0, 8);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1548 = new PixMap(this.method11(7), var39.field666, var39.field667, 2);
                    var39.method183(0, 0, 8);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1549 = new PixMap(this.method11(7), var40.field666, var40.field667, 2);
                    var40.method183(0, 0, 8);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1550 = new PixMap(this.method11(7), var41.field666, var41.field667, 2);
                    var41.method183(0, 0, 8);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1551 = new PixMap(this.method11(7), var42.field666, var42.field667, 2);
                    var42.method183(0, 0, 8);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1552 = new PixMap(this.method11(7), var43.field666, var43.field667, 2);
                    var43.method183(0, 0, 8);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1473[var48] != null) {
                            this.field1473[var48].method181(var44 + var47, (byte) 3, var45 + var47, var46 + var47);
                        }
                        if (this.field1662[var48] != null) {
                            this.field1662[var48].method197(var44 + var47, (byte) 3, var45 + var47, var46 + var47);
                        }
                    }
                    this.method13(false, 83, "Unpacking textures");
                    Pix3D.method168(var7, field1482);
                    Pix3D.method172(0.8D, 0);
                    Pix3D.method167(1, 20);
                    this.method13(false, 86, "Unpacking config");
                    SeqType.method377(true, var4);
                    LocType.method326(var4);
                    FloType.method367(true, var4);
                    ObjType.method342(var4);
                    NpcType.method336(var4);
                    IdkType.method371(true, var4);
                    SpotAnimType.method380(true, var4);
                    VarpType.method385(true, var4);
                    VarbitType.method383(true, var4);
                    ObjType.field1049 = field1655;
                    if (!field1656) {
                        this.method13(false, 90, "Unpacking sounds");
                        byte[] var49 = var9.method297("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, 15787);
                        Wave.method316(true, var50);
                    }
                    this.method13(false, 95, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1676, this.field1677, this.field1678, this.field1679 };
                    Component.method32(var51, var6, 0, var5);
                    this.method13(false, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1565.field675[this.field1565.field677 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1382[var52] = var53;
                        this.field1331[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1565.field675[this.field1565.field677 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1302[var56 - 5] = var57 - 25;
                        this.field1289[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method165(96, 479, 8);
                    this.field1335 = Pix3D.field646;
                    Pix3D.method165(261, 190, 8);
                    this.field1336 = Pix3D.field646;
                    Pix3D.method165(334, 512, 8);
                    this.field1337 = Pix3D.field646;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field644[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(var60, 500, 334, 3, 800, 512);
                    WordFilter.method387(var8);
                    this.field1287 = new MouseTracking(228, this);
                    this.method12(this.field1287, 10);
                    LocEntity.field482 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1347 + " " + this.field1597);
                    this.field1476 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        this.field1314 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1595) {
                ++this.field1366;
                this.method436(699);
                this.method436(699);
                this.method495(0);
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
        this.field1314 = false;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method447(int arg0) {
        this.field1617.method256((byte) 5);
        if (this.field1269 == 2) {
            byte[] var2 = this.field1565.field675;
            int[] var3 = Pix2D.field620;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1409.method189(this.field1382, 0, 25, 256, this.field1351, 33, this.field1331, 33, -687, 25, 0);
            this.field1618.method256((byte) 5);
        } else {
            int var6 = this.field1380 + this.field1351 & 2047;
            int var7 = field1468.field396 / 32 + 48;
            int var8 = 464 - field1468.field397 / 32;
            this.field1334.method189(this.field1302, 5, var8, this.field1496 + 256, var6, 151, this.field1289, 146, -687, var7, 25);
            this.field1409.method189(this.field1382, 0, 25, 256, this.field1351, 33, this.field1331, 33, -687, 25, 0);
            for (int var9 = 0; var9 < this.field1247; ++var9) {
                int var37 = this.field1248[var9] * 4 + 2 - field1468.field396 / 32;
                int var38 = this.field1249[var9] * 4 + 2 - field1468.field397 / 32;
                this.method552(var37, this.field1293[var9], 139, var38);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var33 = 0; var33 < 104; ++var33) {
                    LinkList var34 = this.field1567[this.field1576][var10][var33];
                    if (var34 != null) {
                        int var35 = var10 * 4 + 2 - field1468.field396 / 32;
                        int var36 = var33 * 4 + 2 - field1468.field397 / 32;
                        this.method552(var35, this.field1498, 139, var36);
                    }
                }
            }
            this.field1590 += arg0;
            for (int var11 = 0; var11 < this.field1430; ++var11) {
                NpcEntity var30 = this.field1429[this.field1431[var11]];
                if (var30 != null && var30.method113(true) && var30.field454.field1027) {
                    int var31 = var30.field396 / 32 - field1468.field396 / 32;
                    int var32 = var30.field397 / 32 - field1468.field397 / 32;
                    this.method552(var31, this.field1499, 139, var32);
                }
            }
            for (int var12 = 0; var12 < this.field1647; ++var12) {
                PlayerEntity var23 = this.field1646[this.field1648[var12]];
                if (var23 != null && var23.method113(true)) {
                    int var24 = var23.field396 / 32 - field1468.field396 / 32;
                    int var25 = var23.field397 / 32 - field1468.field397 / 32;
                    boolean var26 = false;
                    long var27 = JString.method298(var23.field457);
                    for (int var29 = 0; var29 < this.field1525; ++var29) {
                        if (this.field1400[var29] == var27 && this.field1315[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    if (field1468.field480 != 0 && var23.field480 != 0) {
                        if (field1468.field480 == var23.field480) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (var26) {
                        this.method552(var24, this.field1501, 139, var25);
                    } else {
                        this.method552(var24, this.field1500, 139, var25);
                    }
                }
            }
            if (this.field1426 != 0 && field1661 % 20 < 10) {
                if (this.field1426 == 1 && this.field1322 >= 0 && this.field1322 < this.field1429.length) {
                    NpcEntity var13 = this.field1429[this.field1322];
                    if (var13 != null) {
                        int var14 = var13.field396 / 32 - field1468.field396 / 32;
                        int var15 = var13.field397 / 32 - field1468.field397 / 32;
                        this.method426(var14, this.field1632, var15, this.field1255);
                    }
                }
                if (this.field1426 == 2) {
                    int var16 = (this.field1669 - this.field1605) * 4 + 2 - field1468.field396 / 32;
                    int var17 = (this.field1670 - this.field1606) * 4 + 2 - field1468.field397 / 32;
                    this.method426(var16, this.field1632, var17, this.field1255);
                }
                if (this.field1426 == 10 && this.field1330 >= 0 && this.field1330 < this.field1646.length) {
                    PlayerEntity var18 = this.field1646[this.field1330];
                    if (var18 != null) {
                        int var19 = var18.field396 / 32 - field1468.field396 / 32;
                        int var20 = var18.field397 / 32 - field1468.field397 / 32;
                        this.method426(var19, this.field1632, var20, this.field1255);
                    }
                }
            }
            if (this.field1332 != 0) {
                int var21 = this.field1332 * 4 + 2 - field1468.field396 / 32;
                int var22 = this.field1333 * 4 + 2 - field1468.field397 / 32;
                this.method552(var21, this.field1631, 139, var22);
            }
            Pix2D.method156(16777215, 210, 78, 3, 97, 3);
            this.field1618.method256((byte) 5);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;I)V")
    public final void method448(int arg0, int arg1, int arg2, Component arg3, int arg4) {
        if (arg3.field74 == 0 && arg3.field89 != null) {
            if (!arg3.field88 || this.field1420 == arg3.field72 || this.field1354 == arg3.field72 || this.field1633 == arg3.field72) {
                int var6 = Pix2D.field625;
                int var7 = Pix2D.field623;
                int var8 = Pix2D.field626;
                int var9 = Pix2D.field624;
                Pix2D.method153(this.field1398, arg3.field78 + arg4, arg3.field77 + arg2, arg4, arg2);
                int var10 = arg3.field89.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field90[var11] + arg2;
                    int var13 = arg3.field91[var11] + arg4 - arg1;
                    Component var14 = Component.field67[arg3.field89[var11]];
                    int var15 = var14.field80 + var12;
                    int var16 = var14.field81 + var13;
                    if (var14.field76 > 0) {
                        this.method452(-338, var14);
                    }
                    if (var14.field74 == 0) {
                        if (var14.field87 > var14.field86 - var14.field78) {
                            var14.field87 = var14.field86 - var14.field78;
                        }
                        if (var14.field87 < 0) {
                            var14.field87 = 0;
                        }
                        this.method448(6, var14.field87, var15, var14, var16);
                        if (var14.field86 > var14.field78) {
                            this.method432(var16, var14.field77 + var15, var14.field87, var14.field86, var14.field78, 3);
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
                                                var30.method185(var21, this.field1634, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field68[var17] - 1;
                                        if (var20 > Pix2D.field625 - 32 && var20 < Pix2D.field626 && var21 > Pix2D.field623 - 32 && var21 < Pix2D.field624 || this.field1516 != 0 && this.field1515 == var17) {
                                            int var25 = 0;
                                            if (this.field1373 == 1 && this.field1374 == var17 && this.field1375 == var14.field72) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method350(54, var24, var25, var14.field69[var17]);
                                            if (var26 != null) {
                                                if (this.field1516 != 0 && this.field1515 == var17 && this.field1514 == var14.field72) {
                                                    var22 = super.field21 - this.field1517;
                                                    var23 = super.field22 - this.field1518;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1399 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method187(128, this.field1323, var21 + var23, var20 + var22);
                                                    if (var21 + var23 < Pix2D.field623 && arg3.field87 > 0) {
                                                        int var27 = (Pix2D.field623 - var21 - var23) * this.field1245 / 3;
                                                        if (var27 > this.field1245 * 10) {
                                                            var27 = this.field1245 * 10;
                                                        }
                                                        if (var27 > arg3.field87) {
                                                            var27 = arg3.field87;
                                                        }
                                                        arg3.field87 -= var27;
                                                        this.field1518 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field624 && arg3.field87 < arg3.field86 - arg3.field78) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field624) * this.field1245 / 3;
                                                        if (var28 > this.field1245 * 10) {
                                                            var28 = this.field1245 * 10;
                                                        }
                                                        if (var28 > arg3.field86 - arg3.field78 - arg3.field87) {
                                                            var28 = arg3.field86 - arg3.field78 - arg3.field87;
                                                        }
                                                        arg3.field87 += var28;
                                                        this.field1518 -= var28;
                                                    }
                                                } else if (this.field1572 != 0 && this.field1571 == var17 && this.field1570 == var14.field72) {
                                                    var26.method187(128, this.field1323, var21, var20);
                                                } else {
                                                    var26.method185(var21, this.field1634, var20);
                                                }
                                                if (var26.field670 == 33 || var14.field69[var17] != 1) {
                                                    int var29 = var14.field69[var17];
                                                    this.field1676.method204((byte) -104, 0, method511(var29, 656), var20 + 1 + var22, var21 + 10 + var23);
                                                    this.field1676.method204((byte) -104, 16776960, method511(var29, 656), var20 + var22, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field74 == 3) {
                            boolean var31 = false;
                            if (this.field1633 == var14.field72 || this.field1354 == var14.field72 || this.field1420 == var14.field72) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method499(var14, 0)) {
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
                                    Pix2D.method156(var32, 210, var16, var14.field78, var15, var14.field77);
                                } else {
                                    Pix2D.method157(1, var15, var14.field77, var32, var16, var14.field78);
                                }
                            } else if (var14.field104) {
                                Pix2D.method155(var16, var14.field78, 256 - (var14.field79 & 255), var32, var14.field77, var15, false);
                            } else {
                                Pix2D.method158(var14.field78, var32, var15, var14.field77, 256 - (var14.field79 & 255), var16, 0);
                            }
                        } else if (var14.field74 == 4) {
                            PixFont var33 = var14.field107;
                            String var34 = var14.field108;
                            boolean var35 = false;
                            if (this.field1633 == var14.field72 || this.field1354 == var14.field72 || this.field1420 == var14.field72) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method499(var14, 0)) {
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
                            if (var14.field75 == 6 && this.field1356) {
                                var34 = "Please wait...";
                                var36 = var14.field110;
                            }
                            if (Pix2D.field621 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field695 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label328: while (true) {
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
                                                                            break label328;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method483(this.method505(4, this.field1507, var14), false) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method483(this.method505(3, this.field1507, var14), false) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method483(this.method505(2, this.field1507, var14), false) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method483(this.method505(1, this.field1507, var14), false) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method483(this.method505(0, this.field1507, var14), false) + var34.substring(var38 + 2);
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
                                    var33.method201(var14.field106, var36, (byte) -85, var14.field77 / 2 + var15, var44, var37);
                                } else {
                                    var33.method208(var36, 2, var37, var14.field106, var15, var44);
                                }
                                var37 += var33.field695;
                            }
                        } else if (var14.field74 == 5) {
                            Pix32 var45;
                            if (this.method499(var14, 0)) {
                                var45 = var14.field115;
                            } else {
                                var45 = var14.field114;
                            }
                            if (var45 != null) {
                                var45.method185(var16, this.field1634, var15);
                            }
                        } else if (var14.field74 == 6) {
                            int var46 = Pix3D.field640;
                            int var47 = Pix3D.field641;
                            Pix3D.field640 = var14.field77 / 2 + var15;
                            Pix3D.field641 = var14.field78 / 2 + var16;
                            int var48 = Pix3D.field644[var14.field123] * var14.field122 >> 16;
                            int var49 = Pix3D.field645[var14.field123] * var14.field122 >> 16;
                            boolean var50 = this.method499(var14, 0);
                            int var51;
                            if (var50) {
                                var51 = var14.field121;
                            } else {
                                var51 = var14.field120;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(0, -1, -1, var50);
                            } else {
                                SeqType var53 = SeqType.field1150[var51];
                                var52 = var14.method34(0, var53.field1153[var14.field70], var53.field1152[var14.field70], var50);
                            }
                            if (var52 != null) {
                                var52.method145(0, var14.field124, 0, var14.field123, 0, var48, var49);
                            }
                            Pix3D.field640 = var46;
                            Pix3D.field641 = var47;
                        } else if (var14.field74 == 7) {
                            PixFont var54 = var14.field107;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field78; ++var56) {
                                for (int var57 = 0; var57 < var14.field77; ++var57) {
                                    if (var14.field68[var55] > 0) {
                                        ObjType var58 = ObjType.method344(var14.field68[var55] - 1);
                                        String var59 = var58.field1052;
                                        if (var58.field1063 || var14.field69[var55] != 1) {
                                            var59 = var59 + " x" + method509(var14.field69[var55], (byte) 5);
                                        }
                                        int var60 = (var14.field98 + 115) * var57 + var15;
                                        int var61 = (var14.field99 + 12) * var56 + var16;
                                        if (var14.field105) {
                                            var54.method201(var14.field106, var14.field110, (byte) -85, var14.field77 / 2 + var60, var59, var61);
                                        } else {
                                            var54.method208(var14.field110, 2, var61, var14.field106, var60, var59);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                if (arg0 < 6 || arg0 > 6) {
                    field1482 = !field1482;
                }
                Pix2D.method153(this.field1398, var9, var8, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method449(byte arg0) {
        if (arg0 == 6) {
            if (field1656 && this.field1303 == 2 && World.field42 != this.field1576) {
                this.field1618.method256((byte) 5);
                this.field1677.method200(257, "Loading - please wait.", -31546, 0, 151);
                this.field1677.method200(256, "Loading - please wait.", -31546, 16777215, 150);
                this.field1618.method257(-781, 4, 4, super.field13);
                this.field1303 = 1;
                this.field1491 = System.currentTimeMillis();
            }
            if (this.field1303 == 1) {
                int var2 = this.method450(this.field1603);
                if (var2 != 0 && System.currentTimeMillis() - this.field1491 > 360000L) {
                    signlink.reporterror(this.field1492 + " glcfb " + this.field1234 + "," + var2 + "," + field1656 + "," + this.field1629[0] + "," + this.field1235.method278() + "," + this.field1576 + "," + this.field1262 + "," + this.field1263);
                    this.field1491 = System.currentTimeMillis();
                }
            }
            if (this.field1303 == 2 && this.field1576 != this.field1484) {
                this.field1484 = this.field1576;
                this.method451((byte) -89, this.field1576);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)I")
    public final int method450(byte arg0) {
        for (int var2 = 0; var2 < this.field1402.length; ++var2) {
            if (this.field1402[var2] == null && this.field1461[var2] != -1) {
                return -1;
            }
            if (this.field1394[var2] == null && this.field1462[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1402.length; ++var4) {
            byte[] var6 = this.field1394[var4];
            if (var6 != null) {
                int var7 = (this.field1460[var4] >> 8) * 64 - this.field1605;
                int var8 = (this.field1460[var4] & 255) * 64 - this.field1606;
                var3 &= World.method16(576, var8, var7, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1696) {
            return -4;
        } else {
            this.field1303 = 2;
            World.field42 = this.field1576;
            this.method540(-17416);
            this.field1271.method216(-34003, 214);
            if (arg0 == 2) {
                boolean var5 = false;
            } else {
                field1450 = 384;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method451(byte arg0, int arg1) {
        int[] var3 = this.field1334.field665;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1292[arg1][var24][var6] & 24) == 0) {
                    this.field1613.method85(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1292[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1613.method85(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1334.method180((byte) 5);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1292[arg1][var22][var9] & 24) == 0) {
                    this.method497(var22, var9, var7, (byte) 5, arg1, var8);
                }
                if (arg1 < 3 && (this.field1292[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method497(var22, var9, var7, (byte) 5, arg1 + 1, var8);
                }
            }
        }
        this.field1618.method256((byte) 5);
        this.field1247 = 0;
        if (arg0 != -89) {
            field1450 = this.field1348.method293();
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1613.method79(this.field1576, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method328(var13).field978;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1443[this.field1576].field1107;
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
                        this.field1293[this.field1247] = this.field1473[var14];
                        this.field1248[this.field1247] = var15;
                        this.field1249[this.field1247] = var16;
                        ++this.field1247;
                    }
                }
            }
        }
        ++field1625;
        if (field1625 > 112) {
            field1625 = 0;
            this.field1271.method216(-34003, 125);
            this.field1271.method217(50);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)V")
    public final void method452(int arg0, Component arg1) {
        if (arg0 >= 0) {
            this.field1573 = this.field1348.method293();
        }
        int var3 = arg1.field76;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1525;
                if (this.field1526 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field108 = "";
                    arg1.field75 = 0;
                } else {
                    if (this.field1315[var3] == 0) {
                        arg1.field108 = "@red@Offline";
                    } else if (this.field1315[var3] == field1653) {
                        arg1.field108 = "@gre@World-" + (this.field1315[var3] - 9);
                    } else {
                        arg1.field108 = "@yel@World-" + (this.field1315[var3] - 9);
                    }
                    arg1.field75 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1525;
                if (this.field1526 != 2) {
                    var6 = 0;
                }
                arg1.field86 = var6 * 15 + 20;
                if (arg1.field86 <= arg1.field78) {
                    arg1.field86 = arg1.field78 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1526 == 0) {
                    arg1.field108 = "Loading ignore list";
                    arg1.field75 = 0;
                } else if (var3 == 1 && this.field1526 == 0) {
                    arg1.field108 = "Please wait...";
                    arg1.field75 = 0;
                } else {
                    int var7 = this.field1378;
                    if (this.field1526 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field108 = "";
                        arg1.field75 = 0;
                    } else {
                        arg1.field108 = JString.method302(JString.method299(this.field1675[var3], true), true);
                        arg1.field75 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field86 = this.field1378 * 15 + 20;
                if (arg1.field86 <= arg1.field78) {
                    arg1.field86 = arg1.field78 + 1;
                }
            } else if (var3 == 327) {
                arg1.field123 = 150;
                arg1.field124 = (int) (Math.sin((double) field1661 / 40.0D) * 256.0D) & 2047;
                if (this.field1233) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field1270[var8];
                        if (var15 >= 0 && !IdkType.field1128[var15].method373(9)) {
                            return;
                        }
                    }
                    this.field1233 = false;
                    Model[] var9 = new Model[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field1270[var11];
                        if (var14 >= 0) {
                            var9[var10++] = IdkType.field1128[var14].method374(0);
                        }
                    }
                    Model var12 = new Model(var9, var10, -33019);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field1359[var13] != 0) {
                            var12.method139(field1494[var13][0], field1494[var13][this.field1359[var13]]);
                            if (var13 == 1) {
                                var12.method139(field1464[0], field1464[this.field1359[var13]]);
                            }
                        }
                    }
                    var12.method132((byte) 3);
                    var12.method133(SeqType.field1150[field1468.field401].field1152[0], 188);
                    var12.method142(64, 850, -30, -50, -30, true);
                    arg1.field116 = 5;
                    arg1.field117 = 0;
                    Component.method36(5, var12, 9, 0);
                }
            } else if (var3 == 324) {
                if (this.field1446 == null) {
                    this.field1446 = arg1.field114;
                    this.field1447 = arg1.field115;
                }
                if (this.field1600) {
                    arg1.field114 = this.field1447;
                } else {
                    arg1.field114 = this.field1446;
                }
            } else if (var3 == 325) {
                if (this.field1446 == null) {
                    this.field1446 = arg1.field114;
                    this.field1447 = arg1.field115;
                }
                if (this.field1600) {
                    arg1.field114 = this.field1446;
                } else {
                    arg1.field114 = this.field1447;
                }
            } else if (var3 == 600) {
                arg1.field108 = this.field1360;
                if (field1661 % 20 < 10) {
                    arg1.field108 = arg1.field108 + "|";
                } else {
                    arg1.field108 = arg1.field108 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1609 >= 1) {
                        if (this.field1408) {
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
                    if (this.field1652 != 0) {
                        String var16;
                        if (this.field1368 == 0) {
                            var16 = "earlier today";
                        } else if (this.field1368 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field1368 + " days ago";
                        }
                        arg1.field108 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field108 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1444 == 0) {
                        arg1.field108 = "0 unread messages";
                        arg1.field110 = 16776960;
                    }
                    if (this.field1444 == 1) {
                        arg1.field108 = "1 unread message";
                        arg1.field110 = 65280;
                    }
                    if (this.field1444 > 1) {
                        arg1.field108 = this.field1444 + " unread messages";
                        arg1.field110 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1290 == 201) {
                        if (this.field1338 == 1) {
                            arg1.field108 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field108 = "";
                        }
                    } else if (this.field1290 == 200) {
                        arg1.field108 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field1290 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field1290 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field1290 + " days ago";
                        }
                        arg1.field108 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1290 == 201) {
                        if (this.field1338 == 1) {
                            arg1.field108 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field108 = "";
                        }
                    } else if (this.field1290 == 200) {
                        arg1.field108 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field108 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1290 == 201) {
                        if (this.field1338 == 1) {
                            arg1.field108 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field108 = "";
                        }
                    } else if (this.field1290 == 200) {
                        arg1.field108 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field108 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1526 == 0) {
            arg1.field108 = "Loading friend list";
            arg1.field75 = 0;
        } else if (var3 == 1 && this.field1526 == 1) {
            arg1.field108 = "Connecting to friendserver";
            arg1.field75 = 0;
        } else if (var3 == 2 && this.field1526 != 2) {
            arg1.field108 = "Please wait...";
            arg1.field75 = 0;
        } else {
            int var4 = this.field1525;
            if (this.field1526 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field108 = "";
                arg1.field75 = 0;
            } else {
                arg1.field108 = this.field1465[var3];
                arg1.field75 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILlb;)V")
    private final void method453(byte arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field711 + 21 < arg1 * 8) {
                int var4 = arg2.method238(14, false);
                if (var4 != 16383) {
                    if (this.field1429[var4] == null) {
                        this.field1429[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1429[var4];
                    this.field1431[this.field1430++] = var4;
                    var5.field441 = field1661;
                    var5.field454 = NpcType.method338(arg2.method238(11, false));
                    var5.field400 = var5.field454.field1013;
                    var5.field444 = var5.field454.field1035;
                    var5.field403 = var5.field454.field1017;
                    var5.field404 = var5.field454.field1018;
                    var5.field405 = var5.field454.field1019;
                    var5.field406 = var5.field454.field1020;
                    var5.field401 = var5.field454.field1016;
                    int var6 = arg2.method238(5, false);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method238(5, false);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method238(1, false);
                    var5.method110(field1468.field446[0] + var6, var8 == 1, field1468.field447[0] + var7, this.field1346);
                    int var9 = arg2.method238(1, false);
                    if (var9 == 1) {
                        this.field1650[this.field1649++] = var4;
                    }
                    continue;
                }
            }
            arg2.method239((byte) 4);
            if (arg0 != -97) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public final void method13(boolean arg0, int arg1, String arg2) {
        this.field1597 = arg1;
        this.field1347 = arg2;
        this.method498(831);
        if (arg0) {
            field1482 = !field1482;
        }
        if (this.field1538 == null) {
            super.method13(false, arg1, arg2);
        } else {
            this.field1686.method256((byte) 5);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1678.method200(var4 / 2, "RuneScape is loading - please wait...", -31546, 16777215, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method157(1, var4 / 2 - 152, 304, 9179409, var7, 34);
            Pix2D.method157(1, var4 / 2 - 151, 302, 0, var7 + 1, 32);
            Pix2D.method156(9179409, 210, var7 + 2, 30, var4 / 2 - 150, arg1 * 3);
            Pix2D.method156(0, 210, var7 + 2, 30, arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3);
            this.field1678.method200(var4 / 2, arg2, -31546, 16777215, var5 / 2 + 5 - var6);
            this.field1686.method257(-781, 202, 171, super.field13);
            if (this.field1329) {
                this.field1329 = false;
                if (!this.field1595) {
                    this.field1687.method257(-781, 0, 0, super.field13);
                    this.field1688.method257(-781, 637, 0, super.field13);
                }
                this.field1684.method257(-781, 128, 0, super.field13);
                this.field1685.method257(-781, 202, 371, super.field13);
                this.field1689.method257(-781, 0, 265, super.field13);
                this.field1690.method257(-781, 562, 265, super.field13);
                this.field1691.method257(-781, 128, 171, super.field13);
                this.field1692.method257(-781, 562, 171, super.field13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method454(int arg0) {
        ++this.field1610;
        this.method521(true, true);
        this.method461(false, true);
        this.method521(true, false);
        this.method461(false, false);
        this.method480(this.field1519);
        this.method525(-249);
        if (!this.field1250) {
            int var2 = this.field1350;
            if (this.field1660 / 256 > var2) {
                var2 = this.field1660 / 256;
            }
            if (this.field1630[4] && this.field1627[4] + 128 > var2) {
                var2 = this.field1627[4] + 128;
            }
            int var3 = this.field1527 + this.field1351 & 2047;
            this.method549(var2 * 3 + 600, (byte) 6, var3, this.method462(false, field1468.field397, field1468.field396, this.field1576) - 50, this.field1503, this.field1502, var2);
        }
        int var4;
        if (!this.field1250) {
            var4 = this.method537((byte) 2);
        } else {
            var4 = this.method538((byte) 7);
        }
        int var5 = this.field1296;
        int var6 = this.field1297;
        int var7 = this.field1298;
        int var8 = this.field1299;
        int var9 = this.field1300;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1630[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1397[var10] * 2 + 1) - (double) this.field1397[var10] + Math.sin((double) this.field1364[var10] / 100.0D * (double) this.field1422[var10]) * (double) this.field1627[var10]);
                if (var10 == 0) {
                    this.field1296 += var12;
                }
                if (var10 == 1) {
                    this.field1297 += var12;
                }
                if (var10 == 2) {
                    this.field1298 += var12;
                }
                if (var10 == 3) {
                    this.field1300 = this.field1300 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1299 += var12;
                    if (this.field1299 < 128) {
                        this.field1299 = 128;
                    }
                    if (this.field1299 > 383) {
                        this.field1299 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field655;
        Model.field594 = true;
        Model.field597 = 0;
        if (arg0 == 0) {
            Model.field595 = super.field21 - 4;
            Model.field596 = super.field22 - 4;
            Pix2D.method154((byte) 127);
            this.field1613.method89(this.field1296, 7, this.field1299, this.field1298, var4, this.field1297, this.field1300);
            this.field1613.method64(true);
            this.method472(1);
            this.method547(this.field1440);
            this.method473(var11, (byte) -12);
            this.method427(-8033);
            this.field1618.method257(-781, 4, 4, super.field13);
            this.field1296 = var5;
            this.field1297 = var6;
            this.field1298 = var7;
            this.field1299 = var8;
            this.field1300 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method455(long arg0, int arg1) {
        if (arg1 != 37517) {
            this.field1567 = null;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1525; ++var4) {
                if (this.field1400[var4] == arg0) {
                    --this.field1525;
                    this.field1319 = true;
                    for (int var5 = var4; var5 < this.field1525; ++var5) {
                        this.field1465[var5] = this.field1465[var5 + 1];
                        this.field1315[var5] = this.field1315[var5 + 1];
                        this.field1400[var5] = this.field1400[var5 + 1];
                    }
                    this.field1271.method216(-34003, 203);
                    this.field1271.method223(arg0, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method456(int arg0) {
        while (arg0 >= 0) {
            this.field1271.method217(139);
        }
        if (this.field1438 != 0) {
            int var2 = 0;
            if (this.field1419 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1425[var3] != null) {
                    int var4 = this.field1423[var3];
                    String var5 = this.field1424[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1316 == 0 || this.field1316 == 1 && this.method491(var5, 3))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field21 > 4 && super.field22 - 4 > var9 - 10 && super.field22 - 4 <= var9 + 3) {
                            int var10 = this.field1677.method202("From:  " + var5 + this.field1425[var3], true) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field21 < var10 + 4) {
                                if (this.field1609 >= 1) {
                                    this.field1318[this.field1392] = "Report abuse @whi@" + var5;
                                    this.field1260[this.field1392] = 2524;
                                    ++this.field1392;
                                }
                                this.field1318[this.field1392] = "Add ignore @whi@" + var5;
                                this.field1260[this.field1392] = 2047;
                                ++this.field1392;
                                this.field1318[this.field1392] = "Add friend @whi@" + var5;
                                this.field1260[this.field1392] = 2605;
                                ++this.field1392;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1316 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLlb;ILab;)V")
    private final void method457(int arg0, byte arg1, Packet arg2, int arg3, PlayerEntity arg4) {
        if (arg1 != -106) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg0 & 1) == 1) {
            int var7 = arg2.method227();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, 15787);
            arg2.method236((byte) 95, var8, 0, var7);
            this.field1651[arg3] = var9;
            arg4.method116(false, var9);
        }
        if ((arg0 & 2) == 2) {
            int var10 = arg2.method229();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg4.field424 == var10) {
                arg4.field428 = 0;
            }
            int var11 = arg2.method227();
            if (arg4.field424 == var10 && var10 != -1) {
                int var12 = SeqType.field1150[var10].field1164;
                if (var12 == 1) {
                    arg4.field425 = 0;
                    arg4.field426 = 0;
                    arg4.field427 = var11;
                    arg4.field428 = 0;
                }
                if (var12 == 2) {
                    arg4.field428 = 0;
                }
            } else if (var10 == -1 || arg4.field424 == -1 || SeqType.field1150[var10].field1158 >= SeqType.field1150[arg4.field424].field1158) {
                arg4.field424 = var10;
                arg4.field425 = 0;
                arg4.field426 = 0;
                arg4.field427 = var11;
                arg4.field428 = 0;
                arg4.field450 = arg4.field445;
            }
        }
        if ((arg0 & 4) == 4) {
            arg4.field418 = arg2.method229();
            if (arg4.field418 == 65535) {
                arg4.field418 = -1;
            }
        }
        if ((arg0 & 8) == 8) {
            arg4.field408 = arg2.method234();
            if (arg4.field408.charAt(0) == '~') {
                arg4.field408 = arg4.field408.substring(1);
                this.method428(2, (byte) -115, arg4.field408, arg4.field457);
            } else if (field1468 == arg4) {
                this.method428(2, (byte) -115, arg4.field408, arg4.field457);
            }
            arg4.field410 = 0;
            arg4.field411 = 0;
            arg4.field409 = 150;
        }
        if ((arg0 & 16) == 16) {
            int var13 = arg2.method227();
            int var14 = arg2.method227();
            arg4.method114(var14, field1661, var13, false);
            arg4.field415 = field1661 + 300;
            arg4.field416 = arg2.method227();
            arg4.field417 = arg2.method227();
        }
        if ((arg0 & 32) == 32) {
            arg4.field419 = arg2.method229();
            arg4.field420 = arg2.method229();
        }
        if ((arg0 & 64) == 64) {
            int var15 = arg2.method229();
            int var16 = arg2.method227();
            int var17 = arg2.method227();
            int var18 = arg2.field710;
            if (arg4.field457 != null && arg4.field458) {
                long var19 = JString.method298(arg4.field457);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field1378; ++var22) {
                        if (this.field1675[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field1666 == 0) {
                    try {
                        String var23 = WordPack.method304((byte) -94, arg2, var17);
                        String var24 = WordFilter.method397(var23, this.field1663);
                        arg4.field408 = var24;
                        arg4.field410 = var15 >> 8;
                        arg4.field411 = var15 & 255;
                        arg4.field409 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method428(1, (byte) -115, var24, "@cr1@" + arg4.field457);
                            } else {
                                this.method428(2, (byte) -115, var24, arg4.field457);
                            }
                        } else {
                            this.method428(1, (byte) -115, var24, "@cr2@" + arg4.field457);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field710 = var17 + var18;
        }
        if ((arg0 & 256) == 256) {
            arg4.field429 = arg2.method229();
            int var26 = arg2.method232();
            arg4.field433 = var26 >> 16;
            arg4.field432 = (var26 & 65535) + field1661;
            arg4.field430 = 0;
            arg4.field431 = 0;
            if (arg4.field432 > field1661) {
                arg4.field430 = -1;
            }
            if (arg4.field429 == 65535) {
                arg4.field429 = -1;
            }
        }
        if ((arg0 & 512) == 512) {
            arg4.field434 = arg2.method227();
            arg4.field436 = arg2.method227();
            arg4.field435 = arg2.method227();
            arg4.field437 = arg2.method227();
            arg4.field438 = arg2.method229() + field1661;
            arg4.field439 = arg2.method229() + field1661;
            arg4.field440 = arg2.method227();
            arg4.method112(false);
        }
        if ((arg0 & 1024) == 1024) {
            int var27 = arg2.method227();
            int var28 = arg2.method227();
            arg4.method114(var28, field1661, var27, false);
            arg4.field415 = field1661 + 300;
            arg4.field416 = arg2.method227();
            arg4.field417 = arg2.method227();
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (arg0 <= 0) {
            this.field1591 = -1;
        }
        this.field1619.method256((byte) 5);
        Pix3D.field646 = this.field1335;
        this.field1566.method198(0, this.field1634, 0);
        if (this.field1643) {
            this.field1678.method200(239, this.field1523, -31546, 0, 40);
            this.field1678.method200(239, this.field1428 + "*", -31546, 128, 60);
        } else if (this.field1401) {
            this.field1678.method200(239, "Enter amount:", -31546, 0, 40);
            this.field1678.method200(239, this.field1513 + "*", -31546, 128, 60);
        } else if (this.field1244 != null) {
            this.field1678.method200(239, this.field1244, -31546, 0, 40);
            this.field1678.method200(239, "Click to continue", -31546, 128, 60);
        } else if (this.field1674 != -1) {
            this.method448(6, 0, 0, Component.field67[this.field1674], 0);
        } else if (this.field1386 != -1) {
            this.method448(6, 0, 0, Component.field67[this.field1386], 0);
        } else {
            PixFont var2 = this.field1677;
            int var3 = 0;
            Pix2D.method153(this.field1398, 77, 463, 0, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1425[var4] != null) {
                    int var6 = this.field1423[var4];
                    int var7 = 70 - var3 * 14 + this.field1524;
                    String var8 = this.field1424[var4];
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
                            var2.method204((byte) -104, 0, this.field1425[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1264 == 0 || this.field1264 == 1 && this.method491(var8, 3))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1257[0].method198(var7 - 12, this.field1634, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1257[1].method198(var7 - 12, this.field1634, var10);
                                var10 += 14;
                            }
                            var2.method204((byte) -104, 0, var8 + ":", var10, var7);
                            int var11 = var10 + var2.method202(var8, true) + 8;
                            var2.method204((byte) -104, 255, this.field1425[var4], var11, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1438 == 0 && (var6 == 7 || this.field1316 == 0 || this.field1316 == 1 && this.method491(var8, 3))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method204((byte) -104, 0, "From", var12, var7);
                            int var13 = var12 + var2.method202("From ", true);
                            if (var9 == 1) {
                                this.field1257[0].method198(var7 - 12, this.field1634, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1257[1].method198(var7 - 12, this.field1634, var13);
                                var13 += 14;
                            }
                            var2.method204((byte) -104, 0, var8 + ":", var13, var7);
                            int var14 = var13 + var2.method202(var8, true) + 8;
                            var2.method204((byte) -104, 8388608, this.field1425[var4], var14, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1589 == 0 || this.field1589 == 1 && this.method491(var8, 3))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method204((byte) -104, 8388736, var8 + " " + this.field1425[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1438 == 0 && this.field1316 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method204((byte) -104, 8388608, this.field1425[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1438 == 0 && this.field1316 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method204((byte) -104, 0, "To " + var8 + ":", 4, var7);
                            var2.method204((byte) -104, 8388608, this.field1425[var4], 12 + var2.method202("To " + var8, true), var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1589 == 0 || this.field1589 == 1 && this.method491(var8, 3))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method204((byte) -104, 8270336, var8 + " " + this.field1425[var4], 4, var7);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method152((byte) -92);
            this.field1295 = var3 * 14 + 7;
            if (this.field1295 < 78) {
                this.field1295 = 78;
            }
            this.method432(0, 463, this.field1295 - this.field1524 - 77, this.field1295, 77, 3);
            String var5;
            if (field1468 != null && field1468.field457 != null) {
                var5 = field1468.field457;
            } else {
                var5 = JString.method302(this.field1492, true);
            }
            var2.method204((byte) -104, 0, var5 + ":", 4, 90);
            var2.method204((byte) -104, 255, this.field1562 + "*", 6 + var2.method202(var5 + ": ", true), 90);
            Pix2D.method159(479, 0, 0, true, 77);
        }
        if (this.field1367 && this.field1451 == 2) {
            this.method526(393);
        }
        this.field1619.method257(-781, 17, 357, super.field13);
        this.field1618.method256((byte) 5);
        Pix3D.field646 = this.field1337;
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method459(int arg0) {
        this.field1312 = new Pix8(this.field1538, "titlebox", 0);
        this.field1313 = new Pix8(this.field1538, "titlebutton", 0);
        this.field1285 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1285[var3] = new Pix8(this.field1538, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1285[var4] = new Pix8(this.field1538, "runes", (var4 & 3) + 12);
            }
        }
        this.field1698 = new Pix32(128, 265);
        if (arg0 < 0) {
            this.field1699 = new Pix32(128, 265);
            for (int var5 = 0; var5 < 33920; ++var5) {
                this.field1698.field665[var5] = this.field1687.field748[var5];
            }
            for (int var6 = 0; var6 < 33920; ++var6) {
                this.field1699.field665[var6] = this.field1688.field748[var6];
            }
            this.field1640 = new int[256];
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field1640[var7] = var7 * 262144;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field1640[var8 + 64] = var8 * 1024 + 16711680;
            }
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field1640[var9 + 128] = var9 * 4 + 16776960;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field1640[var10 + 192] = 16777215;
            }
            this.field1641 = new int[256];
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field1641[var11] = var11 * 1024;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field1641[var12 + 64] = var12 * 4 + 65280;
            }
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field1641[var13 + 128] = var13 * 262144 + 65535;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field1641[var14 + 192] = 16777215;
            }
            this.field1642 = new int[256];
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field1642[var15] = var15 * 4;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field1642[var16 + 64] = var16 * 262144 + 255;
            }
            for (int var17 = 0; var17 < 64; ++var17) {
                this.field1642[var17 + 128] = var17 * 1024 + 16711935;
            }
            for (int var18 = 0; var18 < 64; ++var18) {
                this.field1642[var18 + 192] = 16777215;
            }
            this.field1639 = new int[256];
            this.field1554 = new int[32768];
            this.field1555 = new int[32768];
            this.method520((Pix8) null, 34809);
            this.field1693 = new int[32768];
            this.field1694 = new int[32768];
            this.method13(false, 10, "Connecting to fileserver");
            if (!this.field1595) {
                this.field1307 = true;
                this.field1595 = true;
                this.method12(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (this.field1522 != arg0) {
            this.field1599 = !this.field1599;
        }
        try {
            int var2 = field1468.field396 + this.field1432;
            int var3 = field1468.field397 + this.field1636;
            if (this.field1502 - var2 < -500 || this.field1502 - var2 > 500 || this.field1503 - var3 < -500 || this.field1503 - var3 > 500) {
                this.field1502 = var2;
                this.field1503 = var3;
            }
            if (this.field1502 != var2) {
                this.field1502 += (var2 - this.field1502) / 16;
            }
            if (this.field1503 != var3) {
                this.field1503 += (var3 - this.field1503) / 16;
            }
            if (super.field31[1] == 1) {
                this.field1352 += (-24 - this.field1352) / 2;
            } else if (super.field31[2] == 1) {
                this.field1352 += (24 - this.field1352) / 2;
            } else {
                this.field1352 /= 2;
            }
            if (super.field31[3] == 1) {
                this.field1353 += (12 - this.field1353) / 2;
            } else if (super.field31[4] == 1) {
                this.field1353 += (-12 - this.field1353) / 2;
            } else {
                this.field1353 /= 2;
            }
            this.field1351 = this.field1352 / 2 + this.field1351 & 2047;
            this.field1350 += this.field1353 / 2;
            if (this.field1350 < 128) {
                this.field1350 = 128;
            }
            if (this.field1350 > 383) {
                this.field1350 = 383;
            }
            int var4 = this.field1502 >> 7;
            int var5 = this.field1503 >> 7;
            int var6 = this.method462(false, this.field1503, this.field1502, this.field1576);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1576;
                        if (var10 < 3 && (this.field1292[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1286[var10][var8][var9];
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
            if (var12 > this.field1660) {
                this.field1660 += (var12 - this.field1660) / 24;
            } else if (var12 < this.field1660) {
                this.field1660 += (var12 - this.field1660) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1468.field396 + "," + field1468.field397 + "," + this.field1502 + "," + this.field1503 + "," + this.field1262 + "," + this.field1263 + "," + this.field1605 + "," + this.field1606);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method461(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1430; ++var3) {
            NpcEntity var4 = this.field1429[this.field1431[var3]];
            int var5 = (this.field1431[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(true) && var4.field454.field1031 == arg1) {
                int var6 = var4.field396 >> 7;
                int var7 = var4.field397 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field400 == 1 && (var4.field396 & 127) == 64 && (var4.field397 & 127) == 64) {
                        if (this.field1306[var6][var7] == this.field1610) {
                            continue;
                        }
                        this.field1306[var6][var7] = this.field1610;
                    }
                    this.field1613.method61((var4.field400 - 1) * 64 + 60, var5, this.method462(false, var4.field397, var4.field396, this.field1576), var4.field396, 384, var4, var4.field398, var4.field399, var4.field397, this.field1576);
                }
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method462(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1292[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field1286[var7][var5][var6] + this.field1286[var7][var5 + 1][var6] * var8 >> 7;
            if (arg0) {
                return 3;
            } else {
                int var11 = (128 - var8) * this.field1286[var7][var5][var6 + 1] + this.field1286[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method463(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1392 >= 2 || this.field1373 != 0 || this.field1415 != 0) {
            String var3;
            if (this.field1373 == 1 && this.field1392 < 2) {
                var3 = "Use " + this.field1377 + " with...";
            } else if (this.field1415 == 1 && this.field1392 < 2) {
                var3 = this.field1418 + "...";
            } else {
                var3 = this.field1318[this.field1392 - 1];
            }
            if (this.field1392 > 2) {
                var3 = var3 + "@whi@ / " + (this.field1392 - 2) + " more options";
            }
            this.field1678.method209(var3, true, 16777215, 26617, 4, field1661 / 1000, 15);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method464(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        Graphics var3 = this.method11(7).getGraphics();
        var3.setColor(Color.black);
        var3.fillRect(0, 0, 765, 503);
        this.method4(1, 711);
        if (this.field1476) {
            this.field1595 = false;
            var3.setFont(new Font("Helvetica", 1, 16));
            var3.setColor(Color.yellow);
            byte var4 = 35;
            var3.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
            int var6 = var4 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var6);
            int var7 = var6 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
            int var8 = var7 + 30;
            var3.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
            int var9 = var8 + 30;
            var3.drawString("3: Try using a different game-world", 30, var9);
            int var11 = var9 + 30;
            var3.drawString("4: Try rebooting your computer", 30, var11);
            int var13 = var11 + 30;
            var3.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
        }
        if (this.field1241) {
            this.field1595 = false;
            var3.setFont(new Font("Helvetica", 1, 20));
            var3.setColor(Color.white);
            var3.drawString("Error - unable to load game!", 50, 50);
            var3.drawString("To play RuneScape make sure you play from", 50, 100);
            var3.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1657) {
            this.field1595 = false;
            var3.setColor(Color.yellow);
            byte var5 = 35;
            var3.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
            int var10 = var5 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var10);
            int var12 = var10 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
            int var14 = var12 + 30;
            var3.drawString("2: Try rebooting your computer, and reloading", 30, var14);
            int var15 = var14 + 30;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method465(byte arg0) {
        if (this.field1516 == 0) {
            this.field1318[0] = "Cancel";
            this.field1260[0] = 1106;
            if (arg0 == 6) {
                boolean var2 = false;
                this.field1392 = 1;
                this.method456(-113);
                this.field1246 = 0;
                if (super.field21 > 4 && super.field22 > 4 && super.field21 < 516 && super.field22 < 338) {
                    if (this.field1620 != -1) {
                        this.method441(4, 0, super.field21, Component.field67[this.field1620], 4, super.field22, 792);
                    } else {
                        this.method546(true);
                    }
                }
                if (this.field1420 != this.field1246) {
                    this.field1420 = this.field1246;
                }
                this.field1246 = 0;
                if (super.field21 > 553 && super.field22 > 205 && super.field21 < 743 && super.field22 < 466) {
                    if (this.field1310 != -1) {
                        this.method441(553, 0, super.field21, Component.field67[this.field1310], 205, super.field22, 792);
                    } else if (this.field1481[this.field1448] != -1) {
                        this.method441(553, 0, super.field21, Component.field67[this.field1481[this.field1448]], 205, super.field22, 792);
                    }
                }
                if (this.field1354 != this.field1246) {
                    this.field1319 = true;
                    this.field1354 = this.field1246;
                }
                this.field1246 = 0;
                if (super.field21 > 17 && super.field22 > 357 && super.field21 < 496 && super.field22 < 453) {
                    if (this.field1674 != -1) {
                        this.method441(17, 0, super.field21, Component.field67[this.field1674], 357, super.field22, 792);
                    } else if (super.field22 < 434 && super.field21 < 426) {
                        this.method522(super.field21 - 17, (byte) 7, super.field22 - 357);
                    }
                }
                if (this.field1674 != -1 && this.field1633 != this.field1246) {
                    this.field1470 = true;
                    this.field1633 = this.field1246;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field1392 - 1; ++var4) {
                        if (this.field1260[var4] < 1000 && this.field1260[var4 + 1] > 1000) {
                            String var5 = this.field1318[var4];
                            this.field1318[var4] = this.field1318[var4 + 1];
                            this.field1318[var4 + 1] = var5;
                            int var6 = this.field1260[var4];
                            this.field1260[var4] = this.field1260[var4 + 1];
                            this.field1260[var4 + 1] = var6;
                            int var7 = this.field1258[var4];
                            this.field1258[var4] = this.field1258[var4 + 1];
                            this.field1258[var4 + 1] = var7;
                            int var8 = this.field1259[var4];
                            this.field1259[var4] = this.field1259[var4 + 1];
                            this.field1259[var4 + 1] = var8;
                            int var9 = this.field1261[var4];
                            this.field1261[var4] = this.field1261[var4 + 1];
                            this.field1261[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method466(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1378 >= 100) {
                this.method428(0, (byte) -115, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = JString.method302(JString.method299(arg1, true), true);
                for (int var5 = 0; var5 < this.field1378; ++var5) {
                    if (this.field1675[var5] == arg1) {
                        this.method428(0, (byte) -115, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1525; ++var6) {
                    if (this.field1400[var6] == arg1) {
                        this.method428(0, (byte) -115, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field1675[this.field1378++] = arg1;
                if (arg0 != -37) {
                    this.field1271.method217(42);
                }
                this.field1319 = true;
                this.field1271.method216(-34003, 192);
                this.field1271.method223(arg1, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 289);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1653 = Integer.parseInt(arg0[0]);
                field1654 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method542(field1615);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method475(true);
                }
                if (arg0[3].equals("free")) {
                    field1655 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1655 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(503, 765, 0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method467(int arg0) {
        if (this.field1419 > 1) {
            --this.field1419;
        }
        if (this.field1594 > 0) {
            --this.field1594;
        }
        for (int var2 = 0; var2 < 5 && this.method442(true); ++var2) {
        }
        if (this.field1284) {
            Object var3 = this.field1287.field998;
            synchronized (this.field1287.field998) {
                if (!field1358) {
                    this.field1287.field999 = 0;
                } else if (super.field27 != 0 || this.field1287.field999 >= 40) {
                    this.field1271.method216(-34003, 229);
                    this.field1271.method217(0);
                    int var4 = this.field1271.field710;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1287.field999 && var4 - this.field1271.field710 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1287.field1001[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1287.field1000[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1287.field1001[var6] == -1 && this.field1287.field1000[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1308 == var8 && this.field1309 == var7) {
                            if (this.field1240 < 2047) {
                                ++this.field1240;
                            }
                        } else {
                            int var10 = var8 - this.field1308;
                            this.field1308 = var8;
                            int var11 = var7 - this.field1309;
                            this.field1309 = var7;
                            if (this.field1240 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1271.method218((this.field1240 << 12) + (var10 << 6) + var11);
                                this.field1240 = 0;
                            } else if (this.field1240 < 8) {
                                this.field1271.method220((this.field1240 << 19) + 8388608 + var9);
                                this.field1240 = 0;
                            } else {
                                this.field1271.method221((this.field1240 << 19) + -1073741824 + var9);
                                this.field1240 = 0;
                            }
                        }
                    }
                    this.field1271.method226(this.field1271.field710 - var4, this.field1573);
                    if (var5 >= this.field1287.field999) {
                        this.field1287.field999 = 0;
                    } else {
                        this.field1287.field999 -= var5;
                        for (int var12 = 0; var12 < this.field1287.field999; ++var12) {
                            this.field1287.field1000[var12] = this.field1287.field1000[var5 + var12];
                            this.field1287.field1001[var12] = this.field1287.field1001[var5 + var12];
                        }
                    }
                }
            }
            if (super.field27 != 0) {
                long var13 = (super.field30 - this.field1602) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1602 = super.field30;
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
                this.field1271.method216(-34003, 224);
                this.field1271.method221((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1504 > 0) {
                --this.field1504;
            }
            if (super.field31[1] == 1 || super.field31[2] == 1 || super.field31[3] == 1 || super.field31[4] == 1) {
                this.field1505 = true;
            }
            if (this.field1505 && this.field1504 <= 0) {
                this.field1504 = 20;
                this.field1505 = false;
                this.field1271.method216(-34003, 193);
                this.field1271.method218(this.field1350);
                this.field1271.method218(this.field1351);
            }
            if (super.field18 && !this.field1355) {
                this.field1355 = true;
                this.field1271.method216(-34003, 149);
                this.field1271.method217(1);
            }
            if (!super.field18 && this.field1355) {
                this.field1355 = false;
                this.field1271.method216(-34003, 149);
                this.field1271.method217(0);
            }
            this.method449((byte) 6);
            this.method434(845);
            this.method519(948);
            ++this.field1592;
            if (this.field1592 > 750) {
                this.method510((byte) 7);
            }
            this.method494((byte) 5);
            this.method527(905);
            this.method431(0);
            ++this.field1245;
            if (this.field1239 != 0) {
                this.field1238 += 20;
                if (this.field1238 >= 400) {
                    this.field1239 = 0;
                }
            }
            if (this.field1572 != 0) {
                ++this.field1569;
                if (this.field1569 >= 15) {
                    if (this.field1572 == 2) {
                        this.field1319 = true;
                    }
                    if (this.field1572 == 3) {
                        this.field1470 = true;
                    }
                    this.field1572 = 0;
                }
            }
            if (this.field1516 != 0) {
                ++this.field1399;
                if (super.field21 > this.field1517 + 5 || super.field21 < this.field1517 - 5 || super.field22 > this.field1518 + 5 || super.field22 < this.field1518 - 5) {
                    this.field1268 = true;
                }
                if (super.field20 == 0) {
                    if (this.field1516 == 2) {
                        this.field1319 = true;
                    }
                    if (this.field1516 == 3) {
                        this.field1470 = true;
                    }
                    this.field1516 = 0;
                    if (this.field1268 && this.field1399 >= 5) {
                        this.field1404 = -1;
                        this.method465((byte) 6);
                        if (this.field1514 == this.field1404 && this.field1515 != this.field1403) {
                            Component var20 = Component.field67[this.field1514];
                            byte var21 = 0;
                            if (this.field1256 == 1 && var20.field76 == 206) {
                                var21 = 1;
                            }
                            if (var20.field68[this.field1403] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field97) {
                                int var22 = this.field1515;
                                int var23 = this.field1403;
                                var20.field68[var23] = var20.field68[var22];
                                var20.field69[var23] = var20.field69[var22];
                                var20.field68[var22] = -1;
                                var20.field69[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1515;
                                int var25 = this.field1403;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(0, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(0, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(0, this.field1403, this.field1515);
                            }
                            this.field1271.method216(-34003, 253);
                            this.field1271.method218(this.field1514);
                            this.field1271.method218(this.field1515);
                            this.field1271.method218(this.field1403);
                            this.field1271.method217(var21);
                        }
                    } else if ((this.field1283 == 1 || this.method437(this.field1392 - 1, -40)) && this.field1392 > 2) {
                        this.method500(this.field1320);
                    } else if (this.field1392 > 0) {
                        this.method545(this.field1392 - 1, 725);
                    }
                    this.field1569 = 10;
                    super.field27 = 0;
                }
            }
            ++field1294;
            if (field1294 > 62) {
                field1294 = 0;
                this.field1271.method216(-34003, 232);
            }
            if (World3D.field315 != -1) {
                int var26 = World3D.field315;
                int var27 = World3D.field316;
                boolean var28 = this.method535(0, field1468.field446[0], 0, var27, 0, 0, true, 0, 124, 0, var26, field1468.field447[0]);
                World3D.field315 = -1;
                if (var28) {
                    this.field1236 = super.field28;
                    this.field1237 = super.field29;
                    this.field1239 = 1;
                    this.field1238 = 0;
                }
            }
            if (super.field27 == 1 && this.field1244 != null) {
                this.field1244 = null;
                this.field1470 = true;
                super.field27 = 0;
            }
            this.method425((byte) 1);
            this.method554(176);
            this.method517(-293);
            if (arg0 <= 0) {
                this.field1271.method217(98);
            }
            this.method556((byte) 9);
            if (super.field20 == 1 || super.field27 == 1) {
                ++this.field1487;
            }
            if (this.field1303 == 2) {
                this.method460((byte) 6);
            }
            if (this.field1303 == 2 && this.field1250) {
                this.method543(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1422[var29]++;
            }
            this.method544(this.field1495);
            ++super.field19;
            if (super.field19 > 4500) {
                this.field1594 = 250;
                super.field19 -= 500;
                this.field1271.method216(-34003, 145);
            }
            ++this.field1342;
            if (this.field1342 > 500) {
                this.field1342 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1432 += this.field1433;
                }
                if ((var30 & 2) == 2) {
                    this.field1636 += this.field1637;
                }
                if ((var30 & 4) == 4) {
                    this.field1527 += this.field1528;
                }
            }
            if (this.field1432 < -50) {
                this.field1433 = 2;
            }
            if (this.field1432 > 50) {
                this.field1433 = -2;
            }
            if (this.field1636 < -55) {
                this.field1637 = 2;
            }
            if (this.field1636 > 55) {
                this.field1637 = -2;
            }
            if (this.field1527 < -40) {
                this.field1528 = 1;
            }
            if (this.field1527 > 40) {
                this.field1528 = -1;
            }
            ++this.field1328;
            if (this.field1328 > 500) {
                this.field1328 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1380 += this.field1381;
                }
                if ((var31 & 2) == 2) {
                    this.field1496 += this.field1497;
                }
            }
            if (this.field1380 < -60) {
                this.field1381 = 2;
            }
            if (this.field1380 > 60) {
                this.field1381 = -2;
            }
            if (this.field1496 < -20) {
                this.field1497 = 1;
            }
            if (this.field1496 > 10) {
                this.field1497 = -1;
            }
            ++this.field1593;
            if (this.field1593 > 50) {
                this.field1271.method216(-34003, 181);
            }
            try {
                if (this.field1520 != null && this.field1271.field710 > 0) {
                    this.field1520.method42(0, this.field1271.field709, 2, this.field1271.field710);
                    this.field1271.field710 = 0;
                    this.field1593 = 0;
                }
            } catch (IOException var33) {
                this.method510((byte) 7);
            } catch (Exception var34) {
                this.method433((byte) 25);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLlb;)V")
    private final void method468(int arg0, byte arg1, Packet arg2) {
        this.field1361 = 0;
        this.field1649 = 0;
        this.method541(arg0, arg2, false);
        this.method514(-752, arg2, arg0);
        this.method501(arg0, arg2, 0);
        this.method482(arg2, false, arg0);
        for (int var4 = 0; var4 < this.field1361; ++var4) {
            int var6 = this.field1362[var4];
            if (field1661 != this.field1646[var6].field441) {
                this.field1646[var6] = null;
            }
        }
        if (arg1 != 7) {
            this.field1495 = 376;
        }
        if (arg2.field710 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field710 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1647; ++var5) {
                if (this.field1646[this.field1648[var5]] == null) {
                    signlink.reporterror(this.field1492 + " null entry in pl list - pos:" + var5 + " size:" + this.field1647);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILgc;III)V")
    public final void method469(int arg0, NpcType arg1, int arg2, int arg3, int arg4) {
        int var6 = 43 / arg3;
        if (this.field1392 < 400) {
            String var7 = arg1.field1011;
            if (arg1.field1028 != 0) {
                var7 = var7 + method548(arg1.field1028, field1468.field463, -41081) + " (level-" + arg1.field1028 + ")";
            }
            if (this.field1373 == 1) {
                this.field1318[this.field1392] = "Use " + this.field1377 + " with @yel@" + var7;
                this.field1260[this.field1392] = 829;
                this.field1261[this.field1392] = arg0;
                this.field1258[this.field1392] = arg2;
                this.field1259[this.field1392] = arg4;
                ++this.field1392;
            } else {
                if (this.field1415 == 1) {
                    if ((this.field1417 & 2) == 2) {
                        this.field1318[this.field1392] = this.field1418 + " @yel@" + var7;
                        this.field1260[this.field1392] = 240;
                        this.field1261[this.field1392] = arg0;
                        this.field1258[this.field1392] = arg2;
                        this.field1259[this.field1392] = arg4;
                        ++this.field1392;
                        return;
                    }
                } else {
                    if (arg1.field1023 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg1.field1023[var8] != null && !arg1.field1023[var8].equalsIgnoreCase("attack")) {
                                this.field1318[this.field1392] = arg1.field1023[var8] + " @yel@" + var7;
                                if (var8 == 0) {
                                    this.field1260[this.field1392] = 242;
                                }
                                if (var8 == 1) {
                                    this.field1260[this.field1392] = 209;
                                }
                                if (var8 == 2) {
                                    this.field1260[this.field1392] = 309;
                                }
                                if (var8 == 3) {
                                    this.field1260[this.field1392] = 852;
                                }
                                if (var8 == 4) {
                                    this.field1260[this.field1392] = 793;
                                }
                                this.field1261[this.field1392] = arg0;
                                this.field1258[this.field1392] = arg2;
                                this.field1259[this.field1392] = arg4;
                                ++this.field1392;
                            }
                        }
                    }
                    if (arg1.field1023 != null) {
                        for (int var9 = 4; var9 >= 0; --var9) {
                            if (arg1.field1023[var9] != null && arg1.field1023[var9].equalsIgnoreCase("attack")) {
                                short var10 = 0;
                                if (arg1.field1028 > field1468.field463) {
                                    var10 = 2000;
                                }
                                this.field1318[this.field1392] = arg1.field1023[var9] + " @yel@" + var7;
                                if (var9 == 0) {
                                    this.field1260[this.field1392] = var10 + 242;
                                }
                                if (var9 == 1) {
                                    this.field1260[this.field1392] = var10 + 209;
                                }
                                if (var9 == 2) {
                                    this.field1260[this.field1392] = var10 + 309;
                                }
                                if (var9 == 3) {
                                    this.field1260[this.field1392] = var10 + 852;
                                }
                                if (var9 == 4) {
                                    this.field1260[this.field1392] = var10 + 793;
                                }
                                this.field1261[this.field1392] = arg0;
                                this.field1258[this.field1392] = arg2;
                                this.field1259[this.field1392] = arg4;
                                ++this.field1392;
                            }
                        }
                    }
                    this.field1318[this.field1392] = "Examine @yel@" + var7;
                    this.field1260[this.field1392] = 1714;
                    this.field1261[this.field1392] = arg0;
                    this.field1258[this.field1392] = arg2;
                    this.field1259[this.field1392] = arg4;
                    ++this.field1392;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIZ)V")
    public final void method470(boolean arg0, int arg1, boolean arg2) {
        this.field1284 &= arg0;
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method471(int arg0) {
        if (this.field1619 == null) {
            this.method539(false);
            super.field14 = null;
            this.field1684 = null;
            this.field1685 = null;
            this.field1686 = null;
            this.field1687 = null;
            this.field1688 = null;
            this.field1689 = null;
            this.field1690 = null;
            this.field1691 = null;
            this.field1692 = null;
            this.field1619 = new PixMap(this.method11(7), 479, 96, 2);
            this.field1617 = new PixMap(this.method11(7), 172, 156, 2);
            Pix2D.method154((byte) 127);
            this.field1565.method198(0, this.field1634, 0);
            this.field1616 = new PixMap(this.method11(7), 190, 261, 2);
            this.field1618 = new PixMap(this.method11(7), 512, 334, 2);
            Pix2D.method154((byte) 127);
            this.field1279 = new PixMap(this.method11(7), 496, 50, 2);
            this.field1280 = new PixMap(this.method11(7), 269, 37, 2);
            this.field1281 = new PixMap(this.method11(7), 249, 45, 2);
            this.field1329 = true;
            if (arg0 <= 0) {
                this.field1383 = 175;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method472(int arg0) {
        this.field1578 = 0;
        if (arg0 >= 1 && arg0 <= 1) {
            for (int var2 = -1; var2 < this.field1647 + this.field1430; ++var2) {
                PathingEntity var19;
                if (var2 == -1) {
                    var19 = field1468;
                } else if (var2 < this.field1647) {
                    var19 = this.field1646[this.field1648[var2]];
                } else {
                    var19 = this.field1429[this.field1431[var2 - this.field1647]];
                }
                if (var19 != null && var19.method113(true)) {
                    if (var2 >= this.field1647) {
                        NpcType var23 = ((NpcEntity) var19).field454;
                        if (var23.field1034 >= 0 && var23.field1034 < this.field1604.length) {
                            this.method485(var19.field442 + 15, var19, 0);
                            if (this.field1485 > -1) {
                                this.field1604[var23.field1034].method185(this.field1486 - 30, this.field1634, this.field1485 - 12);
                            }
                        }
                        if (this.field1426 == 1 && this.field1431[var2 - this.field1647] == this.field1322 && field1661 % 20 < 10) {
                            this.method485(var19.field442 + 15, var19, 0);
                            if (this.field1485 > -1) {
                                this.field1604[2].method185(this.field1486 - 28, this.field1634, this.field1485 - 12);
                            }
                        }
                    } else {
                        int var20 = 30;
                        PlayerEntity var21 = (PlayerEntity) var19;
                        if (var21.field460 != 0) {
                            this.method485(var19.field442 + 15, var19, 0);
                            if (this.field1485 > -1) {
                                for (int var22 = 0; var22 < 8; ++var22) {
                                    if ((var21.field460 & 1 << var22) != 0) {
                                        this.field1604[var22].method185(this.field1486 - var20, this.field1634, this.field1485 - 12);
                                        var20 -= 25;
                                    }
                                }
                            }
                        }
                        if (var2 >= 0 && this.field1426 == 10 && this.field1648[var2] == this.field1330) {
                            this.method485(var19.field442 + 15, var19, 0);
                            if (this.field1485 > -1) {
                                this.field1604[7].method185(this.field1486 - var20, this.field1634, this.field1485 - 12);
                            }
                        }
                    }
                    if (var19.field408 != null && (var2 >= this.field1647 || this.field1264 == 0 || this.field1264 == 3 || this.field1264 == 1 && this.method491(((PlayerEntity) var19).field457, 3))) {
                        this.method485(var19.field442, var19, 0);
                        if (this.field1485 > -1 && this.field1578 < this.field1579) {
                            this.field1583[this.field1578] = this.field1678.method203(var19.field408, -725) / 2;
                            this.field1582[this.field1578] = this.field1678.field695;
                            this.field1580[this.field1578] = this.field1485;
                            this.field1581[this.field1578] = this.field1486;
                            this.field1584[this.field1578] = var19.field410;
                            this.field1585[this.field1578] = var19.field411;
                            this.field1586[this.field1578] = var19.field409;
                            this.field1587[this.field1578++] = var19.field408;
                            if (this.field1391 == 0 && var19.field411 >= 1 && var19.field411 <= 3) {
                                this.field1582[this.field1578] += 10;
                                this.field1581[this.field1578] += 5;
                            }
                            if (this.field1391 == 0 && var19.field411 == 4) {
                                this.field1583[this.field1578] = 60;
                            }
                            if (this.field1391 == 0 && var19.field411 == 5) {
                                this.field1582[this.field1578] += 5;
                            }
                        }
                    }
                    if (var19.field415 > field1661) {
                        this.method485(var19.field442 + 15, var19, 0);
                        if (this.field1485 > -1) {
                            int var24 = var19.field416 * 30 / var19.field417;
                            if (var24 > 30) {
                                var24 = 30;
                            }
                            Pix2D.method156(65280, 210, this.field1486 - 3, 5, this.field1485 - 15, var24);
                            Pix2D.method156(16711680, 210, this.field1486 - 3, 5, this.field1485 - 15 + var24, 30 - var24);
                        }
                    }
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (var19.field414[var25] > field1661) {
                            this.method485(var19.field442 / 2, var19, 0);
                            if (this.field1485 > -1) {
                                if (var25 == 1) {
                                    this.field1486 -= 20;
                                }
                                if (var25 == 2) {
                                    this.field1485 -= 15;
                                    this.field1486 -= 10;
                                }
                                if (var25 == 3) {
                                    this.field1485 += 15;
                                    this.field1486 -= 10;
                                }
                                this.field1529[var19.field413[var25]].method185(this.field1486 - 12, this.field1634, this.field1485 - 12);
                                this.field1676.method200(this.field1485, String.valueOf(var19.field412[var25]), -31546, 0, this.field1486 + 4);
                                this.field1676.method200(this.field1485 - 1, String.valueOf(var19.field412[var25]), -31546, 16777215, this.field1486 + 3);
                            }
                        }
                    }
                }
            }
            for (int var3 = 0; var3 < this.field1578; ++var3) {
                int var4 = this.field1580[var3];
                int var5 = this.field1581[var3];
                int var6 = this.field1583[var3];
                int var7 = this.field1582[var3];
                boolean var8 = true;
                while (var8) {
                    var8 = false;
                    for (int var18 = 0; var18 < var3; ++var18) {
                        if (var5 + 2 > this.field1581[var18] - this.field1582[var18] && var5 - var7 < this.field1581[var18] + 2 && var4 - var6 < this.field1583[var18] + this.field1580[var18] && var4 + var6 > this.field1580[var18] - this.field1583[var18] && this.field1581[var18] - this.field1582[var18] < var5) {
                            var5 = this.field1581[var18] - this.field1582[var18];
                            var8 = true;
                        }
                    }
                }
                this.field1485 = this.field1580[var3];
                this.field1486 = this.field1581[var3] = var5;
                String var9 = this.field1587[var3];
                if (this.field1391 == 0) {
                    int var10 = 16776960;
                    if (this.field1584[var3] < 6) {
                        var10 = this.field1624[this.field1584[var3]];
                    }
                    if (this.field1584[var3] == 6) {
                        var10 = this.field1610 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (this.field1584[var3] == 7) {
                        var10 = this.field1610 % 20 < 10 ? 255 : 65535;
                    }
                    if (this.field1584[var3] == 8) {
                        var10 = this.field1610 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (this.field1584[var3] == 9) {
                        int var11 = 150 - this.field1586[var3];
                        if (var11 < 50) {
                            var10 = var11 * 1280 + 16711680;
                        } else if (var11 < 100) {
                            var10 = 16776960 - (var11 - 50) * 327680;
                        } else if (var11 < 150) {
                            var10 = (var11 - 100) * 5 + 65280;
                        }
                    }
                    if (this.field1584[var3] == 10) {
                        int var12 = 150 - this.field1586[var3];
                        if (var12 < 50) {
                            var10 = var12 * 5 + 16711680;
                        } else if (var12 < 100) {
                            var10 = 16711935 - (var12 - 50) * 327680;
                        } else if (var12 < 150) {
                            var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                        }
                    }
                    if (this.field1584[var3] == 11) {
                        int var13 = 150 - this.field1586[var3];
                        if (var13 < 50) {
                            var10 = 16777215 - var13 * 327685;
                        } else if (var13 < 100) {
                            var10 = (var13 - 50) * 327685 + 65280;
                        } else if (var13 < 150) {
                            var10 = 16777215 - (var13 - 100) * 327680;
                        }
                    }
                    if (this.field1585[var3] == 0) {
                        this.field1678.method200(this.field1485, var9, -31546, 0, this.field1486 + 1);
                        this.field1678.method200(this.field1485, var9, -31546, var10, this.field1486);
                    }
                    if (this.field1585[var3] == 1) {
                        this.field1678.method205(this.field1485, this.field1610, (byte) 5, 0, this.field1486 + 1, var9);
                        this.field1678.method205(this.field1485, this.field1610, (byte) 5, var10, this.field1486, var9);
                    }
                    if (this.field1585[var3] == 2) {
                        this.field1678.method206(0, var9, (byte) 3, this.field1485, this.field1486 + 1, this.field1610);
                        this.field1678.method206(var10, var9, (byte) 3, this.field1485, this.field1486, this.field1610);
                    }
                    if (this.field1585[var3] == 3) {
                        this.field1678.method207(var9, this.field1485, this.field1610, this.field1486 + 1, 0, this.field1395, 150 - this.field1586[var3]);
                        this.field1678.method207(var9, this.field1485, this.field1610, this.field1486, var10, this.field1395, 150 - this.field1586[var3]);
                    }
                    if (this.field1585[var3] == 4) {
                        int var14 = this.field1678.method203(var9, -725);
                        int var15 = (150 - this.field1586[var3]) * (var14 + 100) / 150;
                        Pix2D.method153(this.field1398, 334, this.field1485 + 50, 0, this.field1485 - 50);
                        this.field1678.method204((byte) -104, 0, var9, this.field1485 + 50 - var15, this.field1486 + 1);
                        this.field1678.method204((byte) -104, var10, var9, this.field1485 + 50 - var15, this.field1486);
                        Pix2D.method152((byte) -92);
                    }
                    if (this.field1585[var3] == 5) {
                        int var16 = 150 - this.field1586[var3];
                        int var17 = 0;
                        if (var16 < 25) {
                            var17 = var16 - 25;
                        } else if (var16 > 125) {
                            var17 = var16 - 125;
                        }
                        Pix2D.method153(this.field1398, this.field1486 + 5, 512, this.field1486 - this.field1678.field695 - 1, 0);
                        this.field1678.method200(this.field1485, var9, -31546, 0, this.field1486 + 1 + var17);
                        this.field1678.method200(this.field1485, var9, -31546, var10, this.field1486 + var17);
                        Pix2D.method152((byte) -92);
                    }
                } else {
                    this.field1678.method200(this.field1485, var9, -31546, 0, this.field1486 + 1);
                    this.field1678.method200(this.field1485, var9, -31546, 16776960, this.field1486);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method473(int arg0, byte arg1) {
        if (arg1 != -12) {
            this.method6();
        }
        if (!field1656) {
            if (Pix3D.field654[17] >= arg0) {
                Pix8 var3 = Pix3D.field648[17];
                int var4 = var3.field678 * var3.field677 - 1;
                int var5 = this.field1245 * var3.field677 * 2;
                byte[] var6 = var3.field675;
                byte[] var7 = this.field1530;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field675 = var7;
                this.field1530 = var6;
                Pix3D.method170(9, 17);
            }
            if (Pix3D.field654[24] >= arg0) {
                Pix8 var9 = Pix3D.field648[24];
                int var10 = var9.field678 * var9.field677 - 1;
                int var11 = this.field1245 * var9.field677 * 2;
                byte[] var12 = var9.field675;
                byte[] var13 = this.field1530;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field675 = var13;
                this.field1530 = var12;
                Pix3D.method170(9, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method474(int arg0) {
        if (this.field1438 != 0) {
            PixFont var2 = this.field1677;
            int var3 = 0;
            while (arg0 >= 0) {
                this.field1591 = this.field1553.method227();
            }
            if (this.field1419 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1425[var4] != null) {
                    int var5 = this.field1423[var4];
                    String var6 = this.field1424[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1316 == 0 || this.field1316 == 1 && this.method491(var6, 3))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method204((byte) -104, 0, "From", var9, var8);
                        var2.method204((byte) -104, 65535, "From", var9, var8 - 1);
                        int var10 = var9 + var2.method202("From ", true);
                        if (var7 == 1) {
                            this.field1257[0].method198(var8 - 12, this.field1634, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1257[1].method198(var8 - 12, this.field1634, var10);
                            var10 += 14;
                        }
                        var2.method204((byte) -104, 0, var6 + ": " + this.field1425[var4], var10, var8);
                        var2.method204((byte) -104, 65535, var6 + ": " + this.field1425[var4], var10, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1316 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method204((byte) -104, 0, this.field1425[var4], 4, var11);
                        var2.method204((byte) -104, 65535, this.field1425[var4], 4, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1316 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method204((byte) -104, 0, "To " + var6 + ": " + this.field1425[var4], 4, var12);
                        var2.method204((byte) -104, 65535, "To " + var6 + ": " + this.field1425[var4], 4, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public static final void method475(boolean arg0) {
        World3D.field281 = false;
        Pix3D.field635 = false;
        field1656 = false;
        if (!arg0) {
            field1450 = -15;
        }
        World.field41 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Z")
    public final boolean method476(int arg0, int arg1, byte arg2) {
        if (arg2 != -103) {
            this.field1567 = null;
        }
        boolean var4 = false;
        Component var5 = Component.field67[arg1];
        for (int var6 = 0; var6 < var5.field89.length && var5.field89[var6] != -1; ++var6) {
            Component var7 = Component.field67[var5.field89[var6]];
            if (var7.field74 == 1) {
                var4 |= this.method476(arg0, var7.field72, (byte) -103);
            }
            if (var7.field74 == 6 && (var7.field120 != -1 || var7.field121 != -1)) {
                boolean var8 = this.method499(var7, 0);
                int var9;
                if (var8) {
                    var9 = var7.field121;
                } else {
                    var9 = var7.field120;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1150[var9];
                    var7.field71 += arg0;
                    while (var7.field71 > var10.method378(var7.field70, 24425)) {
                        var7.field71 -= var10.method378(var7.field70, 24425) + 1;
                        ++var7.field70;
                        if (var7.field70 >= var10.field1151) {
                            var7.field70 -= var10.field1155;
                            if (var7.field70 < 0 || var7.field70 >= var10.field1151) {
                                var7.field70 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method477(byte arg0, boolean arg1) {
        this.method498(831);
        this.field1686.method256((byte) 5);
        if (arg0 != -21) {
            this.field1664 = 4;
        }
        this.field1312.method198(0, this.field1634, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1435 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1676.method201(true, 7711145, (byte) -85, var3 / 2, this.field1235.field830, var5);
            int var6 = var4 / 2 - 20;
            this.field1678.method201(true, 16776960, (byte) -85, var3 / 2, "Welcome to RuneScape", var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1313.method198(var8 - 20, this.field1634, var7 - 73);
            this.field1678.method201(true, 16777215, (byte) -85, var7, "New User", var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field1313.method198(var8 - 20, this.field1634, var9 - 73);
            this.field1678.method201(true, 16777215, (byte) -85, var9, "Existing User", var8 + 5);
        }
        if (this.field1435 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1531.length() > 0) {
                this.field1678.method201(true, 16776960, (byte) -85, var3 / 2, this.field1531, var10 - 15);
                this.field1678.method201(true, 16776960, (byte) -85, var3 / 2, this.field1532, var10);
                var10 += 30;
            } else {
                this.field1678.method201(true, 16776960, (byte) -85, var3 / 2, this.field1532, var10 - 7);
                var10 += 30;
            }
            this.field1678.method208(16777215, 2, var10, true, var3 / 2 - 90, "Username: " + this.field1492 + (this.field1252 == 0 & field1661 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field1678.method208(16777215, 2, var10, true, var3 / 2 - 88, "Password: " + JString.method303(0, this.field1493) + (this.field1252 == 1 & field1661 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1313.method198(var12 - 20, this.field1634, var11 - 73);
                this.field1678.method201(true, 16777215, (byte) -85, var11, "Login", var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field1313.method198(var12 - 20, this.field1634, var13 - 73);
                this.field1678.method201(true, 16777215, (byte) -85, var13, "Cancel", var12 + 5);
            }
        }
        if (this.field1435 == 3) {
            this.field1678.method201(true, 16776960, (byte) -85, var3 / 2, "Create a free account", var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field1678.method201(true, 16777215, (byte) -85, var3 / 2, "To create a new account you need to", var14);
            int var18 = var14 + 15;
            this.field1678.method201(true, 16777215, (byte) -85, var3 / 2, "go back to the main RuneScape webpage", var18);
            int var19 = var18 + 15;
            this.field1678.method201(true, 16777215, (byte) -85, var3 / 2, "and choose the red 'create account'", var19);
            int var20 = var19 + 15;
            this.field1678.method201(true, 16777215, (byte) -85, var3 / 2, "button at the top right of that page.", var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1313.method198(var16 - 20, this.field1634, var15 - 73);
            this.field1678.method201(true, 16777215, (byte) -85, var15, "Cancel", var16 + 5);
        }
        this.field1686.method257(-781, 202, 171, super.field13);
        if (this.field1329) {
            this.field1329 = false;
            this.field1684.method257(-781, 128, 0, super.field13);
            this.field1685.method257(-781, 202, 371, super.field13);
            this.field1689.method257(-781, 0, 265, super.field13);
            this.field1690.method257(-781, 562, 265, super.field13);
            this.field1691.method257(-781, 128, 171, super.field13);
            this.field1692.method257(-781, 562, 171, super.field13);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    public final void method478(Packet arg0, int arg1, int arg2) {
        if (arg1 != -6563) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg2 != 90 && arg2 != 194) {
            if (arg2 == 106) {
                int var5 = arg0.method227();
                int var6 = (var5 >> 4 & 7) + this.field1458;
                int var7 = (var5 & 7) + this.field1459;
                int var8 = arg0.method227();
                int var9 = var8 >> 2;
                int var10 = var8 & 3;
                int var11 = this.field1563[var9];
                int var12 = arg0.method229();
                if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                    int var13 = this.field1286[this.field1576][var6][var7];
                    int var14 = this.field1286[this.field1576][var6 + 1][var7];
                    int var15 = this.field1286[this.field1576][var6 + 1][var7 + 1];
                    int var16 = this.field1286[this.field1576][var6][var7 + 1];
                    if (var11 == 0) {
                        Wall var17 = this.field1613.method72(this.field1576, false, var6, var7);
                        if (var17 != null) {
                            int var18 = var17.field271 >> 14 & 32767;
                            if (var9 == 2) {
                                var17.field269 = new LocEntity(var10 + 4, var18, 2, var16, var15, false, var13, var12, false, var14);
                                var17.field270 = new LocEntity(var10 + 1 & 3, var18, 2, var16, var15, false, var13, var12, false, var14);
                            } else {
                                var17.field269 = new LocEntity(var10, var18, var9, var16, var15, false, var13, var12, false, var14);
                            }
                        }
                    }
                    if (var11 == 1) {
                        Decor var19 = this.field1613.method73(var7, 0, this.field1576, var6);
                        if (var19 != null) {
                            var19.field161 = new LocEntity(0, var19.field162 >> 14 & 32767, 4, var16, var15, false, var13, var12, false, var14);
                        }
                    }
                    if (var11 == 2) {
                        Location var20 = this.field1613.method74(var6, 0, var7, this.field1576);
                        if (var9 == 11) {
                            var9 = 10;
                        }
                        if (var20 != null) {
                            var20.field254 = new LocEntity(var10, var20.field262 >> 14 & 32767, var9, var16, var15, false, var13, var12, false, var14);
                        }
                    }
                    if (var11 == 3) {
                        GroundDecor var21 = this.field1613.method75(this.field1576, 0, var7, var6);
                        if (var21 != null) {
                            var21.field193 = new LocEntity(var10, var21.field194 >> 14 & 32767, 22, var16, var15, false, var13, var12, false, var14);
                        }
                    }
                }
            } else if (arg2 == 60) {
                int var22 = arg0.method227();
                int var23 = (var22 >> 4 & 7) + this.field1458;
                int var24 = (var22 & 7) + this.field1459;
                int var25 = arg0.method229();
                int var26 = arg0.method229();
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    ObjStackEntity var27 = new ObjStackEntity();
                    var27.field496 = var25;
                    var27.field497 = var26;
                    if (this.field1567[this.field1576][var23][var24] == null) {
                        this.field1567[this.field1576][var23][var24] = new LinkList(-199);
                    }
                    this.field1567[this.field1576][var23][var24].method243(var27);
                    this.method503(var23, var24);
                }
            } else if (arg2 == 71) {
                int var28 = arg0.method227();
                int var29 = (var28 >> 4 & 7) + this.field1458;
                int var30 = (var28 & 7) + this.field1459;
                int var31 = arg0.method229();
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    LinkList var32 = this.field1567[this.field1576][var29][var30];
                    if (var32 != null) {
                        for (ObjStackEntity var33 = (ObjStackEntity) var32.method246(); var33 != null; var33 = (ObjStackEntity) var32.method248(false)) {
                            if ((var31 & 32767) == var33.field496) {
                                var33.method106();
                                break;
                            }
                        }
                        if (var32.method246() == null) {
                            this.field1567[this.field1576][var29][var30] = null;
                        }
                        this.method503(var29, var30);
                    }
                }
            } else if (arg2 == 87) {
                int var34 = arg0.method227();
                int var35 = (var34 >> 4 & 7) + this.field1458;
                int var36 = (var34 & 7) + this.field1459;
                int var37 = var35 + arg0.method228();
                int var38 = var36 + arg0.method228();
                int var39 = arg0.method230();
                int var40 = arg0.method229();
                int var41 = arg0.method227() * 4;
                int var42 = arg0.method227() * 4;
                int var43 = arg0.method229();
                int var44 = arg0.method229();
                int var45 = arg0.method227();
                int var46 = arg0.method227();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    ProjectileEntity var51 = new ProjectileEntity(var46, this.method462(false, var48, var47, this.field1576) - var41, field1661 + var43, var40, var47, var39, this.field1576, var48, field1661 + var44, var45, false, var42);
                    var51.method119(this.method462(false, var50, var49, this.field1576) - var42, true, var50, field1661 + var43, var49);
                    this.field1339.method243(var51);
                }
            } else if (arg2 == 233) {
                int var52 = arg0.method227();
                int var53 = (var52 >> 4 & 7) + this.field1458;
                int var54 = (var52 & 7) + this.field1459;
                int var55 = arg0.method229();
                int var56 = arg0.method227();
                int var57 = arg0.method229();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    SpotAnimEntity var60 = new SpotAnimEntity(var58, this.field1576, this.method462(false, var59, var58, this.field1576) - var56, var57, true, var59, var55, field1661);
                    this.field1475.method243(var60);
                }
            } else if (arg2 == 176) {
                int var61 = arg0.method227();
                int var62 = (var61 >> 4 & 7) + this.field1458;
                int var63 = (var61 & 7) + this.field1459;
                int var64 = arg0.method229();
                int var65 = arg0.method229();
                int var66 = arg0.method229();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && this.field1536 != var66) {
                    ObjStackEntity var67 = new ObjStackEntity();
                    var67.field496 = var64;
                    var67.field497 = var65;
                    if (this.field1567[this.field1576][var62][var63] == null) {
                        this.field1567[this.field1576][var62][var63] = new LinkList(-199);
                    }
                    this.field1567[this.field1576][var62][var63].method243(var67);
                    this.method503(var62, var63);
                }
            } else {
                if (arg2 == 83) {
                    int var68 = arg0.method227();
                    int var69 = (var68 >> 4 & 7) + this.field1458;
                    int var70 = (var68 & 7) + this.field1459;
                    int var71 = arg0.method227();
                    int var72 = var71 >> 2;
                    int var73 = var71 & 3;
                    int var74 = this.field1563[var72];
                    int var75 = arg0.method229();
                    int var76 = arg0.method229();
                    int var77 = arg0.method229();
                    int var78 = arg0.method229();
                    byte var79 = arg0.method228();
                    byte var80 = arg0.method228();
                    byte var81 = arg0.method228();
                    byte var82 = arg0.method228();
                    PlayerEntity var83;
                    if (this.field1536 == var78) {
                        var83 = field1468;
                    } else {
                        var83 = this.field1646[var78];
                    }
                    if (var83 != null) {
                        LocType var84 = LocType.method328(var75);
                        int var85 = this.field1286[this.field1576][var69][var70];
                        int var86 = this.field1286[this.field1576][var69 + 1][var70];
                        int var87 = this.field1286[this.field1576][var69 + 1][var70 + 1];
                        int var88 = this.field1286[this.field1576][var69][var70 + 1];
                        Model var89 = var84.method334(var72, var73, var85, var86, var87, var88, -1);
                        if (var89 != null) {
                            this.method493(-23081, var76 + 1, this.field1576, -1, 0, var70, 0, var77 + 1, var74, var69);
                            var83.field467 = field1661 + var76;
                            var83.field468 = field1661 + var77;
                            var83.field472 = var89;
                            int var90 = var84.field965;
                            int var91 = var84.field966;
                            if (var73 == 1 || var73 == 3) {
                                var90 = var84.field966;
                                var91 = var84.field965;
                            }
                            var83.field469 = var69 * 128 + var90 * 64;
                            var83.field471 = var70 * 128 + var91 * 64;
                            var83.field470 = this.method462(false, var83.field471, var83.field469, this.field1576);
                            if (var79 > var81) {
                                byte var92 = var79;
                                var79 = var81;
                                var81 = var92;
                            }
                            if (var80 > var82) {
                                byte var93 = var80;
                                var80 = var82;
                                var82 = var93;
                            }
                            var83.field473 = var69 + var79;
                            var83.field475 = var69 + var81;
                            var83.field474 = var70 + var80;
                            var83.field476 = var70 + var82;
                        }
                    }
                }
                if (arg2 != 117) {
                    if (arg2 == 91) {
                        int var102 = arg0.method227();
                        int var103 = (var102 >> 4 & 7) + this.field1458;
                        int var104 = (var102 & 7) + this.field1459;
                        int var105 = arg0.method229();
                        int var106 = arg0.method227();
                        int var107 = var106 >> 4 & 15;
                        int var108 = var106 & 7;
                        if (field1468.field446[0] >= var103 - var107 && field1468.field446[0] <= var103 + var107 && field1468.field447[0] >= var104 - var107 && field1468.field447[0] <= var104 + var107 && this.field1471 && !field1656 && this.field1389 < 50) {
                            this.field1267[this.field1389] = var105;
                            this.field1427[this.field1389] = var108;
                            this.field1614[this.field1389] = Wave.field912[var105];
                            ++this.field1389;
                            return;
                        }
                    }
                } else {
                    int var94 = arg0.method227();
                    int var95 = (var94 >> 4 & 7) + this.field1458;
                    int var96 = (var94 & 7) + this.field1459;
                    int var97 = arg0.method229();
                    int var98 = arg0.method229();
                    int var99 = arg0.method229();
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        LinkList var100 = this.field1567[this.field1576][var95][var96];
                        if (var100 != null) {
                            for (ObjStackEntity var101 = (ObjStackEntity) var100.method246(); var101 != null; var101 = (ObjStackEntity) var100.method248(false)) {
                                if ((var97 & 32767) == var101.field496 && var101.field497 == var98) {
                                    var101.field497 = var99;
                                    break;
                                }
                            }
                            this.method503(var95, var96);
                        }
                    }
                }
            }
        } else {
            int var109 = arg0.method227();
            int var110 = (var109 >> 4 & 7) + this.field1458;
            int var111 = (var109 & 7) + this.field1459;
            int var112 = arg0.method227();
            int var113 = var112 >> 2;
            int var114 = var112 & 3;
            int var115 = this.field1563[var113];
            int var116;
            if (arg2 == 194) {
                var116 = -1;
            } else {
                var116 = arg0.method229();
            }
            if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                this.method493(-23081, 0, this.field1576, var116, var113, var111, var114, -1, var115, var110);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method479(int arg0) {
        byte[] var2 = this.field1538.method297("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1687.method256((byte) 5);
        var3.method183(0, 0, 8);
        this.field1688.method256((byte) 5);
        var3.method183(-637, 0, 8);
        this.field1684.method256((byte) 5);
        var3.method183(-128, 0, 8);
        this.field1685.method256((byte) 5);
        var3.method183(-202, -371, 8);
        this.field1686.method256((byte) 5);
        var3.method183(-202, -171, 8);
        this.field1689.method256((byte) 5);
        var3.method183(0, -265, 8);
        this.field1690.method256((byte) 5);
        var3.method183(-562, -265, 8);
        this.field1691.method256((byte) 5);
        var3.method183(-128, -171, 8);
        this.field1692.method256((byte) 5);
        var3.method183(-562, -171, 8);
        int[] var4 = new int[var3.field666];
        for (int var5 = 0; var5 < var3.field667; ++var5) {
            for (int var10 = 0; var10 < var3.field666; ++var10) {
                var4[var10] = var3.field665[var3.field666 * var5 + (var3.field666 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field666; ++var11) {
                var3.field665[var3.field666 * var5 + var11] = var4[var11];
            }
        }
        this.field1687.method256((byte) 5);
        var3.method183(382, 0, 8);
        this.field1688.method256((byte) 5);
        var3.method183(-255, 0, 8);
        this.field1684.method256((byte) 5);
        if (arg0 == 0) {
            var3.method183(254, 0, 8);
            this.field1685.method256((byte) 5);
            var3.method183(180, -371, 8);
            this.field1686.method256((byte) 5);
            var3.method183(180, -171, 8);
            this.field1689.method256((byte) 5);
            var3.method183(382, -265, 8);
            this.field1690.method256((byte) 5);
            var3.method183(-180, -265, 8);
            this.field1691.method256((byte) 5);
            var3.method183(254, -171, 8);
            this.field1692.method256((byte) 5);
            var3.method183(-180, -171, 8);
            Pix32 var6 = new Pix32(this.field1538, "logo", 0);
            this.field1684.method256((byte) 5);
            var6.method185(18, this.field1634, 382 - var6.field666 / 2 - 128);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method480(byte arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1339.method246(); var2 != null; var2 = (ProjectileEntity) this.field1339.method248(false)) {
            if (this.field1576 == var2.field501 && field1661 <= var2.field507) {
                if (field1661 >= var2.field506) {
                    if (var2.field510 > 0) {
                        NpcEntity var4 = this.field1429[var2.field510 - 1];
                        if (var4 != null && var4.field396 >= 0 && var4.field396 < 13312 && var4.field397 >= 0 && var4.field397 < 13312) {
                            var2.method119(this.method462(false, var4.field397, var4.field396, var2.field501) - var2.field505, true, var4.field397, field1661, var4.field396);
                        }
                    }
                    if (var2.field510 < 0) {
                        int var5 = -var2.field510 - 1;
                        PlayerEntity var6;
                        if (this.field1536 == var5) {
                            var6 = field1468;
                        } else {
                            var6 = this.field1646[var5];
                        }
                        if (var6 != null && var6.field396 >= 0 && var6.field396 < 13312 && var6.field397 >= 0 && var6.field397 < 13312) {
                            var2.method119(this.method462(false, var6.field397, var6.field396, var2.field501) - var2.field505, true, var6.field397, field1661, var6.field396);
                        }
                    }
                    var2.method120(this.field1245, -816);
                    this.field1613.method61(60, -1, (int) var2.field514, (int) var2.field512, 384, var2, var2.field520, false, (int) var2.field513, this.field1576);
                }
            } else {
                var2.method106();
            }
        }
        ++field1588;
        if (this.field1474 != arg0) {
            this.field1683 = !this.field1683;
        }
        if (field1588 > 1174) {
            field1588 = 0;
            this.field1271.method216(-34003, 130);
            this.field1271.method217(0);
            int var3 = this.field1271.field710;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1271.method218(11499);
            }
            this.field1271.method218(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1271.method217(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1271.method217(94);
            }
            this.field1271.method218(51693);
            this.field1271.method217(16);
            this.field1271.method218(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1271.method217(65);
            }
            this.field1271.method217((int) (Math.random() * 256.0D));
            this.field1271.method218(22990);
            this.field1271.method226(this.field1271.field710 - var3, this.field1573);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method481(byte arg0) {
        this.field1233 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1270[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1127; ++var3) {
                if (!IdkType.field1128[var3].field1134 && IdkType.field1128[var3].field1129 == var2 + (this.field1600 ? 0 : 7)) {
                    this.field1270[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != -127) {
            this.field1591 = this.field1553.method227();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ZI)V")
    private final void method482(Packet arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1568 = !this.field1568;
        }
        for (int var4 = 0; var4 < this.field1649; ++var4) {
            int var5 = this.field1650[var4];
            PlayerEntity var6 = this.field1646[var5];
            int var7 = arg0.method227();
            if ((var7 & 128) == 128) {
                var7 += arg0.method227() << 8;
            }
            this.method457(var7, (byte) -106, arg0, var5, var6);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method483(int arg0, boolean arg1) {
        if (arg1) {
            this.method6();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            this.field1271.method217(179);
        }
        if (arg5 >= 1 && arg7 >= 1 && arg5 <= 102 && arg7 <= 102) {
            if (field1656 && this.field1576 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field1613.method76(arg3, arg5, arg7);
            }
            if (arg6 == 1) {
                var9 = this.field1613.method77(arg7, 7, arg3, arg5);
            }
            if (arg6 == 2) {
                var9 = this.field1613.method78(arg3, arg5, arg7);
            }
            if (arg6 == 3) {
                var9 = this.field1613.method79(arg3, arg5, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field1613.method80(arg3, arg5, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field1613.method67(arg7, arg5, (byte) 7, arg3);
                    LocType var17 = LocType.method328(var14);
                    if (var17.field967) {
                        this.field1443[arg3].method360(var16, var15, arg7, arg5, var17.field968, (byte) 3);
                    }
                }
                if (arg6 == 1) {
                    this.field1613.method68(537, arg3, arg7, arg5);
                }
                if (arg6 == 2) {
                    this.field1613.method69(2, arg3, arg7, arg5);
                    LocType var18 = LocType.method328(var14);
                    if (var18.field965 + arg5 > 103 || var18.field965 + arg7 > 103 || var18.field966 + arg5 > 103 || var18.field966 + arg7 > 103) {
                        return;
                    }
                    if (var18.field967) {
                        this.field1443[arg3].method361(var18.field966, arg7, arg5, var18.field968, 8, var16, var18.field965);
                    }
                }
                if (arg6 == 3) {
                    this.field1613.method70(arg5, arg7, 3, arg3);
                    LocType var19 = LocType.method328(var14);
                    if (var19.field967 && var19.field969) {
                        this.field1443[arg3].method363(arg7, true, arg5);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field1292[1][arg5][arg7] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                World.method31(arg0, arg3, arg7, arg2, this.field1286, var20, arg5, this.field1443[arg3], this.field1613, arg4, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;I)V")
    public final void method485(int arg0, PathingEntity arg1, int arg2) {
        if (arg2 != 0) {
            this.field1385 = this.field1348.method293();
        }
        this.method486(arg1.field396, arg0, (byte) -79, arg1.field397);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)V")
    public final void method486(int arg0, int arg1, byte arg2, int arg3) {
        if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
            int var5 = this.method462(false, arg3, arg0, this.field1576) - arg1;
            int var6 = arg0 - this.field1296;
            if (arg2 != -79) {
                this.field1271.method217(22);
            }
            int var7 = var5 - this.field1297;
            int var8 = arg3 - this.field1298;
            int var9 = Model.field599[this.field1299];
            int var10 = Model.field600[this.field1299];
            int var11 = Model.field599[this.field1300];
            int var12 = Model.field600[this.field1300];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1485 = (var13 << 9) / var17 + Pix3D.field640;
                this.field1486 = (var16 << 9) / var17 + Pix3D.field641;
            } else {
                this.field1485 = -1;
                this.field1486 = -1;
            }
        } else {
            this.field1485 = -1;
            this.field1486 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method487(byte arg0) {
        LocType.field994.method103();
        LocType.field995.method103();
        if (arg0 != -71) {
            this.field1477 = this.field1348.method293();
        }
        NpcType.field1036.method103();
        ObjType.field1090.method103();
        ObjType.field1091.method103();
        PlayerEntity.field481.method103();
        SpotAnimType.field1185.method103();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method488(String arg0) throws IOException {
        if (!this.field1343) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1434 != null) {
                try {
                    this.field1434.close();
                } catch (Exception var4) {
                }
                this.field1434 = null;
            }
            this.field1434 = this.method445(43595);
            this.field1434.setSoTimeout(10000);
            InputStream var2 = this.field1434.getInputStream();
            OutputStream var3 = this.field1434.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZII)Z")
    public final boolean method489(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1613.method80(this.field1576, arg4, arg3, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1628;
            if (field1628 > 1086) {
                field1628 = 0;
                this.field1271.method216(-34003, 154);
                this.field1271.method217(0);
                int var10 = this.field1271.field710;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1271.method218(16791);
                }
                this.field1271.method217(254);
                this.field1271.method218((int) (Math.random() * 65536.0D));
                this.field1271.method218(16128);
                this.field1271.method218(52610);
                this.field1271.method218((int) (Math.random() * 65536.0D));
                this.field1271.method218(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1271.method218(35025);
                }
                this.field1271.method218(46628);
                this.field1271.method217((int) (Math.random() * 256.0D));
                this.field1271.method226(this.field1271.field710 - var10, this.field1573);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method535(0, field1468.field446[0], var9, arg3, 0, var8 + 1, false, 2, 124, 0, arg4, field1468.field447[0]);
            } else {
                LocType var11 = LocType.method328(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field966;
                    var13 = var11.field965;
                } else {
                    var12 = var11.field965;
                    var13 = var11.field966;
                }
                int var14 = var11.field988;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method535(var12, field1468.field446[0], 0, arg3, var14, 0, false, 2, 124, var13, arg4, field1468.field447[0]);
            }
            this.field1236 = super.field28;
            if (arg2) {
                field1667 = -113;
            }
            this.field1237 = super.field29;
            this.field1239 = 2;
            this.field1238 = 0;
            this.field1271.method216(-34003, arg1);
            this.field1271.method218(this.field1605 + arg4);
            this.field1271.method218(this.field1606 + arg3);
            this.field1271.method218(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)Z")
    public final boolean method490(byte arg0) {
        if (arg0 != 9) {
            this.field1385 = -393;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method491(String arg0, int arg1) {
        if (arg1 < 3 || arg1 > 3) {
            this.field1406 = !this.field1406;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1525; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1465[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field1468.field457);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IZIBII)V")
    public final void method492(int arg0, int arg1, Component arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (this.field1577) {
            this.field1253 = 32;
        } else {
            this.field1253 = 0;
        }
        this.field1577 = false;
        if (arg6 != -83) {
            this.field1271.method217(103);
        }
        if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 && arg7 < arg0 + 16) {
            arg2.field87 -= this.field1487 * 4;
            if (arg4) {
                this.field1319 = true;
                return;
            }
        } else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 + arg5 - 16 && arg7 < arg0 + arg5) {
            arg2.field87 += this.field1487 * 4;
            if (arg4) {
                this.field1319 = true;
                return;
            }
        } else {
            if (arg1 < arg3 - this.field1253 || arg1 >= arg3 + 16 + this.field1253 || arg7 < arg0 + 16 || arg7 >= arg0 + arg5 - 16 || this.field1487 <= 0) {
                return;
            }
            int var10 = (arg5 - 32) * arg5 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg0 - 16 - var10 / 2;
            int var12 = arg5 - 32 - var10;
            arg2.field87 = (arg8 - arg5) * var11 / var12;
            if (arg4) {
                this.field1319 = true;
            }
            this.field1577 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        this.field1329 = true;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        LocSpawned var12 = (LocSpawned) this.field1537.method246();
        if (arg0 == -23081) {
            while (var12 != null) {
                if (var12.field728 == arg2 && var12.field730 == arg9 && var12.field731 == arg5 && var12.field729 == arg8) {
                    var11 = var12;
                    break;
                }
                var12 = (LocSpawned) this.field1537.method248(false);
            }
            if (var11 == null) {
                var11 = new LocSpawned();
                var11.field728 = arg2;
                var11.field729 = arg8;
                var11.field730 = arg9;
                var11.field731 = arg5;
                this.method550(var11, false);
                this.field1537.method243(var11);
            }
            var11.field735 = arg3;
            var11.field737 = arg4;
            var11.field736 = arg6;
            var11.field738 = arg1;
            var11.field739 = arg7;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method494(byte arg0) {
        for (int var2 = -1; var2 < this.field1647; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1645;
            } else {
                var4 = this.field1648[var2];
            }
            PlayerEntity var5 = this.field1646[var4];
            if (var5 != null) {
                this.method528(-34028, var5, 1);
            }
        }
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method495(int arg0) {
        short var2 = 256;
        if (arg0 != 0) {
            this.field1271.method217(28);
        }
        if (this.field1680 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1680 > 768) {
                    this.field1639[var3] = this.method502(this.field1640[var3], this.field1641[var3], 1024 - this.field1680, 35);
                } else if (this.field1680 > 256) {
                    this.field1639[var3] = this.field1641[var3];
                } else {
                    this.field1639[var3] = this.method502(this.field1641[var3], this.field1640[var3], 256 - this.field1680, 35);
                }
            }
        } else if (this.field1681 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1681 > 768) {
                    this.field1639[var4] = this.method502(this.field1640[var4], this.field1642[var4], 1024 - this.field1681, 35);
                } else if (this.field1681 > 256) {
                    this.field1639[var4] = this.field1642[var4];
                } else {
                    this.field1639[var4] = this.method502(this.field1642[var4], this.field1640[var4], 256 - this.field1681, 35);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1639[var5] = this.field1640[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1687.field748[var6] = this.field1698.field665[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1439[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1693[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1639[var26];
                    int var30 = this.field1687.field748[var8];
                    this.field1687.field748[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1687.method257(-781, 0, 0, super.field13);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1688.field748[var10] = this.field1699.field665[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1439[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1693[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1639[var18];
                    int var22 = this.field1688.field748[var16];
                    this.field1688.field748[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1688.method257(-781, 637, 0, super.field13);
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://127.0.0.1:" + (field1654 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method496(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1591 = this.field1553.method227();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBII)V")
    public final void method497(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = this.field1613.method76(arg4, arg0, arg1);
        if (var7 != 0) {
            int var8 = this.field1613.method80(arg4, arg0, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field1334.field665;
            int var13 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method328(var14);
            if (var15.field979 != -1) {
                Pix8 var16 = this.field1662[var15.field979];
                if (var16 != null) {
                    int var17 = (var15.field965 * 4 - var16.field677) / 2;
                    int var18 = (var15.field966 * 4 - var16.field678) / 2;
                    var16.method198((104 - arg1 - var15.field966) * 4 + 48 + var18, this.field1634, arg0 * 4 + 48 + var17);
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
        int var19 = this.field1613.method78(arg4, arg0, arg1);
        if (var19 != 0) {
            int var20 = this.field1613.method80(arg4, arg0, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method328(var23);
            if (var24.field979 != -1) {
                Pix8 var25 = this.field1662[var24.field979];
                if (var25 != null) {
                    int var26 = (var24.field965 * 4 - var25.field677) / 2;
                    int var27 = (var24.field966 * 4 - var25.field678) / 2;
                    var25.method198((104 - arg1 - var24.field966) * 4 + 48 + var27, this.field1634, arg0 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1334.field665;
                int var30 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field1613.method79(arg4, arg0, arg1);
        if (arg3 == 5) {
            boolean var32 = false;
        } else {
            this.field1683 = !this.field1683;
        }
        if (var31 != 0) {
            int var33 = var31 >> 14 & 32767;
            LocType var34 = LocType.method328(var33);
            if (var34.field979 != -1) {
                Pix8 var35 = this.field1662[var34.field979];
                if (var35 != null) {
                    int var36 = (var34.field965 * 4 - var35.field677) / 2;
                    int var37 = (var34.field966 * 4 - var35.field678) / 2;
                    var35.method198((104 - arg1 - var34.field966) * 4 + 48 + var37, this.field1634, arg0 * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method498(int arg0) {
        if (this.field1684 == null) {
            super.field14 = null;
            this.field1619 = null;
            this.field1617 = null;
            this.field1616 = null;
            this.field1618 = null;
            this.field1279 = null;
            this.field1280 = null;
            this.field1281 = null;
            this.field1687 = new PixMap(this.method11(7), 128, 265, 2);
            int var2 = 40 / arg0;
            Pix2D.method154((byte) 127);
            this.field1688 = new PixMap(this.method11(7), 128, 265, 2);
            Pix2D.method154((byte) 127);
            this.field1684 = new PixMap(this.method11(7), 509, 171, 2);
            Pix2D.method154((byte) 127);
            this.field1685 = new PixMap(this.method11(7), 360, 132, 2);
            Pix2D.method154((byte) 127);
            this.field1686 = new PixMap(this.method11(7), 360, 200, 2);
            Pix2D.method154((byte) 127);
            this.field1689 = new PixMap(this.method11(7), 202, 238, 2);
            Pix2D.method154((byte) 127);
            this.field1690 = new PixMap(this.method11(7), 203, 238, 2);
            Pix2D.method154((byte) 127);
            this.field1691 = new PixMap(this.method11(7), 74, 94, 2);
            Pix2D.method154((byte) 127);
            this.field1692 = new PixMap(this.method11(7), 75, 94, 2);
            Pix2D.method154((byte) 127);
            if (this.field1538 != null) {
                this.method479(0);
                this.method459(-532);
            }
            this.field1329 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method499(Component arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (arg0.field83 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field83.length; ++var3) {
                int var4 = this.method505(var3, this.field1507, arg0);
                int var5 = arg0.field84[var3];
                if (arg0.field83[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field83[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field83[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method500(int arg0) {
        int var2 = this.field1678.method202("Choose Option", true);
        for (int var3 = 0; var3 < this.field1392; ++var3) {
            int var11 = this.field1678.method202(this.field1318[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 != 0) {
            this.field1457 = !this.field1457;
        }
        int var4 = this.field1392 * 15 + 21;
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
            this.field1367 = true;
            this.field1451 = 0;
            this.field1452 = var5;
            this.field1453 = var6;
            this.field1454 = var2;
            this.field1455 = this.field1392 * 15 + 22;
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
            this.field1367 = true;
            this.field1451 = 1;
            this.field1452 = var7;
            this.field1453 = var8;
            this.field1454 = var2;
            this.field1455 = this.field1392 * 15 + 22;
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
            this.field1367 = true;
            this.field1451 = 2;
            this.field1452 = var9;
            this.field1453 = var10;
            this.field1454 = var2;
            this.field1455 = this.field1392 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method501(int arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field711 + 10 < arg0 * 8) {
                int var4 = arg1.method238(11, false);
                if (var4 != 2047) {
                    if (this.field1646[var4] == null) {
                        this.field1646[var4] = new PlayerEntity();
                        if (this.field1651[var4] != null) {
                            this.field1646[var4].method116(false, this.field1651[var4]);
                        }
                    }
                    this.field1648[this.field1647++] = var4;
                    PlayerEntity var5 = this.field1646[var4];
                    var5.field441 = field1661;
                    int var6 = arg1.method238(5, false);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method238(5, false);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method238(1, false);
                    var5.method110(field1468.field446[0] + var6, var8 == 1, field1468.field447[0] + var7, this.field1346);
                    int var9 = arg1.method238(1, false);
                    if (var9 == 1) {
                        this.field1650[this.field1649++] = var4;
                    }
                    continue;
                }
            }
            arg1.method239((byte) 4);
            if (arg2 != 0) {
                field1379 = 328;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method502(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 95 / arg3;
        int var6 = 256 - arg2;
        return ((arg0 & 16711935) * var6 + (arg1 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var6 + (arg1 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method503(int arg0, int arg1) {
        LinkList var3 = this.field1567[this.field1576][arg0][arg1];
        if (var3 == null) {
            this.field1613.method71(this.field1576, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method246(); var6 != null; var6 = (ObjStackEntity) var3.method248(false)) {
                ObjType var11 = ObjType.method344(var6.field496);
                int var12 = var11.field1064;
                if (var11.field1063) {
                    var12 = (var6.field497 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method244(var5, -12925);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method246(); var9 != null; var9 = (ObjStackEntity) var3.method248(false)) {
                if (var5.field496 != var9.field496 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field496 != var9.field496 && var7.field496 != var9.field496 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1613.method57(arg1, var10, var7, arg0, (byte) 2, var8, this.field1576, this.method462(false, arg1 * 128 + 64, arg0 * 128 + 64, this.field1576), var5);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        if (arg0) {
            this.field1591 = this.field1553.method227();
        }
        while (true) {
            OnDemandRequest var2 = this.field1235.method279();
            if (var2 == null) {
                return;
            }
            if (var2.field723 == 0) {
                Model.method123(var2.field725, var2.field724, (byte) 23);
                if ((this.field1235.method275(var2.field724, -600) & 98) != 0) {
                    this.field1319 = true;
                    if (this.field1674 != -1) {
                        this.field1470 = true;
                    }
                }
            }
            if (var2.field723 == 1 && var2.field725 != null) {
                AnimFrame.method45(2, var2.field725);
            }
            if (var2.field723 == 2 && this.field1611 == var2.field724 && var2.field725 != null) {
                this.method444((byte) 27, var2.field725, this.field1612);
            }
            if (var2.field723 == 3 && this.field1303 == 1) {
                for (int var3 = 0; var3 < this.field1402.length; ++var3) {
                    if (this.field1461[var3] == var2.field724) {
                        this.field1402[var3] = var2.field725;
                        if (var2.field725 == null) {
                            this.field1461[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1462[var3] == var2.field724) {
                        this.field1394[var3] = var2.field725;
                        if (var2.field725 == null) {
                            this.field1462[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field723 == 93 && this.field1235.method274(var2.field724, this.field1278)) {
                World.method17(this.field1235, new Packet(var2.field725, 15787), this.field1668);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLd;)I")
    public final int method505(int arg0, byte arg1, Component arg2) {
        if (this.field1305 != arg1) {
            this.field1271.method217(14);
        }
        if (arg2.field82 != null && arg0 < arg2.field82.length) {
            try {
                int[] var4 = arg2.field82[arg0];
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
                        var9 = this.field1456[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1511[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1272[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field67[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1044 && (!ObjType.method344(var12).field1065 || field1655)) {
                            for (int var13 = 0; var13 < var11.field68.length; ++var13) {
                                if (var12 + 1 == var11.field68[var13]) {
                                    var9 += var11.field69[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1635[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1405[this.field1511[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1635[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1468.field463;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1167; ++var14) {
                            if (Stats.field1169[var14]) {
                                var9 += this.field1511[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field67[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1044 && (!ObjType.method344(var16).field1065 || field1655)) {
                            for (int var17 = 0; var17 < var15.field68.length; ++var17) {
                                if (var15.field68[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1357;
                    }
                    if (var8 == 12) {
                        var9 = this.field1626;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1635[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1188[var20];
                        int var22 = var21.field1190;
                        int var23 = var21.field1191;
                        int var24 = var21.field1192;
                        int var25 = field1509[var24 - var23];
                        var9 = this.field1635[var22] >> var23 & var25;
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
                        var9 = (field1468.field396 >> 7) + this.field1605;
                    }
                    if (var8 == 19) {
                        var9 = (field1468.field397 >> 7) + this.field1606;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method506(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1525 >= 100 && this.field1510 != 1) {
                this.method428(0, (byte) -115, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field1525 >= 200) {
                this.method428(0, (byte) -115, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = JString.method302(JString.method299(arg1, true), true);
                for (int var5 = 0; var5 < this.field1525; ++var5) {
                    if (this.field1400[var5] == arg1) {
                        this.method428(0, (byte) -115, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1378; ++var6) {
                    if (this.field1675[var6] == arg1) {
                        this.method428(0, (byte) -115, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field1468.field457)) {
                    this.field1465[this.field1525] = var4;
                    this.field1400[this.field1525] = arg1;
                    this.field1315[this.field1525] = 0;
                    if (arg0 != 0) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    ++this.field1525;
                    this.field1319 = true;
                    this.field1271.method216(-34003, 235);
                    this.field1271.method223(arg1, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method507(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1531 = "";
                this.field1532 = "Connecting to server...";
                this.method477((byte) -21, true);
            }
            this.field1520 = new ClientStream(this.method445(field1654 + 43594), 32596, this);
            long var4 = JString.method298(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1271.field710 = 0;
            this.field1271.method217(14);
            this.field1271.method217(var6);
            this.field1520.method42(0, this.field1271.field709, 2, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1520.method39();
            }
            int var8 = this.field1520.method39();
            if (var8 == 0) {
                this.field1520.method41(this.field1553.field709, 0, 8);
                this.field1553.field710 = 0;
                this.field1234 = this.field1553.method233(true);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1234 >> 32), (int) this.field1234 };
                this.field1271.field710 = 0;
                this.field1271.method217(10);
                this.field1271.method221(var9[0]);
                this.field1271.method221(var9[1]);
                this.field1271.method221(var9[2]);
                this.field1271.method221(var9[3]);
                this.field1271.method221(signlink.uid);
                this.field1271.method224(arg0);
                this.field1271.method224(arg1);
                this.field1271.method242(field1556, field1466, 0);
                this.field1243.field710 = 0;
                if (arg2) {
                    this.field1243.method217(18);
                } else {
                    this.field1243.method217(16);
                }
                this.field1243.method217(this.field1271.field710 + 36 + 1 + 1 + 2);
                this.field1243.method217(255);
                this.field1243.method218(289);
                this.field1243.method217(field1656 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1243.method221(this.field1472[var10]);
                }
                this.field1243.method225(this.field1271.field709, this.field1271.field710, 0, true);
                this.field1271.field714 = new Isaac(var9, (byte) -23);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1348 = new Isaac(var9, (byte) -23);
                this.field1520.method42(0, this.field1243.field709, 2, this.field1243.field710);
                var8 = this.field1520.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method507(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1609 = this.field1520.method39();
                field1358 = this.field1520.method39() == 1;
                this.field1602 = 0L;
                this.field1240 = 0;
                this.field1287.field999 = 0;
                super.field18 = true;
                this.field1355 = true;
                this.field1284 = true;
                this.field1271.field710 = 0;
                this.field1553.field710 = 0;
                this.field1591 = -1;
                this.field1488 = -1;
                this.field1489 = -1;
                this.field1490 = -1;
                this.field1590 = 0;
                this.field1592 = 0;
                this.field1419 = 0;
                this.field1594 = 0;
                this.field1426 = 0;
                this.field1392 = 0;
                this.field1367 = false;
                super.field19 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1425[var12] = null;
                }
                this.field1373 = 0;
                this.field1415 = 0;
                this.field1303 = 0;
                this.field1389 = 0;
                this.field1432 = (int) (Math.random() * 100.0D) - 50;
                this.field1636 = (int) (Math.random() * 110.0D) - 55;
                this.field1527 = (int) (Math.random() * 80.0D) - 40;
                this.field1380 = (int) (Math.random() * 120.0D) - 60;
                this.field1496 = (int) (Math.random() * 30.0D) - 20;
                this.field1351 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1269 = 0;
                this.field1484 = -1;
                this.field1332 = 0;
                this.field1333 = 0;
                this.field1647 = 0;
                this.field1430 = 0;
                for (int var13 = 0; var13 < this.field1644; ++var13) {
                    this.field1646[var13] = null;
                    this.field1651[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1429[var14] = null;
                }
                field1468 = this.field1646[this.field1645] = new PlayerEntity();
                this.field1339.method250();
                this.field1475.method250();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1567[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1537 = new LinkList(-199);
                this.field1526 = 0;
                this.field1525 = 0;
                this.field1386 = -1;
                this.field1674 = -1;
                this.field1620 = -1;
                this.field1310 = -1;
                this.field1345 = -1;
                this.field1356 = false;
                this.field1448 = 3;
                this.field1401 = false;
                this.field1367 = false;
                this.field1643 = false;
                this.field1244 = null;
                this.field1533 = 0;
                this.field1254 = -1;
                this.field1600 = true;
                this.method481(this.field1304);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1359[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1340[var19] = null;
                    this.field1341[var19] = false;
                }
                field1659 = 0;
                field1601 = 0;
                field1407 = 0;
                field1291 = 0;
                field1242 = 0;
                field1695 = 0;
                field1535 = 0;
                field1467 = 0;
                field1521 = 0;
                field1266 = 0;
                this.method471(817);
            } else if (var8 == 3) {
                this.field1531 = "";
                this.field1532 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1531 = "Your account has been disabled.";
                this.field1532 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1531 = "Your account is already logged in.";
                this.field1532 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1531 = "RuneScape has been updated!";
                this.field1532 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1531 = "This world is full.";
                this.field1532 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1531 = "Unable to connect.";
                this.field1532 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1531 = "Login limit exceeded.";
                this.field1532 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1531 = "Unable to connect.";
                this.field1532 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1532 = "Login server rejected session.";
                this.field1532 = "Please try again.";
            } else if (var8 == 12) {
                this.field1531 = "You need a members account to login to this world.";
                this.field1532 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1531 = "Could not complete login.";
                this.field1532 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1531 = "The server is being updated.";
                this.field1532 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1284 = true;
                this.field1271.field710 = 0;
                this.field1553.field710 = 0;
                this.field1591 = -1;
                this.field1488 = -1;
                this.field1489 = -1;
                this.field1490 = -1;
                this.field1590 = 0;
                this.field1592 = 0;
                this.field1419 = 0;
                this.field1392 = 0;
                this.field1367 = false;
                this.field1491 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1531 = "Login attempts exceeded.";
                this.field1532 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1531 = "You are standing in a members-only area.";
                this.field1532 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1531 = "Invalid loginserver requested";
                this.field1532 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1531 = "No response from server";
                    this.field1532 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1531 = "Unexpected server response";
                    this.field1532 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1520.method39(); var20 >= 0; --var20) {
                    this.field1531 = "You have only just left another world";
                    this.field1532 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method477((byte) -21, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method507(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1531 = "";
            this.field1532 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method508(byte arg0) {
        if (arg0 != 122) {
            this.field1591 = this.field1553.method227();
        }
        if (this.field1435 == 0) {
            int var2 = super.field11 / 2 - 80;
            int var3 = super.field12 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field27 == 1 && super.field28 >= var2 - 75 && super.field28 <= var2 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1435 = 3;
                this.field1252 = 0;
            }
            int var4 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var4 - 75 && super.field28 <= var4 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1531 = "";
                this.field1532 = "Enter your username & password.";
                this.field1435 = 2;
                this.field1252 = 0;
            }
        } else if (this.field1435 == 2) {
            int var5 = super.field12 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field27 == 1 && super.field29 >= var16 - 15 && super.field29 < var16) {
                this.field1252 = 0;
            }
            var5 = var16 + 15;
            if (super.field27 == 1 && super.field29 >= var5 - 15 && super.field29 < var5) {
                this.field1252 = 1;
            }
            var5 += 15;
            int var6 = super.field11 / 2 - 80;
            int var7 = super.field12 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field27 == 1 && super.field28 >= var6 - 75 && super.field28 <= var6 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.method507(this.field1492, this.field1493, false);
                if (this.field1284) {
                    return;
                }
            }
            int var8 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var8 - 75 && super.field28 <= var8 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.field1435 = 0;
                this.field1492 = "";
                this.field1493 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(-128);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1387.length(); ++var11) {
                        if (var9 == field1387.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1252 == 0) {
                        if (var9 == 8 && this.field1492.length() > 0) {
                            this.field1492 = this.field1492.substring(0, this.field1492.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1252 = 1;
                        }
                        if (var10) {
                            this.field1492 = this.field1492 + (char) var9;
                        }
                        if (this.field1492.length() > 12) {
                            this.field1492 = this.field1492.substring(0, 12);
                        }
                    } else if (this.field1252 == 1) {
                        if (var9 == 8 && this.field1493.length() > 0) {
                            this.field1493 = this.field1493.substring(0, this.field1493.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1252 = 0;
                        }
                        if (var10) {
                            this.field1493 = this.field1493 + (char) var9;
                        }
                        if (this.field1493.length() > 20) {
                            this.field1493 = this.field1493.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1435 == 3) {
                int var12 = super.field11 / 2;
                int var13 = super.field12 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field27 == 1 && super.field28 >= var12 - 75 && super.field28 <= var12 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1435 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    private static final String method509(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 5) {
            throw new NullPointerException();
        } else {
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method510(byte arg0) {
        if (this.field1594 > 0) {
            this.method433((byte) 25);
        } else {
            this.field1618.method256((byte) 5);
            this.field1677.method200(257, "Connection lost", -31546, 0, 144);
            this.field1677.method200(256, "Connection lost", -31546, 16777215, 143);
            this.field1677.method200(257, "Please wait - attempting to reestablish", -31546, 0, 159);
            this.field1677.method200(256, "Please wait - attempting to reestablish", -31546, 16777215, 158);
            this.field1618.method257(-781, 4, 4, super.field13);
            this.field1269 = 0;
            if (arg0 == 7) {
                this.field1332 = 0;
                ClientStream var2 = this.field1520;
                this.field1284 = false;
                this.method507(this.field1492, this.field1493, true);
                if (!this.field1284) {
                    this.method433((byte) 25);
                }
                try {
                    var2.method38();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method511(int arg0, int arg1) {
        if (arg1 != 656) {
            field1379 = -353;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    private final void method512(int arg0) {
        if (arg0 < 0) {
            for (LocSpawned var2 = (LocSpawned) this.field1537.method246(); var2 != null; var2 = (LocSpawned) this.field1537.method248(false)) {
                if (var2.field739 == -1) {
                    var2.field738 = 0;
                    this.method550(var2, false);
                } else {
                    var2.method106();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)Ljava/lang/String;")
    public final String method513(int arg0) {
        if (arg0 <= 0) {
            this.field1568 = !this.field1568;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method514(int arg0, Packet arg1, int arg2) {
        if (arg0 < 0) {
            int var4 = arg1.method238(8, false);
            if (var4 < this.field1647) {
                for (int var5 = var4; var5 < this.field1647; ++var5) {
                    this.field1362[this.field1361++] = this.field1648[var5];
                }
            }
            if (var4 > this.field1647) {
                signlink.reporterror(this.field1492 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field1647 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1648[var6];
                    PlayerEntity var8 = this.field1646[var7];
                    int var9 = arg1.method238(1, false);
                    if (var9 == 0) {
                        this.field1648[this.field1647++] = var7;
                        var8.field441 = field1661;
                    } else {
                        int var10 = arg1.method238(2, false);
                        if (var10 == 0) {
                            this.field1648[this.field1647++] = var7;
                            var8.field441 = field1661;
                            this.field1650[this.field1649++] = var7;
                        } else if (var10 == 1) {
                            this.field1648[this.field1647++] = var7;
                            var8.field441 = field1661;
                            int var11 = arg1.method238(3, false);
                            var8.method111(false, var11, this.field1574);
                            int var12 = arg1.method238(1, false);
                            if (var12 == 1) {
                                this.field1650[this.field1649++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1648[this.field1647++] = var7;
                            var8.field441 = field1661;
                            int var13 = arg1.method238(3, false);
                            var8.method111(true, var13, this.field1574);
                            int var14 = arg1.method238(3, false);
                            var8.method111(true, var14, this.field1574);
                            int var15 = arg1.method238(1, false);
                            if (var15 == 1) {
                                this.field1650[this.field1649++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1362[this.field1361++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method515(int arg0, int arg1) {
        if (arg1 != -44196) {
            this.field1567 = null;
        }
        Component var3 = Component.field67[arg0];
        for (int var4 = 0; var4 < var3.field89.length && var3.field89[var4] != -1; ++var4) {
            Component var5 = Component.field67[var3.field89[var4]];
            if (var5.field74 == 1) {
                this.method515(var5.field72, -44196);
            }
            var5.field70 = 0;
            var5.field71 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILlb;)V")
    private final void method516(boolean arg0, int arg1, Packet arg2) {
        this.field1361 = 0;
        this.field1649 = 0;
        this.method555(arg1, arg2, this.field1623);
        this.method453((byte) -97, arg1, arg2);
        this.method551(0, arg2, arg1);
        if (!arg0) {
            this.field1591 = arg2.method227();
        }
        for (int var4 = 0; var4 < this.field1361; ++var4) {
            int var6 = this.field1362[var4];
            if (field1661 != this.field1429[var6].field441) {
                this.field1429[var6].field454 = null;
                this.field1429[var6] = null;
            }
        }
        if (arg2.field710 != arg1) {
            signlink.reporterror(this.field1492 + " size mismatch in getnpcpos - pos:" + arg2.field710 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1430; ++var5) {
                if (this.field1429[this.field1431[var5]] == null) {
                    signlink.reporterror(this.field1492 + " null entry in npc list - pos:" + var5 + " size:" + this.field1430);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method517(int arg0) {
        if (arg0 < 0) {
            if (super.field27 == 1) {
                if (super.field28 >= 539 && super.field28 <= 573 && super.field29 >= 169 && super.field29 < 205 && this.field1481[0] != -1) {
                    this.field1319 = true;
                    this.field1448 = 0;
                    this.field1575 = true;
                }
                if (super.field28 >= 569 && super.field28 <= 599 && super.field29 >= 168 && super.field29 < 205 && this.field1481[1] != -1) {
                    this.field1319 = true;
                    this.field1448 = 1;
                    this.field1575 = true;
                }
                if (super.field28 >= 597 && super.field28 <= 627 && super.field29 >= 168 && super.field29 < 205 && this.field1481[2] != -1) {
                    this.field1319 = true;
                    this.field1448 = 2;
                    this.field1575 = true;
                }
                if (super.field28 >= 625 && super.field28 <= 669 && super.field29 >= 168 && super.field29 < 203 && this.field1481[3] != -1) {
                    this.field1319 = true;
                    this.field1448 = 3;
                    this.field1575 = true;
                }
                if (super.field28 >= 666 && super.field28 <= 696 && super.field29 >= 168 && super.field29 < 205 && this.field1481[4] != -1) {
                    this.field1319 = true;
                    this.field1448 = 4;
                    this.field1575 = true;
                }
                if (super.field28 >= 694 && super.field28 <= 724 && super.field29 >= 168 && super.field29 < 205 && this.field1481[5] != -1) {
                    this.field1319 = true;
                    this.field1448 = 5;
                    this.field1575 = true;
                }
                if (super.field28 >= 722 && super.field28 <= 756 && super.field29 >= 169 && super.field29 < 205 && this.field1481[6] != -1) {
                    this.field1319 = true;
                    this.field1448 = 6;
                    this.field1575 = true;
                }
                if (super.field28 >= 540 && super.field28 <= 574 && super.field29 >= 466 && super.field29 < 502 && this.field1481[7] != -1) {
                    this.field1319 = true;
                    this.field1448 = 7;
                    this.field1575 = true;
                }
                if (super.field28 >= 572 && super.field28 <= 602 && super.field29 >= 466 && super.field29 < 503 && this.field1481[8] != -1) {
                    this.field1319 = true;
                    this.field1448 = 8;
                    this.field1575 = true;
                }
                if (super.field28 >= 599 && super.field28 <= 629 && super.field29 >= 466 && super.field29 < 503 && this.field1481[9] != -1) {
                    this.field1319 = true;
                    this.field1448 = 9;
                    this.field1575 = true;
                }
                if (super.field28 >= 627 && super.field28 <= 671 && super.field29 >= 467 && super.field29 < 502 && this.field1481[10] != -1) {
                    this.field1319 = true;
                    this.field1448 = 10;
                    this.field1575 = true;
                }
                if (super.field28 >= 669 && super.field28 <= 699 && super.field29 >= 466 && super.field29 < 503 && this.field1481[11] != -1) {
                    this.field1319 = true;
                    this.field1448 = 11;
                    this.field1575 = true;
                }
                if (super.field28 >= 696 && super.field28 <= 726 && super.field29 >= 466 && super.field29 < 503 && this.field1481[12] != -1) {
                    this.field1319 = true;
                    this.field1448 = 12;
                    this.field1575 = true;
                }
                if (super.field28 >= 724 && super.field28 <= 758 && super.field29 >= 466 && super.field29 < 502 && this.field1481[13] != -1) {
                    this.field1319 = true;
                    this.field1448 = 13;
                    this.field1575 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method518(Component arg0, boolean arg1) {
        this.field1284 &= arg1;
        int var3 = arg0.field76;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1318[this.field1392] = "Remove @whi@" + arg0.field108;
                this.field1260[this.field1392] = 884;
                ++this.field1392;
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
            this.field1318[this.field1392] = "Remove @whi@" + this.field1465[var3];
            this.field1260[this.field1392] = 513;
            ++this.field1392;
            this.field1318[this.field1392] = "Message @whi@" + this.field1465[var3];
            this.field1260[this.field1392] = 902;
            ++this.field1392;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method519(int arg0) {
        int var2 = 32 / arg0;
        for (int var3 = 0; var3 < this.field1389; ++var3) {
            if (this.field1614[var3] <= 0) {
                boolean var4 = false;
                try {
                    if (this.field1267[var3] == this.field1321 && this.field1427[var3] == this.field1598) {
                        if (!this.method490((byte) 9)) {
                            var4 = true;
                        }
                    } else {
                        Packet var5 = Wave.method317(this.field1427[var3], 7, this.field1267[var3]);
                        if (System.currentTimeMillis() + (long) (var5.field710 / 22) > (long) (this.field1449 / 22) + this.field1469) {
                            this.field1449 = var5.field710;
                            this.field1469 = System.currentTimeMillis();
                            if (this.method557(var5.field709, 0, var5.field710)) {
                                this.field1321 = this.field1267[var3];
                                this.field1598 = this.field1427[var3];
                            } else {
                                var4 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var4 && this.field1614[var3] != -5) {
                    this.field1614[var3] = -5;
                } else {
                    --this.field1389;
                    for (int var7 = var3; var7 < this.field1389; ++var7) {
                        this.field1267[var7] = this.field1267[var7 + 1];
                        this.field1427[var7] = this.field1427[var7 + 1];
                        this.field1614[var7] = this.field1614[var7 + 1];
                    }
                    --var3;
                }
            } else {
                int var10002 = this.field1614[var3]--;
            }
        }
        if (this.field1363 > 0) {
            this.field1363 -= 20;
            if (this.field1363 < 0) {
                this.field1363 = 0;
            }
            if (this.field1363 == 0 && this.field1478 && !field1656) {
                this.field1611 = this.field1384;
                this.field1612 = true;
                this.field1235.method277(2, this.field1611);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;I)V")
    public final void method520(Pix8 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1554.length; ++var4) {
            this.field1554[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1554[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1555[var16] = (this.field1554[var16 - 1] + this.field1554[var16 + 1] + this.field1554[var16 - 128] + this.field1554[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1554;
            this.field1554 = this.field1555;
            this.field1555 = var14;
        }
        if (arg1 != 34809) {
            this.field1591 = -1;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field678; ++var8) {
                for (int var9 = 0; var9 < arg0.field677; ++var9) {
                    if (arg0.field675[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field679;
                        int var11 = var8 + 16 + arg0.field680;
                        int var12 = (var11 << 7) + var10;
                        this.field1554[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method521(boolean arg0, boolean arg1) {
        if (field1468.field396 >> 7 == this.field1332 && field1468.field397 >> 7 == this.field1333) {
            this.field1332 = 0;
            ++field1365;
            if (field1365 > 122) {
                field1365 = 0;
                this.field1271.method216(-34003, 255);
                this.field1271.method217(62);
            }
        }
        int var3 = this.field1647;
        if (!arg0) {
            this.field1591 = this.field1553.method227();
        }
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg1) {
                var5 = field1468;
                var6 = this.field1645 << 14;
            } else {
                var5 = this.field1646[this.field1648[var4]];
                var6 = this.field1648[var4] << 14;
            }
            if (var5 != null && var5.method113(true)) {
                var5.field477 = false;
                if ((field1656 && this.field1647 > 50 || this.field1647 > 200) && !arg1 && var5.field421 == var5.field401) {
                    var5.field477 = true;
                }
                int var7 = var5.field396 >> 7;
                int var8 = var5.field397 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field472 != null && field1661 >= var5.field467 && field1661 < var5.field468) {
                        var5.field477 = false;
                        var5.field466 = this.method462(false, var5.field397, var5.field396, this.field1576);
                        this.field1613.method62(60, var6, true, var5.field474, var5.field475, var5.field396, var5.field476, var5, var5.field397, this.field1576, var5.field466, var5.field473, var5.field398);
                    } else {
                        if ((var5.field396 & 127) == 64 && (var5.field397 & 127) == 64) {
                            if (this.field1306[var7][var8] == this.field1610) {
                                continue;
                            }
                            this.field1306[var7][var8] = this.field1610;
                        }
                        var5.field466 = this.method462(false, var5.field397, var5.field396, this.field1576);
                        this.field1613.method61(60, var6, var5.field466, var5.field396, 384, var5, var5.field398, var5.field399, var5.field397, this.field1576);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)V")
    public final void method522(int arg0, byte arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1425[var5] != null) {
                int var6 = this.field1423[var5];
                int var7 = 70 - var4 * 14 + this.field1524 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1424[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1264 == 0 || this.field1264 == 1 && this.method491(var8, 3))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field1468.field457)) {
                        if (this.field1609 >= 1) {
                            this.field1318[this.field1392] = "Report abuse @whi@" + var8;
                            this.field1260[this.field1392] = 524;
                            ++this.field1392;
                        }
                        this.field1318[this.field1392] = "Add ignore @whi@" + var8;
                        this.field1260[this.field1392] = 47;
                        ++this.field1392;
                        this.field1318[this.field1392] = "Add friend @whi@" + var8;
                        this.field1260[this.field1392] = 605;
                        ++this.field1392;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1438 == 0 && (var6 == 7 || this.field1316 == 0 || this.field1316 == 1 && this.method491(var8, 3))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1609 >= 1) {
                            this.field1318[this.field1392] = "Report abuse @whi@" + var8;
                            this.field1260[this.field1392] = 524;
                            ++this.field1392;
                        }
                        this.field1318[this.field1392] = "Add ignore @whi@" + var8;
                        this.field1260[this.field1392] = 47;
                        ++this.field1392;
                        this.field1318[this.field1392] = "Add friend @whi@" + var8;
                        this.field1260[this.field1392] = 605;
                        ++this.field1392;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1589 == 0 || this.field1589 == 1 && this.method491(var8, 3))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1318[this.field1392] = "Accept trade @whi@" + var8;
                        this.field1260[this.field1392] = 507;
                        ++this.field1392;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1438 == 0 && this.field1316 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1589 == 0 || this.field1589 == 1 && this.method491(var8, 3))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1318[this.field1392] = "Accept challenge @whi@" + var8;
                        this.field1260[this.field1392] = 957;
                        ++this.field1392;
                    }
                    ++var4;
                }
            }
        }
        if (arg1 != 7) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILab;II)V")
    public final void method523(int arg0, int arg1, PlayerEntity arg2, int arg3, int arg4) {
        if (field1468 != arg2) {
            if (this.field1392 < 400) {
                String var6;
                if (arg2.field464 == 0) {
                    var6 = arg2.field457 + method548(arg2.field463, field1468.field463, -41081) + " (level-" + arg2.field463 + ")";
                } else {
                    var6 = arg2.field457 + " (skill-" + arg2.field464 + ")";
                }
                if (this.field1373 == 1) {
                    this.field1318[this.field1392] = "Use " + this.field1377 + " with @whi@" + var6;
                    this.field1260[this.field1392] = 275;
                    this.field1261[this.field1392] = arg4;
                    this.field1258[this.field1392] = arg3;
                    this.field1259[this.field1392] = arg0;
                    ++this.field1392;
                } else if (this.field1415 == 1) {
                    if ((this.field1417 & 8) == 8) {
                        this.field1318[this.field1392] = this.field1418 + " @whi@" + var6;
                        this.field1260[this.field1392] = 131;
                        this.field1261[this.field1392] = arg4;
                        this.field1258[this.field1392] = arg3;
                        this.field1259[this.field1392] = arg0;
                        ++this.field1392;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1340[var7] != null) {
                            this.field1318[this.field1392] = this.field1340[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1340[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field463 > field1468.field463) {
                                    var9 = 2000;
                                }
                                if (field1468.field480 != 0 && arg2.field480 != 0) {
                                    if (field1468.field480 == arg2.field480) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1341[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1260[this.field1392] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1260[this.field1392] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1260[this.field1392] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1260[this.field1392] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1260[this.field1392] = var9 + 185;
                            }
                            this.field1261[this.field1392] = arg4;
                            this.field1258[this.field1392] = arg3;
                            this.field1259[this.field1392] = arg0;
                            ++this.field1392;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1392; ++var8) {
                    if (this.field1260[var8] == 718) {
                        this.field1318[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg1 != 705) {
                    this.field1278 = this.field1348.method293();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method524(byte arg0) {
        this.field1616.method256((byte) 5);
        Pix3D.field646 = this.field1336;
        if (arg0 == 3) {
            this.field1564.method198(0, this.field1634, 0);
            if (this.field1310 != -1) {
                this.method448(6, 0, 0, Component.field67[this.field1310], 0);
            } else if (this.field1481[this.field1448] != -1) {
                this.method448(6, 0, 0, Component.field67[this.field1481[this.field1448]], 0);
            }
            if (this.field1367 && this.field1451 == 1) {
                this.method526(393);
            }
            this.field1616.method257(-781, 553, 205, super.field13);
            this.field1618.method256((byte) 5);
            Pix3D.field646 = this.field1337;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method525(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1475.method246();
        if (arg0 >= 0) {
            this.field1271.method217(87);
        }
        while (var2 != null) {
            if (this.field1576 == var2.field607 && !var2.field613) {
                if (field1661 >= var2.field606) {
                    var2.method150(922, this.field1245);
                    if (var2.field613) {
                        var2.method106();
                    } else {
                        this.field1613.method61(60, -1, var2.field610, var2.field608, 384, var2, 0, false, var2.field609, var2.field607);
                    }
                }
            } else {
                var2.method106();
            }
            var2 = (SpotAnimEntity) this.field1475.method248(false);
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method526(int arg0) {
        int var2 = this.field1452;
        int var3 = this.field1453;
        int var4 = this.field1454;
        int var5 = this.field1455;
        int var6 = 6116423;
        Pix2D.method156(var6, 210, var3, var5, var2, var4);
        Pix2D.method156(0, 210, var3 + 1, 16, var2 + 1, var4 - 2);
        if (arg0 <= 0) {
            this.field1574 = 111;
        }
        Pix2D.method157(1, var2 + 1, var4 - 2, 0, var3 + 18, var5 - 19);
        this.field1678.method204((byte) -104, var6, "Choose Option", var2 + 3, var3 + 14);
        int var7 = super.field21;
        int var8 = super.field22;
        if (this.field1451 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1451 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1451 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1392; ++var9) {
            int var10 = (this.field1392 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1678.method208(var11, 2, var10, true, var2 + 3, this.field1318[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method527(int arg0) {
        for (int var2 = 0; var2 < this.field1430; ++var2) {
            int var3 = this.field1431[var2];
            NpcEntity var4 = this.field1429[var3];
            if (var4 != null) {
                this.method528(-34028, var4, var4.field454.field1013);
            }
        }
        if (arg0 <= 0) {
            this.field1668 = -115;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;I)V")
    public final void method528(int arg0, PathingEntity arg1, int arg2) {
        if (arg0 != -34028) {
            this.field1591 = this.field1553.method227();
        }
        if (arg1.field396 < 128 || arg1.field397 < 128 || arg1.field396 >= 13184 || arg1.field397 >= 13184) {
            arg1.field424 = -1;
            arg1.field429 = -1;
            arg1.field438 = 0;
            arg1.field439 = 0;
            arg1.field396 = arg1.field446[0] * 128 + arg1.field400 * 64;
            arg1.field397 = arg1.field447[0] * 128 + arg1.field400 * 64;
            arg1.method112(false);
        }
        if (field1468 == arg1 && (arg1.field396 < 1536 || arg1.field397 < 1536 || arg1.field396 >= 11776 || arg1.field397 >= 11776)) {
            arg1.field424 = -1;
            arg1.field429 = -1;
            arg1.field438 = 0;
            arg1.field439 = 0;
            arg1.field396 = arg1.field446[0] * 128 + arg1.field400 * 64;
            arg1.field397 = arg1.field447[0] * 128 + arg1.field400 * 64;
            arg1.method112(false);
        }
        if (arg1.field438 > field1661) {
            this.method529(5, arg1);
        } else if (arg1.field439 >= field1661) {
            this.method530(this.field1512, arg1);
        } else {
            this.method531(arg1, 0);
        }
        this.method532((byte) 2, arg1);
        this.method533(arg1, 0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method529(int arg0, PathingEntity arg1) {
        int var3 = arg1.field438 - field1661;
        if (arg0 < 5 || arg0 > 5) {
            this.field1567 = null;
        }
        int var4 = arg1.field434 * 128 + arg1.field400 * 64;
        int var5 = arg1.field436 * 128 + arg1.field400 * 64;
        arg1.field396 += (var4 - arg1.field396) / var3;
        arg1.field397 += (var5 - arg1.field397) / var3;
        arg1.field449 = 0;
        if (arg1.field440 == 0) {
            arg1.field443 = 1024;
        }
        if (arg1.field440 == 1) {
            arg1.field443 = 1536;
        }
        if (arg1.field440 == 2) {
            arg1.field443 = 0;
        }
        if (arg1.field440 == 3) {
            arg1.field443 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;)V")
    public final void method530(int arg0, PathingEntity arg1) {
        if (field1661 == arg1.field439 || arg1.field424 == -1 || arg1.field427 != 0 || arg1.field426 + 1 > SeqType.field1150[arg1.field424].method378(arg1.field425, 24425)) {
            int var3 = arg1.field439 - arg1.field438;
            int var4 = field1661 - arg1.field438;
            int var5 = arg1.field434 * 128 + arg1.field400 * 64;
            int var6 = arg1.field436 * 128 + arg1.field400 * 64;
            int var7 = arg1.field435 * 128 + arg1.field400 * 64;
            int var8 = arg1.field437 * 128 + arg1.field400 * 64;
            arg1.field396 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field397 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field449 = 0;
        if (arg1.field440 == 0) {
            arg1.field443 = 1024;
        }
        if (arg1.field440 == 1) {
            arg1.field443 = 1536;
        }
        if (arg1.field440 == 2) {
            arg1.field443 = 0;
        }
        if (arg1.field440 == 3) {
            arg1.field443 = 512;
        }
        arg1.field398 = arg1.field443;
        if (arg0 != 37395) {
            this.field1591 = this.field1553.method227();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method531(PathingEntity arg0, int arg1) {
        arg0.field421 = arg0.field401;
        if (arg0.field445 == 0) {
            arg0.field449 = 0;
        } else {
            if (arg0.field424 != -1 && arg0.field427 == 0) {
                SeqType var3 = SeqType.field1150[arg0.field424];
                if (arg0.field450 > 0 && var3.field1162 == 0) {
                    ++arg0.field449;
                    return;
                }
                if (arg0.field450 <= 0 && var3.field1163 == 0) {
                    ++arg0.field449;
                    return;
                }
            }
            int var4 = arg0.field396;
            int var5 = arg0.field397;
            int var6 = arg0.field446[arg0.field445 - 1] * 128 + arg0.field400 * 64;
            int var7 = arg0.field447[arg0.field445 - 1] * 128 + arg0.field400 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field443 = 1280;
                    } else if (var5 > var7) {
                        arg0.field443 = 1792;
                    } else {
                        arg0.field443 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field443 = 768;
                    } else if (var5 > var7) {
                        arg0.field443 = 256;
                    } else {
                        arg0.field443 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field443 = 1024;
                } else {
                    arg0.field443 = 0;
                }
                int var8 = arg0.field443 - arg0.field398 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field404;
                this.field1590 += arg1;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field403;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field406;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field405;
                }
                if (var9 == -1) {
                    var9 = arg0.field403;
                }
                arg0.field421 = var9;
                int var10 = 4;
                if (arg0.field443 != arg0.field398 && arg0.field418 == -1 && arg0.field444 != 0) {
                    var10 = 2;
                }
                if (arg0.field445 > 2) {
                    var10 = 6;
                }
                if (arg0.field445 > 3) {
                    var10 = 8;
                }
                if (arg0.field449 > 0 && arg0.field445 > 1) {
                    var10 = 8;
                    --arg0.field449;
                }
                if (arg0.field448[arg0.field445 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field421 == arg0.field403 && arg0.field407 != -1) {
                    arg0.field421 = arg0.field407;
                }
                if (var4 < var6) {
                    arg0.field396 += var10;
                    if (arg0.field396 > var6) {
                        arg0.field396 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field396 -= var10;
                    if (arg0.field396 < var6) {
                        arg0.field396 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field397 += var10;
                    if (arg0.field397 > var7) {
                        arg0.field397 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field397 -= var10;
                    if (arg0.field397 < var7) {
                        arg0.field397 = var7;
                    }
                }
                if (arg0.field396 == var6 && arg0.field397 == var7) {
                    --arg0.field445;
                    if (arg0.field450 > 0) {
                        --arg0.field450;
                        return;
                    }
                }
            } else {
                arg0.field396 = var6;
                arg0.field397 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLy;)V")
    public final void method532(byte arg0, PathingEntity arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field1567 = null;
        }
        if (arg1.field444 != 0) {
            if (arg1.field418 != -1 && arg1.field418 < 32768) {
                NpcEntity var4 = this.field1429[arg1.field418];
                if (var4 != null) {
                    int var5 = arg1.field396 - var4.field396;
                    int var6 = arg1.field397 - var4.field397;
                    if (var5 != 0 || var6 != 0) {
                        arg1.field443 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field418 >= 32768) {
                int var7 = arg1.field418 - 32768;
                if (this.field1536 == var7) {
                    var7 = this.field1645;
                }
                PlayerEntity var8 = this.field1646[var7];
                if (var8 != null) {
                    int var9 = arg1.field396 - var8.field396;
                    int var10 = arg1.field397 - var8.field397;
                    if (var9 != 0 || var10 != 0) {
                        arg1.field443 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field419 != 0 || arg1.field420 != 0) && (arg1.field445 == 0 || arg1.field449 > 0)) {
                int var11 = arg1.field396 - (arg1.field419 - this.field1605 - this.field1605) * 64;
                int var12 = arg1.field397 - (arg1.field420 - this.field1606 - this.field1606) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg1.field443 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg1.field419 = 0;
                arg1.field420 = 0;
            }
            int var13 = arg1.field443 - arg1.field398 & 2047;
            if (var13 != 0) {
                if (var13 >= arg1.field444 && var13 <= 2048 - arg1.field444) {
                    if (var13 > 1024) {
                        arg1.field398 -= arg1.field444;
                    } else {
                        arg1.field398 += arg1.field444;
                    }
                } else {
                    arg1.field398 = arg1.field443;
                }
                arg1.field398 &= 2047;
                if (arg1.field421 == arg1.field401 && arg1.field443 != arg1.field398) {
                    if (arg1.field402 != -1) {
                        arg1.field421 = arg1.field402;
                        return;
                    }
                    arg1.field421 = arg1.field403;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method533(PathingEntity arg0, int arg1) {
        this.field1590 += arg1;
        arg0.field399 = false;
        if (arg0.field421 != -1) {
            SeqType var3 = SeqType.field1150[arg0.field421];
            ++arg0.field423;
            if (arg0.field422 < var3.field1151 && arg0.field423 > var3.method378(arg0.field422, 24425)) {
                arg0.field423 = 0;
                ++arg0.field422;
            }
            if (arg0.field422 >= var3.field1151) {
                arg0.field423 = 0;
                arg0.field422 = 0;
            }
        }
        if (arg0.field429 != -1 && field1661 >= arg0.field432) {
            if (arg0.field430 < 0) {
                arg0.field430 = 0;
            }
            SeqType var4 = SpotAnimType.field1173[arg0.field429].field1177;
            ++arg0.field431;
            while (arg0.field430 < var4.field1151 && arg0.field431 > var4.method378(arg0.field430, 24425)) {
                arg0.field431 -= var4.method378(arg0.field430, 24425);
                ++arg0.field430;
            }
            if (arg0.field430 >= var4.field1151 && (arg0.field430 < 0 || arg0.field430 >= var4.field1151)) {
                arg0.field429 = -1;
            }
        }
        if (arg0.field424 != -1 && arg0.field427 <= 1) {
            SeqType var5 = SeqType.field1150[arg0.field424];
            if (var5.field1162 == 1 && arg0.field450 > 0 && arg0.field438 <= field1661 && arg0.field439 < field1661) {
                arg0.field427 = 1;
                return;
            }
        }
        if (arg0.field424 != -1 && arg0.field427 == 0) {
            SeqType var6 = SeqType.field1150[arg0.field424];
            ++arg0.field426;
            while (arg0.field425 < var6.field1151 && arg0.field426 > var6.method378(arg0.field425, 24425)) {
                arg0.field426 -= var6.method378(arg0.field425, 24425);
                ++arg0.field425;
            }
            if (arg0.field425 >= var6.field1151) {
                arg0.field425 -= var6.field1155;
                ++arg0.field428;
                if (arg0.field428 >= var6.field1161) {
                    arg0.field424 = -1;
                }
                if (arg0.field425 < 0 || arg0.field425 >= var6.field1151) {
                    arg0.field424 = -1;
                }
            }
            arg0.field399 = var6.field1157;
        }
        if (arg0.field427 > 0) {
            --arg0.field427;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method534(boolean arg0) {
        if (!arg0) {
            if (this.field1329) {
                this.field1329 = false;
                this.field1544.method257(-781, 0, 4, super.field13);
                this.field1545.method257(-781, 0, 357, super.field13);
                this.field1546.method257(-781, 722, 4, super.field13);
                this.field1547.method257(-781, 743, 205, super.field13);
                this.field1548.method257(-781, 0, 0, super.field13);
                this.field1549.method257(-781, 516, 4, super.field13);
                this.field1550.method257(-781, 516, 205, super.field13);
                this.field1551.method257(-781, 496, 357, super.field13);
                this.field1552.method257(-781, 0, 338, super.field13);
                this.field1319 = true;
                this.field1470 = true;
                this.field1575 = true;
                this.field1483 = true;
                if (this.field1303 != 2) {
                    this.field1618.method257(-781, 4, 4, super.field13);
                    this.field1617.method257(-781, 550, 4, super.field13);
                }
            }
            if (this.field1303 == 2) {
                this.method454(0);
            }
            if (this.field1367 && this.field1451 == 1) {
                this.field1319 = true;
            }
            if (this.field1310 != -1) {
                boolean var2 = this.method476(this.field1245, this.field1310, (byte) -103);
                if (var2) {
                    this.field1319 = true;
                }
            }
            if (this.field1572 == 2) {
                this.field1319 = true;
            }
            if (this.field1516 == 2) {
                this.field1319 = true;
            }
            if (this.field1319) {
                this.method524((byte) 3);
                this.field1319 = false;
            }
            if (this.field1674 == -1) {
                this.field1622.field87 = this.field1295 - this.field1524 - 77;
                if (super.field21 > 448 && super.field21 < 560 && super.field22 > 332) {
                    this.method492(0, super.field21 - 17, this.field1622, 463, false, 77, this.field1251, super.field22 - 357, this.field1295);
                }
                int var3 = this.field1295 - 77 - this.field1622.field87;
                if (var3 < 0) {
                    var3 = 0;
                }
                if (var3 > this.field1295 - 77) {
                    var3 = this.field1295 - 77;
                }
                if (this.field1524 != var3) {
                    this.field1524 = var3;
                    this.field1470 = true;
                }
            }
            if (this.field1674 != -1) {
                boolean var4 = this.method476(this.field1245, this.field1674, (byte) -103);
                if (var4) {
                    this.field1470 = true;
                }
            }
            if (this.field1572 == 3) {
                this.field1470 = true;
            }
            if (this.field1516 == 3) {
                this.field1470 = true;
            }
            if (this.field1244 != null) {
                this.field1470 = true;
            }
            if (this.field1367 && this.field1451 == 2) {
                this.field1470 = true;
            }
            if (this.field1470) {
                this.method458(311);
                this.field1470 = false;
            }
            if (this.field1303 == 2) {
                this.method447(0);
                this.field1617.method257(-781, 550, 4, super.field13);
            }
            if (this.field1254 != -1) {
                this.field1575 = true;
            }
            if (this.field1575) {
                if (this.field1254 != -1 && this.field1448 == this.field1254) {
                    this.field1254 = -1;
                    this.field1271.method216(-34003, 146);
                    this.field1271.method217(this.field1448);
                }
                this.field1575 = false;
                this.field1281.method256((byte) 5);
                this.field1326.method198(0, this.field1634, 0);
                if (this.field1310 == -1) {
                    if (this.field1481[this.field1448] != -1) {
                        if (this.field1448 == 0) {
                            this.field1557.method198(10, this.field1634, 22);
                        }
                        if (this.field1448 == 1) {
                            this.field1558.method198(8, this.field1634, 54);
                        }
                        if (this.field1448 == 2) {
                            this.field1558.method198(8, this.field1634, 82);
                        }
                        if (this.field1448 == 3) {
                            this.field1559.method198(8, this.field1634, 110);
                        }
                        if (this.field1448 == 4) {
                            this.field1561.method198(8, this.field1634, 153);
                        }
                        if (this.field1448 == 5) {
                            this.field1561.method198(8, this.field1634, 181);
                        }
                        if (this.field1448 == 6) {
                            this.field1560.method198(9, this.field1634, 209);
                        }
                    }
                    if (this.field1481[0] != -1 && (this.field1254 != 0 || field1661 % 20 < 10)) {
                        this.field1697[0].method198(13, this.field1634, 29);
                    }
                    if (this.field1481[1] != -1 && (this.field1254 != 1 || field1661 % 20 < 10)) {
                        this.field1697[1].method198(11, this.field1634, 53);
                    }
                    if (this.field1481[2] != -1 && (this.field1254 != 2 || field1661 % 20 < 10)) {
                        this.field1697[2].method198(11, this.field1634, 82);
                    }
                    if (this.field1481[3] != -1 && (this.field1254 != 3 || field1661 % 20 < 10)) {
                        this.field1697[3].method198(12, this.field1634, 115);
                    }
                    if (this.field1481[4] != -1 && (this.field1254 != 4 || field1661 % 20 < 10)) {
                        this.field1697[4].method198(13, this.field1634, 153);
                    }
                    if (this.field1481[5] != -1 && (this.field1254 != 5 || field1661 % 20 < 10)) {
                        this.field1697[5].method198(11, this.field1634, 180);
                    }
                    if (this.field1481[6] != -1 && (this.field1254 != 6 || field1661 % 20 < 10)) {
                        this.field1697[6].method198(13, this.field1634, 208);
                    }
                }
                this.field1281.method257(-781, 516, 160, super.field13);
                this.field1280.method256((byte) 5);
                this.field1325.method198(0, this.field1634, 0);
                if (this.field1310 == -1) {
                    if (this.field1481[this.field1448] != -1) {
                        if (this.field1448 == 7) {
                            this.field1273.method198(0, this.field1634, 42);
                        }
                        if (this.field1448 == 8) {
                            this.field1274.method198(0, this.field1634, 74);
                        }
                        if (this.field1448 == 9) {
                            this.field1274.method198(0, this.field1634, 102);
                        }
                        if (this.field1448 == 10) {
                            this.field1275.method198(1, this.field1634, 130);
                        }
                        if (this.field1448 == 11) {
                            this.field1277.method198(0, this.field1634, 173);
                        }
                        if (this.field1448 == 12) {
                            this.field1277.method198(0, this.field1634, 201);
                        }
                        if (this.field1448 == 13) {
                            this.field1276.method198(0, this.field1634, 229);
                        }
                    }
                    if (this.field1481[8] != -1 && (this.field1254 != 8 || field1661 % 20 < 10)) {
                        this.field1697[7].method198(2, this.field1634, 74);
                    }
                    if (this.field1481[9] != -1 && (this.field1254 != 9 || field1661 % 20 < 10)) {
                        this.field1697[8].method198(3, this.field1634, 102);
                    }
                    if (this.field1481[10] != -1 && (this.field1254 != 10 || field1661 % 20 < 10)) {
                        this.field1697[9].method198(4, this.field1634, 137);
                    }
                    if (this.field1481[11] != -1 && (this.field1254 != 11 || field1661 % 20 < 10)) {
                        this.field1697[10].method198(2, this.field1634, 174);
                    }
                    if (this.field1481[12] != -1 && (this.field1254 != 12 || field1661 % 20 < 10)) {
                        this.field1697[11].method198(2, this.field1634, 201);
                    }
                    if (this.field1481[13] != -1 && (this.field1254 != 13 || field1661 % 20 < 10)) {
                        this.field1697[12].method198(2, this.field1634, 226);
                    }
                }
                this.field1280.method257(-781, 496, 466, super.field13);
                this.field1618.method256((byte) 5);
            }
            if (this.field1483) {
                this.field1483 = false;
                this.field1279.method256((byte) 5);
                this.field1324.method198(0, this.field1634, 0);
                this.field1677.method201(true, 16777215, (byte) -85, 55, "Public chat", 28);
                if (this.field1264 == 0) {
                    this.field1677.method201(true, 65280, (byte) -85, 55, "On", 41);
                }
                if (this.field1264 == 1) {
                    this.field1677.method201(true, 16776960, (byte) -85, 55, "Friends", 41);
                }
                if (this.field1264 == 2) {
                    this.field1677.method201(true, 16711680, (byte) -85, 55, "Off", 41);
                }
                if (this.field1264 == 3) {
                    this.field1677.method201(true, 65535, (byte) -85, 55, "Hide", 41);
                }
                this.field1677.method201(true, 16777215, (byte) -85, 184, "Private chat", 28);
                if (this.field1316 == 0) {
                    this.field1677.method201(true, 65280, (byte) -85, 184, "On", 41);
                }
                if (this.field1316 == 1) {
                    this.field1677.method201(true, 16776960, (byte) -85, 184, "Friends", 41);
                }
                if (this.field1316 == 2) {
                    this.field1677.method201(true, 16711680, (byte) -85, 184, "Off", 41);
                }
                this.field1677.method201(true, 16777215, (byte) -85, 324, "Trade/compete", 28);
                if (this.field1589 == 0) {
                    this.field1677.method201(true, 65280, (byte) -85, 324, "On", 41);
                }
                if (this.field1589 == 1) {
                    this.field1677.method201(true, 16776960, (byte) -85, 324, "Friends", 41);
                }
                if (this.field1589 == 2) {
                    this.field1677.method201(true, 16711680, (byte) -85, 324, "Off", 41);
                }
                this.field1677.method201(true, 16777215, (byte) -85, 458, "Report abuse", 33);
                this.field1279.method257(-781, 0, 453, super.field13);
                this.field1618.method256((byte) 5);
            }
            this.field1245 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public final boolean method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1534[var15][var35] = 0;
                this.field1396[var15][var35] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg11;
        this.field1534[arg1][arg11] = 99;
        this.field1396[arg1][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1441[var18] = arg1;
        int var36 = var18 + 1;
        this.field1442[var18] = arg11;
        boolean var20 = false;
        if (arg8 <= 0) {
            this.field1512 = 304;
        }
        int var21 = this.field1441.length;
        int[][] var22 = this.field1443[this.field1576].field1107;
        while (var36 != var19) {
            var16 = this.field1441[var19];
            var17 = this.field1442[var19];
            var19 = (var19 + 1) % var21;
            if (arg10 == var16 && arg3 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field1443[this.field1576].method364(arg3, arg2, arg5 - 1, arg10, var17, var16, -628)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field1443[this.field1576].method365((byte) -58, arg10, var17, arg3, arg5 - 1, arg2, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg9 != 0 && this.field1443[this.field1576].method366(arg0, arg3, var17, field1379, arg9, var16, arg4, arg10)) {
                var20 = true;
                break;
            }
            int var34 = this.field1396[var16][var17] + 1;
            if (var16 > 0 && this.field1534[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1441[var36] = var16 - 1;
                this.field1442[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 - 1][var17] = 2;
                this.field1396[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1534[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1441[var36] = var16 + 1;
                this.field1442[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 + 1][var17] = 8;
                this.field1396[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1534[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1441[var36] = var16;
                this.field1442[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16][var17 - 1] = 1;
                this.field1396[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1534[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1441[var36] = var16;
                this.field1442[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16][var17 + 1] = 4;
                this.field1396[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1534[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1441[var36] = var16 - 1;
                this.field1442[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 - 1][var17 - 1] = 3;
                this.field1396[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1534[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1441[var36] = var16 + 1;
                this.field1442[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 + 1][var17 - 1] = 9;
                this.field1396[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1534[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1441[var36] = var16 - 1;
                this.field1442[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 - 1][var17 + 1] = 6;
                this.field1396[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1534[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1441[var36] = var16 + 1;
                this.field1442[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1534[var16 + 1][var17 + 1] = 12;
                this.field1396[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1393 = 0;
        if (!var20) {
            if (arg6) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg10 - var24; var25 <= arg10 + var24; ++var25) {
                        for (int var26 = arg3 - var24; var26 <= arg3 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1396[var25][var26] < var23) {
                                var23 = this.field1396[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1393 = 1;
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
        this.field1441[var27] = var16;
        int var37 = var27 + 1;
        this.field1442[var27] = var17;
        int var28;
        int var29 = var28 = this.field1534[var16][var17];
        while (arg1 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1441[var37] = var16;
                this.field1442[var37++] = var17;
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
            var29 = this.field1534[var16][var17];
        }
        if (var37 <= 0) {
            if (arg7 == 1) {
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
            int var31 = this.field1441[var37];
            int var32 = this.field1442[var37];
            if (arg7 == 0) {
                this.field1271.method216(-34003, 234);
                this.field1271.method217(var30 + var30 + 3);
            }
            if (arg7 == 1) {
                this.field1271.method216(-34003, 236);
                this.field1271.method217(var30 + var30 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field1271.method216(-34003, 67);
                this.field1271.method217(var30 + var30 + 3);
            }
            if (super.field31[5] == 1) {
                this.field1271.method217(1);
            } else {
                this.field1271.method217(0);
            }
            this.field1271.method218(this.field1605 + var31);
            this.field1271.method218(this.field1606 + var32);
            this.field1332 = this.field1441[0];
            this.field1333 = this.field1442[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1271.method217(this.field1441[var37] - var31);
                this.field1271.method217(this.field1442[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;II)Lxb;")
    public final Jagfile method536(byte arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        if (arg0 != -9) {
            throw new NullPointerException();
        } else {
            int var8 = 5;
            try {
                if (this.field1629[0] != null) {
                    var7 = this.field1629[0].method289(false, arg2);
                }
            } catch (Exception var30) {
            }
            if (var7 != null) {
                this.field1372.reset();
                this.field1372.update(var7);
                int var9 = (int) this.field1372.getValue();
                if (arg5 != var9) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new Jagfile(var7, 0);
            } else {
                int var11 = 0;
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method13(false, arg4, "Requesting " + arg1);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method488(arg3 + arg5);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        Packet var17 = new Packet(var16, 15787);
                        var17.field710 = 3;
                        int var18 = var17.method231() + 6;
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
                                this.method13(false, arg4, "Loading " + arg1 + " - " + var23 + "%");
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field1629[0] != null) {
                                this.field1629[0].method290(var7, (byte) 4, var7.length, arg2);
                            }
                        } catch (Exception var29) {
                            this.field1629[0] = null;
                        }
                        if (var7 != null) {
                            this.field1372.reset();
                            this.field1372.update(var7);
                            int var24 = (int) this.field1372.getValue();
                            if (arg5 != var24) {
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
                                this.method13(false, arg4, "Game updated - please reload page");
                                var26 = 10;
                            } else {
                                this.method13(false, arg4, var12 + " - Retrying in " + var26);
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
                        this.field1343 = !this.field1343;
                    }
                }
                return new Jagfile(var7, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)I")
    public final int method537(byte arg0) {
        int var2 = 3;
        if (arg0 != 2) {
            this.field1567 = null;
        }
        if (this.field1299 < 310) {
            int var3 = this.field1296 >> 7;
            int var4 = this.field1298 >> 7;
            int var5 = field1468.field396 >> 7;
            int var6 = field1468.field397 >> 7;
            if ((this.field1292[this.field1576][var3][var4] & 4) != 0) {
                var2 = this.field1576;
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
                    if ((this.field1292[this.field1576][var3][var4] & 4) != 0) {
                        var2 = this.field1576;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1292[this.field1576][var3][var4] & 4) != 0) {
                            var2 = this.field1576;
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
                    if ((this.field1292[this.field1576][var3][var4] & 4) != 0) {
                        var2 = this.field1576;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1292[this.field1576][var3][var4] & 4) != 0) {
                            var2 = this.field1576;
                        }
                    }
                }
            }
        }
        if ((this.field1292[this.field1576][field1468.field396 >> 7][field1468.field397 >> 7] & 4) != 0) {
            var2 = this.field1576;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)I")
    public final int method538(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
            int var3 = this.method462(false, this.field1298, this.field1296, this.field1576);
            return var3 - this.field1297 < 800 && (this.field1292[this.field1576][this.field1296 >> 7][this.field1298 >> 7] & 4) != 0 ? this.field1576 : 3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method539(boolean arg0) {
        this.field1595 = false;
        while (this.field1314) {
            this.field1595 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1312 = null;
        this.field1313 = null;
        this.field1285 = null;
        this.field1639 = null;
        this.field1640 = null;
        this.field1641 = null;
        this.field1642 = null;
        this.field1554 = null;
        this.field1555 = null;
        this.field1693 = null;
        if (arg0) {
            this.field1271.method217(203);
        }
        this.field1694 = null;
        this.field1698 = null;
        this.field1699 = null;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1307) {
            this.method446(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method540(int arg0) {
        try {
            this.field1484 = -1;
            this.field1475.method250();
            this.field1339.method250();
            Pix3D.method166(false);
            this.method487(this.field1463);
            this.field1613.method50(true);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1443[var2].method355(3);
            }
            System.gc();
            World var3 = new World(this.field1286, 104, (byte) 9, this.field1292, 104);
            int var4 = this.field1402.length;
            World.field41 = World3D.field281;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1460[var5] >> 8;
                int var7 = this.field1460[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field41 = false;
                }
            }
            if (World.field41) {
                this.field1613.method51((byte) 7, this.field1576);
            } else {
                this.field1613.method51((byte) 7, 0);
            }
            this.field1271.method216(-34003, 181);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1460[var8] >> 8) * 64 - this.field1605;
                int var10 = (this.field1460[var8] & 255) * 64 - this.field1606;
                byte[] var11 = this.field1402[var8];
                if (var11 != null) {
                    var3.method15((this.field1263 - 6) * 8, (this.field1262 - 6) * 8, (byte) -54, var11, var10, var9);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1460[var12] >> 8) * 64 - this.field1605;
                int var14 = (this.field1460[var12] & 255) * 64 - this.field1606;
                byte[] var15 = this.field1402[var12];
                if (var15 == null && this.field1263 < 800) {
                    var3.method14(var13, var14, 64, true, 64);
                }
            }
            this.field1271.method216(-34003, 181);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1394[var16];
                if (var17 != null) {
                    int var18 = (this.field1460[var16] >> 8) * 64 - this.field1605;
                    int var19 = (this.field1460[var16] & 255) * 64 - this.field1606;
                    var3.method18(var19, var18, var17, this.field1613, (byte) 4, this.field1443);
                }
            }
            this.field1271.method216(-34003, 181);
            var3.method20((byte) 76, this.field1443, this.field1613);
            this.field1618.method256((byte) 5);
            this.field1271.method216(-34003, 181);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method503(var20, var21);
                }
            }
            this.method512(-922);
        } catch (Exception var34) {
        }
        LocType.field994.method103();
        if (field1656 && signlink.cache_dat != null) {
            int var23 = this.field1235.method270(0, (byte) 7);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1235.method275(var24, -600);
                if ((var25 & 121) == 0) {
                    Model.method124((byte) 63, var24);
                }
            }
        }
        System.gc();
        Pix3D.method167(1, 20);
        if (arg0 == -17416) {
            this.field1235.method281(this.field1369);
            int var26 = (this.field1262 - 6) / 8 - 1;
            int var27 = (this.field1262 + 6) / 8 + 1;
            int var28 = (this.field1263 - 6) / 8 - 1;
            int var29 = (this.field1263 + 6) / 8 + 1;
            if (this.field1327) {
                var26 = 49;
                var27 = 50;
                var28 = 49;
                var29 = 50;
            }
            for (int var30 = var26; var30 <= var27; ++var30) {
                for (int var31 = var28; var31 <= var29; ++var31) {
                    if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                        int var32 = this.field1235.method272(var31, -942, var30, 0);
                        if (var32 != -1) {
                            this.field1235.method282(var32, 3, (byte) 6);
                        }
                        int var33 = this.field1235.method272(var31, -942, var30, 1);
                        if (var33 != -1) {
                            this.field1235.method282(var33, 3, (byte) 6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;Z)V")
    private final void method541(int arg0, Packet arg1, boolean arg2) {
        arg1.method237((byte) -51);
        int var4 = arg1.method238(1, false);
        if (var4 != 0) {
            int var5 = arg1.method238(2, false);
            if (arg2) {
                this.field1591 = arg1.method227();
            }
            if (var5 == 0) {
                this.field1650[this.field1649++] = this.field1645;
            } else if (var5 == 1) {
                int var6 = arg1.method238(3, false);
                field1468.method111(false, var6, this.field1574);
                int var7 = arg1.method238(1, false);
                if (var7 == 1) {
                    this.field1650[this.field1649++] = this.field1645;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method238(3, false);
                field1468.method111(true, var8, this.field1574);
                int var9 = arg1.method238(3, false);
                field1468.method111(true, var9, this.field1574);
                int var10 = arg1.method238(1, false);
                if (var10 == 1) {
                    this.field1650[this.field1649++] = this.field1645;
                }
            } else if (var5 == 3) {
                this.field1576 = arg1.method238(2, false);
                int var11 = arg1.method238(7, false);
                int var12 = arg1.method238(7, false);
                int var13 = arg1.method238(1, false);
                field1468.method110(var11, var13 == 1, var12, this.field1346);
                int var14 = arg1.method238(1, false);
                if (var14 == 1) {
                    this.field1650[this.field1649++] = this.field1645;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)V")
    public static final void method542(byte arg0) {
        World3D.field281 = true;
        if (arg0 != 102) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        Pix3D.field635 = true;
        field1656 = true;
        World.field41 = true;
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method543(int arg0) {
        int var2 = this.field1539 * 128 + 64;
        int var3 = this.field1540 * 128 + 64;
        int var4 = this.method462(false, var3, var2, this.field1576) - this.field1541;
        if (this.field1296 < var2) {
            this.field1296 += (var2 - this.field1296) * this.field1543 / 1000 + this.field1542;
            if (this.field1296 > var2) {
                this.field1296 = var2;
            }
        }
        if (this.field1296 > var2) {
            this.field1296 -= (this.field1296 - var2) * this.field1543 / 1000 + this.field1542;
            if (this.field1296 < var2) {
                this.field1296 = var2;
            }
        }
        if (this.field1297 < var4) {
            this.field1297 += (var4 - this.field1297) * this.field1543 / 1000 + this.field1542;
            if (this.field1297 > var4) {
                this.field1297 = var4;
            }
        }
        if (this.field1297 > var4) {
            this.field1297 -= (this.field1297 - var4) * this.field1543 / 1000 + this.field1542;
            if (this.field1297 < var4) {
                this.field1297 = var4;
            }
        }
        if (this.field1298 < var3) {
            this.field1298 += (var3 - this.field1298) * this.field1543 / 1000 + this.field1542;
            if (this.field1298 > var3) {
                this.field1298 = var3;
            }
        }
        if (this.field1298 > var3) {
            this.field1298 -= (this.field1298 - var3) * this.field1543 / 1000 + this.field1542;
            if (this.field1298 < var3) {
                this.field1298 = var3;
            }
        }
        int var5 = this.field1410 * 128 + 64;
        int var6 = this.field1411 * 128 + 64;
        int var7 = this.method462(false, var6, var5, this.field1576) - this.field1412;
        int var8 = var5 - this.field1296;
        int var9 = var7 - this.field1297;
        int var10 = var6 - this.field1298;
        this.field1590 += arg0;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1299 < var12) {
            this.field1299 += (var12 - this.field1299) * this.field1414 / 1000 + this.field1413;
            if (this.field1299 > var12) {
                this.field1299 = var12;
            }
        }
        if (this.field1299 > var12) {
            this.field1299 -= (this.field1299 - var12) * this.field1414 / 1000 + this.field1413;
            if (this.field1299 < var12) {
                this.field1299 = var12;
            }
        }
        int var14 = var13 - this.field1300;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1300 += this.field1414 * var14 / 1000 + this.field1413;
            this.field1300 &= 2047;
        }
        if (var14 < 0) {
            this.field1300 -= -var14 * this.field1414 / 1000 + this.field1413;
            this.field1300 &= 2047;
        }
        int var15 = var13 - this.field1300;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1300 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method544(int arg0) {
        ++field1508;
        while (arg0 >= 0) {
            this.field1383 = 326;
        }
        if (field1508 > 192) {
            field1508 = 0;
            this.field1271.method216(-34003, 137);
            this.field1271.method217(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(-128);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1620 != -1 && this.field1638 == this.field1620) {
                        if (var2 == 8 && this.field1360.length() > 0) {
                            this.field1360 = this.field1360.substring(0, this.field1360.length() - 1);
                        }
                        break;
                    }
                    if (this.field1643) {
                        if (var2 >= 32 && var2 <= 122 && this.field1428.length() < 80) {
                            this.field1428 = this.field1428 + (char) var2;
                            this.field1470 = true;
                        }
                        if (var2 == 8 && this.field1428.length() > 0) {
                            this.field1428 = this.field1428.substring(0, this.field1428.length() - 1);
                            this.field1470 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1643 = false;
                            this.field1470 = true;
                            if (this.field1301 == 1) {
                                long var3 = JString.method298(this.field1428);
                                this.method506(0, var3);
                            }
                            if (this.field1301 == 2 && this.field1525 > 0) {
                                long var5 = JString.method298(this.field1428);
                                this.method455(var5, 37517);
                            }
                            if (this.field1301 == 3 && this.field1428.length() > 0) {
                                this.field1271.method216(-34003, 107);
                                this.field1271.method217(0);
                                int var7 = this.field1271.field710;
                                this.field1271.method223(this.field1388, true);
                                WordPack.method305(this.field1428, this.field1271, 991);
                                this.field1271.method226(this.field1271.field710 - var7, this.field1573);
                                this.field1428 = WordPack.method306(this.field1428, this.field1663);
                                this.field1428 = WordFilter.method397(this.field1428, this.field1663);
                                this.method428(6, (byte) -115, this.field1428, JString.method302(JString.method299(this.field1388, true), true));
                                if (this.field1316 == 2) {
                                    this.field1316 = 1;
                                    this.field1483 = true;
                                    this.field1271.method216(-34003, 161);
                                    this.field1271.method217(this.field1264);
                                    this.field1271.method217(this.field1316);
                                    this.field1271.method217(this.field1589);
                                }
                            }
                            if (this.field1301 == 4 && this.field1378 < 100) {
                                long var8 = JString.method298(this.field1428);
                                this.method466((byte) -37, var8);
                            }
                            if (this.field1301 == 5 && this.field1378 > 0) {
                                long var10 = JString.method298(this.field1428);
                                this.method553(-197, var10);
                            }
                        }
                    } else if (this.field1401) {
                        if (var2 >= 48 && var2 <= 57 && this.field1513.length() < 10) {
                            this.field1513 = this.field1513 + (char) var2;
                            this.field1470 = true;
                        }
                        if (var2 == 8 && this.field1513.length() > 0) {
                            this.field1513 = this.field1513.substring(0, this.field1513.length() - 1);
                            this.field1470 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1513.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1513);
                                } catch (Exception var19) {
                                }
                                this.field1271.method216(-34003, 180);
                                this.field1271.method221(var12);
                            }
                            this.field1401 = false;
                            this.field1470 = true;
                        }
                    } else if (this.field1674 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1562.length() < 80) {
                            this.field1562 = this.field1562 + (char) var2;
                            this.field1470 = true;
                        }
                        if (var2 == 8 && this.field1562.length() > 0) {
                            this.field1562 = this.field1562.substring(0, this.field1562.length() - 1);
                            this.field1470 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1562.length() > 0) {
                            if (this.field1609 == 2) {
                                if (this.field1562.equals("::clientdrop")) {
                                    this.method510((byte) 7);
                                }
                                if (this.field1562.equals("::lag")) {
                                    this.method440((byte) -11);
                                }
                                if (this.field1562.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1235.method270(2, (byte) 7); ++var13) {
                                        this.field1235.method280(7, 2, (byte) 1, var13);
                                    }
                                }
                            }
                            if (this.field1562.startsWith("::")) {
                                this.field1271.method216(-34003, 34);
                                this.field1271.method217(this.field1562.length() - 1);
                                this.field1271.method224(this.field1562.substring(2));
                            } else {
                                String var14 = this.field1562.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1562 = this.field1562.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1562 = this.field1562.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1562 = this.field1562.substring(6);
                                }
                                String var16 = this.field1562.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field1562 = this.field1562.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field1562 = this.field1562.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field1562 = this.field1562.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field1562 = this.field1562.substring(6);
                                }
                                this.field1271.method216(-34003, 156);
                                this.field1271.method217(0);
                                int var18 = this.field1271.field710;
                                this.field1271.method217(var15);
                                this.field1271.method217(var17);
                                WordPack.method305(this.field1562, this.field1271, 991);
                                this.field1271.method226(this.field1271.field710 - var18, this.field1573);
                                this.field1562 = WordPack.method306(this.field1562, this.field1663);
                                this.field1562 = WordFilter.method397(this.field1562, this.field1663);
                                field1468.field408 = this.field1562;
                                field1468.field410 = var15;
                                field1468.field411 = var17;
                                field1468.field409 = 150;
                                if (this.field1609 == 2) {
                                    this.method428(2, (byte) -115, field1468.field408, "@cr2@" + field1468.field457);
                                } else if (this.field1609 == 1) {
                                    this.method428(2, (byte) -115, field1468.field408, "@cr1@" + field1468.field457);
                                } else {
                                    this.method428(2, (byte) -115, field1468.field408, field1468.field457);
                                }
                                if (this.field1264 == 2) {
                                    this.field1264 = 3;
                                    this.field1483 = true;
                                    this.field1271.method216(-34003, 161);
                                    this.field1271.method217(this.field1264);
                                    this.field1271.method217(this.field1316);
                                    this.field1271.method217(this.field1589);
                                }
                            }
                            this.field1562 = "";
                            this.field1470 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1360.length() < 12) {
                this.field1360 = this.field1360 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1657 && !this.field1476 && !this.field1241) {
            ++field1596;
            if (!this.field1284) {
                this.method477((byte) -21, false);
            } else {
                this.method534(false);
            }
            this.field1487 = 0;
            if (arg0 == 1) {
                boolean var2 = false;
            }
        } else {
            this.method464(9);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method545(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1401) {
                this.field1401 = false;
                this.field1470 = true;
            }
            int var3 = this.field1258[arg0];
            int var4 = this.field1259[arg0];
            int var5 = this.field1260[arg0];
            int var6 = this.field1261[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 721) {
                field1659 += var4;
                if (field1659 >= 139) {
                    this.field1271.method216(-34003, 195);
                    this.field1271.method221(0);
                }
                this.method489(var6, 45, false, var4, var3);
            }
            if (var5 == 718) {
                if (!this.field1367) {
                    this.field1613.method88(super.field29 - 4, this.field1282, super.field28 - 4);
                } else {
                    this.field1613.method88(var4 - 4, this.field1282, var3 - 4);
                }
            }
            if (var5 == 131) {
                PlayerEntity var7 = this.field1646[var6];
                if (var7 != null) {
                    this.method535(1, field1468.field446[0], 0, var7.field447[0], 0, 0, false, 2, 124, 1, var7.field446[0], field1468.field447[0]);
                    this.field1236 = super.field28;
                    this.field1237 = super.field29;
                    this.field1239 = 2;
                    this.field1238 = 0;
                    this.field1271.method216(-34003, 138);
                    this.field1271.method218(var6);
                    this.field1271.method218(this.field1416);
                }
            }
            if (var5 == 507 || var5 == 957) {
                String var8 = this.field1318[arg0];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    String var10 = var8.substring(var9 + 5).trim();
                    String var11 = JString.method302(JString.method299(JString.method298(var10), true), true);
                    boolean var12 = false;
                    for (int var13 = 0; var13 < this.field1647; ++var13) {
                        PlayerEntity var14 = this.field1646[this.field1648[var13]];
                        if (var14 != null && var14.field457 != null && var14.field457.equalsIgnoreCase(var11)) {
                            this.method535(1, field1468.field446[0], 0, var14.field447[0], 0, 0, false, 2, 124, 1, var14.field446[0], field1468.field447[0]);
                            if (var5 == 507) {
                                field1242 += var6;
                                if (field1242 >= 66) {
                                    this.field1271.method216(-34003, 46);
                                    this.field1271.method217(154);
                                }
                                this.field1271.method216(-34003, 189);
                            }
                            if (var5 == 957) {
                                ++field1291;
                                if (field1291 >= 52) {
                                    this.field1271.method216(-34003, 49);
                                    this.field1271.method217(131);
                                }
                                this.field1271.method216(-34003, 220);
                            }
                            this.field1271.method218(this.field1648[var13]);
                            var12 = true;
                            break;
                        }
                    }
                    if (!var12) {
                        this.method428(0, (byte) -115, "Unable to find " + var11, "");
                    }
                }
            }
            if (var5 == 625) {
                this.method489(var6, 10, false, var4, var3);
            }
            if (var5 == 1152) {
                ObjType var15 = ObjType.method344(var6);
                String var16;
                if (var15.field1053 != null) {
                    var16 = new String(var15.field1053);
                } else {
                    var16 = "It's a " + var15.field1052 + ".";
                }
                this.method428(0, (byte) -115, var16, "");
            }
            if (var5 == 737) {
                this.method439(3);
            }
            if (var5 == 902) {
                String var17 = this.field1318[arg0];
                int var18 = var17.indexOf("@whi@");
                if (var18 != -1) {
                    long var19 = JString.method298(var17.substring(var18 + 5).trim());
                    int var21 = -1;
                    for (int var22 = 0; var22 < this.field1525; ++var22) {
                        if (this.field1400[var22] == var19) {
                            var21 = var22;
                            break;
                        }
                    }
                    if (var21 != -1 && this.field1315[var21] > 0) {
                        this.field1470 = true;
                        this.field1401 = false;
                        this.field1643 = true;
                        this.field1428 = "";
                        this.field1301 = 3;
                        this.field1388 = this.field1400[var21];
                        this.field1523 = "Enter message to send to " + this.field1465[var21];
                    }
                }
            }
            if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                String var23 = this.field1318[arg0];
                int var24 = var23.indexOf("@whi@");
                if (var24 != -1) {
                    long var25 = JString.method298(var23.substring(var24 + 5).trim());
                    if (var5 == 605) {
                        this.method506(0, var25);
                    }
                    if (var5 == 47) {
                        this.method466((byte) -37, var25);
                    }
                    if (var5 == 513) {
                        this.method455(var25, 37517);
                    }
                    if (var5 == 884) {
                        this.method553(-197, var25);
                    }
                }
            }
            if (var5 == 563) {
                this.field1271.method216(-34003, 112);
                this.field1271.method218(var6);
                this.field1271.method218(var3);
                this.field1271.method218(var4);
                this.field1271.method218(this.field1416);
                this.field1569 = 0;
                this.field1570 = var4;
                this.field1571 = var3;
                this.field1572 = 2;
                if (Component.field67[var4].field73 == this.field1620) {
                    this.field1572 = 1;
                }
                if (Component.field67[var4].field73 == this.field1674) {
                    this.field1572 = 3;
                }
            }
            if (var5 == 274) {
                Component var27 = Component.field67[var4];
                this.field1415 = 1;
                this.field1416 = var4;
                this.field1417 = var27.field127;
                this.field1373 = 0;
                this.field1319 = true;
                String var28 = var27.field125;
                if (var28.indexOf(" ") != -1) {
                    var28 = var28.substring(0, var28.indexOf(" "));
                }
                String var29 = var27.field125;
                if (var29.indexOf(" ") != -1) {
                    var29 = var29.substring(var29.indexOf(" ") + 1);
                }
                this.field1418 = var28 + " " + var27.field126 + " " + var29;
                if (this.field1417 == 16) {
                    this.field1319 = true;
                    this.field1448 = 3;
                    this.field1575 = true;
                }
            } else {
                if (var5 == 225) {
                    this.field1271.method216(-34003, 86);
                    this.field1271.method218(var4);
                    Component var30 = Component.field67[var4];
                    if (var30.field82 != null && var30.field82[0][0] == 5) {
                        int var31 = var30.field82[0][1];
                        if (this.field1635[var31] != var30.field84[0]) {
                            this.field1635[var31] = var30.field84[0];
                            this.method558(true, var31);
                            this.field1319 = true;
                        }
                    }
                }
                if (var5 == 524) {
                    String var32 = this.field1318[arg0];
                    int var33 = var32.indexOf("@whi@");
                    if (var33 != -1) {
                        if (this.field1620 == -1) {
                            this.method439(3);
                            this.field1360 = var32.substring(var33 + 5).trim();
                            this.field1408 = false;
                            for (int var34 = 0; var34 < Component.field67.length; ++var34) {
                                if (Component.field67[var34] != null && Component.field67[var34].field76 == 600) {
                                    this.field1638 = this.field1620 = Component.field67[var34].field73;
                                    break;
                                }
                            }
                        } else {
                            this.method428(0, (byte) -115, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var35 = this.field1429[var6];
                    if (var35 != null) {
                        this.method535(1, field1468.field446[0], 0, var35.field447[0], 0, 0, false, 2, 124, 1, var35.field446[0], field1468.field447[0]);
                        this.field1236 = super.field28;
                        this.field1237 = super.field29;
                        this.field1239 = 2;
                        this.field1238 = 0;
                        if (var5 == 242) {
                            this.field1271.method216(-34003, 252);
                        }
                        if (var5 == 209) {
                            this.field1271.method216(-34003, 21);
                        }
                        if (var5 == 793) {
                            this.field1271.method216(-34003, 247);
                        }
                        if (var5 == 309) {
                            this.field1271.method216(-34003, 178);
                        }
                        if (var5 == 852) {
                            this.field1271.method216(-34003, 30);
                        }
                        this.field1271.method218(var6);
                    }
                }
                if (var5 == 231) {
                    Component var36 = Component.field67[var4];
                    boolean var37 = true;
                    if (var36.field76 > 0) {
                        var37 = this.method430((byte) -16, var36);
                    }
                    if (var37) {
                        this.field1271.method216(-34003, 86);
                        this.field1271.method218(var4);
                    }
                }
                if (var5 == 1714) {
                    NpcEntity var38 = this.field1429[var6];
                    if (var38 != null) {
                        String var39;
                        if (var38.field454.field1012 != null) {
                            var39 = new String(var38.field454.field1012);
                        } else {
                            var39 = "It's a " + var38.field454.field1011 + ".";
                        }
                        this.method428(0, (byte) -115, var39, "");
                    }
                }
                if (var5 == 398) {
                    this.field1271.method216(-34003, 200);
                    this.field1271.method218(var6);
                    this.field1271.method218(var3);
                    this.field1271.method218(var4);
                    this.field1271.method218(this.field1376);
                    this.field1271.method218(this.field1374);
                    this.field1271.method218(this.field1375);
                    this.field1569 = 0;
                    this.field1570 = var4;
                    this.field1571 = var3;
                    this.field1572 = 2;
                    if (Component.field67[var4].field73 == this.field1620) {
                        this.field1572 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1674) {
                        this.field1572 = 3;
                    }
                }
                if (var5 == 102) {
                    this.field1373 = 1;
                    this.field1374 = var3;
                    this.field1375 = var4;
                    this.field1376 = var6;
                    this.field1377 = ObjType.method344(var6).field1052;
                    this.field1415 = 0;
                    this.field1319 = true;
                } else {
                    if (var5 == 997 && !this.field1356) {
                        this.field1271.method216(-34003, 166);
                        this.field1271.method218(var4);
                        this.field1356 = true;
                    }
                    if (var5 == 899 && this.method489(var6, 218, false, var4, var3)) {
                        this.field1271.method218(this.field1416);
                    }
                    if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                        if (var5 == 100) {
                            this.field1271.method216(-34003, 79);
                        }
                        if (var5 == 681) {
                            ++field1521;
                            if (field1521 >= 116) {
                                this.field1271.method216(-34003, 88);
                                this.field1271.method220(13018169);
                            }
                            this.field1271.method216(-34003, 191);
                        }
                        if (var5 == 694) {
                            this.field1271.method216(-34003, 76);
                        }
                        if (var5 == 795) {
                            this.field1271.method216(-34003, 40);
                        }
                        if (var5 == 962) {
                            this.field1271.method216(-34003, 177);
                        }
                        this.field1271.method218(var6);
                        this.field1271.method218(var3);
                        this.field1271.method218(var4);
                        this.field1569 = 0;
                        this.field1570 = var4;
                        this.field1571 = var3;
                        this.field1572 = 2;
                        if (Component.field67[var4].field73 == this.field1620) {
                            this.field1572 = 1;
                        }
                        if (Component.field67[var4].field73 == this.field1674) {
                            this.field1572 = 3;
                        }
                    }
                    if (var5 == 275) {
                        PlayerEntity var40 = this.field1646[var6];
                        if (var40 != null) {
                            this.method535(1, field1468.field446[0], 0, var40.field447[0], 0, 0, false, 2, 124, 1, var40.field446[0], field1468.field447[0]);
                            this.field1236 = super.field28;
                            this.field1237 = super.field29;
                            this.field1239 = 2;
                            this.field1238 = 0;
                            this.field1271.method216(-34003, 16);
                            this.field1271.method218(var6);
                            this.field1271.method218(this.field1376);
                            this.field1271.method218(this.field1374);
                            this.field1271.method218(this.field1375);
                        }
                    }
                    if (var5 == 240) {
                        NpcEntity var41 = this.field1429[var6];
                        if (var41 != null) {
                            this.method535(1, field1468.field446[0], 0, var41.field447[0], 0, 0, false, 2, 124, 1, var41.field446[0], field1468.field447[0]);
                            this.field1236 = super.field28;
                            this.field1237 = super.field29;
                            this.field1239 = 2;
                            this.field1238 = 0;
                            this.field1271.method216(-34003, 108);
                            this.field1271.method218(var6);
                            this.field1271.method218(this.field1416);
                        }
                    }
                    if (var5 == 743) {
                        ++field1601;
                        if (field1601 >= 124) {
                            this.field1271.method216(-34003, 81);
                            this.field1271.method218(37954);
                        }
                        this.method489(var6, 196, false, var4, var3);
                    }
                    if (var5 == 111) {
                        boolean var42 = this.method535(0, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 0, var3, field1468.field447[0]);
                        if (!var42) {
                            this.method535(1, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 1, var3, field1468.field447[0]);
                        }
                        this.field1236 = super.field28;
                        this.field1237 = super.field29;
                        this.field1239 = 2;
                        this.field1238 = 0;
                        this.field1271.method216(-34003, 55);
                        this.field1271.method218(this.field1605 + var3);
                        this.field1271.method218(this.field1606 + var4);
                        this.field1271.method218(var6);
                        this.field1271.method218(this.field1376);
                        this.field1271.method218(this.field1374);
                        this.field1271.method218(this.field1375);
                    }
                    if (var5 == 810 && this.method489(var6, 184, false, var4, var3)) {
                        this.field1271.method218(this.field1376);
                        this.field1271.method218(this.field1374);
                        this.field1271.method218(this.field1375);
                    }
                    if (var5 == 829) {
                        NpcEntity var44 = this.field1429[var6];
                        if (var44 != null) {
                            this.method535(1, field1468.field446[0], 0, var44.field447[0], 0, 0, false, 2, 124, 1, var44.field446[0], field1468.field447[0]);
                            this.field1236 = super.field28;
                            this.field1237 = super.field29;
                            this.field1239 = 2;
                            this.field1238 = 0;
                            this.field1271.method216(-34003, 160);
                            this.field1271.method218(var6);
                            this.field1271.method218(this.field1376);
                            this.field1271.method218(this.field1374);
                            this.field1271.method218(this.field1375);
                        }
                    }
                    if (var5 == 1381) {
                        int var45 = var6 >> 14 & 32767;
                        LocType var46 = LocType.method328(var45);
                        String var47;
                        if (var46.field962 != null) {
                            var47 = new String(var46.field962);
                        } else {
                            var47 = "It's a " + var46.field961 + ".";
                        }
                        this.method428(0, (byte) -115, var47, "");
                    }
                    if (var5 == 1071) {
                        this.method489(var6, 126, false, var4, var3);
                    }
                    if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                        boolean var48 = this.method535(0, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 0, var3, field1468.field447[0]);
                        if (!var48) {
                            this.method535(1, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 1, var3, field1468.field447[0]);
                        }
                        this.field1236 = super.field28;
                        this.field1237 = super.field29;
                        this.field1239 = 2;
                        this.field1238 = 0;
                        if (var5 == 662) {
                            field1407 += this.field1606;
                            if (field1407 >= 118) {
                                this.field1271.method216(-34003, 122);
                                this.field1271.method221(0);
                            }
                            this.field1271.method216(-34003, 22);
                        }
                        if (var5 == 139) {
                            if ((var3 & 3) == 0) {
                                ++field1535;
                            }
                            if (field1535 >= 123) {
                                this.field1271.method216(-34003, 133);
                                this.field1271.method221(0);
                            }
                            this.field1271.method216(-34003, 97);
                        }
                        if (var5 == 778) {
                            this.field1271.method216(-34003, 4);
                        }
                        if (var5 == 617) {
                            this.field1271.method216(-34003, 110);
                        }
                        if (var5 == 224) {
                            field1467 += var4;
                            if (field1467 >= 75) {
                                this.field1271.method216(-34003, 168);
                                this.field1271.method217(19);
                            }
                            this.field1271.method216(-34003, 147);
                        }
                        this.field1271.method218(this.field1605 + var3);
                        this.field1271.method218(this.field1606 + var4);
                        this.field1271.method218(var6);
                    }
                    if (var5 == 435) {
                        this.field1271.method216(-34003, 86);
                        this.field1271.method218(var4);
                        Component var50 = Component.field67[var4];
                        if (var50.field82 != null && var50.field82[0][0] == 5) {
                            int var51 = var50.field82[0][1];
                            this.field1635[var51] = 1 - this.field1635[var51];
                            this.method558(true, var51);
                            this.field1319 = true;
                        }
                    }
                    if (var5 == 357) {
                        this.method489(var6, 53, false, var4, var3);
                    }
                    if (var5 == 370) {
                        boolean var52 = this.method535(0, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 0, var3, field1468.field447[0]);
                        if (!var52) {
                            this.method535(1, field1468.field446[0], 0, var4, 0, 0, false, 2, 124, 1, var3, field1468.field447[0]);
                        }
                        this.field1236 = super.field28;
                        this.field1237 = super.field29;
                        this.field1239 = 2;
                        this.field1238 = 0;
                        this.field1271.method216(-34003, 241);
                        this.field1271.method218(this.field1605 + var3);
                        this.field1271.method218(this.field1606 + var4);
                        this.field1271.method218(var6);
                        this.field1271.method218(this.field1416);
                    }
                    if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                        PlayerEntity var54 = this.field1646[var6];
                        if (var54 != null) {
                            this.method535(1, field1468.field446[0], 0, var54.field447[0], 0, 0, false, 2, 124, 1, var54.field446[0], field1468.field447[0]);
                            this.field1236 = super.field28;
                            this.field1237 = super.field29;
                            this.field1239 = 2;
                            this.field1238 = 0;
                            if (var5 == 185) {
                                this.field1271.method216(-34003, 69);
                            }
                            if (var5 == 387) {
                                field1242 += var6;
                                if (field1242 >= 66) {
                                    this.field1271.method216(-34003, 46);
                                    this.field1271.method217(154);
                                }
                                this.field1271.method216(-34003, 189);
                            }
                            if (var5 == 499) {
                                this.field1271.method216(-34003, 51);
                            }
                            if (var5 == 639) {
                                ++field1291;
                                if (field1291 >= 52) {
                                    this.field1271.method216(-34003, 49);
                                    this.field1271.method217(131);
                                }
                                this.field1271.method216(-34003, 220);
                            }
                            if (var5 == 27) {
                                this.field1271.method216(-34003, 13);
                            }
                            this.field1271.method218(var6);
                        }
                    }
                    if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                        if (var5 == 555) {
                            this.field1271.method216(-34003, 124);
                        }
                        if (var5 == 113) {
                            this.field1271.method216(-34003, 111);
                        }
                        if (var5 == 354) {
                            this.field1271.method216(-34003, 227);
                        }
                        if (var5 == 582) {
                            if ((var6 & 3) == 0) {
                                ++field1695;
                            }
                            if (field1695 >= 133) {
                                this.field1271.method216(-34003, 73);
                                this.field1271.method218(6118);
                            }
                            this.field1271.method216(-34003, 44);
                        }
                        if (var5 == 331) {
                            this.field1271.method216(-34003, 248);
                        }
                        this.field1271.method218(var6);
                        this.field1271.method218(var3);
                        this.field1271.method218(var4);
                        this.field1569 = 0;
                        this.field1570 = var4;
                        this.field1571 = var3;
                        this.field1572 = 2;
                        if (Component.field67[var4].field73 == this.field1620) {
                            this.field1572 = 1;
                        }
                        if (Component.field67[var4].field73 == this.field1674) {
                            this.field1572 = 3;
                        }
                    }
                    if (var5 == 1328) {
                        ObjType var55 = ObjType.method344(var6);
                        Component var56 = Component.field67[var4];
                        String var57;
                        if (var56 != null && var56.field69[var3] >= 100000) {
                            var57 = var56.field69[var3] + " x " + var55.field1052;
                        } else if (var55.field1053 != null) {
                            var57 = new String(var55.field1053);
                        } else {
                            var57 = "It's a " + var55.field1052 + ".";
                        }
                        this.method428(0, (byte) -115, var57, "");
                    }
                    this.field1373 = 0;
                    int var58 = 14 / arg1;
                    this.field1415 = 0;
                    this.field1319 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method546(boolean arg0) {
        if (this.field1373 == 0 && this.field1415 == 0) {
            this.field1318[this.field1392] = "Walk here";
            this.field1260[this.field1392] = 718;
            this.field1258[this.field1392] = super.field21;
            this.field1259[this.field1392] = super.field22;
            ++this.field1392;
        }
        int var2 = -1;
        this.field1284 &= arg0;
        for (int var3 = 0; var3 < Model.field597; ++var3) {
            int var4 = Model.field598[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1613.method80(this.field1576, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method328(var8);
                    if (var9.field993 != null) {
                        VarbitType var10 = VarbitType.field1188[var9.field992];
                        int var11 = var10.field1190;
                        int var12 = var10.field1191;
                        int var13 = var10.field1192;
                        int var14 = field1509[var13 - var12];
                        int var15 = this.field1635[var11] >> var12 & var14;
                        if (var15 < 0 || var15 >= var9.field993.length || var9.field993[var15] == -1) {
                            continue;
                        }
                        var9 = LocType.method328(var9.field993[var15]);
                    }
                    if (this.field1373 == 1) {
                        this.field1318[this.field1392] = "Use " + this.field1377 + " with @cya@" + var9.field961;
                        this.field1260[this.field1392] = 810;
                        this.field1261[this.field1392] = var4;
                        this.field1258[this.field1392] = var5;
                        this.field1259[this.field1392] = var6;
                        ++this.field1392;
                    } else if (this.field1415 == 1) {
                        if ((this.field1417 & 4) == 4) {
                            this.field1318[this.field1392] = this.field1418 + " @cya@" + var9.field961;
                            this.field1260[this.field1392] = 899;
                            this.field1261[this.field1392] = var4;
                            this.field1258[this.field1392] = var5;
                            this.field1259[this.field1392] = var6;
                            ++this.field1392;
                        }
                    } else {
                        if (var9.field977 != null) {
                            for (int var16 = 4; var16 >= 0; --var16) {
                                if (var9.field977[var16] != null) {
                                    this.field1318[this.field1392] = var9.field977[var16] + " @cya@" + var9.field961;
                                    if (var16 == 0) {
                                        this.field1260[this.field1392] = 625;
                                    }
                                    if (var16 == 1) {
                                        this.field1260[this.field1392] = 721;
                                    }
                                    if (var16 == 2) {
                                        this.field1260[this.field1392] = 743;
                                    }
                                    if (var16 == 3) {
                                        this.field1260[this.field1392] = 357;
                                    }
                                    if (var16 == 4) {
                                        this.field1260[this.field1392] = 1071;
                                    }
                                    this.field1261[this.field1392] = var4;
                                    this.field1258[this.field1392] = var5;
                                    this.field1259[this.field1392] = var6;
                                    ++this.field1392;
                                }
                            }
                        }
                        this.field1318[this.field1392] = "Examine @cya@" + var9.field961;
                        this.field1260[this.field1392] = 1381;
                        this.field1261[this.field1392] = var9.field958 << 14;
                        this.field1258[this.field1392] = var5;
                        this.field1259[this.field1392] = var6;
                        ++this.field1392;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var17 = this.field1429[var8];
                    if (var17.field454.field1013 == 1 && (var17.field396 & 127) == 64 && (var17.field397 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field1430; ++var18) {
                            NpcEntity var21 = this.field1429[this.field1431[var18]];
                            if (var21 != null && var17 != var21 && var21.field454.field1013 == 1 && var17.field396 == var21.field396 && var17.field397 == var21.field397) {
                                this.method469(this.field1431[var18], var21.field454, var5, 559, var6);
                            }
                        }
                        for (int var19 = 0; var19 < this.field1647; ++var19) {
                            PlayerEntity var20 = this.field1646[this.field1648[var19]];
                            if (var20 != null && var17.field396 == var20.field396 && var17.field397 == var20.field397) {
                                this.method523(var6, 705, var20, var5, this.field1648[var19]);
                            }
                        }
                    }
                    this.method469(var8, var17.field454, var5, 559, var6);
                }
                if (var7 == 0) {
                    PlayerEntity var22 = this.field1646[var8];
                    if ((var22.field396 & 127) == 64 && (var22.field397 & 127) == 64) {
                        for (int var23 = 0; var23 < this.field1430; ++var23) {
                            NpcEntity var26 = this.field1429[this.field1431[var23]];
                            if (var26 != null && var26.field454.field1013 == 1 && var22.field396 == var26.field396 && var22.field397 == var26.field397) {
                                this.method469(this.field1431[var23], var26.field454, var5, 559, var6);
                            }
                        }
                        for (int var24 = 0; var24 < this.field1647; ++var24) {
                            PlayerEntity var25 = this.field1646[this.field1648[var24]];
                            if (var25 != null && var22 != var25 && var22.field396 == var25.field396 && var22.field397 == var25.field397) {
                                this.method523(var6, 705, var25, var5, this.field1648[var24]);
                            }
                        }
                    }
                    this.method523(var6, 705, var22, var5, var8);
                }
                if (var7 == 3) {
                    LinkList var27 = this.field1567[this.field1576][var5][var6];
                    if (var27 != null) {
                        for (ObjStackEntity var28 = (ObjStackEntity) var27.method247(0); var28 != null; var28 = (ObjStackEntity) var27.method249(-20683)) {
                            ObjType var29 = ObjType.method344(var28.field496);
                            if (this.field1373 == 1) {
                                this.field1318[this.field1392] = "Use " + this.field1377 + " with @lre@" + var29.field1052;
                                this.field1260[this.field1392] = 111;
                                this.field1261[this.field1392] = var28.field496;
                                this.field1258[this.field1392] = var5;
                                this.field1259[this.field1392] = var6;
                                ++this.field1392;
                            } else if (this.field1415 == 1) {
                                if ((this.field1417 & 1) == 1) {
                                    this.field1318[this.field1392] = this.field1418 + " @lre@" + var29.field1052;
                                    this.field1260[this.field1392] = 370;
                                    this.field1261[this.field1392] = var28.field496;
                                    this.field1258[this.field1392] = var5;
                                    this.field1259[this.field1392] = var6;
                                    ++this.field1392;
                                }
                            } else {
                                for (int var30 = 4; var30 >= 0; --var30) {
                                    if (var29.field1066 != null && var29.field1066[var30] != null) {
                                        this.field1318[this.field1392] = var29.field1066[var30] + " @lre@" + var29.field1052;
                                        if (var30 == 0) {
                                            this.field1260[this.field1392] = 139;
                                        }
                                        if (var30 == 1) {
                                            this.field1260[this.field1392] = 778;
                                        }
                                        if (var30 == 2) {
                                            this.field1260[this.field1392] = 617;
                                        }
                                        if (var30 == 3) {
                                            this.field1260[this.field1392] = 224;
                                        }
                                        if (var30 == 4) {
                                            this.field1260[this.field1392] = 662;
                                        }
                                        this.field1261[this.field1392] = var28.field496;
                                        this.field1258[this.field1392] = var5;
                                        this.field1259[this.field1392] = var6;
                                        ++this.field1392;
                                    } else if (var30 == 2) {
                                        this.field1318[this.field1392] = "Take @lre@" + var29.field1052;
                                        this.field1260[this.field1392] = 617;
                                        this.field1261[this.field1392] = var28.field496;
                                        this.field1258[this.field1392] = var5;
                                        this.field1259[this.field1392] = var6;
                                        ++this.field1392;
                                    }
                                }
                                this.field1318[this.field1392] = "Examine @lre@" + var29.field1052;
                                this.field1260[this.field1392] = 1152;
                                this.field1261[this.field1392] = var28.field496;
                                this.field1258[this.field1392] = var5;
                                this.field1259[this.field1392] = var6;
                                ++this.field1392;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method547(int arg0) {
        if (arg0 <= 0) {
            this.field1591 = -1;
        }
        if (this.field1426 == 2) {
            this.method486((this.field1669 - this.field1605 << 7) + this.field1672, this.field1671 * 2, (byte) -79, (this.field1670 - this.field1606 << 7) + this.field1673);
            if (this.field1485 > -1 && field1661 % 20 < 10) {
                this.field1604[2].method185(this.field1486 - 28, this.field1634, this.field1485 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method548(int arg0, int arg1, int arg2) {
        if (arg2 != -41081) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIII)V")
    public final void method549(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 6) {
            this.field1457 = !this.field1457;
        }
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = Model.field599[var8];
            int var14 = Model.field600[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field599[var9];
            int var17 = Model.field600[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1296 = arg5 - var10;
        this.field1297 = arg3 - var11;
        this.field1298 = arg4 - var12;
        this.field1299 = arg6;
        this.field1300 = arg2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;Z)V")
    private final void method550(LocSpawned arg0, boolean arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (arg0.field729 == 0) {
            var3 = this.field1613.method76(arg0.field728, arg0.field730, arg0.field731);
        }
        if (arg0.field729 == 1) {
            var3 = this.field1613.method77(arg0.field731, 7, arg0.field728, arg0.field730);
        }
        if (arg0.field729 == 2) {
            var3 = this.field1613.method78(arg0.field728, arg0.field730, arg0.field731);
        }
        if (arg0.field729 == 3) {
            var3 = this.field1613.method79(arg0.field728, arg0.field730, arg0.field731);
        }
        if (var3 != 0) {
            int var8 = this.field1613.method80(arg0.field728, arg0.field730, arg0.field731, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var8 & 31;
            var6 = var8 >> 6;
        }
        arg0.field732 = var4;
        arg0.field734 = var5;
        arg0.field733 = var6;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILlb;I)V")
    private final void method551(int arg0, Packet arg1, int arg2) {
        int var10000 = arg0 + arg2;
        for (int var5 = 0; var5 < this.field1649; ++var5) {
            int var6 = this.field1650[var5];
            NpcEntity var7 = this.field1429[var6];
            int var8 = arg1.method227();
            if ((var8 & 1) == 1) {
                int var9 = arg1.method227();
                int var10 = arg1.method227();
                var7.method114(var10, field1661, var9, false);
                var7.field415 = field1661 + 300;
                var7.field416 = arg1.method227();
                var7.field417 = arg1.method227();
            }
            if ((var8 & 2) == 2) {
                int var11 = arg1.method229();
                if (var11 == 65535) {
                    var11 = -1;
                }
                if (var7.field424 == var11) {
                    var7.field428 = 0;
                }
                int var12 = arg1.method227();
                if (var7.field424 == var11 && var11 != -1) {
                    int var13 = SeqType.field1150[var11].field1164;
                    if (var13 == 1) {
                        var7.field425 = 0;
                        var7.field426 = 0;
                        var7.field427 = var12;
                        var7.field428 = 0;
                    }
                    if (var13 == 2) {
                        var7.field428 = 0;
                    }
                } else if (var11 == -1 || var7.field424 == -1 || SeqType.field1150[var11].field1158 >= SeqType.field1150[var7.field424].field1158) {
                    var7.field424 = var11;
                    var7.field425 = 0;
                    var7.field426 = 0;
                    var7.field427 = var12;
                    var7.field428 = 0;
                    var7.field450 = var7.field445;
                }
            }
            if ((var8 & 4) == 4) {
                var7.field418 = arg1.method229();
                if (var7.field418 == 65535) {
                    var7.field418 = -1;
                }
            }
            if ((var8 & 8) == 8) {
                var7.field408 = arg1.method234();
                var7.field409 = 100;
            }
            if ((var8 & 16) == 16) {
                int var14 = arg1.method227();
                int var15 = arg1.method227();
                var7.method114(var15, field1661, var14, false);
                var7.field415 = field1661 + 300;
                var7.field416 = arg1.method227();
                var7.field417 = arg1.method227();
            }
            if ((var8 & 32) == 32) {
                var7.field454 = NpcType.method338(arg1.method229());
                var7.field400 = var7.field454.field1013;
                var7.field444 = var7.field454.field1035;
                var7.field403 = var7.field454.field1017;
                var7.field404 = var7.field454.field1018;
                var7.field405 = var7.field454.field1019;
                var7.field406 = var7.field454.field1020;
                var7.field401 = var7.field454.field1016;
            }
            if ((var8 & 64) == 64) {
                var7.field429 = arg1.method229();
                int var16 = arg1.method232();
                var7.field433 = var16 >> 16;
                var7.field432 = (var16 & 65535) + field1661;
                var7.field430 = 0;
                var7.field431 = 0;
                if (var7.field432 > field1661) {
                    var7.field430 = -1;
                }
                if (var7.field429 == 65535) {
                    var7.field429 = -1;
                }
            }
            if ((var8 & 128) == 128) {
                var7.field419 = arg1.method229();
                var7.field420 = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILib;II)V")
    public final void method552(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1380 + this.field1351 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field599[var5];
            int var8 = Model.field600[var5];
            int var9 = var7 * 256 / (this.field1496 + 256);
            int var10 = var8 * 256 / (this.field1496 + 256);
            if (arg2 <= 0) {
                for (int var11 = 1; var11 > 0; ++var11) {
                }
            }
            int var12 = arg0 * var10 + arg3 * var9 >> 16;
            int var13 = arg3 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method191(var12 + 94 - arg1.field670 / 2 + 4, this.field1565, true, 83 - var13 - arg1.field671 / 2 - 4);
            } else {
                arg1.method185(83 - var13 - arg1.field671 / 2 - 4, this.field1634, var12 + 94 - arg1.field670 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method553(int arg0, long arg1) {
        if (arg0 >= 0) {
            this.field1477 = -168;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1378; ++var4) {
                if (this.field1675[var4] == arg1) {
                    --this.field1378;
                    this.field1319 = true;
                    for (int var5 = var4; var5 < this.field1378; ++var5) {
                        this.field1675[var5] = this.field1675[var5 + 1];
                    }
                    this.field1271.method216(-34003, 251);
                    this.field1271.method223(arg1, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (arg0 <= 0) {
            this.field1271.method217(126);
        }
        if (this.field1269 == 0) {
            if (super.field27 == 1) {
                int var2 = super.field28 - 25 - 550;
                int var3 = super.field29 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1380 + this.field1351 & 2047;
                    int var5 = Pix3D.field644[var4];
                    int var6 = Pix3D.field645[var4];
                    int var7 = (this.field1496 + 256) * var5 >> 8;
                    int var8 = (this.field1496 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1468.field396 + var9 >> 7;
                    int var12 = field1468.field397 - var10 >> 7;
                    boolean var13 = this.method535(0, field1468.field446[0], 0, var12, 0, 0, true, 1, 124, 0, var11, field1468.field447[0]);
                    if (var13) {
                        this.field1271.method217(var2);
                        this.field1271.method217(var3);
                        this.field1271.method218(this.field1351);
                        this.field1271.method217(57);
                        this.field1271.method217(this.field1380);
                        this.field1271.method217(this.field1496);
                        this.field1271.method217(89);
                        this.field1271.method218(field1468.field396);
                        this.field1271.method218(field1468.field397);
                        this.field1271.method217(this.field1393);
                        this.field1271.method217(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILlb;I)V")
    private final void method555(int arg0, Packet arg1, int arg2) {
        arg1.method237((byte) -51);
        int var4 = arg1.method238(8, false);
        if (var4 < this.field1430) {
            for (int var5 = var4; var5 < this.field1430; ++var5) {
                this.field1362[this.field1361++] = this.field1431[var5];
            }
        }
        if (var4 > this.field1430) {
            signlink.reporterror(this.field1492 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1430 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1431[var6];
                NpcEntity var8 = this.field1429[var7];
                int var9 = arg1.method238(1, false);
                if (var9 == 0) {
                    this.field1431[this.field1430++] = var7;
                    var8.field441 = field1661;
                } else {
                    int var10 = arg1.method238(2, false);
                    if (var10 == 0) {
                        this.field1431[this.field1430++] = var7;
                        var8.field441 = field1661;
                        this.field1650[this.field1649++] = var7;
                    } else if (var10 == 1) {
                        this.field1431[this.field1430++] = var7;
                        var8.field441 = field1661;
                        int var11 = arg1.method238(3, false);
                        var8.method111(false, var11, this.field1574);
                        int var12 = arg1.method238(1, false);
                        if (var12 == 1) {
                            this.field1650[this.field1649++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1431[this.field1430++] = var7;
                        var8.field441 = field1661;
                        int var13 = arg1.method238(3, false);
                        var8.method111(true, var13, this.field1574);
                        int var14 = arg1.method238(3, false);
                        var8.method111(true, var14, this.field1574);
                        int var15 = arg1.method238(1, false);
                        if (var15 == 1) {
                            this.field1650[this.field1649++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1362[this.field1361++] = var7;
                    }
                }
            }
            if (arg2 < 9 || arg2 > 9) {
                this.field1591 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1520 != null) {
                this.field1520.method38();
            }
        } catch (Exception var2) {
        }
        this.field1520 = null;
        this.method429(0);
        if (this.field1287 != null) {
            this.field1287.field997 = false;
        }
        this.field1287 = null;
        this.field1235.method269();
        this.field1235 = null;
        this.field1271 = null;
        this.field1243 = null;
        this.field1553 = null;
        this.field1460 = null;
        this.field1402 = null;
        this.field1394 = null;
        this.field1461 = null;
        this.field1462 = null;
        this.field1286 = null;
        this.field1292 = null;
        this.field1613 = null;
        this.field1443 = null;
        this.field1534 = null;
        this.field1396 = null;
        this.field1441 = null;
        this.field1442 = null;
        this.field1530 = null;
        this.field1616 = null;
        this.field1617 = null;
        this.field1618 = null;
        this.field1619 = null;
        this.field1279 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1544 = null;
        this.field1545 = null;
        this.field1546 = null;
        this.field1547 = null;
        this.field1548 = null;
        this.field1549 = null;
        this.field1550 = null;
        this.field1551 = null;
        this.field1552 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1566 = null;
        this.field1324 = null;
        this.field1325 = null;
        this.field1326 = null;
        this.field1697 = null;
        this.field1557 = null;
        this.field1558 = null;
        this.field1559 = null;
        this.field1560 = null;
        this.field1561 = null;
        this.field1273 = null;
        this.field1274 = null;
        this.field1275 = null;
        this.field1276 = null;
        this.field1277 = null;
        this.field1409 = null;
        this.field1529 = null;
        this.field1604 = null;
        this.field1288 = null;
        this.field1498 = null;
        this.field1499 = null;
        this.field1500 = null;
        this.field1501 = null;
        this.field1662 = null;
        this.field1473 = null;
        this.field1306 = null;
        this.field1646 = null;
        this.field1648 = null;
        this.field1650 = null;
        this.field1651 = null;
        this.field1362 = null;
        this.field1429 = null;
        this.field1431 = null;
        this.field1567 = null;
        this.field1537 = null;
        this.field1339 = null;
        this.field1475 = null;
        this.field1258 = null;
        this.field1259 = null;
        this.field1260 = null;
        this.field1261 = null;
        this.field1318 = null;
        this.field1635 = null;
        this.field1248 = null;
        this.field1249 = null;
        this.field1293 = null;
        if (arg0 <= 0) {
            this.field1567 = null;
        }
        this.field1334 = null;
        this.field1465 = null;
        this.field1400 = null;
        this.field1315 = null;
        this.field1687 = null;
        this.field1688 = null;
        this.field1684 = null;
        this.field1685 = null;
        this.field1686 = null;
        this.field1689 = null;
        this.field1690 = null;
        this.field1691 = null;
        this.field1692 = null;
        this.method539(false);
        LocType.method327((byte) 42);
        NpcType.method337((byte) 42);
        ObjType.method343((byte) 42);
        FloType.field1111 = null;
        IdkType.field1128 = null;
        Component.field67 = null;
        UnkType.field1136 = null;
        SeqType.field1150 = null;
        SpotAnimType.field1173 = null;
        SpotAnimType.field1185 = null;
        VarpType.field1200 = null;
        super.field14 = null;
        PlayerEntity.field481 = null;
        Pix3D.method163((byte) 42);
        World3D.method49((byte) 42);
        Model.method121((byte) 42);
        AnimFrame.method46((byte) 42);
        System.gc();
        if (Linkable.field361) {
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(B)V")
    public final void method556(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
            if (super.field27 == 1) {
                if (super.field28 >= 6 && super.field28 <= 106 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1264 = (this.field1264 + 1) % 4;
                    this.field1483 = true;
                    this.field1470 = true;
                    this.field1271.method216(-34003, 161);
                    this.field1271.method217(this.field1264);
                    this.field1271.method217(this.field1316);
                    this.field1271.method217(this.field1589);
                }
                if (super.field28 >= 135 && super.field28 <= 235 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1316 = (this.field1316 + 1) % 3;
                    this.field1483 = true;
                    this.field1470 = true;
                    this.field1271.method216(-34003, 161);
                    this.field1271.method217(this.field1264);
                    this.field1271.method217(this.field1316);
                    this.field1271.method217(this.field1589);
                }
                if (super.field28 >= 273 && super.field28 <= 373 && super.field29 >= 467 && super.field29 <= 499) {
                    this.field1589 = (this.field1589 + 1) % 3;
                    this.field1483 = true;
                    this.field1470 = true;
                    this.field1271.method216(-34003, 161);
                    this.field1271.method217(this.field1264);
                    this.field1271.method217(this.field1316);
                    this.field1271.method217(this.field1589);
                }
                if (super.field28 >= 412 && super.field28 <= 512 && super.field29 >= 467 && super.field29 <= 499) {
                    if (this.field1620 == -1) {
                        this.method439(3);
                        this.field1360 = "";
                        this.field1408 = false;
                        for (int var3 = 0; var3 < Component.field67.length; ++var3) {
                            if (Component.field67[var3] != null && Component.field67[var3].field76 == 600) {
                                this.field1638 = this.field1620 = Component.field67[var3].field73;
                                return;
                            }
                        }
                        return;
                    }
                    this.method428(0, (byte) -115, "Please close the interface you have open before using 'report abuse'", "");
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method557(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            return arg0 == null ? true : signlink.wavesave(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method558(boolean arg0, int arg1) {
        this.field1284 &= arg0;
        int var3 = VarpType.field1200[arg1].field1208;
        if (var3 != 0) {
            int var4 = this.field1635[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method172(0.9D, 0);
                }
                if (var4 == 2) {
                    Pix3D.method172(0.8D, 0);
                }
                if (var4 == 3) {
                    Pix3D.method172(0.7D, 0);
                }
                if (var4 == 4) {
                    Pix3D.method172(0.6D, 0);
                }
                ObjType.field1091.method103();
                this.field1329 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1478;
                if (var4 == 0) {
                    this.method470(true, 0, this.field1478);
                    this.field1478 = true;
                }
                if (var4 == 1) {
                    this.method470(true, -400, this.field1478);
                    this.field1478 = true;
                }
                if (var4 == 2) {
                    this.method470(true, -800, this.field1478);
                    this.field1478 = true;
                }
                if (var4 == 3) {
                    this.method470(true, -1200, this.field1478);
                    this.field1478 = true;
                }
                if (var4 == 4) {
                    this.field1478 = false;
                }
                if (this.field1478 != var5 && !field1656) {
                    if (this.field1478) {
                        this.field1611 = this.field1384;
                        this.field1612 = true;
                        this.field1235.method277(2, this.field1611);
                    } else {
                        this.method429(0);
                    }
                    this.field1363 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1471 = true;
                    this.method496(this.field1406, 0);
                }
                if (var4 == 1) {
                    this.field1471 = true;
                    this.method496(this.field1406, -400);
                }
                if (var4 == 2) {
                    this.field1471 = true;
                    this.method496(this.field1406, -800);
                }
                if (var4 == 3) {
                    this.field1471 = true;
                    this.method496(this.field1406, -1200);
                }
                if (var4 == 4) {
                    this.field1471 = false;
                }
            }
            if (var3 == 5) {
                this.field1283 = var4;
            }
            if (var3 == 6) {
                this.field1391 = var4;
            }
            if (var3 == 8) {
                this.field1438 = var4;
                this.field1470 = true;
            }
            if (var3 == 9) {
                this.field1256 = var4;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1405[var1] = var0 / 4;
        }
        field1464 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1466 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1494 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1509 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1509[var3] = var2 - 1;
            var2 += var2;
        }
        field1556 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1615 = 102;
        field1653 = 10;
        field1655 = true;
        field1667 = 604;
    }
}
