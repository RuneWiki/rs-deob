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

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field1218 = new int[100];

    @OriginalMember(owner = "client", name = "O", descriptor = "[Ljava/lang/String;")
    private String[] field1219 = new String[100];

    @OriginalMember(owner = "client", name = "P", descriptor = "[Ljava/lang/String;")
    private String[] field1220 = new String[100];

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1221 = -1;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1230 = 2;

    @OriginalMember(owner = "client", name = "bb", descriptor = "[Lvb;")
    public FileStream[] field1232 = new FileStream[5];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1234 = new int[9];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1236 = new int[151];

    @OriginalMember(owner = "client", name = "gb", descriptor = "B")
    private byte field1237 = 2;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ld;")
    private Component field1238 = new Component();

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private boolean field1242 = true;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1243 = 4;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1244 = -44650;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field1246 = new int[500];

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field1247 = new int[500];

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1248 = new int[500];

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field1249 = new int[500];

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    private boolean field1250 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "B")
    private byte field1251 = 9;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private boolean field1252 = false;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1258 = -1;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1261 = -810;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[Ljava/lang/String;")
    private String[] field1280 = new String[500];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1281 = 128;

    @OriginalMember(owner = "client", name = "fc", descriptor = "[[[Lob;")
    private LinkList[][][] field1288 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1289 = new int[5];

    @OriginalMember(owner = "client", name = "mc", descriptor = "[Ljb;")
    private Pix8[] field1295 = new Pix8[2];

    @OriginalMember(owner = "client", name = "oc", descriptor = "B")
    private byte field1297 = 4;

    @OriginalMember(owner = "client", name = "rc", descriptor = "B")
    private byte field1300 = -49;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1301 = 7759444;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1304 = 2;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1311 = 1;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field1317 = new int[50];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Lob;")
    private LinkList field1331 = new LinkList(18783);

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/lang/String;")
    private String field1332 = "";

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Ljava/lang/String;")
    private String field1333 = "";

    @OriginalMember(owner = "client", name = "ad", descriptor = "Z")
    private boolean field1335 = false;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field1336 = false;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    public boolean field1337 = false;

    @OriginalMember(owner = "client", name = "dd", descriptor = "B")
    private byte field1338 = -42;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "B")
    private byte field1343 = 5;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1348 = -1;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1350 = -1;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field1351 = new int[50];

    @OriginalMember(owner = "client", name = "rd", descriptor = "[Z")
    private boolean[] field1352 = new boolean[5];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[Ljb;")
    private Pix8[] field1353 = new Pix8[13];

    @OriginalMember(owner = "client", name = "ud", descriptor = "[B")
    private byte[] field1355 = new byte[16384];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field1357 = new int[Stats.field1151];

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    public int[] field1359 = new int[2000];

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field1360 = new int[256];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Ljava/lang/String;")
    private String field1361 = "";

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[Lib;")
    private Pix32[] field1362 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field1363 = new int[Stats.field1151];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[Lz;")
    private NpcEntity[] field1364 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[I")
    public int[] field1366 = new int[16384];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[I")
    private int[] field1368 = new int[50];

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field1370 = true;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private boolean field1371 = false;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    private int[] field1372 = new int[Stats.field1151];

    @OriginalMember(owner = "client", name = "Md", descriptor = "[Lib;")
    private Pix32[] field1373 = new Pix32[100];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1376 = -567;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Llb;")
    private Packet field1380 = Packet.method217(false, 1);

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field1381 = false;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[Ljb;")
    private Pix8[] field1384 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[[I")
    private int[][] field1385 = new int[104][104];

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field1392 = false;

    @OriginalMember(owner = "client", name = "le", descriptor = "Ljava/lang/String;")
    private String field1398 = "";

    @OriginalMember(owner = "client", name = "me", descriptor = "Ljava/lang/String;")
    private String field1399 = "";

    @OriginalMember(owner = "client", name = "re", descriptor = "[Lib;")
    private Pix32[] field1404 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1408 = 6;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Ljava/lang/String;")
    private String field1415 = "";

    @OriginalMember(owner = "client", name = "De", descriptor = "Llb;")
    private Packet field1416 = Packet.method217(false, 1);

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    public boolean field1419 = true;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[Lib;")
    private Pix32[] field1430 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Se", descriptor = "[I")
    private int[] field1431 = new int[5];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field1436 = false;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1437 = -1;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1440 = 50;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[I")
    private int[] field1441 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field1442 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field1443 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field1444 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field1445 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "hf", descriptor = "[I")
    private int[] field1446 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "jf", descriptor = "[I")
    private int[] field1447 = new int[this.field1440];

    @OriginalMember(owner = "client", name = "kf", descriptor = "[Ljava/lang/String;")
    private String[] field1448 = new String[this.field1440];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field1453 = new int[5];

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1456 = 3;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1462 = -1;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field1468 = -1;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Z")
    private boolean field1470 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1471 = 625;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    public int[] field1473 = new int[1000];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1474 = -5;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Z")
    private boolean field1485 = false;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field1487 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1494 = -1;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1495 = 2048;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1496 = 2047;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[Lab;")
    private PlayerEntity[] field1497 = new PlayerEntity[this.field1495];

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    public int[] field1499 = new int[this.field1495];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field1501 = new int[this.field1495];

    @OriginalMember(owner = "client", name = "mg", descriptor = "[Llb;")
    private Packet[] field1502 = new Packet[this.field1495];

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private final int[] field1503 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lob;")
    private LinkList field1505 = new LinkList(18783);

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1506 = -1;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1507 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[[I")
    private int[][] field1508 = new int[104][104];

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1509 = new int[200];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private boolean field1516 = true;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1517 = 78;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Z")
    private boolean field1518 = false;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Z")
    private boolean field1519 = true;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[Ljava/lang/String;")
    private String[] field1523 = new String[5];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[Z")
    private boolean[] field1524 = new boolean[5];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1526 = -674;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field1532 = new int[33];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1533 = -1;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Ljava/lang/String;")
    private String field1534 = "";

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field1535 = new int[5];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1536 = -947;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1538 = -1;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1546 = 3353893;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1547 = new CRC32();

    @OriginalMember(owner = "client", name = "ih", descriptor = "[J")
    private long[] field1550 = new long[100];

    @OriginalMember(owner = "client", name = "jh", descriptor = "[[I")
    private int[][] field1551 = new int[104][104];

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field1553 = false;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1555 = 2;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    private int[] field1556 = new int[151];

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field1563 = false;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1564 = -294;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Ljava/lang/String;")
    private String field1566 = "";

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1568 = new int[1000];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field1569 = new int[1000];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field1570 = false;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Z")
    private boolean field1571 = false;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1577 = -405;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field1579 = false;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1585 = 5063219;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field1587 = false;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1588 = -1;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field1590 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field1591 = new int[33];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[Lib;")
    private Pix32[] field1592 = new Pix32[8];

    @OriginalMember(owner = "client", name = "ci", descriptor = "[Ljc;")
    private CollisionMap[] field1596 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1599 = 2301979;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[J")
    private long[] field1604 = new long[200];

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    private boolean field1605 = false;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Lob;")
    private LinkList field1606 = new LinkList(18783);

    @OriginalMember(owner = "client", name = "qi", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Ljava/lang/String;")
    private String field1618 = "";

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private final int field1624 = 100;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field1625 = new int[100];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "Llb;")
    private Packet field1627 = Packet.method217(false, 1);

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[I")
    private int[] field1630 = new int[7];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field1637 = new int[5];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[Ljava/lang/String;")
    private String[] field1641 = new String[200];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field1644 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1649 = 31696;

    @OriginalMember(owner = "client", name = "ej", descriptor = "[I")
    private int[] field1650 = new int[4000];

    @OriginalMember(owner = "client", name = "fj", descriptor = "[I")
    private int[] field1651 = new int[4000];

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1654 = 1;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field1655 = new int[2000];

    @OriginalMember(owner = "client", name = "lj", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1659 = -1;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Z")
    private boolean field1660 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "B")
    private byte field1661 = 3;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[I")
    private int[] field1667 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    private boolean field1671 = true;

    @OriginalMember(owner = "client", name = "M", descriptor = "Ljava/lang/String;")
    private static String field1217 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private static int field1245 = 738;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "B")
    private static byte field1263 = -90;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private static int field1291 = 10;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private static boolean field1293 = true;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    public static final int[] field1316 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    public static int[] field1349 = new int[32];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1438;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[[I")
    public static final int[][] field1457;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private static boolean field1489;

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private static int[] field1504;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1544;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private static boolean field1629;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field1640;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private static int field1216;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private static int field1235;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private static int field1268;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private static int field1269;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private static int field1290;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private static int field1298;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private static int field1344;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private static int field1379;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field1391;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private static int field1417;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private static int field1421;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private static int field1423;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private static int field1458;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private static int field1541;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private static int field1545;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private static int field1580;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private static int field1626;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private static int field1670;

    @OriginalMember(owner = "client", name = "nc", descriptor = "J")
    public long field1296;

    @OriginalMember(owner = "client", name = "Df", descriptor = "J")
    private long field1467;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "J")
    private long field1540;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "J")
    private long field1586;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "J")
    private long field1628;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Le;")
    private ClientStream field1262;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Lwb;")
    private Isaac field1407;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Lxb;")
    private Jagfile field1259;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Lfc;")
    public MouseTracking field1639;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Lub;")
    private OnDemand field1549;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Lib;")
    private Pix32 field1285;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Lib;")
    private Pix32 field1286;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Lib;")
    private Pix32 field1400;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Lib;")
    private Pix32 field1401;

    @OriginalMember(owner = "client", name = "se", descriptor = "Lib;")
    private Pix32 field1405;

    @OriginalMember(owner = "client", name = "te", descriptor = "Lib;")
    private Pix32 field1406;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Lib;")
    private Pix32 field1486;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Lib;")
    private Pix32 field1575;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Lib;")
    private Pix32 field1631;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Lib;")
    private Pix32 field1632;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "Lib;")
    private Pix32 field1633;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Lib;")
    private Pix32 field1634;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Lib;")
    private Pix32 field1642;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Ljb;")
    private Pix8 field1318;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Ljb;")
    private Pix8 field1319;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Ljb;")
    private Pix8 field1320;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Ljb;")
    private Pix8 field1339;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Ljb;")
    private Pix8 field1340;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Ljb;")
    private Pix8 field1341;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Ljb;")
    private Pix8 field1424;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Ljb;")
    private Pix8 field1425;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Ljb;")
    private Pix8 field1426;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Ljb;")
    private Pix8 field1427;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Ljb;")
    private Pix8 field1428;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Ljb;")
    private Pix8 field1635;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Ljb;")
    private Pix8 field1636;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Ljb;")
    private Pix8 field1662;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Ljb;")
    private Pix8 field1663;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Ljb;")
    private Pix8 field1664;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Ljb;")
    private Pix8 field1665;

    @OriginalMember(owner = "client", name = "uj", descriptor = "Ljb;")
    private Pix8 field1666;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Ljb;")
    private Pix8 field1668;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Ljb;")
    private Pix8 field1669;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lkb;")
    private PixFont field1449;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Lkb;")
    private PixFont field1450;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lkb;")
    private PixFont field1451;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lkb;")
    private PixFont field1452;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Lqb;")
    private PixMap field1270;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Lqb;")
    private PixMap field1271;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Lqb;")
    private PixMap field1272;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Lqb;")
    private PixMap field1273;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Lqb;")
    private PixMap field1274;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Lqb;")
    private PixMap field1275;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Lqb;")
    private PixMap field1276;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Lqb;")
    private PixMap field1277;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Lqb;")
    private PixMap field1278;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lqb;")
    private PixMap field1321;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Lqb;")
    private PixMap field1322;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Lqb;")
    private PixMap field1323;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Lqb;")
    private PixMap field1324;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Lqb;")
    private PixMap field1325;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Lqb;")
    private PixMap field1326;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Lqb;")
    private PixMap field1327;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Lqb;")
    private PixMap field1328;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Lqb;")
    private PixMap field1329;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Lqb;")
    private PixMap field1582;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lqb;")
    private PixMap field1583;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Lqb;")
    private PixMap field1584;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Lqb;")
    private PixMap field1619;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Lqb;")
    private PixMap field1620;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Lqb;")
    private PixMap field1621;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Lqb;")
    private PixMap field1622;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lab;")
    public static PlayerEntity field1525;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lr;")
    private World3D field1589;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Ljava/lang/String;")
    public String field1315;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Ljava/lang/String;")
    private String field1367;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Ljava/lang/String;")
    private String field1522;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Ljava/lang/String;")
    public String field1617;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/net/Socket;")
    private Socket field1607;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Z")
    public static boolean field1267;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private static boolean field1294;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    public static boolean field1483;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Z")
    private static boolean field1572;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private static boolean field1598;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Z")
    public static boolean field1672;

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field1395;

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private int[] field1396;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1403;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1542;

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field1543;

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field1601;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field1602;

    @OriginalMember(owner = "client", name = "ji", descriptor = "[I")
    private int[] field1603;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field1645;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field1646;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[I")
    private int[] field1647;

    @OriginalMember(owner = "client", name = "cj", descriptor = "[I")
    private int[] field1648;

    @OriginalMember(owner = "client", name = "He", descriptor = "[Ljb;")
    private Pix8[] field1420;

    @OriginalMember(owner = "client", name = "Db", descriptor = "[[B")
    private byte[][] field1260;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[[B")
    private byte[][] field1576;

    @OriginalMember(owner = "client", name = "ib", descriptor = "[[[B")
    private byte[][][] field1239;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[[[I")
    private int[][][] field1299;

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method429(byte arg0) {
        if (arg0 != 4) {
            this.field1558 = -1;
        }
        if (this.field1354 != 0) {
            PixFont var2 = this.field1450;
            int var3 = 0;
            if (this.field1609 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1220[var4] != null) {
                    int var5 = this.field1218[var4];
                    String var6 = this.field1219[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1612 == 0 || this.field1612 == 1 && this.method437(1657, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method206(-49546, "From", 0, var9, var8);
                        var2.method206(-49546, "From", 65535, var9, var8 - 1);
                        int var10 = var9 + var2.method204("From ", this.field1338);
                        if (var7 == 1) {
                            this.field1295[0].method199(var10, var8 - 12, false);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1295[1].method199(var10, var8 - 12, false);
                            var10 += 14;
                        }
                        var2.method206(-49546, var6 + ": " + this.field1220[var4], 0, var10, var8);
                        var2.method206(-49546, var6 + ": " + this.field1220[var4], 65535, var10, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1612 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method206(-49546, this.field1220[var4], 0, 4, var11);
                        var2.method206(-49546, this.field1220[var4], 65535, 4, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1612 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method206(-49546, "To " + var6 + ": " + this.field1220[var4], 0, 4, var12);
                        var2.method206(-49546, "To " + var6 + ": " + this.field1220[var4], 65535, 4, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method430(int arg0) {
        this.field1635 = new Pix8(this.field1259, "titlebox", 0);
        this.field1636 = new Pix8(this.field1259, "titlebutton", 0);
        this.field1420 = new Pix8[12];
        int var2 = 0;
        if (arg0 != 0) {
            field1245 = 305;
        }
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1420[var3] = new Pix8(this.field1259, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1420[var4] = new Pix8(this.field1259, "runes", (var4 & 3) + 12);
            }
        }
        this.field1285 = new Pix32(128, 265);
        this.field1286 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1285.field662[var5] = this.field1273.field741[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1286.field662[var6] = this.field1274.field741[var6];
        }
        this.field1646 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1646[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1646[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1646[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1646[var10 + 192] = 16777215;
        }
        this.field1647 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1647[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1647[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1647[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1647[var14 + 192] = 16777215;
        }
        this.field1648 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1648[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1648[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1648[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1648[var18 + 192] = 16777215;
        }
        this.field1645 = new int[256];
        this.field1542 = new int[32768];
        this.field1543 = new int[32768];
        this.method505((Pix8) null, false);
        this.field1402 = new int[32768];
        this.field1403 = new int[32768];
        this.method13("Connecting to fileserver", 10, -427);
        if (!this.field1553) {
            this.field1657 = true;
            this.field1553 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1334 = (this.field1334 + 1) % 4;
                this.field1539 = true;
                this.field1563 = true;
                this.field1416.method218((byte) 1, 158);
                this.field1416.method219(this.field1334);
                this.field1416.method219(this.field1612);
                this.field1416.method219(this.field1460);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1612 = (this.field1612 + 1) % 3;
                this.field1539 = true;
                this.field1563 = true;
                this.field1416.method218((byte) 1, 158);
                this.field1416.method219(this.field1334);
                this.field1416.method219(this.field1612);
                this.field1416.method219(this.field1460);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1460 = (this.field1460 + 1) % 3;
                this.field1539 = true;
                this.field1563 = true;
                this.field1416.method218((byte) 1, 158);
                this.field1416.method219(this.field1334);
                this.field1416.method219(this.field1612);
                this.field1416.method219(this.field1460);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                if (this.field1221 == -1) {
                    this.method542((byte) 1);
                    this.field1534 = "";
                    this.field1487 = false;
                    for (int var3 = 0; var3 < Component.field70.length; ++var3) {
                        if (Component.field70[var3] != null && Component.field70[var3].field79 == 600) {
                            this.field1258 = this.field1221 = Component.field70[var3].field76;
                            return;
                        }
                    }
                    return;
                }
                this.method536(1, "", 0, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method432(int arg0) {
        int var2 = 83 / arg0;
        if (this.field1529 == 0) {
            int var3 = super.field28;
            if (this.field1312 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                var3 = 0;
            }
            if (this.field1570) {
                if (var3 != 1) {
                    int var4 = super.field22;
                    int var5 = super.field23;
                    if (this.field1253 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field1253 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field1253 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field1254 - 10 || var4 > this.field1256 + this.field1254 + 10 || var5 < this.field1255 - 10 || var5 > this.field1257 + this.field1255 + 10) {
                        this.field1570 = false;
                        if (this.field1253 == 1) {
                            this.field1587 = true;
                        }
                        if (this.field1253 == 2) {
                            this.field1563 = true;
                        }
                    }
                }
                if (var3 == 1) {
                    int var6 = this.field1254;
                    int var7 = this.field1255;
                    int var8 = this.field1256;
                    int var9 = super.field29;
                    int var10 = super.field30;
                    if (this.field1253 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field1253 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field1253 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field1382; ++var12) {
                        int var13 = (this.field1382 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method457(var11, false);
                    }
                    this.field1570 = false;
                    if (this.field1253 == 1) {
                        this.field1587 = true;
                    }
                    if (this.field1253 == 2) {
                        this.field1563 = true;
                        return;
                    }
                }
            } else {
                if (var3 == 1 && this.field1382 > 0) {
                    int var14 = this.field1248[this.field1382 - 1];
                    if (var14 == 582 || var14 == 113 || var14 == 555 || var14 == 331 || var14 == 354 || var14 == 694 || var14 == 962 || var14 == 795 || var14 == 681 || var14 == 100 || var14 == 102 || var14 == 1328) {
                        int var15 = this.field1246[this.field1382 - 1];
                        int var16 = this.field1247[this.field1382 - 1];
                        Component var17 = Component.field70[var16];
                        if (var17.field97 || var17.field100) {
                            this.field1418 = false;
                            this.field1397 = 0;
                            this.field1527 = var16;
                            this.field1528 = var15;
                            this.field1529 = 2;
                            this.field1530 = super.field29;
                            this.field1531 = super.field30;
                            if (Component.field70[var16].field76 == this.field1221) {
                                this.field1529 = 1;
                            }
                            if (Component.field70[var16].field76 == this.field1348) {
                                this.field1529 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var3 == 1 && (this.field1228 == 1 || this.method525(-172, this.field1382 - 1)) && this.field1382 > 2) {
                    var3 = 2;
                }
                if (var3 == 1 && this.field1382 > 0) {
                    this.method457(this.field1382 - 1, false);
                }
                if (var3 != 2 || this.field1382 <= 0) {
                    return;
                }
                this.method551(9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method433(int arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1505.method248(); var2 != null; var2 = (ProjectileEntity) this.field1505.method250((byte) 71)) {
            if (this.field1461 == var2.field503 && field1279 <= var2.field509) {
                if (field1279 >= var2.field508) {
                    if (var2.field512 > 0) {
                        NpcEntity var4 = this.field1364[var2.field512 - 1];
                        if (var4 != null && var4.field397 >= 0 && var4.field397 < 13312 && var4.field398 >= 0 && var4.field398 < 13312) {
                            var2.method120(var4.field398, field1279, var4.field397, false, this.method550(var4.field397, var4.field398, var2.field503, true) - var2.field507);
                        }
                    }
                    if (var2.field512 < 0) {
                        int var5 = -var2.field512 - 1;
                        PlayerEntity var6;
                        if (this.field1462 == var5) {
                            var6 = field1525;
                        } else {
                            var6 = this.field1497[var5];
                        }
                        if (var6 != null && var6.field397 >= 0 && var6.field397 < 13312 && var6.field398 >= 0 && var6.field398 < 13312) {
                            var2.method120(var6.field398, field1279, var6.field397, false, this.method550(var6.field397, var6.field398, var2.field503, true) - var2.field507);
                        }
                    }
                    var2.method121(-813, this.field1215);
                    this.field1589.method61(60, this.field1461, -346, (int) var2.field515, -1, var2, (int) var2.field516, (int) var2.field514, var2.field522, false);
                }
            } else {
                var2.method106();
            }
        }
        ++field1545;
        this.field1557 += arg0;
        if (field1545 > 1174) {
            field1545 = 0;
            this.field1416.method218((byte) 1, 63);
            this.field1416.method219(0);
            int var3 = this.field1416.field703;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1416.method220(11499);
            }
            this.field1416.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1416.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1416.method219(94);
            }
            this.field1416.method220(51693);
            this.field1416.method219(16);
            this.field1416.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1416.method219(65);
            }
            this.field1416.method219((int) (Math.random() * 256.0D));
            this.field1416.method220(22990);
            this.field1416.method228(9, this.field1416.field703 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method434(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field1402[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field1402[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field1403[var15] = (this.field1402[var15 - 1] + this.field1402[var15 + 1] + this.field1402[var15 - 128] + this.field1402[var15 + 128]) / 4;
            }
        }
        this.field1429 += 128;
        int var6 = 44 / arg0;
        if (this.field1429 > this.field1542.length) {
            this.field1429 -= this.field1542.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method505(this.field1420[var7], false);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field1403[var12 + 128] - this.field1542[this.field1429 + var12 & this.field1542.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field1402[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field1360[var9] = this.field1360[var9 + 1];
        }
        this.field1360[var2 - 1] = (int) (Math.sin((double) field1279 / 14.0D) * 16.0D + Math.sin((double) field1279 / 15.0D) * 14.0D + Math.sin((double) field1279 / 16.0D) * 12.0D);
        if (this.field1479 > 0) {
            this.field1479 -= 4;
        }
        if (this.field1480 > 0) {
            this.field1480 -= 4;
        }
        if (this.field1479 == 0 && this.field1480 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field1479 = 1024;
            }
            if (var10 == 1) {
                this.field1480 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method435(int arg0) {
        if (this.field1354 != 0) {
            int var2 = 0;
            if (this.field1609 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1220[var3] != null) {
                    int var4 = this.field1218[var3];
                    String var5 = this.field1219[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1612 == 0 || this.field1612 == 1 && this.method437(1657, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field22 > 4 && super.field23 - 4 > var9 - 10 && super.field23 - 4 <= var9 + 3) {
                            int var10 = this.field1450.method204("From:  " + var5 + this.field1220[var3], this.field1338) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field22 < var10 + 4) {
                                if (this.field1330 >= 1) {
                                    this.field1280[this.field1382] = "Report abuse @whi@" + var5;
                                    this.field1248[this.field1382] = 2524;
                                    ++this.field1382;
                                }
                                this.field1280[this.field1382] = "Add ignore @whi@" + var5;
                                this.field1248[this.field1382] = 2047;
                                ++this.field1382;
                                this.field1280[this.field1382] = "Add friend @whi@" + var5;
                                this.field1248[this.field1382] = 2605;
                                ++this.field1382;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1612 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field1557 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    public final void method436(Packet arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            field1245 = this.field1407.method295();
        }
        if (arg1 != 99 && arg1 != 131) {
            if (arg1 == 82) {
                int var4 = arg0.method229();
                int var5 = (var4 >> 4 & 7) + this.field1454;
                int var6 = (var4 & 7) + this.field1455;
                int var7 = arg0.method229();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1503[var8];
                int var11 = arg0.method231();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1299[this.field1461][var5][var6];
                    int var13 = this.field1299[this.field1461][var5 + 1][var6];
                    int var14 = this.field1299[this.field1461][var5 + 1][var6 + 1];
                    int var15 = this.field1299[this.field1461][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1589.method72((byte) 4, var6, var5, this.field1461);
                        if (var16 != null) {
                            int var17 = var16.field274 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field272 = new LocEntity(var17, false, var15, var12, 2, var11, var14, var13, -966, var9 + 4);
                                var16.field273 = new LocEntity(var17, false, var15, var12, 2, var11, var14, var13, -966, var9 + 1 & 3);
                            } else {
                                var16.field272 = new LocEntity(var17, false, var15, var12, var8, var11, var14, var13, -966, var9);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1589.method73(17461, this.field1461, var6, var5);
                        if (var18 != null) {
                            var18.field165 = new LocEntity(var18.field166 >> 14 & 32767, false, var15, var12, 4, var11, var14, var13, -966, 0);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1589.method74(var5, this.field1461, var6, 0);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field257 = new LocEntity(var19.field265 >> 14 & 32767, false, var15, var12, var8, var11, var14, var13, -966, var9);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1589.method75(var5, -285, var6, this.field1461);
                        if (var20 != null) {
                            var20.field196 = new LocEntity(var20.field197 >> 14 & 32767, false, var15, var12, 22, var11, var14, var13, -966, var9);
                        }
                    }
                }
            } else if (arg1 == 42) {
                int var21 = arg0.method229();
                int var22 = (var21 >> 4 & 7) + this.field1454;
                int var23 = (var21 & 7) + this.field1455;
                int var24 = arg0.method231();
                int var25 = arg0.method231();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field498 = var24;
                    var26.field499 = var25;
                    if (this.field1288[this.field1461][var22][var23] == null) {
                        this.field1288[this.field1461][var22][var23] = new LinkList(18783);
                    }
                    this.field1288[this.field1461][var22][var23].method245(var26);
                    this.method538(var22, var23);
                }
            } else if (arg1 == 139) {
                int var27 = arg0.method229();
                int var28 = (var27 >> 4 & 7) + this.field1454;
                int var29 = (var27 & 7) + this.field1455;
                int var30 = arg0.method231();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1288[this.field1461][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250((byte) 71)) {
                            if ((var30 & 32767) == var32.field498) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method248() == null) {
                            this.field1288[this.field1461][var28][var29] = null;
                        }
                        this.method538(var28, var29);
                    }
                }
            } else if (arg1 == 164) {
                int var33 = arg0.method229();
                int var34 = (var33 >> 4 & 7) + this.field1454;
                int var35 = (var33 & 7) + this.field1455;
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
                    ProjectileEntity var50 = new ProjectileEntity(field1279 + var42, this.field1461, var46, var47, field1279 + var43, var39, this.method550(var46, var47, this.field1461, true) - var40, var45, var44, 0, var41, var38);
                    var50.method120(var49, field1279 + var42, var48, false, this.method550(var48, var49, this.field1461, true) - var41);
                    this.field1505.method245(var50);
                }
            } else if (arg1 == 127) {
                int var51 = arg0.method229();
                int var52 = (var51 >> 4 & 7) + this.field1454;
                int var53 = (var51 & 7) + this.field1455;
                int var54 = arg0.method231();
                int var55 = arg0.method229();
                int var56 = arg0.method231();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(field1279, var54, var56, var57, var58, this.method550(var57, var58, this.field1461, true) - var55, this.field1461, true);
                    this.field1606.method245(var59);
                }
            } else if (arg1 == 138) {
                int var60 = arg0.method229();
                int var61 = (var60 >> 4 & 7) + this.field1454;
                int var62 = (var60 & 7) + this.field1455;
                int var63 = arg0.method231();
                int var64 = arg0.method231();
                int var65 = arg0.method231();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1462 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field498 = var63;
                    var66.field499 = var64;
                    if (this.field1288[this.field1461][var61][var62] == null) {
                        this.field1288[this.field1461][var61][var62] = new LinkList(18783);
                    }
                    this.field1288[this.field1461][var61][var62].method245(var66);
                    this.method538(var61, var62);
                }
            } else {
                if (arg1 == 91) {
                    int var67 = arg0.method229();
                    int var68 = (var67 >> 4 & 7) + this.field1454;
                    int var69 = (var67 & 7) + this.field1455;
                    int var70 = arg0.method229();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1503[var71];
                    int var74 = arg0.method231();
                    int var75 = arg0.method231();
                    int var76 = arg0.method231();
                    int var77 = arg0.method231();
                    byte var78 = arg0.method230();
                    byte var79 = arg0.method230();
                    byte var80 = arg0.method230();
                    byte var81 = arg0.method230();
                    PlayerEntity var82;
                    if (this.field1462 == var77) {
                        var82 = field1525;
                    } else {
                        var82 = this.field1497[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method330(var74);
                        int var84 = this.field1299[this.field1461][var68][var69];
                        int var85 = this.field1299[this.field1461][var68 + 1][var69];
                        int var86 = this.field1299[this.field1461][var68 + 1][var69 + 1];
                        int var87 = this.field1299[this.field1461][var68][var69 + 1];
                        Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method483(var73, var75 + 1, 0, this.field1461, var69, -1, var76 + 1, 0, 588, var68);
                            var82.field468 = field1279 + var75;
                            var82.field469 = field1279 + var76;
                            var82.field473 = var88;
                            int var89 = var83.field951;
                            int var90 = var83.field952;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field952;
                                var90 = var83.field951;
                            }
                            var82.field470 = var68 * 128 + var89 * 64;
                            var82.field472 = var69 * 128 + var90 * 64;
                            var82.field471 = this.method550(var82.field470, var82.field472, this.field1461, true);
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
                            var82.field474 = var68 + var78;
                            var82.field476 = var68 + var80;
                            var82.field475 = var69 + var79;
                            var82.field477 = var69 + var81;
                        }
                    }
                }
                if (arg1 != 193) {
                    if (arg1 == 196) {
                        int var101 = arg0.method229();
                        int var102 = (var101 >> 4 & 7) + this.field1454;
                        int var103 = (var101 & 7) + this.field1455;
                        int var104 = arg0.method231();
                        int var105 = arg0.method229();
                        int var106 = var105 >> 4 & 15;
                        int var107 = var105 & 7;
                        if (field1525.field447[0] >= var102 - var106 && field1525.field447[0] <= var102 + var106 && field1525.field448[0] >= var103 - var106 && field1525.field448[0] <= var103 + var106 && this.field1671 && !field1294 && this.field1475 < 50) {
                            this.field1368[this.field1475] = var104;
                            this.field1351[this.field1475] = var107;
                            this.field1317[this.field1475] = Wave.field902[var104];
                            ++this.field1475;
                            return;
                        }
                    }
                } else {
                    int var93 = arg0.method229();
                    int var94 = (var93 >> 4 & 7) + this.field1454;
                    int var95 = (var93 & 7) + this.field1455;
                    int var96 = arg0.method231();
                    int var97 = arg0.method231();
                    int var98 = arg0.method231();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1288[this.field1461][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250((byte) 71)) {
                                if ((var96 & 32767) == var100.field498 && var100.field499 == var97) {
                                    var100.field499 = var98;
                                    break;
                                }
                            }
                            this.method538(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var108 = arg0.method229();
            int var109 = (var108 >> 4 & 7) + this.field1454;
            int var110 = (var108 & 7) + this.field1455;
            int var111 = arg0.method229();
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = this.field1503[var112];
            int var115;
            if (arg1 == 131) {
                var115 = -1;
            } else {
                var115 = arg0.method231();
            }
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                this.method483(var114, 0, var112, this.field1461, var110, var115, -1, var113, 588, var109);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method437(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1240; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1641[var3])) {
                    return true;
                }
            }
            if (arg0 != 1657) {
                field1391 = this.field1407.method295();
            }
            return arg1.equalsIgnoreCase(field1525.field458);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public void method438(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1578);
        if (arg0 == 6) {
            if (this.field1549 != null) {
                System.out.println("Od-cycle:" + this.field1549.field842);
            }
            System.out.println("loop-cycle:" + field1279);
            System.out.println("draw-cycle:" + field1488);
            System.out.println("ptype:" + this.field1558);
            System.out.println("psize:" + this.field1557);
            if (this.field1262 != null) {
                this.field1262.method43(6);
            }
            super.field11 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != 7) {
            this.field1558 = this.field1627.method229();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method439(boolean arg0) {
        this.field1622.method258((byte) -127);
        if (arg0) {
            Pix3D.field644 = this.field1601;
            this.field1320.method199(0, 0, false);
            if (this.field1571) {
                this.field1451.method202(0, 40, 36569, 239, this.field1361);
                this.field1451.method202(128, 60, 36569, 239, this.field1415 + "*");
            } else if (this.field1342) {
                this.field1451.method202(0, 40, 36569, 239, "Enter amount:");
                this.field1451.method202(128, 60, 36569, 239, this.field1618 + "*");
            } else if (this.field1367 != null) {
                this.field1451.method202(0, 40, 36569, 239, this.field1367);
                this.field1451.method202(128, 60, 36569, 239, "Click to continue");
            } else if (this.field1348 != -1) {
                this.method535(0, 0, Component.field70[this.field1348], 0, (byte) 0);
            } else if (this.field1494 != -1) {
                this.method535(0, 0, Component.field70[this.field1494], 0, (byte) 0);
            } else {
                PixFont var2 = this.field1450;
                int var3 = 0;
                Pix2D.method154(0, 0, 463, 0, 77);
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1220[var4] != null) {
                        int var6 = this.field1218[var4];
                        int var7 = 70 - var3 * 14 + this.field1652;
                        String var8 = this.field1219[var4];
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
                                var2.method206(-49546, this.field1220[var4], 0, 4, var7);
                            }
                            ++var3;
                        }
                        if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1334 == 0 || this.field1334 == 1 && this.method437(1657, var8))) {
                            if (var7 > 0 && var7 < 110) {
                                int var10 = 4;
                                if (var9 == 1) {
                                    this.field1295[0].method199(var10, var7 - 12, false);
                                    var10 += 14;
                                }
                                if (var9 == 2) {
                                    this.field1295[1].method199(var10, var7 - 12, false);
                                    var10 += 14;
                                }
                                var2.method206(-49546, var8 + ":", 0, var10, var7);
                                int var11 = var10 + var2.method204(var8, this.field1338) + 8;
                                var2.method206(-49546, this.field1220[var4], 255, var11, var7);
                            }
                            ++var3;
                        }
                        if ((var6 == 3 || var6 == 7) && this.field1354 == 0 && (var6 == 7 || this.field1612 == 0 || this.field1612 == 1 && this.method437(1657, var8))) {
                            if (var7 > 0 && var7 < 110) {
                                byte var12 = 4;
                                var2.method206(-49546, "From", 0, var12, var7);
                                int var13 = var12 + var2.method204("From ", this.field1338);
                                if (var9 == 1) {
                                    this.field1295[0].method199(var13, var7 - 12, false);
                                    var13 += 14;
                                }
                                if (var9 == 2) {
                                    this.field1295[1].method199(var13, var7 - 12, false);
                                    var13 += 14;
                                }
                                var2.method206(-49546, var8 + ":", 0, var13, var7);
                                int var14 = var13 + var2.method204(var8, this.field1338) + 8;
                                var2.method206(-49546, this.field1220[var4], 8388608, var14, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 4 && (this.field1460 == 0 || this.field1460 == 1 && this.method437(1657, var8))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method206(-49546, var8 + " " + this.field1220[var4], 8388736, 4, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 5 && this.field1354 == 0 && this.field1612 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method206(-49546, this.field1220[var4], 8388608, 4, var7);
                            }
                            ++var3;
                        }
                        if (var6 == 6 && this.field1354 == 0 && this.field1612 < 2) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method206(-49546, "To " + var8 + ":", 0, 4, var7);
                                var2.method206(-49546, this.field1220[var4], 8388608, 12 + var2.method204("To " + var8, this.field1338), var7);
                            }
                            ++var3;
                        }
                        if (var6 == 8 && (this.field1460 == 0 || this.field1460 == 1 && this.method437(1657, var8))) {
                            if (var7 > 0 && var7 < 110) {
                                var2.method206(-49546, var8 + " " + this.field1220[var4], 8270336, 4, var7);
                            }
                            ++var3;
                        }
                    }
                }
                Pix2D.method153(4207);
                this.field1517 = var3 * 14 + 7;
                if (this.field1517 < 78) {
                    this.field1517 = 78;
                }
                this.method454(77, 463, 854, this.field1517, this.field1517 - this.field1652 - 77, 0);
                String var5;
                if (field1525 != null && field1525.field458 != null) {
                    var5 = field1525.field458;
                } else {
                    var5 = JString.method304((byte) 8, this.field1398);
                }
                var2.method206(-49546, var5 + ":", 0, 4, 90);
                var2.method206(-49546, this.field1566 + "*", 255, 6 + var2.method204(var5 + ": ", this.field1338), 90);
                Pix2D.method160(77, 0, 479, (byte) 6, 0);
            }
            if (this.field1570 && this.field1253 == 2) {
                this.method562(711);
            }
            this.field1622.method259(17, 357, (byte) 3, super.field14);
            this.field1621.method258((byte) -127);
            Pix3D.field644 = this.field1603;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method440(int arg0, int arg1) {
        int var3 = 97 / arg1;
        if (!field1294) {
            if (Pix3D.field652[17] >= arg0) {
                Pix8 var4 = Pix3D.field646[17];
                int var5 = var4.field675 * var4.field674 - 1;
                int var6 = this.field1215 * var4.field674 * 2;
                byte[] var7 = var4.field672;
                byte[] var8 = this.field1355;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field672 = var8;
                this.field1355 = var7;
                Pix3D.method171(true, 17);
            }
            if (Pix3D.field652[24] >= arg0) {
                Pix8 var10 = Pix3D.field646[24];
                int var11 = var10.field675 * var10.field674 - 1;
                int var12 = this.field1215 * var10.field674 * 2;
                byte[] var13 = var10.field672;
                byte[] var14 = this.field1355;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field672 = var14;
                this.field1355 = var13;
                Pix3D.method171(true, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method441(int arg0) {
        if (this.field1622 == null) {
            this.method479(7);
            super.field15 = null;
            this.field1270 = null;
            this.field1271 = null;
            this.field1272 = null;
            this.field1273 = null;
            this.field1274 = null;
            this.field1275 = null;
            this.field1276 = null;
            this.field1277 = null;
            this.field1278 = null;
            this.field1622 = new PixMap(false, this.method11(7), 479, 96);
            this.field1620 = new PixMap(false, this.method11(7), 172, 156);
            Pix2D.method155(0);
            this.field1319.method199(0, 0, false);
            this.field1619 = new PixMap(false, this.method11(7), 190, 261);
            this.field1621 = new PixMap(false, this.method11(7), 512, 334);
            Pix2D.method155(0);
            this.field1582 = new PixMap(false, this.method11(7), 496, 50);
            this.field1583 = new PixMap(false, this.method11(7), 269, 37);
            if (arg0 < 1 || arg0 > 1) {
                this.method6();
            }
            this.field1584 = new PixMap(false, this.method11(7), 249, 45);
            this.field1470 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method442(byte arg0) {
        if (arg0 != -100) {
            this.field1526 = -448;
        }
        if (super.field28 == 1) {
            if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field1644[0] != -1) {
                this.field1587 = true;
                this.field1456 = 0;
                this.field1371 = true;
            }
            if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field1644[1] != -1) {
                this.field1587 = true;
                this.field1456 = 1;
                this.field1371 = true;
            }
            if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field1644[2] != -1) {
                this.field1587 = true;
                this.field1456 = 2;
                this.field1371 = true;
            }
            if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field1644[3] != -1) {
                this.field1587 = true;
                this.field1456 = 3;
                this.field1371 = true;
            }
            if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field1644[4] != -1) {
                this.field1587 = true;
                this.field1456 = 4;
                this.field1371 = true;
            }
            if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field1644[5] != -1) {
                this.field1587 = true;
                this.field1456 = 5;
                this.field1371 = true;
            }
            if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field1644[6] != -1) {
                this.field1587 = true;
                this.field1456 = 6;
                this.field1371 = true;
            }
            if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field1644[7] != -1) {
                this.field1587 = true;
                this.field1456 = 7;
                this.field1371 = true;
            }
            if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field1644[8] != -1) {
                this.field1587 = true;
                this.field1456 = 8;
                this.field1371 = true;
            }
            if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field1644[9] != -1) {
                this.field1587 = true;
                this.field1456 = 9;
                this.field1371 = true;
            }
            if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field1644[10] != -1) {
                this.field1587 = true;
                this.field1456 = 10;
                this.field1371 = true;
            }
            if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field1644[11] != -1) {
                this.field1587 = true;
                this.field1456 = 11;
                this.field1371 = true;
            }
            if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field1644[12] != -1) {
                this.field1587 = true;
                this.field1456 = 12;
                this.field1371 = true;
            }
            if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field1644[13] != -1) {
                this.field1587 = true;
                this.field1456 = 13;
                this.field1371 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method443(int arg0) {
        byte[] var2 = this.field1259.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1273.method258((byte) -127);
        var3.method184(-8550, 0, 0);
        this.field1274.method258((byte) -127);
        var3.method184(-8550, 0, -637);
        this.field1270.method258((byte) -127);
        var3.method184(-8550, 0, -128);
        this.field1271.method258((byte) -127);
        var3.method184(-8550, -371, -202);
        this.field1272.method258((byte) -127);
        var3.method184(-8550, -171, -202);
        this.field1275.method258((byte) -127);
        var3.method184(-8550, -265, 0);
        this.field1276.method258((byte) -127);
        var3.method184(-8550, -265, -562);
        this.field1277.method258((byte) -127);
        var3.method184(-8550, -171, -128);
        this.field1278.method258((byte) -127);
        var3.method184(-8550, -171, -562);
        int[] var4 = new int[var3.field663];
        for (int var5 = 0; var5 < var3.field664; ++var5) {
            for (int var10 = 0; var10 < var3.field663; ++var10) {
                var4[var10] = var3.field662[var3.field663 * var5 + (var3.field663 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field663; ++var11) {
                var3.field662[var3.field663 * var5 + var11] = var4[var11];
            }
        }
        this.field1273.method258((byte) -127);
        var3.method184(-8550, 0, 382);
        this.field1274.method258((byte) -127);
        var3.method184(-8550, 0, -255);
        this.field1270.method258((byte) -127);
        var3.method184(-8550, 0, 254);
        this.field1271.method258((byte) -127);
        var3.method184(-8550, -371, 180);
        this.field1272.method258((byte) -127);
        var3.method184(-8550, -171, 180);
        this.field1275.method258((byte) -127);
        var3.method184(-8550, -265, 382);
        this.field1276.method258((byte) -127);
        var3.method184(-8550, -265, -180);
        this.field1277.method258((byte) -127);
        var3.method184(-8550, -171, 254);
        this.field1278.method258((byte) -127);
        var3.method184(-8550, -171, -180);
        Pix32 var6 = new Pix32(this.field1259, "logo", 0);
        this.field1557 += arg0;
        this.field1270.method258((byte) -127);
        var6.method186(382 - var6.field663 / 2 - 128, 18, false);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)Z")
    public final boolean method444(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1262 == null) {
            return false;
        } else {
            try {
                int var3 = this.field1262.method40();
                if (var3 == 0) {
                    return false;
                }
                if (this.field1558 == -1) {
                    this.field1262.method41(this.field1627.field702, 0, 1);
                    this.field1558 = this.field1627.field702[0] & 255;
                    if (this.field1407 != null) {
                        this.field1558 = this.field1558 - this.field1407.method295() & 255;
                    }
                    this.field1557 = Protocol.field1082[this.field1558];
                    --var3;
                }
                if (this.field1557 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field1262.method41(this.field1627.field702, 0, 1);
                    this.field1557 = this.field1627.field702[0] & 255;
                    --var3;
                }
                if (this.field1557 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field1262.method41(this.field1627.field702, 0, 2);
                    this.field1627.field703 = 0;
                    this.field1557 = this.field1627.method231();
                    var3 -= 2;
                }
                if (var3 < this.field1557) {
                    return false;
                }
                this.field1627.field703 = 0;
                this.field1262.method41(this.field1627.field702, 0, this.field1557);
                this.field1559 = 0;
                this.field1347 = this.field1346;
                this.field1346 = this.field1345;
                this.field1345 = this.field1558;
                if (this.field1558 == 29) {
                    int var4 = this.field1627.method232();
                    this.field1494 = var4;
                    this.field1563 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 65) {
                    this.field1454 = this.field1627.method229();
                    this.field1455 = this.field1627.method229();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 247) {
                    int var5 = this.field1627.method231();
                    int var6 = this.field1627.method229();
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    this.field1644[var6] = var5;
                    this.field1587 = true;
                    this.field1371 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 171) {
                    this.field1659 = this.field1627.method229();
                    if (this.field1659 == this.field1456) {
                        if (this.field1659 == 3) {
                            this.field1456 = 1;
                        } else {
                            this.field1456 = 3;
                        }
                        this.field1587 = true;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 246) {
                    int var7 = this.field1627.method229();
                    int var8 = this.field1627.method229();
                    int var9 = this.field1627.method229();
                    int var10 = this.field1627.method229();
                    this.field1352[var7] = true;
                    this.field1637[var7] = var8;
                    this.field1289[var7] = var9;
                    this.field1431[var7] = var10;
                    this.field1453[var7] = 0;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 13) {
                    int var11 = this.field1627.method231();
                    String var12 = this.field1627.method236();
                    Component.field70[var11].field111 = var12;
                    if (this.field1644[this.field1456] == Component.field70[var11].field76) {
                        this.field1587 = true;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 213) {
                    this.field1459 = this.field1627.method229();
                    if (this.field1459 == 1) {
                        this.field1623 = this.field1627.method231();
                    }
                    if (this.field1459 >= 2 && this.field1459 <= 6) {
                        if (this.field1459 == 2) {
                            this.field1413 = 64;
                            this.field1414 = 64;
                        }
                        if (this.field1459 == 3) {
                            this.field1413 = 0;
                            this.field1414 = 64;
                        }
                        if (this.field1459 == 4) {
                            this.field1413 = 128;
                            this.field1414 = 64;
                        }
                        if (this.field1459 == 5) {
                            this.field1413 = 64;
                            this.field1414 = 0;
                        }
                        if (this.field1459 == 6) {
                            this.field1413 = 64;
                            this.field1414 = 128;
                        }
                        this.field1459 = 2;
                        this.field1410 = this.field1627.method231();
                        this.field1411 = this.field1627.method231();
                        this.field1412 = this.field1627.method229();
                    }
                    if (this.field1459 == 10) {
                        this.field1287 = this.field1627.method231();
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 7) {
                    this.field1571 = false;
                    this.field1342 = true;
                    this.field1618 = "";
                    this.field1563 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 74) {
                    long var13 = this.field1627.method235(true);
                    int var15 = this.field1627.method234();
                    int var16 = this.field1627.method229();
                    boolean var17 = false;
                    for (int var18 = 0; var18 < 100; ++var18) {
                        if (this.field1625[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                    if (var16 <= 1) {
                        for (int var19 = 0; var19 < this.field1611; ++var19) {
                            if (this.field1550[var19] == var13) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                    if (!var17 && this.field1581 == 0) {
                        try {
                            this.field1625[this.field1510] = var15;
                            this.field1510 = (this.field1510 + 1) % 100;
                            String var20 = WordPack.method306((byte) -66, this.field1557 - 13, this.field1627);
                            String var21 = WordFilter.method401((byte) 1, var20);
                            if (var16 != 2 && var16 != 3) {
                                if (var16 == 1) {
                                    this.method536(1, "@cr1@" + JString.method304((byte) 8, JString.method301(this.field1649, var13)), 7, var21);
                                } else {
                                    this.method536(1, JString.method304((byte) 8, JString.method301(this.field1649, var13)), 3, var21);
                                }
                            } else {
                                this.method536(1, "@cr2@" + JString.method304((byte) 8, JString.method301(this.field1649, var13)), 7, var21);
                            }
                        } catch (Exception var165) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 22) {
                    int var23 = this.field1627.method231();
                    int var24 = this.field1627.method232();
                    int var25 = this.field1627.method232();
                    Component var26 = Component.field70[var23];
                    var26.field83 = var24;
                    var26.field84 = var25;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 79) {
                    this.field1241 = this.field1627.method229();
                    this.field1587 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 182) {
                    int var27 = this.field1627.method231();
                    byte var28 = this.field1627.method230();
                    this.field1655[var27] = var28;
                    if (this.field1359[var27] != var28) {
                        this.field1359[var27] = var28;
                        this.method462(var27, 35227);
                        this.field1587 = true;
                        if (this.field1494 != -1) {
                            this.field1563 = true;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 87) {
                    int var29 = this.field1627.method231();
                    this.method539(var29, (byte) 5);
                    if (this.field1348 != -1) {
                        this.field1348 = -1;
                        this.field1563 = true;
                    }
                    if (this.field1342) {
                        this.field1342 = false;
                        this.field1563 = true;
                    }
                    this.field1350 = var29;
                    this.field1587 = true;
                    this.field1371 = true;
                    this.field1221 = -1;
                    this.field1377 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 140) {
                    this.method475(this.field1627, this.field1557, (byte) 2);
                    this.field1336 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 81) {
                    this.field1587 = true;
                    int var30 = this.field1627.method231();
                    Component var31 = Component.field70[var30];
                    while (this.field1627.field703 < this.field1557) {
                        int var32 = this.field1627.method243();
                        int var33 = this.field1627.method231();
                        int var34 = this.field1627.method229();
                        if (var34 == 255) {
                            var34 = this.field1627.method234();
                        }
                        if (var32 >= 0 && var32 < var31.field71.length) {
                            var31.field71[var32] = var33;
                            var31.field72[var32] = var34;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 1) {
                    this.field1609 = this.field1627.method231() * 30;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 195) {
                    this.field1573 = 0;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 90) {
                    int var35 = this.field1627.method231();
                    if (var35 == 65535) {
                        var35 = -1;
                    }
                    if (this.field1588 != var35 && this.field1370 && !field1294 && this.field1231 == 0) {
                        this.field1515 = var35;
                        this.field1516 = true;
                        this.field1549.method279(2, this.field1515);
                    }
                    this.field1588 = var35;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 84) {
                    int var36 = this.field1627.method231();
                    int var37 = this.field1627.method231();
                    if (this.field1370 && !field1294) {
                        this.field1515 = var36;
                        this.field1516 = false;
                        this.field1549.method279(2, this.field1515);
                        this.field1231 = var37;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 154) {
                    int var38 = this.field1627.method231();
                    int var39 = this.field1627.method229();
                    int var40 = this.field1627.method231();
                    if (this.field1671 && !field1294 && this.field1475 < 50) {
                        this.field1368[this.field1475] = var38;
                        this.field1351[this.field1475] = var39;
                        this.field1317[this.field1475] = Wave.field902[var38] + var40;
                        ++this.field1475;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 214) {
                    int var41 = this.field1627.method231();
                    int var42 = this.field1627.method234();
                    this.field1655[var41] = var42;
                    if (this.field1359[var41] != var42) {
                        this.field1359[var41] = var42;
                        this.method462(var41, 35227);
                        this.field1587 = true;
                        if (this.field1494 != -1) {
                            this.field1563 = true;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 219) {
                    this.field1518 = false;
                    for (int var43 = 0; var43 < 5; ++var43) {
                        this.field1352[var43] = false;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 153) {
                    this.field1597 = this.field1627.method229();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 220) {
                    int var44 = this.field1627.method231();
                    int var45 = this.field1627.method231();
                    Component.field70[var44].field119 = 2;
                    Component.field70[var44].field120 = var45;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 23) {
                    int var46 = this.field1627.method231();
                    boolean var47 = this.field1627.method229() == 1;
                    Component.field70[var46].field91 = var47;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 108) {
                    int var48 = this.field1627.method231();
                    Component.field70[var48].field119 = 3;
                    if (field1525.field480 == null) {
                        Component.field70[var48].field120 = (field1525.field462[11] << 5) + (field1525.field462[8] << 10) + (field1525.field462[0] << 15) + (field1525.field463[0] << 25) + (field1525.field463[4] << 20) + field1525.field462[1];
                    } else {
                        Component.field70[var48].field120 = (int) (field1525.field480.field998 + 305419896L);
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 77) {
                    this.field1611 = this.field1557 / 8;
                    for (int var49 = 0; var49 < this.field1611; ++var49) {
                        this.field1550[var49] = this.field1627.method235(true);
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 85) {
                    this.field1462 = this.field1627.method231();
                    this.field1656 = this.field1627.method229();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 142) {
                    this.field1454 = this.field1627.method229();
                    this.field1455 = this.field1627.method229();
                    while (this.field1627.field703 < this.field1557) {
                        int var50 = this.field1627.method229();
                        this.method436(this.field1627, var50, -103);
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 111) {
                    int var51 = this.field1627.method231();
                    int var52 = this.field1627.method231();
                    if (this.field1348 != -1) {
                        this.field1348 = -1;
                        this.field1563 = true;
                    }
                    if (this.field1342) {
                        this.field1342 = false;
                        this.field1563 = true;
                    }
                    this.field1221 = var51;
                    this.field1350 = var52;
                    this.field1587 = true;
                    this.field1371 = true;
                    this.field1377 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 191) {
                    int var53 = this.field1627.method231();
                    this.method539(var53, (byte) 5);
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1587 = true;
                        this.field1371 = true;
                    }
                    if (this.field1348 != -1) {
                        this.field1348 = -1;
                        this.field1563 = true;
                    }
                    if (this.field1342) {
                        this.field1342 = false;
                        this.field1563 = true;
                    }
                    this.field1221 = var53;
                    this.field1377 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 165) {
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1587 = true;
                        this.field1371 = true;
                    }
                    if (this.field1348 != -1) {
                        this.field1348 = -1;
                        this.field1563 = true;
                    }
                    if (this.field1342) {
                        this.field1342 = false;
                        this.field1563 = true;
                    }
                    this.field1221 = -1;
                    this.field1377 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 24) {
                    if (this.field1456 == 12) {
                        this.field1587 = true;
                    }
                    this.field1383 = this.field1627.method229();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 106) {
                    long var54 = this.field1627.method235(true);
                    int var56 = this.field1627.method229();
                    String var57 = JString.method304((byte) 8, JString.method301(this.field1649, var54));
                    for (int var58 = 0; var58 < this.field1240; ++var58) {
                        if (this.field1604[var58] == var54) {
                            if (this.field1509[var58] != var56) {
                                this.field1509[var58] = var56;
                                this.field1587 = true;
                                if (var56 > 0) {
                                    this.method536(1, "", 5, var57 + " has logged in.");
                                }
                                if (var56 == 0) {
                                    this.method536(1, "", 5, var57 + " has logged out.");
                                }
                            }
                            var57 = null;
                            break;
                        }
                    }
                    if (var57 != null && this.field1240 < 200) {
                        this.field1604[this.field1240] = var54;
                        this.field1641[this.field1240] = var57;
                        this.field1509[this.field1240] = var56;
                        ++this.field1240;
                        this.field1587 = true;
                    }
                    boolean var59 = false;
                    while (!var59) {
                        var59 = true;
                        for (int var60 = 0; var60 < this.field1240 - 1; ++var60) {
                            if (this.field1509[var60] != field1291 && this.field1509[var60 + 1] == field1291 || this.field1509[var60] == 0 && this.field1509[var60 + 1] != 0) {
                                int var61 = this.field1509[var60];
                                this.field1509[var60] = this.field1509[var60 + 1];
                                this.field1509[var60 + 1] = var61;
                                String var62 = this.field1641[var60];
                                this.field1641[var60] = this.field1641[var60 + 1];
                                this.field1641[var60 + 1] = var62;
                                long var63 = this.field1604[var60];
                                this.field1604[var60] = this.field1604[var60 + 1];
                                this.field1604[var60 + 1] = var63;
                                this.field1587 = true;
                                var59 = false;
                            }
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 68) {
                    this.field1482 = this.field1627.method234();
                    this.field1484 = this.field1627.method231();
                    this.field1548 = this.field1627.method229();
                    this.field1478 = this.field1627.method231();
                    this.field1552 = this.field1627.method229();
                    if (this.field1482 != 0 && this.field1221 == -1) {
                        signlink.dnslookup(JString.method303(this.field1482, -22504));
                        this.method542((byte) 1);
                        short var65 = 650;
                        if (this.field1548 != 201 || this.field1552 == 1) {
                            var65 = 655;
                        }
                        this.field1534 = "";
                        this.field1487 = false;
                        for (int var66 = 0; var66 < Component.field70.length; ++var66) {
                            if (Component.field70[var66] != null && Component.field70[var66].field79 == var65) {
                                this.field1221 = Component.field70[var66].field76;
                                break;
                            }
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 20) {
                    this.field1334 = this.field1627.method229();
                    this.field1612 = this.field1627.method229();
                    this.field1460 = this.field1627.method229();
                    this.field1539 = true;
                    this.field1563 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 224) {
                    this.method445(543);
                    this.field1558 = -1;
                    return false;
                }
                if (this.field1558 == 126) {
                    int var67 = this.field1627.method231();
                    Component var68 = Component.field70[var67];
                    for (int var69 = 0; var69 < var68.field71.length; ++var69) {
                        var68.field71[var69] = -1;
                        var68.field71[var69] = 0;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 159) {
                    for (int var70 = 0; var70 < this.field1359.length; ++var70) {
                        if (this.field1655[var70] != this.field1359[var70]) {
                            this.field1359[var70] = this.field1655[var70];
                            this.method462(var70, 35227);
                            this.field1587 = true;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 133) {
                    int var71 = this.field1627.method231();
                    int var72 = this.field1627.method232();
                    Component var73 = Component.field70[var71];
                    var73.field123 = var72;
                    if (var72 == -1) {
                        var73.field73 = 0;
                        var73.field74 = 0;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 10) {
                    this.field1518 = true;
                    this.field1222 = this.field1627.method229();
                    this.field1223 = this.field1627.method229();
                    this.field1224 = this.field1627.method231();
                    this.field1225 = this.field1627.method229();
                    this.field1226 = this.field1627.method229();
                    if (this.field1226 >= 100) {
                        int var74 = this.field1222 * 128 + 64;
                        int var75 = this.field1223 * 128 + 64;
                        int var76 = this.method550(var74, var75, this.field1461, true) - this.field1224;
                        int var77 = var74 - this.field1305;
                        int var78 = var76 - this.field1306;
                        int var79 = var75 - this.field1307;
                        int var80 = (int) Math.sqrt((double) (var77 * var77 + var79 * var79));
                        this.field1308 = (int) (Math.atan2((double) var78, (double) var80) * 325.949D) & 2047;
                        this.field1309 = (int) (Math.atan2((double) var77, (double) var79) * -325.949D) & 2047;
                        if (this.field1308 < 128) {
                            this.field1308 = 128;
                        }
                        if (this.field1308 > 383) {
                            this.field1308 = 383;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 151) {
                    for (int var81 = 0; var81 < this.field1497.length; ++var81) {
                        if (this.field1497[var81] != null) {
                            this.field1497[var81].field425 = -1;
                        }
                    }
                    for (int var82 = 0; var82 < this.field1364.length; ++var82) {
                        if (this.field1364[var82] != null) {
                            this.field1364[var82].field425 = -1;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 163) {
                    int var83 = this.field1627.method231();
                    int var84 = this.field1627.method231();
                    Component var85 = Component.field70[var83];
                    if (var85 != null && var85.field77 == 0) {
                        if (var84 < 0) {
                            var84 = 0;
                        }
                        if (var84 > var85.field89 - var85.field81) {
                            var84 = var85.field89 - var85.field81;
                        }
                        var85.field90 = var84;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 110) {
                    int var86 = this.field1627.method231();
                    this.method539(var86, (byte) 5);
                    if (this.field1350 != -1) {
                        this.field1350 = -1;
                        this.field1587 = true;
                        this.field1371 = true;
                    }
                    this.field1348 = var86;
                    this.field1563 = true;
                    this.field1221 = -1;
                    this.field1377 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 232) {
                    this.field1587 = true;
                    int var87 = this.field1627.method231();
                    Component var88 = Component.field70[var87];
                    int var89 = this.field1627.method231();
                    for (int var90 = 0; var90 < var89; ++var90) {
                        var88.field71[var90] = this.field1627.method231();
                        int var91 = this.field1627.method229();
                        if (var91 == 255) {
                            var91 = this.field1627.method234();
                        }
                        var88.field72[var90] = var91;
                    }
                    for (int var92 = var89; var92 < var88.field71.length; ++var92) {
                        var88.field71[var92] = 0;
                        var88.field72[var92] = 0;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 38) {
                    int var93 = this.field1627.method231();
                    int var94 = this.field1627.method231();
                    Component.field70[var93].field119 = 1;
                    Component.field70[var93].field120 = var94;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 103) {
                    int var95 = this.field1627.method232();
                    if (var95 >= 0) {
                        this.method539(var95, (byte) 5);
                    }
                    this.field1468 = var95;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 125) {
                    this.field1454 = this.field1627.method229();
                    this.field1455 = this.field1627.method229();
                    for (int var96 = this.field1454; var96 < this.field1454 + 8; ++var96) {
                        for (int var97 = this.field1455; var97 < this.field1455 + 8; ++var97) {
                            if (this.field1288[this.field1461][var96][var97] != null) {
                                this.field1288[this.field1461][var96][var97] = null;
                                this.method538(var96, var97);
                            }
                        }
                    }
                    for (LocSpawned var98 = (LocSpawned) this.field1331.method248(); var98 != null; var98 = (LocSpawned) this.field1331.method250((byte) 71)) {
                        if (var98.field723 >= this.field1454 && var98.field723 < this.field1454 + 8 && var98.field724 >= this.field1455 && var98.field724 < this.field1455 + 8 && this.field1461 == var98.field721) {
                            var98.field732 = 0;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 53) {
                    int var99 = this.field1627.method229();
                    int var100 = this.field1627.method229();
                    String var101 = this.field1627.method236();
                    if (var99 >= 1 && var99 <= 5) {
                        if (var101.equalsIgnoreCase("null")) {
                            var101 = null;
                        }
                        this.field1523[var99 - 1] = var101;
                        this.field1524[var99 - 1] = var100 == 0;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 3) {
                    this.field1587 = true;
                    int var102 = this.field1627.method229();
                    int var103 = this.field1627.method234();
                    int var104 = this.field1627.method229();
                    this.field1372[var102] = var103;
                    this.field1363[var102] = var104;
                    this.field1357[var102] = 1;
                    for (int var105 = 0; var105 < 98; ++var105) {
                        if (var103 >= field1504[var105]) {
                            this.field1357[var102] = var105 + 2;
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 196 || this.field1558 == 193 || this.field1558 == 91 || this.field1558 == 138 || this.field1558 == 127 || this.field1558 == 164 || this.field1558 == 139 || this.field1558 == 42 || this.field1558 == 82 || this.field1558 == 131 || this.field1558 == 99) {
                    this.method436(this.field1627, this.field1558, -103);
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 59) {
                    String var106 = this.field1627.method236();
                    if (var106.endsWith(":tradereq:")) {
                        String var107 = var106.substring(0, var106.indexOf(":"));
                        long var108 = JString.method300(var107);
                        boolean var110 = false;
                        for (int var111 = 0; var111 < this.field1611; ++var111) {
                            if (this.field1550[var111] == var108) {
                                var110 = true;
                                break;
                            }
                        }
                        if (!var110 && this.field1581 == 0) {
                            this.method536(1, var107, 4, "wishes to trade with you.");
                        }
                    } else if (var106.endsWith(":duelreq:")) {
                        String var112 = var106.substring(0, var106.indexOf(":"));
                        long var113 = JString.method300(var112);
                        boolean var115 = false;
                        for (int var116 = 0; var116 < this.field1611; ++var116) {
                            if (this.field1550[var116] == var113) {
                                var115 = true;
                                break;
                            }
                        }
                        if (!var115 && this.field1581 == 0) {
                            this.method536(1, var112, 8, "wishes to duel with you.");
                        }
                    } else if (!var106.endsWith(":chalreq:")) {
                        this.method536(1, "", 0, var106);
                    } else {
                        String var117 = var106.substring(0, var106.indexOf(":"));
                        long var118 = JString.method300(var117);
                        boolean var120 = false;
                        for (int var121 = 0; var121 < this.field1611; ++var121) {
                            if (this.field1550[var121] == var118) {
                                var120 = true;
                                break;
                            }
                        }
                        if (!var120 && this.field1581 == 0) {
                            String var122 = var106.substring(var106.indexOf(":") + 1, var106.length() - 9);
                            this.method536(1, var117, 8, var122);
                        }
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 40) {
                    int var123 = this.field1627.method231();
                    int var124 = this.field1627.method231();
                    if (this.field1265 == var123 && this.field1266 == var124 && this.field1600 == 2) {
                        this.field1558 = -1;
                        return true;
                    }
                    this.field1265 = var123;
                    this.field1266 = var124;
                    this.field1511 = (this.field1265 - 6) * 8;
                    this.field1512 = (this.field1266 - 6) * 8;
                    this.field1476 = false;
                    if ((this.field1265 / 8 == 48 || this.field1265 / 8 == 49) && this.field1266 / 8 == 48) {
                        this.field1476 = true;
                    }
                    if (this.field1265 / 8 == 48 && this.field1266 / 8 == 148) {
                        this.field1476 = true;
                    }
                    this.field1600 = 1;
                    this.field1628 = System.currentTimeMillis();
                    this.field1621.method258((byte) -127);
                    this.field1450.method202(0, 151, 36569, 257, "Loading - please wait.");
                    this.field1450.method202(16777215, 150, 36569, 256, "Loading - please wait.");
                    this.field1621.method259(4, 4, (byte) 3, super.field14);
                    int var125 = 0;
                    for (int var126 = (this.field1265 - 6) / 8; var126 <= (this.field1265 + 6) / 8; ++var126) {
                        for (int var127 = (this.field1266 - 6) / 8; var127 <= (this.field1266 + 6) / 8; ++var127) {
                            ++var125;
                        }
                    }
                    this.field1576 = new byte[var125][];
                    this.field1260 = new byte[var125][];
                    this.field1394 = new int[var125];
                    this.field1395 = new int[var125];
                    this.field1396 = new int[var125];
                    int var128 = 0;
                    for (int var129 = (this.field1265 - 6) / 8; var129 <= (this.field1265 + 6) / 8; ++var129) {
                        for (int var130 = (this.field1266 - 6) / 8; var130 <= (this.field1266 + 6) / 8; ++var130) {
                            this.field1394[var128] = (var129 << 8) + var130;
                            if (this.field1476 && (var130 == 49 || var130 == 149 || var130 == 147 || var129 == 50 || var129 == 49 && var130 == 47)) {
                                this.field1395[var128] = -1;
                                this.field1396[var128] = -1;
                                ++var128;
                            } else {
                                int var131 = this.field1395[var128] = this.field1549.method274(5, var129, 0, var130);
                                if (var131 != -1) {
                                    this.field1549.method279(3, var131);
                                }
                                int var132 = this.field1396[var128] = this.field1549.method274(5, var129, 1, var130);
                                if (var132 != -1) {
                                    this.field1549.method279(3, var132);
                                }
                                ++var128;
                            }
                        }
                    }
                    int var133 = this.field1511 - this.field1513;
                    int var134 = this.field1512 - this.field1514;
                    this.field1513 = this.field1511;
                    this.field1514 = this.field1512;
                    for (int var135 = 0; var135 < 16384; ++var135) {
                        NpcEntity var136 = this.field1364[var135];
                        if (var136 != null) {
                            for (int var137 = 0; var137 < 10; ++var137) {
                                var136.field447[var137] -= var133;
                                var136.field448[var137] -= var134;
                            }
                            var136.field397 -= var133 * 128;
                            var136.field398 -= var134 * 128;
                        }
                    }
                    for (int var138 = 0; var138 < this.field1495; ++var138) {
                        PlayerEntity var139 = this.field1497[var138];
                        if (var139 != null) {
                            for (int var140 = 0; var140 < 10; ++var140) {
                                var139.field447[var140] -= var133;
                                var139.field448[var140] -= var134;
                            }
                            var139.field397 -= var133 * 128;
                            var139.field398 -= var134 * 128;
                        }
                    }
                    this.field1336 = true;
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
                                    this.field1288[var151][var147][var148] = this.field1288[var151][var149][var150];
                                } else {
                                    this.field1288[var151][var147][var148] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var152 = (LocSpawned) this.field1331.method248(); var152 != null; var152 = (LocSpawned) this.field1331.method250((byte) 71)) {
                        var152.field723 -= var133;
                        var152.field724 -= var134;
                        if (var152.field723 < 0 || var152.field724 < 0 || var152.field723 >= 104 || var152.field724 >= 104) {
                            var152.method106();
                        }
                    }
                    if (this.field1573 != 0) {
                        this.field1573 -= var133;
                        this.field1574 -= var134;
                    }
                    this.field1518 = false;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 237) {
                    int var153 = this.field1627.method231();
                    int var154 = this.field1627.method231();
                    int var155 = var154 >> 10 & 31;
                    int var156 = var154 >> 5 & 31;
                    int var157 = var154 & 31;
                    Component.field70[var153].field113 = (var157 << 3) + (var155 << 19) + (var156 << 11);
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 89) {
                    this.field1518 = true;
                    this.field1386 = this.field1627.method229();
                    this.field1387 = this.field1627.method229();
                    this.field1388 = this.field1627.method231();
                    this.field1389 = this.field1627.method229();
                    this.field1390 = this.field1627.method229();
                    if (this.field1390 >= 100) {
                        this.field1305 = this.field1386 * 128 + 64;
                        this.field1307 = this.field1387 * 128 + 64;
                        this.field1306 = this.method550(this.field1305, this.field1307, this.field1461, true) - this.field1388;
                    }
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 194) {
                    this.field1562 = this.field1627.method229();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 50) {
                    this.field1456 = this.field1627.method229();
                    this.field1587 = true;
                    this.field1371 = true;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 115) {
                    int var158 = this.field1627.method231();
                    int var159 = this.field1627.method231();
                    int var160 = this.field1627.method231();
                    if (var159 == 65535) {
                        Component.field70[var158].field119 = 0;
                        this.field1558 = -1;
                        return true;
                    }
                    ObjType var161 = ObjType.method348(var159);
                    Component.field70[var158].field119 = 4;
                    Component.field70[var158].field120 = var159;
                    Component.field70[var158].field126 = var161.field1046;
                    Component.field70[var158].field127 = var161.field1047;
                    Component.field70[var158].field125 = var161.field1045 * 100 / var160;
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 14) {
                    if (this.field1456 == 12) {
                        this.field1587 = true;
                    }
                    this.field1643 = this.field1627.method232();
                    this.field1558 = -1;
                    return true;
                }
                if (this.field1558 == 67) {
                    this.method540(-207, this.field1627, this.field1557);
                    this.field1558 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1558 + "," + this.field1557 + " - " + this.field1346 + "," + this.field1347);
                this.method445(543);
            } catch (IOException var166) {
                this.method502(true);
            } catch (Exception var167) {
                String var163 = "T2 - " + this.field1558 + "," + this.field1346 + "," + this.field1347 + " - " + this.field1557 + "," + (field1525.field447[0] + this.field1511) + "," + (field1525.field448[0] + this.field1512) + " - ";
                for (int var164 = 0; var164 < this.field1557 && var164 < 50; ++var164) {
                    var163 = var163 + this.field1627.field702[var164] + ",";
                }
                signlink.reporterror(var163);
                this.method445(543);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method445(int arg0) {
        try {
            if (this.field1262 != null) {
                this.field1262.method38();
            }
        } catch (Exception var4) {
        }
        this.field1262 = null;
        this.field1337 = false;
        this.field1608 = 0;
        this.field1398 = "";
        this.field1399 = "";
        this.method529(-492);
        int var2 = 92 / arg0;
        this.field1589.method50((byte) 58);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field1596[var3].method359(true);
        }
        System.gc();
        this.method467(this.field1577);
        this.field1588 = -1;
        this.field1515 = -1;
        this.field1231 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method446(boolean arg0, boolean arg1) {
        this.method486(-294);
        this.field1272.method258((byte) -127);
        this.field1635.method199(0, 0, false);
        short var3 = 360;
        short var4 = 200;
        this.field1337 &= arg0;
        if (this.field1608 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1449.method203(var3 / 2, 0, true, var5, 7711145, this.field1549.field827);
            int var6 = var4 / 2 - 20;
            this.field1451.method203(var3 / 2, 0, true, var6, 16776960, "Welcome to RuneScape");
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1636.method199(var7 - 73, var8 - 20, false);
            this.field1451.method203(var7, 0, true, var8 + 5, 16777215, "New User");
            int var9 = var3 / 2 + 80;
            this.field1636.method199(var9 - 73, var8 - 20, false);
            this.field1451.method203(var9, 0, true, var8 + 5, 16777215, "Existing User");
        }
        if (this.field1608 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1332.length() > 0) {
                this.field1451.method203(var3 / 2, 0, true, var10 - 15, 16776960, this.field1332);
                this.field1451.method203(var3 / 2, 0, true, var10, 16776960, this.field1333);
                var10 += 30;
            } else {
                this.field1451.method203(var3 / 2, 0, true, var10 - 7, 16776960, this.field1333);
                var10 += 30;
            }
            this.field1451.method210(var10, true, var3 / 2 - 90, 16365, 16777215, "Username: " + this.field1398 + (this.field1302 == 0 & field1279 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field1451.method210(var10, true, var3 / 2 - 88, 16365, 16777215, "Password: " + JString.method305(true, this.field1399) + (this.field1302 == 1 & field1279 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1636.method199(var11 - 73, var12 - 20, false);
                this.field1451.method203(var11, 0, true, var12 + 5, 16777215, "Login");
                int var13 = var3 / 2 + 80;
                this.field1636.method199(var13 - 73, var12 - 20, false);
                this.field1451.method203(var13, 0, true, var12 + 5, 16777215, "Cancel");
            }
        }
        if (this.field1608 == 3) {
            this.field1451.method203(var3 / 2, 0, true, var4 / 2 - 60, 16776960, "Create a free account");
            int var14 = var4 / 2 - 35;
            this.field1451.method203(var3 / 2, 0, true, var14, 16777215, "To create a new account you need to");
            int var18 = var14 + 15;
            this.field1451.method203(var3 / 2, 0, true, var18, 16777215, "go back to the main RuneScape webpage");
            int var19 = var18 + 15;
            this.field1451.method203(var3 / 2, 0, true, var19, 16777215, "and choose the red 'create account'");
            int var20 = var19 + 15;
            this.field1451.method203(var3 / 2, 0, true, var20, 16777215, "button at the top right of that page.");
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1636.method199(var15 - 73, var16 - 20, false);
            this.field1451.method203(var15, 0, true, var16 + 5, 16777215, "Cancel");
        }
        this.field1272.method259(202, 171, (byte) 3, super.field14);
        if (this.field1470) {
            this.field1470 = false;
            this.field1270.method259(128, 0, (byte) 3, super.field14);
            this.field1271.method259(202, 371, (byte) 3, super.field14);
            this.field1275.method259(0, 265, (byte) 3, super.field14);
            this.field1276.method259(562, 265, (byte) 3, super.field14);
            this.field1277.method259(128, 171, (byte) 3, super.field14);
            this.field1278.method259(562, 171, (byte) 3, super.field14);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        if (arg2 != 6216) {
            this.field1288 = null;
        }
        int var7 = this.field1589.method80(this.field1461, arg0, arg1, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1423;
            if (field1423 > 1086) {
                field1423 = 0;
                this.field1416.method218((byte) 1, 162);
                this.field1416.method219(0);
                int var10 = this.field1416.field703;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1416.method220(16791);
                }
                this.field1416.method219(254);
                this.field1416.method220((int) (Math.random() * 65536.0D));
                this.field1416.method220(16128);
                this.field1416.method220(52610);
                this.field1416.method220((int) (Math.random() * 65536.0D));
                this.field1416.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1416.method220(35025);
                }
                this.field1416.method220(46628);
                this.field1416.method219((int) (Math.random() * 256.0D));
                this.field1416.method228(9, this.field1416.field703 - var10);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method482(2, 0, var8 + 1, 0, (byte) -114, false, field1525.field447[0], arg0, var9, field1525.field448[0], 0, arg1);
            } else {
                LocType var11 = LocType.method330(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field952;
                    var13 = var11.field951;
                } else {
                    var12 = var11.field951;
                    var13 = var11.field952;
                }
                int var14 = var11.field974;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method482(2, var14, 0, var12, (byte) -114, false, field1525.field447[0], arg0, 0, field1525.field448[0], var13, arg1);
            }
            this.field1463 = super.field29;
            this.field1464 = super.field30;
            this.field1466 = 2;
            this.field1465 = 0;
            this.field1416.method218((byte) 1, arg3);
            this.field1416.method220(this.field1511 + arg0);
            this.field1416.method220(this.field1512 + arg1);
            this.field1416.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IIILab;)V")
    private final void method448(Packet arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg3 >= 0) {
            this.field1558 = -1;
        }
        if ((arg1 & 1) == 1) {
            int var6 = arg0.method229();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(field1640, var7);
            arg0.method238(0, false, var7, var6);
            this.field1502[arg2] = var8;
            arg4.method116(0, var8);
        }
        if ((arg1 & 2) == 2) {
            int var9 = arg0.method231();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field425 == var9) {
                arg4.field429 = 0;
            }
            int var10 = arg0.method229();
            if (arg4.field425 == var9 && var9 != -1) {
                int var11 = SeqType.field1134[var9].field1148;
                if (var11 == 1) {
                    arg4.field426 = 0;
                    arg4.field427 = 0;
                    arg4.field428 = var10;
                    arg4.field429 = 0;
                }
                if (var11 == 2) {
                    arg4.field429 = 0;
                }
            } else if (var9 == -1 || arg4.field425 == -1 || SeqType.field1134[var9].field1142 >= SeqType.field1134[arg4.field425].field1142) {
                arg4.field425 = var9;
                arg4.field426 = 0;
                arg4.field427 = 0;
                arg4.field428 = var10;
                arg4.field429 = 0;
                arg4.field451 = arg4.field446;
            }
        }
        if ((arg1 & 4) == 4) {
            arg4.field419 = arg0.method231();
            if (arg4.field419 == 65535) {
                arg4.field419 = -1;
            }
        }
        if ((arg1 & 8) == 8) {
            arg4.field409 = arg0.method236();
            if (arg4.field409.charAt(0) == '~') {
                arg4.field409 = arg4.field409.substring(1);
                this.method536(1, arg4.field458, 2, arg4.field409);
            } else if (field1525 == arg4) {
                this.method536(1, arg4.field458, 2, arg4.field409);
            }
            arg4.field411 = 0;
            arg4.field412 = 0;
            arg4.field410 = 150;
        }
        if ((arg1 & 16) == 16) {
            int var12 = arg0.method229();
            int var13 = arg0.method229();
            arg4.method114(-25671, var12, var13, field1279);
            arg4.field416 = field1279 + 300;
            arg4.field417 = arg0.method229();
            arg4.field418 = arg0.method229();
        }
        if ((arg1 & 32) == 32) {
            arg4.field420 = arg0.method231();
            arg4.field421 = arg0.method231();
        }
        if ((arg1 & 64) == 64) {
            int var14 = arg0.method231();
            int var15 = arg0.method229();
            int var16 = arg0.method229();
            int var17 = arg0.field703;
            if (arg4.field458 != null && arg4.field459) {
                long var18 = JString.method300(arg4.field458);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1611; ++var21) {
                        if (this.field1550[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1581 == 0) {
                    try {
                        String var22 = WordPack.method306((byte) -66, var16, arg0);
                        String var23 = WordFilter.method401((byte) 1, var22);
                        arg4.field409 = var23;
                        arg4.field411 = var14 >> 8;
                        arg4.field412 = var14 & 255;
                        arg4.field410 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method536(1, "@cr1@" + arg4.field458, 1, var23);
                            } else {
                                this.method536(1, arg4.field458, 2, var23);
                            }
                        } else {
                            this.method536(1, "@cr2@" + arg4.field458, 1, var23);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field703 = var16 + var17;
        }
        if ((arg1 & 256) == 256) {
            arg4.field430 = arg0.method231();
            int var25 = arg0.method234();
            arg4.field434 = var25 >> 16;
            arg4.field433 = (var25 & 65535) + field1279;
            arg4.field431 = 0;
            arg4.field432 = 0;
            if (arg4.field433 > field1279) {
                arg4.field431 = -1;
            }
            if (arg4.field430 == 65535) {
                arg4.field430 = -1;
            }
        }
        if ((arg1 & 512) == 512) {
            arg4.field435 = arg0.method229();
            arg4.field437 = arg0.method229();
            arg4.field436 = arg0.method229();
            arg4.field438 = arg0.method229();
            arg4.field439 = arg0.method231() + field1279;
            arg4.field440 = arg0.method231() + field1279;
            arg4.field441 = arg0.method229();
            arg4.method112(-39893);
        }
        if ((arg1 & 1024) == 1024) {
            int var26 = arg0.method229();
            int var27 = arg0.method229();
            arg4.method114(-25671, var26, var27, field1279);
            arg4.field416 = field1279 + 300;
            arg4.field417 = arg0.method229();
            arg4.field418 = arg0.method229();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BBI)Z")
    public final boolean method449(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != 1) {
            this.field1558 = -1;
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;IBI)V")
    public final void method450(Pix32 arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (this.field1237 != arg2) {
            this.field1288 = null;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1303 + this.field1282 & 2047;
            int var7 = Model.field601[var6];
            int var8 = Model.field602[var6];
            int var9 = var7 * 256 / (this.field1310 + 256);
            int var10 = var8 * 256 / (this.field1310 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1642.method191(var13, 15, 15, 20, var15 + 94 + 4 - 10, 20, 256, 83 - var16 - 20, 45109);
        } else {
            this.method543(this.field1660, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method451(int arg0, int arg1, byte arg2) {
        if (arg2 != 4) {
            throw new NullPointerException();
        } else {
            int var3 = arg0 - arg1;
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method452(int arg0) {
        int var2 = 5;
        this.field1234[8] = 0;
        if (arg0 != 1764) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = 0;
        while (this.field1234[8] == 0) {
            String var5 = "Unknown problem";
            this.method13("Connecting to web server", 20, -427);
            try {
                DataInputStream var6 = this.method532("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 294);
                Packet var7 = new Packet(field1640, new byte[40]);
                var6.readFully(var7.field702, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field1234[var8] = var7.method234();
                }
                int var9 = var7.method234();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field1234[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field1234[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field1234[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field1234[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field1234[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1234[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method13("Game updated - please reload page", 10, -427);
                        var12 = 10;
                    } else {
                        this.method13(var5 + " - Will retry in " + var12 + " secs.", 10, -427);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var13) {
                    }
                }
                var2 *= 2;
                if (var2 > 60) {
                    var2 = 60;
                }
                this.field1392 = !this.field1392;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method453(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1608 == 0) {
            int var3 = super.field12 / 2 - 80;
            int var4 = super.field13 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field28 == 1 && super.field29 >= var3 - 75 && super.field29 <= var3 + 75 && super.field30 >= var15 - 20 && super.field30 <= var15 + 20) {
                this.field1608 = 3;
                this.field1302 = 0;
            }
            int var5 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var5 - 75 && super.field29 <= var5 + 75 && super.field30 >= var15 - 20 && super.field30 <= var15 + 20) {
                this.field1332 = "";
                this.field1333 = "Enter your username & password.";
                this.field1608 = 2;
                this.field1302 = 0;
            }
        } else if (this.field1608 == 2) {
            int var6 = super.field13 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field28 == 1 && super.field30 >= var17 - 15 && super.field30 < var17) {
                this.field1302 = 0;
            }
            var6 = var17 + 15;
            if (super.field28 == 1 && super.field30 >= var6 - 15 && super.field30 < var6) {
                this.field1302 = 1;
            }
            var6 += 15;
            int var7 = super.field12 / 2 - 80;
            int var8 = super.field13 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field28 == 1 && super.field29 >= var7 - 75 && super.field29 <= var7 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                this.method500(this.field1398, this.field1399, false);
                if (this.field1337) {
                    return;
                }
            }
            int var9 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var9 - 75 && super.field29 <= var9 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                this.field1608 = 0;
                this.field1398 = "";
                this.field1399 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method5(-28882);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field1217.length(); ++var12) {
                        if (var10 == field1217.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field1302 == 0) {
                        if (var10 == 8 && this.field1398.length() > 0) {
                            this.field1398 = this.field1398.substring(0, this.field1398.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field1302 = 1;
                        }
                        if (var11) {
                            this.field1398 = this.field1398 + (char) var10;
                        }
                        if (this.field1398.length() > 12) {
                            this.field1398 = this.field1398.substring(0, 12);
                        }
                    } else if (this.field1302 == 1) {
                        if (var10 == 8 && this.field1399.length() > 0) {
                            this.field1399 = this.field1399.substring(0, this.field1399.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field1302 = 0;
                        }
                        if (var11) {
                            this.field1399 = this.field1399 + (char) var10;
                        }
                        if (this.field1399.length() > 20) {
                            this.field1399 = this.field1399.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1608 == 3) {
                int var13 = super.field12 / 2;
                int var14 = super.field13 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field28 == 1 && super.field29 >= var13 - 75 && super.field29 <= var13 + 75 && super.field30 >= var19 - 20 && super.field30 <= var19 + 20) {
                    this.field1608 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1668.method199(arg1, arg5, false);
        this.field1669.method199(arg1, arg0 + arg5 - 16, false);
        Pix2D.method157(arg1, 16, 4, this.field1599, arg0 - 32, arg5 + 16);
        if (arg2 <= 0) {
            this.field1519 = !this.field1519;
        }
        int var7 = (arg0 - 32) * arg0 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg0 - 32 - var7) * arg4 / (arg3 - arg0);
        Pix2D.method157(arg1, 16, 4, this.field1585, var7, arg5 + 16 + var8);
        Pix2D.method162(this.field1301, arg5 + 16 + var8, 617, var7, arg1);
        Pix2D.method162(this.field1301, arg5 + 16 + var8, 617, var7, arg1 + 1);
        Pix2D.method160(arg5 + 16 + var8, arg1, 16, (byte) 6, this.field1301);
        Pix2D.method160(arg5 + 17 + var8, arg1, 16, (byte) 6, this.field1301);
        Pix2D.method162(this.field1546, arg5 + 16 + var8, 617, var7, arg1 + 15);
        Pix2D.method162(this.field1546, arg5 + 17 + var8, 617, var7 - 1, arg1 + 14);
        Pix2D.method160(arg5 + 15 + var8 + var7, arg1, 16, (byte) 6, this.field1546);
        Pix2D.method160(arg5 + 14 + var8 + var7, arg1 + 1, 15, (byte) 6, this.field1546);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method455(int arg0, boolean arg1) {
        if (arg0 <= 0) {
            this.field1416.method219(53);
        }
        for (int var3 = 0; var3 < this.field1365; ++var3) {
            NpcEntity var4 = this.field1364[this.field1366[var3]];
            int var5 = (this.field1366[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(false) && var4.field454.field1019 == arg1) {
                int var6 = var4.field397 >> 7;
                int var7 = var4.field398 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field401 == 1 && (var4.field397 & 127) == 64 && (var4.field398 & 127) == 64) {
                        if (this.field1551[var6][var7] == this.field1356) {
                            continue;
                        }
                        this.field1551[var6][var7] = this.field1356;
                    }
                    this.field1589.method61((var4.field401 - 1) * 64 + 60, this.field1461, -346, var4.field398, var5, var4, this.method550(var4.field397, var4.field398, this.field1461, true), var4.field397, var4.field399, var4.field400);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method456(int arg0) {
        while (arg0 >= 0) {
            this.field1288 = null;
        }
        for (int var2 = 0; var2 < this.field1475; ++var2) {
            if (this.field1317[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1368[var2] == this.field1533 && this.field1351[var2] == this.field1538) {
                        if (!this.method472(true)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(this.field1368[var2], (byte) 6, this.field1351[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field703 / 22) > (long) (this.field1432 / 22) + this.field1467) {
                            this.field1432 = var4.field703;
                            this.field1467 = System.currentTimeMillis();
                            if (this.method449(var4.field702, (byte) 1, var4.field703)) {
                                this.field1533 = this.field1368[var2];
                                this.field1538 = this.field1351[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1317[var2] != -5) {
                    this.field1317[var2] = -5;
                } else {
                    --this.field1475;
                    for (int var6 = var2; var6 < this.field1475; ++var6) {
                        this.field1368[var6] = this.field1368[var6 + 1];
                        this.field1351[var6] = this.field1351[var6 + 1];
                        this.field1317[var6] = this.field1317[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1317[var2]--;
            }
        }
        if (this.field1231 > 0) {
            this.field1231 -= 20;
            if (this.field1231 < 0) {
                this.field1231 = 0;
            }
            if (this.field1231 == 0 && this.field1370 && !field1294) {
                this.field1515 = this.field1588;
                this.field1516 = true;
                this.field1549.method279(2, this.field1515);
                return;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (arg0 >= 0) {
            this.field1558 = -1;
        }
        if (!this.field1605 && !this.field1335 && !this.field1590) {
            ++field1488;
            if (!this.field1337) {
                this.method446(true, false);
            } else {
                this.method522(14998);
            }
            this.field1565 = 0;
        } else {
            this.method508(false);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method457(int arg0, boolean arg1) {
        if (arg1) {
            this.field1558 = this.field1627.method229();
        }
        if (arg0 >= 0) {
            if (this.field1342) {
                this.field1342 = false;
                this.field1563 = true;
            }
            int var3 = this.field1246[arg0];
            int var4 = this.field1247[arg0];
            int var5 = this.field1248[arg0];
            int var6 = this.field1249[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 1714) {
                NpcEntity var7 = this.field1364[var6];
                if (var7 != null) {
                    NpcType var8 = var7.field454;
                    if (var8.field1024 != null) {
                        var8 = var8.method345(0);
                    }
                    if (var8 != null) {
                        String var9;
                        if (var8.field1000 != null) {
                            var9 = new String(var8.field1000);
                        } else {
                            var9 = "It's a " + var8.field999 + ".";
                        }
                        this.method536(1, "", 0, var9);
                    }
                }
            }
            if (var5 == 275) {
                PlayerEntity var10 = this.field1497[var6];
                if (var10 != null) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var10.field447[0], 0, field1525.field448[0], 1, var10.field448[0]);
                    this.field1463 = super.field29;
                    this.field1464 = super.field30;
                    this.field1466 = 2;
                    this.field1465 = 0;
                    this.field1416.method218((byte) 1, 15);
                    this.field1416.method220(var6);
                    this.field1416.method220(this.field1616);
                    this.field1416.method220(this.field1614);
                    this.field1416.method220(this.field1615);
                }
            }
            if (var5 == 563) {
                this.field1416.method218((byte) 1, 47);
                this.field1416.method220(var6);
                this.field1416.method220(var3);
                this.field1416.method220(var4);
                this.field1416.method220(this.field1313);
                this.field1490 = 0;
                this.field1491 = var4;
                this.field1492 = var3;
                this.field1493 = 2;
                if (Component.field70[var4].field76 == this.field1221) {
                    this.field1493 = 1;
                }
                if (Component.field70[var4].field76 == this.field1348) {
                    this.field1493 = 3;
                }
            }
            if (var5 == 357) {
                this.method447(var3, var4, 6216, 172, var6);
            }
            if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                boolean var11 = this.method482(2, 0, 0, 0, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 0, var4);
                if (!var11) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 1, var4);
                }
                this.field1463 = super.field29;
                this.field1464 = super.field30;
                this.field1466 = 2;
                this.field1465 = 0;
                if (var5 == 617) {
                    this.field1416.method218((byte) 1, 170);
                }
                if (var5 == 662) {
                    field1374 += this.field1512;
                    if (field1374 >= 118) {
                        this.field1416.method218((byte) 1, 100);
                        this.field1416.method223(0);
                    }
                    this.field1416.method218((byte) 1, 222);
                }
                if (var5 == 778) {
                    this.field1416.method218((byte) 1, 52);
                }
                if (var5 == 224) {
                    field1458 += var4;
                    if (field1458 >= 75) {
                        this.field1416.method218((byte) 1, 198);
                        this.field1416.method219(19);
                    }
                    this.field1416.method218((byte) 1, 251);
                }
                if (var5 == 139) {
                    if ((var3 & 3) == 0) {
                        ++field1235;
                    }
                    if (field1235 >= 123) {
                        this.field1416.method218((byte) 1, 20);
                        this.field1416.method223(0);
                    }
                    this.field1416.method218((byte) 1, 122);
                }
                this.field1416.method220(this.field1511 + var3);
                this.field1416.method220(this.field1512 + var4);
                this.field1416.method220(var6);
            }
            if (var5 == 1328) {
                ObjType var13 = ObjType.method348(var6);
                Component var14 = Component.field70[var4];
                String var15;
                if (var14 != null && var14.field72[var3] >= 100000) {
                    var15 = var14.field72[var3] + " x " + var13.field1041;
                } else if (var13.field1042 != null) {
                    var15 = new String(var13.field1042);
                } else {
                    var15 = "It's a " + var13.field1041 + ".";
                }
                this.method536(1, "", 0, var15);
            }
            if (var5 == 240) {
                NpcEntity var16 = this.field1364[var6];
                if (var16 != null) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var16.field447[0], 0, field1525.field448[0], 1, var16.field448[0]);
                    this.field1463 = super.field29;
                    this.field1464 = super.field30;
                    this.field1466 = 2;
                    this.field1465 = 0;
                    this.field1416.method218((byte) 1, 58);
                    this.field1416.method220(var6);
                    this.field1416.method220(this.field1313);
                }
            }
            if (var5 == 1152) {
                ObjType var17 = ObjType.method348(var6);
                String var18;
                if (var17.field1042 != null) {
                    var18 = new String(var17.field1042);
                } else {
                    var18 = "It's a " + var17.field1041 + ".";
                }
                this.method536(1, "", 0, var18);
            }
            if (var5 == 111) {
                boolean var19 = this.method482(2, 0, 0, 0, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 0, var4);
                if (!var19) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 1, var4);
                }
                this.field1463 = super.field29;
                this.field1464 = super.field30;
                this.field1466 = 2;
                this.field1465 = 0;
                this.field1416.method218((byte) 1, 59);
                this.field1416.method220(this.field1511 + var3);
                this.field1416.method220(this.field1512 + var4);
                this.field1416.method220(var6);
                this.field1416.method220(this.field1616);
                this.field1416.method220(this.field1614);
                this.field1416.method220(this.field1615);
            }
            if (var5 == 1071) {
                this.method447(var3, var4, 6216, 165, var6);
            }
            if (var5 == 718) {
                if (!this.field1570) {
                    this.field1589.method88(super.field29 - 4, super.field30 - 4, -707);
                } else {
                    this.field1589.method88(var3 - 4, var4 - 4, -707);
                }
            }
            if (var5 == 370) {
                boolean var21 = this.method482(2, 0, 0, 0, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 0, var4);
                if (!var21) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var3, 0, field1525.field448[0], 1, var4);
                }
                this.field1463 = super.field29;
                this.field1464 = super.field30;
                this.field1466 = 2;
                this.field1465 = 0;
                this.field1416.method218((byte) 1, 46);
                this.field1416.method220(this.field1511 + var3);
                this.field1416.method220(this.field1512 + var4);
                this.field1416.method220(var6);
                this.field1416.method220(this.field1313);
            }
            if (var5 == 737) {
                this.method542((byte) 1);
            }
            if (var5 == 131) {
                PlayerEntity var23 = this.field1497[var6];
                if (var23 != null) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var23.field447[0], 0, field1525.field448[0], 1, var23.field448[0]);
                    this.field1463 = super.field29;
                    this.field1464 = super.field30;
                    this.field1466 = 2;
                    this.field1465 = 0;
                    this.field1416.method218((byte) 1, 189);
                    this.field1416.method220(var6);
                    this.field1416.method220(this.field1313);
                }
            }
            if (var5 == 435) {
                this.field1416.method218((byte) 1, 107);
                this.field1416.method220(var4);
                Component var24 = Component.field70[var4];
                if (var24.field85 != null && var24.field85[0][0] == 5) {
                    int var25 = var24.field85[0][1];
                    this.field1359[var25] = 1 - this.field1359[var25];
                    this.method462(var25, 35227);
                    this.field1587 = true;
                }
            }
            if (var5 == 721) {
                field1541 += var4;
                if (field1541 >= 139) {
                    this.field1416.method218((byte) 1, 73);
                    this.field1416.method223(0);
                }
                this.method447(var3, var4, 6216, 187, var6);
            }
            if (var5 == 899 && this.method447(var3, var4, 6216, 156, var6)) {
                this.field1416.method220(this.field1313);
            }
            if (var5 == 810 && this.method447(var3, var4, 6216, 111, var6)) {
                this.field1416.method220(this.field1616);
                this.field1416.method220(this.field1614);
                this.field1416.method220(this.field1615);
            }
            if (var5 == 1381) {
                int var26 = var6 >> 14 & 32767;
                LocType var27 = LocType.method330(var26);
                String var28;
                if (var27.field948 != null) {
                    var28 = new String(var27.field948);
                } else {
                    var28 = "It's a " + var27.field947 + ".";
                }
                this.method536(1, "", 0, var28);
            }
            if (var5 == 625) {
                this.method447(var3, var4, 6216, 85, var6);
            }
            if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                if (var5 == 331) {
                    this.field1416.method218((byte) 1, 112);
                }
                if (var5 == 555) {
                    this.field1416.method218((byte) 1, 86);
                }
                if (var5 == 582) {
                    if ((var6 & 3) == 0) {
                        ++field1269;
                    }
                    if (field1269 >= 133) {
                        this.field1416.method218((byte) 1, 134);
                        this.field1416.method220(6118);
                    }
                    this.field1416.method218((byte) 1, 202);
                }
                if (var5 == 113) {
                    this.field1416.method218((byte) 1, 105);
                }
                if (var5 == 354) {
                    this.field1416.method218((byte) 1, 255);
                }
                this.field1416.method220(var6);
                this.field1416.method220(var3);
                this.field1416.method220(var4);
                this.field1490 = 0;
                this.field1491 = var4;
                this.field1492 = var3;
                this.field1493 = 2;
                if (Component.field70[var4].field76 == this.field1221) {
                    this.field1493 = 1;
                }
                if (Component.field70[var4].field76 == this.field1348) {
                    this.field1493 = 3;
                }
            }
            if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                String var29 = this.field1280[arg0];
                int var30 = var29.indexOf("@whi@");
                if (var30 != -1) {
                    long var31 = JString.method300(var29.substring(var30 + 5).trim());
                    if (var5 == 605) {
                        this.method476(0, var31);
                    }
                    if (var5 == 47) {
                        this.method561(var31, this.field1579);
                    }
                    if (var5 == 513) {
                        this.method537(var31, 545);
                    }
                    if (var5 == 884) {
                        this.method511(var31, false);
                    }
                }
            }
            if (var5 == 507 || var5 == 957) {
                String var33 = this.field1280[arg0];
                int var34 = var33.indexOf("@whi@");
                if (var34 != -1) {
                    String var35 = var33.substring(var34 + 5).trim();
                    String var36 = JString.method304((byte) 8, JString.method301(this.field1649, JString.method300(var35)));
                    boolean var37 = false;
                    for (int var38 = 0; var38 < this.field1498; ++var38) {
                        PlayerEntity var39 = this.field1497[this.field1499[var38]];
                        if (var39 != null && var39.field458 != null && var39.field458.equalsIgnoreCase(var36)) {
                            this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var39.field447[0], 0, field1525.field448[0], 1, var39.field448[0]);
                            if (var5 == 507) {
                                field1670 += var6;
                                if (field1670 >= 66) {
                                    this.field1416.method218((byte) 1, 246);
                                    this.field1416.method219(154);
                                }
                                this.field1416.method218((byte) 1, 171);
                            }
                            if (var5 == 957) {
                                ++field1421;
                                if (field1421 >= 52) {
                                    this.field1416.method218((byte) 1, 210);
                                    this.field1416.method219(131);
                                }
                                this.field1416.method218((byte) 1, 38);
                            }
                            this.field1416.method220(this.field1499[var38]);
                            var37 = true;
                            break;
                        }
                    }
                    if (!var37) {
                        this.method536(1, "", 0, "Unable to find " + var36);
                    }
                }
            }
            if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                if (var5 == 681) {
                    ++field1290;
                    if (field1290 >= 116) {
                        this.field1416.method218((byte) 1, 252);
                        this.field1416.method222(13018169);
                    }
                    this.field1416.method218((byte) 1, 76);
                }
                if (var5 == 962) {
                    this.field1416.method218((byte) 1, 149);
                }
                if (var5 == 795) {
                    this.field1416.method218((byte) 1, 219);
                }
                if (var5 == 100) {
                    this.field1416.method218((byte) 1, 215);
                }
                if (var5 == 694) {
                    this.field1416.method218((byte) 1, 88);
                }
                this.field1416.method220(var6);
                this.field1416.method220(var3);
                this.field1416.method220(var4);
                this.field1490 = 0;
                this.field1491 = var4;
                this.field1492 = var3;
                this.field1493 = 2;
                if (Component.field70[var4].field76 == this.field1221) {
                    this.field1493 = 1;
                }
                if (Component.field70[var4].field76 == this.field1348) {
                    this.field1493 = 3;
                }
            }
            if (var5 == 902) {
                String var40 = this.field1280[arg0];
                int var41 = var40.indexOf("@whi@");
                if (var41 != -1) {
                    long var42 = JString.method300(var40.substring(var41 + 5).trim());
                    int var44 = -1;
                    for (int var45 = 0; var45 < this.field1240; ++var45) {
                        if (this.field1604[var45] == var42) {
                            var44 = var45;
                            break;
                        }
                    }
                    if (var44 != -1 && this.field1509[var44] > 0) {
                        this.field1563 = true;
                        this.field1342 = false;
                        this.field1571 = true;
                        this.field1415 = "";
                        this.field1233 = 3;
                        this.field1540 = this.field1604[var44];
                        this.field1361 = "Enter message to send to " + this.field1641[var44];
                    }
                }
            }
            if (var5 == 398) {
                this.field1416.method218((byte) 1, 93);
                this.field1416.method220(var6);
                this.field1416.method220(var3);
                this.field1416.method220(var4);
                this.field1416.method220(this.field1616);
                this.field1416.method220(this.field1614);
                this.field1416.method220(this.field1615);
                this.field1490 = 0;
                this.field1491 = var4;
                this.field1492 = var3;
                this.field1493 = 2;
                if (Component.field70[var4].field76 == this.field1221) {
                    this.field1493 = 1;
                }
                if (Component.field70[var4].field76 == this.field1348) {
                    this.field1493 = 3;
                }
            }
            if (var5 == 225) {
                this.field1416.method218((byte) 1, 107);
                this.field1416.method220(var4);
                Component var46 = Component.field70[var4];
                if (var46.field85 != null && var46.field85[0][0] == 5) {
                    int var47 = var46.field85[0][1];
                    if (this.field1359[var47] != var46.field87[0]) {
                        this.field1359[var47] = var46.field87[0];
                        this.method462(var47, 35227);
                        this.field1587 = true;
                    }
                }
            }
            if (var5 == 829) {
                NpcEntity var48 = this.field1364[var6];
                if (var48 != null) {
                    this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var48.field447[0], 0, field1525.field448[0], 1, var48.field448[0]);
                    this.field1463 = super.field29;
                    this.field1464 = super.field30;
                    this.field1466 = 2;
                    this.field1465 = 0;
                    this.field1416.method218((byte) 1, 120);
                    this.field1416.method220(var6);
                    this.field1416.method220(this.field1616);
                    this.field1416.method220(this.field1614);
                    this.field1416.method220(this.field1615);
                }
            }
            if (var5 == 524) {
                String var49 = this.field1280[arg0];
                int var50 = var49.indexOf("@whi@");
                if (var50 != -1) {
                    if (this.field1221 == -1) {
                        this.method542((byte) 1);
                        this.field1534 = var49.substring(var50 + 5).trim();
                        this.field1487 = false;
                        for (int var51 = 0; var51 < Component.field70.length; ++var51) {
                            if (Component.field70[var51] != null && Component.field70[var51].field79 == 600) {
                                this.field1258 = this.field1221 = Component.field70[var51].field76;
                                break;
                            }
                        }
                    } else {
                        this.method536(1, "", 0, "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 274) {
                Component var52 = Component.field70[var4];
                this.field1312 = 1;
                this.field1313 = var4;
                this.field1314 = var52.field130;
                this.field1613 = 0;
                this.field1587 = true;
                String var53 = var52.field128;
                if (var53.indexOf(" ") != -1) {
                    var53 = var53.substring(0, var53.indexOf(" "));
                }
                String var54 = var52.field128;
                if (var54.indexOf(" ") != -1) {
                    var54 = var54.substring(var54.indexOf(" ") + 1);
                }
                this.field1315 = var53 + " " + var52.field129 + " " + var54;
                if (this.field1314 == 16) {
                    this.field1587 = true;
                    this.field1456 = 3;
                    this.field1371 = true;
                }
            } else {
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var55 = this.field1364[var6];
                    if (var55 != null) {
                        this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var55.field447[0], 0, field1525.field448[0], 1, var55.field448[0]);
                        this.field1463 = super.field29;
                        this.field1464 = super.field30;
                        this.field1466 = 2;
                        this.field1465 = 0;
                        if (var5 == 852) {
                            this.field1416.method218((byte) 1, 50);
                        }
                        if (var5 == 209) {
                            this.field1416.method218((byte) 1, 64);
                        }
                        if (var5 == 242) {
                            this.field1416.method218((byte) 1, 138);
                        }
                        if (var5 == 793) {
                            this.field1416.method218((byte) 1, 196);
                        }
                        if (var5 == 309) {
                            this.field1416.method218((byte) 1, 99);
                        }
                        this.field1416.method220(var6);
                    }
                }
                if (var5 == 231) {
                    Component var56 = Component.field70[var4];
                    boolean var57 = true;
                    if (var56.field79 > 0) {
                        var57 = this.method485(var56, true);
                    }
                    if (var57) {
                        this.field1416.method218((byte) 1, 107);
                        this.field1416.method220(var4);
                    }
                }
                if (var5 == 997 && !this.field1377) {
                    this.field1416.method218((byte) 1, 27);
                    this.field1416.method220(var4);
                    this.field1377 = true;
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var58 = this.field1497[var6];
                    if (var58 != null) {
                        this.method482(2, 0, 0, 1, (byte) -114, false, field1525.field447[0], var58.field447[0], 0, field1525.field448[0], 1, var58.field448[0]);
                        this.field1463 = super.field29;
                        this.field1464 = super.field30;
                        this.field1466 = 2;
                        this.field1465 = 0;
                        if (var5 == 499) {
                            this.field1416.method218((byte) 1, 124);
                        }
                        if (var5 == 639) {
                            ++field1421;
                            if (field1421 >= 52) {
                                this.field1416.method218((byte) 1, 210);
                                this.field1416.method219(131);
                            }
                            this.field1416.method218((byte) 1, 38);
                        }
                        if (var5 == 27) {
                            this.field1416.method218((byte) 1, 123);
                        }
                        if (var5 == 387) {
                            field1670 += var6;
                            if (field1670 >= 66) {
                                this.field1416.method218((byte) 1, 246);
                                this.field1416.method219(154);
                            }
                            this.field1416.method218((byte) 1, 171);
                        }
                        if (var5 == 185) {
                            this.field1416.method218((byte) 1, 89);
                        }
                        this.field1416.method220(var6);
                    }
                }
                if (var5 == 102) {
                    this.field1613 = 1;
                    this.field1614 = var3;
                    this.field1615 = var4;
                    this.field1616 = var6;
                    this.field1617 = ObjType.method348(var6).field1041;
                    this.field1312 = 0;
                    this.field1587 = true;
                } else {
                    if (var5 == 743) {
                        ++field1344;
                        if (field1344 >= 124) {
                            this.field1416.method218((byte) 1, 129);
                            this.field1416.method220(37954);
                        }
                        this.method447(var3, var4, 6216, 250, var6);
                    }
                    this.field1613 = 0;
                    this.field1312 = 0;
                    this.field1587 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;B)V")
    private final void method458(int arg0, Packet arg1, byte arg2) {
        if (arg2 != 5) {
            this.field1416.method219(133);
        }
        arg1.method239(496);
        int var4 = arg1.method240(-703, 8);
        if (var4 < this.field1365) {
            for (int var5 = var4; var5 < this.field1365; ++var5) {
                this.field1473[this.field1472++] = this.field1366[var5];
            }
        }
        if (var4 > this.field1365) {
            signlink.reporterror(this.field1398 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1365 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1366[var6];
                NpcEntity var8 = this.field1364[var7];
                int var9 = arg1.method240(-703, 1);
                if (var9 == 0) {
                    this.field1366[this.field1365++] = var7;
                    var8.field442 = field1279;
                } else {
                    int var10 = arg1.method240(-703, 2);
                    if (var10 == 0) {
                        this.field1366[this.field1365++] = var7;
                        var8.field442 = field1279;
                        this.field1501[this.field1500++] = var7;
                    } else if (var10 == 1) {
                        this.field1366[this.field1365++] = var7;
                        var8.field442 = field1279;
                        int var11 = arg1.method240(-703, 3);
                        var8.method111(5, var11, false);
                        int var12 = arg1.method240(-703, 1);
                        if (var12 == 1) {
                            this.field1501[this.field1500++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1366[this.field1365++] = var7;
                        var8.field442 = field1279;
                        int var13 = arg1.method240(-703, 3);
                        var8.method111(5, var13, true);
                        int var14 = arg1.method240(-703, 3);
                        var8.method111(5, var14, true);
                        int var15 = arg1.method240(-703, 1);
                        if (var15 == 1) {
                            this.field1501[this.field1500++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1473[this.field1472++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method459(int arg0) {
        this.field1381 = true;
        if (arg0 != -35064) {
            this.field1564 = -492;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1630[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1110; ++var3) {
                if (!IdkType.field1111[var3].field1117 && IdkType.field1111[var3].field1112 == var2 + (this.field1242 ? 0 : 7)) {
                    this.field1630[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method13(String arg0, int arg1, int arg2) {
        this.field1409 = arg1;
        this.field1522 = arg0;
        this.method486(-294);
        if (arg2 >= 0) {
            this.field1416.method219(27);
        }
        if (this.field1259 == null) {
            super.method13(arg0, arg1, -427);
        } else {
            this.field1272.method258((byte) -127);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1451.method202(16777215, var5 / 2 - 26 - var6, 36569, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(304, 34, var4 / 2 - 152, var7, 22320, 9179409);
            Pix2D.method158(302, 32, var4 / 2 - 151, var7 + 1, 22320, 0);
            Pix2D.method157(var4 / 2 - 150, arg1 * 3, 4, 9179409, 30, var7 + 2);
            Pix2D.method157(arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3, 4, 0, 30, var7 + 2);
            this.field1451.method202(16777215, var5 / 2 + 5 - var6, 36569, var4 / 2, arg0);
            this.field1272.method259(202, 171, (byte) 3, super.field14);
            if (this.field1470) {
                this.field1470 = false;
                if (!this.field1553) {
                    this.field1273.method259(0, 0, (byte) 3, super.field14);
                    this.field1274.method259(637, 0, (byte) 3, super.field14);
                }
                this.field1270.method259(128, 0, (byte) 3, super.field14);
                this.field1271.method259(202, 371, (byte) 3, super.field14);
                this.field1275.method259(0, 265, (byte) 3, super.field14);
                this.field1276.method259(562, 265, (byte) 3, super.field14);
                this.field1277.method259(128, 171, (byte) 3, super.field14);
                this.field1278.method259(562, 171, (byte) 3, super.field14);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method460(boolean arg0) {
        short var2 = 256;
        if (this.field1479 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1479 > 768) {
                    this.field1645[var3] = this.method557(-8050, this.field1646[var3], this.field1647[var3], 1024 - this.field1479);
                } else if (this.field1479 > 256) {
                    this.field1645[var3] = this.field1647[var3];
                } else {
                    this.field1645[var3] = this.method557(-8050, this.field1647[var3], this.field1646[var3], 256 - this.field1479);
                }
            }
        } else if (this.field1480 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1480 > 768) {
                    this.field1645[var4] = this.method557(-8050, this.field1646[var4], this.field1648[var4], 1024 - this.field1480);
                } else if (this.field1480 > 256) {
                    this.field1645[var4] = this.field1648[var4];
                } else {
                    this.field1645[var4] = this.method557(-8050, this.field1648[var4], this.field1646[var4], 256 - this.field1480);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1645[var5] = this.field1646[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1273.field741[var6] = this.field1285.field662[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1360[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1402[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1645[var26];
                    int var30 = this.field1273.field741[var8];
                    this.field1273.field741[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1337 &= arg0;
        this.field1273.method259(0, 0, (byte) 3, super.field14);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1274.field741[var10] = this.field1286.field662[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1360[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1402[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1645[var18];
                    int var22 = this.field1274.field741[var16];
                    this.field1274.field741[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1274.method259(637, 0, (byte) 3, super.field14);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public static final void method461(byte arg0) {
        World3D.field283 = true;
        Pix3D.field633 = true;
        field1294 = true;
        if (arg0 != -12) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        World.field41 = true;
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1291 = Integer.parseInt(this.getParameter("nodeid"));
        field1292 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method461((byte) -12);
        } else {
            method499(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1293 = false;
        } else {
            field1293 = true;
        }
        this.method2(-97, 765, 503);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method462(int arg0, int arg1) {
        int var3 = VarpType.field1183[arg0].field1191;
        if (var3 != 0) {
            int var4 = this.field1359[arg0];
            if (arg1 != 35227) {
                this.field1288 = null;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method173(0.9D, false);
                }
                if (var4 == 2) {
                    Pix3D.method173(0.8D, false);
                }
                if (var4 == 3) {
                    Pix3D.method173(0.7D, false);
                }
                if (var4 == 4) {
                    Pix3D.method173(0.6D, false);
                }
                ObjType.field1080.method103();
                this.field1470 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1370;
                if (var4 == 0) {
                    this.method474(0, 0, this.field1370);
                    this.field1370 = true;
                }
                if (var4 == 1) {
                    this.method474(0, -400, this.field1370);
                    this.field1370 = true;
                }
                if (var4 == 2) {
                    this.method474(0, -800, this.field1370);
                    this.field1370 = true;
                }
                if (var4 == 3) {
                    this.method474(0, -1200, this.field1370);
                    this.field1370 = true;
                }
                if (var4 == 4) {
                    this.field1370 = false;
                }
                if (this.field1370 != var5 && !field1294) {
                    if (this.field1370) {
                        this.field1515 = this.field1588;
                        this.field1516 = true;
                        this.field1549.method279(2, this.field1515);
                    } else {
                        this.method467(this.field1577);
                    }
                    this.field1231 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1671 = true;
                    this.method494(11841, 0);
                }
                if (var4 == 1) {
                    this.field1671 = true;
                    this.method494(11841, -400);
                }
                if (var4 == 2) {
                    this.field1671 = true;
                    this.method494(11841, -800);
                }
                if (var4 == 3) {
                    this.field1671 = true;
                    this.method494(11841, -1200);
                }
                if (var4 == 4) {
                    this.field1671 = false;
                }
            }
            if (var3 == 5) {
                this.field1228 = var4;
            }
            if (var3 == 6) {
                this.field1595 = var4;
            }
            if (var3 == 8) {
                this.field1354 = var4;
                this.field1563 = true;
            }
            if (var3 == 9) {
                this.field1422 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method463(String arg0) {
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

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method464(int arg0) {
        int var2 = this.field1386 * 128 + 64;
        int var3 = this.field1387 * 128 + 64;
        int var4 = this.method550(var2, var3, this.field1461, true) - this.field1388;
        if (this.field1305 < var2) {
            this.field1305 += (var2 - this.field1305) * this.field1390 / 1000 + this.field1389;
            if (this.field1305 > var2) {
                this.field1305 = var2;
            }
        }
        if (this.field1305 > var2) {
            this.field1305 -= (this.field1305 - var2) * this.field1390 / 1000 + this.field1389;
            if (this.field1305 < var2) {
                this.field1305 = var2;
            }
        }
        if (this.field1306 < var4) {
            this.field1306 += (var4 - this.field1306) * this.field1390 / 1000 + this.field1389;
            if (this.field1306 > var4) {
                this.field1306 = var4;
            }
        }
        if (this.field1306 > var4) {
            this.field1306 -= (this.field1306 - var4) * this.field1390 / 1000 + this.field1389;
            if (this.field1306 < var4) {
                this.field1306 = var4;
            }
        }
        if (this.field1307 < var3) {
            this.field1307 += (var3 - this.field1307) * this.field1390 / 1000 + this.field1389;
            if (this.field1307 > var3) {
                this.field1307 = var3;
            }
        }
        if (this.field1307 > var3) {
            this.field1307 -= (this.field1307 - var3) * this.field1390 / 1000 + this.field1389;
            if (this.field1307 < var3) {
                this.field1307 = var3;
            }
        }
        int var5 = this.field1222 * 128 + 64;
        int var6 = this.field1223 * 128 + 64;
        int var7 = this.method550(var5, var6, this.field1461, true) - this.field1224;
        int var8 = var5 - this.field1305;
        int var9 = var7 - this.field1306;
        int var10 = var6 - this.field1307;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0 != 3) {
            this.field1558 = this.field1627.method229();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1308 < var12) {
            this.field1308 += (var12 - this.field1308) * this.field1226 / 1000 + this.field1225;
            if (this.field1308 > var12) {
                this.field1308 = var12;
            }
        }
        if (this.field1308 > var12) {
            this.field1308 -= (this.field1308 - var12) * this.field1226 / 1000 + this.field1225;
            if (this.field1308 < var12) {
                this.field1308 = var12;
            }
        }
        int var14 = var13 - this.field1309;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1309 += this.field1226 * var14 / 1000 + this.field1225;
            this.field1309 &= 2047;
        }
        if (var14 < 0) {
            this.field1309 -= -var14 * this.field1226 / 1000 + this.field1225;
            this.field1309 &= 2047;
        }
        int var15 = var13 - this.field1309;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1309 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method465(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 >= 0) {
            this.field1558 = -1;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field1579 = !this.field1579;
        }
        this.field1581 = 0;
        int var2 = (field1525.field397 >> 7) + this.field1511;
        int var3 = (field1525.field398 >> 7) + this.field1512;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1581 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1581 = 1;
        }
        if (this.field1581 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1581 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method467(int arg0) {
        if (arg0 < 0) {
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method468(int arg0) {
        int var2 = 19 / arg0;
        while (true) {
            OnDemandRequest var3 = this.field1549.method281();
            if (var3 == null) {
                return;
            }
            if (var3.field716 == 0) {
                Model.method124(var3.field717, (byte) 3, var3.field718);
                if ((this.field1549.method277(var3.field717, (byte) 6) & 98) != 0) {
                    this.field1587 = true;
                    if (this.field1348 != -1) {
                        this.field1563 = true;
                    }
                }
            }
            if (var3.field716 == 1 && var3.field718 != null) {
                AnimFrame.method45(-27141, var3.field718);
            }
            if (var3.field716 == 2 && this.field1515 == var3.field717 && var3.field718 != null) {
                this.method465(var3.field718, this.field1376, this.field1516);
            }
            if (var3.field716 == 3 && this.field1600 == 1) {
                for (int var4 = 0; var4 < this.field1576.length; ++var4) {
                    if (this.field1395[var4] == var3.field717) {
                        this.field1576[var4] = var3.field718;
                        if (var3.field718 == null) {
                            this.field1395[var4] = -1;
                        }
                        break;
                    }
                    if (this.field1396[var4] == var3.field717) {
                        this.field1260[var4] = var3.field718;
                        if (var3.field718 == null) {
                            this.field1396[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field716 == 93 && this.field1549.method276(0, var3.field717)) {
                World.method17(new Packet(field1640, var3.field718), -15495, this.field1549);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)Z")
    public final boolean method469(byte arg0, Component arg1) {
        if (arg0 != -76) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1.field86 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < arg1.field86.length; ++var4) {
                int var5 = this.method478((byte) -95, var4, arg1);
                int var6 = arg1.field87[var4];
                if (arg1.field86[var4] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg1.field86[var4] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg1.field86[var4] == 4) {
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

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    private final void method470(int arg0) {
        if (arg0 != 0) {
            field1489 = !field1489;
        }
        if (this.field1600 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1331.method248(); var2 != null; var2 = (LocSpawned) this.field1331.method250((byte) 71)) {
                if (var2.field732 > 0) {
                    --var2.field732;
                }
                if (var2.field732 == 0) {
                    if (var2.field725 < 0 || World.method30((byte) 121, var2.field727, var2.field725)) {
                        this.method512(var2.field724, var2.field723, 9, var2.field722, var2.field726, var2.field721, var2.field727, var2.field725);
                        var2.method106();
                    }
                } else {
                    if (var2.field731 > 0) {
                        --var2.field731;
                    }
                    if (var2.field731 == 0 && var2.field723 >= 1 && var2.field724 >= 1 && var2.field723 <= 102 && var2.field724 <= 102 && (var2.field728 < 0 || World.method30((byte) 121, var2.field730, var2.field728))) {
                        this.method512(var2.field724, var2.field723, 9, var2.field722, var2.field729, var2.field721, var2.field730, var2.field728);
                        var2.field731 = -1;
                        if (var2.field728 == var2.field725 && var2.field725 == -1) {
                            var2.method106();
                        } else if (var2.field728 == var2.field725 && var2.field729 == var2.field726 && var2.field730 == var2.field727) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1605 && !this.field1335 && !this.field1590) {
            ++field1279;
            if (!this.field1337) {
                this.method453(7);
            } else {
                this.method533(-347);
            }
            this.method468(414);
            this.field1557 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method471(int arg0, int arg1) {
        int[] var3 = this.field1575.field662;
        this.field1557 += arg1;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1239[arg0][var24][var6] & 24) == 0) {
                    this.field1589.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1239[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1589.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1575.method181((byte) -127);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1239[arg0][var22][var9] & 24) == 0) {
                    this.method534(var8, var9, arg0, true, var22, var7);
                }
                if (arg0 < 3 && (this.field1239[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method534(var8, var9, arg0 + 1, true, var22, var7);
                }
            }
        }
        this.field1621.method258((byte) -127);
        this.field1567 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1589.method79(this.field1461, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method330(var13).field964;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1596[this.field1461].field1091;
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
                        this.field1362[this.field1567] = this.field1373[var14];
                        this.field1568[this.field1567] = var15;
                        this.field1569[this.field1567] = var16;
                        ++this.field1567;
                    }
                }
            }
        }
        ++field1216;
        if (field1216 > 112) {
            field1216 = 0;
            this.field1416.method218((byte) 1, 39);
            this.field1416.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)Z")
    public final boolean method472(boolean arg0) {
        this.field1337 &= arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)Ljava/lang/String;")
    public final String method473(int arg0) {
        while (arg0 >= 0) {
            this.field1477 = 353;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else if (super.field17 != null) {
            return "runescape.com";
        } else {
            return super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method474(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        this.field1557 += arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IB)V")
    private final void method475(Packet arg0, int arg1, byte arg2) {
        this.field1472 = 0;
        this.field1500 = 0;
        this.method527(arg1, arg0, true);
        this.method514(arg1, arg0, 137);
        this.method509(912, arg1, arg0);
        this.method549(arg0, false, arg1);
        for (int var4 = 0; var4 < this.field1472; ++var4) {
            int var7 = this.field1473[var4];
            if (field1279 != this.field1497[var7].field442) {
                this.field1497[var7] = null;
            }
        }
        if (arg2 == 2) {
            boolean var5 = false;
            if (arg0.field703 != arg1) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field703 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var6 = 0; var6 < this.field1498; ++var6) {
                    if (this.field1497[this.field1499[var6]] == null) {
                        signlink.reporterror(this.field1398 + " null entry in pl list - pos:" + var6 + " size:" + this.field1498);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method476(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1240 >= 100 && this.field1656 != 1) {
                this.method536(1, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field1240 >= 200) {
                this.method536(1, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = JString.method304((byte) 8, JString.method301(this.field1649, arg1));
                for (int var5 = 0; var5 < this.field1240; ++var5) {
                    if (this.field1604[var5] == arg1) {
                        this.method536(1, "", 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1611; ++var6) {
                    if (this.field1550[var6] == arg1) {
                        this.method536(1, "", 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1525.field458)) {
                    this.field1641[this.field1240] = var4;
                    this.field1604[this.field1240] = arg1;
                    this.field1509[this.field1240] = 0;
                    ++this.field1240;
                    this.field1587 = true;
                    this.field1416.method218((byte) 1, 176);
                    this.field1416.method225(arg1, field1629);
                    if (arg0 != 0) {
                        field1640 = this.field1407.method295();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method477(byte arg0) {
        if (this.field1613 == 0 && this.field1312 == 0) {
            this.field1280[this.field1382] = "Walk here";
            this.field1248[this.field1382] = 718;
            this.field1246[this.field1382] = super.field22;
            this.field1247[this.field1382] = super.field23;
            ++this.field1382;
        }
        int var2 = -1;
        if (this.field1251 == arg0) {
            boolean var3 = false;
        } else {
            this.field1526 = -409;
        }
        for (int var4 = 0; var4 < Model.field599; ++var4) {
            int var5 = Model.field600[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field1589.method80(this.field1461, var6, var7, var5) >= 0) {
                    LocType var10 = LocType.method330(var9);
                    if (var10.field978 != null) {
                        var10 = var10.method338((byte) 1);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field1613 == 1) {
                        this.field1280[this.field1382] = "Use " + this.field1617 + " with @cya@" + var10.field947;
                        this.field1248[this.field1382] = 810;
                        this.field1249[this.field1382] = var5;
                        this.field1246[this.field1382] = var6;
                        this.field1247[this.field1382] = var7;
                        ++this.field1382;
                    } else if (this.field1312 == 1) {
                        if ((this.field1314 & 4) == 4) {
                            this.field1280[this.field1382] = this.field1315 + " @cya@" + var10.field947;
                            this.field1248[this.field1382] = 899;
                            this.field1249[this.field1382] = var5;
                            this.field1246[this.field1382] = var6;
                            this.field1247[this.field1382] = var7;
                            ++this.field1382;
                        }
                    } else {
                        if (var10.field963 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field963[var11] != null) {
                                    this.field1280[this.field1382] = var10.field963[var11] + " @cya@" + var10.field947;
                                    if (var11 == 0) {
                                        this.field1248[this.field1382] = 625;
                                    }
                                    if (var11 == 1) {
                                        this.field1248[this.field1382] = 721;
                                    }
                                    if (var11 == 2) {
                                        this.field1248[this.field1382] = 743;
                                    }
                                    if (var11 == 3) {
                                        this.field1248[this.field1382] = 357;
                                    }
                                    if (var11 == 4) {
                                        this.field1248[this.field1382] = 1071;
                                    }
                                    this.field1249[this.field1382] = var5;
                                    this.field1246[this.field1382] = var6;
                                    this.field1247[this.field1382] = var7;
                                    ++this.field1382;
                                }
                            }
                        }
                        this.field1280[this.field1382] = "Examine @cya@" + var10.field947;
                        this.field1248[this.field1382] = 1381;
                        this.field1249[this.field1382] = var10.field944 << 14;
                        this.field1246[this.field1382] = var6;
                        this.field1247[this.field1382] = var7;
                        ++this.field1382;
                    }
                }
                if (var8 == 1) {
                    NpcEntity var12 = this.field1364[var9];
                    if (var12.field454.field1001 == 1 && (var12.field397 & 127) == 64 && (var12.field398 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field1365; ++var13) {
                            NpcEntity var16 = this.field1364[this.field1366[var13]];
                            if (var16 != null && var12 != var16 && var16.field454.field1001 == 1 && var12.field397 == var16.field397 && var12.field398 == var16.field398) {
                                this.method559(this.field1244, var7, var16.field454, var6, this.field1366[var13]);
                            }
                        }
                        for (int var14 = 0; var14 < this.field1498; ++var14) {
                            PlayerEntity var15 = this.field1497[this.field1499[var14]];
                            if (var15 != null && var12.field397 == var15.field397 && var12.field398 == var15.field398) {
                                this.method504((byte) 4, var15, var6, var7, this.field1499[var14]);
                            }
                        }
                    }
                    this.method559(this.field1244, var7, var12.field454, var6, var9);
                }
                if (var8 == 0) {
                    PlayerEntity var17 = this.field1497[var9];
                    if ((var17.field397 & 127) == 64 && (var17.field398 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field1365; ++var18) {
                            NpcEntity var21 = this.field1364[this.field1366[var18]];
                            if (var21 != null && var21.field454.field1001 == 1 && var17.field397 == var21.field397 && var17.field398 == var21.field398) {
                                this.method559(this.field1244, var7, var21.field454, var6, this.field1366[var18]);
                            }
                        }
                        for (int var19 = 0; var19 < this.field1498; ++var19) {
                            PlayerEntity var20 = this.field1497[this.field1499[var19]];
                            if (var20 != null && var17 != var20 && var17.field397 == var20.field397 && var17.field398 == var20.field398) {
                                this.method504((byte) 4, var20, var6, var7, this.field1499[var19]);
                            }
                        }
                    }
                    this.method504((byte) 4, var17, var6, var7, var9);
                }
                if (var8 == 3) {
                    LinkList var22 = this.field1288[this.field1461][var6][var7];
                    if (var22 != null) {
                        for (ObjStackEntity var23 = (ObjStackEntity) var22.method249((byte) 7); var23 != null; var23 = (ObjStackEntity) var22.method251(6)) {
                            ObjType var24 = ObjType.method348(var23.field498);
                            if (this.field1613 == 1) {
                                this.field1280[this.field1382] = "Use " + this.field1617 + " with @lre@" + var24.field1041;
                                this.field1248[this.field1382] = 111;
                                this.field1249[this.field1382] = var23.field498;
                                this.field1246[this.field1382] = var6;
                                this.field1247[this.field1382] = var7;
                                ++this.field1382;
                            } else if (this.field1312 == 1) {
                                if ((this.field1314 & 1) == 1) {
                                    this.field1280[this.field1382] = this.field1315 + " @lre@" + var24.field1041;
                                    this.field1248[this.field1382] = 370;
                                    this.field1249[this.field1382] = var23.field498;
                                    this.field1246[this.field1382] = var6;
                                    this.field1247[this.field1382] = var7;
                                    ++this.field1382;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1055 != null && var24.field1055[var25] != null) {
                                        this.field1280[this.field1382] = var24.field1055[var25] + " @lre@" + var24.field1041;
                                        if (var25 == 0) {
                                            this.field1248[this.field1382] = 139;
                                        }
                                        if (var25 == 1) {
                                            this.field1248[this.field1382] = 778;
                                        }
                                        if (var25 == 2) {
                                            this.field1248[this.field1382] = 617;
                                        }
                                        if (var25 == 3) {
                                            this.field1248[this.field1382] = 224;
                                        }
                                        if (var25 == 4) {
                                            this.field1248[this.field1382] = 662;
                                        }
                                        this.field1249[this.field1382] = var23.field498;
                                        this.field1246[this.field1382] = var6;
                                        this.field1247[this.field1382] = var7;
                                        ++this.field1382;
                                    } else if (var25 == 2) {
                                        this.field1280[this.field1382] = "Take @lre@" + var24.field1041;
                                        this.field1248[this.field1382] = 617;
                                        this.field1249[this.field1382] = var23.field498;
                                        this.field1246[this.field1382] = var6;
                                        this.field1247[this.field1382] = var7;
                                        ++this.field1382;
                                    }
                                }
                                this.field1280[this.field1382] = "Examine @lre@" + var24.field1041;
                                this.field1248[this.field1382] = 1152;
                                this.field1249[this.field1382] = var23.field498;
                                this.field1246[this.field1382] = var6;
                                this.field1247[this.field1382] = var7;
                                ++this.field1382;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILd;)I")
    public final int method478(byte arg0, int arg1, Component arg2) {
        if (arg0 != -95) {
            this.field1558 = -1;
        }
        if (arg2.field85 != null && arg1 < arg2.field85.length) {
            try {
                int[] var4 = arg2.field85[arg1];
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
                        var9 = this.field1363[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1357[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1372[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field70[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1033 && (!ObjType.method348(var12).field1054 || field1293)) {
                            for (int var13 = 0; var13 < var11.field71.length; ++var13) {
                                if (var12 + 1 == var11.field71[var13]) {
                                    var9 += var11.field72[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1359[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1504[this.field1357[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1359[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1525.field464;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1151; ++var14) {
                            if (Stats.field1153[var14]) {
                                var9 += this.field1357[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field70[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1033 && (!ObjType.method348(var16).field1054 || field1293)) {
                            for (int var17 = 0; var17 < var15.field71.length; ++var17) {
                                if (var15.field71[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1383;
                    }
                    if (var8 == 12) {
                        var9 = this.field1643;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1359[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1172[var20];
                        int var22 = var21.field1174;
                        int var23 = var21.field1175;
                        int var24 = var21.field1176;
                        int var25 = field1349[var24 - var23];
                        var9 = this.field1359[var22] >> var23 & var25;
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
                        var9 = (field1525.field397 >> 7) + this.field1511;
                    }
                    if (var8 == 19) {
                        var9 = (field1525.field398 >> 7) + this.field1512;
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

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method479(int arg0) {
        this.field1553 = false;
        while (this.field1485) {
            this.field1553 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1635 = null;
        this.field1636 = null;
        this.field1420 = null;
        this.field1645 = null;
        this.field1646 = null;
        this.field1647 = null;
        this.field1648 = null;
        this.field1542 = null;
        this.field1543 = null;
        this.field1402 = null;
        this.field1403 = null;
        if (arg0 < 7 || arg0 > 7) {
            this.field1288 = null;
        }
        this.field1285 = null;
        this.field1286 = null;
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    private final void method480(int arg0) {
        while (arg0 >= 0) {
            this.field1288 = null;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1331.method248(); var2 != null; var2 = (LocSpawned) this.field1331.method250((byte) 71)) {
            if (var2.field732 == -1) {
                var2.field731 = 0;
                this.method526((byte) 6, var2);
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method481(int arg0) {
        ++field1379;
        this.field1557 += arg0;
        if (field1379 > 192) {
            field1379 = 0;
            this.field1416.method218((byte) 1, 57);
            this.field1416.method219(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(-28882);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1221 != -1 && this.field1258 == this.field1221) {
                        if (var2 == 8 && this.field1534.length() > 0) {
                            this.field1534 = this.field1534.substring(0, this.field1534.length() - 1);
                        }
                        break;
                    }
                    if (this.field1571) {
                        if (var2 >= 32 && var2 <= 122 && this.field1415.length() < 80) {
                            this.field1415 = this.field1415 + (char) var2;
                            this.field1563 = true;
                        }
                        if (var2 == 8 && this.field1415.length() > 0) {
                            this.field1415 = this.field1415.substring(0, this.field1415.length() - 1);
                            this.field1563 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1571 = false;
                            this.field1563 = true;
                            if (this.field1233 == 1) {
                                long var3 = JString.method300(this.field1415);
                                this.method476(0, var3);
                            }
                            if (this.field1233 == 2 && this.field1240 > 0) {
                                long var5 = JString.method300(this.field1415);
                                this.method537(var5, 545);
                            }
                            if (this.field1233 == 3 && this.field1415.length() > 0) {
                                this.field1416.method218((byte) 1, 236);
                                this.field1416.method219(0);
                                int var7 = this.field1416.field703;
                                this.field1416.method225(this.field1540, field1629);
                                WordPack.method307(this.field1416, true, this.field1415);
                                this.field1416.method228(9, this.field1416.field703 - var7);
                                this.field1415 = WordPack.method308((byte) 1, this.field1415);
                                this.field1415 = WordFilter.method401((byte) 1, this.field1415);
                                this.method536(1, JString.method304((byte) 8, JString.method301(this.field1649, this.field1540)), 6, this.field1415);
                                if (this.field1612 == 2) {
                                    this.field1612 = 1;
                                    this.field1539 = true;
                                    this.field1416.method218((byte) 1, 158);
                                    this.field1416.method219(this.field1334);
                                    this.field1416.method219(this.field1612);
                                    this.field1416.method219(this.field1460);
                                }
                            }
                            if (this.field1233 == 4 && this.field1611 < 100) {
                                long var8 = JString.method300(this.field1415);
                                this.method561(var8, this.field1579);
                            }
                            if (this.field1233 == 5 && this.field1611 > 0) {
                                long var10 = JString.method300(this.field1415);
                                this.method511(var10, false);
                            }
                        }
                    } else if (this.field1342) {
                        if (var2 >= 48 && var2 <= 57 && this.field1618.length() < 10) {
                            this.field1618 = this.field1618 + (char) var2;
                            this.field1563 = true;
                        }
                        if (var2 == 8 && this.field1618.length() > 0) {
                            this.field1618 = this.field1618.substring(0, this.field1618.length() - 1);
                            this.field1563 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1618.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1618);
                                } catch (Exception var19) {
                                }
                                this.field1416.method218((byte) 1, 12);
                                this.field1416.method223(var12);
                            }
                            this.field1342 = false;
                            this.field1563 = true;
                        }
                    } else if (this.field1348 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1566.length() < 80) {
                            this.field1566 = this.field1566 + (char) var2;
                            this.field1563 = true;
                        }
                        if (var2 == 8 && this.field1566.length() > 0) {
                            this.field1566 = this.field1566.substring(0, this.field1566.length() - 1);
                            this.field1563 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1566.length() > 0) {
                            if (this.field1330 == 2) {
                                if (this.field1566.equals("::clientdrop")) {
                                    this.method502(true);
                                }
                                if (this.field1566.equals("::lag")) {
                                    this.method438(6);
                                }
                                if (this.field1566.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1549.method272(26014, 2); ++var13) {
                                        this.field1549.method282(field1391, 2, (byte) 1, var13);
                                    }
                                }
                                if (this.field1566.equals("::fpson")) {
                                    field1267 = true;
                                }
                                if (this.field1566.equals("::fpsoff")) {
                                    field1267 = false;
                                }
                            }
                            if (this.field1566.startsWith("::")) {
                                this.field1416.method218((byte) 1, 95);
                                this.field1416.method219(this.field1566.length() - 1);
                                this.field1416.method226(this.field1566.substring(2));
                            } else {
                                String var14 = this.field1566.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1566 = this.field1566.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1566 = this.field1566.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1566 = this.field1566.substring(6);
                                }
                                String var16 = this.field1566.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field1566 = this.field1566.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field1566 = this.field1566.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field1566 = this.field1566.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field1566 = this.field1566.substring(6);
                                }
                                this.field1416.method218((byte) 1, 29);
                                this.field1416.method219(0);
                                int var18 = this.field1416.field703;
                                this.field1416.method219(var15);
                                this.field1416.method219(var17);
                                WordPack.method307(this.field1416, true, this.field1566);
                                this.field1416.method228(9, this.field1416.field703 - var18);
                                this.field1566 = WordPack.method308((byte) 1, this.field1566);
                                this.field1566 = WordFilter.method401((byte) 1, this.field1566);
                                field1525.field409 = this.field1566;
                                field1525.field411 = var15;
                                field1525.field412 = var17;
                                field1525.field410 = 150;
                                if (this.field1330 == 2) {
                                    this.method536(1, "@cr2@" + field1525.field458, 2, field1525.field409);
                                } else if (this.field1330 == 1) {
                                    this.method536(1, "@cr1@" + field1525.field458, 2, field1525.field409);
                                } else {
                                    this.method536(1, field1525.field458, 2, field1525.field409);
                                }
                                if (this.field1334 == 2) {
                                    this.field1334 = 3;
                                    this.field1539 = true;
                                    this.field1416.method218((byte) 1, 158);
                                    this.field1416.method219(this.field1334);
                                    this.field1416.method219(this.field1612);
                                    this.field1416.method219(this.field1460);
                                }
                            }
                            this.field1566 = "";
                            this.field1563 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1534.length() < 12) {
                this.field1534 = this.field1534 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBZIIIIII)Z")
    public final boolean method482(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1508[var15][var35] = 0;
                this.field1385[var15][var35] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg9;
        this.field1508[arg6][arg9] = 99;
        this.field1385[arg6][arg9] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1650[var18] = arg6;
        int var36 = var18 + 1;
        this.field1651[var18] = arg9;
        boolean var20 = false;
        if (arg4 != -114) {
            this.method6();
        }
        int var21 = this.field1650.length;
        int[][] var22 = this.field1596[this.field1461].field1091;
        while (var36 != var19) {
            var16 = this.field1650[var19];
            var17 = this.field1651[var19];
            var19 = (var19 + 1) % var21;
            if (arg7 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field1596[this.field1461].method368(arg8, var16, arg11, var17, arg7, field1572, arg2 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg2 < 10 && this.field1596[this.field1461].method369(arg8, 0, var17, arg11, arg7, arg2 - 1, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && this.field1596[this.field1461].method370(arg3, arg7, var17, arg10, arg1, arg11, var16, false)) {
                var20 = true;
                break;
            }
            int var34 = this.field1385[var16][var17] + 1;
            if (var16 > 0 && this.field1508[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1650[var36] = var16 - 1;
                this.field1651[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 - 1][var17] = 2;
                this.field1385[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1508[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1650[var36] = var16 + 1;
                this.field1651[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 + 1][var17] = 8;
                this.field1385[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1508[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1650[var36] = var16;
                this.field1651[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16][var17 - 1] = 1;
                this.field1385[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1508[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1650[var36] = var16;
                this.field1651[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16][var17 + 1] = 4;
                this.field1385[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1508[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1650[var36] = var16 - 1;
                this.field1651[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 - 1][var17 - 1] = 3;
                this.field1385[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1508[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1650[var36] = var16 + 1;
                this.field1651[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 + 1][var17 - 1] = 9;
                this.field1385[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1508[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1650[var36] = var16 - 1;
                this.field1651[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 - 1][var17 + 1] = 6;
                this.field1385[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1508[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1650[var36] = var16 + 1;
                this.field1651[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1508[var16 + 1][var17 + 1] = 12;
                this.field1385[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1227 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg7 - var24; var25 <= arg7 + var24; ++var25) {
                        for (int var26 = arg11 - var24; var26 <= arg11 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1385[var25][var26] < var23) {
                                var23 = this.field1385[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1227 = 1;
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
        this.field1650[var27] = var16;
        int var37 = var27 + 1;
        this.field1651[var27] = var17;
        int var28;
        int var29 = var28 = this.field1508[var16][var17];
        while (arg6 != var16 || arg9 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1650[var37] = var16;
                this.field1651[var37++] = var17;
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
            var29 = this.field1508[var16][var17];
        }
        if (var37 <= 0) {
            if (arg0 == 1) {
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
            int var31 = this.field1650[var37];
            int var32 = this.field1651[var37];
            if (arg0 == 0) {
                this.field1416.method218((byte) 1, 201);
                this.field1416.method219(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field1416.method218((byte) 1, 77);
                this.field1416.method219(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field1416.method218((byte) 1, 41);
                this.field1416.method219(var30 + var30 + 3);
            }
            if (super.field32[5] == 1) {
                this.field1416.method219(1);
            } else {
                this.field1416.method219(0);
            }
            this.field1416.method220(this.field1511 + var31);
            this.field1416.method220(this.field1512 + var32);
            this.field1573 = this.field1650[0];
            this.field1574 = this.field1651[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1416.method219(this.field1650[var37] - var31);
                this.field1416.method219(this.field1651[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1331.method248(); var12 != null; var12 = (LocSpawned) this.field1331.method250((byte) 71)) {
            if (var12.field721 == arg3 && var12.field723 == arg9 && var12.field724 == arg4 && var12.field722 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field721 = arg3;
            var11.field722 = arg0;
            var11.field723 = arg9;
            var11.field724 = arg4;
            this.method526((byte) 6, var11);
            this.field1331.method245(var11);
        }
        var11.field728 = arg5;
        var11.field730 = arg2;
        if (arg8 <= 0) {
            field1489 = !field1489;
        }
        var11.field729 = arg7;
        var11.field731 = arg1;
        var11.field732 = arg6;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method484(int arg0) {
        if (arg0 <= 0) {
            this.field1558 = -1;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1606.method248(); var2 != null; var2 = (SpotAnimEntity) this.field1606.method250((byte) 71)) {
            if (this.field1461 == var2.field608 && !var2.field614) {
                if (field1279 >= var2.field607) {
                    var2.method151(this.field1215, 0);
                    if (var2.field614) {
                        var2.method106();
                    } else {
                        this.field1589.method61(60, var2.field608, -346, var2.field610, -1, var2, var2.field611, var2.field609, 0, false);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method485(Component arg0, boolean arg1) {
        this.field1337 &= arg1;
        int var3 = arg0.field79;
        if (this.field1241 == 2) {
            if (var3 == 201) {
                this.field1563 = true;
                this.field1342 = false;
                this.field1571 = true;
                this.field1415 = "";
                this.field1233 = 1;
                this.field1361 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1563 = true;
                this.field1342 = false;
                this.field1571 = true;
                this.field1415 = "";
                this.field1233 = 2;
                this.field1361 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1561 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1563 = true;
                this.field1342 = false;
                this.field1571 = true;
                this.field1415 = "";
                this.field1233 = 4;
                this.field1361 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1563 = true;
                this.field1342 = false;
                this.field1571 = true;
                this.field1415 = "";
                this.field1233 = 5;
                this.field1361 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1630[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1110 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1110) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1111[var6].field1117 && IdkType.field1111[var6].field1112 == var4 + (this.field1242 ? 0 : 7)) {
                            this.field1630[var4] = var6;
                            this.field1381 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1535[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1457[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1457[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1535[var7] = var9;
                this.field1381 = true;
            }
            if (var3 == 324 && !this.field1242) {
                this.field1242 = true;
                this.method459(-35064);
            }
            if (var3 == 325 && this.field1242) {
                this.field1242 = false;
                this.method459(-35064);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1487 = !this.field1487;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method542((byte) 1);
                    if (this.field1534.length() > 0) {
                        this.field1416.method218((byte) 1, 91);
                        this.field1416.method225(JString.method300(this.field1534), field1629);
                        this.field1416.method219(var3 - 601);
                        this.field1416.method219(this.field1487 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1416.method218((byte) 1, 169);
                this.field1416.method219(this.field1242 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1416.method219(this.field1630[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1416.method219(this.field1535[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (this.field1270 == null) {
            super.field15 = null;
            this.field1622 = null;
            this.field1620 = null;
            this.field1619 = null;
            this.field1621 = null;
            this.field1582 = null;
            this.field1583 = null;
            this.field1584 = null;
            this.field1273 = new PixMap(false, this.method11(7), 128, 265);
            Pix2D.method155(0);
            this.field1274 = new PixMap(false, this.method11(7), 128, 265);
            Pix2D.method155(0);
            this.field1270 = new PixMap(false, this.method11(7), 509, 171);
            Pix2D.method155(0);
            this.field1271 = new PixMap(false, this.method11(7), 360, 132);
            Pix2D.method155(0);
            this.field1272 = new PixMap(false, this.method11(7), 360, 200);
            Pix2D.method155(0);
            this.field1275 = new PixMap(false, this.method11(7), 202, 238);
            Pix2D.method155(0);
            this.field1276 = new PixMap(false, this.method11(7), 203, 238);
            Pix2D.method155(0);
            while (arg0 >= 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field1277 = new PixMap(false, this.method11(7), 74, 94);
            Pix2D.method155(0);
            this.field1278 = new PixMap(false, this.method11(7), 75, 94);
            Pix2D.method155(0);
            if (this.field1259 != null) {
                this.method443(0);
                this.method430(0);
            }
            this.field1470 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = Model.field601[var8];
            int var14 = Model.field602[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field601[var9];
            int var17 = Model.field602[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1305 = arg1 - var10;
        if (arg4 != 3) {
            for (int var19 = 1; var19 > 0; ++var19) {
            }
        }
        this.field1306 = arg3 - var11;
        this.field1307 = arg6 - var12;
        this.field1308 = arg0;
        this.field1309 = arg2;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        this.field1439 = 0;
        if (!arg0) {
            this.field1558 = this.field1627.method229();
        }
        for (int var2 = -1; var2 < this.field1498 + this.field1365; ++var2) {
            PathingEntity var19;
            if (var2 == -1) {
                var19 = field1525;
            } else if (var2 < this.field1498) {
                var19 = this.field1497[this.field1499[var2]];
            } else {
                var19 = this.field1364[this.field1366[var2 - this.field1498]];
            }
            if (var19 != null && var19.method113(false)) {
                if (var2 >= this.field1498) {
                    NpcType var23 = ((NpcEntity) var19).field454;
                    if (var23.field1022 >= 0 && var23.field1022 < this.field1404.length) {
                        this.method490(-884, var19, var19.field443 + 15);
                        if (this.field1506 > -1) {
                            this.field1404[var23.field1022].method186(this.field1506 - 12, this.field1507 - 30, false);
                        }
                    }
                    if (this.field1459 == 1 && this.field1366[var2 - this.field1498] == this.field1623 && field1279 % 20 < 10) {
                        this.method490(-884, var19, var19.field443 + 15);
                        if (this.field1506 > -1) {
                            this.field1404[2].method186(this.field1506 - 12, this.field1507 - 28, false);
                        }
                    }
                } else {
                    int var20 = 30;
                    PlayerEntity var21 = (PlayerEntity) var19;
                    if (var21.field461 != 0) {
                        this.method490(-884, var19, var19.field443 + 15);
                        if (this.field1506 > -1) {
                            for (int var22 = 0; var22 < 8; ++var22) {
                                if ((var21.field461 & 1 << var22) != 0) {
                                    this.field1404[var22].method186(this.field1506 - 12, this.field1507 - var20, false);
                                    var20 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1459 == 10 && this.field1499[var2] == this.field1287) {
                        this.method490(-884, var19, var19.field443 + 15);
                        if (this.field1506 > -1) {
                            this.field1404[7].method186(this.field1506 - 12, this.field1507 - var20, false);
                        }
                    }
                }
                if (var19.field409 != null && (var2 >= this.field1498 || this.field1334 == 0 || this.field1334 == 3 || this.field1334 == 1 && this.method437(1657, ((PlayerEntity) var19).field458))) {
                    this.method490(-884, var19, var19.field443);
                    if (this.field1506 > -1 && this.field1439 < this.field1440) {
                        this.field1444[this.field1439] = this.field1451.method205(var19.field409, -309) / 2;
                        this.field1443[this.field1439] = this.field1451.field690;
                        this.field1441[this.field1439] = this.field1506;
                        this.field1442[this.field1439] = this.field1507;
                        this.field1445[this.field1439] = var19.field411;
                        this.field1446[this.field1439] = var19.field412;
                        this.field1447[this.field1439] = var19.field410;
                        this.field1448[this.field1439++] = var19.field409;
                        if (this.field1595 == 0 && var19.field412 >= 1 && var19.field412 <= 3) {
                            this.field1443[this.field1439] += 10;
                            this.field1442[this.field1439] += 5;
                        }
                        if (this.field1595 == 0 && var19.field412 == 4) {
                            this.field1444[this.field1439] = 60;
                        }
                        if (this.field1595 == 0 && var19.field412 == 5) {
                            this.field1443[this.field1439] += 5;
                        }
                    }
                }
                if (var19.field416 > field1279) {
                    this.method490(-884, var19, var19.field443 + 15);
                    if (this.field1506 > -1) {
                        int var24 = var19.field417 * 30 / var19.field418;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        Pix2D.method157(this.field1506 - 15, var24, 4, 65280, 5, this.field1507 - 3);
                        Pix2D.method157(this.field1506 - 15 + var24, 30 - var24, 4, 16711680, 5, this.field1507 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field415[var25] > field1279) {
                        this.method490(-884, var19, var19.field443 / 2);
                        if (this.field1506 > -1) {
                            if (var25 == 1) {
                                this.field1507 -= 20;
                            }
                            if (var25 == 2) {
                                this.field1506 -= 15;
                                this.field1507 -= 10;
                            }
                            if (var25 == 3) {
                                this.field1506 += 15;
                                this.field1507 -= 10;
                            }
                            this.field1430[var19.field414[var25]].method186(this.field1506 - 12, this.field1507 - 12, false);
                            this.field1449.method202(0, this.field1507 + 4, 36569, this.field1506, String.valueOf(var19.field413[var25]));
                            this.field1449.method202(16777215, this.field1507 + 3, 36569, this.field1506 - 1, String.valueOf(var19.field413[var25]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1439; ++var3) {
            int var4 = this.field1441[var3];
            int var5 = this.field1442[var3];
            int var6 = this.field1444[var3];
            int var7 = this.field1443[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field1442[var18] - this.field1443[var18] && var5 - var7 < this.field1442[var18] + 2 && var4 - var6 < this.field1444[var18] + this.field1441[var18] && var4 + var6 > this.field1441[var18] - this.field1444[var18] && this.field1442[var18] - this.field1443[var18] < var5) {
                        var5 = this.field1442[var18] - this.field1443[var18];
                        var8 = true;
                    }
                }
            }
            this.field1506 = this.field1441[var3];
            this.field1507 = this.field1442[var3] = var5;
            String var9 = this.field1448[var3];
            if (this.field1595 == 0) {
                int var10 = 16776960;
                if (this.field1445[var3] < 6) {
                    var10 = this.field1667[this.field1445[var3]];
                }
                if (this.field1445[var3] == 6) {
                    var10 = this.field1356 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1445[var3] == 7) {
                    var10 = this.field1356 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1445[var3] == 8) {
                    var10 = this.field1356 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1445[var3] == 9) {
                    int var11 = 150 - this.field1447[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1445[var3] == 10) {
                    int var12 = 150 - this.field1447[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1445[var3] == 11) {
                    int var13 = 150 - this.field1447[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1446[var3] == 0) {
                    this.field1451.method202(0, this.field1507 + 1, 36569, this.field1506, var9);
                    this.field1451.method202(var10, this.field1507, 36569, this.field1506, var9);
                }
                if (this.field1446[var3] == 1) {
                    this.field1451.method207(0, (byte) 6, this.field1507 + 1, this.field1506, this.field1356, var9);
                    this.field1451.method207(var10, (byte) 6, this.field1507, this.field1506, this.field1356, var9);
                }
                if (this.field1446[var3] == 2) {
                    this.field1451.method208(this.field1506, false, 0, this.field1507 + 1, var9, this.field1356);
                    this.field1451.method208(this.field1506, false, var10, this.field1507, var9, this.field1356);
                }
                if (this.field1446[var3] == 3) {
                    this.field1451.method209(this.field1507 + 1, var9, this.field1506, 150 - this.field1447[var3], this.field1356, 0, this.field1243);
                    this.field1451.method209(this.field1507, var9, this.field1506, 150 - this.field1447[var3], this.field1356, var10, this.field1243);
                }
                if (this.field1446[var3] == 4) {
                    int var14 = this.field1451.method205(var9, -309);
                    int var15 = (150 - this.field1447[var3]) * (var14 + 100) / 150;
                    Pix2D.method154(0, this.field1506 - 50, this.field1506 + 50, 0, 334);
                    this.field1451.method206(-49546, var9, 0, this.field1506 + 50 - var15, this.field1507 + 1);
                    this.field1451.method206(-49546, var9, var10, this.field1506 + 50 - var15, this.field1507);
                    Pix2D.method153(4207);
                }
                if (this.field1446[var3] == 5) {
                    int var16 = 150 - this.field1447[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    Pix2D.method154(this.field1507 - this.field1451.field690 - 1, 0, 512, 0, this.field1507 + 5);
                    this.field1451.method202(0, this.field1507 + 1 + var17, 36569, this.field1506, var9);
                    this.field1451.method202(var10, this.field1507 + var17, 36569, this.field1506, var9);
                    Pix2D.method153(4207);
                }
            } else {
                this.field1451.method202(0, this.field1507 + 1, 36569, this.field1506, var9);
                this.field1451.method202(16776960, this.field1507, 36569, this.field1506, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method489(int arg0, Packet arg1, int arg2) {
        if (arg0 != 0) {
            this.method6();
        }
        for (int var4 = 0; var4 < this.field1500; ++var4) {
            int var5 = this.field1501[var4];
            NpcEntity var6 = this.field1364[var5];
            int var7 = arg1.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg1.method229();
                int var9 = arg1.method229();
                var6.method114(-25671, var8, var9, field1279);
                var6.field416 = field1279 + 300;
                var6.field417 = arg1.method229();
                var6.field418 = arg1.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg1.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field425 == var10) {
                    var6.field429 = 0;
                }
                int var11 = arg1.method229();
                if (var6.field425 == var10 && var10 != -1) {
                    int var12 = SeqType.field1134[var10].field1148;
                    if (var12 == 1) {
                        var6.field426 = 0;
                        var6.field427 = 0;
                        var6.field428 = var11;
                        var6.field429 = 0;
                    }
                    if (var12 == 2) {
                        var6.field429 = 0;
                    }
                } else if (var10 == -1 || var6.field425 == -1 || SeqType.field1134[var10].field1142 >= SeqType.field1134[var6.field425].field1142) {
                    var6.field425 = var10;
                    var6.field426 = 0;
                    var6.field427 = 0;
                    var6.field428 = var11;
                    var6.field429 = 0;
                    var6.field451 = var6.field446;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field419 = arg1.method231();
                if (var6.field419 == 65535) {
                    var6.field419 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field409 = arg1.method236();
                var6.field410 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg1.method229();
                int var14 = arg1.method229();
                var6.method114(-25671, var13, var14, field1279);
                var6.field416 = field1279 + 300;
                var6.field417 = arg1.method229();
                var6.field418 = arg1.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field454 = NpcType.method341(arg1.method231());
                var6.field401 = var6.field454.field1001;
                var6.field445 = var6.field454.field1023;
                var6.field404 = var6.field454.field1005;
                var6.field405 = var6.field454.field1006;
                var6.field406 = var6.field454.field1007;
                var6.field407 = var6.field454.field1008;
                var6.field402 = var6.field454.field1004;
            }
            if ((var7 & 64) == 64) {
                var6.field430 = arg1.method231();
                int var15 = arg1.method234();
                var6.field434 = var15 >> 16;
                var6.field433 = (var15 & 65535) + field1279;
                var6.field431 = 0;
                var6.field432 = 0;
                if (var6.field433 > field1279) {
                    var6.field431 = -1;
                }
                if (var6.field430 == 65535) {
                    var6.field430 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field420 = arg1.method231();
                var6.field421 = arg1.method231();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;I)V")
    public final void method490(int arg0, PathingEntity arg1, int arg2) {
        this.method491(arg1.field398, arg1.field397, arg2, 0);
        while (arg0 >= 0) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.method6();
        }
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method550(arg1, arg0, this.field1461, true) - arg2;
            int var6 = arg1 - this.field1305;
            int var7 = var5 - this.field1306;
            int var8 = arg0 - this.field1307;
            int var9 = Model.field601[this.field1308];
            int var10 = Model.field602[this.field1308];
            int var11 = Model.field601[this.field1309];
            int var12 = Model.field602[this.field1309];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1506 = (var13 << 9) / var17 + Pix3D.field638;
                this.field1507 = (var16 << 9) / var17 + Pix3D.field639;
            } else {
                this.field1506 = -1;
                this.field1507 = -1;
            }
        } else {
            this.field1506 = -1;
            this.field1507 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method492(byte arg0) {
        if (arg0 == 94) {
            if (field1294 && this.field1600 == 2 && World.field42 != this.field1461) {
                this.field1621.method258((byte) -127);
                this.field1450.method202(0, 151, 36569, 257, "Loading - please wait.");
                this.field1450.method202(16777215, 150, 36569, 256, "Loading - please wait.");
                this.field1621.method259(4, 4, (byte) 3, super.field14);
                this.field1600 = 1;
                this.field1628 = System.currentTimeMillis();
            }
            if (this.field1600 == 1) {
                int var2 = this.method493(0);
                if (var2 != 0 && System.currentTimeMillis() - this.field1628 > 360000L) {
                    signlink.reporterror(this.field1398 + " glcfb " + this.field1586 + "," + var2 + "," + field1294 + "," + this.field1232[0] + "," + this.field1549.method280() + "," + this.field1461 + "," + this.field1265 + "," + this.field1266);
                    this.field1628 = System.currentTimeMillis();
                }
            }
            if (this.field1600 == 2 && this.field1461 != this.field1437) {
                this.field1437 = this.field1461;
                this.method471(this.field1461, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)I")
    public final int method493(int arg0) {
        for (int var2 = 0; var2 < this.field1576.length; ++var2) {
            if (this.field1576[var2] == null && this.field1395[var2] != -1) {
                return -1;
            }
            if (this.field1260[var2] == null && this.field1396[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1576.length; ++var4) {
            byte[] var5 = this.field1260[var4];
            if (var5 != null) {
                int var6 = (this.field1394[var4] >> 8) * 64 - this.field1511;
                int var7 = (this.field1394[var4] & 255) * 64 - this.field1512;
                var3 &= World.method16(var7, 715, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1336) {
            return -4;
        } else {
            this.field1600 = 2;
            if (arg0 != 0) {
                this.field1558 = this.field1627.method229();
            }
            World.field42 = this.field1461;
            this.method496(true);
            this.field1416.method218((byte) 1, 218);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method494(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != 11841) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method495(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method496(boolean arg0) {
        try {
            this.field1437 = -1;
            this.field1606.method252();
            this.field1505.method252();
            Pix3D.method167((byte) 74);
            this.method529(-492);
            this.field1589.method50((byte) 58);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1596[var2].method359(true);
            }
            System.gc();
            World var3 = new World(this.field1239, 104, 104, this.field1299, -507);
            int var4 = this.field1576.length;
            World.field41 = World3D.field283;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1394[var5] >> 8;
                int var7 = this.field1394[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field41 = false;
                }
            }
            if (World.field41) {
                this.field1589.method51(this.field1461, (byte) -1);
            } else {
                this.field1589.method51(0, (byte) -1);
            }
            this.field1416.method218((byte) 1, 146);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1394[var8] >> 8) * 64 - this.field1511;
                int var10 = (this.field1394[var8] & 255) * 64 - this.field1512;
                byte[] var11 = this.field1576[var8];
                if (var11 != null) {
                    var3.method15((this.field1266 - 6) * 8, 302, var11, (this.field1265 - 6) * 8, var9, var10);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1394[var12] >> 8) * 64 - this.field1511;
                int var14 = (this.field1394[var12] & 255) * 64 - this.field1512;
                byte[] var15 = this.field1576[var12];
                if (var15 == null && this.field1266 < 800) {
                    var3.method14(var13, var14, 64, 3, 64);
                }
            }
            this.field1416.method218((byte) 1, 146);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1260[var16];
                if (var17 != null) {
                    int var18 = (this.field1394[var16] >> 8) * 64 - this.field1511;
                    int var19 = (this.field1394[var16] & 255) * 64 - this.field1512;
                    var3.method18(this.field1596, var18, 3, var17, this.field1589, var19);
                }
            }
            this.field1416.method218((byte) 1, 146);
            var3.method20(this.field1589, -994, this.field1596);
            this.field1621.method258((byte) -127);
            this.field1416.method218((byte) 1, 146);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method538(var20, var21);
                }
            }
            this.method480(-614);
        } catch (Exception var34) {
        }
        LocType.field981.method103();
        if (field1294 && signlink.cache_dat != null) {
            int var23 = this.field1549.method272(26014, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1549.method277(var24, (byte) 6);
                if ((var25 & 121) == 0) {
                    Model.method125(var24, (byte) -40);
                }
            }
        }
        System.gc();
        Pix3D.method168(false, 20);
        this.field1549.method283(487);
        int var26 = (this.field1265 - 6) / 8 - 1;
        int var27 = (this.field1265 + 6) / 8 + 1;
        int var28 = (this.field1266 - 6) / 8 - 1;
        int var29 = (this.field1266 + 6) / 8 + 1;
        this.field1337 &= arg0;
        if (this.field1476) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1549.method274(5, var30, 0, var31);
                    if (var32 != -1) {
                        this.field1549.method284(3, this.field1661, var32);
                    }
                    int var33 = this.field1549.method274(5, var30, 1, var31);
                    if (var33 != -1) {
                        this.field1549.method284(3, this.field1661, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method497(byte arg0) {
        if (arg0 != -16) {
            this.field1416.method219(56);
        }
        if (this.field1597 == 0) {
            if (super.field28 == 1) {
                int var2 = super.field29 - 25 - 550;
                int var3 = super.field30 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1303 + this.field1282 & 2047;
                    int var5 = Pix3D.field642[var4];
                    int var6 = Pix3D.field643[var4];
                    int var7 = (this.field1310 + 256) * var5 >> 8;
                    int var8 = (this.field1310 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1525.field397 + var9 >> 7;
                    int var12 = field1525.field398 - var10 >> 7;
                    boolean var13 = this.method482(1, 0, 0, 0, (byte) -114, true, field1525.field447[0], var11, 0, field1525.field448[0], 0, var12);
                    if (var13) {
                        this.field1416.method219(var2);
                        this.field1416.method219(var3);
                        this.field1416.method220(this.field1282);
                        this.field1416.method219(57);
                        this.field1416.method219(this.field1303);
                        this.field1416.method219(this.field1310);
                        this.field1416.method219(89);
                        this.field1416.method220(field1525.field397);
                        this.field1416.method220(field1525.field398);
                        this.field1416.method219(this.field1227);
                        this.field1416.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)V")
    public final void method498(int arg0, Component arg1) {
        int var3 = arg1.field79;
        int var4 = 59 / arg0;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field1240;
                if (this.field1241 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg1.field111 = "";
                    arg1.field78 = 0;
                } else {
                    if (this.field1509[var3] == 0) {
                        arg1.field111 = "@red@Offline";
                    } else if (this.field1509[var3] == field1291) {
                        arg1.field111 = "@gre@World-" + (this.field1509[var3] - 9);
                    } else {
                        arg1.field111 = "@yel@World-" + (this.field1509[var3] - 9);
                    }
                    arg1.field78 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field1240;
                if (this.field1241 != 2) {
                    var7 = 0;
                }
                arg1.field89 = var7 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1241 == 0) {
                    arg1.field111 = "Loading ignore list";
                    arg1.field78 = 0;
                } else if (var3 == 1 && this.field1241 == 0) {
                    arg1.field111 = "Please wait...";
                    arg1.field78 = 0;
                } else {
                    int var8 = this.field1611;
                    if (this.field1241 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg1.field111 = "";
                        arg1.field78 = 0;
                    } else {
                        arg1.field111 = JString.method304((byte) 8, JString.method301(this.field1649, this.field1550[var3]));
                        arg1.field78 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field89 = this.field1611 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 == 327) {
                arg1.field126 = 150;
                arg1.field127 = (int) (Math.sin((double) field1279 / 40.0D) * 256.0D) & 2047;
                if (this.field1381) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field1630[var9];
                        if (var16 >= 0 && !IdkType.field1111[var16].method377(8)) {
                            return;
                        }
                    }
                    this.field1381 = false;
                    Model[] var10 = new Model[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field1630[var12];
                        if (var15 >= 0) {
                            var10[var11++] = IdkType.field1111[var15].method378(false);
                        }
                    }
                    Model var13 = new Model(var11, -550, var10);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field1535[var14] != 0) {
                            var13.method140(field1457[var14][0], field1457[var14][this.field1535[var14]]);
                            if (var14 == 1) {
                                var13.method140(field1316[0], field1316[this.field1535[var14]]);
                            }
                        }
                    }
                    var13.method133(0);
                    var13.method134(428, SeqType.field1134[field1525.field402].field1136[0]);
                    var13.method143(64, 850, -30, -50, -30, true);
                    arg1.field119 = 5;
                    arg1.field120 = 0;
                    Component.method36(5, 0, var13, 0);
                }
            } else if (var3 == 324) {
                if (this.field1405 == null) {
                    this.field1405 = arg1.field117;
                    this.field1406 = arg1.field118;
                }
                if (this.field1242) {
                    arg1.field117 = this.field1406;
                } else {
                    arg1.field117 = this.field1405;
                }
            } else if (var3 == 325) {
                if (this.field1405 == null) {
                    this.field1405 = arg1.field117;
                    this.field1406 = arg1.field118;
                }
                if (this.field1242) {
                    arg1.field117 = this.field1405;
                } else {
                    arg1.field117 = this.field1406;
                }
            } else if (var3 == 600) {
                arg1.field111 = this.field1534;
                if (field1279 % 20 < 10) {
                    arg1.field111 = arg1.field111 + "|";
                } else {
                    arg1.field111 = arg1.field111 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1330 >= 1) {
                        if (this.field1487) {
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
                    if (this.field1482 != 0) {
                        String var17;
                        if (this.field1484 == 0) {
                            var17 = "earlier today";
                        } else if (this.field1484 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field1484 + " days ago";
                        }
                        arg1.field111 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg1.field111 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1478 == 0) {
                        arg1.field111 = "0 unread messages";
                        arg1.field113 = 16776960;
                    }
                    if (this.field1478 == 1) {
                        arg1.field111 = "1 unread message";
                        arg1.field113 = 65280;
                    }
                    if (this.field1478 > 1) {
                        arg1.field111 = this.field1478 + " unread messages";
                        arg1.field113 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1548 == 201) {
                        if (this.field1552 == 1) {
                            arg1.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1548 == 200) {
                        arg1.field111 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field1548 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field1548 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field1548 + " days ago";
                        }
                        arg1.field111 = var18 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1548 == 201) {
                        if (this.field1552 == 1) {
                            arg1.field111 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1548 == 200) {
                        arg1.field111 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field111 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1548 == 201) {
                        if (this.field1552 == 1) {
                            arg1.field111 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1548 == 200) {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1241 == 0) {
            arg1.field111 = "Loading friend list";
            arg1.field78 = 0;
        } else if (var3 == 1 && this.field1241 == 1) {
            arg1.field111 = "Connecting to friendserver";
            arg1.field78 = 0;
        } else if (var3 == 2 && this.field1241 != 2) {
            arg1.field111 = "Please wait...";
            arg1.field78 = 0;
        } else {
            int var5 = this.field1240;
            if (this.field1241 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg1.field111 = "";
                arg1.field78 = 0;
            } else {
                arg1.field111 = this.field1641[var3];
                arg1.field78 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 294);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1291 = Integer.parseInt(arg0[0]);
                field1292 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method461((byte) -12);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method499(true);
                }
                if (arg0[3].equals("free")) {
                    field1293 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1293 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1((byte) 8, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public static final void method499(boolean arg0) {
        World3D.field283 = false;
        if (!arg0) {
            field1489 = !field1489;
        }
        Pix3D.field633 = false;
        field1294 = false;
        World.field41 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method500(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1332 = "";
                this.field1333 = "Connecting to server...";
                this.method446(true, true);
            }
            this.field1262 = new ClientStream(this.method495(field1292 + 43594), this, 564);
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1416.field703 = 0;
            this.field1416.method219(14);
            this.field1416.method219(var6);
            this.field1262.method42(813, 2, this.field1416.field702, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1262.method39();
            }
            int var8 = this.field1262.method39();
            if (var8 == 0) {
                this.field1262.method41(this.field1627.field702, 0, 8);
                this.field1627.field703 = 0;
                this.field1586 = this.field1627.method235(true);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1586 >> 32), (int) this.field1586 };
                this.field1416.field703 = 0;
                this.field1416.method219(10);
                this.field1416.method223(var9[0]);
                this.field1416.method223(var9[1]);
                this.field1416.method223(var9[2]);
                this.field1416.method223(var9[3]);
                this.field1416.method223(signlink.uid);
                this.field1416.method226(arg0);
                this.field1416.method226(arg1);
                this.field1416.method244(field1544, field1438, false);
                this.field1380.field703 = 0;
                if (arg2) {
                    this.field1380.method219(18);
                } else {
                    this.field1380.method219(16);
                }
                this.field1380.method219(this.field1416.field703 + 36 + 1 + 1 + 2);
                this.field1380.method219(255);
                this.field1380.method220(294);
                this.field1380.method219(field1294 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1380.method223(this.field1234[var10]);
                }
                this.field1380.method227(this.field1416.field702, 0, this.field1300, this.field1416.field703);
                this.field1416.field707 = new Isaac(8, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1407 = new Isaac(8, var9);
                this.field1262.method42(813, this.field1380.field703, this.field1380.field702, 0);
                var8 = this.field1262.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method500(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1330 = this.field1262.method39();
                field1483 = this.field1262.method39() == 1;
                this.field1296 = 0L;
                this.field1264 = 0;
                this.field1639.field987 = 0;
                super.field19 = true;
                this.field1419 = true;
                this.field1337 = true;
                this.field1416.field703 = 0;
                this.field1627.field703 = 0;
                this.field1558 = -1;
                this.field1345 = -1;
                this.field1346 = -1;
                this.field1347 = -1;
                this.field1557 = 0;
                this.field1559 = 0;
                this.field1609 = 0;
                this.field1561 = 0;
                this.field1459 = 0;
                this.field1382 = 0;
                this.field1570 = false;
                super.field20 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1220[var12] = null;
                }
                this.field1613 = 0;
                this.field1312 = 0;
                this.field1600 = 0;
                this.field1475 = 0;
                this.field1229 = (int) (Math.random() * 100.0D) - 50;
                this.field1554 = (int) (Math.random() * 110.0D) - 55;
                this.field1653 = (int) (Math.random() * 80.0D) - 40;
                this.field1303 = (int) (Math.random() * 120.0D) - 60;
                this.field1310 = (int) (Math.random() * 30.0D) - 20;
                this.field1282 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1597 = 0;
                this.field1437 = -1;
                this.field1573 = 0;
                this.field1574 = 0;
                this.field1498 = 0;
                this.field1365 = 0;
                for (int var13 = 0; var13 < this.field1495; ++var13) {
                    this.field1497[var13] = null;
                    this.field1502[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1364[var14] = null;
                }
                field1525 = this.field1497[this.field1496] = new PlayerEntity();
                this.field1505.method252();
                this.field1606.method252();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1288[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1331 = new LinkList(18783);
                this.field1241 = 0;
                this.field1240 = 0;
                this.field1494 = -1;
                this.field1348 = -1;
                this.field1221 = -1;
                this.field1350 = -1;
                this.field1468 = -1;
                this.field1377 = false;
                this.field1456 = 3;
                this.field1342 = false;
                this.field1570 = false;
                this.field1571 = false;
                this.field1367 = null;
                this.field1562 = 0;
                this.field1659 = -1;
                this.field1242 = true;
                this.method459(-35064);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1535[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1523[var19] = null;
                    this.field1524[var19] = false;
                }
                field1541 = 0;
                field1344 = 0;
                field1374 = 0;
                field1421 = 0;
                field1670 = 0;
                field1269 = 0;
                field1235 = 0;
                field1458 = 0;
                field1290 = 0;
                field1417 = 0;
                this.method441(1);
            } else if (var8 == 3) {
                this.field1332 = "";
                this.field1333 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1332 = "Your account has been disabled.";
                this.field1333 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1332 = "Your account is already logged in.";
                this.field1333 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1332 = "RuneScape has been updated!";
                this.field1333 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1332 = "This world is full.";
                this.field1333 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1332 = "Unable to connect.";
                this.field1333 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1332 = "Login limit exceeded.";
                this.field1333 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1332 = "Unable to connect.";
                this.field1333 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1333 = "Login server rejected session.";
                this.field1333 = "Please try again.";
            } else if (var8 == 12) {
                this.field1332 = "You need a members account to login to this world.";
                this.field1333 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1332 = "Could not complete login.";
                this.field1333 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1332 = "The server is being updated.";
                this.field1333 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1337 = true;
                this.field1416.field703 = 0;
                this.field1627.field703 = 0;
                this.field1558 = -1;
                this.field1345 = -1;
                this.field1346 = -1;
                this.field1347 = -1;
                this.field1557 = 0;
                this.field1559 = 0;
                this.field1609 = 0;
                this.field1382 = 0;
                this.field1570 = false;
                this.field1628 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1332 = "Login attempts exceeded.";
                this.field1333 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1332 = "You are standing in a members-only area.";
                this.field1333 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1332 = "Invalid loginserver requested";
                this.field1333 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1332 = "No response from server";
                    this.field1333 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1332 = "Unexpected server response";
                    this.field1333 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1262.method39(); var20 >= 0; --var20) {
                    this.field1332 = "You have only just left another world";
                    this.field1333 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method446(true, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method500(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1332 = "";
            this.field1333 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIIIIIIZ)V")
    public final void method501(Component arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var10 = 53 / arg4;
        if (this.field1610) {
            this.field1537 = 32;
        } else {
            this.field1537 = 0;
        }
        this.field1610 = false;
        if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg5 && arg1 < arg5 + 16) {
            arg0.field90 -= this.field1565 * 4;
            if (arg8) {
                this.field1587 = true;
                return;
            }
        } else if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg2 + arg5 - 16 && arg1 < arg2 + arg5) {
            arg0.field90 += this.field1565 * 4;
            if (arg8) {
                this.field1587 = true;
                return;
            }
        } else {
            if (arg7 < arg6 - this.field1537 || arg7 >= arg6 + 16 + this.field1537 || arg1 < arg5 + 16 || arg1 >= arg2 + arg5 - 16 || this.field1565 <= 0) {
                return;
            }
            int var11 = (arg2 - 32) * arg2 / arg3;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg1 - arg5 - 16 - var11 / 2;
            int var13 = arg2 - 32 - var11;
            arg0.field90 = (arg3 - arg2) * var12 / var13;
            if (arg8) {
                this.field1587 = true;
            }
            this.field1610 = true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method502(boolean arg0) {
        if (this.field1561 > 0) {
            this.method445(543);
        } else {
            this.field1621.method258((byte) -127);
            this.field1450.method202(0, 144, 36569, 257, "Connection lost");
            this.field1450.method202(16777215, 143, 36569, 256, "Connection lost");
            this.field1450.method202(0, 159, 36569, 257, "Please wait - attempting to reestablish");
            this.field1450.method202(16777215, 158, 36569, 256, "Please wait - attempting to reestablish");
            this.field1621.method259(4, 4, (byte) 3, super.field14);
            this.field1597 = 0;
            if (!arg0) {
                this.field1416.method219(194);
            }
            this.field1573 = 0;
            ClientStream var2 = this.field1262;
            this.field1337 = false;
            this.method500(this.field1398, this.field1399, true);
            if (!this.field1337) {
                this.method445(543);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method503(Component arg0, int arg1) {
        if (arg1 != 567) {
            this.method6();
        }
        int var3 = arg0.field79;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1280[this.field1382] = "Remove @whi@" + arg0.field111;
                this.field1248[this.field1382] = 884;
                ++this.field1382;
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
            this.field1280[this.field1382] = "Remove @whi@" + this.field1641[var3];
            this.field1248[this.field1382] = 513;
            ++this.field1382;
            this.field1280[this.field1382] = "Message @whi@" + this.field1641[var3];
            this.field1248[this.field1382] = 902;
            ++this.field1382;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLab;III)V")
    public final void method504(byte arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (field1525 != arg1) {
            if (this.field1382 < 400) {
                String var6;
                if (arg1.field465 == 0) {
                    var6 = arg1.field458 + method451(field1525.field464, arg1.field464, (byte) 4) + " (level-" + arg1.field464 + ")";
                } else {
                    var6 = arg1.field458 + " (skill-" + arg1.field465 + ")";
                }
                if (this.field1613 == 1) {
                    this.field1280[this.field1382] = "Use " + this.field1617 + " with @whi@" + var6;
                    this.field1248[this.field1382] = 275;
                    this.field1249[this.field1382] = arg4;
                    this.field1246[this.field1382] = arg2;
                    this.field1247[this.field1382] = arg3;
                    ++this.field1382;
                } else if (this.field1312 == 1) {
                    if ((this.field1314 & 8) == 8) {
                        this.field1280[this.field1382] = this.field1315 + " @whi@" + var6;
                        this.field1248[this.field1382] = 131;
                        this.field1249[this.field1382] = arg4;
                        this.field1246[this.field1382] = arg2;
                        this.field1247[this.field1382] = arg3;
                        ++this.field1382;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1523[var7] != null) {
                            this.field1280[this.field1382] = this.field1523[var7] + " @whi@" + var6;
                            short var10 = 0;
                            if (this.field1523[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field464 > field1525.field464) {
                                    var10 = 2000;
                                }
                                if (field1525.field481 != 0 && arg1.field481 != 0) {
                                    if (field1525.field481 == arg1.field481) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field1524[var7]) {
                                var10 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1248[this.field1382] = var10 + 639;
                            }
                            if (var7 == 1) {
                                this.field1248[this.field1382] = var10 + 499;
                            }
                            if (var7 == 2) {
                                this.field1248[this.field1382] = var10 + 27;
                            }
                            if (var7 == 3) {
                                this.field1248[this.field1382] = var10 + 387;
                            }
                            if (var7 == 4) {
                                this.field1248[this.field1382] = var10 + 185;
                            }
                            this.field1249[this.field1382] = arg4;
                            this.field1246[this.field1382] = arg2;
                            this.field1247[this.field1382] = arg3;
                            ++this.field1382;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1382; ++var8) {
                    if (this.field1248[var8] == 718) {
                        this.field1280[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg0 == 4) {
                    boolean var9 = false;
                } else {
                    this.field1526 = 92;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;Z)V")
    public final void method505(Pix8 arg0, boolean arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1542.length; ++var4) {
            this.field1542[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1542[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg1) {
            field1489 = !field1489;
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
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field675; ++var8) {
                for (int var9 = 0; var9 < arg0.field674; ++var9) {
                    if (arg0.field672[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field676;
                        int var11 = var8 + 16 + arg0.field677;
                        int var12 = (var11 << 7) + var10;
                        this.field1542[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method506(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.method429((byte) 4);
        if (this.field1466 == 1) {
            this.field1592[this.field1465 / 100].method186(this.field1463 - 8 - 4, this.field1464 - 8 - 4, false);
        }
        if (this.field1466 == 2) {
            this.field1592[this.field1465 / 100 + 4].method186(this.field1463 - 8 - 4, this.field1464 - 8 - 4, false);
            ++field1580;
            if (field1580 > 57) {
                field1580 = 0;
                this.field1416.method218((byte) 1, 254);
            }
        }
        if (this.field1468 != -1) {
            this.method545(this.field1215, this.field1468, this.field1536);
            this.method535(0, 0, Component.field70[this.field1468], 0, (byte) 0);
        }
        if (this.field1221 != -1) {
            this.method545(this.field1215, this.field1221, this.field1536);
            this.method535(0, 0, Component.field70[this.field1221], 0, (byte) 0);
        }
        this.method466(4);
        if (!this.field1570) {
            this.method510(-19355);
            this.method558((byte) 1);
        } else if (this.field1253 == 0) {
            this.method562(711);
        }
        if (this.field1562 == 1) {
            this.field1404[1].method186(472, 296, false);
        }
        if (field1267) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field10 < 15) {
                var5 = 16711680;
            }
            this.field1450.method201(var5, "Fps:" + super.field10, var4, 667, var3);
            int var13 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field1294) {
                int var9 = 16711680;
            }
            this.field1450.method201(16776960, "Mem:" + var7 + "k", var13, 667, var3);
            var13 += 15;
        }
        if (this.field1609 != 0) {
            int var10 = this.field1609 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field1450.method206(-49546, "System update in: " + var11 + ":0" + var12, 16776960, 4, 329);
            } else {
                this.field1450.method206(-49546, "System update in: " + var11 + ":" + var12, 16776960, 4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method507(int arg0, boolean arg1) {
        if (field1525.field397 >> 7 == this.field1573 && field1525.field398 >> 7 == this.field1574) {
            this.field1573 = 0;
            ++field1298;
            if (field1298 > 122) {
                field1298 = 0;
                this.field1416.method218((byte) 1, 174);
                this.field1416.method219(62);
            }
        }
        int var3 = this.field1498;
        int var4 = 72 / arg0;
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            PlayerEntity var6;
            int var7;
            if (arg1) {
                var6 = field1525;
                var7 = this.field1496 << 14;
            } else {
                var6 = this.field1497[this.field1499[var5]];
                var7 = this.field1499[var5] << 14;
            }
            if (var6 != null && var6.method113(false)) {
                var6.field478 = false;
                if ((field1294 && this.field1498 > 50 || this.field1498 > 200) && !arg1 && var6.field422 == var6.field402) {
                    var6.field478 = true;
                }
                int var8 = var6.field397 >> 7;
                int var9 = var6.field398 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field473 != null && field1279 >= var6.field468 && field1279 < var6.field469) {
                        var6.field478 = false;
                        var6.field467 = this.method550(var6.field397, var6.field398, this.field1461, true);
                        this.field1589.method62(var6.field467, var6.field397, var6.field477, var6.field474, var7, this.field1461, var6.field398, var6, var6.field399, var6.field475, var6.field476, 60, this.field1261);
                    } else {
                        if ((var6.field397 & 127) == 64 && (var6.field398 & 127) == 64) {
                            if (this.field1551[var8][var9] == this.field1356) {
                                continue;
                            }
                            this.field1551[var8][var9] = this.field1356;
                        }
                        var6.field467 = this.method550(var6.field397, var6.field398, this.field1461, true);
                        this.field1589.method61(60, this.field1461, -346, var6.field398, var7, var6, var6.field467, var6.field397, var6.field399, var6.field400);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        Graphics var2 = this.method11(7).getGraphics();
        var2.setColor(Color.black);
        if (arg0) {
            this.field1416.method219(237);
        }
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, (byte) 9);
        if (this.field1335) {
            this.field1553 = false;
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
        if (this.field1590) {
            this.field1553 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1605) {
            this.field1553 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method509(int arg0, int arg1, Packet arg2) {
        if (arg0 > 0) {
            while (arg2.field704 + 10 < arg1 * 8) {
                int var4 = arg2.method240(-703, 11);
                if (var4 == 2047) {
                    break;
                }
                if (this.field1497[var4] == null) {
                    this.field1497[var4] = new PlayerEntity();
                    if (this.field1502[var4] != null) {
                        this.field1497[var4].method116(0, this.field1502[var4]);
                    }
                }
                this.field1499[this.field1498++] = var4;
                PlayerEntity var5 = this.field1497[var4];
                var5.field442 = field1279;
                int var6 = arg2.method240(-703, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method240(-703, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg2.method240(-703, 1);
                var5.method110(var8 == 1, field1525.field447[0] + var6, field1525.field448[0] + var7, field1489);
                int var9 = arg2.method240(-703, 1);
                if (var9 == 1) {
                    this.field1501[this.field1500++] = var4;
                }
            }
            arg2.method241(-29885);
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method510(int arg0) {
        if (this.field1529 == 0) {
            this.field1280[0] = "Cancel";
            this.field1248[0] = 1106;
            this.field1382 = 1;
            if (arg0 != -19355) {
                this.field1558 = -1;
            }
            this.method435(0);
            this.field1481 = 0;
            if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                if (this.field1221 != -1) {
                    this.method530(4, 4, Component.field70[this.field1221], super.field23, 0, 0, super.field22);
                } else {
                    this.method477((byte) 9);
                }
            }
            if (this.field1481 != this.field1393) {
                this.field1393 = this.field1481;
            }
            this.field1481 = 0;
            if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                if (this.field1350 != -1) {
                    this.method530(553, 205, Component.field70[this.field1350], super.field23, 0, 0, super.field22);
                } else if (this.field1644[this.field1456] != -1) {
                    this.method530(553, 205, Component.field70[this.field1644[this.field1456]], super.field23, 0, 0, super.field22);
                }
            }
            if (this.field1481 != this.field1378) {
                this.field1587 = true;
                this.field1378 = this.field1481;
            }
            this.field1481 = 0;
            if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                if (this.field1348 != -1) {
                    this.method530(17, 357, Component.field70[this.field1348], super.field23, 0, 0, super.field22);
                } else if (super.field23 < 434 && super.field22 < 426) {
                    this.method547(super.field23 - 357, 6, super.field22 - 17);
                }
            }
            if (this.field1348 != -1 && this.field1658 != this.field1481) {
                this.field1563 = true;
                this.field1658 = this.field1481;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1382 - 1; ++var3) {
                    if (this.field1248[var3] < 1000 && this.field1248[var3 + 1] > 1000) {
                        String var4 = this.field1280[var3];
                        this.field1280[var3] = this.field1280[var3 + 1];
                        this.field1280[var3 + 1] = var4;
                        int var5 = this.field1248[var3];
                        this.field1248[var3] = this.field1248[var3 + 1];
                        this.field1248[var3 + 1] = var5;
                        int var6 = this.field1246[var3];
                        this.field1246[var3] = this.field1246[var3 + 1];
                        this.field1246[var3 + 1] = var6;
                        int var7 = this.field1247[var3];
                        this.field1247[var3] = this.field1247[var3 + 1];
                        this.field1247[var3 + 1] = var7;
                        int var8 = this.field1249[var3];
                        this.field1249[var3] = this.field1249[var3 + 1];
                        this.field1249[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method511(long arg0, boolean arg1) {
        if (arg1) {
            this.field1558 = this.field1627.method229();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1611; ++var4) {
                if (this.field1550[var4] == arg0) {
                    --this.field1611;
                    this.field1587 = true;
                    for (int var5 = var4; var5 < this.field1611; ++var5) {
                        this.field1550[var5] = this.field1550[var5 + 1];
                    }
                    this.field1416.method218((byte) 1, 228);
                    this.field1416.method225(arg0, field1629);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 9 || arg2 > 9) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg1 >= 1 && arg0 >= 1 && arg1 <= 102 && arg0 <= 102) {
            if (field1294 && this.field1461 != arg5) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg3 == 0) {
                var10 = this.field1589.method76(arg5, arg1, arg0);
            }
            if (arg3 == 1) {
                var10 = this.field1589.method77(arg1, arg0, 29542, arg5);
            }
            if (arg3 == 2) {
                var10 = this.field1589.method78(arg5, arg1, arg0);
            }
            if (arg3 == 3) {
                var10 = this.field1589.method79(arg5, arg1, arg0);
            }
            if (var10 != 0) {
                int var14 = this.field1589.method80(arg5, arg1, arg0, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg3 == 0) {
                    this.field1589.method67(arg1, arg0, (byte) 3, arg5);
                    LocType var18 = LocType.method330(var15);
                    if (var18.field953) {
                        this.field1596[arg5].method364(var18.field954, var17, arg0, (byte) 9, arg1, var16);
                    }
                }
                if (arg3 == 1) {
                    this.field1589.method68(arg5, arg1, false, arg0);
                }
                if (arg3 == 2) {
                    this.field1589.method69(arg1, 203, arg5, arg0);
                    LocType var19 = LocType.method330(var15);
                    if (var19.field951 + arg1 > 103 || var19.field951 + arg0 > 103 || var19.field952 + arg1 > 103 || var19.field952 + arg0 > 103) {
                        return;
                    }
                    if (var19.field953) {
                        this.field1596[arg5].method365(var19.field954, arg1, var19.field951, var17, var19.field952, arg0, 9);
                    }
                }
                if (arg3 == 3) {
                    this.field1589.method70(arg5, arg0, true, arg1);
                    LocType var20 = LocType.method330(var15);
                    if (var20.field953 && var20.field955) {
                        this.field1596[arg5].method367(arg0, arg1, 7);
                    }
                }
            }
            if (arg7 >= 0) {
                int var21 = arg5;
                if (arg5 < 3 && (this.field1239[1][arg1][arg0] & 2) == 2) {
                    var21 = arg5 + 1;
                }
                World.method31(arg0, arg4, arg5, this.field1589, var21, -600, this.field1596[arg5], this.field1299, arg6, arg7, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method513(int arg0) {
        if (arg0 != 8) {
            field1640 = -336;
        }
        for (int var2 = -1; var2 < this.field1498; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1496;
            } else {
                var6 = this.field1499[var2];
            }
            PlayerEntity var7 = this.field1497[var6];
            if (var7 != null && var7.field410 > 0) {
                --var7.field410;
                if (var7.field410 == 0) {
                    var7.field409 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1365; ++var3) {
            int var4 = this.field1366[var3];
            NpcEntity var5 = this.field1364[var4];
            if (var5 != null && var5.field410 > 0) {
                --var5.field410;
                if (var5.field410 == 0) {
                    var5.field409 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method514(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method240(-703, 8);
        int var5 = 65 / arg2;
        if (var4 < this.field1498) {
            for (int var6 = var4; var6 < this.field1498; ++var6) {
                this.field1473[this.field1472++] = this.field1499[var6];
            }
        }
        if (var4 > this.field1498) {
            signlink.reporterror(this.field1398 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1498 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1499[var7];
                PlayerEntity var9 = this.field1497[var8];
                int var10 = arg1.method240(-703, 1);
                if (var10 == 0) {
                    this.field1499[this.field1498++] = var8;
                    var9.field442 = field1279;
                } else {
                    int var11 = arg1.method240(-703, 2);
                    if (var11 == 0) {
                        this.field1499[this.field1498++] = var8;
                        var9.field442 = field1279;
                        this.field1501[this.field1500++] = var8;
                    } else if (var11 == 1) {
                        this.field1499[this.field1498++] = var8;
                        var9.field442 = field1279;
                        int var12 = arg1.method240(-703, 3);
                        var9.method111(5, var12, false);
                        int var13 = arg1.method240(-703, 1);
                        if (var13 == 1) {
                            this.field1501[this.field1500++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1499[this.field1498++] = var8;
                        var9.field442 = field1279;
                        int var14 = arg1.method240(-703, 3);
                        var9.method111(5, var14, true);
                        int var15 = arg1.method240(-703, 3);
                        var9.method111(5, var15, true);
                        int var16 = arg1.method240(-703, 1);
                        if (var16 == 1) {
                            this.field1501[this.field1500++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1473[this.field1472++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method515(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < this.field1365; ++var3) {
            int var4 = this.field1366[var3];
            NpcEntity var5 = this.field1364[var4];
            if (var5 != null) {
                this.method516(var5.field454.field1001, -286, var5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILy;)V")
    public final void method516(int arg0, int arg1, PathingEntity arg2) {
        while (arg1 >= 0) {
            this.field1519 = !this.field1519;
        }
        if (arg2.field397 < 128 || arg2.field398 < 128 || arg2.field397 >= 13184 || arg2.field398 >= 13184) {
            arg2.field425 = -1;
            arg2.field430 = -1;
            arg2.field439 = 0;
            arg2.field440 = 0;
            arg2.field397 = arg2.field447[0] * 128 + arg2.field401 * 64;
            arg2.field398 = arg2.field448[0] * 128 + arg2.field401 * 64;
            arg2.method112(-39893);
        }
        if (field1525 == arg2 && (arg2.field397 < 1536 || arg2.field398 < 1536 || arg2.field397 >= 11776 || arg2.field398 >= 11776)) {
            arg2.field425 = -1;
            arg2.field430 = -1;
            arg2.field439 = 0;
            arg2.field440 = 0;
            arg2.field397 = arg2.field447[0] * 128 + arg2.field401 * 64;
            arg2.field398 = arg2.field448[0] * 128 + arg2.field401 * 64;
            arg2.method112(-39893);
        }
        if (arg2.field439 > field1279) {
            this.method517(arg2, true);
        } else if (arg2.field440 >= field1279) {
            this.method518(arg2, (byte) -39);
        } else {
            this.method519(false, arg2);
        }
        this.method520(false, arg2);
        this.method521(arg2, false);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method517(PathingEntity arg0, boolean arg1) {
        int var3 = arg0.field439 - field1279;
        int var4 = arg0.field435 * 128 + arg0.field401 * 64;
        int var5 = arg0.field437 * 128 + arg0.field401 * 64;
        arg0.field397 += (var4 - arg0.field397) / var3;
        arg0.field398 += (var5 - arg0.field398) / var3;
        arg0.field450 = 0;
        if (!arg1) {
            field1391 = this.field1407.method295();
        }
        if (arg0.field441 == 0) {
            arg0.field444 = 1024;
        }
        if (arg0.field441 == 1) {
            arg0.field444 = 1536;
        }
        if (arg0.field441 == 2) {
            arg0.field444 = 0;
        }
        if (arg0.field441 == 3) {
            arg0.field444 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;B)V")
    public final void method518(PathingEntity arg0, byte arg1) {
        if (arg1 != -39) {
            this.field1375 = this.field1407.method295();
        }
        if (field1279 == arg0.field440 || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > SeqType.field1134[arg0.field425].method382(36967, arg0.field426)) {
            int var3 = arg0.field440 - arg0.field439;
            int var4 = field1279 - arg0.field439;
            int var5 = arg0.field435 * 128 + arg0.field401 * 64;
            int var6 = arg0.field437 * 128 + arg0.field401 * 64;
            int var7 = arg0.field436 * 128 + arg0.field401 * 64;
            int var8 = arg0.field438 * 128 + arg0.field401 * 64;
            arg0.field397 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field398 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field450 = 0;
        if (arg0.field441 == 0) {
            arg0.field444 = 1024;
        }
        if (arg0.field441 == 1) {
            arg0.field444 = 1536;
        }
        if (arg0.field441 == 2) {
            arg0.field444 = 0;
        }
        if (arg0.field441 == 3) {
            arg0.field444 = 512;
        }
        arg0.field399 = arg0.field444;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLy;)V")
    public final void method519(boolean arg0, PathingEntity arg1) {
        arg1.field422 = arg1.field402;
        if (arg1.field446 == 0) {
            arg1.field450 = 0;
        } else {
            if (arg1.field425 != -1 && arg1.field428 == 0) {
                SeqType var3 = SeqType.field1134[arg1.field425];
                if (arg1.field451 > 0 && var3.field1146 == 0) {
                    ++arg1.field450;
                    return;
                }
                if (arg1.field451 <= 0 && var3.field1147 == 0) {
                    ++arg1.field450;
                    return;
                }
            }
            int var4 = arg1.field397;
            int var5 = arg1.field398;
            int var6 = arg1.field447[arg1.field446 - 1] * 128 + arg1.field401 * 64;
            int var7 = arg1.field448[arg1.field446 - 1] * 128 + arg1.field401 * 64;
            if (arg0) {
                this.field1288 = null;
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field444 = 1280;
                    } else if (var5 > var7) {
                        arg1.field444 = 1792;
                    } else {
                        arg1.field444 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field444 = 768;
                    } else if (var5 > var7) {
                        arg1.field444 = 256;
                    } else {
                        arg1.field444 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field444 = 1024;
                } else {
                    arg1.field444 = 0;
                }
                int var8 = arg1.field444 - arg1.field399 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field405;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field404;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field407;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field406;
                }
                if (var9 == -1) {
                    var9 = arg1.field404;
                }
                arg1.field422 = var9;
                int var10 = 4;
                if (arg1.field444 != arg1.field399 && arg1.field419 == -1 && arg1.field445 != 0) {
                    var10 = 2;
                }
                if (arg1.field446 > 2) {
                    var10 = 6;
                }
                if (arg1.field446 > 3) {
                    var10 = 8;
                }
                if (arg1.field450 > 0 && arg1.field446 > 1) {
                    var10 = 8;
                    --arg1.field450;
                }
                if (arg1.field449[arg1.field446 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field422 == arg1.field404 && arg1.field408 != -1) {
                    arg1.field422 = arg1.field408;
                }
                if (var4 < var6) {
                    arg1.field397 += var10;
                    if (arg1.field397 > var6) {
                        arg1.field397 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field397 -= var10;
                    if (arg1.field397 < var6) {
                        arg1.field397 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field398 += var10;
                    if (arg1.field398 > var7) {
                        arg1.field398 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field398 -= var10;
                    if (arg1.field398 < var7) {
                        arg1.field398 = var7;
                    }
                }
                if (arg1.field397 == var6 && arg1.field398 == var7) {
                    --arg1.field446;
                    if (arg1.field451 > 0) {
                        --arg1.field451;
                        return;
                    }
                }
            } else {
                arg1.field397 = var6;
                arg1.field398 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLy;)V")
    public final void method520(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            this.field1558 = this.field1627.method229();
        }
        if (arg1.field445 != 0) {
            if (arg1.field419 != -1 && arg1.field419 < 32768) {
                NpcEntity var3 = this.field1364[arg1.field419];
                if (var3 != null) {
                    int var4 = arg1.field397 - var3.field397;
                    int var5 = arg1.field398 - var3.field398;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field444 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field419 >= 32768) {
                int var6 = arg1.field419 - 32768;
                if (this.field1462 == var6) {
                    var6 = this.field1496;
                }
                PlayerEntity var7 = this.field1497[var6];
                if (var7 != null) {
                    int var8 = arg1.field397 - var7.field397;
                    int var9 = arg1.field398 - var7.field398;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field444 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field420 != 0 || arg1.field421 != 0) && (arg1.field446 == 0 || arg1.field450 > 0)) {
                int var10 = arg1.field397 - (arg1.field420 - this.field1511 - this.field1511) * 64;
                int var11 = arg1.field398 - (arg1.field421 - this.field1512 - this.field1512) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field444 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field420 = 0;
                arg1.field421 = 0;
            }
            int var12 = arg1.field444 - arg1.field399 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field445 && var12 <= 2048 - arg1.field445) {
                    if (var12 > 1024) {
                        arg1.field399 -= arg1.field445;
                    } else {
                        arg1.field399 += arg1.field445;
                    }
                } else {
                    arg1.field399 = arg1.field444;
                }
                arg1.field399 &= 2047;
                if (arg1.field422 == arg1.field402 && arg1.field444 != arg1.field399) {
                    if (arg1.field403 != -1) {
                        arg1.field422 = arg1.field403;
                        return;
                    }
                    arg1.field422 = arg1.field404;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;Z)V")
    public final void method521(PathingEntity arg0, boolean arg1) {
        if (!arg1) {
            arg0.field400 = false;
            if (arg0.field422 != -1) {
                SeqType var3 = SeqType.field1134[arg0.field422];
                ++arg0.field424;
                if (arg0.field423 < var3.field1135 && arg0.field424 > var3.method382(36967, arg0.field423)) {
                    arg0.field424 = 0;
                    ++arg0.field423;
                }
                if (arg0.field423 >= var3.field1135) {
                    arg0.field424 = 0;
                    arg0.field423 = 0;
                }
            }
            if (arg0.field430 != -1 && field1279 >= arg0.field433) {
                if (arg0.field431 < 0) {
                    arg0.field431 = 0;
                }
                SeqType var4 = SpotAnimType.field1157[arg0.field430].field1161;
                ++arg0.field432;
                while (arg0.field431 < var4.field1135 && arg0.field432 > var4.method382(36967, arg0.field431)) {
                    arg0.field432 -= var4.method382(36967, arg0.field431);
                    ++arg0.field431;
                }
                if (arg0.field431 >= var4.field1135 && (arg0.field431 < 0 || arg0.field431 >= var4.field1135)) {
                    arg0.field430 = -1;
                }
            }
            if (arg0.field425 != -1 && arg0.field428 <= 1) {
                SeqType var5 = SeqType.field1134[arg0.field425];
                if (var5.field1146 == 1 && arg0.field451 > 0 && arg0.field439 <= field1279 && arg0.field440 < field1279) {
                    arg0.field428 = 1;
                    return;
                }
            }
            if (arg0.field425 != -1 && arg0.field428 == 0) {
                SeqType var6 = SeqType.field1134[arg0.field425];
                ++arg0.field427;
                while (arg0.field426 < var6.field1135 && arg0.field427 > var6.method382(36967, arg0.field426)) {
                    arg0.field427 -= var6.method382(36967, arg0.field426);
                    ++arg0.field426;
                }
                if (arg0.field426 >= var6.field1135) {
                    arg0.field426 -= var6.field1139;
                    ++arg0.field429;
                    if (arg0.field429 >= var6.field1145) {
                        arg0.field425 = -1;
                    }
                    if (arg0.field426 < 0 || arg0.field426 >= var6.field1135) {
                        arg0.field425 = -1;
                    }
                }
                arg0.field400 = var6.field1141;
            }
            if (arg0.field428 > 0) {
                --arg0.field428;
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method522(int arg0) {
        if (this.field1470) {
            this.field1470 = false;
            this.field1321.method259(0, 4, (byte) 3, super.field14);
            this.field1322.method259(0, 357, (byte) 3, super.field14);
            this.field1323.method259(722, 4, (byte) 3, super.field14);
            this.field1324.method259(743, 205, (byte) 3, super.field14);
            this.field1325.method259(0, 0, (byte) 3, super.field14);
            this.field1326.method259(516, 4, (byte) 3, super.field14);
            this.field1327.method259(516, 205, (byte) 3, super.field14);
            this.field1328.method259(496, 357, (byte) 3, super.field14);
            this.field1329.method259(0, 338, (byte) 3, super.field14);
            this.field1587 = true;
            this.field1563 = true;
            this.field1371 = true;
            this.field1539 = true;
            if (this.field1600 != 2) {
                this.field1621.method259(4, 4, (byte) 3, super.field14);
                this.field1620.method259(550, 4, (byte) 3, super.field14);
            }
        }
        if (this.field1600 == 2) {
            this.method544(0);
        }
        if (this.field1570 && this.field1253 == 1) {
            this.field1587 = true;
        }
        if (this.field1350 != -1) {
            boolean var2 = this.method545(this.field1215, this.field1350, this.field1536);
            if (var2) {
                this.field1587 = true;
            }
        }
        if (this.field1493 == 2) {
            this.field1587 = true;
        }
        if (this.field1529 == 2) {
            this.field1587 = true;
        }
        if (this.field1587) {
            this.method553(false);
            this.field1587 = false;
        }
        if (this.field1348 == -1) {
            this.field1238.field90 = this.field1517 - this.field1652 - 77;
            if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                this.method501(this.field1238, super.field23 - 357, 77, this.field1517, 285, 0, 463, super.field22 - 17, false);
            }
            int var3 = this.field1517 - 77 - this.field1238.field90;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1517 - 77) {
                var3 = this.field1517 - 77;
            }
            if (this.field1652 != var3) {
                this.field1652 = var3;
                this.field1563 = true;
            }
        }
        if (this.field1348 != -1) {
            boolean var4 = this.method545(this.field1215, this.field1348, this.field1536);
            if (var4) {
                this.field1563 = true;
            }
        }
        if (this.field1493 == 3) {
            this.field1563 = true;
        }
        if (this.field1529 == 3) {
            this.field1563 = true;
        }
        if (this.field1367 != null) {
            this.field1563 = true;
        }
        if (this.field1570 && this.field1253 == 2) {
            this.field1563 = true;
        }
        if (this.field1563) {
            this.method439(true);
            this.field1563 = false;
        }
        if (this.field1600 == 2) {
            this.method523(this.field1297);
            this.field1620.method259(550, 4, (byte) 3, super.field14);
        }
        if (this.field1659 != -1) {
            this.field1371 = true;
        }
        if (this.field1371) {
            if (this.field1659 != -1 && this.field1659 == this.field1456) {
                this.field1659 = -1;
                this.field1416.method218((byte) 1, 53);
                this.field1416.method219(this.field1456);
            }
            this.field1371 = false;
            this.field1584.method258((byte) -127);
            this.field1341.method199(0, 0, false);
            if (this.field1350 == -1) {
                if (this.field1644[this.field1456] != -1) {
                    if (this.field1456 == 0) {
                        this.field1424.method199(22, 10, false);
                    }
                    if (this.field1456 == 1) {
                        this.field1425.method199(54, 8, false);
                    }
                    if (this.field1456 == 2) {
                        this.field1425.method199(82, 8, false);
                    }
                    if (this.field1456 == 3) {
                        this.field1426.method199(110, 8, false);
                    }
                    if (this.field1456 == 4) {
                        this.field1428.method199(153, 8, false);
                    }
                    if (this.field1456 == 5) {
                        this.field1428.method199(181, 8, false);
                    }
                    if (this.field1456 == 6) {
                        this.field1427.method199(209, 9, false);
                    }
                }
                if (this.field1644[0] != -1 && (this.field1659 != 0 || field1279 % 20 < 10)) {
                    this.field1353[0].method199(29, 13, false);
                }
                if (this.field1644[1] != -1 && (this.field1659 != 1 || field1279 % 20 < 10)) {
                    this.field1353[1].method199(53, 11, false);
                }
                if (this.field1644[2] != -1 && (this.field1659 != 2 || field1279 % 20 < 10)) {
                    this.field1353[2].method199(82, 11, false);
                }
                if (this.field1644[3] != -1 && (this.field1659 != 3 || field1279 % 20 < 10)) {
                    this.field1353[3].method199(115, 12, false);
                }
                if (this.field1644[4] != -1 && (this.field1659 != 4 || field1279 % 20 < 10)) {
                    this.field1353[4].method199(153, 13, false);
                }
                if (this.field1644[5] != -1 && (this.field1659 != 5 || field1279 % 20 < 10)) {
                    this.field1353[5].method199(180, 11, false);
                }
                if (this.field1644[6] != -1 && (this.field1659 != 6 || field1279 % 20 < 10)) {
                    this.field1353[6].method199(208, 13, false);
                }
            }
            this.field1584.method259(516, 160, (byte) 3, super.field14);
            this.field1583.method258((byte) -127);
            this.field1340.method199(0, 0, false);
            if (this.field1350 == -1) {
                if (this.field1644[this.field1456] != -1) {
                    if (this.field1456 == 7) {
                        this.field1662.method199(42, 0, false);
                    }
                    if (this.field1456 == 8) {
                        this.field1663.method199(74, 0, false);
                    }
                    if (this.field1456 == 9) {
                        this.field1663.method199(102, 0, false);
                    }
                    if (this.field1456 == 10) {
                        this.field1664.method199(130, 1, false);
                    }
                    if (this.field1456 == 11) {
                        this.field1666.method199(173, 0, false);
                    }
                    if (this.field1456 == 12) {
                        this.field1666.method199(201, 0, false);
                    }
                    if (this.field1456 == 13) {
                        this.field1665.method199(229, 0, false);
                    }
                }
                if (this.field1644[8] != -1 && (this.field1659 != 8 || field1279 % 20 < 10)) {
                    this.field1353[7].method199(74, 2, false);
                }
                if (this.field1644[9] != -1 && (this.field1659 != 9 || field1279 % 20 < 10)) {
                    this.field1353[8].method199(102, 3, false);
                }
                if (this.field1644[10] != -1 && (this.field1659 != 10 || field1279 % 20 < 10)) {
                    this.field1353[9].method199(137, 4, false);
                }
                if (this.field1644[11] != -1 && (this.field1659 != 11 || field1279 % 20 < 10)) {
                    this.field1353[10].method199(174, 2, false);
                }
                if (this.field1644[12] != -1 && (this.field1659 != 12 || field1279 % 20 < 10)) {
                    this.field1353[11].method199(201, 2, false);
                }
                if (this.field1644[13] != -1 && (this.field1659 != 13 || field1279 % 20 < 10)) {
                    this.field1353[12].method199(226, 2, false);
                }
            }
            this.field1583.method259(496, 466, (byte) 3, super.field14);
            this.field1621.method258((byte) -127);
        }
        if (this.field1539) {
            this.field1539 = false;
            this.field1582.method258((byte) -127);
            this.field1339.method199(0, 0, false);
            this.field1450.method203(55, 0, true, 28, 16777215, "Public chat");
            if (this.field1334 == 0) {
                this.field1450.method203(55, 0, true, 41, 65280, "On");
            }
            if (this.field1334 == 1) {
                this.field1450.method203(55, 0, true, 41, 16776960, "Friends");
            }
            if (this.field1334 == 2) {
                this.field1450.method203(55, 0, true, 41, 16711680, "Off");
            }
            if (this.field1334 == 3) {
                this.field1450.method203(55, 0, true, 41, 65535, "Hide");
            }
            this.field1450.method203(184, 0, true, 28, 16777215, "Private chat");
            if (this.field1612 == 0) {
                this.field1450.method203(184, 0, true, 41, 65280, "On");
            }
            if (this.field1612 == 1) {
                this.field1450.method203(184, 0, true, 41, 16776960, "Friends");
            }
            if (this.field1612 == 2) {
                this.field1450.method203(184, 0, true, 41, 16711680, "Off");
            }
            this.field1450.method203(324, 0, true, 28, 16777215, "Trade/compete");
            if (this.field1460 == 0) {
                this.field1450.method203(324, 0, true, 41, 65280, "On");
            }
            if (this.field1460 == 1) {
                this.field1450.method203(324, 0, true, 41, 16776960, "Friends");
            }
            if (this.field1460 == 2) {
                this.field1450.method203(324, 0, true, 41, 16711680, "Off");
            }
            this.field1450.method203(458, 0, true, 33, 16777215, "Report abuse");
            this.field1582.method259(0, 453, (byte) 3, super.field14);
            this.field1621.method258((byte) -127);
        }
        this.field1215 = 0;
        if (arg0 == 14998) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        if (!arg0) {
            this.field1416.method219(198);
        }
        this.field1470 = true;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method523(byte arg0) {
        this.field1620.method258((byte) -127);
        if (this.field1597 == 2) {
            byte[] var2 = this.field1319.field672;
            int[] var3 = Pix2D.field620;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1486.method190(this.field1591, this.field1532, this.field1282, 0, 256, 33, false, 0, 25, 25, 33);
            this.field1621.method258((byte) -127);
        } else {
            int var6 = this.field1303 + this.field1282 & 2047;
            int var7 = field1525.field397 / 32 + 48;
            int var8 = 464 - field1525.field398 / 32;
            this.field1575.method190(this.field1236, this.field1556, var6, 5, this.field1310 + 256, 146, false, 25, var7, var8, 151);
            if (arg0 == 4) {
                boolean var9 = false;
            } else {
                this.field1577 = this.field1407.method295();
            }
            this.field1486.method190(this.field1591, this.field1532, this.field1282, 0, 256, 33, false, 0, 25, 25, 33);
            for (int var10 = 0; var10 < this.field1567; ++var10) {
                int var39 = this.field1568[var10] * 4 + 2 - field1525.field397 / 32;
                int var40 = this.field1569[var10] * 4 + 2 - field1525.field398 / 32;
                this.method543(this.field1660, var40, this.field1362[var10], var39);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    LinkList var36 = this.field1288[this.field1461][var11][var35];
                    if (var36 != null) {
                        int var37 = var11 * 4 + 2 - field1525.field397 / 32;
                        int var38 = var35 * 4 + 2 - field1525.field398 / 32;
                        this.method543(this.field1660, var38, this.field1631, var37);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1365; ++var12) {
                NpcEntity var31 = this.field1364[this.field1366[var12]];
                if (var31 != null && var31.method113(false)) {
                    NpcType var32 = var31.field454;
                    if (var32.field1024 != null) {
                        var32 = var32.method345(0);
                    }
                    if (var32 != null && var32.field1015) {
                        int var33 = var31.field397 / 32 - field1525.field397 / 32;
                        int var34 = var31.field398 / 32 - field1525.field398 / 32;
                        this.method543(this.field1660, var34, this.field1632, var33);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field1498; ++var13) {
                PlayerEntity var24 = this.field1497[this.field1499[var13]];
                if (var24 != null && var24.method113(false)) {
                    int var25 = var24.field397 / 32 - field1525.field397 / 32;
                    int var26 = var24.field398 / 32 - field1525.field398 / 32;
                    boolean var27 = false;
                    long var28 = JString.method300(var24.field458);
                    for (int var30 = 0; var30 < this.field1240; ++var30) {
                        if (this.field1604[var30] == var28 && this.field1509[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    if (field1525.field481 != 0 && var24.field481 != 0) {
                        if (field1525.field481 == var24.field481) {
                            var27 = true;
                        } else {
                            var27 = false;
                        }
                    }
                    if (var27) {
                        this.method543(this.field1660, var26, this.field1634, var25);
                    } else {
                        this.method543(this.field1660, var26, this.field1633, var25);
                    }
                }
            }
            if (this.field1459 != 0 && field1279 % 20 < 10) {
                if (this.field1459 == 1 && this.field1623 >= 0 && this.field1623 < this.field1364.length) {
                    NpcEntity var14 = this.field1364[this.field1623];
                    if (var14 != null) {
                        int var15 = var14.field397 / 32 - field1525.field397 / 32;
                        int var16 = var14.field398 / 32 - field1525.field398 / 32;
                        this.method450(this.field1401, var16, (byte) 2, var15);
                    }
                }
                if (this.field1459 == 2) {
                    int var17 = (this.field1410 - this.field1511) * 4 + 2 - field1525.field397 / 32;
                    int var18 = (this.field1411 - this.field1512) * 4 + 2 - field1525.field398 / 32;
                    this.method450(this.field1401, var18, (byte) 2, var17);
                }
                if (this.field1459 == 10 && this.field1287 >= 0 && this.field1287 < this.field1497.length) {
                    PlayerEntity var19 = this.field1497[this.field1287];
                    if (var19 != null) {
                        int var20 = var19.field397 / 32 - field1525.field397 / 32;
                        int var21 = var19.field398 / 32 - field1525.field398 / 32;
                        this.method450(this.field1401, var21, (byte) 2, var20);
                    }
                }
            }
            if (this.field1573 != 0) {
                int var22 = this.field1573 * 4 + 2 - field1525.field397 / 32;
                int var23 = this.field1574 * 4 + 2 - field1525.field398 / 32;
                this.method543(this.field1660, var23, this.field1400, var22);
            }
            Pix2D.method157(97, 3, 4, 16777215, 3, 78);
            this.field1621.method258((byte) -127);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method524(byte arg0) {
        for (int var2 = -1; var2 < this.field1498; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1496;
            } else {
                var3 = this.field1499[var2];
            }
            PlayerEntity var4 = this.field1497[var3];
            if (var4 != null) {
                this.method516(1, -286, var4);
            }
        }
        if (arg0 != 123) {
            this.field1558 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Z")
    public final boolean method525(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1248[arg1];
            if (arg0 >= 0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLnb;)V")
    private final void method526(byte arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field722 == 0) {
            var3 = this.field1589.method76(arg1.field721, arg1.field723, arg1.field724);
        }
        if (arg1.field722 == 1) {
            var3 = this.field1589.method77(arg1.field723, arg1.field724, 29542, arg1.field721);
        }
        if (arg1.field722 == 2) {
            var3 = this.field1589.method78(arg1.field721, arg1.field723, arg1.field724);
        }
        if (arg1.field722 == 3) {
            var3 = this.field1589.method79(arg1.field721, arg1.field723, arg1.field724);
        }
        if (var3 != 0) {
            int var7 = this.field1589.method80(arg1.field721, arg1.field723, arg1.field724, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field725 = var4;
        arg1.field727 = var5;
        arg1.field726 = var6;
        if (arg0 != 6) {
            this.field1558 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;Z)V")
    private final void method527(int arg0, Packet arg1, boolean arg2) {
        arg1.method239(496);
        this.field1337 &= arg2;
        int var4 = arg1.method240(-703, 1);
        if (var4 != 0) {
            int var5 = arg1.method240(-703, 2);
            if (var5 == 0) {
                this.field1501[this.field1500++] = this.field1496;
            } else if (var5 == 1) {
                int var6 = arg1.method240(-703, 3);
                field1525.method111(5, var6, false);
                int var7 = arg1.method240(-703, 1);
                if (var7 == 1) {
                    this.field1501[this.field1500++] = this.field1496;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method240(-703, 3);
                field1525.method111(5, var8, true);
                int var9 = arg1.method240(-703, 3);
                field1525.method111(5, var9, true);
                int var10 = arg1.method240(-703, 1);
                if (var10 == 1) {
                    this.field1501[this.field1500++] = this.field1496;
                }
            } else if (var5 == 3) {
                this.field1461 = arg1.method240(-703, 2);
                int var11 = arg1.method240(-703, 7);
                int var12 = arg1.method240(-703, 7);
                int var13 = arg1.method240(-703, 1);
                field1525.method110(var13 == 1, var11, var12, field1489);
                int var14 = arg1.method240(-703, 1);
                if (var14 == 1) {
                    this.field1501[this.field1500++] = this.field1496;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    private static final String method528(int arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var2 = false;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method529(int arg0) {
        LocType.field981.method103();
        LocType.field982.method103();
        NpcType.field1027.method103();
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        ObjType.field1079.method103();
        ObjType.field1080.method103();
        PlayerEntity.field482.method103();
        SpotAnimType.field1169.method103();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IIII)V")
    public final void method530(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2.field77 == 0 && arg2.field92 != null && !arg2.field91) {
            if (arg6 >= arg0 && arg3 >= arg1 && arg6 <= arg2.field80 + arg0 && arg3 <= arg2.field81 + arg1) {
                int var8 = arg2.field92.length;
                this.field1557 += arg4;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg2.field93[var9] + arg0;
                    int var11 = arg2.field94[var9] + arg1 - arg5;
                    Component var12 = Component.field70[arg2.field92[var9]];
                    int var13 = var12.field83 + var10;
                    int var14 = var12.field84 + var11;
                    if ((var12.field88 >= 0 || var12.field115 != 0) && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                        if (var12.field88 >= 0) {
                            this.field1481 = var12.field88;
                        } else {
                            this.field1481 = var12.field75;
                        }
                    }
                    if (var12.field77 == 0) {
                        this.method530(var13, var14, var12, arg3, 0, var12.field90, arg6);
                        if (var12.field89 > var12.field81) {
                            this.method501(var12, arg3, var12.field81, var12.field89, 285, var14, var12.field80 + var13, arg6, true);
                        }
                    } else {
                        if (var12.field78 == 1 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            boolean var15 = false;
                            if (var12.field79 != 0) {
                                var15 = this.method503(var12, 567);
                            }
                            if (!var15) {
                                this.field1280[this.field1382] = var12.field131;
                                this.field1248[this.field1382] = 231;
                                this.field1247[this.field1382] = var12.field75;
                                ++this.field1382;
                            }
                        }
                        if (var12.field78 == 2 && this.field1312 == 0 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            String var16 = var12.field128;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1280[this.field1382] = var16 + " @gre@" + var12.field129;
                            this.field1248[this.field1382] = 274;
                            this.field1247[this.field1382] = var12.field75;
                            ++this.field1382;
                        }
                        if (var12.field78 == 3 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1280[this.field1382] = "Close";
                            this.field1248[this.field1382] = 737;
                            this.field1247[this.field1382] = var12.field75;
                            ++this.field1382;
                        }
                        if (var12.field78 == 4 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1280[this.field1382] = var12.field131;
                            this.field1248[this.field1382] = 435;
                            this.field1247[this.field1382] = var12.field75;
                            ++this.field1382;
                        }
                        if (var12.field78 == 5 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1280[this.field1382] = var12.field131;
                            this.field1248[this.field1382] = 225;
                            this.field1247[this.field1382] = var12.field75;
                            ++this.field1382;
                        }
                        if (var12.field78 == 6 && !this.field1377 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1280[this.field1382] = var12.field131;
                            this.field1248[this.field1382] = 997;
                            this.field1247[this.field1382] = var12.field75;
                            ++this.field1382;
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
                                    if (arg6 >= var20 && arg3 >= var21 && arg6 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field1520 = var17;
                                        this.field1521 = var12.field75;
                                        if (var12.field71[var17] > 0) {
                                            ObjType var22 = ObjType.method348(var12.field71[var17] - 1);
                                            if (this.field1613 == 1 && var12.field98) {
                                                if (this.field1615 != var12.field75 || this.field1614 != var17) {
                                                    this.field1280[this.field1382] = "Use " + this.field1617 + " with @lre@" + var22.field1041;
                                                    this.field1248[this.field1382] = 398;
                                                    this.field1249[this.field1382] = var22.field1039;
                                                    this.field1246[this.field1382] = var17;
                                                    this.field1247[this.field1382] = var12.field75;
                                                    ++this.field1382;
                                                }
                                            } else if (this.field1312 == 1 && var12.field98) {
                                                if ((this.field1314 & 16) == 16) {
                                                    this.field1280[this.field1382] = this.field1315 + " @lre@" + var22.field1041;
                                                    this.field1248[this.field1382] = 563;
                                                    this.field1249[this.field1382] = var22.field1039;
                                                    this.field1246[this.field1382] = var17;
                                                    this.field1247[this.field1382] = var12.field75;
                                                    ++this.field1382;
                                                }
                                            } else {
                                                if (var12.field98) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1056 != null && var22.field1056[var23] != null) {
                                                            this.field1280[this.field1382] = var22.field1056[var23] + " @lre@" + var22.field1041;
                                                            if (var23 == 3) {
                                                                this.field1248[this.field1382] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1248[this.field1382] = 100;
                                                            }
                                                            this.field1249[this.field1382] = var22.field1039;
                                                            this.field1246[this.field1382] = var17;
                                                            this.field1247[this.field1382] = var12.field75;
                                                            ++this.field1382;
                                                        } else if (var23 == 4) {
                                                            this.field1280[this.field1382] = "Drop @lre@" + var22.field1041;
                                                            this.field1248[this.field1382] = 100;
                                                            this.field1249[this.field1382] = var22.field1039;
                                                            this.field1246[this.field1382] = var17;
                                                            this.field1247[this.field1382] = var12.field75;
                                                            ++this.field1382;
                                                        }
                                                    }
                                                }
                                                if (var12.field99) {
                                                    this.field1280[this.field1382] = "Use @lre@" + var22.field1041;
                                                    this.field1248[this.field1382] = 102;
                                                    this.field1249[this.field1382] = var22.field1039;
                                                    this.field1246[this.field1382] = var17;
                                                    this.field1247[this.field1382] = var12.field75;
                                                    ++this.field1382;
                                                }
                                                if (var12.field98 && var22.field1056 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1056[var24] != null) {
                                                            this.field1280[this.field1382] = var22.field1056[var24] + " @lre@" + var22.field1041;
                                                            if (var24 == 0) {
                                                                this.field1248[this.field1382] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1248[this.field1382] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1248[this.field1382] = 795;
                                                            }
                                                            this.field1249[this.field1382] = var22.field1039;
                                                            this.field1246[this.field1382] = var17;
                                                            this.field1247[this.field1382] = var12.field75;
                                                            ++this.field1382;
                                                        }
                                                    }
                                                }
                                                if (var12.field106 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field106[var25] != null) {
                                                            this.field1280[this.field1382] = var12.field106[var25] + " @lre@" + var22.field1041;
                                                            if (var25 == 0) {
                                                                this.field1248[this.field1382] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1248[this.field1382] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1248[this.field1382] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1248[this.field1382] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1248[this.field1382] = 354;
                                                            }
                                                            this.field1249[this.field1382] = var22.field1039;
                                                            this.field1246[this.field1382] = var17;
                                                            this.field1247[this.field1382] = var12.field75;
                                                            ++this.field1382;
                                                        }
                                                    }
                                                }
                                                this.field1280[this.field1382] = "Examine @lre@" + var22.field1041;
                                                this.field1248[this.field1382] = 1328;
                                                this.field1249[this.field1382] = var22.field1039;
                                                this.field1246[this.field1382] = var17;
                                                this.field1247[this.field1382] = var12.field75;
                                                ++this.field1382;
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

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1657) {
            this.method560(field1263);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method531(byte arg0) {
        if (arg0 != 35) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field1525.field397 + this.field1229;
            int var4 = field1525.field398 + this.field1554;
            if (this.field1433 - var3 < -500 || this.field1433 - var3 > 500 || this.field1434 - var4 < -500 || this.field1434 - var4 > 500) {
                this.field1433 = var3;
                this.field1434 = var4;
            }
            if (this.field1433 != var3) {
                this.field1433 += (var3 - this.field1433) / 16;
            }
            if (this.field1434 != var4) {
                this.field1434 += (var4 - this.field1434) / 16;
            }
            if (super.field32[1] == 1) {
                this.field1283 += (-24 - this.field1283) / 2;
            } else if (super.field32[2] == 1) {
                this.field1283 += (24 - this.field1283) / 2;
            } else {
                this.field1283 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field1284 += (12 - this.field1284) / 2;
            } else if (super.field32[4] == 1) {
                this.field1284 += (-12 - this.field1284) / 2;
            } else {
                this.field1284 /= 2;
            }
            this.field1282 = this.field1283 / 2 + this.field1282 & 2047;
            this.field1281 += this.field1284 / 2;
            if (this.field1281 < 128) {
                this.field1281 = 128;
            }
            if (this.field1281 > 383) {
                this.field1281 = 383;
            }
            int var5 = this.field1433 >> 7;
            int var6 = this.field1434 >> 7;
            int var7 = this.method550(this.field1433, this.field1434, this.field1461, true);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field1461;
                        if (var11 < 3 && (this.field1239[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field1299[var11][var9][var10];
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
            if (var13 > this.field1358) {
                this.field1358 += (var13 - this.field1358) / 24;
            } else if (var13 < this.field1358) {
                this.field1358 += (var13 - this.field1358) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field1525.field397 + "," + field1525.field398 + "," + this.field1433 + "," + this.field1434 + "," + this.field1265 + "," + this.field1266 + "," + this.field1511 + "," + this.field1512);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method532(String arg0) throws IOException {
        if (!this.field1392) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1607 != null) {
                try {
                    this.field1607.close();
                } catch (Exception var4) {
                }
                this.field1607 = null;
            }
            this.field1607 = this.method495(43595);
            this.field1607.setSoTimeout(10000);
            InputStream var2 = this.field1607.getInputStream();
            OutputStream var3 = this.field1607.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method533(int arg0) {
        if (this.field1609 > 1) {
            --this.field1609;
        }
        if (this.field1561 > 0) {
            --this.field1561;
        }
        for (int var2 = 0; var2 < 5 && this.method444(-547); ++var2) {
        }
        if (this.field1337) {
            Object var3 = this.field1639.field986;
            synchronized (this.field1639.field986) {
                if (!field1483) {
                    this.field1639.field987 = 0;
                } else if (super.field28 != 0 || this.field1639.field987 >= 40) {
                    this.field1416.method218((byte) 1, 1);
                    this.field1416.method219(0);
                    int var4 = this.field1416.field703;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1639.field987 && var4 - this.field1416.field703 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1639.field989[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1639.field988[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1639.field989[var6] == -1 && this.field1639.field988[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1593 == var8 && this.field1594 == var7) {
                            if (this.field1264 < 2047) {
                                ++this.field1264;
                            }
                        } else {
                            int var10 = var8 - this.field1593;
                            this.field1593 = var8;
                            int var11 = var7 - this.field1594;
                            this.field1594 = var7;
                            if (this.field1264 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1416.method220((this.field1264 << 12) + (var10 << 6) + var11);
                                this.field1264 = 0;
                            } else if (this.field1264 < 8) {
                                this.field1416.method222((this.field1264 << 19) + 8388608 + var9);
                                this.field1264 = 0;
                            } else {
                                this.field1416.method223((this.field1264 << 19) + -1073741824 + var9);
                                this.field1264 = 0;
                            }
                        }
                    }
                    this.field1416.method228(9, this.field1416.field703 - var4);
                    if (var5 >= this.field1639.field987) {
                        this.field1639.field987 = 0;
                    } else {
                        this.field1639.field987 -= var5;
                        for (int var12 = 0; var12 < this.field1639.field987; ++var12) {
                            this.field1639.field988[var12] = this.field1639.field988[var5 + var12];
                            this.field1639.field989[var12] = this.field1639.field989[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field1296) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1296 = super.field31;
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
                this.field1416.method218((byte) 1, 131);
                this.field1416.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1435 > 0) {
                --this.field1435;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field1436 = true;
            }
            if (this.field1436 && this.field1435 <= 0) {
                this.field1435 = 20;
                this.field1436 = false;
                this.field1416.method218((byte) 1, 65);
                this.field1416.method220(this.field1281);
                this.field1416.method220(this.field1282);
            }
            if (super.field19 && !this.field1419) {
                this.field1419 = true;
                this.field1416.method218((byte) 1, 60);
                this.field1416.method219(1);
            }
            if (!super.field19 && this.field1419) {
                this.field1419 = false;
                this.field1416.method218((byte) 1, 60);
                this.field1416.method219(0);
            }
            this.method492((byte) 94);
            this.method470(0);
            this.method456(-674);
            ++this.field1559;
            if (this.field1559 > 750) {
                this.method502(true);
            }
            this.method524((byte) 123);
            this.method515(false);
            this.method513(8);
            ++this.field1215;
            if (this.field1466 != 0) {
                this.field1465 += 20;
                if (this.field1465 >= 400) {
                    this.field1466 = 0;
                }
            }
            if (this.field1493 != 0) {
                ++this.field1490;
                if (this.field1490 >= 15) {
                    if (this.field1493 == 2) {
                        this.field1587 = true;
                    }
                    if (this.field1493 == 3) {
                        this.field1563 = true;
                    }
                    this.field1493 = 0;
                }
            }
            if (this.field1529 != 0) {
                ++this.field1397;
                if (super.field22 > this.field1530 + 5 || super.field22 < this.field1530 - 5 || super.field23 > this.field1531 + 5 || super.field23 < this.field1531 - 5) {
                    this.field1418 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1529 == 2) {
                        this.field1587 = true;
                    }
                    if (this.field1529 == 3) {
                        this.field1563 = true;
                    }
                    this.field1529 = 0;
                    if (this.field1418 && this.field1397 >= 5) {
                        this.field1521 = -1;
                        this.method510(-19355);
                        if (this.field1527 == this.field1521 && this.field1528 != this.field1520) {
                            Component var20 = Component.field70[this.field1527];
                            byte var21 = 0;
                            if (this.field1422 == 1 && var20.field79 == 206) {
                                var21 = 1;
                            }
                            if (var20.field71[this.field1520] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field100) {
                                int var22 = this.field1528;
                                int var23 = this.field1520;
                                var20.field71[var23] = var20.field71[var22];
                                var20.field72[var23] = var20.field72[var22];
                                var20.field71[var22] = -1;
                                var20.field72[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1528;
                                int var25 = this.field1520;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24 - 1, 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24 + 1, 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1520, 1, this.field1528);
                            }
                            this.field1416.method218((byte) 1, 28);
                            this.field1416.method220(this.field1527);
                            this.field1416.method220(this.field1528);
                            this.field1416.method220(this.field1520);
                            this.field1416.method219(var21);
                        }
                    } else if ((this.field1228 == 1 || this.method525(-172, this.field1382 - 1)) && this.field1382 > 2) {
                        this.method551(9);
                    } else if (this.field1382 > 0) {
                        this.method457(this.field1382 - 1, false);
                    }
                    this.field1490 = 10;
                    super.field28 = 0;
                }
            }
            ++field1626;
            if (field1626 > 62) {
                field1626 = 0;
                this.field1416.method218((byte) 1, 153);
            }
            if (World3D.field317 != -1) {
                int var26 = World3D.field317;
                int var27 = World3D.field318;
                boolean var28 = this.method482(0, 0, 0, 0, (byte) -114, true, field1525.field447[0], var26, 0, field1525.field448[0], 0, var27);
                World3D.field317 = -1;
                if (var28) {
                    this.field1463 = super.field29;
                    this.field1464 = super.field30;
                    this.field1466 = 1;
                    this.field1465 = 0;
                }
            }
            if (super.field28 == 1 && this.field1367 != null) {
                this.field1367 = null;
                this.field1563 = true;
                super.field28 = 0;
            }
            this.method432(519);
            this.method497((byte) -16);
            if (arg0 < 0) {
                this.method442((byte) -100);
                this.method431(423);
                if (super.field21 == 1 || super.field28 == 1) {
                    ++this.field1565;
                }
                if (this.field1600 == 2) {
                    this.method531((byte) 35);
                }
                if (this.field1600 == 2 && this.field1518) {
                    this.method464(3);
                }
                for (int var29 = 0; var29 < 5; ++var29) {
                    int var10002 = this.field1453[var29]++;
                }
                this.method481(0);
                ++super.field20;
                if (super.field20 > 4500) {
                    this.field1561 = 250;
                    super.field20 -= 500;
                    this.field1416.method218((byte) 1, 36);
                }
                ++this.field1638;
                if (this.field1638 > 500) {
                    this.field1638 = 0;
                    int var30 = (int) (Math.random() * 8.0D);
                    if ((var30 & 1) == 1) {
                        this.field1229 += this.field1230;
                    }
                    if ((var30 & 2) == 2) {
                        this.field1554 += this.field1555;
                    }
                    if ((var30 & 4) == 4) {
                        this.field1653 += this.field1654;
                    }
                }
                if (this.field1229 < -50) {
                    this.field1230 = 2;
                }
                if (this.field1229 > 50) {
                    this.field1230 = -2;
                }
                if (this.field1554 < -55) {
                    this.field1555 = 2;
                }
                if (this.field1554 > 55) {
                    this.field1555 = -2;
                }
                if (this.field1653 < -40) {
                    this.field1654 = 1;
                }
                if (this.field1653 > 40) {
                    this.field1654 = -1;
                }
                ++this.field1469;
                if (this.field1469 > 500) {
                    this.field1469 = 0;
                    int var31 = (int) (Math.random() * 8.0D);
                    if ((var31 & 1) == 1) {
                        this.field1303 += this.field1304;
                    }
                    if ((var31 & 2) == 2) {
                        this.field1310 += this.field1311;
                    }
                }
                if (this.field1303 < -60) {
                    this.field1304 = 2;
                }
                if (this.field1303 > 60) {
                    this.field1304 = -2;
                }
                if (this.field1310 < -20) {
                    this.field1311 = 1;
                }
                if (this.field1310 > 10) {
                    this.field1311 = -1;
                }
                ++this.field1560;
                if (this.field1560 > 50) {
                    this.field1416.method218((byte) 1, 146);
                }
                try {
                    if (this.field1262 != null && this.field1416.field703 > 0) {
                        this.field1262.method42(813, this.field1416.field703, this.field1416.field702, 0);
                        this.field1416.field703 = 0;
                        this.field1560 = 0;
                    }
                } catch (IOException var33) {
                    this.method502(true);
                } catch (Exception var34) {
                    this.method445(543);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method534(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.field1564 = this.field1407.method295();
        }
        int var7 = this.field1589.method76(arg2, arg4, arg1);
        if (var7 != 0) {
            int var8 = this.field1589.method80(arg2, arg4, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg5;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field1575.field662;
            int var13 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field965 != -1) {
                Pix8 var16 = this.field1384[var15.field965];
                if (var16 != null) {
                    int var17 = (var15.field951 * 4 - var16.field674) / 2;
                    int var18 = (var15.field952 * 4 - var16.field675) / 2;
                    var16.method199(arg4 * 4 + 48 + var17, (104 - arg1 - var15.field952) * 4 + 48 + var18, false);
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
        int var19 = this.field1589.method78(arg2, arg4, arg1);
        if (var19 != 0) {
            int var20 = this.field1589.method80(arg2, arg4, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field965 != -1) {
                Pix8 var25 = this.field1384[var24.field965];
                if (var25 != null) {
                    int var26 = (var24.field951 * 4 - var25.field674) / 2;
                    int var27 = (var24.field952 * 4 - var25.field675) / 2;
                    var25.method199(arg4 * 4 + 48 + var26, (104 - arg1 - var24.field952) * 4 + 48 + var27, false);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1575.field662;
                int var30 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
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
        int var31 = this.field1589.method79(arg2, arg4, arg1);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field965 != -1) {
                Pix8 var34 = this.field1384[var33.field965];
                if (var34 != null) {
                    int var35 = (var33.field951 * 4 - var34.field674) / 2;
                    int var36 = (var33.field952 * 4 - var34.field675) / 2;
                    var34.method199(arg4 * 4 + 48 + var35, (104 - arg1 - var33.field952) * 4 + 48 + var36, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IB)V")
    public final void method535(int arg0, int arg1, Component arg2, int arg3, byte arg4) {
        if (arg2.field77 == 0 && arg2.field92 != null) {
            if (!arg2.field91 || this.field1393 == arg2.field75 || this.field1378 == arg2.field75 || this.field1658 == arg2.field75) {
                int var6 = Pix2D.field625;
                int var7 = Pix2D.field623;
                int var8 = Pix2D.field626;
                int var9 = Pix2D.field624;
                Pix2D.method154(arg3, arg0, arg2.field80 + arg0, 0, arg2.field81 + arg3);
                int var10 = arg2.field92.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg2.field93[var11] + arg0;
                    int var14 = arg2.field94[var11] + arg3 - arg1;
                    Component var15 = Component.field70[arg2.field92[var11]];
                    int var16 = var15.field83 + var13;
                    int var17 = var15.field84 + var14;
                    if (var15.field79 > 0) {
                        this.method498(512, var15);
                    }
                    if (var15.field77 == 0) {
                        if (var15.field90 > var15.field89 - var15.field81) {
                            var15.field90 = var15.field89 - var15.field81;
                        }
                        if (var15.field90 < 0) {
                            var15.field90 = 0;
                        }
                        this.method535(var16, var15.field90, var15, var17, (byte) 0);
                        if (var15.field89 > var15.field81) {
                            this.method454(var15.field81, var15.field80 + var16, 854, var15.field89, var15.field90, var17);
                        }
                    } else if (var15.field77 != 1) {
                        if (var15.field77 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field81; ++var19) {
                                for (int var20 = 0; var20 < var15.field80; ++var20) {
                                    int var21 = (var15.field101 + 32) * var20 + var16;
                                    int var22 = (var15.field102 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field104[var18];
                                        var22 += var15.field105[var18];
                                    }
                                    if (var15.field71[var18] <= 0) {
                                        if (var15.field103 != null && var18 < 20) {
                                            Pix32 var31 = var15.field103[var18];
                                            if (var31 != null) {
                                                var31.method186(var21, var22, false);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field71[var18] - 1;
                                        if (var21 > Pix2D.field625 - 32 && var21 < Pix2D.field626 && var22 > Pix2D.field623 - 32 && var22 < Pix2D.field624 || this.field1529 != 0 && this.field1528 == var18) {
                                            int var26 = 0;
                                            if (this.field1613 == 1 && this.field1614 == var18 && this.field1615 == var15.field75) {
                                                var26 = 16777215;
                                            }
                                            Pix32 var27 = ObjType.method354(this.field1369, var25, var26, var15.field72[var18]);
                                            if (var27 != null) {
                                                if (this.field1529 != 0 && this.field1528 == var18 && this.field1527 == var15.field75) {
                                                    var23 = super.field22 - this.field1530;
                                                    var24 = super.field23 - this.field1531;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field1397 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method188(var22 + var24, false, var21 + var23, 128);
                                                    if (var22 + var24 < Pix2D.field623 && arg2.field90 > 0) {
                                                        int var28 = (Pix2D.field623 - var22 - var24) * this.field1215 / 3;
                                                        if (var28 > this.field1215 * 10) {
                                                            var28 = this.field1215 * 10;
                                                        }
                                                        if (var28 > arg2.field90) {
                                                            var28 = arg2.field90;
                                                        }
                                                        arg2.field90 -= var28;
                                                        this.field1531 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > Pix2D.field624 && arg2.field90 < arg2.field89 - arg2.field81) {
                                                        int var29 = (var22 + var24 + 32 - Pix2D.field624) * this.field1215 / 3;
                                                        if (var29 > this.field1215 * 10) {
                                                            var29 = this.field1215 * 10;
                                                        }
                                                        if (var29 > arg2.field89 - arg2.field81 - arg2.field90) {
                                                            var29 = arg2.field89 - arg2.field81 - arg2.field90;
                                                        }
                                                        arg2.field90 += var29;
                                                        this.field1531 -= var29;
                                                    }
                                                } else if (this.field1493 != 0 && this.field1492 == var18 && this.field1491 == var15.field75) {
                                                    var27.method188(var22, false, var21, 128);
                                                } else {
                                                    var27.method186(var21, var22, false);
                                                }
                                                if (var27.field667 == 33 || var15.field72[var18] != 1) {
                                                    int var30 = var15.field72[var18];
                                                    this.field1449.method206(-49546, method528(var30, (byte) 9), 0, var21 + 1 + var23, var22 + 10 + var24);
                                                    this.field1449.method206(-49546, method528(var30, (byte) 9), 16776960, var21 + var23, var22 + 9 + var24);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field77 == 3) {
                            boolean var32 = false;
                            if (this.field1658 == var15.field75 || this.field1378 == var15.field75 || this.field1393 == var15.field75) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method469((byte) -76, var15)) {
                                var33 = var15.field114;
                                if (var32 && var15.field116 != 0) {
                                    var33 = var15.field116;
                                }
                            } else {
                                var33 = var15.field113;
                                if (var32 && var15.field115 != 0) {
                                    var33 = var15.field115;
                                }
                            }
                            if (var15.field82 == 0) {
                                if (var15.field107) {
                                    Pix2D.method157(var16, var15.field80, 4, var33, var15.field81, var17);
                                } else {
                                    Pix2D.method158(var15.field80, var15.field81, var16, var17, 22320, var33);
                                }
                            } else if (var15.field107) {
                                Pix2D.method156(256 - (var15.field82 & 255), var33, var17, var15.field80, false, var16, var15.field81);
                            } else {
                                Pix2D.method159(var15.field80, var15.field81, var33, var17, 2799, 256 - (var15.field82 & 255), var16);
                            }
                        } else if (var15.field77 == 4) {
                            PixFont var34 = var15.field110;
                            String var35 = var15.field111;
                            boolean var36 = false;
                            if (this.field1658 == var15.field75 || this.field1378 == var15.field75 || this.field1393 == var15.field75) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method469((byte) -76, var15)) {
                                var37 = var15.field114;
                                if (var36 && var15.field116 != 0) {
                                    var37 = var15.field116;
                                }
                                if (var15.field112.length() > 0) {
                                    var35 = var15.field112;
                                }
                            } else {
                                var37 = var15.field113;
                                if (var36 && var15.field115 != 0) {
                                    var37 = var15.field115;
                                }
                            }
                            if (var15.field78 == 6 && this.field1377) {
                                var35 = "Please wait...";
                                var37 = var15.field113;
                            }
                            if (Pix2D.field621 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field690 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label350: while (true) {
                                        int var39 = var35.indexOf("%1");
                                        if (var39 == -1) {
                                            while (true) {
                                                int var40 = var35.indexOf("%2");
                                                if (var40 == -1) {
                                                    while (true) {
                                                        int var41 = var35.indexOf("%3");
                                                        if (var41 == -1) {
                                                            while (true) {
                                                                int var42 = var35.indexOf("%4");
                                                                if (var42 == -1) {
                                                                    while (true) {
                                                                        int var43 = var35.indexOf("%5");
                                                                        if (var43 == -1) {
                                                                            break label350;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method541(-466, this.method478((byte) -95, 4, var15)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method541(-466, this.method478((byte) -95, 3, var15)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method541(-466, this.method478((byte) -95, 2, var15)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method541(-466, this.method478((byte) -95, 1, var15)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method541(-466, this.method478((byte) -95, 0, var15)) + var35.substring(var39 + 2);
                                    }
                                }
                                int var44 = var35.indexOf("\\n");
                                String var45;
                                if (var44 != -1) {
                                    var45 = var35.substring(0, var44);
                                    var35 = var35.substring(var44 + 2);
                                } else {
                                    var45 = var35;
                                    var35 = "";
                                }
                                if (var15.field108) {
                                    var34.method203(var15.field80 / 2 + var16, 0, var15.field109, var38, var37, var45);
                                } else {
                                    var34.method210(var38, var15.field109, var16, 16365, var37, var45);
                                }
                                var38 += var34.field690;
                            }
                        } else if (var15.field77 == 5) {
                            Pix32 var46;
                            if (this.method469((byte) -76, var15)) {
                                var46 = var15.field118;
                            } else {
                                var46 = var15.field117;
                            }
                            if (var46 != null) {
                                var46.method186(var16, var17, false);
                            }
                        } else if (var15.field77 == 6) {
                            int var47 = Pix3D.field638;
                            int var48 = Pix3D.field639;
                            Pix3D.field638 = var15.field80 / 2 + var16;
                            Pix3D.field639 = var15.field81 / 2 + var17;
                            int var49 = Pix3D.field642[var15.field126] * var15.field125 >> 16;
                            int var50 = Pix3D.field643[var15.field126] * var15.field125 >> 16;
                            boolean var51 = this.method469((byte) -76, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field124;
                            } else {
                                var52 = var15.field123;
                            }
                            Model var53;
                            if (var52 == -1) {
                                var53 = var15.method34(-1, 175, -1, var51);
                            } else {
                                SeqType var54 = SeqType.field1134[var52];
                                var53 = var15.method34(var54.field1136[var15.field73], 175, var54.field1137[var15.field73], var51);
                            }
                            if (var53 != null) {
                                var53.method146(0, var15.field127, 0, var15.field126, 0, var49, var50);
                            }
                            Pix3D.field638 = var47;
                            Pix3D.field639 = var48;
                        } else if (var15.field77 == 7) {
                            PixFont var55 = var15.field110;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field81; ++var57) {
                                for (int var58 = 0; var58 < var15.field80; ++var58) {
                                    if (var15.field71[var56] > 0) {
                                        ObjType var59 = ObjType.method348(var15.field71[var56] - 1);
                                        String var60 = var59.field1041;
                                        if (var59.field1052 || var15.field72[var56] != 1) {
                                            var60 = var60 + " x" + method546(30488, var15.field72[var56]);
                                        }
                                        int var61 = (var15.field101 + 115) * var58 + var16;
                                        int var62 = (var15.field102 + 12) * var57 + var17;
                                        if (var15.field108) {
                                            var55.method203(var15.field80 / 2 + var61, 0, var15.field109, var62, var15.field113, var60);
                                        } else {
                                            var55.method210(var62, var15.field109, var61, 16365, var15.field113, var60);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                Pix2D.method154(var7, var6, var8, 0, var9);
                if (arg4 == 0) {
                    boolean var12 = false;
                } else {
                    this.field1564 = -200;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public final void method536(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field1494 != -1) {
            this.field1367 = arg3;
            super.field28 = 0;
        }
        if (this.field1348 == -1) {
            this.field1563 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1218[var5] = this.field1218[var5 - 1];
            this.field1219[var5] = this.field1219[var5 - 1];
            this.field1220[var5] = this.field1220[var5 - 1];
        }
        this.field1218[0] = arg2;
        this.field1219[0] = arg1;
        if (arg0 != 1) {
            this.field1471 = this.field1407.method295();
        }
        this.field1220[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method537(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1240; ++var4) {
                if (this.field1604[var4] == arg0) {
                    --this.field1240;
                    this.field1587 = true;
                    for (int var5 = var4; var5 < this.field1240; ++var5) {
                        this.field1641[var5] = this.field1641[var5 + 1];
                        this.field1509[var5] = this.field1509[var5 + 1];
                        this.field1604[var5] = this.field1604[var5 + 1];
                    }
                    this.field1416.method218((byte) 1, 214);
                    this.field1416.method225(arg0, field1629);
                    break;
                }
            }
            int var6 = 92 / arg1;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field1292 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method538(int arg0, int arg1) {
        LinkList var3 = this.field1288[this.field1461][arg0][arg1];
        if (var3 == null) {
            this.field1589.method71(this.field1461, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250((byte) 71)) {
                ObjType var11 = ObjType.method348(var6.field498);
                int var12 = var11.field1053;
                if (var11.field1052) {
                    var12 = (var6.field499 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246((byte) 1, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250((byte) 71)) {
                if (var5.field498 != var9.field498 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field498 != var9.field498 && var7.field498 != var9.field498 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1589.method57(arg1, var7, var10, var5, this.field1461, var8, -35695, this.method550(arg0 * 128 + 64, arg1 * 128 + 64, this.field1461, true), arg0);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IB)V")
    public final void method539(int arg0, byte arg1) {
        Component var3 = Component.field70[arg0];
        for (int var4 = 0; var4 < var3.field92.length && var3.field92[var4] != -1; ++var4) {
            Component var5 = Component.field70[var3.field92[var4]];
            if (var5.field77 == 1) {
                this.method539(var5.field75, (byte) 5);
            }
            var5.field73 = 0;
            var5.field74 = 0;
        }
        if (this.field1343 == arg1) {
            boolean var6 = false;
        } else {
            this.field1416.method219(127);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILlb;I)V")
    private final void method540(int arg0, Packet arg1, int arg2) {
        if (arg0 >= 0) {
            field1640 = this.field1407.method295();
        }
        this.field1472 = 0;
        this.field1500 = 0;
        this.method458(arg2, arg1, (byte) 5);
        this.method552(arg1, arg2, (byte) 46);
        this.method489(0, arg1, arg2);
        for (int var4 = 0; var4 < this.field1472; ++var4) {
            int var6 = this.field1473[var4];
            if (field1279 != this.field1364[var6].field442) {
                this.field1364[var6].field454 = null;
                this.field1364[var6] = null;
            }
        }
        if (arg1.field703 != arg2) {
            signlink.reporterror(this.field1398 + " size mismatch in getnpcpos - pos:" + arg1.field703 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1365; ++var5) {
                if (this.field1364[this.field1366[var5]] == null) {
                    signlink.reporterror(this.field1398 + " null entry in npc list - pos:" + var5 + " size:" + this.field1365);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method541(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field1416.method219(109);
        }
        if (arg1 < 999999999) {
            return String.valueOf(arg1);
        } else {
            return "*";
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method542(byte arg0) {
        this.field1416.method218((byte) 1, 84);
        if (arg0 != 1) {
            this.field1558 = -1;
        }
        if (this.field1350 != -1) {
            this.field1350 = -1;
            this.field1587 = true;
            this.field1377 = false;
            this.field1371 = true;
        }
        if (this.field1348 != -1) {
            this.field1348 = -1;
            this.field1563 = true;
            this.field1377 = false;
        }
        this.field1221 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILib;I)V")
    public final void method543(boolean arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = this.field1303 + this.field1282 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (arg0) {
            this.field1288 = null;
        }
        if (var6 <= 6400) {
            int var7 = Model.field601[var5];
            int var8 = Model.field602[var5];
            int var9 = var7 * 256 / (this.field1310 + 256);
            int var10 = var8 * 256 / (this.field1310 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method192(var11 + 94 - arg2.field667 / 2 + 4, this.field1319, 28501, 83 - var12 - arg2.field668 / 2 - 4);
            } else {
                arg2.method186(var11 + 94 - arg2.field667 / 2 + 4, 83 - var12 - arg2.field668 / 2 - 4, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method544(int arg0) {
        ++this.field1356;
        this.method507(898, true);
        this.method455(910, true);
        this.method507(898, false);
        this.method455(910, false);
        this.method433(0);
        this.method484(928);
        if (!this.field1518) {
            int var2 = this.field1281;
            if (this.field1358 / 256 > var2) {
                var2 = this.field1358 / 256;
            }
            if (this.field1352[4] && this.field1289[4] + 128 > var2) {
                var2 = this.field1289[4] + 128;
            }
            int var3 = this.field1653 + this.field1282 & 2047;
            this.method487(var2, this.field1433, var3, this.method550(field1525.field397, field1525.field398, this.field1461, true) - 50, 3, var2 * 3 + 600, this.field1434);
        }
        int var4;
        if (!this.field1518) {
            var4 = this.method555(false);
        } else {
            var4 = this.method556(0);
        }
        int var5 = this.field1305;
        int var6 = this.field1306;
        int var7 = this.field1307;
        int var8 = this.field1308;
        int var9 = this.field1309;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1352[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1637[var10] * 2 + 1) - (double) this.field1637[var10] + Math.sin((double) this.field1431[var10] / 100.0D * (double) this.field1453[var10]) * (double) this.field1289[var10]);
                if (var10 == 0) {
                    this.field1305 += var12;
                }
                if (var10 == 1) {
                    this.field1306 += var12;
                }
                if (var10 == 2) {
                    this.field1307 += var12;
                }
                if (var10 == 3) {
                    this.field1309 = this.field1309 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1308 += var12;
                    if (this.field1308 < 128) {
                        this.field1308 = 128;
                    }
                    if (this.field1308 > 383) {
                        this.field1308 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field653;
        Model.field596 = true;
        Model.field599 = 0;
        Model.field597 = super.field22 - 4;
        Model.field598 = super.field23 - 4;
        Pix2D.method155(0);
        this.field1589.method89(this.field1305, this.field1307, -706, var4, this.field1308, this.field1306, this.field1309);
        this.field1589.method64(4);
        this.method488(true);
        this.method554(8);
        this.method440(var11, 535);
        this.field1557 += arg0;
        this.method506(3);
        this.field1621.method259(4, 4, (byte) 3, super.field14);
        this.field1305 = var5;
        this.field1306 = var6;
        this.field1307 = var7;
        this.field1308 = var8;
        this.field1309 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1262 != null) {
                this.field1262.method38();
            }
        } catch (Exception var3) {
        }
        this.field1262 = null;
        this.method467(this.field1577);
        if (this.field1639 != null) {
            this.field1639.field985 = false;
        }
        this.field1639 = null;
        this.field1549.method271();
        this.field1549 = null;
        this.field1416 = null;
        this.field1380 = null;
        this.field1627 = null;
        this.field1394 = null;
        this.field1576 = null;
        this.field1260 = null;
        this.field1395 = null;
        this.field1396 = null;
        this.field1299 = null;
        this.field1239 = null;
        this.field1589 = null;
        this.field1596 = null;
        this.field1508 = null;
        this.field1385 = null;
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1558 = -1;
        }
        this.field1650 = null;
        this.field1651 = null;
        this.field1355 = null;
        this.field1619 = null;
        this.field1620 = null;
        this.field1621 = null;
        this.field1622 = null;
        this.field1582 = null;
        this.field1583 = null;
        this.field1584 = null;
        this.field1321 = null;
        this.field1322 = null;
        this.field1323 = null;
        this.field1324 = null;
        this.field1325 = null;
        this.field1326 = null;
        this.field1327 = null;
        this.field1328 = null;
        this.field1329 = null;
        this.field1318 = null;
        this.field1319 = null;
        this.field1320 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.field1341 = null;
        this.field1353 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1426 = null;
        this.field1427 = null;
        this.field1428 = null;
        this.field1662 = null;
        this.field1663 = null;
        this.field1664 = null;
        this.field1665 = null;
        this.field1666 = null;
        this.field1486 = null;
        this.field1430 = null;
        this.field1404 = null;
        this.field1592 = null;
        this.field1631 = null;
        this.field1632 = null;
        this.field1633 = null;
        this.field1634 = null;
        this.field1384 = null;
        this.field1373 = null;
        this.field1551 = null;
        this.field1497 = null;
        this.field1499 = null;
        this.field1501 = null;
        this.field1502 = null;
        this.field1473 = null;
        this.field1364 = null;
        this.field1366 = null;
        this.field1288 = null;
        this.field1331 = null;
        this.field1505 = null;
        this.field1606 = null;
        this.field1246 = null;
        this.field1247 = null;
        this.field1248 = null;
        this.field1249 = null;
        this.field1280 = null;
        this.field1359 = null;
        this.field1568 = null;
        this.field1569 = null;
        this.field1362 = null;
        this.field1575 = null;
        this.field1641 = null;
        this.field1604 = null;
        this.field1509 = null;
        this.field1273 = null;
        this.field1274 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1275 = null;
        this.field1276 = null;
        this.field1277 = null;
        this.field1278 = null;
        this.method479(7);
        LocType.method329(3);
        NpcType.method340(3);
        ObjType.method347(3);
        FloType.field1094 = null;
        IdkType.field1111 = null;
        Component.field70 = null;
        UnkType.field1120 = null;
        SeqType.field1134 = null;
        SpotAnimType.field1157 = null;
        SpotAnimType.field1169 = null;
        VarpType.field1183 = null;
        super.field15 = null;
        PlayerEntity.field482 = null;
        Pix3D.method164(3);
        World3D.method49(3);
        Model.method122(3);
        AnimFrame.method46(3);
        System.gc();
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method545(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field70[arg1];
        for (int var6 = 0; var6 < var5.field92.length && var5.field92[var6] != -1; ++var6) {
            Component var7 = Component.field70[var5.field92[var6]];
            if (var7.field77 == 1) {
                var4 |= this.method545(arg0, var7.field75, this.field1536);
            }
            if (var7.field77 == 6 && (var7.field123 != -1 || var7.field124 != -1)) {
                boolean var8 = this.method469((byte) -76, var7);
                int var9;
                if (var8) {
                    var9 = var7.field124;
                } else {
                    var9 = var7.field123;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1134[var9];
                    var7.field74 += arg0;
                    while (var7.field74 > var10.method382(36967, var7.field73)) {
                        var7.field74 -= var10.method382(36967, var7.field73) + 1;
                        ++var7.field73;
                        if (var7.field73 >= var10.field1135) {
                            var7.field73 -= var10.field1139;
                            if (var7.field73 < 0 || var7.field73 >= var10.field1135) {
                                var7.field73 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method546(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != 30488) {
            field1629 = true;
        }
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method547(int arg0, int arg1, int arg2) {
        if (this.field1408 != arg1) {
            field1640 = 138;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1220[var5] != null) {
                int var6 = this.field1218[var5];
                int var7 = 70 - var4 * 14 + this.field1652 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1219[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1334 == 0 || this.field1334 == 1 && this.method437(1657, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1525.field458)) {
                        if (this.field1330 >= 1) {
                            this.field1280[this.field1382] = "Report abuse @whi@" + var8;
                            this.field1248[this.field1382] = 524;
                            ++this.field1382;
                        }
                        this.field1280[this.field1382] = "Add ignore @whi@" + var8;
                        this.field1248[this.field1382] = 47;
                        ++this.field1382;
                        this.field1280[this.field1382] = "Add friend @whi@" + var8;
                        this.field1248[this.field1382] = 605;
                        ++this.field1382;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1354 == 0 && (var6 == 7 || this.field1612 == 0 || this.field1612 == 1 && this.method437(1657, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1330 >= 1) {
                            this.field1280[this.field1382] = "Report abuse @whi@" + var8;
                            this.field1248[this.field1382] = 524;
                            ++this.field1382;
                        }
                        this.field1280[this.field1382] = "Add ignore @whi@" + var8;
                        this.field1248[this.field1382] = 47;
                        ++this.field1382;
                        this.field1280[this.field1382] = "Add friend @whi@" + var8;
                        this.field1248[this.field1382] = 605;
                        ++this.field1382;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1460 == 0 || this.field1460 == 1 && this.method437(1657, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1280[this.field1382] = "Accept trade @whi@" + var8;
                        this.field1248[this.field1382] = 507;
                        ++this.field1382;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1354 == 0 && this.field1612 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1460 == 0 || this.field1460 == 1 && this.method437(1657, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1280[this.field1382] = "Accept challenge @whi@" + var8;
                        this.field1248[this.field1382] = 957;
                        ++this.field1382;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)Lxb;")
    public final Jagfile method548(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1232[0] != null) {
                var7 = this.field1232[0].method291(8, arg0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1547.reset();
            this.field1547.update(var7);
            int var9 = (int) this.field1547.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, -41647);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13("Requesting " + arg5, arg3, -427);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method532(arg4 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(field1640, var16);
                    var17.field703 = 3;
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
                            this.method13("Loading " + arg5 + " - " + var23 + "%", arg3, -427);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1232[0] != null) {
                            this.field1232[0].method292(arg0, this.field1471, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field1232[0] = null;
                    }
                    if (var7 != null) {
                        this.field1547.reset();
                        this.field1547.update(var7);
                        int var24 = (int) this.field1547.getValue();
                        if (arg1 != var24) {
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
                            this.method13("Game updated - please reload page", arg3, -427);
                            var26 = 10;
                        } else {
                            this.method13(var12 + " - Retrying in " + var26, arg3, -427);
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
                    this.field1392 = !this.field1392;
                }
            }
            Jagfile var27 = new Jagfile(var7, -41647);
            this.field1557 += arg2;
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ZI)V")
    private final void method549(Packet arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var4 = 0; var4 < this.field1500; ++var4) {
                int var5 = this.field1501[var4];
                PlayerEntity var6 = this.field1497[var5];
                int var7 = arg0.method229();
                if ((var7 & 128) == 128) {
                    var7 += arg0.method229() << 8;
                }
                this.method448(arg0, var7, var5, this.field1474, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)I")
    public final int method550(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field1239[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field1299[var7][var5][var6] + this.field1299[var7][var5 + 1][var6] * var8 >> 7;
            this.field1337 &= arg3;
            int var11 = (128 - var8) * this.field1299[var7][var5][var6 + 1] + this.field1299[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method551(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field1474 = 131;
        }
        int var2 = this.field1451.method204("Choose Option", this.field1338);
        for (int var3 = 0; var3 < this.field1382; ++var3) {
            int var11 = this.field1451.method204(this.field1280[var3], this.field1338);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1382 * 15 + 21;
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
            this.field1570 = true;
            this.field1253 = 0;
            this.field1254 = var5;
            this.field1255 = var6;
            this.field1256 = var2;
            this.field1257 = this.field1382 * 15 + 22;
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
            this.field1570 = true;
            this.field1253 = 1;
            this.field1254 = var7;
            this.field1255 = var8;
            this.field1256 = var2;
            this.field1257 = this.field1382 * 15 + 22;
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
            this.field1570 = true;
            this.field1253 = 2;
            this.field1254 = var9;
            this.field1255 = var10;
            this.field1256 = var2;
            this.field1257 = this.field1382 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;IB)V")
    private final void method552(Packet arg0, int arg1, byte arg2) {
        while (true) {
            if (arg0.field704 + 21 < arg1 * 8) {
                int var4 = arg0.method240(-703, 14);
                if (var4 != 16383) {
                    if (this.field1364[var4] == null) {
                        this.field1364[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1364[var4];
                    this.field1366[this.field1365++] = var4;
                    var5.field442 = field1279;
                    var5.field454 = NpcType.method341(arg0.method240(-703, 12));
                    var5.field401 = var5.field454.field1001;
                    var5.field445 = var5.field454.field1023;
                    var5.field404 = var5.field454.field1005;
                    var5.field405 = var5.field454.field1006;
                    var5.field406 = var5.field454.field1007;
                    var5.field407 = var5.field454.field1008;
                    var5.field402 = var5.field454.field1004;
                    int var6 = arg0.method240(-703, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method240(-703, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method240(-703, 1);
                    var5.method110(var8 == 1, field1525.field447[0] + var6, field1525.field448[0] + var7, field1489);
                    int var9 = arg0.method240(-703, 1);
                    if (var9 == 1) {
                        this.field1501[this.field1500++] = var4;
                    }
                    continue;
                }
            }
            arg0.method241(-29885);
            if (arg2 != 46) {
                this.method6();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method553(boolean arg0) {
        this.field1619.method258((byte) -127);
        Pix3D.field644 = this.field1602;
        this.field1318.method199(0, 0, false);
        if (this.field1350 != -1) {
            this.method535(0, 0, Component.field70[this.field1350], 0, (byte) 0);
        } else if (this.field1644[this.field1456] != -1) {
            this.method535(0, 0, Component.field70[this.field1644[this.field1456]], 0, (byte) 0);
        }
        if (this.field1570 && this.field1253 == 1) {
            this.method562(711);
        }
        this.field1619.method259(553, 205, (byte) 3, super.field14);
        this.field1621.method258((byte) -127);
        Pix3D.field644 = this.field1603;
        if (arg0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (this.field1459 == 2) {
            this.method491((this.field1411 - this.field1512 << 7) + this.field1414, (this.field1410 - this.field1511 << 7) + this.field1413, this.field1412 * 2, 0);
            if (arg0 != 8) {
                this.field1288 = null;
            }
            if (this.field1506 > -1 && field1279 % 20 < 10) {
                this.field1404[2].method186(this.field1506 - 12, this.field1507 - 28, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)I")
    public final int method555(boolean arg0) {
        if (arg0) {
            return this.field1471;
        } else {
            int var2 = 3;
            if (this.field1308 < 310) {
                int var3 = this.field1305 >> 7;
                int var4 = this.field1307 >> 7;
                int var5 = field1525.field397 >> 7;
                int var6 = field1525.field398 >> 7;
                if ((this.field1239[this.field1461][var3][var4] & 4) != 0) {
                    var2 = this.field1461;
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
                        if ((this.field1239[this.field1461][var3][var4] & 4) != 0) {
                            var2 = this.field1461;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1239[this.field1461][var3][var4] & 4) != 0) {
                                var2 = this.field1461;
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
                        if ((this.field1239[this.field1461][var3][var4] & 4) != 0) {
                            var2 = this.field1461;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1239[this.field1461][var3][var4] & 4) != 0) {
                                var2 = this.field1461;
                            }
                        }
                    }
                }
            }
            if ((this.field1239[this.field1461][field1525.field397 >> 7][field1525.field398 >> 7] & 4) != 0) {
                var2 = this.field1461;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)I")
    public final int method556(int arg0) {
        int var2 = this.method550(this.field1305, this.field1307, this.field1461, true);
        this.field1557 += arg0;
        return var2 - this.field1306 < 800 && (this.field1239[this.field1461][this.field1305 >> 7][this.field1307 >> 7] & 4) != 0 ? this.field1461 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method557(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg0 != -8050) {
            this.field1288 = null;
        }
        return ((arg1 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg1 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13("Starting up", 20, -427);
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field1598) {
            this.field1605 = true;
        } else {
            field1598 = true;
            boolean var1 = false;
            String var2 = this.method473(-182);
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
                this.field1590 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1232[var3] = new FileStream(605, var3 + 1, 500000, signlink.cache_idx[var3], signlink.cache_dat);
                    }
                }
                try {
                    this.method452(1764);
                    this.field1259 = this.method548(1, this.field1234[1], 0, 25, "title", "title screen");
                    this.field1449 = new PixFont(false, this.field1259, 45801, "p11_full");
                    this.field1450 = new PixFont(false, this.field1259, 45801, "p12_full");
                    this.field1451 = new PixFont(false, this.field1259, 45801, "b12_full");
                    this.field1452 = new PixFont(true, this.field1259, 45801, "q8_full");
                    this.method443(0);
                    this.method430(0);
                    Jagfile var4 = this.method548(2, this.field1234[2], 0, 30, "config", "config");
                    Jagfile var5 = this.method548(3, this.field1234[3], 0, 35, "interface", "interface");
                    Jagfile var6 = this.method548(4, this.field1234[4], 0, 40, "media", "2d graphics");
                    Jagfile var7 = this.method548(6, this.field1234[6], 0, 45, "textures", "textures");
                    Jagfile var8 = this.method548(7, this.field1234[7], 0, 50, "wordenc", "chat system");
                    Jagfile var9 = this.method548(8, this.field1234[8], 0, 55, "sounds", "sound effects");
                    this.field1239 = new byte[4][104][104];
                    this.field1299 = new int[4][105][105];
                    this.field1589 = new World3D(4, this.field1299, 104, true, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1596[var10] = new CollisionMap(field1245, 104, 104);
                    }
                    this.field1575 = new Pix32(512, 512);
                    Jagfile var11 = this.method548(5, this.field1234[5], 0, 60, "versionlist", "update list");
                    this.method13("Connecting to update server", 60, -427);
                    this.field1549 = new OnDemand();
                    this.field1549.method270(var11, this);
                    AnimFrame.method44(this.field1549.method273(-3812));
                    Model.method123(this.field1549.method272(26014, 0), this.field1549);
                    if (!field1294) {
                        this.field1515 = 0;
                        try {
                            this.field1515 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1516 = true;
                        this.field1549.method279(2, this.field1515);
                        while (this.field1549.method280() > 0) {
                            this.method468(414);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1549.field833 > 3) {
                                this.method463("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13("Requesting animations", 65, -427);
                    int var12 = this.field1549.method272(26014, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1549.method279(1, var13);
                    }
                    while (this.field1549.method280() > 0) {
                        int var14 = var12 - this.field1549.method280();
                        if (var14 > 0) {
                            this.method13("Loading animations - " + var14 * 100 / var12 + "%", 65, -427);
                        }
                        this.method468(414);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1549.field833 > 3) {
                            this.method463("ondemand");
                            return;
                        }
                    }
                    this.method13("Requesting models", 70, -427);
                    int var15 = this.field1549.method272(26014, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1549.method277(var16, (byte) 6);
                        if ((var17 & 1) != 0) {
                            this.field1549.method279(0, var16);
                        }
                    }
                    int var18 = this.field1549.method280();
                    while (this.field1549.method280() > 0) {
                        int var19 = var18 - this.field1549.method280();
                        if (var19 > 0) {
                            this.method13("Loading models - " + var19 * 100 / var18 + "%", 70, -427);
                        }
                        this.method468(414);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1232[0] != null) {
                        this.method13("Requesting maps", 75, -427);
                        this.field1549.method279(3, this.field1549.method274(5, 47, 0, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 47, 1, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 0, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 1, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 49, 0, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 49, 1, 48));
                        this.field1549.method279(3, this.field1549.method274(5, 47, 0, 47));
                        this.field1549.method279(3, this.field1549.method274(5, 47, 1, 47));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 0, 47));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 1, 47));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 0, 148));
                        this.field1549.method279(3, this.field1549.method274(5, 48, 1, 148));
                        int var20 = this.field1549.method280();
                        while (this.field1549.method280() > 0) {
                            int var21 = var20 - this.field1549.method280();
                            if (var21 > 0) {
                                this.method13("Loading maps - " + var21 * 100 / var20 + "%", 75, -427);
                            }
                            this.method468(414);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1549.method272(26014, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1549.method277(var23, (byte) 6);
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
                            this.field1549.method282(field1391, 0, var25, var23);
                        }
                    }
                    this.field1549.method275(field1293, 0);
                    if (!field1294) {
                        int var26 = this.field1549.method272(26014, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1549.method278(-199, var27)) {
                                this.field1549.method282(field1391, 2, (byte) 1, var27);
                            }
                        }
                    }
                    this.method13("Unpacking media", 80, -427);
                    this.field1318 = new Pix8(var6, "invback", 0);
                    this.field1320 = new Pix8(var6, "chatback", 0);
                    this.field1319 = new Pix8(var6, "mapback", 0);
                    this.field1339 = new Pix8(var6, "backbase1", 0);
                    this.field1340 = new Pix8(var6, "backbase2", 0);
                    this.field1341 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1353[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1486 = new Pix32(var6, "compass", 0);
                    this.field1642 = new Pix32(var6, "mapedge", 0);
                    this.field1642.method183(field1268);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1384[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1373[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1430[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1404[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1400 = new Pix32(var6, "mapmarker", 0);
                    this.field1401 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1592[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1631 = new Pix32(var6, "mapdots", 0);
                    this.field1632 = new Pix32(var6, "mapdots", 1);
                    this.field1633 = new Pix32(var6, "mapdots", 2);
                    this.field1634 = new Pix32(var6, "mapdots", 3);
                    this.field1668 = new Pix8(var6, "scrollbar", 0);
                    this.field1669 = new Pix8(var6, "scrollbar", 1);
                    this.field1424 = new Pix8(var6, "redstone1", 0);
                    this.field1425 = new Pix8(var6, "redstone2", 0);
                    this.field1426 = new Pix8(var6, "redstone3", 0);
                    this.field1427 = new Pix8(var6, "redstone1", 0);
                    this.field1427.method196(498);
                    this.field1428 = new Pix8(var6, "redstone2", 0);
                    this.field1428.method196(498);
                    this.field1662 = new Pix8(var6, "redstone1", 0);
                    this.field1662.method197(true);
                    this.field1663 = new Pix8(var6, "redstone2", 0);
                    this.field1663.method197(true);
                    this.field1664 = new Pix8(var6, "redstone3", 0);
                    this.field1664.method197(true);
                    this.field1665 = new Pix8(var6, "redstone1", 0);
                    this.field1665.method196(498);
                    this.field1665.method197(true);
                    this.field1666 = new Pix8(var6, "redstone2", 0);
                    this.field1666.method196(498);
                    this.field1666.method197(true);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1295[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1321 = new PixMap(false, this.method11(7), var35.field663, var35.field664);
                    var35.method184(-8550, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1322 = new PixMap(false, this.method11(7), var36.field663, var36.field664);
                    var36.method184(-8550, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1323 = new PixMap(false, this.method11(7), var37.field663, var37.field664);
                    var37.method184(-8550, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1324 = new PixMap(false, this.method11(7), var38.field663, var38.field664);
                    var38.method184(-8550, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1325 = new PixMap(false, this.method11(7), var39.field663, var39.field664);
                    var39.method184(-8550, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1326 = new PixMap(false, this.method11(7), var40.field663, var40.field664);
                    var40.method184(-8550, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1327 = new PixMap(false, this.method11(7), var41.field663, var41.field664);
                    var41.method184(-8550, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1328 = new PixMap(false, this.method11(7), var42.field663, var42.field664);
                    var42.method184(-8550, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1329 = new PixMap(false, this.method11(7), var43.field663, var43.field664);
                    var43.method184(-8550, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1373[var48] != null) {
                            this.field1373[var48].method182(var45 + var47, var44 + var47, 3, var46 + var47);
                        }
                        if (this.field1384[var48] != null) {
                            this.field1384[var48].method198(var45 + var47, var44 + var47, 3, var46 + var47);
                        }
                    }
                    this.method13("Unpacking textures", 83, -427);
                    Pix3D.method169(var7, true);
                    Pix3D.method173(0.8D, false);
                    Pix3D.method168(false, 20);
                    this.method13("Unpacking config", 86, -427);
                    SeqType.method381(var4, 0);
                    LocType.method328(var4);
                    FloType.method371(var4, 0);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(var4, 0);
                    SpotAnimType.method384(var4, 0);
                    VarpType.method389(var4, 0);
                    VarbitType.method387(var4, 0);
                    ObjType.field1038 = field1293;
                    if (!field1294) {
                        this.method13("Unpacking sounds", 90, -427);
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(field1640, var49);
                        Wave.method318(var50, 0);
                    }
                    this.method13("Unpacking interfaces", 95, -427);
                    PixFont[] var51 = new PixFont[] { this.field1449, this.field1450, this.field1451, this.field1452 };
                    Component.method32(var6, 0, var51, var5);
                    this.method13("Preparing game engine", 100, -427);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1319.field672[this.field1319.field674 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1591[var52] = var53;
                        this.field1532[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1319.field672[this.field1319.field674 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1236[var56 - 5] = var57 - 25;
                        this.field1556[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(96, (byte) 7, 479);
                    this.field1601 = Pix3D.field644;
                    Pix3D.method166(261, (byte) 7, 190);
                    this.field1602 = Pix3D.field644;
                    Pix3D.method166(334, (byte) 7, 512);
                    this.field1603 = Pix3D.field644;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field642[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(var60, 800, 334, 512, false, 500);
                    WordFilter.method391(var8);
                    this.field1639 = new MouseTracking(0, this);
                    this.method12(this.field1639, 10);
                    LocEntity.field484 = this;
                    LocType.field937 = this;
                    NpcType.field992 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1522 + " " + this.field1409);
                    this.field1335 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method558(byte arg0) {
        if (this.field1382 >= 2 || this.field1613 != 0 || this.field1312 != 0) {
            String var2;
            if (this.field1613 == 1 && this.field1382 < 2) {
                var2 = "Use " + this.field1617 + " with...";
            } else if (this.field1312 == 1 && this.field1382 < 2) {
                var2 = this.field1315 + "...";
            } else {
                var2 = this.field1280[this.field1382 - 1];
            }
            if (this.field1382 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1382 - 2) + " more options";
            }
            this.field1451.method211(true, field1279 / 1000, 82, 15, 16777215, var2, 4);
            if (arg0 == 1) {
                boolean var3 = false;
            } else {
                this.field1416.method219(22);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILgc;II)V")
    public final void method559(int arg0, int arg1, NpcType arg2, int arg3, int arg4) {
        if (this.field1382 < 400) {
            if (arg2.field1024 != null) {
                arg2 = arg2.method345(0);
            }
            if (arg2 != null) {
                String var6 = arg2.field999;
                if (arg0 != -44650) {
                    this.field1416.method219(210);
                }
                if (arg2.field1016 != 0) {
                    var6 = var6 + method451(field1525.field464, arg2.field1016, (byte) 4) + " (level-" + arg2.field1016 + ")";
                }
                if (this.field1613 == 1) {
                    this.field1280[this.field1382] = "Use " + this.field1617 + " with @yel@" + var6;
                    this.field1248[this.field1382] = 829;
                    this.field1249[this.field1382] = arg4;
                    this.field1246[this.field1382] = arg3;
                    this.field1247[this.field1382] = arg1;
                    ++this.field1382;
                } else {
                    if (this.field1312 == 1) {
                        if ((this.field1314 & 2) == 2) {
                            this.field1280[this.field1382] = this.field1315 + " @yel@" + var6;
                            this.field1248[this.field1382] = 240;
                            this.field1249[this.field1382] = arg4;
                            this.field1246[this.field1382] = arg3;
                            this.field1247[this.field1382] = arg1;
                            ++this.field1382;
                            return;
                        }
                    } else {
                        if (arg2.field1011 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg2.field1011[var7] != null && !arg2.field1011[var7].equalsIgnoreCase("attack")) {
                                    this.field1280[this.field1382] = arg2.field1011[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1248[this.field1382] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1248[this.field1382] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1248[this.field1382] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1248[this.field1382] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1248[this.field1382] = 793;
                                    }
                                    this.field1249[this.field1382] = arg4;
                                    this.field1246[this.field1382] = arg3;
                                    this.field1247[this.field1382] = arg1;
                                    ++this.field1382;
                                }
                            }
                        }
                        if (arg2.field1011 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg2.field1011[var8] != null && arg2.field1011[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg2.field1016 > field1525.field464) {
                                        var9 = 2000;
                                    }
                                    this.field1280[this.field1382] = arg2.field1011[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1248[this.field1382] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1248[this.field1382] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1248[this.field1382] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1248[this.field1382] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1248[this.field1382] = var9 + 793;
                                    }
                                    this.field1249[this.field1382] = arg4;
                                    this.field1246[this.field1382] = arg3;
                                    this.field1247[this.field1382] = arg1;
                                    ++this.field1382;
                                }
                            }
                        }
                        this.field1280[this.field1382] = "Examine @yel@" + var6;
                        this.field1248[this.field1382] = 1714;
                        this.field1249[this.field1382] = arg4;
                        this.field1246[this.field1382] = arg3;
                        this.field1247[this.field1382] = arg1;
                        ++this.field1382;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method560(byte arg0) {
        if (arg0 != -90) {
            this.field1416.method219(222);
        }
        this.field1485 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1553) {
                ++this.field1578;
                this.method434(75);
                this.method434(75);
                this.method460(true);
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
        this.field1485 = false;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JZ)V")
    public final void method561(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1611 >= 100) {
                this.method536(1, "", 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method304((byte) 8, JString.method301(this.field1649, arg0));
                for (int var5 = 0; var5 < this.field1611; ++var5) {
                    if (this.field1550[var5] == arg0) {
                        this.method536(1, "", 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1240; ++var6) {
                    if (this.field1604[var6] == arg0) {
                        this.method536(1, "", 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1550[this.field1611++] = arg0;
                this.field1587 = true;
                this.field1416.method218((byte) 1, 32);
                if (arg1) {
                    field1268 = this.field1407.method295();
                }
                this.field1416.method225(arg0, field1629);
            }
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method562(int arg0) {
        int var2 = this.field1254;
        int var3 = this.field1255;
        int var4 = this.field1256;
        int var5 = this.field1257;
        int var6 = 6116423;
        Pix2D.method157(var2, var4, 4, var6, var5, var3);
        Pix2D.method157(var2 + 1, var4 - 2, 4, 0, 16, var3 + 1);
        Pix2D.method158(var4 - 2, var5 - 19, var2 + 1, var3 + 18, 22320, 0);
        this.field1451.method206(-49546, "Choose Option", var6, var2 + 3, var3 + 14);
        int var7 = 58 / arg0;
        int var8 = super.field22;
        int var9 = super.field23;
        if (this.field1253 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (this.field1253 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (this.field1253 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < this.field1382; ++var10) {
            int var11 = (this.field1382 - 1 - var10) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            this.field1451.method210(var11, true, var2 + 3, 16365, var12, this.field1280[var10]);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1349[var1] = var0 - 1;
            var0 += var0;
        }
        field1438 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1457 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1489 = true;
        field1504 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1504[var3] = var2 / 4;
        }
        field1544 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1629 = true;
        field1640 = 1000;
    }
}
