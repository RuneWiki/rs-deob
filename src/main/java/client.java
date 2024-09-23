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

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1230 = 3;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1231 = 9;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Z")
    private boolean field1232 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1239 = new int[Stats.field1165];

    @OriginalMember(owner = "client", name = "kb", descriptor = "Z")
    private boolean field1244 = false;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Z")
    private boolean field1248 = false;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field1249 = false;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    public int[] field1251 = new int[1000];

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1253 = new int[2000];

    @OriginalMember(owner = "client", name = "ub", descriptor = "[Ljc;")
    private CollisionMap[] field1254 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1261 = 2;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field1267 = new int[5];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    private int[] field1270 = new int[50];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[B")
    private byte[] field1275 = new byte[16384];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1276 = 8;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Ljava/lang/String;")
    private String field1277 = "";

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Ljava/lang/String;")
    private String field1278 = "";

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1279 = -302;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[Ljb;")
    private Pix32[] field1280 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "B")
    private byte field1281 = 2;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "B")
    private byte field1283 = 56;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Z")
    private boolean field1284 = false;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Z")
    private boolean field1286 = true;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1287 = -1;

    @OriginalMember(owner = "client", name = "cc", descriptor = "B")
    private byte field1288 = -36;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1292 = new int[Stats.field1165];

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field1298 = false;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1302 = -1;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1303 = -1;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Lpb;")
    private LinkList field1304 = new LinkList(field1399);

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljava/lang/String;")
    private String field1311 = "";

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1312 = 432;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "B")
    private byte field1314 = -15;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[[I")
    private int[][] field1315 = new int[104][104];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Z")
    private boolean field1319 = true;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "B")
    private byte field1326 = -51;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1331 = -1;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Lmb;")
    private Packet field1360 = Packet.method226(0, 1);

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1361 = 2048;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1362 = 2047;

    @OriginalMember(owner = "client", name = "zd", descriptor = "[Lbb;")
    private PlayerEntity[] field1363 = new PlayerEntity[this.field1361];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    public int[] field1365 = new int[this.field1361];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field1367 = new int[this.field1361];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "[Lmb;")
    private Packet[] field1368 = new Packet[this.field1361];

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1370 = 724;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1373 = -43533;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Ld;")
    private Component field1374 = new Component();

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field1375 = true;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Z")
    private boolean field1376 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[Ljava/lang/String;")
    private String[] field1386 = new String[500];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[Ljb;")
    private Pix32[] field1387 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field1388 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "be", descriptor = "[Z")
    private boolean[] field1391 = new boolean[5];

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field1398 = new int[50];

    @OriginalMember(owner = "client", name = "le", descriptor = "Lpb;")
    private LinkList field1401 = new LinkList(field1399);

    @OriginalMember(owner = "client", name = "me", descriptor = "[Lkb;")
    private Pix8[] field1402 = new Pix8[50];

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field1403 = true;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1404 = 128;

    @OriginalMember(owner = "client", name = "te", descriptor = "Z")
    private boolean field1409 = false;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    private boolean field1411 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "Z")
    private boolean field1414 = false;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1416 = 7759444;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Lwb;")
    public FileStream[] field1418 = new FileStream[5];

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private boolean field1419 = false;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field1428 = new int[256];

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    private boolean field1431 = false;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Ljava/lang/String;")
    private String field1432 = "";

    @OriginalMember(owner = "client", name = "Re", descriptor = "Ljava/lang/String;")
    private String field1433 = "";

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1435 = -1;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1436 = -1;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Z")
    private boolean field1437 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "Z")
    private boolean field1438 = false;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1439 = -1;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1440 = 3353893;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[J")
    private long[] field1441 = new long[100];

    @OriginalMember(owner = "client", name = "af", descriptor = "Lmb;")
    private Packet field1442 = Packet.method226(0, 1);

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1444 = 1;

    @OriginalMember(owner = "client", name = "jf", descriptor = "[I")
    private int[] field1450 = new int[151];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[Lkb;")
    private Pix8[] field1463 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[[I")
    private int[][] field1470 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1471 = new int[200];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[[[Lpb;")
    private LinkList[][][] field1472 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1474 = 883;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1477 = 2;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Z")
    private boolean field1481 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private boolean field1486 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1491 = new int[500];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1492 = new int[500];

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1493 = new int[500];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1494 = new int[500];

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1496 = -1;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[Lab;")
    private NpcEntity[] field1497 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    public int[] field1499 = new int[16384];

    @OriginalMember(owner = "client", name = "ig", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1501 = new CRC32();

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1503 = 253;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[J")
    private long[] field1505 = new long[200];

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1510 = 644;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field1511 = new int[Stats.field1165];

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1512 = new int[33];

    @OriginalMember(owner = "client", name = "ug", descriptor = "Z")
    public boolean field1513 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field1519 = new int[5];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field1520 = true;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1521 = 6;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private final int field1522 = 100;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field1523 = new int[100];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[Ljava/lang/String;")
    private String[] field1525 = new String[200];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field1527 = new int[1000];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[I")
    private int[] field1528 = new int[1000];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1530 = -1;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Ljava/lang/String;")
    private String field1532 = "";

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1539 = 2;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1543 = 50;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[I")
    private int[] field1544 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1545 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field1546 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field1547 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "dh", descriptor = "[I")
    private int[] field1548 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field1549 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field1550 = new int[this.field1543];

    @OriginalMember(owner = "client", name = "gh", descriptor = "[Ljava/lang/String;")
    private String[] field1551 = new String[this.field1543];

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1552 = false;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1553 = -1;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1554 = 5063219;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[I")
    private int[] field1555 = new int[33];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    private int[] field1561 = new int[9];

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field1566 = true;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1567 = 9;

    @OriginalMember(owner = "client", name = "xh", descriptor = "Z")
    public boolean field1568 = true;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1570 = -1;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Ljava/lang/String;")
    private String field1576 = "";

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field1577 = new int[7];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field1578 = new int[4000];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[I")
    private int[] field1579 = new int[4000];

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field1586 = new int[50];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field1588 = new int[5];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1589 = 17979;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1594 = 28009;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "B")
    private byte field1595 = -57;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field1596 = true;

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    private boolean field1608 = true;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Z")
    private boolean field1609 = false;

    @OriginalMember(owner = "client", name = "ni", descriptor = "B")
    private byte field1610 = 0;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Z")
    private boolean field1611 = false;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field1612 = new int[5];

    @OriginalMember(owner = "client", name = "qi", descriptor = "B")
    private byte field1613 = 6;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field1614 = new int[151];

    @OriginalMember(owner = "client", name = "si", descriptor = "Z")
    private boolean field1615 = false;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1618 = -208;

    @OriginalMember(owner = "client", name = "wi", descriptor = "B")
    private byte field1619 = -61;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Z")
    private boolean field1620 = true;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Ljava/lang/String;")
    private String field1622 = "";

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    private boolean field1623 = true;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[Ljb;")
    private Pix32[] field1624 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field1625 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1626 = 889;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Lpb;")
    private LinkList field1633 = new LinkList(field1399);

    @OriginalMember(owner = "client", name = "Li", descriptor = "B")
    private byte field1634 = 5;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[Lkb;")
    private Pix8[] field1636 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1641 = 1;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private boolean field1642 = false;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    private final int[] field1643 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Vi", descriptor = "B")
    private byte field1644 = 53;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field1646 = new int[2000];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1647 = -938;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field1650 = false;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Z")
    private boolean field1651 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "[Ljb;")
    private Pix32[] field1654 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "gj", descriptor = "Z")
    private boolean field1655 = true;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field1658 = new int[100];

    @OriginalMember(owner = "client", name = "kj", descriptor = "[Ljava/lang/String;")
    private String[] field1659 = new String[100];

    @OriginalMember(owner = "client", name = "lj", descriptor = "[Ljava/lang/String;")
    private String[] field1660 = new String[100];

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field1662 = new int[5];

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1663 = -1;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1664 = 809;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Ljava/lang/String;")
    private String field1665 = "";

    @OriginalMember(owner = "client", name = "uj", descriptor = "[Ljb;")
    private Pix32[] field1669 = new Pix32[8];

    @OriginalMember(owner = "client", name = "vj", descriptor = "B")
    private byte field1670 = 9;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1671 = 78;

    @OriginalMember(owner = "client", name = "zj", descriptor = "[[I")
    private int[][] field1674 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field1676 = -1;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Lmb;")
    private Packet field1680 = Packet.method226(0, 1);

    @OriginalMember(owner = "client", name = "Kj", descriptor = "B")
    private byte field1685 = 5;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field1686 = 2301979;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    public static final int[] field1266 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "pc", descriptor = "B")
    private static byte field1301 = 8;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private static int field1316 = 9;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1359 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private static int field1377 = 10;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Z")
    private static boolean field1379 = true;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private static boolean field1399 = true;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[[I")
    public static final int[][] field1490 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private static int[] field1504 = new int[32];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Ljava/lang/String;")
    private static String field1531;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    private static int[] field1559;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Z")
    private static boolean field1587;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1621;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private static int field1661;

    @OriginalMember(owner = "client", name = "yj", descriptor = "Z")
    private static boolean field1673;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private static int field1255;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private static int field1310;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private static int field1320;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private static int field1349;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private static int field1390;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private static int field1397;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field1410;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private static int field1426;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private static int field1452;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private static int field1478;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private static int field1485;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private static int field1487;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private static int field1571;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private static int field1645;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field1648;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client", name = "zb", descriptor = "J")
    private long field1259;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "J")
    private long field1282;

    @OriginalMember(owner = "client", name = "we", descriptor = "J")
    private long field1412;

    @OriginalMember(owner = "client", name = "ii", descriptor = "J")
    private long field1605;

    @OriginalMember(owner = "client", name = "ej", descriptor = "J")
    public long field1653;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Le;")
    private ClientStream field1347;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Lxb;")
    private Isaac field1307;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Lyb;")
    private Jagfile field1635;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Lfc;")
    public MouseTracking field1632;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Lvb;")
    private OnDemand field1413;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Ljb;")
    private Pix32 field1258;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Ljb;")
    private Pix32 field1420;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Ljb;")
    private Pix32 field1422;

    @OriginalMember(owner = "client", name = "He", descriptor = "Ljb;")
    private Pix32 field1423;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Ljb;")
    private Pix32 field1424;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Ljb;")
    private Pix32 field1425;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Ljb;")
    private Pix32 field1429;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Ljb;")
    private Pix32 field1430;

    @OriginalMember(owner = "client", name = "of", descriptor = "Ljb;")
    private Pix32 field1455;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Ljb;")
    private Pix32 field1456;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Ljb;")
    private Pix32 field1506;

    @OriginalMember(owner = "client", name = "og", descriptor = "Ljb;")
    private Pix32 field1507;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Ljb;")
    private Pix32 field1672;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Lkb;")
    private Pix8 field1245;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Lkb;")
    private Pix8 field1246;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Lkb;")
    private Pix8 field1293;

    @OriginalMember(owner = "client", name = "ic", descriptor = "Lkb;")
    private Pix8 field1294;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Lkb;")
    private Pix8 field1295;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Lkb;")
    private Pix8 field1296;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Lkb;")
    private Pix8 field1297;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Lkb;")
    private Pix8 field1381;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Lkb;")
    private Pix8 field1382;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lkb;")
    private Pix8 field1383;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lkb;")
    private Pix8 field1384;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Lkb;")
    private Pix8 field1385;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lkb;")
    private Pix8 field1508;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lkb;")
    private Pix8 field1509;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Lkb;")
    private Pix8 field1563;

    @OriginalMember(owner = "client", name = "th", descriptor = "Lkb;")
    private Pix8 field1564;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Lkb;")
    private Pix8 field1565;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Lkb;")
    private Pix8 field1677;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Lkb;")
    private Pix8 field1678;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Lkb;")
    private Pix8 field1679;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Llb;")
    private PixFont field1533;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Llb;")
    private PixFont field1534;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Llb;")
    private PixFont field1535;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Llb;")
    private PixFont field1536;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Lrb;")
    private PixMap field1332;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Lrb;")
    private PixMap field1333;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Lrb;")
    private PixMap field1334;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Lrb;")
    private PixMap field1335;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Lrb;")
    private PixMap field1336;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Lrb;")
    private PixMap field1337;

    @OriginalMember(owner = "client", name = "ad", descriptor = "Lrb;")
    private PixMap field1338;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Lrb;")
    private PixMap field1339;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Lrb;")
    private PixMap field1340;

    @OriginalMember(owner = "client", name = "md", descriptor = "Lrb;")
    private PixMap field1350;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lrb;")
    private PixMap field1351;

    @OriginalMember(owner = "client", name = "od", descriptor = "Lrb;")
    private PixMap field1352;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Lrb;")
    private PixMap field1353;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Lrb;")
    private PixMap field1354;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Lrb;")
    private PixMap field1355;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Lrb;")
    private PixMap field1356;

    @OriginalMember(owner = "client", name = "td", descriptor = "Lrb;")
    private PixMap field1357;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lrb;")
    private PixMap field1358;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Lrb;")
    private PixMap field1573;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Lrb;")
    private PixMap field1574;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Lrb;")
    private PixMap field1575;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lrb;")
    private PixMap field1590;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lrb;")
    private PixMap field1591;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lrb;")
    private PixMap field1592;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lrb;")
    private PixMap field1593;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Lbb;")
    public static PlayerEntity field1597;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ls;")
    private World3D field1464;

    @OriginalMember(owner = "client", name = "id", descriptor = "Ljava/lang/String;")
    public String field1346;

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljava/lang/String;")
    private String field1445;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Ljava/lang/String;")
    private String field1451;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljava/lang/String;")
    public String field1631;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private static boolean field1380;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Z")
    private static boolean field1415;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    public static boolean field1652;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "Z")
    public static boolean field1687;

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field1223;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field1224;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field1271;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1272;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field1467;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field1468;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field1469;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1479;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field1480;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field1681;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    private int[] field1682;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field1683;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[I")
    private int[] field1684;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[Lkb;")
    private Pix8[] field1524;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[[B")
    private byte[][] field1489;

    @OriginalMember(owner = "client", name = "hj", descriptor = "[[B")
    private byte[][] field1656;

    @OriginalMember(owner = "client", name = "Be", descriptor = "[[[B")
    private byte[][][] field1417;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[[[I")
    private int[][][] field1369;

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method431(byte arg0, int arg1) {
        int[] var3 = this.field1258.field688;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field1417[arg1][var25][var6] & 24) == 0) {
                    this.field1464.method99(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (this.field1417[arg1 + 1][var25][var6] & 8) != 0) {
                    this.field1464.method99(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1258.method194(0);
        if (this.field1595 != arg0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field1417[arg1][var23][var10] & 24) == 0) {
                    this.method462(var23, var8, var7, (byte) 6, arg1, var10);
                }
                if (arg1 < 3 && (this.field1417[arg1 + 1][var23][var10] & 8) != 0) {
                    this.method462(var23, var8, var7, (byte) 6, arg1 + 1, var10);
                }
            }
        }
        this.field1592.method268(0);
        this.field1526 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field1464.method93(this.field1268, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = LocType.method334(var14).field989;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field1254[this.field1268].field1110;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var16 > 0 && var16 > var11 - 3 && (var20[var16 - 1][var17] & 2621704) == 0) {
                                    --var16;
                                }
                                if (var22 == 1 && var16 < var18 - 1 && var16 < var11 + 3 && (var20[var16 + 1][var17] & 2621824) == 0) {
                                    ++var16;
                                }
                                if (var22 == 2 && var17 > 0 && var17 > var12 - 3 && (var20[var16][var17 - 1] & 2621698) == 0) {
                                    --var17;
                                }
                                if (var22 == 3 && var17 < var19 - 1 && var17 < var12 + 3 && (var20[var16][var17 + 1] & 2621728) == 0) {
                                    ++var17;
                                }
                            }
                        }
                        this.field1654[this.field1526] = this.field1624[var15];
                        this.field1527[this.field1526] = var16;
                        this.field1528[this.field1526] = var17;
                        ++this.field1526;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method432(int arg0) {
        if (this.field1332 == null) {
            super.field20 = null;
            this.field1593 = null;
            this.field1591 = null;
            this.field1590 = null;
            this.field1592 = null;
            this.field1573 = null;
            this.field1574 = null;
            this.field1575 = null;
            this.field1335 = new PixMap(this.method11(false), 128, 265, field1661);
            Pix2D.method168(-692);
            this.field1336 = new PixMap(this.method11(false), 128, 265, field1661);
            Pix2D.method168(-692);
            this.field1332 = new PixMap(this.method11(false), 509, 171, field1661);
            Pix2D.method168(-692);
            this.field1333 = new PixMap(this.method11(false), 360, 132, field1661);
            Pix2D.method168(-692);
            this.field1334 = new PixMap(this.method11(false), 360, 200, field1661);
            Pix2D.method168(-692);
            this.field1337 = new PixMap(this.method11(false), 202, 238, field1661);
            Pix2D.method168(-692);
            this.field1338 = new PixMap(this.method11(false), 203, 238, field1661);
            Pix2D.method168(-692);
            this.field1339 = new PixMap(this.method11(false), 74, 94, field1661);
            if (arg0 != 0) {
                this.field1226 = this.field1680.method239();
            }
            Pix2D.method168(-692);
            this.field1340 = new PixMap(this.method11(false), 75, 94, field1661);
            Pix2D.method168(-692);
            if (this.field1635 != null) {
                this.method530(field1587);
                this.method560(202);
            }
            this.field1650 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method433(byte arg0) {
        try {
            this.field1553 = -1;
            this.field1633.method262();
            this.field1401.method262();
            Pix3D.method180(0);
            this.method460(-13523);
            this.field1464.method64(-24120);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1254[var2].method361(this.field1276);
            }
            System.gc();
            World var3 = new World(this.field1417, 104, this.field1620, 104, this.field1369);
            int var4 = this.field1656.length;
            World.field52 = World3D.field315;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1467[var5] >> 8;
                int var7 = this.field1467[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field52 = false;
                }
            }
            if (World.field52) {
                this.field1464.method65(this.field1268, this.field1644);
            } else {
                this.field1464.method65(0, this.field1644);
            }
            this.field1442.method228(139, this.field1483);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1467[var8] >> 8) * 64 - this.field1514;
                int var10 = (this.field1467[var8] & 255) * 64 - this.field1515;
                byte[] var11 = this.field1656[var8];
                if (var11 != null) {
                    var3.method15(var10, var11, var9, 0, (this.field1616 - 6) * 8, (this.field1617 - 6) * 8);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1467[var12] >> 8) * 64 - this.field1514;
                int var14 = (this.field1467[var12] & 255) * 64 - this.field1515;
                byte[] var15 = this.field1656[var12];
                if (var15 == null && this.field1617 < 800) {
                    var3.method14(var14, 64, var13, 64, 762);
                }
            }
            this.field1442.method228(139, this.field1483);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1489[var16];
                if (var17 != null) {
                    int var18 = (this.field1467[var16] >> 8) * 64 - this.field1514;
                    int var19 = (this.field1467[var16] & 255) * 64 - this.field1515;
                    var3.method18(this.field1254, this.field1464, var17, var19, var18, -620);
                }
            }
            this.field1442.method228(139, this.field1483);
            var3.method20((byte) 6, this.field1464, this.field1254);
            this.field1592.method268(0);
            this.field1442.method228(139, this.field1483);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method527(var20, var21);
                }
            }
            this.method539(-102);
        } catch (Exception var34) {
        }
        LocType.field1003.method117();
        if (field1380 && signlink.cache_dat != null) {
            int var23 = this.field1413.method282((byte) 6, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1413.method287(var24, -772);
                if ((var25 & 121) == 0) {
                    Model.method138(0, var24);
                }
            }
        }
        System.gc();
        Pix3D.method181(0, 20);
        this.field1413.method293(9);
        int var26 = (this.field1616 - 6) / 8 - 1;
        int var27 = (this.field1616 + 6) / 8 + 1;
        int var28 = (this.field1617 - 6) / 8 - 1;
        int var29 = (this.field1617 + 6) / 8 + 1;
        if (arg0 != -25) {
            this.field1472 = null;
        }
        if (this.field1419) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1413.method284(var30, var31, 0, -21445);
                    if (var32 != -1) {
                        this.field1413.method294(this.field1308, 3, var32);
                    }
                    int var33 = this.field1413.method284(var30, var31, 1, -21445);
                    if (var33 != -1) {
                        this.field1413.method294(this.field1308, 3, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (arg0 != 8) {
            this.field1472 = null;
        }
        if (field1380 && this.field1299 == 2 && World.field53 != this.field1268) {
            this.field1592.method268(0);
            this.field1534.method214(0, "Loading - please wait.", 673, 151, 257);
            this.field1534.method214(16777215, "Loading - please wait.", 673, 150, 256);
            this.field1592.method269(4, super.field19, 4, this.field1664);
            this.field1299 = 1;
            this.field1259 = System.currentTimeMillis();
        }
        if (this.field1299 == 1) {
            int var2 = this.method435((byte) 87);
            if (var2 != 0 && System.currentTimeMillis() - this.field1259 > 360000L) {
                signlink.reporterror(this.field1277 + " glcfb " + this.field1605 + "," + var2 + "," + field1380 + "," + this.field1418[0] + "," + this.field1413.method290() + "," + this.field1268 + "," + this.field1616 + "," + this.field1617);
                this.field1259 = System.currentTimeMillis();
            }
        }
        if (this.field1299 == 2 && this.field1553 != this.field1268) {
            this.field1553 = this.field1268;
            this.method431((byte) -57, this.field1268);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)I")
    public final int method435(byte arg0) {
        if (arg0 != 87) {
            return this.field1664;
        } else {
            for (int var2 = 0; var2 < this.field1656.length; ++var2) {
                if (this.field1656[var2] == null && this.field1468[var2] != -1) {
                    return -1;
                }
                if (this.field1489[var2] == null && this.field1469[var2] != -1) {
                    return -2;
                }
            }
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field1656.length; ++var4) {
                byte[] var5 = this.field1489[var4];
                if (var5 != null) {
                    int var6 = (this.field1467[var4] >> 8) * 64 - this.field1514;
                    int var7 = (this.field1467[var4] & 255) * 64 - this.field1515;
                    var3 &= World.method16(var6, var5, false, var7);
                }
            }
            if (!var3) {
                return -3;
            } else if (this.field1284) {
                return -4;
            } else {
                this.field1299 = 2;
                World.field53 = this.field1268;
                this.method433((byte) -25);
                this.field1442.method228(232, this.field1483);
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method436(byte arg0, boolean arg1) {
        if (field1597.field428 >> 7 == this.field1256 && field1597.field429 >> 7 == this.field1257) {
            this.field1256 = 0;
        }
        int var3 = this.field1364;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var6;
            int var7;
            if (arg1) {
                var6 = field1597;
                var7 = this.field1362 << 14;
            } else {
                var6 = this.field1363[this.field1365[var4]];
                var7 = this.field1365[var4] << 14;
            }
            if (var6 != null && var6.method127(-42790)) {
                var6.field507 = false;
                if ((field1380 && this.field1364 > 50 || this.field1364 > 200) && !arg1 && var6.field453 == var6.field433) {
                    var6.field507 = true;
                }
                int var8 = var6.field428 >> 7;
                int var9 = var6.field429 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field502 != null && field1247 >= var6.field497 && field1247 < var6.field498) {
                        var6.field507 = false;
                        var6.field496 = this.method501(this.field1268, var6.field428, var6.field429, 54);
                        this.field1464.method76(var6.field430, var6.field428, var6, var6.field503, var6.field496, var6.field505, this.field1268, 60, var6.field504, var6.field429, var6.field506, var7, 0);
                    } else {
                        if ((var6.field428 & 127) == 64 && (var6.field429 & 127) == 64) {
                            if (this.field1674[var8][var9] == this.field1556) {
                                continue;
                            }
                            this.field1674[var8][var9] = this.field1556;
                        }
                        var6.field496 = this.method501(this.field1268, var6.field428, var6.field429, 54);
                        this.field1464.method75(var6, var6.field496, this.field1268, var7, var6.field428, 60, var6.field429, var6.field430, var6.field431, 37044);
                    }
                }
            }
        }
        if (arg0 == 6) {
            boolean var5 = false;
        } else {
            this.field1226 = this.field1680.method239();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method437(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1633.method258();
        if (arg0 <= 0) {
            this.field1675 = -276;
        }
        while (var2 != null) {
            if (this.field1268 == var2.field634 && !var2.field640) {
                if (field1247 >= var2.field633) {
                    var2.method164(this.field1529, 439);
                    if (var2.field640) {
                        var2.method120();
                    } else {
                        this.field1464.method75(var2, var2.field637, var2.field634, -1, var2.field635, 60, var2.field636, 0, false, 37044);
                    }
                }
            } else {
                var2.method120();
            }
            var2 = (SpotAnimEntity) this.field1633.method260(17736);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 > 0) {
            this.method507(0);
            if (this.field1330 == 1) {
                this.field1669[this.field1329 / 100].method199(this.field1328 - 8 - 4, this.field1373, this.field1327 - 8 - 4);
            }
            if (this.field1330 == 2) {
                this.field1669[this.field1329 / 100 + 4].method199(this.field1328 - 8 - 4, this.field1373, this.field1327 - 8 - 4);
            }
            if (this.field1436 != -1) {
                this.method515(this.field1436, this.field1529, false);
                this.method526(Component.field80[this.field1436], -640, 0, 0, 0);
            }
            if (this.field1453 > 0) {
                int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1453 / 10.0D) * 10.0D);
                for (int var3 = 0; var3 < 30; ++var3) {
                    int var4 = (30 - var3) * 16;
                    Pix2D.method174(var2 + var3, 16776960, this.field1453, 256 - var4 / 2, 44931, var4);
                }
            }
            if (this.field1484 != -1) {
                this.method515(this.field1484, this.field1529, false);
                this.method526(Component.field80[this.field1484], -640, 0, 0, 0);
            }
            this.method531(-24083);
            if (!this.field1642) {
                this.method478(false);
                this.method506(this.field1685);
            } else if (this.field1581 == 0) {
                this.method449(341);
            }
            if (this.field1562 == 1) {
                if (this.field1495 <= 0 && this.field1473 != 1) {
                    this.field1280[1].method199(296, this.field1373, 472);
                } else {
                    this.field1280[1].method199(258, this.field1373, 472);
                }
            }
            if (this.field1495 > 0) {
                this.field1280[0].method199(296, this.field1373, 472);
                this.field1534.method214(16776960, "Level: " + this.field1495, 673, 329, 484);
            }
            if (this.field1473 == 1) {
                this.field1280[6].method199(296, this.field1373, 472);
                this.field1534.method214(16776960, "Arena", 673, 329, 484);
            }
            if (this.field1306 != 0) {
                int var5 = this.field1306 / 50;
                int var6 = var5 / 60;
                int var7 = var5 % 60;
                if (var7 < 10) {
                    this.field1534.method217(4, "System update in: " + var6 + ":0" + var7, 329, 16776960, 0);
                } else {
                    this.field1534.method217(4, "System update in: " + var6 + ":" + var7, 329, 16776960, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method439(int arg0) {
        this.field1442.method228(125, this.field1483);
        if (arg0 != 0) {
            this.field1226 = this.field1680.method239();
        }
        if (this.field1676 != -1) {
            this.field1676 = -1;
            this.field1244 = true;
            this.field1615 = false;
            this.field1552 = true;
        }
        if (this.field1331 != -1) {
            this.field1331 = -1;
            this.field1431 = true;
            this.field1615 = false;
        }
        this.field1484 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIILbb;)V")
    public final void method440(int arg0, byte arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (field1597 != arg4) {
            if (this.field1348 < 400) {
                String var6 = arg4.field488 + method523(arg4.field494, this.field1288, field1597.field494) + " (level-" + arg4.field494 + ")";
                if (this.field1627 == 1) {
                    this.field1386[this.field1348] = "Use " + this.field1631 + " with @whi@" + var6;
                    this.field1493[this.field1348] = 367;
                    this.field1494[this.field1348] = arg2;
                    this.field1491[this.field1348] = arg0;
                    this.field1492[this.field1348] = arg3;
                    ++this.field1348;
                } else if (this.field1343 == 1) {
                    if ((this.field1345 & 8) == 8) {
                        this.field1386[this.field1348] = this.field1346 + " @whi@" + var6;
                        this.field1493[this.field1348] = 651;
                        this.field1494[this.field1348] = arg2;
                        this.field1491[this.field1348] = arg0;
                        this.field1492[this.field1348] = arg3;
                        ++this.field1348;
                    }
                } else {
                    this.field1386[this.field1348] = "Follow @whi@" + var6;
                    this.field1493[this.field1348] = 1544;
                    this.field1494[this.field1348] = arg2;
                    this.field1491[this.field1348] = arg0;
                    this.field1492[this.field1348] = arg3;
                    ++this.field1348;
                    if (this.field1300 == 0) {
                        this.field1386[this.field1348] = "Trade with @whi@" + var6;
                        this.field1493[this.field1348] = 1373;
                        this.field1494[this.field1348] = arg2;
                        this.field1491[this.field1348] = arg0;
                        this.field1492[this.field1348] = arg3;
                        ++this.field1348;
                    }
                    if (this.field1495 > 0) {
                        this.field1386[this.field1348] = "Attack @whi@" + var6;
                        if (field1597.field494 >= arg4.field494) {
                            this.field1493[this.field1348] = 151;
                        } else {
                            this.field1493[this.field1348] = 2151;
                        }
                        this.field1494[this.field1348] = arg2;
                        this.field1491[this.field1348] = arg0;
                        this.field1492[this.field1348] = arg3;
                        ++this.field1348;
                    }
                    if (this.field1473 == 1) {
                        this.field1386[this.field1348] = "Fight @whi@" + var6;
                        this.field1493[this.field1348] = 151;
                        this.field1494[this.field1348] = arg2;
                        this.field1491[this.field1348] = arg0;
                        this.field1492[this.field1348] = arg3;
                        ++this.field1348;
                    }
                    if (this.field1473 == 2) {
                        this.field1386[this.field1348] = "Duel-with @whi@" + var6;
                        this.field1493[this.field1348] = 1101;
                        this.field1494[this.field1348] = arg2;
                        this.field1491[this.field1348] = arg0;
                        this.field1492[this.field1348] = arg3;
                        ++this.field1348;
                    }
                }
                for (int var7 = 0; var7 < this.field1348; ++var7) {
                    if (this.field1493[var7] == 660) {
                        this.field1386[var7] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg1 == 3) {
                    boolean var8 = false;
                } else {
                    this.field1226 = this.field1680.method239();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method441(boolean arg0) {
        for (int var2 = -1; var2 < this.field1364; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1362;
            } else {
                var4 = this.field1365[var2];
            }
            PlayerEntity var5 = this.field1363[var4];
            if (var5 != null) {
                this.method493(-938, var5, 1);
            }
        }
        ++field1487;
        if (!arg0) {
            if (field1487 > 1406) {
                field1487 = 0;
                this.field1442.method228(54, this.field1483);
                this.field1442.method229(0);
                int var3 = this.field1442.field736;
                this.field1442.method229(162);
                this.field1442.method229(22);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1442.method229(84);
                }
                this.field1442.method230(31824);
                this.field1442.method230(13490);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1442.method229(123);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1442.method229(134);
                }
                this.field1442.method229(100);
                this.field1442.method229(94);
                this.field1442.method230(35521);
                this.field1442.method238(this.field1442.field736 - var3, this.field1370);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        this.field1248 = false;
        this.field1513 &= arg0;
        while (this.field1249) {
            this.field1248 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1245 = null;
        this.field1246 = null;
        this.field1524 = null;
        this.field1681 = null;
        this.field1682 = null;
        this.field1683 = null;
        this.field1684 = null;
        this.field1479 = null;
        this.field1480 = null;
        this.field1223 = null;
        this.field1224 = null;
        this.field1429 = null;
        this.field1430 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)Z")
    public final boolean method443(boolean arg0, Component arg1) {
        int var3 = arg1.field89;
        if (!arg0) {
            throw new NullPointerException();
        } else {
            if (this.field1639 == 2) {
                if (var3 == 201) {
                    this.field1431 = true;
                    this.field1289 = false;
                    this.field1486 = true;
                    this.field1532 = "";
                    this.field1400 = 1;
                    this.field1311 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field1431 = true;
                    this.field1289 = false;
                    this.field1486 = true;
                    this.field1532 = "";
                    this.field1400 = 2;
                    this.field1311 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field1229 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field1431 = true;
                    this.field1289 = false;
                    this.field1486 = true;
                    this.field1532 = "";
                    this.field1400 = 4;
                    this.field1311 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field1431 = true;
                    this.field1289 = false;
                    this.field1486 = true;
                    this.field1532 = "";
                    this.field1400 = 5;
                    this.field1311 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field1577[var4];
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
                            if (!IdkType.field1128[var6].field1134 && IdkType.field1128[var6].field1129 == var4 + (this.field1655 ? 0 : 7)) {
                                this.field1577[var4] = var6;
                                this.field1438 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field1267[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field1490[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field1490[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field1267[var7] = var9;
                    this.field1438 = true;
                }
                if (var3 == 324 && !this.field1655) {
                    this.field1655 = true;
                    this.method456(-14998);
                }
                if (var3 == 325 && this.field1655) {
                    this.field1655 = false;
                    this.method456(-14998);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field1298 = !this.field1298;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method439(0);
                        if (this.field1665.length() > 0) {
                            this.field1442.method228(102, this.field1483);
                            this.field1442.method235(JString.method310(this.field1665), 0);
                            this.field1442.method229(var3 - 601);
                            this.field1442.method229(this.field1298 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field1442.method228(124, this.field1483);
                    this.field1442.method229(this.field1655 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field1442.method229(this.field1577[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field1442.method229(this.field1267[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method444(int arg0, int arg1) {
        int var3 = 33 / arg0;
        if (!field1380) {
            if (Pix3D.field676[17] >= arg1) {
                Pix8 var4 = Pix3D.field670[17];
                int var5 = var4.field703 * var4.field702 - 1;
                int var6 = this.field1529 * var4.field702 * 2;
                byte[] var7 = var4.field700;
                byte[] var8 = this.field1275;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field700 = var8;
                this.field1275 = var7;
                Pix3D.method184(17, (byte) 6);
            }
            if (Pix3D.field676[24] >= arg1) {
                Pix8 var10 = Pix3D.field670[24];
                int var11 = var10.field703 * var10.field702 - 1;
                int var12 = this.field1529 * var10.field702 * 2;
                byte[] var13 = var10.field700;
                byte[] var14 = this.field1275;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field700 = var14;
                this.field1275 = var13;
                Pix3D.method184(24, (byte) 6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method445(byte arg0) {
        ++this.field1556;
        this.method436((byte) 6, true);
        this.method504(true, true);
        this.method436((byte) 6, false);
        this.method504(true, false);
        this.method455(true);
        this.method437(114);
        if (!this.field1609) {
            int var2 = this.field1404;
            if (this.field1580 / 256 > var2) {
                var2 = this.field1580 / 256;
            }
            if (this.field1391[4] && this.field1662[4] + 128 > var2) {
                var2 = this.field1662[4] + 128;
            }
            int var3 = this.field1640 + this.field1405 & 2047;
            this.method511(this.field1262, var3, this.field1263, this.method501(this.field1268, field1597.field428, field1597.field429, 54) - 50, 0, var2 * 3 + 600, var2);
            ++field1571;
            if (field1571 > 1802) {
                field1571 = 0;
                this.field1442.method228(180, this.field1483);
                this.field1442.method229(0);
                int var4 = this.field1442.field736;
                this.field1442.method230(29711);
                this.field1442.method229(70);
                this.field1442.method229((int) (Math.random() * 256.0D));
                this.field1442.method229(242);
                this.field1442.method229(186);
                this.field1442.method229(39);
                this.field1442.method229(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1442.method229(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1442.method230(57856);
                }
                this.field1442.method230((int) (Math.random() * 65536.0D));
                this.field1442.method238(this.field1442.field736 - var4, this.field1370);
            }
        }
        int var5;
        if (!this.field1609) {
            var5 = this.method517(true);
        } else {
            var5 = this.method518(0);
        }
        int var6 = this.field1321;
        int var7 = this.field1322;
        int var8 = this.field1323;
        int var9 = this.field1324;
        int var10 = this.field1325;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1391[var11]) {
                int var14 = (int) (Math.random() * (double) (this.field1588[var11] * 2 + 1) - (double) this.field1588[var11] + Math.sin((double) this.field1519[var11] / 100.0D * (double) this.field1612[var11]) * (double) this.field1662[var11]);
                if (var11 == 0) {
                    this.field1321 += var14;
                }
                if (var11 == 1) {
                    this.field1322 += var14;
                }
                if (var11 == 2) {
                    this.field1323 += var14;
                }
                if (var11 == 3) {
                    this.field1325 = this.field1325 + var14 & 2047;
                }
                if (var11 == 4) {
                    this.field1324 += var14;
                    if (this.field1324 < 128) {
                        this.field1324 = 128;
                    }
                    if (this.field1324 > 383) {
                        this.field1324 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field677;
        if (this.field1670 == arg0) {
            boolean var13 = false;
            Model.field621 = true;
            Model.field624 = 0;
            Model.field622 = super.field27 - 4;
            Model.field623 = super.field28 - 4;
            Pix2D.method168(-692);
            this.field1464.method103(this.field1321, var5, this.field1322, this.field1325, this.field1323, false, this.field1324);
            this.field1464.method78(true);
            this.method550((byte) 2);
            this.method561(11220);
            this.method444(670, var12);
            this.method438(383);
            this.field1592.method269(4, super.field19, 4, this.field1664);
            this.field1321 = var6;
            this.field1322 = var7;
            this.field1323 = var8;
            this.field1324 = var9;
            this.field1325 = var10;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Z")
    public final boolean method446(int arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1493[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            if (var3 == 406) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Z")
    public final boolean method447(boolean arg0) {
        this.field1513 &= arg0;
        if (this.field1347 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1347.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1226 == -1) {
                    this.field1347.method41(this.field1680.field735, 0, 1);
                    this.field1226 = this.field1680.field735[0] & 255;
                    if (this.field1307 != null) {
                        this.field1226 = this.field1226 - this.field1307.method305() & 255;
                    }
                    this.field1225 = Protocol.field1097[this.field1226];
                    --var2;
                }
                if (this.field1225 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1347.method41(this.field1680.field735, 0, 1);
                    this.field1225 = this.field1680.field735[0] & 255;
                    --var2;
                }
                if (this.field1225 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1347.method41(this.field1680.field735, 0, 2);
                    this.field1680.field736 = 0;
                    this.field1225 = this.field1680.method241();
                    var2 -= 2;
                }
                if (var2 < this.field1225) {
                    return false;
                }
                this.field1680.field736 = 0;
                this.field1347.method41(this.field1680.field735, 0, this.field1225);
                this.field1227 = 0;
                this.field1668 = this.field1667;
                this.field1667 = this.field1666;
                this.field1666 = this.field1226;
                if (this.field1226 == 75) {
                    if (this.field1676 != -1) {
                        this.field1676 = -1;
                        this.field1244 = true;
                        this.field1552 = true;
                    }
                    if (this.field1331 != -1) {
                        this.field1331 = -1;
                        this.field1431 = true;
                    }
                    if (this.field1289) {
                        this.field1289 = false;
                        this.field1431 = true;
                    }
                    this.field1484 = -1;
                    this.field1615 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 211) {
                    int var3 = this.field1680.method241();
                    int var4 = this.field1680.method241();
                    int var5 = this.field1680.method241();
                    ObjType var6 = ObjType.method350(var4);
                    Component.field80[var3].field129 = 4;
                    Component.field80[var3].field130 = var4;
                    Component.field80[var3].field136 = var6.field1062;
                    Component.field80[var3].field137 = var6.field1063;
                    Component.field80[var3].field135 = var6.field1061 * 100 / var5;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 170) {
                    int var7 = this.field1680.method241();
                    int var8 = this.field1680.method241();
                    int var9 = var8 >> 10 & 31;
                    int var10 = var8 >> 5 & 31;
                    int var11 = var8 & 31;
                    Component.field80[var7].field123 = (var11 << 3) + (var9 << 19) + (var10 << 11);
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 253) {
                    int var12 = this.field1680.method242();
                    this.field1496 = var12;
                    this.field1431 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 214) {
                    this.field1475 = this.field1680.method239();
                    if (this.field1475 == 1) {
                        this.field1427 = this.field1680.method241();
                    }
                    if (this.field1475 >= 2 && this.field1475 <= 6) {
                        if (this.field1475 == 2) {
                            this.field1395 = 64;
                            this.field1396 = 64;
                        }
                        if (this.field1475 == 3) {
                            this.field1395 = 0;
                            this.field1396 = 64;
                        }
                        if (this.field1475 == 4) {
                            this.field1395 = 128;
                            this.field1396 = 64;
                        }
                        if (this.field1475 == 5) {
                            this.field1395 = 64;
                            this.field1396 = 0;
                        }
                        if (this.field1475 == 6) {
                            this.field1395 = 64;
                            this.field1396 = 128;
                        }
                        this.field1475 = 2;
                        this.field1392 = this.field1680.method241();
                        this.field1393 = this.field1680.method241();
                        this.field1394 = this.field1680.method239();
                    }
                    if (this.field1475 == 10) {
                        this.field1449 = this.field1680.method241();
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 196) {
                    this.field1446 = this.field1680.method239();
                    this.field1447 = this.field1680.method239();
                    while (this.field1680.field736 < this.field1225) {
                        int var13 = this.field1680.method239();
                        this.method508(var13, this.field1680, false);
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 220) {
                    this.field1599 = this.field1225 / 8;
                    for (int var14 = 0; var14 < this.field1599; ++var14) {
                        this.field1441[var14] = this.field1680.method245(0);
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 149) {
                    int var15 = this.field1680.method241();
                    int var16 = this.field1680.method241();
                    Component var17 = Component.field80[var15];
                    if (var17 != null && var17.field87 == 0) {
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        if (var16 > var17.field99 - var17.field91) {
                            var16 = var17.field99 - var17.field91;
                        }
                        var17.field100 = var16;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 147) {
                    this.field1562 = this.field1680.method239();
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 217) {
                    this.field1230 = this.field1680.method239();
                    this.field1244 = true;
                    this.field1552 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 228) {
                    long var18 = this.field1680.method245(0);
                    int var20 = this.field1680.method244();
                    int var21 = this.field1680.method239();
                    boolean var22 = false;
                    for (int var23 = 0; var23 < 100; ++var23) {
                        if (this.field1523[var23] == var20) {
                            var22 = true;
                            break;
                        }
                    }
                    if (var21 <= 1) {
                        for (int var24 = 0; var24 < this.field1599; ++var24) {
                            if (this.field1441[var24] == var18) {
                                var22 = true;
                                break;
                            }
                        }
                    }
                    if (!var22 && this.field1300 == 0) {
                        try {
                            this.field1523[this.field1607] = var20;
                            this.field1607 = (this.field1607 + 1) % 100;
                            String var25 = WordPack.method317(this.field1680, true, this.field1225 - 13);
                            String var26 = WordFilter.method403(-39648, var25);
                            if (var21 != 2 && var21 != 3) {
                                if (var21 == 1) {
                                    this.method454(2, 7, var26, "@cr1@" + JString.method314(false, JString.method311(-8191, var18)));
                                } else {
                                    this.method454(2, 3, var26, JString.method314(false, JString.method311(-8191, var18)));
                                }
                            } else {
                                this.method454(2, 7, var26, "@cr2@" + JString.method314(false, JString.method311(-8191, var18)));
                            }
                        } catch (Exception var156) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 251) {
                    this.method491(this.field1680, this.field1225, 0);
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 233) {
                    this.field1609 = false;
                    for (int var28 = 0; var28 < 5; ++var28) {
                        this.field1391[var28] = false;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 20) {
                    this.field1486 = false;
                    this.field1289 = true;
                    this.field1576 = "";
                    this.field1431 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 157) {
                    int var29 = this.field1680.method239();
                    int var30 = this.field1680.method239();
                    int var31 = this.field1680.method239();
                    int var32 = this.field1680.method239();
                    this.field1391[var29] = true;
                    this.field1588[var29] = var30;
                    this.field1662[var29] = var31;
                    this.field1519[var29] = var32;
                    this.field1612[var29] = 0;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 1) {
                    int var33 = this.field1680.method242();
                    if (var33 >= 0) {
                        this.method535(false, var33);
                    }
                    this.field1436 = var33;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 26) {
                    int var34 = this.field1680.method241();
                    Component.field80[var34].field129 = 3;
                    Component.field80[var34].field130 = (field1597.field492[8] << 6) + (field1597.field492[0] << 12) + (field1597.field493[0] << 24) + (field1597.field493[4] << 18) + field1597.field492[11];
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 23) {
                    this.field1446 = this.field1680.method239();
                    this.field1447 = this.field1680.method239();
                    for (int var35 = this.field1446; var35 < this.field1446 + 8; ++var35) {
                        for (int var36 = this.field1447; var36 < this.field1447 + 8; ++var36) {
                            if (this.field1472[this.field1268][var35][var36] != null) {
                                this.field1472[this.field1268][var35][var36] = null;
                                this.method527(var35, var36);
                            }
                        }
                    }
                    for (LocSpawned var37 = (LocSpawned) this.field1304.method258(); var37 != null; var37 = (LocSpawned) this.field1304.method260(17736)) {
                        if (var37.field756 >= this.field1446 && var37.field756 < this.field1446 + 8 && var37.field757 >= this.field1447 && var37.field757 < this.field1447 + 8 && this.field1268 == var37.field754) {
                            var37.field765 = 0;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 9) {
                    long var38 = this.field1680.method245(0);
                    int var40 = this.field1680.method239();
                    String var41 = JString.method314(false, JString.method311(-8191, var38));
                    for (int var42 = 0; var42 < this.field1638; ++var42) {
                        if (this.field1505[var42] == var38) {
                            if (this.field1471[var42] != var40) {
                                this.field1471[var42] = var40;
                                this.field1244 = true;
                                if (var40 > 0) {
                                    this.method454(2, 5, var41 + " has logged in.", "");
                                }
                                if (var40 == 0) {
                                    this.method454(2, 5, var41 + " has logged out.", "");
                                }
                            }
                            var41 = null;
                            break;
                        }
                    }
                    if (var41 != null && this.field1638 < 200) {
                        this.field1505[this.field1638] = var38;
                        this.field1525[this.field1638] = var41;
                        this.field1471[this.field1638] = var40;
                        ++this.field1638;
                        this.field1244 = true;
                    }
                    boolean var43 = false;
                    while (!var43) {
                        var43 = true;
                        for (int var44 = 0; var44 < this.field1638 - 1; ++var44) {
                            if (this.field1471[var44] != field1377 && this.field1471[var44 + 1] == field1377 || this.field1471[var44] == 0 && this.field1471[var44 + 1] != 0) {
                                int var45 = this.field1471[var44];
                                this.field1471[var44] = this.field1471[var44 + 1];
                                this.field1471[var44 + 1] = var45;
                                String var46 = this.field1525[var44];
                                this.field1525[var44] = this.field1525[var44 + 1];
                                this.field1525[var44 + 1] = var46;
                                long var47 = this.field1505[var44];
                                this.field1505[var44] = this.field1505[var44 + 1];
                                this.field1505[var44 + 1] = var47;
                                this.field1244 = true;
                                var43 = false;
                            }
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 120) {
                    int var49 = this.field1680.method241();
                    String var50 = this.field1680.method246();
                    Component.field80[var49].field121 = var50;
                    if (this.field1625[this.field1230] == Component.field80[var49].field86) {
                        this.field1244 = true;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 124) {
                    Packet var51 = InputTracking.method47(0);
                    if (var51 != null) {
                        this.field1442.method228(253, this.field1483);
                        this.field1442.method230(var51.field736);
                        this.field1442.method237(var51.field735, 0, var51.field736, 568);
                        var51.method227((byte) 1);
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 200) {
                    this.field1663 = this.field1680.method239();
                    if (this.field1663 == this.field1230) {
                        if (this.field1663 == 3) {
                            this.field1230 = 1;
                        } else {
                            this.field1230 = 3;
                        }
                        this.field1244 = true;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 80) {
                    int var52 = this.field1680.method241();
                    Component var53 = Component.field80[var52];
                    for (int var54 = 0; var54 < var53.field81.length; ++var54) {
                        var53.field81[var54] = -1;
                        var53.field81[var54] = 0;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 143) {
                    int var55 = this.field1680.method241();
                    int var56 = this.field1680.method239();
                    if (var55 == 65535) {
                        var55 = -1;
                    }
                    this.field1625[var56] = var55;
                    this.field1244 = true;
                    this.field1552 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 156) {
                    int var57 = this.field1680.method241();
                    int var58 = this.field1680.method241();
                    if (this.field1331 != -1) {
                        this.field1331 = -1;
                        this.field1431 = true;
                    }
                    if (this.field1289) {
                        this.field1289 = false;
                        this.field1431 = true;
                    }
                    this.field1484 = var57;
                    this.field1676 = var58;
                    this.field1244 = true;
                    this.field1552 = true;
                    this.field1615 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 48) {
                    int var59 = this.field1680.method241();
                    if (var59 == 65535) {
                        var59 = -1;
                    }
                    if (this.field1530 != var59 && this.field1566 && !field1380 && this.field1482 == 0) {
                        this.field1408 = var59;
                        this.field1409 = true;
                        this.field1413.method289(2, this.field1408);
                    }
                    this.field1530 = var59;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 131) {
                    int var60 = this.field1680.method241();
                    int var61 = this.field1680.method241();
                    if (this.field1566 && !field1380) {
                        this.field1408 = var60;
                        this.field1409 = false;
                        this.field1413.method289(2, this.field1408);
                        this.field1482 = var61;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 237) {
                    this.field1453 = 255;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 103) {
                    this.field1306 = this.field1680.method241() * 30;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 248) {
                    this.field1256 = 0;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 106 || this.field1226 == 125 || this.field1226 == 31 || this.field1226 == 82 || this.field1226 == 146 || this.field1226 == 174 || this.field1226 == 38 || this.field1226 == 117 || this.field1226 == 112 || this.field1226 == 84) {
                    this.method508(this.field1226, this.field1680, false);
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 66) {
                    int var62 = this.field1680.method241();
                    byte var63 = this.field1680.method240();
                    this.field1646[var62] = var63;
                    if (this.field1253[var62] != var63) {
                        this.field1253[var62] = var63;
                        this.method541(this.field1596, var62);
                        this.field1244 = true;
                        if (this.field1496 != -1) {
                            this.field1431 = true;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 145) {
                    this.field1244 = true;
                    int var64 = this.field1680.method241();
                    Component var65 = Component.field80[var64];
                    int var66 = this.field1680.method239();
                    for (int var67 = 0; var67 < var66; ++var67) {
                        var65.field81[var67] = this.field1680.method241();
                        int var68 = this.field1680.method239();
                        if (var68 == 255) {
                            var68 = this.field1680.method244();
                        }
                        var65.field82[var67] = var68;
                    }
                    for (int var69 = var66; var69 < var65.field81.length; ++var69) {
                        var65.field81[var69] = 0;
                        var65.field82[var69] = 0;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 183) {
                    int var70 = this.field1680.method241();
                    this.method535(false, var70);
                    if (this.field1676 != -1) {
                        this.field1676 = -1;
                        this.field1244 = true;
                        this.field1552 = true;
                    }
                    this.field1331 = var70;
                    this.field1431 = true;
                    this.field1484 = -1;
                    this.field1615 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 11) {
                    int var71 = this.field1680.method241();
                    int var72 = this.field1680.method241();
                    Component.field80[var71].field129 = 1;
                    Component.field80[var71].field130 = var72;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 19) {
                    InputTracking.method44(0);
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 154) {
                    this.field1639 = this.field1680.method239();
                    this.field1244 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 101) {
                    if (this.field1230 == 12) {
                        this.field1244 = true;
                    }
                    this.field1421 = this.field1680.method242();
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 70) {
                    int var73 = this.field1680.method241();
                    int var74 = this.field1680.method244();
                    this.field1646[var73] = var74;
                    if (this.field1253[var73] != var74) {
                        this.field1253[var73] = var74;
                        this.method541(this.field1596, var73);
                        this.field1244 = true;
                        if (this.field1496 != -1) {
                            this.field1431 = true;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 44) {
                    int var75 = this.field1680.method241();
                    int var76 = this.field1680.method241();
                    Component.field80[var75].field129 = 2;
                    Component.field80[var75].field130 = var76;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 108) {
                    this.field1287 = this.field1680.method241();
                    this.field1252 = this.field1680.method239();
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 29) {
                    this.method469(35249);
                    this.field1226 = -1;
                    return false;
                }
                if (this.field1226 == 74) {
                    int var77 = this.field1680.method241();
                    int var78 = this.field1680.method241();
                    if (this.field1616 == var77 && this.field1617 == var78 && this.field1299 == 2) {
                        this.field1226 = -1;
                        return true;
                    }
                    this.field1616 = var77;
                    this.field1617 = var78;
                    this.field1514 = (this.field1616 - 6) * 8;
                    this.field1515 = (this.field1617 - 6) * 8;
                    this.field1419 = false;
                    if ((this.field1616 / 8 == 48 || this.field1616 / 8 == 49) && this.field1617 / 8 == 48) {
                        this.field1419 = true;
                    }
                    if (this.field1616 / 8 == 48 && this.field1617 / 8 == 148) {
                        this.field1419 = true;
                    }
                    this.field1299 = 1;
                    this.field1259 = System.currentTimeMillis();
                    this.field1592.method268(0);
                    this.field1534.method214(0, "Loading - please wait.", 673, 151, 257);
                    this.field1534.method214(16777215, "Loading - please wait.", 673, 150, 256);
                    this.field1592.method269(4, super.field19, 4, this.field1664);
                    int var79 = 0;
                    for (int var80 = (this.field1616 - 6) / 8; var80 <= (this.field1616 + 6) / 8; ++var80) {
                        for (int var81 = (this.field1617 - 6) / 8; var81 <= (this.field1617 + 6) / 8; ++var81) {
                            ++var79;
                        }
                    }
                    this.field1656 = new byte[var79][];
                    this.field1489 = new byte[var79][];
                    this.field1467 = new int[var79];
                    this.field1468 = new int[var79];
                    this.field1469 = new int[var79];
                    int var82 = 0;
                    for (int var83 = (this.field1616 - 6) / 8; var83 <= (this.field1616 + 6) / 8; ++var83) {
                        for (int var84 = (this.field1617 - 6) / 8; var84 <= (this.field1617 + 6) / 8; ++var84) {
                            this.field1467[var82] = (var83 << 8) + var84;
                            if (this.field1419 && (var84 == 49 || var84 == 149 || var84 == 147 || var83 == 50 || var83 == 49 && var84 == 47)) {
                                this.field1468[var82] = -1;
                                this.field1469[var82] = -1;
                                ++var82;
                            } else {
                                int var85 = this.field1468[var82] = this.field1413.method284(var83, var84, 0, -21445);
                                if (var85 != -1) {
                                    this.field1413.method289(3, var85);
                                }
                                int var86 = this.field1469[var82] = this.field1413.method284(var83, var84, 1, -21445);
                                if (var86 != -1) {
                                    this.field1413.method289(3, var86);
                                }
                                ++var82;
                            }
                        }
                    }
                    int var87 = this.field1514 - this.field1516;
                    int var88 = this.field1515 - this.field1517;
                    this.field1516 = this.field1514;
                    this.field1517 = this.field1515;
                    for (int var89 = 0; var89 < 16384; ++var89) {
                        NpcEntity var90 = this.field1497[var89];
                        if (var90 != null) {
                            for (int var91 = 0; var91 < 10; ++var91) {
                                var90.field477[var91] -= var87;
                                var90.field478[var91] -= var88;
                            }
                            var90.field428 -= var87 * 128;
                            var90.field429 -= var88 * 128;
                        }
                    }
                    for (int var92 = 0; var92 < this.field1361; ++var92) {
                        PlayerEntity var93 = this.field1363[var92];
                        if (var93 != null) {
                            for (int var94 = 0; var94 < 10; ++var94) {
                                var93.field477[var94] -= var87;
                                var93.field478[var94] -= var88;
                            }
                            var93.field428 -= var87 * 128;
                            var93.field429 -= var88 * 128;
                        }
                    }
                    this.field1284 = true;
                    byte var95 = 0;
                    byte var96 = 104;
                    byte var97 = 1;
                    if (var87 < 0) {
                        var95 = 103;
                        var96 = -1;
                        var97 = -1;
                    }
                    byte var98 = 0;
                    byte var99 = 104;
                    byte var100 = 1;
                    if (var88 < 0) {
                        var98 = 103;
                        var99 = -1;
                        var100 = -1;
                    }
                    for (int var101 = var95; var96 != var101; var101 += var97) {
                        for (int var102 = var98; var99 != var102; var102 += var100) {
                            int var103 = var87 + var101;
                            int var104 = var88 + var102;
                            for (int var105 = 0; var105 < 4; ++var105) {
                                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                                    this.field1472[var105][var101][var102] = this.field1472[var105][var103][var104];
                                } else {
                                    this.field1472[var105][var101][var102] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var106 = (LocSpawned) this.field1304.method258(); var106 != null; var106 = (LocSpawned) this.field1304.method260(17736)) {
                        var106.field756 -= var87;
                        var106.field757 -= var88;
                        if (var106.field756 < 0 || var106.field757 < 0 || var106.field756 >= 104 || var106.field757 >= 104) {
                            var106.method120();
                        }
                    }
                    if (this.field1256 != 0) {
                        this.field1256 -= var87;
                        this.field1257 -= var88;
                    }
                    this.field1609 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 223) {
                    int var107 = this.field1680.method241();
                    int var108 = this.field1680.method242();
                    int var109 = this.field1680.method242();
                    Component var110 = Component.field80[var107];
                    var110.field93 = var108;
                    var110.field94 = var109;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 144) {
                    this.field1448 = this.field1680.method239();
                    this.field1502 = this.field1680.method239();
                    this.field1598 = this.field1680.method239();
                    this.field1651 = true;
                    this.field1431 = true;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 114) {
                    this.field1244 = true;
                    int var111 = this.field1680.method241();
                    Component var112 = Component.field80[var111];
                    while (this.field1680.field736 < this.field1225) {
                        int var113 = this.field1680.method239();
                        int var114 = this.field1680.method241();
                        int var115 = this.field1680.method239();
                        if (var115 == 255) {
                            var115 = this.field1680.method244();
                        }
                        if (var113 >= 0 && var113 < var112.field81.length) {
                            var112.field81[var113] = var114;
                            var112.field82[var113] = var115;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 90) {
                    for (int var116 = 0; var116 < this.field1253.length; ++var116) {
                        if (this.field1646[var116] != this.field1253[var116]) {
                            this.field1253[var116] = this.field1646[var116];
                            this.method541(this.field1596, var116);
                            this.field1244 = true;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 199) {
                    int var117 = this.field1680.method241();
                    int var118 = this.field1680.method239();
                    int var119 = this.field1680.method241();
                    if (this.field1403 && !field1380 && this.field1371 < 50) {
                        this.field1586[this.field1371] = var117;
                        this.field1398[this.field1371] = var118;
                        this.field1270[this.field1371] = Wave.field928[var117] + var119;
                        ++this.field1371;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 192) {
                    this.field1609 = true;
                    this.field1234 = this.field1680.method239();
                    this.field1235 = this.field1680.method239();
                    this.field1236 = this.field1680.method241();
                    this.field1237 = this.field1680.method239();
                    this.field1238 = this.field1680.method239();
                    if (this.field1238 >= 100) {
                        int var120 = this.field1234 * 128 + 64;
                        int var121 = this.field1235 * 128 + 64;
                        int var122 = this.method501(this.field1268, var120, var121, 54) - this.field1236;
                        int var123 = var120 - this.field1321;
                        int var124 = var122 - this.field1322;
                        int var125 = var121 - this.field1323;
                        int var126 = (int) Math.sqrt((double) (var123 * var123 + var125 * var125));
                        this.field1324 = (int) (Math.atan2((double) var124, (double) var126) * 325.949D) & 2047;
                        this.field1325 = (int) (Math.atan2((double) var123, (double) var125) * -325.949D) & 2047;
                        if (this.field1324 < 128) {
                            this.field1324 = 128;
                        }
                        if (this.field1324 > 383) {
                            this.field1324 = 383;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 213) {
                    int var127 = this.field1680.method241();
                    int var128 = this.field1680.method242();
                    Component var129 = Component.field80[var127];
                    var129.field133 = var128;
                    if (var128 == -1) {
                        var129.field83 = 0;
                        var129.field84 = 0;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 55) {
                    this.field1446 = this.field1680.method239();
                    this.field1447 = this.field1680.method239();
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 0) {
                    String var130 = this.field1680.method246();
                    if (var130.endsWith(":tradereq:")) {
                        String var131 = var130.substring(0, var130.indexOf(":"));
                        long var132 = JString.method310(var131);
                        boolean var134 = false;
                        for (int var135 = 0; var135 < this.field1599; ++var135) {
                            if (this.field1441[var135] == var132) {
                                var134 = true;
                                break;
                            }
                        }
                        if (!var134 && this.field1300 == 0) {
                            this.method454(2, 4, "wishes to trade with you.", var131);
                        }
                    } else if (!var130.endsWith(":duelreq:")) {
                        this.method454(2, 0, var130, "");
                    } else {
                        String var136 = var130.substring(0, var130.indexOf(":"));
                        long var137 = JString.method310(var136);
                        boolean var139 = false;
                        for (int var140 = 0; var140 < this.field1599; ++var140) {
                            if (this.field1441[var140] == var137) {
                                var139 = true;
                                break;
                            }
                        }
                        if (!var139 && this.field1300 == 0) {
                            this.method454(2, 8, "wishes to duel with you.", var136);
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 100) {
                    this.field1609 = true;
                    this.field1600 = this.field1680.method239();
                    this.field1601 = this.field1680.method239();
                    this.field1602 = this.field1680.method241();
                    this.field1603 = this.field1680.method239();
                    this.field1604 = this.field1680.method239();
                    if (this.field1604 >= 100) {
                        this.field1321 = this.field1600 * 128 + 64;
                        this.field1323 = this.field1601 * 128 + 64;
                        this.field1322 = this.method501(this.field1268, this.field1321, this.field1323, 54) - this.field1602;
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 25) {
                    int var141 = this.field1680.method241();
                    boolean var142 = this.field1680.method239() == 1;
                    Component.field80[var141].field101 = var142;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 209) {
                    int var143 = this.field1680.method241();
                    this.method535(false, var143);
                    if (this.field1676 != -1) {
                        this.field1676 = -1;
                        this.field1244 = true;
                        this.field1552 = true;
                    }
                    if (this.field1331 != -1) {
                        this.field1331 = -1;
                        this.field1431 = true;
                    }
                    if (this.field1289) {
                        this.field1289 = false;
                        this.field1431 = true;
                    }
                    this.field1484 = var143;
                    this.field1615 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 126) {
                    for (int var144 = 0; var144 < this.field1363.length; ++var144) {
                        if (this.field1363[var144] != null) {
                            this.field1363[var144].field456 = -1;
                        }
                    }
                    for (int var145 = 0; var145 < this.field1497.length; ++var145) {
                        if (this.field1497[var145] != null) {
                            this.field1497[var145].field456 = -1;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 42) {
                    if (this.field1230 == 12) {
                        this.field1244 = true;
                    }
                    this.field1265 = this.field1680.method239();
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 104) {
                    this.method500(this.field1225, true, this.field1680);
                    this.field1284 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 56) {
                    this.field1244 = true;
                    int var146 = this.field1680.method239();
                    int var147 = this.field1680.method244();
                    int var148 = this.field1680.method239();
                    this.field1511[var146] = var147;
                    this.field1292[var146] = var148;
                    this.field1239[var146] = 1;
                    for (int var149 = 0; var149 < 98; ++var149) {
                        if (var147 >= field1559[var149]) {
                            this.field1239[var146] = var149 + 2;
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 134) {
                    int var150 = this.field1680.method241();
                    this.method535(false, var150);
                    if (this.field1331 != -1) {
                        this.field1331 = -1;
                        this.field1431 = true;
                    }
                    if (this.field1289) {
                        this.field1289 = false;
                        this.field1431 = true;
                    }
                    this.field1676 = var150;
                    this.field1244 = true;
                    this.field1552 = true;
                    this.field1484 = -1;
                    this.field1615 = false;
                    this.field1226 = -1;
                    return true;
                }
                if (this.field1226 == 105) {
                    this.field1462 = this.field1680.method244();
                    this.field1313 = this.field1680.method241();
                    this.field1637 = this.field1680.method239();
                    this.field1269 = this.field1680.method241();
                    this.field1465 = this.field1680.method239();
                    if (this.field1462 != 0 && this.field1484 == -1) {
                        signlink.dnslookup(JString.method313(this.field1462, 0));
                        this.method439(0);
                        short var151 = 650;
                        if (this.field1637 != 201 || this.field1465 == 1) {
                            var151 = 655;
                        }
                        this.field1665 = "";
                        this.field1298 = false;
                        for (int var152 = 0; var152 < Component.field80.length; ++var152) {
                            if (Component.field80[var152] != null && Component.field80[var152].field89 == var151) {
                                this.field1484 = Component.field80[var152].field86;
                                break;
                            }
                        }
                    }
                    this.field1226 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1226 + "," + this.field1225 + " - " + this.field1667 + "," + this.field1668);
                this.method469(35249);
            } catch (IOException var157) {
                this.method556(19439);
            } catch (Exception var158) {
                String var154 = "T2 - " + this.field1226 + "," + this.field1667 + "," + this.field1668 + " - " + this.field1225 + "," + (field1597.field477[0] + this.field1514) + "," + (field1597.field478[0] + this.field1515) + " - ";
                for (int var155 = 0; var155 < this.field1225 && var155 < 50; ++var155) {
                    var154 = var154 + this.field1680.field735[var155] + ",";
                }
                signlink.reporterror(var154);
                this.method469(35249);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field1225 += arg0;
        Graphics var2 = this.method11(false).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, -456);
        if (this.field1376) {
            this.field1248 = false;
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
        if (this.field1657) {
            this.field1248 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1611) {
            this.field1248 = false;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method449(int arg0) {
        if (arg0 <= 0) {
            this.field1226 = -1;
        }
        int var2 = this.field1582;
        int var3 = this.field1583;
        int var4 = this.field1584;
        int var5 = this.field1585;
        int var6 = 6116423;
        Pix2D.method170(var3, var2, var6, var4, (byte) 51, var5);
        Pix2D.method170(var3 + 1, var2 + 1, 0, var4 - 2, (byte) 51, 16);
        Pix2D.method171((byte) -97, 0, var3 + 18, var4 - 2, var5 - 19, var2 + 1);
        this.field1535.method217(var2 + 3, "Choose Option", var3 + 14, var6, 0);
        int var7 = super.field27;
        int var8 = super.field28;
        if (this.field1581 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1581 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1581 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1348; ++var9) {
            int var10 = (this.field1348 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1535.method219(this.field1386[var9], var10, var2 + 3, var11, 2, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method450(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public static final void method451(byte arg0) {
        World3D.field315 = false;
        Pix3D.field657 = false;
        if (arg0 == 4) {
            boolean var1 = false;
        } else {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        field1380 = false;
        World.field52 = false;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)Z")
    public final boolean method452(int arg0) {
        if (arg0 <= 0) {
            this.field1442.method229(220);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIZIIIIIIII)Z")
    public final boolean method453(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field1315[var15][var36] = 0;
                this.field1470[var15][var36] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg8;
        this.field1315[arg7][arg8] = 99;
        this.field1470[arg7][arg8] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1578[var18] = arg7;
        int var37 = var18 + 1;
        this.field1579[var18] = arg8;
        boolean var20 = false;
        int var21 = this.field1578.length;
        int[][] var22 = this.field1254[this.field1268].field1110;
        while (var37 != var19) {
            var16 = this.field1578[var19];
            var17 = this.field1579[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field1254[this.field1268].method370(arg4 - 1, arg0, arg9, (byte) 1, var17, arg11, var16)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field1254[this.field1268].method371(arg0, this.field1510, arg4 - 1, var17, arg11, var16, arg9)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg2 != 0 && this.field1254[this.field1268].method372(arg2, arg0, arg6, arg9, var17, false, arg5, var16)) {
                var20 = true;
                break;
            }
            int var35 = this.field1470[var16][var17] + 1;
            if (var16 > 0 && this.field1315[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1578[var37] = var16 - 1;
                this.field1579[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 - 1][var17] = 2;
                this.field1470[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field1315[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1578[var37] = var16 + 1;
                this.field1579[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 + 1][var17] = 8;
                this.field1470[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field1315[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1578[var37] = var16;
                this.field1579[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16][var17 - 1] = 1;
                this.field1470[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field1315[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1578[var37] = var16;
                this.field1579[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16][var17 + 1] = 4;
                this.field1470[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field1315[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1578[var37] = var16 - 1;
                this.field1579[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 - 1][var17 - 1] = 3;
                this.field1470[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1315[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1578[var37] = var16 + 1;
                this.field1579[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 + 1][var17 - 1] = 9;
                this.field1470[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1315[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1578[var37] = var16 - 1;
                this.field1579[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 - 1][var17 + 1] = 6;
                this.field1470[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1315[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1578[var37] = var16 + 1;
                this.field1579[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1315[var16 + 1][var17 + 1] = 12;
                this.field1470[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field1317 = 0;
        if (arg1 != 5) {
            throw new NullPointerException();
        } else {
            boolean var23 = false;
            if (!var20) {
                if (arg3) {
                    int var24 = 100;
                    for (int var25 = 1; var25 < 2; ++var25) {
                        for (int var26 = arg0 - var25; var26 <= arg0 + var25; ++var26) {
                            for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field1470[var26][var27] < var24) {
                                    var24 = this.field1470[var26][var27];
                                    var16 = var26;
                                    var17 = var27;
                                    this.field1317 = 1;
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
            byte var28 = 0;
            this.field1578[var28] = var16;
            int var38 = var28 + 1;
            this.field1579[var28] = var17;
            int var29;
            int var30 = var29 = this.field1315[var16][var17];
            while (arg7 != var16 || arg8 != var17) {
                if (var29 != var30) {
                    var29 = var30;
                    this.field1578[var38] = var16;
                    this.field1579[var38++] = var17;
                }
                if ((var30 & 2) != 0) {
                    ++var16;
                } else if ((var30 & 8) != 0) {
                    --var16;
                }
                if ((var30 & 1) != 0) {
                    ++var17;
                } else if ((var30 & 4) != 0) {
                    --var17;
                }
                var30 = this.field1315[var16][var17];
            }
            if (var38 <= 0) {
                if (arg10 == 1) {
                    return false;
                } else {
                    return true;
                }
            } else {
                int var31 = var38;
                if (var38 > 25) {
                    var31 = 25;
                }
                --var38;
                int var32 = this.field1578[var38];
                int var33 = this.field1579[var38];
                if (arg10 == 0) {
                    this.field1442.method228(215, this.field1483);
                    this.field1442.method229(var31 + var31 + 3);
                }
                if (arg10 == 1) {
                    this.field1442.method228(84, this.field1483);
                    this.field1442.method229(var31 + var31 + 3 + 14);
                }
                if (arg10 == 2) {
                    this.field1442.method228(252, this.field1483);
                    this.field1442.method229(var31 + var31 + 3);
                }
                if (super.field37[5] == 1) {
                    this.field1442.method229(1);
                } else {
                    this.field1442.method229(0);
                }
                this.field1442.method230(this.field1514 + var32);
                this.field1442.method230(this.field1515 + var33);
                this.field1256 = this.field1578[0];
                this.field1257 = this.field1579[0];
                for (int var34 = 1; var34 < var31; ++var34) {
                    --var38;
                    this.field1442.method229(this.field1578[var38] - var32);
                    this.field1442.method229(this.field1579[var38] - var33);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method454(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1496 != -1) {
            this.field1451 = arg2;
            super.field33 = 0;
        }
        if (this.field1331 == -1) {
            this.field1431 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1658[var5] = this.field1658[var5 - 1];
            this.field1659[var5] = this.field1659[var5 - 1];
            this.field1660[var5] = this.field1660[var5 - 1];
        }
        this.field1658[0] = arg1;
        this.field1659[0] = arg3;
        if (arg0 != 2) {
            this.field1472 = null;
        }
        this.field1660[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method455(boolean arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1401.method258();
        this.field1513 &= arg0;
        while (var2 != null) {
            if (this.field1268 == var2.field526 && field1247 <= var2.field532) {
                if (field1247 >= var2.field531) {
                    if (var2.field535 > 0) {
                        NpcEntity var3 = this.field1497[var2.field535 - 1];
                        if (var3 != null && var3.field428 >= 0 && var3.field428 < 13312 && var3.field429 >= 0 && var3.field429 < 13312) {
                            var2.method133(field1247, var3.field428, (byte) 67, var3.field429, this.method501(var2.field526, var3.field428, var3.field429, 54) - var2.field530);
                        }
                    }
                    if (var2.field535 < 0) {
                        int var4 = -var2.field535 - 1;
                        PlayerEntity var5;
                        if (this.field1287 == var4) {
                            var5 = field1597;
                        } else {
                            var5 = this.field1363[var4];
                        }
                        if (var5 != null && var5.field428 >= 0 && var5.field428 < 13312 && var5.field429 >= 0 && var5.field429 < 13312) {
                            var2.method133(field1247, var5.field428, (byte) 67, var5.field429, this.method501(var2.field526, var5.field428, var5.field429, 54) - var2.field530);
                        }
                    }
                    var2.method134((byte) -26, this.field1529);
                    this.field1464.method75(var2, (int) var2.field539, this.field1268, -1, (int) var2.field537, 60, (int) var2.field538, var2.field545, false, 37044);
                }
            } else {
                var2.method120();
            }
            var2 = (ProjectileEntity) this.field1401.method260(17736);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method456(int arg0) {
        this.field1438 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1577[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1127; ++var3) {
                if (!IdkType.field1128[var3].field1134 && IdkType.field1128[var3].field1129 == var2 + (this.field1655 ? 0 : 7)) {
                    this.field1577[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != -14998) {
            this.field1618 = this.field1307.method305();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method457(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1638 >= 100 && this.field1252 != 1) {
                this.method454(2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field1638 >= 200) {
                this.method454(2, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = JString.method314(false, JString.method311(-8191, arg0));
                this.field1513 &= arg1;
                for (int var5 = 0; var5 < this.field1638; ++var5) {
                    if (this.field1505[var5] == arg0) {
                        this.method454(2, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1599; ++var6) {
                    if (this.field1441[var6] == arg0) {
                        this.method454(2, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field1597.field488)) {
                    this.field1525[this.field1638] = var4;
                    this.field1505[this.field1638] = arg0;
                    this.field1471[this.field1638] = 0;
                    ++this.field1638;
                    this.field1244 = true;
                    this.field1442.method228(218, this.field1483);
                    this.field1442.method235(arg0, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (arg0 != 0) {
            field1316 = -73;
        }
        if (this.field1537 == 0) {
            int var2 = super.field17 / 2 - 80;
            int var3 = super.field18 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field33 == 1 && super.field34 >= var2 - 75 && super.field34 <= var2 + 75 && super.field35 >= var14 - 20 && super.field35 <= var14 + 20) {
                this.field1537 = 3;
                this.field1560 = 0;
            }
            int var4 = super.field17 / 2 + 80;
            if (super.field33 == 1 && super.field34 >= var4 - 75 && super.field34 <= var4 + 75 && super.field35 >= var14 - 20 && super.field35 <= var14 + 20) {
                this.field1432 = "";
                this.field1433 = "Enter your username & password.";
                this.field1537 = 2;
                this.field1560 = 0;
            }
        } else if (this.field1537 == 2) {
            int var5 = super.field18 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field33 == 1 && super.field35 >= var16 - 15 && super.field35 < var16) {
                this.field1560 = 0;
            }
            var5 = var16 + 15;
            if (super.field33 == 1 && super.field35 >= var5 - 15 && super.field35 < var5) {
                this.field1560 = 1;
            }
            var5 += 15;
            int var6 = super.field17 / 2 - 80;
            int var7 = super.field18 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field33 == 1 && super.field34 >= var6 - 75 && super.field34 <= var6 + 75 && super.field35 >= var17 - 20 && super.field35 <= var17 + 20) {
                this.method509(this.field1277, this.field1278, false);
                if (this.field1513) {
                    return;
                }
            }
            int var8 = super.field17 / 2 + 80;
            if (super.field33 == 1 && super.field34 >= var8 - 75 && super.field34 <= var8 + 75 && super.field35 >= var17 - 20 && super.field35 <= var17 + 20) {
                this.field1537 = 0;
                this.field1277 = "";
                this.field1278 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) 0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1531.length(); ++var11) {
                        if (var9 == field1531.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1560 == 0) {
                        if (var9 == 8 && this.field1277.length() > 0) {
                            this.field1277 = this.field1277.substring(0, this.field1277.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1560 = 1;
                        }
                        if (var10) {
                            this.field1277 = this.field1277 + (char) var9;
                        }
                        if (this.field1277.length() > 12) {
                            this.field1277 = this.field1277.substring(0, 12);
                        }
                    } else if (this.field1560 == 1) {
                        if (var9 == 8 && this.field1278.length() > 0) {
                            this.field1278 = this.field1278.substring(0, this.field1278.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1560 = 0;
                        }
                        if (var10) {
                            this.field1278 = this.field1278 + (char) var9;
                        }
                        if (this.field1278.length() > 20) {
                            this.field1278 = this.field1278.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1537 == 3) {
                int var12 = super.field17 / 2;
                int var13 = super.field18 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field33 == 1 && super.field34 >= var12 - 75 && super.field34 <= var12 + 75 && super.field35 >= var18 - 20 && super.field35 <= var18 + 20) {
                    this.field1537 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method459(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field13 = 5;
        }
        if (field1415) {
            this.field1611 = true;
        } else {
            field1415 = true;
            boolean var1 = false;
            String var2 = this.method554(46264);
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
                this.field1657 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1418[var3] = new FileStream(-61, 500000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3]);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1561[8] = 0;
                    while (this.field1561[8] == 0) {
                        this.method13(8, "Connecting to web server", 20);
                        try {
                            DataInputStream var5 = this.method450("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(45427, new byte[36]);
                            var5.readFully(var6.field735, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1561[var7] = var6.method244();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(8, "Error loading - Will retry in " + var8 + " secs.", 10);
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
                    this.field1635 = this.method466(1, this.field1561[1], "title", 25, field1316, "title screen");
                    this.field1533 = new PixFont(this.field1635, 616, "p11");
                    this.field1534 = new PixFont(this.field1635, 616, "p12");
                    this.field1535 = new PixFont(this.field1635, 616, "b12");
                    this.field1536 = new PixFont(this.field1635, 616, "q8");
                    this.method530(field1587);
                    this.method560(202);
                    Jagfile var9 = this.method466(2, this.field1561[2], "config", 30, field1316, "config");
                    Jagfile var10 = this.method466(3, this.field1561[3], "interface", 35, field1316, "interface");
                    Jagfile var11 = this.method466(4, this.field1561[4], "media", 40, field1316, "2d graphics");
                    Jagfile var12 = this.method466(6, this.field1561[6], "textures", 45, field1316, "textures");
                    Jagfile var13 = this.method466(7, this.field1561[7], "wordenc", 50, field1316, "chat system");
                    Jagfile var14 = this.method466(8, this.field1561[8], "sounds", 55, field1316, "sound effects");
                    this.field1417 = new byte[4][104][104];
                    this.field1369 = new int[4][105][105];
                    this.field1464 = new World3D(false, 104, this.field1369, 4, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1254[var15] = new CollisionMap(104, false, 104);
                    }
                    this.field1258 = new Pix32(512, 512);
                    Jagfile var16 = this.method466(5, this.field1561[5], "versionlist", 60, field1316, "update list");
                    this.method13(8, "Connecting to update server", 60);
                    this.field1413 = new OnDemand();
                    this.field1413.method280(var16, this);
                    AnimFrame.method58(this.field1413.method283(2));
                    Model.method136(this.field1413.method282((byte) 6, 0), this.field1413);
                    if (!field1380) {
                        this.field1408 = 0;
                        this.field1409 = false;
                        this.field1413.method289(2, this.field1408);
                        while (this.field1413.method290() > 0) {
                            this.method521((byte) 2);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13(8, "Requesting animations", 65);
                    int var17 = this.field1413.method282((byte) 6, 1);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1413.method289(1, var18);
                    }
                    while (this.field1413.method290() > 0) {
                        int var19 = var17 - this.field1413.method290();
                        if (var19 > 0) {
                            this.method13(8, "Loading animations - " + var19 * 100 / var17 + "%", 65);
                        }
                        this.method521((byte) 2);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13(8, "Requesting models", 70);
                    int var20 = this.field1413.method282((byte) 6, 0);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1413.method287(var21, -772);
                        if ((var22 & 1) != 0) {
                            this.field1413.method289(0, var21);
                        }
                    }
                    int var23 = this.field1413.method290();
                    while (this.field1413.method290() > 0) {
                        int var24 = var23 - this.field1413.method290();
                        if (var24 > 0) {
                            this.method13(8, "Loading models - " + var24 * 100 / var23 + "%", 70);
                        }
                        this.method521((byte) 2);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1418[0] != null) {
                        this.method13(8, "Requesting maps", 75);
                        this.field1413.method289(3, this.field1413.method284(47, 48, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(47, 48, 1, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 48, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 48, 1, -21445));
                        this.field1413.method289(3, this.field1413.method284(49, 48, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(49, 48, 1, -21445));
                        this.field1413.method289(3, this.field1413.method284(47, 47, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(47, 47, 1, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 47, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 47, 1, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 148, 0, -21445));
                        this.field1413.method289(3, this.field1413.method284(48, 148, 1, -21445));
                        int var25 = this.field1413.method290();
                        while (this.field1413.method290() > 0) {
                            int var26 = var25 - this.field1413.method290();
                            if (var26 > 0) {
                                this.method13(8, "Loading maps - " + var26 * 100 / var25 + "%", 75);
                            }
                            this.method521((byte) 2);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1413.method282((byte) 6, 0);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1413.method287(var28, -772);
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
                            this.field1413.method292(8, var30, var28, 0);
                        }
                    }
                    this.field1413.method285(638, field1379);
                    if (!field1380) {
                        int var31 = this.field1413.method282((byte) 6, 2);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1413.method288(true, var32)) {
                                this.field1413.method292(8, (byte) 1, var32, 2);
                            }
                        }
                    }
                    this.method13(8, "Unpacking media", 80);
                    this.field1677 = new Pix8(var11, "invback", 0);
                    this.field1679 = new Pix8(var11, "chatback", 0);
                    this.field1678 = new Pix8(var11, "mapback", 0);
                    this.field1563 = new Pix8(var11, "backbase1", 0);
                    this.field1564 = new Pix8(var11, "backbase2", 0);
                    this.field1565 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1463[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1420 = new Pix32(var11, "compass", 0);
                    this.field1672 = new Pix32(var11, "mapedge", 0);
                    this.field1672.method196(field1301);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1402[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1624[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1387[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1280[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1506 = new Pix32(var11, "mapmarker", 0);
                    this.field1507 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1669[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1422 = new Pix32(var11, "mapdots", 0);
                    this.field1423 = new Pix32(var11, "mapdots", 1);
                    this.field1424 = new Pix32(var11, "mapdots", 2);
                    this.field1425 = new Pix32(var11, "mapdots", 3);
                    this.field1508 = new Pix8(var11, "scrollbar", 0);
                    this.field1509 = new Pix8(var11, "scrollbar", 1);
                    this.field1381 = new Pix8(var11, "redstone1", 0);
                    this.field1382 = new Pix8(var11, "redstone2", 0);
                    this.field1383 = new Pix8(var11, "redstone3", 0);
                    this.field1384 = new Pix8(var11, "redstone1", 0);
                    this.field1384.method209(923);
                    this.field1385 = new Pix8(var11, "redstone2", 0);
                    this.field1385.method209(923);
                    this.field1293 = new Pix8(var11, "redstone1", 0);
                    this.field1293.method210((byte) 6);
                    this.field1294 = new Pix8(var11, "redstone2", 0);
                    this.field1294.method210((byte) 6);
                    this.field1295 = new Pix8(var11, "redstone3", 0);
                    this.field1295.method210((byte) 6);
                    this.field1296 = new Pix8(var11, "redstone1", 0);
                    this.field1296.method209(923);
                    this.field1296.method210((byte) 6);
                    this.field1297 = new Pix8(var11, "redstone2", 0);
                    this.field1297.method209(923);
                    this.field1297.method210((byte) 6);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1636[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1350 = new PixMap(this.method11(false), var40.field689, var40.field690, field1661);
                    var40.method197(880, 0, 0);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1351 = new PixMap(this.method11(false), var41.field689, var41.field690, field1661);
                    var41.method197(880, 0, 0);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1352 = new PixMap(this.method11(false), var42.field689, var42.field690, field1661);
                    var42.method197(880, 0, 0);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1353 = new PixMap(this.method11(false), var43.field689, var43.field690, field1661);
                    var43.method197(880, 0, 0);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1354 = new PixMap(this.method11(false), var44.field689, var44.field690, field1661);
                    var44.method197(880, 0, 0);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1355 = new PixMap(this.method11(false), var45.field689, var45.field690, field1661);
                    var45.method197(880, 0, 0);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1356 = new PixMap(this.method11(false), var46.field689, var46.field690, field1661);
                    var46.method197(880, 0, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1357 = new PixMap(this.method11(false), var47.field689, var47.field690, field1661);
                    var47.method197(880, 0, 0);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1358 = new PixMap(this.method11(false), var48.field689, var48.field690, field1661);
                    var48.method197(880, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1624[var53] != null) {
                            this.field1624[var53].method195(var50 + var52, var51 + var52, 0, var49 + var52);
                        }
                        if (this.field1402[var53] != null) {
                            this.field1402[var53].method211(var50 + var52, var51 + var52, 0, var49 + var52);
                        }
                    }
                    this.method13(8, "Unpacking textures", 83);
                    Pix3D.method182(true, var12);
                    Pix3D.method186(0.8D, 27381);
                    Pix3D.method181(0, 20);
                    this.method13(8, "Unpacking config", 86);
                    SeqType.method383(var9, 680);
                    LocType.method332(var9);
                    FloType.method373(var9, 680);
                    ObjType.method348(var9);
                    NpcType.method342(var9);
                    IdkType.method377(var9, 680);
                    SpotAnimType.method386(var9, 680);
                    VarpType.method391(var9, 680);
                    VarbitType.method389(var9, 680);
                    ObjType.field1054 = field1379;
                    if (!field1380) {
                        this.method13(8, "Unpacking sounds", 90);
                        byte[] var54 = var14.method309("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(45427, var54);
                        Wave.method322(var55, 680);
                    }
                    this.method13(8, "Unpacking interfaces", 95);
                    PixFont[] var56 = new PixFont[] { this.field1533, this.field1534, this.field1535, this.field1536 };
                    Component.method32((byte) 121, var56, var10, var11);
                    this.method13(8, "Preparing game engine", 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1678.field700[this.field1678.field702 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1555[var57] = var58;
                        this.field1512[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1678.field700[this.field1678.field702 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field1450[var61 - 5] = var62 - 25;
                        this.field1614[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method179(479, 96, 869);
                    this.field1271 = Pix3D.field668;
                    Pix3D.method179(190, 261, 869);
                    this.field1272 = Pix3D.field668;
                    Pix3D.method179(512, 334, 869);
                    this.field1273 = Pix3D.field668;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field666[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method100(512, var65, 0, 500, 334, 800);
                    WordFilter.method393(var13);
                    this.field1632 = new MouseTracking(false, this);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1445 + " " + this.field1342);
                    this.field1376 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method460(int arg0) {
        LocType.field1003.method117();
        LocType.field1004.method117();
        NpcType.field1043.method117();
        ObjType.field1094.method117();
        ObjType.field1095.method117();
        if (arg0 == -13523) {
            PlayerEntity.field509.method117();
            SpotAnimType.field1181.method117();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method461(int arg0) {
        int var2 = 93 / arg0;
        if (this.field1434 != 0) {
            int var3 = 0;
            if (this.field1306 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1660[var4] != null) {
                    int var5 = this.field1658[var4];
                    String var6 = this.field1659[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1502 == 0 || this.field1502 == 1 && this.method480(var6, 0))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field27 > 4 && super.field28 - 4 > var10 - 10 && super.field28 - 4 <= var10 + 3) {
                            int var11 = this.field1534.method216((byte) 7, "From:  " + var6 + this.field1660[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field27 < var11 + 4) {
                                if (this.field1341 >= 1) {
                                    this.field1386[this.field1348] = "Report abuse @whi@" + var6;
                                    this.field1493[this.field1348] = 2034;
                                    ++this.field1348;
                                }
                                this.field1386[this.field1348] = "Add ignore @whi@" + var6;
                                this.field1493[this.field1348] = 2436;
                                ++this.field1348;
                                this.field1386[this.field1348] = "Add friend @whi@" + var6;
                                this.field1493[this.field1348] = 2406;
                                ++this.field1348;
                            }
                        }
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field1502 < 2) {
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBII)V")
    public final void method462(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = this.field1464.method90(arg4, arg0, arg5);
        if (var7 != 0) {
            int var8 = this.field1464.method94(arg4, arg0, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field1258.field688;
            int var13 = (103 - arg5) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method334(var14);
            if (var15.field990 != -1) {
                Pix8 var16 = this.field1402[var15.field990];
                if (var16 != null) {
                    int var17 = (var15.field976 * 4 - var16.field702) / 2;
                    int var18 = (var15.field977 * 4 - var16.field703) / 2;
                    var16.method212((104 - arg5 - var15.field977) * 4 + 48 + var18, this.field1373, arg0 * 4 + 48 + var17);
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
        int var19 = this.field1464.method92(arg4, arg0, arg5);
        if (var19 != 0) {
            int var20 = this.field1464.method94(arg4, arg0, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method334(var23);
            if (var24.field990 != -1) {
                Pix8 var25 = this.field1402[var24.field990];
                if (var25 != null) {
                    int var26 = (var24.field976 * 4 - var25.field702) / 2;
                    int var27 = (var24.field977 * 4 - var25.field703) / 2;
                    var25.method212((104 - arg5 - var24.field977) * 4 + 48 + var27, this.field1373, arg0 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1258.field688;
                int var30 = (103 - arg5) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field1464.method93(arg4, arg0, arg5);
        if (arg3 == 6) {
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                LocType var33 = LocType.method334(var32);
                if (var33.field990 != -1) {
                    Pix8 var34 = this.field1402[var33.field990];
                    if (var34 != null) {
                        int var35 = (var33.field976 * 4 - var34.field702) / 2;
                        int var36 = (var33.field977 * 4 - var34.field703) / 2;
                        var34.method212((104 - arg5 - var33.field977) * 4 + 48 + var36, this.field1373, arg0 * 4 + 48 + var35);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBZ)V")
    public final void method463(int arg0, byte arg1, boolean arg2) {
        signlink.midivol = arg0;
        if (arg1 != 70) {
            this.field1226 = -1;
        }
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;B)V")
    private final void method464(int arg0, Packet arg1, byte arg2) {
        arg1.method249(this.field1567);
        int var4 = arg1.method250(false, 1);
        if (arg2 == 110) {
            if (var4 != 0) {
                int var5 = arg1.method250(false, 2);
                if (var5 == 0) {
                    this.field1367[this.field1366++] = this.field1362;
                } else if (var5 == 1) {
                    int var6 = arg1.method250(false, 3);
                    field1597.method125(false, var6, false);
                    int var7 = arg1.method250(false, 1);
                    if (var7 == 1) {
                        this.field1367[this.field1366++] = this.field1362;
                    }
                } else if (var5 == 2) {
                    int var8 = arg1.method250(false, 3);
                    field1597.method125(false, var8, true);
                    int var9 = arg1.method250(false, 3);
                    field1597.method125(false, var9, true);
                    int var10 = arg1.method250(false, 1);
                    if (var10 == 1) {
                        this.field1367[this.field1366++] = this.field1362;
                    }
                } else if (var5 == 3) {
                    this.field1268 = arg1.method250(false, 2);
                    int var11 = arg1.method250(false, 7);
                    int var12 = arg1.method250(false, 7);
                    int var13 = arg1.method250(false, 1);
                    field1597.method124(var13 == 1, (byte) 126, var12, var11);
                    int var14 = arg1.method250(false, 1);
                    if (var14 == 1) {
                        this.field1367[this.field1366++] = this.field1362;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1650 = true;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method465(int arg0) {
        if (arg0 != 8) {
            this.field1472 = null;
        }
        if (super.field33 == 1) {
            int var2 = super.field34 - 25 - 550;
            int var3 = super.field35 - 5 - 4;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1476 + this.field1405 & 2047;
                int var5 = Pix3D.field666[var4];
                int var6 = Pix3D.field667[var4];
                int var7 = (this.field1443 + 256) * var5 >> 8;
                int var8 = (this.field1443 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = field1597.field428 + var9 >> 7;
                int var12 = field1597.field429 - var10 >> 7;
                boolean var13 = this.method453(var11, (byte) 5, 0, true, 0, 0, 0, field1597.field477[0], field1597.field478[0], var12, 1, 0);
                if (var13) {
                    this.field1442.method229(var2);
                    this.field1442.method229(var3);
                    this.field1442.method230(this.field1405);
                    this.field1442.method229(57);
                    this.field1442.method229(this.field1476);
                    this.field1442.method229(this.field1443);
                    this.field1442.method229(89);
                    this.field1442.method230(field1597.field428);
                    this.field1442.method230(field1597.field429);
                    this.field1442.method229(this.field1317);
                    this.field1442.method229(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;IILjava/lang/String;)Lyb;")
    public final Jagfile method466(int arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1418[0] != null) {
                var7 = this.field1418[0].method301(arg0, (byte) 66);
            }
        } catch (Exception var29) {
        }
        if (var7 != null) {
            this.field1501.reset();
            this.field1501.update(var7);
            int var9 = (int) this.field1501.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, (byte) -25);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(8, "Requesting " + arg5, arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method450(arg2 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(45427, var16);
                    var17.field736 = 3;
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
                            this.method13(8, "Loading " + arg5 + " - " + var23 + "%", arg3);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1418[0] != null) {
                            this.field1418[0].method302(var7.length, arg0, var7, true);
                        }
                    } catch (Exception var28) {
                        this.field1418[0] = null;
                    }
                    if (var7 != null) {
                        this.field1501.reset();
                        this.field1501.update(var7);
                        int var24 = (int) this.field1501.getValue();
                        if (arg1 != var24) {
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
                            this.method13(8, "Game updated - please reload page", arg3);
                            var25 = 10;
                        } else {
                            this.method13(8, var12 + " - Retrying in " + var25, arg3);
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
            Jagfile var26 = new Jagfile(var7, (byte) -25);
            if (field1316 != arg4) {
                field1661 = -426;
            }
            return var26;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method467(boolean arg0) {
        if (this.field1627 == 0 && this.field1343 == 0) {
            this.field1386[this.field1348] = "Walk here";
            this.field1493[this.field1348] = 660;
            this.field1491[this.field1348] = super.field27;
            this.field1492[this.field1348] = super.field28;
            ++this.field1348;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field624; ++var3) {
            int var4 = Model.field625[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1464.method94(this.field1268, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method334(var8);
                    if (this.field1627 == 1) {
                        this.field1386[this.field1348] = "Use " + this.field1631 + " with @cya@" + var9.field972;
                        this.field1493[this.field1348] = 450;
                        this.field1494[this.field1348] = var4;
                        this.field1491[this.field1348] = var5;
                        this.field1492[this.field1348] = var6;
                        ++this.field1348;
                    } else if (this.field1343 == 1) {
                        if ((this.field1345 & 4) == 4) {
                            this.field1386[this.field1348] = this.field1346 + " @cya@" + var9.field972;
                            this.field1493[this.field1348] = 55;
                            this.field1494[this.field1348] = var4;
                            this.field1491[this.field1348] = var5;
                            this.field1492[this.field1348] = var6;
                            ++this.field1348;
                        }
                    } else {
                        if (var9.field988 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field988[var10] != null) {
                                    this.field1386[this.field1348] = var9.field988[var10] + " @cya@" + var9.field972;
                                    if (var10 == 0) {
                                        this.field1493[this.field1348] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1493[this.field1348] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1493[this.field1348] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1493[this.field1348] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1493[this.field1348] = 1501;
                                    }
                                    this.field1494[this.field1348] = var4;
                                    this.field1491[this.field1348] = var5;
                                    this.field1492[this.field1348] = var6;
                                    ++this.field1348;
                                }
                            }
                        }
                        this.field1386[this.field1348] = "Examine @cya@" + var9.field972;
                        this.field1493[this.field1348] = 1175;
                        this.field1494[this.field1348] = var4;
                        this.field1491[this.field1348] = var5;
                        this.field1492[this.field1348] = var6;
                        ++this.field1348;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1497[var8];
                    if (var11.field484.field1021 == 1 && (var11.field428 & 127) == 64 && (var11.field429 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1498; ++var12) {
                            NpcEntity var13 = this.field1497[this.field1499[var12]];
                            if (var13 != null && var11 != var13 && var13.field484.field1021 == 1 && var11.field428 == var13.field428 && var11.field429 == var13.field429) {
                                this.method536(var13.field484, this.field1499[var12], 9, var5, var6);
                            }
                        }
                    }
                    this.method536(var11.field484, var8, 9, var5, var6);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1363[var8];
                    if ((var14.field428 & 127) == 64 && (var14.field429 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1498; ++var15) {
                            NpcEntity var18 = this.field1497[this.field1499[var15]];
                            if (var18 != null && var18.field484.field1021 == 1 && var14.field428 == var18.field428 && var14.field429 == var18.field429) {
                                this.method536(var18.field484, this.field1499[var15], 9, var5, var6);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1364; ++var16) {
                            PlayerEntity var17 = this.field1363[this.field1365[var16]];
                            if (var17 != null && var14 != var17 && var14.field428 == var17.field428 && var14.field429 == var17.field429) {
                                this.method440(var5, (byte) 3, this.field1365[var16], var6, var17);
                            }
                        }
                    }
                    this.method440(var5, (byte) 3, var8, var6, var14);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1472[this.field1268][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method259((byte) 69); var20 != null; var20 = (ObjStackEntity) var19.method261(19781)) {
                            ObjType var21 = ObjType.method350(var20.field520);
                            if (this.field1627 == 1) {
                                this.field1386[this.field1348] = "Use " + this.field1631 + " with @lre@" + var21.field1057;
                                this.field1493[this.field1348] = 217;
                                this.field1494[this.field1348] = var20.field520;
                                this.field1491[this.field1348] = var5;
                                this.field1492[this.field1348] = var6;
                                ++this.field1348;
                            } else if (this.field1343 == 1) {
                                if ((this.field1345 & 1) == 1) {
                                    this.field1386[this.field1348] = this.field1346 + " @lre@" + var21.field1057;
                                    this.field1493[this.field1348] = 965;
                                    this.field1494[this.field1348] = var20.field520;
                                    this.field1491[this.field1348] = var5;
                                    this.field1492[this.field1348] = var6;
                                    ++this.field1348;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1071 != null && var21.field1071[var22] != null) {
                                        this.field1386[this.field1348] = var21.field1071[var22] + " @lre@" + var21.field1057;
                                        if (var22 == 0) {
                                            this.field1493[this.field1348] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1493[this.field1348] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1493[this.field1348] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1493[this.field1348] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1493[this.field1348] = 877;
                                        }
                                        this.field1494[this.field1348] = var20.field520;
                                        this.field1491[this.field1348] = var5;
                                        this.field1492[this.field1348] = var6;
                                        ++this.field1348;
                                    } else if (var22 == 2) {
                                        this.field1386[this.field1348] = "Take @lre@" + var21.field1057;
                                        this.field1493[this.field1348] = 99;
                                        this.field1494[this.field1348] = var20.field520;
                                        this.field1491[this.field1348] = var5;
                                        this.field1492[this.field1348] = var6;
                                        ++this.field1348;
                                    }
                                }
                                this.field1386[this.field1348] = "Examine @lre@" + var21.field1057;
                                this.field1493[this.field1348] = 1102;
                                this.field1494[this.field1348] = var20.field520;
                                this.field1491[this.field1348] = var5;
                                this.field1492[this.field1348] = var6;
                                ++this.field1348;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        int var12 = 41 / arg9;
        for (LocSpawned var13 = (LocSpawned) this.field1304.method258(); var13 != null; var13 = (LocSpawned) this.field1304.method260(17736)) {
            if (var13.field754 == arg0 && var13.field756 == arg7 && var13.field757 == arg2 && var13.field755 == arg6) {
                var11 = var13;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field754 = arg0;
            var11.field755 = arg6;
            var11.field756 = arg7;
            var11.field757 = arg2;
            this.method503(2, var11);
            this.field1304.method255(var11);
        }
        var11.field761 = arg8;
        var11.field763 = arg1;
        var11.field762 = arg5;
        var11.field764 = arg3;
        var11.field765 = arg4;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method469(int arg0) {
        try {
            if (this.field1347 != null) {
                this.field1347.method38();
            }
        } catch (Exception var3) {
        }
        this.field1347 = null;
        this.field1513 = false;
        this.field1537 = 0;
        this.field1277 = "";
        this.field1278 = "";
        InputTracking.method45((byte) 86);
        this.method460(-13523);
        if (arg0 != 35249) {
            field1661 = -262;
        }
        this.field1464.method64(-24120);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1254[var2].method361(this.field1276);
        }
        System.gc();
        this.method559(false);
        this.field1530 = -1;
        this.field1408 = -1;
        this.field1482 = 0;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1414) {
            this.method487(268);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method470(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 != 17979) {
            this.field1226 = -1;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method471(byte arg0) {
        int var2 = this.field1600 * 128 + 64;
        int var3 = this.field1601 * 128 + 64;
        int var4 = this.method501(this.field1268, var2, var3, 54) - this.field1602;
        if (this.field1321 < var2) {
            this.field1321 += (var2 - this.field1321) * this.field1604 / 1000 + this.field1603;
            if (this.field1321 > var2) {
                this.field1321 = var2;
            }
        }
        if (this.field1321 > var2) {
            this.field1321 -= (this.field1321 - var2) * this.field1604 / 1000 + this.field1603;
            if (this.field1321 < var2) {
                this.field1321 = var2;
            }
        }
        if (this.field1322 < var4) {
            this.field1322 += (var4 - this.field1322) * this.field1604 / 1000 + this.field1603;
            if (this.field1322 > var4) {
                this.field1322 = var4;
            }
        }
        if (this.field1322 > var4) {
            this.field1322 -= (this.field1322 - var4) * this.field1604 / 1000 + this.field1603;
            if (this.field1322 < var4) {
                this.field1322 = var4;
            }
        }
        if (this.field1323 < var3) {
            this.field1323 += (var3 - this.field1323) * this.field1604 / 1000 + this.field1603;
            if (this.field1323 > var3) {
                this.field1323 = var3;
            }
        }
        if (this.field1323 > var3) {
            this.field1323 -= (this.field1323 - var3) * this.field1604 / 1000 + this.field1603;
            if (this.field1323 < var3) {
                this.field1323 = var3;
            }
        }
        int var5 = this.field1234 * 128 + 64;
        int var6 = this.field1235 * 128 + 64;
        if (arg0 != 37) {
            this.field1675 = this.field1307.method305();
        }
        int var7 = this.method501(this.field1268, var5, var6, 54) - this.field1236;
        int var8 = var5 - this.field1321;
        int var9 = var7 - this.field1322;
        int var10 = var6 - this.field1323;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1324 < var12) {
            this.field1324 += (var12 - this.field1324) * this.field1238 / 1000 + this.field1237;
            if (this.field1324 > var12) {
                this.field1324 = var12;
            }
        }
        if (this.field1324 > var12) {
            this.field1324 -= (this.field1324 - var12) * this.field1238 / 1000 + this.field1237;
            if (this.field1324 < var12) {
                this.field1324 = var12;
            }
        }
        int var14 = var13 - this.field1325;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1325 += this.field1238 * var14 / 1000 + this.field1237;
            this.field1325 &= 2047;
        }
        if (var14 < 0) {
            this.field1325 -= -var14 * this.field1238 / 1000 + this.field1237;
            this.field1325 &= 2047;
        }
        int var15 = var13 - this.field1325;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1325 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method472(boolean arg0) {
        this.field1513 &= arg0;
        this.field1590.method268(0);
        Pix3D.field668 = this.field1272;
        this.field1677.method212(0, this.field1373, 0);
        if (this.field1676 != -1) {
            this.method526(Component.field80[this.field1676], -640, 0, 0, 0);
        } else if (this.field1625[this.field1230] != -1) {
            this.method526(Component.field80[this.field1625[this.field1230]], -640, 0, 0, 0);
        }
        if (this.field1642 && this.field1581 == 1) {
            this.method449(341);
        }
        this.field1590.method269(553, super.field19, 205, this.field1664);
        this.field1592.method268(0);
        Pix3D.field668 = this.field1273;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Z)V")
    private final void method473(int arg0, Packet arg1, boolean arg2) {
        if (!arg2) {
            this.field1596 = !this.field1596;
        }
        for (int var4 = 0; var4 < this.field1366; ++var4) {
            int var5 = this.field1367[var4];
            PlayerEntity var6 = this.field1363[var5];
            int var7 = arg1.method239();
            if ((var7 & 128) == 128) {
                var7 += arg1.method239() << 8;
            }
            this.method532(var5, var6, (byte) 7, arg1, var7);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method474(int arg0) {
        this.field1225 += arg0;
        short var2 = 256;
        if (this.field1540 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1540 > 768) {
                    this.field1681[var3] = this.method481(this.field1683[var3], this.field1682[var3], false, 1024 - this.field1540);
                } else if (this.field1540 > 256) {
                    this.field1681[var3] = this.field1683[var3];
                } else {
                    this.field1681[var3] = this.method481(this.field1682[var3], this.field1683[var3], false, 256 - this.field1540);
                }
            }
        } else if (this.field1541 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1541 > 768) {
                    this.field1681[var4] = this.method481(this.field1684[var4], this.field1682[var4], false, 1024 - this.field1541);
                } else if (this.field1541 > 256) {
                    this.field1681[var4] = this.field1684[var4];
                } else {
                    this.field1681[var4] = this.method481(this.field1682[var4], this.field1684[var4], false, 256 - this.field1541);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1681[var5] = this.field1682[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1335.field781[var6] = this.field1429.field688[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1428[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1223[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1681[var26];
                    int var30 = this.field1335.field781[var8];
                    this.field1335.field781[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1335.method269(0, super.field19, 0, this.field1664);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1336.field781[var10] = this.field1430.field688[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1428[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1223[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1681[var18];
                    int var22 = this.field1336.field781[var16];
                    this.field1336.field781[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1336.method269(637, super.field19, 0, this.field1664);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILz;)V")
    public final void method475(int arg0, int arg1, PathingEntity arg2) {
        this.method476(arg0, 29445, arg2.field428, arg2.field429);
        if (arg1 <= 0) {
            this.field1276 = -59;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 29445) {
            this.field1373 = -133;
        }
        if (arg2 >= 128 && arg3 >= 128 && arg2 <= 13056 && arg3 <= 13056) {
            int var5 = this.method501(this.field1268, arg2, arg3, 54) - arg0;
            int var6 = arg2 - this.field1321;
            int var7 = var5 - this.field1322;
            int var8 = arg3 - this.field1323;
            int var9 = Model.field626[this.field1324];
            int var10 = Model.field627[this.field1324];
            int var11 = Model.field626[this.field1325];
            int var12 = Model.field627[this.field1325];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1302 = (var13 << 9) / var17 + Pix3D.field662;
                this.field1303 = (var16 << 9) / var17 + Pix3D.field663;
            } else {
                this.field1302 = -1;
                this.field1303 = -1;
            }
        } else {
            this.field1302 = -1;
            this.field1303 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIIIII)V")
    private final void method477(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 5) {
            this.field1472 = null;
        }
        if (arg7 >= 1 && arg3 >= 1 && arg7 <= 102 && arg3 <= 102) {
            if (field1380 && this.field1268 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field1464.method90(arg4, arg7, arg3);
            }
            if (arg6 == 1) {
                var9 = this.field1464.method91(arg3, (byte) 6, arg4, arg7);
            }
            if (arg6 == 2) {
                var9 = this.field1464.method92(arg4, arg7, arg3);
            }
            if (arg6 == 3) {
                var9 = this.field1464.method93(arg4, arg7, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1464.method94(arg4, arg7, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field1464.method81(940, arg3, arg7, arg4);
                    LocType var17 = LocType.method334(var14);
                    if (var17.field978) {
                        this.field1254[arg4].method366(arg7, (byte) 119, arg3, var16, var17.field979, var15);
                    }
                }
                if (arg6 == 1) {
                    this.field1464.method82(true, arg3, arg7, arg4);
                }
                if (arg6 == 2) {
                    this.field1464.method83(arg3, arg7, arg4, false);
                    LocType var18 = LocType.method334(var14);
                    if (var18.field976 + arg7 > 103 || var18.field976 + arg3 > 103 || var18.field977 + arg7 > 103 || var18.field977 + arg3 > 103) {
                        return;
                    }
                    if (var18.field978) {
                        this.field1254[arg4].method367(var18.field976, var18.field979, arg7, 591, arg3, var16, var18.field977);
                    }
                }
                if (arg6 == 3) {
                    this.field1464.method84(arg3, arg4, arg7, -43125);
                    LocType var19 = LocType.method334(var14);
                    if (var19.field978 && var19.field980) {
                        this.field1254[arg4].method369(arg3, arg7, this.field1326);
                    }
                }
            }
            if (arg0 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field1417[1][arg7][arg3] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                World.method31(this.field1254[arg4], this.field1464, arg4, true, arg3, arg7, var20, this.field1369, arg0, arg1, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method13(int arg0, String arg1, int arg2) {
        this.field1342 = arg2;
        this.field1445 = arg1;
        this.method432(0);
        if (this.field1635 == null) {
            super.method13(8, arg1, arg2);
        } else {
            this.field1334.method268(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1535.method214(16777215, "RuneScape is loading - please wait...", 673, var5 / 2 - 26 - var6, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method171((byte) -97, 9179409, var7, 304, 34, var4 / 2 - 152);
            Pix2D.method171((byte) -97, 0, var7 + 1, 302, 32, var4 / 2 - 151);
            Pix2D.method170(var7 + 2, var4 / 2 - 150, 9179409, arg2 * 3, (byte) 51, 30);
            if (arg0 == 8) {
                Pix2D.method170(var7 + 2, arg2 * 3 + (var4 / 2 - 150), 0, 300 - arg2 * 3, (byte) 51, 30);
                this.field1535.method214(16777215, arg1, 673, var5 / 2 + 5 - var6, var4 / 2);
                this.field1334.method269(202, super.field19, 171, this.field1664);
                if (this.field1650) {
                    this.field1650 = false;
                    if (!this.field1248) {
                        this.field1335.method269(0, super.field19, 0, this.field1664);
                        this.field1336.method269(637, super.field19, 0, this.field1664);
                    }
                    this.field1332.method269(128, super.field19, 0, this.field1664);
                    this.field1333.method269(202, super.field19, 371, this.field1664);
                    this.field1337.method269(0, super.field19, 265, this.field1664);
                    this.field1338.method269(562, super.field19, 265, this.field1664);
                    this.field1339.method269(128, super.field19, 171, this.field1664);
                    this.field1340.method269(562, super.field19, 171, this.field1664);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1611 && !this.field1376 && !this.field1657) {
            ++field1488;
            if (!this.field1513) {
                this.method545(false, 0);
            } else {
                this.method499(-208);
            }
            this.field1305 = 0;
            if (arg0 != 0) {
                this.field1226 = -1;
            }
        } else {
            this.method448(0);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method478(boolean arg0) {
        if (this.field1459 == 0) {
            this.field1386[0] = "Cancel";
            this.field1493[0] = 1252;
            this.field1348 = 1;
            this.method461(this.field1474);
            this.field1309 = 0;
            if (super.field27 > 4 && super.field28 > 4 && super.field27 < 516 && super.field28 < 338) {
                if (this.field1484 != -1) {
                    this.method516(0, super.field28, 4, 4, -381, super.field27, Component.field80[this.field1484]);
                } else {
                    this.method467(this.field1411);
                }
            }
            if (this.field1309 != this.field1285) {
                this.field1285 = this.field1309;
            }
            this.field1309 = 0;
            if (arg0) {
                this.field1226 = this.field1680.method239();
            }
            if (super.field27 > 553 && super.field28 > 205 && super.field27 < 743 && super.field28 < 466) {
                if (this.field1676 != -1) {
                    this.method516(0, super.field28, 553, 205, -381, super.field27, Component.field80[this.field1676]);
                } else if (this.field1625[this.field1230] != -1) {
                    this.method516(0, super.field28, 553, 205, -381, super.field27, Component.field80[this.field1625[this.field1230]]);
                }
            }
            if (this.field1309 != this.field1274) {
                this.field1244 = true;
                this.field1274 = this.field1309;
            }
            this.field1309 = 0;
            if (super.field27 > 17 && super.field28 > 357 && super.field27 < 496 && super.field28 < 453) {
                if (this.field1331 != -1) {
                    this.method516(0, super.field28, 17, 357, -381, super.field27, Component.field80[this.field1331]);
                } else if (super.field28 < 434 && super.field27 < 426) {
                    this.method552(super.field27 - 17, super.field28 - 357, -530);
                }
            }
            if (this.field1331 != -1 && this.field1557 != this.field1309) {
                this.field1431 = true;
                this.field1557 = this.field1309;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1348 - 1; ++var3) {
                    if (this.field1493[var3] < 1000 && this.field1493[var3 + 1] > 1000) {
                        String var4 = this.field1386[var3];
                        this.field1386[var3] = this.field1386[var3 + 1];
                        this.field1386[var3 + 1] = var4;
                        int var5 = this.field1493[var3];
                        this.field1493[var3] = this.field1493[var3 + 1];
                        this.field1493[var3 + 1] = var5;
                        int var6 = this.field1491[var3];
                        this.field1491[var3] = this.field1491[var3 + 1];
                        this.field1491[var3 + 1] = var6;
                        int var7 = this.field1492[var3];
                        this.field1492[var3] = this.field1492[var3 + 1];
                        this.field1492[var3 + 1] = var7;
                        int var8 = this.field1494[var3];
                        this.field1494[var3] = this.field1494[var3 + 1];
                        this.field1494[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method479(int arg0) {
        if (this.field1593 == null) {
            this.method442(true);
            super.field20 = null;
            this.field1332 = null;
            this.field1333 = null;
            this.field1334 = null;
            this.field1335 = null;
            if (arg0 >= 0) {
                this.field1226 = this.field1680.method239();
            }
            this.field1336 = null;
            this.field1337 = null;
            this.field1338 = null;
            this.field1339 = null;
            this.field1340 = null;
            this.field1593 = new PixMap(this.method11(false), 479, 96, field1661);
            this.field1591 = new PixMap(this.method11(false), 172, 156, field1661);
            Pix2D.method168(-692);
            this.field1678.method212(0, this.field1373, 0);
            this.field1590 = new PixMap(this.method11(false), 190, 261, field1661);
            this.field1592 = new PixMap(this.method11(false), 512, 334, field1661);
            Pix2D.method168(-692);
            this.field1573 = new PixMap(this.method11(false), 496, 50, field1661);
            this.field1574 = new PixMap(this.method11(false), 269, 37, field1661);
            this.field1575 = new PixMap(this.method11(false), 249, 45, field1661);
            this.field1650 = true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field22 != null) {
                    return new URL("http://127.0.0.1:" + (field1378 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method480(String arg0, int arg1) {
        this.field1225 += arg1;
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1638; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1525[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field1597.field488);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method481(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg2) {
            this.field1472 = null;
        }
        return ((arg0 & 16711935) * arg3 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLmb;)V")
    private final void method482(int arg0, boolean arg1, Packet arg2) {
        if (!arg1) {
            this.field1375 = !this.field1375;
        }
        while (arg2.field737 + 21 < arg0 * 8) {
            int var4 = arg2.method250(false, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field1497[var4] == null) {
                this.field1497[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1497[var4];
            this.field1499[this.field1498++] = var4;
            var5.field473 = field1247;
            var5.field484 = NpcType.method344(arg2.method250(false, 11));
            var5.field432 = var5.field484.field1021;
            var5.field435 = var5.field484.field1025;
            var5.field436 = var5.field484.field1026;
            var5.field437 = var5.field484.field1027;
            var5.field438 = var5.field484.field1028;
            var5.field433 = var5.field484.field1024;
            int var6 = arg2.method250(false, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method250(false, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method124(false, (byte) 126, field1597.field478[0] + var7, field1597.field477[0] + var6);
            int var8 = arg2.method250(false, 1);
            if (var8 == 1) {
                this.field1367[this.field1366++] = var4;
            }
        }
        arg2.method251(1);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method483(byte arg0) {
        if (arg0 != -5) {
            this.field1286 = !this.field1286;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5((byte) 0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1484 != -1 && this.field1570 == this.field1484) {
                        if (var2 == 8 && this.field1665.length() > 0) {
                            this.field1665 = this.field1665.substring(0, this.field1665.length() - 1);
                        }
                        break;
                    }
                    if (this.field1486) {
                        if (var2 >= 32 && var2 <= 122 && this.field1532.length() < 80) {
                            this.field1532 = this.field1532 + (char) var2;
                            this.field1431 = true;
                        }
                        if (var2 == 8 && this.field1532.length() > 0) {
                            this.field1532 = this.field1532.substring(0, this.field1532.length() - 1);
                            this.field1431 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1486 = false;
                            this.field1431 = true;
                            if (this.field1400 == 1) {
                                long var3 = JString.method310(this.field1532);
                                this.method457(var3, true);
                            }
                            if (this.field1400 == 2 && this.field1638 > 0) {
                                long var5 = JString.method310(this.field1532);
                                this.method502(3, var5);
                            }
                            if (this.field1400 == 3 && this.field1532.length() > 0) {
                                this.field1442.method228(217, this.field1483);
                                this.field1442.method229(0);
                                int var7 = this.field1442.field736;
                                this.field1442.method235(this.field1282, 0);
                                WordPack.method318(0, this.field1532, this.field1442);
                                this.field1442.method238(this.field1442.field736 - var7, this.field1370);
                                this.field1532 = JString.method315(false, this.field1532);
                                this.field1532 = WordFilter.method403(-39648, this.field1532);
                                this.method454(2, 6, this.field1532, JString.method314(false, JString.method311(-8191, this.field1282)));
                                if (this.field1502 == 2) {
                                    this.field1502 = 1;
                                    this.field1651 = true;
                                    this.field1442.method228(94, this.field1483);
                                    this.field1442.method229(this.field1448);
                                    this.field1442.method229(this.field1502);
                                    this.field1442.method229(this.field1598);
                                }
                            }
                            if (this.field1400 == 4 && this.field1599 < 100) {
                                long var8 = JString.method310(this.field1532);
                                this.method490(253, var8);
                            }
                            if (this.field1400 == 5 && this.field1599 > 0) {
                                long var10 = JString.method310(this.field1532);
                                this.method512(var10, true);
                            }
                        }
                    } else if (this.field1289) {
                        if (var2 >= 48 && var2 <= 57 && this.field1576.length() < 10) {
                            this.field1576 = this.field1576 + (char) var2;
                            this.field1431 = true;
                        }
                        if (var2 == 8 && this.field1576.length() > 0) {
                            this.field1576 = this.field1576.substring(0, this.field1576.length() - 1);
                            this.field1431 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1576.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1576);
                                } catch (Exception var17) {
                                }
                                this.field1442.method228(19, this.field1483);
                                this.field1442.method233(var12);
                            }
                            this.field1289 = false;
                            this.field1431 = true;
                        }
                    } else if (this.field1331 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1622.length() < 80) {
                            this.field1622 = this.field1622 + (char) var2;
                            this.field1431 = true;
                        }
                        if (var2 == 8 && this.field1622.length() > 0) {
                            this.field1622 = this.field1622.substring(0, this.field1622.length() - 1);
                            this.field1431 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1622.length() > 0) {
                            if (this.field1341 == 2) {
                                if (this.field1622.equals("::clientdrop")) {
                                    this.method556(19439);
                                }
                                if (this.field1622.equals("::lag")) {
                                    this.method549(28009);
                                }
                                if (this.field1622.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1413.method282((byte) 6, 2); ++var13) {
                                        this.field1413.method292(8, (byte) 1, var13, 2);
                                    }
                                }
                            }
                            if (this.field1622.startsWith("::")) {
                                this.field1442.method228(92, this.field1483);
                                this.field1442.method229(this.field1622.length() - 1);
                                this.field1442.method236(this.field1622.substring(2));
                            } else {
                                byte var14 = 0;
                                if (this.field1622.startsWith("yellow:")) {
                                    var14 = 0;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                if (this.field1622.startsWith("red:")) {
                                    var14 = 1;
                                    this.field1622 = this.field1622.substring(4);
                                }
                                if (this.field1622.startsWith("green:")) {
                                    var14 = 2;
                                    this.field1622 = this.field1622.substring(6);
                                }
                                if (this.field1622.startsWith("cyan:")) {
                                    var14 = 3;
                                    this.field1622 = this.field1622.substring(5);
                                }
                                if (this.field1622.startsWith("purple:")) {
                                    var14 = 4;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                if (this.field1622.startsWith("white:")) {
                                    var14 = 5;
                                    this.field1622 = this.field1622.substring(6);
                                }
                                if (this.field1622.startsWith("flash1:")) {
                                    var14 = 6;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                if (this.field1622.startsWith("flash2:")) {
                                    var14 = 7;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                if (this.field1622.startsWith("flash3:")) {
                                    var14 = 8;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                if (this.field1622.startsWith("glow1:")) {
                                    var14 = 9;
                                    this.field1622 = this.field1622.substring(6);
                                }
                                if (this.field1622.startsWith("glow2:")) {
                                    var14 = 10;
                                    this.field1622 = this.field1622.substring(6);
                                }
                                if (this.field1622.startsWith("glow3:")) {
                                    var14 = 11;
                                    this.field1622 = this.field1622.substring(6);
                                }
                                byte var15 = 0;
                                if (this.field1622.startsWith("wave:")) {
                                    var15 = 1;
                                    this.field1622 = this.field1622.substring(5);
                                }
                                if (this.field1622.startsWith("scroll:")) {
                                    var15 = 2;
                                    this.field1622 = this.field1622.substring(7);
                                }
                                this.field1442.method228(87, this.field1483);
                                this.field1442.method229(0);
                                int var16 = this.field1442.field736;
                                this.field1442.method229(var14);
                                this.field1442.method229(var15);
                                WordPack.method318(0, this.field1622, this.field1442);
                                this.field1442.method238(this.field1442.field736 - var16, this.field1370);
                                this.field1622 = JString.method315(false, this.field1622);
                                this.field1622 = WordFilter.method403(-39648, this.field1622);
                                field1597.field440 = this.field1622;
                                field1597.field442 = var14;
                                field1597.field443 = var15;
                                field1597.field441 = 150;
                                if (this.field1341 == 2) {
                                    this.method454(2, 2, field1597.field440, "@cr2@" + field1597.field488);
                                } else if (this.field1341 == 1) {
                                    this.method454(2, 2, field1597.field440, "@cr1@" + field1597.field488);
                                } else {
                                    this.method454(2, 2, field1597.field440, field1597.field488);
                                }
                                if (this.field1448 == 2) {
                                    this.field1448 = 3;
                                    this.field1651 = true;
                                    this.field1442.method228(94, this.field1483);
                                    this.field1442.method229(this.field1448);
                                    this.field1442.method229(this.field1502);
                                    this.field1442.method229(this.field1598);
                                }
                            }
                            this.field1622 = "";
                            this.field1431 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1665.length() < 12) {
                this.field1665 = this.field1665 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method484(int arg0) {
        for (int var2 = -1; var2 < this.field1364; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1362;
            } else {
                var6 = this.field1365[var2];
            }
            PlayerEntity var7 = this.field1363[var6];
            if (var7 != null && var7.field441 > 0) {
                --var7.field441;
                if (var7.field441 == 0) {
                    var7.field440 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1498; ++var3) {
            int var4 = this.field1499[var3];
            NpcEntity var5 = this.field1497[var4];
            if (var5 != null && var5.field441 > 0) {
                --var5.field441;
                if (var5.field441 == 0) {
                    var5.field440 = null;
                }
            }
        }
        if (arg0 != 6) {
            this.field1226 = this.field1680.method239();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;B)I")
    public final int method485(int arg0, Component arg1, byte arg2) {
        if (arg2 == 9) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg1.field95 != null && arg0 < arg1.field95.length) {
            try {
                int[] var6 = arg1.field95[arg0];
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    int var9 = var6[var8++];
                    if (var9 == 0) {
                        return var7;
                    }
                    if (var9 == 1) {
                        var7 += this.field1292[var6[var8++]];
                    }
                    if (var9 == 2) {
                        var7 += this.field1239[var6[var8++]];
                    }
                    if (var9 == 3) {
                        var7 += this.field1511[var6[var8++]];
                    }
                    if (var9 == 4) {
                        Component var10 = Component.field80[var6[var8++]];
                        int var11 = var6[var8++];
                        if (var11 >= 0 && var11 < ObjType.field1049 && (!ObjType.method350(var11).field1070 || field1379)) {
                            for (int var12 = 0; var12 < var10.field81.length; ++var12) {
                                if (var11 + 1 == var10.field81[var12]) {
                                    var7 += var10.field82[var12];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var7 += this.field1253[var6[var8++]];
                    }
                    if (var9 == 6) {
                        var7 += field1559[this.field1239[var6[var8++]] - 1];
                    }
                    if (var9 == 7) {
                        var7 += this.field1253[var6[var8++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var7 += field1597.field494;
                    }
                    if (var9 == 9) {
                        for (int var13 = 0; var13 < Stats.field1165; ++var13) {
                            if (Stats.field1167[var13]) {
                                var7 += this.field1239[var13];
                            }
                        }
                    }
                    if (var9 == 10) {
                        Component var14 = Component.field80[var6[var8++]];
                        int var15 = var6[var8++] + 1;
                        if (var15 >= 0 && var15 < ObjType.field1049 && (!ObjType.method350(var15).field1070 || field1379)) {
                            for (int var16 = 0; var16 < var14.field81.length; ++var16) {
                                if (var14.field81[var16] == var15) {
                                    var7 += 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var7 += this.field1265;
                    }
                    if (var9 == 12) {
                        var7 += this.field1421;
                    }
                    if (var9 == 13) {
                        int var17 = this.field1253[var6[var8++]];
                        int var18 = var6[var8++];
                        var7 += (var17 & 1 << var18) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var19 = var6[var8++];
                        VarbitType var20 = VarbitType.field1184[var19];
                        int var21 = var20.field1186;
                        int var22 = var20.field1187;
                        int var23 = var20.field1188;
                        int var24 = field1504[var23 - var22];
                        var7 += this.field1253[var21] >> var22 & var24;
                    }
                }
            } catch (Exception var25) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)V")
    public final void method486(byte arg0, Component arg1) {
        int var3 = arg1.field89;
        if (arg0 != 74) {
            this.field1373 = -220;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1638;
                if (this.field1639 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field121 = "";
                    arg1.field88 = 0;
                } else {
                    if (this.field1471[var3] == 0) {
                        arg1.field121 = "@red@Offline";
                    } else if (this.field1471[var3] == field1377) {
                        arg1.field121 = "@gre@World-" + (this.field1471[var3] - 9);
                    } else {
                        arg1.field121 = "@yel@World-" + (this.field1471[var3] - 9);
                    }
                    arg1.field88 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1638;
                if (this.field1639 != 2) {
                    var6 = 0;
                }
                arg1.field99 = var6 * 15 + 20;
                if (arg1.field99 <= arg1.field91) {
                    arg1.field99 = arg1.field91 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1599) {
                    arg1.field121 = "";
                    arg1.field88 = 0;
                } else {
                    arg1.field121 = JString.method314(false, JString.method311(-8191, this.field1441[var3]));
                    arg1.field88 = 1;
                }
            } else if (var3 == 503) {
                arg1.field99 = this.field1599 * 15 + 20;
                if (arg1.field99 <= arg1.field91) {
                    arg1.field99 = arg1.field91 + 1;
                }
            } else if (var3 == 327) {
                arg1.field136 = 150;
                arg1.field137 = (int) (Math.sin((double) field1247 / 40.0D) * 256.0D) & 2047;
                if (this.field1438) {
                    for (int var7 = 0; var7 < 7; ++var7) {
                        int var14 = this.field1577[var7];
                        if (var14 >= 0 && !IdkType.field1128[var14].method379((byte) 7)) {
                            return;
                        }
                    }
                    this.field1438 = false;
                    Model[] var8 = new Model[7];
                    int var9 = 0;
                    for (int var10 = 0; var10 < 7; ++var10) {
                        int var13 = this.field1577[var10];
                        if (var13 >= 0) {
                            var8[var9++] = IdkType.field1128[var13].method380(0);
                        }
                    }
                    Model var11 = new Model(var9, var8, -38792);
                    for (int var12 = 0; var12 < 5; ++var12) {
                        if (this.field1267[var12] != 0) {
                            var11.method153(field1490[var12][0], field1490[var12][this.field1267[var12]]);
                            if (var12 == 1) {
                                var11.method153(field1266[0], field1266[this.field1267[var12]]);
                            }
                        }
                    }
                    var11.method146((byte) 107);
                    var11.method147(this.field1610, SeqType.field1149[field1597.field433].field1151[0]);
                    var11.method156(64, 850, -30, -50, -30, true);
                    arg1.field129 = 5;
                    arg1.field130 = 0;
                    Component.method36(0, var11, 5, true);
                }
            } else if (var3 == 324) {
                if (this.field1455 == null) {
                    this.field1455 = arg1.field127;
                    this.field1456 = arg1.field128;
                }
                if (this.field1655) {
                    arg1.field127 = this.field1456;
                } else {
                    arg1.field127 = this.field1455;
                }
            } else if (var3 == 325) {
                if (this.field1455 == null) {
                    this.field1455 = arg1.field127;
                    this.field1456 = arg1.field128;
                }
                if (this.field1655) {
                    arg1.field127 = this.field1455;
                } else {
                    arg1.field127 = this.field1456;
                }
            } else if (var3 == 600) {
                arg1.field121 = this.field1665;
                if (field1247 % 20 < 10) {
                    arg1.field121 = arg1.field121 + "|";
                } else {
                    arg1.field121 = arg1.field121 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1341 >= 1) {
                        if (this.field1298) {
                            arg1.field123 = 16711680;
                            arg1.field121 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field123 = 16777215;
                            arg1.field121 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field121 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1462 != 0) {
                        String var15;
                        if (this.field1313 == 0) {
                            var15 = "earlier today";
                        } else if (this.field1313 == 1) {
                            var15 = "yesterday";
                        } else {
                            var15 = this.field1313 + " days ago";
                        }
                        arg1.field121 = "You last logged in " + var15 + " from: " + signlink.dns;
                    } else {
                        arg1.field121 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1269 == 0) {
                        arg1.field121 = "0 unread messages";
                        arg1.field123 = 16776960;
                    }
                    if (this.field1269 == 1) {
                        arg1.field121 = "1 unread message";
                        arg1.field123 = 65280;
                    }
                    if (this.field1269 > 1) {
                        arg1.field121 = this.field1269 + " unread messages";
                        arg1.field123 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1637 == 201) {
                        if (this.field1465 == 1) {
                            arg1.field121 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field121 = "";
                        }
                    } else if (this.field1637 == 200) {
                        arg1.field121 = "You have not yet set any password recovery questions.";
                    } else {
                        String var16;
                        if (this.field1637 == 0) {
                            var16 = "Earlier today";
                        } else if (this.field1637 == 1) {
                            var16 = "Yesterday";
                        } else {
                            var16 = this.field1637 + " days ago";
                        }
                        arg1.field121 = var16 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1637 == 201) {
                        if (this.field1465 == 1) {
                            arg1.field121 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field121 = "";
                        }
                    } else if (this.field1637 == 200) {
                        arg1.field121 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field121 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1637 == 201) {
                        if (this.field1465 == 1) {
                            arg1.field121 = "@whi@this world but member benefits are unavailabe whilst here.";
                        } else {
                            arg1.field121 = "";
                        }
                    } else if (this.field1637 == 200) {
                        arg1.field121 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field121 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1639 == 0) {
            arg1.field121 = "Loading friend list";
            arg1.field88 = 0;
        } else if (var3 == 1 && this.field1639 == 1) {
            arg1.field121 = "Connecting to friendserver";
            arg1.field88 = 0;
        } else if (var3 == 2 && this.field1639 != 2) {
            arg1.field121 = "Please wait...";
            arg1.field88 = 0;
        } else {
            int var4 = this.field1638;
            if (this.field1639 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field121 = "";
                arg1.field88 = 0;
            } else {
                arg1.field121 = this.field1525[var3];
                arg1.field88 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field1249 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1248) {
                ++this.field1606;
                this.method538(-9756);
                this.method538(-9756);
                this.method474(0);
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
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field1249 = false;
        if (arg0 <= 0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method488(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            field1316 = this.field1307.method305();
        }
        for (int var3 = 0; var3 < this.field1371; ++var3) {
            if (this.field1270[var3] <= 0) {
                boolean var4 = false;
                try {
                    if (this.field1586[var3] == this.field1439 && this.field1398[var3] == this.field1435) {
                        if (!this.method452(394)) {
                            var4 = true;
                        }
                    } else {
                        Packet var5 = Wave.method323((byte) 0, this.field1586[var3], this.field1398[var3]);
                        if (System.currentTimeMillis() + (long) (var5.field736 / 22) > (long) (this.field1389 / 22) + this.field1412) {
                            this.field1389 = var5.field736;
                            this.field1412 = System.currentTimeMillis();
                            if (this.method557((byte) 0, var5.field736, var5.field735)) {
                                this.field1439 = this.field1586[var3];
                                this.field1435 = this.field1398[var3];
                            } else {
                                var4 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var4 && this.field1270[var3] != -5) {
                    this.field1270[var3] = -5;
                } else {
                    --this.field1371;
                    for (int var7 = var3; var7 < this.field1371; ++var7) {
                        this.field1586[var7] = this.field1586[var7 + 1];
                        this.field1398[var7] = this.field1398[var7 + 1];
                        this.field1270[var7] = this.field1270[var7 + 1];
                    }
                    --var3;
                }
            } else {
                int var10002 = this.field1270[var3]--;
            }
        }
        if (this.field1482 > 0) {
            this.field1482 -= 20;
            if (this.field1482 < 0) {
                this.field1482 = 0;
            }
            if (this.field1482 == 0 && this.field1566 && !field1380) {
                this.field1408 = this.field1530;
                this.field1409 = false;
                this.field1413.method289(2, this.field1408);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method489(byte arg0) {
        if (arg0 == -16) {
            try {
                int var2 = field1597.field428 + this.field1538;
                int var3 = field1597.field429 + this.field1260;
                if (this.field1262 - var2 < -500 || this.field1262 - var2 > 500 || this.field1263 - var3 < -500 || this.field1263 - var3 > 500) {
                    this.field1262 = var2;
                    this.field1263 = var3;
                }
                if (this.field1262 != var2) {
                    this.field1262 += (var2 - this.field1262) / 16;
                }
                if (this.field1263 != var3) {
                    this.field1263 += (var3 - this.field1263) / 16;
                }
                if (super.field37[1] == 1) {
                    this.field1406 += (-24 - this.field1406) / 2;
                } else if (super.field37[2] == 1) {
                    this.field1406 += (24 - this.field1406) / 2;
                } else {
                    this.field1406 /= 2;
                }
                if (super.field37[3] == 1) {
                    this.field1407 += (12 - this.field1407) / 2;
                } else if (super.field37[4] == 1) {
                    this.field1407 += (-12 - this.field1407) / 2;
                } else {
                    this.field1407 /= 2;
                }
                this.field1405 = this.field1406 / 2 + this.field1405 & 2047;
                this.field1404 += this.field1407 / 2;
                if (this.field1404 < 128) {
                    this.field1404 = 128;
                }
                if (this.field1404 > 383) {
                    this.field1404 = 383;
                }
                int var4 = this.field1262 >> 7;
                int var5 = this.field1263 >> 7;
                int var6 = this.method501(this.field1268, this.field1262, this.field1263, 54);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field1268;
                            if (var10 < 3 && (this.field1417[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field1369[var10][var8][var9];
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
                if (var12 > this.field1580) {
                    this.field1580 += (var12 - this.field1580) / 24;
                } else if (var12 < this.field1580) {
                    this.field1580 += (var12 - this.field1580) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field1597.field428 + "," + field1597.field429 + "," + this.field1262 + "," + this.field1263 + "," + this.field1616 + "," + this.field1617 + "," + this.field1514 + "," + this.field1515);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method490(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1599 >= 100) {
                this.method454(2, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = JString.method314(false, JString.method311(-8191, arg1));
                for (int var5 = 0; var5 < this.field1599; ++var5) {
                    if (this.field1441[var5] == arg1) {
                        this.method454(2, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1638; ++var6) {
                    if (this.field1505[var6] == arg1) {
                        this.method454(2, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field1441[this.field1599++] = arg1;
                this.field1244 = true;
                if (arg0 <= 0) {
                    this.field1608 = !this.field1608;
                }
                this.field1442.method228(185, this.field1483);
                this.field1442.method235(arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method491(Packet arg0, int arg1, int arg2) {
        this.field1250 = 0;
        this.field1366 = 0;
        this.method529(arg0, 291, arg1);
        this.method482(arg1, true, arg0);
        this.method562(arg1, arg0, -410);
        if (arg2 != 0) {
            this.field1472 = null;
        }
        for (int var4 = 0; var4 < this.field1250; ++var4) {
            int var6 = this.field1251[var4];
            if (field1247 != this.field1497[var6].field473) {
                this.field1497[var6].field484 = null;
                this.field1497[var6] = null;
            }
        }
        if (arg0.field736 != arg1) {
            signlink.reporterror(this.field1277 + " size mismatch in getnpcpos - pos:" + arg0.field736 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1498; ++var5) {
                if (this.field1497[this.field1499[var5]] == null) {
                    signlink.reporterror(this.field1277 + " null entry in npc list - pos:" + var5 + " size:" + this.field1498);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method492(boolean arg0) {
        for (int var2 = 0; var2 < this.field1498; ++var2) {
            int var3 = this.field1499[var2];
            NpcEntity var4 = this.field1497[var3];
            if (var4 != null) {
                this.method493(-938, var4, var4.field484.field1021);
            }
        }
        if (arg0) {
            field1587 = !field1587;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;I)V")
    public final void method493(int arg0, PathingEntity arg1, int arg2) {
        if (arg1.field428 < 128 || arg1.field429 < 128 || arg1.field428 >= 13184 || arg1.field429 >= 13184) {
            arg1.field456 = -1;
            arg1.field461 = -1;
            arg1.field470 = 0;
            arg1.field471 = 0;
            arg1.field428 = arg1.field477[0] * 128 + arg1.field432 * 64;
            arg1.field429 = arg1.field478[0] * 128 + arg1.field432 * 64;
            arg1.method126(-965);
        }
        if (field1597 == arg1 && (arg1.field428 < 1536 || arg1.field429 < 1536 || arg1.field428 >= 11776 || arg1.field429 >= 11776)) {
            arg1.field456 = -1;
            arg1.field461 = -1;
            arg1.field470 = 0;
            arg1.field471 = 0;
            arg1.field428 = arg1.field477[0] * 128 + arg1.field432 * 64;
            arg1.field429 = arg1.field478[0] * 128 + arg1.field432 * 64;
            arg1.method126(-965);
        }
        if (arg1.field470 > field1247) {
            this.method494(542, arg1);
        } else if (arg1.field471 >= field1247) {
            this.method495(arg1, 0);
        } else {
            this.method496(9, arg1);
        }
        this.method497(this.field1623, arg1);
        if (arg0 < 0) {
            this.method498(arg1, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method494(int arg0, PathingEntity arg1) {
        int var3 = arg1.field470 - field1247;
        if (arg0 <= 0) {
            this.field1226 = this.field1680.method239();
        }
        int var4 = arg1.field466 * 128 + arg1.field432 * 64;
        int var5 = arg1.field468 * 128 + arg1.field432 * 64;
        arg1.field428 += (var4 - arg1.field428) / var3;
        arg1.field429 += (var5 - arg1.field429) / var3;
        arg1.field480 = 0;
        if (arg1.field472 == 0) {
            arg1.field475 = 1024;
        }
        if (arg1.field472 == 1) {
            arg1.field475 = 1536;
        }
        if (arg1.field472 == 2) {
            arg1.field475 = 0;
        }
        if (arg1.field472 == 3) {
            arg1.field475 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method495(PathingEntity arg0, int arg1) {
        if (arg1 != 0) {
            this.field1226 = this.field1680.method239();
        }
        if (field1247 == arg0.field471 || arg0.field456 == -1 || arg0.field459 != 0 || arg0.field458 + 1 > SeqType.field1149[arg0.field456].method384(0, arg0.field457)) {
            int var3 = arg0.field471 - arg0.field470;
            int var4 = field1247 - arg0.field470;
            int var5 = arg0.field466 * 128 + arg0.field432 * 64;
            int var6 = arg0.field468 * 128 + arg0.field432 * 64;
            int var7 = arg0.field467 * 128 + arg0.field432 * 64;
            int var8 = arg0.field469 * 128 + arg0.field432 * 64;
            arg0.field428 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field429 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field480 = 0;
        if (arg0.field472 == 0) {
            arg0.field475 = 1024;
        }
        if (arg0.field472 == 1) {
            arg0.field475 = 1536;
        }
        if (arg0.field472 == 2) {
            arg0.field475 = 0;
        }
        if (arg0.field472 == 3) {
            arg0.field475 = 512;
        }
        arg0.field430 = arg0.field475;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILz;)V")
    public final void method496(int arg0, PathingEntity arg1) {
        arg1.field453 = arg1.field433;
        if (arg0 < 9 || arg0 > 9) {
            this.field1442.method229(132);
        }
        if (arg1.field476 == 0) {
            arg1.field480 = 0;
        } else {
            if (arg1.field456 != -1 && arg1.field459 == 0) {
                SeqType var3 = SeqType.field1149[arg1.field456];
                if (arg1.field481 > 0 && var3.field1161 == 0) {
                    ++arg1.field480;
                    return;
                }
                if (arg1.field481 <= 0 && var3.field1162 == 0) {
                    ++arg1.field480;
                    return;
                }
            }
            int var4 = arg1.field428;
            int var5 = arg1.field429;
            int var6 = arg1.field477[arg1.field476 - 1] * 128 + arg1.field432 * 64;
            int var7 = arg1.field478[arg1.field476 - 1] * 128 + arg1.field432 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field475 = 1280;
                    } else if (var5 > var7) {
                        arg1.field475 = 1792;
                    } else {
                        arg1.field475 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field475 = 768;
                    } else if (var5 > var7) {
                        arg1.field475 = 256;
                    } else {
                        arg1.field475 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field475 = 1024;
                } else {
                    arg1.field475 = 0;
                }
                int var8 = arg1.field475 - arg1.field430 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field436;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field435;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field438;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field437;
                }
                if (var9 == -1) {
                    var9 = arg1.field435;
                }
                arg1.field453 = var9;
                int var10 = 4;
                if (arg1.field475 != arg1.field430 && arg1.field450 == -1) {
                    var10 = 2;
                }
                if (arg1.field476 > 2) {
                    var10 = 6;
                }
                if (arg1.field476 > 3) {
                    var10 = 8;
                }
                if (arg1.field480 > 0 && arg1.field476 > 1) {
                    var10 = 8;
                    --arg1.field480;
                }
                if (arg1.field479[arg1.field476 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field453 == arg1.field435 && arg1.field439 != -1) {
                    arg1.field453 = arg1.field439;
                }
                if (var4 < var6) {
                    arg1.field428 += var10;
                    if (arg1.field428 > var6) {
                        arg1.field428 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field428 -= var10;
                    if (arg1.field428 < var6) {
                        arg1.field428 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field429 += var10;
                    if (arg1.field429 > var7) {
                        arg1.field429 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field429 -= var10;
                    if (arg1.field429 < var7) {
                        arg1.field429 = var7;
                    }
                }
                if (arg1.field428 == var6 && arg1.field429 == var7) {
                    --arg1.field476;
                    if (arg1.field481 > 0) {
                        --arg1.field481;
                        return;
                    }
                }
            } else {
                arg1.field428 = var6;
                arg1.field429 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLz;)V")
    public final void method497(boolean arg0, PathingEntity arg1) {
        this.field1513 &= arg0;
        if (arg1.field450 != -1 && arg1.field450 < 32768) {
            NpcEntity var3 = this.field1497[arg1.field450];
            if (var3 != null) {
                int var4 = arg1.field428 - var3.field428;
                int var5 = arg1.field429 - var3.field429;
                if (var4 != 0 || var5 != 0) {
                    arg1.field475 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg1.field450 >= 32768) {
            int var6 = arg1.field450 - 32768;
            if (this.field1287 == var6) {
                var6 = this.field1362;
            }
            PlayerEntity var7 = this.field1363[var6];
            if (var7 != null) {
                int var8 = arg1.field428 - var7.field428;
                int var9 = arg1.field429 - var7.field429;
                if (var8 != 0 || var9 != 0) {
                    arg1.field475 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg1.field451 != 0 || arg1.field452 != 0) && (arg1.field476 == 0 || arg1.field480 > 0)) {
            int var10 = arg1.field428 - (arg1.field451 - this.field1514 - this.field1514) * 64;
            int var11 = arg1.field429 - (arg1.field452 - this.field1515 - this.field1515) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field475 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg1.field451 = 0;
            arg1.field452 = 0;
        }
        int var12 = arg1.field475 - arg1.field430 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg1.field430 -= 32;
                } else {
                    arg1.field430 += 32;
                }
            } else {
                arg1.field430 = arg1.field475;
            }
            arg1.field430 &= 2047;
            if (arg1.field453 == arg1.field433 && arg1.field475 != arg1.field430) {
                if (arg1.field434 != -1) {
                    arg1.field453 = arg1.field434;
                    return;
                }
                arg1.field453 = arg1.field435;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method498(PathingEntity arg0, int arg1) {
        if (arg1 != 0) {
            field1587 = !field1587;
        }
        arg0.field431 = false;
        if (arg0.field453 != -1) {
            SeqType var3 = SeqType.field1149[arg0.field453];
            ++arg0.field455;
            if (arg0.field454 < var3.field1150 && arg0.field455 > var3.method384(0, arg0.field454)) {
                arg0.field455 = 0;
                ++arg0.field454;
            }
            if (arg0.field454 >= var3.field1150) {
                arg0.field455 = 0;
                arg0.field454 = 0;
            }
        }
        if (arg0.field461 != -1 && field1247 >= arg0.field464) {
            if (arg0.field462 < 0) {
                arg0.field462 = 0;
            }
            SeqType var4 = SpotAnimType.field1169[arg0.field461].field1173;
            ++arg0.field463;
            while (arg0.field462 < var4.field1150 && arg0.field463 > var4.method384(0, arg0.field462)) {
                arg0.field463 -= var4.method384(0, arg0.field462);
                ++arg0.field462;
            }
            if (arg0.field462 >= var4.field1150 && (arg0.field462 < 0 || arg0.field462 >= var4.field1150)) {
                arg0.field461 = -1;
            }
        }
        if (arg0.field456 != -1 && arg0.field459 <= 1) {
            SeqType var5 = SeqType.field1149[arg0.field456];
            if (var5.field1161 == 1 && arg0.field481 > 0 && arg0.field470 <= field1247 && arg0.field471 < field1247) {
                arg0.field459 = 1;
                return;
            }
        }
        if (arg0.field456 != -1 && arg0.field459 == 0) {
            SeqType var6 = SeqType.field1149[arg0.field456];
            ++arg0.field458;
            while (arg0.field457 < var6.field1150 && arg0.field458 > var6.method384(0, arg0.field457)) {
                arg0.field458 -= var6.method384(0, arg0.field457);
                ++arg0.field457;
            }
            if (arg0.field457 >= var6.field1150) {
                arg0.field457 -= var6.field1154;
                ++arg0.field460;
                if (arg0.field460 >= var6.field1160) {
                    arg0.field456 = -1;
                }
                if (arg0.field457 < 0 || arg0.field457 >= var6.field1150) {
                    arg0.field456 = -1;
                }
            }
            arg0.field431 = var6.field1156;
        }
        if (arg0.field459 > 0) {
            --arg0.field459;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method499(int arg0) {
        while (arg0 >= 0) {
            this.field1442.method229(89);
        }
        if (this.field1650) {
            this.field1650 = false;
            this.field1350.method269(0, super.field19, 4, this.field1664);
            this.field1351.method269(0, super.field19, 357, this.field1664);
            this.field1352.method269(722, super.field19, 4, this.field1664);
            this.field1353.method269(743, super.field19, 205, this.field1664);
            this.field1354.method269(0, super.field19, 0, this.field1664);
            this.field1355.method269(516, super.field19, 4, this.field1664);
            this.field1356.method269(516, super.field19, 205, this.field1664);
            this.field1357.method269(496, super.field19, 357, this.field1664);
            this.field1358.method269(0, super.field19, 338, this.field1664);
            this.field1244 = true;
            this.field1431 = true;
            this.field1552 = true;
            this.field1651 = true;
            if (this.field1299 != 2) {
                this.field1592.method269(4, super.field19, 4, this.field1664);
                this.field1591.method269(550, super.field19, 4, this.field1664);
            }
        }
        if (this.field1299 == 2) {
            this.method445(this.field1670);
        }
        if (this.field1642 && this.field1581 == 1) {
            this.field1244 = true;
        }
        if (this.field1676 != -1) {
            boolean var2 = this.method515(this.field1676, this.field1529, false);
            if (var2) {
                this.field1244 = true;
            }
        }
        if (this.field1243 == 2) {
            this.field1244 = true;
        }
        if (this.field1459 == 2) {
            this.field1244 = true;
        }
        if (this.field1244) {
            this.method472(true);
            this.field1244 = false;
        }
        if (this.field1331 == -1) {
            this.field1374.field100 = this.field1671 - this.field1466 - 77;
            if (super.field27 > 448 && super.field27 < 560 && super.field28 > 332) {
                this.method533(false, 463, 0, 25368, this.field1671, this.field1374, super.field28 - 357, super.field27 - 17, 77);
            }
            int var3 = this.field1671 - 77 - this.field1374.field100;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1671 - 77) {
                var3 = this.field1671 - 77;
            }
            if (this.field1466 != var3) {
                this.field1466 = var3;
                this.field1431 = true;
            }
        }
        if (this.field1331 != -1) {
            boolean var4 = this.method515(this.field1331, this.field1529, false);
            if (var4) {
                this.field1431 = true;
            }
        }
        if (this.field1243 == 3) {
            this.field1431 = true;
        }
        if (this.field1459 == 3) {
            this.field1431 = true;
        }
        if (this.field1451 != null) {
            this.field1431 = true;
        }
        if (this.field1642 && this.field1581 == 2) {
            this.field1431 = true;
        }
        if (this.field1431) {
            this.method525(4);
            this.field1431 = false;
        }
        if (this.field1299 == 2) {
            this.method548(this.field1613);
            this.field1591.method269(550, super.field19, 4, this.field1664);
        }
        if (this.field1663 != -1) {
            this.field1552 = true;
        }
        if (this.field1552) {
            if (this.field1663 != -1 && this.field1663 == this.field1230) {
                this.field1663 = -1;
                this.field1442.method228(171, this.field1483);
                this.field1442.method229(this.field1230);
            }
            this.field1552 = false;
            this.field1575.method268(0);
            this.field1565.method212(0, this.field1373, 0);
            if (this.field1676 == -1) {
                if (this.field1625[this.field1230] != -1) {
                    if (this.field1230 == 0) {
                        this.field1381.method212(10, this.field1373, 22);
                    }
                    if (this.field1230 == 1) {
                        this.field1382.method212(8, this.field1373, 54);
                    }
                    if (this.field1230 == 2) {
                        this.field1382.method212(8, this.field1373, 82);
                    }
                    if (this.field1230 == 3) {
                        this.field1383.method212(8, this.field1373, 110);
                    }
                    if (this.field1230 == 4) {
                        this.field1385.method212(8, this.field1373, 153);
                    }
                    if (this.field1230 == 5) {
                        this.field1385.method212(8, this.field1373, 181);
                    }
                    if (this.field1230 == 6) {
                        this.field1384.method212(9, this.field1373, 209);
                    }
                }
                if (this.field1625[0] != -1 && (this.field1663 != 0 || field1247 % 20 < 10)) {
                    this.field1463[0].method212(13, this.field1373, 29);
                }
                if (this.field1625[1] != -1 && (this.field1663 != 1 || field1247 % 20 < 10)) {
                    this.field1463[1].method212(11, this.field1373, 53);
                }
                if (this.field1625[2] != -1 && (this.field1663 != 2 || field1247 % 20 < 10)) {
                    this.field1463[2].method212(11, this.field1373, 82);
                }
                if (this.field1625[3] != -1 && (this.field1663 != 3 || field1247 % 20 < 10)) {
                    this.field1463[3].method212(12, this.field1373, 115);
                }
                if (this.field1625[4] != -1 && (this.field1663 != 4 || field1247 % 20 < 10)) {
                    this.field1463[4].method212(13, this.field1373, 153);
                }
                if (this.field1625[5] != -1 && (this.field1663 != 5 || field1247 % 20 < 10)) {
                    this.field1463[5].method212(11, this.field1373, 180);
                }
                if (this.field1625[6] != -1 && (this.field1663 != 6 || field1247 % 20 < 10)) {
                    this.field1463[6].method212(13, this.field1373, 208);
                }
            }
            this.field1575.method269(516, super.field19, 160, this.field1664);
            this.field1574.method268(0);
            this.field1564.method212(0, this.field1373, 0);
            if (this.field1676 == -1) {
                if (this.field1625[this.field1230] != -1) {
                    if (this.field1230 == 7) {
                        this.field1293.method212(0, this.field1373, 42);
                    }
                    if (this.field1230 == 8) {
                        this.field1294.method212(0, this.field1373, 74);
                    }
                    if (this.field1230 == 9) {
                        this.field1294.method212(0, this.field1373, 102);
                    }
                    if (this.field1230 == 10) {
                        this.field1295.method212(1, this.field1373, 130);
                    }
                    if (this.field1230 == 11) {
                        this.field1297.method212(0, this.field1373, 173);
                    }
                    if (this.field1230 == 12) {
                        this.field1297.method212(0, this.field1373, 201);
                    }
                    if (this.field1230 == 13) {
                        this.field1296.method212(0, this.field1373, 229);
                    }
                }
                if (this.field1625[8] != -1 && (this.field1663 != 8 || field1247 % 20 < 10)) {
                    this.field1463[7].method212(2, this.field1373, 74);
                }
                if (this.field1625[9] != -1 && (this.field1663 != 9 || field1247 % 20 < 10)) {
                    this.field1463[8].method212(3, this.field1373, 102);
                }
                if (this.field1625[10] != -1 && (this.field1663 != 10 || field1247 % 20 < 10)) {
                    this.field1463[9].method212(4, this.field1373, 137);
                }
                if (this.field1625[11] != -1 && (this.field1663 != 11 || field1247 % 20 < 10)) {
                    this.field1463[10].method212(2, this.field1373, 174);
                }
                if (this.field1625[12] != -1 && (this.field1663 != 12 || field1247 % 20 < 10)) {
                    this.field1463[11].method212(2, this.field1373, 201);
                }
                if (this.field1625[13] != -1 && (this.field1663 != 13 || field1247 % 20 < 10)) {
                    this.field1463[12].method212(2, this.field1373, 226);
                }
            }
            this.field1574.method269(496, super.field19, 466, this.field1664);
            this.field1592.method268(0);
        }
        if (this.field1651) {
            this.field1651 = false;
            this.field1573.method268(0);
            this.field1563.method212(0, this.field1373, 0);
            this.field1534.method215(55, 16777215, true, 28, "Public chat", 1);
            if (this.field1448 == 0) {
                this.field1534.method215(55, 65280, true, 41, "On", 1);
            }
            if (this.field1448 == 1) {
                this.field1534.method215(55, 16776960, true, 41, "Friends", 1);
            }
            if (this.field1448 == 2) {
                this.field1534.method215(55, 16711680, true, 41, "Off", 1);
            }
            if (this.field1448 == 3) {
                this.field1534.method215(55, 65535, true, 41, "Hide", 1);
            }
            this.field1534.method215(184, 16777215, true, 28, "Private chat", 1);
            if (this.field1502 == 0) {
                this.field1534.method215(184, 65280, true, 41, "On", 1);
            }
            if (this.field1502 == 1) {
                this.field1534.method215(184, 16776960, true, 41, "Friends", 1);
            }
            if (this.field1502 == 2) {
                this.field1534.method215(184, 16711680, true, 41, "Off", 1);
            }
            this.field1534.method215(324, 16777215, true, 28, "Trade/duel", 1);
            if (this.field1598 == 0) {
                this.field1534.method215(324, 65280, true, 41, "On", 1);
            }
            if (this.field1598 == 1) {
                this.field1534.method215(324, 16776960, true, 41, "Friends", 1);
            }
            if (this.field1598 == 2) {
                this.field1534.method215(324, 16711680, true, 41, "Off", 1);
            }
            this.field1534.method215(458, 16777215, true, 33, "Report abuse", 1);
            this.field1573.method269(0, super.field19, 453, this.field1664);
            this.field1592.method268(0);
        }
        this.field1529 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZLmb;)V")
    private final void method500(int arg0, boolean arg1, Packet arg2) {
        this.field1250 = 0;
        this.field1366 = 0;
        this.method464(arg0, arg2, (byte) 110);
        this.method540((byte) 67, arg0, arg2);
        this.method555(arg2, (byte) 4, arg0);
        this.method473(arg0, arg2, true);
        if (!arg1) {
            this.field1226 = -1;
        }
        for (int var4 = 0; var4 < this.field1250; ++var4) {
            int var6 = this.field1251[var4];
            if (field1247 != this.field1363[var6].field473) {
                this.field1363[var6] = null;
            }
        }
        if (arg2.field736 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field736 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1364; ++var5) {
                if (this.field1363[this.field1365[var5]] == null) {
                    signlink.reporterror(this.field1277 + " null entry in pl list - pos:" + var5 + " size:" + this.field1364);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method501(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            int var8 = 45 / arg3;
            if (arg0 < 3 && (this.field1417[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var9 = arg1 & 127;
            int var10 = arg2 & 127;
            int var11 = (128 - var9) * this.field1369[var7][var5][var6] + this.field1369[var7][var5 + 1][var6] * var9 >> 7;
            int var12 = (128 - var9) * this.field1369[var7][var5][var6 + 1] + this.field1369[var7][var5 + 1][var6 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method502(int arg0, long arg1) {
        if (arg0 == 3) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field1638; ++var4) {
                    if (this.field1505[var4] == arg1) {
                        --this.field1638;
                        this.field1244 = true;
                        for (int var5 = var4; var5 < this.field1638; ++var5) {
                            this.field1525[var5] = this.field1525[var5 + 1];
                            this.field1471[var5] = this.field1471[var5 + 1];
                            this.field1505[var5] = this.field1505[var5 + 1];
                        }
                        this.field1442.method228(157, this.field1483);
                        this.field1442.method235(arg1, 0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILob;)V")
    private final void method503(int arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field755 == 0) {
            var3 = this.field1464.method90(arg1.field754, arg1.field756, arg1.field757);
        }
        if (arg1.field755 == 1) {
            var3 = this.field1464.method91(arg1.field757, (byte) 6, arg1.field754, arg1.field756);
        }
        if (arg1.field755 == 2) {
            var3 = this.field1464.method92(arg1.field754, arg1.field756, arg1.field757);
        }
        if (arg1.field755 == 3) {
            var3 = this.field1464.method93(arg1.field754, arg1.field756, arg1.field757);
        }
        if (var3 != 0) {
            int var7 = this.field1464.method94(arg1.field754, arg1.field756, arg1.field757, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field758 = var4;
        if (arg0 < 2 || arg0 > 2) {
            this.field1510 = this.field1307.method305();
        }
        arg1.field760 = var5;
        arg1.field759 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method504(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1498; ++var3) {
            NpcEntity var4 = this.field1497[this.field1499[var3]];
            int var5 = (this.field1499[var3] << 14) + 536870912;
            if (var4 != null && var4.method127(-42790) && var4.field484.field1039 == arg1) {
                int var6 = var4.field428 >> 7;
                int var7 = var4.field429 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field432 == 1 && (var4.field428 & 127) == 64 && (var4.field429 & 127) == 64) {
                        if (this.field1674[var6][var7] == this.field1556) {
                            continue;
                        }
                        this.field1674[var6][var7] = this.field1556;
                    }
                    this.field1464.method75(var4, this.method501(this.field1268, var4.field428, var4.field429, 54), this.field1268, var5, var4.field428, (var4.field432 - 1) * 64 + 60, var4.field429, var4.field430, var4.field431, 37044);
                }
            }
        }
        if (!arg0) {
            this.field1520 = !this.field1520;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method505(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1289) {
                this.field1289 = false;
                this.field1431 = true;
            }
            int var3 = this.field1491[arg0];
            int var4 = this.field1492[arg0];
            int var5 = this.field1493[arg0];
            int var6 = this.field1494[arg0];
            if (arg1 < 3 || arg1 > 3) {
                this.method6();
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 265) {
                NpcEntity var7 = this.field1497[var6];
                if (var7 != null) {
                    this.method453(var7.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var7.field478[0], 2, 0);
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 2;
                    this.field1329 = 0;
                    this.field1442.method228(250, this.field1483);
                    this.field1442.method230(var6);
                    this.field1442.method230(this.field1344);
                }
            }
            if (var5 == 651) {
                PlayerEntity var8 = this.field1363[var6];
                if (var8 != null) {
                    this.method453(var8.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var8.field478[0], 2, 0);
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 2;
                    this.field1329 = 0;
                    this.field1442.method228(230, this.field1483);
                    this.field1442.method230(var6);
                    this.field1442.method230(this.field1344);
                }
            }
            if (var5 == 465) {
                this.field1442.method228(21, this.field1483);
                this.field1442.method230(var4);
                Component var9 = Component.field80[var4];
                if (var9.field95 != null && var9.field95[0][0] == 5) {
                    int var10 = var9.field95[0][1];
                    this.field1253[var10] = 1 - this.field1253[var10];
                    this.method541(this.field1596, var10);
                    this.field1244 = true;
                }
            }
            if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                boolean var11 = this.method453(var3, (byte) 5, 0, false, 0, 0, 0, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                if (!var11) {
                    this.method453(var3, (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                }
                this.field1327 = super.field34;
                this.field1328 = super.field35;
                this.field1330 = 2;
                this.field1329 = 0;
                if (var5 == 993) {
                    this.field1442.method228(206, this.field1483);
                }
                if (var5 == 877) {
                    this.field1442.method228(55, this.field1483);
                }
                if (var5 == 224) {
                    this.field1442.method228(110, this.field1483);
                }
                if (var5 == 746) {
                    this.field1442.method228(25, this.field1483);
                }
                if (var5 == 99) {
                    this.field1442.method228(121, this.field1483);
                }
                this.field1442.method230(this.field1514 + var3);
                this.field1442.method230(this.field1515 + var4);
                this.field1442.method230(var6);
            }
            if (var5 == 44 && !this.field1615) {
                this.field1442.method228(96, this.field1483);
                this.field1442.method230(var4);
                this.field1615 = true;
            }
            if (var5 == 965) {
                boolean var13 = this.method453(var3, (byte) 5, 0, false, 0, 0, 0, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                if (!var13) {
                    this.method453(var3, (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                }
                this.field1327 = super.field34;
                this.field1328 = super.field35;
                this.field1330 = 2;
                this.field1329 = 0;
                this.field1442.method228(158, this.field1483);
                this.field1442.method230(this.field1514 + var3);
                this.field1442.method230(this.field1515 + var4);
                this.field1442.method230(var6);
                this.field1442.method230(this.field1344);
            }
            if (var5 == 581) {
                if ((var6 & 3) == 0) {
                    ++field1390;
                }
                if (field1390 >= 99) {
                    this.field1442.method228(222, this.field1483);
                    this.field1442.method233(0);
                }
                this.method510(var6, var3, 41, 0, var4);
            }
            if (var5 == 951) {
                Component var15 = Component.field80[var4];
                boolean var16 = true;
                if (var15.field89 > 0) {
                    var16 = this.method443(true, var15);
                }
                if (var16) {
                    this.field1442.method228(21, this.field1483);
                    this.field1442.method230(var4);
                }
            }
            if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                String var17 = this.field1386[arg0];
                int var18 = var17.indexOf("@whi@");
                if (var18 != -1) {
                    long var19 = JString.method310(var17.substring(var18 + 5).trim());
                    if (var5 == 406) {
                        this.method457(var19, true);
                    }
                    if (var5 == 436) {
                        this.method490(253, var19);
                    }
                    if (var5 == 557) {
                        this.method502(3, var19);
                    }
                    if (var5 == 556) {
                        this.method512(var19, true);
                    }
                }
            }
            if (var5 == 391) {
                this.field1442.method228(72, this.field1483);
                this.field1442.method230(var6);
                this.field1442.method230(var3);
                this.field1442.method230(var4);
                this.field1442.method230(this.field1344);
                this.field1240 = 0;
                this.field1241 = var4;
                this.field1242 = var3;
                this.field1243 = 2;
                if (Component.field80[var4].field86 == this.field1484) {
                    this.field1243 = 1;
                }
                if (Component.field80[var4].field86 == this.field1331) {
                    this.field1243 = 3;
                }
            }
            if (var5 == 34) {
                String var21 = this.field1386[arg0];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    this.method439(0);
                    this.field1665 = var21.substring(var22 + 5).trim();
                    this.field1298 = false;
                    for (int var23 = 0; var23 < Component.field80.length; ++var23) {
                        if (Component.field80[var23] != null && Component.field80[var23].field89 == 600) {
                            this.field1570 = this.field1484 = Component.field80[var23].field86;
                            break;
                        }
                    }
                }
            }
            if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                NpcEntity var24 = this.field1497[var6];
                if (var24 != null) {
                    this.method453(var24.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var24.field478[0], 2, 0);
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 2;
                    this.field1329 = 0;
                    if (var5 == 542) {
                        this.field1442.method228(133, this.field1483);
                    }
                    if (var5 == 963) {
                        this.field1442.method228(6, this.field1483);
                    }
                    if (var5 == 728) {
                        this.field1442.method228(223, this.field1483);
                    }
                    if (var5 == 6) {
                        if ((var6 & 3) == 0) {
                            ++field1397;
                        }
                        if (field1397 >= 124) {
                            this.field1442.method228(69, this.field1483);
                            this.field1442.method233(0);
                        }
                        this.field1442.method228(106, this.field1483);
                    }
                    if (var5 == 245) {
                        if ((var6 & 3) == 0) {
                            ++field1255;
                        }
                        if (field1255 >= 85) {
                            this.field1442.method228(61, this.field1483);
                            this.field1442.method230(39596);
                        }
                        this.field1442.method228(201, this.field1483);
                    }
                    this.field1442.method230(var6);
                }
            }
            if (var5 == 679) {
                String var25 = this.field1386[arg0];
                int var26 = var25.indexOf("@whi@");
                if (var26 != -1) {
                    long var27 = JString.method310(var25.substring(var26 + 5).trim());
                    int var29 = -1;
                    for (int var30 = 0; var30 < this.field1638; ++var30) {
                        if (this.field1505[var30] == var27) {
                            var29 = var30;
                            break;
                        }
                    }
                    if (var29 != -1 && this.field1471[var29] > 0) {
                        this.field1431 = true;
                        this.field1289 = false;
                        this.field1486 = true;
                        this.field1532 = "";
                        this.field1400 = 3;
                        this.field1282 = this.field1505[var29];
                        this.field1311 = "Enter message to send to " + this.field1525[var29];
                    }
                }
            }
            if (var5 == 1773) {
                ObjType var31 = ObjType.method350(var6);
                Component var32 = Component.field80[var4];
                String var33;
                if (var32 != null && var32.field82[var3] >= 100000) {
                    var33 = var32.field82[var3] + " x " + var31.field1057;
                } else if (var31.field1058 != null) {
                    var33 = new String(var31.field1058);
                } else {
                    var33 = "It's a " + var31.field1057 + ".";
                }
                this.method454(2, 0, var33, "");
            }
            if (var5 == 367) {
                PlayerEntity var34 = this.field1363[var6];
                if (var34 != null) {
                    this.method453(var34.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var34.field478[0], 2, 0);
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 2;
                    this.field1329 = 0;
                    this.field1442.method228(143, this.field1483);
                    this.field1442.method230(var6);
                    this.field1442.method230(this.field1630);
                    this.field1442.method230(this.field1628);
                    this.field1442.method230(this.field1629);
                }
            }
            if (var5 == 660) {
                if (!this.field1642) {
                    this.field1464.method102(super.field34 - 4, 325, super.field35 - 4);
                } else {
                    this.field1464.method102(var3 - 4, 325, var4 - 4);
                }
            }
            if (var5 == 1607) {
                NpcEntity var35 = this.field1497[var6];
                if (var35 != null) {
                    String var36;
                    if (var35.field484.field1020 != null) {
                        var36 = new String(var35.field484.field1020);
                    } else {
                        var36 = "It's a " + var35.field484.field1019 + ".";
                    }
                    this.method454(2, 0, var36, "");
                }
            }
            if (var5 == 900) {
                NpcEntity var37 = this.field1497[var6];
                if (var37 != null) {
                    this.method453(var37.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var37.field478[0], 2, 0);
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 2;
                    this.field1329 = 0;
                    this.field1442.method228(247, this.field1483);
                    this.field1442.method230(var6);
                    this.field1442.method230(this.field1630);
                    this.field1442.method230(this.field1628);
                    this.field1442.method230(this.field1629);
                }
            }
            if (var5 == 55 && this.method510(var6, var3, 175, 0, var4)) {
                this.field1442.method230(this.field1344);
            }
            if (var5 == 217) {
                boolean var38 = this.method453(var3, (byte) 5, 0, false, 0, 0, 0, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                if (!var38) {
                    this.method453(var3, (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var4, 2, 0);
                }
                this.field1327 = super.field34;
                this.field1328 = super.field35;
                this.field1330 = 2;
                this.field1329 = 0;
                this.field1442.method228(23, this.field1483);
                this.field1442.method230(this.field1514 + var3);
                this.field1442.method230(this.field1515 + var4);
                this.field1442.method230(var6);
                this.field1442.method230(this.field1630);
                this.field1442.method230(this.field1628);
                this.field1442.method230(this.field1629);
            }
            if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                if (var5 == 596) {
                    this.field1442.method228(181, this.field1483);
                }
                if (var5 == 22) {
                    this.field1442.method228(168, this.field1483);
                }
                if (var5 == 892) {
                    if ((var3 & 3) == 0) {
                        ++field1454;
                    }
                    if (field1454 >= 130) {
                        this.field1442.method228(193, this.field1483);
                        this.field1442.method229(177);
                    }
                    this.field1442.method228(134, this.field1483);
                }
                if (var5 == 602) {
                    this.field1442.method228(82, this.field1483);
                }
                if (var5 == 415) {
                    if ((var4 & 3) == 0) {
                        ++field1349;
                    }
                    if (field1349 >= 55) {
                        this.field1442.method228(104, this.field1483);
                        this.field1442.method233(0);
                    }
                    this.field1442.method228(30, this.field1483);
                }
                this.field1442.method230(var6);
                this.field1442.method230(var3);
                this.field1442.method230(var4);
                this.field1240 = 0;
                this.field1241 = var4;
                this.field1242 = var3;
                this.field1243 = 2;
                if (Component.field80[var4].field86 == this.field1484) {
                    this.field1243 = 1;
                }
                if (Component.field80[var4].field86 == this.field1331) {
                    this.field1243 = 3;
                }
            }
            if (var5 == 1102) {
                ObjType var40 = ObjType.method350(var6);
                String var41;
                if (var40.field1058 != null) {
                    var41 = new String(var40.field1058);
                } else {
                    var41 = "It's a " + var40.field1057 + ".";
                }
                this.method454(2, 0, var41, "");
            }
            if (var5 == 947) {
                this.method439(0);
            }
            if (var5 == 450 && this.method510(var6, var3, 8, 0, var4)) {
                this.field1442.method230(this.field1630);
                this.field1442.method230(this.field1628);
                this.field1442.method230(this.field1629);
            }
            if (var5 == 1175) {
                int var42 = var6 >> 14 & 32767;
                LocType var43 = LocType.method334(var42);
                String var44;
                if (var43.field973 != null) {
                    var44 = new String(var43.field973);
                } else {
                    var44 = "It's a " + var43.field972 + ".";
                }
                this.method454(2, 0, var44, "");
            }
            if (var5 == 188) {
                this.field1627 = 1;
                this.field1628 = var3;
                this.field1629 = var4;
                this.field1630 = var6;
                this.field1631 = ObjType.method350(var6).field1057;
                this.field1343 = 0;
                this.field1244 = true;
            } else {
                if (var5 == 285) {
                    this.method510(var6, var3, 7, 0, var4);
                }
                if (var5 == 930) {
                    Component var45 = Component.field80[var4];
                    this.field1343 = 1;
                    this.field1344 = var4;
                    this.field1345 = var45.field140;
                    this.field1627 = 0;
                    this.field1244 = true;
                    String var46 = var45.field138;
                    if (var46.indexOf(" ") != -1) {
                        var46 = var46.substring(0, var46.indexOf(" "));
                    }
                    String var47 = var45.field138;
                    if (var47.indexOf(" ") != -1) {
                        var47 = var47.substring(var47.indexOf(" ") + 1);
                    }
                    this.field1346 = var46 + " " + var45.field139 + " " + var47;
                    if (this.field1345 == 16) {
                        this.field1244 = true;
                        this.field1230 = 3;
                        this.field1552 = true;
                    }
                } else {
                    if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                        PlayerEntity var48 = this.field1363[var6];
                        if (var48 != null) {
                            this.method453(var48.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var48.field478[0], 2, 0);
                            this.field1327 = super.field34;
                            this.field1328 = super.field35;
                            this.field1330 = 2;
                            this.field1329 = 0;
                            if (var5 == 1544) {
                                this.field1442.method228(184, this.field1483);
                            }
                            if (var5 == 1101) {
                                this.field1442.method228(220, this.field1483);
                            }
                            if (var5 == 151) {
                                ++field1645;
                                if (field1645 >= 90) {
                                    this.field1442.method228(162, this.field1483);
                                    this.field1442.method230(31114);
                                }
                                this.field1442.method228(239, this.field1483);
                            }
                            if (var5 == 1373) {
                                this.field1442.method228(234, this.field1483);
                            }
                            this.field1442.method230(var6);
                        }
                    }
                    if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                        if (var5 == 347) {
                            this.field1442.method228(68, this.field1483);
                        }
                        if (var5 == 478) {
                            if ((var3 & 3) == 0) {
                                ++field1648;
                            }
                            if (field1648 >= 90) {
                                this.field1442.method228(62, this.field1483);
                            }
                            this.field1442.method228(101, this.field1483);
                        }
                        if (var5 == 405) {
                            field1310 += var6;
                            if (field1310 >= 97) {
                                this.field1442.method228(131, this.field1483);
                                this.field1442.method232(14953816);
                            }
                            this.field1442.method228(154, this.field1483);
                        }
                        if (var5 == 422) {
                            this.field1442.method228(177, this.field1483);
                        }
                        if (var5 == 38) {
                            this.field1442.method228(196, this.field1483);
                        }
                        this.field1442.method230(var6);
                        this.field1442.method230(var3);
                        this.field1442.method230(var4);
                        this.field1240 = 0;
                        this.field1241 = var4;
                        this.field1242 = var3;
                        this.field1243 = 2;
                        if (Component.field80[var4].field86 == this.field1484) {
                            this.field1243 = 1;
                        }
                        if (Component.field80[var4].field86 == this.field1331) {
                            this.field1243 = 3;
                        }
                    }
                    if (var5 == 881) {
                        this.field1442.method228(130, this.field1483);
                        this.field1442.method230(var6);
                        this.field1442.method230(var3);
                        this.field1442.method230(var4);
                        this.field1442.method230(this.field1630);
                        this.field1442.method230(this.field1628);
                        this.field1442.method230(this.field1629);
                        this.field1240 = 0;
                        this.field1241 = var4;
                        this.field1242 = var3;
                        this.field1243 = 2;
                        if (Component.field80[var4].field86 == this.field1484) {
                            this.field1243 = 1;
                        }
                        if (Component.field80[var4].field86 == this.field1331) {
                            this.field1243 = 3;
                        }
                    }
                    if (var5 == 504) {
                        this.method510(var6, var3, 105, 0, var4);
                    }
                    if (var5 == 364) {
                        this.method510(var6, var3, 192, 0, var4);
                    }
                    if (var5 == 903 || var5 == 363) {
                        String var49 = this.field1386[arg0];
                        int var50 = var49.indexOf("@whi@");
                        if (var50 != -1) {
                            String var51 = var49.substring(var50 + 5).trim();
                            String var52 = JString.method314(false, JString.method311(-8191, JString.method310(var51)));
                            boolean var53 = false;
                            for (int var54 = 0; var54 < this.field1364; ++var54) {
                                PlayerEntity var55 = this.field1363[this.field1365[var54]];
                                if (var55 != null && var55.field488 != null && var55.field488.equalsIgnoreCase(var52)) {
                                    this.method453(var55.field477[0], (byte) 5, 1, false, 0, 0, 1, field1597.field477[0], field1597.field478[0], var55.field478[0], 2, 0);
                                    if (var5 == 903) {
                                        this.field1442.method228(234, this.field1483);
                                    }
                                    if (var5 == 363) {
                                        this.field1442.method228(220, this.field1483);
                                    }
                                    this.field1442.method230(this.field1365[var54]);
                                    var53 = true;
                                    break;
                                }
                            }
                            if (!var53) {
                                this.method454(2, 0, "Unable to find " + var52, "");
                            }
                        }
                    }
                    if (var5 == 960) {
                        this.field1442.method228(21, this.field1483);
                        this.field1442.method230(var4);
                        Component var56 = Component.field80[var4];
                        if (var56.field95 != null && var56.field95[0][0] == 5) {
                            int var57 = var56.field95[0][1];
                            if (this.field1253[var57] != var56.field97[0]) {
                                this.field1253[var57] = var56.field97[0];
                                this.method541(this.field1596, var57);
                                this.field1244 = true;
                            }
                        }
                    }
                    if (var5 == 1501) {
                        field1452 += this.field1515;
                        if (field1452 >= 92) {
                            this.field1442.method228(91, this.field1483);
                            this.field1442.method233(0);
                        }
                        this.method510(var6, var3, 169, 0, var4);
                    }
                    this.field1627 = 0;
                    this.field1343 = 0;
                    this.field1244 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method506(byte arg0) {
        if (this.field1348 >= 2 || this.field1627 != 0 || this.field1343 != 0) {
            String var2;
            if (this.field1627 == 1 && this.field1348 < 2) {
                var2 = "Use " + this.field1631 + " with...";
            } else if (this.field1343 == 1 && this.field1348 < 2) {
                var2 = this.field1346 + "...";
            } else {
                var2 = this.field1386[this.field1348 - 1];
            }
            if (this.field1348 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1348 - 2) + " more options";
            }
            this.field1535.method220(true, 4, 15, 16777215, (byte) 2, field1247 / 1000, var2);
            if (arg0 != 5) {
                this.field1226 = this.field1680.method239();
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method507(int arg0) {
        if (this.field1434 != 0) {
            PixFont var2 = this.field1534;
            int var3 = 0;
            if (arg0 != 0) {
                this.field1647 = 202;
            }
            if (this.field1306 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1660[var4] != null) {
                    int var5 = this.field1658[var4];
                    String var6 = this.field1659[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1502 == 0 || this.field1502 == 1 && this.method480(var6, 0))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method217(var9, "From", var8, 0, 0);
                        var2.method217(var9, "From", var8 - 1, 65535, 0);
                        int var10 = var9 + var2.method216((byte) 7, "From ");
                        if (var7 == 1) {
                            this.field1636[0].method212(var8 - 12, this.field1373, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1636[1].method212(var8 - 12, this.field1373, var10);
                            var10 += 14;
                        }
                        var2.method217(var10, var6 + ": " + this.field1660[var4], var8, 0, 0);
                        var2.method217(var10, var6 + ": " + this.field1660[var4], var8 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1502 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method217(4, this.field1660[var4], var11, 0, 0);
                        var2.method217(4, this.field1660[var4], var11 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1502 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method217(4, "To " + var6 + ": " + this.field1660[var4], var12, 0, 0);
                        var2.method217(4, "To " + var6 + ": " + this.field1660[var4], var12 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1347 != null) {
                this.field1347.method38();
            }
        } catch (Exception var2) {
        }
        this.field1347 = null;
        this.method559(false);
        if (this.field1632 != null) {
            this.field1632.field1006 = false;
        }
        this.field1632 = null;
        this.field1413.method281();
        this.field1413 = null;
        this.field1442 = null;
        if (arg0 != 1) {
            this.field1472 = null;
        }
        this.field1360 = null;
        this.field1680 = null;
        this.field1467 = null;
        this.field1656 = null;
        this.field1489 = null;
        this.field1468 = null;
        this.field1469 = null;
        this.field1369 = null;
        this.field1417 = null;
        this.field1464 = null;
        this.field1254 = null;
        this.field1315 = null;
        this.field1470 = null;
        this.field1578 = null;
        this.field1579 = null;
        this.field1275 = null;
        this.field1590 = null;
        this.field1591 = null;
        this.field1592 = null;
        this.field1593 = null;
        this.field1573 = null;
        this.field1574 = null;
        this.field1575 = null;
        this.field1350 = null;
        this.field1351 = null;
        this.field1352 = null;
        this.field1353 = null;
        this.field1354 = null;
        this.field1355 = null;
        this.field1356 = null;
        this.field1357 = null;
        this.field1358 = null;
        this.field1677 = null;
        this.field1678 = null;
        this.field1679 = null;
        this.field1563 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1463 = null;
        this.field1381 = null;
        this.field1382 = null;
        this.field1383 = null;
        this.field1384 = null;
        this.field1385 = null;
        this.field1293 = null;
        this.field1294 = null;
        this.field1295 = null;
        this.field1296 = null;
        this.field1297 = null;
        this.field1420 = null;
        this.field1387 = null;
        this.field1280 = null;
        this.field1669 = null;
        this.field1422 = null;
        this.field1423 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1402 = null;
        this.field1624 = null;
        this.field1674 = null;
        this.field1363 = null;
        this.field1365 = null;
        this.field1367 = null;
        this.field1368 = null;
        this.field1251 = null;
        this.field1497 = null;
        this.field1499 = null;
        this.field1472 = null;
        this.field1304 = null;
        this.field1401 = null;
        this.field1633 = null;
        this.field1491 = null;
        this.field1492 = null;
        this.field1493 = null;
        this.field1494 = null;
        this.field1386 = null;
        this.field1253 = null;
        this.field1527 = null;
        this.field1528 = null;
        this.field1654 = null;
        this.field1258 = null;
        this.field1525 = null;
        this.field1505 = null;
        this.field1471 = null;
        this.field1335 = null;
        this.field1336 = null;
        this.field1332 = null;
        this.field1333 = null;
        this.field1334 = null;
        this.field1337 = null;
        this.field1338 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.method442(true);
        LocType.method333(true);
        NpcType.method343(true);
        ObjType.method349(true);
        FloType.field1113 = null;
        IdkType.field1128 = null;
        Component.field80 = null;
        UnkType.field1136 = null;
        SeqType.field1149 = null;
        SpotAnimType.field1169 = null;
        SpotAnimType.field1181 = null;
        VarpType.field1190 = null;
        super.field20 = null;
        PlayerEntity.field509 = null;
        Pix3D.method177(true);
        World3D.method63(true);
        Model.method135(true);
        AnimFrame.method60(true);
        System.gc();
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;Z)V")
    public final void method508(int arg0, Packet arg1, boolean arg2) {
        if (!arg2) {
            if (arg0 != 84 && arg0 != 112) {
                if (arg0 == 117) {
                    int var4 = arg1.method239();
                    int var5 = (var4 >> 4 & 7) + this.field1446;
                    int var6 = (var4 & 7) + this.field1447;
                    int var7 = arg1.method239();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1643[var8];
                    int var11 = arg1.method241();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1369[this.field1268][var5][var6];
                        int var13 = this.field1369[this.field1268][var5 + 1][var6];
                        int var14 = this.field1369[this.field1268][var5 + 1][var6 + 1];
                        int var15 = this.field1369[this.field1268][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1464.method86(var6, this.field1268, var5, false);
                            if (var16 != null) {
                                int var17 = var16.field300 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field298 = new LocEntity(var14, var9 + 4, var17, this.field1619, var13, var12, 2, false, var15, var11);
                                    var16.field299 = new LocEntity(var14, var9 + 1 & 3, var17, this.field1619, var13, var12, 2, false, var15, var11);
                                } else {
                                    var16.field298 = new LocEntity(var14, var9, var17, this.field1619, var13, var12, var8, false, var15, var11);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1464.method87(var5, this.field1268, this.field1634, var6);
                            if (var18 != null) {
                                var18.field191 = new LocEntity(var14, 0, var18.field192 >> 14 & 32767, this.field1619, var13, var12, 4, false, var15, var11);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1464.method88(var5, this.field1268, 6, var6);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field283 = new LocEntity(var14, var9, var19.field291 >> 14 & 32767, this.field1619, var13, var12, var8, false, var15, var11);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1464.method89(this.field1268, (byte) -5, var5, var6);
                            if (var20 != null) {
                                var20.field222 = new LocEntity(var14, var9, var20.field223 >> 14 & 32767, this.field1619, var13, var12, 22, false, var15, var11);
                            }
                        }
                    }
                } else if (arg0 == 38) {
                    int var21 = arg1.method239();
                    int var22 = (var21 >> 4 & 7) + this.field1446;
                    int var23 = (var21 & 7) + this.field1447;
                    int var24 = arg1.method241();
                    int var25 = arg1.method241();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field520 = var24;
                        var26.field521 = var25;
                        if (this.field1472[this.field1268][var22][var23] == null) {
                            this.field1472[this.field1268][var22][var23] = new LinkList(field1399);
                        }
                        this.field1472[this.field1268][var22][var23].method255(var26);
                        this.method527(var22, var23);
                    }
                } else if (arg0 == 174) {
                    int var27 = arg1.method239();
                    int var28 = (var27 >> 4 & 7) + this.field1446;
                    int var29 = (var27 & 7) + this.field1447;
                    int var30 = arg1.method241();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1472[this.field1268][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method258(); var32 != null; var32 = (ObjStackEntity) var31.method260(17736)) {
                                if ((var30 & 32767) == var32.field520) {
                                    var32.method120();
                                    break;
                                }
                            }
                            if (var31.method258() == null) {
                                this.field1472[this.field1268][var28][var29] = null;
                            }
                            this.method527(var28, var29);
                        }
                    }
                } else if (arg0 == 146) {
                    int var33 = arg1.method239();
                    int var34 = (var33 >> 4 & 7) + this.field1446;
                    int var35 = (var33 & 7) + this.field1447;
                    int var36 = var34 + arg1.method240();
                    int var37 = var35 + arg1.method240();
                    int var38 = arg1.method242();
                    int var39 = arg1.method241();
                    int var40 = arg1.method239() * 4;
                    int var41 = arg1.method239() * 4;
                    int var42 = arg1.method241();
                    int var43 = arg1.method241();
                    int var44 = arg1.method239();
                    int var45 = arg1.method239();
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                        int var46 = var34 * 128 + 64;
                        int var47 = var35 * 128 + 64;
                        int var48 = var36 * 128 + 64;
                        int var49 = var37 * 128 + 64;
                        ProjectileEntity var50 = new ProjectileEntity(field1247 + var42, this.field1268, var45, field1247 + var43, var41, var46, var44, 0, var47, var38, var39, this.method501(this.field1268, var46, var47, 54) - var40);
                        var50.method133(field1247 + var42, var48, (byte) 67, var49, this.method501(this.field1268, var48, var49, 54) - var41);
                        this.field1401.method255(var50);
                    }
                } else if (arg0 == 82) {
                    int var51 = arg1.method239();
                    int var52 = (var51 >> 4 & 7) + this.field1446;
                    int var53 = (var51 & 7) + this.field1447;
                    int var54 = arg1.method241();
                    int var55 = arg1.method239();
                    int var56 = arg1.method241();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(this.field1268, var54, field1247, 0, this.method501(this.field1268, var57, var58, 54) - var55, var57, var58, var56);
                        this.field1633.method255(var59);
                    }
                } else if (arg0 == 31) {
                    int var60 = arg1.method239();
                    int var61 = (var60 >> 4 & 7) + this.field1446;
                    int var62 = (var60 & 7) + this.field1447;
                    int var63 = arg1.method241();
                    int var64 = arg1.method241();
                    int var65 = arg1.method241();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1287 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field520 = var63;
                        var66.field521 = var64;
                        if (this.field1472[this.field1268][var61][var62] == null) {
                            this.field1472[this.field1268][var61][var62] = new LinkList(field1399);
                        }
                        this.field1472[this.field1268][var61][var62].method255(var66);
                        this.method527(var61, var62);
                    }
                } else {
                    if (arg0 == 125) {
                        int var67 = arg1.method239();
                        int var68 = (var67 >> 4 & 7) + this.field1446;
                        int var69 = (var67 & 7) + this.field1447;
                        int var70 = arg1.method239();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1643[var71];
                        int var74 = arg1.method241();
                        int var75 = arg1.method241();
                        int var76 = arg1.method241();
                        int var77 = arg1.method241();
                        byte var78 = arg1.method240();
                        byte var79 = arg1.method240();
                        byte var80 = arg1.method240();
                        byte var81 = arg1.method240();
                        PlayerEntity var82;
                        if (this.field1287 == var77) {
                            var82 = field1597;
                        } else {
                            var82 = this.field1363[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method334(var74);
                            int var84 = this.field1369[this.field1268][var68][var69];
                            int var85 = this.field1369[this.field1268][var68 + 1][var69];
                            int var86 = this.field1369[this.field1268][var68 + 1][var69 + 1];
                            int var87 = this.field1369[this.field1268][var68][var69 + 1];
                            Model var88 = var83.method340(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method468(this.field1268, 0, var69, var75 + 1, var76 + 1, 0, var73, var68, -1, 364);
                                var82.field497 = field1247 + var75;
                                var82.field498 = field1247 + var76;
                                var82.field502 = var88;
                                int var89 = var83.field976;
                                int var90 = var83.field977;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field977;
                                    var90 = var83.field976;
                                }
                                var82.field499 = var68 * 128 + var89 * 64;
                                var82.field501 = var69 * 128 + var90 * 64;
                                var82.field500 = this.method501(this.field1268, var82.field499, var82.field501, 54);
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
                                var82.field503 = var68 + var78;
                                var82.field505 = var68 + var80;
                                var82.field504 = var69 + var79;
                                var82.field506 = var69 + var81;
                            }
                        }
                    }
                    if (arg0 == 106) {
                        int var93 = arg1.method239();
                        int var94 = (var93 >> 4 & 7) + this.field1446;
                        int var95 = (var93 & 7) + this.field1447;
                        int var96 = arg1.method241();
                        int var97 = arg1.method241();
                        int var98 = arg1.method241();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1472[this.field1268][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method258(); var100 != null; var100 = (ObjStackEntity) var99.method260(17736)) {
                                    if ((var96 & 32767) == var100.field520 && var100.field521 == var97) {
                                        var100.field521 = var98;
                                        break;
                                    }
                                }
                                this.method527(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var101 = arg1.method239();
                int var102 = (var101 >> 4 & 7) + this.field1446;
                int var103 = (var101 & 7) + this.field1447;
                int var104 = arg1.method239();
                int var105 = var104 >> 2;
                int var106 = var104 & 3;
                int var107 = this.field1643[var105];
                int var108;
                if (arg0 == 112) {
                    var108 = -1;
                } else {
                    var108 = arg1.method241();
                }
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    this.method468(this.field1268, var105, var103, 0, -1, var106, var107, var102, var108, 364);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method509(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1432 = "";
                this.field1433 = "Connecting to server...";
                this.method545(true, 0);
            }
            this.field1347 = new ClientStream(true, this.method519(field1378 + 43594), this);
            long var4 = JString.method310(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1442.field736 = 0;
            this.field1442.method229(14);
            this.field1442.method229(var6);
            this.field1347.method42(this.field1442.field735, 0, 2, 225);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1347.method39();
            }
            int var8 = this.field1347.method39();
            if (var8 == 0) {
                this.field1347.method41(this.field1680.field735, 0, 8);
                this.field1680.field736 = 0;
                this.field1605 = this.field1680.method245(0);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1605 >> 32), (int) this.field1605 };
                this.field1442.field736 = 0;
                this.field1442.method229(10);
                this.field1442.method233(var9[0]);
                this.field1442.method233(var9[1]);
                this.field1442.method233(var9[2]);
                this.field1442.method233(var9[3]);
                this.field1442.method233(signlink.uid);
                this.field1442.method236(arg0);
                this.field1442.method236(arg1);
                this.field1442.method254(0, field1359, field1621);
                this.field1360.field736 = 0;
                if (arg2) {
                    this.field1360.method229(18);
                } else {
                    this.field1360.method229(16);
                }
                this.field1360.method229(this.field1442.field736 + 36 + 1 + 1);
                this.field1360.method229(252);
                this.field1360.method229(field1380 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1360.method233(this.field1561[var10]);
                }
                this.field1360.method237(this.field1442.field735, 0, this.field1442.field736, 568);
                this.field1442.field740 = new Isaac((byte) 123, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1307 = new Isaac((byte) 123, var9);
                this.field1347.method42(this.field1360.field735, 0, this.field1360.field736, 225);
                var8 = this.field1347.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var20) {
                }
                this.method509(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1341 = this.field1347.method39();
                field1652 = this.field1347.method39() == 1;
                InputTracking.method45((byte) 86);
                this.field1653 = 0L;
                this.field1518 = 0;
                this.field1632.field1008 = 0;
                super.field24 = true;
                this.field1568 = true;
                this.field1513 = true;
                this.field1442.field736 = 0;
                this.field1680.field736 = 0;
                this.field1226 = -1;
                this.field1666 = -1;
                this.field1667 = -1;
                this.field1668 = -1;
                this.field1225 = 0;
                this.field1227 = 0;
                this.field1306 = 0;
                this.field1229 = 0;
                this.field1475 = 0;
                this.field1453 = 0;
                this.field1348 = 0;
                this.field1642 = false;
                super.field25 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1660[var12] = null;
                }
                this.field1627 = 0;
                this.field1343 = 0;
                this.field1299 = 0;
                this.field1371 = 0;
                this.field1538 = (int) (Math.random() * 100.0D) - 50;
                this.field1260 = (int) (Math.random() * 110.0D) - 55;
                this.field1640 = (int) (Math.random() * 80.0D) - 40;
                this.field1476 = (int) (Math.random() * 120.0D) - 60;
                this.field1443 = (int) (Math.random() * 30.0D) - 20;
                this.field1405 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1553 = -1;
                this.field1256 = 0;
                this.field1257 = 0;
                this.field1364 = 0;
                this.field1498 = 0;
                for (int var13 = 0; var13 < this.field1361; ++var13) {
                    this.field1363[var13] = null;
                    this.field1368[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1497[var14] = null;
                }
                field1597 = this.field1363[this.field1362] = new PlayerEntity();
                this.field1401.method262();
                this.field1633.method262();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1472[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1304 = new LinkList(field1399);
                this.field1639 = 0;
                this.field1638 = 0;
                this.field1496 = -1;
                this.field1331 = -1;
                this.field1484 = -1;
                this.field1676 = -1;
                this.field1436 = -1;
                this.field1615 = false;
                this.field1230 = 3;
                this.field1289 = false;
                this.field1642 = false;
                this.field1486 = false;
                this.field1451 = null;
                this.field1562 = 0;
                this.field1663 = -1;
                this.field1655 = true;
                this.method456(-14998);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1267[var18] = 0;
                }
                field1390 = 0;
                field1397 = 0;
                field1310 = 0;
                field1255 = 0;
                field1648 = 0;
                field1452 = 0;
                field1349 = 0;
                field1645 = 0;
                field1454 = 0;
                field1426 = 0;
                this.method479(this.field1279);
            } else if (var8 == 3) {
                this.field1432 = "";
                this.field1433 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1432 = "Your account has been disabled.";
                this.field1433 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1432 = "Your account is already logged in.";
                this.field1433 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1432 = "RuneScape has been updated!";
                this.field1433 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1432 = "This world is full.";
                this.field1433 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1432 = "Unable to connect.";
                this.field1433 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1432 = "Login limit exceeded.";
                this.field1433 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1432 = "Unable to connect.";
                this.field1433 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1433 = "Login server rejected session.";
                this.field1433 = "Please try again.";
            } else if (var8 == 12) {
                this.field1432 = "You need a members account to login to this world.";
                this.field1433 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1432 = "Could not complete login.";
                this.field1433 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1432 = "The server is being updated.";
                this.field1433 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1513 = true;
                this.field1442.field736 = 0;
                this.field1680.field736 = 0;
                this.field1226 = -1;
                this.field1666 = -1;
                this.field1667 = -1;
                this.field1668 = -1;
                this.field1225 = 0;
                this.field1227 = 0;
                this.field1306 = 0;
                this.field1348 = 0;
                this.field1642 = false;
                this.field1259 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1432 = "Login attempts exceeded.";
                this.field1433 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1432 = "You are standing in a members-only area.";
                this.field1433 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1432 = "Invalid loginserver requested";
                this.field1433 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1432 = "No response from server";
                    this.field1433 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1432 = "Unexpected server response";
                    this.field1433 = "Please try using a different world.";
                }
            } else {
                for (int var19 = this.field1347.method39(); var19 >= 0; --var19) {
                    this.field1432 = "You have only just left another world";
                    this.field1433 = "Your profile will be transfered in: " + var19 + " seconds";
                    this.method545(true, 0);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var21) {
                    }
                }
                this.method509(arg0, arg1, arg2);
            }
        } catch (IOException var22) {
            this.field1432 = "";
            this.field1433 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1464.method94(this.field1268, arg1, arg4, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method453(arg1, (byte) 5, 0, false, var8 + 1, 0, 0, field1597.field477[0], field1597.field478[0], arg4, 2, var9);
            } else {
                LocType var10 = LocType.method334(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field977;
                    var12 = var10.field976;
                } else {
                    var11 = var10.field976;
                    var12 = var10.field977;
                }
                int var13 = var10.field999;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method453(arg1, (byte) 5, var12, false, 0, var13, var11, field1597.field477[0], field1597.field478[0], arg4, 2, 0);
            }
            this.field1327 = super.field34;
            this.field1328 = super.field35;
            this.field1330 = 2;
            this.field1329 = 0;
            this.field1442.method228(arg2, this.field1483);
            this.field1442.method230(this.field1514 + arg1);
            this.field1225 += arg3;
            this.field1442.method230(this.field1515 + arg4);
            this.field1442.method230(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = Model.field626[var8];
            int var14 = Model.field627[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field626[var9];
            int var17 = Model.field627[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1321 = arg0 - var10;
        this.field1322 = arg3 - var11;
        if (arg4 != 0) {
            this.field1520 = !this.field1520;
        }
        this.field1323 = arg2 - var12;
        this.field1324 = arg6;
        this.field1325 = arg1;
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JZ)V")
    public final void method512(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1599; ++var4) {
                if (this.field1441[var4] == arg0) {
                    --this.field1599;
                    this.field1244 = true;
                    for (int var5 = var4; var5 < this.field1599; ++var5) {
                        this.field1441[var5] = this.field1441[var5 + 1];
                    }
                    this.field1442.method228(74, this.field1483);
                    this.field1442.method235(arg0, 0);
                    break;
                }
            }
            this.field1513 &= arg1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method513(Component arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (arg0.field96 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field96.length; ++var3) {
                int var4 = this.method485(var3, arg0, (byte) 9);
                int var5 = arg0.field97[var3];
                if (arg0.field96[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field96[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field96[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILjb;)V")
    public final void method514(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = this.field1476 + this.field1405 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = Model.field626[var5];
            int var8 = Model.field627[var5];
            int var9 = var7 * 256 / (this.field1443 + 256);
            if (arg2 != 4) {
                this.field1279 = this.field1307.method305();
            }
            int var10 = var8 * 256 / (this.field1443 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method205(var11 + 94 - arg3.field693 / 2 + 4, 83 - var12 - arg3.field694 / 2 - 4, 0, this.field1678);
            } else {
                arg3.method199(83 - var12 - arg3.field694 / 2 - 4, this.field1373, var11 + 94 - arg3.field693 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIZ)Z")
    public final boolean method515(int arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        if (arg2) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        Component var6 = Component.field80[arg0];
        for (int var7 = 0; var7 < var6.field102.length && var6.field102[var7] != -1; ++var7) {
            Component var8 = Component.field80[var6.field102[var7]];
            if (var8.field87 == 1) {
                var4 |= this.method515(var8.field85, arg1, false);
            }
            if (var8.field87 == 6 && (var8.field133 != -1 || var8.field134 != -1)) {
                boolean var9 = this.method513(var8, -98);
                int var10;
                if (var9) {
                    var10 = var8.field134;
                } else {
                    var10 = var8.field133;
                }
                if (var10 != -1) {
                    SeqType var11 = SeqType.field1149[var10];
                    var8.field84 += arg1;
                    while (var8.field84 > var11.method384(0, var8.field83)) {
                        var8.field84 -= var11.method384(0, var8.field83) + 1;
                        ++var8.field83;
                        if (var8.field83 >= var11.field1150) {
                            var8.field83 -= var11.field1154;
                            if (var8.field83 < 0 || var8.field83 >= var11.field1150) {
                                var8.field83 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILd;)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg6.field87 == 0 && arg6.field102 != null && !arg6.field101) {
            if (arg5 >= arg2 && arg1 >= arg3 && arg5 <= arg6.field90 + arg2 && arg1 <= arg6.field91 + arg3) {
                int var8 = arg6.field102.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field103[var9] + arg2;
                    int var11 = arg6.field104[var9] + arg3 - arg0;
                    Component var12 = Component.field80[arg6.field102[var9]];
                    int var13 = var12.field93 + var10;
                    int var14 = var12.field94 + var11;
                    if ((var12.field98 >= 0 || var12.field125 != 0) && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                        if (var12.field98 >= 0) {
                            this.field1309 = var12.field98;
                        } else {
                            this.field1309 = var12.field85;
                        }
                    }
                    if (var12.field87 == 0) {
                        this.method516(var12.field100, arg1, var13, var14, -381, arg5, var12);
                        if (var12.field99 > var12.field91) {
                            this.method533(true, var12.field90 + var13, var14, 25368, var12.field99, var12, arg1, arg5, var12.field91);
                        }
                    } else {
                        if (var12.field88 == 1 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            boolean var15 = false;
                            if (var12.field89 != 0) {
                                var15 = this.method537(9, var12);
                            }
                            if (!var15) {
                                this.field1386[this.field1348] = var12.field141;
                                this.field1493[this.field1348] = 951;
                                this.field1492[this.field1348] = var12.field85;
                                ++this.field1348;
                            }
                        }
                        if (var12.field88 == 2 && this.field1343 == 0 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            String var16 = var12.field138;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1386[this.field1348] = var16 + " @gre@" + var12.field139;
                            this.field1493[this.field1348] = 930;
                            this.field1492[this.field1348] = var12.field85;
                            ++this.field1348;
                        }
                        if (var12.field88 == 3 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            this.field1386[this.field1348] = "Close";
                            this.field1493[this.field1348] = 947;
                            this.field1492[this.field1348] = var12.field85;
                            ++this.field1348;
                        }
                        if (var12.field88 == 4 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            this.field1386[this.field1348] = var12.field141;
                            this.field1493[this.field1348] = 465;
                            this.field1492[this.field1348] = var12.field85;
                            ++this.field1348;
                        }
                        if (var12.field88 == 5 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            this.field1386[this.field1348] = var12.field141;
                            this.field1493[this.field1348] = 960;
                            this.field1492[this.field1348] = var12.field85;
                            ++this.field1348;
                        }
                        if (var12.field88 == 6 && !this.field1615 && arg5 >= var13 && arg1 >= var14 && arg5 < var12.field90 + var13 && arg1 < var12.field91 + var14) {
                            this.field1386[this.field1348] = var12.field141;
                            this.field1493[this.field1348] = 44;
                            this.field1492[this.field1348] = var12.field85;
                            ++this.field1348;
                        }
                        if (var12.field87 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field91; ++var18) {
                                for (int var19 = 0; var19 < var12.field90; ++var19) {
                                    int var20 = (var12.field111 + 32) * var19 + var13;
                                    int var21 = (var12.field112 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field114[var17];
                                        var21 += var12.field115[var17];
                                    }
                                    if (arg5 >= var20 && arg1 >= var21 && arg5 < var20 + 32 && arg1 < var21 + 32) {
                                        this.field1290 = var17;
                                        this.field1291 = var12.field85;
                                        if (var12.field81[var17] > 0) {
                                            ObjType var22 = ObjType.method350(var12.field81[var17] - 1);
                                            if (this.field1627 == 1 && var12.field108) {
                                                if (this.field1629 != var12.field85 || this.field1628 != var17) {
                                                    this.field1386[this.field1348] = "Use " + this.field1631 + " with @lre@" + var22.field1057;
                                                    this.field1493[this.field1348] = 881;
                                                    this.field1494[this.field1348] = var22.field1055;
                                                    this.field1491[this.field1348] = var17;
                                                    this.field1492[this.field1348] = var12.field85;
                                                    ++this.field1348;
                                                }
                                            } else if (this.field1343 == 1 && var12.field108) {
                                                if ((this.field1345 & 16) == 16) {
                                                    this.field1386[this.field1348] = this.field1346 + " @lre@" + var22.field1057;
                                                    this.field1493[this.field1348] = 391;
                                                    this.field1494[this.field1348] = var22.field1055;
                                                    this.field1491[this.field1348] = var17;
                                                    this.field1492[this.field1348] = var12.field85;
                                                    ++this.field1348;
                                                }
                                            } else {
                                                if (var12.field108) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1072 != null && var22.field1072[var23] != null) {
                                                            this.field1386[this.field1348] = var22.field1072[var23] + " @lre@" + var22.field1057;
                                                            if (var23 == 3) {
                                                                this.field1493[this.field1348] = 478;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1493[this.field1348] = 347;
                                                            }
                                                            this.field1494[this.field1348] = var22.field1055;
                                                            this.field1491[this.field1348] = var17;
                                                            this.field1492[this.field1348] = var12.field85;
                                                            ++this.field1348;
                                                        } else if (var23 == 4) {
                                                            this.field1386[this.field1348] = "Drop @lre@" + var22.field1057;
                                                            this.field1493[this.field1348] = 347;
                                                            this.field1494[this.field1348] = var22.field1055;
                                                            this.field1491[this.field1348] = var17;
                                                            this.field1492[this.field1348] = var12.field85;
                                                            ++this.field1348;
                                                        }
                                                    }
                                                }
                                                if (var12.field109) {
                                                    this.field1386[this.field1348] = "Use @lre@" + var22.field1057;
                                                    this.field1493[this.field1348] = 188;
                                                    this.field1494[this.field1348] = var22.field1055;
                                                    this.field1491[this.field1348] = var17;
                                                    this.field1492[this.field1348] = var12.field85;
                                                    ++this.field1348;
                                                }
                                                if (var12.field108 && var22.field1072 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1072[var24] != null) {
                                                            this.field1386[this.field1348] = var22.field1072[var24] + " @lre@" + var22.field1057;
                                                            if (var24 == 0) {
                                                                this.field1493[this.field1348] = 405;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1493[this.field1348] = 38;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1493[this.field1348] = 422;
                                                            }
                                                            this.field1494[this.field1348] = var22.field1055;
                                                            this.field1491[this.field1348] = var17;
                                                            this.field1492[this.field1348] = var12.field85;
                                                            ++this.field1348;
                                                        }
                                                    }
                                                }
                                                if (var12.field116 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field116[var25] != null) {
                                                            this.field1386[this.field1348] = var12.field116[var25] + " @lre@" + var22.field1057;
                                                            if (var25 == 0) {
                                                                this.field1493[this.field1348] = 602;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1493[this.field1348] = 596;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1493[this.field1348] = 22;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1493[this.field1348] = 892;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1493[this.field1348] = 415;
                                                            }
                                                            this.field1494[this.field1348] = var22.field1055;
                                                            this.field1491[this.field1348] = var17;
                                                            this.field1492[this.field1348] = var12.field85;
                                                            ++this.field1348;
                                                        }
                                                    }
                                                }
                                                this.field1386[this.field1348] = "Examine @lre@" + var22.field1057;
                                                this.field1493[this.field1348] = 1773;
                                                this.field1494[this.field1348] = var22.field1055;
                                                this.field1491[this.field1348] = var17;
                                                this.field1492[this.field1348] = var12.field85;
                                                ++this.field1348;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
                if (arg4 < 0) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)I")
    public final int method517(boolean arg0) {
        int var2 = 3;
        if (!arg0) {
            this.field1442.method229(178);
        }
        if (this.field1324 < 310) {
            int var3 = this.field1321 >> 7;
            int var4 = this.field1323 >> 7;
            int var5 = field1597.field428 >> 7;
            int var6 = field1597.field429 >> 7;
            if ((this.field1417[this.field1268][var3][var4] & 4) != 0) {
                var2 = this.field1268;
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
                    if ((this.field1417[this.field1268][var3][var4] & 4) != 0) {
                        var2 = this.field1268;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1417[this.field1268][var3][var4] & 4) != 0) {
                            var2 = this.field1268;
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
                    if ((this.field1417[this.field1268][var3][var4] & 4) != 0) {
                        var2 = this.field1268;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1417[this.field1268][var3][var4] & 4) != 0) {
                            var2 = this.field1268;
                        }
                    }
                }
            }
        }
        if ((this.field1417[this.field1268][field1597.field428 >> 7][field1597.field429 >> 7] & 4) != 0) {
            var2 = this.field1268;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)I")
    public final int method518(int arg0) {
        this.field1225 += arg0;
        int var2 = this.method501(this.field1268, this.field1321, this.field1323, 54);
        return var2 - this.field1322 < 800 && (this.field1417[this.field1268][this.field1321 >> 7][this.field1323 >> 7] & 4) != 0 ? this.field1268 : 3;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method519(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method520(byte arg0) {
        if (arg0 != -70) {
            this.field1286 = !this.field1286;
        }
        if (super.field33 == 1) {
            if (super.field34 >= 6 && super.field34 <= 106 && super.field35 >= 467 && super.field35 <= 499) {
                this.field1448 = (this.field1448 + 1) % 4;
                this.field1651 = true;
                this.field1431 = true;
                this.field1442.method228(94, this.field1483);
                this.field1442.method229(this.field1448);
                this.field1442.method229(this.field1502);
                this.field1442.method229(this.field1598);
            }
            if (super.field34 >= 135 && super.field34 <= 235 && super.field35 >= 467 && super.field35 <= 499) {
                this.field1502 = (this.field1502 + 1) % 3;
                this.field1651 = true;
                this.field1431 = true;
                this.field1442.method228(94, this.field1483);
                this.field1442.method229(this.field1448);
                this.field1442.method229(this.field1502);
                this.field1442.method229(this.field1598);
            }
            if (super.field34 >= 273 && super.field34 <= 373 && super.field35 >= 467 && super.field35 <= 499) {
                this.field1598 = (this.field1598 + 1) % 3;
                this.field1651 = true;
                this.field1431 = true;
                this.field1442.method228(94, this.field1483);
                this.field1442.method229(this.field1448);
                this.field1442.method229(this.field1502);
                this.field1442.method229(this.field1598);
            }
            if (super.field34 >= 412 && super.field34 <= 512 && super.field35 >= 467 && super.field35 <= 499) {
                this.method439(0);
                this.field1665 = "";
                this.field1298 = false;
                for (int var2 = 0; var2 < Component.field80.length; ++var2) {
                    if (Component.field80[var2] != null && Component.field80[var2].field89 == 600) {
                        this.field1570 = this.field1484 = Component.field80[var2].field86;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method521(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1226 = -1;
        }
        while (true) {
            OnDemandRequest var3 = this.field1413.method291();
            if (var3 == null) {
                return;
            }
            if (var3.field749 == 0) {
                Model.method137(this.field1283, var3.field751, var3.field750);
                if ((this.field1413.method287(var3.field750, -772) & 98) != 0) {
                    this.field1244 = true;
                    if (this.field1331 != -1) {
                        this.field1431 = true;
                    }
                }
            }
            if (var3.field749 == 1 && var3.field751 != null) {
                AnimFrame.method59(var3.field751, true);
            }
            if (var3.field749 == 2 && this.field1408 == var3.field750 && var3.field751 != null) {
                this.method470(var3.field751, this.field1589, this.field1409);
            }
            if (var3.field749 == 3 && this.field1299 == 1) {
                for (int var4 = 0; var4 < this.field1656.length; ++var4) {
                    if (this.field1468[var4] == var3.field750) {
                        this.field1656[var4] = var3.field751;
                        if (var3.field751 == null) {
                            this.field1468[var4] = -1;
                        }
                        break;
                    }
                    if (this.field1469[var4] == var3.field750) {
                        this.field1489[var4] = var3.field751;
                        if (var3.field751 == null) {
                            this.field1469[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field749 == 93 && this.field1413.method286(true, var3.field750)) {
                World.method17(this.field1413, 3, new Packet(45427, var3.field751));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;III)V")
    public final void method522(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg2 < 8 || arg2 > 8) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field1476 + this.field1405 & 2047;
            int var8 = Model.field626[var7];
            int var9 = Model.field627[var7];
            int var10 = var8 * 256 / (this.field1443 + 256);
            int var11 = var9 * 256 / (this.field1443 + 256);
            int var12 = arg1 * var11 + arg3 * var10 >> 16;
            int var13 = arg3 * var11 - arg1 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field1672.method204(83 - var17 - 20, 15, var16 + 94 + 4 - 10, 20, 20, var14, (byte) -83, 15, 256);
        } else {
            this.method514(arg3, arg1, 4, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method523(int arg0, byte arg1, int arg2) {
        if (arg1 != -36) {
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

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public static final void method524(int arg0) {
        World3D.field315 = true;
        Pix3D.field657 = true;
        field1380 = true;
        World.field52 = true;
        while (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method525(int arg0) {
        this.field1593.method268(0);
        Pix3D.field668 = this.field1271;
        this.field1679.method212(0, this.field1373, 0);
        if (this.field1486) {
            this.field1535.method214(0, this.field1311, 673, 40, 239);
            this.field1535.method214(128, this.field1532 + "*", 673, 60, 239);
        } else if (this.field1289) {
            this.field1535.method214(0, "Enter amount:", 673, 40, 239);
            this.field1535.method214(128, this.field1576 + "*", 673, 60, 239);
        } else if (this.field1451 != null) {
            this.field1535.method214(0, this.field1451, 673, 40, 239);
            this.field1535.method214(128, "Click to continue", 673, 60, 239);
        } else if (this.field1331 != -1) {
            this.method526(Component.field80[this.field1331], -640, 0, 0, 0);
        } else if (this.field1496 != -1) {
            this.method526(Component.field80[this.field1496], -640, 0, 0, 0);
        } else {
            PixFont var2 = this.field1534;
            int var3 = 0;
            Pix2D.method167(true, 463, 0, 0, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1660[var4] != null) {
                    int var6 = this.field1658[var4];
                    int var7 = 70 - var3 * 14 + this.field1466;
                    String var8 = this.field1659[var4];
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
                            var2.method217(4, this.field1660[var4], var7, 0, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1448 == 0 || this.field1448 == 1 && this.method480(var8, 0))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1636[0].method212(var7 - 12, this.field1373, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1636[1].method212(var7 - 12, this.field1373, var10);
                                var10 += 14;
                            }
                            var2.method217(var10, var8 + ":", var7, 0, 0);
                            int var11 = var10 + var2.method216((byte) 7, var8) + 8;
                            var2.method217(var11, this.field1660[var4], var7, 255, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1434 == 0 && (var6 == 7 || this.field1502 == 0 || this.field1502 == 1 && this.method480(var8, 0))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method217(var12, "From", var7, 0, 0);
                            int var13 = var12 + var2.method216((byte) 7, "From ");
                            if (var9 == 1) {
                                this.field1636[0].method212(var7 - 12, this.field1373, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1636[1].method212(var7 - 12, this.field1373, var13);
                                var13 += 14;
                            }
                            var2.method217(var13, var8 + ":", var7, 0, 0);
                            int var14 = var13 + var2.method216((byte) 7, var8) + 8;
                            var2.method217(var14, this.field1660[var4], var7, 8388608, 0);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1598 == 0 || this.field1598 == 1 && this.method480(var8, 0))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(4, var8 + " " + this.field1660[var4], var7, 8388736, 0);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1434 == 0 && this.field1502 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(4, this.field1660[var4], var7, 8388608, 0);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1434 == 0 && this.field1502 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(4, "To " + var8 + ":", var7, 0, 0);
                            var2.method217(12 + var2.method216((byte) 7, "To " + var8), this.field1660[var4], var7, 8388608, 0);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1598 == 0 || this.field1598 == 1 && this.method480(var8, 0))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(4, var8 + " " + this.field1660[var4], var7, 8270336, 0);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method166(0);
            this.field1671 = var3 * 14 + 7;
            if (this.field1671 < 78) {
                this.field1671 = 78;
            }
            this.method558(false, 0, 77, 463, this.field1671 - this.field1466 - 77, this.field1671);
            String var5;
            if (field1597 != null && field1597.field488 != null) {
                var5 = field1597.field488;
            } else {
                var5 = JString.method314(false, this.field1277);
            }
            var2.method217(4, var5 + ":", 90, 0, 0);
            var2.method217(6 + var2.method216((byte) 7, var5 + ": "), this.field1622 + "*", 90, 255, 0);
            Pix2D.method173(this.field1281, 0, 0, 479, 77);
        }
        if (this.field1642 && this.field1581 == 2) {
            this.method449(341);
        }
        this.field1593.method269(17, super.field19, 357, this.field1664);
        if (arg0 != 4) {
            this.field1442.method229(105);
        }
        this.field1592.method268(0);
        Pix3D.field668 = this.field1273;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIII)V")
    public final void method526(Component arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field87 == 0 && arg0.field102 != null) {
            if (!arg0.field101 || this.field1285 == arg0.field85 || this.field1274 == arg0.field85 || this.field1557 == arg0.field85) {
                int var6 = Pix2D.field649;
                int var7 = Pix2D.field647;
                int var8 = Pix2D.field650;
                int var9 = Pix2D.field648;
                Pix2D.method167(true, arg0.field90 + arg2, arg2, arg4, arg0.field91 + arg4);
                if (arg1 >= 0) {
                    this.field1226 = -1;
                }
                int var10 = arg0.field102.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field103[var11] + arg2;
                    int var13 = arg0.field104[var11] + arg4 - arg3;
                    Component var14 = Component.field80[arg0.field102[var11]];
                    int var15 = var14.field93 + var12;
                    int var16 = var14.field94 + var13;
                    if (var14.field89 > 0) {
                        this.method486((byte) 74, var14);
                    }
                    if (var14.field87 == 0) {
                        if (var14.field100 > var14.field99 - var14.field91) {
                            var14.field100 = var14.field99 - var14.field91;
                        }
                        if (var14.field100 < 0) {
                            var14.field100 = 0;
                        }
                        this.method526(var14, -640, var15, var14.field100, var16);
                        if (var14.field99 > var14.field91) {
                            this.method558(false, var16, var14.field91, var14.field90 + var15, var14.field100, var14.field99);
                        }
                    } else if (var14.field87 != 1) {
                        if (var14.field87 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field91; ++var18) {
                                for (int var19 = 0; var19 < var14.field90; ++var19) {
                                    int var20 = (var14.field111 + 32) * var19 + var15;
                                    int var21 = (var14.field112 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field114[var17];
                                        var21 += var14.field115[var17];
                                    }
                                    if (var14.field81[var17] <= 0) {
                                        if (var14.field113 != null && var17 < 20) {
                                            Pix32 var30 = var14.field113[var17];
                                            if (var30 != null) {
                                                var30.method199(var21, this.field1373, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field81[var17] - 1;
                                        if (var20 > Pix2D.field649 - 32 && var20 < Pix2D.field650 && var21 > Pix2D.field647 - 32 && var21 < Pix2D.field648 || this.field1459 != 0 && this.field1458 == var17) {
                                            int var25 = 0;
                                            if (this.field1627 == 1 && this.field1628 == var17 && this.field1629 == var14.field85) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method356(false, var25, var14.field82[var17], var24);
                                            if (var26 != null) {
                                                if (this.field1459 != 0 && this.field1458 == var17 && this.field1457 == var14.field85) {
                                                    var22 = super.field27 - this.field1460;
                                                    var23 = super.field28 - this.field1461;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1569 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method201(var20 + var22, var21 + var23, 128, 2);
                                                    if (var21 + var23 < Pix2D.field647 && arg0.field100 > 0) {
                                                        int var27 = (Pix2D.field647 - var21 - var23) * this.field1529 / 3;
                                                        if (var27 > this.field1529 * 10) {
                                                            var27 = this.field1529 * 10;
                                                        }
                                                        if (var27 > arg0.field100) {
                                                            var27 = arg0.field100;
                                                        }
                                                        arg0.field100 -= var27;
                                                        this.field1461 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field648 && arg0.field100 < arg0.field99 - arg0.field91) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field648) * this.field1529 / 3;
                                                        if (var28 > this.field1529 * 10) {
                                                            var28 = this.field1529 * 10;
                                                        }
                                                        if (var28 > arg0.field99 - arg0.field91 - arg0.field100) {
                                                            var28 = arg0.field99 - arg0.field91 - arg0.field100;
                                                        }
                                                        arg0.field100 += var28;
                                                        this.field1461 -= var28;
                                                    }
                                                } else if (this.field1243 != 0 && this.field1242 == var17 && this.field1241 == var14.field85) {
                                                    var26.method201(var20, var21, 128, 2);
                                                } else {
                                                    var26.method199(var21, this.field1373, var20);
                                                }
                                                if (var26.field693 == 33 || var14.field82[var17] != 1) {
                                                    int var29 = var14.field82[var17];
                                                    this.field1533.method217(var20 + 1 + var22, method459(var29, true), var21 + 10 + var23, 0, 0);
                                                    this.field1533.method217(var20 + var22, method459(var29, true), var21 + 9 + var23, 16776960, 0);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field87 == 3) {
                            boolean var31 = false;
                            if (this.field1557 == var14.field85 || this.field1274 == var14.field85 || this.field1285 == var14.field85) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method513(var14, -98)) {
                                var32 = var14.field124;
                                if (var31 && var14.field126 != 0) {
                                    var32 = var14.field126;
                                }
                            } else {
                                var32 = var14.field123;
                                if (var31 && var14.field125 != 0) {
                                    var32 = var14.field125;
                                }
                            }
                            if (var14.field92 == 0) {
                                if (var14.field117) {
                                    Pix2D.method170(var16, var15, var32, var14.field90, (byte) 51, var14.field91);
                                } else {
                                    Pix2D.method171((byte) -97, var32, var16, var14.field90, var14.field91, var15);
                                }
                            } else if (var14.field117) {
                                Pix2D.method169(256 - (var14.field92 & 255), var14.field91, var14.field90, 391, var16, var15, var32);
                            } else {
                                Pix2D.method172(var14.field91, var16, false, var14.field90, var32, 256 - (var14.field92 & 255), var15);
                            }
                        } else if (var14.field87 == 4) {
                            PixFont var33 = var14.field120;
                            String var34 = var14.field121;
                            boolean var35 = false;
                            if (this.field1557 == var14.field85 || this.field1274 == var14.field85 || this.field1285 == var14.field85) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method513(var14, -98)) {
                                var36 = var14.field124;
                                if (var35 && var14.field126 != 0) {
                                    var36 = var14.field126;
                                }
                                if (var14.field122.length() > 0) {
                                    var34 = var14.field122;
                                }
                            } else {
                                var36 = var14.field123;
                                if (var35 && var14.field125 != 0) {
                                    var36 = var14.field125;
                                }
                            }
                            if (var14.field88 == 6 && this.field1615) {
                                var34 = "Please wait...";
                                var36 = var14.field123;
                            }
                            if (Pix2D.field645 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field719 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method546(this.method485(4, var14, (byte) 9), 9) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method546(this.method485(3, var14, (byte) 9), 9) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method546(this.method485(2, var14, (byte) 9), 9) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method546(this.method485(1, var14, (byte) 9), 9) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method546(this.method485(0, var14, (byte) 9), 9) + var34.substring(var38 + 2);
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
                                if (var14.field118) {
                                    var33.method215(var14.field90 / 2 + var15, var36, var14.field119, var37, var44, 1);
                                } else {
                                    var33.method219(var44, var37, var15, var36, 2, var14.field119);
                                }
                                var37 += var33.field719;
                            }
                        } else if (var14.field87 == 5) {
                            Pix32 var45;
                            if (this.method513(var14, -98)) {
                                var45 = var14.field128;
                            } else {
                                var45 = var14.field127;
                            }
                            if (var45 != null) {
                                var45.method199(var16, this.field1373, var15);
                            }
                        } else if (var14.field87 == 6) {
                            int var46 = Pix3D.field662;
                            int var47 = Pix3D.field663;
                            Pix3D.field662 = var14.field90 / 2 + var15;
                            Pix3D.field663 = var14.field91 / 2 + var16;
                            int var48 = Pix3D.field666[var14.field136] * var14.field135 >> 16;
                            int var49 = Pix3D.field667[var14.field136] * var14.field135 >> 16;
                            boolean var50 = this.method513(var14, -98);
                            int var51;
                            if (var50) {
                                var51 = var14.field134;
                            } else {
                                var51 = var14.field133;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, -1, var50, -567);
                            } else {
                                SeqType var53 = SeqType.field1149[var51];
                                var52 = var14.method34(var53.field1151[var14.field83], var53.field1152[var14.field83], var50, -567);
                            }
                            if (var52 != null) {
                                var52.method159(0, var14.field137, 0, var14.field136, 0, var48, var49);
                            }
                            Pix3D.field662 = var46;
                            Pix3D.field663 = var47;
                        } else if (var14.field87 == 7) {
                            PixFont var54 = var14.field120;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field91; ++var56) {
                                for (int var57 = 0; var57 < var14.field90; ++var57) {
                                    if (var14.field81[var55] > 0) {
                                        ObjType var58 = ObjType.method350(var14.field81[var55] - 1);
                                        String var59 = var58.field1057;
                                        if (var58.field1068 || var14.field82[var55] != 1) {
                                            var59 = var59 + " x" + method534(0, var14.field82[var55]);
                                        }
                                        int var60 = (var14.field111 + 115) * var57 + var15;
                                        int var61 = (var14.field112 + 12) * var56 + var16;
                                        if (var14.field118) {
                                            var54.method215(var14.field90 / 2 + var60, var14.field123, var14.field119, var61, var59, 1);
                                        } else {
                                            var54.method219(var59, var61, var60, var14.field123, 2, var14.field119);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method167(true, var8, var6, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method527(int arg0, int arg1) {
        LinkList var3 = this.field1472[this.field1268][arg0][arg1];
        if (var3 == null) {
            this.field1464.method85(this.field1268, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method258(); var6 != null; var6 = (ObjStackEntity) var3.method260(17736)) {
                ObjType var11 = ObjType.method350(var6.field520);
                int var12 = var11.field1069;
                if (var11.field1068) {
                    var12 = (var6.field521 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method256(var5, -5257);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method258(); var9 != null; var9 = (ObjStackEntity) var3.method260(17736)) {
                if (var5.field520 != var9.field520 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field520 != var9.field520 && var7.field520 != var9.field520 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1464.method71(this.field1268, var10, var7, var5, arg0, var8, (byte) -97, arg1, this.method501(this.field1268, arg0 * 128 + 64, arg1 * 128 + 64, 54));
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method528(int arg0) {
        if (this.field1459 == 0) {
            int var2 = super.field33;
            int var3 = 19 / arg0;
            if (this.field1343 == 1 && super.field34 >= 516 && super.field35 >= 160 && super.field34 <= 765 && super.field35 <= 205) {
                var2 = 0;
            }
            if (this.field1642) {
                if (var2 != 1) {
                    int var4 = super.field27;
                    int var5 = super.field28;
                    if (this.field1581 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field1581 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field1581 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field1582 - 10 || var4 > this.field1584 + this.field1582 + 10 || var5 < this.field1583 - 10 || var5 > this.field1585 + this.field1583 + 10) {
                        this.field1642 = false;
                        if (this.field1581 == 1) {
                            this.field1244 = true;
                        }
                        if (this.field1581 == 2) {
                            this.field1431 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field1582;
                    int var7 = this.field1583;
                    int var8 = this.field1584;
                    int var9 = super.field34;
                    int var10 = super.field35;
                    if (this.field1581 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field1581 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field1581 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1348; ++var12) {
                        int var13 = (this.field1348 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method505(var11, 3);
                    }
                    this.field1642 = false;
                    if (this.field1581 == 1) {
                        this.field1244 = true;
                    }
                    if (this.field1581 == 2) {
                        this.field1431 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1348 > 0) {
                    int var14 = this.field1493[this.field1348 - 1];
                    if (var14 == 602 || var14 == 596 || var14 == 22 || var14 == 892 || var14 == 415 || var14 == 405 || var14 == 38 || var14 == 422 || var14 == 478 || var14 == 347 || var14 == 188 || var14 == 1773) {
                        int var15 = this.field1491[this.field1348 - 1];
                        int var16 = this.field1492[this.field1348 - 1];
                        Component var17 = Component.field80[var16];
                        if (var17.field107 || var17.field110) {
                            this.field1437 = false;
                            this.field1569 = 0;
                            this.field1457 = var16;
                            this.field1458 = var15;
                            this.field1459 = 2;
                            this.field1460 = super.field34;
                            this.field1461 = super.field35;
                            if (Component.field80[var16].field86 == this.field1484) {
                                this.field1459 = 1;
                            }
                            if (Component.field80[var16].field86 == this.field1331) {
                                this.field1459 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1233 == 1 || this.method446(this.field1348 - 1, -581)) && this.field1348 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1348 > 0) {
                    this.method505(this.field1348 - 1, 3);
                }
                if (var2 != 2 || this.field1348 <= 0) {
                    return;
                }
                this.method544(this.field1314);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method529(Packet arg0, int arg1, int arg2) {
        arg0.method249(this.field1567);
        int var4 = arg0.method250(false, 8);
        if (var4 < this.field1498) {
            for (int var5 = var4; var5 < this.field1498; ++var5) {
                this.field1251[this.field1250++] = this.field1499[var5];
            }
        }
        if (var4 > this.field1498) {
            signlink.reporterror(this.field1277 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1498 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1499[var6];
                NpcEntity var8 = this.field1497[var7];
                int var9 = arg0.method250(false, 1);
                if (var9 == 0) {
                    this.field1499[this.field1498++] = var7;
                    var8.field473 = field1247;
                } else {
                    int var10 = arg0.method250(false, 2);
                    if (var10 == 0) {
                        this.field1499[this.field1498++] = var7;
                        var8.field473 = field1247;
                        this.field1367[this.field1366++] = var7;
                    } else if (var10 == 1) {
                        this.field1499[this.field1498++] = var7;
                        var8.field473 = field1247;
                        int var11 = arg0.method250(false, 3);
                        var8.method125(false, var11, false);
                        int var12 = arg0.method250(false, 1);
                        if (var12 == 1) {
                            this.field1367[this.field1366++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1499[this.field1498++] = var7;
                        var8.field473 = field1247;
                        int var13 = arg0.method250(false, 3);
                        var8.method125(false, var13, true);
                        int var14 = arg0.method250(false, 3);
                        var8.method125(false, var14, true);
                        int var15 = arg0.method250(false, 1);
                        if (var15 == 1) {
                            this.field1367[this.field1366++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1251[this.field1250++] = var7;
                    }
                }
            }
            if (arg1 <= 0) {
                this.field1483 = 29;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1377 = Integer.parseInt(this.getParameter("nodeid"));
        field1378 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method524(-502);
        } else {
            method451((byte) 4);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1379 = false;
        } else {
            field1379 = true;
        }
        this.method2(503, 765, false);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        byte[] var2 = this.field1635.method309("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1335.method268(0);
        var3.method197(880, 0, 0);
        this.field1336.method268(0);
        var3.method197(880, 0, -637);
        this.field1332.method268(0);
        var3.method197(880, 0, -128);
        this.field1333.method268(0);
        var3.method197(880, -371, -202);
        this.field1334.method268(0);
        var3.method197(880, -171, -202);
        this.field1337.method268(0);
        var3.method197(880, -265, 0);
        this.field1338.method268(0);
        var3.method197(880, -265, -562);
        this.field1339.method268(0);
        var3.method197(880, -171, -128);
        this.field1340.method268(0);
        var3.method197(880, -171, -562);
        int[] var4 = new int[var3.field689];
        for (int var5 = 0; var5 < var3.field690; ++var5) {
            for (int var10 = 0; var10 < var3.field689; ++var10) {
                var4[var10] = var3.field688[var3.field689 * var5 + (var3.field689 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field689; ++var11) {
                var3.field688[var3.field689 * var5 + var11] = var4[var11];
            }
        }
        this.field1335.method268(0);
        var3.method197(880, 0, 382);
        this.field1336.method268(0);
        this.field1513 &= arg0;
        var3.method197(880, 0, -255);
        this.field1332.method268(0);
        var3.method197(880, 0, 254);
        this.field1333.method268(0);
        var3.method197(880, -371, 180);
        this.field1334.method268(0);
        var3.method197(880, -171, 180);
        this.field1337.method268(0);
        var3.method197(880, -265, 382);
        this.field1338.method268(0);
        var3.method197(880, -265, -180);
        this.field1339.method268(0);
        var3.method197(880, -171, 254);
        this.field1340.method268(0);
        var3.method197(880, -171, -180);
        Pix32 var6 = new Pix32(this.field1635, "logo", 0);
        this.field1332.method268(0);
        var6.method199(18, this.field1373, 382 - var6.field689 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method531(int arg0) {
        if (arg0 != -24083) {
            field1587 = !field1587;
        }
        int var2 = (field1597.field428 >> 7) + this.field1514;
        int var3 = (field1597.field429 >> 7) + this.field1515;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1495 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1495 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1495 = 0;
        }
        this.field1473 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1473 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1473 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1473 = 1;
            }
        }
        if (this.field1473 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1473 = 2;
        }
        this.field1300 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1300 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1300 = 1;
        }
        if (this.field1300 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1300 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILbb;BLmb;I)V")
    private final void method532(int arg0, PlayerEntity arg1, byte arg2, Packet arg3, int arg4) {
        if (arg2 == 7) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if ((arg4 & 1) == 1) {
            int var8 = arg3.method239();
            byte[] var9 = new byte[var8];
            Packet var10 = new Packet(45427, var9);
            arg3.method248(0, var9, var8, 15021);
            this.field1368[arg0] = var10;
            arg1.method130(var10, 0);
        }
        if ((arg4 & 2) == 2) {
            int var11 = arg3.method241();
            if (var11 == 65535) {
                var11 = -1;
            }
            if (arg1.field456 == var11) {
                arg1.field460 = 0;
            }
            int var12 = arg3.method239();
            if (arg1.field456 == var11 && var11 != -1) {
                int var13 = SeqType.field1149[var11].field1163;
                if (var13 == 1) {
                    arg1.field457 = 0;
                    arg1.field458 = 0;
                    arg1.field459 = var12;
                    arg1.field460 = 0;
                }
                if (var13 == 2) {
                    arg1.field460 = 0;
                }
            } else if (var11 == -1 || arg1.field456 == -1 || SeqType.field1149[var11].field1157 >= SeqType.field1149[arg1.field456].field1157) {
                arg1.field456 = var11;
                arg1.field457 = 0;
                arg1.field458 = 0;
                arg1.field459 = var12;
                arg1.field460 = 0;
                arg1.field481 = arg1.field476;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field450 = arg3.method241();
            if (arg1.field450 == 65535) {
                arg1.field450 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field440 = arg3.method246();
            arg1.field442 = 0;
            arg1.field443 = 0;
            arg1.field441 = 150;
            this.method454(2, 2, arg1.field440, arg1.field488);
        }
        if ((arg4 & 16) == 16) {
            int var14 = arg3.method239();
            int var15 = arg3.method239();
            arg1.method128(var15, -489, var14);
            arg1.field447 = field1247 + 300;
            arg1.field448 = arg3.method239();
            arg1.field449 = arg3.method239();
        }
        if ((arg4 & 32) == 32) {
            arg1.field451 = arg3.method241();
            arg1.field452 = arg3.method241();
        }
        if ((arg4 & 64) == 64) {
            int var16 = arg3.method241();
            int var17 = arg3.method239();
            int var18 = arg3.method239();
            int var19 = arg3.field736;
            if (arg1.field488 != null && arg1.field489) {
                long var20 = JString.method310(arg1.field488);
                boolean var22 = false;
                if (var17 <= 1) {
                    for (int var23 = 0; var23 < this.field1599; ++var23) {
                        if (this.field1441[var23] == var20) {
                            var22 = true;
                            break;
                        }
                    }
                }
                if (!var22 && this.field1300 == 0) {
                    try {
                        String var24 = WordPack.method317(arg3, true, var18);
                        String var25 = WordFilter.method403(-39648, var24);
                        arg1.field440 = var25;
                        arg1.field442 = var16 >> 8;
                        arg1.field443 = var16 & 255;
                        arg1.field441 = 150;
                        if (var17 != 2 && var17 != 3) {
                            if (var17 == 1) {
                                this.method454(2, 1, var25, "@cr1@" + arg1.field488);
                            } else {
                                this.method454(2, 2, var25, arg1.field488);
                            }
                        } else {
                            this.method454(2, 1, var25, "@cr2@" + arg1.field488);
                        }
                    } catch (Exception var30) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field736 = var18 + var19;
        }
        if ((arg4 & 256) == 256) {
            arg1.field461 = arg3.method241();
            int var27 = arg3.method244();
            arg1.field465 = var27 >> 16;
            arg1.field464 = (var27 & 65535) + field1247;
            arg1.field462 = 0;
            arg1.field463 = 0;
            if (arg1.field464 > field1247) {
                arg1.field462 = -1;
            }
            if (arg1.field461 == 65535) {
                arg1.field461 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field466 = arg3.method239();
            arg1.field468 = arg3.method239();
            arg1.field467 = arg3.method239();
            arg1.field469 = arg3.method239();
            arg1.field470 = arg3.method241() + field1247;
            arg1.field471 = arg3.method241() + field1247;
            arg1.field472 = arg3.method239();
            arg1.method126(-965);
        }
        if ((arg4 & 1024) == 1024) {
            int var28 = arg3.method239();
            int var29 = arg3.method239();
            arg1.method128(var29, -489, var28);
            arg1.field447 = field1247 + 300;
            arg1.field448 = arg3.method239();
            arg1.field449 = arg3.method239();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIILd;III)V")
    public final void method533(boolean arg0, int arg1, int arg2, int arg3, int arg4, Component arg5, int arg6, int arg7, int arg8) {
        if (this.field1232) {
            this.field1372 = 32;
        } else {
            this.field1372 = 0;
        }
        this.field1232 = false;
        if (arg3 == 25368) {
            if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg5.field100 -= this.field1305 * 4;
                if (arg0) {
                    this.field1244 = true;
                    return;
                }
            } else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg2 + arg8 - 16 && arg6 < arg2 + arg8) {
                arg5.field100 += this.field1305 * 4;
                if (arg0) {
                    this.field1244 = true;
                    return;
                }
            } else {
                if (arg7 < arg1 - this.field1372 || arg7 >= arg1 + 16 + this.field1372 || arg6 < arg2 + 16 || arg6 >= arg2 + arg8 - 16 || this.field1305 <= 0) {
                    return;
                }
                int var10 = (arg8 - 32) * arg8 / arg4;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg6 - arg2 - 16 - var10 / 2;
                int var12 = arg8 - 32 - var10;
                arg5.field100 = (arg4 - arg8) * var11 / var12;
                if (arg0) {
                    this.field1244 = true;
                }
                this.field1232 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method534(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method535(boolean arg0, int arg1) {
        Component var3 = Component.field80[arg1];
        for (int var4 = 0; var4 < var3.field102.length && var3.field102[var4] != -1; ++var4) {
            Component var5 = Component.field80[var3.field102[var4]];
            if (var5.field87 == 1) {
                this.method535(false, var5.field85);
            }
            var5.field83 = 0;
            var5.field84 = 0;
        }
        if (arg0) {
            this.field1226 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lgc;IIII)V")
    public final void method536(NpcType arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1231 != arg2) {
            this.field1411 = !this.field1411;
        }
        if (this.field1348 < 400) {
            String var6 = arg0.field1019;
            if (arg0.field1036 != 0) {
                var6 = var6 + method523(arg0.field1036, this.field1288, field1597.field494) + " (level-" + arg0.field1036 + ")";
            }
            if (this.field1627 == 1) {
                this.field1386[this.field1348] = "Use " + this.field1631 + " with @yel@" + var6;
                this.field1493[this.field1348] = 900;
                this.field1494[this.field1348] = arg1;
                this.field1491[this.field1348] = arg3;
                this.field1492[this.field1348] = arg4;
                ++this.field1348;
            } else {
                if (this.field1343 == 1) {
                    if ((this.field1345 & 2) == 2) {
                        this.field1386[this.field1348] = this.field1346 + " @yel@" + var6;
                        this.field1493[this.field1348] = 265;
                        this.field1494[this.field1348] = arg1;
                        this.field1491[this.field1348] = arg3;
                        this.field1492[this.field1348] = arg4;
                        ++this.field1348;
                        return;
                    }
                } else {
                    if (arg0.field1031 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg0.field1031[var7] != null && !arg0.field1031[var7].equalsIgnoreCase("attack")) {
                                this.field1386[this.field1348] = arg0.field1031[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1493[this.field1348] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1493[this.field1348] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1493[this.field1348] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1493[this.field1348] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1493[this.field1348] = 245;
                                }
                                this.field1494[this.field1348] = arg1;
                                this.field1491[this.field1348] = arg3;
                                this.field1492[this.field1348] = arg4;
                                ++this.field1348;
                            }
                        }
                    }
                    if (arg0.field1031 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg0.field1031[var8] != null && arg0.field1031[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg0.field1036 > field1597.field494) {
                                    var9 = 2000;
                                }
                                this.field1386[this.field1348] = arg0.field1031[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1493[this.field1348] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1493[this.field1348] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1493[this.field1348] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1493[this.field1348] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1493[this.field1348] = var9 + 245;
                                }
                                this.field1494[this.field1348] = arg1;
                                this.field1491[this.field1348] = arg3;
                                this.field1492[this.field1348] = arg4;
                                ++this.field1348;
                            }
                        }
                    }
                    this.field1386[this.field1348] = "Examine @yel@" + var6;
                    this.field1493[this.field1348] = 1607;
                    this.field1494[this.field1348] = arg1;
                    this.field1491[this.field1348] = arg3;
                    this.field1492[this.field1348] = arg4;
                    ++this.field1348;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method537(int arg0, Component arg1) {
        if (arg0 < 9 || arg0 > 9) {
            this.field1375 = !this.field1375;
        }
        int var3 = arg1.field89;
        if (var3 >= 1 && var3 <= 200 || var3 >= 701 && var3 <= 900) {
            if (var3 >= 801) {
                var3 -= 701;
            } else if (var3 >= 701) {
                var3 -= 601;
            } else if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1386[this.field1348] = "Remove @whi@" + this.field1525[var3];
            this.field1493[this.field1348] = 557;
            ++this.field1348;
            this.field1386[this.field1348] = "Message @whi@" + this.field1525[var3];
            this.field1493[this.field1348] = 679;
            ++this.field1348;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1386[this.field1348] = "Remove @whi@" + arg1.field121;
            this.field1493[this.field1348] = 556;
            ++this.field1348;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method538(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1223[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1223[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1224[var14] = (this.field1223[var14 - 1] + this.field1223[var14 + 1] + this.field1223[var14 - 128] + this.field1223[var14 + 128]) / 4;
            }
        }
        if (arg0 != -9756) {
            this.field1226 = -1;
        }
        this.field1558 += 128;
        if (this.field1558 > this.field1479.length) {
            this.field1558 -= this.field1479.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method553(this.field1524[var6], 0);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1224[var11 + 128] - this.field1479[this.field1558 + var11 & this.field1479.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1223[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1428[var8] = this.field1428[var8 + 1];
        }
        this.field1428[var2 - 1] = (int) (Math.sin((double) field1247 / 14.0D) * 16.0D + Math.sin((double) field1247 / 15.0D) * 14.0D + Math.sin((double) field1247 / 16.0D) * 12.0D);
        if (this.field1540 > 0) {
            this.field1540 -= 4;
        }
        if (this.field1541 > 0) {
            this.field1541 -= 4;
        }
        if (this.field1540 == 0 && this.field1541 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1540 = 1024;
            }
            if (var9 == 1) {
                this.field1541 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    private final void method539(int arg0) {
        if (arg0 >= 0) {
            this.field1226 = -1;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1304.method258(); var2 != null; var2 = (LocSpawned) this.field1304.method260(17736)) {
            if (var2.field765 == -1) {
                var2.field764 = 0;
                this.method503(2, var2);
            } else {
                var2.method120();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILmb;)V")
    private final void method540(byte arg0, int arg1, Packet arg2) {
        int var4 = arg2.method250(false, 8);
        if (var4 < this.field1364) {
            for (int var5 = var4; var5 < this.field1364; ++var5) {
                this.field1251[this.field1250++] = this.field1365[var5];
            }
        }
        if (var4 > this.field1364) {
            signlink.reporterror(this.field1277 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1364 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1365[var6];
                PlayerEntity var8 = this.field1363[var7];
                int var9 = arg2.method250(false, 1);
                if (var9 == 0) {
                    this.field1365[this.field1364++] = var7;
                    var8.field473 = field1247;
                } else {
                    int var10 = arg2.method250(false, 2);
                    if (var10 == 0) {
                        this.field1365[this.field1364++] = var7;
                        var8.field473 = field1247;
                        this.field1367[this.field1366++] = var7;
                    } else if (var10 == 1) {
                        this.field1365[this.field1364++] = var7;
                        var8.field473 = field1247;
                        int var11 = arg2.method250(false, 3);
                        var8.method125(false, var11, false);
                        int var12 = arg2.method250(false, 1);
                        if (var12 == 1) {
                            this.field1367[this.field1366++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1365[this.field1364++] = var7;
                        var8.field473 = field1247;
                        int var13 = arg2.method250(false, 3);
                        var8.method125(false, var13, true);
                        int var14 = arg2.method250(false, 3);
                        var8.method125(false, var14, true);
                        int var15 = arg2.method250(false, 1);
                        if (var15 == 1) {
                            this.field1367[this.field1366++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1251[this.field1250++] = var7;
                    }
                }
            }
            if (arg0 != 67) {
                this.field1442.method229(139);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method541(boolean arg0, int arg1) {
        int var3 = VarpType.field1190[arg1].field1198;
        this.field1513 &= arg0;
        if (var3 != 0) {
            int var4 = this.field1253[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method186(0.9D, 27381);
                }
                if (var4 == 2) {
                    Pix3D.method186(0.8D, 27381);
                }
                if (var4 == 3) {
                    Pix3D.method186(0.7D, 27381);
                }
                if (var4 == 4) {
                    Pix3D.method186(0.6D, 27381);
                }
                ObjType.field1095.method117();
                this.field1650 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1566;
                if (var4 == 0) {
                    this.method463(0, (byte) 70, this.field1566);
                    this.field1566 = true;
                }
                if (var4 == 1) {
                    this.method463(-400, (byte) 70, this.field1566);
                    this.field1566 = true;
                }
                if (var4 == 2) {
                    this.method463(-800, (byte) 70, this.field1566);
                    this.field1566 = true;
                }
                if (var4 == 3) {
                    this.method463(-1200, (byte) 70, this.field1566);
                    this.field1566 = true;
                }
                if (var4 == 4) {
                    this.field1566 = false;
                }
                if (this.field1566 != var5 && !field1380) {
                    if (this.field1566) {
                        this.field1408 = this.field1530;
                        this.field1409 = false;
                        this.field1413.method289(2, this.field1408);
                    } else {
                        this.method559(false);
                    }
                    this.field1482 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1403 = true;
                    this.method542(742, 0);
                }
                if (var4 == 1) {
                    this.field1403 = true;
                    this.method542(742, -400);
                }
                if (var4 == 2) {
                    this.field1403 = true;
                    this.method542(742, -800);
                }
                if (var4 == 3) {
                    this.field1403 = true;
                    this.method542(742, -1200);
                }
                if (var4 == 4) {
                    this.field1403 = false;
                }
            }
            if (var3 == 5) {
                this.field1233 = var4;
            }
            if (var3 == 6) {
                this.field1318 = var4;
            }
            if (var3 == 8) {
                this.field1434 = var4;
                this.field1431 = true;
            }
            if (var3 == 9) {
                this.field1500 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method542(int arg0, int arg1) {
        int var3 = 69 / arg0;
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method543(int arg0) {
        if (this.field1306 > 1) {
            --this.field1306;
        }
        if (this.field1229 > 0) {
            --this.field1229;
        }
        if (this.field1453 > 0) {
            this.field1453 -= 2;
        }
        for (int var2 = 0; var2 < 5 && this.method447(this.field1520); ++var2) {
        }
        if (this.field1513) {
            this.method434(8);
            this.method547(-427);
            this.method488((byte) 2);
            Packet var3 = InputTracking.method46(this.field1312);
            if (var3 != null) {
                this.field1442.method228(253, this.field1483);
                this.field1442.method230(var3.field736);
                this.field1442.method237(var3.field735, 0, var3.field736, 568);
                var3.method227((byte) 1);
            }
            ++this.field1227;
            if (this.field1227 > 750) {
                this.method556(19439);
            }
            this.method441(false);
            this.method492(false);
            this.method484(6);
            ++this.field1529;
            if (this.field1330 != 0) {
                this.field1329 += 20;
                if (this.field1329 >= 400) {
                    this.field1330 = 0;
                }
            }
            if (this.field1243 != 0) {
                ++this.field1240;
                if (this.field1240 >= 15) {
                    if (this.field1243 == 2) {
                        this.field1244 = true;
                    }
                    if (this.field1243 == 3) {
                        this.field1431 = true;
                    }
                    this.field1243 = 0;
                }
            }
            if (this.field1459 != 0) {
                ++this.field1569;
                if (super.field27 > this.field1460 + 5 || super.field27 < this.field1460 - 5 || super.field28 > this.field1461 + 5 || super.field28 < this.field1461 - 5) {
                    this.field1437 = true;
                }
                if (super.field26 == 0) {
                    if (this.field1459 == 2) {
                        this.field1244 = true;
                    }
                    if (this.field1459 == 3) {
                        this.field1431 = true;
                    }
                    this.field1459 = 0;
                    if (this.field1437 && this.field1569 >= 5) {
                        this.field1291 = -1;
                        this.method478(false);
                        if (this.field1457 == this.field1291 && this.field1458 != this.field1290) {
                            Component var4 = Component.field80[this.field1457];
                            byte var5 = 0;
                            if (this.field1500 == 1 && var4.field89 == 206) {
                                var5 = 1;
                            }
                            if (var4.field81[this.field1290] <= 0) {
                                var5 = 0;
                            }
                            if (var4.field110) {
                                int var6 = this.field1458;
                                int var7 = this.field1290;
                                var4.field81[var7] = var4.field81[var6];
                                var4.field82[var7] = var4.field82[var6];
                                var4.field81[var6] = -1;
                                var4.field82[var6] = 0;
                            } else if (var5 == 1) {
                                int var8 = this.field1458;
                                int var9 = this.field1290;
                                while (var8 != var9) {
                                    if (var8 > var9) {
                                        var4.method33(var8 - 1, 38132, var8);
                                        --var8;
                                    } else if (var8 < var9) {
                                        var4.method33(var8 + 1, 38132, var8);
                                        ++var8;
                                    }
                                }
                            } else {
                                var4.method33(this.field1290, 38132, this.field1458);
                            }
                            this.field1442.method228(199, this.field1483);
                            this.field1442.method230(this.field1457);
                            this.field1442.method230(this.field1458);
                            this.field1442.method230(this.field1290);
                            this.field1442.method229(var5);
                        }
                    } else if ((this.field1233 == 1 || this.method446(this.field1348 - 1, -581)) && this.field1348 > 2) {
                        this.method544(this.field1314);
                    } else if (this.field1348 > 0) {
                        this.method505(this.field1348 - 1, 3);
                    }
                    this.field1240 = 10;
                    super.field33 = 0;
                }
            }
            ++field1410;
            if (field1410 > 127) {
                field1410 = 0;
                this.field1442.method228(56, this.field1483);
                this.field1442.method232(4991788);
            }
            if (World3D.field349 != -1) {
                int var10 = World3D.field349;
                int var11 = World3D.field350;
                boolean var12 = this.method453(var10, (byte) 5, 0, true, 0, 0, 0, field1597.field477[0], field1597.field478[0], var11, 0, 0);
                World3D.field349 = -1;
                if (var12) {
                    this.field1327 = super.field34;
                    this.field1328 = super.field35;
                    this.field1330 = 1;
                    this.field1329 = 0;
                }
            }
            if (super.field33 == 1 && this.field1451 != null) {
                this.field1451 = null;
                this.field1431 = true;
                super.field33 = 0;
            }
            this.method528(471);
            this.method465(8);
            this.method551(6);
            this.method520((byte) -70);
            if (super.field26 == 1 || super.field33 == 1) {
                ++this.field1305;
            }
            if (this.field1299 == 2) {
                this.method489((byte) -16);
            }
            if (this.field1299 == 2 && this.field1609) {
                this.method471((byte) 37);
            }
            for (int var13 = 0; var13 < 5; ++var13) {
                int var10002 = this.field1612[var13]++;
            }
            this.method483((byte) -5);
            ++super.field25;
            if (super.field25 > 4500) {
                this.field1229 = 250;
                super.field25 -= 500;
                this.field1442.method228(17, this.field1483);
            }
            ++this.field1572;
            if (this.field1572 > 500) {
                this.field1572 = 0;
                int var14 = (int) (Math.random() * 8.0D);
                if ((var14 & 1) == 1) {
                    this.field1538 += this.field1539;
                }
                if ((var14 & 2) == 2) {
                    this.field1260 += this.field1261;
                }
                if ((var14 & 4) == 4) {
                    this.field1640 += this.field1641;
                }
            }
            if (this.field1538 < -50) {
                this.field1539 = 2;
            }
            if (this.field1538 > 50) {
                this.field1539 = -2;
            }
            if (this.field1260 < -55) {
                this.field1261 = 2;
            }
            if (this.field1260 > 55) {
                this.field1261 = -2;
            }
            if (this.field1640 < -40) {
                this.field1641 = 1;
            }
            if (this.field1640 > 40) {
                this.field1641 = -1;
            }
            ++this.field1649;
            if (arg0 < 4 || arg0 > 4) {
                this.method6();
            }
            if (this.field1649 > 500) {
                this.field1649 = 0;
                int var15 = (int) (Math.random() * 8.0D);
                if ((var15 & 1) == 1) {
                    this.field1476 += this.field1477;
                }
                if ((var15 & 2) == 2) {
                    this.field1443 += this.field1444;
                }
            }
            if (this.field1476 < -60) {
                this.field1477 = 2;
            }
            if (this.field1476 > 60) {
                this.field1477 = -2;
            }
            if (this.field1443 < -20) {
                this.field1444 = 1;
            }
            if (this.field1443 > 10) {
                this.field1444 = -1;
            }
            ++field1485;
            if (field1485 > 110) {
                field1485 = 0;
                this.field1442.method228(219, this.field1483);
                this.field1442.method233(0);
            }
            ++this.field1228;
            if (this.field1228 > 50) {
                this.field1442.method228(139, this.field1483);
            }
            try {
                if (this.field1347 != null && this.field1442.field736 > 0) {
                    this.field1347.method42(this.field1442.field735, 0, this.field1442.field736, 225);
                    this.field1442.field736 = 0;
                    this.field1228 = 0;
                }
            } catch (IOException var17) {
                this.method556(19439);
            } catch (Exception var18) {
                this.method469(35249);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method544(byte arg0) {
        int var2 = this.field1535.method216((byte) 7, "Choose Option");
        for (int var3 = 0; var3 < this.field1348; ++var3) {
            int var11 = this.field1535.method216((byte) 7, this.field1386[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 != -15) {
            this.method6();
        }
        int var4 = this.field1348 * 15 + 21;
        if (super.field34 > 4 && super.field35 > 4 && super.field34 < 516 && super.field35 < 338) {
            int var5 = super.field34 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field35 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1642 = true;
            this.field1581 = 0;
            this.field1582 = var5;
            this.field1583 = var6;
            this.field1584 = var2;
            this.field1585 = this.field1348 * 15 + 22;
        }
        if (super.field34 > 553 && super.field35 > 205 && super.field34 < 743 && super.field35 < 466) {
            int var7 = super.field34 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field35 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1642 = true;
            this.field1581 = 1;
            this.field1582 = var7;
            this.field1583 = var8;
            this.field1584 = var2;
            this.field1585 = this.field1348 * 15 + 22;
        }
        if (super.field34 > 17 && super.field35 > 357 && super.field34 < 496 && super.field35 < 453) {
            int var9 = super.field34 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field35 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1642 = true;
            this.field1581 = 2;
            this.field1582 = var9;
            this.field1583 = var10;
            this.field1584 = var2;
            this.field1585 = this.field1348 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method545(boolean arg0, int arg1) {
        this.method432(0);
        this.field1334.method268(0);
        this.field1245.method212(0, this.field1373, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg1 < 0 || arg1 > 0) {
            this.field1664 = 244;
        }
        if (this.field1537 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1533.method215(var3 / 2, 7711145, true, var5, this.field1413.field866, 1);
            int var6 = var4 / 2 - 20;
            this.field1535.method215(var3 / 2, 16776960, true, var6, "Welcome to RuneScape", 1);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1246.method212(var8 - 20, this.field1373, var7 - 73);
            this.field1535.method215(var7, 16777215, true, var8 + 5, "New user", 1);
            int var9 = var3 / 2 + 80;
            this.field1246.method212(var8 - 20, this.field1373, var9 - 73);
            this.field1535.method215(var9, 16777215, true, var8 + 5, "Existing User", 1);
        }
        if (this.field1537 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1432.length() > 0) {
                this.field1535.method215(var3 / 2, 16776960, true, var10 - 15, this.field1432, 1);
                this.field1535.method215(var3 / 2, 16776960, true, var10, this.field1433, 1);
                var10 += 30;
            } else {
                this.field1535.method215(var3 / 2, 16776960, true, var10 - 7, this.field1433, 1);
                var10 += 30;
            }
            this.field1535.method219("Username: " + this.field1277 + (this.field1560 == 0 & field1247 % 40 < 20 ? "@yel@|" : ""), var10, var3 / 2 - 90, 16777215, 2, true);
            var10 += 15;
            this.field1535.method219("Password: " + JString.method316(this.field1278, 0) + (this.field1560 == 1 & field1247 % 40 < 20 ? "@yel@|" : ""), var10, var3 / 2 - 88, 16777215, 2, true);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1246.method212(var12 - 20, this.field1373, var11 - 73);
                this.field1535.method215(var11, 16777215, true, var12 + 5, "Login", 1);
                int var13 = var3 / 2 + 80;
                this.field1246.method212(var12 - 20, this.field1373, var13 - 73);
                this.field1535.method215(var13, 16777215, true, var12 + 5, "Cancel", 1);
            }
        }
        if (this.field1537 == 3) {
            this.field1535.method215(var3 / 2, 16776960, true, var4 / 2 - 60, "Create a free account", 1);
            int var14 = var4 / 2 - 35;
            this.field1535.method215(var3 / 2, 16777215, true, var14, "To create a new account you need to", 1);
            int var18 = var14 + 15;
            this.field1535.method215(var3 / 2, 16777215, true, var18, "go back to the main RuneScape webpage", 1);
            int var19 = var18 + 15;
            this.field1535.method215(var3 / 2, 16777215, true, var19, "and choose the red 'create account'", 1);
            int var20 = var19 + 15;
            this.field1535.method215(var3 / 2, 16777215, true, var20, "button at the top right of that page.", 1);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1246.method212(var16 - 20, this.field1373, var15 - 73);
            this.field1535.method215(var15, 16777215, true, var16 + 5, "Cancel", 1);
        }
        this.field1334.method269(202, super.field19, 171, this.field1664);
        if (this.field1650) {
            this.field1650 = false;
            this.field1332.method269(128, super.field19, 0, this.field1664);
            this.field1333.method269(202, super.field19, 371, this.field1664);
            this.field1337.method269(0, super.field19, 265, this.field1664);
            this.field1338.method269(562, super.field19, 265, this.field1664);
            this.field1339.method269(128, super.field19, 171, this.field1664);
            this.field1340.method269(562, super.field19, 171, this.field1664);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method546(int arg0, int arg1) {
        if (arg1 != 9) {
            throw new NullPointerException();
        } else {
            return arg0 < 999999999 ? String.valueOf(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    private final void method547(int arg0) {
        if (arg0 >= 0) {
            this.field1596 = !this.field1596;
        }
        if (this.field1299 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1304.method258(); var2 != null; var2 = (LocSpawned) this.field1304.method260(17736)) {
                if (var2.field765 > 0) {
                    --var2.field765;
                }
                if (var2.field765 == 0) {
                    if (var2.field758 < 0 || World.method30((byte) 83, var2.field758, var2.field760)) {
                        this.method477(var2.field758, var2.field760, (byte) 5, var2.field757, var2.field754, var2.field759, var2.field755, var2.field756);
                        var2.method120();
                    }
                } else {
                    if (var2.field764 > 0) {
                        --var2.field764;
                    }
                    if (var2.field764 == 0 && var2.field756 >= 1 && var2.field757 >= 1 && var2.field756 <= 102 && var2.field757 <= 102 && (var2.field761 < 0 || World.method30((byte) 83, var2.field761, var2.field763))) {
                        this.method477(var2.field761, var2.field763, (byte) 5, var2.field757, var2.field754, var2.field762, var2.field755, var2.field756);
                        var2.field764 = -1;
                        if (var2.field761 == var2.field758 && var2.field758 == -1) {
                            var2.method120();
                        } else if (var2.field761 == var2.field758 && var2.field762 == var2.field759 && var2.field763 == var2.field760) {
                            var2.method120();
                        }
                    }
                }
            }
            ++field1478;
            if (field1478 > 85) {
                field1478 = 0;
                this.field1442.method228(211, this.field1483);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method548(byte arg0) {
        this.field1591.method268(0);
        int var2 = this.field1476 + this.field1405 & 2047;
        int var3 = field1597.field428 / 32 + 48;
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field1483 = 447;
        }
        int var5 = 464 - field1597.field429 / 32;
        this.field1258.method203(5, var3, this.field1450, this.field1608, 151, 146, var5, var2, 25, this.field1443 + 256, this.field1614);
        this.field1420.method203(0, 25, this.field1555, this.field1608, 33, 33, 25, this.field1405, 0, 256, this.field1512);
        for (int var6 = 0; var6 < this.field1526; ++var6) {
            int var34 = this.field1527[var6] * 4 + 2 - field1597.field428 / 32;
            int var35 = this.field1528[var6] * 4 + 2 - field1597.field429 / 32;
            this.method514(var35, var34, 4, this.field1654[var6]);
        }
        for (int var7 = 0; var7 < 104; ++var7) {
            for (int var30 = 0; var30 < 104; ++var30) {
                LinkList var31 = this.field1472[this.field1268][var7][var30];
                if (var31 != null) {
                    int var32 = var7 * 4 + 2 - field1597.field428 / 32;
                    int var33 = var30 * 4 + 2 - field1597.field429 / 32;
                    this.method514(var33, var32, 4, this.field1422);
                }
            }
        }
        for (int var8 = 0; var8 < this.field1498; ++var8) {
            NpcEntity var27 = this.field1497[this.field1499[var8]];
            if (var27 != null && var27.method127(-42790) && var27.field484.field1035) {
                int var28 = var27.field428 / 32 - field1597.field428 / 32;
                int var29 = var27.field429 / 32 - field1597.field429 / 32;
                this.method514(var29, var28, 4, this.field1423);
            }
        }
        for (int var9 = 0; var9 < this.field1364; ++var9) {
            PlayerEntity var20 = this.field1363[this.field1365[var9]];
            if (var20 != null && var20.method127(-42790)) {
                int var21 = var20.field428 / 32 - field1597.field428 / 32;
                int var22 = var20.field429 / 32 - field1597.field429 / 32;
                boolean var23 = false;
                long var24 = JString.method310(var20.field488);
                for (int var26 = 0; var26 < this.field1638; ++var26) {
                    if (this.field1505[var26] == var24 && this.field1471[var26] != 0) {
                        var23 = true;
                        break;
                    }
                }
                if (var23) {
                    this.method514(var22, var21, 4, this.field1425);
                } else {
                    this.method514(var22, var21, 4, this.field1424);
                }
            }
        }
        if (this.field1475 != 0 && field1247 % 20 < 10) {
            if (this.field1475 == 1 && this.field1427 >= 0 && this.field1427 < this.field1497.length) {
                NpcEntity var10 = this.field1497[this.field1427];
                if (var10 != null) {
                    int var11 = var10.field428 / 32 - field1597.field428 / 32;
                    int var12 = var10.field429 / 32 - field1597.field429 / 32;
                    this.method522(this.field1507, var11, 8, var12);
                }
            }
            if (this.field1475 == 2) {
                int var13 = (this.field1392 - this.field1514) * 4 + 2 - field1597.field428 / 32;
                int var14 = (this.field1393 - this.field1515) * 4 + 2 - field1597.field429 / 32;
                this.method522(this.field1507, var13, 8, var14);
            }
            if (this.field1475 == 10 && this.field1449 >= 0 && this.field1449 < this.field1363.length) {
                PlayerEntity var15 = this.field1363[this.field1449];
                if (var15 != null) {
                    int var16 = var15.field428 / 32 - field1597.field428 / 32;
                    int var17 = var15.field429 / 32 - field1597.field429 / 32;
                    this.method522(this.field1507, var16, 8, var17);
                }
            }
        }
        if (this.field1256 != 0) {
            int var18 = this.field1256 * 4 + 2 - field1597.field428 / 32;
            int var19 = this.field1257 * 4 + 2 - field1597.field429 / 32;
            this.method514(var19, var18, 4, this.field1506);
        }
        Pix2D.method170(78, 97, 16777215, 3, (byte) 51, 3);
        this.field1592.method268(0);
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public void method549(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1606);
        if (this.field1413 != null) {
            System.out.println("Od-cycle:" + this.field1413.field880);
        }
        System.out.println("loop-cycle:" + field1247);
        System.out.println("draw-cycle:" + field1488);
        System.out.println("ptype:" + this.field1226);
        if (this.field1594 != arg0) {
            this.field1226 = -1;
        }
        System.out.println("psize:" + this.field1225);
        if (this.field1347 != null) {
            this.field1347.method43(28009);
        }
        super.field16 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public final java.awt.Component method11(boolean arg0) {
        if (arg0) {
            this.field1589 = -206;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field22 != null ? super.field22 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field1611 && !this.field1376 && !this.field1657) {
            ++field1247;
            if (arg0) {
                this.field1472 = null;
            }
            if (!this.field1513) {
                this.method458(0);
            } else {
                this.method543(4);
            }
            this.method521((byte) 2);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method550(byte arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1542 = 0;
        for (int var3 = -1; var3 < this.field1498 + this.field1364; ++var3) {
            PathingEntity var18;
            if (var3 == -1) {
                var18 = field1597;
            } else if (var3 < this.field1364) {
                var18 = this.field1363[this.field1365[var3]];
            } else {
                var18 = this.field1497[this.field1499[var3 - this.field1364]];
            }
            if (var18 != null && var18.method127(-42790)) {
                if (var3 >= this.field1364) {
                    NpcType var22 = ((NpcEntity) var18).field484;
                    if (var22.field1042 >= 0 && var22.field1042 < this.field1280.length) {
                        this.method475(var18.field474 + 15, this.field1626, var18);
                        if (this.field1302 > -1) {
                            this.field1280[var22.field1042].method199(this.field1303 - 30, this.field1373, this.field1302 - 12);
                        }
                    }
                    if (this.field1475 == 1 && this.field1499[var3 - this.field1364] == this.field1427 && field1247 % 20 < 10) {
                        this.method475(var18.field474 + 15, this.field1626, var18);
                        if (this.field1302 > -1) {
                            this.field1280[2].method199(this.field1303 - 28, this.field1373, this.field1302 - 12);
                        }
                    }
                } else {
                    int var19 = 30;
                    PlayerEntity var20 = (PlayerEntity) var18;
                    if (var20.field491 != 0) {
                        this.method475(var18.field474 + 15, this.field1626, var18);
                        if (this.field1302 > -1) {
                            for (int var21 = 0; var21 < 8; ++var21) {
                                if ((var20.field491 & 1 << var21) != 0) {
                                    this.field1280[var21].method199(this.field1303 - var19, this.field1373, this.field1302 - 12);
                                    var19 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field1475 == 10 && this.field1365[var3] == this.field1449) {
                        this.method475(var18.field474 + 15, this.field1626, var18);
                        if (this.field1302 > -1) {
                            this.field1280[7].method199(this.field1303 - var19, this.field1373, this.field1302 - 12);
                        }
                    }
                }
                if (var18.field440 != null && (var3 >= this.field1364 || this.field1448 == 0 || this.field1448 == 3 || this.field1448 == 1 && this.method480(((PlayerEntity) var18).field488, 0))) {
                    this.method475(var18.field474, this.field1626, var18);
                    if (this.field1302 > -1 && this.field1542 < this.field1543) {
                        this.field1547[this.field1542] = this.field1535.method216((byte) 7, var18.field440) / 2;
                        this.field1546[this.field1542] = this.field1535.field719;
                        this.field1544[this.field1542] = this.field1302;
                        this.field1545[this.field1542] = this.field1303;
                        this.field1548[this.field1542] = var18.field442;
                        this.field1549[this.field1542] = var18.field443;
                        this.field1550[this.field1542] = var18.field441;
                        this.field1551[this.field1542++] = var18.field440;
                        if (this.field1318 == 0 && var18.field443 == 1) {
                            this.field1546[this.field1542] += 10;
                            this.field1545[this.field1542] += 5;
                        }
                        if (this.field1318 == 0 && var18.field443 == 2) {
                            this.field1547[this.field1542] = 60;
                        }
                    }
                }
                if (var18.field447 > field1247) {
                    this.method475(var18.field474 + 15, this.field1626, var18);
                    if (this.field1302 > -1) {
                        int var23 = var18.field448 * 30 / var18.field449;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        Pix2D.method170(this.field1303 - 3, this.field1302 - 15, 65280, var23, (byte) 51, 5);
                        Pix2D.method170(this.field1303 - 3, this.field1302 - 15 + var23, 16711680, 30 - var23, (byte) 51, 5);
                    }
                }
                for (int var24 = 0; var24 < 4; ++var24) {
                    if (var18.field446[var24] > field1247) {
                        this.method475(var18.field474 / 2, this.field1626, var18);
                        if (this.field1302 > -1) {
                            if (var24 == 1) {
                                this.field1303 -= 20;
                            }
                            if (var24 == 2) {
                                this.field1302 -= 15;
                                this.field1303 -= 10;
                            }
                            if (var24 == 3) {
                                this.field1302 += 15;
                                this.field1303 -= 10;
                            }
                            this.field1387[var18.field445[var24]].method199(this.field1303 - 12, this.field1373, this.field1302 - 12);
                            this.field1533.method214(0, String.valueOf(var18.field444[var24]), 673, this.field1303 + 4, this.field1302);
                            this.field1533.method214(16777215, String.valueOf(var18.field444[var24]), 673, this.field1303 + 3, this.field1302 - 1);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field1542; ++var4) {
            int var5 = this.field1544[var4];
            int var6 = this.field1545[var4];
            int var7 = this.field1547[var4];
            int var8 = this.field1546[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var17 = 0; var17 < var4; ++var17) {
                    if (var6 + 2 > this.field1545[var17] - this.field1546[var17] && var6 - var8 < this.field1545[var17] + 2 && var5 - var7 < this.field1547[var17] + this.field1544[var17] && var5 + var7 > this.field1544[var17] - this.field1547[var17] && this.field1545[var17] - this.field1546[var17] < var6) {
                        var6 = this.field1545[var17] - this.field1546[var17];
                        var9 = true;
                    }
                }
            }
            this.field1302 = this.field1544[var4];
            this.field1303 = this.field1545[var4] = var6;
            String var10 = this.field1551[var4];
            if (this.field1318 == 0) {
                int var11 = 16776960;
                if (this.field1548[var4] < 6) {
                    var11 = this.field1388[this.field1548[var4]];
                }
                if (this.field1548[var4] == 6) {
                    var11 = this.field1556 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1548[var4] == 7) {
                    var11 = this.field1556 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1548[var4] == 8) {
                    var11 = this.field1556 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1548[var4] == 9) {
                    int var12 = 150 - this.field1550[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1548[var4] == 10) {
                    int var13 = 150 - this.field1550[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1548[var4] == 11) {
                    int var14 = 150 - this.field1550[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1549[var4] == 0) {
                    this.field1535.method214(0, var10, 673, this.field1303 + 1, this.field1302);
                    this.field1535.method214(var11, var10, 673, this.field1303, this.field1302);
                }
                if (this.field1549[var4] == 1) {
                    this.field1535.method218(this.field1302, this.field1303 + 1, (byte) -75, 0, this.field1556, var10);
                    this.field1535.method218(this.field1302, this.field1303, (byte) -75, var11, this.field1556, var10);
                }
                if (this.field1549[var4] == 2) {
                    int var15 = this.field1535.method216((byte) 7, var10);
                    int var16 = (150 - this.field1550[var4]) * (var15 + 100) / 150;
                    Pix2D.method167(true, this.field1302 + 50, this.field1302 - 50, 0, 334);
                    this.field1535.method217(this.field1302 + 50 - var16, var10, this.field1303 + 1, 0, 0);
                    this.field1535.method217(this.field1302 + 50 - var16, var10, this.field1303, var11, 0);
                    Pix2D.method166(0);
                }
            } else {
                this.field1535.method214(0, var10, 673, this.field1303 + 1, this.field1302);
                this.field1535.method214(16776960, var10, 673, this.field1303, this.field1302);
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method551(int arg0) {
        if (arg0 < this.field1521 || arg0 > this.field1521) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field33 == 1) {
            if (super.field34 >= 539 && super.field34 <= 573 && super.field35 >= 169 && super.field35 < 205 && this.field1625[0] != -1) {
                this.field1244 = true;
                this.field1230 = 0;
                this.field1552 = true;
            }
            if (super.field34 >= 569 && super.field34 <= 599 && super.field35 >= 168 && super.field35 < 205 && this.field1625[1] != -1) {
                this.field1244 = true;
                this.field1230 = 1;
                this.field1552 = true;
            }
            if (super.field34 >= 597 && super.field34 <= 627 && super.field35 >= 168 && super.field35 < 205 && this.field1625[2] != -1) {
                this.field1244 = true;
                this.field1230 = 2;
                this.field1552 = true;
            }
            if (super.field34 >= 625 && super.field34 <= 669 && super.field35 >= 168 && super.field35 < 203 && this.field1625[3] != -1) {
                this.field1244 = true;
                this.field1230 = 3;
                this.field1552 = true;
            }
            if (super.field34 >= 666 && super.field34 <= 696 && super.field35 >= 168 && super.field35 < 205 && this.field1625[4] != -1) {
                this.field1244 = true;
                this.field1230 = 4;
                this.field1552 = true;
            }
            if (super.field34 >= 694 && super.field34 <= 724 && super.field35 >= 168 && super.field35 < 205 && this.field1625[5] != -1) {
                this.field1244 = true;
                this.field1230 = 5;
                this.field1552 = true;
            }
            if (super.field34 >= 722 && super.field34 <= 756 && super.field35 >= 169 && super.field35 < 205 && this.field1625[6] != -1) {
                this.field1244 = true;
                this.field1230 = 6;
                this.field1552 = true;
            }
            if (super.field34 >= 540 && super.field34 <= 574 && super.field35 >= 466 && super.field35 < 502 && this.field1625[7] != -1) {
                this.field1244 = true;
                this.field1230 = 7;
                this.field1552 = true;
            }
            if (super.field34 >= 572 && super.field34 <= 602 && super.field35 >= 466 && super.field35 < 503 && this.field1625[8] != -1) {
                this.field1244 = true;
                this.field1230 = 8;
                this.field1552 = true;
            }
            if (super.field34 >= 599 && super.field34 <= 629 && super.field35 >= 466 && super.field35 < 503 && this.field1625[9] != -1) {
                this.field1244 = true;
                this.field1230 = 9;
                this.field1552 = true;
            }
            if (super.field34 >= 627 && super.field34 <= 671 && super.field35 >= 467 && super.field35 < 502 && this.field1625[10] != -1) {
                this.field1244 = true;
                this.field1230 = 10;
                this.field1552 = true;
            }
            if (super.field34 >= 669 && super.field34 <= 699 && super.field35 >= 466 && super.field35 < 503 && this.field1625[11] != -1) {
                this.field1244 = true;
                this.field1230 = 11;
                this.field1552 = true;
            }
            if (super.field34 >= 696 && super.field34 <= 726 && super.field35 >= 466 && super.field35 < 503 && this.field1625[12] != -1) {
                this.field1244 = true;
                this.field1230 = 12;
                this.field1552 = true;
            }
            if (super.field34 >= 724 && super.field34 <= 758 && super.field35 >= 466 && super.field35 < 502 && this.field1625[13] != -1) {
                this.field1244 = true;
                this.field1230 = 13;
                this.field1552 = true;
            }
            ++field1320;
            if (field1320 > 150) {
                field1320 = 0;
                this.field1442.method228(16, this.field1483);
                this.field1442.method229(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1660[var5] != null) {
                    int var6 = this.field1658[var5];
                    int var7 = 70 - var4 * 14 + this.field1466 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field1659[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1448 == 0 || this.field1448 == 1 && this.method480(var8, 0))) {
                        if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field1597.field488)) {
                            if (this.field1341 >= 1) {
                                this.field1386[this.field1348] = "Report abuse @whi@" + var8;
                                this.field1493[this.field1348] = 34;
                                ++this.field1348;
                            }
                            this.field1386[this.field1348] = "Add ignore @whi@" + var8;
                            this.field1493[this.field1348] = 436;
                            ++this.field1348;
                            this.field1386[this.field1348] = "Add friend @whi@" + var8;
                            this.field1493[this.field1348] = 406;
                            ++this.field1348;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1434 == 0 && (var6 == 7 || this.field1502 == 0 || this.field1502 == 1 && this.method480(var8, 0))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            if (this.field1341 >= 1) {
                                this.field1386[this.field1348] = "Report abuse @whi@" + var8;
                                this.field1493[this.field1348] = 34;
                                ++this.field1348;
                            }
                            this.field1386[this.field1348] = "Add ignore @whi@" + var8;
                            this.field1493[this.field1348] = 436;
                            ++this.field1348;
                            this.field1386[this.field1348] = "Add friend @whi@" + var8;
                            this.field1493[this.field1348] = 406;
                            ++this.field1348;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field1598 == 0 || this.field1598 == 1 && this.method480(var8, 0))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field1386[this.field1348] = "Accept trade @whi@" + var8;
                            this.field1493[this.field1348] = 903;
                            ++this.field1348;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1434 == 0 && this.field1502 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field1598 == 0 || this.field1598 == 1 && this.method480(var8, 0))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field1386[this.field1348] = "Accept duel @whi@" + var8;
                            this.field1493[this.field1348] = 363;
                            ++this.field1348;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;I)V")
    public final void method553(Pix8 arg0, int arg1) {
        short var3 = 256;
        if (arg1 >= 0 && arg1 <= 0) {
            for (int var4 = 0; var4 < this.field1479.length; ++var4) {
                this.field1479[var4] = 0;
            }
            for (int var5 = 0; var5 < 5000; ++var5) {
                int var17 = (int) (Math.random() * 128.0D * (double) var3);
                this.field1479[var17] = (int) (Math.random() * 256.0D);
            }
            for (int var6 = 0; var6 < 20; ++var6) {
                for (int var13 = 1; var13 < var3 - 1; ++var13) {
                    for (int var15 = 1; var15 < 127; ++var15) {
                        int var16 = (var13 << 7) + var15;
                        this.field1480[var16] = (this.field1479[var16 - 1] + this.field1479[var16 + 1] + this.field1479[var16 - 128] + this.field1479[var16 + 128]) / 4;
                    }
                }
                int[] var14 = this.field1479;
                this.field1479 = this.field1480;
                this.field1480 = var14;
            }
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field703; ++var8) {
                    for (int var9 = 0; var9 < arg0.field702; ++var9) {
                        if (arg0.field700[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field704;
                            int var11 = var8 + 16 + arg0.field705;
                            int var12 = (var11 << 7) + var10;
                            this.field1479[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 252);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1377 = Integer.parseInt(arg0[0]);
                field1378 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method524(-502);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method451((byte) 4);
                }
                if (arg0[3].equals("free")) {
                    field1379 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1379 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(503, 0, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)Ljava/lang/String;")
    public final String method554(int arg0) {
        if (arg0 != 46264) {
            this.field1594 = 240;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field22 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;BI)V")
    private final void method555(Packet arg0, byte arg1, int arg2) {
        while (true) {
            if (arg0.field737 + 10 < arg2 * 8) {
                int var4 = arg0.method250(false, 11);
                if (var4 != 2047) {
                    if (this.field1363[var4] == null) {
                        this.field1363[var4] = new PlayerEntity();
                        if (this.field1368[var4] != null) {
                            this.field1363[var4].method130(this.field1368[var4], 0);
                        }
                    }
                    this.field1365[this.field1364++] = var4;
                    PlayerEntity var5 = this.field1363[var4];
                    var5.field473 = field1247;
                    int var6 = arg0.method250(false, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method250(false, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method250(false, 1);
                    var5.method124(var8 == 1, (byte) 126, field1597.field478[0] + var7, field1597.field477[0] + var6);
                    int var9 = arg0.method250(false, 1);
                    if (var9 == 1) {
                        this.field1367[this.field1366++] = var4;
                    }
                    continue;
                }
            }
            arg0.method251(1);
            if (arg1 == 4) {
                boolean var10 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method556(int arg0) {
        if (this.field1229 > 0) {
            this.method469(35249);
        } else {
            this.field1592.method268(0);
            if (arg0 != 19439) {
                this.field1226 = -1;
            }
            this.field1534.method214(0, "Connection lost", 673, 144, 257);
            this.field1534.method214(16777215, "Connection lost", 673, 143, 256);
            this.field1534.method214(0, "Please wait - attempting to reestablish", 673, 159, 257);
            this.field1534.method214(16777215, "Please wait - attempting to reestablish", 673, 158, 256);
            this.field1592.method269(4, super.field19, 4, this.field1664);
            this.field1256 = 0;
            ClientStream var2 = this.field1347;
            this.field1513 = false;
            this.method509(this.field1277, this.field1278, true);
            if (!this.field1513) {
                this.method469(35249);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI[B)Z")
    public final boolean method557(byte arg0, int arg1, byte[] arg2) {
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIII)V")
    public final void method558(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1508.method212(arg1, this.field1373, arg3);
        if (arg0) {
            this.field1442.method229(241);
        }
        this.field1509.method212(arg1 + arg2 - 16, this.field1373, arg3);
        Pix2D.method170(arg1 + 16, arg3, this.field1686, 16, (byte) 51, arg2 - 32);
        int var7 = (arg2 - 32) * arg2 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg4 / (arg5 - arg2);
        Pix2D.method170(arg1 + 16 + var8, arg3, this.field1554, 16, (byte) 51, var7);
        Pix2D.method175(var7, this.field1416, (byte) -119, arg1 + 16 + var8, arg3);
        Pix2D.method175(var7, this.field1416, (byte) -119, arg1 + 16 + var8, arg3 + 1);
        Pix2D.method173(this.field1281, this.field1416, arg3, 16, arg1 + 16 + var8);
        Pix2D.method173(this.field1281, this.field1416, arg3, 16, arg1 + 17 + var8);
        Pix2D.method175(var7, this.field1440, (byte) -119, arg1 + 16 + var8, arg3 + 15);
        Pix2D.method175(var7 - 1, this.field1440, (byte) -119, arg1 + 17 + var8, arg3 + 14);
        Pix2D.method173(this.field1281, this.field1440, arg3, 16, arg1 + 15 + var8 + var7);
        Pix2D.method173(this.field1281, this.field1440, arg3 + 1, 15, arg1 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method559(boolean arg0) {
        if (arg0) {
            this.field1608 = !this.field1608;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method560(int arg0) {
        this.field1245 = new Pix8(this.field1635, "titlebox", 0);
        this.field1246 = new Pix8(this.field1635, "titlebutton", 0);
        this.field1524 = new Pix8[12];
        if (arg0 <= 0) {
            this.field1286 = !this.field1286;
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1524[var2] = new Pix8(this.field1635, "runes", var2);
        }
        this.field1429 = new Pix32(128, 265);
        this.field1430 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1429.field688[var3] = this.field1335.field781[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1430.field688[var4] = this.field1336.field781[var4];
        }
        this.field1682 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1682[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1682[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1682[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1682[var8 + 192] = 16777215;
        }
        this.field1683 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1683[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1683[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1683[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1683[var12 + 192] = 16777215;
        }
        this.field1684 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1684[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1684[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1684[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1684[var16 + 192] = 16777215;
        }
        this.field1681 = new int[256];
        this.field1479 = new int[32768];
        this.field1480 = new int[32768];
        this.method553((Pix8) null, 0);
        this.field1223 = new int[32768];
        this.field1224 = new int[32768];
        this.method13(8, "Connecting to fileserver", 10);
        if (!this.field1248) {
            this.field1414 = true;
            this.field1248 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method561(int arg0) {
        if (arg0 != 11220) {
            this.field1226 = -1;
        }
        if (this.field1475 == 2) {
            this.method476(this.field1394 * 2, 29445, (this.field1392 - this.field1514 << 7) + this.field1395, (this.field1393 - this.field1515 << 7) + this.field1396);
            if (this.field1302 > -1 && field1247 % 20 < 10) {
                this.field1280[2].method199(this.field1303 - 28, this.field1373, this.field1302 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method562(int arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1366; ++var4) {
            int var5 = this.field1367[var4];
            NpcEntity var6 = this.field1497[var5];
            int var7 = arg1.method239();
            if ((var7 & 1) == 1) {
                int var8 = arg1.method239();
                int var9 = arg1.method239();
                var6.method128(var9, -489, var8);
                var6.field447 = field1247 + 300;
                var6.field448 = arg1.method239();
                var6.field449 = arg1.method239();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg1.method241();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field456 == var10) {
                    var6.field460 = 0;
                }
                int var11 = arg1.method239();
                if (var6.field456 == var10 && var10 != -1) {
                    int var12 = SeqType.field1149[var10].field1163;
                    if (var12 == 1) {
                        var6.field457 = 0;
                        var6.field458 = 0;
                        var6.field459 = var11;
                        var6.field460 = 0;
                    }
                    if (var12 == 2) {
                        var6.field460 = 0;
                    }
                } else if (var10 == -1 || var6.field456 == -1 || SeqType.field1149[var10].field1157 >= SeqType.field1149[var6.field456].field1157) {
                    var6.field456 = var10;
                    var6.field457 = 0;
                    var6.field458 = 0;
                    var6.field459 = var11;
                    var6.field460 = 0;
                    var6.field481 = var6.field476;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field450 = arg1.method241();
                if (var6.field450 == 65535) {
                    var6.field450 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field440 = arg1.method246();
                var6.field441 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg1.method239();
                int var14 = arg1.method239();
                var6.method128(var14, -489, var13);
                var6.field447 = field1247 + 300;
                var6.field448 = arg1.method239();
                var6.field449 = arg1.method239();
            }
            if ((var7 & 32) == 32) {
                var6.field484 = NpcType.method344(arg1.method241());
                var6.field432 = var6.field484.field1021;
                var6.field435 = var6.field484.field1025;
                var6.field436 = var6.field484.field1026;
                var6.field437 = var6.field484.field1027;
                var6.field438 = var6.field484.field1028;
                var6.field433 = var6.field484.field1024;
            }
            if ((var7 & 64) == 64) {
                var6.field461 = arg1.method241();
                int var15 = arg1.method244();
                var6.field465 = var15 >> 16;
                var6.field464 = (var15 & 65535) + field1247;
                var6.field462 = 0;
                var6.field463 = 0;
                if (var6.field464 > field1247) {
                    var6.field462 = -1;
                }
                if (var6.field461 == 65535) {
                    var6.field461 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field451 = arg1.method241();
                var6.field452 = arg1.method241();
            }
        }
        if (arg2 >= 0) {
            ;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1504[var1] = var0 - 1;
            var0 += var0;
        }
        field1531 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1559 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1559[var3] = var2 / 4;
        }
        field1587 = true;
        field1621 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1661 = 5100;
        field1673 = true;
    }
}
