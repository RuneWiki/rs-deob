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

    @OriginalMember(owner = "client", name = "K", descriptor = "Ljava/lang/String;")
    private String field1235 = "";

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    public int[] field1249 = new int[2000];

    @OriginalMember(owner = "client", name = "Z", descriptor = "Z")
    private boolean field1250 = true;

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Z")
    private boolean field1252 = true;

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1254 = new int[151];

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1257 = -1;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Z")
    private boolean field1258 = true;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field1266 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lob;")
    private LinkList field1267 = new LinkList(field1482);

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1269 = -292;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1271 = 1;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/String;")
    private String field1272 = "";

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1277 = -1;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field1286 = false;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Llb;")
    private Packet field1287 = Packet.method217(0, 1);

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1288 = 3;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1290 = new int[50];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private boolean field1291 = false;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Ljava/lang/String;")
    private String field1292 = "";

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Ljava/lang/String;")
    private String field1293 = "";

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private int[] field1294 = new int[5];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Z")
    private boolean field1301 = false;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1303 = 2048;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1304 = 2047;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[Lab;")
    private PlayerEntity[] field1305 = new PlayerEntity[this.field1303];

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    public int[] field1307 = new int[this.field1303];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1309 = new int[this.field1303];

    @OriginalMember(owner = "client", name = "hc", descriptor = "[Llb;")
    private Packet[] field1310 = new Packet[this.field1303];

    @OriginalMember(owner = "client", name = "ic", descriptor = "[I")
    private int[] field1311 = new int[33];

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1316 = 9;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[[I")
    private int[][] field1317 = new int[104][104];

    @OriginalMember(owner = "client", name = "sc", descriptor = "[Lib;")
    private Pix32[] field1321 = new Pix32[100];

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1324 = 2;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1325 = -1;

    @OriginalMember(owner = "client", name = "xc", descriptor = "[I")
    private int[] field1326 = new int[2000];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1327 = -1;

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    private int[] field1328 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1333 = -1;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1334 = -1;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    public int[] field1336 = new int[1000];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1337 = 9;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1339 = -1;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Llb;")
    private Packet field1340 = Packet.method217(0, 1);

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1346 = -1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1347 = -484;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Z")
    private boolean field1349 = false;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1350 = new CRC32();

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field1351 = new int[100];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[Ljava/lang/String;")
    private String[] field1352 = new String[100];

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[Ljava/lang/String;")
    private String[] field1353 = new String[100];

    @OriginalMember(owner = "client", name = "bd", descriptor = "Ljava/lang/String;")
    private String field1356 = "";

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field1357 = false;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1359 = 128;

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field1363 = false;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1365 = 2;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1366 = new int[256];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    private int[] field1373 = new int[50];

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[Ljava/lang/String;")
    private String[] field1381 = new String[200];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "B")
    private byte field1388 = 6;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[Ljb;")
    private Pix8[] field1391 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field1394 = false;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Z")
    private boolean field1395 = false;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field1398 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field1399 = new int[500];

    @OriginalMember(owner = "client", name = "Td", descriptor = "[I")
    private int[] field1400 = new int[500];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field1401 = new int[500];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field1402 = new int[500];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Llb;")
    private Packet field1404 = Packet.method217(0, 1);

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1415 = 47587;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1419 = -1;

    @OriginalMember(owner = "client", name = "ne", descriptor = "[B")
    private byte[] field1420 = new byte[16384];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1421 = 595;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Z")
    private boolean field1422 = false;

    @OriginalMember(owner = "client", name = "re", descriptor = "B")
    private byte field1424 = 47;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private final int field1425 = 100;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1426 = new int[100];

    @OriginalMember(owner = "client", name = "xe", descriptor = "Ljava/lang/String;")
    private String field1430 = "";

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field1439 = new int[9];

    @OriginalMember(owner = "client", name = "He", descriptor = "B")
    private byte field1440 = 39;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field1441 = false;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1449 = -1;

    @OriginalMember(owner = "client", name = "Se", descriptor = "B")
    private byte field1451 = 42;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[J")
    private long[] field1453 = new long[100];

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1457 = 3353893;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1462 = 2;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    private boolean field1463 = false;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1464 = 225;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field1465 = false;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field1466 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1467 = 78;

    @OriginalMember(owner = "client", name = "kf", descriptor = "B")
    private byte field1468 = 34;

    @OriginalMember(owner = "client", name = "pf", descriptor = "[[[Lob;")
    private LinkList[][][] field1473 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[[[I")
    private int[][][] field1484 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Z")
    private boolean field1486 = true;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1488 = new int[5];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1490 = -114;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1495 = new int[4000];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1496 = new int[4000];

    @OriginalMember(owner = "client", name = "Of", descriptor = "B")
    private byte field1498 = 4;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "B")
    private byte field1499 = 64;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[[I")
    private int[][] field1501 = new int[104][104];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field1503 = new int[Stats.field1172];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private boolean field1512 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1514 = -1;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field1516 = false;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Ljava/lang/String;")
    private String field1518 = "";

    @OriginalMember(owner = "client", name = "jg", descriptor = "Ljava/lang/String;")
    private String field1519 = "";

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private boolean field1523 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1536 = 315;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field1538 = new int[1000];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field1539 = new int[1000];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1545 = 5063219;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "B")
    private byte field1546 = -114;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field1547 = new int[33];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Z")
    private boolean field1548 = true;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1549 = 4;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1550 = new int[5];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1553 = 50;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field1554 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field1555 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field1556 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field1557 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1558 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field1559 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    private int[] field1560 = new int[this.field1553];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[Ljava/lang/String;")
    private String[] field1561 = new String[this.field1553];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1562 = new int[50];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[Ljava/lang/String;")
    private String[] field1563 = new String[5];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[Z")
    private boolean[] field1564 = new boolean[5];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[Lib;")
    private Pix32[] field1566 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    public boolean field1572 = true;

    @OriginalMember(owner = "client", name = "lh", descriptor = "[Lvb;")
    public FileStream[] field1573 = new FileStream[5];

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private boolean field1575 = false;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[Ljb;")
    private Pix8[] field1576 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ph", descriptor = "[Ljb;")
    private Pix8[] field1577 = new Pix8[100];

    @OriginalMember(owner = "client", name = "sh", descriptor = "B")
    private byte field1580 = 7;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[Lib;")
    private Pix32[] field1586 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1589 = 977;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1590 = new int[151];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field1594 = new int[Stats.field1172];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[Lib;")
    private Pix32[] field1595 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "B")
    private byte field1600 = 85;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "B")
    private byte field1611 = 85;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1612 = -1;

    @OriginalMember(owner = "client", name = "ai", descriptor = "[[I")
    private int[][] field1614 = new int[104][104];

    @OriginalMember(owner = "client", name = "bi", descriptor = "Ljava/lang/String;")
    private String field1615 = "";

    @OriginalMember(owner = "client", name = "ci", descriptor = "[J")
    private long[] field1616 = new long[200];

    @OriginalMember(owner = "client", name = "di", descriptor = "Z")
    private boolean field1617 = false;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1618 = false;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field1619 = false;

    @OriginalMember(owner = "client", name = "hi", descriptor = "B")
    private byte field1621 = 3;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1623 = 9;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Z")
    private boolean field1624 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "[Z")
    private boolean[] field1625 = new boolean[5];

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1627 = 2301979;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[Lz;")
    private NpcEntity[] field1629 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    public int[] field1631 = new int[16384];

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1635 = -165;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[Ljc;")
    private CollisionMap[] field1636 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field1637 = new int[Stats.field1172];

    @OriginalMember(owner = "client", name = "zi", descriptor = "Lob;")
    private LinkList field1639 = new LinkList(field1482);

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Ld;")
    private Component field1640 = new Component();

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Z")
    private boolean field1641 = false;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1642 = -50;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1643 = 8;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "Z")
    public boolean field1645 = false;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[I")
    private int[] field1646 = new int[7];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    private int[] field1652 = new int[200];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field1654 = new int[5];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1665 = 315;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field1671 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1672 = -1;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1673 = 560;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1676 = 1;

    @OriginalMember(owner = "client", name = "mj", descriptor = "[Lib;")
    private Pix32[] field1678 = new Pix32[20];

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private final int[] field1689 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "yj", descriptor = "[I")
    private int[] field1690 = new int[5];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Lob;")
    private LinkList field1693 = new LinkList(field1482);

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field1694 = -1;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field1695 = 7759444;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field1702 = 2;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "B")
    private byte field1703 = 39;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field1704 = 3;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "Z")
    private boolean field1705 = false;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "Z")
    private boolean field1709 = false;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "Z")
    private boolean field1710 = true;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field1711 = 9527;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "B")
    private byte field1717 = 59;

    @OriginalMember(owner = "client", name = "bk", descriptor = "[Ljava/lang/String;")
    private String[] field1719 = new String[500];

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private static int field1312 = 88;

    @OriginalMember(owner = "client", name = "tc", descriptor = "B")
    private static byte field1322 = 8;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private static int field1341 = 10;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    private static boolean field1343 = true;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    public static int[] field1379 = new int[32];

    @OriginalMember(owner = "client", name = "Te", descriptor = "[[I")
    public static final int[][] field1452;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private static int[] field1455;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "B")
    private static byte field1456;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private static int field1482;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Ljava/lang/String;")
    private static String field1483;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private static int field1493;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private static int field1517;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private static int field1593;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private static boolean field1602;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private static int field1604;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    public static final int[] field1622;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1626;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1655;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private static int field1260;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private static int field1278;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field1302;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private static int field1375;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private static int field1387;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private static int field1418;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private static int field1489;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field1492;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private static int field1515;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private static int field1535;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private static int field1544;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field1596;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private static int field1603;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private static int field1620;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private static int field1653;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private static int field1661;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field1697;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field1700;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field1701;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "I")
    private static int field1716;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "J")
    private long field1397;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "J")
    private long field1491;

    @OriginalMember(owner = "client", name = "qh", descriptor = "J")
    private long field1578;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "J")
    private long field1591;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "J")
    public long field1663;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Le;")
    private ClientStream field1691;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Lwb;")
    private Isaac field1338;

    @OriginalMember(owner = "client", name = "L", descriptor = "Lxb;")
    private Jagfile field1236;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Lfc;")
    public MouseTracking field1383;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lub;")
    private OnDemand field1368;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Lib;")
    private Pix32 field1261;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Lib;")
    private Pix32 field1262;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Lib;")
    private Pix32 field1279;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lib;")
    private Pix32 field1280;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lib;")
    private Pix32 field1281;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Lib;")
    private Pix32 field1282;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Lib;")
    private Pix32 field1283;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Lib;")
    private Pix32 field1332;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Lib;")
    private Pix32 field1358;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lib;")
    private Pix32 field1447;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lib;")
    private Pix32 field1448;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lib;")
    private Pix32 field1475;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lib;")
    private Pix32 field1476;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "Lib;")
    private Pix32 field1708;

    @OriginalMember(owner = "client", name = "M", descriptor = "Ljb;")
    private Pix8 field1237;

    @OriginalMember(owner = "client", name = "N", descriptor = "Ljb;")
    private Pix8 field1238;

    @OriginalMember(owner = "client", name = "O", descriptor = "Ljb;")
    private Pix8 field1239;

    @OriginalMember(owner = "client", name = "P", descriptor = "Ljb;")
    private Pix8 field1240;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Ljb;")
    private Pix8 field1241;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Ljb;")
    private Pix8 field1264;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Ljb;")
    private Pix8 field1265;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Ljb;")
    private Pix8 field1354;

    @OriginalMember(owner = "client", name = "ad", descriptor = "Ljb;")
    private Pix8 field1355;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Ljb;")
    private Pix8 field1427;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Ljb;")
    private Pix8 field1428;

    @OriginalMember(owner = "client", name = "we", descriptor = "Ljb;")
    private Pix8 field1429;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Ljb;")
    private Pix8 field1597;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Ljb;")
    private Pix8 field1598;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Ljb;")
    private Pix8 field1599;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Ljb;")
    private Pix8 field1605;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Ljb;")
    private Pix8 field1606;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Ljb;")
    private Pix8 field1607;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljb;")
    private Pix8 field1608;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljb;")
    private Pix8 field1609;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lkb;")
    private PixFont field1469;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Lkb;")
    private PixFont field1470;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lkb;")
    private PixFont field1471;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lkb;")
    private PixFont field1472;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Lqb;")
    private PixMap field1406;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Lqb;")
    private PixMap field1407;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lqb;")
    private PixMap field1408;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Lqb;")
    private PixMap field1409;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lqb;")
    private PixMap field1410;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Lqb;")
    private PixMap field1411;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lqb;")
    private PixMap field1412;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lqb;")
    private PixMap field1413;

    @OriginalMember(owner = "client", name = "he", descriptor = "Lqb;")
    private PixMap field1414;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Lqb;")
    private PixMap field1509;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Lqb;")
    private PixMap field1510;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Lqb;")
    private PixMap field1511;

    @OriginalMember(owner = "client", name = "og", descriptor = "Lqb;")
    private PixMap field1524;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lqb;")
    private PixMap field1525;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lqb;")
    private PixMap field1526;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lqb;")
    private PixMap field1527;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Lqb;")
    private PixMap field1528;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lqb;")
    private PixMap field1529;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lqb;")
    private PixMap field1530;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Lqb;")
    private PixMap field1531;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Lqb;")
    private PixMap field1532;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Lqb;")
    private PixMap field1666;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Lqb;")
    private PixMap field1667;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Lqb;")
    private PixMap field1668;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lqb;")
    private PixMap field1669;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Lab;")
    public static PlayerEntity field1396;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Lr;")
    private World3D field1253;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Ljava/lang/String;")
    public String field1508;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Ljava/lang/String;")
    private String field1551;

    @OriginalMember(owner = "client", name = "wh", descriptor = "Ljava/lang/String;")
    public String field1584;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Ljava/lang/String;")
    private String field1592;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Ljava/net/Socket;")
    private Socket field1371;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private static boolean field1259;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private static boolean field1344;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Z")
    private static boolean field1376;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Z")
    public static boolean field1382;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private static boolean field1565;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    public static boolean field1662;

    @OriginalMember(owner = "client", name = "ck", descriptor = "Z")
    public static boolean field1720;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field1313;

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field1314;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field1315;

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field1459;

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field1460;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field1542;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field1543;

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field1632;

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    private int[] field1633;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field1634;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private int[] field1648;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field1649;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[I")
    private int[] field1650;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field1651;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[Ljb;")
    private Pix8[] field1331;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[[B")
    private byte[][] field1438;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[[B")
    private byte[][] field1574;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[[[B")
    private byte[][][] field1284;

    @OriginalMember(owner = "client", name = "ak", descriptor = "[[[I")
    private int[][][] field1718;

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method429(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1384; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1381[var3])) {
                    return true;
                }
            }
            if (arg1 != 9) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return arg0.equalsIgnoreCase(field1396.field463);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1377) {
                this.field1377 = false;
                this.field1349 = true;
            }
            int var3 = this.field1399[arg1];
            int var4 = this.field1400[arg1];
            int var5 = this.field1401[arg1];
            int var6 = this.field1402[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 899 && this.method500(var6, var4, var3, false, 167)) {
                this.field1287.method220(this.field1582);
            }
            if (var5 == 1071) {
                this.method500(var6, var4, var3, false, 246);
            }
            if (var5 == 718) {
                if (!this.field1641) {
                    this.field1253.method88(super.field30 - 4, (byte) 1, super.field29 - 4);
                } else {
                    this.field1253.method88(var4 - 4, (byte) 1, var3 - 4);
                }
            }
            if (var5 == 357) {
                this.method500(var6, var4, var3, false, 123);
            }
            if (var5 == 810 && this.method500(var6, var4, var3, false, 9)) {
                this.field1287.method220(this.field1507);
                this.field1287.method220(this.field1505);
                this.field1287.method220(this.field1506);
            }
            if (var5 == 737) {
                this.method457(false);
            }
            if (var5 == 274) {
                Component var7 = Component.field72[var4];
                this.field1581 = 1;
                this.field1582 = var4;
                this.field1583 = var7.field132;
                this.field1504 = 0;
                this.field1395 = true;
                String var8 = var7.field130;
                if (var8.indexOf(" ") != -1) {
                    var8 = var8.substring(0, var8.indexOf(" "));
                }
                String var9 = var7.field130;
                if (var9.indexOf(" ") != -1) {
                    var9 = var9.substring(var9.indexOf(" ") + 1);
                }
                this.field1584 = var8 + " " + var7.field131 + " " + var9;
                if (this.field1583 == 16) {
                    this.field1395 = true;
                    this.field1704 = 3;
                    this.field1516 = true;
                }
            } else {
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 694) {
                        this.field1287.method218(67, (byte) 19);
                    }
                    if (var5 == 681) {
                        ++field1603;
                        if (field1603 >= 116) {
                            this.field1287.method218(214, (byte) 19);
                            this.field1287.method222(13018169);
                        }
                        this.field1287.method218(155, (byte) 19);
                    }
                    if (var5 == 100) {
                        this.field1287.method218(243, (byte) 19);
                    }
                    if (var5 == 795) {
                        this.field1287.method218(195, (byte) 19);
                    }
                    if (var5 == 962) {
                        this.field1287.method218(52, (byte) 19);
                    }
                    this.field1287.method220(var6);
                    this.field1287.method220(var3);
                    this.field1287.method220(var4);
                    this.field1712 = 0;
                    this.field1713 = var4;
                    this.field1714 = var3;
                    this.field1715 = 2;
                    if (Component.field72[var4].field78 == this.field1339) {
                        this.field1715 = 1;
                    }
                    if (Component.field72[var4].field78 == this.field1612) {
                        this.field1715 = 3;
                    }
                }
                if (var5 == 1328) {
                    ObjType var10 = ObjType.method348(var6);
                    Component var11 = Component.field72[var4];
                    String var12;
                    if (var11 != null && var11.field74[var3] >= 100000) {
                        var12 = var11.field74[var3] + " x " + var10.field1059;
                    } else if (var10.field1060 != null) {
                        var12 = new String(var10.field1060);
                    } else {
                        var12 = "It's a " + var10.field1059 + ".";
                    }
                    this.method503(true, 0, var12, "");
                }
                if (var5 == 524) {
                    String var13 = this.field1719[arg1];
                    int var14 = var13.indexOf("@whi@");
                    if (var14 != -1) {
                        if (this.field1339 == -1) {
                            this.method457(false);
                            this.field1430 = var13.substring(var14 + 5).trim();
                            this.field1705 = false;
                            for (int var15 = 0; var15 < Component.field72.length; ++var15) {
                                if (Component.field72[var15] != null && Component.field72[var15].field81 == 600) {
                                    this.field1449 = this.field1339 = Component.field72[var15].field78;
                                    break;
                                }
                            }
                        } else {
                            this.method503(true, 0, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var5 == 743) {
                    ++field1535;
                    if (field1535 >= 124) {
                        this.field1287.method218(201, (byte) 19);
                        this.field1287.method220(37954);
                    }
                    this.method500(var6, var4, var3, false, 142);
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var16 = this.field1305[var6];
                    if (var16 != null) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var16.field452[0], 2, var16.field451[0], (byte) 9, 1, field1396.field452[0]);
                        this.field1273 = super.field29;
                        this.field1274 = super.field30;
                        this.field1276 = 2;
                        this.field1275 = 0;
                        if (var5 == 387) {
                            field1278 += var6;
                            if (field1278 >= 66) {
                                this.field1287.method218(244, (byte) 19);
                                this.field1287.method219(154);
                            }
                            this.field1287.method218(183, (byte) 19);
                        }
                        if (var5 == 499) {
                            this.field1287.method218(147, (byte) 19);
                        }
                        if (var5 == 639) {
                            ++field1302;
                            if (field1302 >= 52) {
                                this.field1287.method218(206, (byte) 19);
                                this.field1287.method219(131);
                            }
                            this.field1287.method218(230, (byte) 19);
                        }
                        if (var5 == 185) {
                            this.field1287.method218(54, (byte) 19);
                        }
                        if (var5 == 27) {
                            this.field1287.method218(27, (byte) 19);
                        }
                        this.field1287.method220(var6);
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var17 = this.field1629[var6];
                    if (var17 != null) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var17.field452[0], 2, var17.field451[0], (byte) 9, 1, field1396.field452[0]);
                        this.field1273 = super.field29;
                        this.field1274 = super.field30;
                        this.field1276 = 2;
                        this.field1275 = 0;
                        if (var5 == 309) {
                            this.field1287.method218(106, (byte) 19);
                        }
                        if (var5 == 793) {
                            this.field1287.method218(149, (byte) 19);
                        }
                        if (var5 == 242) {
                            this.field1287.method218(70, (byte) 19);
                        }
                        if (var5 == 209) {
                            this.field1287.method218(45, (byte) 19);
                        }
                        if (var5 == 852) {
                            this.field1287.method218(17, (byte) 19);
                        }
                        this.field1287.method220(var6);
                    }
                }
                if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                    boolean var18 = this.method535(field1396.field451[0], 0, 0, 0, false, 0, var4, 2, var3, (byte) 9, 0, field1396.field452[0]);
                    if (!var18) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var4, 2, var3, (byte) 9, 1, field1396.field452[0]);
                    }
                    this.field1273 = super.field29;
                    this.field1274 = super.field30;
                    this.field1276 = 2;
                    this.field1275 = 0;
                    if (var5 == 778) {
                        this.field1287.method218(203, (byte) 19);
                    }
                    if (var5 == 139) {
                        if ((var3 & 3) == 0) {
                            ++field1716;
                        }
                        if (field1716 >= 123) {
                            this.field1287.method218(237, (byte) 19);
                            this.field1287.method223(0);
                        }
                        this.field1287.method218(21, (byte) 19);
                    }
                    if (var5 == 224) {
                        field1544 += var4;
                        if (field1544 >= 75) {
                            this.field1287.method218(184, (byte) 19);
                            this.field1287.method219(19);
                        }
                        this.field1287.method218(204, (byte) 19);
                    }
                    if (var5 == 662) {
                        field1489 += this.field1569;
                        if (field1489 >= 118) {
                            this.field1287.method218(122, (byte) 19);
                            this.field1287.method223(0);
                        }
                        this.field1287.method218(205, (byte) 19);
                    }
                    if (var5 == 617) {
                        this.field1287.method218(66, (byte) 19);
                    }
                    this.field1287.method220(this.field1568 + var3);
                    this.field1287.method220(this.field1569 + var4);
                    this.field1287.method220(var6);
                }
                if (var5 == 240) {
                    NpcEntity var20 = this.field1629[var6];
                    if (var20 != null) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var20.field452[0], 2, var20.field451[0], (byte) 9, 1, field1396.field452[0]);
                        this.field1273 = super.field29;
                        this.field1274 = super.field30;
                        this.field1276 = 2;
                        this.field1275 = 0;
                        this.field1287.method218(127, (byte) 19);
                        this.field1287.method220(var6);
                        this.field1287.method220(this.field1582);
                    }
                }
                if (var5 == 398) {
                    this.field1287.method218(241, (byte) 19);
                    this.field1287.method220(var6);
                    this.field1287.method220(var3);
                    this.field1287.method220(var4);
                    this.field1287.method220(this.field1507);
                    this.field1287.method220(this.field1505);
                    this.field1287.method220(this.field1506);
                    this.field1712 = 0;
                    this.field1713 = var4;
                    this.field1714 = var3;
                    this.field1715 = 2;
                    if (Component.field72[var4].field78 == this.field1339) {
                        this.field1715 = 1;
                    }
                    if (Component.field72[var4].field78 == this.field1612) {
                        this.field1715 = 3;
                    }
                }
                if (var5 == 1152) {
                    ObjType var21 = ObjType.method348(var6);
                    String var22;
                    if (var21.field1060 != null) {
                        var22 = new String(var21.field1060);
                    } else {
                        var22 = "It's a " + var21.field1059 + ".";
                    }
                    this.method503(true, 0, var22, "");
                }
                if (var5 == 275) {
                    PlayerEntity var23 = this.field1305[var6];
                    if (var23 != null) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var23.field452[0], 2, var23.field451[0], (byte) 9, 1, field1396.field452[0]);
                        this.field1273 = super.field29;
                        this.field1274 = super.field30;
                        this.field1276 = 2;
                        this.field1275 = 0;
                        this.field1287.method218(242, (byte) 19);
                        this.field1287.method220(var6);
                        this.field1287.method220(this.field1507);
                        this.field1287.method220(this.field1505);
                        this.field1287.method220(this.field1506);
                    }
                }
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var24 = this.field1719[arg1];
                    int var25 = var24.indexOf("@whi@");
                    if (var25 != -1) {
                        long var26 = JString.method300(var24.substring(var25 + 5).trim());
                        if (var5 == 605) {
                            this.method494(var26, (byte) 111);
                        }
                        if (var5 == 47) {
                            this.method522(false, var26);
                        }
                        if (var5 == 513) {
                            this.method547(true, var26);
                        }
                        if (var5 == 884) {
                            this.method492(var26, -14052);
                        }
                    }
                }
                if (var5 == 829) {
                    NpcEntity var28 = this.field1629[var6];
                    if (var28 != null) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var28.field452[0], 2, var28.field451[0], (byte) 9, 1, field1396.field452[0]);
                        this.field1273 = super.field29;
                        this.field1274 = super.field30;
                        this.field1276 = 2;
                        this.field1275 = 0;
                        this.field1287.method218(150, (byte) 19);
                        this.field1287.method220(var6);
                        this.field1287.method220(this.field1507);
                        this.field1287.method220(this.field1505);
                        this.field1287.method220(this.field1506);
                    }
                }
                if (var5 == 997 && !this.field1422) {
                    this.field1287.method218(239, (byte) 19);
                    this.field1287.method220(var4);
                    this.field1422 = true;
                }
                if (var5 == 111) {
                    boolean var29 = this.method535(field1396.field451[0], 0, 0, 0, false, 0, var4, 2, var3, (byte) 9, 0, field1396.field452[0]);
                    if (!var29) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var4, 2, var3, (byte) 9, 1, field1396.field452[0]);
                    }
                    this.field1273 = super.field29;
                    this.field1274 = super.field30;
                    this.field1276 = 2;
                    this.field1275 = 0;
                    this.field1287.method218(176, (byte) 19);
                    this.field1287.method220(this.field1568 + var3);
                    this.field1287.method220(this.field1569 + var4);
                    this.field1287.method220(var6);
                    this.field1287.method220(this.field1507);
                    this.field1287.method220(this.field1505);
                    this.field1287.method220(this.field1506);
                }
                if (var5 == 225) {
                    this.field1287.method218(100, (byte) 19);
                    this.field1287.method220(var4);
                    Component var31 = Component.field72[var4];
                    if (var31.field87 != null && var31.field87[0][0] == 5) {
                        int var32 = var31.field87[0][1];
                        if (this.field1249[var32] != var31.field89[0]) {
                            this.field1249[var32] = var31.field89[0];
                            this.method495(-155, var32);
                            this.field1395 = true;
                        }
                    }
                }
                if (var5 == 370) {
                    boolean var33 = this.method535(field1396.field451[0], 0, 0, 0, false, 0, var4, 2, var3, (byte) 9, 0, field1396.field452[0]);
                    if (!var33) {
                        this.method535(field1396.field451[0], 0, 1, 0, false, 0, var4, 2, var3, (byte) 9, 1, field1396.field452[0]);
                    }
                    this.field1273 = super.field29;
                    this.field1274 = super.field30;
                    this.field1276 = 2;
                    this.field1275 = 0;
                    this.field1287.method218(144, (byte) 19);
                    this.field1287.method220(this.field1568 + var3);
                    this.field1287.method220(this.field1569 + var4);
                    this.field1287.method220(var6);
                    this.field1287.method220(this.field1582);
                }
                if (var5 == 1381) {
                    int var35 = var6 >> 14 & 32767;
                    LocType var36 = LocType.method330(var35);
                    String var37;
                    if (var36.field962 != null) {
                        var37 = new String(var36.field962);
                    } else {
                        var37 = "It's a " + var36.field961 + ".";
                    }
                    this.method503(true, 0, var37, "");
                }
                if (var5 == 625) {
                    this.method500(var6, var4, var3, false, 97);
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1492;
                        }
                        if (field1492 >= 133) {
                            this.field1287.method218(30, (byte) 19);
                            this.field1287.method220(6118);
                        }
                        this.field1287.method218(103, (byte) 19);
                    }
                    if (var5 == 354) {
                        this.field1287.method218(198, (byte) 19);
                    }
                    if (var5 == 113) {
                        this.field1287.method218(25, (byte) 19);
                    }
                    if (var5 == 555) {
                        this.field1287.method218(85, (byte) 19);
                    }
                    if (var5 == 331) {
                        this.field1287.method218(210, (byte) 19);
                    }
                    this.field1287.method220(var6);
                    this.field1287.method220(var3);
                    this.field1287.method220(var4);
                    this.field1712 = 0;
                    this.field1713 = var4;
                    this.field1714 = var3;
                    this.field1715 = 2;
                    if (Component.field72[var4].field78 == this.field1339) {
                        this.field1715 = 1;
                    }
                    if (Component.field72[var4].field78 == this.field1612) {
                        this.field1715 = 3;
                    }
                }
                if (var5 == 902) {
                    String var38 = this.field1719[arg1];
                    int var39 = var38.indexOf("@whi@");
                    if (var39 != -1) {
                        long var40 = JString.method300(var38.substring(var39 + 5).trim());
                        int var42 = -1;
                        for (int var43 = 0; var43 < this.field1384; ++var43) {
                            if (this.field1616[var43] == var40) {
                                var42 = var43;
                                break;
                            }
                        }
                        if (var42 != -1 && this.field1652[var42] > 0) {
                            this.field1349 = true;
                            this.field1377 = false;
                            this.field1575 = true;
                            this.field1615 = "";
                            this.field1579 = 3;
                            this.field1578 = this.field1616[var42];
                            this.field1235 = "Enter message to send to " + this.field1381[var42];
                        }
                    }
                }
                if (var5 == 231) {
                    Component var44 = Component.field72[var4];
                    boolean var45 = true;
                    if (var44.field81 > 0) {
                        var45 = this.method554((byte) 3, var44);
                    }
                    if (var45) {
                        this.field1287.method218(100, (byte) 19);
                        this.field1287.method220(var4);
                    }
                }
                if (var5 == 507 || var5 == 957) {
                    String var46 = this.field1719[arg1];
                    int var47 = var46.indexOf("@whi@");
                    if (var47 != -1) {
                        String var48 = var46.substring(var47 + 5).trim();
                        String var49 = JString.method304(-257, JString.method301(JString.method300(var48), 0));
                        boolean var50 = false;
                        for (int var51 = 0; var51 < this.field1306; ++var51) {
                            PlayerEntity var52 = this.field1305[this.field1307[var51]];
                            if (var52 != null && var52.field463 != null && var52.field463.equalsIgnoreCase(var49)) {
                                this.method535(field1396.field451[0], 0, 1, 0, false, 0, var52.field452[0], 2, var52.field451[0], (byte) 9, 1, field1396.field452[0]);
                                if (var5 == 507) {
                                    field1278 += var6;
                                    if (field1278 >= 66) {
                                        this.field1287.method218(244, (byte) 19);
                                        this.field1287.method219(154);
                                    }
                                    this.field1287.method218(183, (byte) 19);
                                }
                                if (var5 == 957) {
                                    ++field1302;
                                    if (field1302 >= 52) {
                                        this.field1287.method218(206, (byte) 19);
                                        this.field1287.method219(131);
                                    }
                                    this.field1287.method218(230, (byte) 19);
                                }
                                this.field1287.method220(this.field1307[var51]);
                                var50 = true;
                                break;
                            }
                        }
                        if (!var50) {
                            this.method503(true, 0, "Unable to find " + var49, "");
                        }
                    }
                }
                if (var5 == 102) {
                    this.field1504 = 1;
                    this.field1505 = var3;
                    this.field1506 = var4;
                    this.field1507 = var6;
                    this.field1508 = ObjType.method348(var6).field1059;
                    this.field1581 = 0;
                    this.field1395 = true;
                } else {
                    if (var5 == 721) {
                        field1515 += var4;
                        if (field1515 >= 139) {
                            this.field1287.method218(59, (byte) 19);
                            this.field1287.method223(0);
                        }
                        this.method500(var6, var4, var3, false, 139);
                    }
                    if (var5 == 435) {
                        this.field1287.method218(100, (byte) 19);
                        this.field1287.method220(var4);
                        Component var53 = Component.field72[var4];
                        if (var53.field87 != null && var53.field87[0][0] == 5) {
                            int var54 = var53.field87[0][1];
                            this.field1249[var54] = 1 - this.field1249[var54];
                            this.method495(-155, var54);
                            this.field1395 = true;
                        }
                    }
                    if (var5 == 1714) {
                        NpcEntity var55 = this.field1629[var6];
                        if (var55 != null) {
                            NpcType var56 = var55.field458;
                            if (var56.field1043 != null) {
                                var56 = var56.method345(this.field1580);
                            }
                            if (var56 != null) {
                                String var57;
                                if (var56.field1019 != null) {
                                    var57 = new String(var56.field1019);
                                } else {
                                    var57 = "It's a " + var56.field1018 + ".";
                                }
                                this.method503(true, 0, var57, "");
                            }
                        }
                    }
                    if (var5 == 563) {
                        this.field1287.method218(216, (byte) 19);
                        this.field1287.method220(var6);
                        this.field1287.method220(var3);
                        this.field1287.method220(var4);
                        this.field1287.method220(this.field1582);
                        this.field1712 = 0;
                        this.field1713 = var4;
                        this.field1714 = var3;
                        this.field1715 = 2;
                        if (Component.field72[var4].field78 == this.field1339) {
                            this.field1715 = 1;
                        }
                        if (Component.field72[var4].field78 == this.field1612) {
                            this.field1715 = 3;
                        }
                    }
                    if (var5 == 131) {
                        PlayerEntity var58 = this.field1305[var6];
                        if (var58 != null) {
                            this.method535(field1396.field451[0], 0, 1, 0, false, 0, var58.field452[0], 2, var58.field451[0], (byte) 9, 1, field1396.field452[0]);
                            this.field1273 = super.field29;
                            this.field1274 = super.field30;
                            this.field1276 = 2;
                            this.field1275 = 0;
                            this.field1287.method218(218, (byte) 19);
                            this.field1287.method220(var6);
                            this.field1287.method220(this.field1582);
                        }
                    }
                    this.field1504 = 0;
                    this.field1581 = 0;
                    if (arg0 != 0) {
                        this.method6();
                    }
                    this.field1395 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = Model.field610[var8];
            int var14 = Model.field611[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field610[var9];
            int var17 = Model.field611[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1431 = arg4 - var10;
        this.field1432 = arg1 - var11;
        this.field1433 = arg6 - var12;
        this.field1434 = arg0;
        if (arg3 <= 0) {
            this.field1697 = this.field1404.method229();
        }
        this.field1435 = arg5;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            this.field1473 = null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1353[var5] != null) {
                int var6 = this.field1351[var5];
                int var7 = 70 - var4 * 14 + this.field1437 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1352[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1628 == 0 || this.field1628 == 1 && this.method429(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field1396.field463)) {
                        if (this.field1692 >= 1) {
                            this.field1719[this.field1674] = "Report abuse @whi@" + var8;
                            this.field1401[this.field1674] = 524;
                            ++this.field1674;
                        }
                        this.field1719[this.field1674] = "Add ignore @whi@" + var8;
                        this.field1401[this.field1674] = 47;
                        ++this.field1674;
                        this.field1719[this.field1674] = "Add friend @whi@" + var8;
                        this.field1401[this.field1674] = 605;
                        ++this.field1674;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1610 == 0 && (var6 == 7 || this.field1386 == 0 || this.field1386 == 1 && this.method429(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field1692 >= 1) {
                            this.field1719[this.field1674] = "Report abuse @whi@" + var8;
                            this.field1401[this.field1674] = 524;
                            ++this.field1674;
                        }
                        this.field1719[this.field1674] = "Add ignore @whi@" + var8;
                        this.field1401[this.field1674] = 47;
                        ++this.field1674;
                        this.field1719[this.field1674] = "Add friend @whi@" + var8;
                        this.field1401[this.field1674] = 605;
                        ++this.field1674;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1494 == 0 || this.field1494 == 1 && this.method429(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1719[this.field1674] = "Accept trade @whi@" + var8;
                        this.field1401[this.field1674] = 507;
                        ++this.field1674;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1610 == 0 && this.field1386 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1494 == 0 || this.field1494 == 1 && this.method429(var8, (byte) 9))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1719[this.field1674] = "Accept challenge @whi@" + var8;
                        this.field1401[this.field1674] = 957;
                        ++this.field1674;
                    }
                    ++var4;
                }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method433(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 92 / arg3;
        int var6 = 256 - arg2;
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var6 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var6 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)I")
    public final int method434(int arg0) {
        if (arg0 <= 0) {
            this.field1697 = -1;
        }
        int var2 = 3;
        if (this.field1434 < 310) {
            int var3 = this.field1431 >> 7;
            int var4 = this.field1433 >> 7;
            int var5 = field1396.field401 >> 7;
            int var6 = field1396.field402 >> 7;
            if ((this.field1284[this.field1487][var3][var4] & 4) != 0) {
                var2 = this.field1487;
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
                    if ((this.field1284[this.field1487][var3][var4] & 4) != 0) {
                        var2 = this.field1487;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1284[this.field1487][var3][var4] & 4) != 0) {
                            var2 = this.field1487;
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
                    if ((this.field1284[this.field1487][var3][var4] & 4) != 0) {
                        var2 = this.field1487;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1284[this.field1487][var3][var4] & 4) != 0) {
                            var2 = this.field1487;
                        }
                    }
                }
            }
        }
        if ((this.field1284[this.field1487][field1396.field401 >> 7][field1396.field402 >> 7] & 4) != 0) {
            var2 = this.field1487;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)I")
    public final int method435(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.method513(this.field1433, true, this.field1431, this.field1487);
        return var3 - this.field1432 < 800 && (this.field1284[this.field1487][this.field1431 >> 7][this.field1433 >> 7] & 4) != 0 ? this.field1487 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;I)V")
    private final void method436(LocSpawned arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != -22447) {
            this.field1337 = 437;
        }
        if (arg0.field735 == 0) {
            var3 = this.field1253.method76(arg0.field734, arg0.field736, arg0.field737);
        }
        if (arg0.field735 == 1) {
            var3 = this.field1253.method77(arg0.field737, arg0.field736, arg0.field734, 0);
        }
        if (arg0.field735 == 2) {
            var3 = this.field1253.method78(arg0.field734, arg0.field736, arg0.field737);
        }
        if (arg0.field735 == 3) {
            var3 = this.field1253.method79(arg0.field734, arg0.field736, arg0.field737);
        }
        if (var3 != 0) {
            int var7 = this.field1253.method80(arg0.field734, arg0.field736, arg0.field737, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field738 = var4;
        arg0.field740 = var5;
        arg0.field739 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjb;)V")
    public final void method437(byte arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1542.length; ++var4) {
            this.field1542[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1542[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1543[var16] = (this.field1542[var16 - 1] + this.field1542[var16 + 1] + this.field1542[var16 - 128] + this.field1542[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1542;
            this.field1542 = this.field1543;
            this.field1543 = var14;
        }
        if (arg0 == 64) {
            if (arg1 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg1.field687; ++var8) {
                    for (int var9 = 0; var9 < arg1.field686; ++var9) {
                        if (arg1.field684[var7++] != 0) {
                            int var10 = var9 + 16 + arg1.field688;
                            int var11 = var8 + 16 + arg1.field689;
                            int var12 = (var11 << 7) + var10;
                            this.field1542[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;III)V")
    public final void method438(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1364 + this.field1360 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field610[var5];
            int var8 = Model.field611[var5];
            int var9 = var7 * 256 / (this.field1675 + 256);
            int var10 = var8 * 256 / (this.field1675 + 256);
            if (arg2 != 0) {
                this.field1697 = this.field1404.method229();
            }
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method192(this.field1428, var11 + 94 - arg0.field679 / 2 + 4, 9244, 83 - var12 - arg0.field680 / 2 - 4);
            } else {
                arg0.method186(83 - var12 - arg0.field680 / 2 - 4, var11 + 94 - arg0.field679 / 2 + 4, -47687);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (this.field1406 == null) {
            super.field15 = null;
            this.field1669 = null;
            this.field1667 = null;
            this.field1666 = null;
            this.field1668 = null;
            this.field1509 = null;
            this.field1510 = null;
            this.field1511 = null;
            this.field1409 = new PixMap(field1322, 128, 265, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1410 = new PixMap(field1322, 128, 265, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1406 = new PixMap(field1322, 509, 171, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1407 = new PixMap(field1322, 360, 132, this.method11((byte) -114));
            if (arg0 != 0) {
                this.field1287.method219(255);
            }
            Pix2D.method155(17698);
            this.field1408 = new PixMap(field1322, 360, 200, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1411 = new PixMap(field1322, 202, 238, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1412 = new PixMap(field1322, 203, 238, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1413 = new PixMap(field1322, 74, 94, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1414 = new PixMap(field1322, 75, 94, this.method11((byte) -114));
            Pix2D.method155(17698);
            if (this.field1236 != null) {
                this.method455(-635);
                this.method480(true);
            }
            this.field1286 = true;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1291) {
            this.method496(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILlb;)V")
    public final void method440(boolean arg0, int arg1, Packet arg2) {
        if (!arg0) {
            if (arg1 != 142 && arg1 != 237) {
                if (arg1 == 188) {
                    int var4 = arg2.method229();
                    int var5 = (var4 >> 4 & 7) + this.field1255;
                    int var6 = (var4 & 7) + this.field1256;
                    int var7 = arg2.method229();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1689[var8];
                    int var11 = arg2.method231();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1718[this.field1487][var5][var6];
                        int var13 = this.field1718[this.field1487][var5 + 1][var6];
                        int var14 = this.field1718[this.field1487][var5 + 1][var6 + 1];
                        int var15 = this.field1718[this.field1487][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1253.method72(this.field1487, (byte) 109, var5, var6);
                            if (var16 != null) {
                                int var17 = var16.field275 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field273 = new LocEntity(var17, 2, var15, var13, var11, var9 + 4, var12, var14, false, 188);
                                    var16.field274 = new LocEntity(var17, 2, var15, var13, var11, var9 + 1 & 3, var12, var14, false, 188);
                                } else {
                                    var16.field273 = new LocEntity(var17, var8, var15, var13, var11, var9, var12, var14, false, 188);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1253.method73(this.field1487, var5, (byte) 4, var6);
                            if (var18 != null) {
                                var18.field166 = new LocEntity(var18.field167 >> 14 & 32767, 4, var15, var13, var11, 0, var12, var14, false, 188);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1253.method74(var5, var6, -282, this.field1487);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field258 = new LocEntity(var19.field266 >> 14 & 32767, var8, var15, var13, var11, var9, var12, var14, false, 188);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1253.method75(var6, this.field1487, var5, false);
                            if (var20 != null) {
                                var20.field197 = new LocEntity(var20.field198 >> 14 & 32767, 22, var15, var13, var11, var9, var12, var14, false, 188);
                            }
                        }
                    }
                } else if (arg1 == 7) {
                    int var21 = arg2.method229();
                    int var22 = (var21 >> 4 & 7) + this.field1255;
                    int var23 = (var21 & 7) + this.field1256;
                    int var24 = arg2.method231();
                    int var25 = arg2.method231();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field503 = var24;
                        var26.field504 = var25;
                        if (this.field1473[this.field1487][var22][var23] == null) {
                            this.field1473[this.field1487][var22][var23] = new LinkList(field1482);
                        }
                        this.field1473[this.field1487][var22][var23].method245(var26);
                        this.method470(var22, var23);
                    }
                } else if (arg1 == 76) {
                    int var27 = arg2.method229();
                    int var28 = (var27 >> 4 & 7) + this.field1255;
                    int var29 = (var27 & 7) + this.field1256;
                    int var30 = arg2.method231();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1473[this.field1487][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250(7)) {
                                if ((var30 & 32767) == var32.field503) {
                                    var32.method106();
                                    break;
                                }
                            }
                            if (var31.method248() == null) {
                                this.field1473[this.field1487][var28][var29] = null;
                            }
                            this.method470(var28, var29);
                        }
                    }
                } else if (arg1 == 192) {
                    int var33 = arg2.method229();
                    int var34 = (var33 >> 4 & 7) + this.field1255;
                    int var35 = (var33 & 7) + this.field1256;
                    int var36 = var34 + arg2.method230();
                    int var37 = var35 + arg2.method230();
                    int var38 = arg2.method232();
                    int var39 = arg2.method231();
                    int var40 = arg2.method229() * 4;
                    int var41 = arg2.method229() * 4;
                    int var42 = arg2.method231();
                    int var43 = arg2.method231();
                    int var44 = arg2.method229();
                    int var45 = arg2.method229();
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var39 != 65535) {
                        int var46 = var34 * 128 + 64;
                        int var47 = var35 * 128 + 64;
                        int var48 = var36 * 128 + 64;
                        int var49 = var37 * 128 + 64;
                        ProjectileEntity var50 = new ProjectileEntity(-572, var45, this.field1487, var44, var41, var46, field1403 + var43, field1403 + var42, var39, this.method513(var47, true, var46, this.field1487) - var40, var47, var38);
                        var50.method120(8424, var48, field1403 + var42, this.method513(var49, true, var48, this.field1487) - var41, var49);
                        this.field1693.method245(var50);
                    }
                } else if (arg1 == 45) {
                    int var51 = arg2.method229();
                    int var52 = (var51 >> 4 & 7) + this.field1255;
                    int var53 = (var51 & 7) + this.field1256;
                    int var54 = arg2.method231();
                    int var55 = arg2.method229();
                    int var56 = arg2.method231();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(5, var54, field1403, this.field1487, var58, var56, this.method513(var58, true, var57, this.field1487) - var55, var57);
                        this.field1267.method245(var59);
                    }
                } else if (arg1 == 14) {
                    int var60 = arg2.method229();
                    int var61 = (var60 >> 4 & 7) + this.field1255;
                    int var62 = (var60 & 7) + this.field1256;
                    int var63 = arg2.method231();
                    int var64 = arg2.method231();
                    int var65 = arg2.method231();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1325 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field503 = var63;
                        var66.field504 = var64;
                        if (this.field1473[this.field1487][var61][var62] == null) {
                            this.field1473[this.field1487][var61][var62] = new LinkList(field1482);
                        }
                        this.field1473[this.field1487][var61][var62].method245(var66);
                        this.method470(var61, var62);
                    }
                } else {
                    if (arg1 == 35) {
                        int var67 = arg2.method229();
                        int var68 = (var67 >> 4 & 7) + this.field1255;
                        int var69 = (var67 & 7) + this.field1256;
                        int var70 = arg2.method229();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1689[var71];
                        int var74 = arg2.method231();
                        int var75 = arg2.method231();
                        int var76 = arg2.method231();
                        int var77 = arg2.method231();
                        byte var78 = arg2.method230();
                        byte var79 = arg2.method230();
                        byte var80 = arg2.method230();
                        byte var81 = arg2.method230();
                        PlayerEntity var82;
                        if (this.field1325 == var77) {
                            var82 = field1396;
                        } else {
                            var82 = this.field1305[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method330(var74);
                            int var84 = this.field1718[this.field1487][var68][var69];
                            int var85 = this.field1718[this.field1487][var68 + 1][var69];
                            int var86 = this.field1718[this.field1487][var68 + 1][var69 + 1];
                            int var87 = this.field1718[this.field1487][var68][var69 + 1];
                            Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method562(var75 + 1, var68, var73, 0, var69, -1, var76 + 1, 0, true, this.field1487);
                                var82.field473 = field1403 + var75;
                                var82.field474 = field1403 + var76;
                                var82.field478 = var88;
                                int var89 = var83.field965;
                                int var90 = var83.field966;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field966;
                                    var90 = var83.field965;
                                }
                                var82.field475 = var68 * 128 + var89 * 64;
                                var82.field477 = var69 * 128 + var90 * 64;
                                var82.field476 = this.method513(var82.field477, true, var82.field475, this.field1487);
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
                                var82.field479 = var68 + var78;
                                var82.field481 = var68 + var80;
                                var82.field480 = var69 + var79;
                                var82.field482 = var69 + var81;
                            }
                        }
                    }
                    if (arg1 != 197) {
                        if (arg1 == 19) {
                            int var101 = arg2.method229();
                            int var102 = (var101 >> 4 & 7) + this.field1255;
                            int var103 = (var101 & 7) + this.field1256;
                            int var104 = arg2.method231();
                            int var105 = arg2.method229();
                            int var106 = var105 >> 4 & 15;
                            int var107 = var105 & 7;
                            if (field1396.field451[0] >= var102 - var106 && field1396.field451[0] <= var102 + var106 && field1396.field452[0] >= var103 - var106 && field1396.field452[0] <= var103 + var106 && this.field1710 && !field1344 && this.field1450 < 50) {
                                this.field1373[this.field1450] = var104;
                                this.field1290[this.field1450] = var107;
                                this.field1562[this.field1450] = Wave.field915[var104];
                                ++this.field1450;
                                return;
                            }
                        }
                    } else {
                        int var93 = arg2.method229();
                        int var94 = (var93 >> 4 & 7) + this.field1255;
                        int var95 = (var93 & 7) + this.field1256;
                        int var96 = arg2.method231();
                        int var97 = arg2.method231();
                        int var98 = arg2.method231();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1473[this.field1487][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250(7)) {
                                    if ((var96 & 32767) == var100.field503 && var100.field504 == var97) {
                                        var100.field504 = var98;
                                        break;
                                    }
                                }
                                this.method470(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var108 = arg2.method229();
                int var109 = (var108 >> 4 & 7) + this.field1255;
                int var110 = (var108 & 7) + this.field1256;
                int var111 = arg2.method229();
                int var112 = var111 >> 2;
                int var113 = var111 & 3;
                int var114 = this.field1689[var112];
                int var115;
                if (arg1 == 237) {
                    var115 = -1;
                } else {
                    var115 = arg2.method231();
                }
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    this.method562(0, var109, var114, var112, var110, var115, -1, var113, true, this.field1487);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method441(byte arg0) {
        if (this.field1330 > 1) {
            --this.field1330;
        }
        if (this.field1700 > 0) {
            --this.field1700;
        }
        for (int var2 = 0; var2 < 5 && this.method530(-292); ++var2) {
        }
        if (this.field1645) {
            Object var3 = this.field1383.field1000;
            synchronized (this.field1383.field1000) {
                if (!field1382) {
                    this.field1383.field1001 = 0;
                } else if (super.field28 != 0 || this.field1383.field1001 >= 40) {
                    this.field1287.method218(94, (byte) 19);
                    this.field1287.method219(0);
                    int var4 = this.field1287.field716;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1383.field1001 && var4 - this.field1287.field716 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1383.field1003[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1383.field1002[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1383.field1003[var6] == -1 && this.field1383.field1002[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1318 == var8 && this.field1319 == var7) {
                            if (this.field1541 < 2047) {
                                ++this.field1541;
                            }
                        } else {
                            int var10 = var8 - this.field1318;
                            this.field1318 = var8;
                            int var11 = var7 - this.field1319;
                            this.field1319 = var7;
                            if (this.field1541 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1287.method220((this.field1541 << 12) + (var10 << 6) + var11);
                                this.field1541 = 0;
                            } else if (this.field1541 < 8) {
                                this.field1287.method222((this.field1541 << 19) + 8388608 + var9);
                                this.field1541 = 0;
                            } else {
                                this.field1287.method223((this.field1541 << 19) + -1073741824 + var9);
                                this.field1541 = 0;
                            }
                        }
                    }
                    this.field1287.method228(this.field1287.field716 - var4, (byte) 22);
                    if (var5 >= this.field1383.field1001) {
                        this.field1383.field1001 = 0;
                    } else {
                        this.field1383.field1001 -= var5;
                        for (int var12 = 0; var12 < this.field1383.field1001; ++var12) {
                            this.field1383.field1002[var12] = this.field1383.field1002[var5 + var12];
                            this.field1383.field1003[var12] = this.field1383.field1003[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field1663) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1663 = super.field31;
                int var15 = super.field30;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field29;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field28 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1287.method218(238, (byte) 19);
                this.field1287.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1522 > 0) {
                --this.field1522;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field1523 = true;
            }
            if (this.field1523 && this.field1522 <= 0) {
                this.field1522 = 20;
                this.field1523 = false;
                this.field1287.method218(212, (byte) 19);
                this.field1287.method220(this.field1359);
                this.field1287.method220(this.field1360);
            }
            if (super.field19 && !this.field1572) {
                this.field1572 = true;
                this.field1287.method218(11, (byte) 19);
                this.field1287.method219(1);
            }
            if (!super.field19 && this.field1572) {
                this.field1572 = false;
                this.field1287.method218(11, (byte) 19);
                this.field1287.method219(0);
            }
            this.method504(this.field1498);
            this.method491((byte) 1);
            this.method501(this.field1424);
            ++this.field1698;
            if (this.field1698 > 750) {
                this.method446(this.field1347);
            }
            this.method512(336);
            this.method537(17983);
            this.method449(834);
            ++this.field1263;
            if (this.field1276 != 0) {
                this.field1275 += 20;
                if (this.field1275 >= 400) {
                    this.field1276 = 0;
                }
            }
            if (this.field1715 != 0) {
                ++this.field1712;
                if (this.field1712 >= 15) {
                    if (this.field1715 == 2) {
                        this.field1395 = true;
                    }
                    if (this.field1715 == 3) {
                        this.field1349 = true;
                    }
                    this.field1715 = 0;
                }
            }
            if (this.field1683 != 0) {
                ++this.field1588;
                if (super.field22 > this.field1684 + 5 || super.field22 < this.field1684 - 5 || super.field23 > this.field1685 + 5 || super.field23 < this.field1685 - 5) {
                    this.field1512 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1683 == 2) {
                        this.field1395 = true;
                    }
                    if (this.field1683 == 3) {
                        this.field1349 = true;
                    }
                    this.field1683 = 0;
                    if (this.field1512 && this.field1588 >= 5) {
                        this.field1680 = -1;
                        this.method497(0);
                        if (this.field1681 == this.field1680 && this.field1682 != this.field1679) {
                            Component var20 = Component.field72[this.field1681];
                            byte var21 = 0;
                            if (this.field1243 == 1 && var20.field81 == 206) {
                                var21 = 1;
                            }
                            if (var20.field73[this.field1679] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field102) {
                                int var22 = this.field1682;
                                int var23 = this.field1679;
                                var20.field73[var23] = var20.field73[var22];
                                var20.field74[var23] = var20.field74[var22];
                                var20.field73[var22] = -1;
                                var20.field74[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1682;
                                int var25 = this.field1679;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33((byte) 4, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33((byte) 4, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33((byte) 4, this.field1682, this.field1679);
                            }
                            this.field1287.method218(126, (byte) 19);
                            this.field1287.method220(this.field1681);
                            this.field1287.method220(this.field1682);
                            this.field1287.method220(this.field1679);
                            this.field1287.method219(var21);
                        }
                    } else if ((this.field1299 == 1 || this.method525(this.field1674 - 1, this.field1647)) && this.field1674 > 2) {
                        this.method479(-288);
                    } else if (this.field1674 > 0) {
                        this.method430(0, this.field1674 - 1);
                    }
                    this.field1712 = 10;
                    super.field28 = 0;
                }
            }
            ++field1620;
            if (field1620 > 62) {
                field1620 = 0;
                this.field1287.method218(87, (byte) 19);
            }
            if (World3D.field323 != -1) {
                int var26 = World3D.field323;
                int var27 = World3D.field324;
                boolean var28 = this.method535(field1396.field451[0], 0, 0, 0, true, 0, var27, 0, var26, (byte) 9, 0, field1396.field452[0]);
                World3D.field323 = -1;
                if (var28) {
                    this.field1273 = super.field29;
                    this.field1274 = super.field30;
                    this.field1276 = 1;
                    this.field1275 = 0;
                }
            }
            if (super.field28 == 1 && this.field1592 != null) {
                this.field1592 = null;
                this.field1349 = true;
                super.field28 = 0;
            }
            this.method476(0);
            this.method523(false);
            this.method508(0);
            this.method549((byte) 9);
            if (super.field21 == 1 || super.field28 == 1) {
                ++this.field1688;
            }
            if (this.field1405 == 2) {
                this.method528(this.field1635);
            }
            if (this.field1405 == 2 && this.field1394) {
                this.method450((byte) 7);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1488[var29]++;
            }
            this.method472(false);
            ++super.field20;
            if (super.field20 > 4500) {
                this.field1700 = 250;
                super.field20 -= 500;
                this.field1287.method218(194, (byte) 19);
            }
            ++this.field1380;
            if (this.field1380 > 500) {
                this.field1380 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1323 += this.field1324;
                }
                if ((var30 & 2) == 2) {
                    this.field1701 += this.field1702;
                }
                if ((var30 & 4) == 4) {
                    this.field1270 += this.field1271;
                }
            }
            if (this.field1323 < -50) {
                this.field1324 = 2;
            }
            if (this.field1323 > 50) {
                this.field1324 = -2;
            }
            if (this.field1701 < -55) {
                this.field1702 = 2;
            }
            if (this.field1701 > 55) {
                this.field1702 = -2;
            }
            if (this.field1270 < -40) {
                this.field1271 = 1;
            }
            if (this.field1270 > 40) {
                this.field1271 = -1;
            }
            ++this.field1285;
            if (this.field1285 > 500) {
                this.field1285 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1364 += this.field1365;
                }
                if ((var31 & 2) == 2) {
                    this.field1675 += this.field1676;
                }
            }
            if (this.field1364 < -60) {
                this.field1365 = 2;
            }
            if (this.field1364 > 60) {
                this.field1365 = -2;
            }
            if (this.field1675 < -20) {
                this.field1676 = 1;
            }
            if (this.field1675 > 10) {
                this.field1676 = -1;
            }
            ++this.field1699;
            if (arg0 == 5) {
                boolean var32 = false;
            } else {
                this.field1697 = this.field1404.method229();
            }
            if (this.field1699 > 50) {
                this.field1287.method218(62, (byte) 19);
            }
            try {
                if (this.field1691 != null && this.field1287.field716 > 0) {
                    this.field1691.method42(true, this.field1287.field715, this.field1287.field716, 0);
                    this.field1287.field716 = 0;
                    this.field1699 = 0;
                }
            } catch (IOException var34) {
                this.method446(this.field1347);
            } catch (Exception var35) {
                this.method468((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lgc;IIII)V")
    public final void method442(NpcType arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1674 < 400) {
            if (arg0.field1043 != null) {
                arg0 = arg0.method345(this.field1580);
            }
            if (arg0 != null) {
                String var6 = arg0.field1018;
                if (arg3 > 0) {
                    if (arg0.field1035 != 0) {
                        var6 = var6 + method533(field1396.field469, false, arg0.field1035) + " (level-" + arg0.field1035 + ")";
                    }
                    if (this.field1504 == 1) {
                        this.field1719[this.field1674] = "Use " + this.field1508 + " with @yel@" + var6;
                        this.field1401[this.field1674] = 829;
                        this.field1402[this.field1674] = arg2;
                        this.field1399[this.field1674] = arg4;
                        this.field1400[this.field1674] = arg1;
                        ++this.field1674;
                    } else {
                        if (this.field1581 == 1) {
                            if ((this.field1583 & 2) == 2) {
                                this.field1719[this.field1674] = this.field1584 + " @yel@" + var6;
                                this.field1401[this.field1674] = 240;
                                this.field1402[this.field1674] = arg2;
                                this.field1399[this.field1674] = arg4;
                                this.field1400[this.field1674] = arg1;
                                ++this.field1674;
                                return;
                            }
                        } else {
                            if (arg0.field1030 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg0.field1030[var7] != null && !arg0.field1030[var7].equalsIgnoreCase("attack")) {
                                        this.field1719[this.field1674] = arg0.field1030[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field1401[this.field1674] = 242;
                                        }
                                        if (var7 == 1) {
                                            this.field1401[this.field1674] = 209;
                                        }
                                        if (var7 == 2) {
                                            this.field1401[this.field1674] = 309;
                                        }
                                        if (var7 == 3) {
                                            this.field1401[this.field1674] = 852;
                                        }
                                        if (var7 == 4) {
                                            this.field1401[this.field1674] = 793;
                                        }
                                        this.field1402[this.field1674] = arg2;
                                        this.field1399[this.field1674] = arg4;
                                        this.field1400[this.field1674] = arg1;
                                        ++this.field1674;
                                    }
                                }
                            }
                            if (arg0.field1030 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg0.field1030[var8] != null && arg0.field1030[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg0.field1035 > field1396.field469) {
                                            var9 = 2000;
                                        }
                                        this.field1719[this.field1674] = arg0.field1030[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field1401[this.field1674] = var9 + 242;
                                        }
                                        if (var8 == 1) {
                                            this.field1401[this.field1674] = var9 + 209;
                                        }
                                        if (var8 == 2) {
                                            this.field1401[this.field1674] = var9 + 309;
                                        }
                                        if (var8 == 3) {
                                            this.field1401[this.field1674] = var9 + 852;
                                        }
                                        if (var8 == 4) {
                                            this.field1401[this.field1674] = var9 + 793;
                                        }
                                        this.field1402[this.field1674] = arg2;
                                        this.field1399[this.field1674] = arg4;
                                        this.field1400[this.field1674] = arg1;
                                        ++this.field1674;
                                    }
                                }
                            }
                            this.field1719[this.field1674] = "Examine @yel@" + var6;
                            this.field1401[this.field1674] = 1714;
                            this.field1402[this.field1674] = arg2;
                            this.field1399[this.field1674] = arg4;
                            this.field1400[this.field1674] = arg1;
                            ++this.field1674;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method443(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1308; ++var4) {
            int var6 = this.field1309[var4];
            NpcEntity var7 = this.field1629[var6];
            int var8 = arg0.method229();
            if ((var8 & 1) == 1) {
                int var9 = arg0.method229();
                int var10 = arg0.method229();
                var7.method114((byte) -50, var9, var10, field1403);
                var7.field420 = field1403 + 300;
                var7.field421 = arg0.method229();
                var7.field422 = arg0.method229();
            }
            if ((var8 & 2) == 2) {
                int var11 = arg0.method231();
                if (var11 == 65535) {
                    var11 = -1;
                }
                if (var7.field429 == var11) {
                    var7.field433 = 0;
                }
                int var12 = arg0.method229();
                if (var7.field429 == var11 && var11 != -1) {
                    int var13 = SeqType.field1155[var11].field1169;
                    if (var13 == 1) {
                        var7.field430 = 0;
                        var7.field431 = 0;
                        var7.field432 = var12;
                        var7.field433 = 0;
                    }
                    if (var13 == 2) {
                        var7.field433 = 0;
                    }
                } else if (var11 == -1 || var7.field429 == -1 || SeqType.field1155[var11].field1163 >= SeqType.field1155[var7.field429].field1163) {
                    var7.field429 = var11;
                    var7.field430 = 0;
                    var7.field431 = 0;
                    var7.field432 = var12;
                    var7.field433 = 0;
                    var7.field455 = var7.field450;
                }
            }
            if ((var8 & 4) == 4) {
                var7.field423 = arg0.method231();
                if (var7.field423 == 65535) {
                    var7.field423 = -1;
                }
            }
            if ((var8 & 8) == 8) {
                var7.field413 = arg0.method236();
                var7.field414 = 100;
            }
            if ((var8 & 16) == 16) {
                int var14 = arg0.method229();
                int var15 = arg0.method229();
                var7.method114((byte) -50, var14, var15, field1403);
                var7.field420 = field1403 + 300;
                var7.field421 = arg0.method229();
                var7.field422 = arg0.method229();
            }
            if ((var8 & 32) == 32) {
                var7.field458 = NpcType.method341(arg0.method231());
                var7.field405 = var7.field458.field1020;
                var7.field449 = var7.field458.field1042;
                var7.field408 = var7.field458.field1024;
                var7.field409 = var7.field458.field1025;
                var7.field410 = var7.field458.field1026;
                var7.field411 = var7.field458.field1027;
                var7.field406 = var7.field458.field1023;
            }
            if ((var8 & 64) == 64) {
                var7.field434 = arg0.method231();
                int var16 = arg0.method234();
                var7.field438 = var16 >> 16;
                var7.field437 = (var16 & 65535) + field1403;
                var7.field435 = 0;
                var7.field436 = 0;
                if (var7.field437 > field1403) {
                    var7.field435 = -1;
                }
                if (var7.field434 == 65535) {
                    var7.field434 = -1;
                }
            }
            if ((var8 & 128) == 128) {
                var7.field424 = arg0.method231();
                var7.field425 = arg0.method231();
            }
        }
        if (this.field1549 != arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        if (this.field1504 == 0 && this.field1581 == 0) {
            this.field1719[this.field1674] = "Walk here";
            this.field1401[this.field1674] = 718;
            this.field1399[this.field1674] = super.field22;
            this.field1400[this.field1674] = super.field23;
            ++this.field1674;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field608; ++var3) {
            int var4 = Model.field609[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1253.method80(this.field1487, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method330(var8);
                    if (var9.field992 != null) {
                        var9 = var9.method338((byte) 4);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field1504 == 1) {
                        this.field1719[this.field1674] = "Use " + this.field1508 + " with @cya@" + var9.field961;
                        this.field1401[this.field1674] = 810;
                        this.field1402[this.field1674] = var4;
                        this.field1399[this.field1674] = var5;
                        this.field1400[this.field1674] = var6;
                        ++this.field1674;
                    } else if (this.field1581 == 1) {
                        if ((this.field1583 & 4) == 4) {
                            this.field1719[this.field1674] = this.field1584 + " @cya@" + var9.field961;
                            this.field1401[this.field1674] = 899;
                            this.field1402[this.field1674] = var4;
                            this.field1399[this.field1674] = var5;
                            this.field1400[this.field1674] = var6;
                            ++this.field1674;
                        }
                    } else {
                        if (var9.field977 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field977[var10] != null) {
                                    this.field1719[this.field1674] = var9.field977[var10] + " @cya@" + var9.field961;
                                    if (var10 == 0) {
                                        this.field1401[this.field1674] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1401[this.field1674] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1401[this.field1674] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1401[this.field1674] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1401[this.field1674] = 1071;
                                    }
                                    this.field1402[this.field1674] = var4;
                                    this.field1399[this.field1674] = var5;
                                    this.field1400[this.field1674] = var6;
                                    ++this.field1674;
                                }
                            }
                        }
                        this.field1719[this.field1674] = "Examine @cya@" + var9.field961;
                        this.field1401[this.field1674] = 1381;
                        this.field1402[this.field1674] = var9.field958 << 14;
                        this.field1399[this.field1674] = var5;
                        this.field1400[this.field1674] = var6;
                        ++this.field1674;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1629[var8];
                    if (var11.field458.field1020 == 1 && (var11.field401 & 127) == 64 && (var11.field402 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1630; ++var12) {
                            NpcEntity var15 = this.field1629[this.field1631[var12]];
                            if (var15 != null && var11 != var15 && var15.field458.field1020 == 1 && var11.field401 == var15.field401 && var11.field402 == var15.field402) {
                                this.method442(var15.field458, var6, this.field1631[var12], 924, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1306; ++var13) {
                            PlayerEntity var14 = this.field1305[this.field1307[var13]];
                            if (var14 != null && var11.field401 == var14.field401 && var11.field402 == var14.field402) {
                                this.method469(var6, var5, this.field1307[var13], var14, 225);
                            }
                        }
                    }
                    this.method442(var11.field458, var6, var8, 924, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1305[var8];
                    if ((var16.field401 & 127) == 64 && (var16.field402 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1630; ++var17) {
                            NpcEntity var20 = this.field1629[this.field1631[var17]];
                            if (var20 != null && var20.field458.field1020 == 1 && var16.field401 == var20.field401 && var16.field402 == var20.field402) {
                                this.method442(var20.field458, var6, this.field1631[var17], 924, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1306; ++var18) {
                            PlayerEntity var19 = this.field1305[this.field1307[var18]];
                            if (var19 != null && var16 != var19 && var16.field401 == var19.field401 && var16.field402 == var19.field402) {
                                this.method469(var6, var5, this.field1307[var18], var19, 225);
                            }
                        }
                    }
                    this.method469(var6, var5, var8, var16, 225);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1473[this.field1487][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method249(6); var22 != null; var22 = (ObjStackEntity) var21.method251(-921)) {
                            ObjType var23 = ObjType.method348(var22.field503);
                            if (this.field1504 == 1) {
                                this.field1719[this.field1674] = "Use " + this.field1508 + " with @lre@" + var23.field1059;
                                this.field1401[this.field1674] = 111;
                                this.field1402[this.field1674] = var22.field503;
                                this.field1399[this.field1674] = var5;
                                this.field1400[this.field1674] = var6;
                                ++this.field1674;
                            } else if (this.field1581 == 1) {
                                if ((this.field1583 & 1) == 1) {
                                    this.field1719[this.field1674] = this.field1584 + " @lre@" + var23.field1059;
                                    this.field1401[this.field1674] = 370;
                                    this.field1402[this.field1674] = var22.field503;
                                    this.field1399[this.field1674] = var5;
                                    this.field1400[this.field1674] = var6;
                                    ++this.field1674;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1073 != null && var23.field1073[var24] != null) {
                                        this.field1719[this.field1674] = var23.field1073[var24] + " @lre@" + var23.field1059;
                                        if (var24 == 0) {
                                            this.field1401[this.field1674] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1401[this.field1674] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1401[this.field1674] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1401[this.field1674] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1401[this.field1674] = 662;
                                        }
                                        this.field1402[this.field1674] = var22.field503;
                                        this.field1399[this.field1674] = var5;
                                        this.field1400[this.field1674] = var6;
                                        ++this.field1674;
                                    } else if (var24 == 2) {
                                        this.field1719[this.field1674] = "Take @lre@" + var23.field1059;
                                        this.field1401[this.field1674] = 617;
                                        this.field1402[this.field1674] = var22.field503;
                                        this.field1399[this.field1674] = var5;
                                        this.field1400[this.field1674] = var6;
                                        ++this.field1674;
                                    }
                                }
                                this.field1719[this.field1674] = "Examine @lre@" + var23.field1059;
                                this.field1401[this.field1674] = 1152;
                                this.field1402[this.field1674] = var22.field503;
                                this.field1399[this.field1674] = var5;
                                this.field1400[this.field1674] = var6;
                                ++this.field1674;
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.field1415 = 147;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1264.method199(arg2, arg1, -47687);
        this.field1265.method199(arg2 + arg5 - 16, arg1, -47687);
        Pix2D.method157(false, arg1, 16, this.field1627, arg2 + 16, arg5 - 32);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg3 / (arg4 - arg5);
        Pix2D.method157(false, arg1, 16, this.field1545, arg2 + 16 + var8, var7);
        Pix2D.method162(var7, this.field1695, arg2 + 16 + var8, -825, arg1);
        Pix2D.method162(var7, this.field1695, arg2 + 16 + var8, -825, arg1 + 1);
        Pix2D.method160(arg2 + 16 + var8, 16, false, arg1, this.field1695);
        Pix2D.method160(arg2 + 17 + var8, 16, false, arg1, this.field1695);
        Pix2D.method162(var7, this.field1457, arg2 + 16 + var8, -825, arg1 + 15);
        Pix2D.method162(var7 - 1, this.field1457, arg2 + 17 + var8, -825, arg1 + 14);
        Pix2D.method160(arg2 + 15 + var8 + var7, 16, false, arg1, this.field1457);
        if (arg0 != -18981) {
            this.field1357 = !this.field1357;
        }
        Pix2D.method160(arg2 + 14 + var8 + var7, 15, false, arg1 + 1, this.field1457);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method446(int arg0) {
        if (this.field1700 > 0) {
            this.method468((byte) 0);
        } else {
            this.field1668.method258(this.field1337);
            this.field1470.method202(0, 144, true, 257, "Connection lost");
            this.field1470.method202(16777215, 143, true, 256, "Connection lost");
            this.field1470.method202(0, 159, true, 257, "Please wait - attempting to reestablish");
            this.field1470.method202(16777215, 158, true, 256, "Please wait - attempting to reestablish");
            this.field1668.method259(4, -183, 4, super.field14);
            this.field1533 = 0;
            this.field1706 = 0;
            ClientStream var2 = this.field1691;
            this.field1645 = false;
            while (arg0 >= 0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            this.field1502 = 0;
            this.method521(this.field1292, this.field1293, true);
            if (!this.field1645) {
                this.method468((byte) 0);
            }
            try {
                var2.method38();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIII)V")
    public final void method447(Component arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field79 == 0 && arg0.field94 != null) {
            if (!arg0.field93 || this.field1416 == arg0.field77 || this.field1320 == arg0.field77 || this.field1458 == arg0.field77) {
                int var6 = Pix2D.field637;
                int var7 = Pix2D.field635;
                int var8 = Pix2D.field638;
                int var9 = Pix2D.field636;
                Pix2D.method154(arg1, arg0.field83 + arg3, arg0.field82 + arg1, arg3, -227);
                int var10 = arg0.field94.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field95[var11] + arg1;
                    int var13 = arg0.field96[var11] + arg3 - arg2;
                    Component var14 = Component.field72[arg0.field94[var11]];
                    int var15 = var14.field85 + var12;
                    int var16 = var14.field86 + var13;
                    if (var14.field81 > 0) {
                        this.method559(this.field1288, var14);
                    }
                    if (var14.field79 == 0) {
                        if (var14.field92 > var14.field91 - var14.field83) {
                            var14.field92 = var14.field91 - var14.field83;
                        }
                        if (var14.field92 < 0) {
                            var14.field92 = 0;
                        }
                        this.method447(var14, var15, var14.field92, var16, -23258);
                        if (var14.field91 > var14.field83) {
                            this.method445(-18981, var14.field82 + var15, var16, var14.field92, var14.field91, var14.field83);
                        }
                    } else if (var14.field79 != 1) {
                        if (var14.field79 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field83; ++var18) {
                                for (int var19 = 0; var19 < var14.field82; ++var19) {
                                    int var20 = (var14.field103 + 32) * var19 + var15;
                                    int var21 = (var14.field104 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field106[var17];
                                        var21 += var14.field107[var17];
                                    }
                                    if (var14.field73[var17] <= 0) {
                                        if (var14.field105 != null && var17 < 20) {
                                            Pix32 var30 = var14.field105[var17];
                                            if (var30 != null) {
                                                var30.method186(var21, var20, -47687);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field73[var17] - 1;
                                        if (var20 > Pix2D.field637 - 32 && var20 < Pix2D.field638 && var21 > Pix2D.field635 - 32 && var21 < Pix2D.field636 || this.field1683 != 0 && this.field1682 == var17) {
                                            int var25 = 0;
                                            if (this.field1504 == 1 && this.field1505 == var17 && this.field1506 == var14.field77) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(var24, var14.field74[var17], var25, -325);
                                            if (var26 != null) {
                                                if (this.field1683 != 0 && this.field1682 == var17 && this.field1681 == var14.field77) {
                                                    var22 = super.field22 - this.field1684;
                                                    var23 = super.field23 - this.field1685;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1588 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method188(0, var20 + var22, var21 + var23, 128);
                                                    if (var21 + var23 < Pix2D.field635 && arg0.field92 > 0) {
                                                        int var27 = (Pix2D.field635 - var21 - var23) * this.field1263 / 3;
                                                        if (var27 > this.field1263 * 10) {
                                                            var27 = this.field1263 * 10;
                                                        }
                                                        if (var27 > arg0.field92) {
                                                            var27 = arg0.field92;
                                                        }
                                                        arg0.field92 -= var27;
                                                        this.field1685 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field636 && arg0.field92 < arg0.field91 - arg0.field83) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field636) * this.field1263 / 3;
                                                        if (var28 > this.field1263 * 10) {
                                                            var28 = this.field1263 * 10;
                                                        }
                                                        if (var28 > arg0.field91 - arg0.field83 - arg0.field92) {
                                                            var28 = arg0.field91 - arg0.field83 - arg0.field92;
                                                        }
                                                        arg0.field92 += var28;
                                                        this.field1685 -= var28;
                                                    }
                                                } else if (this.field1715 != 0 && this.field1714 == var17 && this.field1713 == var14.field77) {
                                                    var26.method188(0, var20, var21, 128);
                                                } else {
                                                    var26.method186(var21, var20, -47687);
                                                }
                                                if (var26.field679 == 33 || var14.field74[var17] != 1) {
                                                    int var29 = var14.field74[var17];
                                                    this.field1469.method206(var20 + 1 + var22, method477((byte) 4, var29), -830, 0, var21 + 10 + var23);
                                                    this.field1469.method206(var20 + var22, method477((byte) 4, var29), -830, 16776960, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field79 == 3) {
                            boolean var31 = false;
                            if (this.field1458 == var14.field77 || this.field1320 == var14.field77 || this.field1416 == var14.field77) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method519(var14, this.field1703)) {
                                var32 = var14.field116;
                                if (var31 && var14.field118 != 0) {
                                    var32 = var14.field118;
                                }
                            } else {
                                var32 = var14.field115;
                                if (var31 && var14.field117 != 0) {
                                    var32 = var14.field117;
                                }
                            }
                            if (var14.field84 == 0) {
                                if (var14.field109) {
                                    Pix2D.method157(false, var15, var14.field82, var32, var16, var14.field83);
                                } else {
                                    Pix2D.method158(var32, var15, 0, var16, var14.field82, var14.field83);
                                }
                            } else if (var14.field109) {
                                Pix2D.method156(var14.field83, var16, var14.field82, var15, this.field1252, 256 - (var14.field84 & 255), var32);
                            } else {
                                Pix2D.method159(256 - (var14.field84 & 255), var14.field82, 3, var16, var15, var32, var14.field83);
                            }
                        } else if (var14.field79 == 4) {
                            PixFont var33 = var14.field112;
                            String var34 = var14.field113;
                            boolean var35 = false;
                            if (this.field1458 == var14.field77 || this.field1320 == var14.field77 || this.field1416 == var14.field77) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method519(var14, this.field1703)) {
                                var36 = var14.field116;
                                if (var35 && var14.field118 != 0) {
                                    var36 = var14.field118;
                                }
                                if (var14.field114.length() > 0) {
                                    var34 = var14.field114;
                                }
                            } else {
                                var36 = var14.field115;
                                if (var35 && var14.field117 != 0) {
                                    var36 = var14.field117;
                                }
                            }
                            if (var14.field80 == 6 && this.field1422) {
                                var34 = "Please wait...";
                                var36 = var14.field115;
                            }
                            if (Pix2D.field633 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field702 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method520(this.method448(4, true, var14), -495) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method520(this.method448(3, true, var14), -495) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method520(this.method448(2, true, var14), -495) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method520(this.method448(1, true, var14), -495) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method520(this.method448(0, true, var14), -495) + var34.substring(var38 + 2);
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
                                if (var14.field110) {
                                    var33.method203(var37, var36, var14.field111, var14.field82 / 2 + var15, this.field1624, var44);
                                } else {
                                    var33.method210(var44, var15, var14.field111, 654, var37, var36);
                                }
                                var37 += var33.field702;
                            }
                        } else if (var14.field79 == 5) {
                            Pix32 var45;
                            if (this.method519(var14, this.field1703)) {
                                var45 = var14.field120;
                            } else {
                                var45 = var14.field119;
                            }
                            if (var45 != null) {
                                var45.method186(var16, var15, -47687);
                            }
                        } else if (var14.field79 == 6) {
                            int var46 = Pix3D.field651;
                            int var47 = Pix3D.field652;
                            Pix3D.field651 = var14.field82 / 2 + var15;
                            Pix3D.field652 = var14.field83 / 2 + var16;
                            int var48 = Pix3D.field655[var14.field128] * var14.field127 >> 16;
                            int var49 = Pix3D.field656[var14.field128] * var14.field127 >> 16;
                            boolean var50 = this.method519(var14, this.field1703);
                            int var51;
                            if (var50) {
                                var51 = var14.field126;
                            } else {
                                var51 = var14.field125;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, true, var50, -1);
                            } else {
                                SeqType var53 = SeqType.field1155[var51];
                                var52 = var14.method34(var53.field1158[var14.field75], true, var50, var53.field1157[var14.field75]);
                            }
                            if (var52 != null) {
                                var52.method146(0, var14.field129, 0, var14.field128, 0, var48, var49);
                            }
                            Pix3D.field651 = var46;
                            Pix3D.field652 = var47;
                        } else if (var14.field79 == 7) {
                            PixFont var54 = var14.field112;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field83; ++var56) {
                                for (int var57 = 0; var57 < var14.field82; ++var57) {
                                    if (var14.field73[var55] > 0) {
                                        ObjType var58 = ObjType.method348(var14.field73[var55] - 1);
                                        String var59 = var58.field1059;
                                        if (var58.field1070 || var14.field74[var55] != 1) {
                                            var59 = var59 + " x" + method478(var14.field74[var55], true);
                                        }
                                        int var60 = (var14.field103 + 115) * var57 + var15;
                                        int var61 = (var14.field104 + 12) * var56 + var16;
                                        if (var14.field110) {
                                            var54.method203(var61, var14.field115, var14.field111, var14.field82 / 2 + var60, this.field1624, var59);
                                        } else {
                                            var54.method210(var59, var60, var14.field111, 654, var61, var14.field115);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                if (arg4 != -23258) {
                    this.field1370 = -299;
                }
                Pix2D.method154(var6, var9, var8, var7, -227);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLd;)I")
    public final int method448(int arg0, boolean arg1, Component arg2) {
        if (!arg1) {
            this.field1287.method219(162);
        }
        if (arg2.field87 != null && arg0 < arg2.field87.length) {
            try {
                int[] var4 = arg2.field87[arg0];
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
                        var9 = this.field1503[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1637[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1594[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field72[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1051 && (!ObjType.method348(var12).field1072 || field1343)) {
                            for (int var13 = 0; var13 < var11.field73.length; ++var13) {
                                if (var12 + 1 == var11.field73[var13]) {
                                    var9 += var11.field74[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1249[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1455[this.field1637[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1249[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1396.field469;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1172; ++var14) {
                            if (Stats.field1174[var14]) {
                                var9 += this.field1637[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field72[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1051 && (!ObjType.method348(var16).field1072 || field1343)) {
                            for (int var17 = 0; var17 < var15.field73.length; ++var17) {
                                if (var15.field73[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1513;
                    }
                    if (var8 == 12) {
                        var9 = this.field1369;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1249[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1192[var20];
                        int var22 = var21.field1194;
                        int var23 = var21.field1195;
                        int var24 = var21.field1196;
                        int var25 = field1379[var24 - var23];
                        var9 = this.field1249[var22] >> var23 & var25;
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
                        var9 = (field1396.field401 >> 7) + this.field1568;
                    }
                    if (var8 == 19) {
                        var9 = (field1396.field402 >> 7) + this.field1569;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method449(int arg0) {
        for (int var2 = -1; var2 < this.field1306; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field1304;
            } else {
                var7 = this.field1307[var2];
            }
            PlayerEntity var8 = this.field1305[var7];
            if (var8 != null && var8.field414 > 0) {
                --var8.field414;
                if (var8.field414 == 0) {
                    var8.field413 = null;
                }
            }
        }
        int var3 = 59 / arg0;
        for (int var4 = 0; var4 < this.field1630; ++var4) {
            int var5 = this.field1631[var4];
            NpcEntity var6 = this.field1629[var5];
            if (var6 != null && var6.field414 > 0) {
                --var6.field414;
                if (var6.field414 == 0) {
                    var6.field413 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method450(byte arg0) {
        int var2 = this.field1442 * 128 + 64;
        int var3 = this.field1443 * 128 + 64;
        int var4 = this.method513(var3, true, var2, this.field1487) - this.field1444;
        if (this.field1431 < var2) {
            this.field1431 += (var2 - this.field1431) * this.field1446 / 1000 + this.field1445;
            if (this.field1431 > var2) {
                this.field1431 = var2;
            }
        }
        if (this.field1431 > var2) {
            this.field1431 -= (this.field1431 - var2) * this.field1446 / 1000 + this.field1445;
            if (this.field1431 < var2) {
                this.field1431 = var2;
            }
        }
        if (this.field1432 < var4) {
            this.field1432 += (var4 - this.field1432) * this.field1446 / 1000 + this.field1445;
            if (this.field1432 > var4) {
                this.field1432 = var4;
            }
        }
        if (this.field1432 > var4) {
            this.field1432 -= (this.field1432 - var4) * this.field1446 / 1000 + this.field1445;
            if (this.field1432 < var4) {
                this.field1432 = var4;
            }
        }
        if (this.field1433 < var3) {
            this.field1433 += (var3 - this.field1433) * this.field1446 / 1000 + this.field1445;
            if (this.field1433 > var3) {
                this.field1433 = var3;
            }
        }
        if (this.field1433 > var3) {
            this.field1433 -= (this.field1433 - var3) * this.field1446 / 1000 + this.field1445;
            if (this.field1433 < var3) {
                this.field1433 = var3;
            }
        }
        int var5 = this.field1244 * 128 + 64;
        int var6 = this.field1245 * 128 + 64;
        int var7 = this.method513(var6, true, var5, this.field1487) - this.field1246;
        if (arg0 != 7) {
            this.field1697 = -1;
        }
        int var8 = var5 - this.field1431;
        int var9 = var7 - this.field1432;
        int var10 = var6 - this.field1433;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1434 < var12) {
            this.field1434 += (var12 - this.field1434) * this.field1248 / 1000 + this.field1247;
            if (this.field1434 > var12) {
                this.field1434 = var12;
            }
        }
        if (this.field1434 > var12) {
            this.field1434 -= (this.field1434 - var12) * this.field1248 / 1000 + this.field1247;
            if (this.field1434 < var12) {
                this.field1434 = var12;
            }
        }
        int var14 = var13 - this.field1435;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1435 += this.field1248 * var14 / 1000 + this.field1247;
            this.field1435 &= 2047;
        }
        if (var14 < 0) {
            this.field1435 -= -var14 * this.field1248 / 1000 + this.field1247;
            this.field1435 &= 2047;
        }
        int var15 = var13 - this.field1435;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1435 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method451(int arg0) {
        try {
            this.field1277 = -1;
            this.field1267.method252();
            this.field1693.method252();
            Pix3D.method167(14956);
            this.method466(false);
            this.field1253.method50((byte) 0);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1636[var2].method359((byte) 97);
            }
            System.gc();
            World var3 = new World(this.field1316, 104, 104, this.field1718, this.field1284);
            int var4 = this.field1438.length;
            World.field44 = World3D.field289;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1313[var5] >> 8;
                int var7 = this.field1313[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field44 = false;
                }
            }
            if (World.field44) {
                this.field1253.method51(this.field1487, 0);
            } else {
                this.field1253.method51(0, 0);
            }
            this.field1287.method218(62, (byte) 19);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1313[var8] >> 8) * 64 - this.field1568;
                int var10 = (this.field1313[var8] & 255) * 64 - this.field1569;
                byte[] var11 = this.field1438[var8];
                if (var11 != null) {
                    var3.method15(var11, var10, 416, var9, (this.field1389 - 6) * 8, (this.field1390 - 6) * 8);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1313[var12] >> 8) * 64 - this.field1568;
                int var14 = (this.field1313[var12] & 255) * 64 - this.field1569;
                byte[] var15 = this.field1438[var12];
                if (var15 == null && this.field1390 < 800) {
                    var3.method14(0, var13, 64, 64, var14);
                }
            }
            this.field1287.method218(62, (byte) 19);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1574[var16];
                if (var17 != null) {
                    int var18 = (this.field1313[var16] >> 8) * 64 - this.field1568;
                    int var19 = (this.field1313[var16] & 255) * 64 - this.field1569;
                    var3.method18((byte) 92, this.field1253, var17, var19, this.field1636, var18);
                }
            }
            this.field1287.method218(62, (byte) 19);
            var3.method20(this.field1636, this.field1499, this.field1253);
            this.field1668.method258(this.field1337);
            this.field1287.method218(62, (byte) 19);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method470(var20, var21);
                }
            }
            this.method484((byte) 3);
        } catch (Exception var34) {
        }
        LocType.field995.method103();
        if (field1344 && signlink.cache_dat != null) {
            int var23 = this.field1368.method272(0, 921);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1368.method277(var24, 0);
                if ((var25 & 121) == 0) {
                    Model.method125(var24, -37);
                }
            }
        }
        System.gc();
        Pix3D.method168(field1456, 20);
        this.field1368.method283(true);
        int var26 = (this.field1389 - 6) / 8 - 1;
        int var27 = (this.field1389 + 6) / 8 + 1;
        int var28 = (this.field1390 - 6) / 8 - 1;
        int var29 = (this.field1390 + 6) / 8 + 1;
        if (arg0 != 44043) {
            this.field1473 = null;
        }
        if (this.field1619) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1368.method274(0, var30, var31, field1593);
                    if (var32 != -1) {
                        this.field1368.method284(0, var32, 3);
                    }
                    int var33 = this.field1368.method274(1, var30, var31, field1593);
                    if (var33 != -1) {
                        this.field1368.method284(0, var33, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 != 0) {
            this.field1697 = -1;
        }
        this.field1367 = 0;
        int var2 = (field1396.field401 >> 7) + this.field1568;
        int var3 = (field1396.field402 >> 7) + this.field1569;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1367 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1367 = 1;
        }
        if (this.field1367 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1367 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method453(boolean arg0, boolean arg1) {
        if (field1396.field401 >> 7 == this.field1706 && field1396.field402 >> 7 == this.field1707) {
            this.field1706 = 0;
            ++field1596;
            if (field1596 > 122) {
                field1596 = 0;
                this.field1287.method218(168, (byte) 19);
                this.field1287.method219(62);
            }
        }
        int var3 = this.field1306;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1396;
                var6 = this.field1304 << 14;
            } else {
                var5 = this.field1305[this.field1307[var4]];
                var6 = this.field1307[var4] << 14;
            }
            if (var5 != null && var5.method113((byte) -120)) {
                var5.field483 = false;
                if ((field1344 && this.field1306 > 50 || this.field1306 > 200) && !arg0 && var5.field426 == var5.field406) {
                    var5.field483 = true;
                }
                int var7 = var5.field401 >> 7;
                int var8 = var5.field402 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field478 != null && field1403 >= var5.field473 && field1403 < var5.field474) {
                        var5.field483 = false;
                        var5.field472 = this.method513(var5.field402, true, var5.field401, this.field1487);
                        this.field1253.method62(var5.field481, var5, var5.field472, var5.field402, -44671, var5.field479, var5.field401, var6, var5.field480, var5.field482, 60, this.field1487, var5.field403);
                    } else {
                        if ((var5.field401 & 127) == 64 && (var5.field402 & 127) == 64) {
                            if (this.field1501[var7][var8] == this.field1378) {
                                continue;
                            }
                            this.field1501[var7][var8] = this.field1378;
                        }
                        var5.field472 = this.method513(var5.field402, true, var5.field401, this.field1487);
                        this.field1253.method61(var5.field403, 60, -27991, var5.field472, var5.field404, var5, this.field1487, var5.field402, var6, var5.field401);
                    }
                }
            }
        }
        if (arg1) {
            this.field1647 = !this.field1647;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method454(int arg0, int arg1, Packet arg2) {
        arg2.method239(-35838);
        int var4 = arg2.method240(1, 0);
        while (arg0 >= 0) {
        }
        if (var4 != 0) {
            int var5 = arg2.method240(2, 0);
            if (var5 == 0) {
                this.field1309[this.field1308++] = this.field1304;
            } else if (var5 == 1) {
                int var6 = arg2.method240(3, 0);
                field1396.method111(0, false, var6);
                int var7 = arg2.method240(1, 0);
                if (var7 == 1) {
                    this.field1309[this.field1308++] = this.field1304;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method240(3, 0);
                field1396.method111(0, true, var8);
                int var9 = arg2.method240(3, 0);
                field1396.method111(0, true, var9);
                int var10 = arg2.method240(1, 0);
                if (var10 == 1) {
                    this.field1309[this.field1308++] = this.field1304;
                }
            } else if (var5 == 3) {
                this.field1487 = arg2.method240(2, 0);
                int var11 = arg2.method240(7, 0);
                int var12 = arg2.method240(7, 0);
                int var13 = arg2.method240(1, 0);
                field1396.method110(var12, -415, var13 == 1, var11);
                int var14 = arg2.method240(1, 0);
                if (var14 == 1) {
                    this.field1309[this.field1308++] = this.field1304;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field1342 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method455(int arg0) {
        byte[] var2 = this.field1236.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1409.method258(this.field1337);
        var3.method184(false, 0, 0);
        this.field1410.method258(this.field1337);
        var3.method184(false, -637, 0);
        this.field1406.method258(this.field1337);
        var3.method184(false, -128, 0);
        this.field1407.method258(this.field1337);
        var3.method184(false, -202, -371);
        this.field1408.method258(this.field1337);
        var3.method184(false, -202, -171);
        this.field1411.method258(this.field1337);
        var3.method184(false, 0, -265);
        this.field1412.method258(this.field1337);
        var3.method184(false, -562, -265);
        this.field1413.method258(this.field1337);
        var3.method184(false, -128, -171);
        this.field1414.method258(this.field1337);
        var3.method184(false, -562, -171);
        int[] var4 = new int[var3.field675];
        for (int var5 = 0; var5 < var3.field676; ++var5) {
            for (int var10 = 0; var10 < var3.field675; ++var10) {
                var4[var10] = var3.field674[var3.field675 * var5 + (var3.field675 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field675; ++var11) {
                var3.field674[var3.field675 * var5 + var11] = var4[var11];
            }
        }
        this.field1409.method258(this.field1337);
        var3.method184(false, 382, 0);
        this.field1410.method258(this.field1337);
        if (arg0 >= 0) {
            field1604 = 191;
        }
        var3.method184(false, -255, 0);
        this.field1406.method258(this.field1337);
        var3.method184(false, 254, 0);
        this.field1407.method258(this.field1337);
        var3.method184(false, 180, -371);
        this.field1408.method258(this.field1337);
        var3.method184(false, 180, -171);
        this.field1411.method258(this.field1337);
        var3.method184(false, 382, -265);
        this.field1412.method258(this.field1337);
        var3.method184(false, -180, -265);
        this.field1413.method258(this.field1337);
        var3.method184(false, 254, -171);
        this.field1414.method258(this.field1337);
        var3.method184(false, -180, -171);
        Pix32 var6 = new Pix32(this.field1236, "logo", 0);
        this.field1406.method258(this.field1337);
        var6.method186(18, 382 - var6.field675 / 2 - 128, -47687);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public static final void method456(int arg0) {
        while (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        World3D.field289 = true;
        Pix3D.field646 = true;
        field1344 = true;
        World.field44 = true;
        LocType.field951 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method457(boolean arg0) {
        this.field1287.method218(153, (byte) 19);
        if (this.field1419 != -1) {
            this.field1419 = -1;
            this.field1395 = true;
            this.field1422 = false;
            this.field1516 = true;
        }
        if (this.field1612 != -1) {
            this.field1612 = -1;
            this.field1349 = true;
            this.field1422 = false;
        }
        this.field1339 = -1;
        if (arg0) {
            this.field1711 = this.field1338.method295();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILib;)V")
    public final void method458(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = arg1 * arg1 + arg2 * arg2;
        int var6 = 77 / arg0;
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field1364 + this.field1360 & 2047;
            int var8 = Model.field610[var7];
            int var9 = Model.field611[var7];
            int var10 = var8 * 256 / (this.field1675 + 256);
            int var11 = var9 * 256 / (this.field1675 + 256);
            int var12 = arg1 * var10 + arg2 * var11 >> 16;
            int var13 = arg1 * var11 - arg2 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field1358.method191(15, 15, 256, (byte) 4, 20, var16 + 94 + 4 - 10, 20, var14, 83 - var17 - 20);
        } else {
            this.method438(arg3, arg2, 0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method459(byte arg0) {
        if (arg0 != 4) {
            this.field1473 = null;
        }
        while (true) {
            OnDemandRequest var2 = this.field1368.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field729 == 0) {
                Model.method124(var2.field731, var2.field730, this.field1468);
                if ((this.field1368.method277(var2.field730, 0) & 98) != 0) {
                    this.field1395 = true;
                    if (this.field1612 != -1) {
                        this.field1349 = true;
                    }
                }
            }
            if (var2.field729 == 1 && var2.field731 != null) {
                AnimFrame.method45(958, var2.field731);
            }
            if (var2.field729 == 2 && this.field1485 == var2.field730 && var2.field731 != null) {
                this.method527((byte) 22, var2.field731, this.field1486);
            }
            if (var2.field729 == 3 && this.field1405 == 1) {
                for (int var3 = 0; var3 < this.field1438.length; ++var3) {
                    if (this.field1314[var3] == var2.field730) {
                        this.field1438[var3] = var2.field731;
                        if (var2.field731 == null) {
                            this.field1314[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1315[var3] == var2.field730) {
                        this.field1574[var3] = var2.field731;
                        if (var2.field731 == null) {
                            this.field1315[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field729 == 93 && this.field1368.method276(this.field1415, var2.field730)) {
                World.method17(this.field1368, (byte) 4, new Packet(false, var2.field731));
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 300);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1341 = Integer.parseInt(arg0[0]);
                field1342 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method456(-47);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method509(true);
                }
                if (arg0[3].equals("free")) {
                    field1343 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1343 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 503, 373);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method460(int arg0) {
        if (this.field1669 == null) {
            this.method561(8);
            super.field15 = null;
            int var2 = 32 / arg0;
            this.field1406 = null;
            this.field1407 = null;
            this.field1408 = null;
            this.field1409 = null;
            this.field1410 = null;
            this.field1411 = null;
            this.field1412 = null;
            this.field1413 = null;
            this.field1414 = null;
            this.field1669 = new PixMap(field1322, 479, 96, this.method11((byte) -114));
            this.field1667 = new PixMap(field1322, 172, 156, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1428.method199(0, 0, -47687);
            this.field1666 = new PixMap(field1322, 190, 261, this.method11((byte) -114));
            this.field1668 = new PixMap(field1322, 512, 334, this.method11((byte) -114));
            Pix2D.method155(17698);
            this.field1509 = new PixMap(field1322, 496, 50, this.method11((byte) -114));
            this.field1510 = new PixMap(field1322, 269, 37, this.method11((byte) -114));
            this.field1511 = new PixMap(field1322, 249, 45, this.method11((byte) -114));
            this.field1286 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IB)V")
    private final void method461(Packet arg0, int arg1, byte arg2) {
        if (arg2 != 6) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field1335 = 0;
        this.field1308 = 0;
        this.method454(-50, arg1, arg0);
        this.method516((byte) -109, arg0, arg1);
        this.method467(arg1, arg0, 4533);
        this.method526(arg0, arg1, -66);
        for (int var5 = 0; var5 < this.field1335; ++var5) {
            int var7 = this.field1336[var5];
            if (field1403 != this.field1305[var7].field446) {
                this.field1305[var7] = null;
            }
        }
        if (arg0.field716 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field716 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1306; ++var6) {
                if (this.field1305[this.field1307[var6]] == null) {
                    signlink.reporterror(this.field1292 + " null entry in pl list - pos:" + var6 + " size:" + this.field1306);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIB)Z")
    public final boolean method462(byte[] arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            this.field1329 = !this.field1329;
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1253.method76(arg0, arg5, arg1);
        if (var7 != 0) {
            int var8 = this.field1253.method80(arg0, arg5, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field1708.field674;
            int var13 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field979 != -1) {
                Pix8 var16 = this.field1577[var15.field979];
                if (var16 != null) {
                    int var17 = (var15.field965 * 4 - var16.field686) / 2;
                    int var18 = (var15.field966 * 4 - var16.field687) / 2;
                    var16.method199((104 - arg1 - var15.field966) * 4 + 48 + var18, arg5 * 4 + 48 + var17, -47687);
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
        int var19 = this.field1253.method78(arg0, arg5, arg1);
        if (arg3 >= 0) {
            this.field1548 = !this.field1548;
        }
        if (var19 != 0) {
            int var20 = this.field1253.method80(arg0, arg5, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field979 != -1) {
                Pix8 var25 = this.field1577[var24.field979];
                if (var25 != null) {
                    int var26 = (var24.field965 * 4 - var25.field686) / 2;
                    int var27 = (var24.field966 * 4 - var25.field687) / 2;
                    var25.method199((104 - arg1 - var24.field966) * 4 + 48 + var27, arg5 * 4 + 48 + var26, -47687);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1708.field674;
                int var30 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field1253.method79(arg0, arg5, arg1);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field979 != -1) {
                Pix8 var34 = this.field1577[var33.field979];
                if (var34 != null) {
                    int var35 = (var33.field965 * 4 - var34.field686) / 2;
                    int var36 = (var33.field966 * 4 - var34.field687) / 2;
                    var34.method199((104 - arg1 - var33.field966) * 4 + 48 + var36, arg5 * 4 + 48 + var35, -47687);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method464(int arg0) {
        if (arg0 <= 0) {
            this.field1697 = this.field1404.method229();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1691 != null) {
                this.field1691.method38();
            }
        } catch (Exception var2) {
        }
        this.field1691 = null;
        this.method464(598);
        if (this.field1383 != null) {
            this.field1383.field999 = false;
        }
        this.field1383 = null;
        this.field1368.method271();
        this.field1368 = null;
        this.field1287 = null;
        this.field1340 = null;
        this.field1404 = null;
        this.field1313 = null;
        this.field1438 = null;
        this.field1574 = null;
        this.field1314 = null;
        this.field1315 = null;
        this.field1718 = null;
        this.field1284 = null;
        this.field1253 = null;
        this.field1636 = null;
        this.field1614 = null;
        this.field1317 = null;
        this.field1495 = null;
        this.field1496 = null;
        this.field1420 = null;
        this.field1666 = null;
        this.field1667 = null;
        this.field1668 = null;
        this.field1669 = null;
        this.field1509 = null;
        this.field1510 = null;
        this.field1511 = null;
        this.field1524 = null;
        this.field1525 = null;
        this.field1526 = null;
        this.field1527 = null;
        this.field1528 = null;
        this.field1529 = null;
        this.field1530 = null;
        this.field1531 = null;
        this.field1532 = null;
        this.field1427 = null;
        this.field1428 = null;
        this.field1429 = null;
        this.field1597 = null;
        this.field1598 = null;
        this.field1599 = null;
        this.field1391 = null;
        this.field1605 = null;
        this.field1606 = null;
        this.field1607 = null;
        this.field1608 = null;
        this.field1609 = null;
        this.field1237 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field1241 = null;
        this.field1332 = null;
        this.field1595 = null;
        this.field1678 = null;
        if (arg0 != 28705) {
            this.field1697 = this.field1404.method229();
        }
        this.field1586 = null;
        this.field1279 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1282 = null;
        this.field1283 = null;
        this.field1577 = null;
        this.field1321 = null;
        this.field1501 = null;
        this.field1305 = null;
        this.field1307 = null;
        this.field1309 = null;
        this.field1310 = null;
        this.field1336 = null;
        this.field1629 = null;
        this.field1631 = null;
        this.field1473 = null;
        this.field1639 = null;
        this.field1693 = null;
        this.field1267 = null;
        this.field1399 = null;
        this.field1400 = null;
        this.field1401 = null;
        this.field1402 = null;
        this.field1719 = null;
        this.field1249 = null;
        this.field1538 = null;
        this.field1539 = null;
        this.field1566 = null;
        this.field1708 = null;
        this.field1381 = null;
        this.field1616 = null;
        this.field1652 = null;
        this.field1409 = null;
        this.field1410 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1408 = null;
        this.field1411 = null;
        this.field1412 = null;
        this.field1413 = null;
        this.field1414 = null;
        this.method561(8);
        LocType.method329(this.field1717);
        NpcType.method340(this.field1717);
        ObjType.method347(this.field1717);
        FloType.field1118 = null;
        IdkType.field1134 = null;
        Component.field72 = null;
        UnkType.field1142 = null;
        SeqType.field1155 = null;
        SpotAnimType.field1177 = null;
        SpotAnimType.field1189 = null;
        VarpType.field1201 = null;
        super.field15 = null;
        PlayerEntity.field487 = null;
        Pix3D.method164(this.field1717);
        World3D.method49(this.field1717);
        Model.method122(this.field1717);
        AnimFrame.method46(this.field1717);
        System.gc();
        if (Linkable.field368) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 < this.field1623 || arg4 > this.field1623) {
            this.field1473 = null;
        }
        if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
            if (field1344 && this.field1487 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field1253.method76(arg5, arg2, arg6);
            }
            if (arg7 == 1) {
                var9 = this.field1253.method77(arg6, arg2, arg5, 0);
            }
            if (arg7 == 2) {
                var9 = this.field1253.method78(arg5, arg2, arg6);
            }
            if (arg7 == 3) {
                var9 = this.field1253.method79(arg5, arg2, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field1253.method80(arg5, arg2, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field1253.method67(arg5, arg2, arg6, -2480);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field967) {
                        this.field1636[arg5].method364((byte) 0, arg2, arg6, var17.field968, var16, var15);
                    }
                }
                if (arg7 == 1) {
                    this.field1253.method68(arg5, arg6, -70, arg2);
                }
                if (arg7 == 2) {
                    this.field1253.method69(arg5, arg2, arg6, false);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field965 + arg2 > 103 || var18.field965 + arg6 > 103 || var18.field966 + arg2 > 103 || var18.field966 + arg6 > 103) {
                        return;
                    }
                    if (var18.field967) {
                        this.field1636[arg5].method365(var18.field968, arg2, var18.field966, var18.field965, arg6, var16, 997);
                    }
                }
                if (arg7 == 3) {
                    this.field1253.method70(482, arg5, arg2, arg6);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field967 && var19.field969) {
                        this.field1636[arg5].method367(arg2, arg6, 2);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field1284[1][arg2][arg6] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                World.method31(arg1, -44218, this.field1718, this.field1636[arg5], arg3, arg6, this.field1253, arg5, var20, arg0, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        LocType.field995.method103();
        LocType.field996.method103();
        NpcType.field1046.method103();
        ObjType.field1097.method103();
        if (arg0) {
            this.field1287.method219(17);
        }
        ObjType.field1098.method103();
        PlayerEntity.field487.method103();
        SpotAnimType.field1189.method103();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method467(int arg0, Packet arg1, int arg2) {
        if (arg2 != 4533) {
            this.field1697 = arg1.method229();
        }
        while (arg1.field717 + 10 < arg0 * 8) {
            int var4 = arg1.method240(11, 0);
            if (var4 == 2047) {
                break;
            }
            if (this.field1305[var4] == null) {
                this.field1305[var4] = new PlayerEntity();
                if (this.field1310[var4] != null) {
                    this.field1305[var4].method116(-990, this.field1310[var4]);
                }
            }
            this.field1307[this.field1306++] = var4;
            PlayerEntity var5 = this.field1305[var4];
            var5.field446 = field1403;
            int var6 = arg1.method240(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method240(5, 0);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method240(1, 0);
            var5.method110(field1396.field452[0] + var7, -415, var8 == 1, field1396.field451[0] + var6);
            int var9 = arg1.method240(1, 0);
            if (var9 == 1) {
                this.field1309[this.field1308++] = var4;
            }
        }
        arg1.method241(708);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method468(byte arg0) {
        if (arg0 != 0) {
            this.field1697 = -1;
        }
        try {
            if (this.field1691 != null) {
                this.field1691.method38();
            }
        } catch (Exception var3) {
        }
        this.field1691 = null;
        this.field1645 = false;
        this.field1372 = 0;
        this.field1292 = "";
        this.field1293 = "";
        this.method466(false);
        this.field1253.method50((byte) 0);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1636[var2].method359((byte) 97);
        }
        System.gc();
        this.method464(598);
        this.field1672 = -1;
        this.field1485 = -1;
        this.field1534 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILab;I)V")
    public final void method469(int arg0, int arg1, int arg2, PlayerEntity arg3, int arg4) {
        if (arg4 <= 0) {
            this.field1589 = this.field1338.method295();
        }
        if (field1396 != arg3) {
            if (this.field1674 < 400) {
                String var6;
                if (arg3.field470 == 0) {
                    var6 = arg3.field463 + method533(field1396.field469, false, arg3.field469) + " (level-" + arg3.field469 + ")";
                } else {
                    var6 = arg3.field463 + " (skill-" + arg3.field470 + ")";
                }
                if (this.field1504 == 1) {
                    this.field1719[this.field1674] = "Use " + this.field1508 + " with @whi@" + var6;
                    this.field1401[this.field1674] = 275;
                    this.field1402[this.field1674] = arg2;
                    this.field1399[this.field1674] = arg1;
                    this.field1400[this.field1674] = arg0;
                    ++this.field1674;
                } else if (this.field1581 == 1) {
                    if ((this.field1583 & 8) == 8) {
                        this.field1719[this.field1674] = this.field1584 + " @whi@" + var6;
                        this.field1401[this.field1674] = 131;
                        this.field1402[this.field1674] = arg2;
                        this.field1399[this.field1674] = arg1;
                        this.field1400[this.field1674] = arg0;
                        ++this.field1674;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1563[var7] != null) {
                            this.field1719[this.field1674] = this.field1563[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1563[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field469 > field1396.field469) {
                                    var9 = 2000;
                                }
                                if (field1396.field486 != 0 && arg3.field486 != 0) {
                                    if (field1396.field486 == arg3.field486) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1564[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1401[this.field1674] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1401[this.field1674] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1401[this.field1674] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1401[this.field1674] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1401[this.field1674] = var9 + 185;
                            }
                            this.field1402[this.field1674] = arg2;
                            this.field1399[this.field1674] = arg1;
                            this.field1400[this.field1674] = arg0;
                            ++this.field1674;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1674; ++var8) {
                    if (this.field1401[var8] == 718) {
                        this.field1719[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method470(int arg0, int arg1) {
        LinkList var3 = this.field1473[this.field1487][arg0][arg1];
        if (var3 == null) {
            this.field1253.method71(this.field1487, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250(7)) {
                ObjType var11 = ObjType.method348(var6.field503);
                int var12 = var11.field1071;
                if (var11.field1070) {
                    var12 = (var6.field504 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(var5, 0);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250(7)) {
                if (var5.field503 != var9.field503 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field503 != var9.field503 && var7.field503 != var9.field503 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1253.method57(var8, 8, var10, var7, this.method513(arg1 * 128 + 64, true, arg0 * 128 + 64, this.field1487), arg0, var5, this.field1487, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method471(boolean arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method472(boolean arg0) {
        ++field1374;
        if (!arg0) {
            if (field1374 > 192) {
                field1374 = 0;
                this.field1287.method218(166, (byte) 19);
                this.field1287.method219(232);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5(8);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1339 != -1 && this.field1449 == this.field1339) {
                            if (var2 == 8 && this.field1430.length() > 0) {
                                this.field1430 = this.field1430.substring(0, this.field1430.length() - 1);
                            }
                            break;
                        }
                        if (this.field1575) {
                            if (var2 >= 32 && var2 <= 122 && this.field1615.length() < 80) {
                                this.field1615 = this.field1615 + (char) var2;
                                this.field1349 = true;
                            }
                            if (var2 == 8 && this.field1615.length() > 0) {
                                this.field1615 = this.field1615.substring(0, this.field1615.length() - 1);
                                this.field1349 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1575 = false;
                                this.field1349 = true;
                                if (this.field1579 == 1) {
                                    long var3 = JString.method300(this.field1615);
                                    this.method494(var3, (byte) 111);
                                }
                                if (this.field1579 == 2 && this.field1384 > 0) {
                                    long var5 = JString.method300(this.field1615);
                                    this.method547(true, var5);
                                }
                                if (this.field1579 == 3 && this.field1615.length() > 0) {
                                    this.field1287.method218(165, (byte) 19);
                                    this.field1287.method219(0);
                                    int var7 = this.field1287.field716;
                                    this.field1287.method225(this.field1578, -40349);
                                    WordPack.method307(587, this.field1287, this.field1615);
                                    this.field1287.method228(this.field1287.field716 - var7, (byte) 22);
                                    this.field1615 = WordPack.method308((byte) 2, this.field1615);
                                    this.field1615 = WordFilter.method401((byte) 2, this.field1615);
                                    this.method503(true, 6, this.field1615, JString.method304(-257, JString.method301(this.field1578, 0)));
                                    if (this.field1386 == 2) {
                                        this.field1386 = 1;
                                        this.field1266 = true;
                                        this.field1287.method218(215, (byte) 19);
                                        this.field1287.method219(this.field1628);
                                        this.field1287.method219(this.field1386);
                                        this.field1287.method219(this.field1494);
                                    }
                                }
                                if (this.field1579 == 4 && this.field1585 < 100) {
                                    long var8 = JString.method300(this.field1615);
                                    this.method522(false, var8);
                                }
                                if (this.field1579 == 5 && this.field1585 > 0) {
                                    long var10 = JString.method300(this.field1615);
                                    this.method492(var10, -14052);
                                }
                            }
                        } else if (this.field1377) {
                            if (var2 >= 48 && var2 <= 57 && this.field1356.length() < 10) {
                                this.field1356 = this.field1356 + (char) var2;
                                this.field1349 = true;
                            }
                            if (var2 == 8 && this.field1356.length() > 0) {
                                this.field1356 = this.field1356.substring(0, this.field1356.length() - 1);
                                this.field1349 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1356.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1356);
                                    } catch (Exception var19) {
                                    }
                                    this.field1287.method218(112, (byte) 19);
                                    this.field1287.method223(var12);
                                }
                                this.field1377 = false;
                                this.field1349 = true;
                            }
                        } else if (this.field1612 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1272.length() < 80) {
                                this.field1272 = this.field1272 + (char) var2;
                                this.field1349 = true;
                            }
                            if (var2 == 8 && this.field1272.length() > 0) {
                                this.field1272 = this.field1272.substring(0, this.field1272.length() - 1);
                                this.field1349 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1272.length() > 0) {
                                if (this.field1692 == 2) {
                                    if (this.field1272.equals("::clientdrop")) {
                                        this.method446(this.field1347);
                                    }
                                    if (this.field1272.equals("::lag")) {
                                        this.method473((byte) 8);
                                    }
                                    if (this.field1272.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field1368.method272(2, 921); ++var13) {
                                            this.field1368.method282((byte) 1, var13, 0, 2);
                                        }
                                    }
                                    if (this.field1272.equals("::fpson")) {
                                        field1662 = true;
                                    }
                                    if (this.field1272.equals("::fpsoff")) {
                                        field1662 = false;
                                    }
                                }
                                if (this.field1272.startsWith("::")) {
                                    this.field1287.method218(78, (byte) 19);
                                    this.field1287.method219(this.field1272.length() - 1);
                                    this.field1287.method226(this.field1272.substring(2));
                                } else {
                                    String var14 = this.field1272.toLowerCase();
                                    byte var15 = 0;
                                    if (var14.startsWith("yellow:")) {
                                        var15 = 0;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var14.startsWith("red:")) {
                                        var15 = 1;
                                        this.field1272 = this.field1272.substring(4);
                                    } else if (var14.startsWith("green:")) {
                                        var15 = 2;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var14.startsWith("cyan:")) {
                                        var15 = 3;
                                        this.field1272 = this.field1272.substring(5);
                                    } else if (var14.startsWith("purple:")) {
                                        var15 = 4;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var14.startsWith("white:")) {
                                        var15 = 5;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var14.startsWith("flash1:")) {
                                        var15 = 6;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var14.startsWith("flash2:")) {
                                        var15 = 7;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var14.startsWith("flash3:")) {
                                        var15 = 8;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var14.startsWith("glow1:")) {
                                        var15 = 9;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var14.startsWith("glow2:")) {
                                        var15 = 10;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var14.startsWith("glow3:")) {
                                        var15 = 11;
                                        this.field1272 = this.field1272.substring(6);
                                    }
                                    String var16 = this.field1272.toLowerCase();
                                    byte var17 = 0;
                                    if (var16.startsWith("wave:")) {
                                        var17 = 1;
                                        this.field1272 = this.field1272.substring(5);
                                    } else if (var16.startsWith("wave2:")) {
                                        var17 = 2;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var16.startsWith("shake:")) {
                                        var17 = 3;
                                        this.field1272 = this.field1272.substring(6);
                                    } else if (var16.startsWith("scroll:")) {
                                        var17 = 4;
                                        this.field1272 = this.field1272.substring(7);
                                    } else if (var16.startsWith("slide:")) {
                                        var17 = 5;
                                        this.field1272 = this.field1272.substring(6);
                                    }
                                    this.field1287.method218(233, (byte) 19);
                                    this.field1287.method219(0);
                                    int var18 = this.field1287.field716;
                                    this.field1287.method219(var15);
                                    this.field1287.method219(var17);
                                    WordPack.method307(587, this.field1287, this.field1272);
                                    this.field1287.method228(this.field1287.field716 - var18, (byte) 22);
                                    this.field1272 = WordPack.method308((byte) 2, this.field1272);
                                    this.field1272 = WordFilter.method401((byte) 2, this.field1272);
                                    field1396.field413 = this.field1272;
                                    field1396.field415 = var15;
                                    field1396.field416 = var17;
                                    field1396.field414 = 150;
                                    if (this.field1692 == 2) {
                                        this.method503(true, 2, field1396.field413, "@cr2@" + field1396.field463);
                                    } else if (this.field1692 == 1) {
                                        this.method503(true, 2, field1396.field413, "@cr1@" + field1396.field463);
                                    } else {
                                        this.method503(true, 2, field1396.field413, field1396.field463);
                                    }
                                    if (this.field1628 == 2) {
                                        this.field1628 = 3;
                                        this.field1266 = true;
                                        this.field1287.method218(215, (byte) 19);
                                        this.field1287.method219(this.field1628);
                                        this.field1287.method219(this.field1386);
                                        this.field1287.method219(this.field1494);
                                    }
                                }
                                this.field1272 = "";
                                this.field1349 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1430.length() < 12) {
                    this.field1430 = this.field1430 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public void method473(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1567);
        if (this.field1368 != null) {
            System.out.println("Od-cycle:" + this.field1368.field854);
        }
        System.out.println("loop-cycle:" + field1403);
        System.out.println("draw-cycle:" + field1348);
        System.out.println("ptype:" + this.field1697);
        if (arg0 != 8) {
            this.field1473 = null;
        }
        System.out.println("psize:" + this.field1696);
        if (this.field1691 != null) {
            this.field1691.method43((byte) 8);
        }
        super.field11 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (this.field1546 != arg0) {
            this.field1697 = this.field1404.method229();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method474(int arg0) {
        if (arg0 > 0) {
            Graphics var2 = this.method11((byte) -114).getGraphics();
            var2.setColor(Color.black);
            var2.fillRect(0, 0, 765, 503);
            this.method4((byte) -114, 1);
            if (this.field1251) {
                this.field1465 = false;
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
            if (this.field1461) {
                this.field1465 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field1441) {
                this.field1465 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILd;III)V")
    public final void method475(byte arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -90) {
            this.field1697 = this.field1404.method229();
        }
        if (arg3.field79 == 0 && arg3.field94 != null && !arg3.field93) {
            if (arg5 >= arg2 && arg4 >= arg1 && arg5 <= arg3.field82 + arg2 && arg4 <= arg3.field83 + arg1) {
                int var8 = arg3.field94.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field95[var9] + arg2;
                    int var11 = arg3.field96[var9] + arg1 - arg6;
                    Component var12 = Component.field72[arg3.field94[var9]];
                    int var13 = var12.field85 + var10;
                    int var14 = var12.field86 + var11;
                    if ((var12.field90 >= 0 || var12.field117 != 0) && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                        if (var12.field90 >= 0) {
                            this.field1268 = var12.field90;
                        } else {
                            this.field1268 = var12.field77;
                        }
                    }
                    if (var12.field79 == 0) {
                        this.method475((byte) -90, var14, var13, var12, arg4, arg5, var12.field92);
                        if (var12.field91 > var12.field83) {
                            this.method506((byte) 92, arg4, arg5, var12, var14, var12.field83, true, var12.field82 + var13, var12.field91);
                        }
                    } else {
                        if (var12.field80 == 1 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            boolean var15 = false;
                            if (var12.field81 != 0) {
                                var15 = this.method515(0, var12);
                            }
                            if (!var15) {
                                this.field1719[this.field1674] = var12.field133;
                                this.field1401[this.field1674] = 231;
                                this.field1400[this.field1674] = var12.field77;
                                ++this.field1674;
                            }
                        }
                        if (var12.field80 == 2 && this.field1581 == 0 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            String var16 = var12.field130;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1719[this.field1674] = var16 + " @gre@" + var12.field131;
                            this.field1401[this.field1674] = 274;
                            this.field1400[this.field1674] = var12.field77;
                            ++this.field1674;
                        }
                        if (var12.field80 == 3 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            this.field1719[this.field1674] = "Close";
                            this.field1401[this.field1674] = 737;
                            this.field1400[this.field1674] = var12.field77;
                            ++this.field1674;
                        }
                        if (var12.field80 == 4 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            this.field1719[this.field1674] = var12.field133;
                            this.field1401[this.field1674] = 435;
                            this.field1400[this.field1674] = var12.field77;
                            ++this.field1674;
                        }
                        if (var12.field80 == 5 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            this.field1719[this.field1674] = var12.field133;
                            this.field1401[this.field1674] = 225;
                            this.field1400[this.field1674] = var12.field77;
                            ++this.field1674;
                        }
                        if (var12.field80 == 6 && !this.field1422 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field82 + var13 && arg4 < var12.field83 + var14) {
                            this.field1719[this.field1674] = var12.field133;
                            this.field1401[this.field1674] = 997;
                            this.field1400[this.field1674] = var12.field77;
                            ++this.field1674;
                        }
                        if (var12.field79 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field83; ++var18) {
                                for (int var19 = 0; var19 < var12.field82; ++var19) {
                                    int var20 = (var12.field103 + 32) * var19 + var13;
                                    int var21 = (var12.field104 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field106[var17];
                                        var21 += var12.field107[var17];
                                    }
                                    if (arg5 >= var20 && arg4 >= var21 && arg5 < var20 + 32 && arg4 < var21 + 32) {
                                        this.field1679 = var17;
                                        this.field1680 = var12.field77;
                                        if (var12.field73[var17] > 0) {
                                            ObjType var22 = ObjType.method348(var12.field73[var17] - 1);
                                            if (this.field1504 == 1 && var12.field100) {
                                                if (this.field1506 != var12.field77 || this.field1505 != var17) {
                                                    this.field1719[this.field1674] = "Use " + this.field1508 + " with @lre@" + var22.field1059;
                                                    this.field1401[this.field1674] = 398;
                                                    this.field1402[this.field1674] = var22.field1057;
                                                    this.field1399[this.field1674] = var17;
                                                    this.field1400[this.field1674] = var12.field77;
                                                    ++this.field1674;
                                                }
                                            } else if (this.field1581 == 1 && var12.field100) {
                                                if ((this.field1583 & 16) == 16) {
                                                    this.field1719[this.field1674] = this.field1584 + " @lre@" + var22.field1059;
                                                    this.field1401[this.field1674] = 563;
                                                    this.field1402[this.field1674] = var22.field1057;
                                                    this.field1399[this.field1674] = var17;
                                                    this.field1400[this.field1674] = var12.field77;
                                                    ++this.field1674;
                                                }
                                            } else {
                                                if (var12.field100) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1074 != null && var22.field1074[var23] != null) {
                                                            this.field1719[this.field1674] = var22.field1074[var23] + " @lre@" + var22.field1059;
                                                            if (var23 == 3) {
                                                                this.field1401[this.field1674] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1401[this.field1674] = 100;
                                                            }
                                                            this.field1402[this.field1674] = var22.field1057;
                                                            this.field1399[this.field1674] = var17;
                                                            this.field1400[this.field1674] = var12.field77;
                                                            ++this.field1674;
                                                        } else if (var23 == 4) {
                                                            this.field1719[this.field1674] = "Drop @lre@" + var22.field1059;
                                                            this.field1401[this.field1674] = 100;
                                                            this.field1402[this.field1674] = var22.field1057;
                                                            this.field1399[this.field1674] = var17;
                                                            this.field1400[this.field1674] = var12.field77;
                                                            ++this.field1674;
                                                        }
                                                    }
                                                }
                                                if (var12.field101) {
                                                    this.field1719[this.field1674] = "Use @lre@" + var22.field1059;
                                                    this.field1401[this.field1674] = 102;
                                                    this.field1402[this.field1674] = var22.field1057;
                                                    this.field1399[this.field1674] = var17;
                                                    this.field1400[this.field1674] = var12.field77;
                                                    ++this.field1674;
                                                }
                                                if (var12.field100 && var22.field1074 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1074[var24] != null) {
                                                            this.field1719[this.field1674] = var22.field1074[var24] + " @lre@" + var22.field1059;
                                                            if (var24 == 0) {
                                                                this.field1401[this.field1674] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1401[this.field1674] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1401[this.field1674] = 795;
                                                            }
                                                            this.field1402[this.field1674] = var22.field1057;
                                                            this.field1399[this.field1674] = var17;
                                                            this.field1400[this.field1674] = var12.field77;
                                                            ++this.field1674;
                                                        }
                                                    }
                                                }
                                                if (var12.field108 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field108[var25] != null) {
                                                            this.field1719[this.field1674] = var12.field108[var25] + " @lre@" + var22.field1059;
                                                            if (var25 == 0) {
                                                                this.field1401[this.field1674] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1401[this.field1674] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1401[this.field1674] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1401[this.field1674] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1401[this.field1674] = 354;
                                                            }
                                                            this.field1402[this.field1674] = var22.field1057;
                                                            this.field1399[this.field1674] = var17;
                                                            this.field1400[this.field1674] = var12.field77;
                                                            ++this.field1674;
                                                        }
                                                    }
                                                }
                                                this.field1719[this.field1674] = "Examine @lre@" + var22.field1059;
                                                this.field1401[this.field1674] = 1328;
                                                this.field1402[this.field1674] = var22.field1057;
                                                this.field1399[this.field1674] = var17;
                                                this.field1400[this.field1674] = var12.field77;
                                                ++this.field1674;
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (this.field1683 == 0) {
            int var2 = super.field28;
            if (arg0 != 0) {
                this.field1415 = 300;
            }
            if (this.field1581 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                var2 = 0;
            }
            if (this.field1641) {
                if (var2 != 1) {
                    int var3 = super.field22;
                    int var4 = super.field23;
                    if (this.field1656 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1656 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1656 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1657 - 10 || var3 > this.field1659 + this.field1657 + 10 || var4 < this.field1658 - 10 || var4 > this.field1660 + this.field1658 + 10) {
                        this.field1641 = false;
                        if (this.field1656 == 1) {
                            this.field1395 = true;
                        }
                        if (this.field1656 == 2) {
                            this.field1349 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1657;
                    int var6 = this.field1658;
                    int var7 = this.field1659;
                    int var8 = super.field29;
                    int var9 = super.field30;
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
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1674; ++var11) {
                        int var12 = (this.field1674 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method430(0, var10);
                    }
                    this.field1641 = false;
                    if (this.field1656 == 1) {
                        this.field1395 = true;
                    }
                    if (this.field1656 == 2) {
                        this.field1349 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1674 > 0) {
                    int var13 = this.field1401[this.field1674 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1399[this.field1674 - 1];
                        int var15 = this.field1400[this.field1674 - 1];
                        Component var16 = Component.field72[var15];
                        if (var16.field99 || var16.field102) {
                            this.field1512 = false;
                            this.field1588 = 0;
                            this.field1681 = var15;
                            this.field1682 = var14;
                            this.field1683 = 2;
                            this.field1684 = super.field29;
                            this.field1685 = super.field30;
                            if (Component.field72[var15].field78 == this.field1339) {
                                this.field1683 = 1;
                            }
                            if (Component.field72[var15].field78 == this.field1612) {
                                this.field1683 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1299 == 1 || this.method525(this.field1674 - 1, this.field1647)) && this.field1674 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1674 > 0) {
                    this.method430(0, this.field1674 - 1);
                }
                if (var2 != 2 || this.field1674 <= 0) {
                    return;
                }
                this.method479(-288);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    private static final String method477(byte arg0, int arg1) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            field1312 = -135;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method478(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg1) {
            field1493 = 450;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method479(int arg0) {
        int var2 = this.field1471.method204("Choose Option", -25271);
        for (int var3 = 0; var3 < this.field1674; ++var3) {
            int var11 = this.field1471.method204(this.field1719[var3], -25271);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 >= 0) {
            this.field1370 = this.field1338.method295();
        }
        int var4 = this.field1674 * 15 + 21;
        if (super.field29 > 4 && super.field30 > 4 && super.field29 < 516 && super.field30 < 338) {
            int var5 = super.field29 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field30 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1641 = true;
            this.field1656 = 0;
            this.field1657 = var5;
            this.field1658 = var6;
            this.field1659 = var2;
            this.field1660 = this.field1674 * 15 + 22;
        }
        if (super.field29 > 553 && super.field30 > 205 && super.field29 < 743 && super.field30 < 466) {
            int var7 = super.field29 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field30 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1641 = true;
            this.field1656 = 1;
            this.field1657 = var7;
            this.field1658 = var8;
            this.field1659 = var2;
            this.field1660 = this.field1674 * 15 + 22;
        }
        if (super.field29 > 17 && super.field30 > 357 && super.field29 < 496 && super.field30 < 453) {
            int var9 = super.field29 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field30 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1641 = true;
            this.field1656 = 2;
            this.field1657 = var9;
            this.field1658 = var10;
            this.field1659 = var2;
            this.field1660 = this.field1674 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method480(boolean arg0) {
        this.field1354 = new Pix8(this.field1236, "titlebox", 0);
        this.field1355 = new Pix8(this.field1236, "titlebutton", 0);
        this.field1331 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1331[var3] = new Pix8(this.field1236, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1331[var4] = new Pix8(this.field1236, "runes", (var4 & 3) + 12);
            }
        }
        this.field1475 = new Pix32(128, 265);
        this.field1476 = new Pix32(128, 265);
        this.field1645 &= arg0;
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1475.field674[var5] = this.field1409.field755[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1476.field674[var6] = this.field1410.field755[var6];
        }
        this.field1649 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1649[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1649[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1649[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1649[var10 + 192] = 16777215;
        }
        this.field1650 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1650[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1650[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1650[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1650[var14 + 192] = 16777215;
        }
        this.field1651 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1651[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1651[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1651[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1651[var18 + 192] = 16777215;
        }
        this.field1648 = new int[256];
        this.field1542 = new int[32768];
        this.field1543 = new int[32768];
        this.method437((byte) 64, (Pix8) null);
        this.field1459 = new int[32768];
        this.field1460 = new int[32768];
        this.method13(10, "Connecting to fileserver", (byte) 7);
        if (!this.field1465) {
            this.field1291 = true;
            this.field1465 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1441 && !this.field1251 && !this.field1461) {
            ++field1348;
            if (arg0 == -97) {
                if (!this.field1645) {
                    this.method536((byte) 3, false);
                } else {
                    this.method544(793);
                }
                this.field1688 = 0;
            }
        } else {
            this.method474(331);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILy;)V")
    public final void method481(int arg0, int arg1, PathingEntity arg2) {
        if (arg1 != 9527) {
            this.field1697 = this.field1404.method229();
        }
        this.method482(arg0, this.field1536, arg2.field402, arg2.field401);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method513(arg2, true, arg3, this.field1487) - arg0;
            int var6 = arg3 - this.field1431;
            int var7 = var5 - this.field1432;
            int var8 = arg2 - this.field1433;
            int var9 = Model.field610[this.field1434];
            int var10 = Model.field611[this.field1434];
            if (arg1 > 0) {
                int var11 = Model.field610[this.field1435];
                int var12 = Model.field611[this.field1435];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field1333 = (var13 << 9) / var17 + Pix3D.field651;
                    this.field1334 = (var16 << 9) / var17 + Pix3D.field652;
                } else {
                    this.field1333 = -1;
                    this.field1334 = -1;
                }
            }
        } else {
            this.field1333 = -1;
            this.field1334 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILab;Llb;II)V")
    private final void method483(int arg0, PlayerEntity arg1, Packet arg2, int arg3, int arg4) {
        if (arg0 != -48904) {
            field1602 = !field1602;
        }
        if ((arg4 & 1) == 1) {
            int var6 = arg2.method229();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(false, var7);
            arg2.method238(var6, 0, 0, var7);
            this.field1310[arg3] = var8;
            arg1.method116(-990, var8);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg2.method231();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg1.field429 == var9) {
                arg1.field433 = 0;
            }
            int var10 = arg2.method229();
            if (arg1.field429 == var9 && var9 != -1) {
                int var11 = SeqType.field1155[var9].field1169;
                if (var11 == 1) {
                    arg1.field430 = 0;
                    arg1.field431 = 0;
                    arg1.field432 = var10;
                    arg1.field433 = 0;
                }
                if (var11 == 2) {
                    arg1.field433 = 0;
                }
            } else if (var9 == -1 || arg1.field429 == -1 || SeqType.field1155[var9].field1163 >= SeqType.field1155[arg1.field429].field1163) {
                arg1.field429 = var9;
                arg1.field430 = 0;
                arg1.field431 = 0;
                arg1.field432 = var10;
                arg1.field433 = 0;
                arg1.field455 = arg1.field450;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field423 = arg2.method231();
            if (arg1.field423 == 65535) {
                arg1.field423 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field413 = arg2.method236();
            if (arg1.field413.charAt(0) == '~') {
                arg1.field413 = arg1.field413.substring(1);
                this.method503(true, 2, arg1.field413, arg1.field463);
            } else if (field1396 == arg1) {
                this.method503(true, 2, arg1.field413, arg1.field463);
            }
            arg1.field415 = 0;
            arg1.field416 = 0;
            arg1.field414 = 150;
        }
        if ((arg4 & 16) == 16) {
            int var12 = arg2.method229();
            int var13 = arg2.method229();
            arg1.method114((byte) -50, var12, var13, field1403);
            arg1.field420 = field1403 + 300;
            arg1.field421 = arg2.method229();
            arg1.field422 = arg2.method229();
        }
        if ((arg4 & 32) == 32) {
            arg1.field424 = arg2.method231();
            arg1.field425 = arg2.method231();
        }
        if ((arg4 & 64) == 64) {
            int var14 = arg2.method231();
            int var15 = arg2.method229();
            int var16 = arg2.method229();
            int var17 = arg2.field716;
            if (arg1.field463 != null && arg1.field464) {
                long var18 = JString.method300(arg1.field463);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1585; ++var21) {
                        if (this.field1453[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1367 == 0) {
                    try {
                        String var22 = WordPack.method306(arg2, var16, 0);
                        String var23 = WordFilter.method401((byte) 2, var22);
                        arg1.field413 = var23;
                        arg1.field415 = var14 >> 8;
                        arg1.field416 = var14 & 255;
                        arg1.field414 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method503(true, 1, var23, "@cr1@" + arg1.field463);
                            } else {
                                this.method503(true, 2, var23, arg1.field463);
                            }
                        } else {
                            this.method503(true, 1, var23, "@cr2@" + arg1.field463);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field716 = var16 + var17;
        }
        if ((arg4 & 256) == 256) {
            arg1.field434 = arg2.method231();
            int var25 = arg2.method234();
            arg1.field438 = var25 >> 16;
            arg1.field437 = (var25 & 65535) + field1403;
            arg1.field435 = 0;
            arg1.field436 = 0;
            if (arg1.field437 > field1403) {
                arg1.field435 = -1;
            }
            if (arg1.field434 == 65535) {
                arg1.field434 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field439 = arg2.method229();
            arg1.field441 = arg2.method229();
            arg1.field440 = arg2.method229();
            arg1.field442 = arg2.method229();
            arg1.field443 = arg2.method231() + field1403;
            arg1.field444 = arg2.method231() + field1403;
            arg1.field445 = arg2.method229();
            arg1.method112(8874);
        }
        if ((arg4 & 1024) == 1024) {
            int var26 = arg2.method229();
            int var27 = arg2.method229();
            arg1.method114((byte) -50, var26, var27, field1403);
            arg1.field420 = field1403 + 300;
            arg1.field421 = arg2.method229();
            arg1.field422 = arg2.method229();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    private final void method484(byte arg0) {
        LocSpawned var2 = (LocSpawned) this.field1639.method248();
        if (arg0 != 3) {
            this.field1473 = null;
        }
        while (var2 != null) {
            if (var2.field745 == -1) {
                var2.field744 = 0;
                this.method436(var2, -22447);
            } else {
                var2.method106();
            }
            var2 = (LocSpawned) this.field1639.method250(7);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (this.field1638 == 2) {
            this.method482(this.field1479 * 2, this.field1536, (this.field1478 - this.field1569 << 7) + this.field1481, (this.field1477 - this.field1568 << 7) + this.field1480);
            if (arg0 == -34858) {
                if (this.field1333 > -1 && field1403 % 20 < 10) {
                    this.field1678[2].method186(this.field1334 - 28, this.field1333 - 12, -47687);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1459[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1459[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1460[var14] = (this.field1459[var14 - 1] + this.field1459[var14 + 1] + this.field1459[var14 - 128] + this.field1459[var14 + 128]) / 4;
            }
        }
        this.field1587 += 128;
        if (arg0) {
            field1259 = true;
        }
        if (this.field1587 > this.field1542.length) {
            this.field1587 -= this.field1542.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method437((byte) 64, this.field1331[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1460[var11 + 128] - this.field1542[this.field1587 + var11 & this.field1542.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1459[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1366[var8] = this.field1366[var8 + 1];
        }
        this.field1366[var2 - 1] = (int) (Math.sin((double) field1403 / 14.0D) * 16.0D + Math.sin((double) field1403 / 15.0D) * 14.0D + Math.sin((double) field1403 / 16.0D) * 12.0D);
        if (this.field1392 > 0) {
            this.field1392 -= 4;
        }
        if (this.field1393 > 0) {
            this.field1393 -= 4;
        }
        if (this.field1392 == 0 && this.field1393 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1392 = 1024;
            }
            if (var9 == 1) {
                this.field1393 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method487(byte arg0) {
        ++this.field1378;
        this.method453(true, false);
        this.method534(true, (byte) 7);
        this.method453(false, false);
        this.method534(false, (byte) 7);
        this.method556((byte) 4);
        if (arg0 != -103) {
            this.method6();
        }
        this.method511(2);
        if (!this.field1394) {
            int var2 = this.field1359;
            if (this.field1664 / 256 > var2) {
                var2 = this.field1664 / 256;
            }
            if (this.field1625[4] && this.field1654[4] + 128 > var2) {
                var2 = this.field1654[4] + 128;
            }
            int var3 = this.field1360 + this.field1270 & 2047;
            this.method431(var2, this.method513(field1396.field402, true, field1396.field401, this.field1487) - 50, var2 * 3 + 600, 362, this.field1520, var3, this.field1521);
        }
        int var4;
        if (!this.field1394) {
            var4 = this.method434(139);
        } else {
            var4 = this.method435(2);
        }
        int var5 = this.field1431;
        int var6 = this.field1432;
        int var7 = this.field1433;
        int var8 = this.field1434;
        int var9 = this.field1435;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1625[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1550[var10] * 2 + 1) - (double) this.field1550[var10] + Math.sin((double) this.field1294[var10] / 100.0D * (double) this.field1488[var10]) * (double) this.field1654[var10]);
                if (var10 == 0) {
                    this.field1431 += var12;
                }
                if (var10 == 1) {
                    this.field1432 += var12;
                }
                if (var10 == 2) {
                    this.field1433 += var12;
                }
                if (var10 == 3) {
                    this.field1435 = this.field1435 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1434 += var12;
                    if (this.field1434 < 128) {
                        this.field1434 = 128;
                    }
                    if (this.field1434 > 383) {
                        this.field1434 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field666;
        Model.field605 = true;
        Model.field608 = 0;
        Model.field606 = super.field22 - 4;
        Model.field607 = super.field23 - 4;
        Pix2D.method155(17698);
        this.field1253.method89(this.field1433, this.field1431, this.field1432, this.field1434, true, var4, this.field1435);
        this.field1253.method64((byte) -122);
        this.method548(8);
        this.method485(-34858);
        this.method488(field1653, var11);
        this.method499(0);
        this.field1668.method259(4, -183, 4, super.field14);
        this.field1431 = var5;
        this.field1432 = var6;
        this.field1433 = var7;
        this.field1434 = var8;
        this.field1435 = var9;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        if (arg0 == 0) {
            if (!field1344) {
                if (Pix3D.field665[17] >= arg1) {
                    Pix8 var3 = Pix3D.field659[17];
                    int var4 = var3.field687 * var3.field686 - 1;
                    int var5 = this.field1263 * var3.field686 * 2;
                    byte[] var6 = var3.field684;
                    byte[] var7 = this.field1420;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field684 = var7;
                    this.field1420 = var6;
                    Pix3D.method171(17, -850);
                }
                if (Pix3D.field665[24] >= arg1) {
                    Pix8 var9 = Pix3D.field659[24];
                    int var10 = var9.field687 * var9.field686 - 1;
                    int var11 = this.field1263 * var9.field686 * 2;
                    byte[] var12 = var9.field684;
                    byte[] var13 = this.field1420;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field684 = var13;
                    this.field1420 = var12;
                    Pix3D.method171(24, -850);
                }
                if (Pix3D.field665[34] >= arg1) {
                    Pix8 var15 = Pix3D.field659[34];
                    int var16 = var15.field687 * var15.field686 - 1;
                    int var17 = this.field1263 * var15.field686 * 2;
                    byte[] var18 = var15.field684;
                    byte[] var19 = this.field1420;
                    for (int var20 = 0; var20 <= var16; ++var20) {
                        var19[var20] = var18[var20 - var17 & var16];
                    }
                    var15.field684 = var19;
                    this.field1420 = var18;
                    Pix3D.method171(34, -850);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)Ljava/lang/String;")
    public final String method489(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field1617 = !this.field1617;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field17 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method490(String arg0) {
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

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    private final void method491(byte arg0) {
        if (arg0 == 1) {
            if (this.field1405 == 2) {
                for (LocSpawned var2 = (LocSpawned) this.field1639.method248(); var2 != null; var2 = (LocSpawned) this.field1639.method250(7)) {
                    if (var2.field745 > 0) {
                        --var2.field745;
                    }
                    if (var2.field745 == 0) {
                        if (var2.field738 < 0 || World.method30(1000, var2.field738, var2.field740)) {
                            this.method465(var2.field739, var2.field738, var2.field736, var2.field740, 9, var2.field734, var2.field737, var2.field735);
                            var2.method106();
                        }
                    } else {
                        if (var2.field744 > 0) {
                            --var2.field744;
                        }
                        if (var2.field744 == 0 && var2.field736 >= 1 && var2.field737 >= 1 && var2.field736 <= 102 && var2.field737 <= 102 && (var2.field741 < 0 || World.method30(1000, var2.field741, var2.field743))) {
                            this.method465(var2.field742, var2.field741, var2.field736, var2.field743, 9, var2.field734, var2.field737, var2.field735);
                            var2.field744 = -1;
                            if (var2.field741 == var2.field738 && var2.field738 == -1) {
                                var2.method106();
                            } else if (var2.field741 == var2.field738 && var2.field742 == var2.field739 && var2.field743 == var2.field740) {
                                var2.method106();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method492(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1585; ++var4) {
                if (this.field1453[var4] == arg0) {
                    --this.field1585;
                    this.field1395 = true;
                    for (int var5 = var4; var5 < this.field1585; ++var5) {
                        this.field1453[var5] = this.field1453[var5 + 1];
                    }
                    this.field1287.method218(180, (byte) 19);
                    this.field1287.method225(arg0, -40349);
                    break;
                }
            }
            if (arg1 != -14052) {
                field1653 = -459;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method493(byte arg0) {
        int var2 = this.field1657;
        int var3 = this.field1658;
        int var4 = this.field1659;
        int var5 = this.field1660;
        int var6 = 6116423;
        Pix2D.method157(false, var2, var4, var6, var3, var5);
        Pix2D.method157(false, var2 + 1, var4 - 2, 0, var3 + 1, 16);
        Pix2D.method158(0, var2 + 1, 0, var3 + 18, var4 - 2, var5 - 19);
        this.field1471.method206(var2 + 3, "Choose Option", -830, var6, var3 + 14);
        int var7 = super.field22;
        int var8 = super.field23;
        if (this.field1656 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1656 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1656 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1674; ++var9) {
            int var10 = (this.field1674 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1471.method210(this.field1719[var9], var2 + 3, true, 654, var10, var11);
        }
        if (arg0 != 102) {
            field1482 = this.field1338.method295();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method494(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1384 >= 100 && this.field1454 != 1) {
                this.method503(true, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field1384 >= 200) {
                this.method503(true, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = JString.method304(-257, JString.method301(arg0, 0));
                for (int var5 = 0; var5 < this.field1384; ++var5) {
                    if (this.field1616[var5] == arg0) {
                        this.method503(true, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1585; ++var6) {
                    if (this.field1453[var6] == arg0) {
                        this.method503(true, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field1396.field463)) {
                    this.field1381[this.field1384] = var4;
                    this.field1616[this.field1384] = arg0;
                    this.field1652[this.field1384] = 0;
                    ++this.field1384;
                    this.field1395 = true;
                    if (arg1 != 111) {
                        this.field1473 = null;
                    }
                    this.field1287.method218(72, (byte) 19);
                    this.field1287.method225(arg0, -40349);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method495(int arg0, int arg1) {
        int var3 = VarpType.field1201[arg1].field1209;
        if (arg0 >= 0) {
            this.field1673 = 449;
        }
        if (var3 != 0) {
            int var4 = this.field1249[arg1];
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
                ObjType.field1098.method103();
                this.field1286 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1258;
                if (var4 == 0) {
                    this.method471(this.field1258, 518, 0);
                    this.field1258 = true;
                }
                if (var4 == 1) {
                    this.method471(this.field1258, 518, -400);
                    this.field1258 = true;
                }
                if (var4 == 2) {
                    this.method471(this.field1258, 518, -800);
                    this.field1258 = true;
                }
                if (var4 == 3) {
                    this.method471(this.field1258, 518, -1200);
                    this.field1258 = true;
                }
                if (var4 == 4) {
                    this.field1258 = false;
                }
                if (this.field1258 != var5 && !field1344) {
                    if (this.field1258) {
                        this.field1485 = this.field1672;
                        this.field1486 = true;
                        this.field1368.method279(2, this.field1485);
                    } else {
                        this.method464(598);
                    }
                    this.field1534 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1710 = true;
                    this.method553(0, (byte) 2);
                }
                if (var4 == 1) {
                    this.field1710 = true;
                    this.method553(-400, (byte) 2);
                }
                if (var4 == 2) {
                    this.field1710 = true;
                    this.method553(-800, (byte) 2);
                }
                if (var4 == 3) {
                    this.field1710 = true;
                    this.method553(-1200, (byte) 2);
                }
                if (var4 == 4) {
                    this.field1710 = false;
                }
            }
            if (var3 == 5) {
                this.field1299 = var4;
            }
            if (var3 == 6) {
                this.field1345 = var4;
            }
            if (var3 == 8) {
                this.field1610 = var4;
                this.field1349 = true;
            }
            if (var3 == 9) {
                this.field1243 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method496(boolean arg0) {
        this.field1671 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1465) {
                ++this.field1567;
                this.method486(false);
                this.method486(false);
                this.method558(595);
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
        this.field1671 = false;
        this.field1645 &= arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 != 0) {
            field1593 = 218;
        }
        this.field1286 = true;
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method497(int arg0) {
        if (this.field1683 == 0) {
            this.field1719[0] = "Cancel";
            this.field1401[0] = 1106;
            this.field1674 = 1;
            this.method502(0);
            this.field1268 = 0;
            if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                if (this.field1339 != -1) {
                    this.method475((byte) -90, 4, 4, Component.field72[this.field1339], super.field23, super.field22, 0);
                } else {
                    this.method444(false);
                }
            }
            if (this.field1416 != this.field1268) {
                this.field1416 = this.field1268;
            }
            this.field1268 = 0;
            if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                if (this.field1419 != -1) {
                    this.method475((byte) -90, 205, 553, Component.field72[this.field1419], super.field23, super.field22, 0);
                } else if (this.field1398[this.field1704] != -1) {
                    this.method475((byte) -90, 205, 553, Component.field72[this.field1398[this.field1704]], super.field23, super.field22, 0);
                }
            }
            if (this.field1320 != this.field1268) {
                this.field1395 = true;
                this.field1320 = this.field1268;
            }
            this.field1268 = 0;
            this.field1696 += arg0;
            if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                if (this.field1612 != -1) {
                    this.method475((byte) -90, 357, 17, Component.field72[this.field1612], super.field23, super.field22, 0);
                } else if (super.field23 < 434 && super.field22 < 426) {
                    this.method432(-282, super.field23 - 357, super.field22 - 17);
                }
            }
            if (this.field1612 != -1 && this.field1458 != this.field1268) {
                this.field1349 = true;
                this.field1458 = this.field1268;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1674 - 1; ++var3) {
                    if (this.field1401[var3] < 1000 && this.field1401[var3 + 1] > 1000) {
                        String var4 = this.field1719[var3];
                        this.field1719[var3] = this.field1719[var3 + 1];
                        this.field1719[var3 + 1] = var4;
                        int var5 = this.field1401[var3];
                        this.field1401[var3] = this.field1401[var3 + 1];
                        this.field1401[var3 + 1] = var5;
                        int var6 = this.field1399[var3];
                        this.field1399[var3] = this.field1399[var3 + 1];
                        this.field1399[var3 + 1] = var6;
                        int var7 = this.field1400[var3];
                        this.field1400[var3] = this.field1400[var3 + 1];
                        this.field1400[var3 + 1] = var7;
                        int var8 = this.field1402[var3];
                        this.field1402[var3] = this.field1402[var3 + 1];
                        this.field1402[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method498(int arg0) {
        if (this.field1610 != 0) {
            PixFont var2 = this.field1470;
            int var3 = 0;
            if (this.field1330 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1353[var4] != null) {
                    int var6 = this.field1351[var4];
                    String var7 = this.field1352[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1386 == 0 || this.field1386 == 1 && this.method429(var7, (byte) 9))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method206(var10, "From", -830, 0, var9);
                        var2.method206(var10, "From", -830, 65535, var9 - 1);
                        int var11 = var10 + var2.method204("From ", -25271);
                        if (var8 == 1) {
                            this.field1576[0].method199(var9 - 12, var11, -47687);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field1576[1].method199(var9 - 12, var11, -47687);
                            var11 += 14;
                        }
                        var2.method206(var11, var7 + ": " + this.field1353[var4], -830, 0, var9);
                        var2.method206(var11, var7 + ": " + this.field1353[var4], -830, 65535, var9 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1386 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method206(4, this.field1353[var4], -830, 0, var12);
                        var2.method206(4, this.field1353[var4], -830, 65535, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1386 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method206(4, "To " + var7 + ": " + this.field1353[var4], -830, 0, var13);
                        var2.method206(4, "To " + var7 + ": " + this.field1353[var4], -830, 65535, var13 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 < 2 || arg0 > 2) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method499(int arg0) {
        this.method498(this.field1462);
        if (arg0 != 0) {
            this.field1643 = 112;
        }
        if (this.field1276 == 1) {
            this.field1586[this.field1275 / 100].method186(this.field1274 - 8 - 4, this.field1273 - 8 - 4, -47687);
        }
        if (this.field1276 == 2) {
            this.field1586[this.field1275 / 100 + 4].method186(this.field1274 - 8 - 4, this.field1273 - 8 - 4, -47687);
            ++field1260;
            if (field1260 > 57) {
                field1260 = 0;
                this.field1287.method218(19, (byte) 19);
            }
        }
        if (this.field1694 != -1) {
            this.method507(this.field1263, this.field1694, 0);
            this.method447(Component.field72[this.field1694], 0, 0, 0, -23258);
        }
        if (this.field1339 != -1) {
            this.method507(this.field1263, this.field1339, 0);
            this.method447(Component.field72[this.field1339], 0, 0, 0, -23258);
        }
        this.method452(0);
        if (!this.field1641) {
            this.method497(0);
            this.method524(this.field1617);
        } else if (this.field1656 == 0) {
            this.method493((byte) 102);
        }
        if (this.field1670 == 1) {
            this.field1678[1].method186(296, 472, -47687);
        }
        if (field1662) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field10 < 15) {
                var4 = 16711680;
            }
            this.field1470.method201("Fps:" + super.field10, var3, var2, var4, true);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field1344) {
                int var8 = 16711680;
            }
            this.field1470.method201("Mem:" + var6 + "k", var12, var2, 16776960, true);
            var12 += 15;
        }
        if (this.field1330 != 0) {
            int var9 = this.field1330 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field1470.method206(4, "System update in: " + var10 + ":0" + var11, -830, 16776960, 329);
            } else {
                this.field1470.method206(4, "System update in: " + var10 + ":" + var11, -830, 16776960, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZI)Z")
    public final boolean method500(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1253.method80(this.field1487, arg2, arg1, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1375;
            if (field1375 > 1086) {
                field1375 = 0;
                this.field1287.method218(46, (byte) 19);
                this.field1287.method219(0);
                int var10 = this.field1287.field716;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1287.method220(16791);
                }
                this.field1287.method219(254);
                this.field1287.method220((int) (Math.random() * 65536.0D));
                this.field1287.method220(16128);
                this.field1287.method220(52610);
                this.field1287.method220((int) (Math.random() * 65536.0D));
                this.field1287.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1287.method220(35025);
                }
                this.field1287.method220(46628);
                this.field1287.method219((int) (Math.random() * 256.0D));
                this.field1287.method228(this.field1287.field716 - var10, (byte) 22);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method535(field1396.field451[0], 0, 0, var9, false, var8 + 1, arg1, 2, arg2, (byte) 9, 0, field1396.field452[0]);
            } else {
                LocType var11 = LocType.method330(var6);
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
                this.method535(field1396.field451[0], var14, var12, 0, false, 0, arg1, 2, arg2, (byte) 9, var13, field1396.field452[0]);
            }
            this.field1273 = super.field29;
            this.field1274 = super.field30;
            this.field1276 = 2;
            this.field1275 = 0;
            this.field1287.method218(arg4, (byte) 19);
            this.field1287.method220(this.field1568 + arg2);
            this.field1287.method220(this.field1569 + arg1);
            if (arg3) {
                boolean var15 = true;
            }
            this.field1287.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method501(byte arg0) {
        for (int var2 = 0; var2 < this.field1450; ++var2) {
            if (this.field1562[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1373[var2] == this.field1327 && this.field1290[var2] == this.field1257) {
                        if (!this.method552((byte) 103)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(this.field1373[var2], 0, this.field1290[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field716 / 22) > (long) (this.field1540 / 22) + this.field1491) {
                            this.field1540 = var4.field716;
                            this.field1491 = System.currentTimeMillis();
                            if (this.method462(var4.field715, var4.field716, (byte) 9)) {
                                this.field1327 = this.field1373[var2];
                                this.field1257 = this.field1290[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1562[var2] != -5) {
                    this.field1562[var2] = -5;
                } else {
                    --this.field1450;
                    for (int var6 = var2; var6 < this.field1450; ++var6) {
                        this.field1373[var6] = this.field1373[var6 + 1];
                        this.field1290[var6] = this.field1290[var6 + 1];
                        this.field1562[var6] = this.field1562[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1562[var2]--;
            }
        }
        if (this.field1424 == arg0) {
            if (this.field1534 > 0) {
                this.field1534 -= 20;
                if (this.field1534 < 0) {
                    this.field1534 = 0;
                }
                if (this.field1534 == 0 && this.field1258 && !field1344) {
                    this.field1485 = this.field1672;
                    this.field1486 = true;
                    this.field1368.method279(2, this.field1485);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method502(int arg0) {
        if (this.field1610 != 0) {
            int var2 = 0;
            if (arg0 != 0) {
                this.field1287.method219(81);
            }
            if (this.field1330 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1353[var3] != null) {
                    int var4 = this.field1351[var3];
                    String var5 = this.field1352[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1386 == 0 || this.field1386 == 1 && this.method429(var5, (byte) 9))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field22 > 4 && super.field23 - 4 > var9 - 10 && super.field23 - 4 <= var9 + 3) {
                            int var10 = this.field1470.method204("From:  " + var5 + this.field1353[var3], -25271) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field22 < var10 + 4) {
                                if (this.field1692 >= 1) {
                                    this.field1719[this.field1674] = "Report abuse @whi@" + var5;
                                    this.field1401[this.field1674] = 2524;
                                    ++this.field1674;
                                }
                                this.field1719[this.field1674] = "Add ignore @whi@" + var5;
                                this.field1401[this.field1674] = 2047;
                                ++this.field1674;
                                this.field1719[this.field1674] = "Add friend @whi@" + var5;
                                this.field1401[this.field1674] = 2605;
                                ++this.field1674;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1386 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
    public final void method503(boolean arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1514 != -1) {
            this.field1592 = arg2;
            super.field28 = 0;
        }
        if (this.field1612 == -1) {
            this.field1349 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1351[var5] = this.field1351[var5 - 1];
            this.field1352[var5] = this.field1352[var5 - 1];
            this.field1353[var5] = this.field1353[var5 - 1];
        }
        this.field1351[0] = arg1;
        this.field1352[0] = arg3;
        this.field1645 &= arg0;
        this.field1353[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method504(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1624 = !this.field1624;
        }
        if (field1344 && this.field1405 == 2 && World.field45 != this.field1487) {
            this.field1668.method258(this.field1337);
            this.field1470.method202(0, 151, true, 257, "Loading - please wait.");
            this.field1470.method202(16777215, 150, true, 256, "Loading - please wait.");
            this.field1668.method259(4, -183, 4, super.field14);
            this.field1405 = 1;
            this.field1591 = System.currentTimeMillis();
        }
        if (this.field1405 == 1) {
            int var3 = this.method505(0);
            if (var3 != 0 && System.currentTimeMillis() - this.field1591 > 360000L) {
                signlink.reporterror(this.field1292 + " glcfb " + this.field1397 + "," + var3 + "," + field1344 + "," + this.field1573[0] + "," + this.field1368.method280() + "," + this.field1487 + "," + this.field1389 + "," + this.field1390);
                this.field1591 = System.currentTimeMillis();
            }
        }
        if (this.field1405 == 2 && this.field1487 != this.field1277) {
            this.field1277 = this.field1487;
            this.method557((byte) 8, this.field1487);
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)I")
    public final int method505(int arg0) {
        for (int var2 = 0; var2 < this.field1438.length; ++var2) {
            if (this.field1438[var2] == null && this.field1314[var2] != -1) {
                return -1;
            }
            if (this.field1574[var2] == null && this.field1315[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1438.length; ++var4) {
            byte[] var5 = this.field1574[var4];
            if (var5 != null) {
                int var6 = (this.field1313[var4] >> 8) * 64 - this.field1568;
                int var7 = (this.field1313[var4] & 255) * 64 - this.field1569;
                var3 &= World.method16(var5, var6, false, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1417) {
            return -4;
        } else {
            this.field1405 = 2;
            World.field45 = this.field1487;
            this.method451(44043);
            this.field1696 += arg0;
            this.field1287.method218(98, (byte) 19);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILd;IIZII)V")
    public final void method506(byte arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg0 == 92) {
            if (this.field1301) {
                this.field1298 = 32;
            } else {
                this.field1298 = 0;
            }
            this.field1301 = false;
            if (arg2 >= arg7 && arg2 < arg7 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
                arg3.field92 -= this.field1688 * 4;
                if (arg6) {
                    this.field1395 = true;
                    return;
                }
            } else if (arg2 >= arg7 && arg2 < arg7 + 16 && arg1 >= arg4 + arg5 - 16 && arg1 < arg4 + arg5) {
                arg3.field92 += this.field1688 * 4;
                if (arg6) {
                    this.field1395 = true;
                    return;
                }
            } else {
                if (arg2 < arg7 - this.field1298 || arg2 >= arg7 + 16 + this.field1298 || arg1 < arg4 + 16 || arg1 >= arg4 + arg5 - 16 || this.field1688 <= 0) {
                    return;
                }
                int var10 = (arg5 - 32) * arg5 / arg8;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg1 - arg4 - 16 - var10 / 2;
                int var12 = arg5 - 32 - var10;
                arg3.field92 = (arg8 - arg5) * var11 / var12;
                if (arg6) {
                    this.field1395 = true;
                }
                this.field1301 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method507(int arg0, int arg1, int arg2) {
        this.field1696 += arg2;
        boolean var4 = false;
        Component var5 = Component.field72[arg1];
        for (int var6 = 0; var6 < var5.field94.length && var5.field94[var6] != -1; ++var6) {
            Component var7 = Component.field72[var5.field94[var6]];
            if (var7.field79 == 1) {
                var4 |= this.method507(arg0, var7.field77, 0);
            }
            if (var7.field79 == 6 && (var7.field125 != -1 || var7.field126 != -1)) {
                boolean var8 = this.method519(var7, this.field1703);
                int var9;
                if (var8) {
                    var9 = var7.field126;
                } else {
                    var9 = var7.field125;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1155[var9];
                    var7.field76 += arg0;
                    while (var7.field76 > var10.method382(var7.field75, this.field1589)) {
                        var7.field76 -= var10.method382(var7.field75, this.field1589) + 1;
                        ++var7.field75;
                        if (var7.field75 >= var10.field1156) {
                            var7.field75 -= var10.field1160;
                            if (var7.field75 < 0 || var7.field75 >= var10.field1156) {
                                var7.field75 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        if (!this.field1441 && !this.field1251 && !this.field1461) {
            ++field1403;
            if (!this.field1645) {
                this.method514(this.field1436);
            } else {
                this.method441((byte) 5);
            }
            this.method459((byte) 4);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method508(int arg0) {
        this.field1696 += arg0;
        if (super.field28 == 1) {
            if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field1398[0] != -1) {
                this.field1395 = true;
                this.field1704 = 0;
                this.field1516 = true;
            }
            if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field1398[1] != -1) {
                this.field1395 = true;
                this.field1704 = 1;
                this.field1516 = true;
            }
            if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field1398[2] != -1) {
                this.field1395 = true;
                this.field1704 = 2;
                this.field1516 = true;
            }
            if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field1398[3] != -1) {
                this.field1395 = true;
                this.field1704 = 3;
                this.field1516 = true;
            }
            if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field1398[4] != -1) {
                this.field1395 = true;
                this.field1704 = 4;
                this.field1516 = true;
            }
            if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field1398[5] != -1) {
                this.field1395 = true;
                this.field1704 = 5;
                this.field1516 = true;
            }
            if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field1398[6] != -1) {
                this.field1395 = true;
                this.field1704 = 6;
                this.field1516 = true;
            }
            if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field1398[7] != -1) {
                this.field1395 = true;
                this.field1704 = 7;
                this.field1516 = true;
            }
            if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field1398[8] != -1) {
                this.field1395 = true;
                this.field1704 = 8;
                this.field1516 = true;
            }
            if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field1398[9] != -1) {
                this.field1395 = true;
                this.field1704 = 9;
                this.field1516 = true;
            }
            if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field1398[10] != -1) {
                this.field1395 = true;
                this.field1704 = 10;
                this.field1516 = true;
            }
            if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field1398[11] != -1) {
                this.field1395 = true;
                this.field1704 = 11;
                this.field1516 = true;
            }
            if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field1398[12] != -1) {
                this.field1395 = true;
                this.field1704 = 12;
                this.field1516 = true;
            }
            if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field1398[13] != -1) {
                this.field1395 = true;
                this.field1704 = 13;
                this.field1516 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public static final void method509(boolean arg0) {
        World3D.field289 = false;
        if (arg0) {
            Pix3D.field646 = false;
            field1344 = false;
            World.field44 = false;
            LocType.field951 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method510(boolean arg0, int arg1) {
        Component var3 = Component.field72[arg1];
        for (int var4 = 0; var4 < var3.field94.length && var3.field94[var4] != -1; ++var4) {
            Component var5 = Component.field72[var3.field94[var4]];
            if (var5.field79 == 1) {
                this.method510(true, var5.field77);
            }
            var5.field75 = 0;
            var5.field76 = 0;
        }
        if (!arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method511(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            field1565 = !field1565;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1267.method248(); var2 != null; var2 = (SpotAnimEntity) this.field1267.method250(7)) {
            if (this.field1487 == var2.field620 && !var2.field626) {
                if (field1403 >= var2.field619) {
                    var2.method151(457, this.field1263);
                    if (var2.field626) {
                        var2.method106();
                    } else {
                        this.field1253.method61(0, 60, -27991, var2.field623, false, var2, var2.field620, var2.field622, -1, var2.field621);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method512(int arg0) {
        if (arg0 <= 0) {
            this.field1473 = null;
        }
        for (int var2 = -1; var2 < this.field1306; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1304;
            } else {
                var3 = this.field1307[var2];
            }
            PlayerEntity var4 = this.field1305[var3];
            if (var4 != null) {
                this.method538(var4, -698, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method513(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1284[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field1718[var7][var5][var6] + this.field1718[var7][var5 + 1][var6] * var8 >> 7;
            this.field1645 &= arg1;
            int var11 = (128 - var8) * this.field1718[var7][var5][var6 + 1] + this.field1718[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method514(int arg0) {
        if (arg0 >= 0 && arg0 <= 0) {
            if (this.field1372 == 0) {
                int var2 = super.field12 / 2 - 80;
                int var3 = super.field13 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field28 == 1 && super.field29 >= var2 - 75 && super.field29 <= var2 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                    this.field1372 = 3;
                    this.field1601 = 0;
                }
                int var4 = super.field12 / 2 + 80;
                if (super.field28 == 1 && super.field29 >= var4 - 75 && super.field29 <= var4 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                    this.field1518 = "";
                    this.field1519 = "Enter your username & password.";
                    this.field1372 = 2;
                    this.field1601 = 0;
                }
            } else if (this.field1372 == 2) {
                int var5 = super.field13 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field28 == 1 && super.field30 >= var16 - 15 && super.field30 < var16) {
                    this.field1601 = 0;
                }
                var5 = var16 + 15;
                if (super.field28 == 1 && super.field30 >= var5 - 15 && super.field30 < var5) {
                    this.field1601 = 1;
                }
                var5 += 15;
                int var6 = super.field12 / 2 - 80;
                int var7 = super.field13 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field28 == 1 && super.field29 >= var6 - 75 && super.field29 <= var6 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                    this.field1502 = 0;
                    this.method521(this.field1292, this.field1293, false);
                    if (this.field1645) {
                        return;
                    }
                }
                int var8 = super.field12 / 2 + 80;
                if (super.field28 == 1 && super.field29 >= var8 - 75 && super.field29 <= var8 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                    this.field1372 = 0;
                    this.field1292 = "";
                    this.field1293 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method5(8);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field1483.length(); ++var11) {
                            if (var9 == field1483.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field1601 == 0) {
                            if (var9 == 8 && this.field1292.length() > 0) {
                                this.field1292 = this.field1292.substring(0, this.field1292.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1601 = 1;
                            }
                            if (var10) {
                                this.field1292 = this.field1292 + (char) var9;
                            }
                            if (this.field1292.length() > 12) {
                                this.field1292 = this.field1292.substring(0, 12);
                            }
                        } else if (this.field1601 == 1) {
                            if (var9 == 8 && this.field1293.length() > 0) {
                                this.field1293 = this.field1293.substring(0, this.field1293.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1601 = 0;
                            }
                            if (var10) {
                                this.field1293 = this.field1293 + (char) var9;
                            }
                            if (this.field1293.length() > 20) {
                                this.field1293 = this.field1293.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field1372 == 3) {
                    int var12 = super.field12 / 2;
                    int var13 = super.field13 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field28 == 1 && super.field29 >= var12 - 75 && super.field29 <= var12 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                        this.field1372 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method515(int arg0, Component arg1) {
        int var3 = arg1.field81;
        this.field1696 += arg0;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1719[this.field1674] = "Remove @whi@" + arg1.field113;
                this.field1401[this.field1674] = 884;
                ++this.field1674;
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
            this.field1719[this.field1674] = "Remove @whi@" + this.field1381[var3];
            this.field1401[this.field1674] = 513;
            ++this.field1674;
            this.field1719[this.field1674] = "Message @whi@" + this.field1381[var3];
            this.field1401[this.field1674] = 902;
            ++this.field1674;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLlb;I)V")
    private final void method516(byte arg0, Packet arg1, int arg2) {
        int var4 = arg1.method240(8, 0);
        if (var4 < this.field1306) {
            for (int var5 = var4; var5 < this.field1306; ++var5) {
                this.field1336[this.field1335++] = this.field1307[var5];
            }
        }
        if (var4 > this.field1306) {
            signlink.reporterror(this.field1292 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1306 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1307[var6];
                PlayerEntity var8 = this.field1305[var7];
                int var9 = arg1.method240(1, 0);
                if (var9 == 0) {
                    this.field1307[this.field1306++] = var7;
                    var8.field446 = field1403;
                } else {
                    int var10 = arg1.method240(2, 0);
                    if (var10 == 0) {
                        this.field1307[this.field1306++] = var7;
                        var8.field446 = field1403;
                        this.field1309[this.field1308++] = var7;
                    } else if (var10 == 1) {
                        this.field1307[this.field1306++] = var7;
                        var8.field446 = field1403;
                        int var11 = arg1.method240(3, 0);
                        var8.method111(0, false, var11);
                        int var12 = arg1.method240(1, 0);
                        if (var12 == 1) {
                            this.field1309[this.field1308++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1307[this.field1306++] = var7;
                        var8.field446 = field1403;
                        int var13 = arg1.method240(3, 0);
                        var8.method111(0, true, var13);
                        int var14 = arg1.method240(3, 0);
                        var8.method111(0, true, var14);
                        int var15 = arg1.method240(1, 0);
                        if (var15 == 1) {
                            this.field1309[this.field1308++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1336[this.field1335++] = var7;
                    }
                }
            }
            if (arg0 != -109) {
                this.field1347 = this.field1338.method295();
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method517(boolean arg0) {
        this.field1463 = true;
        this.field1645 &= arg0;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1646[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1133; ++var3) {
                if (!IdkType.field1134[var3].field1140 && IdkType.field1134[var3].field1135 == var2 + (this.field1250 ? 0 : 7)) {
                    this.field1646[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;II)Lxb;")
    public final Jagfile method518(boolean arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            byte[] var7 = null;
            int var8 = 5;
            try {
                if (this.field1573[0] != null) {
                    var7 = this.field1573[0].method291(arg2, false);
                }
            } catch (Exception var30) {
            }
            if (var7 != null) {
                this.field1350.reset();
                this.field1350.update(var7);
                int var9 = (int) this.field1350.getValue();
                if (arg5 != var9) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new Jagfile(var7, false);
            } else {
                int var11 = 0;
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method13(arg4, "Requesting " + arg3, (byte) 7);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method531(arg1 + arg5);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        Packet var17 = new Packet(false, var16);
                        var17.field716 = 3;
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
                                this.method13(arg4, "Loading " + arg3 + " - " + var23 + "%", (byte) 7);
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field1573[0] != null) {
                                this.field1573[0].method292(true, var7.length, var7, arg2);
                            }
                        } catch (Exception var29) {
                            this.field1573[0] = null;
                        }
                        if (var7 != null) {
                            this.field1350.reset();
                            this.field1350.update(var7);
                            int var24 = (int) this.field1350.getValue();
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
                                this.method13(arg4, "Game updated - please reload page", (byte) 7);
                                var26 = 10;
                            } else {
                                this.method13(arg4, var12 + " - Retrying in " + var26, (byte) 7);
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
                        this.field1709 = !this.field1709;
                    }
                }
                return new Jagfile(var7, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method519(Component arg0, byte arg1) {
        if (this.field1440 != arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0.field88 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < arg0.field88.length; ++var4) {
                int var5 = this.method448(var4, true, arg0);
                int var6 = arg0.field89[var4];
                if (arg0.field88[var4] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field88[var4] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field88[var4] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method520(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1473 = null;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method521(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1518 = "";
                this.field1519 = "Connecting to server...";
                this.method536((byte) 3, true);
            }
            this.field1691 = new ClientStream(this.method560(field1342 + 43594), (byte) 8, this);
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1287.field716 = 0;
            this.field1287.method219(14);
            this.field1287.method219(var6);
            this.field1691.method42(true, this.field1287.field715, 2, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1691.method39();
            }
            int var8 = this.field1691.method39();
            int var9 = var8;
            if (var8 == 0) {
                this.field1691.method41(this.field1404.field715, 0, 8);
                this.field1404.field716 = 0;
                this.field1397 = this.field1404.method235((byte) 9);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1397 >> 32), (int) this.field1397 };
                this.field1287.field716 = 0;
                this.field1287.method219(10);
                this.field1287.method223(var10[0]);
                this.field1287.method223(var10[1]);
                this.field1287.method223(var10[2]);
                this.field1287.method223(var10[3]);
                this.field1287.method223(signlink.uid);
                this.field1287.method226(arg0);
                this.field1287.method226(arg1);
                this.field1287.method244(8, field1655, field1626);
                this.field1340.field716 = 0;
                if (arg2) {
                    this.field1340.method219(18);
                } else {
                    this.field1340.method219(16);
                }
                this.field1340.method219(this.field1287.field716 + 36 + 1 + 1 + 2);
                this.field1340.method219(255);
                this.field1340.method220(300);
                this.field1340.method219(field1344 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field1340.method223(this.field1439[var11]);
                }
                this.field1340.method227(0, this.field1287.field715, (byte) 0, this.field1287.field716);
                this.field1287.field720 = new Isaac((byte) -101, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field1338 = new Isaac((byte) -101, var10);
                this.field1691.method42(true, this.field1340.field715, this.field1340.field716, 0);
                var8 = this.field1691.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method521(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1692 = this.field1691.method39();
                field1382 = this.field1691.method39() == 1;
                this.field1663 = 0L;
                this.field1541 = 0;
                this.field1383.field1001 = 0;
                super.field19 = true;
                this.field1572 = true;
                this.field1645 = true;
                this.field1287.field716 = 0;
                this.field1404.field716 = 0;
                this.field1697 = -1;
                this.field1295 = -1;
                this.field1296 = -1;
                this.field1297 = -1;
                this.field1696 = 0;
                this.field1698 = 0;
                this.field1330 = 0;
                this.field1700 = 0;
                this.field1638 = 0;
                this.field1674 = 0;
                this.field1641 = false;
                super.field20 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field1353[var13] = null;
                }
                this.field1504 = 0;
                this.field1581 = 0;
                this.field1405 = 0;
                this.field1450 = 0;
                this.field1323 = (int) (Math.random() * 100.0D) - 50;
                this.field1701 = (int) (Math.random() * 110.0D) - 55;
                this.field1270 = (int) (Math.random() * 80.0D) - 40;
                this.field1364 = (int) (Math.random() * 120.0D) - 60;
                this.field1675 = (int) (Math.random() * 30.0D) - 20;
                this.field1360 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1533 = 0;
                this.field1277 = -1;
                this.field1706 = 0;
                this.field1707 = 0;
                this.field1306 = 0;
                this.field1630 = 0;
                for (int var14 = 0; var14 < this.field1303; ++var14) {
                    this.field1305[var14] = null;
                    this.field1310[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field1629[var15] = null;
                }
                field1396 = this.field1305[this.field1304] = new PlayerEntity();
                this.field1693.method252();
                this.field1267.method252();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field1473[var16][var17][var18] = null;
                        }
                    }
                }
                this.field1639 = new LinkList(field1482);
                this.field1385 = 0;
                this.field1384 = 0;
                this.field1514 = -1;
                this.field1612 = -1;
                this.field1339 = -1;
                this.field1419 = -1;
                this.field1694 = -1;
                this.field1422 = false;
                this.field1704 = 3;
                this.field1377 = false;
                this.field1641 = false;
                this.field1575 = false;
                this.field1592 = null;
                this.field1670 = 0;
                this.field1346 = -1;
                this.field1250 = true;
                this.method517(this.field1548);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1690[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field1563[var20] = null;
                    this.field1564[var20] = false;
                }
                field1515 = 0;
                field1535 = 0;
                field1489 = 0;
                field1302 = 0;
                field1278 = 0;
                field1492 = 0;
                field1716 = 0;
                field1544 = 0;
                field1603 = 0;
                field1387 = 0;
                this.method460(560);
            } else if (var8 == 3) {
                this.field1518 = "";
                this.field1519 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1518 = "Your account has been disabled.";
                this.field1519 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1518 = "Your account is already logged in.";
                this.field1519 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1518 = "RuneScape has been updated!";
                this.field1519 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1518 = "This world is full.";
                this.field1519 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1518 = "Unable to connect.";
                this.field1519 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1518 = "Login limit exceeded.";
                this.field1519 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1518 = "Unable to connect.";
                this.field1519 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1519 = "Login server rejected session.";
                this.field1519 = "Please try again.";
            } else if (var8 == 12) {
                this.field1518 = "You need a members account to login to this world.";
                this.field1519 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1518 = "Could not complete login.";
                this.field1519 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1518 = "The server is being updated.";
                this.field1519 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1645 = true;
                this.field1287.field716 = 0;
                this.field1404.field716 = 0;
                this.field1697 = -1;
                this.field1295 = -1;
                this.field1296 = -1;
                this.field1297 = -1;
                this.field1696 = 0;
                this.field1698 = 0;
                this.field1330 = 0;
                this.field1674 = 0;
                this.field1641 = false;
                this.field1591 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1518 = "Login attempts exceeded.";
                this.field1519 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1518 = "You are standing in a members-only area.";
                this.field1519 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1518 = "Invalid loginserver requested";
                this.field1519 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field1502 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field1502;
                            this.method521(arg0, arg1, arg2);
                        } else {
                            this.field1518 = "No response from loginserver";
                            this.field1519 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field1518 = "No response from server";
                        this.field1519 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field1518 = "Unexpected server response";
                    this.field1519 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field1691.method39(); var21 >= 0; --var21) {
                    this.field1518 = "You have only just left another world";
                    this.field1519 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method536((byte) 3, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method521(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field1518 = "";
            this.field1519 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method522(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1585 >= 100) {
                this.method503(true, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = JString.method304(-257, JString.method301(arg1, 0));
                for (int var5 = 0; var5 < this.field1585; ++var5) {
                    if (this.field1453[var5] == arg1) {
                        this.method503(true, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1384; ++var6) {
                    if (this.field1616[var6] == arg1) {
                        this.method503(true, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                if (arg0) {
                    this.field1357 = !this.field1357;
                }
                this.field1453[this.field1585++] = arg1;
                this.field1395 = true;
                this.field1287.method218(131, (byte) 19);
                this.field1287.method225(arg1, -40349);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method523(boolean arg0) {
        if (arg0) {
            this.field1697 = this.field1404.method229();
        }
        if (this.field1533 == 0) {
            if (super.field28 == 1) {
                int var2 = super.field29 - 25 - 550;
                int var3 = super.field30 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1364 + this.field1360 & 2047;
                    int var5 = Pix3D.field655[var4];
                    int var6 = Pix3D.field656[var4];
                    int var7 = (this.field1675 + 256) * var5 >> 8;
                    int var8 = (this.field1675 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1396.field401 + var9 >> 7;
                    int var12 = field1396.field402 - var10 >> 7;
                    boolean var13 = this.method535(field1396.field451[0], 0, 0, 0, true, 0, var12, 1, var11, (byte) 9, 0, field1396.field452[0]);
                    if (var13) {
                        this.field1287.method219(var2);
                        this.field1287.method219(var3);
                        this.field1287.method220(this.field1360);
                        this.field1287.method219(57);
                        this.field1287.method219(this.field1364);
                        this.field1287.method219(this.field1675);
                        this.field1287.method219(89);
                        this.field1287.method220(field1396.field401);
                        this.field1287.method220(field1396.field402);
                        this.field1287.method219(this.field1613);
                        this.field1287.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method524(boolean arg0) {
        if (this.field1674 >= 2 || this.field1504 != 0 || this.field1581 != 0) {
            String var2;
            if (this.field1504 == 1 && this.field1674 < 2) {
                var2 = "Use " + this.field1508 + " with...";
            } else if (this.field1581 == 1 && this.field1674 < 2) {
                var2 = this.field1584 + "...";
            } else {
                var2 = this.field1719[this.field1674 - 1];
            }
            if (this.field1674 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1674 - 2) + " more options";
            }
            this.field1471.method211(33217, field1403 / 1000, 16777215, 15, var2, true, 4);
            if (arg0) {
                this.field1473 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Z")
    public final boolean method525(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var4 = this.field1401[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;II)V")
    private final void method526(Packet arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field1287.method219(20);
        }
        for (int var4 = 0; var4 < this.field1308; ++var4) {
            int var5 = this.field1309[var4];
            PlayerEntity var6 = this.field1305[var5];
            int var7 = arg0.method229();
            if ((var7 & 128) == 128) {
                var7 += arg0.method229() << 8;
            }
            this.method483(-48904, var6, arg0, var5, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BZ)V")
    public final void method527(byte arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (arg0 != 22) {
            this.field1473 = null;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method528(int arg0) {
        while (arg0 >= 0) {
            this.method6();
        }
        try {
            int var2 = field1396.field401 + this.field1323;
            int var3 = field1396.field402 + this.field1701;
            if (this.field1520 - var2 < -500 || this.field1520 - var2 > 500 || this.field1521 - var3 < -500 || this.field1521 - var3 > 500) {
                this.field1520 = var2;
                this.field1521 = var3;
            }
            if (this.field1520 != var2) {
                this.field1520 += (var2 - this.field1520) / 16;
            }
            if (this.field1521 != var3) {
                this.field1521 += (var3 - this.field1521) / 16;
            }
            if (super.field32[1] == 1) {
                this.field1361 += (-24 - this.field1361) / 2;
            } else if (super.field32[2] == 1) {
                this.field1361 += (24 - this.field1361) / 2;
            } else {
                this.field1361 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field1362 += (12 - this.field1362) / 2;
            } else if (super.field32[4] == 1) {
                this.field1362 += (-12 - this.field1362) / 2;
            } else {
                this.field1362 /= 2;
            }
            this.field1360 = this.field1361 / 2 + this.field1360 & 2047;
            this.field1359 += this.field1362 / 2;
            if (this.field1359 < 128) {
                this.field1359 = 128;
            }
            if (this.field1359 > 383) {
                this.field1359 = 383;
            }
            int var4 = this.field1520 >> 7;
            int var5 = this.field1521 >> 7;
            int var6 = this.method513(this.field1521, true, this.field1520, this.field1487);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1487;
                        if (var10 < 3 && (this.field1284[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1718[var10][var8][var9];
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
            if (var12 > this.field1664) {
                this.field1664 += (var12 - this.field1664) / 24;
            } else if (var12 < this.field1664) {
                this.field1664 += (var12 - this.field1664) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1396.field401 + "," + field1396.field402 + "," + this.field1520 + "," + this.field1521 + "," + this.field1389 + "," + this.field1390 + "," + this.field1568 + "," + this.field1569);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method529(int arg0) {
        this.field1666.method258(this.field1337);
        Pix3D.field657 = this.field1633;
        if (arg0 != 5) {
            this.field1287.method219(246);
        }
        this.field1427.method199(0, 0, -47687);
        if (this.field1419 != -1) {
            this.method447(Component.field72[this.field1419], 0, 0, 0, -23258);
        } else if (this.field1398[this.field1704] != -1) {
            this.method447(Component.field72[this.field1398[this.field1704]], 0, 0, 0, -23258);
        }
        if (this.field1641 && this.field1656 == 1) {
            this.method493((byte) 102);
        }
        this.field1666.method259(205, -183, 553, super.field14);
        this.field1668.method258(this.field1337);
        Pix3D.field657 = this.field1634;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)Z")
    public final boolean method530(int arg0) {
        while (arg0 >= 0) {
            this.field1423 = 214;
        }
        if (this.field1691 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1691.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1697 == -1) {
                    this.field1691.method41(this.field1404.field715, 0, 1);
                    this.field1697 = this.field1404.field715[0] & 255;
                    if (this.field1338 != null) {
                        this.field1697 = this.field1697 - this.field1338.method295() & 255;
                    }
                    this.field1696 = Protocol.field1100[this.field1697];
                    --var2;
                }
                if (this.field1696 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1691.method41(this.field1404.field715, 0, 1);
                    this.field1696 = this.field1404.field715[0] & 255;
                    --var2;
                }
                if (this.field1696 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1691.method41(this.field1404.field715, 0, 2);
                    this.field1404.field716 = 0;
                    this.field1696 = this.field1404.method231();
                    var2 -= 2;
                }
                if (var2 < this.field1696) {
                    return false;
                }
                this.field1404.field716 = 0;
                this.field1691.method41(this.field1404.field715, 0, this.field1696);
                this.field1698 = 0;
                this.field1297 = this.field1296;
                this.field1296 = this.field1295;
                this.field1295 = this.field1697;
                if (this.field1697 == 242) {
                    this.field1255 = this.field1404.method229();
                    this.field1256 = this.field1404.method229();
                    for (int var3 = this.field1255; var3 < this.field1255 + 8; ++var3) {
                        for (int var4 = this.field1256; var4 < this.field1256 + 8; ++var4) {
                            if (this.field1473[this.field1487][var3][var4] != null) {
                                this.field1473[this.field1487][var3][var4] = null;
                                this.method470(var3, var4);
                            }
                        }
                    }
                    for (LocSpawned var5 = (LocSpawned) this.field1639.method248(); var5 != null; var5 = (LocSpawned) this.field1639.method250(7)) {
                        if (var5.field736 >= this.field1255 && var5.field736 < this.field1255 + 8 && var5.field737 >= this.field1256 && var5.field737 < this.field1256 + 8 && this.field1487 == var5.field734) {
                            var5.field745 = 0;
                        }
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 185) {
                    int var6 = this.field1404.method231();
                    String var7 = this.field1404.method236();
                    Component.field72[var6].field113 = var7;
                    if (this.field1398[this.field1704] == Component.field72[var6].field78) {
                        this.field1395 = true;
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 213) {
                    int var8 = this.field1404.method231();
                    Component.field72[var8].field121 = 3;
                    if (field1396.field485 == null) {
                        Component.field72[var8].field122 = (field1396.field467[11] << 5) + (field1396.field467[8] << 10) + (field1396.field467[0] << 15) + (field1396.field468[0] << 25) + (field1396.field468[4] << 20) + field1396.field467[1];
                    } else {
                        Component.field72[var8].field122 = (int) (field1396.field485.field1017 + 305419896L);
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 122) {
                    this.method461(this.field1404, this.field1696, this.field1388);
                    this.field1417 = false;
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 116) {
                    int var9 = this.field1404.method231();
                    int var10 = this.field1404.method229();
                    int var11 = this.field1404.method231();
                    if (this.field1710 && !field1344 && this.field1450 < 50) {
                        this.field1373[this.field1450] = var9;
                        this.field1290[this.field1450] = var10;
                        this.field1562[this.field1450] = Wave.field915[var9] + var11;
                        ++this.field1450;
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 167) {
                    int var12 = this.field1404.method231();
                    int var13 = this.field1404.method232();
                    Component var14 = Component.field72[var12];
                    var14.field125 = var13;
                    if (var13 == -1) {
                        var14.field75 = 0;
                        var14.field76 = 0;
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 214) {
                    if (this.field1704 == 12) {
                        this.field1395 = true;
                    }
                    this.field1369 = this.field1404.method232();
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 44) {
                    this.field1687 = this.field1404.method234();
                    this.field1644 = this.field1404.method231();
                    this.field1474 = this.field1404.method229();
                    this.field1497 = this.field1404.method231();
                    this.field1300 = this.field1404.method229();
                    if (this.field1687 != 0 && this.field1339 == -1) {
                        signlink.dnslookup(JString.method303(true, this.field1687));
                        this.method457(false);
                        short var15 = 650;
                        if (this.field1474 != 201 || this.field1300 == 1) {
                            var15 = 655;
                        }
                        this.field1430 = "";
                        this.field1705 = false;
                        for (int var16 = 0; var16 < Component.field72.length; ++var16) {
                            if (Component.field72[var16] != null && Component.field72[var16].field81 == var15) {
                                this.field1339 = Component.field72[var16].field78;
                                break;
                            }
                        }
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 236) {
                    int var17 = this.field1404.method231();
                    int var18 = this.field1404.method231();
                    int var19 = var18 >> 10 & 31;
                    int var20 = var18 >> 5 & 31;
                    int var21 = var18 & 31;
                    Component.field72[var17].field115 = (var21 << 3) + (var19 << 19) + (var20 << 11);
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 235) {
                    this.field1395 = true;
                    int var22 = this.field1404.method231();
                    Component var23 = Component.field72[var22];
                    int var24 = this.field1404.method231();
                    for (int var25 = 0; var25 < var24; ++var25) {
                        var23.field73[var25] = this.field1404.method231();
                        int var26 = this.field1404.method229();
                        if (var26 == 255) {
                            var26 = this.field1404.method234();
                        }
                        var23.field74[var25] = var26;
                    }
                    for (int var27 = var24; var27 < var23.field73.length; ++var27) {
                        var23.field73[var27] = 0;
                        var23.field74[var27] = 0;
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 217) {
                    this.field1395 = true;
                    int var28 = this.field1404.method229();
                    int var29 = this.field1404.method234();
                    int var30 = this.field1404.method229();
                    this.field1594[var28] = var29;
                    this.field1503[var28] = var30;
                    this.field1637[var28] = 1;
                    for (int var31 = 0; var31 < 98; ++var31) {
                        if (var29 >= field1455[var31]) {
                            this.field1637[var28] = var31 + 2;
                        }
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 107) {
                    int var32 = this.field1404.method232();
                    this.field1514 = var32;
                    this.field1349 = true;
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 18) {
                    long var33 = this.field1404.method235((byte) 9);
                    int var35 = this.field1404.method229();
                    String var36 = JString.method304(-257, JString.method301(var33, 0));
                    for (int var37 = 0; var37 < this.field1384; ++var37) {
                        if (this.field1616[var37] == var33) {
                            if (this.field1652[var37] != var35) {
                                this.field1652[var37] = var35;
                                this.field1395 = true;
                                if (var35 > 0) {
                                    this.method503(true, 5, var36 + " has logged in.", "");
                                }
                                if (var35 == 0) {
                                    this.method503(true, 5, var36 + " has logged out.", "");
                                }
                            }
                            var36 = null;
                            break;
                        }
                    }
                    if (var36 != null && this.field1384 < 200) {
                        this.field1616[this.field1384] = var33;
                        this.field1381[this.field1384] = var36;
                        this.field1652[this.field1384] = var35;
                        ++this.field1384;
                        this.field1395 = true;
                    }
                    boolean var38 = false;
                    while (!var38) {
                        var38 = true;
                        for (int var39 = 0; var39 < this.field1384 - 1; ++var39) {
                            if (this.field1652[var39] != field1341 && this.field1652[var39 + 1] == field1341 || this.field1652[var39] == 0 && this.field1652[var39 + 1] != 0) {
                                int var40 = this.field1652[var39];
                                this.field1652[var39] = this.field1652[var39 + 1];
                                this.field1652[var39 + 1] = var40;
                                String var41 = this.field1381[var39];
                                this.field1381[var39] = this.field1381[var39 + 1];
                                this.field1381[var39 + 1] = var41;
                                long var42 = this.field1616[var39];
                                this.field1616[var39] = this.field1616[var39 + 1];
                                this.field1616[var39 + 1] = var42;
                                this.field1395 = true;
                                var38 = false;
                            }
                        }
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 127) {
                    this.field1394 = false;
                    for (int var44 = 0; var44 < 5; ++var44) {
                        this.field1625[var44] = false;
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 27) {
                    int var45 = this.field1404.method231();
                    int var46 = this.field1404.method231();
                    Component.field72[var45].field121 = 1;
                    Component.field72[var45].field122 = var46;
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 124) {
                    this.field1394 = true;
                    this.field1244 = this.field1404.method229();
                    this.field1245 = this.field1404.method229();
                    this.field1246 = this.field1404.method231();
                    this.field1247 = this.field1404.method229();
                    this.field1248 = this.field1404.method229();
                    if (this.field1248 >= 100) {
                        int var47 = this.field1244 * 128 + 64;
                        int var48 = this.field1245 * 128 + 64;
                        int var49 = this.method513(var48, true, var47, this.field1487) - this.field1246;
                        int var50 = var47 - this.field1431;
                        int var51 = var49 - this.field1432;
                        int var52 = var48 - this.field1433;
                        int var53 = (int) Math.sqrt((double) (var50 * var50 + var52 * var52));
                        this.field1434 = (int) (Math.atan2((double) var51, (double) var53) * 325.949D) & 2047;
                        this.field1435 = (int) (Math.atan2((double) var50, (double) var52) * -325.949D) & 2047;
                        if (this.field1434 < 128) {
                            this.field1434 = 128;
                        }
                        if (this.field1434 > 383) {
                            this.field1434 = 383;
                        }
                    }
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 89) {
                    int var54 = this.field1404.method231();
                    int var55 = this.field1404.method232();
                    int var56 = this.field1404.method232();
                    Component var57 = Component.field72[var54];
                    var57.field85 = var55;
                    var57.field86 = var56;
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 == 22) {
                    this.field1325 = this.field1404.method231();
                    this.field1454 = this.field1404.method229();
                    this.field1697 = -1;
                    return true;
                }
                if (this.field1697 != 239 && this.field1697 != 74) {
                    if (this.field1697 == 109) {
                        this.field1255 = this.field1404.method229();
                        this.field1256 = this.field1404.method229();
                        while (this.field1404.field716 < this.field1696) {
                            int var92 = this.field1404.method229();
                            this.method440(false, var92, this.field1404);
                        }
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 31) {
                        int var93 = this.field1404.method231();
                        if (var93 == 65535) {
                            var93 = -1;
                        }
                        if (this.field1672 != var93 && this.field1258 && !field1344 && this.field1534 == 0) {
                            this.field1485 = var93;
                            this.field1486 = true;
                            this.field1368.method279(2, this.field1485);
                        }
                        this.field1672 = var93;
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 218) {
                        int var94 = this.field1404.method231();
                        int var95 = this.field1404.method231();
                        if (this.field1258 && !field1344) {
                            this.field1485 = var94;
                            this.field1486 = false;
                            this.field1368.method279(2, this.field1485);
                            this.field1534 = var95;
                        }
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 139) {
                        int var96 = this.field1404.method231();
                        int var97 = this.field1404.method231();
                        Component.field72[var96].field121 = 2;
                        Component.field72[var96].field122 = var97;
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 24) {
                        int var98 = this.field1404.method229();
                        int var99 = this.field1404.method229();
                        String var100 = this.field1404.method236();
                        if (var98 >= 1 && var98 <= 5) {
                            if (var100.equalsIgnoreCase("null")) {
                                var100 = null;
                            }
                            this.field1563[var98 - 1] = var100;
                            this.field1564[var98 - 1] = var99 == 0;
                        }
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 132) {
                        int var101 = this.field1404.method232();
                        if (var101 >= 0) {
                            this.method510(true, var101);
                        }
                        this.field1694 = var101;
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 58) {
                        this.method532(this.field1404, this.field1696, -324);
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 162) {
                        this.field1533 = this.field1404.method229();
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 169) {
                        int var102 = this.field1404.method231();
                        byte var103 = this.field1404.method230();
                        this.field1326[var102] = var103;
                        if (this.field1249[var102] != var103) {
                            this.field1249[var102] = var103;
                            this.method495(-155, var102);
                            this.field1395 = true;
                            if (this.field1514 != -1) {
                                this.field1349 = true;
                            }
                        }
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 == 148) {
                        for (int var104 = 0; var104 < this.field1305.length; ++var104) {
                            if (this.field1305[var104] != null) {
                                this.field1305[var104].field429 = -1;
                            }
                        }
                        for (int var105 = 0; var105 < this.field1629.length; ++var105) {
                            if (this.field1629[var105] != null) {
                                this.field1629[var105].field429 = -1;
                            }
                        }
                        this.field1697 = -1;
                        return true;
                    }
                    if (this.field1697 != 19 && this.field1697 != 197 && this.field1697 != 35 && this.field1697 != 14 && this.field1697 != 45 && this.field1697 != 192 && this.field1697 != 76 && this.field1697 != 7 && this.field1697 != 188 && this.field1697 != 237 && this.field1697 != 142) {
                        if (this.field1697 == 120) {
                            int var106 = this.field1404.method231();
                            this.method510(true, var106);
                            if (this.field1419 != -1) {
                                this.field1419 = -1;
                                this.field1395 = true;
                                this.field1516 = true;
                            }
                            this.field1612 = var106;
                            this.field1349 = true;
                            this.field1339 = -1;
                            this.field1422 = false;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 244) {
                            String var107 = this.field1404.method236();
                            if (var107.endsWith(":tradereq:")) {
                                String var108 = var107.substring(0, var107.indexOf(":"));
                                long var109 = JString.method300(var108);
                                boolean var111 = false;
                                for (int var112 = 0; var112 < this.field1585; ++var112) {
                                    if (this.field1453[var112] == var109) {
                                        var111 = true;
                                        break;
                                    }
                                }
                                if (!var111 && this.field1367 == 0) {
                                    this.method503(true, 4, "wishes to trade with you.", var108);
                                }
                            } else if (var107.endsWith(":duelreq:")) {
                                String var113 = var107.substring(0, var107.indexOf(":"));
                                long var114 = JString.method300(var113);
                                boolean var116 = false;
                                for (int var117 = 0; var117 < this.field1585; ++var117) {
                                    if (this.field1453[var117] == var114) {
                                        var116 = true;
                                        break;
                                    }
                                }
                                if (!var116 && this.field1367 == 0) {
                                    this.method503(true, 8, "wishes to duel with you.", var113);
                                }
                            } else if (!var107.endsWith(":chalreq:")) {
                                this.method503(true, 0, var107, "");
                            } else {
                                String var118 = var107.substring(0, var107.indexOf(":"));
                                long var119 = JString.method300(var118);
                                boolean var121 = false;
                                for (int var122 = 0; var122 < this.field1585; ++var122) {
                                    if (this.field1453[var122] == var119) {
                                        var121 = true;
                                        break;
                                    }
                                }
                                if (!var121 && this.field1367 == 0) {
                                    String var123 = var107.substring(var107.indexOf(":") + 1, var107.length() - 9);
                                    this.method503(true, 8, var123, var118);
                                }
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 34) {
                            this.field1706 = 0;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 101) {
                            this.field1585 = this.field1696 / 8;
                            for (int var124 = 0; var124 < this.field1585; ++var124) {
                                this.field1453[var124] = this.field1404.method235((byte) 9);
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 66) {
                            int var125 = this.field1404.method231();
                            this.method510(true, var125);
                            if (this.field1612 != -1) {
                                this.field1612 = -1;
                                this.field1349 = true;
                            }
                            if (this.field1377) {
                                this.field1377 = false;
                                this.field1349 = true;
                            }
                            this.field1419 = var125;
                            this.field1395 = true;
                            this.field1516 = true;
                            this.field1339 = -1;
                            this.field1422 = false;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 229) {
                            this.method468((byte) 0);
                            this.field1697 = -1;
                            return false;
                        }
                        if (this.field1697 == 69) {
                            long var126 = this.field1404.method235((byte) 9);
                            int var128 = this.field1404.method234();
                            int var129 = this.field1404.method229();
                            boolean var130 = false;
                            for (int var131 = 0; var131 < 100; ++var131) {
                                if (this.field1426[var131] == var128) {
                                    var130 = true;
                                    break;
                                }
                            }
                            if (var129 <= 1) {
                                for (int var132 = 0; var132 < this.field1585; ++var132) {
                                    if (this.field1453[var132] == var126) {
                                        var130 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var130 && this.field1367 == 0) {
                                try {
                                    this.field1426[this.field1242] = var128;
                                    this.field1242 = (this.field1242 + 1) % 100;
                                    String var133 = WordPack.method306(this.field1404, this.field1696 - 13, 0);
                                    if (var129 != 3) {
                                        var133 = WordFilter.method401((byte) 2, var133);
                                    }
                                    if (var129 != 2 && var129 != 3) {
                                        if (var129 == 1) {
                                            this.method503(true, 7, var133, "@cr1@" + JString.method304(-257, JString.method301(var126, 0)));
                                        } else {
                                            this.method503(true, 3, var133, JString.method304(-257, JString.method301(var126, 0)));
                                        }
                                    } else {
                                        this.method503(true, 7, var133, "@cr2@" + JString.method304(-257, JString.method301(var126, 0)));
                                    }
                                } catch (Exception var171) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 176) {
                            this.field1330 = this.field1404.method231() * 30;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 156) {
                            int var135 = this.field1404.method231();
                            int var136 = this.field1404.method229();
                            if (var135 == 65535) {
                                var135 = -1;
                            }
                            this.field1398[var136] = var135;
                            this.field1395 = true;
                            this.field1516 = true;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 224) {
                            this.field1385 = this.field1404.method229();
                            this.field1395 = true;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 42) {
                            this.field1575 = false;
                            this.field1377 = true;
                            this.field1356 = "";
                            this.field1349 = true;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 195) {
                            if (this.field1419 != -1) {
                                this.field1419 = -1;
                                this.field1395 = true;
                                this.field1516 = true;
                            }
                            if (this.field1612 != -1) {
                                this.field1612 = -1;
                                this.field1349 = true;
                            }
                            if (this.field1377) {
                                this.field1377 = false;
                                this.field1349 = true;
                            }
                            this.field1339 = -1;
                            this.field1422 = false;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 228) {
                            this.field1255 = this.field1404.method229();
                            this.field1256 = this.field1404.method229();
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 221) {
                            int var137 = this.field1404.method231();
                            int var138 = this.field1404.method234();
                            this.field1326[var137] = var138;
                            if (this.field1249[var137] != var138) {
                                this.field1249[var137] = var138;
                                this.method495(-155, var137);
                                this.field1395 = true;
                                if (this.field1514 != -1) {
                                    this.field1349 = true;
                                }
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 111) {
                            this.field1704 = this.field1404.method229();
                            this.field1395 = true;
                            this.field1516 = true;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 180) {
                            int var139 = this.field1404.method231();
                            boolean var140 = this.field1404.method229() == 1;
                            Component.field72[var139].field93 = var140;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 36) {
                            int var141 = this.field1404.method231();
                            int var142 = this.field1404.method231();
                            int var143 = this.field1404.method231();
                            int var144 = this.field1404.method231();
                            Component.field72[var141].field128 = var142;
                            Component.field72[var141].field129 = var143;
                            Component.field72[var141].field127 = var144;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 159) {
                            this.field1670 = this.field1404.method229();
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 249) {
                            int var145 = this.field1404.method231();
                            int var146 = this.field1404.method231();
                            Component var147 = Component.field72[var145];
                            if (var147 != null && var147.field79 == 0) {
                                if (var146 < 0) {
                                    var146 = 0;
                                }
                                if (var146 > var147.field91 - var147.field83) {
                                    var146 = var147.field91 - var147.field83;
                                }
                                var147.field92 = var146;
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 234) {
                            int var148 = this.field1404.method229();
                            int var149 = this.field1404.method229();
                            int var150 = this.field1404.method229();
                            int var151 = this.field1404.method229();
                            this.field1625[var148] = true;
                            this.field1550[var148] = var149;
                            this.field1654[var148] = var150;
                            this.field1294[var148] = var151;
                            this.field1488[var148] = 0;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 179) {
                            this.field1628 = this.field1404.method229();
                            this.field1386 = this.field1404.method229();
                            this.field1494 = this.field1404.method229();
                            this.field1266 = true;
                            this.field1349 = true;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 16) {
                            int var152 = this.field1404.method231();
                            this.method510(true, var152);
                            if (this.field1419 != -1) {
                                this.field1419 = -1;
                                this.field1395 = true;
                                this.field1516 = true;
                            }
                            if (this.field1612 != -1) {
                                this.field1612 = -1;
                                this.field1349 = true;
                            }
                            if (this.field1377) {
                                this.field1377 = false;
                                this.field1349 = true;
                            }
                            this.field1339 = var152;
                            this.field1422 = false;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 231) {
                            this.field1638 = this.field1404.method229();
                            if (this.field1638 == 1) {
                                this.field1500 = this.field1404.method231();
                            }
                            if (this.field1638 >= 2 && this.field1638 <= 6) {
                                if (this.field1638 == 2) {
                                    this.field1480 = 64;
                                    this.field1481 = 64;
                                }
                                if (this.field1638 == 3) {
                                    this.field1480 = 0;
                                    this.field1481 = 64;
                                }
                                if (this.field1638 == 4) {
                                    this.field1480 = 128;
                                    this.field1481 = 64;
                                }
                                if (this.field1638 == 5) {
                                    this.field1480 = 64;
                                    this.field1481 = 0;
                                }
                                if (this.field1638 == 6) {
                                    this.field1480 = 64;
                                    this.field1481 = 128;
                                }
                                this.field1638 = 2;
                                this.field1477 = this.field1404.method231();
                                this.field1478 = this.field1404.method231();
                                this.field1479 = this.field1404.method229();
                            }
                            if (this.field1638 == 10) {
                                this.field1686 = this.field1404.method231();
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 143) {
                            int var153 = this.field1404.method231();
                            int var154 = this.field1404.method231();
                            int var155 = this.field1404.method231();
                            if (var154 == 65535) {
                                Component.field72[var153].field121 = 0;
                                this.field1697 = -1;
                                return true;
                            }
                            ObjType var156 = ObjType.method348(var154);
                            Component.field72[var153].field121 = 4;
                            Component.field72[var153].field122 = var154;
                            Component.field72[var153].field128 = var156.field1064;
                            Component.field72[var153].field129 = var156.field1065;
                            Component.field72[var153].field127 = var156.field1063 * 100 / var155;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 136) {
                            for (int var157 = 0; var157 < this.field1249.length; ++var157) {
                                if (this.field1326[var157] != this.field1249[var157]) {
                                    this.field1249[var157] = this.field1326[var157];
                                    this.method495(-155, var157);
                                    this.field1395 = true;
                                }
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 220) {
                            this.field1394 = true;
                            this.field1442 = this.field1404.method229();
                            this.field1443 = this.field1404.method229();
                            this.field1444 = this.field1404.method231();
                            this.field1445 = this.field1404.method229();
                            this.field1446 = this.field1404.method229();
                            if (this.field1446 >= 100) {
                                this.field1431 = this.field1442 * 128 + 64;
                                this.field1433 = this.field1443 * 128 + 64;
                                this.field1432 = this.method513(this.field1433, true, this.field1431, this.field1487) - this.field1444;
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 206) {
                            this.field1395 = true;
                            int var158 = this.field1404.method231();
                            Component var159 = Component.field72[var158];
                            while (this.field1404.field716 < this.field1696) {
                                int var160 = this.field1404.method243();
                                int var161 = this.field1404.method231();
                                int var162 = this.field1404.method229();
                                if (var162 == 255) {
                                    var162 = this.field1404.method234();
                                }
                                if (var160 >= 0 && var160 < var159.field73.length) {
                                    var159.field73[var160] = var161;
                                    var159.field74[var160] = var162;
                                }
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 189) {
                            int var163 = this.field1404.method231();
                            Component var164 = Component.field72[var163];
                            for (int var165 = 0; var165 < var164.field73.length; ++var165) {
                                var164.field73[var165] = -1;
                                var164.field73[var165] = 0;
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 121) {
                            int var166 = this.field1404.method231();
                            int var167 = this.field1404.method231();
                            if (this.field1612 != -1) {
                                this.field1612 = -1;
                                this.field1349 = true;
                            }
                            if (this.field1377) {
                                this.field1377 = false;
                                this.field1349 = true;
                            }
                            this.field1339 = var166;
                            this.field1419 = var167;
                            this.field1395 = true;
                            this.field1516 = true;
                            this.field1422 = false;
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 47) {
                            if (this.field1704 == 12) {
                                this.field1395 = true;
                            }
                            this.field1513 = this.field1404.method229();
                            this.field1697 = -1;
                            return true;
                        }
                        if (this.field1697 == 247) {
                            this.field1346 = this.field1404.method229();
                            if (this.field1704 == this.field1346) {
                                if (this.field1346 == 3) {
                                    this.field1704 = 1;
                                } else {
                                    this.field1704 = 3;
                                }
                                this.field1395 = true;
                            }
                            this.field1697 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field1697 + "," + this.field1696 + " - " + this.field1296 + "," + this.field1297);
                        this.method468((byte) 0);
                        return true;
                    }
                    this.method440(false, this.field1697, this.field1404);
                    this.field1697 = -1;
                    return true;
                }
                int var58 = this.field1404.method231();
                int var59 = this.field1404.method231();
                this.field1363 = false;
                if (this.field1697 == 74) {
                    this.field1404.method239(-35838);
                    int var60 = 0;
                    while (true) {
                        if (var60 >= 4) {
                            this.field1404.method241(708);
                            this.field1363 = true;
                            break;
                        }
                        for (int var61 = 0; var61 < 13; ++var61) {
                            for (int var62 = 0; var62 < 13; ++var62) {
                                int var63 = this.field1404.method240(1, 0);
                                if (var63 == 1) {
                                    this.field1484[var60][var61][var62] = this.field1404.method240(26, 0);
                                } else {
                                    this.field1484[var60][var61][var62] = -1;
                                }
                            }
                        }
                        ++var60;
                    }
                }
                if (this.field1389 == var58 && this.field1390 == var59 && this.field1405 == 2) {
                    this.field1697 = -1;
                    return true;
                }
                this.field1389 = var58;
                this.field1390 = var59;
                this.field1568 = (this.field1389 - 6) * 8;
                this.field1569 = (this.field1390 - 6) * 8;
                this.field1619 = false;
                if ((this.field1389 / 8 == 48 || this.field1389 / 8 == 49) && this.field1390 / 8 == 48) {
                    this.field1619 = true;
                }
                if (this.field1389 / 8 == 48 && this.field1390 / 8 == 148) {
                    this.field1619 = true;
                }
                this.field1405 = 1;
                this.field1591 = System.currentTimeMillis();
                this.field1668.method258(this.field1337);
                this.field1470.method202(0, 151, true, 257, "Loading - please wait.");
                this.field1470.method202(16777215, 150, true, 256, "Loading - please wait.");
                this.field1668.method259(4, -183, 4, super.field14);
                if (this.field1697 == 239) {
                    int var64 = 0;
                    int var65 = (this.field1389 - 6) / 8;
                    label1065: while (true) {
                        if (var65 > (this.field1389 + 6) / 8) {
                            this.field1438 = new byte[var64][];
                            this.field1574 = new byte[var64][];
                            this.field1313 = new int[var64];
                            this.field1314 = new int[var64];
                            this.field1315 = new int[var64];
                            int var67 = 0;
                            int var68 = (this.field1389 - 6) / 8;
                            while (true) {
                                if (var68 > (this.field1389 + 6) / 8) {
                                    break label1065;
                                }
                                for (int var69 = (this.field1390 - 6) / 8; var69 <= (this.field1390 + 6) / 8; ++var69) {
                                    this.field1313[var67] = (var68 << 8) + var69;
                                    if (!this.field1619 || var69 != 49 && var69 != 149 && var69 != 147 && var68 != 50 && (var68 != 49 || var69 != 47)) {
                                        int var70 = this.field1314[var67] = this.field1368.method274(0, var68, var69, field1593);
                                        if (var70 != -1) {
                                            this.field1368.method279(3, var70);
                                        }
                                        int var71 = this.field1315[var67] = this.field1368.method274(1, var68, var69, field1593);
                                        if (var71 != -1) {
                                            this.field1368.method279(3, var71);
                                        }
                                        ++var67;
                                    } else {
                                        this.field1314[var67] = -1;
                                        this.field1315[var67] = -1;
                                        ++var67;
                                    }
                                }
                                ++var68;
                            }
                        }
                        for (int var66 = (this.field1390 - 6) / 8; var66 <= (this.field1390 + 6) / 8; ++var66) {
                            ++var64;
                        }
                        ++var65;
                    }
                }
                int var72 = this.field1568 - this.field1570;
                int var73 = this.field1569 - this.field1571;
                this.field1570 = this.field1568;
                this.field1571 = this.field1569;
                for (int var74 = 0; var74 < 16384; ++var74) {
                    NpcEntity var75 = this.field1629[var74];
                    if (var75 != null) {
                        for (int var76 = 0; var76 < 10; ++var76) {
                            var75.field451[var76] -= var72;
                            var75.field452[var76] -= var73;
                        }
                        var75.field401 -= var72 * 128;
                        var75.field402 -= var73 * 128;
                    }
                }
                for (int var77 = 0; var77 < this.field1303; ++var77) {
                    PlayerEntity var78 = this.field1305[var77];
                    if (var78 != null) {
                        for (int var79 = 0; var79 < 10; ++var79) {
                            var78.field451[var79] -= var72;
                            var78.field452[var79] -= var73;
                        }
                        var78.field401 -= var72 * 128;
                        var78.field402 -= var73 * 128;
                    }
                }
                this.field1417 = true;
                byte var80 = 0;
                byte var81 = 104;
                byte var82 = 1;
                if (var72 < 0) {
                    var80 = 103;
                    var81 = -1;
                    var82 = -1;
                }
                byte var83 = 0;
                byte var84 = 104;
                byte var85 = 1;
                if (var73 < 0) {
                    var83 = 103;
                    var84 = -1;
                    var85 = -1;
                }
                for (int var86 = var80; var81 != var86; var86 += var82) {
                    for (int var87 = var83; var84 != var87; var87 += var85) {
                        int var88 = var72 + var86;
                        int var89 = var73 + var87;
                        for (int var90 = 0; var90 < 4; ++var90) {
                            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                                this.field1473[var90][var86][var87] = this.field1473[var90][var88][var89];
                            } else {
                                this.field1473[var90][var86][var87] = null;
                            }
                        }
                    }
                }
                for (LocSpawned var91 = (LocSpawned) this.field1639.method248(); var91 != null; var91 = (LocSpawned) this.field1639.method250(7)) {
                    var91.field736 -= var72;
                    var91.field737 -= var73;
                    if (var91.field736 < 0 || var91.field737 < 0 || var91.field736 >= 104 || var91.field737 >= 104) {
                        var91.method106();
                    }
                }
                if (this.field1706 != 0) {
                    this.field1706 -= var72;
                    this.field1707 -= var73;
                }
                this.field1394 = false;
                this.field1697 = -1;
                return true;
            } catch (IOException var172) {
                this.method446(this.field1347);
            } catch (Exception var173) {
                String var169 = "T2 - " + this.field1697 + "," + this.field1296 + "," + this.field1297 + " - " + this.field1696 + "," + (field1396.field451[0] + this.field1568) + "," + (field1396.field452[0] + this.field1569) + " - ";
                for (int var170 = 0; var170 < this.field1696 && var170 < 50; ++var170) {
                    var169 = var169 + this.field1404.field715[var170] + ",";
                }
                signlink.reporterror(var169);
                this.method468((byte) 0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method531(String arg0) throws IOException {
        if (!this.field1709) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1371 != null) {
                try {
                    this.field1371.close();
                } catch (Exception var4) {
                }
                this.field1371 = null;
            }
            this.field1371 = this.method560(43595);
            this.field1371.setSoTimeout(10000);
            InputStream var2 = this.field1371.getInputStream();
            OutputStream var3 = this.field1371.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Llb;II)V")
    private final void method532(Packet arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.method6();
        }
        this.field1335 = 0;
        this.field1308 = 0;
        this.method551(580, arg1, arg0);
        this.method555(arg1, -45, arg0);
        this.method443(arg0, 4, arg1);
        for (int var4 = 0; var4 < this.field1335; ++var4) {
            int var6 = this.field1336[var4];
            if (field1403 != this.field1629[var6].field446) {
                this.field1629[var6].field458 = null;
                this.field1629[var6] = null;
            }
        }
        if (arg0.field716 != arg1) {
            signlink.reporterror(this.field1292 + " size mismatch in getnpcpos - pos:" + arg0.field716 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1630; ++var5) {
                if (this.field1629[this.field1631[var5]] == null) {
                    signlink.reporterror(this.field1292 + " null entry in npc list - pos:" + var5 + " size:" + this.field1630);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method533(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1653 = 80;
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, "Starting up", (byte) 7);
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field1376) {
            this.field1441 = true;
        } else {
            field1376 = true;
            boolean var1 = false;
            String var2 = this.method489(9);
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
                this.field1461 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1573[var3] = new FileStream(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat, false);
                    }
                }
                try {
                    this.method550((byte) 42);
                    this.field1236 = this.method518(true, "title", 1, "title screen", 25, this.field1439[1]);
                    this.field1469 = new PixFont(field1604, "p11_full", this.field1236, false);
                    this.field1470 = new PixFont(field1604, "p12_full", this.field1236, false);
                    this.field1471 = new PixFont(field1604, "b12_full", this.field1236, false);
                    this.field1472 = new PixFont(field1604, "q8_full", this.field1236, true);
                    this.method455(-635);
                    this.method480(true);
                    Jagfile var4 = this.method518(true, "config", 2, "config", 30, this.field1439[2]);
                    Jagfile var5 = this.method518(true, "interface", 3, "interface", 35, this.field1439[3]);
                    Jagfile var6 = this.method518(true, "media", 4, "2d graphics", 40, this.field1439[4]);
                    Jagfile var7 = this.method518(true, "textures", 6, "textures", 45, this.field1439[6]);
                    Jagfile var8 = this.method518(true, "wordenc", 7, "chat system", 50, this.field1439[7]);
                    Jagfile var9 = this.method518(true, "sounds", 8, "sound effects", 55, this.field1439[8]);
                    this.field1284 = new byte[4][104][104];
                    this.field1718 = new int[4][105][105];
                    this.field1253 = new World3D(104, 7, 4, this.field1718, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1636[var10] = new CollisionMap(104, 0, 104);
                    }
                    this.field1708 = new Pix32(512, 512);
                    Jagfile var11 = this.method518(true, "versionlist", 5, "update list", 60, this.field1439[5]);
                    this.method13(60, "Connecting to update server", (byte) 7);
                    this.field1368 = new OnDemand();
                    this.field1368.method270(var11, this);
                    AnimFrame.method44(this.field1368.method273(field1602));
                    Model.method123(this.field1368.method272(0, 921), this.field1368);
                    if (!field1344) {
                        this.field1485 = 0;
                        try {
                            this.field1485 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1486 = true;
                        this.field1368.method279(2, this.field1485);
                        while (this.field1368.method280() > 0) {
                            this.method459((byte) 4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1368.field845 > 3) {
                                this.method490("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, "Requesting animations", (byte) 7);
                    int var12 = this.field1368.method272(1, 921);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1368.method279(1, var13);
                    }
                    while (this.field1368.method280() > 0) {
                        int var14 = var12 - this.field1368.method280();
                        if (var14 > 0) {
                            this.method13(65, "Loading animations - " + var14 * 100 / var12 + "%", (byte) 7);
                        }
                        this.method459((byte) 4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1368.field845 > 3) {
                            this.method490("ondemand");
                            return;
                        }
                    }
                    this.method13(70, "Requesting models", (byte) 7);
                    int var15 = this.field1368.method272(0, 921);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1368.method277(var16, 0);
                        if ((var17 & 1) != 0) {
                            this.field1368.method279(0, var16);
                        }
                    }
                    int var18 = this.field1368.method280();
                    while (this.field1368.method280() > 0) {
                        int var19 = var18 - this.field1368.method280();
                        if (var19 > 0) {
                            this.method13(70, "Loading models - " + var19 * 100 / var18 + "%", (byte) 7);
                        }
                        this.method459((byte) 4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1573[0] != null) {
                        this.method13(75, "Requesting maps", (byte) 7);
                        this.field1368.method279(3, this.field1368.method274(0, 47, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 47, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(0, 48, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 48, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(0, 49, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 49, 48, field1593));
                        this.field1368.method279(3, this.field1368.method274(0, 47, 47, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 47, 47, field1593));
                        this.field1368.method279(3, this.field1368.method274(0, 48, 47, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 48, 47, field1593));
                        this.field1368.method279(3, this.field1368.method274(0, 48, 148, field1593));
                        this.field1368.method279(3, this.field1368.method274(1, 48, 148, field1593));
                        int var20 = this.field1368.method280();
                        while (this.field1368.method280() > 0) {
                            int var21 = var20 - this.field1368.method280();
                            if (var21 > 0) {
                                this.method13(75, "Loading maps - " + var21 * 100 / var20 + "%", (byte) 7);
                            }
                            this.method459((byte) 4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1368.method272(0, 921);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1368.method277(var23, 0);
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
                            this.field1368.method282(var25, var23, 0, 0);
                        }
                    }
                    this.field1368.method275(field1343, -517);
                    if (!field1344) {
                        int var26 = this.field1368.method272(2, 921);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1368.method278(var27, field1259)) {
                                this.field1368.method282((byte) 1, var27, 0, 2);
                            }
                        }
                    }
                    this.method13(80, "Unpacking media", (byte) 7);
                    this.field1427 = new Pix8(var6, "invback", 0);
                    this.field1429 = new Pix8(var6, "chatback", 0);
                    this.field1428 = new Pix8(var6, "mapback", 0);
                    this.field1597 = new Pix8(var6, "backbase1", 0);
                    this.field1598 = new Pix8(var6, "backbase2", 0);
                    this.field1599 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1391[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1332 = new Pix32(var6, "compass", 0);
                    this.field1358 = new Pix32(var6, "mapedge", 0);
                    this.field1358.method183(0);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1577[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1321[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1595[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1678[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1261 = new Pix32(var6, "mapmarker", 0);
                    this.field1262 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1586[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1279 = new Pix32(var6, "mapdots", 0);
                    this.field1280 = new Pix32(var6, "mapdots", 1);
                    this.field1281 = new Pix32(var6, "mapdots", 2);
                    this.field1282 = new Pix32(var6, "mapdots", 3);
                    this.field1283 = new Pix32(var6, "mapdots", 4);
                    this.field1264 = new Pix8(var6, "scrollbar", 0);
                    this.field1265 = new Pix8(var6, "scrollbar", 1);
                    this.field1605 = new Pix8(var6, "redstone1", 0);
                    this.field1606 = new Pix8(var6, "redstone2", 0);
                    this.field1607 = new Pix8(var6, "redstone3", 0);
                    this.field1608 = new Pix8(var6, "redstone1", 0);
                    this.field1608.method196(false);
                    this.field1609 = new Pix8(var6, "redstone2", 0);
                    this.field1609.method196(false);
                    this.field1237 = new Pix8(var6, "redstone1", 0);
                    this.field1237.method197((byte) -127);
                    this.field1238 = new Pix8(var6, "redstone2", 0);
                    this.field1238.method197((byte) -127);
                    this.field1239 = new Pix8(var6, "redstone3", 0);
                    this.field1239.method197((byte) -127);
                    this.field1240 = new Pix8(var6, "redstone1", 0);
                    this.field1240.method196(false);
                    this.field1240.method197((byte) -127);
                    this.field1241 = new Pix8(var6, "redstone2", 0);
                    this.field1241.method196(false);
                    this.field1241.method197((byte) -127);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1576[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1524 = new PixMap(field1322, var35.field675, var35.field676, this.method11((byte) -114));
                    var35.method184(false, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1525 = new PixMap(field1322, var36.field675, var36.field676, this.method11((byte) -114));
                    var36.method184(false, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1526 = new PixMap(field1322, var37.field675, var37.field676, this.method11((byte) -114));
                    var37.method184(false, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1527 = new PixMap(field1322, var38.field675, var38.field676, this.method11((byte) -114));
                    var38.method184(false, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1528 = new PixMap(field1322, var39.field675, var39.field676, this.method11((byte) -114));
                    var39.method184(false, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1529 = new PixMap(field1322, var40.field675, var40.field676, this.method11((byte) -114));
                    var40.method184(false, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1530 = new PixMap(field1322, var41.field675, var41.field676, this.method11((byte) -114));
                    var41.method184(false, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1531 = new PixMap(field1322, var42.field675, var42.field676, this.method11((byte) -114));
                    var42.method184(false, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1532 = new PixMap(field1322, var43.field675, var43.field676, this.method11((byte) -114));
                    var43.method184(false, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1321[var48] != null) {
                            this.field1321[var48].method182(var46 + var47, var44 + var47, 0, var45 + var47);
                        }
                        if (this.field1577[var48] != null) {
                            this.field1577[var48].method198(var46 + var47, var44 + var47, 0, var45 + var47);
                        }
                    }
                    this.method13(83, "Unpacking textures", (byte) 7);
                    Pix3D.method169(var7, field1565);
                    Pix3D.method173(true, 0.8D);
                    Pix3D.method168(field1456, 20);
                    this.method13(86, "Unpacking config", (byte) 7);
                    SeqType.method381(field1493, var4);
                    LocType.method328(var4);
                    FloType.method371(field1493, var4);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(field1493, var4);
                    SpotAnimType.method384(field1493, var4);
                    VarpType.method389(field1493, var4);
                    VarbitType.method387(field1493, var4);
                    ObjType.field1056 = field1343;
                    if (!field1344) {
                        this.method13(90, "Unpacking sounds", (byte) 7);
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(false, var49);
                        Wave.method318(field1493, var50);
                    }
                    this.method13(95, "Unpacking interfaces", (byte) 7);
                    PixFont[] var51 = new PixFont[] { this.field1469, this.field1470, this.field1471, this.field1472 };
                    Component.method32(var5, var6, var51, 0);
                    this.method13(100, "Preparing game engine", (byte) 7);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1428.field684[this.field1428.field686 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1311[var52] = var53;
                        this.field1547[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1428.field684[this.field1428.field686 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1590[var56 - 5] = var57 - 25;
                        this.field1254[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(479, 96, false);
                    this.field1632 = Pix3D.field657;
                    Pix3D.method166(190, 261, false);
                    this.field1633 = Pix3D.field657;
                    Pix3D.method166(512, 334, false);
                    this.field1634 = Pix3D.field657;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field655[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(500, 800, true, 334, 512, var60);
                    WordFilter.method391(var8);
                    this.field1383 = new MouseTracking(false, this);
                    this.method12(this.field1383, 10);
                    LocEntity.field489 = this;
                    LocType.field950 = this;
                    NpcType.field1011 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1551 + " " + this.field1289);
                    this.field1251 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method534(boolean arg0, byte arg1) {
        if (arg1 == 7) {
            boolean var3 = false;
        } else {
            this.field1473 = null;
        }
        for (int var4 = 0; var4 < this.field1630; ++var4) {
            NpcEntity var5 = this.field1629[this.field1631[var4]];
            int var6 = (this.field1631[var4] << 14) + 536870912;
            if (var5 != null && var5.method113((byte) -120) && var5.field458.field1038 == arg0) {
                int var7 = var5.field401 >> 7;
                int var8 = var5.field402 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field405 == 1 && (var5.field401 & 127) == 64 && (var5.field402 & 127) == 64) {
                        if (this.field1501[var7][var8] == this.field1378) {
                            continue;
                        }
                        this.field1501[var7][var8] = this.field1378;
                    }
                    this.field1253.method61(var5.field403, (var5.field405 - 1) * 64 + 60, -27991, this.method513(var5.field402, true, var5.field401, this.field1487), var5.field404, var5, this.field1487, var5.field402, var6, var5.field401);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIIIIBII)Z")
    public final boolean method535(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1614[var15][var35] = 0;
                this.field1317[var15][var35] = 99999999;
            }
        }
        int var16 = arg0;
        int var17 = arg11;
        if (arg9 != 9) {
            field1602 = !field1602;
        }
        this.field1614[arg0][arg11] = 99;
        this.field1317[arg0][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1495[var18] = arg0;
        int var36 = var18 + 1;
        this.field1496[var18] = arg11;
        boolean var20 = false;
        int var21 = this.field1495.length;
        int[][] var22 = this.field1636[this.field1487].field1115;
        while (var36 != var19) {
            var16 = this.field1495[var19];
            var17 = this.field1496[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg6 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field1636[this.field1487].method368(var16, arg3, var17, arg5 - 1, arg6, 0, arg8)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field1636[this.field1487].method369(var16, arg5 - 1, var17, arg6, false, arg3, arg8)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg10 != 0 && this.field1636[this.field1487].method370(773, var16, arg1, arg8, arg6, arg10, arg2, var17)) {
                var20 = true;
                break;
            }
            int var34 = this.field1317[var16][var17] + 1;
            if (var16 > 0 && this.field1614[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1495[var36] = var16 - 1;
                this.field1496[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 - 1][var17] = 2;
                this.field1317[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1614[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1495[var36] = var16 + 1;
                this.field1496[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 + 1][var17] = 8;
                this.field1317[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1614[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1495[var36] = var16;
                this.field1496[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16][var17 - 1] = 1;
                this.field1317[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1614[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1495[var36] = var16;
                this.field1496[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16][var17 + 1] = 4;
                this.field1317[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1614[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1495[var36] = var16 - 1;
                this.field1496[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 - 1][var17 - 1] = 3;
                this.field1317[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1614[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1495[var36] = var16 + 1;
                this.field1496[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 + 1][var17 - 1] = 9;
                this.field1317[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1614[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1495[var36] = var16 - 1;
                this.field1496[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 - 1][var17 + 1] = 6;
                this.field1317[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1614[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1495[var36] = var16 + 1;
                this.field1496[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1614[var16 + 1][var17 + 1] = 12;
                this.field1317[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1613 = 0;
        if (!var20) {
            if (arg4) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg6 - var24; var26 <= arg6 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1317[var25][var26] < var23) {
                                var23 = this.field1317[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1613 = 1;
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
        this.field1495[var27] = var16;
        int var37 = var27 + 1;
        this.field1496[var27] = var17;
        int var28;
        int var29 = var28 = this.field1614[var16][var17];
        while (arg0 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1495[var37] = var16;
                this.field1496[var37++] = var17;
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
            var29 = this.field1614[var16][var17];
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
            int var31 = this.field1495[var37];
            int var32 = this.field1496[var37];
            if (arg7 == 0) {
                this.field1287.method218(102, (byte) 19);
                this.field1287.method219(var30 + var30 + 3);
            }
            if (arg7 == 1) {
                this.field1287.method218(170, (byte) 19);
                this.field1287.method219(var30 + var30 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field1287.method218(15, (byte) 19);
                this.field1287.method219(var30 + var30 + 3);
            }
            if (super.field32[5] == 1) {
                this.field1287.method219(1);
            } else {
                this.field1287.method219(0);
            }
            this.field1287.method220(this.field1568 + var31);
            this.field1287.method220(this.field1569 + var32);
            this.field1706 = this.field1495[0];
            this.field1707 = this.field1496[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1287.method219(this.field1495[var37] - var31);
                this.field1287.method219(this.field1496[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method536(byte arg0, boolean arg1) {
        this.method439(0);
        this.field1408.method258(this.field1337);
        this.field1354.method199(0, 0, -47687);
        short var3 = 360;
        short var4 = 200;
        if (arg0 == 3) {
            boolean var5 = false;
        } else {
            this.method6();
        }
        if (this.field1372 == 0) {
            int var6 = var4 / 2 + 80;
            this.field1469.method203(var6, 7711145, true, var3 / 2, this.field1624, this.field1368.field839);
            int var7 = var4 / 2 - 20;
            this.field1471.method203(var7, 16776960, true, var3 / 2, this.field1624, "Welcome to RuneScape");
            int var18 = var7 + 30;
            int var8 = var3 / 2 - 80;
            int var9 = var4 / 2 + 20;
            this.field1355.method199(var9 - 20, var8 - 73, -47687);
            this.field1471.method203(var9 + 5, 16777215, true, var8, this.field1624, "New User");
            int var10 = var3 / 2 + 80;
            this.field1355.method199(var9 - 20, var10 - 73, -47687);
            this.field1471.method203(var9 + 5, 16777215, true, var10, this.field1624, "Existing User");
        }
        if (this.field1372 == 2) {
            int var11 = var4 / 2 - 40;
            if (this.field1518.length() > 0) {
                this.field1471.method203(var11 - 15, 16776960, true, var3 / 2, this.field1624, this.field1518);
                this.field1471.method203(var11, 16776960, true, var3 / 2, this.field1624, this.field1519);
                var11 += 30;
            } else {
                this.field1471.method203(var11 - 7, 16776960, true, var3 / 2, this.field1624, this.field1519);
                var11 += 30;
            }
            this.field1471.method210("Username: " + this.field1292 + (this.field1601 == 0 & field1403 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, true, 654, var11, 16777215);
            var11 += 15;
            this.field1471.method210("Password: " + JString.method305(0, this.field1293) + (this.field1601 == 1 & field1403 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, true, 654, var11, 16777215);
            var11 += 15;
            if (!arg1) {
                int var12 = var3 / 2 - 80;
                int var13 = var4 / 2 + 50;
                this.field1355.method199(var13 - 20, var12 - 73, -47687);
                this.field1471.method203(var13 + 5, 16777215, true, var12, this.field1624, "Login");
                int var14 = var3 / 2 + 80;
                this.field1355.method199(var13 - 20, var14 - 73, -47687);
                this.field1471.method203(var13 + 5, 16777215, true, var14, this.field1624, "Cancel");
            }
        }
        if (this.field1372 == 3) {
            this.field1471.method203(var4 / 2 - 60, 16776960, true, var3 / 2, this.field1624, "Create a free account");
            int var15 = var4 / 2 - 35;
            this.field1471.method203(var15, 16777215, true, var3 / 2, this.field1624, "To create a new account you need to");
            int var19 = var15 + 15;
            this.field1471.method203(var19, 16777215, true, var3 / 2, this.field1624, "go back to the main RuneScape webpage");
            int var20 = var19 + 15;
            this.field1471.method203(var20, 16777215, true, var3 / 2, this.field1624, "and choose the red 'create account'");
            int var21 = var20 + 15;
            this.field1471.method203(var21, 16777215, true, var3 / 2, this.field1624, "button at the top right of that page.");
            int var22 = var21 + 15;
            int var16 = var3 / 2;
            int var17 = var4 / 2 + 50;
            this.field1355.method199(var17 - 20, var16 - 73, -47687);
            this.field1471.method203(var17 + 5, 16777215, true, var16, this.field1624, "Cancel");
        }
        this.field1408.method259(171, -183, 202, super.field14);
        if (this.field1286) {
            this.field1286 = false;
            this.field1406.method259(0, -183, 128, super.field14);
            this.field1407.method259(371, -183, 202, super.field14);
            this.field1411.method259(265, -183, 0, super.field14);
            this.field1412.method259(265, -183, 562, super.field14);
            this.field1413.method259(171, -183, 128, super.field14);
            this.field1414.method259(171, -183, 562, super.field14);
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method537(int arg0) {
        if (arg0 == 17983) {
            for (int var2 = 0; var2 < this.field1630; ++var2) {
                int var3 = this.field1631[var2];
                NpcEntity var4 = this.field1629[var3];
                if (var4 != null) {
                    this.method538(var4, -698, var4.field458.field1020);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;II)V")
    public final void method538(PathingEntity arg0, int arg1, int arg2) {
        if (arg0.field401 < 128 || arg0.field402 < 128 || arg0.field401 >= 13184 || arg0.field402 >= 13184) {
            arg0.field429 = -1;
            arg0.field434 = -1;
            arg0.field443 = 0;
            arg0.field444 = 0;
            arg0.field401 = arg0.field451[0] * 128 + arg0.field405 * 64;
            arg0.field402 = arg0.field452[0] * 128 + arg0.field405 * 64;
            arg0.method112(8874);
        }
        if (field1396 == arg0 && (arg0.field401 < 1536 || arg0.field402 < 1536 || arg0.field401 >= 11776 || arg0.field402 >= 11776)) {
            arg0.field429 = -1;
            arg0.field434 = -1;
            arg0.field443 = 0;
            arg0.field444 = 0;
            arg0.field401 = arg0.field451[0] * 128 + arg0.field405 * 64;
            arg0.field402 = arg0.field452[0] * 128 + arg0.field405 * 64;
            arg0.method112(8874);
        }
        if (arg0.field443 > field1403) {
            this.method539(this.field1329, arg0);
        } else if (arg0.field444 >= field1403) {
            this.method540(arg0, this.field1600);
        } else {
            this.method541(arg0, true);
        }
        this.method542(true, arg0);
        if (arg1 >= 0) {
            this.method6();
        }
        this.method543(true, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLy;)V")
    public final void method539(boolean arg0, PathingEntity arg1) {
        int var3 = arg1.field443 - field1403;
        int var4 = arg1.field439 * 128 + arg1.field405 * 64;
        int var5 = arg1.field441 * 128 + arg1.field405 * 64;
        arg1.field401 += (var4 - arg1.field401) / var3;
        if (arg0) {
            this.field1473 = null;
        }
        arg1.field402 += (var5 - arg1.field402) / var3;
        arg1.field454 = 0;
        if (arg1.field445 == 0) {
            arg1.field448 = 1024;
        }
        if (arg1.field445 == 1) {
            arg1.field448 = 1536;
        }
        if (arg1.field445 == 2) {
            arg1.field448 = 0;
        }
        if (arg1.field445 == 3) {
            arg1.field448 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;B)V")
    public final void method540(PathingEntity arg0, byte arg1) {
        if (field1403 == arg0.field444 || arg0.field429 == -1 || arg0.field432 != 0 || arg0.field431 + 1 > SeqType.field1155[arg0.field429].method382(arg0.field430, this.field1589)) {
            int var3 = arg0.field444 - arg0.field443;
            int var4 = field1403 - arg0.field443;
            int var5 = arg0.field439 * 128 + arg0.field405 * 64;
            int var6 = arg0.field441 * 128 + arg0.field405 * 64;
            int var7 = arg0.field440 * 128 + arg0.field405 * 64;
            int var8 = arg0.field442 * 128 + arg0.field405 * 64;
            arg0.field401 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field402 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field454 = 0;
        if (arg0.field445 == 0) {
            arg0.field448 = 1024;
        }
        if (arg0.field445 == 1) {
            arg0.field448 = 1536;
        }
        if (arg0.field445 == 2) {
            arg0.field448 = 0;
        }
        if (arg0.field445 == 3) {
            arg0.field448 = 512;
        }
        arg0.field403 = arg0.field448;
        if (this.field1611 != arg1) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method541(PathingEntity arg0, boolean arg1) {
        arg0.field426 = arg0.field406;
        if (arg0.field450 == 0) {
            arg0.field454 = 0;
        } else {
            if (arg0.field429 != -1 && arg0.field432 == 0) {
                SeqType var3 = SeqType.field1155[arg0.field429];
                if (arg0.field455 > 0 && var3.field1167 == 0) {
                    ++arg0.field454;
                    return;
                }
                if (arg0.field455 <= 0 && var3.field1168 == 0) {
                    ++arg0.field454;
                    return;
                }
            }
            int var4 = arg0.field401;
            int var5 = arg0.field402;
            int var6 = arg0.field451[arg0.field450 - 1] * 128 + arg0.field405 * 64;
            int var7 = arg0.field452[arg0.field450 - 1] * 128 + arg0.field405 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field448 = 1280;
                    } else if (var5 > var7) {
                        arg0.field448 = 1792;
                    } else {
                        arg0.field448 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field448 = 768;
                    } else if (var5 > var7) {
                        arg0.field448 = 256;
                    } else {
                        arg0.field448 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field448 = 1024;
                } else {
                    arg0.field448 = 0;
                }
                int var8 = arg0.field448 - arg0.field403 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field409;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field408;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field411;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field410;
                }
                if (var9 == -1) {
                    var9 = arg0.field408;
                }
                arg0.field426 = var9;
                int var10 = 4;
                if (arg1) {
                    if (arg0.field448 != arg0.field403 && arg0.field423 == -1 && arg0.field449 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field450 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field450 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field454 > 0 && arg0.field450 > 1) {
                        var10 = 8;
                        --arg0.field454;
                    }
                    if (arg0.field453[arg0.field450 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field426 == arg0.field408 && arg0.field412 != -1) {
                        arg0.field426 = arg0.field412;
                    }
                    if (var4 < var6) {
                        arg0.field401 += var10;
                        if (arg0.field401 > var6) {
                            arg0.field401 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field401 -= var10;
                        if (arg0.field401 < var6) {
                            arg0.field401 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field402 += var10;
                        if (arg0.field402 > var7) {
                            arg0.field402 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field402 -= var10;
                        if (arg0.field402 < var7) {
                            arg0.field402 = var7;
                        }
                    }
                    if (arg0.field401 == var6 && arg0.field402 == var7) {
                        --arg0.field450;
                        if (arg0.field455 > 0) {
                            --arg0.field455;
                            return;
                        }
                    }
                }
            } else {
                arg0.field401 = var6;
                arg0.field402 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLy;)V")
    public final void method542(boolean arg0, PathingEntity arg1) {
        if (!arg0) {
            this.field1697 = -1;
        }
        if (arg1.field449 != 0) {
            if (arg1.field423 != -1 && arg1.field423 < 32768) {
                NpcEntity var3 = this.field1629[arg1.field423];
                if (var3 != null) {
                    int var4 = arg1.field401 - var3.field401;
                    int var5 = arg1.field402 - var3.field402;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field448 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field423 >= 32768) {
                int var6 = arg1.field423 - 32768;
                if (this.field1325 == var6) {
                    var6 = this.field1304;
                }
                PlayerEntity var7 = this.field1305[var6];
                if (var7 != null) {
                    int var8 = arg1.field401 - var7.field401;
                    int var9 = arg1.field402 - var7.field402;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field448 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field424 != 0 || arg1.field425 != 0) && (arg1.field450 == 0 || arg1.field454 > 0)) {
                int var10 = arg1.field401 - (arg1.field424 - this.field1568 - this.field1568) * 64;
                int var11 = arg1.field402 - (arg1.field425 - this.field1569 - this.field1569) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field448 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field424 = 0;
                arg1.field425 = 0;
            }
            int var12 = arg1.field448 - arg1.field403 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field449 && var12 <= 2048 - arg1.field449) {
                    if (var12 > 1024) {
                        arg1.field403 -= arg1.field449;
                    } else {
                        arg1.field403 += arg1.field449;
                    }
                } else {
                    arg1.field403 = arg1.field448;
                }
                arg1.field403 &= 2047;
                if (arg1.field426 == arg1.field406 && arg1.field448 != arg1.field403) {
                    if (arg1.field407 != -1) {
                        arg1.field426 = arg1.field407;
                        return;
                    }
                    arg1.field426 = arg1.field408;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZLy;)V")
    public final void method543(boolean arg0, PathingEntity arg1) {
        if (!arg0) {
            this.field1697 = this.field1404.method229();
        }
        arg1.field404 = false;
        if (arg1.field426 != -1) {
            SeqType var3 = SeqType.field1155[arg1.field426];
            ++arg1.field428;
            if (arg1.field427 < var3.field1156 && arg1.field428 > var3.method382(arg1.field427, this.field1589)) {
                arg1.field428 = 0;
                ++arg1.field427;
            }
            if (arg1.field427 >= var3.field1156) {
                arg1.field428 = 0;
                arg1.field427 = 0;
            }
        }
        if (arg1.field434 != -1 && field1403 >= arg1.field437) {
            if (arg1.field435 < 0) {
                arg1.field435 = 0;
            }
            SeqType var4 = SpotAnimType.field1177[arg1.field434].field1181;
            ++arg1.field436;
            while (arg1.field435 < var4.field1156 && arg1.field436 > var4.method382(arg1.field435, this.field1589)) {
                arg1.field436 -= var4.method382(arg1.field435, this.field1589);
                ++arg1.field435;
            }
            if (arg1.field435 >= var4.field1156 && (arg1.field435 < 0 || arg1.field435 >= var4.field1156)) {
                arg1.field434 = -1;
            }
        }
        if (arg1.field429 != -1 && arg1.field432 <= 1) {
            SeqType var5 = SeqType.field1155[arg1.field429];
            if (var5.field1167 == 1 && arg1.field455 > 0 && arg1.field443 <= field1403 && arg1.field444 < field1403) {
                arg1.field432 = 1;
                return;
            }
        }
        if (arg1.field429 != -1 && arg1.field432 == 0) {
            SeqType var6 = SeqType.field1155[arg1.field429];
            ++arg1.field431;
            while (arg1.field430 < var6.field1156 && arg1.field431 > var6.method382(arg1.field430, this.field1589)) {
                arg1.field431 -= var6.method382(arg1.field430, this.field1589);
                ++arg1.field430;
            }
            if (arg1.field430 >= var6.field1156) {
                arg1.field430 -= var6.field1160;
                ++arg1.field433;
                if (arg1.field433 >= var6.field1166) {
                    arg1.field429 = -1;
                }
                if (arg1.field430 < 0 || arg1.field430 >= var6.field1156) {
                    arg1.field429 = -1;
                }
            }
            arg1.field404 = var6.field1162;
        }
        if (arg1.field432 > 0) {
            --arg1.field432;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method544(int arg0) {
        if (this.field1286) {
            this.field1286 = false;
            this.field1524.method259(4, -183, 0, super.field14);
            this.field1525.method259(357, -183, 0, super.field14);
            this.field1526.method259(4, -183, 722, super.field14);
            this.field1527.method259(205, -183, 743, super.field14);
            this.field1528.method259(0, -183, 0, super.field14);
            this.field1529.method259(4, -183, 516, super.field14);
            this.field1530.method259(205, -183, 516, super.field14);
            this.field1531.method259(357, -183, 496, super.field14);
            this.field1532.method259(338, -183, 0, super.field14);
            this.field1395 = true;
            this.field1349 = true;
            this.field1516 = true;
            this.field1266 = true;
            if (this.field1405 != 2) {
                this.field1668.method259(4, -183, 4, super.field14);
                this.field1667.method259(4, -183, 550, super.field14);
            }
        }
        if (this.field1405 == 2) {
            this.method487((byte) -103);
        }
        if (this.field1641 && this.field1656 == 1) {
            this.field1395 = true;
        }
        if (this.field1419 != -1) {
            boolean var2 = this.method507(this.field1263, this.field1419, 0);
            if (var2) {
                this.field1395 = true;
            }
        }
        if (this.field1715 == 2) {
            this.field1395 = true;
        }
        if (this.field1683 == 2) {
            this.field1395 = true;
        }
        if (this.field1395) {
            this.method529(5);
            this.field1395 = false;
        }
        if (this.field1612 == -1) {
            this.field1640.field92 = this.field1467 - this.field1437 - 77;
            if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                this.method506((byte) 92, super.field23 - 357, super.field22 - 17, this.field1640, 0, 77, false, 463, this.field1467);
            }
            int var3 = this.field1467 - 77 - this.field1640.field92;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1467 - 77) {
                var3 = this.field1467 - 77;
            }
            if (this.field1437 != var3) {
                this.field1437 = var3;
                this.field1349 = true;
            }
        }
        if (this.field1612 != -1) {
            boolean var4 = this.method507(this.field1263, this.field1612, 0);
            if (var4) {
                this.field1349 = true;
            }
        }
        if (this.field1715 == 3) {
            this.field1349 = true;
        }
        if (this.field1683 == 3) {
            this.field1349 = true;
        }
        if (this.field1592 != null) {
            this.field1349 = true;
        }
        if (this.field1641 && this.field1656 == 2) {
            this.field1349 = true;
        }
        if (this.field1349) {
            this.method546(18659);
            this.field1349 = false;
        }
        if (this.field1405 == 2) {
            this.method545(field1312);
            this.field1667.method259(4, -183, 550, super.field14);
        }
        if (this.field1346 != -1) {
            this.field1516 = true;
        }
        if (this.field1516) {
            if (this.field1346 != -1 && this.field1704 == this.field1346) {
                this.field1346 = -1;
                this.field1287.method218(83, (byte) 19);
                this.field1287.method219(this.field1704);
            }
            this.field1516 = false;
            this.field1511.method258(this.field1337);
            this.field1599.method199(0, 0, -47687);
            if (this.field1419 == -1) {
                if (this.field1398[this.field1704] != -1) {
                    if (this.field1704 == 0) {
                        this.field1605.method199(10, 22, -47687);
                    }
                    if (this.field1704 == 1) {
                        this.field1606.method199(8, 54, -47687);
                    }
                    if (this.field1704 == 2) {
                        this.field1606.method199(8, 82, -47687);
                    }
                    if (this.field1704 == 3) {
                        this.field1607.method199(8, 110, -47687);
                    }
                    if (this.field1704 == 4) {
                        this.field1609.method199(8, 153, -47687);
                    }
                    if (this.field1704 == 5) {
                        this.field1609.method199(8, 181, -47687);
                    }
                    if (this.field1704 == 6) {
                        this.field1608.method199(9, 209, -47687);
                    }
                }
                if (this.field1398[0] != -1 && (this.field1346 != 0 || field1403 % 20 < 10)) {
                    this.field1391[0].method199(13, 29, -47687);
                }
                if (this.field1398[1] != -1 && (this.field1346 != 1 || field1403 % 20 < 10)) {
                    this.field1391[1].method199(11, 53, -47687);
                }
                if (this.field1398[2] != -1 && (this.field1346 != 2 || field1403 % 20 < 10)) {
                    this.field1391[2].method199(11, 82, -47687);
                }
                if (this.field1398[3] != -1 && (this.field1346 != 3 || field1403 % 20 < 10)) {
                    this.field1391[3].method199(12, 115, -47687);
                }
                if (this.field1398[4] != -1 && (this.field1346 != 4 || field1403 % 20 < 10)) {
                    this.field1391[4].method199(13, 153, -47687);
                }
                if (this.field1398[5] != -1 && (this.field1346 != 5 || field1403 % 20 < 10)) {
                    this.field1391[5].method199(11, 180, -47687);
                }
                if (this.field1398[6] != -1 && (this.field1346 != 6 || field1403 % 20 < 10)) {
                    this.field1391[6].method199(13, 208, -47687);
                }
            }
            this.field1511.method259(160, -183, 516, super.field14);
            this.field1510.method258(this.field1337);
            this.field1598.method199(0, 0, -47687);
            if (this.field1419 == -1) {
                if (this.field1398[this.field1704] != -1) {
                    if (this.field1704 == 7) {
                        this.field1237.method199(0, 42, -47687);
                    }
                    if (this.field1704 == 8) {
                        this.field1238.method199(0, 74, -47687);
                    }
                    if (this.field1704 == 9) {
                        this.field1238.method199(0, 102, -47687);
                    }
                    if (this.field1704 == 10) {
                        this.field1239.method199(1, 130, -47687);
                    }
                    if (this.field1704 == 11) {
                        this.field1241.method199(0, 173, -47687);
                    }
                    if (this.field1704 == 12) {
                        this.field1241.method199(0, 201, -47687);
                    }
                    if (this.field1704 == 13) {
                        this.field1240.method199(0, 229, -47687);
                    }
                }
                if (this.field1398[8] != -1 && (this.field1346 != 8 || field1403 % 20 < 10)) {
                    this.field1391[7].method199(2, 74, -47687);
                }
                if (this.field1398[9] != -1 && (this.field1346 != 9 || field1403 % 20 < 10)) {
                    this.field1391[8].method199(3, 102, -47687);
                }
                if (this.field1398[10] != -1 && (this.field1346 != 10 || field1403 % 20 < 10)) {
                    this.field1391[9].method199(4, 137, -47687);
                }
                if (this.field1398[11] != -1 && (this.field1346 != 11 || field1403 % 20 < 10)) {
                    this.field1391[10].method199(2, 174, -47687);
                }
                if (this.field1398[12] != -1 && (this.field1346 != 12 || field1403 % 20 < 10)) {
                    this.field1391[11].method199(2, 201, -47687);
                }
                if (this.field1398[13] != -1 && (this.field1346 != 13 || field1403 % 20 < 10)) {
                    this.field1391[12].method199(2, 226, -47687);
                }
            }
            this.field1510.method259(466, -183, 496, super.field14);
            this.field1668.method258(this.field1337);
        }
        if (this.field1266) {
            this.field1266 = false;
            this.field1509.method258(this.field1337);
            this.field1597.method199(0, 0, -47687);
            this.field1470.method203(28, 16777215, true, 55, this.field1624, "Public chat");
            if (this.field1628 == 0) {
                this.field1470.method203(41, 65280, true, 55, this.field1624, "On");
            }
            if (this.field1628 == 1) {
                this.field1470.method203(41, 16776960, true, 55, this.field1624, "Friends");
            }
            if (this.field1628 == 2) {
                this.field1470.method203(41, 16711680, true, 55, this.field1624, "Off");
            }
            if (this.field1628 == 3) {
                this.field1470.method203(41, 65535, true, 55, this.field1624, "Hide");
            }
            this.field1470.method203(28, 16777215, true, 184, this.field1624, "Private chat");
            if (this.field1386 == 0) {
                this.field1470.method203(41, 65280, true, 184, this.field1624, "On");
            }
            if (this.field1386 == 1) {
                this.field1470.method203(41, 16776960, true, 184, this.field1624, "Friends");
            }
            if (this.field1386 == 2) {
                this.field1470.method203(41, 16711680, true, 184, this.field1624, "Off");
            }
            this.field1470.method203(28, 16777215, true, 324, this.field1624, "Trade/compete");
            if (this.field1494 == 0) {
                this.field1470.method203(41, 65280, true, 324, this.field1624, "On");
            }
            if (this.field1494 == 1) {
                this.field1470.method203(41, 16776960, true, 324, this.field1624, "Friends");
            }
            if (this.field1494 == 2) {
                this.field1470.method203(41, 16711680, true, 324, this.field1624, "Off");
            }
            this.field1470.method203(33, 16777215, true, 458, this.field1624, "Report abuse");
            this.field1509.method259(453, -183, 0, super.field14);
            this.field1668.method258(this.field1337);
        }
        this.field1263 = 0;
        if (arg0 <= 0) {
            field1482 = -426;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field1667.method258(this.field1337);
        if (this.field1533 == 2) {
            byte[] var2 = this.field1428.field684;
            int[] var3 = Pix2D.field632;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1332.method190(256, (byte) 5, this.field1360, 33, this.field1547, 0, this.field1311, 33, 25, 25, 0);
            this.field1668.method258(this.field1337);
        } else {
            int var6 = this.field1364 + this.field1360 & 2047;
            int var7 = field1396.field401 / 32 + 48;
            int var8 = 464 - field1396.field402 / 32;
            this.field1708.method190(this.field1675 + 256, (byte) 5, var6, 151, this.field1254, 25, this.field1590, 146, var8, var7, 5);
            this.field1332.method190(256, (byte) 5, this.field1360, 33, this.field1547, 0, this.field1311, 33, 25, 25, 0);
            for (int var9 = 0; var9 < this.field1537; ++var9) {
                int var39 = this.field1538[var9] * 4 + 2 - field1396.field401 / 32;
                int var40 = this.field1539[var9] * 4 + 2 - field1396.field402 / 32;
                this.method438(this.field1566[var9], var39, 0, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    LinkList var36 = this.field1473[this.field1487][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field1396.field401 / 32;
                        int var38 = var35 * 4 + 2 - field1396.field402 / 32;
                        this.method438(this.field1279, var37, 0, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field1630; ++var11) {
                NpcEntity var31 = this.field1629[this.field1631[var11]];
                if (var31 != null && var31.method113((byte) -120)) {
                    NpcType var32 = var31.field458;
                    if (var32.field1043 != null) {
                        var32 = var32.method345(this.field1580);
                    }
                    if (var32 != null && var32.field1034) {
                        int var33 = var31.field401 / 32 - field1396.field401 / 32;
                        int var34 = var31.field402 / 32 - field1396.field402 / 32;
                        this.method438(this.field1280, var33, 0, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1306; ++var12) {
                PlayerEntity var23 = this.field1305[this.field1307[var12]];
                if (var23 != null && var23.method113((byte) -120)) {
                    int var24 = var23.field401 / 32 - field1396.field401 / 32;
                    int var25 = var23.field402 / 32 - field1396.field402 / 32;
                    boolean var26 = false;
                    long var27 = JString.method300(var23.field463);
                    for (int var29 = 0; var29 < this.field1384; ++var29) {
                        if (this.field1616[var29] == var27 && this.field1652[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field1396.field486 != 0 && var23.field486 != 0 && field1396.field486 == var23.field486) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method438(this.field1282, var24, 0, var25);
                    } else if (var30) {
                        this.method438(this.field1283, var24, 0, var25);
                    } else {
                        this.method438(this.field1281, var24, 0, var25);
                    }
                }
            }
            if (this.field1638 != 0 && field1403 % 20 < 10) {
                if (this.field1638 == 1 && this.field1500 >= 0 && this.field1500 < this.field1629.length) {
                    NpcEntity var13 = this.field1629[this.field1500];
                    if (var13 != null) {
                        int var14 = var13.field401 / 32 - field1396.field401 / 32;
                        int var15 = var13.field402 / 32 - field1396.field402 / 32;
                        this.method458(403, var15, var14, this.field1262);
                    }
                }
                if (this.field1638 == 2) {
                    int var16 = (this.field1477 - this.field1568) * 4 + 2 - field1396.field401 / 32;
                    int var17 = (this.field1478 - this.field1569) * 4 + 2 - field1396.field402 / 32;
                    this.method458(403, var17, var16, this.field1262);
                }
                if (this.field1638 == 10 && this.field1686 >= 0 && this.field1686 < this.field1305.length) {
                    PlayerEntity var18 = this.field1305[this.field1686];
                    if (var18 != null) {
                        int var19 = var18.field401 / 32 - field1396.field401 / 32;
                        int var20 = var18.field402 / 32 - field1396.field402 / 32;
                        this.method458(403, var20, var19, this.field1262);
                    }
                }
            }
            if (this.field1706 != 0) {
                int var21 = this.field1706 * 4 + 2 - field1396.field401 / 32;
                int var22 = this.field1707 * 4 + 2 - field1396.field402 / 32;
                this.method438(this.field1261, var21, 0, var22);
            }
            Pix2D.method157(false, 97, 3, 16777215, 78, 3);
            this.field1668.method258(this.field1337);
            if (arg0 <= 0) {
                this.field1697 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method546(int arg0) {
        this.field1669.method258(this.field1337);
        Pix3D.field657 = this.field1632;
        this.field1429.method199(0, 0, -47687);
        if (arg0 != 18659) {
            field1653 = 371;
        }
        if (this.field1575) {
            this.field1471.method202(0, 40, true, 239, this.field1235);
            this.field1471.method202(128, 60, true, 239, this.field1615 + "*");
        } else if (this.field1377) {
            this.field1471.method202(0, 40, true, 239, "Enter amount:");
            this.field1471.method202(128, 60, true, 239, this.field1356 + "*");
        } else if (this.field1592 != null) {
            this.field1471.method202(0, 40, true, 239, this.field1592);
            this.field1471.method202(128, 60, true, 239, "Click to continue");
        } else if (this.field1612 != -1) {
            this.method447(Component.field72[this.field1612], 0, 0, 0, -23258);
        } else if (this.field1514 != -1) {
            this.method447(Component.field72[this.field1514], 0, 0, 0, -23258);
        } else {
            PixFont var2 = this.field1470;
            int var3 = 0;
            Pix2D.method154(0, 77, 463, 0, -227);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1353[var4] != null) {
                    int var6 = this.field1351[var4];
                    int var7 = 70 - var3 * 14 + this.field1437;
                    String var8 = this.field1352[var4];
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
                            var2.method206(4, this.field1353[var4], -830, 0, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1628 == 0 || this.field1628 == 1 && this.method429(var8, (byte) 9))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1576[0].method199(var7 - 12, var10, -47687);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1576[1].method199(var7 - 12, var10, -47687);
                                var10 += 14;
                            }
                            var2.method206(var10, var8 + ":", -830, 0, var7);
                            int var11 = var10 + var2.method204(var8, -25271) + 8;
                            var2.method206(var11, this.field1353[var4], -830, 255, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1610 == 0 && (var6 == 7 || this.field1386 == 0 || this.field1386 == 1 && this.method429(var8, (byte) 9))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method206(var12, "From", -830, 0, var7);
                            int var13 = var12 + var2.method204("From ", -25271);
                            if (var9 == 1) {
                                this.field1576[0].method199(var7 - 12, var13, -47687);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1576[1].method199(var7 - 12, var13, -47687);
                                var13 += 14;
                            }
                            var2.method206(var13, var8 + ":", -830, 0, var7);
                            int var14 = var13 + var2.method204(var8, -25271) + 8;
                            var2.method206(var14, this.field1353[var4], -830, 8388608, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1494 == 0 || this.field1494 == 1 && this.method429(var8, (byte) 9))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(4, var8 + " " + this.field1353[var4], -830, 8388736, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1610 == 0 && this.field1386 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(4, this.field1353[var4], -830, 8388608, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1610 == 0 && this.field1386 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(4, "To " + var8 + ":", -830, 0, var7);
                            var2.method206(12 + var2.method204("To " + var8, -25271), this.field1353[var4], -830, 8388608, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1494 == 0 || this.field1494 == 1 && this.method429(var8, (byte) 9))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(4, var8 + " " + this.field1353[var4], -830, 8270336, var7);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method153(-881);
            this.field1467 = var3 * 14 + 7;
            if (this.field1467 < 78) {
                this.field1467 = 78;
            }
            this.method445(-18981, 463, 0, this.field1467 - this.field1437 - 77, this.field1467, 77);
            String var5;
            if (field1396 != null && field1396.field463 != null) {
                var5 = field1396.field463;
            } else {
                var5 = JString.method304(-257, this.field1292);
            }
            var2.method206(4, var5 + ":", -830, 0, 90);
            var2.method206(6 + var2.method204(var5 + ": ", -25271), this.field1272 + "*", -830, 255, 90);
            Pix2D.method160(77, 479, false, 0, 0);
        }
        if (this.field1641 && this.field1656 == 2) {
            this.method493((byte) 102);
        }
        this.field1669.method259(357, -183, 17, super.field14);
        this.field1668.method258(this.field1337);
        Pix3D.field657 = this.field1634;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method547(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1384; ++var4) {
                if (this.field1616[var4] == arg1) {
                    --this.field1384;
                    this.field1395 = true;
                    for (int var5 = var4; var5 < this.field1384; ++var5) {
                        this.field1381[var5] = this.field1381[var5 + 1];
                        this.field1652[var5] = this.field1652[var5 + 1];
                        this.field1616[var5] = this.field1616[var5 + 1];
                    }
                    this.field1287.method218(22, (byte) 19);
                    this.field1287.method225(arg1, -40349);
                    break;
                }
            }
            if (arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method548(int arg0) {
        this.field1552 = 0;
        for (int var2 = -1; var2 < this.field1630 + this.field1306; ++var2) {
            PathingEntity var19;
            if (var2 == -1) {
                var19 = field1396;
            } else if (var2 < this.field1306) {
                var19 = this.field1305[this.field1307[var2]];
            } else {
                var19 = this.field1629[this.field1631[var2 - this.field1306]];
            }
            if (var19 != null && var19.method113((byte) -120)) {
                if (var19 instanceof NpcEntity) {
                    NpcType var20 = ((NpcEntity) var19).field458;
                    if (var20.field1043 != null) {
                        var20 = var20.method345(this.field1580);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field1306) {
                    NpcType var24 = ((NpcEntity) var19).field458;
                    if (var24.field1041 >= 0 && var24.field1041 < this.field1678.length) {
                        this.method481(var19.field447 + 15, this.field1711, var19);
                        if (this.field1333 > -1) {
                            this.field1678[var24.field1041].method186(this.field1334 - 30, this.field1333 - 12, -47687);
                        }
                    }
                    if (this.field1638 == 1 && this.field1631[var2 - this.field1306] == this.field1500 && field1403 % 20 < 10) {
                        this.method481(var19.field447 + 15, this.field1711, var19);
                        if (this.field1333 > -1) {
                            this.field1678[2].method186(this.field1334 - 28, this.field1333 - 12, -47687);
                        }
                    }
                } else {
                    int var21 = 30;
                    PlayerEntity var22 = (PlayerEntity) var19;
                    if (var22.field466 != 0) {
                        this.method481(var19.field447 + 15, this.field1711, var19);
                        if (this.field1333 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field466 & 1 << var23) != 0) {
                                    this.field1678[var23].method186(this.field1334 - var21, this.field1333 - 12, -47687);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1638 == 10 && this.field1307[var2] == this.field1686) {
                        this.method481(var19.field447 + 15, this.field1711, var19);
                        if (this.field1333 > -1) {
                            this.field1678[7].method186(this.field1334 - var21, this.field1333 - 12, -47687);
                        }
                    }
                }
                if (var19.field413 != null && (var2 >= this.field1306 || this.field1628 == 0 || this.field1628 == 3 || this.field1628 == 1 && this.method429(((PlayerEntity) var19).field463, (byte) 9))) {
                    this.method481(var19.field447, this.field1711, var19);
                    if (this.field1333 > -1 && this.field1552 < this.field1553) {
                        this.field1557[this.field1552] = this.field1471.method205((byte) -3, var19.field413) / 2;
                        this.field1556[this.field1552] = this.field1471.field702;
                        this.field1554[this.field1552] = this.field1333;
                        this.field1555[this.field1552] = this.field1334;
                        this.field1558[this.field1552] = var19.field415;
                        this.field1559[this.field1552] = var19.field416;
                        this.field1560[this.field1552] = var19.field414;
                        this.field1561[this.field1552++] = var19.field413;
                        if (this.field1345 == 0 && var19.field416 >= 1 && var19.field416 <= 3) {
                            this.field1556[this.field1552] += 10;
                            this.field1555[this.field1552] += 5;
                        }
                        if (this.field1345 == 0 && var19.field416 == 4) {
                            this.field1557[this.field1552] = 60;
                        }
                        if (this.field1345 == 0 && var19.field416 == 5) {
                            this.field1556[this.field1552] += 5;
                        }
                    }
                }
                if (var19.field420 > field1403) {
                    this.method481(var19.field447 + 15, this.field1711, var19);
                    if (this.field1333 > -1) {
                        int var25 = var19.field421 * 30 / var19.field422;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        Pix2D.method157(false, this.field1333 - 15, var25, 65280, this.field1334 - 3, 5);
                        Pix2D.method157(false, this.field1333 - 15 + var25, 30 - var25, 16711680, this.field1334 - 3, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field419[var26] > field1403) {
                        this.method481(var19.field447 / 2, this.field1711, var19);
                        if (this.field1333 > -1) {
                            if (var26 == 1) {
                                this.field1334 -= 20;
                            }
                            if (var26 == 2) {
                                this.field1333 -= 15;
                                this.field1334 -= 10;
                            }
                            if (var26 == 3) {
                                this.field1333 += 15;
                                this.field1334 -= 10;
                            }
                            this.field1595[var19.field418[var26]].method186(this.field1334 - 12, this.field1333 - 12, -47687);
                            this.field1469.method202(0, this.field1334 + 4, true, this.field1333, String.valueOf(var19.field417[var26]));
                            this.field1469.method202(16777215, this.field1334 + 3, true, this.field1333 - 1, String.valueOf(var19.field417[var26]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1552; ++var3) {
            int var4 = this.field1554[var3];
            int var5 = this.field1555[var3];
            int var6 = this.field1557[var3];
            int var7 = this.field1556[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field1555[var18] - this.field1556[var18] && var5 - var7 < this.field1555[var18] + 2 && var4 - var6 < this.field1557[var18] + this.field1554[var18] && var4 + var6 > this.field1554[var18] - this.field1557[var18] && this.field1555[var18] - this.field1556[var18] < var5) {
                        var5 = this.field1555[var18] - this.field1556[var18];
                        var8 = true;
                    }
                }
            }
            this.field1333 = this.field1554[var3];
            this.field1334 = this.field1555[var3] = var5;
            String var9 = this.field1561[var3];
            if (this.field1345 == 0) {
                int var10 = 16776960;
                if (this.field1558[var3] < 6) {
                    var10 = this.field1328[this.field1558[var3]];
                }
                if (this.field1558[var3] == 6) {
                    var10 = this.field1378 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1558[var3] == 7) {
                    var10 = this.field1378 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1558[var3] == 8) {
                    var10 = this.field1378 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1558[var3] == 9) {
                    int var11 = 150 - this.field1560[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1558[var3] == 10) {
                    int var12 = 150 - this.field1560[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1558[var3] == 11) {
                    int var13 = 150 - this.field1560[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1559[var3] == 0) {
                    this.field1471.method202(0, this.field1334 + 1, true, this.field1333, var9);
                    this.field1471.method202(var10, this.field1334, true, this.field1333, var9);
                }
                if (this.field1559[var3] == 1) {
                    this.field1471.method207(914, 0, var9, this.field1334 + 1, this.field1333, this.field1378);
                    this.field1471.method207(914, var10, var9, this.field1334, this.field1333, this.field1378);
                }
                if (this.field1559[var3] == 2) {
                    this.field1471.method208(this.field1334 + 1, 0, this.field1333, var9, this.field1378, 0);
                    this.field1471.method208(this.field1334, var10, this.field1333, var9, this.field1378, 0);
                }
                if (this.field1559[var3] == 3) {
                    this.field1471.method209(150 - this.field1560[var3], this.field1334 + 1, this.field1333, this.field1378, var9, 0, 87);
                    this.field1471.method209(150 - this.field1560[var3], this.field1334, this.field1333, this.field1378, var9, var10, 87);
                }
                if (this.field1559[var3] == 4) {
                    int var14 = this.field1471.method205((byte) -3, var9);
                    int var15 = (150 - this.field1560[var3]) * (var14 + 100) / 150;
                    Pix2D.method154(this.field1333 - 50, 334, this.field1333 + 50, 0, -227);
                    this.field1471.method206(this.field1333 + 50 - var15, var9, -830, 0, this.field1334 + 1);
                    this.field1471.method206(this.field1333 + 50 - var15, var9, -830, var10, this.field1334);
                    Pix2D.method153(-881);
                }
                if (this.field1559[var3] == 5) {
                    int var16 = 150 - this.field1560[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    Pix2D.method154(0, this.field1334 + 5, 512, this.field1334 - this.field1471.field702 - 1, -227);
                    this.field1471.method202(0, this.field1334 + 1 + var17, true, this.field1333, var9);
                    this.field1471.method202(var10, this.field1334 + var17, true, this.field1333, var9);
                    Pix2D.method153(-881);
                }
            } else {
                this.field1471.method202(0, this.field1334 + 1, true, this.field1333, var9);
                this.field1471.method202(16776960, this.field1334, true, this.field1333, var9);
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method549(byte arg0) {
        if (arg0 != 9) {
            this.field1473 = null;
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1628 = (this.field1628 + 1) % 4;
                this.field1266 = true;
                this.field1349 = true;
                this.field1287.method218(215, (byte) 19);
                this.field1287.method219(this.field1628);
                this.field1287.method219(this.field1386);
                this.field1287.method219(this.field1494);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1386 = (this.field1386 + 1) % 3;
                this.field1266 = true;
                this.field1349 = true;
                this.field1287.method218(215, (byte) 19);
                this.field1287.method219(this.field1628);
                this.field1287.method219(this.field1386);
                this.field1287.method219(this.field1494);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1494 = (this.field1494 + 1) % 3;
                this.field1266 = true;
                this.field1349 = true;
                this.field1287.method218(215, (byte) 19);
                this.field1287.method219(this.field1628);
                this.field1287.method219(this.field1386);
                this.field1287.method219(this.field1494);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                if (this.field1339 == -1) {
                    this.method457(false);
                    this.field1430 = "";
                    this.field1705 = false;
                    for (int var2 = 0; var2 < Component.field72.length; ++var2) {
                        if (Component.field72[var2] != null && Component.field72[var2].field81 == 600) {
                            this.field1449 = this.field1339 = Component.field72[var2].field78;
                            return;
                        }
                    }
                    return;
                }
                this.method503(true, 0, "Please close the interface you have open before using 'report abuse'", "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method550(byte arg0) {
        if (this.field1451 != arg0) {
            this.field1697 = -1;
        }
        int var2 = 5;
        this.field1439[8] = 0;
        int var3 = 0;
        while (this.field1439[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(20, "Connecting to web server", (byte) 7);
            try {
                DataInputStream var5 = this.method531("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 300);
                Packet var6 = new Packet(false, new byte[40]);
                var5.readFully(var6.field715, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1439[var7] = var6.method234();
                }
                int var8 = var6.method234();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1439[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1439[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1439[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1439[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1439[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1439[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(10, "Game updated - please reload page", (byte) 7);
                        var11 = 10;
                    } else {
                        this.method13(10, var4 + " - Will retry in " + var11 + " secs.", (byte) 7);
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
                this.field1709 = !this.field1709;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    private final void method551(int arg0, int arg1, Packet arg2) {
        arg2.method239(-35838);
        if (arg0 <= 0) {
            this.field1490 = this.field1338.method295();
        }
        int var4 = arg2.method240(8, 0);
        if (var4 < this.field1630) {
            for (int var5 = var4; var5 < this.field1630; ++var5) {
                this.field1336[this.field1335++] = this.field1631[var5];
            }
        }
        if (var4 > this.field1630) {
            signlink.reporterror(this.field1292 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1630 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1631[var6];
                NpcEntity var8 = this.field1629[var7];
                int var9 = arg2.method240(1, 0);
                if (var9 == 0) {
                    this.field1631[this.field1630++] = var7;
                    var8.field446 = field1403;
                } else {
                    int var10 = arg2.method240(2, 0);
                    if (var10 == 0) {
                        this.field1631[this.field1630++] = var7;
                        var8.field446 = field1403;
                        this.field1309[this.field1308++] = var7;
                    } else if (var10 == 1) {
                        this.field1631[this.field1630++] = var7;
                        var8.field446 = field1403;
                        int var11 = arg2.method240(3, 0);
                        var8.method111(0, false, var11);
                        int var12 = arg2.method240(1, 0);
                        if (var12 == 1) {
                            this.field1309[this.field1308++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1631[this.field1630++] = var7;
                        var8.field446 = field1403;
                        int var13 = arg2.method240(3, 0);
                        var8.method111(0, true, var13);
                        int var14 = arg2.method240(3, 0);
                        var8.method111(0, true, var14);
                        int var15 = arg2.method240(1, 0);
                        if (var15 == 1) {
                            this.field1309[this.field1308++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1336[this.field1335++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)Z")
    public final boolean method552(byte arg0) {
        if (arg0 != 103) {
            this.field1697 = this.field1404.method229();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method553(int arg0, byte arg1) {
        signlink.wavevol = arg0;
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)Z")
    public final boolean method554(byte arg0, Component arg1) {
        int var3 = arg1.field81;
        if (this.field1621 == arg0) {
            boolean var4 = false;
        } else {
            this.field1673 = 385;
        }
        if (this.field1385 == 2) {
            if (var3 == 201) {
                this.field1349 = true;
                this.field1377 = false;
                this.field1575 = true;
                this.field1615 = "";
                this.field1579 = 1;
                this.field1235 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1349 = true;
                this.field1377 = false;
                this.field1575 = true;
                this.field1615 = "";
                this.field1579 = 2;
                this.field1235 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1700 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1349 = true;
                this.field1377 = false;
                this.field1575 = true;
                this.field1615 = "";
                this.field1579 = 4;
                this.field1235 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1349 = true;
                this.field1377 = false;
                this.field1575 = true;
                this.field1615 = "";
                this.field1579 = 5;
                this.field1235 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var5 = (var3 - 300) / 2;
                int var6 = var3 & 1;
                int var7 = this.field1646[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = IdkType.field1133 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= IdkType.field1133) {
                                var7 = 0;
                            }
                        }
                        if (!IdkType.field1134[var7].field1140 && IdkType.field1134[var7].field1135 == var5 + (this.field1250 ? 0 : 7)) {
                            this.field1646[var5] = var7;
                            this.field1463 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var8 = (var3 - 314) / 2;
                int var9 = var3 & 1;
                int var10 = this.field1690[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field1452[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field1452[var8].length) {
                        var10 = 0;
                    }
                }
                this.field1690[var8] = var10;
                this.field1463 = true;
            }
            if (var3 == 324 && !this.field1250) {
                this.field1250 = true;
                this.method517(this.field1548);
            }
            if (var3 == 325 && this.field1250) {
                this.field1250 = false;
                this.method517(this.field1548);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1705 = !this.field1705;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method457(false);
                    if (this.field1430.length() > 0) {
                        this.field1287.method218(217, (byte) 19);
                        this.field1287.method225(JString.method300(this.field1430), -40349);
                        this.field1287.method219(var3 - 601);
                        this.field1287.method219(this.field1705 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1287.method218(247, (byte) 19);
                this.field1287.method219(this.field1250 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field1287.method219(this.field1646[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field1287.method219(this.field1690[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILlb;)V")
    private final void method555(int arg0, int arg1, Packet arg2) {
        while (arg1 >= 0) {
            this.field1415 = 23;
        }
        while (arg2.field717 + 21 < arg0 * 8) {
            int var4 = arg2.method240(14, 0);
            if (var4 == 16383) {
                break;
            }
            if (this.field1629[var4] == null) {
                this.field1629[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1629[var4];
            this.field1631[this.field1630++] = var4;
            var5.field446 = field1403;
            var5.field458 = NpcType.method341(arg2.method240(12, 0));
            var5.field405 = var5.field458.field1020;
            var5.field449 = var5.field458.field1042;
            var5.field408 = var5.field458.field1024;
            var5.field409 = var5.field458.field1025;
            var5.field410 = var5.field458.field1026;
            var5.field411 = var5.field458.field1027;
            var5.field406 = var5.field458.field1023;
            int var6 = arg2.method240(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method240(5, 0);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method240(1, 0);
            var5.method110(field1396.field452[0] + var7, -415, var8 == 1, field1396.field451[0] + var6);
            int var9 = arg2.method240(1, 0);
            if (var9 == 1) {
                this.field1309[this.field1308++] = var4;
            }
        }
        arg2.method241(708);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method556(byte arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1693.method248();
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            this.field1473 = null;
        }
        while (var2 != null) {
            if (this.field1487 == var2.field511 && field1403 <= var2.field517) {
                if (field1403 >= var2.field516) {
                    if (var2.field520 > 0) {
                        NpcEntity var5 = this.field1629[var2.field520 - 1];
                        if (var5 != null && var5.field401 >= 0 && var5.field401 < 13312 && var5.field402 >= 0 && var5.field402 < 13312) {
                            var2.method120(8424, var5.field401, field1403, this.method513(var5.field402, true, var5.field401, var2.field511) - var2.field515, var5.field402);
                        }
                    }
                    if (var2.field520 < 0) {
                        int var6 = -var2.field520 - 1;
                        PlayerEntity var7;
                        if (this.field1325 == var6) {
                            var7 = field1396;
                        } else {
                            var7 = this.field1305[var6];
                        }
                        if (var7 != null && var7.field401 >= 0 && var7.field401 < 13312 && var7.field402 >= 0 && var7.field402 < 13312) {
                            var2.method120(8424, var7.field401, field1403, this.method513(var7.field402, true, var7.field401, var2.field511) - var2.field515, var7.field402);
                        }
                    }
                    var2.method121((byte) 5, this.field1263);
                    this.field1253.method61(var2.field530, 60, -27991, (int) var2.field524, false, var2, this.field1487, (int) var2.field523, -1, (int) var2.field522);
                }
            } else {
                var2.method106();
            }
            var2 = (ProjectileEntity) this.field1693.method250(7);
        }
        ++field1661;
        if (field1661 > 1174) {
            field1661 = 0;
            this.field1287.method218(179, (byte) 19);
            this.field1287.method219(0);
            int var4 = this.field1287.field716;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1287.method220(11499);
            }
            this.field1287.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1287.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1287.method219(94);
            }
            this.field1287.method220(51693);
            this.field1287.method219(16);
            this.field1287.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1287.method219(65);
            }
            this.field1287.method219((int) (Math.random() * 256.0D));
            this.field1287.method220(22990);
            this.field1287.method228(this.field1287.field716 - var4, (byte) 22);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method557(byte arg0, int arg1) {
        int[] var3 = this.field1708.field674;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field1284[arg1][var25][var6] & 24) == 0) {
                    this.field1253.method85(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (this.field1284[arg1 + 1][var25][var6] & 8) != 0) {
                    this.field1253.method85(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1708.method181(this.field1337);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field1284[arg1][var23][var9] & 24) == 0) {
                    this.method463(arg1, var9, var8, this.field1490, var7, var23);
                }
                if (arg1 < 3 && (this.field1284[arg1 + 1][var23][var9] & 8) != 0) {
                    this.method463(arg1 + 1, var9, var8, this.field1490, var7, var23);
                }
            }
        }
        this.field1668.method258(this.field1337);
        this.field1537 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field1253.method79(this.field1487, var10, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = LocType.method330(var14).field978;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field1636[this.field1487].field1115;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var16 > 0 && var16 > var10 - 3 && (var20[var16 - 1][var17] & 2621704) == 0) {
                                    --var16;
                                }
                                if (var22 == 1 && var16 < var18 - 1 && var16 < var10 + 3 && (var20[var16 + 1][var17] & 2621824) == 0) {
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
                        this.field1566[this.field1537] = this.field1321[var15];
                        this.field1538[this.field1537] = var16;
                        this.field1539[this.field1537] = var17;
                        ++this.field1537;
                    }
                }
            }
        }
        if (arg0 == 8) {
            boolean var11 = false;
        } else {
            this.field1589 = this.field1338.method295();
        }
        ++field1418;
        if (field1418 > 112) {
            field1418 = 0;
            this.field1287.method218(65, (byte) 19);
            this.field1287.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method558(int arg0) {
        short var2 = 256;
        if (this.field1392 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1392 > 768) {
                    this.field1648[var3] = this.method433(this.field1650[var3], this.field1649[var3], 1024 - this.field1392, 704);
                } else if (this.field1392 > 256) {
                    this.field1648[var3] = this.field1650[var3];
                } else {
                    this.field1648[var3] = this.method433(this.field1649[var3], this.field1650[var3], 256 - this.field1392, 704);
                }
            }
        } else if (this.field1393 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1393 > 768) {
                    this.field1648[var4] = this.method433(this.field1651[var4], this.field1649[var4], 1024 - this.field1393, 704);
                } else if (this.field1393 > 256) {
                    this.field1648[var4] = this.field1651[var4];
                } else {
                    this.field1648[var4] = this.method433(this.field1649[var4], this.field1651[var4], 256 - this.field1393, 704);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1648[var5] = this.field1649[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1409.field755[var6] = this.field1475.field674[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var24 = (var2 - var9) * this.field1366[var9] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var7 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field1459[var7++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field1648[var27];
                    int var31 = this.field1409.field755[var8];
                    this.field1409.field755[var8++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var25;
        }
        this.field1409.method259(0, -183, 0, super.field14);
        int var10 = 86 / arg0;
        for (int var11 = 0; var11 < 33920; ++var11) {
            this.field1410.field755[var11] = this.field1476.field674[var11];
        }
        int var12 = 0;
        int var13 = 1176;
        for (int var14 = 1; var14 < var2 - 1; ++var14) {
            int var15 = (var2 - var14) * this.field1366[var14] / var2;
            int var16 = 103 - var15;
            int var17 = var13 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field1459[var12++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field1648[var19];
                    int var23 = this.field1410.field755[var17];
                    this.field1410.field755[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var12 += 128 - var16;
            var13 = 128 - var16 - var15 + var17;
        }
        this.field1410.method259(0, -183, 637, super.field14);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public final void method13(int arg0, String arg1, byte arg2) {
        this.field1289 = arg0;
        this.field1551 = arg1;
        this.method439(0);
        if (this.field1236 == null) {
            super.method13(arg0, arg1, (byte) 7);
        } else {
            this.field1408.method258(this.field1337);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1471.method202(16777215, var5 / 2 - 26 - var6, true, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(9179409, var4 / 2 - 152, 0, var7, 304, 34);
            if (arg2 != 7) {
                this.field1473 = null;
            }
            Pix2D.method158(0, var4 / 2 - 151, 0, var7 + 1, 302, 32);
            Pix2D.method157(false, var4 / 2 - 150, arg0 * 3, 9179409, var7 + 2, 30);
            Pix2D.method157(false, arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3, 0, var7 + 2, 30);
            this.field1471.method202(16777215, var5 / 2 + 5 - var6, true, var4 / 2, arg1);
            this.field1408.method259(171, -183, 202, super.field14);
            if (this.field1286) {
                this.field1286 = false;
                if (!this.field1465) {
                    this.field1409.method259(0, -183, 0, super.field14);
                    this.field1410.method259(0, -183, 637, super.field14);
                }
                this.field1406.method259(0, -183, 128, super.field14);
                this.field1407.method259(371, -183, 202, super.field14);
                this.field1411.method259(265, -183, 0, super.field14);
                this.field1412.method259(265, -183, 562, super.field14);
                this.field1413.method259(171, -183, 128, super.field14);
                this.field1414.method259(171, -183, 562, super.field14);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILd;)V")
    public final void method559(int arg0, Component arg1) {
        int var3 = arg1.field81;
        if (arg0 != 3) {
            this.field1643 = this.field1338.method295();
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1384;
                if (this.field1385 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field113 = "";
                    arg1.field80 = 0;
                } else {
                    if (this.field1652[var3] == 0) {
                        arg1.field113 = "@red@Offline";
                    } else if (this.field1652[var3] == field1341) {
                        arg1.field113 = "@gre@World-" + (this.field1652[var3] - 9);
                    } else {
                        arg1.field113 = "@yel@World-" + (this.field1652[var3] - 9);
                    }
                    arg1.field80 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1384;
                if (this.field1385 != 2) {
                    var6 = 0;
                }
                arg1.field91 = var6 * 15 + 20;
                if (arg1.field91 <= arg1.field83) {
                    arg1.field91 = arg1.field83 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1385 == 0) {
                    arg1.field113 = "Loading ignore list";
                    arg1.field80 = 0;
                } else if (var3 == 1 && this.field1385 == 0) {
                    arg1.field113 = "Please wait...";
                    arg1.field80 = 0;
                } else {
                    int var7 = this.field1585;
                    if (this.field1385 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field113 = "";
                        arg1.field80 = 0;
                    } else {
                        arg1.field113 = JString.method304(-257, JString.method301(this.field1453[var3], 0));
                        arg1.field80 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field91 = this.field1585 * 15 + 20;
                if (arg1.field91 <= arg1.field83) {
                    arg1.field91 = arg1.field83 + 1;
                }
            } else if (var3 == 327) {
                arg1.field128 = 150;
                arg1.field129 = (int) (Math.sin((double) field1403 / 40.0D) * 256.0D) & 2047;
                if (this.field1463) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field1646[var8];
                        if (var15 >= 0 && !IdkType.field1134[var15].method377(0)) {
                            return;
                        }
                    }
                    this.field1463 = false;
                    Model[] var9 = new Model[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field1646[var11];
                        if (var14 >= 0) {
                            var9[var10++] = IdkType.field1134[var14].method378((byte) 5);
                        }
                    }
                    Model var12 = new Model(var10, var9, (byte) 1);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field1690[var13] != 0) {
                            var12.method140(field1452[var13][0], field1452[var13][this.field1690[var13]]);
                            if (var13 == 1) {
                                var12.method140(field1622[0], field1622[this.field1690[var13]]);
                            }
                        }
                    }
                    var12.method133(this.field1677);
                    var12.method134(-37879, SeqType.field1155[field1396.field406].field1157[0]);
                    var12.method143(64, 850, -30, -50, -30, true);
                    arg1.field121 = 5;
                    arg1.field122 = 0;
                    Component.method36(0, -28932, var12, 5);
                }
            } else if (var3 == 324) {
                if (this.field1447 == null) {
                    this.field1447 = arg1.field119;
                    this.field1448 = arg1.field120;
                }
                if (this.field1250) {
                    arg1.field119 = this.field1448;
                } else {
                    arg1.field119 = this.field1447;
                }
            } else if (var3 == 325) {
                if (this.field1447 == null) {
                    this.field1447 = arg1.field119;
                    this.field1448 = arg1.field120;
                }
                if (this.field1250) {
                    arg1.field119 = this.field1447;
                } else {
                    arg1.field119 = this.field1448;
                }
            } else if (var3 == 600) {
                arg1.field113 = this.field1430;
                if (field1403 % 20 < 10) {
                    arg1.field113 = arg1.field113 + "|";
                } else {
                    arg1.field113 = arg1.field113 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1692 >= 1) {
                        if (this.field1705) {
                            arg1.field115 = 16711680;
                            arg1.field113 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field115 = 16777215;
                            arg1.field113 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field113 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1687 != 0) {
                        String var16;
                        if (this.field1644 == 0) {
                            var16 = "earlier today";
                        } else if (this.field1644 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field1644 + " days ago";
                        }
                        arg1.field113 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field113 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1497 == 0) {
                        arg1.field113 = "0 unread messages";
                        arg1.field115 = 16776960;
                    }
                    if (this.field1497 == 1) {
                        arg1.field113 = "1 unread message";
                        arg1.field115 = 65280;
                    }
                    if (this.field1497 > 1) {
                        arg1.field113 = this.field1497 + " unread messages";
                        arg1.field115 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1474 == 201) {
                        if (this.field1300 == 1) {
                            arg1.field113 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field113 = "";
                        }
                    } else if (this.field1474 == 200) {
                        arg1.field113 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field1474 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field1474 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field1474 + " days ago";
                        }
                        arg1.field113 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1474 == 201) {
                        if (this.field1300 == 1) {
                            arg1.field113 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field113 = "";
                        }
                    } else if (this.field1474 == 200) {
                        arg1.field113 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field113 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1474 == 201) {
                        if (this.field1300 == 1) {
                            arg1.field113 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field113 = "";
                        }
                    } else if (this.field1474 == 200) {
                        arg1.field113 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field113 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1385 == 0) {
            arg1.field113 = "Loading friend list";
            arg1.field80 = 0;
        } else if (var3 == 1 && this.field1385 == 1) {
            arg1.field113 = "Connecting to friendserver";
            arg1.field80 = 0;
        } else if (var3 == 2 && this.field1385 != 2) {
            arg1.field113 = "Please wait...";
            arg1.field80 = 0;
        } else {
            int var4 = this.field1384;
            if (this.field1385 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field113 = "";
                arg1.field80 = 0;
            } else {
                arg1.field113 = this.field1381[var3];
                arg1.field80 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method560(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method561(int arg0) {
        this.field1465 = false;
        while (this.field1671) {
            this.field1465 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1354 = null;
        this.field1355 = null;
        this.field1331 = null;
        if (this.field1643 == arg0) {
            this.field1648 = null;
            this.field1649 = null;
            this.field1650 = null;
            this.field1651 = null;
            this.field1542 = null;
            this.field1543 = null;
            this.field1459 = null;
            this.field1460 = null;
            this.field1475 = null;
            this.field1476 = null;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1341 = Integer.parseInt(this.getParameter("nodeid"));
        field1342 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method456(-47);
        } else {
            method509(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1343 = false;
        } else {
            field1343 = true;
        }
        this.method2(503, (byte) 21, 765);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIZI)V")
    private final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        LocSpawned var11 = null;
        this.field1645 &= arg8;
        for (LocSpawned var12 = (LocSpawned) this.field1639.method248(); var12 != null; var12 = (LocSpawned) this.field1639.method250(7)) {
            if (var12.field734 == arg9 && var12.field736 == arg1 && var12.field737 == arg4 && var12.field735 == arg2) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field734 = arg9;
            var11.field735 = arg2;
            var11.field736 = arg1;
            var11.field737 = arg4;
            this.method436(var11, -22447);
            this.field1639.method245(var11);
        }
        var11.field741 = arg5;
        var11.field743 = arg3;
        var11.field742 = arg7;
        var11.field744 = arg0;
        var11.field745 = arg6;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1379[var1] = var0 - 1;
            var0 += var0;
        }
        field1452 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1455 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1455[var3] = var2 / 4;
        }
        field1456 = 7;
        field1482 = 888;
        field1483 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1493 = 35102;
        field1517 = -47;
        field1593 = 413;
        field1602 = true;
        field1604 = 24133;
        field1622 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1626 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1655 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
