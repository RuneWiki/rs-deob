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

    @OriginalMember(owner = "client", name = "R", descriptor = "Z")
    private boolean field1233 = false;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field1236 = new int[Stats.field1166];

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1237 = -1;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[Lvb;")
    public FileStream[] field1240 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1241 = -1;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field1246 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Ljava/lang/String;")
    private String field1247 = "";

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private boolean field1253 = false;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[Ljb;")
    private Pix8[] field1256 = new Pix8[100];

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field1257 = new int[151];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field1269 = new int[50];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field1279 = new int[500];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1280 = new int[500];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1281 = new int[500];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field1282 = new int[500];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[[[Lob;")
    private LinkList[][][] field1290 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1291 = -1;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1294 = 5063219;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field1308 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1310 = 328;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljava/lang/String;")
    private String field1319 = "";

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Ljava/lang/String;")
    private String field1320 = "";

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[I")
    private int[] field1321 = new int[50];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    public int[] field1327 = new int[1000];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[Ljava/lang/String;")
    private String[] field1328 = new String[5];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[Z")
    private boolean[] field1329 = new boolean[5];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1330 = 78;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[B")
    private byte[] field1331 = new byte[16384];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field1333 = new int[100];

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[Ljava/lang/String;")
    private String[] field1334 = new String[100];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[Ljava/lang/String;")
    private String[] field1335 = new String[100];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Lob;")
    private LinkList field1336 = new LinkList(6);

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1337 = -13274;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1338 = 487;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1339 = 7759444;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "B")
    private byte field1340 = 0;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Ljava/lang/String;")
    private String field1345 = "";

    @OriginalMember(owner = "client", name = "ad", descriptor = "Ljava/lang/String;")
    private String field1346 = "";

    @OriginalMember(owner = "client", name = "dd", descriptor = "Ljava/lang/String;")
    private String field1349 = "";

    @OriginalMember(owner = "client", name = "ed", descriptor = "Z")
    private boolean field1350 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1353 = 1;

    @OriginalMember(owner = "client", name = "id", descriptor = "[Ljc;")
    private CollisionMap[] field1354 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1355 = -1;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1356 = 648;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1357 = new int[200];

    @OriginalMember(owner = "client", name = "rd", descriptor = "B")
    private byte field1363 = 29;

    @OriginalMember(owner = "client", name = "td", descriptor = "[Lib;")
    private Pix32[] field1365 = new Pix32[8];

    @OriginalMember(owner = "client", name = "yd", descriptor = "Lob;")
    private LinkList field1370 = new LinkList(6);

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Z")
    private boolean field1374 = false;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[Lib;")
    private Pix32[] field1379 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Id", descriptor = "Llb;")
    private Packet field1380 = Packet.method217(1, false);

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field1381 = false;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1382 = 21991;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    public int[] field1384 = new int[2000];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1396 = -576;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1397 = -22129;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    public boolean field1398 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field1402 = new int[Stats.field1166];

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field1404 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1405 = new CRC32();

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private boolean field1406 = false;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private boolean field1407 = true;

    @OriginalMember(owner = "client", name = "le", descriptor = "[I")
    private int[] field1409 = new int[5];

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field1411 = true;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Llb;")
    private Packet field1418 = Packet.method217(1, false);

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field1419 = new int[5];

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1422 = 2;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Z")
    private boolean field1423 = false;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1424 = -1;

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field1427 = new int[Stats.field1166];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private boolean field1431 = false;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1432 = 18835;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[Z")
    private boolean[] field1434 = new boolean[5];

    @OriginalMember(owner = "client", name = "Le", descriptor = "[Lib;")
    private Pix32[] field1435 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Me", descriptor = "[J")
    private long[] field1436 = new long[200];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Z")
    private boolean field1437 = false;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private boolean field1442 = false;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1448 = 1;

    @OriginalMember(owner = "client", name = "af", descriptor = "Z")
    public boolean field1450 = true;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljava/lang/String;")
    private String field1451 = "";

    @OriginalMember(owner = "client", name = "cf", descriptor = "Ljava/lang/String;")
    private String field1452 = "";

    @OriginalMember(owner = "client", name = "df", descriptor = "[[I")
    private int[][] field1453 = new int[104][104];

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1455 = 1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1456 = -1;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1458 = 2301979;

    @OriginalMember(owner = "client", name = "lf", descriptor = "[I")
    private int[] field1460 = new int[151];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1470 = new int[5];

    @OriginalMember(owner = "client", name = "wf", descriptor = "Z")
    private boolean field1471 = false;

    @OriginalMember(owner = "client", name = "xf", descriptor = "[Ljb;")
    private Pix8[] field1472 = new Pix8[2];

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1473 = 2048;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1474 = 2047;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[Lab;")
    private PlayerEntity[] field1475 = new PlayerEntity[this.field1473];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    public int[] field1477 = new int[this.field1473];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1479 = new int[this.field1473];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[Llb;")
    private Packet[] field1480 = new Packet[this.field1473];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[Lib;")
    private Pix32[] field1481 = new Pix32[100];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1482 = 3;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    private int[] field1485 = new int[1000];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1486 = new int[1000];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Z")
    private boolean field1487 = false;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    private int[] field1490 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1496 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field1497 = new int[9];

    @OriginalMember(owner = "client", name = "ag", descriptor = "B")
    private byte field1501 = 7;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1503 = 3353893;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[Ljava/lang/String;")
    private String[] field1514 = new String[500];

    @OriginalMember(owner = "client", name = "og", descriptor = "Z")
    private boolean field1515 = false;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Ld;")
    private Component field1516 = new Component();

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1519 = 6;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private final int[] field1522 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1523 = -1;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1524 = -34963;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Z")
    private boolean field1526 = true;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field1527 = new int[256];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1529 = -1;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Ljava/lang/String;")
    private String field1542 = "";

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field1548 = new int[4000];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1549 = new int[4000];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field1550 = new int[5];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[[I")
    private int[][] field1552 = new int[104][104];

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field1554 = -31809;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field1555 = -1;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field1556 = false;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Z")
    private boolean field1557 = true;

    @OriginalMember(owner = "client", name = "ih", descriptor = "[I")
    private int[] field1561 = new int[33];

    @OriginalMember(owner = "client", name = "jh", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1567 = -1;

    @OriginalMember(owner = "client", name = "vh", descriptor = "B")
    private byte field1574 = -43;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1576 = new int[5];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1582 = -25848;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1583 = -1;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1584 = -1;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1587 = 128;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field1592 = true;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private boolean field1593 = false;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field1594 = new int[2000];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[J")
    private long[] field1595 = new long[100];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1597 = 50;

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field1598 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[I")
    private int[] field1599 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field1600 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field1601 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field1602 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private int[] field1603 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[I")
    private int[] field1604 = new int[this.field1597];

    @OriginalMember(owner = "client", name = "ai", descriptor = "[Ljava/lang/String;")
    private String[] field1605 = new String[this.field1597];

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1606 = -36824;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Lob;")
    private LinkList field1607 = new LinkList(6);

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1609 = true;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1611 = 2;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field1612 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "Llb;")
    private Packet field1613 = Packet.method217(1, false);

    @OriginalMember(owner = "client", name = "ni", descriptor = "B")
    private byte field1618 = -70;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1619 = 1;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field1626 = new int[50];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[Ljava/lang/String;")
    private String[] field1627 = new String[200];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[Lib;")
    private Pix32[] field1629 = new Pix32[20];

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private final int field1630 = 100;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[I")
    private int[] field1631 = new int[100];

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field1634 = new int[7];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1636 = -1;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field1639 = false;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Z")
    private boolean field1645 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1661 = 2;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[[I")
    private int[][] field1672 = new int[104][104];

    @OriginalMember(owner = "client", name = "uj", descriptor = "Z")
    private boolean field1677 = true;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field1678 = false;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Z")
    private boolean field1679 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[Ljb;")
    private Pix8[] field1680 = new Pix8[13];

    @OriginalMember(owner = "client", name = "yj", descriptor = "Z")
    private boolean field1681 = true;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    private boolean field1682 = false;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[Lz;")
    private NpcEntity[] field1683 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    public int[] field1685 = new int[16384];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field1691 = new int[33];

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private static int field1230 = 4;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1288 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[[I")
    public static final int[][] field1341 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    public static int[] field1344 = new int[32];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private static int field1383;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private static int field1403;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[I")
    public static final int[] field1426;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private static int field1439;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private static int[] field1500;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private static int field1509;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private static boolean field1511;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private static int field1591;

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1608;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "Ljava/lang/String;")
    private static String field1637;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private static int field1229;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private static int field1232;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private static int field1238;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private static int field1242;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private static int field1249;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private static int field1250;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private static int field1268;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private static int field1276;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field1293;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private static int field1297;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private static int field1302;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private static int field1347;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private static int field1358;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private static int field1469;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private static int field1508;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private static int field1513;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private static int field1538;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private static int field1568;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private static int field1585;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client", name = "S", descriptor = "J")
    public long field1234;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "J")
    private long field1537;

    @OriginalMember(owner = "client", name = "pi", descriptor = "J")
    private long field1620;

    @OriginalMember(owner = "client", name = "cj", descriptor = "J")
    private long field1659;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "J")
    private long field1686;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Le;")
    private ClientStream field1248;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Lwb;")
    private Isaac field1408;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Lxb;")
    private Jagfile field1292;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "Lfc;")
    public MouseTracking field1693;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lub;")
    private OnDemand field1528;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Lib;")
    private Pix32 field1303;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Lib;")
    private Pix32 field1304;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Lib;")
    private Pix32 field1305;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Lib;")
    private Pix32 field1306;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Lib;")
    private Pix32 field1311;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Lib;")
    private Pix32 field1362;

    @OriginalMember(owner = "client", name = "me", descriptor = "Lib;")
    private Pix32 field1410;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lib;")
    private Pix32 field1488;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Lib;")
    private Pix32 field1489;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lib;")
    private Pix32 field1540;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Lib;")
    private Pix32 field1541;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Lib;")
    private Pix32 field1559;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Lib;")
    private Pix32 field1560;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Ljb;")
    private Pix8 field1315;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Ljb;")
    private Pix8 field1316;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Ljb;")
    private Pix8 field1317;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Ljb;")
    private Pix8 field1371;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Ljb;")
    private Pix8 field1372;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Ljb;")
    private Pix8 field1373;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Ljb;")
    private Pix8 field1413;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Ljb;")
    private Pix8 field1414;

    @OriginalMember(owner = "client", name = "re", descriptor = "Ljb;")
    private Pix8 field1415;

    @OriginalMember(owner = "client", name = "se", descriptor = "Ljb;")
    private Pix8 field1416;

    @OriginalMember(owner = "client", name = "te", descriptor = "Ljb;")
    private Pix8 field1417;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Ljb;")
    private Pix8 field1440;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Ljb;")
    private Pix8 field1441;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Ljb;")
    private Pix8 field1498;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Ljb;")
    private Pix8 field1499;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljb;")
    private Pix8 field1569;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Ljb;")
    private Pix8 field1570;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Ljb;")
    private Pix8 field1571;

    @OriginalMember(owner = "client", name = "th", descriptor = "Ljb;")
    private Pix8 field1572;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Ljb;")
    private Pix8 field1573;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Lkb;")
    private PixFont field1673;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Lkb;")
    private PixFont field1674;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Lkb;")
    private PixFont field1675;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Lkb;")
    private PixFont field1676;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Lqb;")
    private PixMap field1270;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lqb;")
    private PixMap field1271;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lqb;")
    private PixMap field1272;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Lqb;")
    private PixMap field1273;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Lqb;")
    private PixMap field1563;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Lqb;")
    private PixMap field1564;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Lqb;")
    private PixMap field1565;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Lqb;")
    private PixMap field1647;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Lqb;")
    private PixMap field1648;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Lqb;")
    private PixMap field1649;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Lqb;")
    private PixMap field1650;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "Lqb;")
    private PixMap field1651;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Lqb;")
    private PixMap field1652;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Lqb;")
    private PixMap field1653;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Lqb;")
    private PixMap field1654;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Lqb;")
    private PixMap field1655;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Lqb;")
    private PixMap field1662;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lqb;")
    private PixMap field1663;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Lqb;")
    private PixMap field1664;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Lqb;")
    private PixMap field1665;

    @OriginalMember(owner = "client", name = "jj", descriptor = "Lqb;")
    private PixMap field1666;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Lqb;")
    private PixMap field1667;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Lqb;")
    private PixMap field1668;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Lqb;")
    private PixMap field1669;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Lqb;")
    private PixMap field1670;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Lab;")
    public static PlayerEntity field1369;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Lr;")
    private World3D field1614;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Ljava/lang/String;")
    public String field1262;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Ljava/lang/String;")
    private String field1671;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Ljava/lang/String;")
    public String field1690;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Ljava/lang/String;")
    private String field1692;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljava/net/Socket;")
    private Socket field1504;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private static boolean field1266;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    public static boolean field1267;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private static boolean field1494;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Z")
    public static boolean field1495;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Z")
    private static boolean field1512;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    public static boolean field1694;

    @OriginalMember(owner = "client", name = "wb", descriptor = "[I")
    private int[] field1264;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1265;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[I")
    private int[] field1322;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[I")
    private int[] field1323;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[I")
    private int[] field1324;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1385;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field1386;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field1387;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1388;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field1467;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field1468;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[I")
    private int[] field1615;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field1616;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field1617;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[Ljb;")
    private Pix8[] field1558;

    @OriginalMember(owner = "client", name = "yc", descriptor = "[[B")
    private byte[][] field1318;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[[B")
    private byte[][] field1364;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[[[B")
    private byte[][][] field1309;

    @OriginalMember(owner = "client", name = "cd", descriptor = "[[[I")
    private int[][][] field1348;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < 2 || arg1 > 2) {
            this.field1682 = !this.field1682;
        }
        if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
            if (field1512 && this.field1295 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field1614.method76(arg3, arg0, arg5);
            }
            if (arg2 == 1) {
                var9 = this.field1614.method77(9, arg3, arg5, arg0);
            }
            if (arg2 == 2) {
                var9 = this.field1614.method78(arg3, arg0, arg5);
            }
            if (arg2 == 3) {
                var9 = this.field1614.method79(arg3, arg0, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field1614.method80(arg3, arg0, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field1614.method67(381, arg0, arg5, arg3);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field974) {
                        this.field1354[arg3].method364(arg0, false, var17.field975, var15, arg5, var16);
                    }
                }
                if (arg2 == 1) {
                    this.field1614.method68(arg5, arg3, true, arg0);
                }
                if (arg2 == 2) {
                    this.field1614.method69(arg5, 2, arg3, arg0);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field972 + arg0 > 103 || var18.field972 + arg5 > 103 || var18.field973 + arg0 > 103 || var18.field973 + arg5 > 103) {
                        return;
                    }
                    if (var18.field974) {
                        this.field1354[arg3].method365(var18.field975, var16, arg0, arg5, var18.field973, 5, var18.field972);
                    }
                }
                if (arg2 == 3) {
                    this.field1614.method70(675, arg5, arg3, arg0);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field974 && var19.field976) {
                        this.field1354[arg3].method367(arg5, arg0, this.field1431);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field1309[1][arg0][arg5] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                World.method31(var20, arg3, arg4, this.field1348, this.field1354[arg3], arg7, arg5, this.field1614, 8, arg0, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method430(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 46749) {
            field1591 = -83;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILgc;III)V")
    public final void method431(int arg0, NpcType arg1, int arg2, int arg3, int arg4) {
        if (this.field1459 < 400) {
            if (arg1.field1043 != null) {
                arg1 = arg1.method345(559);
            }
            if (arg1 != null) {
                String var6 = arg1.field1018;
                if (arg3 != 22080) {
                    this.field1407 = !this.field1407;
                }
                if (arg1.field1035 != 0) {
                    var6 = var6 + method553(0, arg1.field1035, field1369.field466) + " (level-" + arg1.field1035 + ")";
                }
                if (this.field1258 == 1) {
                    this.field1514[this.field1459] = "Use " + this.field1262 + " with @yel@" + var6;
                    this.field1281[this.field1459] = 829;
                    this.field1282[this.field1459] = arg2;
                    this.field1279[this.field1459] = arg0;
                    this.field1280[this.field1459] = arg4;
                    ++this.field1459;
                } else {
                    if (this.field1687 == 1) {
                        if ((this.field1689 & 2) == 2) {
                            this.field1514[this.field1459] = this.field1690 + " @yel@" + var6;
                            this.field1281[this.field1459] = 240;
                            this.field1282[this.field1459] = arg2;
                            this.field1279[this.field1459] = arg0;
                            this.field1280[this.field1459] = arg4;
                            ++this.field1459;
                            return;
                        }
                    } else {
                        if (arg1.field1030 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg1.field1030[var7] != null && !arg1.field1030[var7].equalsIgnoreCase("attack")) {
                                    this.field1514[this.field1459] = arg1.field1030[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1281[this.field1459] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1281[this.field1459] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1281[this.field1459] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1281[this.field1459] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1281[this.field1459] = 793;
                                    }
                                    this.field1282[this.field1459] = arg2;
                                    this.field1279[this.field1459] = arg0;
                                    this.field1280[this.field1459] = arg4;
                                    ++this.field1459;
                                }
                            }
                        }
                        if (arg1.field1030 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg1.field1030[var8] != null && arg1.field1030[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg1.field1035 > field1369.field466) {
                                        var9 = 2000;
                                    }
                                    this.field1514[this.field1459] = arg1.field1030[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1281[this.field1459] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1281[this.field1459] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1281[this.field1459] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1281[this.field1459] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1281[this.field1459] = var9 + 793;
                                    }
                                    this.field1282[this.field1459] = arg2;
                                    this.field1279[this.field1459] = arg0;
                                    this.field1280[this.field1459] = arg4;
                                    ++this.field1459;
                                }
                            }
                        }
                        this.field1514[this.field1459] = "Examine @yel@" + var6;
                        this.field1281[this.field1459] = 1714;
                        this.field1282[this.field1459] = arg2;
                        this.field1279[this.field1459] = arg0;
                        this.field1280[this.field1459] = arg4;
                        ++this.field1459;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1248 != null) {
                this.field1248.method38();
            }
        } catch (Exception var2) {
        }
        this.field1248 = null;
        this.method462(true);
        if (this.field1693 != null) {
            this.field1693.field1005 = false;
        }
        this.field1693 = null;
        this.field1528.method271();
        this.field1528 = null;
        this.field1613 = null;
        this.field1380 = null;
        this.field1418 = null;
        this.field1322 = null;
        this.field1364 = null;
        this.field1318 = null;
        this.field1323 = null;
        this.field1324 = null;
        this.field1348 = null;
        this.field1309 = null;
        this.field1614 = null;
        this.field1354 = null;
        this.field1453 = null;
        this.field1672 = null;
        this.field1398 &= arg0;
        this.field1548 = null;
        this.field1549 = null;
        this.field1331 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1273 = null;
        this.field1563 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1647 = null;
        this.field1648 = null;
        this.field1649 = null;
        this.field1650 = null;
        this.field1651 = null;
        this.field1652 = null;
        this.field1653 = null;
        this.field1654 = null;
        this.field1655 = null;
        this.field1315 = null;
        this.field1316 = null;
        this.field1317 = null;
        this.field1371 = null;
        this.field1372 = null;
        this.field1373 = null;
        this.field1680 = null;
        this.field1413 = null;
        this.field1414 = null;
        this.field1415 = null;
        this.field1416 = null;
        this.field1417 = null;
        this.field1569 = null;
        this.field1570 = null;
        this.field1571 = null;
        this.field1572 = null;
        this.field1573 = null;
        this.field1410 = null;
        this.field1379 = null;
        this.field1629 = null;
        this.field1365 = null;
        this.field1303 = null;
        this.field1304 = null;
        this.field1305 = null;
        this.field1306 = null;
        this.field1256 = null;
        this.field1481 = null;
        this.field1552 = null;
        this.field1475 = null;
        this.field1477 = null;
        this.field1479 = null;
        this.field1480 = null;
        this.field1327 = null;
        this.field1683 = null;
        this.field1685 = null;
        this.field1290 = null;
        this.field1370 = null;
        this.field1336 = null;
        this.field1607 = null;
        this.field1279 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1282 = null;
        this.field1514 = null;
        this.field1384 = null;
        this.field1485 = null;
        this.field1486 = null;
        this.field1435 = null;
        this.field1362 = null;
        this.field1627 = null;
        this.field1436 = null;
        this.field1357 = null;
        this.field1665 = null;
        this.field1666 = null;
        this.field1662 = null;
        this.field1663 = null;
        this.field1664 = null;
        this.field1667 = null;
        this.field1668 = null;
        this.field1669 = null;
        this.field1670 = null;
        this.method440(true);
        LocType.method329(0);
        NpcType.method340(0);
        ObjType.method347(0);
        FloType.field1114 = null;
        IdkType.field1129 = null;
        Component.field71 = null;
        UnkType.field1137 = null;
        SeqType.field1149 = null;
        SpotAnimType.field1172 = null;
        SpotAnimType.field1184 = null;
        VarpType.field1195 = null;
        super.field17 = null;
        PlayerEntity.field484 = null;
        Pix3D.method164(0);
        World3D.method49(0);
        Model.method122(0);
        AnimFrame.method46(0);
        System.gc();
        if (Linkable.field363) {
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method432(int arg0) {
        if (this.field1459 >= 2 || this.field1258 != 0 || this.field1687 != 0) {
            String var2;
            if (this.field1258 == 1 && this.field1459 < 2) {
                var2 = "Use " + this.field1262 + " with...";
            } else if (this.field1687 == 1 && this.field1459 < 2) {
                var2 = this.field1690 + "...";
            } else {
                var2 = this.field1514[this.field1459 - 1];
            }
            if (this.field1459 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1459 - 2) + " more options";
            }
            this.field1675.method211(field1401 / 1000, 16777215, 15, var2, 4, (byte) 8, true);
            if (arg0 == 2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;BI)I")
    public final int method433(Component arg0, byte arg1, int arg2) {
        if (arg1 != -11) {
            field1591 = 134;
        }
        if (arg0.field86 != null && arg2 < arg0.field86.length) {
            try {
                int[] var4 = arg0.field86[arg2];
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
                        var9 = this.field1236[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1427[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1402[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field71[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1050 && (!ObjType.method348(var12).field1071 || field1511)) {
                            for (int var13 = 0; var13 < var11.field72.length; ++var13) {
                                if (var12 + 1 == var11.field72[var13]) {
                                    var9 += var11.field73[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1384[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1500[this.field1427[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1384[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1369.field466;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1166; ++var14) {
                            if (Stats.field1168[var14]) {
                                var9 += this.field1427[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field71[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1050 && (!ObjType.method348(var16).field1071 || field1511)) {
                            for (int var17 = 0; var17 < var15.field72.length; ++var17) {
                                if (var15.field72[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1575;
                    }
                    if (var8 == 12) {
                        var9 = this.field1553;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1384[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1186[var20];
                        int var22 = var21.field1188;
                        int var23 = var21.field1189;
                        int var24 = var21.field1190;
                        int var25 = field1344[var24 - var23];
                        var9 = this.field1384[var22] >> var23 & var25;
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
                        var9 = (field1369.field399 >> 7) + this.field1461;
                    }
                    if (var8 == 19) {
                        var9 = (field1369.field400 >> 7) + this.field1462;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method434(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1478; ++var4) {
            int var5 = this.field1479[var4];
            NpcEntity var6 = this.field1683[var5];
            int var7 = arg0.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg0.method229();
                int var9 = arg0.method229();
                var6.method114(true, var9, field1401, var8);
                var6.field418 = field1401 + 300;
                var6.field419 = arg0.method229();
                var6.field420 = arg0.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg0.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field427 == var10) {
                    var6.field431 = 0;
                }
                int var11 = arg0.method229();
                if (var6.field427 == var10 && var10 != -1) {
                    int var12 = SeqType.field1149[var10].field1163;
                    if (var12 == 1) {
                        var6.field428 = 0;
                        var6.field429 = 0;
                        var6.field430 = var11;
                        var6.field431 = 0;
                    }
                    if (var12 == 2) {
                        var6.field431 = 0;
                    }
                } else if (var10 == -1 || var6.field427 == -1 || SeqType.field1149[var10].field1157 >= SeqType.field1149[var6.field427].field1157) {
                    var6.field427 = var10;
                    var6.field428 = 0;
                    var6.field429 = 0;
                    var6.field430 = var11;
                    var6.field431 = 0;
                    var6.field453 = var6.field448;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field421 = arg0.method231();
                if (var6.field421 == 65535) {
                    var6.field421 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field411 = arg0.method236();
                var6.field412 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg0.method229();
                int var14 = arg0.method229();
                var6.method114(true, var14, field1401, var13);
                var6.field418 = field1401 + 300;
                var6.field419 = arg0.method229();
                var6.field420 = arg0.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field457 = NpcType.method341(arg0.method231());
                var6.field403 = var6.field457.field1020;
                var6.field447 = var6.field457.field1042;
                var6.field406 = var6.field457.field1024;
                var6.field407 = var6.field457.field1025;
                var6.field408 = var6.field457.field1026;
                var6.field409 = var6.field457.field1027;
                var6.field404 = var6.field457.field1023;
            }
            if ((var7 & 64) == 64) {
                var6.field432 = arg0.method231();
                int var15 = arg0.method234();
                var6.field436 = var15 >> 16;
                var6.field435 = (var15 & 65535) + field1401;
                var6.field433 = 0;
                var6.field434 = 0;
                if (var6.field435 > field1401) {
                    var6.field433 = -1;
                }
                if (var6.field432 == 65535) {
                    var6.field432 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field422 = arg0.method231();
                var6.field423 = arg0.method231();
            }
        }
        if (arg1 == 37046) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method435(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1632; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1627[var3])) {
                    return true;
                }
            }
            if (arg1 <= 0) {
                this.field1544 = -1;
            }
            return arg0.equalsIgnoreCase(field1369.field460);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method436(int arg0, Component arg1) {
        label47: while (true) {
            if (arg0 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label47;
                    }
                    ++var4;
                }
            }
            int var3 = arg1.field80;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field1514[this.field1459] = "Remove @whi@" + arg1.field112;
                    this.field1281[this.field1459] = 884;
                    ++this.field1459;
                    return true;
                }
                return false;
            }
            if (var3 >= 801) {
                var3 -= 701;
            } else if (var3 >= 701) {
                var3 -= 601;
            } else if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1514[this.field1459] = "Remove @whi@" + this.field1627[var3];
            this.field1281[this.field1459] = 513;
            ++this.field1459;
            this.field1514[this.field1459] = "Message @whi@" + this.field1627[var3];
            this.field1281[this.field1459] = 902;
            ++this.field1459;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method437(int arg0, int arg1) {
        if (arg1 != 0) {
            field1403 = -316;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method438(int arg0) {
        Graphics var2 = this.method11(1).getGraphics();
        var2.setColor(Color.black);
        this.field1543 += arg0;
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, 500);
        if (this.field1678) {
            this.field1350 = false;
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
        if (this.field1253) {
            this.field1350 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1657) {
            this.field1350 = false;
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

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            field1266 = !field1266;
        }
        if (this.field1505 == 0) {
            int var2 = super.field14 / 2 - 80;
            int var3 = super.field15 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field30 == 1 && super.field31 >= var2 - 75 && super.field31 <= var2 + 75 && super.field32 >= var14 - 20 && super.field32 <= var14 + 20) {
                this.field1505 = 3;
                this.field1278 = 0;
            }
            int var4 = super.field14 / 2 + 80;
            if (super.field30 == 1 && super.field31 >= var4 - 75 && super.field31 <= var4 + 75 && super.field32 >= var14 - 20 && super.field32 <= var14 + 20) {
                this.field1345 = "";
                this.field1346 = "Enter your username & password.";
                this.field1505 = 2;
                this.field1278 = 0;
            }
        } else if (this.field1505 == 2) {
            int var5 = super.field15 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field30 == 1 && super.field32 >= var16 - 15 && super.field32 < var16) {
                this.field1278 = 0;
            }
            var5 = var16 + 15;
            if (super.field30 == 1 && super.field32 >= var5 - 15 && super.field32 < var5) {
                this.field1278 = 1;
            }
            var5 += 15;
            int var6 = super.field14 / 2 - 80;
            int var7 = super.field15 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field30 == 1 && super.field31 >= var6 - 75 && super.field31 <= var6 + 75 && super.field32 >= var17 - 20 && super.field32 <= var17 + 20) {
                this.field1551 = 0;
                this.method490(this.field1319, this.field1320, false);
                if (this.field1398) {
                    return;
                }
            }
            int var8 = super.field14 / 2 + 80;
            if (super.field30 == 1 && super.field31 >= var8 - 75 && super.field31 <= var8 + 75 && super.field32 >= var17 - 20 && super.field32 <= var17 + 20) {
                this.field1505 = 0;
                this.field1319 = "";
                this.field1320 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(-203);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1637.length(); ++var11) {
                        if (var9 == field1637.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1278 == 0) {
                        if (var9 == 8 && this.field1319.length() > 0) {
                            this.field1319 = this.field1319.substring(0, this.field1319.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1278 = 1;
                        }
                        if (var10) {
                            this.field1319 = this.field1319 + (char) var9;
                        }
                        if (this.field1319.length() > 12) {
                            this.field1319 = this.field1319.substring(0, 12);
                        }
                    } else if (this.field1278 == 1) {
                        if (var9 == 8 && this.field1320.length() > 0) {
                            this.field1320 = this.field1320.substring(0, this.field1320.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1278 = 0;
                        }
                        if (var10) {
                            this.field1320 = this.field1320 + (char) var9;
                        }
                        if (this.field1320.length() > 20) {
                            this.field1320 = this.field1320.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1505 == 3) {
                int var12 = super.field14 / 2;
                int var13 = super.field15 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field30 == 1 && super.field31 >= var12 - 75 && super.field31 <= var12 + 75 && super.field32 >= var18 - 20 && super.field32 <= var18 + 20) {
                    this.field1505 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method440(boolean arg0) {
        this.field1350 = false;
        while (this.field1515) {
            this.field1350 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1498 = null;
        this.field1499 = null;
        this.field1558 = null;
        this.field1385 = null;
        this.field1386 = null;
        this.field1387 = null;
        this.field1388 = null;
        this.field1264 = null;
        this.field1265 = null;
        this.field1467 = null;
        this.field1398 &= arg0;
        this.field1468 = null;
        this.field1488 = null;
        this.field1489 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method441(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1359 >= 100) {
                this.method559(176, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method304(943, JString.method301(0, arg0));
                for (int var5 = 0; var5 < this.field1359; ++var5) {
                    if (this.field1595[var5] == arg0) {
                        this.method559(176, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1632; ++var6) {
                    if (this.field1436[var6] == arg0) {
                        this.method559(176, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                if (arg1 == 7) {
                    boolean var7 = false;
                } else {
                    this.field1613.method219(48);
                }
                this.field1595[this.field1359++] = arg0;
                this.field1381 = true;
                this.field1613.method218(true, 158);
                this.field1613.method225(-13398, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method442(int arg0) {
        LocType.field1002.method103();
        LocType.field1003.method103();
        NpcType.field1046.method103();
        ObjType.field1096.method103();
        if (arg0 != -24602) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        ObjType.field1097.method103();
        PlayerEntity.field484.method103();
        SpotAnimType.field1184.method103();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;I)V")
    public final void method443(Pix8 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1264.length; ++var4) {
            this.field1264[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1264[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg1 >= 2 && arg1 <= 2) {
            for (int var6 = 0; var6 < 20; ++var6) {
                for (int var13 = 1; var13 < var3 - 1; ++var13) {
                    for (int var15 = 1; var15 < 127; ++var15) {
                        int var16 = (var13 << 7) + var15;
                        this.field1265[var16] = (this.field1264[var16 - 1] + this.field1264[var16 + 1] + this.field1264[var16 - 128] + this.field1264[var16 + 128]) / 4;
                    }
                }
                int[] var14 = this.field1264;
                this.field1264 = this.field1265;
                this.field1265 = var14;
            }
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field682; ++var8) {
                    for (int var9 = 0; var9 < arg0.field681; ++var9) {
                        if (arg0.field679[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field683;
                            int var11 = var8 + 16 + arg0.field684;
                            int var12 = (var11 << 7) + var10;
                            this.field1264[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1471) {
            this.method540(177);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (arg0 > 0) {
            if (field1512 && this.field1520 == 2 && World.field44 != this.field1295) {
                this.field1272.method258(this.field1310);
                this.field1674.method202("Loading - please wait.", 151, 0, 257, this.field1356);
                this.field1674.method202("Loading - please wait.", 150, 16777215, 256, this.field1356);
                this.field1272.method259(super.field16, 4, 4, true);
                this.field1520 = 1;
                this.field1620 = System.currentTimeMillis();
            }
            if (this.field1520 == 1) {
                int var2 = this.method445(8);
                if (var2 != 0 && System.currentTimeMillis() - this.field1620 > 360000L) {
                    signlink.reporterror(this.field1319 + " glcfb " + this.field1686 + "," + var2 + "," + field1512 + "," + this.field1240[0] + "," + this.field1528.method280() + "," + this.field1295 + "," + this.field1254 + "," + this.field1255);
                    this.field1620 = System.currentTimeMillis();
                }
            }
            if (this.field1520 == 2 && this.field1529 != this.field1295) {
                this.field1529 = this.field1295;
                this.method543(this.field1296, this.field1295);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)I")
    public final int method445(int arg0) {
        for (int var2 = 0; var2 < this.field1364.length; ++var2) {
            if (this.field1364[var2] == null && this.field1323[var2] != -1) {
                return -1;
            }
            if (this.field1318[var2] == null && this.field1324[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1364.length; ++var4) {
            byte[] var5 = this.field1318[var4];
            if (var5 != null) {
                int var6 = (this.field1322[var4] >> 8) * 64 - this.field1461;
                int var7 = (this.field1322[var4] & 255) * 64 - this.field1462;
                var3 &= World.method16(this.field1382, var6, var7, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1423) {
            return -4;
        } else {
            this.field1520 = 2;
            World.field44 = this.field1295;
            this.method476(true);
            this.field1613.method218(true, 81);
            if (arg0 != 8) {
                this.method6();
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method446(byte arg0) {
        if (this.field1530 != 0) {
            PixFont var2 = this.field1674;
            int var3 = 0;
            if (this.field1536 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1335[var4] != null) {
                    int var6 = this.field1333[var4];
                    String var7 = this.field1334[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1658 == 0 || this.field1658 == 1 && this.method435(var7, 458))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method206("From", var10, 0, 25737, var9);
                        var2.method206("From", var10, 65535, 25737, var9 - 1);
                        int var11 = var10 + var2.method204((byte) 4, "From ");
                        if (var8 == 1) {
                            this.field1472[0].method199(var11, var9 - 12, 37651);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field1472[1].method199(var11, var9 - 12, 37651);
                            var11 += 14;
                        }
                        var2.method206(var7 + ": " + this.field1335[var4], var11, 0, 25737, var9);
                        var2.method206(var7 + ": " + this.field1335[var4], var11, 65535, 25737, var9 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1658 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method206(this.field1335[var4], 4, 0, 25737, var12);
                        var2.method206(this.field1335[var4], 4, 65535, 25737, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1658 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method206("To " + var7 + ": " + this.field1335[var4], 4, 0, 25737, var13);
                        var2.method206("To " + var7 + ": " + this.field1335[var4], 4, 65535, 25737, var13 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 == 5) {
                boolean var5 = false;
            } else {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method447(boolean arg0) {
        if (this.field1662 == null) {
            super.field17 = null;
            this.field1273 = null;
            this.field1271 = null;
            this.field1270 = null;
            this.field1272 = null;
            this.field1563 = null;
            this.field1564 = null;
            this.field1565 = null;
            this.field1665 = new PixMap(this.method11(1), (byte) 3, 265, 128);
            Pix2D.method155(7);
            this.field1666 = new PixMap(this.method11(1), (byte) 3, 265, 128);
            Pix2D.method155(7);
            this.field1662 = new PixMap(this.method11(1), (byte) 3, 171, 509);
            Pix2D.method155(7);
            this.field1663 = new PixMap(this.method11(1), (byte) 3, 132, 360);
            Pix2D.method155(7);
            if (arg0) {
                this.method6();
            }
            this.field1664 = new PixMap(this.method11(1), (byte) 3, 200, 360);
            Pix2D.method155(7);
            this.field1667 = new PixMap(this.method11(1), (byte) 3, 238, 202);
            Pix2D.method155(7);
            this.field1668 = new PixMap(this.method11(1), (byte) 3, 238, 203);
            Pix2D.method155(7);
            this.field1669 = new PixMap(this.method11(1), (byte) 3, 94, 74);
            Pix2D.method155(7);
            this.field1670 = new PixMap(this.method11(1), (byte) 3, 94, 75);
            Pix2D.method155(7);
            if (this.field1292 != null) {
                this.method552(21480);
                this.method522(0);
            }
            this.field1430 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method448(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            field1585 = -209;
        }
        this.field1273.method258(this.field1310);
        Pix3D.field645 = this.field1615;
        this.field1317.method199(0, 0, 37651);
        if (this.field1639) {
            this.field1675.method202(this.field1542, 40, 0, 239, this.field1356);
            this.field1675.method202(this.field1247 + "*", 60, 128, 239, this.field1356);
        } else if (this.field1233) {
            this.field1675.method202("Enter amount:", 40, 0, 239, this.field1356);
            this.field1675.method202(this.field1451 + "*", 60, 128, 239, this.field1356);
        } else if (this.field1692 != null) {
            this.field1675.method202(this.field1692, 40, 0, 239, this.field1356);
            this.field1675.method202("Click to continue", 60, 128, 239, this.field1356);
        } else if (this.field1241 != -1) {
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1241]);
        } else if (this.field1636 != -1) {
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1636]);
        } else {
            PixFont var3 = this.field1674;
            int var4 = 0;
            Pix2D.method154(0, 463, 0, (byte) 2, 77);
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1335[var5] != null) {
                    int var7 = this.field1333[var5];
                    int var8 = 70 - var4 * 14 + this.field1231;
                    String var9 = this.field1334[var5];
                    byte var10 = 0;
                    if (var9 != null && var9.startsWith("@cr1@")) {
                        var9 = var9.substring(5);
                        var10 = 1;
                    }
                    if (var9 != null && var9.startsWith("@cr2@")) {
                        var9 = var9.substring(5);
                        var10 = 2;
                    }
                    if (var7 == 0) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method206(this.field1335[var5], 4, 0, 25737, var8);
                        }
                        ++var4;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1239 == 0 || this.field1239 == 1 && this.method435(var9, 458))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field1472[0].method199(var11, var8 - 12, 37651);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field1472[1].method199(var11, var8 - 12, 37651);
                                var11 += 14;
                            }
                            var3.method206(var9 + ":", var11, 0, 25737, var8);
                            int var12 = var11 + var3.method204((byte) 4, var9) + 8;
                            var3.method206(this.field1335[var5], var12, 255, 25737, var8);
                        }
                        ++var4;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field1530 == 0 && (var7 == 7 || this.field1658 == 0 || this.field1658 == 1 && this.method435(var9, 458))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method206("From", var13, 0, 25737, var8);
                            int var14 = var13 + var3.method204((byte) 4, "From ");
                            if (var10 == 1) {
                                this.field1472[0].method199(var14, var8 - 12, 37651);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field1472[1].method199(var14, var8 - 12, 37651);
                                var14 += 14;
                            }
                            var3.method206(var9 + ":", var14, 0, 25737, var8);
                            int var15 = var14 + var3.method204((byte) 4, var9) + 8;
                            var3.method206(this.field1335[var5], var15, 8388608, 25737, var8);
                        }
                        ++var4;
                    }
                    if (var7 == 4 && (this.field1400 == 0 || this.field1400 == 1 && this.method435(var9, 458))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method206(var9 + " " + this.field1335[var5], 4, 8388736, 25737, var8);
                        }
                        ++var4;
                    }
                    if (var7 == 5 && this.field1530 == 0 && this.field1658 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method206(this.field1335[var5], 4, 8388608, 25737, var8);
                        }
                        ++var4;
                    }
                    if (var7 == 6 && this.field1530 == 0 && this.field1658 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method206("To " + var9 + ":", 4, 0, 25737, var8);
                            var3.method206(this.field1335[var5], 12 + var3.method204((byte) 4, "To " + var9), 8388608, 25737, var8);
                        }
                        ++var4;
                    }
                    if (var7 == 8 && (this.field1400 == 0 || this.field1400 == 1 && this.method435(var9, 458))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method206(var9 + " " + this.field1335[var5], 4, 8270336, 25737, var8);
                        }
                        ++var4;
                    }
                }
            }
            Pix2D.method153(true);
            this.field1330 = var4 * 14 + 7;
            if (this.field1330 < 78) {
                this.field1330 = 78;
            }
            this.method537(463, this.field1330, this.field1330 - this.field1231 - 77, true, 0, 77);
            String var6;
            if (field1369 != null && field1369.field460 != null) {
                var6 = field1369.field460;
            } else {
                var6 = JString.method304(943, this.field1319);
            }
            var3.method206(var6 + ":", 4, 0, 25737, 90);
            var3.method206(this.field1349 + "*", 6 + var3.method204((byte) 4, var6 + ": "), 255, 25737, 90);
            Pix2D.method160(77, 5, 0, 0, 479);
        }
        if (this.field1593 && this.field1531 == 2) {
            this.method557(true);
        }
        this.field1273.method259(super.field16, 17, 357, true);
        this.field1272.method258(this.field1310);
        Pix3D.field645 = this.field1617;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;I)V")
    private final void method449(LocSpawned arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field736 == 0) {
            var3 = this.field1614.method76(arg0.field735, arg0.field737, arg0.field738);
        }
        if (arg0.field736 == 1) {
            var3 = this.field1614.method77(9, arg0.field735, arg0.field738, arg0.field737);
        }
        if (arg0.field736 == 2) {
            var3 = this.field1614.method78(arg0.field735, arg0.field737, arg0.field738);
        }
        if (arg0.field736 == 3) {
            var3 = this.field1614.method79(arg0.field735, arg0.field737, arg0.field738);
        }
        if (var3 != 0) {
            int var7 = this.field1614.method80(arg0.field735, arg0.field737, arg0.field738, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field739 = var4;
        arg0.field741 = var5;
        if (arg1 < 0) {
            arg0.field740 = var6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLlb;)V")
    private final void method450(int arg0, byte arg1, Packet arg2) {
        this.field1326 = 0;
        this.field1478 = 0;
        this.method521(arg0, arg2, (byte) -87);
        if (arg1 != 5) {
            this.field1396 = this.field1408.method295();
        }
        this.method494(arg0, (byte) 115, arg2);
        this.method434(arg2, 37046, arg0);
        for (int var4 = 0; var4 < this.field1326; ++var4) {
            int var6 = this.field1327[var4];
            if (field1401 != this.field1683[var6].field444) {
                this.field1683[var6].field457 = null;
                this.field1683[var6] = null;
            }
        }
        if (arg2.field717 != arg0) {
            signlink.reporterror(this.field1319 + " size mismatch in getnpcpos - pos:" + arg2.field717 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1684; ++var5) {
                if (this.field1683[this.field1685[var5]] == null) {
                    signlink.reporterror(this.field1319 + " null entry in npc list - pos:" + var5 + " size:" + this.field1684);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)V")
    public final void method451(Component arg0, int arg1) {
        this.field1543 += arg1;
        int var3 = arg0.field80;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1632;
                if (this.field1633 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field112 = "";
                    arg0.field79 = 0;
                } else {
                    if (this.field1357[var3] == 0) {
                        arg0.field112 = "@red@Offline";
                    } else if (this.field1357[var3] == field1509) {
                        arg0.field112 = "@gre@World-" + (this.field1357[var3] - 9);
                    } else {
                        arg0.field112 = "@yel@World-" + (this.field1357[var3] - 9);
                    }
                    arg0.field79 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1632;
                if (this.field1633 != 2) {
                    var6 = 0;
                }
                arg0.field90 = var6 * 15 + 20;
                if (arg0.field90 <= arg0.field82) {
                    arg0.field90 = arg0.field82 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1633 == 0) {
                    arg0.field112 = "Loading ignore list";
                    arg0.field79 = 0;
                } else if (var3 == 1 && this.field1633 == 0) {
                    arg0.field112 = "Please wait...";
                    arg0.field79 = 0;
                } else {
                    int var7 = this.field1359;
                    if (this.field1633 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field112 = "";
                        arg0.field79 = 0;
                    } else {
                        arg0.field112 = JString.method304(943, JString.method301(0, this.field1595[var3]));
                        arg0.field79 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field90 = this.field1359 * 15 + 20;
                if (arg0.field90 <= arg0.field82) {
                    arg0.field90 = arg0.field82 + 1;
                }
            } else if (var3 == 327) {
                arg0.field127 = 150;
                arg0.field128 = (int) (Math.sin((double) field1401 / 40.0D) * 256.0D) & 2047;
                if (this.field1404) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field1634[var8];
                        if (var15 >= 0 && !IdkType.field1129[var15].method377((byte) -41)) {
                            return;
                        }
                    }
                    this.field1404 = false;
                    Model[] var9 = new Model[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field1634[var11];
                        if (var14 >= 0) {
                            var9[var10++] = IdkType.field1129[var14].method378(-514);
                        }
                    }
                    Model var12 = new Model(var10, -314, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field1550[var13] != 0) {
                            var12.method140(field1341[var13][0], field1341[var13][this.field1550[var13]]);
                            if (var13 == 1) {
                                var12.method140(field1426[0], field1426[this.field1550[var13]]);
                            }
                        }
                    }
                    var12.method133(true);
                    var12.method134(true, SeqType.field1149[field1369.field404].field1151[0]);
                    var12.method143(64, 850, -30, -50, -30, true);
                    arg0.field120 = 5;
                    arg0.field121 = 0;
                    Component.method36(0, (byte) -94, 5, var12);
                }
            } else if (var3 == 324) {
                if (this.field1559 == null) {
                    this.field1559 = arg0.field118;
                    this.field1560 = arg0.field119;
                }
                if (this.field1562) {
                    arg0.field118 = this.field1560;
                } else {
                    arg0.field118 = this.field1559;
                }
            } else if (var3 == 325) {
                if (this.field1559 == null) {
                    this.field1559 = arg0.field118;
                    this.field1560 = arg0.field119;
                }
                if (this.field1562) {
                    arg0.field118 = this.field1559;
                } else {
                    arg0.field118 = this.field1560;
                }
            } else if (var3 == 600) {
                arg0.field112 = this.field1452;
                if (field1401 % 20 < 10) {
                    arg0.field112 = arg0.field112 + "|";
                } else {
                    arg0.field112 = arg0.field112 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1332 >= 1) {
                        if (this.field1645) {
                            arg0.field114 = 16711680;
                            arg0.field112 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field114 = 16777215;
                            arg0.field112 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field112 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1638 != 0) {
                        String var16;
                        if (this.field1367 == 0) {
                            var16 = "earlier today";
                        } else if (this.field1367 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field1367 + " days ago";
                        }
                        arg0.field112 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg0.field112 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1375 == 0) {
                        arg0.field112 = "0 unread messages";
                        arg0.field114 = 16776960;
                    }
                    if (this.field1375 == 1) {
                        arg0.field112 = "1 unread message";
                        arg0.field114 = 65280;
                    }
                    if (this.field1375 > 1) {
                        arg0.field112 = this.field1375 + " unread messages";
                        arg0.field114 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1586 == 201) {
                        if (this.field1252 == 1) {
                            arg0.field112 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field112 = "";
                        }
                    } else if (this.field1586 == 200) {
                        arg0.field112 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field1586 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field1586 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field1586 + " days ago";
                        }
                        arg0.field112 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1586 == 201) {
                        if (this.field1252 == 1) {
                            arg0.field112 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field112 = "";
                        }
                    } else if (this.field1586 == 200) {
                        arg0.field112 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field112 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1586 == 201) {
                        if (this.field1252 == 1) {
                            arg0.field112 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field112 = "";
                        }
                    } else if (this.field1586 == 200) {
                        arg0.field112 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field112 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1633 == 0) {
            arg0.field112 = "Loading friend list";
            arg0.field79 = 0;
        } else if (var3 == 1 && this.field1633 == 1) {
            arg0.field112 = "Connecting to friendserver";
            arg0.field79 = 0;
        } else if (var3 == 2 && this.field1633 != 2) {
            arg0.field112 = "Please wait...";
            arg0.field79 = 0;
        } else {
            int var4 = this.field1632;
            if (this.field1633 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field112 = "";
                arg0.field79 = 0;
            } else {
                arg0.field112 = this.field1627[var3];
                arg0.field79 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;II)V")
    public final void method452(int arg0, Pix32 arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            this.field1544 = -1;
        }
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1660 + this.field1588 & 2047;
            int var7 = Model.field603[var6];
            int var8 = Model.field604[var6];
            int var9 = var7 * 256 / (this.field1352 + 256);
            int var10 = var8 * 256 / (this.field1352 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1311.method191(15, 15, 20, 83 - var16 - 20, var15 + 94 + 4 - 10, var13, 256, (byte) 114, 20);
        } else {
            this.method469(false, arg1, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1657 && !this.field1678 && !this.field1253) {
            ++field1401;
            if (!this.field1398) {
                this.method439(5);
            } else {
                this.method486(false);
            }
            this.method547(-424);
            if (arg0 != 7) {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method453(boolean arg0) {
        this.field1596 = 0;
        if (!arg0) {
            this.field1612 = !this.field1612;
        }
        for (int var2 = -1; var2 < this.field1684 + this.field1476; ++var2) {
            PathingEntity var19;
            if (var2 == -1) {
                var19 = field1369;
            } else if (var2 < this.field1476) {
                var19 = this.field1475[this.field1477[var2]];
            } else {
                var19 = this.field1683[this.field1685[var2 - this.field1476]];
            }
            if (var19 != null && var19.method113((byte) -84)) {
                if (var19 instanceof NpcEntity) {
                    NpcType var20 = ((NpcEntity) var19).field457;
                    if (var20.field1043 != null) {
                        var20 = var20.method345(559);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field1476) {
                    NpcType var24 = ((NpcEntity) var19).field457;
                    if (var24.field1041 >= 0 && var24.field1041 < this.field1629.length) {
                        this.method478(-34963, var19, var19.field445 + 15);
                        if (this.field1583 > -1) {
                            this.field1629[var24.field1041].method186(this.field1583 - 12, this.field1584 - 30, 37651);
                        }
                    }
                    if (this.field1656 == 1 && this.field1685[var2 - this.field1476] == this.field1274 && field1401 % 20 < 10) {
                        this.method478(-34963, var19, var19.field445 + 15);
                        if (this.field1583 > -1) {
                            this.field1629[2].method186(this.field1583 - 12, this.field1584 - 28, 37651);
                        }
                    }
                } else {
                    int var21 = 30;
                    PlayerEntity var22 = (PlayerEntity) var19;
                    if (var22.field463 != 0) {
                        this.method478(-34963, var19, var19.field445 + 15);
                        if (this.field1583 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field463 & 1 << var23) != 0) {
                                    this.field1629[var23].method186(this.field1583 - 12, this.field1584 - var21, 37651);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1656 == 10 && this.field1477[var2] == this.field1314) {
                        this.method478(-34963, var19, var19.field445 + 15);
                        if (this.field1583 > -1) {
                            this.field1629[7].method186(this.field1583 - 12, this.field1584 - var21, 37651);
                        }
                    }
                }
                if (var19.field411 != null && (var2 >= this.field1476 || this.field1239 == 0 || this.field1239 == 3 || this.field1239 == 1 && this.method435(((PlayerEntity) var19).field460, 458))) {
                    this.method478(-34963, var19, var19.field445);
                    if (this.field1583 > -1 && this.field1596 < this.field1597) {
                        this.field1601[this.field1596] = this.field1675.method205(var19.field411, -17283) / 2;
                        this.field1600[this.field1596] = this.field1675.field702;
                        this.field1598[this.field1596] = this.field1583;
                        this.field1599[this.field1596] = this.field1584;
                        this.field1602[this.field1596] = var19.field413;
                        this.field1603[this.field1596] = var19.field414;
                        this.field1604[this.field1596] = var19.field412;
                        this.field1605[this.field1596++] = var19.field411;
                        if (this.field1438 == 0 && var19.field414 >= 1 && var19.field414 <= 3) {
                            this.field1600[this.field1596] += 10;
                            this.field1599[this.field1596] += 5;
                        }
                        if (this.field1438 == 0 && var19.field414 == 4) {
                            this.field1601[this.field1596] = 60;
                        }
                        if (this.field1438 == 0 && var19.field414 == 5) {
                            this.field1600[this.field1596] += 5;
                        }
                    }
                }
                if (var19.field418 > field1401) {
                    this.method478(-34963, var19, var19.field445 + 15);
                    if (this.field1583 > -1) {
                        int var25 = var19.field419 * 30 / var19.field420;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        Pix2D.method157(this.field1584 - 3, 5, 65280, false, var25, this.field1583 - 15);
                        Pix2D.method157(this.field1584 - 3, 5, 16711680, false, 30 - var25, this.field1583 - 15 + var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field417[var26] > field1401) {
                        this.method478(-34963, var19, var19.field445 / 2);
                        if (this.field1583 > -1) {
                            if (var26 == 1) {
                                this.field1584 -= 20;
                            }
                            if (var26 == 2) {
                                this.field1583 -= 15;
                                this.field1584 -= 10;
                            }
                            if (var26 == 3) {
                                this.field1583 += 15;
                                this.field1584 -= 10;
                            }
                            this.field1379[var19.field416[var26]].method186(this.field1583 - 12, this.field1584 - 12, 37651);
                            this.field1673.method202(String.valueOf(var19.field415[var26]), this.field1584 + 4, 0, this.field1583, this.field1356);
                            this.field1673.method202(String.valueOf(var19.field415[var26]), this.field1584 + 3, 16777215, this.field1583 - 1, this.field1356);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1596; ++var3) {
            int var4 = this.field1598[var3];
            int var5 = this.field1599[var3];
            int var6 = this.field1601[var3];
            int var7 = this.field1600[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field1599[var18] - this.field1600[var18] && var5 - var7 < this.field1599[var18] + 2 && var4 - var6 < this.field1601[var18] + this.field1598[var18] && var4 + var6 > this.field1598[var18] - this.field1601[var18] && this.field1599[var18] - this.field1600[var18] < var5) {
                        var5 = this.field1599[var18] - this.field1600[var18];
                        var8 = true;
                    }
                }
            }
            this.field1583 = this.field1598[var3];
            this.field1584 = this.field1599[var3] = var5;
            String var9 = this.field1605[var3];
            if (this.field1438 == 0) {
                int var10 = 16776960;
                if (this.field1602[var3] < 6) {
                    var10 = this.field1308[this.field1602[var3]];
                }
                if (this.field1602[var3] == 6) {
                    var10 = this.field1449 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1602[var3] == 7) {
                    var10 = this.field1449 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1602[var3] == 8) {
                    var10 = this.field1449 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1602[var3] == 9) {
                    int var11 = 150 - this.field1604[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1602[var3] == 10) {
                    int var12 = 150 - this.field1604[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1602[var3] == 11) {
                    int var13 = 150 - this.field1604[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1603[var3] == 0) {
                    this.field1675.method202(var9, this.field1584 + 1, 0, this.field1583, this.field1356);
                    this.field1675.method202(var9, this.field1584, var10, this.field1583, this.field1356);
                }
                if (this.field1603[var3] == 1) {
                    this.field1675.method207(this.field1449, 0, this.field1584 + 1, this.field1583, true, var9);
                    this.field1675.method207(this.field1449, var10, this.field1584, this.field1583, true, var9);
                }
                if (this.field1603[var3] == 2) {
                    this.field1675.method208(0, 0, this.field1449, var9, this.field1584 + 1, this.field1583);
                    this.field1675.method208(var10, 0, this.field1449, var9, this.field1584, this.field1583);
                }
                if (this.field1603[var3] == 3) {
                    this.field1675.method209(var9, 150 - this.field1604[var3], 0, this.field1584 + 1, this.field1449, this.field1583, (byte) 30);
                    this.field1675.method209(var9, 150 - this.field1604[var3], var10, this.field1584, this.field1449, this.field1583, (byte) 30);
                }
                if (this.field1603[var3] == 4) {
                    int var14 = this.field1675.method205(var9, -17283);
                    int var15 = (150 - this.field1604[var3]) * (var14 + 100) / 150;
                    Pix2D.method154(this.field1583 - 50, this.field1583 + 50, 0, (byte) 2, 334);
                    this.field1675.method206(var9, this.field1583 + 50 - var15, 0, 25737, this.field1584 + 1);
                    this.field1675.method206(var9, this.field1583 + 50 - var15, var10, 25737, this.field1584);
                    Pix2D.method153(true);
                }
                if (this.field1603[var3] == 5) {
                    int var16 = 150 - this.field1604[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    Pix2D.method154(0, 512, this.field1584 - this.field1675.field702 - 1, (byte) 2, this.field1584 + 5);
                    this.field1675.method202(var9, this.field1584 + 1 + var17, 0, this.field1583, this.field1356);
                    this.field1675.method202(var9, this.field1584 + var17, var10, this.field1583, this.field1356);
                    Pix2D.method153(true);
                }
            } else {
                this.field1675.method202(var9, this.field1584 + 1, 0, this.field1583, this.field1356);
                this.field1675.method202(var9, this.field1584, 16776960, this.field1583, this.field1356);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILab;IZ)V")
    public final void method454(int arg0, int arg1, PlayerEntity arg2, int arg3, boolean arg4) {
        this.field1398 &= arg4;
        if (field1369 != arg2) {
            if (this.field1459 < 400) {
                String var6;
                if (arg2.field467 == 0) {
                    var6 = arg2.field460 + method553(0, arg2.field466, field1369.field466) + " (level-" + arg2.field466 + ")";
                } else {
                    var6 = arg2.field460 + " (skill-" + arg2.field467 + ")";
                }
                if (this.field1258 == 1) {
                    this.field1514[this.field1459] = "Use " + this.field1262 + " with @whi@" + var6;
                    this.field1281[this.field1459] = 275;
                    this.field1282[this.field1459] = arg3;
                    this.field1279[this.field1459] = arg0;
                    this.field1280[this.field1459] = arg1;
                    ++this.field1459;
                } else if (this.field1687 == 1) {
                    if ((this.field1689 & 8) == 8) {
                        this.field1514[this.field1459] = this.field1690 + " @whi@" + var6;
                        this.field1281[this.field1459] = 131;
                        this.field1282[this.field1459] = arg3;
                        this.field1279[this.field1459] = arg0;
                        this.field1280[this.field1459] = arg1;
                        ++this.field1459;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1328[var7] != null) {
                            this.field1514[this.field1459] = this.field1328[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1328[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field466 > field1369.field466) {
                                    var9 = 2000;
                                }
                                if (field1369.field483 != 0 && arg2.field483 != 0) {
                                    if (field1369.field483 == arg2.field483) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1329[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1281[this.field1459] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1281[this.field1459] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1281[this.field1459] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1281[this.field1459] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1281[this.field1459] = var9 + 185;
                            }
                            this.field1282[this.field1459] = arg3;
                            this.field1279[this.field1459] = arg0;
                            this.field1280[this.field1459] = arg1;
                            ++this.field1459;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1459; ++var8) {
                    if (this.field1281[var8] == 718) {
                        this.field1514[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method455(byte arg0) {
        this.field1270.method258(this.field1310);
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1613.method219(128);
        }
        Pix3D.field645 = this.field1616;
        this.field1315.method199(0, 0, 37651);
        if (this.field1555 != -1) {
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1555]);
        } else if (this.field1490[this.field1482] != -1) {
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1490[this.field1482]]);
        }
        if (this.field1593 && this.field1531 == 1) {
            this.method557(true);
        }
        this.field1270.method259(super.field16, 553, 205, true);
        this.field1272.method258(this.field1310);
        Pix3D.field645 = this.field1617;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method456(int arg0) {
        this.field1271.method258(this.field1310);
        if (this.field1493 == 2) {
            byte[] var2 = this.field1316.field679;
            int[] var3 = Pix2D.field621;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1410.method190(0, 33, 25, 33, this.field1588, this.field1691, (byte) 8, this.field1561, 256, 0, 25);
            this.field1272.method258(this.field1310);
        } else {
            int var6 = this.field1660 + this.field1588 & 2047;
            int var7 = field1369.field399 / 32 + 48;
            int var8 = 464 - field1369.field400 / 32;
            this.field1362.method190(5, 151, var7, 146, var6, this.field1257, (byte) 8, this.field1460, this.field1352 + 256, 25, var8);
            this.field1410.method190(0, 33, 25, 33, this.field1588, this.field1691, (byte) 8, this.field1561, 256, 0, 25);
            for (int var9 = 0; var9 < this.field1484; ++var9) {
                int var38 = this.field1485[var9] * 4 + 2 - field1369.field399 / 32;
                int var39 = this.field1486[var9] * 4 + 2 - field1369.field400 / 32;
                this.method469(false, this.field1435[var9], var38, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var34 = 0; var34 < 104; ++var34) {
                    LinkList var35 = this.field1290[this.field1295][var10][var34];
                    if (var35 != null) {
                        int var36 = var10 * 4 + 2 - field1369.field399 / 32;
                        int var37 = var34 * 4 + 2 - field1369.field400 / 32;
                        this.method469(false, this.field1303, var36, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field1684; ++var11) {
                NpcEntity var30 = this.field1683[this.field1685[var11]];
                if (var30 != null && var30.method113((byte) -84)) {
                    NpcType var31 = var30.field457;
                    if (var31.field1043 != null) {
                        var31 = var31.method345(559);
                    }
                    if (var31 != null && var31.field1034) {
                        int var32 = var30.field399 / 32 - field1369.field399 / 32;
                        int var33 = var30.field400 / 32 - field1369.field400 / 32;
                        this.method469(false, this.field1304, var32, var33);
                    }
                }
            }
            if (arg0 != 8) {
                this.field1290 = null;
            }
            for (int var12 = 0; var12 < this.field1476; ++var12) {
                PlayerEntity var23 = this.field1475[this.field1477[var12]];
                if (var23 != null && var23.method113((byte) -84)) {
                    int var24 = var23.field399 / 32 - field1369.field399 / 32;
                    int var25 = var23.field400 / 32 - field1369.field400 / 32;
                    boolean var26 = false;
                    long var27 = JString.method300(var23.field460);
                    for (int var29 = 0; var29 < this.field1632; ++var29) {
                        if (this.field1436[var29] == var27 && this.field1357[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    if (field1369.field483 != 0 && var23.field483 != 0) {
                        if (field1369.field483 == var23.field483) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (var26) {
                        this.method469(false, this.field1306, var24, var25);
                    } else {
                        this.method469(false, this.field1305, var24, var25);
                    }
                }
            }
            if (this.field1656 != 0 && field1401 % 20 < 10) {
                if (this.field1656 == 1 && this.field1274 >= 0 && this.field1274 < this.field1683.length) {
                    NpcEntity var13 = this.field1683[this.field1274];
                    if (var13 != null) {
                        int var14 = var13.field399 / 32 - field1369.field399 / 32;
                        int var15 = var13.field400 / 32 - field1369.field400 / 32;
                        this.method452(var15, this.field1541, 873, var14);
                    }
                }
                if (this.field1656 == 2) {
                    int var16 = (this.field1283 - this.field1461) * 4 + 2 - field1369.field399 / 32;
                    int var17 = (this.field1284 - this.field1462) * 4 + 2 - field1369.field400 / 32;
                    this.method452(var17, this.field1541, 873, var16);
                }
                if (this.field1656 == 10 && this.field1314 >= 0 && this.field1314 < this.field1475.length) {
                    PlayerEntity var18 = this.field1475[this.field1314];
                    if (var18 != null) {
                        int var19 = var18.field399 / 32 - field1369.field399 / 32;
                        int var20 = var18.field400 / 32 - field1369.field400 / 32;
                        this.method452(var20, this.field1541, 873, var19);
                    }
                }
            }
            if (this.field1360 != 0) {
                int var21 = this.field1360 * 4 + 2 - field1369.field399 / 32;
                int var22 = this.field1361 * 4 + 2 - field1369.field400 / 32;
                this.method469(false, this.field1540, var21, var22);
            }
            Pix2D.method157(78, 3, 16777215, false, 3, 97);
            this.field1272.method258(this.field1310);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method457(int arg0) {
        if (arg0 != 19748) {
            this.field1544 = -1;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1607.method248(); var2 != null; var2 = (SpotAnimEntity) this.field1607.method250(0)) {
            if (this.field1295 == var2.field610 && !var2.field616) {
                if (field1401 >= var2.field609) {
                    var2.method151(this.field1228, this.field1487);
                    if (var2.field616) {
                        var2.method106();
                    } else {
                        this.field1614.method61(var2, var2.field611, var2.field610, var2.field613, 60, var2.field612, 0, (byte) 54, false, -1);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public static final void method458(boolean arg0) {
        if (!arg0) {
            field1266 = !field1266;
        }
        World3D.field283 = true;
        Pix3D.field634 = true;
        field1512 = true;
        World.field43 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;B)V")
    private final void method459(int arg0, Packet arg1, byte arg2) {
        int var4 = arg1.method240(477, 8);
        if (arg2 == -124) {
            if (var4 < this.field1476) {
                for (int var5 = var4; var5 < this.field1476; ++var5) {
                    this.field1327[this.field1326++] = this.field1477[var5];
                }
            }
            if (var4 > this.field1476) {
                signlink.reporterror(this.field1319 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field1476 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1477[var6];
                    PlayerEntity var8 = this.field1475[var7];
                    int var9 = arg1.method240(477, 1);
                    if (var9 == 0) {
                        this.field1477[this.field1476++] = var7;
                        var8.field444 = field1401;
                    } else {
                        int var10 = arg1.method240(477, 2);
                        if (var10 == 0) {
                            this.field1477[this.field1476++] = var7;
                            var8.field444 = field1401;
                            this.field1479[this.field1478++] = var7;
                        } else if (var10 == 1) {
                            this.field1477[this.field1476++] = var7;
                            var8.field444 = field1401;
                            int var11 = arg1.method240(477, 3);
                            var8.method111(false, 490, var11);
                            int var12 = arg1.method240(477, 1);
                            if (var12 == 1) {
                                this.field1479[this.field1478++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1477[this.field1476++] = var7;
                            var8.field444 = field1401;
                            int var13 = arg1.method240(477, 3);
                            var8.method111(true, 490, var13);
                            int var14 = arg1.method240(477, 3);
                            var8.method111(true, 490, var14);
                            int var15 = arg1.method240(477, 1);
                            if (var15 == 1) {
                                this.field1479[this.field1478++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1327[this.field1326++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;I)Z")
    public final boolean method460(Component arg0, int arg1) {
        if (arg1 <= 0) {
            this.method6();
        }
        int var3 = arg0.field80;
        if (this.field1633 == 2) {
            if (var3 == 201) {
                this.field1420 = true;
                this.field1233 = false;
                this.field1639 = true;
                this.field1247 = "";
                this.field1389 = 1;
                this.field1542 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1420 = true;
                this.field1233 = false;
                this.field1639 = true;
                this.field1247 = "";
                this.field1389 = 2;
                this.field1542 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1547 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1420 = true;
                this.field1233 = false;
                this.field1639 = true;
                this.field1247 = "";
                this.field1389 = 4;
                this.field1542 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1420 = true;
                this.field1233 = false;
                this.field1639 = true;
                this.field1247 = "";
                this.field1389 = 5;
                this.field1542 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1634[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1128 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1128) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1129[var6].field1135 && IdkType.field1129[var6].field1130 == var4 + (this.field1562 ? 0 : 7)) {
                            this.field1634[var4] = var6;
                            this.field1404 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1550[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1341[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1341[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1550[var7] = var9;
                this.field1404 = true;
            }
            if (var3 == 324 && !this.field1562) {
                this.field1562 = true;
                this.method471(0);
            }
            if (var3 == 325 && this.field1562) {
                this.field1562 = false;
                this.method471(0);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1645 = !this.field1645;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method475(true);
                    if (this.field1452.length() > 0) {
                        this.field1613.method218(true, 85);
                        this.field1613.method225(-13398, JString.method300(this.field1452));
                        this.field1613.method219(var3 - 601);
                        this.field1613.method219(this.field1645 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1613.method218(true, 145);
                this.field1613.method219(this.field1562 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1613.method219(this.field1634[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1613.method219(this.field1550[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method461(byte arg0, int arg1) {
        if (arg0 == 1) {
            boolean var3 = false;
        } else {
            this.field1487 = !this.field1487;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method462(boolean arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (!arg0) {
            this.field1544 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public void method463(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1366);
        if (this.field1528 != null) {
            System.out.println("Od-cycle:" + this.field1528.field860);
        }
        System.out.println("loop-cycle:" + field1401);
        System.out.println("draw-cycle:" + field1368);
        System.out.println("ptype:" + this.field1544);
        if (!arg0) {
            System.out.println("psize:" + this.field1543);
            if (this.field1248 != null) {
                this.field1248.method43(false);
            }
            super.field13 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (this.field1455 != arg0) {
            this.field1613.method219(3);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field19 != null ? super.field19 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLlb;I)V")
    public final void method464(boolean arg0, Packet arg1, int arg2) {
        this.field1398 &= arg0;
        if (arg2 != 136 && arg2 != 211) {
            if (arg2 == 2) {
                int var4 = arg1.method229();
                int var5 = (var4 >> 4 & 7) + this.field1491;
                int var6 = (var4 & 7) + this.field1492;
                int var7 = arg1.method229();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1522[var8];
                int var11 = arg1.method231();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1348[this.field1295][var5][var6];
                    int var13 = this.field1348[this.field1295][var5 + 1][var6];
                    int var14 = this.field1348[this.field1295][var5 + 1][var6 + 1];
                    int var15 = this.field1348[this.field1295][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1614.method72(this.field1295, 634, var5, var6);
                        if (var16 != null) {
                            int var17 = var16.field274 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field272 = new LocEntity(var15, false, 2, 0, var12, var13, var14, var9 + 4, var17, var11);
                                var16.field273 = new LocEntity(var15, false, 2, 0, var12, var13, var14, var9 + 1 & 3, var17, var11);
                            } else {
                                var16.field272 = new LocEntity(var15, false, var8, 0, var12, var13, var14, var9, var17, var11);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1614.method73(-38749, var5, this.field1295, var6);
                        if (var18 != null) {
                            var18.field165 = new LocEntity(var15, false, 4, 0, var12, var13, var14, 0, var18.field166 >> 14 & 32767, var11);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1614.method74(var6, this.field1295, -709, var5);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field257 = new LocEntity(var15, false, var8, 0, var12, var13, var14, var9, var19.field265 >> 14 & 32767, var11);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1614.method75(this.field1295, 3, var6, var5);
                        if (var20 != null) {
                            var20.field196 = new LocEntity(var15, false, 22, 0, var12, var13, var14, var9, var20.field197 >> 14 & 32767, var11);
                        }
                    }
                }
            } else if (arg2 == 147) {
                int var21 = arg1.method229();
                int var22 = (var21 >> 4 & 7) + this.field1491;
                int var23 = (var21 & 7) + this.field1492;
                int var24 = arg1.method231();
                int var25 = arg1.method231();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field501 = var24;
                    var26.field502 = var25;
                    if (this.field1290[this.field1295][var22][var23] == null) {
                        this.field1290[this.field1295][var22][var23] = new LinkList(6);
                    }
                    this.field1290[this.field1295][var22][var23].method245(var26);
                    this.method508(var22, var23);
                }
            } else if (arg2 == 53) {
                int var27 = arg1.method229();
                int var28 = (var27 >> 4 & 7) + this.field1491;
                int var29 = (var27 & 7) + this.field1492;
                int var30 = arg1.method231();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1290[this.field1295][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250(0)) {
                            if ((var30 & 32767) == var32.field501) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method248() == null) {
                            this.field1290[this.field1295][var28][var29] = null;
                        }
                        this.method508(var28, var29);
                    }
                }
            } else if (arg2 == 30) {
                int var33 = arg1.method229();
                int var34 = (var33 >> 4 & 7) + this.field1491;
                int var35 = (var33 & 7) + this.field1492;
                int var36 = var34 + arg1.method230();
                int var37 = var35 + arg1.method230();
                int var38 = arg1.method232();
                int var39 = arg1.method231();
                int var40 = arg1.method229() * 4;
                int var41 = arg1.method229() * 4;
                int var42 = arg1.method231();
                int var43 = arg1.method231();
                int var44 = arg1.method229();
                int var45 = arg1.method229();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var39 != 65535) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(this.field1646, this.method555(var46, this.field1295, -576, var47) - var40, var47, var39, field1401 + var43, var38, var44, var45, var46, var41, this.field1295, field1401 + var42);
                    var50.method120(var49, field1401 + var42, false, this.method555(var48, this.field1295, -576, var49) - var41, var48);
                    this.field1336.method245(var50);
                }
            } else if (arg2 == 193) {
                int var51 = arg1.method229();
                int var52 = (var51 >> 4 & 7) + this.field1491;
                int var53 = (var51 & 7) + this.field1492;
                int var54 = arg1.method231();
                int var55 = arg1.method229();
                int var56 = arg1.method231();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(var58, var56, this.field1295, var54, true, this.method555(var57, this.field1295, -576, var58) - var55, var57, field1401);
                    this.field1607.method245(var59);
                }
            } else if (arg2 == 137) {
                int var60 = arg1.method229();
                int var61 = (var60 >> 4 & 7) + this.field1491;
                int var62 = (var60 & 7) + this.field1492;
                int var63 = arg1.method231();
                int var64 = arg1.method231();
                int var65 = arg1.method231();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1237 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field501 = var63;
                    var66.field502 = var64;
                    if (this.field1290[this.field1295][var61][var62] == null) {
                        this.field1290[this.field1295][var61][var62] = new LinkList(6);
                    }
                    this.field1290[this.field1295][var61][var62].method245(var66);
                    this.method508(var61, var62);
                }
            } else {
                if (arg2 == 191) {
                    int var67 = arg1.method229();
                    int var68 = (var67 >> 4 & 7) + this.field1491;
                    int var69 = (var67 & 7) + this.field1492;
                    int var70 = arg1.method229();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1522[var71];
                    int var74 = arg1.method231();
                    int var75 = arg1.method231();
                    int var76 = arg1.method231();
                    int var77 = arg1.method231();
                    byte var78 = arg1.method230();
                    byte var79 = arg1.method230();
                    byte var80 = arg1.method230();
                    byte var81 = arg1.method230();
                    PlayerEntity var82;
                    if (this.field1237 == var77) {
                        var82 = field1369;
                    } else {
                        var82 = this.field1475[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method330(var74);
                        int var84 = this.field1348[this.field1295][var68][var69];
                        int var85 = this.field1348[this.field1295][var68 + 1][var69];
                        int var86 = this.field1348[this.field1295][var68 + 1][var69 + 1];
                        int var87 = this.field1348[this.field1295][var68][var69 + 1];
                        Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method539(0, this.field1295, 608, var76 + 1, var69, var75 + 1, 0, var68, -1, var73);
                            var82.field470 = field1401 + var75;
                            var82.field471 = field1401 + var76;
                            var82.field475 = var88;
                            int var89 = var83.field972;
                            int var90 = var83.field973;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field973;
                                var90 = var83.field972;
                            }
                            var82.field472 = var68 * 128 + var89 * 64;
                            var82.field474 = var69 * 128 + var90 * 64;
                            var82.field473 = this.method555(var82.field472, this.field1295, -576, var82.field474);
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
                if (arg2 != 253) {
                    if (arg2 == 222) {
                        int var101 = arg1.method229();
                        int var102 = (var101 >> 4 & 7) + this.field1491;
                        int var103 = (var101 & 7) + this.field1492;
                        int var104 = arg1.method231();
                        int var105 = arg1.method229();
                        int var106 = var105 >> 4 & 15;
                        int var107 = var105 & 7;
                        if (field1369.field449[0] >= var102 - var106 && field1369.field449[0] <= var102 + var106 && field1369.field450[0] >= var103 - var106 && field1369.field450[0] <= var103 + var106 && this.field1592 && !field1512 && this.field1454 < 50) {
                            this.field1321[this.field1454] = var104;
                            this.field1626[this.field1454] = var107;
                            this.field1269[this.field1454] = Wave.field922[var104];
                            ++this.field1454;
                            return;
                        }
                    }
                } else {
                    int var93 = arg1.method229();
                    int var94 = (var93 >> 4 & 7) + this.field1491;
                    int var95 = (var93 & 7) + this.field1492;
                    int var96 = arg1.method231();
                    int var97 = arg1.method231();
                    int var98 = arg1.method231();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1290[this.field1295][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250(0)) {
                                if ((var96 & 32767) == var100.field501 && var100.field502 == var97) {
                                    var100.field502 = var98;
                                    break;
                                }
                            }
                            this.method508(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var108 = arg1.method229();
            int var109 = (var108 >> 4 & 7) + this.field1491;
            int var110 = (var108 & 7) + this.field1492;
            int var111 = arg1.method229();
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = this.field1522[var112];
            int var115;
            if (arg2 == 211) {
                var115 = -1;
            } else {
                var115 = arg1.method231();
            }
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                this.method539(var112, this.field1295, 608, -1, var110, 0, var113, var109, var115, var114);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method465(boolean arg0) {
        if (this.field1258 == 0 && this.field1687 == 0) {
            this.field1514[this.field1459] = "Walk here";
            this.field1281[this.field1459] = 718;
            this.field1279[this.field1459] = super.field24;
            this.field1280[this.field1459] = super.field25;
            ++this.field1459;
        }
        int var2 = -1;
        if (!arg0) {
            this.field1613.method219(5);
        }
        for (int var3 = 0; var3 < Model.field601; ++var3) {
            int var4 = Model.field602[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1614.method80(this.field1295, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method330(var8);
                    if (var9.field999 != null) {
                        var9 = var9.method338(this.field1618);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field1258 == 1) {
                        this.field1514[this.field1459] = "Use " + this.field1262 + " with @cya@" + var9.field968;
                        this.field1281[this.field1459] = 810;
                        this.field1282[this.field1459] = var4;
                        this.field1279[this.field1459] = var5;
                        this.field1280[this.field1459] = var6;
                        ++this.field1459;
                    } else if (this.field1687 == 1) {
                        if ((this.field1689 & 4) == 4) {
                            this.field1514[this.field1459] = this.field1690 + " @cya@" + var9.field968;
                            this.field1281[this.field1459] = 899;
                            this.field1282[this.field1459] = var4;
                            this.field1279[this.field1459] = var5;
                            this.field1280[this.field1459] = var6;
                            ++this.field1459;
                        }
                    } else {
                        if (var9.field984 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field984[var10] != null) {
                                    this.field1514[this.field1459] = var9.field984[var10] + " @cya@" + var9.field968;
                                    if (var10 == 0) {
                                        this.field1281[this.field1459] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1281[this.field1459] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1281[this.field1459] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1281[this.field1459] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1281[this.field1459] = 1071;
                                    }
                                    this.field1282[this.field1459] = var4;
                                    this.field1279[this.field1459] = var5;
                                    this.field1280[this.field1459] = var6;
                                    ++this.field1459;
                                }
                            }
                        }
                        this.field1514[this.field1459] = "Examine @cya@" + var9.field968;
                        this.field1281[this.field1459] = 1381;
                        this.field1282[this.field1459] = var9.field965 << 14;
                        this.field1279[this.field1459] = var5;
                        this.field1280[this.field1459] = var6;
                        ++this.field1459;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1683[var8];
                    if (var11.field457.field1020 == 1 && (var11.field399 & 127) == 64 && (var11.field400 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1684; ++var12) {
                            NpcEntity var15 = this.field1683[this.field1685[var12]];
                            if (var15 != null && var11 != var15 && var15.field457.field1020 == 1 && var11.field399 == var15.field399 && var11.field400 == var15.field400) {
                                this.method431(var5, var15.field457, this.field1685[var12], 22080, var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1476; ++var13) {
                            PlayerEntity var14 = this.field1475[this.field1477[var13]];
                            if (var14 != null && var11.field399 == var14.field399 && var11.field400 == var14.field400) {
                                this.method454(var5, var6, var14, this.field1477[var13], true);
                            }
                        }
                    }
                    this.method431(var5, var11.field457, var8, 22080, var6);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1475[var8];
                    if ((var16.field399 & 127) == 64 && (var16.field400 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1684; ++var17) {
                            NpcEntity var20 = this.field1683[this.field1685[var17]];
                            if (var20 != null && var20.field457.field1020 == 1 && var16.field399 == var20.field399 && var16.field400 == var20.field400) {
                                this.method431(var5, var20.field457, this.field1685[var17], 22080, var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1476; ++var18) {
                            PlayerEntity var19 = this.field1475[this.field1477[var18]];
                            if (var19 != null && var16 != var19 && var16.field399 == var19.field399 && var16.field400 == var19.field400) {
                                this.method454(var5, var6, var19, this.field1477[var18], true);
                            }
                        }
                    }
                    this.method454(var5, var6, var16, var8, true);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1290[this.field1295][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method249(8); var22 != null; var22 = (ObjStackEntity) var21.method251(831)) {
                            ObjType var23 = ObjType.method348(var22.field501);
                            if (this.field1258 == 1) {
                                this.field1514[this.field1459] = "Use " + this.field1262 + " with @lre@" + var23.field1058;
                                this.field1281[this.field1459] = 111;
                                this.field1282[this.field1459] = var22.field501;
                                this.field1279[this.field1459] = var5;
                                this.field1280[this.field1459] = var6;
                                ++this.field1459;
                            } else if (this.field1687 == 1) {
                                if ((this.field1689 & 1) == 1) {
                                    this.field1514[this.field1459] = this.field1690 + " @lre@" + var23.field1058;
                                    this.field1281[this.field1459] = 370;
                                    this.field1282[this.field1459] = var22.field501;
                                    this.field1279[this.field1459] = var5;
                                    this.field1280[this.field1459] = var6;
                                    ++this.field1459;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1072 != null && var23.field1072[var24] != null) {
                                        this.field1514[this.field1459] = var23.field1072[var24] + " @lre@" + var23.field1058;
                                        if (var24 == 0) {
                                            this.field1281[this.field1459] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1281[this.field1459] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1281[this.field1459] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1281[this.field1459] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1281[this.field1459] = 662;
                                        }
                                        this.field1282[this.field1459] = var22.field501;
                                        this.field1279[this.field1459] = var5;
                                        this.field1280[this.field1459] = var6;
                                        ++this.field1459;
                                    } else if (var24 == 2) {
                                        this.field1514[this.field1459] = "Take @lre@" + var23.field1058;
                                        this.field1281[this.field1459] = 617;
                                        this.field1282[this.field1459] = var22.field501;
                                        this.field1279[this.field1459] = var5;
                                        this.field1280[this.field1459] = var6;
                                        ++this.field1459;
                                    }
                                }
                                this.field1514[this.field1459] = "Examine @lre@" + var23.field1058;
                                this.field1281[this.field1459] = 1152;
                                this.field1282[this.field1459] = var22.field501;
                                this.field1279[this.field1459] = var5;
                                this.field1280[this.field1459] = var6;
                                ++this.field1459;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method466(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1281[arg0];
            if (arg1 != 3) {
                throw new NullPointerException();
            } else {
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                return var3 == 605;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1614.method80(this.field1295, arg1, arg2, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1538;
            if (field1538 > 1086) {
                field1538 = 0;
                this.field1613.method218(true, 170);
                this.field1613.method219(0);
                int var10 = this.field1613.field717;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1613.method220(16791);
                }
                this.field1613.method219(254);
                this.field1613.method220((int) (Math.random() * 65536.0D));
                this.field1613.method220(16128);
                this.field1613.method220(52610);
                this.field1613.method220((int) (Math.random() * 65536.0D));
                this.field1613.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1613.method220(35025);
                }
                this.field1613.method220(46628);
                this.field1613.method219((int) (Math.random() * 256.0D));
                this.field1613.method228(-28191, this.field1613.field717 - var10);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method482((byte) 2, var8 + 1, arg2, arg1, field1369.field450[0], 0, var9, 2, false, field1369.field449[0], 0, 0);
            } else {
                LocType var11 = LocType.method330(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field973;
                    var13 = var11.field972;
                } else {
                    var12 = var11.field972;
                    var13 = var11.field973;
                }
                int var14 = var11.field995;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method482((byte) 2, 0, arg2, arg1, field1369.field450[0], var14, 0, 2, false, field1369.field449[0], var13, var12);
            }
            this.field1443 = super.field31;
            this.field1444 = super.field32;
            this.field1446 = 2;
            this.field1445 = 0;
            this.field1613.method218(true, arg3);
            this.field1613.method220(this.field1461 + arg1);
            this.field1613.method220(this.field1462 + arg2);
            this.field1543 += arg4;
            this.field1613.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method468(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg2 != 30661) {
            field1266 = !field1266;
        }
        return ((arg0 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLib;II)V")
    public final void method469(boolean arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1660 + this.field1588 & 2047;
        if (arg0) {
            this.field1613.method219(179);
        }
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field603[var5];
            int var8 = Model.field604[var5];
            int var9 = var7 * 256 / (this.field1352 + 256);
            int var10 = var8 * 256 / (this.field1352 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method192(var11 + 94 - arg1.field672 / 2 + 4, this.field1316, 83 - var12 - arg1.field673 / 2 - 4, this.field1412);
            } else {
                arg1.method186(var11 + 94 - arg1.field672 / 2 + 4, 83 - var12 - arg1.field673 / 2 - 4, 37651);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLlb;I)V")
    private final void method470(byte arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field718 + 10 < arg2 * 8) {
                int var4 = arg1.method240(477, 11);
                if (var4 != 2047) {
                    if (this.field1475[var4] == null) {
                        this.field1475[var4] = new PlayerEntity();
                        if (this.field1480[var4] != null) {
                            this.field1475[var4].method116(627, this.field1480[var4]);
                        }
                    }
                    this.field1477[this.field1476++] = var4;
                    PlayerEntity var5 = this.field1475[var4];
                    var5.field444 = field1401;
                    int var6 = arg1.method240(477, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method240(477, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method240(477, 1);
                    var5.method110(field1369.field450[0] + var7, (byte) 7, var8 == 1, field1369.field449[0] + var6);
                    int var9 = arg1.method240(477, 1);
                    if (var9 == 1) {
                        this.field1479[this.field1478++] = var4;
                    }
                    continue;
                }
            }
            arg1.method241(312);
            if (arg0 != 4) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method471(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        this.field1404 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1634[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1128; ++var3) {
                if (!IdkType.field1129[var3].field1135 && IdkType.field1129[var3].field1130 == var2 + (this.field1562 ? 0 : 7)) {
                    this.field1634[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;Lab;II)V")
    private final void method472(int arg0, Packet arg1, PlayerEntity arg2, int arg3, int arg4) {
        if (arg0 < 0) {
            if ((arg3 & 1) == 1) {
                int var6 = arg1.method229();
                byte[] var7 = new byte[var6];
                Packet var8 = new Packet(var7, -26728);
                arg1.method238(var6, 0, var7, (byte) 121);
                this.field1480[arg4] = var8;
                arg2.method116(627, var8);
            }
            if ((arg3 & 2) == 2) {
                int var9 = arg1.method231();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (arg2.field427 == var9) {
                    arg2.field431 = 0;
                }
                int var10 = arg1.method229();
                if (arg2.field427 == var9 && var9 != -1) {
                    int var11 = SeqType.field1149[var9].field1163;
                    if (var11 == 1) {
                        arg2.field428 = 0;
                        arg2.field429 = 0;
                        arg2.field430 = var10;
                        arg2.field431 = 0;
                    }
                    if (var11 == 2) {
                        arg2.field431 = 0;
                    }
                } else if (var9 == -1 || arg2.field427 == -1 || SeqType.field1149[var9].field1157 >= SeqType.field1149[arg2.field427].field1157) {
                    arg2.field427 = var9;
                    arg2.field428 = 0;
                    arg2.field429 = 0;
                    arg2.field430 = var10;
                    arg2.field431 = 0;
                    arg2.field453 = arg2.field448;
                }
            }
            if ((arg3 & 4) == 4) {
                arg2.field421 = arg1.method231();
                if (arg2.field421 == 65535) {
                    arg2.field421 = -1;
                }
            }
            if ((arg3 & 8) == 8) {
                arg2.field411 = arg1.method236();
                if (arg2.field411.charAt(0) == '~') {
                    arg2.field411 = arg2.field411.substring(1);
                    this.method559(176, 2, arg2.field460, arg2.field411);
                } else if (field1369 == arg2) {
                    this.method559(176, 2, arg2.field460, arg2.field411);
                }
                arg2.field413 = 0;
                arg2.field414 = 0;
                arg2.field412 = 150;
            }
            if ((arg3 & 16) == 16) {
                int var12 = arg1.method229();
                int var13 = arg1.method229();
                arg2.method114(true, var13, field1401, var12);
                arg2.field418 = field1401 + 300;
                arg2.field419 = arg1.method229();
                arg2.field420 = arg1.method229();
            }
            if ((arg3 & 32) == 32) {
                arg2.field422 = arg1.method231();
                arg2.field423 = arg1.method231();
            }
            if ((arg3 & 64) == 64) {
                int var14 = arg1.method231();
                int var15 = arg1.method229();
                int var16 = arg1.method229();
                int var17 = arg1.field717;
                if (arg2.field460 != null && arg2.field461) {
                    long var18 = JString.method300(arg2.field460);
                    boolean var20 = false;
                    if (var15 <= 1) {
                        for (int var21 = 0; var21 < this.field1359; ++var21) {
                            if (this.field1595[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                    if (!var20 && this.field1566 == 0) {
                        try {
                            String var22 = WordPack.method306(var16, arg1, 9);
                            String var23 = WordFilter.method401(-212, var22);
                            arg2.field411 = var23;
                            arg2.field413 = var14 >> 8;
                            arg2.field414 = var14 & 255;
                            arg2.field412 = 150;
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method559(176, 1, "@cr1@" + arg2.field460, var23);
                                } else {
                                    this.method559(176, 2, arg2.field460, var23);
                                }
                            } else {
                                this.method559(176, 1, "@cr2@" + arg2.field460, var23);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg1.field717 = var16 + var17;
            }
            if ((arg3 & 256) == 256) {
                arg2.field432 = arg1.method231();
                int var25 = arg1.method234();
                arg2.field436 = var25 >> 16;
                arg2.field435 = (var25 & 65535) + field1401;
                arg2.field433 = 0;
                arg2.field434 = 0;
                if (arg2.field435 > field1401) {
                    arg2.field433 = -1;
                }
                if (arg2.field432 == 65535) {
                    arg2.field432 = -1;
                }
            }
            if ((arg3 & 512) == 512) {
                arg2.field437 = arg1.method229();
                arg2.field439 = arg1.method229();
                arg2.field438 = arg1.method229();
                arg2.field440 = arg1.method229();
                arg2.field441 = arg1.method231() + field1401;
                arg2.field442 = arg1.method231() + field1401;
                arg2.field443 = arg1.method229();
                arg2.method112(0);
            }
            if ((arg3 & 1024) == 1024) {
                int var26 = arg1.method229();
                int var27 = arg1.method229();
                arg2.method114(true, var27, field1401, var26);
                arg2.field418 = field1401 + 300;
                arg2.field419 = arg1.method229();
                arg2.field420 = arg1.method229();
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    private final void method473(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1290 = null;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1370.method248(); var2 != null; var2 = (LocSpawned) this.field1370.method250(0)) {
            if (var2.field746 == -1) {
                var2.field745 = 0;
                this.method449(var2, -886);
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method474(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        this.field1613.method218(true, 165);
        this.field1398 &= arg0;
        if (this.field1555 != -1) {
            this.field1555 = -1;
            this.field1381 = true;
            this.field1289 = false;
            this.field1442 = true;
        }
        if (this.field1241 != -1) {
            this.field1241 = -1;
            this.field1420 = true;
            this.field1289 = false;
        }
        this.field1567 = -1;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method476(boolean arg0) {
        if (!arg0) {
            this.field1613.method219(194);
        }
        try {
            this.field1529 = -1;
            this.field1607.method252();
            this.field1336.method252();
            Pix3D.method167(46);
            this.method442(-24602);
            this.field1614.method50(this.field1606);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1354[var2].method359(field1591);
            }
            System.gc();
            World var3 = new World(104, this.field1348, 104, this.field1309, 0);
            int var4 = this.field1364.length;
            World.field43 = World3D.field283;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1322[var5] >> 8;
                int var7 = this.field1322[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field43 = false;
                }
            }
            if (World.field43) {
                this.field1614.method51(978, this.field1295);
            } else {
                this.field1614.method51(978, 0);
            }
            this.field1613.method218(true, 115);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1322[var8] >> 8) * 64 - this.field1461;
                int var10 = (this.field1322[var8] & 255) * 64 - this.field1462;
                byte[] var11 = this.field1364[var8];
                if (var11 != null) {
                    var3.method15((this.field1255 - 6) * 8, var9, (this.field1254 - 6) * 8, var10, 2, var11);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1322[var12] >> 8) * 64 - this.field1461;
                int var14 = (this.field1322[var12] & 255) * 64 - this.field1462;
                byte[] var15 = this.field1364[var12];
                if (var15 == null && this.field1255 < 800) {
                    var3.method14(64, var13, var14, 0, 64);
                }
            }
            this.field1613.method218(true, 115);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1318[var16];
                if (var17 != null) {
                    int var18 = (this.field1322[var16] >> 8) * 64 - this.field1461;
                    int var19 = (this.field1322[var16] & 255) * 64 - this.field1462;
                    var3.method18(var19, this.field1354, this.field1614, var18, var17, true);
                }
            }
            this.field1613.method218(true, 115);
            var3.method20(this.field1354, this.field1614, false);
            this.field1272.method258(this.field1310);
            this.field1613.method218(true, 115);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method508(var20, var21);
                }
            }
            this.method473(0);
        } catch (Exception var34) {
        }
        LocType.field1002.method103();
        if (field1512 && signlink.cache_dat != null) {
            int var23 = this.field1528.method272(0, (byte) -73);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1528.method277(var24, 0);
                if ((var25 & 121) == 0) {
                    Model.method125(var24, (byte) 3);
                }
            }
        }
        System.gc();
        Pix3D.method168(7, 20);
        this.field1528.method283(0);
        int var26 = (this.field1254 - 6) / 8 - 1;
        int var27 = (this.field1254 + 6) / 8 + 1;
        int var28 = (this.field1255 - 6) / 8 - 1;
        int var29 = (this.field1255 + 6) / 8 + 1;
        if (this.field1679) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1528.method274(var31, 905, 0, var30);
                    if (var32 != -1) {
                        this.field1528.method284(3, 47179, var32);
                    }
                    int var33 = this.field1528.method274(var31, 905, 1, var30);
                    if (var33 != -1) {
                        this.field1528.method284(3, 47179, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method477(byte arg0) {
        int var2 = this.field1390 * 128 + 64;
        int var3 = this.field1391 * 128 + 64;
        int var4 = this.method555(var2, this.field1295, -576, var3) - this.field1392;
        if (arg0 != 45) {
            field1383 = -9;
        }
        if (this.field1577 < var2) {
            this.field1577 += (var2 - this.field1577) * this.field1394 / 1000 + this.field1393;
            if (this.field1577 > var2) {
                this.field1577 = var2;
            }
        }
        if (this.field1577 > var2) {
            this.field1577 -= (this.field1577 - var2) * this.field1394 / 1000 + this.field1393;
            if (this.field1577 < var2) {
                this.field1577 = var2;
            }
        }
        if (this.field1578 < var4) {
            this.field1578 += (var4 - this.field1578) * this.field1394 / 1000 + this.field1393;
            if (this.field1578 > var4) {
                this.field1578 = var4;
            }
        }
        if (this.field1578 > var4) {
            this.field1578 -= (this.field1578 - var4) * this.field1394 / 1000 + this.field1393;
            if (this.field1578 < var4) {
                this.field1578 = var4;
            }
        }
        if (this.field1579 < var3) {
            this.field1579 += (var3 - this.field1579) * this.field1394 / 1000 + this.field1393;
            if (this.field1579 > var3) {
                this.field1579 = var3;
            }
        }
        if (this.field1579 > var3) {
            this.field1579 -= (this.field1579 - var3) * this.field1394 / 1000 + this.field1393;
            if (this.field1579 < var3) {
                this.field1579 = var3;
            }
        }
        int var5 = this.field1640 * 128 + 64;
        int var6 = this.field1641 * 128 + 64;
        int var7 = this.method555(var5, this.field1295, -576, var6) - this.field1642;
        int var8 = var5 - this.field1577;
        int var9 = var7 - this.field1578;
        int var10 = var6 - this.field1579;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1580 < var12) {
            this.field1580 += (var12 - this.field1580) * this.field1644 / 1000 + this.field1643;
            if (this.field1580 > var12) {
                this.field1580 = var12;
            }
        }
        if (this.field1580 > var12) {
            this.field1580 -= (this.field1580 - var12) * this.field1644 / 1000 + this.field1643;
            if (this.field1580 < var12) {
                this.field1580 = var12;
            }
        }
        int var14 = var13 - this.field1581;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1581 += this.field1644 * var14 / 1000 + this.field1643;
            this.field1581 &= 2047;
        }
        if (var14 < 0) {
            this.field1581 -= -var14 * this.field1644 / 1000 + this.field1643;
            this.field1581 &= 2047;
        }
        int var15 = var13 - this.field1581;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1581 = var13;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;I)V")
    public final void method478(int arg0, PathingEntity arg1, int arg2) {
        if (this.field1524 == arg0) {
            this.method479(arg1.field400, arg2, arg1.field399, 736);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method479(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method555(arg2, this.field1295, -576, arg0) - arg1;
            int var6 = arg2 - this.field1577;
            int var7 = var5 - this.field1578;
            int var8 = arg0 - this.field1579;
            int var9 = Model.field603[this.field1580];
            int var10 = Model.field604[this.field1580];
            int var11 = 37 / arg3;
            int var12 = Model.field603[this.field1581];
            int var13 = Model.field604[this.field1581];
            int var14 = var6 * var13 + var8 * var12 >> 16;
            int var15 = var8 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var10 - var9 * var15 >> 16;
            int var18 = var7 * var9 + var10 * var15 >> 16;
            if (var18 >= 50) {
                this.field1583 = (var14 << 9) / var18 + Pix3D.field639;
                this.field1584 = (var17 << 9) / var18 + Pix3D.field640;
            } else {
                this.field1583 = -1;
                this.field1584 = -1;
            }
        } else {
            this.field1583 = -1;
            this.field1584 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method480(int arg0) {
        for (int var2 = 0; var2 < this.field1454; ++var2) {
            if (this.field1269[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1321[var2] == this.field1291 && this.field1626[var2] == this.field1523) {
                        if (!this.method510((byte) -113)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(true, this.field1626[var2], this.field1321[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field717 / 22) > (long) (this.field1325 / 22) + this.field1537) {
                            this.field1325 = var4.field717;
                            this.field1537 = System.currentTimeMillis();
                            if (this.method495(var4.field717, 0, var4.field716)) {
                                this.field1291 = this.field1321[var2];
                                this.field1523 = this.field1626[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1269[var2] != -5) {
                    this.field1269[var2] = -5;
                } else {
                    --this.field1454;
                    for (int var6 = var2; var6 < this.field1454; ++var6) {
                        this.field1321[var6] = this.field1321[var6 + 1];
                        this.field1626[var6] = this.field1626[var6 + 1];
                        this.field1269[var6] = this.field1269[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1269[var2]--;
            }
        }
        if (arg0 < 9 || arg0 > 9) {
            this.field1612 = !this.field1612;
        }
        if (this.field1399 > 0) {
            this.field1399 -= 20;
            if (this.field1399 < 0) {
                this.field1399 = 0;
            }
            if (this.field1399 == 0 && this.field1609 && !field1512) {
                this.field1525 = this.field1424;
                this.field1526 = true;
                this.field1528.method279(2, this.field1525);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method481(int arg0) {
        int var2 = this.field1675.method204((byte) 4, "Choose Option");
        if (arg0 >= 0) {
            this.field1524 = -305;
        }
        for (int var3 = 0; var3 < this.field1459; ++var3) {
            int var11 = this.field1675.method204((byte) 4, this.field1514[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1459 * 15 + 21;
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
            this.field1593 = true;
            this.field1531 = 0;
            this.field1532 = var5;
            this.field1533 = var6;
            this.field1534 = var2;
            this.field1535 = this.field1459 * 15 + 22;
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
            this.field1593 = true;
            this.field1531 = 1;
            this.field1532 = var7;
            this.field1533 = var8;
            this.field1534 = var2;
            this.field1535 = this.field1459 * 15 + 22;
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
            this.field1593 = true;
            this.field1531 = 2;
            this.field1532 = var9;
            this.field1533 = var10;
            this.field1534 = var2;
            this.field1535 = this.field1459 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIIIIIZIII)Z")
    public final boolean method482(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var37 = 0; var37 < var14; ++var37) {
                this.field1453[var15][var37] = 0;
                this.field1672[var15][var37] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg4;
        this.field1453[arg9][arg4] = 99;
        this.field1672[arg9][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1548[var18] = arg9;
        int var38 = var18 + 1;
        this.field1549[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field1548.length;
        int[][] var22 = this.field1354[this.field1295].field1112;
        while (var38 != var19) {
            var16 = this.field1548[var19];
            var17 = this.field1549[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field1354[this.field1295].method368(arg3, var16, arg2, var17, 7843, arg1 - 1, arg6)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field1354[this.field1295].method369(arg2, 0, arg6, var17, arg3, var16, arg1 - 1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg10 != 0 && this.field1354[this.field1295].method370(arg3, arg5, var17, arg11, arg2, arg10, true, var16)) {
                var20 = true;
                break;
            }
            int var36 = this.field1672[var16][var17] + 1;
            if (var16 > 0 && this.field1453[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1548[var38] = var16 - 1;
                this.field1549[var38] = var17;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 - 1][var17] = 2;
                this.field1672[var16 - 1][var17] = var36;
            }
            if (var16 < var13 - 1 && this.field1453[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1548[var38] = var16 + 1;
                this.field1549[var38] = var17;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 + 1][var17] = 8;
                this.field1672[var16 + 1][var17] = var36;
            }
            if (var17 > 0 && this.field1453[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1548[var38] = var16;
                this.field1549[var38] = var17 - 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16][var17 - 1] = 1;
                this.field1672[var16][var17 - 1] = var36;
            }
            if (var17 < var14 - 1 && this.field1453[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1548[var38] = var16;
                this.field1549[var38] = var17 + 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16][var17 + 1] = 4;
                this.field1672[var16][var17 + 1] = var36;
            }
            if (var16 > 0 && var17 > 0 && this.field1453[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1548[var38] = var16 - 1;
                this.field1549[var38] = var17 - 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 - 1][var17 - 1] = 3;
                this.field1672[var16 - 1][var17 - 1] = var36;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1453[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1548[var38] = var16 + 1;
                this.field1549[var38] = var17 - 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 + 1][var17 - 1] = 9;
                this.field1672[var16 + 1][var17 - 1] = var36;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1453[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1548[var38] = var16 - 1;
                this.field1549[var38] = var17 + 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 - 1][var17 + 1] = 6;
                this.field1672[var16 - 1][var17 + 1] = var36;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1453[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1548[var38] = var16 + 1;
                this.field1549[var38] = var17 + 1;
                var38 = (var38 + 1) % var21;
                this.field1453[var16 + 1][var17 + 1] = 12;
                this.field1672[var16 + 1][var17 + 1] = var36;
            }
        }
        this.field1351 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg2 - var24; var26 <= arg2 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1672[var25][var26] < var23) {
                                var23 = this.field1672[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1351 = 1;
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
        this.field1548[var27] = var16;
        int var39 = var27 + 1;
        this.field1549[var27] = var17;
        int var28;
        int var29 = var28 = this.field1453[var16][var17];
        if (arg0 == 2) {
            boolean var30 = false;
        } else {
            for (int var31 = 1; var31 > 0; ++var31) {
            }
        }
        while (arg9 != var16 || arg4 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1548[var39] = var16;
                this.field1549[var39++] = var17;
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
            var29 = this.field1453[var16][var17];
        }
        if (var39 <= 0) {
            if (arg7 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var32 = var39;
            if (var39 > 25) {
                var32 = 25;
            }
            --var39;
            int var33 = this.field1548[var39];
            int var34 = this.field1549[var39];
            if (arg7 == 0) {
                this.field1613.method218(true, 141);
                this.field1613.method219(var32 + var32 + 3);
            }
            if (arg7 == 1) {
                this.field1613.method218(true, 196);
                this.field1613.method219(var32 + var32 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field1613.method218(true, 70);
                this.field1613.method219(var32 + var32 + 3);
            }
            if (super.field34[5] == 1) {
                this.field1613.method219(1);
            } else {
                this.field1613.method219(0);
            }
            this.field1613.method220(this.field1461 + var33);
            this.field1613.method220(this.field1462 + var34);
            this.field1360 = this.field1548[0];
            this.field1361 = this.field1549[0];
            for (int var35 = 1; var35 < var32; ++var35) {
                --var39;
                this.field1613.method219(this.field1548[var39] - var33);
                this.field1613.method219(this.field1549[var39] - var34);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method483(byte arg0) {
        int var2 = 5;
        this.field1497[8] = 0;
        int var3 = 0;
        if (arg0 != -69) {
            this.field1290 = null;
        }
        while (this.field1497[8] == 0) {
            String var4 = "Unknown problem";
            this.method13((byte) 22, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method501("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 299);
                Packet var6 = new Packet(new byte[40], -26728);
                var5.readFully(var6.field716, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1497[var7] = var6.method234();
                }
                int var8 = var6.method234();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1497[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1497[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1497[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1497[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1497[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1497[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13((byte) 22, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method13((byte) 22, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field1556 = !this.field1556;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method484(int arg0) {
        if (this.field1554 != arg0) {
            this.field1544 = this.field1418.method229();
        }
        if (super.field30 == 1) {
            if (super.field31 >= 6 && super.field31 <= 106 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1239 = (this.field1239 + 1) % 4;
                this.field1251 = true;
                this.field1420 = true;
                this.field1613.method218(true, 242);
                this.field1613.method219(this.field1239);
                this.field1613.method219(this.field1658);
                this.field1613.method219(this.field1400);
            }
            if (super.field31 >= 135 && super.field31 <= 235 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1658 = (this.field1658 + 1) % 3;
                this.field1251 = true;
                this.field1420 = true;
                this.field1613.method218(true, 242);
                this.field1613.method219(this.field1239);
                this.field1613.method219(this.field1658);
                this.field1613.method219(this.field1400);
            }
            if (super.field31 >= 273 && super.field31 <= 373 && super.field32 >= 467 && super.field32 <= 499) {
                this.field1400 = (this.field1400 + 1) % 3;
                this.field1251 = true;
                this.field1420 = true;
                this.field1613.method218(true, 242);
                this.field1613.method219(this.field1239);
                this.field1613.method219(this.field1658);
                this.field1613.method219(this.field1400);
            }
            if (super.field31 >= 412 && super.field31 <= 512 && super.field32 >= 467 && super.field32 <= 499) {
                if (this.field1567 == -1) {
                    this.method475(true);
                    this.field1452 = "";
                    this.field1645 = false;
                    for (int var2 = 0; var2 < Component.field71.length; ++var2) {
                        if (Component.field71[var2] != null && Component.field71[var2].field80 == 600) {
                            this.field1496 = this.field1567 = Component.field71[var2].field77;
                            return;
                        }
                    }
                    return;
                }
                this.method559(176, 0, "", "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method485(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1233) {
                this.field1233 = false;
                this.field1420 = true;
            }
            int var3 = this.field1279[arg0];
            int var4 = this.field1280[arg0];
            int var5 = this.field1281[arg0];
            int var6 = this.field1282[arg0];
            if (arg1 <= 0) {
                this.field1612 = !this.field1612;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 563) {
                this.field1613.method218(true, 199);
                this.field1613.method220(var6);
                this.field1613.method220(var3);
                this.field1613.method220(var4);
                this.field1613.method220(this.field1688);
                this.field1298 = 0;
                this.field1299 = var4;
                this.field1300 = var3;
                this.field1301 = 2;
                if (Component.field71[var4].field77 == this.field1567) {
                    this.field1301 = 1;
                }
                if (Component.field71[var4].field77 == this.field1241) {
                    this.field1301 = 3;
                }
            }
            if (var5 == 111) {
                boolean var7 = this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 0, 0);
                if (!var7) {
                    this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                }
                this.field1443 = super.field31;
                this.field1444 = super.field32;
                this.field1446 = 2;
                this.field1445 = 0;
                this.field1613.method218(true, 163);
                this.field1613.method220(this.field1461 + var3);
                this.field1613.method220(this.field1462 + var4);
                this.field1613.method220(var6);
                this.field1613.method220(this.field1261);
                this.field1613.method220(this.field1259);
                this.field1613.method220(this.field1260);
            }
            if (var5 == 899 && this.method467(var6, var3, var4, 124, 0)) {
                this.field1613.method220(this.field1688);
            }
            if (var5 == 1152) {
                ObjType var9 = ObjType.method348(var6);
                String var10;
                if (var9.field1059 != null) {
                    var10 = new String(var9.field1059);
                } else {
                    var10 = "It's a " + var9.field1058 + ".";
                }
                this.method559(176, 0, "", var10);
            }
            if (var5 == 275) {
                PlayerEntity var11 = this.field1475[var6];
                if (var11 != null) {
                    this.method482((byte) 2, 0, var11.field450[0], var11.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                    this.field1443 = super.field31;
                    this.field1444 = super.field32;
                    this.field1446 = 2;
                    this.field1445 = 0;
                    this.field1613.method218(true, 136);
                    this.field1613.method220(var6);
                    this.field1613.method220(this.field1261);
                    this.field1613.method220(this.field1259);
                    this.field1613.method220(this.field1260);
                }
            }
            if (var5 == 1071) {
                this.method467(var6, var3, var4, 253, 0);
            }
            if (var5 == 435) {
                this.field1613.method218(true, 62);
                this.field1613.method220(var4);
                Component var12 = Component.field71[var4];
                if (var12.field86 != null && var12.field86[0][0] == 5) {
                    int var13 = var12.field86[0][1];
                    this.field1384[var13] = 1 - this.field1384[var13];
                    this.method550(var13, this.field1574);
                    this.field1381 = true;
                }
            }
            if (var5 == 370) {
                boolean var14 = this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 0, 0);
                if (!var14) {
                    this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                }
                this.field1443 = super.field31;
                this.field1444 = super.field32;
                this.field1446 = 2;
                this.field1445 = 0;
                this.field1613.method218(true, 195);
                this.field1613.method220(this.field1461 + var3);
                this.field1613.method220(this.field1462 + var4);
                this.field1613.method220(var6);
                this.field1613.method220(this.field1688);
            }
            if (var5 == 810 && this.method467(var6, var3, var4, 215, 0)) {
                this.field1613.method220(this.field1261);
                this.field1613.method220(this.field1259);
                this.field1613.method220(this.field1260);
            }
            if (var5 == 997 && !this.field1289) {
                this.field1613.method218(true, 223);
                this.field1613.method220(var4);
                this.field1289 = true;
            }
            if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                boolean var16 = this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 0, 0);
                if (!var16) {
                    this.method482((byte) 2, 0, var4, var3, field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                }
                this.field1443 = super.field31;
                this.field1444 = super.field32;
                this.field1446 = 2;
                this.field1445 = 0;
                if (var5 == 139) {
                    if ((var3 & 3) == 0) {
                        ++field1293;
                    }
                    if (field1293 >= 123) {
                        this.field1613.method218(true, 58);
                        this.field1613.method223(0);
                    }
                    this.field1613.method218(true, 27);
                }
                if (var5 == 662) {
                    field1229 += this.field1462;
                    if (field1229 >= 118) {
                        this.field1613.method218(true, 26);
                        this.field1613.method223(0);
                    }
                    this.field1613.method218(true, 211);
                }
                if (var5 == 617) {
                    this.field1613.method218(true, 60);
                }
                if (var5 == 224) {
                    field1232 += var4;
                    if (field1232 >= 75) {
                        this.field1613.method218(true, 41);
                        this.field1613.method219(19);
                    }
                    this.field1613.method218(true, 123);
                }
                if (var5 == 778) {
                    this.field1613.method218(true, 42);
                }
                this.field1613.method220(this.field1461 + var3);
                this.field1613.method220(this.field1462 + var4);
                this.field1613.method220(var6);
            }
            if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                NpcEntity var18 = this.field1683[var6];
                if (var18 != null) {
                    this.method482((byte) 2, 0, var18.field450[0], var18.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                    this.field1443 = super.field31;
                    this.field1444 = super.field32;
                    this.field1446 = 2;
                    this.field1445 = 0;
                    if (var5 == 309) {
                        this.field1613.method218(true, 239);
                    }
                    if (var5 == 852) {
                        this.field1613.method218(true, 22);
                    }
                    if (var5 == 793) {
                        this.field1613.method218(true, 188);
                    }
                    if (var5 == 209) {
                        this.field1613.method218(true, 4);
                    }
                    if (var5 == 242) {
                        this.field1613.method218(true, 35);
                    }
                    this.field1613.method220(var6);
                }
            }
            if (var5 == 1381) {
                int var19 = var6 >> 14 & 32767;
                LocType var20 = LocType.method330(var19);
                String var21;
                if (var20.field969 != null) {
                    var21 = new String(var20.field969);
                } else {
                    var21 = "It's a " + var20.field968 + ".";
                }
                this.method559(176, 0, "", var21);
            }
            if (var5 == 524) {
                String var22 = this.field1514[arg0];
                int var23 = var22.indexOf("@whi@");
                if (var23 != -1) {
                    if (this.field1567 == -1) {
                        this.method475(true);
                        this.field1452 = var22.substring(var23 + 5).trim();
                        this.field1645 = false;
                        for (int var24 = 0; var24 < Component.field71.length; ++var24) {
                            if (Component.field71[var24] != null && Component.field71[var24].field80 == 600) {
                                this.field1496 = this.field1567 = Component.field71[var24].field77;
                                break;
                            }
                        }
                    } else {
                        this.method559(176, 0, "", "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 721) {
                field1297 += var4;
                if (field1297 >= 139) {
                    this.field1613.method218(true, 202);
                    this.field1613.method223(0);
                }
                this.method467(var6, var3, var4, 207, 0);
            }
            if (var5 == 743) {
                ++field1358;
                if (field1358 >= 124) {
                    this.field1613.method218(true, 173);
                    this.field1613.method220(37954);
                }
                this.method467(var6, var3, var4, 98, 0);
            }
            if (var5 == 102) {
                this.field1258 = 1;
                this.field1259 = var3;
                this.field1260 = var4;
                this.field1261 = var6;
                this.field1262 = ObjType.method348(var6).field1058;
                this.field1687 = 0;
                this.field1381 = true;
            } else if (var5 == 274) {
                Component var25 = Component.field71[var4];
                this.field1687 = 1;
                this.field1688 = var4;
                this.field1689 = var25.field131;
                this.field1258 = 0;
                this.field1381 = true;
                String var26 = var25.field129;
                if (var26.indexOf(" ") != -1) {
                    var26 = var26.substring(0, var26.indexOf(" "));
                }
                String var27 = var25.field129;
                if (var27.indexOf(" ") != -1) {
                    var27 = var27.substring(var27.indexOf(" ") + 1);
                }
                this.field1690 = var26 + " " + var25.field130 + " " + var27;
                if (this.field1689 == 16) {
                    this.field1381 = true;
                    this.field1482 = 3;
                    this.field1442 = true;
                }
            } else {
                if (var5 == 357) {
                    this.method467(var6, var3, var4, 5, 0);
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var28 = this.field1475[var6];
                    if (var28 != null) {
                        this.method482((byte) 2, 0, var28.field450[0], var28.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                        this.field1443 = super.field31;
                        this.field1444 = super.field32;
                        this.field1446 = 2;
                        this.field1445 = 0;
                        if (var5 == 27) {
                            this.field1613.method218(true, 17);
                        }
                        if (var5 == 185) {
                            this.field1613.method218(true, 83);
                        }
                        if (var5 == 387) {
                            field1508 += var6;
                            if (field1508 >= 66) {
                                this.field1613.method218(true, 222);
                                this.field1613.method219(154);
                            }
                            this.field1613.method218(true, 241);
                        }
                        if (var5 == 639) {
                            ++field1469;
                            if (field1469 >= 52) {
                                this.field1613.method218(true, 0);
                                this.field1613.method219(131);
                            }
                            this.field1613.method218(true, 10);
                        }
                        if (var5 == 499) {
                            this.field1613.method218(true, 40);
                        }
                        this.field1613.method220(var6);
                    }
                }
                if (var5 == 225) {
                    this.field1613.method218(true, 62);
                    this.field1613.method220(var4);
                    Component var29 = Component.field71[var4];
                    if (var29.field86 != null && var29.field86[0][0] == 5) {
                        int var30 = var29.field86[0][1];
                        if (this.field1384[var30] != var29.field88[0]) {
                            this.field1384[var30] = var29.field88[0];
                            this.method550(var30, this.field1574);
                            this.field1381 = true;
                        }
                    }
                }
                if (var5 == 737) {
                    this.method475(true);
                }
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 681) {
                        ++field1242;
                        if (field1242 >= 116) {
                            this.field1613.method218(true, 152);
                            this.field1613.method222(13018169);
                        }
                        this.field1613.method218(true, 254);
                    }
                    if (var5 == 962) {
                        this.field1613.method218(true, 156);
                    }
                    if (var5 == 795) {
                        this.field1613.method218(true, 213);
                    }
                    if (var5 == 100) {
                        this.field1613.method218(true, 127);
                    }
                    if (var5 == 694) {
                        this.field1613.method218(true, 64);
                    }
                    this.field1613.method220(var6);
                    this.field1613.method220(var3);
                    this.field1613.method220(var4);
                    this.field1298 = 0;
                    this.field1299 = var4;
                    this.field1300 = var3;
                    this.field1301 = 2;
                    if (Component.field71[var4].field77 == this.field1567) {
                        this.field1301 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1241) {
                        this.field1301 = 3;
                    }
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 354) {
                        this.field1613.method218(true, 87);
                    }
                    if (var5 == 555) {
                        this.field1613.method218(true, 130);
                    }
                    if (var5 == 113) {
                        this.field1613.method218(true, 88);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1249;
                        }
                        if (field1249 >= 133) {
                            this.field1613.method218(true, 203);
                            this.field1613.method220(6118);
                        }
                        this.field1613.method218(true, 198);
                    }
                    if (var5 == 331) {
                        this.field1613.method218(true, 125);
                    }
                    this.field1613.method220(var6);
                    this.field1613.method220(var3);
                    this.field1613.method220(var4);
                    this.field1298 = 0;
                    this.field1299 = var4;
                    this.field1300 = var3;
                    this.field1301 = 2;
                    if (Component.field71[var4].field77 == this.field1567) {
                        this.field1301 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1241) {
                        this.field1301 = 3;
                    }
                }
                if (var5 == 625) {
                    this.method467(var6, var3, var4, 238, 0);
                }
                if (var5 == 398) {
                    this.field1613.method218(true, 101);
                    this.field1613.method220(var6);
                    this.field1613.method220(var3);
                    this.field1613.method220(var4);
                    this.field1613.method220(this.field1261);
                    this.field1613.method220(this.field1259);
                    this.field1613.method220(this.field1260);
                    this.field1298 = 0;
                    this.field1299 = var4;
                    this.field1300 = var3;
                    this.field1301 = 2;
                    if (Component.field71[var4].field77 == this.field1567) {
                        this.field1301 = 1;
                    }
                    if (Component.field71[var4].field77 == this.field1241) {
                        this.field1301 = 3;
                    }
                }
                if (var5 == 231) {
                    Component var31 = Component.field71[var4];
                    boolean var32 = true;
                    if (var31.field80 > 0) {
                        var32 = this.method460(var31, this.field1338);
                    }
                    if (var32) {
                        this.field1613.method218(true, 62);
                        this.field1613.method220(var4);
                    }
                }
                if (var5 == 1714) {
                    NpcEntity var33 = this.field1683[var6];
                    if (var33 != null) {
                        NpcType var34 = var33.field457;
                        if (var34.field1043 != null) {
                            var34 = var34.method345(559);
                        }
                        if (var34 != null) {
                            String var35;
                            if (var34.field1019 != null) {
                                var35 = new String(var34.field1019);
                            } else {
                                var35 = "It's a " + var34.field1018 + ".";
                            }
                            this.method559(176, 0, "", var35);
                        }
                    }
                }
                if (var5 == 1328) {
                    ObjType var36 = ObjType.method348(var6);
                    Component var37 = Component.field71[var4];
                    String var38;
                    if (var37 != null && var37.field73[var3] >= 100000) {
                        var38 = var37.field73[var3] + " x " + var36.field1058;
                    } else if (var36.field1059 != null) {
                        var38 = new String(var36.field1059);
                    } else {
                        var38 = "It's a " + var36.field1058 + ".";
                    }
                    this.method559(176, 0, "", var38);
                }
                if (var5 == 902) {
                    String var39 = this.field1514[arg0];
                    int var40 = var39.indexOf("@whi@");
                    if (var40 != -1) {
                        long var41 = JString.method300(var39.substring(var40 + 5).trim());
                        int var43 = -1;
                        for (int var44 = 0; var44 < this.field1632; ++var44) {
                            if (this.field1436[var44] == var41) {
                                var43 = var44;
                                break;
                            }
                        }
                        if (var43 != -1 && this.field1357[var43] > 0) {
                            this.field1420 = true;
                            this.field1233 = false;
                            this.field1639 = true;
                            this.field1247 = "";
                            this.field1389 = 3;
                            this.field1659 = this.field1436[var43];
                            this.field1542 = "Enter message to send to " + this.field1627[var43];
                        }
                    }
                }
                if (var5 == 829) {
                    NpcEntity var45 = this.field1683[var6];
                    if (var45 != null) {
                        this.method482((byte) 2, 0, var45.field450[0], var45.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                        this.field1443 = super.field31;
                        this.field1444 = super.field32;
                        this.field1446 = 2;
                        this.field1445 = 0;
                        this.field1613.method218(true, 120);
                        this.field1613.method220(var6);
                        this.field1613.method220(this.field1261);
                        this.field1613.method220(this.field1259);
                        this.field1613.method220(this.field1260);
                    }
                }
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var46 = this.field1514[arg0];
                    int var47 = var46.indexOf("@whi@");
                    if (var47 != -1) {
                        long var48 = JString.method300(var46.substring(var47 + 5).trim());
                        if (var5 == 605) {
                            this.method520(var48, -549);
                        }
                        if (var5 == 47) {
                            this.method441(var48, this.field1501);
                        }
                        if (var5 == 513) {
                            this.method541(var48, (byte) -51);
                        }
                        if (var5 == 884) {
                            this.method509(true, var48);
                        }
                    }
                }
                if (var5 == 718) {
                    if (!this.field1593) {
                        this.field1614.method88(super.field32 - 4, 0, super.field31 - 4);
                    } else {
                        this.field1614.method88(var4 - 4, 0, var3 - 4);
                    }
                }
                if (var5 == 240) {
                    NpcEntity var50 = this.field1683[var6];
                    if (var50 != null) {
                        this.method482((byte) 2, 0, var50.field450[0], var50.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                        this.field1443 = super.field31;
                        this.field1444 = super.field32;
                        this.field1446 = 2;
                        this.field1445 = 0;
                        this.field1613.method218(true, 100);
                        this.field1613.method220(var6);
                        this.field1613.method220(this.field1688);
                    }
                }
                if (var5 == 507 || var5 == 957) {
                    String var51 = this.field1514[arg0];
                    int var52 = var51.indexOf("@whi@");
                    if (var52 != -1) {
                        String var53 = var51.substring(var52 + 5).trim();
                        String var54 = JString.method304(943, JString.method301(0, JString.method300(var53)));
                        boolean var55 = false;
                        for (int var56 = 0; var56 < this.field1476; ++var56) {
                            PlayerEntity var57 = this.field1475[this.field1477[var56]];
                            if (var57 != null && var57.field460 != null && var57.field460.equalsIgnoreCase(var54)) {
                                this.method482((byte) 2, 0, var57.field450[0], var57.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                                if (var5 == 507) {
                                    field1508 += var6;
                                    if (field1508 >= 66) {
                                        this.field1613.method218(true, 222);
                                        this.field1613.method219(154);
                                    }
                                    this.field1613.method218(true, 241);
                                }
                                if (var5 == 957) {
                                    ++field1469;
                                    if (field1469 >= 52) {
                                        this.field1613.method218(true, 0);
                                        this.field1613.method219(131);
                                    }
                                    this.field1613.method218(true, 10);
                                }
                                this.field1613.method220(this.field1477[var56]);
                                var55 = true;
                                break;
                            }
                        }
                        if (!var55) {
                            this.method559(176, 0, "", "Unable to find " + var54);
                        }
                    }
                }
                if (var5 == 131) {
                    PlayerEntity var58 = this.field1475[var6];
                    if (var58 != null) {
                        this.method482((byte) 2, 0, var58.field450[0], var58.field449[0], field1369.field450[0], 0, 0, 2, false, field1369.field449[0], 1, 1);
                        this.field1443 = super.field31;
                        this.field1444 = super.field32;
                        this.field1446 = 2;
                        this.field1445 = 0;
                        this.field1613.method218(true, 97);
                        this.field1613.method220(var6);
                        this.field1613.method220(this.field1688);
                    }
                }
                this.field1258 = 0;
                this.field1687 = 0;
                this.field1381 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        if (this.field1536 > 1) {
            --this.field1536;
        }
        if (this.field1547 > 0) {
            --this.field1547;
        }
        for (int var2 = 0; var2 < 5 && this.method498(true); ++var2) {
        }
        if (this.field1398) {
            Object var3 = this.field1693.field1006;
            synchronized (this.field1693.field1006) {
                if (!field1495) {
                    this.field1693.field1007 = 0;
                } else if (super.field30 != 0 || this.field1693.field1007 >= 40) {
                    this.field1613.method218(true, 151);
                    this.field1613.method219(0);
                    int var4 = this.field1613.field717;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1693.field1007 && var4 - this.field1613.field717 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1693.field1009[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1693.field1008[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1693.field1009[var6] == -1 && this.field1693.field1008[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1312 == var8 && this.field1313 == var7) {
                            if (this.field1395 < 2047) {
                                ++this.field1395;
                            }
                        } else {
                            int var10 = var8 - this.field1312;
                            this.field1312 = var8;
                            int var11 = var7 - this.field1313;
                            this.field1313 = var7;
                            if (this.field1395 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1613.method220((this.field1395 << 12) + (var10 << 6) + var11);
                                this.field1395 = 0;
                            } else if (this.field1395 < 8) {
                                this.field1613.method222((this.field1395 << 19) + 8388608 + var9);
                                this.field1395 = 0;
                            } else {
                                this.field1613.method223((this.field1395 << 19) + -1073741824 + var9);
                                this.field1395 = 0;
                            }
                        }
                    }
                    this.field1613.method228(-28191, this.field1613.field717 - var4);
                    if (var5 >= this.field1693.field1007) {
                        this.field1693.field1007 = 0;
                    } else {
                        this.field1693.field1007 -= var5;
                        for (int var12 = 0; var12 < this.field1693.field1007; ++var12) {
                            this.field1693.field1008[var12] = this.field1693.field1008[var5 + var12];
                            this.field1693.field1009[var12] = this.field1693.field1009[var5 + var12];
                        }
                    }
                }
            }
            if (super.field30 != 0) {
                long var13 = (super.field33 - this.field1234) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1234 = super.field33;
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
                this.field1613.method218(true, 240);
                this.field1613.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1245 > 0) {
                --this.field1245;
            }
            if (super.field34[1] == 1 || super.field34[2] == 1 || super.field34[3] == 1 || super.field34[4] == 1) {
                this.field1246 = true;
            }
            if (this.field1246 && this.field1245 <= 0) {
                this.field1245 = 20;
                this.field1246 = false;
                this.field1613.method218(true, 169);
                this.field1613.method220(this.field1587);
                this.field1613.method220(this.field1588);
            }
            if (super.field21 && !this.field1450) {
                this.field1450 = true;
                this.field1613.method218(true, 247);
                this.field1613.method219(1);
            }
            if (!super.field21 && this.field1450) {
                this.field1450 = false;
                this.field1613.method218(true, 247);
                this.field1613.method219(0);
            }
            this.method444(874);
            this.method513(this.field1681);
            this.method480(9);
            ++this.field1545;
            if (this.field1545 > 750) {
                this.method515(-784);
            }
            this.method503(-564);
            this.method528(9);
            this.method551(-22129);
            ++this.field1228;
            if (this.field1446 != 0) {
                this.field1445 += 20;
                if (this.field1445 >= 400) {
                    this.field1446 = 0;
                }
            }
            if (this.field1301 != 0) {
                ++this.field1298;
                if (this.field1298 >= 15) {
                    if (this.field1301 == 2) {
                        this.field1381 = true;
                    }
                    if (this.field1301 == 3) {
                        this.field1420 = true;
                    }
                    this.field1301 = 0;
                }
            }
            if (this.field1623 != 0) {
                ++this.field1425;
                if (super.field24 > this.field1624 + 5 || super.field24 < this.field1624 - 5 || super.field25 > this.field1625 + 5 || super.field25 < this.field1625 - 5) {
                    this.field1437 = true;
                }
                if (super.field23 == 0) {
                    if (this.field1623 == 2) {
                        this.field1381 = true;
                    }
                    if (this.field1623 == 3) {
                        this.field1420 = true;
                    }
                    this.field1623 = 0;
                    if (this.field1437 && this.field1425 >= 5) {
                        this.field1518 = -1;
                        this.method554(270);
                        if (this.field1621 == this.field1518 && this.field1622 != this.field1517) {
                            Component var20 = Component.field71[this.field1621];
                            byte var21 = 0;
                            if (this.field1263 == 1 && var20.field80 == 206) {
                                var21 = 1;
                            }
                            if (var20.field72[this.field1517] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field101) {
                                int var22 = this.field1622;
                                int var23 = this.field1517;
                                var20.field72[var23] = var20.field72[var22];
                                var20.field73[var23] = var20.field73[var22];
                                var20.field72[var22] = -1;
                                var20.field73[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1622;
                                int var25 = this.field1517;
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
                                var20.method33(0, this.field1517, this.field1622);
                            }
                            this.field1613.method218(true, 38);
                            this.field1613.method220(this.field1621);
                            this.field1613.method220(this.field1622);
                            this.field1613.method220(this.field1517);
                            this.field1613.method219(var21);
                        }
                    } else if ((this.field1343 == 1 || this.method466(this.field1459 - 1, (byte) 3)) && this.field1459 > 2) {
                        this.method481(field1403);
                    } else if (this.field1459 > 0) {
                        this.method485(this.field1459 - 1, 96);
                    }
                    this.field1298 = 10;
                    super.field30 = 0;
                }
            }
            ++field1302;
            if (field1302 > 62) {
                field1302 = 0;
                this.field1613.method218(true, 6);
            }
            if (World3D.field317 != -1) {
                int var26 = World3D.field317;
                int var27 = World3D.field318;
                boolean var28 = this.method482((byte) 2, 0, var27, var26, field1369.field450[0], 0, 0, 0, true, field1369.field449[0], 0, 0);
                World3D.field317 = -1;
                if (var28) {
                    this.field1443 = super.field31;
                    this.field1444 = super.field32;
                    this.field1446 = 1;
                    this.field1445 = 0;
                }
            }
            if (super.field30 == 1 && this.field1692 != null) {
                this.field1692 = null;
                this.field1420 = true;
                super.field30 = 0;
            }
            this.method488(true);
            if (arg0) {
                this.field1290 = null;
            }
            this.method525((byte) 7);
            this.method487(-26751);
            this.method484(-31809);
            if (super.field23 == 1 || super.field30 == 1) {
                ++this.field1483;
            }
            if (this.field1520 == 2) {
                this.method538(7);
            }
            if (this.field1520 == 2 && this.field1342) {
                this.method477((byte) 45);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1470[var29]++;
            }
            this.method502(0);
            ++super.field22;
            if (super.field22 > 4500) {
                this.field1547 = 250;
                super.field22 -= 500;
                this.field1613.method218(true, 80);
            }
            ++this.field1628;
            if (this.field1628 > 500) {
                this.field1628 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1610 += this.field1611;
                }
                if ((var30 & 2) == 2) {
                    this.field1421 += this.field1422;
                }
                if ((var30 & 4) == 4) {
                    this.field1447 += this.field1448;
                }
            }
            if (this.field1610 < -50) {
                this.field1611 = 2;
            }
            if (this.field1610 > 50) {
                this.field1611 = -2;
            }
            if (this.field1421 < -55) {
                this.field1422 = 2;
            }
            if (this.field1421 > 55) {
                this.field1422 = -2;
            }
            if (this.field1447 < -40) {
                this.field1448 = 1;
            }
            if (this.field1447 > 40) {
                this.field1448 = -1;
            }
            ++this.field1429;
            if (this.field1429 > 500) {
                this.field1429 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1660 += this.field1661;
                }
                if ((var31 & 2) == 2) {
                    this.field1352 += this.field1353;
                }
            }
            if (this.field1660 < -60) {
                this.field1661 = 2;
            }
            if (this.field1660 > 60) {
                this.field1661 = -2;
            }
            if (this.field1352 < -20) {
                this.field1353 = 1;
            }
            if (this.field1352 > 10) {
                this.field1353 = -1;
            }
            ++this.field1546;
            if (this.field1546 > 50) {
                this.field1613.method218(true, 115);
            }
            try {
                if (this.field1248 != null && this.field1613.field717 > 0) {
                    this.field1248.method42(this.field1613.field716, (byte) -28, this.field1613.field717, 0);
                    this.field1613.field717 = 0;
                    this.field1546 = 0;
                }
            } catch (IOException var33) {
                this.method515(-784);
            } catch (Exception var34) {
                this.method542(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method487(int arg0) {
        if (arg0 == -26751) {
            if (super.field30 == 1) {
                if (super.field31 >= 539 && super.field31 <= 573 && super.field32 >= 169 && super.field32 < 205 && this.field1490[0] != -1) {
                    this.field1381 = true;
                    this.field1482 = 0;
                    this.field1442 = true;
                }
                if (super.field31 >= 569 && super.field31 <= 599 && super.field32 >= 168 && super.field32 < 205 && this.field1490[1] != -1) {
                    this.field1381 = true;
                    this.field1482 = 1;
                    this.field1442 = true;
                }
                if (super.field31 >= 597 && super.field31 <= 627 && super.field32 >= 168 && super.field32 < 205 && this.field1490[2] != -1) {
                    this.field1381 = true;
                    this.field1482 = 2;
                    this.field1442 = true;
                }
                if (super.field31 >= 625 && super.field31 <= 669 && super.field32 >= 168 && super.field32 < 203 && this.field1490[3] != -1) {
                    this.field1381 = true;
                    this.field1482 = 3;
                    this.field1442 = true;
                }
                if (super.field31 >= 666 && super.field31 <= 696 && super.field32 >= 168 && super.field32 < 205 && this.field1490[4] != -1) {
                    this.field1381 = true;
                    this.field1482 = 4;
                    this.field1442 = true;
                }
                if (super.field31 >= 694 && super.field31 <= 724 && super.field32 >= 168 && super.field32 < 205 && this.field1490[5] != -1) {
                    this.field1381 = true;
                    this.field1482 = 5;
                    this.field1442 = true;
                }
                if (super.field31 >= 722 && super.field31 <= 756 && super.field32 >= 169 && super.field32 < 205 && this.field1490[6] != -1) {
                    this.field1381 = true;
                    this.field1482 = 6;
                    this.field1442 = true;
                }
                if (super.field31 >= 540 && super.field31 <= 574 && super.field32 >= 466 && super.field32 < 502 && this.field1490[7] != -1) {
                    this.field1381 = true;
                    this.field1482 = 7;
                    this.field1442 = true;
                }
                if (super.field31 >= 572 && super.field31 <= 602 && super.field32 >= 466 && super.field32 < 503 && this.field1490[8] != -1) {
                    this.field1381 = true;
                    this.field1482 = 8;
                    this.field1442 = true;
                }
                if (super.field31 >= 599 && super.field31 <= 629 && super.field32 >= 466 && super.field32 < 503 && this.field1490[9] != -1) {
                    this.field1381 = true;
                    this.field1482 = 9;
                    this.field1442 = true;
                }
                if (super.field31 >= 627 && super.field31 <= 671 && super.field32 >= 467 && super.field32 < 502 && this.field1490[10] != -1) {
                    this.field1381 = true;
                    this.field1482 = 10;
                    this.field1442 = true;
                }
                if (super.field31 >= 669 && super.field31 <= 699 && super.field32 >= 466 && super.field32 < 503 && this.field1490[11] != -1) {
                    this.field1381 = true;
                    this.field1482 = 11;
                    this.field1442 = true;
                }
                if (super.field31 >= 696 && super.field31 <= 726 && super.field32 >= 466 && super.field32 < 503 && this.field1490[12] != -1) {
                    this.field1381 = true;
                    this.field1482 = 12;
                    this.field1442 = true;
                }
                if (super.field31 >= 724 && super.field31 <= 758 && super.field32 >= 466 && super.field32 < 502 && this.field1490[13] != -1) {
                    this.field1381 = true;
                    this.field1482 = 13;
                    this.field1442 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        if (!arg0) {
            this.field1310 = -307;
        }
        if (this.field1623 == 0) {
            int var2 = super.field30;
            if (this.field1687 == 1 && super.field31 >= 516 && super.field32 >= 160 && super.field31 <= 765 && super.field32 <= 205) {
                var2 = 0;
            }
            if (this.field1593) {
                if (var2 != 1) {
                    int var3 = super.field24;
                    int var4 = super.field25;
                    if (this.field1531 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1531 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1531 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1532 - 10 || var3 > this.field1534 + this.field1532 + 10 || var4 < this.field1533 - 10 || var4 > this.field1535 + this.field1533 + 10) {
                        this.field1593 = false;
                        if (this.field1531 == 1) {
                            this.field1381 = true;
                        }
                        if (this.field1531 == 2) {
                            this.field1420 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1532;
                    int var6 = this.field1533;
                    int var7 = this.field1534;
                    int var8 = super.field31;
                    int var9 = super.field32;
                    if (this.field1531 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1531 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1531 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1459; ++var11) {
                        int var12 = (this.field1459 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method485(var10, 96);
                    }
                    this.field1593 = false;
                    if (this.field1531 == 1) {
                        this.field1381 = true;
                    }
                    if (this.field1531 == 2) {
                        this.field1420 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1459 > 0) {
                    int var13 = this.field1281[this.field1459 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1279[this.field1459 - 1];
                        int var15 = this.field1280[this.field1459 - 1];
                        Component var16 = Component.field71[var15];
                        if (var16.field98 || var16.field101) {
                            this.field1437 = false;
                            this.field1425 = 0;
                            this.field1621 = var15;
                            this.field1622 = var14;
                            this.field1623 = 2;
                            this.field1624 = super.field31;
                            this.field1625 = super.field32;
                            if (Component.field71[var15].field77 == this.field1567) {
                                this.field1623 = 1;
                            }
                            if (Component.field71[var15].field77 == this.field1241) {
                                this.field1623 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1343 == 1 || this.method466(this.field1459 - 1, (byte) 3)) && this.field1459 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1459 > 0) {
                    this.method485(this.field1459 - 1, 96);
                }
                if (var2 != 2 || this.field1459 <= 0) {
                    return;
                }
                this.method481(field1403);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method489(boolean arg0, int arg1) {
        if (arg0) {
            this.field1557 = !this.field1557;
        }
        if (!field1512) {
            if (Pix3D.field653[17] >= arg1) {
                Pix8 var3 = Pix3D.field647[17];
                int var4 = var3.field682 * var3.field681 - 1;
                int var5 = this.field1228 * var3.field681 * 2;
                byte[] var6 = var3.field679;
                byte[] var7 = this.field1331;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field679 = var7;
                this.field1331 = var6;
                Pix3D.method171(17, -571);
            }
            if (Pix3D.field653[24] >= arg1) {
                Pix8 var9 = Pix3D.field647[24];
                int var10 = var9.field682 * var9.field681 - 1;
                int var11 = this.field1228 * var9.field681 * 2;
                byte[] var12 = var9.field679;
                byte[] var13 = this.field1331;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field679 = var13;
                this.field1331 = var12;
                Pix3D.method171(24, -571);
            }
            if (Pix3D.field653[34] >= arg1) {
                Pix8 var15 = Pix3D.field647[34];
                int var16 = var15.field682 * var15.field681 - 1;
                int var17 = this.field1228 * var15.field681 * 2;
                byte[] var18 = var15.field679;
                byte[] var19 = this.field1331;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field679 = var19;
                this.field1331 = var18;
                Pix3D.method171(34, -571);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method490(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1345 = "";
                this.field1346 = "Connecting to server...";
                this.method518((byte) -16, true);
            }
            this.field1248 = new ClientStream(this, true, this.method562(field1510 + 43594));
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1613.field717 = 0;
            this.field1613.method219(14);
            this.field1613.method219(var6);
            this.field1248.method42(this.field1613.field716, (byte) -28, 2, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1248.method39();
            }
            int var8 = this.field1248.method39();
            int var9 = var8;
            if (var8 == 0) {
                this.field1248.method41(this.field1418.field716, 0, 8);
                this.field1418.field717 = 0;
                this.field1686 = this.field1418.method235(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1686 >> 32), (int) this.field1686 };
                this.field1613.field717 = 0;
                this.field1613.method219(10);
                this.field1613.method223(var10[0]);
                this.field1613.method223(var10[1]);
                this.field1613.method223(var10[2]);
                this.field1613.method223(var10[3]);
                this.field1613.method223(signlink.uid);
                this.field1613.method226(arg0);
                this.field1613.method226(arg1);
                this.field1613.method244(0, field1288, field1608);
                this.field1380.field717 = 0;
                if (arg2) {
                    this.field1380.method219(18);
                } else {
                    this.field1380.method219(16);
                }
                this.field1380.method219(this.field1613.field717 + 36 + 1 + 1 + 2);
                this.field1380.method219(255);
                this.field1380.method220(299);
                this.field1380.method219(field1512 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field1380.method223(this.field1497[var11]);
                }
                this.field1380.method227(0, this.field1613.field717, this.field1613.field716, 0);
                this.field1613.field721 = new Isaac(var10, this.field1612);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field1408 = new Isaac(var10, this.field1612);
                this.field1248.method42(this.field1380.field716, (byte) -28, this.field1380.field717, 0);
                var8 = this.field1248.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method490(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1332 = this.field1248.method39();
                field1495 = this.field1248.method39() == 1;
                this.field1234 = 0L;
                this.field1395 = 0;
                this.field1693.field1007 = 0;
                super.field21 = true;
                this.field1450 = true;
                this.field1398 = true;
                this.field1613.field717 = 0;
                this.field1418.field717 = 0;
                this.field1544 = -1;
                this.field1376 = -1;
                this.field1377 = -1;
                this.field1378 = -1;
                this.field1543 = 0;
                this.field1545 = 0;
                this.field1536 = 0;
                this.field1547 = 0;
                this.field1656 = 0;
                this.field1459 = 0;
                this.field1593 = false;
                super.field22 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field1335[var13] = null;
                }
                this.field1258 = 0;
                this.field1687 = 0;
                this.field1520 = 0;
                this.field1454 = 0;
                this.field1610 = (int) (Math.random() * 100.0D) - 50;
                this.field1421 = (int) (Math.random() * 110.0D) - 55;
                this.field1447 = (int) (Math.random() * 80.0D) - 40;
                this.field1660 = (int) (Math.random() * 120.0D) - 60;
                this.field1352 = (int) (Math.random() * 30.0D) - 20;
                this.field1588 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1493 = 0;
                this.field1529 = -1;
                this.field1360 = 0;
                this.field1361 = 0;
                this.field1476 = 0;
                this.field1684 = 0;
                for (int var14 = 0; var14 < this.field1473; ++var14) {
                    this.field1475[var14] = null;
                    this.field1480[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field1683[var15] = null;
                }
                field1369 = this.field1475[this.field1474] = new PlayerEntity();
                this.field1336.method252();
                this.field1607.method252();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field1290[var16][var17][var18] = null;
                        }
                    }
                }
                this.field1370 = new LinkList(6);
                this.field1633 = 0;
                this.field1632 = 0;
                this.field1636 = -1;
                this.field1241 = -1;
                this.field1567 = -1;
                this.field1555 = -1;
                this.field1456 = -1;
                this.field1289 = false;
                this.field1482 = 3;
                this.field1233 = false;
                this.field1593 = false;
                this.field1639 = false;
                this.field1692 = null;
                this.field1506 = 0;
                this.field1355 = -1;
                this.field1562 = true;
                this.method471(0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1550[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field1328[var20] = null;
                    this.field1329[var20] = false;
                }
                field1297 = 0;
                field1358 = 0;
                field1229 = 0;
                field1469 = 0;
                field1508 = 0;
                field1249 = 0;
                field1293 = 0;
                field1232 = 0;
                field1242 = 0;
                field1238 = 0;
                this.method497((byte) 4);
            } else if (var8 == 3) {
                this.field1345 = "";
                this.field1346 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1345 = "Your account has been disabled.";
                this.field1346 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1345 = "Your account is already logged in.";
                this.field1346 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1345 = "RuneScape has been updated!";
                this.field1346 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1345 = "This world is full.";
                this.field1346 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1345 = "Unable to connect.";
                this.field1346 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1345 = "Login limit exceeded.";
                this.field1346 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1345 = "Unable to connect.";
                this.field1346 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1346 = "Login server rejected session.";
                this.field1346 = "Please try again.";
            } else if (var8 == 12) {
                this.field1345 = "You need a members account to login to this world.";
                this.field1346 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1345 = "Could not complete login.";
                this.field1346 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1345 = "The server is being updated.";
                this.field1346 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1398 = true;
                this.field1613.field717 = 0;
                this.field1418.field717 = 0;
                this.field1544 = -1;
                this.field1376 = -1;
                this.field1377 = -1;
                this.field1378 = -1;
                this.field1543 = 0;
                this.field1545 = 0;
                this.field1536 = 0;
                this.field1459 = 0;
                this.field1593 = false;
                this.field1620 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1345 = "Login attempts exceeded.";
                this.field1346 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1345 = "You are standing in a members-only area.";
                this.field1346 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1345 = "Invalid loginserver requested";
                this.field1346 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field1551 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field1551;
                            this.method490(arg0, arg1, arg2);
                        } else {
                            this.field1345 = "No response from loginserver";
                            this.field1346 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field1345 = "No response from server";
                        this.field1346 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field1345 = "Unexpected server response";
                    this.field1346 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field1248.method39(); var21 >= 0; --var21) {
                    this.field1345 = "You have only just left another world";
                    this.field1346 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method518((byte) -16, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method490(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field1345 = "";
            this.field1346 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method491(byte arg0) {
        if (arg0 != 4) {
            this.field1613.method219(252);
        }
        if (this.field1530 != 0) {
            int var2 = 0;
            if (this.field1536 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1335[var3] != null) {
                    int var4 = this.field1333[var3];
                    String var5 = this.field1334[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1658 == 0 || this.field1658 == 1 && this.method435(var5, 458))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field24 > 4 && super.field25 - 4 > var9 - 10 && super.field25 - 4 <= var9 + 3) {
                            int var10 = this.field1674.method204((byte) 4, "From:  " + var5 + this.field1335[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field24 < var10 + 4) {
                                if (this.field1332 >= 1) {
                                    this.field1514[this.field1459] = "Report abuse @whi@" + var5;
                                    this.field1281[this.field1459] = 2524;
                                    ++this.field1459;
                                }
                                this.field1514[this.field1459] = "Add ignore @whi@" + var5;
                                this.field1281[this.field1459] = 2047;
                                ++this.field1459;
                                this.field1514[this.field1459] = "Add friend @whi@" + var5;
                                this.field1281[this.field1459] = 2605;
                                ++this.field1459;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1658 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method492(int arg0) {
        ++this.field1449;
        this.method514(true, 0);
        this.method524(true, 0);
        this.method514(false, 0);
        this.method524(false, 0);
        this.method516((byte) 29);
        this.method457(19748);
        if (!this.field1342) {
            int var2 = this.field1587;
            if (this.field1457 / 256 > var2) {
                var2 = this.field1457 / 256;
            }
            if (this.field1434[4] && this.field1409[4] + 128 > var2) {
                var2 = this.field1409[4] + 128;
            }
            int var3 = this.field1588 + this.field1447 & 2047;
            this.method519(var2, -13274, this.field1243, var2 * 3 + 600, this.field1244, this.method555(field1369.field399, this.field1295, -576, field1369.field400) - 50, var3);
        }
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5;
        if (!this.field1342) {
            var5 = this.method548(-32745);
        } else {
            var5 = this.method549(this.field1682);
        }
        int var6 = this.field1577;
        int var7 = this.field1578;
        int var8 = this.field1579;
        int var9 = this.field1580;
        int var10 = this.field1581;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1434[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1419[var11] * 2 + 1) - (double) this.field1419[var11] + Math.sin((double) this.field1576[var11] / 100.0D * (double) this.field1470[var11]) * (double) this.field1409[var11]);
                if (var11 == 0) {
                    this.field1577 += var13;
                }
                if (var11 == 1) {
                    this.field1578 += var13;
                }
                if (var11 == 2) {
                    this.field1579 += var13;
                }
                if (var11 == 3) {
                    this.field1581 = this.field1581 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1580 += var13;
                    if (this.field1580 < 128) {
                        this.field1580 = 128;
                    }
                    if (this.field1580 > 383) {
                        this.field1580 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field654;
        Model.field598 = true;
        Model.field601 = 0;
        Model.field599 = super.field24 - 4;
        Model.field600 = super.field25 - 4;
        Pix2D.method155(7);
        this.field1614.method89(this.field1577, 7, this.field1580, this.field1579, this.field1581, var5, this.field1578);
        this.field1614.method64(false);
        this.method453(true);
        this.method561(7);
        this.method489(false, var12);
        this.method512((byte) 1);
        this.field1272.method259(super.field16, 4, 4, true);
        this.field1577 = var6;
        this.field1578 = var7;
        this.field1579 = var8;
        this.field1580 = var9;
        this.field1581 = var10;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method493(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg1 == 0) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1335[var5] != null) {
                    int var6 = this.field1333[var5];
                    int var7 = 70 - var4 * 14 + this.field1231 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field1334[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1239 == 0 || this.field1239 == 1 && this.method435(var8, 458))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1369.field460)) {
                            if (this.field1332 >= 1) {
                                this.field1514[this.field1459] = "Report abuse @whi@" + var8;
                                this.field1281[this.field1459] = 524;
                                ++this.field1459;
                            }
                            this.field1514[this.field1459] = "Add ignore @whi@" + var8;
                            this.field1281[this.field1459] = 47;
                            ++this.field1459;
                            this.field1514[this.field1459] = "Add friend @whi@" + var8;
                            this.field1281[this.field1459] = 605;
                            ++this.field1459;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1530 == 0 && (var6 == 7 || this.field1658 == 0 || this.field1658 == 1 && this.method435(var8, 458))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field1332 >= 1) {
                                this.field1514[this.field1459] = "Report abuse @whi@" + var8;
                                this.field1281[this.field1459] = 524;
                                ++this.field1459;
                            }
                            this.field1514[this.field1459] = "Add ignore @whi@" + var8;
                            this.field1281[this.field1459] = 47;
                            ++this.field1459;
                            this.field1514[this.field1459] = "Add friend @whi@" + var8;
                            this.field1281[this.field1459] = 605;
                            ++this.field1459;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field1400 == 0 || this.field1400 == 1 && this.method435(var8, 458))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field1514[this.field1459] = "Accept trade @whi@" + var8;
                            this.field1281[this.field1459] = 507;
                            ++this.field1459;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1530 == 0 && this.field1658 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field1400 == 0 || this.field1400 == 1 && this.method435(var8, 458))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field1514[this.field1459] = "Accept challenge @whi@" + var8;
                            this.field1281[this.field1459] = 957;
                            ++this.field1459;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBLlb;)V")
    private final void method494(int arg0, byte arg1, Packet arg2) {
        while (true) {
            if (arg2.field718 + 21 < arg0 * 8) {
                int var4 = arg2.method240(477, 14);
                if (var4 != 16383) {
                    if (this.field1683[var4] == null) {
                        this.field1683[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1683[var4];
                    this.field1685[this.field1684++] = var4;
                    var5.field444 = field1401;
                    var5.field457 = NpcType.method341(arg2.method240(477, 12));
                    var5.field403 = var5.field457.field1020;
                    var5.field447 = var5.field457.field1042;
                    var5.field406 = var5.field457.field1024;
                    var5.field407 = var5.field457.field1025;
                    var5.field408 = var5.field457.field1026;
                    var5.field409 = var5.field457.field1027;
                    var5.field404 = var5.field457.field1023;
                    int var6 = arg2.method240(477, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method240(477, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method240(477, 1);
                    var5.method110(field1369.field450[0] + var7, (byte) 7, var8 == 1, field1369.field449[0] + var6);
                    int var9 = arg2.method240(477, 1);
                    if (var9 == 1) {
                        this.field1479[this.field1478++] = var4;
                    }
                    continue;
                }
            }
            arg2.method241(312);
            if (arg1 != 115) {
                this.field1613.method219(141);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method495(int arg0, int arg1, byte[] arg2) {
        this.field1543 += arg1;
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public static final void method496(int arg0) {
        World3D.field283 = false;
        Pix3D.field634 = false;
        if (arg0 == 0) {
            field1512 = false;
            World.field43 = false;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 299);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1509 = Integer.parseInt(arg0[0]);
                field1510 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method458(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method496(0);
                }
                if (arg0[3].equals("free")) {
                    field1511 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1511 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 503, 0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method497(byte arg0) {
        if (this.field1273 == null) {
            this.method440(true);
            super.field17 = null;
            this.field1662 = null;
            this.field1663 = null;
            this.field1664 = null;
            this.field1665 = null;
            this.field1666 = null;
            this.field1667 = null;
            this.field1668 = null;
            this.field1669 = null;
            this.field1670 = null;
            this.field1273 = new PixMap(this.method11(1), (byte) 3, 96, 479);
            this.field1271 = new PixMap(this.method11(1), (byte) 3, 156, 172);
            Pix2D.method155(7);
            this.field1316.method199(0, 0, 37651);
            this.field1270 = new PixMap(this.method11(1), (byte) 3, 261, 190);
            this.field1272 = new PixMap(this.method11(1), (byte) 3, 334, 512);
            if (arg0 == 4) {
                boolean var2 = false;
            } else {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            Pix2D.method155(7);
            this.field1563 = new PixMap(this.method11(1), (byte) 3, 50, 496);
            this.field1564 = new PixMap(this.method11(1), (byte) 3, 37, 269);
            this.field1565 = new PixMap(this.method11(1), (byte) 3, 45, 249);
            this.field1430 = true;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)Z")
    public final boolean method498(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field1248 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1248.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1544 == -1) {
                    this.field1248.method41(this.field1418.field716, 0, 1);
                    this.field1544 = this.field1418.field716[0] & 255;
                    if (this.field1408 != null) {
                        this.field1544 = this.field1544 - this.field1408.method295() & 255;
                    }
                    this.field1543 = Protocol.field1099[this.field1544];
                    --var2;
                }
                if (this.field1543 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1248.method41(this.field1418.field716, 0, 1);
                    this.field1543 = this.field1418.field716[0] & 255;
                    --var2;
                }
                if (this.field1543 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1248.method41(this.field1418.field716, 0, 2);
                    this.field1418.field717 = 0;
                    this.field1543 = this.field1418.method231();
                    var2 -= 2;
                }
                if (var2 < this.field1543) {
                    return false;
                }
                this.field1418.field717 = 0;
                this.field1248.method41(this.field1418.field716, 0, this.field1543);
                this.field1545 = 0;
                this.field1378 = this.field1377;
                this.field1377 = this.field1376;
                this.field1376 = this.field1544;
                if (this.field1544 == 238) {
                    String var3 = this.field1418.method236();
                    if (var3.endsWith(":tradereq:")) {
                        String var4 = var3.substring(0, var3.indexOf(":"));
                        long var5 = JString.method300(var4);
                        boolean var7 = false;
                        for (int var8 = 0; var8 < this.field1359; ++var8) {
                            if (this.field1595[var8] == var5) {
                                var7 = true;
                                break;
                            }
                        }
                        if (!var7 && this.field1566 == 0) {
                            this.method559(176, 4, var4, "wishes to trade with you.");
                        }
                    } else if (var3.endsWith(":duelreq:")) {
                        String var9 = var3.substring(0, var3.indexOf(":"));
                        long var10 = JString.method300(var9);
                        boolean var12 = false;
                        for (int var13 = 0; var13 < this.field1359; ++var13) {
                            if (this.field1595[var13] == var10) {
                                var12 = true;
                                break;
                            }
                        }
                        if (!var12 && this.field1566 == 0) {
                            this.method559(176, 8, var9, "wishes to duel with you.");
                        }
                    } else if (!var3.endsWith(":chalreq:")) {
                        this.method559(176, 0, "", var3);
                    } else {
                        String var14 = var3.substring(0, var3.indexOf(":"));
                        long var15 = JString.method300(var14);
                        boolean var17 = false;
                        for (int var18 = 0; var18 < this.field1359; ++var18) {
                            if (this.field1595[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                        if (!var17 && this.field1566 == 0) {
                            String var19 = var3.substring(var3.indexOf(":") + 1, var3.length() - 9);
                            this.method559(176, 8, var14, var19);
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 118) {
                    this.field1633 = this.field1418.method229();
                    this.field1381 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 75) {
                    this.method542(true);
                    this.field1544 = -1;
                    return false;
                }
                if (this.field1544 == 169) {
                    int var20 = this.field1418.method231();
                    String var21 = this.field1418.method236();
                    Component.field71[var20].field112 = var21;
                    if (this.field1490[this.field1482] == Component.field71[var20].field77) {
                        this.field1381 = true;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 196) {
                    this.method507(this.field1543, 0, this.field1418);
                    this.field1423 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 108) {
                    this.field1491 = this.field1418.method229();
                    this.field1492 = this.field1418.method229();
                    while (this.field1418.field717 < this.field1543) {
                        int var22 = this.field1418.method229();
                        this.method464(true, this.field1418, var22);
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 188) {
                    this.field1381 = true;
                    int var23 = this.field1418.method231();
                    Component var24 = Component.field71[var23];
                    int var25 = this.field1418.method231();
                    for (int var26 = 0; var26 < var25; ++var26) {
                        var24.field72[var26] = this.field1418.method231();
                        int var27 = this.field1418.method229();
                        if (var27 == 255) {
                            var27 = this.field1418.method234();
                        }
                        var24.field73[var26] = var27;
                    }
                    for (int var28 = var25; var28 < var24.field72.length; ++var28) {
                        var24.field72[var28] = 0;
                        var24.field73[var28] = 0;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 195) {
                    this.method450(this.field1543, (byte) 5, this.field1418);
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 170) {
                    int var29 = this.field1418.method231();
                    int var30 = this.field1418.method231();
                    if (this.field1254 == var29 && this.field1255 == var30 && this.field1520 == 2) {
                        this.field1544 = -1;
                        return true;
                    }
                    this.field1254 = var29;
                    this.field1255 = var30;
                    this.field1461 = (this.field1254 - 6) * 8;
                    this.field1462 = (this.field1255 - 6) * 8;
                    this.field1679 = false;
                    if ((this.field1254 / 8 == 48 || this.field1254 / 8 == 49) && this.field1255 / 8 == 48) {
                        this.field1679 = true;
                    }
                    if (this.field1254 / 8 == 48 && this.field1255 / 8 == 148) {
                        this.field1679 = true;
                    }
                    this.field1520 = 1;
                    this.field1620 = System.currentTimeMillis();
                    this.field1272.method258(this.field1310);
                    this.field1674.method202("Loading - please wait.", 151, 0, 257, this.field1356);
                    this.field1674.method202("Loading - please wait.", 150, 16777215, 256, this.field1356);
                    this.field1272.method259(super.field16, 4, 4, true);
                    int var31 = 0;
                    for (int var32 = (this.field1254 - 6) / 8; var32 <= (this.field1254 + 6) / 8; ++var32) {
                        for (int var33 = (this.field1255 - 6) / 8; var33 <= (this.field1255 + 6) / 8; ++var33) {
                            ++var31;
                        }
                    }
                    this.field1364 = new byte[var31][];
                    this.field1318 = new byte[var31][];
                    this.field1322 = new int[var31];
                    this.field1323 = new int[var31];
                    this.field1324 = new int[var31];
                    int var34 = 0;
                    for (int var35 = (this.field1254 - 6) / 8; var35 <= (this.field1254 + 6) / 8; ++var35) {
                        for (int var36 = (this.field1255 - 6) / 8; var36 <= (this.field1255 + 6) / 8; ++var36) {
                            this.field1322[var34] = (var35 << 8) + var36;
                            if (!this.field1679 || var36 != 49 && var36 != 149 && var36 != 147 && var35 != 50 && (var35 != 49 || var36 != 47)) {
                                int var37 = this.field1323[var34] = this.field1528.method274(var36, 905, 0, var35);
                                if (var37 != -1) {
                                    this.field1528.method279(3, var37);
                                }
                                int var38 = this.field1324[var34] = this.field1528.method274(var36, 905, 1, var35);
                                if (var38 != -1) {
                                    this.field1528.method279(3, var38);
                                }
                                ++var34;
                            } else {
                                this.field1323[var34] = -1;
                                this.field1324[var34] = -1;
                                ++var34;
                            }
                        }
                    }
                    int var39 = this.field1461 - this.field1463;
                    int var40 = this.field1462 - this.field1464;
                    this.field1463 = this.field1461;
                    this.field1464 = this.field1462;
                    for (int var41 = 0; var41 < 16384; ++var41) {
                        NpcEntity var42 = this.field1683[var41];
                        if (var42 != null) {
                            for (int var43 = 0; var43 < 10; ++var43) {
                                var42.field449[var43] -= var39;
                                var42.field450[var43] -= var40;
                            }
                            var42.field399 -= var39 * 128;
                            var42.field400 -= var40 * 128;
                        }
                    }
                    for (int var44 = 0; var44 < this.field1473; ++var44) {
                        PlayerEntity var45 = this.field1475[var44];
                        if (var45 != null) {
                            for (int var46 = 0; var46 < 10; ++var46) {
                                var45.field449[var46] -= var39;
                                var45.field450[var46] -= var40;
                            }
                            var45.field399 -= var39 * 128;
                            var45.field400 -= var40 * 128;
                        }
                    }
                    this.field1423 = true;
                    byte var47 = 0;
                    byte var48 = 104;
                    byte var49 = 1;
                    if (var39 < 0) {
                        var47 = 103;
                        var48 = -1;
                        var49 = -1;
                    }
                    byte var50 = 0;
                    byte var51 = 104;
                    byte var52 = 1;
                    if (var40 < 0) {
                        var50 = 103;
                        var51 = -1;
                        var52 = -1;
                    }
                    for (int var53 = var47; var48 != var53; var53 += var49) {
                        for (int var54 = var50; var51 != var54; var54 += var52) {
                            int var55 = var39 + var53;
                            int var56 = var40 + var54;
                            for (int var57 = 0; var57 < 4; ++var57) {
                                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                                    this.field1290[var57][var53][var54] = this.field1290[var57][var55][var56];
                                } else {
                                    this.field1290[var57][var53][var54] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var58 = (LocSpawned) this.field1370.method248(); var58 != null; var58 = (LocSpawned) this.field1370.method250(0)) {
                        var58.field737 -= var39;
                        var58.field738 -= var40;
                        if (var58.field737 < 0 || var58.field738 < 0 || var58.field737 >= 104 || var58.field738 >= 104) {
                            var58.method106();
                        }
                    }
                    if (this.field1360 != 0) {
                        this.field1360 -= var39;
                        this.field1361 -= var40;
                    }
                    this.field1342 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 83) {
                    this.field1360 = 0;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 213) {
                    int var59 = this.field1418.method231();
                    byte var60 = this.field1418.method230();
                    this.field1594[var59] = var60;
                    if (this.field1384[var59] != var60) {
                        this.field1384[var59] = var60;
                        this.method550(var59, this.field1574);
                        this.field1381 = true;
                        if (this.field1636 != -1) {
                            this.field1420 = true;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 153) {
                    int var61 = this.field1418.method231();
                    int var62 = this.field1418.method231();
                    int var63 = this.field1418.method231();
                    if (var62 == 65535) {
                        Component.field71[var61].field120 = 0;
                        this.field1544 = -1;
                        return true;
                    }
                    ObjType var64 = ObjType.method348(var62);
                    Component.field71[var61].field120 = 4;
                    Component.field71[var61].field121 = var62;
                    Component.field71[var61].field127 = var64.field1063;
                    Component.field71[var61].field128 = var64.field1064;
                    Component.field71[var61].field126 = var64.field1062 * 100 / var63;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 19) {
                    this.field1506 = this.field1418.method229();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 212) {
                    if (this.field1555 != -1) {
                        this.field1555 = -1;
                        this.field1381 = true;
                        this.field1442 = true;
                    }
                    if (this.field1241 != -1) {
                        this.field1241 = -1;
                        this.field1420 = true;
                    }
                    if (this.field1233) {
                        this.field1233 = false;
                        this.field1420 = true;
                    }
                    this.field1567 = -1;
                    this.field1289 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 186) {
                    int var65 = this.field1418.method231();
                    int var66 = this.field1418.method232();
                    Component var67 = Component.field71[var65];
                    var67.field124 = var66;
                    if (var66 == -1) {
                        var67.field74 = 0;
                        var67.field75 = 0;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 33) {
                    this.field1237 = this.field1418.method231();
                    this.field1539 = this.field1418.method229();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 181) {
                    this.field1355 = this.field1418.method229();
                    if (this.field1482 == this.field1355) {
                        if (this.field1355 == 3) {
                            this.field1482 = 1;
                        } else {
                            this.field1482 = 3;
                        }
                        this.field1381 = true;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 138) {
                    this.field1342 = false;
                    for (int var68 = 0; var68 < 5; ++var68) {
                        this.field1434[var68] = false;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 55) {
                    this.field1656 = this.field1418.method229();
                    if (this.field1656 == 1) {
                        this.field1274 = this.field1418.method231();
                    }
                    if (this.field1656 >= 2 && this.field1656 <= 6) {
                        if (this.field1656 == 2) {
                            this.field1286 = 64;
                            this.field1287 = 64;
                        }
                        if (this.field1656 == 3) {
                            this.field1286 = 0;
                            this.field1287 = 64;
                        }
                        if (this.field1656 == 4) {
                            this.field1286 = 128;
                            this.field1287 = 64;
                        }
                        if (this.field1656 == 5) {
                            this.field1286 = 64;
                            this.field1287 = 0;
                        }
                        if (this.field1656 == 6) {
                            this.field1286 = 64;
                            this.field1287 = 128;
                        }
                        this.field1656 = 2;
                        this.field1283 = this.field1418.method231();
                        this.field1284 = this.field1418.method231();
                        this.field1285 = this.field1418.method229();
                    }
                    if (this.field1656 == 10) {
                        this.field1314 = this.field1418.method231();
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 105) {
                    this.field1359 = this.field1543 / 8;
                    for (int var69 = 0; var69 < this.field1359; ++var69) {
                        this.field1595[var69] = this.field1418.method235(0);
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 145) {
                    int var70 = this.field1418.method231();
                    int var71 = this.field1418.method234();
                    this.field1594[var70] = var71;
                    if (this.field1384[var70] != var71) {
                        this.field1384[var70] = var71;
                        this.method550(var70, this.field1574);
                        this.field1381 = true;
                        if (this.field1636 != -1) {
                            this.field1420 = true;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 44) {
                    this.field1491 = this.field1418.method229();
                    this.field1492 = this.field1418.method229();
                    for (int var72 = this.field1491; var72 < this.field1491 + 8; ++var72) {
                        for (int var73 = this.field1492; var73 < this.field1492 + 8; ++var73) {
                            if (this.field1290[this.field1295][var72][var73] != null) {
                                this.field1290[this.field1295][var72][var73] = null;
                                this.method508(var72, var73);
                            }
                        }
                    }
                    for (LocSpawned var74 = (LocSpawned) this.field1370.method248(); var74 != null; var74 = (LocSpawned) this.field1370.method250(0)) {
                        if (var74.field737 >= this.field1491 && var74.field737 < this.field1491 + 8 && var74.field738 >= this.field1492 && var74.field738 < this.field1492 + 8 && this.field1295 == var74.field735) {
                            var74.field746 = 0;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 141) {
                    int var75 = this.field1418.method231();
                    int var76 = this.field1418.method229();
                    if (var75 == 65535) {
                        var75 = -1;
                    }
                    this.field1490[var76] = var75;
                    this.field1381 = true;
                    this.field1442 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 38) {
                    int var77 = this.field1418.method231();
                    if (var77 == 65535) {
                        var77 = -1;
                    }
                    if (this.field1424 != var77 && this.field1609 && !field1512 && this.field1399 == 0) {
                        this.field1525 = var77;
                        this.field1526 = true;
                        this.field1528.method279(2, this.field1525);
                    }
                    this.field1424 = var77;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 183) {
                    int var78 = this.field1418.method231();
                    int var79 = this.field1418.method231();
                    if (this.field1609 && !field1512) {
                        this.field1525 = var78;
                        this.field1526 = false;
                        this.field1528.method279(2, this.field1525);
                        this.field1399 = var79;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 85) {
                    int var80 = this.field1418.method231();
                    int var81 = this.field1418.method231();
                    Component var82 = Component.field71[var80];
                    if (var82 != null && var82.field78 == 0) {
                        if (var81 < 0) {
                            var81 = 0;
                        }
                        if (var81 > var82.field90 - var82.field82) {
                            var81 = var82.field90 - var82.field82;
                        }
                        var82.field91 = var81;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 111) {
                    for (int var83 = 0; var83 < this.field1475.length; ++var83) {
                        if (this.field1475[var83] != null) {
                            this.field1475[var83].field427 = -1;
                        }
                    }
                    for (int var84 = 0; var84 < this.field1683.length; ++var84) {
                        if (this.field1683[var84] != null) {
                            this.field1683[var84].field427 = -1;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 77) {
                    int var85 = this.field1418.method231();
                    this.method544(var85, false);
                    if (this.field1555 != -1) {
                        this.field1555 = -1;
                        this.field1381 = true;
                        this.field1442 = true;
                    }
                    this.field1241 = var85;
                    this.field1420 = true;
                    this.field1567 = -1;
                    this.field1289 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 3) {
                    this.field1482 = this.field1418.method229();
                    this.field1381 = true;
                    this.field1442 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 81) {
                    int var86 = this.field1418.method231();
                    int var87 = this.field1418.method231();
                    int var88 = this.field1418.method231();
                    int var89 = this.field1418.method231();
                    Component.field71[var86].field127 = var87;
                    Component.field71[var86].field128 = var88;
                    Component.field71[var86].field126 = var89;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 22) {
                    this.field1491 = this.field1418.method229();
                    this.field1492 = this.field1418.method229();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 185) {
                    int var90 = this.field1418.method231();
                    int var91 = this.field1418.method231();
                    Component.field71[var90].field120 = 1;
                    Component.field71[var90].field121 = var91;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 13) {
                    this.field1381 = true;
                    int var92 = this.field1418.method231();
                    Component var93 = Component.field71[var92];
                    while (this.field1418.field717 < this.field1543) {
                        int var94 = this.field1418.method243();
                        int var95 = this.field1418.method231();
                        int var96 = this.field1418.method229();
                        if (var96 == 255) {
                            var96 = this.field1418.method234();
                        }
                        if (var94 >= 0 && var94 < var93.field72.length) {
                            var93.field72[var94] = var95;
                            var93.field73[var94] = var96;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 214) {
                    int var97 = this.field1418.method231();
                    int var98 = this.field1418.method231();
                    int var99 = var98 >> 10 & 31;
                    int var100 = var98 >> 5 & 31;
                    int var101 = var98 & 31;
                    Component.field71[var97].field114 = (var101 << 3) + (var99 << 19) + (var100 << 11);
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 98) {
                    int var102 = this.field1418.method229();
                    int var103 = this.field1418.method229();
                    String var104 = this.field1418.method236();
                    if (var102 >= 1 && var102 <= 5) {
                        if (var104.equalsIgnoreCase("null")) {
                            var104 = null;
                        }
                        this.field1328[var102 - 1] = var104;
                        this.field1329[var102 - 1] = var103 == 0;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 204) {
                    int var105 = this.field1418.method231();
                    Component var106 = Component.field71[var105];
                    for (int var107 = 0; var107 < var106.field72.length; ++var107) {
                        var106.field72[var107] = -1;
                        var106.field72[var107] = 0;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 156) {
                    if (this.field1482 == 12) {
                        this.field1381 = true;
                    }
                    this.field1553 = this.field1418.method232();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 151) {
                    this.field1381 = true;
                    int var108 = this.field1418.method229();
                    int var109 = this.field1418.method234();
                    int var110 = this.field1418.method229();
                    this.field1402[var108] = var109;
                    this.field1236[var108] = var110;
                    this.field1427[var108] = 1;
                    for (int var111 = 0; var111 < 98; ++var111) {
                        if (var109 >= field1500[var111]) {
                            this.field1427[var108] = var111 + 2;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 222 || this.field1544 == 253 || this.field1544 == 191 || this.field1544 == 137 || this.field1544 == 193 || this.field1544 == 30 || this.field1544 == 53 || this.field1544 == 147 || this.field1544 == 2 || this.field1544 == 211 || this.field1544 == 136) {
                    this.method464(true, this.field1418, this.field1544);
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 45) {
                    int var112 = this.field1418.method231();
                    int var113 = this.field1418.method229();
                    int var114 = this.field1418.method231();
                    if (this.field1592 && !field1512 && this.field1454 < 50) {
                        this.field1321[this.field1454] = var112;
                        this.field1626[this.field1454] = var113;
                        this.field1269[this.field1454] = Wave.field922[var112] + var114;
                        ++this.field1454;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 62) {
                    this.field1639 = false;
                    this.field1233 = true;
                    this.field1451 = "";
                    this.field1420 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 149) {
                    long var115 = this.field1418.method235(0);
                    int var117 = this.field1418.method229();
                    String var118 = JString.method304(943, JString.method301(0, var115));
                    for (int var119 = 0; var119 < this.field1632; ++var119) {
                        if (this.field1436[var119] == var115) {
                            if (this.field1357[var119] != var117) {
                                this.field1357[var119] = var117;
                                this.field1381 = true;
                                if (var117 > 0) {
                                    this.method559(176, 5, "", var118 + " has logged in.");
                                }
                                if (var117 == 0) {
                                    this.method559(176, 5, "", var118 + " has logged out.");
                                }
                            }
                            var118 = null;
                            break;
                        }
                    }
                    if (var118 != null && this.field1632 < 200) {
                        this.field1436[this.field1632] = var115;
                        this.field1627[this.field1632] = var118;
                        this.field1357[this.field1632] = var117;
                        ++this.field1632;
                        this.field1381 = true;
                    }
                    boolean var120 = false;
                    while (!var120) {
                        var120 = true;
                        for (int var121 = 0; var121 < this.field1632 - 1; ++var121) {
                            if (this.field1357[var121] != field1509 && this.field1357[var121 + 1] == field1509 || this.field1357[var121] == 0 && this.field1357[var121 + 1] != 0) {
                                int var122 = this.field1357[var121];
                                this.field1357[var121] = this.field1357[var121 + 1];
                                this.field1357[var121 + 1] = var122;
                                String var123 = this.field1627[var121];
                                this.field1627[var121] = this.field1627[var121 + 1];
                                this.field1627[var121 + 1] = var123;
                                long var124 = this.field1436[var121];
                                this.field1436[var121] = this.field1436[var121 + 1];
                                this.field1436[var121 + 1] = var124;
                                this.field1381 = true;
                                var120 = false;
                            }
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 226) {
                    for (int var126 = 0; var126 < this.field1384.length; ++var126) {
                        if (this.field1594[var126] != this.field1384[var126]) {
                            this.field1384[var126] = this.field1594[var126];
                            this.method550(var126, this.field1574);
                            this.field1381 = true;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 131) {
                    this.field1493 = this.field1418.method229();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 9) {
                    int var127 = this.field1418.method232();
                    this.field1636 = var127;
                    this.field1420 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 237) {
                    int var128 = this.field1418.method231();
                    this.method544(var128, false);
                    if (this.field1241 != -1) {
                        this.field1241 = -1;
                        this.field1420 = true;
                    }
                    if (this.field1233) {
                        this.field1233 = false;
                        this.field1420 = true;
                    }
                    this.field1555 = var128;
                    this.field1381 = true;
                    this.field1442 = true;
                    this.field1567 = -1;
                    this.field1289 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 115) {
                    this.field1342 = true;
                    this.field1390 = this.field1418.method229();
                    this.field1391 = this.field1418.method229();
                    this.field1392 = this.field1418.method231();
                    this.field1393 = this.field1418.method229();
                    this.field1394 = this.field1418.method229();
                    if (this.field1394 >= 100) {
                        this.field1577 = this.field1390 * 128 + 64;
                        this.field1579 = this.field1391 * 128 + 64;
                        this.field1578 = this.method555(this.field1577, this.field1295, -576, this.field1579) - this.field1392;
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 224) {
                    long var129 = this.field1418.method235(0);
                    int var131 = this.field1418.method234();
                    int var132 = this.field1418.method229();
                    boolean var133 = false;
                    for (int var134 = 0; var134 < 100; ++var134) {
                        if (this.field1631[var134] == var131) {
                            var133 = true;
                            break;
                        }
                    }
                    if (var132 <= 1) {
                        for (int var135 = 0; var135 < this.field1359; ++var135) {
                            if (this.field1595[var135] == var129) {
                                var133 = true;
                                break;
                            }
                        }
                    }
                    if (!var133 && this.field1566 == 0) {
                        try {
                            this.field1631[this.field1502] = var131;
                            this.field1502 = (this.field1502 + 1) % 100;
                            String var136 = WordPack.method306(this.field1543 - 13, this.field1418, 9);
                            String var137 = WordFilter.method401(-212, var136);
                            if (var132 != 2 && var132 != 3) {
                                if (var132 == 1) {
                                    this.method559(176, 7, "@cr1@" + JString.method304(943, JString.method301(0, var129)), var137);
                                } else {
                                    this.method559(176, 3, JString.method304(943, JString.method301(0, var129)), var137);
                                }
                            } else {
                                this.method559(176, 7, "@cr2@" + JString.method304(943, JString.method301(0, var129)), var137);
                            }
                        } catch (Exception var168) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 51) {
                    int var139 = this.field1418.method231();
                    boolean var140 = this.field1418.method229() == 1;
                    Component.field71[var139].field92 = var140;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 7) {
                    int var141 = this.field1418.method231();
                    int var142 = this.field1418.method231();
                    Component.field71[var141].field120 = 2;
                    Component.field71[var141].field121 = var142;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 130) {
                    int var143 = this.field1418.method231();
                    int var144 = this.field1418.method232();
                    int var145 = this.field1418.method232();
                    Component var146 = Component.field71[var143];
                    var146.field84 = var144;
                    var146.field85 = var145;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 245) {
                    int var147 = this.field1418.method231();
                    int var148 = this.field1418.method231();
                    if (this.field1241 != -1) {
                        this.field1241 = -1;
                        this.field1420 = true;
                    }
                    if (this.field1233) {
                        this.field1233 = false;
                        this.field1420 = true;
                    }
                    this.field1567 = var147;
                    this.field1555 = var148;
                    this.field1381 = true;
                    this.field1442 = true;
                    this.field1289 = false;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 246) {
                    int var149 = this.field1418.method232();
                    if (var149 >= 0) {
                        this.method544(var149, false);
                    }
                    this.field1456 = var149;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 92) {
                    int var150 = this.field1418.method229();
                    int var151 = this.field1418.method229();
                    int var152 = this.field1418.method229();
                    int var153 = this.field1418.method229();
                    this.field1434[var150] = true;
                    this.field1419[var150] = var151;
                    this.field1409[var150] = var152;
                    this.field1576[var150] = var153;
                    this.field1470[var150] = 0;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 228) {
                    this.field1536 = this.field1418.method231() * 30;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 94) {
                    int var154 = this.field1418.method231();
                    Component.field71[var154].field120 = 3;
                    if (field1369.field482 == null) {
                        Component.field71[var154].field121 = (field1369.field464[11] << 5) + (field1369.field464[8] << 10) + (field1369.field464[0] << 15) + (field1369.field465[0] << 25) + (field1369.field465[4] << 20) + field1369.field464[1];
                    } else {
                        Component.field71[var154].field121 = (int) (field1369.field482.field1017 + 305419896L);
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 206) {
                    this.field1239 = this.field1418.method229();
                    this.field1658 = this.field1418.method229();
                    this.field1400 = this.field1418.method229();
                    this.field1251 = true;
                    this.field1420 = true;
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 27) {
                    if (this.field1482 == 12) {
                        this.field1381 = true;
                    }
                    this.field1575 = this.field1418.method229();
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 241) {
                    this.field1342 = true;
                    this.field1640 = this.field1418.method229();
                    this.field1641 = this.field1418.method229();
                    this.field1642 = this.field1418.method231();
                    this.field1643 = this.field1418.method229();
                    this.field1644 = this.field1418.method229();
                    if (this.field1644 >= 100) {
                        int var155 = this.field1640 * 128 + 64;
                        int var156 = this.field1641 * 128 + 64;
                        int var157 = this.method555(var155, this.field1295, -576, var156) - this.field1642;
                        int var158 = var155 - this.field1577;
                        int var159 = var157 - this.field1578;
                        int var160 = var156 - this.field1579;
                        int var161 = (int) Math.sqrt((double) (var158 * var158 + var160 * var160));
                        this.field1580 = (int) (Math.atan2((double) var159, (double) var161) * 325.949D) & 2047;
                        this.field1581 = (int) (Math.atan2((double) var158, (double) var160) * -325.949D) & 2047;
                        if (this.field1580 < 128) {
                            this.field1580 = 128;
                        }
                        if (this.field1580 > 383) {
                            this.field1580 = 383;
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 119) {
                    this.field1638 = this.field1418.method234();
                    this.field1367 = this.field1418.method231();
                    this.field1586 = this.field1418.method229();
                    this.field1375 = this.field1418.method231();
                    this.field1252 = this.field1418.method229();
                    if (this.field1638 != 0 && this.field1567 == -1) {
                        signlink.dnslookup(JString.method303(this.field1638, true));
                        this.method475(true);
                        short var162 = 650;
                        if (this.field1586 != 201 || this.field1252 == 1) {
                            var162 = 655;
                        }
                        this.field1452 = "";
                        this.field1645 = false;
                        for (int var163 = 0; var163 < Component.field71.length; ++var163) {
                            if (Component.field71[var163] != null && Component.field71[var163].field80 == var162) {
                                this.field1567 = Component.field71[var163].field77;
                                break;
                            }
                        }
                    }
                    this.field1544 = -1;
                    return true;
                }
                if (this.field1544 == 236) {
                    int var164 = this.field1418.method231();
                    this.method544(var164, false);
                    if (this.field1555 != -1) {
                        this.field1555 = -1;
                        this.field1381 = true;
                        this.field1442 = true;
                    }
                    if (this.field1241 != -1) {
                        this.field1241 = -1;
                        this.field1420 = true;
                    }
                    if (this.field1233) {
                        this.field1233 = false;
                        this.field1420 = true;
                    }
                    this.field1567 = var164;
                    this.field1289 = false;
                    this.field1544 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1544 + "," + this.field1543 + " - " + this.field1377 + "," + this.field1378);
                this.method542(true);
            } catch (IOException var169) {
                this.method515(-784);
            } catch (Exception var170) {
                String var166 = "T2 - " + this.field1544 + "," + this.field1377 + "," + this.field1378 + " - " + this.field1543 + "," + (field1369.field449[0] + this.field1461) + "," + (field1369.field450[0] + this.field1462) + " - ";
                for (int var167 = 0; var167 < this.field1543 && var167 < 50; ++var167) {
                    var166 = var166 + this.field1418.field716[var167] + ",";
                }
                signlink.reporterror(var166);
                this.method542(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method499(int arg0, int arg1, int arg2) {
        this.field1543 += arg1;
        boolean var4 = false;
        Component var5 = Component.field71[arg2];
        for (int var6 = 0; var6 < var5.field93.length && var5.field93[var6] != -1; ++var6) {
            Component var7 = Component.field71[var5.field93[var6]];
            if (var7.field78 == 1) {
                var4 |= this.method499(arg0, 0, var7.field76);
            }
            if (var7.field78 == 6 && (var7.field124 != -1 || var7.field125 != -1)) {
                boolean var8 = this.method500(var7, true);
                int var9;
                if (var8) {
                    var9 = var7.field125;
                } else {
                    var9 = var7.field124;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1149[var9];
                    var7.field75 += arg0;
                    while (var7.field75 > var10.method382(-574, var7.field74)) {
                        var7.field75 -= var10.method382(-574, var7.field74) + 1;
                        ++var7.field74;
                        if (var7.field74 >= var10.field1150) {
                            var7.field74 -= var10.field1154;
                            if (var7.field74 < 0 || var7.field74 >= var10.field1150) {
                                var7.field74 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method500(Component arg0, boolean arg1) {
        if (arg0.field87 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field87.length; ++var3) {
                int var4 = this.method433(arg0, (byte) -11, var3);
                int var5 = arg0.field88[var3];
                if (arg0.field87[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field87[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field87[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (!arg1) {
                this.field1613.method219(87);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method501(String arg0) throws IOException {
        if (!this.field1556) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1504 != null) {
                try {
                    this.field1504.close();
                } catch (Exception var4) {
                }
                this.field1504 = null;
            }
            this.field1504 = this.method562(43595);
            this.field1504.setSoTimeout(10000);
            InputStream var2 = this.field1504.getInputStream();
            OutputStream var3 = this.field1504.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method502(int arg0) {
        this.field1543 += arg0;
        ++field1250;
        if (field1250 > 192) {
            field1250 = 0;
            this.field1613.method218(true, 24);
            this.field1613.method219(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(-203);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1567 != -1 && this.field1567 == this.field1496) {
                        if (var2 == 8 && this.field1452.length() > 0) {
                            this.field1452 = this.field1452.substring(0, this.field1452.length() - 1);
                        }
                        break;
                    }
                    if (this.field1639) {
                        if (var2 >= 32 && var2 <= 122 && this.field1247.length() < 80) {
                            this.field1247 = this.field1247 + (char) var2;
                            this.field1420 = true;
                        }
                        if (var2 == 8 && this.field1247.length() > 0) {
                            this.field1247 = this.field1247.substring(0, this.field1247.length() - 1);
                            this.field1420 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1639 = false;
                            this.field1420 = true;
                            if (this.field1389 == 1) {
                                long var3 = JString.method300(this.field1247);
                                this.method520(var3, -549);
                            }
                            if (this.field1389 == 2 && this.field1632 > 0) {
                                long var5 = JString.method300(this.field1247);
                                this.method541(var5, (byte) -51);
                            }
                            if (this.field1389 == 3 && this.field1247.length() > 0) {
                                this.field1613.method218(true, 47);
                                this.field1613.method219(0);
                                int var7 = this.field1613.field717;
                                this.field1613.method225(-13398, this.field1659);
                                WordPack.method307(this.field1613, this.field1247, false);
                                this.field1613.method228(-28191, this.field1613.field717 - var7);
                                this.field1247 = WordPack.method308(-212, this.field1247);
                                this.field1247 = WordFilter.method401(-212, this.field1247);
                                this.method559(176, 6, JString.method304(943, JString.method301(0, this.field1659)), this.field1247);
                                if (this.field1658 == 2) {
                                    this.field1658 = 1;
                                    this.field1251 = true;
                                    this.field1613.method218(true, 242);
                                    this.field1613.method219(this.field1239);
                                    this.field1613.method219(this.field1658);
                                    this.field1613.method219(this.field1400);
                                }
                            }
                            if (this.field1389 == 4 && this.field1359 < 100) {
                                long var8 = JString.method300(this.field1247);
                                this.method441(var8, this.field1501);
                            }
                            if (this.field1389 == 5 && this.field1359 > 0) {
                                long var10 = JString.method300(this.field1247);
                                this.method509(true, var10);
                            }
                        }
                    } else if (this.field1233) {
                        if (var2 >= 48 && var2 <= 57 && this.field1451.length() < 10) {
                            this.field1451 = this.field1451 + (char) var2;
                            this.field1420 = true;
                        }
                        if (var2 == 8 && this.field1451.length() > 0) {
                            this.field1451 = this.field1451.substring(0, this.field1451.length() - 1);
                            this.field1420 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1451.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1451);
                                } catch (Exception var19) {
                                }
                                this.field1613.method218(true, 236);
                                this.field1613.method223(var12);
                            }
                            this.field1233 = false;
                            this.field1420 = true;
                        }
                    } else if (this.field1241 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1349.length() < 80) {
                            this.field1349 = this.field1349 + (char) var2;
                            this.field1420 = true;
                        }
                        if (var2 == 8 && this.field1349.length() > 0) {
                            this.field1349 = this.field1349.substring(0, this.field1349.length() - 1);
                            this.field1420 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1349.length() > 0) {
                            if (this.field1332 == 2) {
                                if (this.field1349.equals("::clientdrop")) {
                                    this.method515(-784);
                                }
                                if (this.field1349.equals("::lag")) {
                                    this.method463(false);
                                }
                                if (this.field1349.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1528.method272(2, (byte) -73); ++var13) {
                                        this.field1528.method282((byte) 1, var13, 2, 8);
                                    }
                                }
                                if (this.field1349.equals("::fpson")) {
                                    field1267 = true;
                                }
                                if (this.field1349.equals("::fpsoff")) {
                                    field1267 = false;
                                }
                            }
                            if (this.field1349.startsWith("::")) {
                                this.field1613.method218(true, 248);
                                this.field1613.method219(this.field1349.length() - 1);
                                this.field1613.method226(this.field1349.substring(2));
                            } else {
                                String var14 = this.field1349.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1349 = this.field1349.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1349 = this.field1349.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1349 = this.field1349.substring(6);
                                }
                                String var16 = this.field1349.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field1349 = this.field1349.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field1349 = this.field1349.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field1349 = this.field1349.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field1349 = this.field1349.substring(6);
                                }
                                this.field1613.method218(true, 37);
                                this.field1613.method219(0);
                                int var18 = this.field1613.field717;
                                this.field1613.method219(var15);
                                this.field1613.method219(var17);
                                WordPack.method307(this.field1613, this.field1349, false);
                                this.field1613.method228(-28191, this.field1613.field717 - var18);
                                this.field1349 = WordPack.method308(-212, this.field1349);
                                this.field1349 = WordFilter.method401(-212, this.field1349);
                                field1369.field411 = this.field1349;
                                field1369.field413 = var15;
                                field1369.field414 = var17;
                                field1369.field412 = 150;
                                if (this.field1332 == 2) {
                                    this.method559(176, 2, "@cr2@" + field1369.field460, field1369.field411);
                                } else if (this.field1332 == 1) {
                                    this.method559(176, 2, "@cr1@" + field1369.field460, field1369.field411);
                                } else {
                                    this.method559(176, 2, field1369.field460, field1369.field411);
                                }
                                if (this.field1239 == 2) {
                                    this.field1239 = 3;
                                    this.field1251 = true;
                                    this.field1613.method218(true, 242);
                                    this.field1613.method219(this.field1239);
                                    this.field1613.method219(this.field1658);
                                    this.field1613.method219(this.field1400);
                                }
                            }
                            this.field1349 = "";
                            this.field1420 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1452.length() < 12) {
                this.field1452 = this.field1452 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method503(int arg0) {
        if (arg0 >= 0) {
            this.field1544 = -1;
        }
        for (int var2 = -1; var2 < this.field1476; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1474;
            } else {
                var3 = this.field1477[var2];
            }
            PlayerEntity var4 = this.field1475[var3];
            if (var4 != null) {
                this.method529(0, var4, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method504(int arg0, int arg1, Packet arg2) {
        arg2.method239(0);
        int var4 = arg2.method240(477, 1);
        if (arg0 != -29266) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 != 0) {
            int var6 = arg2.method240(477, 2);
            if (var6 == 0) {
                this.field1479[this.field1478++] = this.field1474;
            } else if (var6 == 1) {
                int var7 = arg2.method240(477, 3);
                field1369.method111(false, 490, var7);
                int var8 = arg2.method240(477, 1);
                if (var8 == 1) {
                    this.field1479[this.field1478++] = this.field1474;
                }
            } else if (var6 == 2) {
                int var9 = arg2.method240(477, 3);
                field1369.method111(true, 490, var9);
                int var10 = arg2.method240(477, 3);
                field1369.method111(true, 490, var10);
                int var11 = arg2.method240(477, 1);
                if (var11 == 1) {
                    this.field1479[this.field1478++] = this.field1474;
                }
            } else if (var6 == 3) {
                this.field1295 = arg2.method240(477, 2);
                int var12 = arg2.method240(477, 7);
                int var13 = arg2.method240(477, 7);
                int var14 = arg2.method240(477, 1);
                field1369.method110(var13, (byte) 7, var14 == 1, var12);
                int var15 = arg2.method240(477, 1);
                if (var15 == 1) {
                    this.field1479[this.field1478++] = this.field1474;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method505(String arg0) {
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

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method506(boolean arg0) {
        short var2 = 256;
        if (this.field1465 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1465 > 768) {
                    this.field1385[var3] = this.method468(this.field1387[var3], 1024 - this.field1465, 30661, this.field1386[var3]);
                } else if (this.field1465 > 256) {
                    this.field1385[var3] = this.field1387[var3];
                } else {
                    this.field1385[var3] = this.method468(this.field1386[var3], 256 - this.field1465, 30661, this.field1387[var3]);
                }
            }
        } else if (this.field1466 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1466 > 768) {
                    this.field1385[var4] = this.method468(this.field1388[var4], 1024 - this.field1466, 30661, this.field1386[var4]);
                } else if (this.field1466 > 256) {
                    this.field1385[var4] = this.field1388[var4];
                } else {
                    this.field1385[var4] = this.method468(this.field1386[var4], 256 - this.field1466, 30661, this.field1388[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1385[var5] = this.field1386[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1665.field759[var6] = this.field1488.field667[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1527[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1467[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1385[var26];
                    int var30 = this.field1665.field759[var8];
                    this.field1665.field759[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0) {
            this.field1544 = this.field1418.method229();
        }
        this.field1665.method259(super.field16, 0, 0, true);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1666.field759[var10] = this.field1489.field667[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1527[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1467[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1385[var18];
                    int var22 = this.field1666.field759[var16];
                    this.field1666.field759[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1666.method259(super.field16, 637, 0, true);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    private final void method507(int arg0, int arg1, Packet arg2) {
        this.field1326 = 0;
        this.field1478 = 0;
        this.method504(-29266, arg0, arg2);
        if (arg1 == 0) {
            this.method459(arg0, arg2, (byte) -124);
            this.method470((byte) 4, arg2, arg0);
            this.method556(arg0, arg2, (byte) 5);
            for (int var4 = 0; var4 < this.field1326; ++var4) {
                int var6 = this.field1327[var4];
                if (field1401 != this.field1475[var6].field444) {
                    this.field1475[var6] = null;
                }
            }
            if (arg2.field717 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field717 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1476; ++var5) {
                    if (this.field1475[this.field1477[var5]] == null) {
                        signlink.reporterror(this.field1319 + " null entry in pl list - pos:" + var5 + " size:" + this.field1476);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method508(int arg0, int arg1) {
        LinkList var3 = this.field1290[this.field1295][arg0][arg1];
        if (var3 == null) {
            this.field1614.method71(this.field1295, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250(0)) {
                ObjType var11 = ObjType.method348(var6.field501);
                int var12 = var11.field1070;
                if (var11.field1069) {
                    var12 = (var6.field502 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(var5, true);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250(0)) {
                if (var5.field501 != var9.field501 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field501 != var9.field501 && var7.field501 != var9.field501 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1614.method57(this.field1411, arg0, var8, this.field1295, var10, this.method555(arg0 * 128 + 64, this.field1295, -576, arg1 * 128 + 64), var7, var5, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method509(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1359; ++var4) {
                if (this.field1595[var4] == arg1) {
                    --this.field1359;
                    this.field1381 = true;
                    for (int var5 = var4; var5 < this.field1359; ++var5) {
                        this.field1595[var5] = this.field1595[var5 + 1];
                    }
                    this.field1613.method218(true, 104);
                    this.field1613.method225(-13398, arg1);
                    break;
                }
            }
            if (!arg0) {
                this.field1433 = 229;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)Z")
    public final boolean method510(byte arg0) {
        if (arg0 != -113) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method511(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1467[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1467[var17] = 192;
        }
        if (arg0 >= 0) {
            field1383 = this.field1408.method295();
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1468[var14] = (this.field1467[var14 - 1] + this.field1467[var14 + 1] + this.field1467[var14 - 128] + this.field1467[var14 + 128]) / 4;
            }
        }
        this.field1635 += 128;
        if (this.field1635 > this.field1264.length) {
            this.field1635 -= this.field1264.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method443(this.field1558[var6], 2);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1468[var11 + 128] - this.field1264[this.field1635 + var11 & this.field1264.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1467[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1527[var8] = this.field1527[var8 + 1];
        }
        this.field1527[var2 - 1] = (int) (Math.sin((double) field1401 / 14.0D) * 16.0D + Math.sin((double) field1401 / 15.0D) * 14.0D + Math.sin((double) field1401 / 16.0D) * 12.0D);
        if (this.field1465 > 0) {
            this.field1465 -= 4;
        }
        if (this.field1466 > 0) {
            this.field1466 -= 4;
        }
        if (this.field1465 == 0 && this.field1466 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1465 = 1024;
            }
            if (var9 == 1) {
                this.field1466 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method512(byte arg0) {
        this.method446((byte) 5);
        if (this.field1446 == 1) {
            this.field1365[this.field1445 / 100].method186(this.field1443 - 8 - 4, this.field1444 - 8 - 4, 37651);
        }
        if (this.field1446 == 2) {
            this.field1365[this.field1445 / 100 + 4].method186(this.field1443 - 8 - 4, this.field1444 - 8 - 4, 37651);
            ++field1568;
            if (field1568 > 57) {
                field1568 = 0;
                this.field1613.method218(true, 34);
            }
        }
        if (this.field1456 != -1) {
            this.method499(this.field1228, 0, this.field1456);
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1456]);
        }
        if (this.field1567 != -1) {
            this.method499(this.field1228, 0, this.field1567);
            this.method546(0, (byte) 7, 0, 0, Component.field71[this.field1567]);
        }
        this.method560(798);
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1544 = this.field1418.method229();
        }
        if (!this.field1593) {
            this.method554(270);
            this.method432(2);
        } else if (this.field1531 == 0) {
            this.method557(true);
        }
        if (this.field1506 == 1) {
            this.field1629[1].method186(472, 296, 37651);
        }
        if (field1267) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field12 < 15) {
                var5 = 16711680;
            }
            this.field1674.method201(var3, var4, "Fps:" + super.field12, 44274, var5);
            int var13 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field1512) {
                int var9 = 16711680;
            }
            this.field1674.method201(var3, var13, "Mem:" + var7 + "k", 44274, 16776960);
            var13 += 15;
        }
        if (this.field1536 != 0) {
            int var10 = this.field1536 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field1674.method206("System update in: " + var11 + ":0" + var12, 4, 16776960, 25737, 329);
            } else {
                this.field1674.method206("System update in: " + var11 + ":" + var12, 4, 16776960, 25737, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    private final void method513(boolean arg0) {
        this.field1398 &= arg0;
        if (this.field1520 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1370.method248(); var2 != null; var2 = (LocSpawned) this.field1370.method250(0)) {
                if (var2.field746 > 0) {
                    --var2.field746;
                }
                if (var2.field746 == 0) {
                    if (var2.field739 < 0 || World.method30(var2.field739, 4, var2.field741)) {
                        this.method429(var2.field737, 2, var2.field736, var2.field735, var2.field739, var2.field738, var2.field741, var2.field740);
                        var2.method106();
                    }
                } else {
                    if (var2.field745 > 0) {
                        --var2.field745;
                    }
                    if (var2.field745 == 0 && var2.field737 >= 1 && var2.field738 >= 1 && var2.field737 <= 102 && var2.field738 <= 102 && (var2.field742 < 0 || World.method30(var2.field742, 4, var2.field744))) {
                        this.method429(var2.field737, 2, var2.field736, var2.field735, var2.field742, var2.field738, var2.field744, var2.field743);
                        var2.field745 = -1;
                        if (var2.field742 == var2.field739 && var2.field739 == -1) {
                            var2.method106();
                        } else if (var2.field742 == var2.field739 && var2.field743 == var2.field740 && var2.field744 == var2.field741) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method514(boolean arg0, int arg1) {
        if (field1369.field399 >> 7 == this.field1360 && field1369.field400 >> 7 == this.field1361) {
            this.field1360 = 0;
            ++field1347;
            if (field1347 > 122) {
                field1347 = 0;
                this.field1613.method218(true, 110);
                this.field1613.method219(62);
            }
        }
        int var3 = this.field1476;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1369;
                var6 = this.field1474 << 14;
            } else {
                var5 = this.field1475[this.field1477[var4]];
                var6 = this.field1477[var4] << 14;
            }
            if (var5 != null && var5.method113((byte) -84)) {
                var5.field480 = false;
                if ((field1512 && this.field1476 > 50 || this.field1476 > 200) && !arg0 && var5.field424 == var5.field404) {
                    var5.field480 = true;
                }
                int var7 = var5.field399 >> 7;
                int var8 = var5.field400 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field475 != null && field1401 >= var5.field470 && field1401 < var5.field471) {
                        var5.field480 = false;
                        var5.field469 = this.method555(var5.field399, this.field1295, -576, var5.field400);
                        this.field1614.method62(var5.field479, (byte) 4, var5.field476, this.field1295, var5.field478, var5.field400, var5, var6, var5.field401, 60, var5.field469, var5.field399, var5.field477);
                    } else {
                        if ((var5.field399 & 127) == 64 && (var5.field400 & 127) == 64) {
                            if (this.field1552[var7][var8] == this.field1449) {
                                continue;
                            }
                            this.field1552[var7][var8] = this.field1449;
                        }
                        var5.field469 = this.method555(var5.field399, this.field1295, -576, var5.field400);
                        this.field1614.method61(var5, var5.field399, this.field1295, var5.field469, 60, var5.field400, var5.field401, (byte) 54, var5.field402, var6);
                    }
                }
            }
        }
        this.field1543 += arg1;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method515(int arg0) {
        if (this.field1547 > 0) {
            this.method542(true);
        } else {
            this.field1272.method258(this.field1310);
            this.field1674.method202("Connection lost", 144, 0, 257, this.field1356);
            this.field1674.method202("Connection lost", 143, 16777215, 256, this.field1356);
            this.field1674.method202("Please wait - attempting to reestablish", 159, 0, 257, this.field1356);
            this.field1674.method202("Please wait - attempting to reestablish", 158, 16777215, 256, this.field1356);
            this.field1272.method259(super.field16, 4, 4, true);
            if (arg0 >= 0) {
                field1266 = !field1266;
            }
            this.field1493 = 0;
            this.field1360 = 0;
            ClientStream var2 = this.field1248;
            this.field1398 = false;
            this.field1551 = 0;
            this.method490(this.field1319, this.field1320, true);
            if (!this.field1398) {
                this.method542(true);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method516(byte arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1336.method248(); var2 != null; var2 = (ProjectileEntity) this.field1336.method250(0)) {
            if (this.field1295 == var2.field505 && field1401 <= var2.field511) {
                if (field1401 >= var2.field510) {
                    if (var2.field514 > 0) {
                        NpcEntity var4 = this.field1683[var2.field514 - 1];
                        if (var4 != null && var4.field399 >= 0 && var4.field399 < 13312 && var4.field400 >= 0 && var4.field400 < 13312) {
                            var2.method120(var4.field400, field1401, false, this.method555(var4.field399, var2.field505, -576, var4.field400) - var2.field509, var4.field399);
                        }
                    }
                    if (var2.field514 < 0) {
                        int var5 = -var2.field514 - 1;
                        PlayerEntity var6;
                        if (this.field1237 == var5) {
                            var6 = field1369;
                        } else {
                            var6 = this.field1475[var5];
                        }
                        if (var6 != null && var6.field399 >= 0 && var6.field399 < 13312 && var6.field400 >= 0 && var6.field400 < 13312) {
                            var2.method120(var6.field400, field1401, false, this.method555(var6.field399, var2.field505, -576, var6.field400) - var2.field509, var6.field399);
                        }
                    }
                    var2.method121(this.field1228, 5);
                    this.field1614.method61(var2, (int) var2.field516, this.field1295, (int) var2.field518, 60, (int) var2.field517, var2.field524, (byte) 54, false, -1);
                }
            } else {
                var2.method106();
            }
        }
        ++field1513;
        if (this.field1363 != arg0) {
            this.field1544 = -1;
        }
        if (field1513 > 1174) {
            field1513 = 0;
            this.field1613.method218(true, 90);
            this.field1613.method219(0);
            int var3 = this.field1613.field717;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1613.method220(11499);
            }
            this.field1613.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1613.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1613.method219(94);
            }
            this.field1613.method220(51693);
            this.field1613.method219(16);
            this.field1613.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1613.method219(65);
            }
            this.field1613.method219((int) (Math.random() * 256.0D));
            this.field1613.method220(22990);
            this.field1613.method228(-28191, this.field1613.field717 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZI)V")
    public final void method517(boolean arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13((byte) 22, 20, "Starting up");
        if (signlink.sunjava) {
            super.field10 = 5;
        }
        if (field1494) {
            this.field1657 = true;
        } else {
            field1494 = true;
            boolean var1 = false;
            String var2 = this.method545(252);
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
                this.field1253 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1240[var3] = new FileStream(signlink.cache_dat, field1383, 500000, var3 + 1, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method483((byte) -69);
                    this.field1292 = this.method536("title", 25, this.field1497[1], 1, 0, "title screen");
                    this.field1673 = new PixFont(7, false, "p11_full", this.field1292);
                    this.field1674 = new PixFont(7, false, "p12_full", this.field1292);
                    this.field1675 = new PixFont(7, false, "b12_full", this.field1292);
                    this.field1676 = new PixFont(7, true, "q8_full", this.field1292);
                    this.method552(21480);
                    this.method522(0);
                    Jagfile var4 = this.method536("config", 30, this.field1497[2], 2, 0, "config");
                    Jagfile var5 = this.method536("interface", 35, this.field1497[3], 3, 0, "interface");
                    Jagfile var6 = this.method536("media", 40, this.field1497[4], 4, 0, "2d graphics");
                    Jagfile var7 = this.method536("textures", 45, this.field1497[6], 6, 0, "textures");
                    Jagfile var8 = this.method536("wordenc", 50, this.field1497[7], 7, 0, "chat system");
                    Jagfile var9 = this.method536("sounds", 55, this.field1497[8], 8, 0, "sound effects");
                    this.field1309 = new byte[4][104][104];
                    this.field1348 = new int[4][105][105];
                    this.field1614 = new World3D(3, 104, this.field1348, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1354[var10] = new CollisionMap(104, -20259, 104);
                    }
                    this.field1362 = new Pix32(512, 512);
                    Jagfile var11 = this.method536("versionlist", 60, this.field1497[5], 5, 0, "update list");
                    this.method13((byte) 22, 60, "Connecting to update server");
                    this.field1528 = new OnDemand();
                    this.field1528.method270(var11, this);
                    AnimFrame.method44(this.field1528.method273(-1919));
                    Model.method123(this.field1528.method272(0, (byte) -73), this.field1528);
                    if (!field1512) {
                        this.field1525 = 0;
                        try {
                            this.field1525 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1526 = true;
                        this.field1528.method279(2, this.field1525);
                        while (this.field1528.method280() > 0) {
                            this.method547(-424);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1528.field851 > 3) {
                                this.method505("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13((byte) 22, 65, "Requesting animations");
                    int var12 = this.field1528.method272(1, (byte) -73);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1528.method279(1, var13);
                    }
                    while (this.field1528.method280() > 0) {
                        int var14 = var12 - this.field1528.method280();
                        if (var14 > 0) {
                            this.method13((byte) 22, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method547(-424);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1528.field851 > 3) {
                            this.method505("ondemand");
                            return;
                        }
                    }
                    this.method13((byte) 22, 70, "Requesting models");
                    int var15 = this.field1528.method272(0, (byte) -73);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1528.method277(var16, 0);
                        if ((var17 & 1) != 0) {
                            this.field1528.method279(0, var16);
                        }
                    }
                    int var18 = this.field1528.method280();
                    while (this.field1528.method280() > 0) {
                        int var19 = var18 - this.field1528.method280();
                        if (var19 > 0) {
                            this.method13((byte) 22, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method547(-424);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1240[0] != null) {
                        this.method13((byte) 22, 75, "Requesting maps");
                        this.field1528.method279(3, this.field1528.method274(48, 905, 0, 47));
                        this.field1528.method279(3, this.field1528.method274(48, 905, 1, 47));
                        this.field1528.method279(3, this.field1528.method274(48, 905, 0, 48));
                        this.field1528.method279(3, this.field1528.method274(48, 905, 1, 48));
                        this.field1528.method279(3, this.field1528.method274(48, 905, 0, 49));
                        this.field1528.method279(3, this.field1528.method274(48, 905, 1, 49));
                        this.field1528.method279(3, this.field1528.method274(47, 905, 0, 47));
                        this.field1528.method279(3, this.field1528.method274(47, 905, 1, 47));
                        this.field1528.method279(3, this.field1528.method274(47, 905, 0, 48));
                        this.field1528.method279(3, this.field1528.method274(47, 905, 1, 48));
                        this.field1528.method279(3, this.field1528.method274(148, 905, 0, 48));
                        this.field1528.method279(3, this.field1528.method274(148, 905, 1, 48));
                        int var20 = this.field1528.method280();
                        while (this.field1528.method280() > 0) {
                            int var21 = var20 - this.field1528.method280();
                            if (var21 > 0) {
                                this.method13((byte) 22, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method547(-424);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1528.method272(0, (byte) -73);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1528.method277(var23, 0);
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
                            this.field1528.method282(var25, var23, 0, 8);
                        }
                    }
                    this.field1528.method275((byte) -34, field1511);
                    if (!field1512) {
                        int var26 = this.field1528.method272(2, (byte) -73);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1528.method278(field1585, var27)) {
                                this.field1528.method282((byte) 1, var27, 2, 8);
                            }
                        }
                    }
                    this.method13((byte) 22, 80, "Unpacking media");
                    this.field1315 = new Pix8(var6, "invback", 0);
                    this.field1317 = new Pix8(var6, "chatback", 0);
                    this.field1316 = new Pix8(var6, "mapback", 0);
                    this.field1371 = new Pix8(var6, "backbase1", 0);
                    this.field1372 = new Pix8(var6, "backbase2", 0);
                    this.field1373 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1680[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1410 = new Pix32(var6, "compass", 0);
                    this.field1311 = new Pix32(var6, "mapedge", 0);
                    this.field1311.method183(767);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1256[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1481[var30] = new Pix32(var6, "mapfunction", var30);
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
                            this.field1629[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1540 = new Pix32(var6, "mapmarker", 0);
                    this.field1541 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1365[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1303 = new Pix32(var6, "mapdots", 0);
                    this.field1304 = new Pix32(var6, "mapdots", 1);
                    this.field1305 = new Pix32(var6, "mapdots", 2);
                    this.field1306 = new Pix32(var6, "mapdots", 3);
                    this.field1440 = new Pix8(var6, "scrollbar", 0);
                    this.field1441 = new Pix8(var6, "scrollbar", 1);
                    this.field1413 = new Pix8(var6, "redstone1", 0);
                    this.field1414 = new Pix8(var6, "redstone2", 0);
                    this.field1415 = new Pix8(var6, "redstone3", 0);
                    this.field1416 = new Pix8(var6, "redstone1", 0);
                    this.field1416.method196((byte) -72);
                    this.field1417 = new Pix8(var6, "redstone2", 0);
                    this.field1417.method196((byte) -72);
                    this.field1569 = new Pix8(var6, "redstone1", 0);
                    this.field1569.method197((byte) -107);
                    this.field1570 = new Pix8(var6, "redstone2", 0);
                    this.field1570.method197((byte) -107);
                    this.field1571 = new Pix8(var6, "redstone3", 0);
                    this.field1571.method197((byte) -107);
                    this.field1572 = new Pix8(var6, "redstone1", 0);
                    this.field1572.method196((byte) -72);
                    this.field1572.method197((byte) -107);
                    this.field1573 = new Pix8(var6, "redstone2", 0);
                    this.field1573.method196((byte) -72);
                    this.field1573.method197((byte) -107);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1472[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1647 = new PixMap(this.method11(1), (byte) 3, var35.field669, var35.field668);
                    var35.method184(0, 0, 1);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1648 = new PixMap(this.method11(1), (byte) 3, var36.field669, var36.field668);
                    var36.method184(0, 0, 1);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1649 = new PixMap(this.method11(1), (byte) 3, var37.field669, var37.field668);
                    var37.method184(0, 0, 1);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1650 = new PixMap(this.method11(1), (byte) 3, var38.field669, var38.field668);
                    var38.method184(0, 0, 1);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1651 = new PixMap(this.method11(1), (byte) 3, var39.field669, var39.field668);
                    var39.method184(0, 0, 1);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1652 = new PixMap(this.method11(1), (byte) 3, var40.field669, var40.field668);
                    var40.method184(0, 0, 1);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1653 = new PixMap(this.method11(1), (byte) 3, var41.field669, var41.field668);
                    var41.method184(0, 0, 1);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1654 = new PixMap(this.method11(1), (byte) 3, var42.field669, var42.field668);
                    var42.method184(0, 0, 1);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1655 = new PixMap(this.method11(1), (byte) 3, var43.field669, var43.field668);
                    var43.method184(0, 0, 1);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1481[var48] != null) {
                            this.field1481[var48].method182(var46 + var47, var44 + var47, var45 + var47, 0);
                        }
                        if (this.field1256[var48] != null) {
                            this.field1256[var48].method198(var46 + var47, var44 + var47, var45 + var47, 0);
                        }
                    }
                    this.method13((byte) 22, 83, "Unpacking textures");
                    Pix3D.method169(var7, -776);
                    Pix3D.method173(field1439, 0.8D);
                    Pix3D.method168(7, 20);
                    this.method13((byte) 22, 86, "Unpacking config");
                    SeqType.method381(field1268, var4);
                    LocType.method328(var4);
                    FloType.method371(field1268, var4);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(field1268, var4);
                    SpotAnimType.method384(field1268, var4);
                    VarpType.method389(field1268, var4);
                    VarbitType.method387(field1268, var4);
                    ObjType.field1055 = field1511;
                    if (!field1512) {
                        this.method13((byte) 22, 90, "Unpacking sounds");
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, -26728);
                        Wave.method318(field1268, var50);
                    }
                    this.method13((byte) 22, 95, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1673, this.field1674, this.field1675, this.field1676 };
                    Component.method32(true, var6, var5, var51);
                    this.method13((byte) 22, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1316.field679[this.field1316.field681 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1691[var52] = var53;
                        this.field1561[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1316.field679[this.field1316.field681 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1257[var56 - 5] = var57 - 25;
                        this.field1460[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(479, 96, field1230);
                    this.field1615 = Pix3D.field645;
                    Pix3D.method166(190, 261, field1230);
                    this.field1616 = Pix3D.field645;
                    Pix3D.method166(512, 334, field1230);
                    this.field1617 = Pix3D.field645;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field643[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(800, 334, 500, var60, 785, 512);
                    WordFilter.method391(var8);
                    this.field1693 = new MouseTracking((byte) -41, this);
                    this.method12(this.field1693, 10);
                    LocEntity.field487 = this;
                    LocType.field958 = this;
                    NpcType.field1011 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1671 + " " + this.field1521);
                    this.field1678 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method518(byte arg0, boolean arg1) {
        this.method447(false);
        this.field1664.method258(this.field1310);
        this.field1498.method199(0, 0, 37651);
        if (arg0 != -16) {
            field1266 = !field1266;
        }
        short var3 = 360;
        short var4 = 200;
        if (this.field1505 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1673.method203(this.field1528.field845, var5, var3 / 2, 7711145, (byte) 1, true);
            int var6 = var4 / 2 - 20;
            this.field1675.method203("Welcome to RuneScape", var6, var3 / 2, 16776960, (byte) 1, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1499.method199(var7 - 73, var8 - 20, 37651);
            this.field1675.method203("New User", var8 + 5, var7, 16777215, (byte) 1, true);
            int var9 = var3 / 2 + 80;
            this.field1499.method199(var9 - 73, var8 - 20, 37651);
            this.field1675.method203("Existing User", var8 + 5, var9, 16777215, (byte) 1, true);
        }
        if (this.field1505 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1345.length() > 0) {
                this.field1675.method203(this.field1345, var10 - 15, var3 / 2, 16776960, (byte) 1, true);
                this.field1675.method203(this.field1346, var10, var3 / 2, 16776960, (byte) 1, true);
                var10 += 30;
            } else {
                this.field1675.method203(this.field1346, var10 - 7, var3 / 2, 16776960, (byte) 1, true);
                var10 += 30;
            }
            this.field1675.method210("Username: " + this.field1319 + (this.field1278 == 0 & field1401 % 40 < 20 ? "@yel@|" : ""), false, 16777215, var3 / 2 - 90, true, var10);
            var10 += 15;
            this.field1675.method210("Password: " + JString.method305(this.field1320, -576) + (this.field1278 == 1 & field1401 % 40 < 20 ? "@yel@|" : ""), false, 16777215, var3 / 2 - 88, true, var10);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1499.method199(var11 - 73, var12 - 20, 37651);
                this.field1675.method203("Login", var12 + 5, var11, 16777215, (byte) 1, true);
                int var13 = var3 / 2 + 80;
                this.field1499.method199(var13 - 73, var12 - 20, 37651);
                this.field1675.method203("Cancel", var12 + 5, var13, 16777215, (byte) 1, true);
            }
        }
        if (this.field1505 == 3) {
            this.field1675.method203("Create a free account", var4 / 2 - 60, var3 / 2, 16776960, (byte) 1, true);
            int var14 = var4 / 2 - 35;
            this.field1675.method203("To create a new account you need to", var14, var3 / 2, 16777215, (byte) 1, true);
            int var18 = var14 + 15;
            this.field1675.method203("go back to the main RuneScape webpage", var18, var3 / 2, 16777215, (byte) 1, true);
            int var19 = var18 + 15;
            this.field1675.method203("and choose the red 'create account'", var19, var3 / 2, 16777215, (byte) 1, true);
            int var20 = var19 + 15;
            this.field1675.method203("button at the top right of that page.", var20, var3 / 2, 16777215, (byte) 1, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1499.method199(var15 - 73, var16 - 20, 37651);
            this.field1675.method203("Cancel", var16 + 5, var15, 16777215, (byte) 1, true);
        }
        this.field1664.method259(super.field16, 202, 171, true);
        if (this.field1430) {
            this.field1430 = false;
            this.field1662.method259(super.field16, 128, 0, true);
            this.field1663.method259(super.field16, 202, 371, true);
            this.field1667.method259(super.field16, 0, 265, true);
            this.field1668.method259(super.field16, 562, 265, true);
            this.field1669.method259(super.field16, 128, 171, true);
            this.field1670.method259(super.field16, 562, 171, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg6 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = Model.field603[var8];
            int var14 = Model.field604[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field603[var9];
            int var17 = Model.field604[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1577 = arg2 - var10;
        this.field1578 = arg5 - var11;
        this.field1579 = arg4 - var12;
        if (this.field1337 != arg1) {
            this.field1682 = !this.field1682;
        }
        this.field1580 = arg0;
        this.field1581 = arg6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method520(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1632 >= 100 && this.field1539 != 1) {
                this.method559(176, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field1632 >= 200) {
                this.method559(176, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = JString.method304(943, JString.method301(0, arg0));
                for (int var5 = 0; var5 < this.field1632; ++var5) {
                    if (this.field1436[var5] == arg0) {
                        this.method559(176, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1359; ++var6) {
                    if (this.field1595[var6] == arg0) {
                        this.method559(176, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1369.field460)) {
                    this.field1627[this.field1632] = var4;
                    this.field1436[this.field1632] = arg0;
                    while (arg1 >= 0) {
                        this.method6();
                    }
                    this.field1357[this.field1632] = 0;
                    ++this.field1632;
                    this.field1381 = true;
                    this.field1613.method218(true, 221);
                    this.field1613.method225(-13398, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;B)V")
    private final void method521(int arg0, Packet arg1, byte arg2) {
        if (arg2 != -87) {
            field1383 = 416;
        }
        arg1.method239(0);
        int var4 = arg1.method240(477, 8);
        if (var4 < this.field1684) {
            for (int var5 = var4; var5 < this.field1684; ++var5) {
                this.field1327[this.field1326++] = this.field1685[var5];
            }
        }
        if (var4 > this.field1684) {
            signlink.reporterror(this.field1319 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1684 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1685[var6];
                NpcEntity var8 = this.field1683[var7];
                int var9 = arg1.method240(477, 1);
                if (var9 == 0) {
                    this.field1685[this.field1684++] = var7;
                    var8.field444 = field1401;
                } else {
                    int var10 = arg1.method240(477, 2);
                    if (var10 == 0) {
                        this.field1685[this.field1684++] = var7;
                        var8.field444 = field1401;
                        this.field1479[this.field1478++] = var7;
                    } else if (var10 == 1) {
                        this.field1685[this.field1684++] = var7;
                        var8.field444 = field1401;
                        int var11 = arg1.method240(477, 3);
                        var8.method111(false, 490, var11);
                        int var12 = arg1.method240(477, 1);
                        if (var12 == 1) {
                            this.field1479[this.field1478++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1685[this.field1684++] = var7;
                        var8.field444 = field1401;
                        int var13 = arg1.method240(477, 3);
                        var8.method111(true, 490, var13);
                        int var14 = arg1.method240(477, 3);
                        var8.method111(true, 490, var14);
                        int var15 = arg1.method240(477, 1);
                        if (var15 == 1) {
                            this.field1479[this.field1478++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1327[this.field1326++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method522(int arg0) {
        this.field1498 = new Pix8(this.field1292, "titlebox", 0);
        this.field1543 += arg0;
        this.field1499 = new Pix8(this.field1292, "titlebutton", 0);
        this.field1558 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1558[var3] = new Pix8(this.field1292, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1558[var4] = new Pix8(this.field1292, "runes", (var4 & 3) + 12);
            }
        }
        this.field1488 = new Pix32(128, 265);
        this.field1489 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1488.field667[var5] = this.field1665.field759[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1489.field667[var6] = this.field1666.field759[var6];
        }
        this.field1386 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1386[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1386[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1386[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1386[var10 + 192] = 16777215;
        }
        this.field1387 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1387[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1387[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1387[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1387[var14 + 192] = 16777215;
        }
        this.field1388 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1388[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1388[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1388[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1388[var18 + 192] = 16777215;
        }
        this.field1385 = new int[256];
        this.field1264 = new int[32768];
        this.field1265 = new int[32768];
        this.method443((Pix8) null, 2);
        this.field1467 = new int[32768];
        this.field1468 = new int[32768];
        this.method13((byte) 22, 10, "Connecting to fileserver");
        if (!this.field1350) {
            this.field1471 = true;
            this.field1350 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field1614.method76(arg4, arg0, arg1);
        if (var7 != 0) {
            int var8 = this.field1614.method80(arg4, arg0, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field1362.field667;
            int var13 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field986 != -1) {
                Pix8 var16 = this.field1256[var15.field986];
                if (var16 != null) {
                    int var17 = (var15.field972 * 4 - var16.field681) / 2;
                    int var18 = (var15.field973 * 4 - var16.field682) / 2;
                    var16.method199(arg0 * 4 + 48 + var17, (104 - arg1 - var15.field973) * 4 + 48 + var18, 37651);
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
        int var19 = this.field1614.method78(arg4, arg0, arg1);
        if (arg5 == 0) {
            if (var19 != 0) {
                int var20 = this.field1614.method80(arg4, arg0, arg1, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                LocType var24 = LocType.method330(var23);
                if (var24.field986 != -1) {
                    Pix8 var25 = this.field1256[var24.field986];
                    if (var25 != null) {
                        int var26 = (var24.field972 * 4 - var25.field681) / 2;
                        int var27 = (var24.field973 * 4 - var25.field682) / 2;
                        var25.method199(arg0 * 4 + 48 + var26, (104 - arg1 - var24.field973) * 4 + 48 + var27, 37651);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field1362.field667;
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
            int var31 = this.field1614.method79(arg4, arg0, arg1);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                LocType var33 = LocType.method330(var32);
                if (var33.field986 != -1) {
                    Pix8 var34 = this.field1256[var33.field986];
                    if (var34 != null) {
                        int var35 = (var33.field972 * 4 - var34.field681) / 2;
                        int var36 = (var33.field973 * 4 - var34.field682) / 2;
                        var34.method199(arg0 * 4 + 48 + var35, (104 - arg1 - var33.field973) * 4 + 48 + var36, 37651);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method524(boolean arg0, int arg1) {
        this.field1543 += arg1;
        for (int var3 = 0; var3 < this.field1684; ++var3) {
            NpcEntity var4 = this.field1683[this.field1685[var3]];
            int var5 = (this.field1685[var3] << 14) + 536870912;
            if (var4 != null && var4.method113((byte) -84) && var4.field457.field1038 == arg0) {
                int var6 = var4.field399 >> 7;
                int var7 = var4.field400 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field403 == 1 && (var4.field399 & 127) == 64 && (var4.field400 & 127) == 64) {
                        if (this.field1552[var6][var7] == this.field1449) {
                            continue;
                        }
                        this.field1552[var6][var7] = this.field1449;
                    }
                    this.field1614.method61(var4, var4.field399, this.field1295, this.method555(var4.field399, this.field1295, -576, var4.field400), (var4.field403 - 1) * 64 + 60, var4.field400, var4.field401, (byte) 54, var4.field402, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method525(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1681 = !this.field1681;
        }
        if (this.field1493 == 0) {
            if (super.field30 == 1) {
                int var3 = super.field31 - 25 - 550;
                int var4 = super.field32 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field1660 + this.field1588 & 2047;
                    int var6 = Pix3D.field643[var5];
                    int var7 = Pix3D.field644[var5];
                    int var8 = (this.field1352 + 256) * var6 >> 8;
                    int var9 = (this.field1352 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field1369.field399 + var10 >> 7;
                    int var13 = field1369.field400 - var11 >> 7;
                    boolean var14 = this.method482((byte) 2, 0, var13, var12, field1369.field450[0], 0, 0, 1, true, field1369.field449[0], 0, 0);
                    if (var14) {
                        this.field1613.method219(var3);
                        this.field1613.method219(var4);
                        this.field1613.method220(this.field1588);
                        this.field1613.method219(57);
                        this.field1613.method219(this.field1660);
                        this.field1613.method219(this.field1352);
                        this.field1613.method219(89);
                        this.field1613.method220(field1369.field399);
                        this.field1613.method220(field1369.field400);
                        this.field1613.method219(this.field1351);
                        this.field1613.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;IIBII)V")
    public final void method526(int arg0, Component arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 == -99) {
            if (arg1.field78 == 0 && arg1.field93 != null && !arg1.field92) {
                if (arg6 >= arg3 && arg2 >= arg0 && arg6 <= arg1.field81 + arg3 && arg2 <= arg1.field82 + arg0) {
                    int var8 = arg1.field93.length;
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg1.field94[var9] + arg3;
                        int var11 = arg1.field95[var9] + arg0 - arg5;
                        Component var12 = Component.field71[arg1.field93[var9]];
                        int var13 = var12.field84 + var10;
                        int var14 = var12.field85 + var11;
                        if ((var12.field89 >= 0 || var12.field116 != 0) && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                            if (var12.field89 >= 0) {
                                this.field1235 = var12.field89;
                            } else {
                                this.field1235 = var12.field76;
                            }
                        }
                        if (var12.field78 == 0) {
                            this.method526(var14, var12, arg2, var13, (byte) -99, var12.field91, arg6);
                            if (var12.field90 > var12.field82) {
                                this.method527(var12, var14, arg2, var12.field81 + var13, var12.field82, var12.field90, 6, arg6, true);
                            }
                        } else {
                            if (var12.field79 == 1 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                boolean var15 = false;
                                if (var12.field80 != 0) {
                                    var15 = this.method436(-51, var12);
                                }
                                if (!var15) {
                                    this.field1514[this.field1459] = var12.field132;
                                    this.field1281[this.field1459] = 231;
                                    this.field1280[this.field1459] = var12.field76;
                                    ++this.field1459;
                                }
                            }
                            if (var12.field79 == 2 && this.field1687 == 0 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                String var16 = var12.field129;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field1514[this.field1459] = var16 + " @gre@" + var12.field130;
                                this.field1281[this.field1459] = 274;
                                this.field1280[this.field1459] = var12.field76;
                                ++this.field1459;
                            }
                            if (var12.field79 == 3 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1514[this.field1459] = "Close";
                                this.field1281[this.field1459] = 737;
                                this.field1280[this.field1459] = var12.field76;
                                ++this.field1459;
                            }
                            if (var12.field79 == 4 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1514[this.field1459] = var12.field132;
                                this.field1281[this.field1459] = 435;
                                this.field1280[this.field1459] = var12.field76;
                                ++this.field1459;
                            }
                            if (var12.field79 == 5 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1514[this.field1459] = var12.field132;
                                this.field1281[this.field1459] = 225;
                                this.field1280[this.field1459] = var12.field76;
                                ++this.field1459;
                            }
                            if (var12.field79 == 6 && !this.field1289 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field81 + var13 && arg2 < var12.field82 + var14) {
                                this.field1514[this.field1459] = var12.field132;
                                this.field1281[this.field1459] = 997;
                                this.field1280[this.field1459] = var12.field76;
                                ++this.field1459;
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
                                        if (arg6 >= var20 && arg2 >= var21 && arg6 < var20 + 32 && arg2 < var21 + 32) {
                                            this.field1517 = var17;
                                            this.field1518 = var12.field76;
                                            if (var12.field72[var17] > 0) {
                                                ObjType var22 = ObjType.method348(var12.field72[var17] - 1);
                                                if (this.field1258 == 1 && var12.field99) {
                                                    if (this.field1260 != var12.field76 || this.field1259 != var17) {
                                                        this.field1514[this.field1459] = "Use " + this.field1262 + " with @lre@" + var22.field1058;
                                                        this.field1281[this.field1459] = 398;
                                                        this.field1282[this.field1459] = var22.field1056;
                                                        this.field1279[this.field1459] = var17;
                                                        this.field1280[this.field1459] = var12.field76;
                                                        ++this.field1459;
                                                    }
                                                } else if (this.field1687 == 1 && var12.field99) {
                                                    if ((this.field1689 & 16) == 16) {
                                                        this.field1514[this.field1459] = this.field1690 + " @lre@" + var22.field1058;
                                                        this.field1281[this.field1459] = 563;
                                                        this.field1282[this.field1459] = var22.field1056;
                                                        this.field1279[this.field1459] = var17;
                                                        this.field1280[this.field1459] = var12.field76;
                                                        ++this.field1459;
                                                    }
                                                } else {
                                                    if (var12.field99) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1073 != null && var22.field1073[var23] != null) {
                                                                this.field1514[this.field1459] = var22.field1073[var23] + " @lre@" + var22.field1058;
                                                                if (var23 == 3) {
                                                                    this.field1281[this.field1459] = 681;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field1281[this.field1459] = 100;
                                                                }
                                                                this.field1282[this.field1459] = var22.field1056;
                                                                this.field1279[this.field1459] = var17;
                                                                this.field1280[this.field1459] = var12.field76;
                                                                ++this.field1459;
                                                            } else if (var23 == 4) {
                                                                this.field1514[this.field1459] = "Drop @lre@" + var22.field1058;
                                                                this.field1281[this.field1459] = 100;
                                                                this.field1282[this.field1459] = var22.field1056;
                                                                this.field1279[this.field1459] = var17;
                                                                this.field1280[this.field1459] = var12.field76;
                                                                ++this.field1459;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field100) {
                                                        this.field1514[this.field1459] = "Use @lre@" + var22.field1058;
                                                        this.field1281[this.field1459] = 102;
                                                        this.field1282[this.field1459] = var22.field1056;
                                                        this.field1279[this.field1459] = var17;
                                                        this.field1280[this.field1459] = var12.field76;
                                                        ++this.field1459;
                                                    }
                                                    if (var12.field99 && var22.field1073 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1073[var24] != null) {
                                                                this.field1514[this.field1459] = var22.field1073[var24] + " @lre@" + var22.field1058;
                                                                if (var24 == 0) {
                                                                    this.field1281[this.field1459] = 694;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field1281[this.field1459] = 962;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field1281[this.field1459] = 795;
                                                                }
                                                                this.field1282[this.field1459] = var22.field1056;
                                                                this.field1279[this.field1459] = var17;
                                                                this.field1280[this.field1459] = var12.field76;
                                                                ++this.field1459;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field107 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field107[var25] != null) {
                                                                this.field1514[this.field1459] = var12.field107[var25] + " @lre@" + var22.field1058;
                                                                if (var25 == 0) {
                                                                    this.field1281[this.field1459] = 582;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field1281[this.field1459] = 113;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field1281[this.field1459] = 555;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field1281[this.field1459] = 331;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field1281[this.field1459] = 354;
                                                                }
                                                                this.field1282[this.field1459] = var22.field1056;
                                                                this.field1279[this.field1459] = var17;
                                                                this.field1280[this.field1459] = var12.field76;
                                                                ++this.field1459;
                                                            }
                                                        }
                                                    }
                                                    this.field1514[this.field1459] = "Examine @lre@" + var22.field1058;
                                                    this.field1281[this.field1459] = 1328;
                                                    this.field1282[this.field1459] = var22.field1056;
                                                    this.field1279[this.field1459] = var17;
                                                    this.field1280[this.field1459] = var12.field76;
                                                    ++this.field1459;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIIIIIIZ)V")
    public final void method527(Component arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (this.field1519 == arg6) {
            if (this.field1374) {
                this.field1428 = 32;
            } else {
                this.field1428 = 0;
            }
            this.field1374 = false;
            if (arg7 >= arg3 && arg7 < arg3 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
                arg0.field91 -= this.field1483 * 4;
                if (arg8) {
                    this.field1381 = true;
                    return;
                }
            } else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
                arg0.field91 += this.field1483 * 4;
                if (arg8) {
                    this.field1381 = true;
                    return;
                }
            } else {
                if (arg7 < arg3 - this.field1428 || arg7 >= arg3 + 16 + this.field1428 || arg2 < arg1 + 16 || arg2 >= arg1 + arg4 - 16 || this.field1483 <= 0) {
                    return;
                }
                int var10 = (arg4 - 32) * arg4 / arg5;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg2 - arg1 - 16 - var10 / 2;
                int var12 = arg4 - 32 - var10;
                arg0.field91 = (arg5 - arg4) * var11 / var12;
                if (arg8) {
                    this.field1381 = true;
                }
                this.field1374 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method13(byte arg0, int arg1, String arg2) {
        this.field1521 = arg1;
        this.field1671 = arg2;
        this.method447(false);
        if (this.field1292 == null) {
            super.method13((byte) 22, arg1, arg2);
        } else {
            this.field1664.method258(this.field1310);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1675.method202("RuneScape is loading - please wait...", var5 / 2 - 26 - var6, 16777215, var4 / 2, this.field1356);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(var4 / 2 - 152, var7, 304, 531, 9179409, 34);
            Pix2D.method158(var4 / 2 - 151, var7 + 1, 302, 531, 0, 32);
            Pix2D.method157(var7 + 2, 30, 9179409, false, arg1 * 3, var4 / 2 - 150);
            Pix2D.method157(var7 + 2, 30, 0, false, 300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150));
            this.field1675.method202(arg2, var5 / 2 + 5 - var6, 16777215, var4 / 2, this.field1356);
            if (arg0 != 22) {
                this.field1290 = null;
            }
            this.field1664.method259(super.field16, 202, 171, true);
            if (this.field1430) {
                this.field1430 = false;
                if (!this.field1350) {
                    this.field1665.method259(super.field16, 0, 0, true);
                    this.field1666.method259(super.field16, 637, 0, true);
                }
                this.field1662.method259(super.field16, 128, 0, true);
                this.field1663.method259(super.field16, 202, 371, true);
                this.field1667.method259(super.field16, 0, 265, true);
                this.field1668.method259(super.field16, 562, 265, true);
                this.field1669.method259(super.field16, 128, 171, true);
                this.field1670.method259(super.field16, 562, 171, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method528(int arg0) {
        for (int var2 = 0; var2 < this.field1684; ++var2) {
            int var3 = this.field1685[var2];
            NpcEntity var4 = this.field1683[var3];
            if (var4 != null) {
                this.method529(0, var4, var4.field457.field1020);
            }
        }
        if (arg0 != 9) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;I)V")
    public final void method529(int arg0, PathingEntity arg1, int arg2) {
        this.field1543 += arg0;
        if (arg1.field399 < 128 || arg1.field400 < 128 || arg1.field399 >= 13184 || arg1.field400 >= 13184) {
            arg1.field427 = -1;
            arg1.field432 = -1;
            arg1.field441 = 0;
            arg1.field442 = 0;
            arg1.field399 = arg1.field449[0] * 128 + arg1.field403 * 64;
            arg1.field400 = arg1.field450[0] * 128 + arg1.field403 * 64;
            arg1.method112(0);
        }
        if (field1369 == arg1 && (arg1.field399 < 1536 || arg1.field400 < 1536 || arg1.field399 >= 11776 || arg1.field400 >= 11776)) {
            arg1.field427 = -1;
            arg1.field432 = -1;
            arg1.field441 = 0;
            arg1.field442 = 0;
            arg1.field399 = arg1.field449[0] * 128 + arg1.field403 * 64;
            arg1.field400 = arg1.field450[0] * 128 + arg1.field403 * 64;
            arg1.method112(0);
        }
        if (arg1.field441 > field1401) {
            this.method530(23, arg1);
        } else if (arg1.field442 >= field1401) {
            this.method531(6438, arg1);
        } else {
            this.method532(129, arg1);
        }
        this.method533(arg1, false);
        this.method534(false, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method530(int arg0, PathingEntity arg1) {
        int var3 = 41 / arg0;
        int var4 = arg1.field441 - field1401;
        int var5 = arg1.field437 * 128 + arg1.field403 * 64;
        int var6 = arg1.field439 * 128 + arg1.field403 * 64;
        arg1.field399 += (var5 - arg1.field399) / var4;
        arg1.field400 += (var6 - arg1.field400) / var4;
        arg1.field452 = 0;
        if (arg1.field443 == 0) {
            arg1.field446 = 1024;
        }
        if (arg1.field443 == 1) {
            arg1.field446 = 1536;
        }
        if (arg1.field443 == 2) {
            arg1.field446 = 0;
        }
        if (arg1.field443 == 3) {
            arg1.field446 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;)V")
    public final void method531(int arg0, PathingEntity arg1) {
        if (arg0 != 6438) {
            this.field1612 = !this.field1612;
        }
        if (field1401 == arg1.field442 || arg1.field427 == -1 || arg1.field430 != 0 || arg1.field429 + 1 > SeqType.field1149[arg1.field427].method382(-574, arg1.field428)) {
            int var3 = arg1.field442 - arg1.field441;
            int var4 = field1401 - arg1.field441;
            int var5 = arg1.field437 * 128 + arg1.field403 * 64;
            int var6 = arg1.field439 * 128 + arg1.field403 * 64;
            int var7 = arg1.field438 * 128 + arg1.field403 * 64;
            int var8 = arg1.field440 * 128 + arg1.field403 * 64;
            arg1.field399 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field400 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field452 = 0;
        if (arg1.field443 == 0) {
            arg1.field446 = 1024;
        }
        if (arg1.field443 == 1) {
            arg1.field446 = 1536;
        }
        if (arg1.field443 == 2) {
            arg1.field446 = 0;
        }
        if (arg1.field443 == 3) {
            arg1.field446 = 512;
        }
        arg1.field401 = arg1.field446;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILy;)V")
    public final void method532(int arg0, PathingEntity arg1) {
        int var3 = 24 / arg0;
        arg1.field424 = arg1.field404;
        if (arg1.field448 == 0) {
            arg1.field452 = 0;
        } else {
            if (arg1.field427 != -1 && arg1.field430 == 0) {
                SeqType var4 = SeqType.field1149[arg1.field427];
                if (arg1.field453 > 0 && var4.field1161 == 0) {
                    ++arg1.field452;
                    return;
                }
                if (arg1.field453 <= 0 && var4.field1162 == 0) {
                    ++arg1.field452;
                    return;
                }
            }
            int var5 = arg1.field399;
            int var6 = arg1.field400;
            int var7 = arg1.field449[arg1.field448 - 1] * 128 + arg1.field403 * 64;
            int var8 = arg1.field450[arg1.field448 - 1] * 128 + arg1.field403 * 64;
            if (var7 - var5 <= 256 && var7 - var5 >= -256 && var8 - var6 <= 256 && var8 - var6 >= -256) {
                if (var5 < var7) {
                    if (var6 < var8) {
                        arg1.field446 = 1280;
                    } else if (var6 > var8) {
                        arg1.field446 = 1792;
                    } else {
                        arg1.field446 = 1536;
                    }
                } else if (var5 > var7) {
                    if (var6 < var8) {
                        arg1.field446 = 768;
                    } else if (var6 > var8) {
                        arg1.field446 = 256;
                    } else {
                        arg1.field446 = 512;
                    }
                } else if (var6 < var8) {
                    arg1.field446 = 1024;
                } else {
                    arg1.field446 = 0;
                }
                int var9 = arg1.field446 - arg1.field401 & 2047;
                if (var9 > 1024) {
                    var9 -= 2048;
                }
                int var10 = arg1.field407;
                if (var9 >= -256 && var9 <= 256) {
                    var10 = arg1.field406;
                } else if (var9 >= 256 && var9 < 768) {
                    var10 = arg1.field409;
                } else if (var9 >= -768 && var9 <= -256) {
                    var10 = arg1.field408;
                }
                if (var10 == -1) {
                    var10 = arg1.field406;
                }
                arg1.field424 = var10;
                int var11 = 4;
                if (arg1.field446 != arg1.field401 && arg1.field421 == -1 && arg1.field447 != 0) {
                    var11 = 2;
                }
                if (arg1.field448 > 2) {
                    var11 = 6;
                }
                if (arg1.field448 > 3) {
                    var11 = 8;
                }
                if (arg1.field452 > 0 && arg1.field448 > 1) {
                    var11 = 8;
                    --arg1.field452;
                }
                if (arg1.field451[arg1.field448 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field424 == arg1.field406 && arg1.field410 != -1) {
                    arg1.field424 = arg1.field410;
                }
                if (var5 < var7) {
                    arg1.field399 += var11;
                    if (arg1.field399 > var7) {
                        arg1.field399 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field399 -= var11;
                    if (arg1.field399 < var7) {
                        arg1.field399 = var7;
                    }
                }
                if (var6 < var8) {
                    arg1.field400 += var11;
                    if (arg1.field400 > var8) {
                        arg1.field400 = var8;
                    }
                } else if (var6 > var8) {
                    arg1.field400 -= var11;
                    if (arg1.field400 < var8) {
                        arg1.field400 = var8;
                    }
                }
                if (arg1.field399 == var7 && arg1.field400 == var8) {
                    --arg1.field448;
                    if (arg1.field453 > 0) {
                        --arg1.field453;
                        return;
                    }
                }
            } else {
                arg1.field399 = var7;
                arg1.field400 = var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method533(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            this.method6();
        }
        if (arg0.field447 != 0) {
            if (arg0.field421 != -1 && arg0.field421 < 32768) {
                NpcEntity var3 = this.field1683[arg0.field421];
                if (var3 != null) {
                    int var4 = arg0.field399 - var3.field399;
                    int var5 = arg0.field400 - var3.field400;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field446 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field421 >= 32768) {
                int var6 = arg0.field421 - 32768;
                if (this.field1237 == var6) {
                    var6 = this.field1474;
                }
                PlayerEntity var7 = this.field1475[var6];
                if (var7 != null) {
                    int var8 = arg0.field399 - var7.field399;
                    int var9 = arg0.field400 - var7.field400;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field446 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field422 != 0 || arg0.field423 != 0) && (arg0.field448 == 0 || arg0.field452 > 0)) {
                int var10 = arg0.field399 - (arg0.field422 - this.field1461 - this.field1461) * 64;
                int var11 = arg0.field400 - (arg0.field423 - this.field1462 - this.field1462) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field446 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field422 = 0;
                arg0.field423 = 0;
            }
            int var12 = arg0.field446 - arg0.field401 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field447 && var12 <= 2048 - arg0.field447) {
                    if (var12 > 1024) {
                        arg0.field401 -= arg0.field447;
                    } else {
                        arg0.field401 += arg0.field447;
                    }
                } else {
                    arg0.field401 = arg0.field446;
                }
                arg0.field401 &= 2047;
                if (arg0.field424 == arg0.field404 && arg0.field446 != arg0.field401) {
                    if (arg0.field405 != -1) {
                        arg0.field424 = arg0.field405;
                        return;
                    }
                    arg0.field424 = arg0.field406;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLy;)V")
    public final void method534(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        arg1.field402 = false;
        if (arg1.field424 != -1) {
            SeqType var4 = SeqType.field1149[arg1.field424];
            ++arg1.field426;
            if (arg1.field425 < var4.field1150 && arg1.field426 > var4.method382(-574, arg1.field425)) {
                arg1.field426 = 0;
                ++arg1.field425;
            }
            if (arg1.field425 >= var4.field1150) {
                arg1.field426 = 0;
                arg1.field425 = 0;
            }
        }
        if (arg1.field432 != -1 && field1401 >= arg1.field435) {
            if (arg1.field433 < 0) {
                arg1.field433 = 0;
            }
            SeqType var5 = SpotAnimType.field1172[arg1.field432].field1176;
            ++arg1.field434;
            while (arg1.field433 < var5.field1150 && arg1.field434 > var5.method382(-574, arg1.field433)) {
                arg1.field434 -= var5.method382(-574, arg1.field433);
                ++arg1.field433;
            }
            if (arg1.field433 >= var5.field1150 && (arg1.field433 < 0 || arg1.field433 >= var5.field1150)) {
                arg1.field432 = -1;
            }
        }
        if (arg1.field427 != -1 && arg1.field430 <= 1) {
            SeqType var6 = SeqType.field1149[arg1.field427];
            if (var6.field1161 == 1 && arg1.field453 > 0 && arg1.field441 <= field1401 && arg1.field442 < field1401) {
                arg1.field430 = 1;
                return;
            }
        }
        if (arg1.field427 != -1 && arg1.field430 == 0) {
            SeqType var7 = SeqType.field1149[arg1.field427];
            ++arg1.field429;
            while (arg1.field428 < var7.field1150 && arg1.field429 > var7.method382(-574, arg1.field428)) {
                arg1.field429 -= var7.method382(-574, arg1.field428);
                ++arg1.field428;
            }
            if (arg1.field428 >= var7.field1150) {
                arg1.field428 -= var7.field1154;
                ++arg1.field431;
                if (arg1.field431 >= var7.field1160) {
                    arg1.field427 = -1;
                }
                if (arg1.field428 < 0 || arg1.field428 >= var7.field1150) {
                    arg1.field427 = -1;
                }
            }
            arg1.field402 = var7.field1156;
        }
        if (arg1.field430 > 0) {
            --arg1.field430;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method535(int arg0) {
        if (this.field1430) {
            this.field1430 = false;
            this.field1647.method259(super.field16, 0, 4, true);
            this.field1648.method259(super.field16, 0, 357, true);
            this.field1649.method259(super.field16, 722, 4, true);
            this.field1650.method259(super.field16, 743, 205, true);
            this.field1651.method259(super.field16, 0, 0, true);
            this.field1652.method259(super.field16, 516, 4, true);
            this.field1653.method259(super.field16, 516, 205, true);
            this.field1654.method259(super.field16, 496, 357, true);
            this.field1655.method259(super.field16, 0, 338, true);
            this.field1381 = true;
            this.field1420 = true;
            this.field1442 = true;
            this.field1251 = true;
            if (this.field1520 != 2) {
                this.field1272.method259(super.field16, 4, 4, true);
                this.field1271.method259(super.field16, 550, 4, true);
            }
        }
        if (this.field1520 == 2) {
            this.method492(142);
        }
        if (this.field1593 && this.field1531 == 1) {
            this.field1381 = true;
        }
        if (this.field1555 != -1) {
            boolean var2 = this.method499(this.field1228, 0, this.field1555);
            if (var2) {
                this.field1381 = true;
            }
        }
        if (this.field1301 == 2) {
            this.field1381 = true;
        }
        if (this.field1623 == 2) {
            this.field1381 = true;
        }
        if (this.field1381) {
            this.method455((byte) 2);
            this.field1381 = false;
        }
        if (this.field1241 == -1) {
            this.field1516.field91 = this.field1330 - this.field1231 - 77;
            if (super.field24 > 448 && super.field24 < 560 && super.field25 > 332) {
                this.method527(this.field1516, 0, super.field25 - 357, 463, 77, this.field1330, 6, super.field24 - 17, false);
            }
            int var3 = this.field1330 - 77 - this.field1516.field91;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1330 - 77) {
                var3 = this.field1330 - 77;
            }
            if (this.field1231 != var3) {
                this.field1231 = var3;
                this.field1420 = true;
            }
        }
        if (this.field1241 != -1) {
            boolean var4 = this.method499(this.field1228, 0, this.field1241);
            if (var4) {
                this.field1420 = true;
            }
        }
        if (this.field1301 == 3) {
            this.field1420 = true;
        }
        if (this.field1623 == 3) {
            this.field1420 = true;
        }
        if (this.field1692 != null) {
            this.field1420 = true;
        }
        if (this.field1593 && this.field1531 == 2) {
            this.field1420 = true;
        }
        if (this.field1420) {
            this.method448((byte) 2);
            this.field1420 = false;
        }
        if (this.field1520 == 2) {
            this.method456(8);
            this.field1271.method259(super.field16, 550, 4, true);
        }
        if (this.field1355 != -1) {
            this.field1442 = true;
        }
        if (this.field1442) {
            if (this.field1355 != -1 && this.field1482 == this.field1355) {
                this.field1355 = -1;
                this.field1613.method218(true, 36);
                this.field1613.method219(this.field1482);
            }
            this.field1442 = false;
            this.field1565.method258(this.field1310);
            this.field1373.method199(0, 0, 37651);
            if (this.field1555 == -1) {
                if (this.field1490[this.field1482] != -1) {
                    if (this.field1482 == 0) {
                        this.field1413.method199(22, 10, 37651);
                    }
                    if (this.field1482 == 1) {
                        this.field1414.method199(54, 8, 37651);
                    }
                    if (this.field1482 == 2) {
                        this.field1414.method199(82, 8, 37651);
                    }
                    if (this.field1482 == 3) {
                        this.field1415.method199(110, 8, 37651);
                    }
                    if (this.field1482 == 4) {
                        this.field1417.method199(153, 8, 37651);
                    }
                    if (this.field1482 == 5) {
                        this.field1417.method199(181, 8, 37651);
                    }
                    if (this.field1482 == 6) {
                        this.field1416.method199(209, 9, 37651);
                    }
                }
                if (this.field1490[0] != -1 && (this.field1355 != 0 || field1401 % 20 < 10)) {
                    this.field1680[0].method199(29, 13, 37651);
                }
                if (this.field1490[1] != -1 && (this.field1355 != 1 || field1401 % 20 < 10)) {
                    this.field1680[1].method199(53, 11, 37651);
                }
                if (this.field1490[2] != -1 && (this.field1355 != 2 || field1401 % 20 < 10)) {
                    this.field1680[2].method199(82, 11, 37651);
                }
                if (this.field1490[3] != -1 && (this.field1355 != 3 || field1401 % 20 < 10)) {
                    this.field1680[3].method199(115, 12, 37651);
                }
                if (this.field1490[4] != -1 && (this.field1355 != 4 || field1401 % 20 < 10)) {
                    this.field1680[4].method199(153, 13, 37651);
                }
                if (this.field1490[5] != -1 && (this.field1355 != 5 || field1401 % 20 < 10)) {
                    this.field1680[5].method199(180, 11, 37651);
                }
                if (this.field1490[6] != -1 && (this.field1355 != 6 || field1401 % 20 < 10)) {
                    this.field1680[6].method199(208, 13, 37651);
                }
            }
            this.field1565.method259(super.field16, 516, 160, true);
            this.field1564.method258(this.field1310);
            this.field1372.method199(0, 0, 37651);
            if (this.field1555 == -1) {
                if (this.field1490[this.field1482] != -1) {
                    if (this.field1482 == 7) {
                        this.field1569.method199(42, 0, 37651);
                    }
                    if (this.field1482 == 8) {
                        this.field1570.method199(74, 0, 37651);
                    }
                    if (this.field1482 == 9) {
                        this.field1570.method199(102, 0, 37651);
                    }
                    if (this.field1482 == 10) {
                        this.field1571.method199(130, 1, 37651);
                    }
                    if (this.field1482 == 11) {
                        this.field1573.method199(173, 0, 37651);
                    }
                    if (this.field1482 == 12) {
                        this.field1573.method199(201, 0, 37651);
                    }
                    if (this.field1482 == 13) {
                        this.field1572.method199(229, 0, 37651);
                    }
                }
                if (this.field1490[8] != -1 && (this.field1355 != 8 || field1401 % 20 < 10)) {
                    this.field1680[7].method199(74, 2, 37651);
                }
                if (this.field1490[9] != -1 && (this.field1355 != 9 || field1401 % 20 < 10)) {
                    this.field1680[8].method199(102, 3, 37651);
                }
                if (this.field1490[10] != -1 && (this.field1355 != 10 || field1401 % 20 < 10)) {
                    this.field1680[9].method199(137, 4, 37651);
                }
                if (this.field1490[11] != -1 && (this.field1355 != 11 || field1401 % 20 < 10)) {
                    this.field1680[10].method199(174, 2, 37651);
                }
                if (this.field1490[12] != -1 && (this.field1355 != 12 || field1401 % 20 < 10)) {
                    this.field1680[11].method199(201, 2, 37651);
                }
                if (this.field1490[13] != -1 && (this.field1355 != 13 || field1401 % 20 < 10)) {
                    this.field1680[12].method199(226, 2, 37651);
                }
            }
            this.field1564.method259(super.field16, 496, 466, true);
            this.field1272.method258(this.field1310);
        }
        if (this.field1251) {
            this.field1251 = false;
            this.field1563.method258(this.field1310);
            this.field1371.method199(0, 0, 37651);
            this.field1674.method203("Public chat", 28, 55, 16777215, (byte) 1, true);
            if (this.field1239 == 0) {
                this.field1674.method203("On", 41, 55, 65280, (byte) 1, true);
            }
            if (this.field1239 == 1) {
                this.field1674.method203("Friends", 41, 55, 16776960, (byte) 1, true);
            }
            if (this.field1239 == 2) {
                this.field1674.method203("Off", 41, 55, 16711680, (byte) 1, true);
            }
            if (this.field1239 == 3) {
                this.field1674.method203("Hide", 41, 55, 65535, (byte) 1, true);
            }
            this.field1674.method203("Private chat", 28, 184, 16777215, (byte) 1, true);
            if (this.field1658 == 0) {
                this.field1674.method203("On", 41, 184, 65280, (byte) 1, true);
            }
            if (this.field1658 == 1) {
                this.field1674.method203("Friends", 41, 184, 16776960, (byte) 1, true);
            }
            if (this.field1658 == 2) {
                this.field1674.method203("Off", 41, 184, 16711680, (byte) 1, true);
            }
            this.field1674.method203("Trade/compete", 28, 324, 16777215, (byte) 1, true);
            if (this.field1400 == 0) {
                this.field1674.method203("On", 41, 324, 65280, (byte) 1, true);
            }
            if (this.field1400 == 1) {
                this.field1674.method203("Friends", 41, 324, 16776960, (byte) 1, true);
            }
            if (this.field1400 == 2) {
                this.field1674.method203("Off", 41, 324, 16711680, (byte) 1, true);
            }
            this.field1674.method203("Report abuse", 33, 458, 16777215, (byte) 1, true);
            this.field1563.method259(super.field16, 0, 453, true);
            this.field1272.method258(this.field1310);
        }
        this.field1228 = 0;
        if (arg0 != -25848) {
            this.field1613.method219(235);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/lang/String;)Lxb;")
    public final Jagfile method536(String arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg4 != 0) {
            this.field1290 = null;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1240[0] != null) {
                var7 = this.field1240[0].method291(arg3, 8);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1405.reset();
            this.field1405.update(var7);
            int var9 = (int) this.field1405.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(20025, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13((byte) 22, arg1, "Requesting " + arg5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method501(arg0 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, -26728);
                    var17.field717 = 3;
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
                            this.method13((byte) 22, arg1, "Loading " + arg5 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1240[0] != null) {
                            this.field1240[0].method292(7, var7, arg3, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field1240[0] = null;
                    }
                    if (var7 != null) {
                        this.field1405.reset();
                        this.field1405.update(var7);
                        int var24 = (int) this.field1405.getValue();
                        if (arg2 != var24) {
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
                            this.method13((byte) 22, arg1, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13((byte) 22, arg1, var12 + " - Retrying in " + var26);
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
                    this.field1556 = !this.field1556;
                }
            }
            return new Jagfile(20025, var7);
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field19 != null) {
                    return new URL("http://127.0.0.1:" + (field1510 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method537(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field1440.method199(arg0, arg4, 37651);
        this.field1441.method199(arg0, arg4 + arg5 - 16, 37651);
        Pix2D.method157(arg4 + 16, arg5 - 32, this.field1458, false, 16, arg0);
        this.field1398 &= arg3;
        int var7 = (arg5 - 32) * arg5 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg2 / (arg1 - arg5);
        Pix2D.method157(arg4 + 16 + var8, var7, this.field1294, false, 16, arg0);
        Pix2D.method162(this.field1339, var7, arg0, 11, arg4 + 16 + var8);
        Pix2D.method162(this.field1339, var7, arg0 + 1, 11, arg4 + 16 + var8);
        Pix2D.method160(arg4 + 16 + var8, 5, arg0, this.field1339, 16);
        Pix2D.method160(arg4 + 17 + var8, 5, arg0, this.field1339, 16);
        Pix2D.method162(this.field1503, var7, arg0 + 15, 11, arg4 + 16 + var8);
        Pix2D.method162(this.field1503, var7 - 1, arg0 + 14, 11, arg4 + 17 + var8);
        Pix2D.method160(arg4 + 15 + var8 + var7, 5, arg0, this.field1503, 16);
        Pix2D.method160(arg4 + 14 + var8 + var7, 5, arg0 + 1, this.field1503, 15);
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1544 = this.field1418.method229();
        }
        try {
            int var2 = field1369.field399 + this.field1610;
            int var3 = field1369.field400 + this.field1421;
            if (this.field1243 - var2 < -500 || this.field1243 - var2 > 500 || this.field1244 - var3 < -500 || this.field1244 - var3 > 500) {
                this.field1243 = var2;
                this.field1244 = var3;
            }
            if (this.field1243 != var2) {
                this.field1243 += (var2 - this.field1243) / 16;
            }
            if (this.field1244 != var3) {
                this.field1244 += (var3 - this.field1244) / 16;
            }
            if (super.field34[1] == 1) {
                this.field1589 += (-24 - this.field1589) / 2;
            } else if (super.field34[2] == 1) {
                this.field1589 += (24 - this.field1589) / 2;
            } else {
                this.field1589 /= 2;
            }
            if (super.field34[3] == 1) {
                this.field1590 += (12 - this.field1590) / 2;
            } else if (super.field34[4] == 1) {
                this.field1590 += (-12 - this.field1590) / 2;
            } else {
                this.field1590 /= 2;
            }
            this.field1588 = this.field1589 / 2 + this.field1588 & 2047;
            this.field1587 += this.field1590 / 2;
            if (this.field1587 < 128) {
                this.field1587 = 128;
            }
            if (this.field1587 > 383) {
                this.field1587 = 383;
            }
            int var4 = this.field1243 >> 7;
            int var5 = this.field1244 >> 7;
            int var6 = this.method555(this.field1243, this.field1295, -576, this.field1244);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1295;
                        if (var10 < 3 && (this.field1309[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1348[var10][var8][var9];
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
            if (var12 > this.field1457) {
                this.field1457 += (var12 - this.field1457) / 24;
            } else if (var12 < this.field1457) {
                this.field1457 += (var12 - this.field1457) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1369.field399 + "," + field1369.field400 + "," + this.field1243 + "," + this.field1244 + "," + this.field1254 + "," + this.field1255 + "," + this.field1461 + "," + this.field1462);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1370.method248(); var12 != null; var12 = (LocSpawned) this.field1370.method250(0)) {
            if (var12.field735 == arg1 && var12.field737 == arg7 && var12.field738 == arg4 && var12.field736 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field735 = arg1;
            var11.field736 = arg9;
            var11.field737 = arg7;
            var11.field738 = arg4;
            this.method449(var11, -886);
            this.field1370.method245(var11);
        }
        var11.field742 = arg8;
        var11.field744 = arg0;
        if (arg2 <= 0) {
            this.field1544 = -1;
        }
        var11.field743 = arg6;
        var11.field745 = arg5;
        var11.field746 = arg3;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method540(int arg0) {
        if (arg0 <= 0) {
            this.field1544 = -1;
        }
        this.field1515 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1350) {
                ++this.field1366;
                this.method511(-360);
                this.method511(-360);
                this.method506(false);
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
        this.field1515 = false;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JB)V")
    public final void method541(long arg0, byte arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1632; ++var4) {
                if (this.field1436[var4] == arg0) {
                    --this.field1632;
                    this.field1381 = true;
                    for (int var5 = var4; var5 < this.field1632; ++var5) {
                        this.field1627[var5] = this.field1627[var5 + 1];
                        this.field1357[var5] = this.field1357[var5 + 1];
                        this.field1436[var5] = this.field1436[var5 + 1];
                    }
                    this.field1613.method218(true, 160);
                    this.field1613.method225(-13398, arg0);
                    break;
                }
            }
            if (arg1 != -51) {
                this.field1682 = !this.field1682;
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method542(boolean arg0) {
        try {
            if (this.field1248 != null) {
                this.field1248.method38();
            }
        } catch (Exception var3) {
        }
        this.field1248 = null;
        this.field1398 = false;
        if (!arg0) {
            this.method6();
        }
        this.field1505 = 0;
        this.field1319 = "";
        this.field1320 = "";
        this.method442(-24602);
        this.field1614.method50(this.field1606);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1354[var2].method359(field1591);
        }
        System.gc();
        this.method462(true);
        this.field1424 = -1;
        this.field1525 = -1;
        this.field1399 = 0;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method543(int arg0, int arg1) {
        int[] var3 = this.field1362.field667;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1309[arg1][var24][var6] & 24) == 0) {
                    this.field1614.method85(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1309[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1614.method85(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1362.method181(this.field1310);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1309[arg1][var22][var9] & 24) == 0) {
                    this.method523(var22, var9, var8, var7, arg1, this.field1340);
                }
                if (arg1 < 3 && (this.field1309[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method523(var22, var9, var8, var7, arg1 + 1, this.field1340);
                }
            }
        }
        this.field1543 += arg0;
        this.field1272.method258(this.field1310);
        this.field1484 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1614.method79(this.field1295, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method330(var13).field985;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1354[this.field1295].field1112;
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
                        this.field1435[this.field1484] = this.field1481[var14];
                        this.field1485[this.field1484] = var15;
                        this.field1486[this.field1484] = var16;
                        ++this.field1484;
                    }
                }
            }
        }
        ++field1276;
        if (field1276 > 112) {
            field1276 = 0;
            this.field1613.method218(true, 164);
            this.field1613.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method544(int arg0, boolean arg1) {
        if (!arg1) {
            Component var3 = Component.field71[arg0];
            for (int var4 = 0; var4 < var3.field93.length && var3.field93[var4] != -1; ++var4) {
                Component var5 = Component.field71[var3.field93[var4]];
                if (var5.field78 == 1) {
                    this.method544(var5.field76, false);
                }
                var5.field74 = 0;
                var5.field75 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)Ljava/lang/String;")
    public final String method545(int arg0) {
        if (arg0 <= 0) {
            this.field1275 = -356;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field19 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIILd;)V")
    public final void method546(int arg0, byte arg1, int arg2, int arg3, Component arg4) {
        if (arg4.field78 == 0 && arg4.field93 != null) {
            if (!arg4.field92 || this.field1307 == arg4.field76 || this.field1507 == arg4.field76 || this.field1277 == arg4.field76) {
                int var6 = Pix2D.field626;
                int var7 = Pix2D.field624;
                int var8 = Pix2D.field627;
                int var9 = Pix2D.field625;
                Pix2D.method154(arg0, arg4.field81 + arg0, arg3, (byte) 2, arg4.field82 + arg3);
                int var10 = arg4.field93.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field94[var11] + arg0;
                    int var13 = arg4.field95[var11] + arg3 - arg2;
                    Component var14 = Component.field71[arg4.field93[var11]];
                    int var15 = var14.field84 + var12;
                    int var16 = var14.field85 + var13;
                    if (var14.field80 > 0) {
                        this.method451(var14, 0);
                    }
                    if (var14.field78 == 0) {
                        if (var14.field91 > var14.field90 - var14.field82) {
                            var14.field91 = var14.field90 - var14.field82;
                        }
                        if (var14.field91 < 0) {
                            var14.field91 = 0;
                        }
                        this.method546(var15, (byte) 7, var14.field91, var16, var14);
                        if (var14.field90 > var14.field82) {
                            this.method537(var14.field81 + var15, var14.field90, var14.field91, true, var16, var14.field82);
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
                                                var30.method186(var20, var21, 37651);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field72[var17] - 1;
                                        if (var20 > Pix2D.field626 - 32 && var20 < Pix2D.field627 && var21 > Pix2D.field624 - 32 && var21 < Pix2D.field625 || this.field1623 != 0 && this.field1622 == var17) {
                                            int var25 = 0;
                                            if (this.field1258 == 1 && this.field1259 == var17 && this.field1260 == var14.field76) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(var14.field73[var17], this.field1432, var25, var24);
                                            if (var26 != null) {
                                                if (this.field1623 != 0 && this.field1622 == var17 && this.field1621 == var14.field76) {
                                                    var22 = super.field24 - this.field1624;
                                                    var23 = super.field25 - this.field1625;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1425 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method188(false, var21 + var23, 128, var20 + var22);
                                                    if (var21 + var23 < Pix2D.field624 && arg4.field91 > 0) {
                                                        int var27 = (Pix2D.field624 - var21 - var23) * this.field1228 / 3;
                                                        if (var27 > this.field1228 * 10) {
                                                            var27 = this.field1228 * 10;
                                                        }
                                                        if (var27 > arg4.field91) {
                                                            var27 = arg4.field91;
                                                        }
                                                        arg4.field91 -= var27;
                                                        this.field1625 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field625 && arg4.field91 < arg4.field90 - arg4.field82) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field625) * this.field1228 / 3;
                                                        if (var28 > this.field1228 * 10) {
                                                            var28 = this.field1228 * 10;
                                                        }
                                                        if (var28 > arg4.field90 - arg4.field82 - arg4.field91) {
                                                            var28 = arg4.field90 - arg4.field82 - arg4.field91;
                                                        }
                                                        arg4.field91 += var28;
                                                        this.field1625 -= var28;
                                                    }
                                                } else if (this.field1301 != 0 && this.field1300 == var17 && this.field1299 == var14.field76) {
                                                    var26.method188(false, var21, 128, var20);
                                                } else {
                                                    var26.method186(var20, var21, 37651);
                                                }
                                                if (var26.field672 == 33 || var14.field73[var17] != 1) {
                                                    int var29 = var14.field73[var17];
                                                    this.field1673.method206(method437(var29, 0), var20 + 1 + var22, 0, 25737, var21 + 10 + var23);
                                                    this.field1673.method206(method437(var29, 0), var20 + var22, 16776960, 25737, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field78 == 3) {
                            boolean var31 = false;
                            if (this.field1277 == var14.field76 || this.field1507 == var14.field76 || this.field1307 == var14.field76) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method500(var14, true)) {
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
                                    Pix2D.method157(var16, var14.field82, var32, false, var14.field81, var15);
                                } else {
                                    Pix2D.method158(var15, var16, var14.field81, 531, var32, var14.field82);
                                }
                            } else if (var14.field108) {
                                Pix2D.method156(var14.field81, var16, var14.field82, var15, 256 - (var14.field83 & 255), false, var32);
                            } else {
                                Pix2D.method159(var32, var16, true, 256 - (var14.field83 & 255), var14.field82, var15, var14.field81);
                            }
                        } else if (var14.field78 == 4) {
                            PixFont var33 = var14.field111;
                            String var34 = var14.field112;
                            boolean var35 = false;
                            if (this.field1277 == var14.field76 || this.field1507 == var14.field76 || this.field1307 == var14.field76) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method500(var14, true)) {
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
                            if (var14.field79 == 6 && this.field1289) {
                                var34 = "Please wait...";
                                var36 = var14.field114;
                            }
                            if (Pix2D.field622 == 479) {
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
                                                                        var34 = var34.substring(0, var42) + this.method474(this.method433(var14, (byte) -11, 4), 0) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method474(this.method433(var14, (byte) -11, 3), 0) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method474(this.method433(var14, (byte) -11, 2), 0) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method474(this.method433(var14, (byte) -11, 1), 0) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method474(this.method433(var14, (byte) -11, 0), 0) + var34.substring(var38 + 2);
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
                                    var33.method203(var44, var37, var14.field81 / 2 + var15, var36, (byte) 1, var14.field110);
                                } else {
                                    var33.method210(var44, false, var36, var15, var14.field110, var37);
                                }
                                var37 += var33.field702;
                            }
                        } else if (var14.field78 == 5) {
                            Pix32 var45;
                            if (this.method500(var14, true)) {
                                var45 = var14.field119;
                            } else {
                                var45 = var14.field118;
                            }
                            if (var45 != null) {
                                var45.method186(var15, var16, 37651);
                            }
                        } else if (var14.field78 == 6) {
                            int var46 = Pix3D.field639;
                            int var47 = Pix3D.field640;
                            Pix3D.field639 = var14.field81 / 2 + var15;
                            Pix3D.field640 = var14.field82 / 2 + var16;
                            int var48 = Pix3D.field643[var14.field127] * var14.field126 >> 16;
                            int var49 = Pix3D.field644[var14.field127] * var14.field126 >> 16;
                            boolean var50 = this.method500(var14, true);
                            int var51;
                            if (var50) {
                                var51 = var14.field125;
                            } else {
                                var51 = var14.field124;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, var50, -1, false);
                            } else {
                                SeqType var53 = SeqType.field1149[var51];
                                var52 = var14.method34(var53.field1152[var14.field74], var50, var53.field1151[var14.field74], false);
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
                                        String var59 = var58.field1058;
                                        if (var58.field1069 || var14.field73[var55] != 1) {
                                            var59 = var59 + " x" + method430(var14.field73[var55], 46749);
                                        }
                                        int var60 = (var14.field102 + 115) * var57 + var15;
                                        int var61 = (var14.field103 + 12) * var56 + var16;
                                        if (var14.field109) {
                                            var54.method203(var59, var61, var14.field81 / 2 + var60, var14.field114, (byte) 1, var14.field110);
                                        } else {
                                            var54.method210(var59, false, var14.field114, var60, var14.field110, var61);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method154(var6, var8, var7, (byte) 2, var9);
                if (arg1 != 7) {
                    this.field1290 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method547(int arg0) {
        if (arg0 >= 0) {
            this.field1613.method219(67);
        }
        while (true) {
            OnDemandRequest var2 = this.field1528.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field730 == 0) {
                Model.method124(var2.field731, 14343, var2.field732);
                if ((this.field1528.method277(var2.field731, 0) & 98) != 0) {
                    this.field1381 = true;
                    if (this.field1241 != -1) {
                        this.field1420 = true;
                    }
                }
            }
            if (var2.field730 == 1 && var2.field732 != null) {
                AnimFrame.method45(3, var2.field732);
            }
            if (var2.field730 == 2 && this.field1525 == var2.field731 && var2.field732 != null) {
                this.method558(this.field1619, this.field1526, var2.field732);
            }
            if (var2.field730 == 3 && this.field1520 == 1) {
                for (int var3 = 0; var3 < this.field1364.length; ++var3) {
                    if (this.field1323[var3] == var2.field731) {
                        this.field1364[var3] = var2.field732;
                        if (var2.field732 == null) {
                            this.field1323[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1324[var3] == var2.field731) {
                        this.field1318[var3] = var2.field732;
                        if (var2.field732 == null) {
                            this.field1324[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field730 == 93 && this.field1528.method276(var2.field731, -640)) {
                World.method17(new Packet(var2.field732, -26728), this.field1528, (byte) -75);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)I")
    public final int method548(int arg0) {
        int var2 = 3;
        if (arg0 != -32745) {
            return 0;
        } else {
            if (this.field1580 < 310) {
                int var3 = this.field1577 >> 7;
                int var4 = this.field1579 >> 7;
                int var5 = field1369.field399 >> 7;
                int var6 = field1369.field400 >> 7;
                if ((this.field1309[this.field1295][var3][var4] & 4) != 0) {
                    var2 = this.field1295;
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
                        if ((this.field1309[this.field1295][var3][var4] & 4) != 0) {
                            var2 = this.field1295;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1309[this.field1295][var3][var4] & 4) != 0) {
                                var2 = this.field1295;
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
                        if ((this.field1309[this.field1295][var3][var4] & 4) != 0) {
                            var2 = this.field1295;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1309[this.field1295][var3][var4] & 4) != 0) {
                                var2 = this.field1295;
                            }
                        }
                    }
                }
            }
            if ((this.field1309[this.field1295][field1369.field399 >> 7][field1369.field400 >> 7] & 4) != 0) {
                var2 = this.field1295;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)I")
    public final int method549(boolean arg0) {
        if (arg0) {
            this.field1544 = -1;
        }
        int var2 = this.method555(this.field1577, this.field1295, -576, this.field1579);
        return var2 - this.field1578 < 800 && (this.field1309[this.field1295][this.field1577 >> 7][this.field1579 >> 7] & 4) != 0 ? this.field1295 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method550(int arg0, byte arg1) {
        int var3 = VarpType.field1195[arg0].field1203;
        if (arg1 != -43) {
            this.field1544 = this.field1418.method229();
        }
        if (var3 != 0) {
            int var4 = this.field1384[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method173(field1439, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method173(field1439, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method173(field1439, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method173(field1439, 0.6D);
                }
                ObjType.field1097.method103();
                this.field1430 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1609;
                if (var4 == 0) {
                    this.method517(this.field1609, true, 0);
                    this.field1609 = true;
                }
                if (var4 == 1) {
                    this.method517(this.field1609, true, -400);
                    this.field1609 = true;
                }
                if (var4 == 2) {
                    this.method517(this.field1609, true, -800);
                    this.field1609 = true;
                }
                if (var4 == 3) {
                    this.method517(this.field1609, true, -1200);
                    this.field1609 = true;
                }
                if (var4 == 4) {
                    this.field1609 = false;
                }
                if (this.field1609 != var5 && !field1512) {
                    if (this.field1609) {
                        this.field1525 = this.field1424;
                        this.field1526 = true;
                        this.field1528.method279(2, this.field1525);
                    } else {
                        this.method462(true);
                    }
                    this.field1399 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1592 = true;
                    this.method461((byte) 1, 0);
                }
                if (var4 == 1) {
                    this.field1592 = true;
                    this.method461((byte) 1, -400);
                }
                if (var4 == 2) {
                    this.field1592 = true;
                    this.method461((byte) 1, -800);
                }
                if (var4 == 3) {
                    this.field1592 = true;
                    this.method461((byte) 1, -1200);
                }
                if (var4 == 4) {
                    this.field1592 = false;
                }
            }
            if (var3 == 5) {
                this.field1343 = var4;
            }
            if (var3 == 6) {
                this.field1438 = var4;
            }
            if (var3 == 8) {
                this.field1530 = var4;
                this.field1420 = true;
            }
            if (var3 == 9) {
                this.field1263 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method551(int arg0) {
        for (int var2 = -1; var2 < this.field1476; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1474;
            } else {
                var6 = this.field1477[var2];
            }
            PlayerEntity var7 = this.field1475[var6];
            if (var7 != null && var7.field412 > 0) {
                --var7.field412;
                if (var7.field412 == 0) {
                    var7.field411 = null;
                }
            }
        }
        if (this.field1397 != arg0) {
            this.field1613.method219(232);
        }
        for (int var3 = 0; var3 < this.field1684; ++var3) {
            int var4 = this.field1685[var3];
            NpcEntity var5 = this.field1683[var4];
            if (var5 != null && var5.field412 > 0) {
                --var5.field412;
                if (var5.field412 == 0) {
                    var5.field411 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method552(int arg0) {
        byte[] var2 = this.field1292.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1665.method258(this.field1310);
        var3.method184(0, 0, 1);
        this.field1666.method258(this.field1310);
        var3.method184(-637, 0, 1);
        this.field1662.method258(this.field1310);
        var3.method184(-128, 0, 1);
        this.field1663.method258(this.field1310);
        var3.method184(-202, -371, 1);
        this.field1664.method258(this.field1310);
        var3.method184(-202, -171, 1);
        this.field1667.method258(this.field1310);
        var3.method184(0, -265, 1);
        this.field1668.method258(this.field1310);
        var3.method184(-562, -265, 1);
        this.field1669.method258(this.field1310);
        var3.method184(-128, -171, 1);
        this.field1670.method258(this.field1310);
        if (arg0 != 21480) {
            this.field1544 = this.field1418.method229();
        }
        var3.method184(-562, -171, 1);
        int[] var4 = new int[var3.field668];
        for (int var5 = 0; var5 < var3.field669; ++var5) {
            for (int var10 = 0; var10 < var3.field668; ++var10) {
                var4[var10] = var3.field667[var3.field668 * var5 + (var3.field668 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field668; ++var11) {
                var3.field667[var3.field668 * var5 + var11] = var4[var11];
            }
        }
        this.field1665.method258(this.field1310);
        var3.method184(382, 0, 1);
        this.field1666.method258(this.field1310);
        var3.method184(-255, 0, 1);
        this.field1662.method258(this.field1310);
        var3.method184(254, 0, 1);
        this.field1663.method258(this.field1310);
        var3.method184(180, -371, 1);
        this.field1664.method258(this.field1310);
        var3.method184(180, -171, 1);
        this.field1667.method258(this.field1310);
        var3.method184(382, -265, 1);
        this.field1668.method258(this.field1310);
        var3.method184(-180, -265, 1);
        this.field1669.method258(this.field1310);
        var3.method184(254, -171, 1);
        this.field1670.method258(this.field1310);
        var3.method184(-180, -171, 1);
        Pix32 var6 = new Pix32(this.field1292, "logo", 0);
        this.field1662.method258(this.field1310);
        var6.method186(382 - var6.field668 / 2 - 128, 18, 37651);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method553(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg2 - arg1;
        if (var4 < -9) {
            return "@red@";
        } else if (var4 < -6) {
            return "@or3@";
        } else if (var4 < -3) {
            return "@or2@";
        } else if (var4 < 0) {
            return "@or1@";
        } else if (var4 > 9) {
            return "@gre@";
        } else if (var4 > 6) {
            return "@gr3@";
        } else if (var4 > 3) {
            return "@gr2@";
        } else {
            return var4 > 0 ? "@gr1@" : "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (this.field1623 == 0) {
            this.field1514[0] = "Cancel";
            this.field1281[0] = 1106;
            this.field1459 = 1;
            this.method491((byte) 4);
            this.field1235 = 0;
            if (super.field24 > 4 && super.field25 > 4 && super.field24 < 516 && super.field25 < 338) {
                if (this.field1567 != -1) {
                    this.method526(4, Component.field71[this.field1567], super.field25, 4, (byte) -99, 0, super.field24);
                } else {
                    this.method465(true);
                }
            }
            if (this.field1307 != this.field1235) {
                this.field1307 = this.field1235;
            }
            this.field1235 = 0;
            if (super.field24 > 553 && super.field25 > 205 && super.field24 < 743 && super.field25 < 466) {
                if (this.field1555 != -1) {
                    this.method526(205, Component.field71[this.field1555], super.field25, 553, (byte) -99, 0, super.field24);
                } else if (this.field1490[this.field1482] != -1) {
                    this.method526(205, Component.field71[this.field1490[this.field1482]], super.field25, 553, (byte) -99, 0, super.field24);
                }
            }
            if (this.field1507 != this.field1235) {
                this.field1381 = true;
                this.field1507 = this.field1235;
            }
            this.field1235 = 0;
            int var2 = 46 / arg0;
            if (super.field24 > 17 && super.field25 > 357 && super.field24 < 496 && super.field25 < 453) {
                if (this.field1241 != -1) {
                    this.method526(357, Component.field71[this.field1241], super.field25, 17, (byte) -99, 0, super.field24);
                } else if (super.field25 < 434 && super.field24 < 426) {
                    this.method493(super.field25 - 357, 0, super.field24 - 17);
                }
            }
            if (this.field1241 != -1 && this.field1277 != this.field1235) {
                this.field1420 = true;
                this.field1277 = this.field1235;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field1459 - 1; ++var4) {
                    if (this.field1281[var4] < 1000 && this.field1281[var4 + 1] > 1000) {
                        String var5 = this.field1514[var4];
                        this.field1514[var4] = this.field1514[var4 + 1];
                        this.field1514[var4 + 1] = var5;
                        int var6 = this.field1281[var4];
                        this.field1281[var4] = this.field1281[var4 + 1];
                        this.field1281[var4 + 1] = var6;
                        int var7 = this.field1279[var4];
                        this.field1279[var4] = this.field1279[var4 + 1];
                        this.field1279[var4 + 1] = var7;
                        int var8 = this.field1280[var4];
                        this.field1280[var4] = this.field1280[var4 + 1];
                        this.field1280[var4 + 1] = var8;
                        int var9 = this.field1282[var4];
                        this.field1282[var4] = this.field1282[var4 + 1];
                        this.field1282[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method555(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0) {
            int var5 = arg0 >> 7;
            int var6 = arg3 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg1;
                if (arg1 < 3 && (this.field1309[1][var5][var6] & 2) == 2) {
                    var7 = arg1 + 1;
                }
                int var8 = arg0 & 127;
                int var9 = arg3 & 127;
                int var10 = (128 - var8) * this.field1348[var7][var5][var6] + this.field1348[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field1348[var7][var5][var6 + 1] + this.field1348[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        } else {
            return field1230;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!this.field1657 && !this.field1678 && !this.field1253) {
            ++field1368;
            if (!this.field1398) {
                this.method518((byte) -16, false);
            } else {
                this.method535(this.field1582);
            }
            this.field1483 = 0;
        } else {
            this.method438(0);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        int var2 = 9 / arg0;
        this.field1430 = true;
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1509 = Integer.parseInt(this.getParameter("nodeid"));
        field1510 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method458(true);
        } else {
            method496(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1511 = false;
        } else {
            field1511 = true;
        }
        this.method2(503, (byte) 40, 765);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILlb;B)V")
    private final void method556(int arg0, Packet arg1, byte arg2) {
        if (arg2 != 5) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field1478; ++var5) {
            int var6 = this.field1479[var5];
            PlayerEntity var7 = this.field1475[var6];
            int var8 = arg1.method229();
            if ((var8 & 128) == 128) {
                var8 += arg1.method229() << 8;
            }
            this.method472(-521, arg1, var7, var8, var6);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        int var2 = this.field1532;
        int var3 = this.field1533;
        int var4 = this.field1534;
        int var5 = this.field1535;
        int var6 = 6116423;
        Pix2D.method157(var3, var5, var6, false, var4, var2);
        this.field1398 &= arg0;
        Pix2D.method157(var3 + 1, 16, 0, false, var4 - 2, var2 + 1);
        Pix2D.method158(var2 + 1, var3 + 18, var4 - 2, 531, 0, var5 - 19);
        this.field1675.method206("Choose Option", var2 + 3, var6, 25737, var3 + 14);
        int var7 = super.field24;
        int var8 = super.field25;
        if (this.field1531 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1531 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1531 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1459; ++var9) {
            int var10 = (this.field1459 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1675.method210(this.field1514[var9], false, var11, var2 + 3, true, var10);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ[B)V")
    public final void method558(int arg0, boolean arg1, byte[] arg2) {
        signlink.midifade = arg1 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        if (arg0 < 1 || arg0 > 1) {
            this.field1455 = this.field1408.method295();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method559(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1636 != -1) {
            this.field1692 = arg3;
            super.field30 = 0;
        }
        if (this.field1241 == -1) {
            this.field1420 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1333[var5] = this.field1333[var5 - 1];
            this.field1334[var5] = this.field1334[var5 - 1];
            this.field1335[var5] = this.field1335[var5 - 1];
        }
        this.field1333[0] = arg1;
        this.field1334[0] = arg2;
        this.field1335[0] = arg3;
        if (arg0 <= 0) {
            this.field1613.method219(170);
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method560(int arg0) {
        if (arg0 <= 0) {
            this.field1544 = -1;
        }
        this.field1566 = 0;
        int var2 = (field1369.field399 >> 7) + this.field1461;
        int var3 = (field1369.field400 >> 7) + this.field1462;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1566 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1566 = 1;
        }
        if (this.field1566 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1566 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method561(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1290 = null;
        }
        if (this.field1656 == 2) {
            this.method479((this.field1284 - this.field1462 << 7) + this.field1287, this.field1285 * 2, (this.field1283 - this.field1461 << 7) + this.field1286, 736);
            if (this.field1583 > -1 && field1401 % 20 < 10) {
                this.field1629[2].method186(this.field1583 - 12, this.field1584 - 28, 37651);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method562(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1344[var1] = var0 - 1;
            var0 += var0;
        }
        field1383 = 2;
        field1403 = -285;
        field1426 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1439 = 168;
        field1500 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1500[var3] = var2 / 4;
        }
        field1509 = 10;
        field1511 = true;
        field1591 = -16342;
        field1608 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1637 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
