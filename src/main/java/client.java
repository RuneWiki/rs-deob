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

    @OriginalMember(owner = "client", name = "L", descriptor = "B")
    private byte field1214 = 5;

    @OriginalMember(owner = "client", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field1215 = new String[5];

    @OriginalMember(owner = "client", name = "N", descriptor = "[Z")
    private boolean[] field1216 = new boolean[5];

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1217 = 443;

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field1220 = new int[50];

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1222 = 477;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field1226 = new int[7];

    @OriginalMember(owner = "client", name = "db", descriptor = "[[[Lob;")
    private LinkList[][][] field1232 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[J")
    private long[] field1233 = new long[100];

    @OriginalMember(owner = "client", name = "gb", descriptor = "Z")
    private boolean field1235 = false;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1241 = 3353893;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[Ljava/lang/String;")
    private String[] field1249 = new String[200];

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1251 = 2;

    @OriginalMember(owner = "client", name = "xb", descriptor = "B")
    private byte field1252 = 3;

    @OriginalMember(owner = "client", name = "zb", descriptor = "[I")
    private int[] field1254 = new int[4000];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[I")
    private int[] field1255 = new int[4000];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field1257 = false;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Llb;")
    private Packet field1259 = Packet.method212(-7939, 1);

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private int[] field1260 = new int[5];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1261 = -43664;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "B")
    private byte field1262 = -120;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Z")
    private boolean field1267 = false;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Ld;")
    private Component field1277 = new Component();

    @OriginalMember(owner = "client", name = "qc", descriptor = "Z")
    private boolean field1297 = true;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field1299 = new int[33];

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field1300 = new int[Stats.field1149];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field1301 = new int[9];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1305 = 1;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Z")
    private boolean field1314 = false;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Z")
    private boolean field1315 = false;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "B")
    private byte field1318 = 90;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field1319 = new int[256];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field1320 = new int[5];

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    public boolean field1321 = false;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field1322 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[Ljb;")
    private Pix8[] field1330 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ad", descriptor = "Z")
    private boolean field1333 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Lob;")
    private LinkList field1340 = new LinkList(-822);

    @OriginalMember(owner = "client", name = "ld", descriptor = "Z")
    private boolean field1344 = false;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field1346 = true;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1347 = 78;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Ljava/lang/String;")
    private String field1348 = "";

    @OriginalMember(owner = "client", name = "qd", descriptor = "Ljava/lang/String;")
    private String field1349 = "";

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1350 = -1;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[Lib;")
    private Pix32[] field1351 = new Pix32[20];

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1357 = -501;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[Lib;")
    private Pix32[] field1359 = new Pix32[100];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Z")
    public boolean field1361 = true;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1362 = 12122;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1363 = -1;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[I")
    private int[] field1364 = new int[100];

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[Ljava/lang/String;")
    private String[] field1365 = new String[100];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[Ljava/lang/String;")
    private String[] field1366 = new String[100];

    @OriginalMember(owner = "client", name = "Id", descriptor = "Ljava/lang/String;")
    private String field1367 = "";

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[Ljb;")
    private Pix8[] field1368 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    private int[] field1370 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field1372 = false;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "B")
    private byte field1374 = 0;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "B")
    private byte field1375 = 86;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field1384 = new int[5];

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    private boolean field1387 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private final int[] field1389 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field1390 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "Z")
    private boolean field1392 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1395 = new CRC32();

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field1398 = true;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Ljava/lang/String;")
    private String field1400 = "";

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1401 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "re", descriptor = "[[I")
    private int[][] field1402 = new int[104][104];

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1404 = new int[1000];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field1405 = new int[1000];

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field1414 = new int[5];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1415 = -1;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1416 = -1;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[Lib;")
    private Pix32[] field1417 = new Pix32[20];

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1419 = 833;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1423 = 5063219;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Ljava/lang/String;")
    private String field1425 = "";

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1427 = -1;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1429 = 3;

    @OriginalMember(owner = "client", name = "Te", descriptor = "B")
    private byte field1430 = 9;

    @OriginalMember(owner = "client", name = "We", descriptor = "Z")
    private boolean field1433 = false;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[Ljb;")
    private Pix8[] field1434 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Ljava/lang/String;")
    private String field1435 = "";

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[[I")
    private int[][] field1436 = new int[104][104];

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private boolean field1440 = false;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1446 = -1;

    @OriginalMember(owner = "client", name = "mf", descriptor = "B")
    private byte field1448 = -123;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1449 = 436;

    @OriginalMember(owner = "client", name = "of", descriptor = "B")
    private byte field1450 = 111;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1452 = -593;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1453 = -1;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field1464 = new int[50];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field1469 = false;

    @OriginalMember(owner = "client", name = "If", descriptor = "[I")
    private int[] field1470 = new int[33];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    public int[] field1481 = new int[1000];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private final int field1483 = 100;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field1484 = new int[100];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field1485 = true;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "B")
    private byte field1486 = 7;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "B")
    private byte field1487 = 6;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1489 = new int[200];

    @OriginalMember(owner = "client", name = "ig", descriptor = "Z")
    private boolean field1496 = true;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1497 = -1;

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field1499 = new int[50];

    @OriginalMember(owner = "client", name = "mg", descriptor = "[[I")
    private int[][] field1500 = new int[104][104];

    @OriginalMember(owner = "client", name = "pg", descriptor = "B")
    private byte field1503 = -44;

    @OriginalMember(owner = "client", name = "qg", descriptor = "[B")
    private byte[] field1504 = new byte[16384];

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field1505 = new int[5];

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1507 = 50;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field1508 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field1509 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field1510 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field1511 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "yg", descriptor = "[I")
    private int[] field1512 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field1513 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field1514 = new int[this.field1507];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[Ljava/lang/String;")
    private String[] field1515 = new String[this.field1507];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1519 = -1;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Z")
    private boolean field1520 = false;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[Ljc;")
    private CollisionMap[] field1521 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Llb;")
    private Packet field1522 = Packet.method212(-7939, 1);

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[I")
    private int[] field1523 = new int[2000];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1526 = -1;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1529 = 5;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[Ljava/lang/String;")
    private String[] field1530 = new String[500];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "B")
    private byte field1533 = 86;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1534 = 2048;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1535 = 2047;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[Lab;")
    private PlayerEntity[] field1536 = new PlayerEntity[this.field1534];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    public int[] field1538 = new int[this.field1534];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1540 = new int[this.field1534];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[Llb;")
    private Packet[] field1541 = new Packet[this.field1534];

    @OriginalMember(owner = "client", name = "eh", descriptor = "Z")
    private boolean field1544 = false;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1547 = -1;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Llb;")
    private Packet field1551 = Packet.method212(-7939, 1);

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1552 = new int[151];

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field1557 = false;

    @OriginalMember(owner = "client", name = "wh", descriptor = "Z")
    private boolean field1562 = false;

    @OriginalMember(owner = "client", name = "xh", descriptor = "Ljava/lang/String;")
    private String field1563 = "";

    @OriginalMember(owner = "client", name = "yh", descriptor = "Ljava/lang/String;")
    private String field1564 = "";

    @OriginalMember(owner = "client", name = "zh", descriptor = "Z")
    private boolean field1565 = true;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1566 = new int[151];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field1568 = true;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1569 = new int[Stats.field1149];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Lob;")
    private LinkList field1572 = new LinkList(-822);

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1574 = 2301979;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[J")
    private long[] field1575 = new long[200];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[Z")
    private boolean[] field1577 = new boolean[5];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Z")
    private boolean field1584 = false;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field1585 = false;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1587 = 1;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field1588 = new int[2000];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1589 = -1;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field1590 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field1591 = false;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1592 = -48671;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1593 = 7759444;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Ljava/lang/String;")
    private String field1598 = "";

    @OriginalMember(owner = "client", name = "ii", descriptor = "Z")
    private boolean field1600 = true;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field1607 = new int[500];

    @OriginalMember(owner = "client", name = "qi", descriptor = "[I")
    private int[] field1608 = new int[500];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field1609 = new int[500];

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field1610 = new int[500];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[Lib;")
    private Pix32[] field1620 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1621 = 128;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1625 = 814;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[Lib;")
    private Pix32[] field1631 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1632 = -1;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1634 = 2;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[Lvb;")
    public FileStream[] field1641 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field1642 = true;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Lob;")
    private LinkList field1644 = new LinkList(-822);

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1658 = -1;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1663 = 2;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field1665 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "B")
    private byte field1667 = -111;

    @OriginalMember(owner = "client", name = "zj", descriptor = "[I")
    private int[] field1669 = new int[Stats.field1149];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[Lz;")
    private NpcEntity[] field1675 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    public int[] field1677 = new int[16384];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Z")
    private boolean field1678 = false;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    private boolean field1681 = false;

    @OriginalMember(owner = "client", name = "U", descriptor = "Ljava/lang/String;")
    private static String field1223 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private static int[] field1225 = new int[32];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private static int field1317;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private static int field1356;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    private static boolean field1376;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1428;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1466;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "B")
    private static byte field1518;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[I")
    public static final int[] field1550;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private static int field1640;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private static int[] field1652;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field1653;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Z")
    private static boolean field1655;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[[I")
    public static final int[][] field1657;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private static int field1296;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private static int field1316;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private static int field1385;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private static int field1397;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private static int field1412;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private static int field1413;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private static int field1444;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field1468;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private static int field1517;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private static int field1548;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private static int field1553;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private static int field1567;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private static int field1573;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private static int field1611;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field1643;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private static int field1648;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private static int field1651;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client", name = "cc", descriptor = "J")
    private long field1283;

    @OriginalMember(owner = "client", name = "hg", descriptor = "J")
    private long field1495;

    @OriginalMember(owner = "client", name = "dh", descriptor = "J")
    private long field1543;

    @OriginalMember(owner = "client", name = "cj", descriptor = "J")
    public long field1646;

    @OriginalMember(owner = "client", name = "dj", descriptor = "J")
    private long field1647;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Le;")
    private ClientStream field1524;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Lwb;")
    private Isaac field1360;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lxb;")
    private Jagfile field1358;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Lfc;")
    public MouseTracking field1576;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Lub;")
    private OnDemand field1431;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Lib;")
    private Pix32 field1307;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Lib;")
    private Pix32 field1308;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Lib;")
    private Pix32 field1380;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Lib;")
    private Pix32 field1381;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Lib;")
    private Pix32 field1443;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lib;")
    private Pix32 field1475;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Lib;")
    private Pix32 field1476;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Lib;")
    private Pix32 field1501;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lib;")
    private Pix32 field1542;

    @OriginalMember(owner = "client", name = "li", descriptor = "Lib;")
    private Pix32 field1603;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Lib;")
    private Pix32 field1604;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Lib;")
    private Pix32 field1605;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lib;")
    private Pix32 field1606;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljb;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Ljb;")
    private Pix8 field1292;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Ljb;")
    private Pix8 field1293;

    @OriginalMember(owner = "client", name = "nc", descriptor = "Ljb;")
    private Pix8 field1294;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Ljb;")
    private Pix8 field1295;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Ljb;")
    private Pix8 field1570;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Ljb;")
    private Pix8 field1571;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Ljb;")
    private Pix8 field1594;

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljb;")
    private Pix8 field1595;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Ljb;")
    private Pix8 field1596;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Ljb;")
    private Pix8 field1617;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Ljb;")
    private Pix8 field1618;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Ljb;")
    private Pix8 field1619;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljb;")
    private Pix8 field1626;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Ljb;")
    private Pix8 field1627;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Ljb;")
    private Pix8 field1628;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Ljb;")
    private Pix8 field1629;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Ljb;")
    private Pix8 field1630;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Ljb;")
    private Pix8 field1679;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "Ljb;")
    private Pix8 field1680;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Lkb;")
    private PixFont field1491;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Lkb;")
    private PixFont field1492;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Lkb;")
    private PixFont field1493;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Lkb;")
    private PixFont field1494;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Lqb;")
    private PixMap field1268;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Lqb;")
    private PixMap field1269;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Lqb;")
    private PixMap field1270;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Lqb;")
    private PixMap field1271;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Lqb;")
    private PixMap field1272;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Lqb;")
    private PixMap field1273;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Lqb;")
    private PixMap field1274;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Lqb;")
    private PixMap field1275;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Lqb;")
    private PixMap field1276;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Lqb;")
    private PixMap field1278;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Lqb;")
    private PixMap field1279;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Lqb;")
    private PixMap field1280;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Lqb;")
    private PixMap field1281;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Lqb;")
    private PixMap field1406;

    @OriginalMember(owner = "client", name = "we", descriptor = "Lqb;")
    private PixMap field1407;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Lqb;")
    private PixMap field1408;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Lqb;")
    private PixMap field1455;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Lqb;")
    private PixMap field1456;

    @OriginalMember(owner = "client", name = "vf", descriptor = "Lqb;")
    private PixMap field1457;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Lqb;")
    private PixMap field1458;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Lqb;")
    private PixMap field1459;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Lqb;")
    private PixMap field1460;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Lqb;")
    private PixMap field1461;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Lqb;")
    private PixMap field1462;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Lqb;")
    private PixMap field1463;

    @OriginalMember(owner = "client", name = "yj", descriptor = "Lab;")
    public static PlayerEntity field1668;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Lr;")
    private World3D field1331;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Ljava/lang/String;")
    public String field1231;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Ljava/lang/String;")
    private String field1244;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Ljava/lang/String;")
    private String field1245;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Ljava/lang/String;")
    public String field1615;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Ljava/net/Socket;")
    private Socket field1420;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Z")
    private static boolean field1342;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Z")
    public static boolean field1583;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Z")
    private static boolean field1656;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "Z")
    public static boolean field1682;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field1246;

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field1247;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1248;

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field1352;

    @OriginalMember(owner = "client", name = "ud", descriptor = "[I")
    private int[] field1353;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field1354;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field1355;

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field1393;

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1527;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1528;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field1660;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1661;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[Ljb;")
    private Pix8[] field1645;

    @OriginalMember(owner = "client", name = "vc", descriptor = "[[B")
    private byte[][] field1302;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[[B")
    private byte[][] field1369;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[[[B")
    private byte[][][] field1243;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[[[I")
    private int[][][] field1373;

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Z")
    public final boolean method422(int arg0, int arg1, int arg2) {
        int var4 = 43 / arg1;
        boolean var5 = false;
        Component var6 = Component.field68[arg2];
        for (int var7 = 0; var7 < var6.field90.length && var6.field90[var7] != -1; ++var7) {
            Component var8 = Component.field68[var6.field90[var7]];
            if (var8.field75 == 1) {
                var5 |= this.method422(arg0, 753, var8.field73);
            }
            if (var8.field75 == 6 && (var8.field121 != -1 || var8.field122 != -1)) {
                boolean var9 = this.method542(var8, 717);
                int var10;
                if (var9) {
                    var10 = var8.field122;
                } else {
                    var10 = var8.field121;
                }
                if (var10 != -1) {
                    SeqType var11 = SeqType.field1133[var10];
                    var8.field72 += arg0;
                    while (var8.field72 > var11.method375(var8.field71, 41645)) {
                        var8.field72 -= var11.method375(var8.field71, 41645) + 1;
                        ++var8.field71;
                        if (var8.field71 >= var11.field1134) {
                            var8.field71 -= var11.field1138;
                            if (var8.field71 < 0 || var8.field71 >= var11.field1134) {
                                var8.field71 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method423(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.field1671;
        int var4 = this.field1672;
        int var5 = this.field1673;
        int var6 = this.field1674;
        int var7 = 6116423;
        Pix2D.method156(var6, var7, var5, var3, 0, var4);
        Pix2D.method156(16, 0, var5 - 2, var3 + 1, 0, var4 + 1);
        Pix2D.method157(var5 - 2, 0, var6 - 19, var3 + 1, var4 + 18, 394);
        this.field1493.method203(var3 + 3, "Choose Option", var7, var4 + 14, true);
        int var8 = super.field22;
        int var9 = super.field23;
        if (this.field1670 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (this.field1670 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (this.field1670 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < this.field1396; ++var10) {
            int var11 = (this.field1396 - 1 - var10) * 15 + var4 + 31;
            int var12 = 16777215;
            if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            this.field1493.method205(this.field1530[var10], this.field1449, true, var11, var3 + 3, var12);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (this.field1455 == null) {
            super.field15 = null;
            this.field1281 = null;
            this.field1279 = null;
            this.field1278 = null;
            this.field1280 = null;
            this.field1406 = null;
            this.field1407 = null;
            this.field1408 = null;
            this.field1458 = new PixMap(265, field1356, 128, this.method11(field1518));
            Pix2D.method154(8);
            this.field1459 = new PixMap(265, field1356, 128, this.method11(field1518));
            Pix2D.method154(8);
            this.field1455 = new PixMap(171, field1356, 509, this.method11(field1518));
            Pix2D.method154(8);
            this.field1456 = new PixMap(132, field1356, 360, this.method11(field1518));
            Pix2D.method154(8);
            if (arg0 != -43664) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field1457 = new PixMap(200, field1356, 360, this.method11(field1518));
            Pix2D.method154(8);
            this.field1460 = new PixMap(238, field1356, 202, this.method11(field1518));
            Pix2D.method154(8);
            this.field1461 = new PixMap(238, field1356, 203, this.method11(field1518));
            Pix2D.method154(8);
            this.field1462 = new PixMap(94, field1356, 74, this.method11(field1518));
            Pix2D.method154(8);
            this.field1463 = new PixMap(94, field1356, 75, this.method11(field1518));
            Pix2D.method154(8);
            if (this.field1358 != null) {
                this.method467(0);
                this.method499(4);
            }
            this.field1333 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIII)V")
    public final void method425(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        this.field1321 &= arg1;
        if (var8 != 0) {
            int var13 = Model.field599[var8];
            int var14 = Model.field600[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field599[var9];
            int var17 = Model.field600[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1236 = arg4 - var10;
        this.field1237 = arg3 - var11;
        this.field1238 = arg0 - var12;
        this.field1239 = arg2;
        this.field1240 = arg5;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method426(int arg0) {
        if (arg0 != 31037) {
            this.field1259.method214(2);
        }
        this.method482(3);
        if (this.field1561 == 1) {
            this.field1631[this.field1560 / 100].method185(this.field1486, this.field1558 - 8 - 4, this.field1559 - 8 - 4);
        }
        if (this.field1561 == 2) {
            this.field1631[this.field1560 / 100 + 4].method185(this.field1486, this.field1558 - 8 - 4, this.field1559 - 8 - 4);
            ++field1517;
            if (field1517 > 57) {
                field1517 = 0;
                this.field1259.method213((byte) 117, 100);
            }
        }
        if (this.field1519 != -1) {
            this.method422(this.field1391, 753, this.field1519);
            this.method535(0, Component.field68[this.field1519], 0, 0, (byte) 0);
        }
        if (this.field1453 != -1) {
            this.method422(this.field1391, 753, this.field1453);
            this.method535(0, Component.field68[this.field1453], 0, 0, (byte) 0);
        }
        this.method515(940);
        if (!this.field1267) {
            this.method476(4);
            this.method439(-303);
        } else if (this.field1670 == 0) {
            this.method423(-593);
        }
        if (this.field1234 == 1) {
            this.field1417[1].method185(this.field1486, 472, 296);
        }
        if (this.field1219 != 0) {
            int var2 = this.field1219 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1492.method203(4, "System update in: " + var3 + ":0" + var4, 16776960, 329, true);
            } else {
                this.field1492.method203(4, "System update in: " + var3 + ":" + var4, 16776960, 329, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method427(byte arg0) {
        try {
            this.field1350 = -1;
            this.field1340.method247();
            this.field1572.method247();
            Pix3D.method166(-18849);
            this.method533(-501);
            this.field1331.method50((byte) 52);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1521[var2].method352((byte) 5);
            }
            System.gc();
            World var3 = new World(104, this.field1373, 104, -127, this.field1243);
            int var4 = this.field1302.length;
            World.field42 = World3D.field282;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1246[var5] >> 8;
                int var7 = this.field1246[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field42 = false;
                }
            }
            if (World.field42) {
                this.field1331.method51((byte) 4, this.field1478);
            } else {
                this.field1331.method51((byte) 4, 0);
            }
            this.field1259.method213((byte) 117, 120);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1246[var8] >> 8) * 64 - this.field1471;
                int var10 = (this.field1246[var8] & 255) * 64 - this.field1472;
                byte[] var11 = this.field1302[var8];
                if (var11 != null) {
                    var3.method15(false, (this.field1338 - 6) * 8, var11, var10, (this.field1339 - 6) * 8, var9);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1246[var12] >> 8) * 64 - this.field1471;
                int var14 = (this.field1246[var12] & 255) * 64 - this.field1472;
                byte[] var15 = this.field1302[var12];
                if (var15 == null && this.field1339 < 800) {
                    var3.method14(var14, var13, 587, 64, 64);
                }
            }
            this.field1259.method213((byte) 117, 120);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1369[var16];
                if (var17 != null) {
                    int var18 = (this.field1246[var16] >> 8) * 64 - this.field1471;
                    int var19 = (this.field1246[var16] & 255) * 64 - this.field1472;
                    var3.method18(var19, var17, false, this.field1331, var18, this.field1521);
                }
            }
            this.field1259.method213((byte) 117, 120);
            var3.method20(this.field1521, false, this.field1331);
            this.field1280.method253(field1376);
            this.field1259.method213((byte) 117, 120);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method460(var20, var21);
                }
            }
            this.method497((byte) 4);
        } catch (Exception var34) {
        }
        LocType.field987.method103();
        if (field1656 && signlink.cache_dat != null) {
            int var23 = this.field1431.method267(field1651, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1431.method272(var24, (byte) 9);
                if ((var25 & 121) == 0) {
                    Model.method124(var24, -6375);
                }
            }
        }
        System.gc();
        Pix3D.method167(20, 2972);
        this.field1431.method278((byte) 41);
        int var26 = (this.field1338 - 6) / 8 - 1;
        int var27 = (this.field1338 + 6) / 8 + 1;
        int var28 = (this.field1339 - 6) / 8 - 1;
        int var29 = (this.field1339 + 6) / 8 + 1;
        if (arg0 != 116) {
            this.field1259.method214(154);
        }
        if (this.field1585) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1431.method269(0, var30, false, var31);
                    if (var32 != -1) {
                        this.field1431.method279(-21322, 3, var32);
                    }
                    int var33 = this.field1431.method269(1, var30, false, var31);
                    if (var33 != -1) {
                        this.field1431.method279(-21322, 3, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method428(int arg0, int arg1) {
        int var3 = 15 / arg0;
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method429(byte arg0) {
        if (this.field1311 == 0) {
            int var2 = super.field28;
            if (arg0 == 1) {
                boolean var3 = false;
                if (this.field1612 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                    var2 = 0;
                }
                if (this.field1267) {
                    if (var2 != 1) {
                        int var4 = super.field22;
                        int var5 = super.field23;
                        if (this.field1670 == 0) {
                            var4 -= 4;
                            var5 -= 4;
                        }
                        if (this.field1670 == 1) {
                            var4 -= 553;
                            var5 -= 205;
                        }
                        if (this.field1670 == 2) {
                            var4 -= 17;
                            var5 -= 357;
                        }
                        if (var4 < this.field1671 - 10 || var4 > this.field1673 + this.field1671 + 10 || var5 < this.field1672 - 10 || var5 > this.field1674 + this.field1672 + 10) {
                            this.field1267 = false;
                            if (this.field1670 == 1) {
                                this.field1344 = true;
                            }
                            if (this.field1670 == 2) {
                                this.field1525 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var6 = this.field1671;
                        int var7 = this.field1672;
                        int var8 = this.field1673;
                        int var9 = super.field29;
                        int var10 = super.field30;
                        if (this.field1670 == 0) {
                            var9 -= 4;
                            var10 -= 4;
                        }
                        if (this.field1670 == 1) {
                            var9 -= 553;
                            var10 -= 205;
                        }
                        if (this.field1670 == 2) {
                            var9 -= 17;
                            var10 -= 357;
                        }
                        int var11 = -1;
                        for (int var12 = 0; var12 < this.field1396; ++var12) {
                            int var13 = (this.field1396 - 1 - var12) * 15 + var7 + 31;
                            if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                                var11 = var12;
                            }
                        }
                        if (var11 != -1) {
                            this.method468((byte) 6, var11);
                        }
                        this.field1267 = false;
                        if (this.field1670 == 1) {
                            this.field1344 = true;
                        }
                        if (this.field1670 == 2) {
                            this.field1525 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1396 > 0) {
                        int var14 = this.field1609[this.field1396 - 1];
                        if (var14 == 582 || var14 == 113 || var14 == 555 || var14 == 331 || var14 == 354 || var14 == 694 || var14 == 962 || var14 == 795 || var14 == 681 || var14 == 100 || var14 == 102 || var14 == 1328) {
                            int var15 = this.field1607[this.field1396 - 1];
                            int var16 = this.field1608[this.field1396 - 1];
                            Component var17 = Component.field68[var16];
                            if (var17.field95 || var17.field98) {
                                this.field1562 = false;
                                this.field1666 = 0;
                                this.field1309 = var16;
                                this.field1310 = var15;
                                this.field1311 = 2;
                                this.field1312 = super.field29;
                                this.field1313 = super.field30;
                                if (Component.field68[var16].field74 == this.field1453) {
                                    this.field1311 = 1;
                                }
                                if (Component.field68[var16].field74 == this.field1427) {
                                    this.field1311 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1465 == 1 || this.method473(this.field1396 - 1, (byte) 9)) && this.field1396 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1396 > 0) {
                        this.method468((byte) 6, this.field1396 - 1);
                    }
                    if (var2 != 2 || this.field1396 <= 0) {
                        return;
                    }
                    this.method503(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method430(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1531; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1249[var3])) {
                    return true;
                }
            }
            while (arg0 >= 0) {
                this.field1259.method214(39);
            }
            return arg1.equalsIgnoreCase(field1668.field457);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1451 && !this.field1590 && !this.field1314) {
            ++field1218;
            if (!this.field1321) {
                this.method495(3);
            } else {
                this.method530(this.field1529);
            }
            this.method431(0);
            if (arg0 != 0) {
                this.method6();
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            OnDemandRequest var3 = this.field1431.method276();
            if (var3 == null) {
                return;
            }
            if (var3.field722 == 0) {
                Model.method123(var3.field723, var3.field724, 6);
                if ((this.field1431.method272(var3.field723, (byte) 9) & 98) != 0) {
                    this.field1344 = true;
                    if (this.field1427 != -1) {
                        this.field1525 = true;
                    }
                }
            }
            if (var3.field722 == 1 && var3.field724 != null) {
                AnimFrame.method45(-958, var3.field724);
            }
            if (var3.field722 == 2 && this.field1599 == var3.field723 && var3.field724 != null) {
                this.method484(this.field1600, var3.field724, 7);
            }
            if (var3.field722 == 3 && this.field1545 == 1) {
                for (int var4 = 0; var4 < this.field1302.length; ++var4) {
                    if (this.field1247[var4] == var3.field723) {
                        this.field1302[var4] = var3.field724;
                        if (var3.field724 == null) {
                            this.field1247[var4] = -1;
                        }
                        break;
                    }
                    if (this.field1248[var4] == var3.field723) {
                        this.field1369[var4] = var3.field724;
                        if (var3.field724 == null) {
                            this.field1248[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field722 == 93 && this.field1431.method271(var3.field723, 1)) {
                World.method17((byte) -47, new Packet(var3.field724, (byte) 1), this.field1431);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method432(Component arg0, byte arg1) {
        int var3 = arg0.field77;
        if (arg1 != 15) {
            this.field1259.method214(108);
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1530[this.field1396] = "Remove @whi@" + arg0.field109;
                this.field1609[this.field1396] = 884;
                ++this.field1396;
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
            this.field1530[this.field1396] = "Remove @whi@" + this.field1249[var3];
            this.field1609[this.field1396] = 513;
            ++this.field1396;
            this.field1530[this.field1396] = "Message @whi@" + this.field1249[var3];
            this.field1609[this.field1396] = 902;
            ++this.field1396;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 274);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1653 = Integer.parseInt(arg0[0]);
                field1654 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method462(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method481(10969);
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
                var1.method1(false, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method433(int arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field710 + 21 < arg2 * 8) {
                int var4 = arg1.method235(14, (byte) -96);
                if (var4 != 16383) {
                    if (this.field1675[var4] == null) {
                        this.field1675[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1675[var4];
                    this.field1677[this.field1676++] = var4;
                    var5.field442 = field1218;
                    var5.field453 = NpcType.method335(arg1.method235(11, (byte) -96));
                    var5.field401 = var5.field453.field1006;
                    var5.field445 = var5.field453.field1028;
                    var5.field404 = var5.field453.field1010;
                    var5.field405 = var5.field453.field1011;
                    var5.field406 = var5.field453.field1012;
                    var5.field407 = var5.field453.field1013;
                    var5.field402 = var5.field453.field1009;
                    int var6 = arg1.method235(5, (byte) -96);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method235(5, (byte) -96);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method235(1, (byte) -96);
                    var5.method110(field1668.field447[0] + var6, var8 == 1, false, field1668.field448[0] + var7);
                    int var9 = arg1.method235(1, (byte) -96);
                    if (var9 == 1) {
                        this.field1540[this.field1539++] = var4;
                    }
                    continue;
                }
            }
            arg1.method236(941);
            if (arg0 >= 0) {
                field1651 = this.field1360.method290();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method434(byte arg0, int arg1) {
        if (this.field1375 != arg0) {
            this.method6();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method435(int arg0) {
        for (int var2 = 0; var2 < this.field1345; ++var2) {
            if (this.field1499[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1464[var2] == this.field1658 && this.field1220[var2] == this.field1547) {
                        if (!this.method454(0)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method314(this.field1464[var2], this.field1220[var2], (byte) 5);
                        if (System.currentTimeMillis() + (long) (var4.field709 / 22) > (long) (this.field1290 / 22) + this.field1495) {
                            this.field1290 = var4.field709;
                            this.field1495 = System.currentTimeMillis();
                            if (this.method554(var4.field708, var4.field709, (byte) 9)) {
                                this.field1658 = this.field1464[var2];
                                this.field1547 = this.field1220[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1499[var2] != -5) {
                    this.field1499[var2] = -5;
                } else {
                    --this.field1345;
                    for (int var6 = var2; var6 < this.field1345; ++var6) {
                        this.field1464[var6] = this.field1464[var6 + 1];
                        this.field1220[var6] = this.field1220[var6 + 1];
                        this.field1499[var6] = this.field1499[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1499[var2]--;
            }
        }
        if (arg0 != 0) {
            this.field1636 = -1;
        }
        if (this.field1343 > 0) {
            this.field1343 -= 20;
            if (this.field1343 < 0) {
                this.field1343 = 0;
            }
            if (this.field1343 == 0 && this.field1485 && !field1656) {
                this.field1599 = this.field1446;
                this.field1600 = true;
                this.field1431.method274(2, this.field1599);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method436(int arg0, int arg1) {
        label33: while (true) {
            if (arg1 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label33;
                    }
                    ++var6;
                }
            }
            Component var3 = Component.field68[arg0];
            for (int var4 = 0; var4 < var3.field90.length && var3.field90[var4] != -1; ++var4) {
                Component var5 = Component.field68[var3.field90[var4]];
                if (var5.field75 == 1) {
                    this.method436(var5.field73, -147);
                }
                var5.field71 = 0;
                var5.field72 = 0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;II)V")
    public final void method437(PathingEntity arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.method6();
        }
        this.method438(361, arg0.field397, arg0.field398, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            this.field1232 = null;
        }
        if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
            int var5 = this.method458(arg1, arg2, 0, this.field1478) - arg3;
            int var6 = arg1 - this.field1236;
            int var7 = var5 - this.field1237;
            int var8 = arg2 - this.field1238;
            int var9 = Model.field599[this.field1239];
            int var10 = Model.field600[this.field1239];
            int var11 = Model.field599[this.field1240];
            int var12 = Model.field600[this.field1240];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1415 = (var13 << 9) / var17 + Pix3D.field633;
                this.field1416 = (var16 << 9) / var17 + Pix3D.field634;
            } else {
                this.field1415 = -1;
                this.field1416 = -1;
            }
        } else {
            this.field1415 = -1;
            this.field1416 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (this.field1396 >= 2 || this.field1227 != 0 || this.field1612 != 0) {
            String var2;
            if (this.field1227 == 1 && this.field1396 < 2) {
                var2 = "Use " + this.field1231 + " with...";
            } else if (this.field1612 == 1 && this.field1396 < 2) {
                var2 = this.field1615 + "...";
            } else {
                var2 = this.field1530[this.field1396 - 1];
            }
            if (this.field1396 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1396 - 2) + " more options";
            }
            this.field1493.method206(this.field1362, 4, var2, 15, 16777215, field1218 / 1000, true);
            if (arg0 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method440(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1676; ++var3) {
            NpcEntity var4 = this.field1675[this.field1677[var3]];
            int var5 = (this.field1677[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(0) && var4.field453.field1024 == arg0) {
                int var6 = var4.field397 >> 7;
                int var7 = var4.field398 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field401 == 1 && (var4.field397 & 127) == 64 && (var4.field398 & 127) == 64) {
                        if (this.field1436[var6][var7] == this.field1284) {
                            continue;
                        }
                        this.field1436[var6][var7] = this.field1284;
                    }
                    this.field1331.method61(this.method458(var4.field397, var4.field398, 0, this.field1478), var4, var4.field397, var5, var4.field398, (byte) 1, (var4.field401 - 1) * 64 + 60, var4.field399, this.field1478, var4.field400);
                }
            }
        }
        this.field1321 &= arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBLib;)V")
    public final void method441(int arg0, int arg1, byte arg2, Pix32 arg3) {
        if (this.field1667 != arg2) {
            this.field1315 = !this.field1315;
        }
        int var5 = this.field1633 + this.field1622 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = Model.field599[var5];
            int var8 = Model.field600[var5];
            int var9 = var7 * 256 / (this.field1586 + 256);
            int var10 = var8 * 256 / (this.field1586 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method191(945, var11 + 94 - arg3.field666 / 2 + 4, this.field1618, 83 - var12 - arg3.field667 / 2 - 4);
            } else {
                arg3.method185(this.field1486, var11 + 94 - arg3.field666 / 2 + 4, 83 - var12 - arg3.field667 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1524 != null) {
                this.field1524.method38();
            }
        } catch (Exception var2) {
        }
        this.field1524 = null;
        this.method486(33993);
        if (this.field1576 != null) {
            this.field1576.field991 = false;
        }
        this.field1576 = null;
        this.field1431.method266();
        this.field1431 = null;
        this.field1259 = null;
        this.field1522 = null;
        this.field1551 = null;
        this.field1246 = null;
        this.field1302 = null;
        this.field1369 = null;
        this.field1247 = null;
        this.field1248 = null;
        this.field1373 = null;
        this.field1243 = null;
        this.field1331 = null;
        this.field1521 = null;
        this.field1402 = null;
        this.field1500 = null;
        this.field1254 = null;
        this.field1255 = null;
        this.field1504 = null;
        this.field1278 = null;
        this.field1279 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1408 = null;
        this.field1268 = null;
        this.field1269 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1273 = null;
        this.field1274 = null;
        this.field1275 = null;
        this.field1276 = null;
        this.field1617 = null;
        this.field1618 = null;
        this.field1619 = null;
        this.field1594 = null;
        this.field1595 = null;
        this.field1596 = null;
        this.field1368 = null;
        this.field1291 = null;
        this.field1292 = null;
        this.field1293 = null;
        this.field1294 = null;
        this.field1295 = null;
        this.field1626 = null;
        this.field1627 = null;
        this.field1628 = null;
        this.field1629 = null;
        this.field1630 = null;
        this.field1501 = null;
        this.field1351 = null;
        this.field1417 = null;
        this.field1631 = null;
        this.field1603 = null;
        this.field1604 = null;
        this.field1605 = null;
        this.field1606 = null;
        this.field1434 = null;
        this.field1359 = null;
        this.field1436 = null;
        this.field1536 = null;
        this.field1538 = null;
        this.field1540 = null;
        this.field1541 = null;
        this.field1481 = null;
        this.field1675 = null;
        this.field1677 = null;
        this.field1232 = null;
        this.field1644 = null;
        this.field1572 = null;
        this.field1340 = null;
        this.field1607 = null;
        if (arg0 != 22257) {
            this.method6();
        }
        this.field1608 = null;
        this.field1609 = null;
        this.field1610 = null;
        this.field1530 = null;
        this.field1523 = null;
        this.field1404 = null;
        this.field1405 = null;
        this.field1620 = null;
        this.field1443 = null;
        this.field1249 = null;
        this.field1575 = null;
        this.field1489 = null;
        this.field1458 = null;
        this.field1459 = null;
        this.field1455 = null;
        this.field1456 = null;
        this.field1457 = null;
        this.field1460 = null;
        this.field1461 = null;
        this.field1462 = null;
        this.field1463 = null;
        this.method522(0);
        LocType.method324((byte) 1);
        NpcType.method334((byte) 1);
        ObjType.method340((byte) 1);
        FloType.field1098 = null;
        IdkType.field1113 = null;
        Component.field68 = null;
        UnkType.field1120 = null;
        SeqType.field1133 = null;
        SpotAnimType.field1154 = null;
        SpotAnimType.field1166 = null;
        VarpType.field1178 = null;
        super.field15 = null;
        PlayerEntity.field480 = null;
        Pix3D.method163((byte) 1);
        World3D.method49((byte) 1);
        Model.method121((byte) 1);
        AnimFrame.method46((byte) 1);
        System.gc();
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;I)I")
    public final int method442(boolean arg0, Component arg1, int arg2) {
        this.field1321 &= arg0;
        if (arg1.field83 != null && arg2 < arg1.field83.length) {
            try {
                int[] var4 = arg1.field83[arg2];
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
                        var9 = this.field1300[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1569[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1669[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field68[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1034 && (!ObjType.method341(var12).field1055 || field1655)) {
                            for (int var13 = 0; var13 < var11.field69.length; ++var13) {
                                if (var12 + 1 == var11.field69[var13]) {
                                    var9 += var11.field70[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1523[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1652[this.field1569[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1523[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1668.field463;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1149; ++var14) {
                            if (Stats.field1151[var14]) {
                                var9 += this.field1569[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field68[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1034 && (!ObjType.method341(var16).field1055 || field1655)) {
                            for (int var17 = 0; var17 < var15.field69.length; ++var17) {
                                if (var15.field69[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1256;
                    }
                    if (var8 == 12) {
                        var9 = this.field1337;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1523[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1170[var20];
                        int var22 = var21.field1172;
                        int var23 = var21.field1173;
                        int var24 = var21.field1174;
                        int var25 = field1225[var24 - var23];
                        var9 = this.field1523[var22] >> var23 & var25;
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
                        var9 = (field1668.field397 >> 7) + this.field1471;
                    }
                    if (var8 == 19) {
                        var9 = (field1668.field398 >> 7) + this.field1472;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)V")
    public final void method443(byte arg0, Component arg1) {
        int var3 = arg1.field77;
        if (this.field1448 == arg0) {
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field1531;
                    if (this.field1532 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg1.field109 = "";
                        arg1.field76 = 0;
                    } else {
                        if (this.field1489[var3] == 0) {
                            arg1.field109 = "@red@Offline";
                        } else if (this.field1489[var3] == field1653) {
                            arg1.field109 = "@gre@World-" + (this.field1489[var3] - 9);
                        } else {
                            arg1.field109 = "@yel@World-" + (this.field1489[var3] - 9);
                        }
                        arg1.field76 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field1531;
                    if (this.field1532 != 2) {
                        var6 = 0;
                    }
                    arg1.field87 = var6 * 15 + 20;
                    if (arg1.field87 <= arg1.field79) {
                        arg1.field87 = arg1.field79 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 >= this.field1377) {
                        arg1.field109 = "";
                        arg1.field76 = 0;
                    } else {
                        arg1.field109 = JString.method299(131, JString.method296(0, this.field1233[var3]));
                        arg1.field76 = 1;
                    }
                } else if (var3 == 503) {
                    arg1.field87 = this.field1377 * 15 + 20;
                    if (arg1.field87 <= arg1.field79) {
                        arg1.field87 = arg1.field79 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field124 = 150;
                    arg1.field125 = (int) (Math.sin((double) field1218 / 40.0D) * 256.0D) & 2047;
                    if (this.field1387) {
                        for (int var7 = 0; var7 < 7; ++var7) {
                            int var14 = this.field1226[var7];
                            if (var14 >= 0 && !IdkType.field1113[var14].method370(3)) {
                                return;
                            }
                        }
                        this.field1387 = false;
                        Model[] var8 = new Model[7];
                        int var9 = 0;
                        for (int var10 = 0; var10 < 7; ++var10) {
                            int var13 = this.field1226[var10];
                            if (var13 >= 0) {
                                var8[var9++] = IdkType.field1113[var13].method371((byte) 0);
                            }
                        }
                        Model var11 = new Model(var9, -643, var8);
                        for (int var12 = 0; var12 < 5; ++var12) {
                            if (this.field1505[var12] != 0) {
                                var11.method139(field1657[var12][0], field1657[var12][this.field1505[var12]]);
                                if (var12 == 1) {
                                    var11.method139(field1550[0], field1550[this.field1505[var12]]);
                                }
                            }
                        }
                        var11.method132(9);
                        var11.method133(SeqType.field1133[field1668.field402].field1135[0], -284);
                        var11.method142(64, 850, -30, -50, -30, true);
                        arg1.field117 = 5;
                        arg1.field118 = 0;
                        Component.method36(0, 0, var11, 5);
                    }
                } else if (var3 == 324) {
                    if (this.field1475 == null) {
                        this.field1475 = arg1.field115;
                        this.field1476 = arg1.field116;
                    }
                    if (this.field1398) {
                        arg1.field115 = this.field1476;
                    } else {
                        arg1.field115 = this.field1475;
                    }
                } else if (var3 == 325) {
                    if (this.field1475 == null) {
                        this.field1475 = arg1.field115;
                        this.field1476 = arg1.field116;
                    }
                    if (this.field1398) {
                        arg1.field115 = this.field1475;
                    } else {
                        arg1.field115 = this.field1476;
                    }
                } else if (var3 == 600) {
                    arg1.field109 = this.field1367;
                    if (field1218 % 20 < 10) {
                        arg1.field109 = arg1.field109 + "|";
                    } else {
                        arg1.field109 = arg1.field109 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field1282 >= 1) {
                            if (this.field1544) {
                                arg1.field111 = 16711680;
                                arg1.field109 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field111 = 16777215;
                                arg1.field109 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field109 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field1386 != 0) {
                            String var15;
                            if (this.field1426 == 0) {
                                var15 = "earlier today";
                            } else if (this.field1426 == 1) {
                                var15 = "yesterday";
                            } else {
                                var15 = this.field1426 + " days ago";
                            }
                            arg1.field109 = "You last logged in " + var15 + " from: " + signlink.dns;
                        } else {
                            arg1.field109 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field1303 == 0) {
                            arg1.field109 = "0 unread messages";
                            arg1.field111 = 16776960;
                        }
                        if (this.field1303 == 1) {
                            arg1.field109 = "1 unread message";
                            arg1.field111 = 65280;
                        }
                        if (this.field1303 > 1) {
                            arg1.field109 = this.field1303 + " unread messages";
                            arg1.field111 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field1445 == 201) {
                            if (this.field1516 == 1) {
                                arg1.field109 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg1.field109 = "";
                            }
                        } else if (this.field1445 == 200) {
                            arg1.field109 = "You have not yet set any password recovery questions.";
                        } else {
                            String var16;
                            if (this.field1445 == 0) {
                                var16 = "Earlier today";
                            } else if (this.field1445 == 1) {
                                var16 = "Yesterday";
                            } else {
                                var16 = this.field1445 + " days ago";
                            }
                            arg1.field109 = var16 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field1445 == 201) {
                            if (this.field1516 == 1) {
                                arg1.field109 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg1.field109 = "";
                            }
                        } else if (this.field1445 == 200) {
                            arg1.field109 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg1.field109 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field1445 == 201) {
                            if (this.field1516 == 1) {
                                arg1.field109 = "@whi@this world but member benefits are unavailable whilst here.";
                            } else {
                                arg1.field109 = "";
                            }
                        } else if (this.field1445 == 200) {
                            arg1.field109 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg1.field109 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else if (var3 == 1 && this.field1532 == 0) {
                arg1.field109 = "Loading friend list";
                arg1.field76 = 0;
            } else if (var3 == 1 && this.field1532 == 1) {
                arg1.field109 = "Connecting to friendserver";
                arg1.field76 = 0;
            } else if (var3 == 2 && this.field1532 != 2) {
                arg1.field109 = "Please wait...";
                arg1.field76 = 0;
            } else {
                int var4 = this.field1531;
                if (this.field1532 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg1.field109 = "";
                    arg1.field76 = 0;
                } else {
                    arg1.field109 = this.field1249[var3];
                    arg1.field76 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILab;Z)V")
    public final void method444(int arg0, int arg1, int arg2, PlayerEntity arg3, boolean arg4) {
        if (arg4) {
            if (field1668 != arg3) {
                if (this.field1396 < 400) {
                    String var6;
                    if (arg3.field464 == 0) {
                        var6 = arg3.field457 + method485(-684, arg3.field463, field1668.field463) + " (level-" + arg3.field463 + ")";
                    } else {
                        var6 = arg3.field457 + " (skill-" + arg3.field464 + ")";
                    }
                    if (this.field1227 == 1) {
                        this.field1530[this.field1396] = "Use " + this.field1231 + " with @whi@" + var6;
                        this.field1609[this.field1396] = 275;
                        this.field1610[this.field1396] = arg1;
                        this.field1607[this.field1396] = arg0;
                        this.field1608[this.field1396] = arg2;
                        ++this.field1396;
                    } else if (this.field1612 == 1) {
                        if ((this.field1614 & 8) == 8) {
                            this.field1530[this.field1396] = this.field1615 + " @whi@" + var6;
                            this.field1609[this.field1396] = 131;
                            this.field1610[this.field1396] = arg1;
                            this.field1607[this.field1396] = arg0;
                            this.field1608[this.field1396] = arg2;
                            ++this.field1396;
                        }
                    } else {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (this.field1215[var7] != null) {
                                this.field1530[this.field1396] = this.field1215[var7] + " @whi@" + var6;
                                short var9 = 0;
                                if (this.field1215[var7].equalsIgnoreCase("attack")) {
                                    if (arg3.field463 > field1668.field463) {
                                        var9 = 2000;
                                    }
                                } else if (this.field1216[var7]) {
                                    var9 = 2000;
                                }
                                if (var7 == 0) {
                                    this.field1609[this.field1396] = var9 + 639;
                                }
                                if (var7 == 1) {
                                    this.field1609[this.field1396] = var9 + 499;
                                }
                                if (var7 == 2) {
                                    this.field1609[this.field1396] = var9 + 27;
                                }
                                if (var7 == 3) {
                                    this.field1609[this.field1396] = var9 + 387;
                                }
                                if (var7 == 4) {
                                    this.field1609[this.field1396] = var9 + 185;
                                }
                                this.field1610[this.field1396] = arg1;
                                this.field1607[this.field1396] = arg0;
                                this.field1608[this.field1396] = arg2;
                                ++this.field1396;
                            }
                        }
                    }
                    for (int var8 = 0; var8 < this.field1396; ++var8) {
                        if (this.field1609[var8] == 718) {
                            this.field1530[var8] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method445(int arg0) {
        ++this.field1284;
        this.method513(0, true);
        this.method440(true, true);
        this.method513(0, false);
        this.method440(false, true);
        this.method463(this.field1568);
        this.method478(false);
        if (!this.field1424) {
            int var2 = this.field1621;
            if (this.field1488 / 256 > var2) {
                var2 = this.field1488 / 256;
            }
            if (this.field1577[4] && this.field1320[4] + 128 > var2) {
                var2 = this.field1320[4] + 128;
            }
            int var3 = this.field1622 + this.field1304 & 2047;
            this.method425(this.field1438, true, var2, this.method458(field1668.field397, field1668.field398, 0, this.field1478) - 50, this.field1437, var3, var2 * 3 + 600);
        }
        int var4;
        if (!this.field1424) {
            var4 = this.method528(-253);
        } else {
            var4 = this.method529(0);
        }
        int var5 = this.field1236;
        int var6 = this.field1237;
        int var7 = this.field1238;
        int var8 = this.field1239;
        int var9 = this.field1240;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1577[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1414[var10] * 2 + 1) - (double) this.field1414[var10] + Math.sin((double) this.field1260[var10] / 100.0D * (double) this.field1384[var10]) * (double) this.field1320[var10]);
                if (var10 == 0) {
                    this.field1236 += var12;
                }
                if (var10 == 1) {
                    this.field1237 += var12;
                }
                if (var10 == 2) {
                    this.field1238 += var12;
                }
                if (var10 == 3) {
                    this.field1240 = this.field1240 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1239 += var12;
                    if (this.field1239 < 128) {
                        this.field1239 = 128;
                    }
                    if (this.field1239 > 383) {
                        this.field1239 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field648;
        Model.field594 = true;
        Model.field597 = 0;
        Model.field595 = super.field22 - 4;
        Model.field596 = super.field23 - 4;
        Pix2D.method154(8);
        this.field1331.method89(this.field1236, -41301, this.field1238, this.field1240, this.field1237, var4, this.field1239);
        this.field1331.method64(-579);
        this.method523(0);
        this.method534(6905);
        this.method465(var11, 502);
        this.method426(31037);
        this.field1280.method254(4, super.field14, (byte) 76, 4);
        this.field1236 = var5;
        this.field1237 = var6;
        this.field1238 = var7;
        this.field1239 = var8;
        this.field1240 = var9;
        this.field1635 += arg0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        if (arg0) {
            this.field1636 = -1;
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1383 = (this.field1383 + 1) % 4;
                this.field1557 = true;
                this.field1525 = true;
                this.field1259.method213((byte) 117, 154);
                this.field1259.method214(this.field1383);
                this.field1259.method214(this.field1388);
                this.field1259.method214(this.field1221);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1388 = (this.field1388 + 1) % 3;
                this.field1557 = true;
                this.field1525 = true;
                this.field1259.method213((byte) 117, 154);
                this.field1259.method214(this.field1383);
                this.field1259.method214(this.field1388);
                this.field1259.method214(this.field1221);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1221 = (this.field1221 + 1) % 3;
                this.field1557 = true;
                this.field1525 = true;
                this.field1259.method213((byte) 117, 154);
                this.field1259.method214(this.field1383);
                this.field1259.method214(this.field1388);
                this.field1259.method214(this.field1221);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                this.method453(false);
                this.field1367 = "";
                this.field1544 = false;
                for (int var2 = 0; var2 < Component.field68.length; ++var2) {
                    if (Component.field68[var2] != null && Component.field68[var2].field77 == 600) {
                        this.field1497 = this.field1453 = Component.field68[var2].field74;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZIIBI)Z")
    public final boolean method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field1402[var15][var36] = 0;
                this.field1500[var15][var36] = 99999999;
            }
        }
        if (arg10 == 9) {
            boolean var16 = false;
        } else {
            field1317 = this.field1360.method290();
        }
        int var17 = arg5;
        int var18 = arg0;
        this.field1402[arg5][arg0] = 99;
        this.field1500[arg5][arg0] = 0;
        byte var19 = 0;
        int var20 = 0;
        this.field1254[var19] = arg5;
        int var37 = var19 + 1;
        this.field1255[var19] = arg0;
        boolean var21 = false;
        int var22 = this.field1254.length;
        int[][] var23 = this.field1521[this.field1478].field1094;
        while (var37 != var20) {
            var17 = this.field1254[var20];
            var18 = this.field1255[var20];
            var20 = (var20 + 1) % var22;
            if (arg1 == var17 && arg9 == var18) {
                var21 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && this.field1521[this.field1478].method361(false, var17, arg8, arg1, arg9, arg6 - 1, var18)) {
                    var21 = true;
                    break;
                }
                if (arg6 < 10 && this.field1521[this.field1478].method362(arg1, arg9, var17, arg6 - 1, arg8, var18, 6)) {
                    var21 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && this.field1521[this.field1478].method363(arg1, arg2, arg4, 1, arg9, var18, var17, arg3)) {
                var21 = true;
                break;
            }
            int var35 = this.field1500[var17][var18] + 1;
            if (var17 > 0 && this.field1402[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 2621704) == 0) {
                this.field1254[var37] = var17 - 1;
                this.field1255[var37] = var18;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 - 1][var18] = 2;
                this.field1500[var17 - 1][var18] = var35;
            }
            if (var17 < var13 - 1 && this.field1402[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 2621824) == 0) {
                this.field1254[var37] = var17 + 1;
                this.field1255[var37] = var18;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 + 1][var18] = 8;
                this.field1500[var17 + 1][var18] = var35;
            }
            if (var18 > 0 && this.field1402[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1254[var37] = var17;
                this.field1255[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17][var18 - 1] = 1;
                this.field1500[var17][var18 - 1] = var35;
            }
            if (var18 < var14 - 1 && this.field1402[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1254[var37] = var17;
                this.field1255[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17][var18 + 1] = 4;
                this.field1500[var17][var18 + 1] = var35;
            }
            if (var17 > 0 && var18 > 0 && this.field1402[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 2621710) == 0 && (var23[var17 - 1][var18] & 2621704) == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1254[var37] = var17 - 1;
                this.field1255[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 - 1][var18 - 1] = 3;
                this.field1500[var17 - 1][var18 - 1] = var35;
            }
            if (var17 < var13 - 1 && var18 > 0 && this.field1402[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 2621827) == 0 && (var23[var17 + 1][var18] & 2621824) == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1254[var37] = var17 + 1;
                this.field1255[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 + 1][var18 - 1] = 9;
                this.field1500[var17 + 1][var18 - 1] = var35;
            }
            if (var17 > 0 && var18 < var14 - 1 && this.field1402[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 2621752) == 0 && (var23[var17 - 1][var18] & 2621704) == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1254[var37] = var17 - 1;
                this.field1255[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 - 1][var18 + 1] = 6;
                this.field1500[var17 - 1][var18 + 1] = var35;
            }
            if (var17 < var13 - 1 && var18 < var14 - 1 && this.field1402[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 2621920) == 0 && (var23[var17 + 1][var18] & 2621824) == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1254[var37] = var17 + 1;
                this.field1255[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1402[var17 + 1][var18 + 1] = 12;
                this.field1500[var17 + 1][var18 + 1] = var35;
            }
        }
        this.field1422 = 0;
        if (!var21) {
            if (arg7) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg1 - var25; var26 <= arg1 + var25; ++var26) {
                        for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field1500[var26][var27] < var24) {
                                var24 = this.field1500[var26][var27];
                                var17 = var26;
                                var18 = var27;
                                this.field1422 = 1;
                                var21 = true;
                            }
                        }
                    }
                    if (var21) {
                        break;
                    }
                }
            }
            if (!var21) {
                return false;
            }
        }
        byte var28 = 0;
        this.field1254[var28] = var17;
        int var38 = var28 + 1;
        this.field1255[var28] = var18;
        int var29;
        int var30 = var29 = this.field1402[var17][var18];
        while (arg5 != var17 || arg0 != var18) {
            if (var29 != var30) {
                var29 = var30;
                this.field1254[var38] = var17;
                this.field1255[var38++] = var18;
            }
            if ((var30 & 2) != 0) {
                ++var17;
            } else if ((var30 & 8) != 0) {
                --var17;
            }
            if ((var30 & 1) != 0) {
                ++var18;
            } else if ((var30 & 4) != 0) {
                --var18;
            }
            var30 = this.field1402[var17][var18];
        }
        if (var38 <= 0) {
            if (arg11 == 1) {
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
            int var32 = this.field1254[var38];
            int var33 = this.field1255[var38];
            if (arg11 == 0) {
                this.field1259.method213((byte) 117, 207);
                this.field1259.method214(var31 + var31 + 3);
            }
            if (arg11 == 1) {
                this.field1259.method213((byte) 117, 86);
                this.field1259.method214(var31 + var31 + 3 + 14);
            }
            if (arg11 == 2) {
                this.field1259.method213((byte) 117, 138);
                this.field1259.method214(var31 + var31 + 3);
            }
            if (super.field32[5] == 1) {
                this.field1259.method214(1);
            } else {
                this.field1259.method214(0);
            }
            this.field1259.method215(this.field1471 + var32);
            this.field1259.method215(this.field1472 + var33);
            this.field1441 = this.field1254[0];
            this.field1442 = this.field1255[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field1259.method214(this.field1254[var38] - var32);
                this.field1259.method214(this.field1255[var38] - var33);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field1654 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method448(boolean arg0, int arg1) {
        int var3 = VarpType.field1178[arg1].field1186;
        if (var3 != 0) {
            int var4 = this.field1523[arg1];
            if (arg0) {
                this.field1315 = !this.field1315;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method172(-42222, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method172(-42222, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method172(-42222, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method172(-42222, 0.6D);
                }
                ObjType.field1080.method103();
                this.field1333 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1485;
                if (var4 == 0) {
                    this.method517(0, this.field1485, 0);
                    this.field1485 = true;
                }
                if (var4 == 1) {
                    this.method517(0, this.field1485, -400);
                    this.field1485 = true;
                }
                if (var4 == 2) {
                    this.method517(0, this.field1485, -800);
                    this.field1485 = true;
                }
                if (var4 == 3) {
                    this.method517(0, this.field1485, -1200);
                    this.field1485 = true;
                }
                if (var4 == 4) {
                    this.field1485 = false;
                }
                if (this.field1485 != var5 && !field1656) {
                    if (this.field1485) {
                        this.field1599 = this.field1446;
                        this.field1600 = true;
                        this.field1431.method274(2, this.field1599);
                    } else {
                        this.method486(33993);
                    }
                    this.field1343 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1496 = true;
                    this.method428(678, 0);
                }
                if (var4 == 1) {
                    this.field1496 = true;
                    this.method428(678, -400);
                }
                if (var4 == 2) {
                    this.field1496 = true;
                    this.method428(678, -800);
                }
                if (var4 == 3) {
                    this.field1496 = true;
                    this.method428(678, -1200);
                }
                if (var4 == 4) {
                    this.field1496 = false;
                }
            }
            if (var3 == 5) {
                this.field1465 = var4;
            }
            if (var3 == 6) {
                this.field1477 = var4;
            }
            if (var3 == 8) {
                this.field1490 = var4;
                this.field1525 = true;
            }
            if (var3 == 9) {
                this.field1298 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1331.method76(arg4, arg0, arg2);
        if (arg5 != 15485) {
            this.field1449 = this.field1360.method290();
        }
        if (var7 != 0) {
            int var8 = this.field1331.method80(arg4, arg0, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field1443.field661;
            int var13 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method325(var14);
            if (var15.field974 != -1) {
                Pix8 var16 = this.field1434[var15.field974];
                if (var16 != null) {
                    int var17 = (var15.field960 * 4 - var16.field677) / 2;
                    int var18 = (var15.field961 * 4 - var16.field678) / 2;
                    var16.method198(this.field1486, arg0 * 4 + 48 + var17, (104 - arg2 - var15.field961) * 4 + 48 + var18);
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
        int var19 = this.field1331.method78(arg4, arg0, arg2);
        if (var19 != 0) {
            int var20 = this.field1331.method80(arg4, arg0, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method325(var23);
            if (var24.field974 != -1) {
                Pix8 var25 = this.field1434[var24.field974];
                if (var25 != null) {
                    int var26 = (var24.field960 * 4 - var25.field677) / 2;
                    int var27 = (var24.field961 * 4 - var25.field678) / 2;
                    var25.method198(this.field1486, arg0 * 4 + 48 + var26, (104 - arg2 - var24.field961) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1443.field661;
                int var30 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field1331.method79(arg4, arg0, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method325(var32);
            if (var33.field974 != -1) {
                Pix8 var34 = this.field1434[var33.field974];
                if (var34 != null) {
                    int var35 = (var33.field960 * 4 - var34.field677) / 2;
                    int var36 = (var33.field961 * 4 - var34.field678) / 2;
                    var34.method198(this.field1486, arg0 * 4 + 48 + var35, (104 - arg2 - var33.field961) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method450(int arg0) {
        int var2 = 15 / arg0;
        if (field1656 && this.field1545 == 2 && World.field43 != this.field1478) {
            this.field1280.method253(field1376);
            this.field1492.method200(257, 151, 0, "Loading - please wait.", false);
            this.field1492.method200(256, 150, 16777215, "Loading - please wait.", false);
            this.field1280.method254(4, super.field14, (byte) 76, 4);
            this.field1545 = 1;
            this.field1543 = System.currentTimeMillis();
        }
        if (this.field1545 == 1) {
            int var3 = this.method451((byte) 2);
            if (var3 != 0 && System.currentTimeMillis() - this.field1543 > 360000L) {
                signlink.reporterror(this.field1563 + " glcfb " + this.field1647 + "," + var3 + "," + field1656 + "," + this.field1641[0] + "," + this.field1431.method275() + "," + this.field1478 + "," + this.field1338 + "," + this.field1339);
                this.field1543 = System.currentTimeMillis();
            }
        }
        if (this.field1545 == 2 && this.field1478 != this.field1350) {
            this.field1350 = this.field1478;
            this.method487(this.field1478, false);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)I")
    public final int method451(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1259.method214(128);
        }
        for (int var3 = 0; var3 < this.field1302.length; ++var3) {
            if (this.field1302[var3] == null && this.field1247[var3] != -1) {
                return -1;
            }
            if (this.field1369[var3] == null && this.field1248[var3] != -1) {
                return -2;
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1302.length; ++var5) {
            byte[] var6 = this.field1369[var5];
            if (var6 != null) {
                int var7 = (this.field1246[var5] >> 8) * 64 - this.field1471;
                int var8 = (this.field1246[var5] & 255) * 64 - this.field1472;
                var4 &= World.method16((byte) 106, var6, var8, var7);
            }
        }
        if (!var4) {
            return -3;
        } else if (this.field1665) {
            return -4;
        } else {
            this.field1545 = 2;
            World.field43 = this.field1478;
            this.method427((byte) 116);
            this.field1259.method213((byte) 117, 214);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIII)V")
    private final void method452(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg2 >= 1 && arg7 >= 1 && arg2 <= 102 && arg7 <= 102) {
            if (field1656 && this.field1478 != arg6) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg1 == 0) {
                var10 = this.field1331.method76(arg6, arg2, arg7);
            }
            if (arg1 == 1) {
                var10 = this.field1331.method77(arg7, arg2, arg6, this.field1419);
            }
            if (arg1 == 2) {
                var10 = this.field1331.method78(arg6, arg2, arg7);
            }
            if (arg1 == 3) {
                var10 = this.field1331.method79(arg6, arg2, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field1331.method80(arg6, arg2, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg1 == 0) {
                    this.field1331.method67(arg6, arg7, arg2, 45735);
                    LocType var18 = LocType.method325(var15);
                    if (var18.field962) {
                        this.field1521[arg6].method357((byte) 3, var16, var18.field963, var17, arg7, arg2);
                    }
                }
                if (arg1 == 1) {
                    this.field1331.method68(arg7, arg6, arg2, this.field1262);
                }
                if (arg1 == 2) {
                    this.field1331.method69(arg7, arg6, arg2, -870);
                    LocType var19 = LocType.method325(var15);
                    if (var19.field960 + arg2 > 103 || var19.field960 + arg7 > 103 || var19.field961 + arg2 > 103 || var19.field961 + arg7 > 103) {
                        return;
                    }
                    if (var19.field962) {
                        this.field1521[arg6].method358(-585, var19.field960, arg2, arg7, var17, var19.field963, var19.field961);
                    }
                }
                if (arg1 == 3) {
                    this.field1331.method70(arg2, (byte) 4, arg6, arg7);
                    LocType var20 = LocType.method325(var15);
                    if (var20.field962 && var20.field964) {
                        this.field1521[arg6].method360(arg2, 0, arg7);
                    }
                }
            }
            if (arg5 >= 0) {
                int var21 = arg6;
                if (arg6 < 3 && (this.field1243[1][arg2][arg7] & 2) == 2) {
                    var21 = arg6 + 1;
                }
                World.method31(this.field1331, var21, arg6, this.field1565, arg5, arg3, arg0, this.field1521[arg6], this.field1373, arg7, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method453(boolean arg0) {
        this.field1259.method213((byte) 117, 51);
        if (this.field1632 != -1) {
            this.field1632 = -1;
            this.field1344 = true;
            this.field1584 = false;
            this.field1257 = true;
        }
        if (this.field1427 != -1) {
            this.field1427 = -1;
            this.field1525 = true;
            this.field1584 = false;
        }
        this.field1453 = -1;
        if (arg0) {
            this.field1636 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        if (arg0 != 0) {
            this.field1636 = this.field1551.method224();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method455(int arg0) {
        if (arg0 <= 0) {
            this.field1568 = !this.field1568;
        }
        if (this.field1227 == 0 && this.field1612 == 0) {
            this.field1530[this.field1396] = "Walk here";
            this.field1609[this.field1396] = 718;
            this.field1607[this.field1396] = super.field22;
            this.field1608[this.field1396] = super.field23;
            ++this.field1396;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field597; ++var3) {
            int var4 = Model.field598[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1331.method80(this.field1478, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method325(var8);
                    if (this.field1227 == 1) {
                        this.field1530[this.field1396] = "Use " + this.field1231 + " with @cya@" + var9.field956;
                        this.field1609[this.field1396] = 810;
                        this.field1610[this.field1396] = var4;
                        this.field1607[this.field1396] = var5;
                        this.field1608[this.field1396] = var6;
                        ++this.field1396;
                    } else if (this.field1612 == 1) {
                        if ((this.field1614 & 4) == 4) {
                            this.field1530[this.field1396] = this.field1615 + " @cya@" + var9.field956;
                            this.field1609[this.field1396] = 899;
                            this.field1610[this.field1396] = var4;
                            this.field1607[this.field1396] = var5;
                            this.field1608[this.field1396] = var6;
                            ++this.field1396;
                        }
                    } else {
                        if (var9.field972 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field972[var10] != null) {
                                    this.field1530[this.field1396] = var9.field972[var10] + " @cya@" + var9.field956;
                                    if (var10 == 0) {
                                        this.field1609[this.field1396] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1609[this.field1396] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1609[this.field1396] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1609[this.field1396] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1609[this.field1396] = 1071;
                                    }
                                    this.field1610[this.field1396] = var4;
                                    this.field1607[this.field1396] = var5;
                                    this.field1608[this.field1396] = var6;
                                    ++this.field1396;
                                }
                            }
                        }
                        this.field1530[this.field1396] = "Examine @cya@" + var9.field956;
                        this.field1609[this.field1396] = 1381;
                        this.field1610[this.field1396] = var4;
                        this.field1607[this.field1396] = var5;
                        this.field1608[this.field1396] = var6;
                        ++this.field1396;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1675[var8];
                    if (var11.field453.field1006 == 1 && (var11.field397 & 127) == 64 && (var11.field398 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1676; ++var12) {
                            NpcEntity var15 = this.field1675[this.field1677[var12]];
                            if (var15 != null && var11 != var15 && var15.field453.field1006 == 1 && var11.field397 == var15.field397 && var11.field398 == var15.field398) {
                                this.method541(0, var5, var6, var15.field453, this.field1677[var12]);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1537; ++var13) {
                            PlayerEntity var14 = this.field1536[this.field1538[var13]];
                            if (var14 != null && var11.field397 == var14.field397 && var11.field398 == var14.field398) {
                                this.method444(var5, this.field1538[var13], var6, var14, true);
                            }
                        }
                    }
                    this.method541(0, var5, var6, var11.field453, var8);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1536[var8];
                    if ((var16.field397 & 127) == 64 && (var16.field398 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1676; ++var17) {
                            NpcEntity var20 = this.field1675[this.field1677[var17]];
                            if (var20 != null && var20.field453.field1006 == 1 && var16.field397 == var20.field397 && var16.field398 == var20.field398) {
                                this.method541(0, var5, var6, var20.field453, this.field1677[var17]);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1537; ++var18) {
                            PlayerEntity var19 = this.field1536[this.field1538[var18]];
                            if (var19 != null && var16 != var19 && var16.field397 == var19.field397 && var16.field398 == var19.field398) {
                                this.method444(var5, this.field1538[var18], var6, var19, true);
                            }
                        }
                    }
                    this.method444(var5, var8, var6, var16, true);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1232[this.field1478][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method244(false); var22 != null; var22 = (ObjStackEntity) var21.method246(false)) {
                            ObjType var23 = ObjType.method341(var22.field494);
                            if (this.field1227 == 1) {
                                this.field1530[this.field1396] = "Use " + this.field1231 + " with @lre@" + var23.field1042;
                                this.field1609[this.field1396] = 111;
                                this.field1610[this.field1396] = var22.field494;
                                this.field1607[this.field1396] = var5;
                                this.field1608[this.field1396] = var6;
                                ++this.field1396;
                            } else if (this.field1612 == 1) {
                                if ((this.field1614 & 1) == 1) {
                                    this.field1530[this.field1396] = this.field1615 + " @lre@" + var23.field1042;
                                    this.field1609[this.field1396] = 370;
                                    this.field1610[this.field1396] = var22.field494;
                                    this.field1607[this.field1396] = var5;
                                    this.field1608[this.field1396] = var6;
                                    ++this.field1396;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1056 != null && var23.field1056[var24] != null) {
                                        this.field1530[this.field1396] = var23.field1056[var24] + " @lre@" + var23.field1042;
                                        if (var24 == 0) {
                                            this.field1609[this.field1396] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1609[this.field1396] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1609[this.field1396] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1609[this.field1396] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1609[this.field1396] = 662;
                                        }
                                        this.field1610[this.field1396] = var22.field494;
                                        this.field1607[this.field1396] = var5;
                                        this.field1608[this.field1396] = var6;
                                        ++this.field1396;
                                    } else if (var24 == 2) {
                                        this.field1530[this.field1396] = "Take @lre@" + var23.field1042;
                                        this.field1609[this.field1396] = 617;
                                        this.field1610[this.field1396] = var22.field494;
                                        this.field1607[this.field1396] = var5;
                                        this.field1608[this.field1396] = var6;
                                        ++this.field1396;
                                    }
                                }
                                this.field1530[this.field1396] = "Examine @lre@" + var23.field1042;
                                this.field1609[this.field1396] = 1152;
                                this.field1610[this.field1396] = var22.field494;
                                this.field1607[this.field1396] = var5;
                                this.field1608[this.field1396] = var6;
                                ++this.field1396;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method456(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1348 = "";
                this.field1349 = "Connecting to server...";
                this.method461(true, false);
            }
            this.field1524 = new ClientStream(-158, this.method480(field1654 + 43594), this);
            long var4 = JString.method295(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1259.field709 = 0;
            this.field1259.method214(14);
            this.field1259.method214(var6);
            this.field1524.method42(2, -2584, this.field1259.field708, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1524.method39();
            }
            int var8 = this.field1524.method39();
            if (var8 == 0) {
                this.field1524.method41(this.field1551.field708, 0, 8);
                this.field1551.field709 = 0;
                this.field1647 = this.field1551.method230(0);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1647 >> 32), (int) this.field1647 };
                this.field1259.field709 = 0;
                this.field1259.method214(10);
                this.field1259.method218(var9[0]);
                this.field1259.method218(var9[1]);
                this.field1259.method218(var9[2]);
                this.field1259.method218(var9[3]);
                this.field1259.method218(signlink.uid);
                this.field1259.method221(arg0);
                this.field1259.method221(arg1);
                this.field1259.method239(field1428, field1466, 4);
                this.field1522.field709 = 0;
                if (arg2) {
                    this.field1522.method214(18);
                } else {
                    this.field1522.method214(16);
                }
                this.field1522.method214(this.field1259.field709 + 36 + 1 + 1 + 2);
                this.field1522.method214(255);
                this.field1522.method215(274);
                this.field1522.method214(field1656 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1522.method218(this.field1301[var10]);
                }
                this.field1522.method222(this.field1259.field708, false, 0, this.field1259.field709);
                this.field1259.field713 = new Isaac(true, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1360 = new Isaac(true, var9);
                this.field1524.method42(this.field1522.field709, -2584, this.field1522.field708, 0);
                var8 = this.field1524.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method456(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1282 = this.field1524.method39();
                field1583 = this.field1524.method39() == 1;
                this.field1646 = 0L;
                this.field1399 = 0;
                this.field1576.field993 = 0;
                super.field19 = true;
                this.field1361 = true;
                this.field1321 = true;
                this.field1259.field709 = 0;
                this.field1551.field709 = 0;
                this.field1636 = -1;
                this.field1554 = -1;
                this.field1555 = -1;
                this.field1556 = -1;
                this.field1635 = 0;
                this.field1637 = 0;
                this.field1219 = 0;
                this.field1639 = 0;
                this.field1616 = 0;
                this.field1396 = 0;
                this.field1267 = false;
                super.field20 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1366[var12] = null;
                }
                this.field1227 = 0;
                this.field1612 = 0;
                this.field1545 = 0;
                this.field1345 = 0;
                this.field1662 = (int) (Math.random() * 100.0D) - 50;
                this.field1250 = (int) (Math.random() * 110.0D) - 55;
                this.field1304 = (int) (Math.random() * 80.0D) - 40;
                this.field1633 = (int) (Math.random() * 120.0D) - 60;
                this.field1586 = (int) (Math.random() * 30.0D) - 20;
                this.field1622 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1447 = 0;
                this.field1350 = -1;
                this.field1441 = 0;
                this.field1442 = 0;
                this.field1537 = 0;
                this.field1676 = 0;
                for (int var13 = 0; var13 < this.field1534; ++var13) {
                    this.field1536[var13] = null;
                    this.field1541[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1675[var14] = null;
                }
                field1668 = this.field1536[this.field1535] = new PlayerEntity();
                this.field1572.method247();
                this.field1340.method247();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1232[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1644 = new LinkList(-822);
                this.field1532 = 0;
                this.field1531 = 0;
                this.field1526 = -1;
                this.field1427 = -1;
                this.field1453 = -1;
                this.field1632 = -1;
                this.field1519 = -1;
                this.field1584 = false;
                this.field1429 = 3;
                this.field1520 = false;
                this.field1267 = false;
                this.field1681 = false;
                this.field1245 = null;
                this.field1234 = 0;
                this.field1589 = -1;
                this.field1398 = true;
                this.method514(814);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1505[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1215[var19] = null;
                    this.field1216[var19] = false;
                }
                field1648 = 0;
                field1385 = 0;
                field1567 = 0;
                field1316 = 0;
                field1468 = 0;
                field1573 = 0;
                field1611 = 0;
                field1296 = 0;
                field1444 = 0;
                field1553 = 0;
                this.method500(70);
            } else if (var8 == 3) {
                this.field1348 = "";
                this.field1349 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1348 = "Your account has been disabled.";
                this.field1349 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1348 = "Your account is already logged in.";
                this.field1349 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1348 = "RuneScape has been updated!";
                this.field1349 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1348 = "This world is full.";
                this.field1349 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1348 = "Unable to connect.";
                this.field1349 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1348 = "Login limit exceeded.";
                this.field1349 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1348 = "Unable to connect.";
                this.field1349 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1349 = "Login server rejected session.";
                this.field1349 = "Please try again.";
            } else if (var8 == 12) {
                this.field1348 = "You need a members account to login to this world.";
                this.field1349 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1348 = "Could not complete login.";
                this.field1349 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1348 = "The server is being updated.";
                this.field1349 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1321 = true;
                this.field1259.field709 = 0;
                this.field1551.field709 = 0;
                this.field1636 = -1;
                this.field1554 = -1;
                this.field1555 = -1;
                this.field1556 = -1;
                this.field1635 = 0;
                this.field1637 = 0;
                this.field1219 = 0;
                this.field1396 = 0;
                this.field1267 = false;
                this.field1543 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1348 = "Login attempts exceeded.";
                this.field1349 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1348 = "You are standing in a members-only area.";
                this.field1349 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1348 = "Invalid loginserver requested";
                this.field1349 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1348 = "No response from server";
                    this.field1349 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1348 = "Unexpected server response";
                    this.field1349 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1524.method39(); var20 >= 0; --var20) {
                    this.field1348 = "You have only just left another world";
                    this.field1349 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method461(true, false);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method456(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1348 = "";
            this.field1349 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method457(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1526 != -1) {
            this.field1245 = arg3;
            super.field28 = 0;
        }
        if (this.field1427 == -1) {
            this.field1525 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1364[var5] = this.field1364[var5 - 1];
            this.field1365[var5] = this.field1365[var5 - 1];
            this.field1366[var5] = this.field1366[var5 - 1];
        }
        this.field1364[0] = arg1;
        this.field1365[0] = arg2;
        this.field1366[0] = arg3;
        if (arg0 >= 0) {
            this.field1259.method214(83);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method458(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg2 != 0) {
                this.field1636 = -1;
            }
            if (arg3 < 3 && (this.field1243[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field1373[var7][var5][var6] + this.field1373[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1373[var7][var5][var6 + 1] + this.field1373[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method459(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        if (arg1 <= 0) {
            this.field1568 = !this.field1568;
        }
        int var7 = this.field1331.method80(this.field1478, arg2, arg0, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1548;
            if (field1548 > 1086) {
                field1548 = 0;
                this.field1259.method213((byte) 117, 149);
                this.field1259.method214(0);
                int var10 = this.field1259.field709;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method215(16791);
                }
                this.field1259.method214(254);
                this.field1259.method215((int) (Math.random() * 65536.0D));
                this.field1259.method215(16128);
                this.field1259.method215(52610);
                this.field1259.method215((int) (Math.random() * 65536.0D));
                this.field1259.method215(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1259.method215(35025);
                }
                this.field1259.method215(46628);
                this.field1259.method214((int) (Math.random() * 256.0D));
                this.field1259.method223(this.field1259.field709 - var10, this.field1213);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method447(field1668.field448[0], arg2, 0, 0, 0, field1668.field447[0], var8 + 1, false, var9, arg0, (byte) 9, 2);
            } else {
                LocType var11 = LocType.method325(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field961;
                    var13 = var11.field960;
                } else {
                    var12 = var11.field960;
                    var13 = var11.field961;
                }
                int var14 = var11.field983;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method447(field1668.field448[0], arg2, var12, var13, var14, field1668.field447[0], 0, false, 0, arg0, (byte) 9, 2);
            }
            this.field1558 = super.field29;
            this.field1559 = super.field30;
            this.field1561 = 2;
            this.field1560 = 0;
            this.field1259.method213((byte) 117, arg3);
            this.field1259.method215(this.field1471 + arg2);
            this.field1259.method215(this.field1472 + arg0);
            this.field1259.method215(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method460(int arg0, int arg1) {
        LinkList var3 = this.field1232[this.field1478][arg0][arg1];
        if (var3 == null) {
            this.field1331.method71(this.field1478, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method243(); var6 != null; var6 = (ObjStackEntity) var3.method245(this.field1374)) {
                ObjType var11 = ObjType.method341(var6.field494);
                int var12 = var11.field1054;
                if (var11.field1053) {
                    var12 = (var6.field495 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method241(false, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method243(); var9 != null; var9 = (ObjStackEntity) var3.method245(this.field1374)) {
                if (var5.field494 != var9.field494 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field494 != var9.field494 && var7.field494 != var9.field494 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1331.method57(arg1, var10, this.field1478, var7, var5, (byte) 5, arg0, this.method458(arg0 * 128 + 64, arg1 * 128 + 64, 0, this.field1478), var8);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method461(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field1372 = !this.field1372;
        }
        this.method424(this.field1261);
        this.field1457.method253(field1376);
        this.field1679.method198(this.field1486, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1421 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1491.method201(0, var3 / 2, var5, this.field1431.field831, 7711145, true);
            int var6 = var4 / 2 - 20;
            this.field1493.method201(0, var3 / 2, var6, "Welcome to RuneScape", 16776960, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1680.method198(this.field1486, var7 - 73, var8 - 20);
            this.field1493.method201(0, var7, var8 + 5, "New User", 16777215, true);
            int var9 = var3 / 2 + 80;
            this.field1680.method198(this.field1486, var9 - 73, var8 - 20);
            this.field1493.method201(0, var9, var8 + 5, "Existing User", 16777215, true);
        }
        if (this.field1421 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1348.length() > 0) {
                this.field1493.method201(0, var3 / 2, var10 - 15, this.field1348, 16776960, true);
                this.field1493.method201(0, var3 / 2, var10, this.field1349, 16776960, true);
                var10 += 30;
            } else {
                this.field1493.method201(0, var3 / 2, var10 - 7, this.field1349, 16776960, true);
                var10 += 30;
            }
            this.field1493.method205("Username: " + this.field1563 + (this.field1371 == 0 & field1218 % 40 < 20 ? "@yel@|" : ""), this.field1449, true, var10, var3 / 2 - 90, 16777215);
            var10 += 15;
            this.field1493.method205("Password: " + JString.method301(this.field1564, false) + (this.field1371 == 1 & field1218 % 40 < 20 ? "@yel@|" : ""), this.field1449, true, var10, var3 / 2 - 88, 16777215);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1680.method198(this.field1486, var11 - 73, var12 - 20);
                this.field1493.method201(0, var11, var12 + 5, "Login", 16777215, true);
                int var13 = var3 / 2 + 80;
                this.field1680.method198(this.field1486, var13 - 73, var12 - 20);
                this.field1493.method201(0, var13, var12 + 5, "Cancel", 16777215, true);
            }
        }
        if (this.field1421 == 3) {
            this.field1493.method201(0, var3 / 2, var4 / 2 - 60, "Create a free account", 16776960, true);
            int var14 = var4 / 2 - 35;
            this.field1493.method201(0, var3 / 2, var14, "To create a new account you need to", 16777215, true);
            int var18 = var14 + 15;
            this.field1493.method201(0, var3 / 2, var18, "go back to the main RuneScape webpage", 16777215, true);
            int var19 = var18 + 15;
            this.field1493.method201(0, var3 / 2, var19, "and choose the red 'create account'", 16777215, true);
            int var20 = var19 + 15;
            this.field1493.method201(0, var3 / 2, var20, "button at the top right of that page.", 16777215, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1680.method198(this.field1486, var15 - 73, var16 - 20);
            this.field1493.method201(0, var15, var16 + 5, "Cancel", 16777215, true);
        }
        this.field1457.method254(202, super.field14, (byte) 76, 171);
        if (this.field1333) {
            this.field1333 = false;
            this.field1455.method254(128, super.field14, (byte) 76, 0);
            this.field1456.method254(202, super.field14, (byte) 76, 371);
            this.field1460.method254(0, super.field14, (byte) 76, 265);
            this.field1461.method254(562, super.field14, (byte) 76, 265);
            this.field1462.method254(128, super.field14, (byte) 76, 171);
            this.field1463.method254(562, super.field14, (byte) 76, 171);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public static final void method462(boolean arg0) {
        World3D.field282 = true;
        Pix3D.field628 = true;
        if (!arg0) {
            field1317 = -73;
        }
        field1656 = true;
        World.field42 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method463(boolean arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1572.method243(); var2 != null; var2 = (ProjectileEntity) this.field1572.method245(this.field1374)) {
            if (this.field1478 == var2.field499 && field1218 <= var2.field505) {
                if (field1218 >= var2.field504) {
                    if (var2.field508 > 0) {
                        NpcEntity var4 = this.field1675[var2.field508 - 1];
                        if (var4 != null && var4.field397 >= 0 && var4.field397 < 13312 && var4.field398 >= 0 && var4.field398 < 13312) {
                            var2.method119(field1218, this.method458(var4.field397, var4.field398, 0, var2.field499) - var2.field503, var4.field397, (byte) 7, var4.field398);
                        }
                    }
                    if (var2.field508 < 0) {
                        int var5 = -var2.field508 - 1;
                        PlayerEntity var6;
                        if (this.field1363 == var5) {
                            var6 = field1668;
                        } else {
                            var6 = this.field1536[var5];
                        }
                        if (var6 != null && var6.field397 >= 0 && var6.field397 < 13312 && var6.field398 >= 0 && var6.field398 < 13312) {
                            var2.method119(field1218, this.method458(var6.field397, var6.field398, 0, var2.field499) - var2.field503, var6.field397, (byte) 7, var6.field398);
                        }
                    }
                    var2.method120(this.field1391, true);
                    this.field1331.method61((int) var2.field512, var2, (int) var2.field510, -1, (int) var2.field511, (byte) 1, 60, var2.field518, this.field1478, false);
                }
            } else {
                var2.method106();
            }
        }
        ++field1413;
        this.field1321 &= arg0;
        if (field1413 > 1174) {
            field1413 = 0;
            this.field1259.method213((byte) 117, 12);
            this.field1259.method214(0);
            int var3 = this.field1259.field709;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1259.method215(11499);
            }
            this.field1259.method215(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1259.method214(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1259.method214(94);
            }
            this.field1259.method215(51693);
            this.field1259.method214(16);
            this.field1259.method215(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1259.method214(65);
            }
            this.field1259.method214((int) (Math.random() * 256.0D));
            this.field1259.method215(22990);
            this.field1259.method223(this.field1259.field709 - var3, this.field1213);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBII)V")
    public final void method464(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.field1570.method198(this.field1486, arg4, arg1);
        this.field1571.method198(this.field1486, arg4, arg1 + arg5 - 16);
        Pix2D.method156(arg5 - 32, this.field1574, 16, arg4, 0, arg1 + 16);
        int var7 = (arg5 - 32) * arg5 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg0 / (arg2 - arg5);
        Pix2D.method156(var7, this.field1423, 16, arg4, 0, arg1 + 16 + var8);
        Pix2D.method161(this.field1593, var7, arg4, 384, arg1 + 16 + var8);
        Pix2D.method161(this.field1593, var7, arg4 + 1, 384, arg1 + 16 + var8);
        Pix2D.method159(16, this.field1593, arg4, (byte) 125, arg1 + 16 + var8);
        Pix2D.method159(16, this.field1593, arg4, (byte) 125, arg1 + 17 + var8);
        Pix2D.method161(this.field1241, var7, arg4 + 15, 384, arg1 + 16 + var8);
        Pix2D.method161(this.field1241, var7 - 1, arg4 + 14, 384, arg1 + 17 + var8);
        Pix2D.method159(16, this.field1241, arg4, (byte) 125, arg1 + 15 + var8 + var7);
        Pix2D.method159(15, this.field1241, arg4 + 1, (byte) 125, arg1 + 14 + var8 + var7);
        if (arg3 != 123) {
            this.field1259.method214(30);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method465(int arg0, int arg1) {
        int var3 = 49 / arg1;
        if (!field1656) {
            if (Pix3D.field647[17] >= arg0) {
                Pix8 var4 = Pix3D.field641[17];
                int var5 = var4.field678 * var4.field677 - 1;
                int var6 = this.field1391 * var4.field677 * 2;
                byte[] var7 = var4.field675;
                byte[] var8 = this.field1504;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field675 = var8;
                this.field1504 = var7;
                Pix3D.method170(17, true);
            }
            if (Pix3D.field647[24] >= arg0) {
                Pix8 var10 = Pix3D.field641[24];
                int var11 = var10.field678 * var10.field677 - 1;
                int var12 = this.field1391 * var10.field677 * 2;
                byte[] var13 = var10.field675;
                byte[] var14 = this.field1504;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field675 = var14;
                this.field1504 = var13;
                Pix3D.method170(24, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (arg0 != 25675) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field28 == 1) {
            if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field1370[0] != -1) {
                this.field1344 = true;
                this.field1429 = 0;
                this.field1257 = true;
            }
            if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field1370[1] != -1) {
                this.field1344 = true;
                this.field1429 = 1;
                this.field1257 = true;
            }
            if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field1370[2] != -1) {
                this.field1344 = true;
                this.field1429 = 2;
                this.field1257 = true;
            }
            if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field1370[3] != -1) {
                this.field1344 = true;
                this.field1429 = 3;
                this.field1257 = true;
            }
            if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field1370[4] != -1) {
                this.field1344 = true;
                this.field1429 = 4;
                this.field1257 = true;
            }
            if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field1370[5] != -1) {
                this.field1344 = true;
                this.field1429 = 5;
                this.field1257 = true;
            }
            if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field1370[6] != -1) {
                this.field1344 = true;
                this.field1429 = 6;
                this.field1257 = true;
            }
            if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field1370[7] != -1) {
                this.field1344 = true;
                this.field1429 = 7;
                this.field1257 = true;
            }
            if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field1370[8] != -1) {
                this.field1344 = true;
                this.field1429 = 8;
                this.field1257 = true;
            }
            if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field1370[9] != -1) {
                this.field1344 = true;
                this.field1429 = 9;
                this.field1257 = true;
            }
            if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field1370[10] != -1) {
                this.field1344 = true;
                this.field1429 = 10;
                this.field1257 = true;
            }
            if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field1370[11] != -1) {
                this.field1344 = true;
                this.field1429 = 11;
                this.field1257 = true;
            }
            if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field1370[12] != -1) {
                this.field1344 = true;
                this.field1429 = 12;
                this.field1257 = true;
            }
            if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field1370[13] != -1) {
                this.field1344 = true;
                this.field1429 = 13;
                this.field1257 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method467(int arg0) {
        byte[] var2 = this.field1358.method294("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1458.method253(field1376);
        var3.method183(0, false, 0);
        this.field1459.method253(field1376);
        var3.method183(0, false, -637);
        this.field1455.method253(field1376);
        var3.method183(0, false, -128);
        this.field1456.method253(field1376);
        var3.method183(-371, false, -202);
        this.field1457.method253(field1376);
        var3.method183(-171, false, -202);
        this.field1460.method253(field1376);
        var3.method183(-265, false, 0);
        this.field1461.method253(field1376);
        var3.method183(-265, false, -562);
        this.field1462.method253(field1376);
        var3.method183(-171, false, -128);
        this.field1463.method253(field1376);
        var3.method183(-171, false, -562);
        int[] var4 = new int[var3.field662];
        for (int var5 = 0; var5 < var3.field663; ++var5) {
            for (int var10 = 0; var10 < var3.field662; ++var10) {
                var4[var10] = var3.field661[var3.field662 * var5 + (var3.field662 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field662; ++var11) {
                var3.field661[var3.field662 * var5 + var11] = var4[var11];
            }
        }
        this.field1458.method253(field1376);
        var3.method183(0, false, 382);
        this.field1459.method253(field1376);
        var3.method183(0, false, -255);
        this.field1455.method253(field1376);
        var3.method183(0, false, 254);
        this.field1456.method253(field1376);
        var3.method183(-371, false, 180);
        this.field1457.method253(field1376);
        var3.method183(-171, false, 180);
        this.field1460.method253(field1376);
        var3.method183(-265, false, 382);
        this.field1461.method253(field1376);
        var3.method183(-265, false, -180);
        this.field1462.method253(field1376);
        this.field1635 += arg0;
        var3.method183(-171, false, 254);
        this.field1463.method253(field1376);
        var3.method183(-171, false, -180);
        Pix32 var6 = new Pix32(this.field1358, "logo", 0);
        this.field1455.method253(field1376);
        var6.method185(this.field1486, 382 - var6.field662 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method468(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1520) {
                this.field1520 = false;
                this.field1525 = true;
            }
            int var3 = this.field1607[arg1];
            int var4 = this.field1608[arg1];
            int var5 = this.field1609[arg1];
            int var6 = this.field1610[arg1];
            if (this.field1487 == arg0) {
                boolean var7 = false;
            } else {
                this.field1529 = -128;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 829) {
                NpcEntity var8 = this.field1675[var6];
                if (var8 != null) {
                    this.method447(field1668.field448[0], var8.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var8.field448[0], (byte) 9, 2);
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 2;
                    this.field1560 = 0;
                    this.field1259.method213((byte) 117, 150);
                    this.field1259.method215(var6);
                    this.field1259.method215(this.field1230);
                    this.field1259.method215(this.field1228);
                    this.field1259.method215(this.field1229);
                }
            }
            if (var5 == 524) {
                String var9 = this.field1530[arg1];
                int var10 = var9.indexOf("@whi@");
                if (var10 != -1) {
                    this.method453(false);
                    this.field1367 = var9.substring(var10 + 5).trim();
                    this.field1544 = false;
                    for (int var11 = 0; var11 < Component.field68.length; ++var11) {
                        if (Component.field68[var11] != null && Component.field68[var11].field77 == 600) {
                            this.field1497 = this.field1453 = Component.field68[var11].field74;
                            break;
                        }
                    }
                }
            }
            if (var5 == 275) {
                PlayerEntity var12 = this.field1536[var6];
                if (var12 != null) {
                    this.method447(field1668.field448[0], var12.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var12.field448[0], (byte) 9, 2);
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 2;
                    this.field1560 = 0;
                    this.field1259.method213((byte) 117, 36);
                    this.field1259.method215(var6);
                    this.field1259.method215(this.field1230);
                    this.field1259.method215(this.field1228);
                    this.field1259.method215(this.field1229);
                }
            }
            if (var5 == 743) {
                ++field1385;
                if (field1385 >= 124) {
                    this.field1259.method213((byte) 117, 201);
                    this.field1259.method215(37954);
                }
                this.method459(var4, 74, var3, 187, var6);
            }
            if (var5 == 718) {
                if (!this.field1267) {
                    this.field1331.method88(super.field29 - 4, super.field30 - 4, this.field1450);
                } else {
                    this.field1331.method88(var3 - 4, var4 - 4, this.field1450);
                }
            }
            if (var5 == 721) {
                field1648 += var4;
                if (field1648 >= 139) {
                    this.field1259.method213((byte) 117, 219);
                    this.field1259.method218(0);
                }
                this.method459(var4, 74, var3, 103, var6);
            }
            if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                String var13 = this.field1530[arg1];
                int var14 = var13.indexOf("@whi@");
                if (var14 != -1) {
                    long var15 = JString.method295(var13.substring(var14 + 5).trim());
                    if (var5 == 605) {
                        this.method510(199, var15);
                    }
                    if (var5 == 47) {
                        this.method504(var15, false);
                    }
                    if (var5 == 513) {
                        this.method470(0, var15);
                    }
                    if (var5 == 884) {
                        this.method531(this.field1390, var15);
                    }
                }
            }
            if (var5 == 563) {
                this.field1259.method213((byte) 117, 135);
                this.field1259.method215(var6);
                this.field1259.method215(var3);
                this.field1259.method215(var4);
                this.field1259.method215(this.field1613);
                this.field1263 = 0;
                this.field1264 = var4;
                this.field1265 = var3;
                this.field1266 = 2;
                if (Component.field68[var4].field74 == this.field1453) {
                    this.field1266 = 1;
                }
                if (Component.field68[var4].field74 == this.field1427) {
                    this.field1266 = 3;
                }
            }
            if (var5 == 435) {
                this.field1259.method213((byte) 117, 9);
                this.field1259.method215(var4);
                Component var17 = Component.field68[var4];
                if (var17.field83 != null && var17.field83[0][0] == 5) {
                    int var18 = var17.field83[0][1];
                    this.field1523[var18] = 1 - this.field1523[var18];
                    this.method448(false, var18);
                    this.field1344 = true;
                }
            }
            if (var5 == 810 && this.method459(var4, 74, var3, 60, var6)) {
                this.field1259.method215(this.field1230);
                this.field1259.method215(this.field1228);
                this.field1259.method215(this.field1229);
            }
            if (var5 == 102) {
                this.field1227 = 1;
                this.field1228 = var3;
                this.field1229 = var4;
                this.field1230 = var6;
                this.field1231 = ObjType.method341(var6).field1042;
                this.field1612 = 0;
                this.field1344 = true;
            } else {
                if (var5 == 1328) {
                    ObjType var19 = ObjType.method341(var6);
                    Component var20 = Component.field68[var4];
                    String var21;
                    if (var20 != null && var20.field70[var3] >= 100000) {
                        var21 = var20.field70[var3] + " x " + var19.field1042;
                    } else if (var19.field1043 != null) {
                        var21 = new String(var19.field1043);
                    } else {
                        var21 = "It's a " + var19.field1042 + ".";
                    }
                    this.method457(-476, 0, "", var21);
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var22 = this.field1536[var6];
                    if (var22 != null) {
                        this.method447(field1668.field448[0], var22.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var22.field448[0], (byte) 9, 2);
                        this.field1558 = super.field29;
                        this.field1559 = super.field30;
                        this.field1561 = 2;
                        this.field1560 = 0;
                        if (var5 == 387) {
                            field1468 += var6;
                            if (field1468 >= 66) {
                                this.field1259.method213((byte) 117, 235);
                                this.field1259.method214(154);
                            }
                            this.field1259.method213((byte) 117, 98);
                        }
                        if (var5 == 185) {
                            this.field1259.method213((byte) 117, 174);
                        }
                        if (var5 == 639) {
                            ++field1316;
                            if (field1316 >= 52) {
                                this.field1259.method213((byte) 117, 80);
                                this.field1259.method214(131);
                            }
                            this.field1259.method213((byte) 117, 109);
                        }
                        if (var5 == 27) {
                            this.field1259.method213((byte) 117, 196);
                        }
                        if (var5 == 499) {
                            this.field1259.method213((byte) 117, 166);
                        }
                        this.field1259.method215(var6);
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var23 = this.field1675[var6];
                    if (var23 != null) {
                        this.method447(field1668.field448[0], var23.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var23.field448[0], (byte) 9, 2);
                        this.field1558 = super.field29;
                        this.field1559 = super.field30;
                        this.field1561 = 2;
                        this.field1560 = 0;
                        if (var5 == 309) {
                            this.field1259.method213((byte) 117, 223);
                        }
                        if (var5 == 242) {
                            this.field1259.method213((byte) 117, 236);
                        }
                        if (var5 == 852) {
                            this.field1259.method213((byte) 117, 147);
                        }
                        if (var5 == 793) {
                            this.field1259.method213((byte) 117, 189);
                        }
                        if (var5 == 209) {
                            this.field1259.method213((byte) 117, 233);
                        }
                        this.field1259.method215(var6);
                    }
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 331) {
                        this.field1259.method213((byte) 117, 179);
                    }
                    if (var5 == 113) {
                        this.field1259.method213((byte) 117, 82);
                    }
                    if (var5 == 555) {
                        this.field1259.method213((byte) 117, 239);
                    }
                    if (var5 == 354) {
                        this.field1259.method213((byte) 117, 46);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1573;
                        }
                        if (field1573 >= 133) {
                            this.field1259.method213((byte) 117, 250);
                            this.field1259.method215(6118);
                        }
                        this.field1259.method213((byte) 117, 74);
                    }
                    this.field1259.method215(var6);
                    this.field1259.method215(var3);
                    this.field1259.method215(var4);
                    this.field1263 = 0;
                    this.field1264 = var4;
                    this.field1265 = var3;
                    this.field1266 = 2;
                    if (Component.field68[var4].field74 == this.field1453) {
                        this.field1266 = 1;
                    }
                    if (Component.field68[var4].field74 == this.field1427) {
                        this.field1266 = 3;
                    }
                }
                if (var5 == 997 && !this.field1584) {
                    this.field1259.method213((byte) 117, 72);
                    this.field1259.method215(var4);
                    this.field1584 = true;
                }
                if (var5 == 1714) {
                    NpcEntity var24 = this.field1675[var6];
                    if (var24 != null) {
                        String var25;
                        if (var24.field453.field1005 != null) {
                            var25 = new String(var24.field453.field1005);
                        } else {
                            var25 = "It's a " + var24.field453.field1004 + ".";
                        }
                        this.method457(-476, 0, "", var25);
                    }
                }
                if (var5 == 240) {
                    NpcEntity var26 = this.field1675[var6];
                    if (var26 != null) {
                        this.method447(field1668.field448[0], var26.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var26.field448[0], (byte) 9, 2);
                        this.field1558 = super.field29;
                        this.field1559 = super.field30;
                        this.field1561 = 2;
                        this.field1560 = 0;
                        this.field1259.method213((byte) 117, 181);
                        this.field1259.method215(var6);
                        this.field1259.method215(this.field1613);
                    }
                }
                if (var5 == 902) {
                    String var27 = this.field1530[arg1];
                    int var28 = var27.indexOf("@whi@");
                    if (var28 != -1) {
                        long var29 = JString.method295(var27.substring(var28 + 5).trim());
                        int var31 = -1;
                        for (int var32 = 0; var32 < this.field1531; ++var32) {
                            if (this.field1575[var32] == var29) {
                                var31 = var32;
                                break;
                            }
                        }
                        if (var31 != -1 && this.field1489[var31] > 0) {
                            this.field1525 = true;
                            this.field1520 = false;
                            this.field1681 = true;
                            this.field1400 = "";
                            this.field1467 = 3;
                            this.field1283 = this.field1575[var31];
                            this.field1435 = "Enter message to send to " + this.field1249[var31];
                        }
                    }
                }
                if (var5 == 1381) {
                    int var33 = var6 >> 14 & 32767;
                    LocType var34 = LocType.method325(var33);
                    String var35;
                    if (var34.field957 != null) {
                        var35 = new String(var34.field957);
                    } else {
                        var35 = "It's a " + var34.field956 + ".";
                    }
                    this.method457(-476, 0, "", var35);
                }
                if (var5 == 231) {
                    Component var36 = Component.field68[var4];
                    boolean var37 = true;
                    if (var36.field77 > 0) {
                        var37 = this.method521(var36, this.field1601);
                    }
                    if (var37) {
                        this.field1259.method213((byte) 117, 9);
                        this.field1259.method215(var4);
                    }
                }
                if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                    boolean var38 = this.method447(field1668.field448[0], var3, 0, 0, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    if (!var38) {
                        this.method447(field1668.field448[0], var3, 1, 1, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    }
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 2;
                    this.field1560 = 0;
                    if (var5 == 662) {
                        field1567 += this.field1472;
                        if (field1567 >= 118) {
                            this.field1259.method213((byte) 117, 41);
                            this.field1259.method218(0);
                        }
                        this.field1259.method213((byte) 117, 117);
                    }
                    if (var5 == 139) {
                        if ((var3 & 3) == 0) {
                            ++field1611;
                        }
                        if (field1611 >= 123) {
                            this.field1259.method213((byte) 117, 25);
                            this.field1259.method218(0);
                        }
                        this.field1259.method213((byte) 117, 247);
                    }
                    if (var5 == 224) {
                        field1296 += var4;
                        if (field1296 >= 75) {
                            this.field1259.method213((byte) 117, 0);
                            this.field1259.method214(19);
                        }
                        this.field1259.method213((byte) 117, 62);
                    }
                    if (var5 == 617) {
                        this.field1259.method213((byte) 117, 108);
                    }
                    if (var5 == 778) {
                        this.field1259.method213((byte) 117, 169);
                    }
                    this.field1259.method215(this.field1471 + var3);
                    this.field1259.method215(this.field1472 + var4);
                    this.field1259.method215(var6);
                }
                if (var5 == 1071) {
                    this.method459(var4, 74, var3, 127, var6);
                }
                if (var5 == 507 || var5 == 957) {
                    String var40 = this.field1530[arg1];
                    int var41 = var40.indexOf("@whi@");
                    if (var41 != -1) {
                        String var42 = var40.substring(var41 + 5).trim();
                        String var43 = JString.method299(131, JString.method296(0, JString.method295(var42)));
                        boolean var44 = false;
                        for (int var45 = 0; var45 < this.field1537; ++var45) {
                            PlayerEntity var46 = this.field1536[this.field1538[var45]];
                            if (var46 != null && var46.field457 != null && var46.field457.equalsIgnoreCase(var43)) {
                                this.method447(field1668.field448[0], var46.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var46.field448[0], (byte) 9, 2);
                                if (var5 == 507) {
                                    field1468 += var6;
                                    if (field1468 >= 66) {
                                        this.field1259.method213((byte) 117, 235);
                                        this.field1259.method214(154);
                                    }
                                    this.field1259.method213((byte) 117, 98);
                                }
                                if (var5 == 957) {
                                    ++field1316;
                                    if (field1316 >= 52) {
                                        this.field1259.method213((byte) 117, 80);
                                        this.field1259.method214(131);
                                    }
                                    this.field1259.method213((byte) 117, 109);
                                }
                                this.field1259.method215(this.field1538[var45]);
                                var44 = true;
                                break;
                            }
                        }
                        if (!var44) {
                            this.method457(-476, 0, "", "Unable to find " + var43);
                        }
                    }
                }
                if (var5 == 131) {
                    PlayerEntity var47 = this.field1536[var6];
                    if (var47 != null) {
                        this.method447(field1668.field448[0], var47.field447[0], 1, 1, 0, field1668.field447[0], 0, false, 0, var47.field448[0], (byte) 9, 2);
                        this.field1558 = super.field29;
                        this.field1559 = super.field30;
                        this.field1561 = 2;
                        this.field1560 = 0;
                        this.field1259.method213((byte) 117, 240);
                        this.field1259.method215(var6);
                        this.field1259.method215(this.field1613);
                    }
                }
                if (var5 == 398) {
                    this.field1259.method213((byte) 117, 136);
                    this.field1259.method215(var6);
                    this.field1259.method215(var3);
                    this.field1259.method215(var4);
                    this.field1259.method215(this.field1230);
                    this.field1259.method215(this.field1228);
                    this.field1259.method215(this.field1229);
                    this.field1263 = 0;
                    this.field1264 = var4;
                    this.field1265 = var3;
                    this.field1266 = 2;
                    if (Component.field68[var4].field74 == this.field1453) {
                        this.field1266 = 1;
                    }
                    if (Component.field68[var4].field74 == this.field1427) {
                        this.field1266 = 3;
                    }
                }
                if (var5 == 737) {
                    this.method453(false);
                }
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 681) {
                        ++field1444;
                        if (field1444 >= 116) {
                            this.field1259.method213((byte) 117, 24);
                            this.field1259.method217(13018169);
                        }
                        this.field1259.method213((byte) 117, 216);
                    }
                    if (var5 == 100) {
                        this.field1259.method213((byte) 117, 42);
                    }
                    if (var5 == 694) {
                        this.field1259.method213((byte) 117, 185);
                    }
                    if (var5 == 962) {
                        this.field1259.method213((byte) 117, 2);
                    }
                    if (var5 == 795) {
                        this.field1259.method213((byte) 117, 123);
                    }
                    this.field1259.method215(var6);
                    this.field1259.method215(var3);
                    this.field1259.method215(var4);
                    this.field1263 = 0;
                    this.field1264 = var4;
                    this.field1265 = var3;
                    this.field1266 = 2;
                    if (Component.field68[var4].field74 == this.field1453) {
                        this.field1266 = 1;
                    }
                    if (Component.field68[var4].field74 == this.field1427) {
                        this.field1266 = 3;
                    }
                }
                if (var5 == 357) {
                    this.method459(var4, 74, var3, 157, var6);
                }
                if (var5 == 1152) {
                    ObjType var48 = ObjType.method341(var6);
                    String var49;
                    if (var48.field1043 != null) {
                        var49 = new String(var48.field1043);
                    } else {
                        var49 = "It's a " + var48.field1042 + ".";
                    }
                    this.method457(-476, 0, "", var49);
                }
                if (var5 == 370) {
                    boolean var50 = this.method447(field1668.field448[0], var3, 0, 0, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    if (!var50) {
                        this.method447(field1668.field448[0], var3, 1, 1, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    }
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 2;
                    this.field1560 = 0;
                    this.field1259.method213((byte) 117, 91);
                    this.field1259.method215(this.field1471 + var3);
                    this.field1259.method215(this.field1472 + var4);
                    this.field1259.method215(var6);
                    this.field1259.method215(this.field1613);
                }
                if (var5 == 899 && this.method459(var4, 74, var3, 213, var6)) {
                    this.field1259.method215(this.field1613);
                }
                if (var5 == 625) {
                    this.method459(var4, 74, var3, 215, var6);
                }
                if (var5 == 111) {
                    boolean var52 = this.method447(field1668.field448[0], var3, 0, 0, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    if (!var52) {
                        this.method447(field1668.field448[0], var3, 1, 1, 0, field1668.field447[0], 0, false, 0, var4, (byte) 9, 2);
                    }
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 2;
                    this.field1560 = 0;
                    this.field1259.method213((byte) 117, 39);
                    this.field1259.method215(this.field1471 + var3);
                    this.field1259.method215(this.field1472 + var4);
                    this.field1259.method215(var6);
                    this.field1259.method215(this.field1230);
                    this.field1259.method215(this.field1228);
                    this.field1259.method215(this.field1229);
                }
                if (var5 == 274) {
                    Component var54 = Component.field68[var4];
                    this.field1612 = 1;
                    this.field1613 = var4;
                    this.field1614 = var54.field128;
                    this.field1227 = 0;
                    this.field1344 = true;
                    String var55 = var54.field126;
                    if (var55.indexOf(" ") != -1) {
                        var55 = var55.substring(0, var55.indexOf(" "));
                    }
                    String var56 = var54.field126;
                    if (var56.indexOf(" ") != -1) {
                        var56 = var56.substring(var56.indexOf(" ") + 1);
                    }
                    this.field1615 = var55 + " " + var54.field127 + " " + var56;
                    if (this.field1614 == 16) {
                        this.field1344 = true;
                        this.field1429 = 3;
                        this.field1257 = true;
                    }
                } else {
                    if (var5 == 225) {
                        this.field1259.method213((byte) 117, 9);
                        this.field1259.method215(var4);
                        Component var57 = Component.field68[var4];
                        if (var57.field83 != null && var57.field83[0][0] == 5) {
                            int var58 = var57.field83[0][1];
                            if (this.field1523[var58] != var57.field85[0]) {
                                this.field1523[var58] = var57.field85[0];
                                this.method448(false, var58);
                                this.field1344 = true;
                            }
                        }
                    }
                    this.field1227 = 0;
                    this.field1612 = 0;
                    this.field1344 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IBI)Lxb;")
    public final Jagfile method469(String arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1641[0] != null) {
                var7 = this.field1641[0].method286((byte) 2, arg1);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1395.reset();
            this.field1395.update(var7);
            int var9 = (int) this.field1395.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(0, var7);
        } else {
            int var11 = 0;
            if (arg4 != 46) {
                field1651 = this.field1360.method290();
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13("Requesting " + arg0, arg5, 7);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method492(arg2 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, (byte) 1);
                    var17.field709 = 3;
                    int var18 = var17.method228() + 6;
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
                            this.method13("Loading " + arg0 + " - " + var23 + "%", arg5, 7);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1641[0] != null) {
                            this.field1641[0].method287(var7.length, arg1, var7, (byte) 8);
                        }
                    } catch (Exception var29) {
                        this.field1641[0] = null;
                    }
                    if (var7 != null) {
                        this.field1395.reset();
                        this.field1395.update(var7);
                        int var24 = (int) this.field1395.getValue();
                        if (arg3 != var24) {
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
                            this.method13("Game updated - please reload page", arg5, 7);
                            var26 = 10;
                        } else {
                            this.method13(var12 + " - Retrying in " + var26, arg5, 7);
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
                    this.field1469 = !this.field1469;
                }
            }
            return new Jagfile(0, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method470(int arg0, long arg1) {
        if (arg0 == 0) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field1531; ++var4) {
                    if (this.field1575[var4] == arg1) {
                        --this.field1531;
                        this.field1344 = true;
                        for (int var5 = var4; var5 < this.field1531; ++var5) {
                            this.field1249[var5] = this.field1249[var5 + 1];
                            this.field1489[var5] = this.field1489[var5 + 1];
                            this.field1575[var5] = this.field1575[var5 + 1];
                        }
                        this.field1259.method213((byte) 117, 106);
                        this.field1259.method220(arg1, 0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method471(byte arg0) {
        if (arg0 != -29) {
            this.field1315 = !this.field1315;
        }
        this.field1281.method253(field1376);
        Pix3D.field639 = this.field1659;
        this.field1619.method198(this.field1486, 0, 0);
        if (this.field1681) {
            this.field1493.method200(239, 40, 0, this.field1435, false);
            this.field1493.method200(239, 60, 128, this.field1400 + "*", false);
        } else if (this.field1520) {
            this.field1493.method200(239, 40, 0, "Enter amount:", false);
            this.field1493.method200(239, 60, 128, this.field1598 + "*", false);
        } else if (this.field1245 != null) {
            this.field1493.method200(239, 40, 0, this.field1245, false);
            this.field1493.method200(239, 60, 128, "Click to continue", false);
        } else if (this.field1427 != -1) {
            this.method535(0, Component.field68[this.field1427], 0, 0, (byte) 0);
        } else if (this.field1526 != -1) {
            this.method535(0, Component.field68[this.field1526], 0, 0, (byte) 0);
        } else {
            PixFont var2 = this.field1492;
            int var3 = 0;
            Pix2D.method153(5, 77, 463, 0, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1366[var4] != null) {
                    int var6 = this.field1364[var4];
                    int var7 = 70 - var3 * 14 + this.field1498;
                    String var8 = this.field1365[var4];
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
                            var2.method203(4, this.field1366[var4], 0, var7, true);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1383 == 0 || this.field1383 == 1 && this.method430(-238, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1330[0].method198(this.field1486, var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1330[1].method198(this.field1486, var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method203(var10, var8 + ":", 0, var7, true);
                            int var11 = var10 + var2.method202(-43341, var8) + 8;
                            var2.method203(var11, this.field1366[var4], 255, var7, true);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1490 == 0 && (var6 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(-238, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method203(var12, "From", 0, var7, true);
                            int var13 = var12 + var2.method202(-43341, "From ");
                            if (var9 == 1) {
                                this.field1330[0].method198(this.field1486, var13, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1330[1].method198(this.field1486, var13, var7 - 12);
                                var13 += 14;
                            }
                            var2.method203(var13, var8 + ":", 0, var7, true);
                            int var14 = var13 + var2.method202(-43341, var8) + 8;
                            var2.method203(var14, this.field1366[var4], 8388608, var7, true);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(-238, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(4, var8 + " " + this.field1366[var4], 8388736, var7, true);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1490 == 0 && this.field1388 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(4, this.field1366[var4], 8388608, var7, true);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1490 == 0 && this.field1388 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(4, "To " + var8 + ":", 0, var7, true);
                            var2.method203(12 + var2.method202(-43341, "To " + var8), this.field1366[var4], 8388608, var7, true);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(-238, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method203(4, var8 + " " + this.field1366[var4], 8270336, var7, true);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method152(true);
            this.field1347 = var3 * 14 + 7;
            if (this.field1347 < 78) {
                this.field1347 = 78;
            }
            this.method464(this.field1347 - this.field1498 - 77, 0, this.field1347, (byte) 123, 463, 77);
            String var5;
            if (field1668 != null && field1668.field457 != null) {
                var5 = field1668.field457;
            } else {
                var5 = JString.method299(131, this.field1563);
            }
            var2.method203(4, var5 + ":", 0, 90, true);
            var2.method203(6 + var2.method202(-43341, var5 + ": "), this.field1425 + "*", 255, 90, true);
            Pix2D.method159(479, 0, 0, (byte) 125, 77);
        }
        if (this.field1267 && this.field1670 == 2) {
            this.method423(-593);
        }
        this.field1281.method254(17, super.field14, (byte) 76, 357);
        this.field1280.method253(field1376);
        Pix3D.field639 = this.field1661;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13("Starting up", 20, 7);
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field1342) {
            this.field1451 = true;
        } else {
            field1342 = true;
            boolean var1 = false;
            String var2 = this.method501(879);
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
                this.field1314 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1641[var3] = new FileStream(signlink.cache_dat, 29615, signlink.cache_idx[var3], var3 + 1, 500000);
                    }
                }
                try {
                    this.method555(0);
                    this.field1358 = this.method469("title screen", 1, "title", this.field1301[1], (byte) 46, 25);
                    this.field1491 = new PixFont(this.field1358, false, "p11_full", (byte) 0);
                    this.field1492 = new PixFont(this.field1358, false, "p12_full", (byte) 0);
                    this.field1493 = new PixFont(this.field1358, false, "b12_full", (byte) 0);
                    this.field1494 = new PixFont(this.field1358, true, "q8_full", (byte) 0);
                    this.method467(0);
                    this.method499(4);
                    Jagfile var4 = this.method469("config", 2, "config", this.field1301[2], (byte) 46, 30);
                    Jagfile var5 = this.method469("interface", 3, "interface", this.field1301[3], (byte) 46, 35);
                    Jagfile var6 = this.method469("2d graphics", 4, "media", this.field1301[4], (byte) 46, 40);
                    Jagfile var7 = this.method469("textures", 6, "textures", this.field1301[6], (byte) 46, 45);
                    Jagfile var8 = this.method469("chat system", 7, "wordenc", this.field1301[7], (byte) 46, 50);
                    Jagfile var9 = this.method469("sound effects", 8, "sounds", this.field1301[8], (byte) 46, 55);
                    this.field1243 = new byte[4][104][104];
                    this.field1373 = new int[4][105][105];
                    this.field1331 = new World3D(4, 104, 104, this.field1373, (byte) 6);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1521[var10] = new CollisionMap(104, 104, true);
                    }
                    this.field1443 = new Pix32(512, 512);
                    Jagfile var11 = this.method469("update list", 5, "versionlist", this.field1301[5], (byte) 46, 60);
                    this.method13("Connecting to update server", 60, 7);
                    this.field1431 = new OnDemand();
                    this.field1431.method265(var11, this);
                    AnimFrame.method44(this.field1431.method268(836));
                    Model.method122(this.field1431.method267(field1651, 0), this.field1431);
                    if (!field1656) {
                        this.field1599 = 0;
                        try {
                            this.field1599 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1600 = true;
                        this.field1431.method274(2, this.field1599);
                        while (this.field1431.method275() > 0) {
                            this.method431(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1431.field837 > 3) {
                                this.method540("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13("Requesting animations", 65, 7);
                    int var12 = this.field1431.method267(field1651, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1431.method274(1, var13);
                    }
                    while (this.field1431.method275() > 0) {
                        int var14 = var12 - this.field1431.method275();
                        if (var14 > 0) {
                            this.method13("Loading animations - " + var14 * 100 / var12 + "%", 65, 7);
                        }
                        this.method431(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1431.field837 > 3) {
                            this.method540("ondemand");
                            return;
                        }
                    }
                    this.method13("Requesting models", 70, 7);
                    int var15 = this.field1431.method267(field1651, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1431.method272(var16, (byte) 9);
                        if ((var17 & 1) != 0) {
                            this.field1431.method274(0, var16);
                        }
                    }
                    int var18 = this.field1431.method275();
                    while (this.field1431.method275() > 0) {
                        int var19 = var18 - this.field1431.method275();
                        if (var19 > 0) {
                            this.method13("Loading models - " + var19 * 100 / var18 + "%", 70, 7);
                        }
                        this.method431(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1641[0] != null) {
                        this.method13("Requesting maps", 75, 7);
                        this.field1431.method274(3, this.field1431.method269(0, 47, false, 48));
                        this.field1431.method274(3, this.field1431.method269(1, 47, false, 48));
                        this.field1431.method274(3, this.field1431.method269(0, 48, false, 48));
                        this.field1431.method274(3, this.field1431.method269(1, 48, false, 48));
                        this.field1431.method274(3, this.field1431.method269(0, 49, false, 48));
                        this.field1431.method274(3, this.field1431.method269(1, 49, false, 48));
                        this.field1431.method274(3, this.field1431.method269(0, 47, false, 47));
                        this.field1431.method274(3, this.field1431.method269(1, 47, false, 47));
                        this.field1431.method274(3, this.field1431.method269(0, 48, false, 47));
                        this.field1431.method274(3, this.field1431.method269(1, 48, false, 47));
                        this.field1431.method274(3, this.field1431.method269(0, 48, false, 148));
                        this.field1431.method274(3, this.field1431.method269(1, 48, false, 148));
                        int var20 = this.field1431.method275();
                        while (this.field1431.method275() > 0) {
                            int var21 = var20 - this.field1431.method275();
                            if (var21 > 0) {
                                this.method13("Loading maps - " + var21 * 100 / var20 + "%", 75, 7);
                            }
                            this.method431(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1431.method267(field1651, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1431.method272(var23, (byte) 9);
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
                            this.field1431.method277((byte) 5, var23, 0, var25);
                        }
                    }
                    this.field1431.method270(field1655, -515);
                    if (!field1656) {
                        int var26 = this.field1431.method267(field1651, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1431.method273(var27, false)) {
                                this.field1431.method277((byte) 5, var27, 2, (byte) 1);
                            }
                        }
                    }
                    this.method13("Unpacking media", 80, 7);
                    this.field1617 = new Pix8(var6, "invback", 0);
                    this.field1619 = new Pix8(var6, "chatback", 0);
                    this.field1618 = new Pix8(var6, "mapback", 0);
                    this.field1594 = new Pix8(var6, "backbase1", 0);
                    this.field1595 = new Pix8(var6, "backbase2", 0);
                    this.field1596 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1368[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1501 = new Pix32(var6, "compass", 0);
                    this.field1542 = new Pix32(var6, "mapedge", 0);
                    this.field1542.method182((byte) 3);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1434[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1359[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1351[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1417[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1380 = new Pix32(var6, "mapmarker", 0);
                    this.field1381 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1631[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1603 = new Pix32(var6, "mapdots", 0);
                    this.field1604 = new Pix32(var6, "mapdots", 1);
                    this.field1605 = new Pix32(var6, "mapdots", 2);
                    this.field1606 = new Pix32(var6, "mapdots", 3);
                    this.field1570 = new Pix8(var6, "scrollbar", 0);
                    this.field1571 = new Pix8(var6, "scrollbar", 1);
                    this.field1291 = new Pix8(var6, "redstone1", 0);
                    this.field1292 = new Pix8(var6, "redstone2", 0);
                    this.field1293 = new Pix8(var6, "redstone3", 0);
                    this.field1294 = new Pix8(var6, "redstone1", 0);
                    this.field1294.method195(2);
                    this.field1295 = new Pix8(var6, "redstone2", 0);
                    this.field1295.method195(2);
                    this.field1626 = new Pix8(var6, "redstone1", 0);
                    this.field1626.method196((byte) -36);
                    this.field1627 = new Pix8(var6, "redstone2", 0);
                    this.field1627.method196((byte) -36);
                    this.field1628 = new Pix8(var6, "redstone3", 0);
                    this.field1628.method196((byte) -36);
                    this.field1629 = new Pix8(var6, "redstone1", 0);
                    this.field1629.method195(2);
                    this.field1629.method196((byte) -36);
                    this.field1630 = new Pix8(var6, "redstone2", 0);
                    this.field1630.method195(2);
                    this.field1630.method196((byte) -36);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1330[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1268 = new PixMap(var35.field663, field1356, var35.field662, this.method11(field1518));
                    var35.method183(0, false, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1269 = new PixMap(var36.field663, field1356, var36.field662, this.method11(field1518));
                    var36.method183(0, false, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1270 = new PixMap(var37.field663, field1356, var37.field662, this.method11(field1518));
                    var37.method183(0, false, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1271 = new PixMap(var38.field663, field1356, var38.field662, this.method11(field1518));
                    var38.method183(0, false, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1272 = new PixMap(var39.field663, field1356, var39.field662, this.method11(field1518));
                    var39.method183(0, false, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1273 = new PixMap(var40.field663, field1356, var40.field662, this.method11(field1518));
                    var40.method183(0, false, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1274 = new PixMap(var41.field663, field1356, var41.field662, this.method11(field1518));
                    var41.method183(0, false, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1275 = new PixMap(var42.field663, field1356, var42.field662, this.method11(field1518));
                    var42.method183(0, false, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1276 = new PixMap(var43.field663, field1356, var43.field662, this.method11(field1518));
                    var43.method183(0, false, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1359[var48] != null) {
                            this.field1359[var48].method181(var46 + var47, 6, var44 + var47, var45 + var47);
                        }
                        if (this.field1434[var48] != null) {
                            this.field1434[var48].method197(var46 + var47, 6, var44 + var47, var45 + var47);
                        }
                    }
                    this.method13("Unpacking textures", 83, 7);
                    Pix3D.method168(var7, 0);
                    Pix3D.method172(-42222, 0.8D);
                    Pix3D.method167(20, 2972);
                    this.method13("Unpacking config", 86, 7);
                    SeqType.method374(false, var4);
                    LocType.method323(var4);
                    FloType.method364(false, var4);
                    ObjType.method339(var4);
                    NpcType.method333(var4);
                    IdkType.method368(false, var4);
                    SpotAnimType.method377(false, var4);
                    VarpType.method382(false, var4);
                    VarbitType.method380(false, var4);
                    ObjType.field1039 = field1655;
                    if (!field1656) {
                        this.method13("Unpacking sounds", 90, 7);
                        byte[] var49 = var9.method294("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, (byte) 1);
                        Wave.method313(false, var50);
                    }
                    this.method13("Unpacking interfaces", 95, 7);
                    PixFont[] var51 = new PixFont[] { this.field1491, this.field1492, this.field1493, this.field1494 };
                    Component.method32(var5, var6, var51, -584);
                    this.method13("Preparing game engine", 100, 7);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1618.field675[this.field1618.field677 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1299[var52] = var53;
                        this.field1470[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1618.field675[this.field1618.field677 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field1552[var56 - 5] = var57 - 25;
                        this.field1566[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method165(479, 6487, 96);
                    this.field1659 = Pix3D.field639;
                    Pix3D.method165(190, 6487, 261);
                    this.field1660 = Pix3D.field639;
                    Pix3D.method165(512, 6487, 334);
                    this.field1661 = Pix3D.field639;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field637[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(334, false, 800, 512, 500, var60);
                    WordFilter.method384(var8);
                    this.field1576 = new MouseTracking(field1640, this);
                    this.method12(this.field1576, 10);
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1244 + " " + this.field1324);
                    this.field1590 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IIIIZI)V")
    public final void method472(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg0 >= 0) {
            this.field1636 = this.field1551.method224();
        }
        if (this.field1433) {
            this.field1502 = 32;
        } else {
            this.field1502 = 0;
        }
        this.field1433 = false;
        if (arg6 >= arg5 && arg6 < arg5 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
            arg2.field88 -= this.field1409 * 4;
            if (arg7) {
                this.field1344 = true;
                return;
            }
        } else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg3 >= arg1 + arg4 - 16 && arg3 < arg1 + arg4) {
            arg2.field88 += this.field1409 * 4;
            if (arg7) {
                this.field1344 = true;
                return;
            }
        } else {
            if (arg6 < arg5 - this.field1502 || arg6 >= arg5 + 16 + this.field1502 || arg3 < arg4 + 16 || arg3 >= arg1 + arg4 - 16 || this.field1409 <= 0) {
                return;
            }
            int var10 = (arg1 - 32) * arg1 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg3 - arg4 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg2.field88 = (arg8 - arg1) * var11 / var12;
            if (arg7) {
                this.field1344 = true;
            }
            this.field1433 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method473(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1609[arg0];
            if (arg1 != 9) {
                this.field1217 = this.field1360.method290();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method474(int arg0, int arg1, Packet arg2) {
        int var10000 = arg0 + arg1;
        arg2.method234((byte) 4);
        int var5 = arg2.method235(8, (byte) -96);
        if (var5 < this.field1676) {
            for (int var6 = var5; var6 < this.field1676; ++var6) {
                this.field1481[this.field1480++] = this.field1677[var6];
            }
        }
        if (var5 > this.field1676) {
            signlink.reporterror(this.field1563 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1676 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field1677[var7];
                NpcEntity var9 = this.field1675[var8];
                int var10 = arg2.method235(1, (byte) -96);
                if (var10 == 0) {
                    this.field1677[this.field1676++] = var8;
                    var9.field442 = field1218;
                } else {
                    int var11 = arg2.method235(2, (byte) -96);
                    if (var11 == 0) {
                        this.field1677[this.field1676++] = var8;
                        var9.field442 = field1218;
                        this.field1540[this.field1539++] = var8;
                    } else if (var11 == 1) {
                        this.field1677[this.field1676++] = var8;
                        var9.field442 = field1218;
                        int var12 = arg2.method235(3, (byte) -96);
                        var9.method111(true, var12, false);
                        int var13 = arg2.method235(1, (byte) -96);
                        if (var13 == 1) {
                            this.field1540[this.field1539++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1677[this.field1676++] = var8;
                        var9.field442 = field1218;
                        int var14 = arg2.method235(3, (byte) -96);
                        var9.method111(true, var14, true);
                        int var15 = arg2.method235(3, (byte) -96);
                        var9.method111(true, var15, true);
                        int var16 = arg2.method235(1, (byte) -96);
                        if (var16 == 1) {
                            this.field1540[this.field1539++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1481[this.field1480++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    public final void method475(int arg0, int arg1, Packet arg2) {
        int var4 = 58 / arg1;
        if (arg0 != 138 && arg0 != 173) {
            if (arg0 == 48) {
                int var5 = arg2.method224();
                int var6 = (var5 >> 4 & 7) + this.field1334;
                int var7 = (var5 & 7) + this.field1335;
                int var8 = arg2.method224();
                int var9 = var8 >> 2;
                int var10 = var8 & 3;
                int var11 = this.field1389[var9];
                int var12 = arg2.method226();
                if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                    int var13 = this.field1373[this.field1478][var6][var7];
                    int var14 = this.field1373[this.field1478][var6 + 1][var7];
                    int var15 = this.field1373[this.field1478][var6 + 1][var7 + 1];
                    int var16 = this.field1373[this.field1478][var6][var7 + 1];
                    if (var11 == 0) {
                        Wall var17 = this.field1331.method72((byte) -31, var7, this.field1478, var6);
                        if (var17 != null) {
                            int var18 = var17.field272 >> 14 & 32767;
                            if (var9 == 2) {
                                var17.field270 = new LocEntity(2, var10 + 4, var12, var18, var15, this.field1323, false, var14, var16, var13);
                                var17.field271 = new LocEntity(2, var10 + 1 & 3, var12, var18, var15, this.field1323, false, var14, var16, var13);
                            } else {
                                var17.field270 = new LocEntity(var9, var10, var12, var18, var15, this.field1323, false, var14, var16, var13);
                            }
                        }
                    }
                    if (var11 == 1) {
                        Decor var19 = this.field1331.method73(var6, (byte) 1, this.field1478, var7);
                        if (var19 != null) {
                            var19.field162 = new LocEntity(4, 0, var12, var19.field163 >> 14 & 32767, var15, this.field1323, false, var14, var16, var13);
                        }
                    }
                    if (var11 == 2) {
                        Location var20 = this.field1331.method74(var6, this.field1478, this.field1297, var7);
                        if (var9 == 11) {
                            var9 = 10;
                        }
                        if (var20 != null) {
                            var20.field255 = new LocEntity(var9, var10, var12, var20.field263 >> 14 & 32767, var15, this.field1323, false, var14, var16, var13);
                        }
                    }
                    if (var11 == 3) {
                        GroundDecor var21 = this.field1331.method75(var6, this.field1478, var7, (byte) 7);
                        if (var21 != null) {
                            var21.field194 = new LocEntity(22, var10, var12, var21.field195 >> 14 & 32767, var15, this.field1323, false, var14, var16, var13);
                        }
                    }
                }
            } else if (arg0 == 81) {
                int var22 = arg2.method224();
                int var23 = (var22 >> 4 & 7) + this.field1334;
                int var24 = (var22 & 7) + this.field1335;
                int var25 = arg2.method226();
                int var26 = arg2.method226();
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    ObjStackEntity var27 = new ObjStackEntity();
                    var27.field494 = var25;
                    var27.field495 = var26;
                    if (this.field1232[this.field1478][var23][var24] == null) {
                        this.field1232[this.field1478][var23][var24] = new LinkList(-822);
                    }
                    this.field1232[this.field1478][var23][var24].method240(var27);
                    this.method460(var23, var24);
                }
            } else if (arg0 == 52) {
                int var28 = arg2.method224();
                int var29 = (var28 >> 4 & 7) + this.field1334;
                int var30 = (var28 & 7) + this.field1335;
                int var31 = arg2.method226();
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    LinkList var32 = this.field1232[this.field1478][var29][var30];
                    if (var32 != null) {
                        for (ObjStackEntity var33 = (ObjStackEntity) var32.method243(); var33 != null; var33 = (ObjStackEntity) var32.method245(this.field1374)) {
                            if ((var31 & 32767) == var33.field494) {
                                var33.method106();
                                break;
                            }
                        }
                        if (var32.method243() == null) {
                            this.field1232[this.field1478][var29][var30] = null;
                        }
                        this.method460(var29, var30);
                    }
                }
            } else if (arg0 == 107) {
                int var34 = arg2.method224();
                int var35 = (var34 >> 4 & 7) + this.field1334;
                int var36 = (var34 & 7) + this.field1335;
                int var37 = var35 + arg2.method225();
                int var38 = var36 + arg2.method225();
                int var39 = arg2.method227();
                int var40 = arg2.method226();
                int var41 = arg2.method224() * 4;
                int var42 = arg2.method224() * 4;
                int var43 = arg2.method226();
                int var44 = arg2.method226();
                int var45 = arg2.method224();
                int var46 = arg2.method224();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    ProjectileEntity var51 = new ProjectileEntity(var47, var46, var42, field1218 + var44, var45, field1218 + var43, this.field1478, var40, this.field1346, this.method458(var47, var48, 0, this.field1478) - var41, var39, var48);
                    var51.method119(field1218 + var43, this.method458(var49, var50, 0, this.field1478) - var42, var49, (byte) 7, var50);
                    this.field1572.method240(var51);
                }
            } else if (arg0 == 85) {
                int var52 = arg2.method224();
                int var53 = (var52 >> 4 & 7) + this.field1334;
                int var54 = (var52 & 7) + this.field1335;
                int var55 = arg2.method226();
                int var56 = arg2.method224();
                int var57 = arg2.method226();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    SpotAnimEntity var60 = new SpotAnimEntity(var57, var59, var58, this.field1478, 0, this.method458(var58, var59, 0, this.field1478) - var56, var55, field1218);
                    this.field1340.method240(var60);
                }
            } else if (arg0 == 219) {
                int var61 = arg2.method224();
                int var62 = (var61 >> 4 & 7) + this.field1334;
                int var63 = (var61 & 7) + this.field1335;
                int var64 = arg2.method226();
                int var65 = arg2.method226();
                int var66 = arg2.method226();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && this.field1363 != var66) {
                    ObjStackEntity var67 = new ObjStackEntity();
                    var67.field494 = var64;
                    var67.field495 = var65;
                    if (this.field1232[this.field1478][var62][var63] == null) {
                        this.field1232[this.field1478][var62][var63] = new LinkList(-822);
                    }
                    this.field1232[this.field1478][var62][var63].method240(var67);
                    this.method460(var62, var63);
                }
            } else {
                if (arg0 == 176) {
                    int var68 = arg2.method224();
                    int var69 = (var68 >> 4 & 7) + this.field1334;
                    int var70 = (var68 & 7) + this.field1335;
                    int var71 = arg2.method224();
                    int var72 = var71 >> 2;
                    int var73 = var71 & 3;
                    int var74 = this.field1389[var72];
                    int var75 = arg2.method226();
                    int var76 = arg2.method226();
                    int var77 = arg2.method226();
                    int var78 = arg2.method226();
                    byte var79 = arg2.method225();
                    byte var80 = arg2.method225();
                    byte var81 = arg2.method225();
                    byte var82 = arg2.method225();
                    PlayerEntity var83;
                    if (this.field1363 == var78) {
                        var83 = field1668;
                    } else {
                        var83 = this.field1536[var78];
                    }
                    if (var83 != null) {
                        LocType var84 = LocType.method325(var75);
                        int var85 = this.field1373[this.field1478][var69][var70];
                        int var86 = this.field1373[this.field1478][var69 + 1][var70];
                        int var87 = this.field1373[this.field1478][var69 + 1][var70 + 1];
                        int var88 = this.field1373[this.field1478][var69][var70 + 1];
                        Model var89 = var84.method331(var72, var73, var85, var86, var87, var88, -1);
                        if (var89 != null) {
                            this.method490(var70, 4823, var77 + 1, -1, this.field1478, 0, var69, var74, 0, var76 + 1);
                            var83.field467 = field1218 + var76;
                            var83.field468 = field1218 + var77;
                            var83.field472 = var89;
                            int var90 = var84.field960;
                            int var91 = var84.field961;
                            if (var73 == 1 || var73 == 3) {
                                var90 = var84.field961;
                                var91 = var84.field960;
                            }
                            var83.field469 = var69 * 128 + var90 * 64;
                            var83.field471 = var70 * 128 + var91 * 64;
                            var83.field470 = this.method458(var83.field469, var83.field471, 0, this.field1478);
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
                if (arg0 == 95) {
                    int var94 = arg2.method224();
                    int var95 = (var94 >> 4 & 7) + this.field1334;
                    int var96 = (var94 & 7) + this.field1335;
                    int var97 = arg2.method226();
                    int var98 = arg2.method226();
                    int var99 = arg2.method226();
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        LinkList var100 = this.field1232[this.field1478][var95][var96];
                        if (var100 != null) {
                            for (ObjStackEntity var101 = (ObjStackEntity) var100.method243(); var101 != null; var101 = (ObjStackEntity) var100.method245(this.field1374)) {
                                if ((var97 & 32767) == var101.field494 && var101.field495 == var98) {
                                    var101.field495 = var99;
                                    break;
                                }
                            }
                            this.method460(var95, var96);
                        }
                    }
                }
            }
        } else {
            int var102 = arg2.method224();
            int var103 = (var102 >> 4 & 7) + this.field1334;
            int var104 = (var102 & 7) + this.field1335;
            int var105 = arg2.method224();
            int var106 = var105 >> 2;
            int var107 = var105 & 3;
            int var108 = this.field1389[var106];
            int var109;
            if (arg0 == 173) {
                var109 = -1;
            } else {
                var109 = arg2.method226();
            }
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                this.method490(var104, 4823, -1, var109, this.field1478, var107, var103, var108, var106, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (this.field1311 == 0) {
            this.field1530[0] = "Cancel";
            this.field1609[0] = 1106;
            this.field1396 = 1;
            this.method491(false);
            this.field1546 = 0;
            if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                if (this.field1453 != -1) {
                    this.method477(super.field23, super.field22, 4, Component.field68[this.field1453], 0, 0, 4);
                } else {
                    this.method455(571);
                }
            }
            if (this.field1664 != this.field1546) {
                this.field1664 = this.field1546;
            }
            this.field1546 = 0;
            if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                if (this.field1632 != -1) {
                    this.method477(super.field23, super.field22, 205, Component.field68[this.field1632], 0, 0, 553);
                } else if (this.field1370[this.field1429] != -1) {
                    this.method477(super.field23, super.field22, 205, Component.field68[this.field1370[this.field1429]], 0, 0, 553);
                }
            }
            if (this.field1546 != this.field1432) {
                this.field1344 = true;
                this.field1432 = this.field1546;
            }
            this.field1546 = 0;
            if (arg0 < 4 || arg0 > 4) {
                this.field1232 = null;
            }
            if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                if (this.field1427 != -1) {
                    this.method477(super.field23, super.field22, 357, Component.field68[this.field1427], 0, 0, 17);
                } else if (super.field23 < 434 && super.field22 < 426) {
                    this.method498(super.field22 - 17, true, super.field23 - 357);
                }
            }
            if (this.field1427 != -1 && this.field1546 != this.field1482) {
                this.field1525 = true;
                this.field1482 = this.field1546;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1396 - 1; ++var3) {
                    if (this.field1609[var3] < 1000 && this.field1609[var3 + 1] > 1000) {
                        String var4 = this.field1530[var3];
                        this.field1530[var3] = this.field1530[var3 + 1];
                        this.field1530[var3 + 1] = var4;
                        int var5 = this.field1609[var3];
                        this.field1609[var3] = this.field1609[var3 + 1];
                        this.field1609[var3 + 1] = var5;
                        int var6 = this.field1607[var3];
                        this.field1607[var3] = this.field1607[var3 + 1];
                        this.field1607[var3 + 1] = var6;
                        int var7 = this.field1608[var3];
                        this.field1608[var3] = this.field1608[var3 + 1];
                        this.field1608[var3 + 1] = var7;
                        int var8 = this.field1610[var3];
                        this.field1610[var3] = this.field1610[var3 + 1];
                        this.field1610[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        int var2 = 43 / arg0;
        this.field1333 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method13(String arg0, int arg1, int arg2) {
        this.field1324 = arg1;
        if (arg2 >= 7 && arg2 <= 7) {
            this.field1244 = arg0;
            this.method424(this.field1261);
            if (this.field1358 == null) {
                super.method13(arg0, arg1, 7);
            } else {
                this.field1457.method253(field1376);
                short var4 = 360;
                short var5 = 200;
                byte var6 = 20;
                this.field1493.method200(var4 / 2, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...", false);
                int var7 = var5 / 2 - 18 - var6;
                Pix2D.method157(304, 9179409, 34, var4 / 2 - 152, var7, 394);
                Pix2D.method157(302, 0, 32, var4 / 2 - 151, var7 + 1, 394);
                Pix2D.method156(30, 9179409, arg1 * 3, var4 / 2 - 150, 0, var7 + 2);
                Pix2D.method156(30, 0, 300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150), 0, var7 + 2);
                this.field1493.method200(var4 / 2, var5 / 2 + 5 - var6, 16777215, arg0, false);
                this.field1457.method254(202, super.field14, (byte) 76, 171);
                if (this.field1333) {
                    this.field1333 = false;
                    if (!this.field1322) {
                        this.field1458.method254(0, super.field14, (byte) 76, 0);
                        this.field1459.method254(637, super.field14, (byte) 76, 0);
                    }
                    this.field1455.method254(128, super.field14, (byte) 76, 0);
                    this.field1456.method254(202, super.field14, (byte) 76, 371);
                    this.field1460.method254(0, super.field14, (byte) 76, 265);
                    this.field1461.method254(562, super.field14, (byte) 76, 265);
                    this.field1462.method254(128, super.field14, (byte) 76, 171);
                    this.field1463.method254(562, super.field14, (byte) 76, 171);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;III)V")
    public final void method477(int arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg3.field75 == 0 && arg3.field90 != null && !arg3.field89) {
            if (arg1 >= arg6 && arg0 >= arg2 && arg1 <= arg3.field78 + arg6 && arg0 <= arg3.field79 + arg2) {
                int var8 = arg3.field90.length;
                this.field1635 += arg4;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field91[var9] + arg6;
                    int var11 = arg3.field92[var9] + arg2 - arg5;
                    Component var12 = Component.field68[arg3.field90[var9]];
                    int var13 = var12.field81 + var10;
                    int var14 = var12.field82 + var11;
                    if ((var12.field86 >= 0 || var12.field113 != 0) && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                        if (var12.field86 >= 0) {
                            this.field1546 = var12.field86;
                        } else {
                            this.field1546 = var12.field73;
                        }
                    }
                    if (var12.field75 == 0) {
                        this.method477(arg0, arg1, var14, var12, 0, var12.field88, var13);
                        if (var12.field87 > var12.field79) {
                            this.method472(-782, var12.field79, var12, arg0, var14, var12.field78 + var13, arg1, true, var12.field87);
                        }
                    } else {
                        if (var12.field76 == 1 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            boolean var15 = false;
                            if (var12.field77 != 0) {
                                var15 = this.method432(var12, (byte) 15);
                            }
                            if (!var15) {
                                this.field1530[this.field1396] = var12.field129;
                                this.field1609[this.field1396] = 231;
                                this.field1608[this.field1396] = var12.field73;
                                ++this.field1396;
                            }
                        }
                        if (var12.field76 == 2 && this.field1612 == 0 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            String var16 = var12.field126;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1530[this.field1396] = var16 + " @gre@" + var12.field127;
                            this.field1609[this.field1396] = 274;
                            this.field1608[this.field1396] = var12.field73;
                            ++this.field1396;
                        }
                        if (var12.field76 == 3 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            this.field1530[this.field1396] = "Close";
                            this.field1609[this.field1396] = 737;
                            this.field1608[this.field1396] = var12.field73;
                            ++this.field1396;
                        }
                        if (var12.field76 == 4 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            this.field1530[this.field1396] = var12.field129;
                            this.field1609[this.field1396] = 435;
                            this.field1608[this.field1396] = var12.field73;
                            ++this.field1396;
                        }
                        if (var12.field76 == 5 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            this.field1530[this.field1396] = var12.field129;
                            this.field1609[this.field1396] = 225;
                            this.field1608[this.field1396] = var12.field73;
                            ++this.field1396;
                        }
                        if (var12.field76 == 6 && !this.field1584 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field78 + var13 && arg0 < var12.field79 + var14) {
                            this.field1530[this.field1396] = var12.field129;
                            this.field1609[this.field1396] = 997;
                            this.field1608[this.field1396] = var12.field73;
                            ++this.field1396;
                        }
                        if (var12.field75 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field79; ++var18) {
                                for (int var19 = 0; var19 < var12.field78; ++var19) {
                                    int var20 = (var12.field99 + 32) * var19 + var13;
                                    int var21 = (var12.field100 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field102[var17];
                                        var21 += var12.field103[var17];
                                    }
                                    if (arg1 >= var20 && arg0 >= var21 && arg1 < var20 + 32 && arg0 < var21 + 32) {
                                        this.field1378 = var17;
                                        this.field1379 = var12.field73;
                                        if (var12.field69[var17] > 0) {
                                            ObjType var22 = ObjType.method341(var12.field69[var17] - 1);
                                            if (this.field1227 == 1 && var12.field96) {
                                                if (this.field1229 != var12.field73 || this.field1228 != var17) {
                                                    this.field1530[this.field1396] = "Use " + this.field1231 + " with @lre@" + var22.field1042;
                                                    this.field1609[this.field1396] = 398;
                                                    this.field1610[this.field1396] = var22.field1040;
                                                    this.field1607[this.field1396] = var17;
                                                    this.field1608[this.field1396] = var12.field73;
                                                    ++this.field1396;
                                                }
                                            } else if (this.field1612 == 1 && var12.field96) {
                                                if ((this.field1614 & 16) == 16) {
                                                    this.field1530[this.field1396] = this.field1615 + " @lre@" + var22.field1042;
                                                    this.field1609[this.field1396] = 563;
                                                    this.field1610[this.field1396] = var22.field1040;
                                                    this.field1607[this.field1396] = var17;
                                                    this.field1608[this.field1396] = var12.field73;
                                                    ++this.field1396;
                                                }
                                            } else {
                                                if (var12.field96) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1057 != null && var22.field1057[var23] != null) {
                                                            this.field1530[this.field1396] = var22.field1057[var23] + " @lre@" + var22.field1042;
                                                            if (var23 == 3) {
                                                                this.field1609[this.field1396] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1609[this.field1396] = 100;
                                                            }
                                                            this.field1610[this.field1396] = var22.field1040;
                                                            this.field1607[this.field1396] = var17;
                                                            this.field1608[this.field1396] = var12.field73;
                                                            ++this.field1396;
                                                        } else if (var23 == 4) {
                                                            this.field1530[this.field1396] = "Drop @lre@" + var22.field1042;
                                                            this.field1609[this.field1396] = 100;
                                                            this.field1610[this.field1396] = var22.field1040;
                                                            this.field1607[this.field1396] = var17;
                                                            this.field1608[this.field1396] = var12.field73;
                                                            ++this.field1396;
                                                        }
                                                    }
                                                }
                                                if (var12.field97) {
                                                    this.field1530[this.field1396] = "Use @lre@" + var22.field1042;
                                                    this.field1609[this.field1396] = 102;
                                                    this.field1610[this.field1396] = var22.field1040;
                                                    this.field1607[this.field1396] = var17;
                                                    this.field1608[this.field1396] = var12.field73;
                                                    ++this.field1396;
                                                }
                                                if (var12.field96 && var22.field1057 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1057[var24] != null) {
                                                            this.field1530[this.field1396] = var22.field1057[var24] + " @lre@" + var22.field1042;
                                                            if (var24 == 0) {
                                                                this.field1609[this.field1396] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1609[this.field1396] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1609[this.field1396] = 795;
                                                            }
                                                            this.field1610[this.field1396] = var22.field1040;
                                                            this.field1607[this.field1396] = var17;
                                                            this.field1608[this.field1396] = var12.field73;
                                                            ++this.field1396;
                                                        }
                                                    }
                                                }
                                                if (var12.field104 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field104[var25] != null) {
                                                            this.field1530[this.field1396] = var12.field104[var25] + " @lre@" + var22.field1042;
                                                            if (var25 == 0) {
                                                                this.field1609[this.field1396] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1609[this.field1396] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1609[this.field1396] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1609[this.field1396] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1609[this.field1396] = 354;
                                                            }
                                                            this.field1610[this.field1396] = var22.field1040;
                                                            this.field1607[this.field1396] = var17;
                                                            this.field1608[this.field1396] = var12.field73;
                                                            ++this.field1396;
                                                        }
                                                    }
                                                }
                                                this.field1530[this.field1396] = "Examine @lre@" + var22.field1042;
                                                this.field1609[this.field1396] = 1328;
                                                this.field1610[this.field1396] = var22.field1040;
                                                this.field1607[this.field1396] = var17;
                                                this.field1608[this.field1396] = var12.field73;
                                                ++this.field1396;
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

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method478(boolean arg0) {
        if (arg0) {
            this.field1242 = !this.field1242;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1340.method243(); var2 != null; var2 = (SpotAnimEntity) this.field1340.method245(this.field1374)) {
            if (this.field1478 == var2.field605 && !var2.field611) {
                if (field1218 >= var2.field604) {
                    var2.method150(0, this.field1391);
                    if (var2.field611) {
                        var2.method106();
                    } else {
                        this.field1331.method61(var2.field608, var2, var2.field606, -1, var2.field607, (byte) 1, 60, 0, var2.field605, false);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method479(int arg0) {
        if (this.field1639 > 0) {
            this.method488(false);
        } else {
            this.field1280.method253(field1376);
            this.field1492.method200(257, 144, 0, "Connection lost", false);
            this.field1492.method200(256, 143, 16777215, "Connection lost", false);
            this.field1635 += arg0;
            this.field1492.method200(257, 159, 0, "Please wait - attempting to reestablish", false);
            this.field1492.method200(256, 158, 16777215, "Please wait - attempting to reestablish", false);
            this.field1280.method254(4, super.field14, (byte) 76, 4);
            this.field1447 = 0;
            this.field1441 = 0;
            ClientStream var2 = this.field1524;
            this.field1321 = false;
            this.method456(this.field1563, this.field1564, true);
            if (!this.field1321) {
                this.method488(false);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method480(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public static final void method481(int arg0) {
        World3D.field282 = false;
        Pix3D.field628 = false;
        field1656 = false;
        if (arg0 != 10969) {
            field1317 = -278;
        }
        World.field42 = false;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1591) {
            this.method493(-568);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method482(int arg0) {
        if (this.field1490 != 0) {
            PixFont var2 = this.field1492;
            if (arg0 == 3) {
                int var3 = 0;
                if (this.field1219 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1366[var4] != null) {
                        int var5 = this.field1364[var4];
                        String var6 = this.field1365[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(-238, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method203(var9, "From", 0, var8, true);
                            var2.method203(var9, "From", 65535, var8 - 1, true);
                            int var10 = var9 + var2.method202(-43341, "From ");
                            if (var7 == 1) {
                                this.field1330[0].method198(this.field1486, var10, var8 - 12);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field1330[1].method198(this.field1486, var10, var8 - 12);
                                var10 += 14;
                            }
                            var2.method203(var10, var6 + ": " + this.field1366[var4], 0, var8, true);
                            var2.method203(var10, var6 + ": " + this.field1366[var4], 65535, var8 - 1, true);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field1388 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method203(4, this.field1366[var4], 0, var11, true);
                            var2.method203(4, this.field1366[var4], 65535, var11 - 1, true);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field1388 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method203(4, "To " + var6 + ": " + this.field1366[var4], 0, var12, true);
                            var2.method203(4, "To " + var6 + ": " + this.field1366[var4], 65535, var12 - 1, true);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method483(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1539; ++var4) {
            int var5 = this.field1540[var4];
            PlayerEntity var6 = this.field1536[var5];
            int var7 = arg0.method224();
            if ((var7 & 128) == 128) {
                var7 += arg0.method224() << 8;
            }
            this.method509(var7, var5, (byte) 3, var6, arg0);
        }
        if (arg1 != -45473) {
            field1640 = this.field1360.method290();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BI)V")
    public final void method484(boolean arg0, byte[] arg1, int arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (arg2 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method485(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg2 - arg1;
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

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (arg0 != 33993) {
            this.field1636 = this.field1551.method224();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method487(int arg0, boolean arg1) {
        if (arg1) {
            field1651 = this.field1360.method290();
        }
        int[] var3 = this.field1443.field661;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1243[arg0][var24][var6] & 24) == 0) {
                    this.field1331.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1243[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1331.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1443.method180(field1376);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1243[arg0][var22][var9] & 24) == 0) {
                    this.method449(var22, var7, var9, var8, arg0, 15485);
                }
                if (arg0 < 3 && (this.field1243[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method449(var22, var7, var9, var8, arg0 + 1, 15485);
                }
            }
        }
        this.field1280.method253(field1376);
        this.field1403 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1331.method79(this.field1478, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method325(var13).field973;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1521[this.field1478].field1094;
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
                        this.field1620[this.field1403] = this.field1359[var14];
                        this.field1404[this.field1403] = var15;
                        this.field1405[this.field1403] = var16;
                        ++this.field1403;
                    }
                }
            }
        }
        ++field1412;
        if (field1412 > 112) {
            field1412 = 0;
            this.field1259.method213((byte) 117, 52);
            this.field1259.method214(50);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        try {
            if (this.field1524 != null) {
                this.field1524.method38();
            }
        } catch (Exception var3) {
        }
        this.field1524 = null;
        if (!arg0) {
            this.field1321 = false;
            this.field1421 = 0;
            this.field1563 = "";
            this.field1564 = "";
            this.method533(-501);
            this.field1331.method50((byte) 52);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1521[var2].method352((byte) 5);
            }
            System.gc();
            this.method486(33993);
            this.field1446 = -1;
            this.field1599 = -1;
            this.field1343 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILnb;)V")
    private final void method489(int arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field728 == 0) {
            var3 = this.field1331.method76(arg1.field727, arg1.field729, arg1.field730);
        }
        if (arg1.field728 == 1) {
            var3 = this.field1331.method77(arg1.field730, arg1.field729, arg1.field727, this.field1419);
        }
        if (arg1.field728 == 2) {
            var3 = this.field1331.method78(arg1.field727, arg1.field729, arg1.field730);
        }
        if (arg1.field728 == 3) {
            var3 = this.field1331.method79(arg1.field727, arg1.field729, arg1.field730);
        }
        if (var3 != 0) {
            int var7 = this.field1331.method80(arg1.field727, arg1.field729, arg1.field730, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field731 = var4;
        arg1.field733 = var5;
        if (arg0 >= 0) {
            this.field1636 = -1;
        }
        arg1.field732 = var6;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        if (arg1 != 4823) {
            this.field1568 = !this.field1568;
        }
        for (LocSpawned var12 = (LocSpawned) this.field1644.method243(); var12 != null; var12 = (LocSpawned) this.field1644.method245(this.field1374)) {
            if (var12.field727 == arg4 && var12.field729 == arg6 && var12.field730 == arg0 && var12.field728 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field727 = arg4;
            var11.field728 = arg7;
            var11.field729 = arg6;
            var11.field730 = arg0;
            this.method489(-452, var11);
            this.field1644.method240(var11);
        }
        var11.field734 = arg3;
        var11.field736 = arg8;
        var11.field735 = arg5;
        var11.field737 = arg9;
        var11.field738 = arg2;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method491(boolean arg0) {
        if (this.field1490 != 0) {
            int var2 = 0;
            if (this.field1219 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1366[var3] != null) {
                    int var5 = this.field1364[var3];
                    String var6 = this.field1365[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(-238, var6))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field22 > 4 && super.field23 - 4 > var10 - 10 && super.field23 - 4 <= var10 + 3) {
                            int var11 = this.field1492.method202(-43341, "From:  " + var6 + this.field1366[var3]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field22 < var11 + 4) {
                                if (this.field1282 >= 1) {
                                    this.field1530[this.field1396] = "Report abuse @whi@" + var6;
                                    this.field1609[this.field1396] = 2524;
                                    ++this.field1396;
                                }
                                this.field1530[this.field1396] = "Add ignore @whi@" + var6;
                                this.field1609[this.field1396] = 2047;
                                ++this.field1396;
                                this.field1530[this.field1396] = "Add friend @whi@" + var6;
                                this.field1609[this.field1396] = 2605;
                                ++this.field1396;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field1388 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method492(String arg0) throws IOException {
        if (!this.field1469) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1420 != null) {
                try {
                    this.field1420.close();
                } catch (Exception var4) {
                }
                this.field1420 = null;
            }
            this.field1420 = this.method480(43595);
            this.field1420.setSoTimeout(10000);
            InputStream var2 = this.field1420.getInputStream();
            OutputStream var3 = this.field1420.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method493(int arg0) {
        this.field1392 = true;
        if (arg0 >= 0) {
            this.field1232 = null;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1322) {
                ++this.field1382;
                this.method494((byte) 9);
                this.method494((byte) 9);
                this.method536(35604);
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
        this.field1392 = false;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method494(byte arg0) {
        if (this.field1430 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        short var3 = 256;
        for (int var4 = 10; var4 < 117; ++var4) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field1393[(var3 - 2 << 7) + var4] = 255;
            }
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field1393[var18] = 192;
        }
        for (int var6 = 1; var6 < var3 - 1; ++var6) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var6 << 7) + var14;
                this.field1394[var15] = (this.field1393[var15 - 1] + this.field1393[var15 + 1] + this.field1393[var15 - 128] + this.field1393[var15 + 128]) / 4;
            }
        }
        this.field1479 += 128;
        if (this.field1479 > this.field1527.length) {
            this.field1479 -= this.field1527.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method508(512, this.field1645[var7]);
        }
        for (int var8 = 1; var8 < var3 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field1394[var12 + 128] - this.field1527[this.field1479 + var12 & this.field1527.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field1393[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var3 - 1; ++var9) {
            this.field1319[var9] = this.field1319[var9 + 1];
        }
        this.field1319[var3 - 1] = (int) (Math.sin((double) field1218 / 14.0D) * 16.0D + Math.sin((double) field1218 / 15.0D) * 14.0D + Math.sin((double) field1218 / 16.0D) * 12.0D);
        if (this.field1410 > 0) {
            this.field1410 -= 4;
        }
        if (this.field1411 > 0) {
            this.field1411 -= 4;
        }
        if (this.field1410 == 0 && this.field1411 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field1410 = 1024;
            }
            if (var10 == 1) {
                this.field1411 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method495(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            field1317 = -139;
        }
        if (this.field1421 == 0) {
            int var2 = super.field12 / 2 - 80;
            int var3 = super.field13 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field28 == 1 && super.field29 >= var2 - 75 && super.field29 <= var2 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1421 = 3;
                this.field1371 = 0;
            }
            int var4 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var4 - 75 && super.field29 <= var4 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1348 = "";
                this.field1349 = "Enter your username & password.";
                this.field1421 = 2;
                this.field1371 = 0;
            }
        } else if (this.field1421 == 2) {
            int var5 = super.field13 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field28 == 1 && super.field30 >= var16 - 15 && super.field30 < var16) {
                this.field1371 = 0;
            }
            var5 = var16 + 15;
            if (super.field28 == 1 && super.field30 >= var5 - 15 && super.field30 < var5) {
                this.field1371 = 1;
            }
            var5 += 15;
            int var6 = super.field12 / 2 - 80;
            int var7 = super.field13 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field28 == 1 && super.field29 >= var6 - 75 && super.field29 <= var6 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.method456(this.field1563, this.field1564, false);
                if (this.field1321) {
                    return;
                }
            }
            int var8 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var8 - 75 && super.field29 <= var8 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.field1421 = 0;
                this.field1563 = "";
                this.field1564 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) 5);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1223.length(); ++var11) {
                        if (var9 == field1223.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1371 == 0) {
                        if (var9 == 8 && this.field1563.length() > 0) {
                            this.field1563 = this.field1563.substring(0, this.field1563.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1371 = 1;
                        }
                        if (var10) {
                            this.field1563 = this.field1563 + (char) var9;
                        }
                        if (this.field1563.length() > 12) {
                            this.field1563 = this.field1563.substring(0, 12);
                        }
                    } else if (this.field1371 == 1) {
                        if (var9 == 8 && this.field1564.length() > 0) {
                            this.field1564 = this.field1564.substring(0, this.field1564.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1371 = 0;
                        }
                        if (var10) {
                            this.field1564 = this.field1564 + (char) var9;
                        }
                        if (this.field1564.length() > 20) {
                            this.field1564 = this.field1564.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1421 == 3) {
                int var12 = super.field12 / 2;
                int var13 = super.field13 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field28 == 1 && super.field29 >= var12 - 75 && super.field29 <= var12 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                    this.field1421 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILib;)V")
    public final void method496(int arg0, int arg1, int arg2, Pix32 arg3) {
        if (arg2 < 4 || arg2 > 4) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field1633 + this.field1622 & 2047;
            int var8 = Model.field599[var7];
            int var9 = Model.field600[var7];
            int var10 = var8 * 256 / (this.field1586 + 256);
            int var11 = var9 * 256 / (this.field1586 + 256);
            int var12 = arg0 * var11 + arg1 * var10 >> 16;
            int var13 = arg1 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field1542.method190(15, 20, var16 + 94 + 4 - 10, 83 - var17 - 20, var14, 256, (byte) -32, 15, 20);
        } else {
            this.method441(arg1, arg0, (byte) -111, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    private final void method497(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (LocSpawned var4 = (LocSpawned) this.field1644.method243(); var4 != null; var4 = (LocSpawned) this.field1644.method245(this.field1374)) {
            if (var4.field738 == -1) {
                var4.field737 = 0;
                this.method489(-452, var4);
            } else {
                var4.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method498(int arg0, boolean arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1366[var5] != null) {
                int var6 = this.field1364[var5];
                int var7 = 70 - var4 * 14 + this.field1498 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1365[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1383 == 0 || this.field1383 == 1 && this.method430(-238, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field1668.field457)) {
                        if (this.field1282 >= 1) {
                            this.field1530[this.field1396] = "Report abuse @whi@" + var8;
                            this.field1609[this.field1396] = 524;
                            ++this.field1396;
                        }
                        this.field1530[this.field1396] = "Add ignore @whi@" + var8;
                        this.field1609[this.field1396] = 47;
                        ++this.field1396;
                        this.field1530[this.field1396] = "Add friend @whi@" + var8;
                        this.field1609[this.field1396] = 605;
                        ++this.field1396;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1490 == 0 && (var6 == 7 || this.field1388 == 0 || this.field1388 == 1 && this.method430(-238, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1282 >= 1) {
                            this.field1530[this.field1396] = "Report abuse @whi@" + var8;
                            this.field1609[this.field1396] = 524;
                            ++this.field1396;
                        }
                        this.field1530[this.field1396] = "Add ignore @whi@" + var8;
                        this.field1609[this.field1396] = 47;
                        ++this.field1396;
                        this.field1530[this.field1396] = "Add friend @whi@" + var8;
                        this.field1609[this.field1396] = 605;
                        ++this.field1396;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(-238, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1530[this.field1396] = "Accept trade @whi@" + var8;
                        this.field1609[this.field1396] = 507;
                        ++this.field1396;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1490 == 0 && this.field1388 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1221 == 0 || this.field1221 == 1 && this.method430(-238, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1530[this.field1396] = "Accept duel @whi@" + var8;
                        this.field1609[this.field1396] = 957;
                        ++this.field1396;
                    }
                    ++var4;
                }
            }
        }
        if (!arg1) {
            this.field1232 = null;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method499(int arg0) {
        this.field1679 = new Pix8(this.field1358, "titlebox", 0);
        this.field1680 = new Pix8(this.field1358, "titlebutton", 0);
        this.field1645 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1645[var3] = new Pix8(this.field1358, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1645[var4] = new Pix8(this.field1358, "runes", (var4 & 3) + 12);
            }
        }
        this.field1307 = new Pix32(128, 265);
        if (arg0 != 4) {
            this.field1636 = this.field1551.method224();
        }
        this.field1308 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1307.field661[var5] = this.field1458.field749[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1308.field661[var6] = this.field1459.field749[var6];
        }
        this.field1353 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1353[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1353[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1353[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1353[var10 + 192] = 16777215;
        }
        this.field1354 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1354[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1354[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1354[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1354[var14 + 192] = 16777215;
        }
        this.field1355 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1355[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1355[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1355[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1355[var18 + 192] = 16777215;
        }
        this.field1352 = new int[256];
        this.field1527 = new int[32768];
        this.field1528 = new int[32768];
        this.method508(512, (Pix8) null);
        this.field1393 = new int[32768];
        this.field1394 = new int[32768];
        this.method13("Connecting to fileserver", 10, 7);
        if (!this.field1322) {
            this.field1591 = true;
            this.field1322 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method500(int arg0) {
        if (this.field1281 == null) {
            this.method522(0);
            super.field15 = null;
            this.field1455 = null;
            this.field1456 = null;
            this.field1457 = null;
            this.field1458 = null;
            this.field1459 = null;
            int var2 = 12 / arg0;
            this.field1460 = null;
            this.field1461 = null;
            this.field1462 = null;
            this.field1463 = null;
            this.field1281 = new PixMap(96, field1356, 479, this.method11(field1518));
            this.field1279 = new PixMap(156, field1356, 172, this.method11(field1518));
            Pix2D.method154(8);
            this.field1618.method198(this.field1486, 0, 0);
            this.field1278 = new PixMap(261, field1356, 190, this.method11(field1518));
            this.field1280 = new PixMap(334, field1356, 512, this.method11(field1518));
            Pix2D.method154(8);
            this.field1406 = new PixMap(50, field1356, 496, this.method11(field1518));
            this.field1407 = new PixMap(37, field1356, 269, this.method11(field1518));
            this.field1408 = new PixMap(45, field1356, 249, this.method11(field1518));
            this.field1333 = true;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)Ljava/lang/String;")
    public final String method501(int arg0) {
        int var2 = 90 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field17 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method502(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method235(8, (byte) -96);
        int var10000 = arg0 + arg2;
        if (var4 < this.field1537) {
            for (int var6 = var4; var6 < this.field1537; ++var6) {
                this.field1481[this.field1480++] = this.field1538[var6];
            }
        }
        if (var4 > this.field1537) {
            signlink.reporterror(this.field1563 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1537 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1538[var7];
                PlayerEntity var9 = this.field1536[var8];
                int var10 = arg1.method235(1, (byte) -96);
                if (var10 == 0) {
                    this.field1538[this.field1537++] = var8;
                    var9.field442 = field1218;
                } else {
                    int var11 = arg1.method235(2, (byte) -96);
                    if (var11 == 0) {
                        this.field1538[this.field1537++] = var8;
                        var9.field442 = field1218;
                        this.field1540[this.field1539++] = var8;
                    } else if (var11 == 1) {
                        this.field1538[this.field1537++] = var8;
                        var9.field442 = field1218;
                        int var12 = arg1.method235(3, (byte) -96);
                        var9.method111(true, var12, false);
                        int var13 = arg1.method235(1, (byte) -96);
                        if (var13 == 1) {
                            this.field1540[this.field1539++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1538[this.field1537++] = var8;
                        var9.field442 = field1218;
                        int var14 = arg1.method235(3, (byte) -96);
                        var9.method111(true, var14, true);
                        int var15 = arg1.method235(3, (byte) -96);
                        var9.method111(true, var15, true);
                        int var16 = arg1.method235(1, (byte) -96);
                        if (var16 == 1) {
                            this.field1540[this.field1539++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1481[this.field1480++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method503(int arg0) {
        int var2 = this.field1493.method202(-43341, "Choose Option");
        for (int var3 = 0; var3 < this.field1396; ++var3) {
            int var11 = this.field1493.method202(-43341, this.field1530[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        this.field1635 += arg0;
        int var4 = this.field1396 * 15 + 21;
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
            this.field1267 = true;
            this.field1670 = 0;
            this.field1671 = var5;
            this.field1672 = var6;
            this.field1673 = var2;
            this.field1674 = this.field1396 * 15 + 22;
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
            this.field1267 = true;
            this.field1670 = 1;
            this.field1671 = var7;
            this.field1672 = var8;
            this.field1673 = var2;
            this.field1674 = this.field1396 * 15 + 22;
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
            this.field1267 = true;
            this.field1670 = 2;
            this.field1671 = var9;
            this.field1672 = var10;
            this.field1673 = var2;
            this.field1674 = this.field1396 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method504(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1377 >= 100) {
                this.method457(-476, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method299(131, JString.method296(0, arg0));
                if (arg1) {
                    this.field1642 = !this.field1642;
                }
                for (int var5 = 0; var5 < this.field1377; ++var5) {
                    if (this.field1233[var5] == arg0) {
                        this.method457(-476, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1531; ++var6) {
                    if (this.field1575[var6] == arg0) {
                        this.method457(-476, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1233[this.field1377++] = arg0;
                this.field1344 = true;
                this.field1259.method213((byte) 117, 255);
                this.field1259.method220(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method505(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        if (arg1) {
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

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1653 = Integer.parseInt(this.getParameter("nodeid"));
        field1654 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method462(true);
        } else {
            method481(10969);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1655 = false;
        } else {
            field1655 = true;
        }
        this.method2(503, 765, (byte) 23);
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method506(boolean arg0) {
        this.field1278.method253(field1376);
        Pix3D.field639 = this.field1660;
        this.field1617.method198(this.field1486, 0, 0);
        if (this.field1632 != -1) {
            this.method535(0, Component.field68[this.field1632], 0, 0, (byte) 0);
        } else if (this.field1370[this.field1429] != -1) {
            this.method535(0, Component.field68[this.field1370[this.field1429]], 0, 0, (byte) 0);
        }
        if (this.field1267 && this.field1670 == 1) {
            this.method423(-593);
        }
        this.field1278.method254(553, super.field14, (byte) 76, 205);
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1280.method253(field1376);
        Pix3D.field639 = this.field1661;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLlb;)V")
    private final void method507(int arg0, byte arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1539; ++var4) {
            int var5 = this.field1540[var4];
            NpcEntity var6 = this.field1675[var5];
            int var7 = arg2.method224();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method224();
                int var9 = arg2.method224();
                var6.method114(field1218, (byte) 8, var8, var9);
                var6.field416 = field1218 + 300;
                var6.field417 = arg2.method224();
                var6.field418 = arg2.method224();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method226();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field425 == var10) {
                    var6.field429 = 0;
                }
                int var11 = arg2.method224();
                if (var6.field425 == var10 && var10 != -1) {
                    int var12 = SeqType.field1133[var10].field1147;
                    if (var12 == 1) {
                        var6.field426 = 0;
                        var6.field427 = 0;
                        var6.field428 = var11;
                        var6.field429 = 0;
                    }
                    if (var12 == 2) {
                        var6.field429 = 0;
                    }
                } else if (var10 == -1 || var6.field425 == -1 || SeqType.field1133[var10].field1141 >= SeqType.field1133[var6.field425].field1141) {
                    var6.field425 = var10;
                    var6.field426 = 0;
                    var6.field427 = 0;
                    var6.field428 = var11;
                    var6.field429 = 0;
                    var6.field451 = var6.field446;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field419 = arg2.method226();
                if (var6.field419 == 65535) {
                    var6.field419 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field409 = arg2.method231();
                var6.field410 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method224();
                int var14 = arg2.method224();
                var6.method114(field1218, (byte) 8, var13, var14);
                var6.field416 = field1218 + 300;
                var6.field417 = arg2.method224();
                var6.field418 = arg2.method224();
            }
            if ((var7 & 32) == 32) {
                var6.field453 = NpcType.method335(arg2.method226());
                var6.field401 = var6.field453.field1006;
                var6.field445 = var6.field453.field1028;
                var6.field404 = var6.field453.field1010;
                var6.field405 = var6.field453.field1011;
                var6.field406 = var6.field453.field1012;
                var6.field407 = var6.field453.field1013;
                var6.field402 = var6.field453.field1009;
            }
            if ((var7 & 64) == 64) {
                var6.field430 = arg2.method226();
                int var15 = arg2.method229();
                var6.field434 = var15 >> 16;
                var6.field433 = (var15 & 65535) + field1218;
                var6.field431 = 0;
                var6.field432 = 0;
                if (var6.field433 > field1218) {
                    var6.field431 = -1;
                }
                if (var6.field430 == 65535) {
                    var6.field430 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field420 = arg2.method226();
                var6.field421 = arg2.method226();
            }
        }
        if (arg1 != 4) {
            this.field1232 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method508(int arg0, Pix8 arg1) {
        short var3 = 256;
        if (arg0 <= 0) {
            this.field1636 = this.field1551.method224();
        }
        for (int var4 = 0; var4 < this.field1527.length; ++var4) {
            this.field1527[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1527[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1528[var16] = (this.field1527[var16 - 1] + this.field1527[var16 + 1] + this.field1527[var16 - 128] + this.field1527[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1527;
            this.field1527 = this.field1528;
            this.field1528 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field678; ++var8) {
                for (int var9 = 0; var9 < arg1.field677; ++var9) {
                    if (arg1.field675[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field679;
                        int var11 = var8 + 16 + arg1.field680;
                        int var12 = (var11 << 7) + var10;
                        this.field1527[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBLab;Llb;)V")
    private final void method509(int arg0, int arg1, byte arg2, PlayerEntity arg3, Packet arg4) {
        if (this.field1252 == arg2) {
            if ((arg0 & 1) == 1) {
                int var6 = arg4.method224();
                byte[] var7 = new byte[var6];
                Packet var8 = new Packet(var7, (byte) 1);
                arg4.method233(var6, var7, 0, 0);
                this.field1541[arg1] = var8;
                arg3.method116(var8, this.field1217);
            }
            if ((arg0 & 2) == 2) {
                int var9 = arg4.method226();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (arg3.field425 == var9) {
                    arg3.field429 = 0;
                }
                int var10 = arg4.method224();
                if (arg3.field425 == var9 && var9 != -1) {
                    int var11 = SeqType.field1133[var9].field1147;
                    if (var11 == 1) {
                        arg3.field426 = 0;
                        arg3.field427 = 0;
                        arg3.field428 = var10;
                        arg3.field429 = 0;
                    }
                    if (var11 == 2) {
                        arg3.field429 = 0;
                    }
                } else if (var9 == -1 || arg3.field425 == -1 || SeqType.field1133[var9].field1141 >= SeqType.field1133[arg3.field425].field1141) {
                    arg3.field425 = var9;
                    arg3.field426 = 0;
                    arg3.field427 = 0;
                    arg3.field428 = var10;
                    arg3.field429 = 0;
                    arg3.field451 = arg3.field446;
                }
            }
            if ((arg0 & 4) == 4) {
                arg3.field419 = arg4.method226();
                if (arg3.field419 == 65535) {
                    arg3.field419 = -1;
                }
            }
            if ((arg0 & 8) == 8) {
                arg3.field409 = arg4.method231();
                arg3.field411 = 0;
                arg3.field412 = 0;
                arg3.field410 = 150;
                this.method457(-476, 2, arg3.field457, arg3.field409);
            }
            if ((arg0 & 16) == 16) {
                int var12 = arg4.method224();
                int var13 = arg4.method224();
                arg3.method114(field1218, (byte) 8, var12, var13);
                arg3.field416 = field1218 + 300;
                arg3.field417 = arg4.method224();
                arg3.field418 = arg4.method224();
            }
            if ((arg0 & 32) == 32) {
                arg3.field420 = arg4.method226();
                arg3.field421 = arg4.method226();
            }
            if ((arg0 & 64) == 64) {
                int var14 = arg4.method226();
                int var15 = arg4.method224();
                int var16 = arg4.method224();
                int var17 = arg4.field709;
                if (arg3.field457 != null && arg3.field458) {
                    long var18 = JString.method295(arg3.field457);
                    boolean var20 = false;
                    if (var15 <= 1) {
                        for (int var21 = 0; var21 < this.field1377; ++var21) {
                            if (this.field1233[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                    if (!var20 && this.field1306 == 0) {
                        try {
                            String var22 = WordPack.method302((byte) 8, var16, arg4);
                            String var23 = WordFilter.method394((byte) 3, var22);
                            arg3.field409 = var23;
                            arg3.field411 = var14 >> 8;
                            arg3.field412 = var14 & 255;
                            arg3.field410 = 150;
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method457(-476, 1, "@cr1@" + arg3.field457, var23);
                                } else {
                                    this.method457(-476, 2, arg3.field457, var23);
                                }
                            } else {
                                this.method457(-476, 1, "@cr2@" + arg3.field457, var23);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg4.field709 = var16 + var17;
            }
            if ((arg0 & 256) == 256) {
                arg3.field430 = arg4.method226();
                int var25 = arg4.method229();
                arg3.field434 = var25 >> 16;
                arg3.field433 = (var25 & 65535) + field1218;
                arg3.field431 = 0;
                arg3.field432 = 0;
                if (arg3.field433 > field1218) {
                    arg3.field431 = -1;
                }
                if (arg3.field430 == 65535) {
                    arg3.field430 = -1;
                }
            }
            if ((arg0 & 512) == 512) {
                arg3.field435 = arg4.method224();
                arg3.field437 = arg4.method224();
                arg3.field436 = arg4.method224();
                arg3.field438 = arg4.method224();
                arg3.field439 = arg4.method226() + field1218;
                arg3.field440 = arg4.method226() + field1218;
                arg3.field441 = arg4.method224();
                arg3.method112(false);
            }
            if ((arg0 & 1024) == 1024) {
                int var26 = arg4.method224();
                int var27 = arg4.method224();
                arg3.method114(field1218, (byte) 8, var26, var27);
                arg3.field416 = field1218 + 300;
                arg3.field417 = arg4.method224();
                arg3.field418 = arg4.method224();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method510(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1531 >= 100 && this.field1224 != 1) {
                this.method457(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field1531 >= 200) {
                this.method457(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = JString.method299(131, JString.method296(0, arg1));
                for (int var5 = 0; var5 < this.field1531; ++var5) {
                    if (this.field1575[var5] == arg1) {
                        this.method457(-476, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                int var6 = 88 / arg0;
                for (int var7 = 0; var7 < this.field1377; ++var7) {
                    if (this.field1233[var7] == arg1) {
                        this.method457(-476, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1668.field457)) {
                    this.field1249[this.field1531] = var4;
                    this.field1575[this.field1531] = arg1;
                    this.field1489[this.field1531] = 0;
                    ++this.field1531;
                    this.field1344 = true;
                    this.field1259.method213((byte) 117, 13);
                    this.field1259.method220(arg1, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field1451 && !this.field1590 && !this.field1314) {
            ++field1258;
            if (!this.field1321) {
                this.method461(false, false);
            } else {
                this.method550(41329);
            }
            this.field1409 = 0;
        } else {
            this.method516(15447);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method511(byte arg0) {
        this.field1279.method253(field1376);
        if (this.field1447 == 2) {
            byte[] var2 = this.field1618.field675;
            int[] var3 = Pix2D.field615;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1501.method189(256, 25, 33, 33, 0, this.field1470, 25, this.field1299, -582, this.field1622, 0);
            this.field1280.method253(field1376);
        } else {
            int var6 = this.field1633 + this.field1622 & 2047;
            int var7 = field1668.field397 / 32 + 48;
            int var8 = 464 - field1668.field398 / 32;
            this.field1443.method189(this.field1586 + 256, var7, 146, 151, 25, this.field1566, var8, this.field1552, -582, var6, 5);
            if (this.field1214 == arg0) {
                boolean var9 = false;
                this.field1501.method189(256, 25, 33, 33, 0, this.field1470, 25, this.field1299, -582, this.field1622, 0);
                for (int var10 = 0; var10 < this.field1403; ++var10) {
                    int var38 = this.field1404[var10] * 4 + 2 - field1668.field397 / 32;
                    int var39 = this.field1405[var10] * 4 + 2 - field1668.field398 / 32;
                    this.method441(var39, var38, (byte) -111, this.field1620[var10]);
                }
                for (int var11 = 0; var11 < 104; ++var11) {
                    for (int var34 = 0; var34 < 104; ++var34) {
                        LinkList var35 = this.field1232[this.field1478][var11][var34];
                        if (var35 != null) {
                            int var36 = var11 * 4 + 2 - field1668.field397 / 32;
                            int var37 = var34 * 4 + 2 - field1668.field398 / 32;
                            this.method441(var37, var36, (byte) -111, this.field1603);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field1676; ++var12) {
                    NpcEntity var31 = this.field1675[this.field1677[var12]];
                    if (var31 != null && var31.method113(0) && var31.field453.field1020) {
                        int var32 = var31.field397 / 32 - field1668.field397 / 32;
                        int var33 = var31.field398 / 32 - field1668.field398 / 32;
                        this.method441(var33, var32, (byte) -111, this.field1604);
                    }
                }
                for (int var13 = 0; var13 < this.field1537; ++var13) {
                    PlayerEntity var24 = this.field1536[this.field1538[var13]];
                    if (var24 != null && var24.method113(0)) {
                        int var25 = var24.field397 / 32 - field1668.field397 / 32;
                        int var26 = var24.field398 / 32 - field1668.field398 / 32;
                        boolean var27 = false;
                        long var28 = JString.method295(var24.field457);
                        for (int var30 = 0; var30 < this.field1531; ++var30) {
                            if (this.field1575[var30] == var28 && this.field1489[var30] != 0) {
                                var27 = true;
                                break;
                            }
                        }
                        if (var27) {
                            this.method441(var26, var25, (byte) -111, this.field1606);
                        } else {
                            this.method441(var26, var25, (byte) -111, this.field1605);
                        }
                    }
                }
                if (this.field1616 != 0 && field1218 % 20 < 10) {
                    if (this.field1616 == 1 && this.field1336 >= 0 && this.field1336 < this.field1675.length) {
                        NpcEntity var14 = this.field1675[this.field1336];
                        if (var14 != null) {
                            int var15 = var14.field397 / 32 - field1668.field397 / 32;
                            int var16 = var14.field398 / 32 - field1668.field398 / 32;
                            this.method496(var15, var16, 4, this.field1381);
                        }
                    }
                    if (this.field1616 == 2) {
                        int var17 = (this.field1578 - this.field1471) * 4 + 2 - field1668.field397 / 32;
                        int var18 = (this.field1579 - this.field1472) * 4 + 2 - field1668.field398 / 32;
                        this.method496(var17, var18, 4, this.field1381);
                    }
                    if (this.field1616 == 10 && this.field1597 >= 0 && this.field1597 < this.field1536.length) {
                        PlayerEntity var19 = this.field1536[this.field1597];
                        if (var19 != null) {
                            int var20 = var19.field397 / 32 - field1668.field397 / 32;
                            int var21 = var19.field398 / 32 - field1668.field398 / 32;
                            this.method496(var20, var21, 4, this.field1381);
                        }
                    }
                }
                if (this.field1441 != 0) {
                    int var22 = this.field1441 * 4 + 2 - field1668.field397 / 32;
                    int var23 = this.field1442 * 4 + 2 - field1668.field398 / 32;
                    this.method441(var23, var22, (byte) -111, this.field1380);
                }
                Pix2D.method156(3, 16777215, 3, 97, 0, 78);
                this.field1280.method253(field1376);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method512(boolean arg0) {
        for (int var2 = -1; var2 < this.field1537; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1535;
            } else {
                var3 = this.field1538[var2];
            }
            PlayerEntity var4 = this.field1536[var3];
            if (var4 != null) {
                this.method544(var4, 0, 1);
            }
        }
        this.field1321 &= arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method513(int arg0, boolean arg1) {
        if (field1668.field397 >> 7 == this.field1441 && field1668.field398 >> 7 == this.field1442) {
            this.field1441 = 0;
            ++field1397;
            if (field1397 > 122) {
                field1397 = 0;
                this.field1259.method213((byte) 117, 188);
                this.field1259.method214(62);
            }
        }
        int var3 = this.field1537;
        if (arg0 == 0) {
            if (arg1) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < var3; ++var4) {
                PlayerEntity var5;
                int var6;
                if (arg1) {
                    var5 = field1668;
                    var6 = this.field1535 << 14;
                } else {
                    var5 = this.field1536[this.field1538[var4]];
                    var6 = this.field1538[var4] << 14;
                }
                if (var5 != null && var5.method113(0)) {
                    var5.field477 = false;
                    if ((field1656 && this.field1537 > 50 || this.field1537 > 200) && !arg1 && var5.field422 == var5.field402) {
                        var5.field477 = true;
                    }
                    int var7 = var5.field397 >> 7;
                    int var8 = var5.field398 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field472 != null && field1218 >= var5.field467 && field1218 < var5.field468) {
                            var5.field477 = false;
                            var5.field466 = this.method458(var5.field397, var5.field398, 0, this.field1478);
                            this.field1331.method62(-23687, var5.field476, var5.field399, var5.field475, var5.field466, var5.field473, 60, var5.field397, this.field1478, var5, var5.field398, var5.field474, var6);
                        } else {
                            if ((var5.field397 & 127) == 64 && (var5.field398 & 127) == 64) {
                                if (this.field1436[var7][var8] == this.field1284) {
                                    continue;
                                }
                                this.field1436[var7][var8] = this.field1284;
                            }
                            var5.field466 = this.method458(var5.field397, var5.field398, 0, this.field1478);
                            this.field1331.method61(var5.field466, var5, var5.field397, var6, var5.field398, (byte) 1, 60, var5.field399, this.field1478, var5.field400);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method514(int arg0) {
        if (arg0 <= 0) {
            this.field1419 = this.field1360.method290();
        }
        this.field1387 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1226[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1112; ++var3) {
                if (!IdkType.field1113[var3].field1119 && IdkType.field1113[var3].field1114 == var2 + (this.field1398 ? 0 : 7)) {
                    this.field1226[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method515(int arg0) {
        this.field1306 = 0;
        int var2 = (field1668.field397 >> 7) + this.field1471;
        int var3 = (field1668.field398 >> 7) + this.field1472;
        if (arg0 <= 0) {
            this.field1549 = this.field1360.method290();
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1306 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1306 = 1;
        }
        if (this.field1306 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1306 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method516(int arg0) {
        if (arg0 != 15447) {
            this.field1259.method214(186);
        }
        Graphics var2 = this.method11(field1518).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(-27605, 1);
        if (this.field1590) {
            this.field1322 = false;
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
        if (this.field1314) {
            this.field1322 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1451) {
            this.field1322 = false;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)V")
    public final void method517(int arg0, boolean arg1, int arg2) {
        this.field1635 += arg0;
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method518(int arg0, int arg1) {
        if (arg0 < 5 || arg0 > 5) {
            field1376 = !field1376;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBLlb;)V")
    private final void method519(int arg0, byte arg1, Packet arg2) {
        this.field1480 = 0;
        this.field1539 = 0;
        this.method527(arg2, arg0, (byte) -85);
        this.method502(0, arg2, arg0);
        this.method553(arg2, arg0, this.field1222);
        this.method483(arg2, -45473, arg0);
        if (this.field1503 == arg1) {
            for (int var4 = 0; var4 < this.field1480; ++var4) {
                int var6 = this.field1481[var4];
                if (field1218 != this.field1536[var6].field442) {
                    this.field1536[var6] = null;
                }
            }
            if (arg2.field709 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field709 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1537; ++var5) {
                    if (this.field1536[this.field1538[var5]] == null) {
                        signlink.reporterror(this.field1563 + " null entry in pl list - pos:" + var5 + " size:" + this.field1537);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)Z")
    public final boolean method520(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1524 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1524.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1636 == -1) {
                    this.field1524.method41(this.field1551.field708, 0, 1);
                    this.field1636 = this.field1551.field708[0] & 255;
                    if (this.field1360 != null) {
                        this.field1636 = this.field1636 - this.field1360.method290() & 255;
                    }
                    this.field1635 = Protocol.field1082[this.field1636];
                    --var2;
                }
                if (this.field1635 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1524.method41(this.field1551.field708, 0, 1);
                    this.field1635 = this.field1551.field708[0] & 255;
                    --var2;
                }
                if (this.field1635 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1524.method41(this.field1551.field708, 0, 2);
                    this.field1551.field709 = 0;
                    this.field1635 = this.field1551.method226();
                    var2 -= 2;
                }
                if (var2 < this.field1635) {
                    return false;
                }
                this.field1551.field709 = 0;
                this.field1524.method41(this.field1551.field708, 0, this.field1635);
                this.field1637 = 0;
                this.field1556 = this.field1555;
                this.field1555 = this.field1554;
                this.field1554 = this.field1636;
                if (this.field1636 == 207) {
                    this.field1234 = this.field1551.method224();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 241) {
                    this.field1429 = this.field1551.method224();
                    this.field1344 = true;
                    this.field1257 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 203) {
                    int var3 = this.field1551.method226();
                    byte var4 = this.field1551.method225();
                    this.field1588[var3] = var4;
                    if (this.field1523[var3] != var4) {
                        this.field1523[var3] = var4;
                        this.method448(false, var3);
                        this.field1344 = true;
                        if (this.field1526 != -1) {
                            this.field1525 = true;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 115) {
                    this.field1441 = 0;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 64) {
                    int var5 = this.field1551.method224();
                    int var6 = this.field1551.method224();
                    int var7 = this.field1551.method224();
                    int var8 = this.field1551.method224();
                    this.field1577[var5] = true;
                    this.field1414[var5] = var6;
                    this.field1320[var5] = var7;
                    this.field1260[var5] = var8;
                    this.field1384[var5] = 0;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 95 || this.field1636 == 176 || this.field1636 == 219 || this.field1636 == 85 || this.field1636 == 107 || this.field1636 == 52 || this.field1636 == 81 || this.field1636 == 48 || this.field1636 == 173 || this.field1636 == 138) {
                    this.method475(this.field1636, 220, this.field1551);
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 211) {
                    int var9 = this.field1551.method226();
                    this.method436(var9, -147);
                    if (this.field1632 != -1) {
                        this.field1632 = -1;
                        this.field1344 = true;
                        this.field1257 = true;
                    }
                    if (this.field1427 != -1) {
                        this.field1427 = -1;
                        this.field1525 = true;
                    }
                    if (this.field1520) {
                        this.field1520 = false;
                        this.field1525 = true;
                    }
                    this.field1453 = var9;
                    this.field1584 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 192) {
                    int var10 = this.field1551.method226();
                    Component.field68[var10].field117 = 3;
                    Component.field68[var10].field118 = (field1668.field461[8] << 6) + (field1668.field461[0] << 12) + (field1668.field462[0] << 24) + (field1668.field462[4] << 18) + field1668.field461[11];
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 210) {
                    this.field1681 = false;
                    this.field1520 = true;
                    this.field1598 = "";
                    this.field1525 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 130) {
                    int var11 = this.field1551.method227();
                    this.field1526 = var11;
                    this.field1525 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 167) {
                    this.method519(this.field1635, (byte) -44, this.field1551);
                    this.field1665 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 34) {
                    int var12 = this.field1551.method226();
                    int var13 = this.field1551.method224();
                    int var14 = this.field1551.method226();
                    if (this.field1496 && !field1656 && this.field1345 < 50) {
                        this.field1464[this.field1345] = var12;
                        this.field1220[this.field1345] = var13;
                        this.field1499[this.field1345] = Wave.field909[var12] + var14;
                        ++this.field1345;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 91) {
                    this.field1386 = this.field1551.method229();
                    this.field1426 = this.field1551.method226();
                    this.field1445 = this.field1551.method224();
                    this.field1303 = this.field1551.method226();
                    this.field1516 = this.field1551.method224();
                    if (this.field1386 != 0 && this.field1453 == -1) {
                        signlink.dnslookup(JString.method298((byte) 94, this.field1386));
                        this.method453(false);
                        short var15 = 650;
                        if (this.field1445 != 201 || this.field1516 == 1) {
                            var15 = 655;
                        }
                        this.field1367 = "";
                        this.field1544 = false;
                        for (int var16 = 0; var16 < Component.field68.length; ++var16) {
                            if (Component.field68[var16] != null && Component.field68[var16].field77 == var15) {
                                this.field1453 = Component.field68[var16].field74;
                                break;
                            }
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 88) {
                    this.method488(false);
                    this.field1636 = -1;
                    return false;
                }
                if (this.field1636 == 134) {
                    int var17 = this.field1551.method226();
                    int var18 = this.field1551.method227();
                    Component var19 = Component.field68[var17];
                    var19.field121 = var18;
                    if (var18 == -1) {
                        var19.field71 = 0;
                        var19.field72 = 0;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 156) {
                    this.field1616 = this.field1551.method224();
                    if (this.field1616 == 1) {
                        this.field1336 = this.field1551.method226();
                    }
                    if (this.field1616 >= 2 && this.field1616 <= 6) {
                        if (this.field1616 == 2) {
                            this.field1581 = 64;
                            this.field1582 = 64;
                        }
                        if (this.field1616 == 3) {
                            this.field1581 = 0;
                            this.field1582 = 64;
                        }
                        if (this.field1616 == 4) {
                            this.field1581 = 128;
                            this.field1582 = 64;
                        }
                        if (this.field1616 == 5) {
                            this.field1581 = 64;
                            this.field1582 = 0;
                        }
                        if (this.field1616 == 6) {
                            this.field1581 = 64;
                            this.field1582 = 128;
                        }
                        this.field1616 = 2;
                        this.field1578 = this.field1551.method226();
                        this.field1579 = this.field1551.method226();
                        this.field1580 = this.field1551.method224();
                    }
                    if (this.field1616 == 10) {
                        this.field1597 = this.field1551.method226();
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 67) {
                    if (this.field1429 == 12) {
                        this.field1344 = true;
                    }
                    this.field1337 = this.field1551.method227();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 3) {
                    this.field1377 = this.field1635 / 8;
                    for (int var20 = 0; var20 < this.field1377; ++var20) {
                        this.field1233[var20] = this.field1551.method230(0);
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 142) {
                    int var21 = this.field1551.method226();
                    int var22 = this.field1551.method226();
                    Component.field68[var21].field117 = 2;
                    Component.field68[var21].field118 = var22;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 215) {
                    int var23 = this.field1551.method226();
                    int var24 = this.field1551.method224();
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    this.field1370[var24] = var23;
                    this.field1344 = true;
                    this.field1257 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 153) {
                    this.field1334 = this.field1551.method224();
                    this.field1335 = this.field1551.method224();
                    for (int var25 = this.field1334; var25 < this.field1334 + 8; ++var25) {
                        for (int var26 = this.field1335; var26 < this.field1335 + 8; ++var26) {
                            if (this.field1232[this.field1478][var25][var26] != null) {
                                this.field1232[this.field1478][var25][var26] = null;
                                this.method460(var25, var26);
                            }
                        }
                    }
                    for (LocSpawned var27 = (LocSpawned) this.field1644.method243(); var27 != null; var27 = (LocSpawned) this.field1644.method245(this.field1374)) {
                        if (var27.field729 >= this.field1334 && var27.field729 < this.field1334 + 8 && var27.field730 >= this.field1335 && var27.field730 < this.field1335 + 8 && this.field1478 == var27.field727) {
                            var27.field738 = 0;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 114) {
                    this.field1383 = this.field1551.method224();
                    this.field1388 = this.field1551.method224();
                    this.field1221 = this.field1551.method224();
                    this.field1557 = true;
                    this.field1525 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 158) {
                    int var28 = this.field1551.method226();
                    int var29 = this.field1551.method226();
                    if (this.field1427 != -1) {
                        this.field1427 = -1;
                        this.field1525 = true;
                    }
                    if (this.field1520) {
                        this.field1520 = false;
                        this.field1525 = true;
                    }
                    this.field1453 = var28;
                    this.field1632 = var29;
                    this.field1344 = true;
                    this.field1257 = true;
                    this.field1584 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 240) {
                    int var30 = this.field1551.method227();
                    if (var30 >= 0) {
                        this.method436(var30, -147);
                    }
                    this.field1519 = var30;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 195) {
                    this.field1334 = this.field1551.method224();
                    this.field1335 = this.field1551.method224();
                    while (this.field1551.field709 < this.field1635) {
                        int var31 = this.field1551.method224();
                        this.method475(var31, 220, this.field1551);
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 161) {
                    String var32 = this.field1551.method231();
                    if (var32.endsWith(":tradereq:")) {
                        String var33 = var32.substring(0, var32.indexOf(":"));
                        long var34 = JString.method295(var33);
                        boolean var36 = false;
                        for (int var37 = 0; var37 < this.field1377; ++var37) {
                            if (this.field1233[var37] == var34) {
                                var36 = true;
                                break;
                            }
                        }
                        if (!var36 && this.field1306 == 0) {
                            this.method457(-476, 4, var33, "wishes to trade with you.");
                        }
                    } else if (!var32.endsWith(":duelreq:")) {
                        this.method457(-476, 0, "", var32);
                    } else {
                        String var38 = var32.substring(0, var32.indexOf(":"));
                        long var39 = JString.method295(var38);
                        boolean var41 = false;
                        for (int var42 = 0; var42 < this.field1377; ++var42) {
                            if (this.field1233[var42] == var39) {
                                var41 = true;
                                break;
                            }
                        }
                        if (!var41 && this.field1306 == 0) {
                            this.method457(-476, 8, var38, "wishes to duel with you.");
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 101) {
                    this.field1424 = false;
                    for (int var43 = 0; var43 < 5; ++var43) {
                        this.field1577[var43] = false;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 16) {
                    int var44 = this.field1551.method226();
                    this.method436(var44, -147);
                    if (this.field1427 != -1) {
                        this.field1427 = -1;
                        this.field1525 = true;
                    }
                    if (this.field1520) {
                        this.field1520 = false;
                        this.field1525 = true;
                    }
                    this.field1632 = var44;
                    this.field1344 = true;
                    this.field1257 = true;
                    this.field1453 = -1;
                    this.field1584 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 44) {
                    int var45 = this.field1551.method226();
                    String var46 = this.field1551.method231();
                    Component.field68[var45].field109 = var46;
                    if (this.field1370[this.field1429] == Component.field68[var45].field74) {
                        this.field1344 = true;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 245) {
                    int var47 = this.field1551.method226();
                    int var48 = this.field1551.method229();
                    this.field1588[var47] = var48;
                    if (this.field1523[var47] != var48) {
                        this.field1523[var47] = var48;
                        this.method448(false, var47);
                        this.field1344 = true;
                        if (this.field1526 != -1) {
                            this.field1525 = true;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 166) {
                    int var49 = this.field1551.method226();
                    this.method436(var49, -147);
                    if (this.field1632 != -1) {
                        this.field1632 = -1;
                        this.field1344 = true;
                        this.field1257 = true;
                    }
                    this.field1427 = var49;
                    this.field1525 = true;
                    this.field1453 = -1;
                    this.field1584 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 28) {
                    int var50 = this.field1551.method226();
                    int var51 = this.field1551.method226();
                    int var52 = this.field1551.method226();
                    ObjType var53 = ObjType.method341(var51);
                    Component.field68[var50].field117 = 4;
                    Component.field68[var50].field118 = var51;
                    Component.field68[var50].field124 = var53.field1047;
                    Component.field68[var50].field125 = var53.field1048;
                    Component.field68[var50].field123 = var53.field1046 * 100 / var52;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 54) {
                    int var54 = this.field1551.method226();
                    int var55 = this.field1551.method226();
                    Component var56 = Component.field68[var54];
                    if (var56 != null && var56.field75 == 0) {
                        if (var55 < 0) {
                            var55 = 0;
                        }
                        if (var55 > var56.field87 - var56.field79) {
                            var55 = var56.field87 - var56.field79;
                        }
                        var56.field88 = var55;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 47) {
                    for (int var57 = 0; var57 < this.field1536.length; ++var57) {
                        if (this.field1536[var57] != null) {
                            this.field1536[var57].field425 = -1;
                        }
                    }
                    for (int var58 = 0; var58 < this.field1675.length; ++var58) {
                        if (this.field1675[var58] != null) {
                            this.field1675[var58].field425 = -1;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 194) {
                    this.field1447 = this.field1551.method224();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 90) {
                    this.field1589 = this.field1551.method224();
                    if (this.field1589 == this.field1429) {
                        if (this.field1589 == 3) {
                            this.field1429 = 1;
                        } else {
                            this.field1429 = 3;
                        }
                        this.field1344 = true;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 89) {
                    this.field1219 = this.field1551.method226() * 30;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 190) {
                    for (int var59 = 0; var59 < this.field1523.length; ++var59) {
                        if (this.field1588[var59] != this.field1523[var59]) {
                            this.field1523[var59] = this.field1588[var59];
                            this.method448(false, var59);
                            this.field1344 = true;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 83) {
                    if (this.field1429 == 12) {
                        this.field1344 = true;
                    }
                    this.field1256 = this.field1551.method224();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 231) {
                    int var60 = this.field1551.method226();
                    int var61 = this.field1551.method226();
                    if (this.field1338 == var60 && this.field1339 == var61 && this.field1545 == 2) {
                        this.field1636 = -1;
                        return true;
                    }
                    this.field1338 = var60;
                    this.field1339 = var61;
                    this.field1471 = (this.field1338 - 6) * 8;
                    this.field1472 = (this.field1339 - 6) * 8;
                    this.field1585 = false;
                    if ((this.field1338 / 8 == 48 || this.field1338 / 8 == 49) && this.field1339 / 8 == 48) {
                        this.field1585 = true;
                    }
                    if (this.field1338 / 8 == 48 && this.field1339 / 8 == 148) {
                        this.field1585 = true;
                    }
                    this.field1545 = 1;
                    this.field1543 = System.currentTimeMillis();
                    this.field1280.method253(field1376);
                    this.field1492.method200(257, 151, 0, "Loading - please wait.", false);
                    this.field1492.method200(256, 150, 16777215, "Loading - please wait.", false);
                    this.field1280.method254(4, super.field14, (byte) 76, 4);
                    int var62 = 0;
                    for (int var63 = (this.field1338 - 6) / 8; var63 <= (this.field1338 + 6) / 8; ++var63) {
                        for (int var64 = (this.field1339 - 6) / 8; var64 <= (this.field1339 + 6) / 8; ++var64) {
                            ++var62;
                        }
                    }
                    this.field1302 = new byte[var62][];
                    this.field1369 = new byte[var62][];
                    this.field1246 = new int[var62];
                    this.field1247 = new int[var62];
                    this.field1248 = new int[var62];
                    int var65 = 0;
                    for (int var66 = (this.field1338 - 6) / 8; var66 <= (this.field1338 + 6) / 8; ++var66) {
                        for (int var67 = (this.field1339 - 6) / 8; var67 <= (this.field1339 + 6) / 8; ++var67) {
                            this.field1246[var65] = (var66 << 8) + var67;
                            if (!this.field1585 || var67 != 49 && var67 != 149 && var67 != 147 && var66 != 50 && (var66 != 49 || var67 != 47)) {
                                int var68 = this.field1247[var65] = this.field1431.method269(0, var66, false, var67);
                                if (var68 != -1) {
                                    this.field1431.method274(3, var68);
                                }
                                int var69 = this.field1248[var65] = this.field1431.method269(1, var66, false, var67);
                                if (var69 != -1) {
                                    this.field1431.method274(3, var69);
                                }
                                ++var65;
                            } else {
                                this.field1247[var65] = -1;
                                this.field1248[var65] = -1;
                                ++var65;
                            }
                        }
                    }
                    int var70 = this.field1471 - this.field1473;
                    int var71 = this.field1472 - this.field1474;
                    this.field1473 = this.field1471;
                    this.field1474 = this.field1472;
                    for (int var72 = 0; var72 < 16384; ++var72) {
                        NpcEntity var73 = this.field1675[var72];
                        if (var73 != null) {
                            for (int var74 = 0; var74 < 10; ++var74) {
                                var73.field447[var74] -= var70;
                                var73.field448[var74] -= var71;
                            }
                            var73.field397 -= var70 * 128;
                            var73.field398 -= var71 * 128;
                        }
                    }
                    for (int var75 = 0; var75 < this.field1534; ++var75) {
                        PlayerEntity var76 = this.field1536[var75];
                        if (var76 != null) {
                            for (int var77 = 0; var77 < 10; ++var77) {
                                var76.field447[var77] -= var70;
                                var76.field448[var77] -= var71;
                            }
                            var76.field397 -= var70 * 128;
                            var76.field398 -= var71 * 128;
                        }
                    }
                    this.field1665 = true;
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
                                    this.field1232[var88][var84][var85] = this.field1232[var88][var86][var87];
                                } else {
                                    this.field1232[var88][var84][var85] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var89 = (LocSpawned) this.field1644.method243(); var89 != null; var89 = (LocSpawned) this.field1644.method245(this.field1374)) {
                        var89.field729 -= var70;
                        var89.field730 -= var71;
                        if (var89.field729 < 0 || var89.field730 < 0 || var89.field729 >= 104 || var89.field730 >= 104) {
                            var89.method106();
                        }
                    }
                    if (this.field1441 != 0) {
                        this.field1441 -= var70;
                        this.field1442 -= var71;
                    }
                    this.field1424 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 171) {
                    if (this.field1632 != -1) {
                        this.field1632 = -1;
                        this.field1344 = true;
                        this.field1257 = true;
                    }
                    if (this.field1427 != -1) {
                        this.field1427 = -1;
                        this.field1525 = true;
                    }
                    if (this.field1520) {
                        this.field1520 = false;
                        this.field1525 = true;
                    }
                    this.field1453 = -1;
                    this.field1584 = false;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 247) {
                    long var90 = this.field1551.method230(0);
                    int var92 = this.field1551.method224();
                    String var93 = JString.method299(131, JString.method296(0, var90));
                    for (int var94 = 0; var94 < this.field1531; ++var94) {
                        if (this.field1575[var94] == var90) {
                            if (this.field1489[var94] != var92) {
                                this.field1489[var94] = var92;
                                this.field1344 = true;
                                if (var92 > 0) {
                                    this.method457(-476, 5, "", var93 + " has logged in.");
                                }
                                if (var92 == 0) {
                                    this.method457(-476, 5, "", var93 + " has logged out.");
                                }
                            }
                            var93 = null;
                            break;
                        }
                    }
                    if (var93 != null && this.field1531 < 200) {
                        this.field1575[this.field1531] = var90;
                        this.field1249[this.field1531] = var93;
                        this.field1489[this.field1531] = var92;
                        ++this.field1531;
                        this.field1344 = true;
                    }
                    boolean var95 = false;
                    while (!var95) {
                        var95 = true;
                        for (int var96 = 0; var96 < this.field1531 - 1; ++var96) {
                            if (this.field1489[var96] != field1653 && this.field1489[var96 + 1] == field1653 || this.field1489[var96] == 0 && this.field1489[var96 + 1] != 0) {
                                int var97 = this.field1489[var96];
                                this.field1489[var96] = this.field1489[var96 + 1];
                                this.field1489[var96 + 1] = var97;
                                String var98 = this.field1249[var96];
                                this.field1249[var96] = this.field1249[var96 + 1];
                                this.field1249[var96 + 1] = var98;
                                long var99 = this.field1575[var96];
                                this.field1575[var96] = this.field1575[var96 + 1];
                                this.field1575[var96 + 1] = var99;
                                this.field1344 = true;
                                var95 = false;
                            }
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 10) {
                    int var101 = this.field1551.method226();
                    boolean var102 = this.field1551.method224() == 1;
                    Component.field68[var101].field89 = var102;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 105) {
                    this.field1344 = true;
                    int var103 = this.field1551.method224();
                    int var104 = this.field1551.method229();
                    int var105 = this.field1551.method224();
                    this.field1669[var103] = var104;
                    this.field1300[var103] = var105;
                    this.field1569[var103] = 1;
                    for (int var106 = 0; var106 < 98; ++var106) {
                        if (var104 >= field1652[var106]) {
                            this.field1569[var103] = var106 + 2;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 23) {
                    int var107 = this.field1551.method226();
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    if (this.field1446 != var107 && this.field1485 && !field1656 && this.field1343 == 0) {
                        this.field1599 = var107;
                        this.field1600 = true;
                        this.field1431.method274(2, this.field1599);
                    }
                    this.field1446 = var107;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 15) {
                    int var108 = this.field1551.method226();
                    int var109 = this.field1551.method226();
                    if (this.field1485 && !field1656) {
                        this.field1599 = var108;
                        this.field1600 = false;
                        this.field1431.method274(2, this.field1599);
                        this.field1343 = var109;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 200) {
                    this.field1424 = true;
                    this.field1285 = this.field1551.method224();
                    this.field1286 = this.field1551.method224();
                    this.field1287 = this.field1551.method226();
                    this.field1288 = this.field1551.method224();
                    this.field1289 = this.field1551.method224();
                    if (this.field1289 >= 100) {
                        this.field1236 = this.field1285 * 128 + 64;
                        this.field1238 = this.field1286 * 128 + 64;
                        this.field1237 = this.method458(this.field1236, this.field1238, 0, this.field1478) - this.field1287;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 172) {
                    this.field1344 = true;
                    int var110 = this.field1551.method226();
                    Component var111 = Component.field68[var110];
                    while (this.field1551.field709 < this.field1635) {
                        int var112 = this.field1551.method224();
                        int var113 = this.field1551.method226();
                        int var114 = this.field1551.method224();
                        if (var114 == 255) {
                            var114 = this.field1551.method229();
                        }
                        if (var112 >= 0 && var112 < var111.field69.length) {
                            var111.field69[var112] = var113;
                            var111.field70[var112] = var114;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 17) {
                    int var115 = this.field1551.method224();
                    int var116 = this.field1551.method224();
                    String var117 = this.field1551.method231();
                    if (var115 >= 1 && var115 <= 5) {
                        if (var117.equalsIgnoreCase("null")) {
                            var117 = null;
                        }
                        this.field1215[var115 - 1] = var117;
                        this.field1216[var115 - 1] = var116 == 0;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 32) {
                    this.field1334 = this.field1551.method224();
                    this.field1335 = this.field1551.method224();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 106) {
                    this.field1344 = true;
                    int var118 = this.field1551.method226();
                    Component var119 = Component.field68[var118];
                    int var120 = this.field1551.method224();
                    for (int var121 = 0; var121 < var120; ++var121) {
                        var119.field69[var121] = this.field1551.method226();
                        int var122 = this.field1551.method224();
                        if (var122 == 255) {
                            var122 = this.field1551.method229();
                        }
                        var119.field70[var121] = var122;
                    }
                    for (int var123 = var120; var123 < var119.field69.length; ++var123) {
                        var119.field69[var123] = 0;
                        var119.field70[var123] = 0;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 133) {
                    this.field1363 = this.field1551.method226();
                    this.field1224 = this.field1551.method224();
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 129) {
                    int var124 = this.field1551.method226();
                    int var125 = this.field1551.method226();
                    Component.field68[var124].field117 = 1;
                    Component.field68[var124].field118 = var125;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 233) {
                    this.field1424 = true;
                    this.field1325 = this.field1551.method224();
                    this.field1326 = this.field1551.method224();
                    this.field1327 = this.field1551.method226();
                    this.field1328 = this.field1551.method224();
                    this.field1329 = this.field1551.method224();
                    if (this.field1329 >= 100) {
                        int var126 = this.field1325 * 128 + 64;
                        int var127 = this.field1326 * 128 + 64;
                        int var128 = this.method458(var126, var127, 0, this.field1478) - this.field1327;
                        int var129 = var126 - this.field1236;
                        int var130 = var128 - this.field1237;
                        int var131 = var127 - this.field1238;
                        int var132 = (int) Math.sqrt((double) (var129 * var129 + var131 * var131));
                        this.field1239 = (int) (Math.atan2((double) var130, (double) var132) * 325.949D) & 2047;
                        this.field1240 = (int) (Math.atan2((double) var129, (double) var131) * -325.949D) & 2047;
                        if (this.field1239 < 128) {
                            this.field1239 = 128;
                        }
                        if (this.field1239 > 383) {
                            this.field1239 = 383;
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 227) {
                    int var133 = this.field1551.method226();
                    Component var134 = Component.field68[var133];
                    for (int var135 = 0; var135 < var134.field69.length; ++var135) {
                        var134.field69[var135] = -1;
                        var134.field69[var135] = 0;
                    }
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 77) {
                    int var136 = this.field1551.method226();
                    int var137 = this.field1551.method227();
                    int var138 = this.field1551.method227();
                    Component var139 = Component.field68[var136];
                    var139.field81 = var137;
                    var139.field82 = var138;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 185) {
                    this.field1532 = this.field1551.method224();
                    this.field1344 = true;
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 197) {
                    this.method551(0, this.field1635, this.field1551);
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 183) {
                    int var140 = this.field1551.method226();
                    int var141 = this.field1551.method226();
                    int var142 = var141 >> 10 & 31;
                    int var143 = var141 >> 5 & 31;
                    int var144 = var141 & 31;
                    Component.field68[var140].field111 = (var144 << 3) + (var142 << 19) + (var143 << 11);
                    this.field1636 = -1;
                    return true;
                }
                if (this.field1636 == 235) {
                    long var145 = this.field1551.method230(0);
                    int var147 = this.field1551.method229();
                    int var148 = this.field1551.method224();
                    boolean var149 = false;
                    for (int var150 = 0; var150 < 100; ++var150) {
                        if (this.field1484[var150] == var147) {
                            var149 = true;
                            break;
                        }
                    }
                    if (var148 <= 1) {
                        for (int var151 = 0; var151 < this.field1377; ++var151) {
                            if (this.field1233[var151] == var145) {
                                var149 = true;
                                break;
                            }
                        }
                    }
                    if (!var149 && this.field1306 == 0) {
                        try {
                            this.field1484[this.field1602] = var147;
                            this.field1602 = (this.field1602 + 1) % 100;
                            String var152 = WordPack.method302((byte) 8, this.field1635 - 13, this.field1551);
                            String var153 = WordFilter.method394((byte) 3, var152);
                            if (var148 != 2 && var148 != 3) {
                                if (var148 == 1) {
                                    this.method457(-476, 7, "@cr1@" + JString.method299(131, JString.method296(0, var145)), var153);
                                } else {
                                    this.method457(-476, 3, JString.method299(131, JString.method296(0, var145)), var153);
                                }
                            } else {
                                this.method457(-476, 7, "@cr2@" + JString.method299(131, JString.method296(0, var145)), var153);
                            }
                        } catch (Exception var158) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1636 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1636 + "," + this.field1635 + " - " + this.field1555 + "," + this.field1556);
                this.method488(false);
            } catch (IOException var159) {
                this.method479(0);
            } catch (Exception var160) {
                String var156 = "T2 - " + this.field1636 + "," + this.field1555 + "," + this.field1556 + " - " + this.field1635 + "," + (field1668.field447[0] + this.field1471) + "," + (field1668.field448[0] + this.field1472) + " - ";
                for (int var157 = 0; var157 < this.field1635 && var157 < 50; ++var157) {
                    var156 = var156 + this.field1551.field708[var157] + ",";
                }
                signlink.reporterror(var156);
                this.method488(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method521(Component arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field77;
            if (this.field1532 == 2) {
                if (var3 == 201) {
                    this.field1525 = true;
                    this.field1520 = false;
                    this.field1681 = true;
                    this.field1400 = "";
                    this.field1467 = 1;
                    this.field1435 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field1525 = true;
                    this.field1520 = false;
                    this.field1681 = true;
                    this.field1400 = "";
                    this.field1467 = 2;
                    this.field1435 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field1639 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field1525 = true;
                    this.field1520 = false;
                    this.field1681 = true;
                    this.field1400 = "";
                    this.field1467 = 4;
                    this.field1435 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field1525 = true;
                    this.field1520 = false;
                    this.field1681 = true;
                    this.field1400 = "";
                    this.field1467 = 5;
                    this.field1435 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field1226[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = IdkType.field1112 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= IdkType.field1112) {
                                    var6 = 0;
                                }
                            }
                            if (!IdkType.field1113[var6].field1119 && IdkType.field1113[var6].field1114 == var4 + (this.field1398 ? 0 : 7)) {
                                this.field1226[var4] = var6;
                                this.field1387 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field1505[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field1657[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field1657[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field1505[var7] = var9;
                    this.field1387 = true;
                }
                if (var3 == 324 && !this.field1398) {
                    this.field1398 = true;
                    this.method514(814);
                }
                if (var3 == 325 && this.field1398) {
                    this.field1398 = false;
                    this.method514(814);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field1544 = !this.field1544;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method453(false);
                        if (this.field1367.length() > 0) {
                            this.field1259.method213((byte) 117, 137);
                            this.field1259.method220(JString.method295(this.field1367), 0);
                            this.field1259.method214(var3 - 601);
                            this.field1259.method214(this.field1544 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field1259.method213((byte) 117, 125);
                    this.field1259.method214(this.field1398 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field1259.method214(this.field1226[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field1259.method214(this.field1505[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method522(int arg0) {
        this.field1322 = false;
        while (this.field1392) {
            this.field1322 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1679 = null;
        this.field1680 = null;
        this.field1645 = null;
        this.field1352 = null;
        this.field1353 = null;
        this.field1354 = null;
        this.field1355 = null;
        this.field1527 = null;
        this.field1635 += arg0;
        this.field1528 = null;
        this.field1393 = null;
        this.field1394 = null;
        this.field1307 = null;
        this.field1308 = null;
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.field1506 = 0;
        for (int var2 = -1; var2 < this.field1676 + this.field1537; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1668;
            } else if (var2 < this.field1537) {
                var17 = this.field1536[this.field1538[var2]];
            } else {
                var17 = this.field1675[this.field1677[var2 - this.field1537]];
            }
            if (var17 != null && var17.method113(0)) {
                if (var2 >= this.field1537) {
                    NpcType var21 = ((NpcEntity) var17).field453;
                    if (var21.field1027 >= 0 && var21.field1027 < this.field1417.length) {
                        this.method437(var17, -213, var17.field443 + 15);
                        if (this.field1415 > -1) {
                            this.field1417[var21.field1027].method185(this.field1486, this.field1415 - 12, this.field1416 - 30);
                        }
                    }
                    if (this.field1616 == 1 && this.field1677[var2 - this.field1537] == this.field1336 && field1218 % 20 < 10) {
                        this.method437(var17, -213, var17.field443 + 15);
                        if (this.field1415 > -1) {
                            this.field1417[2].method185(this.field1486, this.field1415 - 12, this.field1416 - 28);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field460 != 0) {
                        this.method437(var17, -213, var17.field443 + 15);
                        if (this.field1415 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field460 & 1 << var20) != 0) {
                                    this.field1417[var20].method185(this.field1486, this.field1415 - 12, this.field1416 - var18);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1616 == 10 && this.field1538[var2] == this.field1597) {
                        this.method437(var17, -213, var17.field443 + 15);
                        if (this.field1415 > -1) {
                            this.field1417[7].method185(this.field1486, this.field1415 - 12, this.field1416 - var18);
                        }
                    }
                }
                if (var17.field409 != null && (var2 >= this.field1537 || this.field1383 == 0 || this.field1383 == 3 || this.field1383 == 1 && this.method430(-238, ((PlayerEntity) var17).field457))) {
                    this.method437(var17, -213, var17.field443);
                    if (this.field1415 > -1 && this.field1506 < this.field1507) {
                        this.field1511[this.field1506] = this.field1493.method202(-43341, var17.field409) / 2;
                        this.field1510[this.field1506] = this.field1493.field694;
                        this.field1508[this.field1506] = this.field1415;
                        this.field1509[this.field1506] = this.field1416;
                        this.field1512[this.field1506] = var17.field411;
                        this.field1513[this.field1506] = var17.field412;
                        this.field1514[this.field1506] = var17.field410;
                        this.field1515[this.field1506++] = var17.field409;
                        if (this.field1477 == 0 && var17.field412 == 1) {
                            this.field1510[this.field1506] += 10;
                            this.field1509[this.field1506] += 5;
                        }
                        if (this.field1477 == 0 && var17.field412 == 2) {
                            this.field1511[this.field1506] = 60;
                        }
                    }
                }
                if (var17.field416 > field1218) {
                    this.method437(var17, -213, var17.field443 + 15);
                    if (this.field1415 > -1) {
                        int var22 = var17.field417 * 30 / var17.field418;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method156(5, 65280, var22, this.field1415 - 15, 0, this.field1416 - 3);
                        Pix2D.method156(5, 16711680, 30 - var22, this.field1415 - 15 + var22, 0, this.field1416 - 3);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field415[var23] > field1218) {
                        this.method437(var17, -213, var17.field443 / 2);
                        if (this.field1415 > -1) {
                            if (var23 == 1) {
                                this.field1416 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1415 -= 15;
                                this.field1416 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1415 += 15;
                                this.field1416 -= 10;
                            }
                            this.field1351[var17.field414[var23]].method185(this.field1486, this.field1415 - 12, this.field1416 - 12);
                            this.field1491.method200(this.field1415, this.field1416 + 4, 0, String.valueOf(var17.field413[var23]), false);
                            this.field1491.method200(this.field1415 - 1, this.field1416 + 3, 16777215, String.valueOf(var17.field413[var23]), false);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1506; ++var3) {
            int var4 = this.field1508[var3];
            int var5 = this.field1509[var3];
            int var6 = this.field1511[var3];
            int var7 = this.field1510[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1509[var16] - this.field1510[var16] && var5 - var7 < this.field1509[var16] + 2 && var4 - var6 < this.field1511[var16] + this.field1508[var16] && var4 + var6 > this.field1508[var16] - this.field1511[var16] && this.field1509[var16] - this.field1510[var16] < var5) {
                        var5 = this.field1509[var16] - this.field1510[var16];
                        var8 = true;
                    }
                }
            }
            this.field1415 = this.field1508[var3];
            this.field1416 = this.field1509[var3] = var5;
            String var9 = this.field1515[var3];
            if (this.field1477 == 0) {
                int var10 = 16776960;
                if (this.field1512[var3] < 6) {
                    var10 = this.field1401[this.field1512[var3]];
                }
                if (this.field1512[var3] == 6) {
                    var10 = this.field1284 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1512[var3] == 7) {
                    var10 = this.field1284 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1512[var3] == 8) {
                    var10 = this.field1284 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1512[var3] == 9) {
                    int var11 = 150 - this.field1514[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1512[var3] == 10) {
                    int var12 = 150 - this.field1514[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1512[var3] == 11) {
                    int var13 = 150 - this.field1514[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1513[var3] == 0) {
                    this.field1493.method200(this.field1415, this.field1416 + 1, 0, var9, false);
                    this.field1493.method200(this.field1415, this.field1416, var10, var9, false);
                }
                if (this.field1513[var3] == 1) {
                    this.field1493.method204(var9, this.field1416 + 1, this.field1415, 0, 6, this.field1284);
                    this.field1493.method204(var9, this.field1416, this.field1415, var10, 6, this.field1284);
                }
                if (this.field1513[var3] == 2) {
                    int var14 = this.field1493.method202(-43341, var9);
                    int var15 = (150 - this.field1514[var3]) * (var14 + 100) / 150;
                    Pix2D.method153(5, 334, this.field1415 + 50, this.field1415 - 50, 0);
                    this.field1493.method203(this.field1415 + 50 - var15, var9, 0, this.field1416 + 1, true);
                    this.field1493.method203(this.field1415 + 50 - var15, var9, var10, this.field1416, true);
                    Pix2D.method152(true);
                }
            } else {
                this.field1493.method200(this.field1415, this.field1416 + 1, 0, var9, false);
                this.field1493.method200(this.field1415, this.field1416, 16776960, var9, false);
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method524(int arg0) {
        int var2 = this.field1285 * 128 + 64;
        int var3 = this.field1286 * 128 + 64;
        int var4 = this.method458(var2, var3, 0, this.field1478) - this.field1287;
        if (this.field1236 < var2) {
            this.field1236 += (var2 - this.field1236) * this.field1289 / 1000 + this.field1288;
            if (this.field1236 > var2) {
                this.field1236 = var2;
            }
        }
        if (this.field1236 > var2) {
            this.field1236 -= (this.field1236 - var2) * this.field1289 / 1000 + this.field1288;
            if (this.field1236 < var2) {
                this.field1236 = var2;
            }
        }
        if (this.field1237 < var4) {
            this.field1237 += (var4 - this.field1237) * this.field1289 / 1000 + this.field1288;
            if (this.field1237 > var4) {
                this.field1237 = var4;
            }
        }
        if (this.field1237 > var4) {
            this.field1237 -= (this.field1237 - var4) * this.field1289 / 1000 + this.field1288;
            if (this.field1237 < var4) {
                this.field1237 = var4;
            }
        }
        if (this.field1238 < var3) {
            this.field1238 += (var3 - this.field1238) * this.field1289 / 1000 + this.field1288;
            if (this.field1238 > var3) {
                this.field1238 = var3;
            }
        }
        if (this.field1238 > var3) {
            this.field1238 -= (this.field1238 - var3) * this.field1289 / 1000 + this.field1288;
            if (this.field1238 < var3) {
                this.field1238 = var3;
            }
        }
        int var5 = this.field1325 * 128 + 64;
        int var6 = this.field1326 * 128 + 64;
        while (arg0 >= 0) {
            this.field1259.method214(31);
        }
        int var7 = this.method458(var5, var6, 0, this.field1478) - this.field1327;
        int var8 = var5 - this.field1236;
        int var9 = var7 - this.field1237;
        int var10 = var6 - this.field1238;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1239 < var12) {
            this.field1239 += (var12 - this.field1239) * this.field1329 / 1000 + this.field1328;
            if (this.field1239 > var12) {
                this.field1239 = var12;
            }
        }
        if (this.field1239 > var12) {
            this.field1239 -= (this.field1239 - var12) * this.field1329 / 1000 + this.field1328;
            if (this.field1239 < var12) {
                this.field1239 = var12;
            }
        }
        int var14 = var13 - this.field1240;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1240 += this.field1329 * var14 / 1000 + this.field1328;
            this.field1240 &= 2047;
        }
        if (var14 < 0) {
            this.field1240 -= -var14 * this.field1329 / 1000 + this.field1328;
            this.field1240 &= 2047;
        }
        int var15 = var13 - this.field1240;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1240 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method525(int arg0) {
        for (int var2 = -1; var2 < this.field1537; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1535;
            } else {
                var6 = this.field1538[var2];
            }
            PlayerEntity var7 = this.field1536[var6];
            if (var7 != null && var7.field410 > 0) {
                --var7.field410;
                if (var7.field410 == 0) {
                    var7.field409 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1676; ++var3) {
            int var4 = this.field1677[var3];
            NpcEntity var5 = this.field1675[var4];
            if (var5 != null && var5.field410 > 0) {
                --var5.field410;
                if (var5.field410 == 0) {
                    var5.field409 = null;
                }
            }
        }
        if (arg0 != 46415) {
            this.field1261 = -145;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public void method526(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1382);
        if (!arg0) {
            this.method6();
        }
        if (this.field1431 != null) {
            System.out.println("Od-cycle:" + this.field1431.field846);
        }
        System.out.println("loop-cycle:" + field1218);
        System.out.println("draw-cycle:" + field1258);
        System.out.println("ptype:" + this.field1636);
        System.out.println("psize:" + this.field1635);
        if (this.field1524 != null) {
            this.field1524.method43(true);
        }
        super.field11 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1323 = -291;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IB)V")
    private final void method527(Packet arg0, int arg1, byte arg2) {
        arg0.method234((byte) 4);
        int var4 = arg0.method235(1, (byte) -96);
        if (arg2 != -85) {
            this.field1636 = -1;
        }
        if (var4 != 0) {
            int var5 = arg0.method235(2, (byte) -96);
            if (var5 == 0) {
                this.field1540[this.field1539++] = this.field1535;
            } else if (var5 == 1) {
                int var6 = arg0.method235(3, (byte) -96);
                field1668.method111(true, var6, false);
                int var7 = arg0.method235(1, (byte) -96);
                if (var7 == 1) {
                    this.field1540[this.field1539++] = this.field1535;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method235(3, (byte) -96);
                field1668.method111(true, var8, true);
                int var9 = arg0.method235(3, (byte) -96);
                field1668.method111(true, var9, true);
                int var10 = arg0.method235(1, (byte) -96);
                if (var10 == 1) {
                    this.field1540[this.field1539++] = this.field1535;
                }
            } else if (var5 == 3) {
                this.field1478 = arg0.method235(2, (byte) -96);
                int var11 = arg0.method235(7, (byte) -96);
                int var12 = arg0.method235(7, (byte) -96);
                int var13 = arg0.method235(1, (byte) -96);
                field1668.method110(var11, var13 == 1, false, var12);
                int var14 = arg0.method235(1, (byte) -96);
                if (var14 == 1) {
                    this.field1540[this.field1539++] = this.field1535;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)I")
    public final int method528(int arg0) {
        if (arg0 >= 0) {
            return this.field1449;
        } else {
            int var2 = 3;
            if (this.field1239 < 310) {
                int var3 = this.field1236 >> 7;
                int var4 = this.field1238 >> 7;
                int var5 = field1668.field397 >> 7;
                int var6 = field1668.field398 >> 7;
                if ((this.field1243[this.field1478][var3][var4] & 4) != 0) {
                    var2 = this.field1478;
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
                        if ((this.field1243[this.field1478][var3][var4] & 4) != 0) {
                            var2 = this.field1478;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1243[this.field1478][var3][var4] & 4) != 0) {
                                var2 = this.field1478;
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
                        if ((this.field1243[this.field1478][var3][var4] & 4) != 0) {
                            var2 = this.field1478;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1243[this.field1478][var3][var4] & 4) != 0) {
                                var2 = this.field1478;
                            }
                        }
                    }
                }
            }
            if ((this.field1243[this.field1478][field1668.field397 >> 7][field1668.field398 >> 7] & 4) != 0) {
                var2 = this.field1478;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)I")
    public final int method529(int arg0) {
        int var2 = this.method458(this.field1236, this.field1238, 0, this.field1478);
        this.field1635 += arg0;
        return var2 - this.field1237 < 800 && (this.field1243[this.field1478][this.field1236 >> 7][this.field1238 >> 7] & 4) != 0 ? this.field1478 : 3;
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method530(int arg0) {
        if (this.field1219 > 1) {
            --this.field1219;
        }
        if (this.field1639 > 0) {
            --this.field1639;
        }
        for (int var2 = 0; var2 < 5 && this.method520(0); ++var2) {
        }
        if (this.field1321) {
            Object var3 = this.field1576.field992;
            synchronized (this.field1576.field992) {
                if (!field1583) {
                    this.field1576.field993 = 0;
                } else if (super.field28 != 0 || this.field1576.field993 >= 40) {
                    this.field1259.method213((byte) 117, 222);
                    this.field1259.method214(0);
                    int var4 = this.field1259.field709;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1576.field993 && var4 - this.field1259.field709 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1576.field995[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1576.field994[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1576.field995[var6] == -1 && this.field1576.field994[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1649 == var8 && this.field1650 == var7) {
                            if (this.field1399 < 2047) {
                                ++this.field1399;
                            }
                        } else {
                            int var10 = var8 - this.field1649;
                            this.field1649 = var8;
                            int var11 = var7 - this.field1650;
                            this.field1650 = var7;
                            if (this.field1399 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1259.method215((this.field1399 << 12) + (var10 << 6) + var11);
                                this.field1399 = 0;
                            } else if (this.field1399 < 8) {
                                this.field1259.method217((this.field1399 << 19) + 8388608 + var9);
                                this.field1399 = 0;
                            } else {
                                this.field1259.method218((this.field1399 << 19) + -1073741824 + var9);
                                this.field1399 = 0;
                            }
                        }
                    }
                    this.field1259.method223(this.field1259.field709 - var4, this.field1213);
                    if (var5 >= this.field1576.field993) {
                        this.field1576.field993 = 0;
                    } else {
                        this.field1576.field993 -= var5;
                        for (int var12 = 0; var12 < this.field1576.field993; ++var12) {
                            this.field1576.field994[var12] = this.field1576.field994[var5 + var12];
                            this.field1576.field995[var12] = this.field1576.field995[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field1646) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1646 = super.field31;
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
                this.field1259.method213((byte) 117, 20);
                this.field1259.method218((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1439 > 0) {
                --this.field1439;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field1440 = true;
            }
            if (this.field1440 && this.field1439 <= 0) {
                this.field1439 = 20;
                this.field1440 = false;
                this.field1259.method213((byte) 117, 53);
                this.field1259.method215(this.field1621);
                this.field1259.method215(this.field1622);
            }
            if (super.field19 && !this.field1361) {
                this.field1361 = true;
                this.field1259.method213((byte) 117, 73);
                this.field1259.method214(1);
            }
            if (!super.field19 && this.field1361) {
                this.field1361 = false;
                this.field1259.method213((byte) 117, 73);
                this.field1259.method214(0);
            }
            this.method450(503);
            this.method552(42825);
            this.method435(0);
            ++this.field1637;
            if (this.field1637 > 750) {
                this.method479(0);
            }
            this.method512(true);
            this.method543((byte) -34);
            this.method525(46415);
            ++this.field1391;
            if (this.field1561 != 0) {
                this.field1560 += 20;
                if (this.field1560 >= 400) {
                    this.field1561 = 0;
                }
            }
            if (this.field1266 != 0) {
                ++this.field1263;
                if (this.field1263 >= 15) {
                    if (this.field1266 == 2) {
                        this.field1344 = true;
                    }
                    if (this.field1266 == 3) {
                        this.field1525 = true;
                    }
                    this.field1266 = 0;
                }
            }
            if (this.field1311 != 0) {
                ++this.field1666;
                if (super.field22 > this.field1312 + 5 || super.field22 < this.field1312 - 5 || super.field23 > this.field1313 + 5 || super.field23 < this.field1313 - 5) {
                    this.field1562 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1311 == 2) {
                        this.field1344 = true;
                    }
                    if (this.field1311 == 3) {
                        this.field1525 = true;
                    }
                    this.field1311 = 0;
                    if (this.field1562 && this.field1666 >= 5) {
                        this.field1379 = -1;
                        this.method476(4);
                        if (this.field1379 == this.field1309 && this.field1378 != this.field1310) {
                            Component var20 = Component.field68[this.field1309];
                            byte var21 = 0;
                            if (this.field1298 == 1 && var20.field77 == 206) {
                                var21 = 1;
                            }
                            if (var20.field69[this.field1378] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field98) {
                                int var22 = this.field1310;
                                int var23 = this.field1378;
                                var20.field69[var23] = var20.field69[var22];
                                var20.field70[var23] = var20.field70[var22];
                                var20.field69[var22] = -1;
                                var20.field70[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1310;
                                int var25 = this.field1378;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24, var24 - 1, 865);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24, var24 + 1, 865);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1310, this.field1378, 865);
                            }
                            this.field1259.method213((byte) 117, 93);
                            this.field1259.method215(this.field1309);
                            this.field1259.method215(this.field1310);
                            this.field1259.method215(this.field1378);
                            this.field1259.method214(var21);
                        }
                    } else if ((this.field1465 == 1 || this.method473(this.field1396 - 1, (byte) 9)) && this.field1396 > 2) {
                        this.method503(0);
                    } else if (this.field1396 > 0) {
                        this.method468((byte) 6, this.field1396 - 1);
                    }
                    this.field1263 = 10;
                    super.field28 = 0;
                }
            }
            ++field1643;
            if (field1643 > 62) {
                field1643 = 0;
                this.field1259.method213((byte) 117, 89);
            }
            if (World3D.field316 != -1) {
                int var26 = World3D.field316;
                int var27 = World3D.field317;
                boolean var28 = this.method447(field1668.field448[0], var26, 0, 0, 0, field1668.field447[0], 0, true, 0, var27, (byte) 9, 0);
                World3D.field316 = -1;
                if (var28) {
                    this.field1558 = super.field29;
                    this.field1559 = super.field30;
                    this.field1561 = 1;
                    this.field1560 = 0;
                }
            }
            if (super.field28 == 1 && this.field1245 != null) {
                this.field1245 = null;
                this.field1525 = true;
                super.field28 = 0;
            }
            this.method429((byte) 1);
            this.method538(-48671);
            this.method466(25675);
            this.method446(this.field1418);
            if (super.field21 == 1 || super.field28 == 1) {
                ++this.field1409;
            }
            if (this.field1545 == 2) {
                this.method537(true);
            }
            if (this.field1545 == 2 && this.field1424) {
                this.method524(-630);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1384[var29]++;
            }
            this.method539((byte) -39);
            ++super.field20;
            if (super.field20 > 4500) {
                this.field1639 = 250;
                super.field20 -= 500;
                this.field1259.method213((byte) 117, 209);
            }
            ++this.field1253;
            if (arg0 < 5 || arg0 > 5) {
                this.field1636 = this.field1551.method224();
            }
            if (this.field1253 > 500) {
                this.field1253 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1662 += this.field1663;
                }
                if ((var30 & 2) == 2) {
                    this.field1250 += this.field1251;
                }
                if ((var30 & 4) == 4) {
                    this.field1304 += this.field1305;
                }
            }
            if (this.field1662 < -50) {
                this.field1663 = 2;
            }
            if (this.field1662 > 50) {
                this.field1663 = -2;
            }
            if (this.field1250 < -55) {
                this.field1251 = 2;
            }
            if (this.field1250 > 55) {
                this.field1251 = -2;
            }
            if (this.field1304 < -40) {
                this.field1305 = 1;
            }
            if (this.field1304 > 40) {
                this.field1305 = -1;
            }
            ++this.field1332;
            if (this.field1332 > 500) {
                this.field1332 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1633 += this.field1634;
                }
                if ((var31 & 2) == 2) {
                    this.field1586 += this.field1587;
                }
            }
            if (this.field1633 < -60) {
                this.field1634 = 2;
            }
            if (this.field1633 > 60) {
                this.field1634 = -2;
            }
            if (this.field1586 < -20) {
                this.field1587 = 1;
            }
            if (this.field1586 > 10) {
                this.field1587 = -1;
            }
            ++this.field1638;
            if (this.field1638 > 50) {
                this.field1259.method213((byte) 117, 120);
            }
            try {
                if (this.field1524 != null && this.field1259.field709 > 0) {
                    this.field1524.method42(this.field1259.field709, -2584, this.field1259.field708, 0);
                    this.field1259.field709 = 0;
                    this.field1638 = 0;
                }
            } catch (IOException var33) {
                this.method479(0);
            } catch (Exception var34) {
                this.method488(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method531(boolean arg0, long arg1) {
        if (arg0) {
            this.field1636 = this.field1551.method224();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1377; ++var4) {
                if (this.field1233[var4] == arg1) {
                    --this.field1377;
                    this.field1344 = true;
                    for (int var5 = var4; var5 < this.field1377; ++var5) {
                        this.field1233[var5] = this.field1233[var5 + 1];
                    }
                    this.field1259.method213((byte) 117, 101);
                    this.field1259.method220(arg1, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method532(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            this.method6();
        }
        int var5 = 256 - arg1;
        return ((arg0 & 16711935) * var5 + (arg3 & 16711935) * arg1 & -16711936) + ((arg0 & 65280) * var5 + (arg3 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method533(int arg0) {
        LocType.field987.method103();
        LocType.field988.method103();
        if (arg0 >= 0) {
            this.field1372 = !this.field1372;
        }
        NpcType.field1029.method103();
        ObjType.field1079.method103();
        ObjType.field1080.method103();
        PlayerEntity.field480.method103();
        SpotAnimType.field1166.method103();
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method534(int arg0) {
        if (arg0 != 6905) {
            this.field1549 = this.field1360.method290();
        }
        if (this.field1616 == 2) {
            this.method438(361, (this.field1578 - this.field1471 << 7) + this.field1581, (this.field1579 - this.field1472 << 7) + this.field1582, this.field1580 * 2);
            if (this.field1415 > -1 && field1218 % 20 < 10) {
                this.field1417[2].method185(this.field1486, this.field1415 - 12, this.field1416 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;IIB)V")
    public final void method535(int arg0, Component arg1, int arg2, int arg3, byte arg4) {
        if (arg1.field75 == 0 && arg1.field90 != null) {
            if (!arg1.field89 || this.field1664 == arg1.field73 || this.field1432 == arg1.field73 || this.field1482 == arg1.field73) {
                int var6 = Pix2D.field620;
                int var7 = Pix2D.field618;
                int var8 = Pix2D.field621;
                int var9 = Pix2D.field619;
                Pix2D.method153(5, arg1.field79 + arg2, arg1.field78 + arg0, arg0, arg2);
                int var10 = arg1.field90.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg1.field91[var11] + arg0;
                    int var14 = arg1.field92[var11] + arg2 - arg3;
                    Component var15 = Component.field68[arg1.field90[var11]];
                    int var16 = var15.field81 + var13;
                    int var17 = var15.field82 + var14;
                    if (var15.field77 > 0) {
                        this.method443((byte) -123, var15);
                    }
                    if (var15.field75 == 0) {
                        if (var15.field88 > var15.field87 - var15.field79) {
                            var15.field88 = var15.field87 - var15.field79;
                        }
                        if (var15.field88 < 0) {
                            var15.field88 = 0;
                        }
                        this.method535(var16, var15, var17, var15.field88, (byte) 0);
                        if (var15.field87 > var15.field79) {
                            this.method464(var15.field88, var17, var15.field87, (byte) 123, var15.field78 + var16, var15.field79);
                        }
                    } else if (var15.field75 != 1) {
                        if (var15.field75 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field79; ++var19) {
                                for (int var20 = 0; var20 < var15.field78; ++var20) {
                                    int var21 = (var15.field99 + 32) * var20 + var16;
                                    int var22 = (var15.field100 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field102[var18];
                                        var22 += var15.field103[var18];
                                    }
                                    if (var15.field69[var18] <= 0) {
                                        if (var15.field101 != null && var18 < 20) {
                                            Pix32 var31 = var15.field101[var18];
                                            if (var31 != null) {
                                                var31.method185(this.field1486, var21, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field69[var18] - 1;
                                        if (var21 > Pix2D.field620 - 32 && var21 < Pix2D.field621 && var22 > Pix2D.field618 - 32 && var22 < Pix2D.field619 || this.field1311 != 0 && this.field1310 == var18) {
                                            int var26 = 0;
                                            if (this.field1227 == 1 && this.field1228 == var18 && this.field1229 == var15.field73) {
                                                var26 = 16777215;
                                            }
                                            Pix32 var27 = ObjType.method347(var25, var26, 45926, var15.field70[var18]);
                                            if (var27 != null) {
                                                if (this.field1311 != 0 && this.field1310 == var18 && this.field1309 == var15.field73) {
                                                    var23 = super.field22 - this.field1312;
                                                    var24 = super.field23 - this.field1313;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field1666 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method187(var22 + var24, var21 + var23, -676, 128);
                                                    if (var22 + var24 < Pix2D.field618 && arg1.field88 > 0) {
                                                        int var28 = (Pix2D.field618 - var22 - var24) * this.field1391 / 3;
                                                        if (var28 > this.field1391 * 10) {
                                                            var28 = this.field1391 * 10;
                                                        }
                                                        if (var28 > arg1.field88) {
                                                            var28 = arg1.field88;
                                                        }
                                                        arg1.field88 -= var28;
                                                        this.field1313 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > Pix2D.field619 && arg1.field88 < arg1.field87 - arg1.field79) {
                                                        int var29 = (var22 + var24 + 32 - Pix2D.field619) * this.field1391 / 3;
                                                        if (var29 > this.field1391 * 10) {
                                                            var29 = this.field1391 * 10;
                                                        }
                                                        if (var29 > arg1.field87 - arg1.field79 - arg1.field88) {
                                                            var29 = arg1.field87 - arg1.field79 - arg1.field88;
                                                        }
                                                        arg1.field88 += var29;
                                                        this.field1313 -= var29;
                                                    }
                                                } else if (this.field1266 != 0 && this.field1265 == var18 && this.field1264 == var15.field73) {
                                                    var27.method187(var22, var21, -676, 128);
                                                } else {
                                                    var27.method185(this.field1486, var21, var22);
                                                }
                                                if (var27.field666 == 33 || var15.field70[var18] != 1) {
                                                    int var30 = var15.field70[var18];
                                                    this.field1491.method203(var21 + 1 + var23, method518(5, var30), 0, var22 + 10 + var24, true);
                                                    this.field1491.method203(var21 + var23, method518(5, var30), 16776960, var22 + 9 + var24, true);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field75 == 3) {
                            boolean var32 = false;
                            if (this.field1482 == var15.field73 || this.field1432 == var15.field73 || this.field1664 == var15.field73) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method542(var15, 717)) {
                                var33 = var15.field112;
                                if (var32 && var15.field114 != 0) {
                                    var33 = var15.field114;
                                }
                            } else {
                                var33 = var15.field111;
                                if (var32 && var15.field113 != 0) {
                                    var33 = var15.field113;
                                }
                            }
                            if (var15.field80 == 0) {
                                if (var15.field105) {
                                    Pix2D.method156(var15.field79, var33, var15.field78, var16, 0, var17);
                                } else {
                                    Pix2D.method157(var15.field78, var33, var15.field79, var16, var17, 394);
                                }
                            } else if (var15.field105) {
                                Pix2D.method155(var15.field78, var15.field79, var17, var33, var16, 0, 256 - (var15.field80 & 255));
                            } else {
                                Pix2D.method158(var15.field78, true, var17, var16, var33, var15.field79, 256 - (var15.field80 & 255));
                            }
                        } else if (var15.field75 == 4) {
                            PixFont var34 = var15.field108;
                            String var35 = var15.field109;
                            boolean var36 = false;
                            if (this.field1482 == var15.field73 || this.field1432 == var15.field73 || this.field1664 == var15.field73) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method542(var15, 717)) {
                                var37 = var15.field112;
                                if (var36 && var15.field114 != 0) {
                                    var37 = var15.field114;
                                }
                                if (var15.field110.length() > 0) {
                                    var35 = var15.field110;
                                }
                            } else {
                                var37 = var15.field111;
                                if (var36 && var15.field113 != 0) {
                                    var37 = var15.field113;
                                }
                            }
                            if (var15.field76 == 6 && this.field1584) {
                                var35 = "Please wait...";
                                var37 = var15.field111;
                            }
                            if (Pix2D.field616 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field694 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method434(this.field1533, this.method442(true, var15, 4)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method434(this.field1533, this.method442(true, var15, 3)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method434(this.field1533, this.method442(true, var15, 2)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method434(this.field1533, this.method442(true, var15, 1)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method434(this.field1533, this.method442(true, var15, 0)) + var35.substring(var39 + 2);
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
                                if (var15.field106) {
                                    var34.method201(0, var15.field78 / 2 + var16, var38, var45, var37, var15.field107);
                                } else {
                                    var34.method205(var45, this.field1449, var15.field107, var38, var16, var37);
                                }
                                var38 += var34.field694;
                            }
                        } else if (var15.field75 == 5) {
                            Pix32 var46;
                            if (this.method542(var15, 717)) {
                                var46 = var15.field116;
                            } else {
                                var46 = var15.field115;
                            }
                            if (var46 != null) {
                                var46.method185(this.field1486, var16, var17);
                            }
                        } else if (var15.field75 == 6) {
                            int var47 = Pix3D.field633;
                            int var48 = Pix3D.field634;
                            Pix3D.field633 = var15.field78 / 2 + var16;
                            Pix3D.field634 = var15.field79 / 2 + var17;
                            int var49 = Pix3D.field637[var15.field124] * var15.field123 >> 16;
                            int var50 = Pix3D.field638[var15.field124] * var15.field123 >> 16;
                            boolean var51 = this.method542(var15, 717);
                            int var52;
                            if (var51) {
                                var52 = var15.field122;
                            } else {
                                var52 = var15.field121;
                            }
                            Model var53;
                            if (var52 == -1) {
                                var53 = var15.method34(-1, -1, 811, var51);
                            } else {
                                SeqType var54 = SeqType.field1133[var52];
                                var53 = var15.method34(var54.field1135[var15.field71], var54.field1136[var15.field71], 811, var51);
                            }
                            if (var53 != null) {
                                var53.method145(0, var15.field125, 0, var15.field124, 0, var49, var50);
                            }
                            Pix3D.field633 = var47;
                            Pix3D.field634 = var48;
                        } else if (var15.field75 == 7) {
                            PixFont var55 = var15.field108;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field79; ++var57) {
                                for (int var58 = 0; var58 < var15.field78; ++var58) {
                                    if (var15.field69[var56] > 0) {
                                        ObjType var59 = ObjType.method341(var15.field69[var56] - 1);
                                        String var60 = var59.field1042;
                                        if (var59.field1053 || var15.field70[var56] != 1) {
                                            var60 = var60 + " x" + method505(var15.field70[var56], this.field1678);
                                        }
                                        int var61 = (var15.field99 + 115) * var58 + var16;
                                        int var62 = (var15.field100 + 12) * var57 + var17;
                                        if (var15.field106) {
                                            var55.method201(0, var15.field78 / 2 + var61, var62, var60, var15.field111, var15.field107);
                                        } else {
                                            var55.method205(var60, this.field1449, var15.field107, var62, var61, var15.field111);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                Pix2D.method153(5, var9, var8, var6, var7);
                if (arg4 == 0) {
                    boolean var12 = false;
                } else {
                    this.field1259.method214(141);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method536(int arg0) {
        short var2 = 256;
        if (arg0 != 35604) {
            this.field1372 = !this.field1372;
        }
        if (this.field1410 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1410 > 768) {
                    this.field1352[var3] = this.method532(this.field1353[var3], 1024 - this.field1410, 264, this.field1354[var3]);
                } else if (this.field1410 > 256) {
                    this.field1352[var3] = this.field1354[var3];
                } else {
                    this.field1352[var3] = this.method532(this.field1354[var3], 256 - this.field1410, 264, this.field1353[var3]);
                }
            }
        } else if (this.field1411 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1411 > 768) {
                    this.field1352[var4] = this.method532(this.field1353[var4], 1024 - this.field1411, 264, this.field1355[var4]);
                } else if (this.field1411 > 256) {
                    this.field1352[var4] = this.field1355[var4];
                } else {
                    this.field1352[var4] = this.method532(this.field1355[var4], 256 - this.field1411, 264, this.field1353[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1352[var5] = this.field1353[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1458.field749[var6] = this.field1307.field661[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1319[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1393[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1352[var26];
                    int var30 = this.field1458.field749[var8];
                    this.field1458.field749[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1458.method254(0, super.field14, (byte) 76, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1459.field749[var10] = this.field1308.field661[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1319[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1393[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1352[var18];
                    int var22 = this.field1459.field749[var16];
                    this.field1459.field749[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1459.method254(637, super.field14, (byte) 76, 0);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method537(boolean arg0) {
        this.field1321 &= arg0;
        try {
            int var2 = field1668.field397 + this.field1662;
            int var3 = field1668.field398 + this.field1250;
            if (this.field1437 - var2 < -500 || this.field1437 - var2 > 500 || this.field1438 - var3 < -500 || this.field1438 - var3 > 500) {
                this.field1437 = var2;
                this.field1438 = var3;
            }
            if (this.field1437 != var2) {
                this.field1437 += (var2 - this.field1437) / 16;
            }
            if (this.field1438 != var3) {
                this.field1438 += (var3 - this.field1438) / 16;
            }
            if (super.field32[1] == 1) {
                this.field1623 += (-24 - this.field1623) / 2;
            } else if (super.field32[2] == 1) {
                this.field1623 += (24 - this.field1623) / 2;
            } else {
                this.field1623 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field1624 += (12 - this.field1624) / 2;
            } else if (super.field32[4] == 1) {
                this.field1624 += (-12 - this.field1624) / 2;
            } else {
                this.field1624 /= 2;
            }
            this.field1622 = this.field1623 / 2 + this.field1622 & 2047;
            this.field1621 += this.field1624 / 2;
            if (this.field1621 < 128) {
                this.field1621 = 128;
            }
            if (this.field1621 > 383) {
                this.field1621 = 383;
            }
            int var4 = this.field1437 >> 7;
            int var5 = this.field1438 >> 7;
            int var6 = this.method458(this.field1437, this.field1438, 0, this.field1478);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1478;
                        if (var10 < 3 && (this.field1243[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1373[var10][var8][var9];
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
            if (var12 > this.field1488) {
                this.field1488 += (var12 - this.field1488) / 24;
            } else if (var12 < this.field1488) {
                this.field1488 += (var12 - this.field1488) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1668.field397 + "," + field1668.field398 + "," + this.field1437 + "," + this.field1438 + "," + this.field1338 + "," + this.field1339 + "," + this.field1471 + "," + this.field1472);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (this.field1592 != arg0) {
            this.method6();
        }
        if (this.field1447 == 0) {
            if (super.field28 == 1) {
                int var2 = super.field29 - 25 - 550;
                int var3 = super.field30 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1633 + this.field1622 & 2047;
                    int var5 = Pix3D.field637[var4];
                    int var6 = Pix3D.field638[var4];
                    int var7 = (this.field1586 + 256) * var5 >> 8;
                    int var8 = (this.field1586 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1668.field397 + var9 >> 7;
                    int var12 = field1668.field398 - var10 >> 7;
                    boolean var13 = this.method447(field1668.field448[0], var11, 0, 0, 0, field1668.field447[0], 0, true, 0, var12, (byte) 9, 1);
                    if (var13) {
                        this.field1259.method214(var2);
                        this.field1259.method214(var3);
                        this.field1259.method215(this.field1622);
                        this.field1259.method214(57);
                        this.field1259.method214(this.field1633);
                        this.field1259.method214(this.field1586);
                        this.field1259.method214(89);
                        this.field1259.method215(field1668.field397);
                        this.field1259.method215(field1668.field398);
                        this.field1259.method214(this.field1422);
                        this.field1259.method214(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method539(byte arg0) {
        if (arg0 != -39) {
            this.field1315 = !this.field1315;
        }
        ++field1454;
        if (field1454 > 192) {
            field1454 = 0;
            this.field1259.method213((byte) 117, 230);
            this.field1259.method214(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5((byte) 5);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1453 != -1 && this.field1497 == this.field1453) {
                        if (var2 == 8 && this.field1367.length() > 0) {
                            this.field1367 = this.field1367.substring(0, this.field1367.length() - 1);
                        }
                        break;
                    }
                    if (this.field1681) {
                        if (var2 >= 32 && var2 <= 122 && this.field1400.length() < 80) {
                            this.field1400 = this.field1400 + (char) var2;
                            this.field1525 = true;
                        }
                        if (var2 == 8 && this.field1400.length() > 0) {
                            this.field1400 = this.field1400.substring(0, this.field1400.length() - 1);
                            this.field1525 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1681 = false;
                            this.field1525 = true;
                            if (this.field1467 == 1) {
                                long var3 = JString.method295(this.field1400);
                                this.method510(199, var3);
                            }
                            if (this.field1467 == 2 && this.field1531 > 0) {
                                long var5 = JString.method295(this.field1400);
                                this.method470(0, var5);
                            }
                            if (this.field1467 == 3 && this.field1400.length() > 0) {
                                this.field1259.method213((byte) 117, 139);
                                this.field1259.method214(0);
                                int var7 = this.field1259.field709;
                                this.field1259.method220(this.field1283, 0);
                                WordPack.method303(this.field1400, (byte) 126, this.field1259);
                                this.field1259.method223(this.field1259.field709 - var7, this.field1213);
                                this.field1400 = JString.method300(this.field1400, -407);
                                this.field1400 = WordFilter.method394((byte) 3, this.field1400);
                                this.method457(-476, 6, JString.method299(131, JString.method296(0, this.field1283)), this.field1400);
                                if (this.field1388 == 2) {
                                    this.field1388 = 1;
                                    this.field1557 = true;
                                    this.field1259.method213((byte) 117, 154);
                                    this.field1259.method214(this.field1383);
                                    this.field1259.method214(this.field1388);
                                    this.field1259.method214(this.field1221);
                                }
                            }
                            if (this.field1467 == 4 && this.field1377 < 100) {
                                long var8 = JString.method295(this.field1400);
                                this.method504(var8, false);
                            }
                            if (this.field1467 == 5 && this.field1377 > 0) {
                                long var10 = JString.method295(this.field1400);
                                this.method531(this.field1390, var10);
                            }
                        }
                    } else if (this.field1520) {
                        if (var2 >= 48 && var2 <= 57 && this.field1598.length() < 10) {
                            this.field1598 = this.field1598 + (char) var2;
                            this.field1525 = true;
                        }
                        if (var2 == 8 && this.field1598.length() > 0) {
                            this.field1598 = this.field1598.substring(0, this.field1598.length() - 1);
                            this.field1525 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1598.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1598);
                                } catch (Exception var17) {
                                }
                                this.field1259.method213((byte) 117, 102);
                                this.field1259.method218(var12);
                            }
                            this.field1520 = false;
                            this.field1525 = true;
                        }
                    } else if (this.field1427 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1425.length() < 80) {
                            this.field1425 = this.field1425 + (char) var2;
                            this.field1525 = true;
                        }
                        if (var2 == 8 && this.field1425.length() > 0) {
                            this.field1425 = this.field1425.substring(0, this.field1425.length() - 1);
                            this.field1525 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1425.length() > 0) {
                            if (this.field1282 == 2) {
                                if (this.field1425.equals("::clientdrop")) {
                                    this.method479(0);
                                }
                                if (this.field1425.equals("::lag")) {
                                    this.method526(true);
                                }
                                if (this.field1425.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1431.method267(field1651, 2); ++var13) {
                                        this.field1431.method277((byte) 5, var13, 2, (byte) 1);
                                    }
                                }
                            }
                            if (this.field1425.startsWith("::")) {
                                this.field1259.method213((byte) 117, 224);
                                this.field1259.method214(this.field1425.length() - 1);
                                this.field1259.method221(this.field1425.substring(2));
                            } else {
                                byte var14 = 0;
                                if (this.field1425.startsWith("yellow:")) {
                                    var14 = 0;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                if (this.field1425.startsWith("red:")) {
                                    var14 = 1;
                                    this.field1425 = this.field1425.substring(4);
                                }
                                if (this.field1425.startsWith("green:")) {
                                    var14 = 2;
                                    this.field1425 = this.field1425.substring(6);
                                }
                                if (this.field1425.startsWith("cyan:")) {
                                    var14 = 3;
                                    this.field1425 = this.field1425.substring(5);
                                }
                                if (this.field1425.startsWith("purple:")) {
                                    var14 = 4;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                if (this.field1425.startsWith("white:")) {
                                    var14 = 5;
                                    this.field1425 = this.field1425.substring(6);
                                }
                                if (this.field1425.startsWith("flash1:")) {
                                    var14 = 6;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                if (this.field1425.startsWith("flash2:")) {
                                    var14 = 7;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                if (this.field1425.startsWith("flash3:")) {
                                    var14 = 8;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                if (this.field1425.startsWith("glow1:")) {
                                    var14 = 9;
                                    this.field1425 = this.field1425.substring(6);
                                }
                                if (this.field1425.startsWith("glow2:")) {
                                    var14 = 10;
                                    this.field1425 = this.field1425.substring(6);
                                }
                                if (this.field1425.startsWith("glow3:")) {
                                    var14 = 11;
                                    this.field1425 = this.field1425.substring(6);
                                }
                                byte var15 = 0;
                                if (this.field1425.startsWith("wave:")) {
                                    var15 = 1;
                                    this.field1425 = this.field1425.substring(5);
                                }
                                if (this.field1425.startsWith("scroll:")) {
                                    var15 = 2;
                                    this.field1425 = this.field1425.substring(7);
                                }
                                this.field1259.method213((byte) 117, 253);
                                this.field1259.method214(0);
                                int var16 = this.field1259.field709;
                                this.field1259.method214(var14);
                                this.field1259.method214(var15);
                                WordPack.method303(this.field1425, (byte) 126, this.field1259);
                                this.field1259.method223(this.field1259.field709 - var16, this.field1213);
                                this.field1425 = JString.method300(this.field1425, -407);
                                this.field1425 = WordFilter.method394((byte) 3, this.field1425);
                                field1668.field409 = this.field1425;
                                field1668.field411 = var14;
                                field1668.field412 = var15;
                                field1668.field410 = 150;
                                if (this.field1282 == 2) {
                                    this.method457(-476, 2, "@cr2@" + field1668.field457, field1668.field409);
                                } else if (this.field1282 == 1) {
                                    this.method457(-476, 2, "@cr1@" + field1668.field457, field1668.field409);
                                } else {
                                    this.method457(-476, 2, field1668.field457, field1668.field409);
                                }
                                if (this.field1383 == 2) {
                                    this.field1383 = 3;
                                    this.field1557 = true;
                                    this.field1259.method213((byte) 117, 154);
                                    this.field1259.method214(this.field1383);
                                    this.field1259.method214(this.field1388);
                                    this.field1259.method214(this.field1221);
                                }
                            }
                            this.field1425 = "";
                            this.field1525 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1367.length() < 12) {
                this.field1367 = this.field1367 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method540(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILgc;I)V")
    public final void method541(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (this.field1396 < 400) {
            String var6 = arg3.field1004;
            if (arg0 < 0 || arg0 > 0) {
                this.field1259.method214(204);
            }
            if (arg3.field1021 != 0) {
                var6 = var6 + method485(-684, arg3.field1021, field1668.field463) + " (level-" + arg3.field1021 + ")";
            }
            if (this.field1227 == 1) {
                this.field1530[this.field1396] = "Use " + this.field1231 + " with @yel@" + var6;
                this.field1609[this.field1396] = 829;
                this.field1610[this.field1396] = arg4;
                this.field1607[this.field1396] = arg1;
                this.field1608[this.field1396] = arg2;
                ++this.field1396;
            } else {
                if (this.field1612 == 1) {
                    if ((this.field1614 & 2) == 2) {
                        this.field1530[this.field1396] = this.field1615 + " @yel@" + var6;
                        this.field1609[this.field1396] = 240;
                        this.field1610[this.field1396] = arg4;
                        this.field1607[this.field1396] = arg1;
                        this.field1608[this.field1396] = arg2;
                        ++this.field1396;
                        return;
                    }
                } else {
                    if (arg3.field1016 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg3.field1016[var7] != null && !arg3.field1016[var7].equalsIgnoreCase("attack")) {
                                this.field1530[this.field1396] = arg3.field1016[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1609[this.field1396] = 242;
                                }
                                if (var7 == 1) {
                                    this.field1609[this.field1396] = 209;
                                }
                                if (var7 == 2) {
                                    this.field1609[this.field1396] = 309;
                                }
                                if (var7 == 3) {
                                    this.field1609[this.field1396] = 852;
                                }
                                if (var7 == 4) {
                                    this.field1609[this.field1396] = 793;
                                }
                                this.field1610[this.field1396] = arg4;
                                this.field1607[this.field1396] = arg1;
                                this.field1608[this.field1396] = arg2;
                                ++this.field1396;
                            }
                        }
                    }
                    if (arg3.field1016 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg3.field1016[var8] != null && arg3.field1016[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg3.field1021 > field1668.field463) {
                                    var9 = 2000;
                                }
                                this.field1530[this.field1396] = arg3.field1016[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1609[this.field1396] = var9 + 242;
                                }
                                if (var8 == 1) {
                                    this.field1609[this.field1396] = var9 + 209;
                                }
                                if (var8 == 2) {
                                    this.field1609[this.field1396] = var9 + 309;
                                }
                                if (var8 == 3) {
                                    this.field1609[this.field1396] = var9 + 852;
                                }
                                if (var8 == 4) {
                                    this.field1609[this.field1396] = var9 + 793;
                                }
                                this.field1610[this.field1396] = arg4;
                                this.field1607[this.field1396] = arg1;
                                this.field1608[this.field1396] = arg2;
                                ++this.field1396;
                            }
                        }
                    }
                    this.field1530[this.field1396] = "Examine @yel@" + var6;
                    this.field1609[this.field1396] = 1714;
                    this.field1610[this.field1396] = arg4;
                    this.field1607[this.field1396] = arg1;
                    this.field1608[this.field1396] = arg2;
                    ++this.field1396;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;I)Z")
    public final boolean method542(Component arg0, int arg1) {
        if (arg0.field84 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field84.length; ++var3) {
                int var5 = this.method442(true, arg0, var3);
                int var6 = arg0.field85[var3];
                if (arg0.field84[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field84[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field84[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            if (arg1 <= 0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method543(byte arg0) {
        for (int var2 = 0; var2 < this.field1676; ++var2) {
            int var3 = this.field1677[var2];
            NpcEntity var4 = this.field1675[var3];
            if (var4 != null) {
                this.method544(var4, 0, var4.field453.field1006);
            }
        }
        if (arg0 != -34) {
            this.field1636 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;II)V")
    public final void method544(PathingEntity arg0, int arg1, int arg2) {
        if (arg0.field397 < 128 || arg0.field398 < 128 || arg0.field397 >= 13184 || arg0.field398 >= 13184) {
            arg0.field425 = -1;
            arg0.field430 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
            arg0.method112(false);
        }
        if (field1668 == arg0 && (arg0.field397 < 1536 || arg0.field398 < 1536 || arg0.field397 >= 11776 || arg0.field398 >= 11776)) {
            arg0.field425 = -1;
            arg0.field430 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
            arg0.method112(false);
        }
        if (arg0.field439 > field1218) {
            this.method545(arg0, 896);
        } else if (arg0.field440 >= field1218) {
            this.method546(arg0, this.field1549);
        } else {
            this.method547(0, arg0);
        }
        this.method548(arg0, -1672);
        if (arg1 != 0) {
            field1651 = 207;
        }
        this.method549(arg0, 3186);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method545(PathingEntity arg0, int arg1) {
        int var3 = arg0.field439 - field1218;
        int var4 = 25 / arg1;
        int var5 = arg0.field435 * 128 + arg0.field401 * 64;
        int var6 = arg0.field437 * 128 + arg0.field401 * 64;
        arg0.field397 += (var5 - arg0.field397) / var3;
        arg0.field398 += (var6 - arg0.field398) / var3;
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
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method546(PathingEntity arg0, int arg1) {
        this.field1635 += arg1;
        if (field1218 == arg0.field440 || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > SeqType.field1133[arg0.field425].method375(arg0.field426, 41645)) {
            int var3 = arg0.field440 - arg0.field439;
            int var4 = field1218 - arg0.field439;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method547(int arg0, PathingEntity arg1) {
        arg1.field422 = arg1.field402;
        if (arg1.field446 == 0) {
            arg1.field450 = 0;
        } else {
            if (arg1.field425 != -1 && arg1.field428 == 0) {
                SeqType var3 = SeqType.field1133[arg1.field425];
                if (arg1.field451 > 0 && var3.field1145 == 0) {
                    ++arg1.field450;
                    return;
                }
                if (arg1.field451 <= 0 && var3.field1146 == 0) {
                    ++arg1.field450;
                    return;
                }
            }
            int var4 = arg1.field397;
            int var5 = arg1.field398;
            int var6 = arg1.field447[arg1.field446 - 1] * 128 + arg1.field401 * 64;
            int var7 = arg1.field448[arg1.field446 - 1] * 128 + arg1.field401 * 64;
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
                if (arg0 == 0) {
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
                }
            } else {
                arg1.field397 = var6;
                arg1.field398 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Ly;I)V")
    public final void method548(PathingEntity arg0, int arg1) {
        if (arg1 != -1672) {
            this.field1636 = this.field1551.method224();
        }
        if (arg0.field445 != 0) {
            if (arg0.field419 != -1 && arg0.field419 < 32768) {
                NpcEntity var3 = this.field1675[arg0.field419];
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
                if (this.field1363 == var6) {
                    var6 = this.field1535;
                }
                PlayerEntity var7 = this.field1536[var6];
                if (var7 != null) {
                    int var8 = arg0.field397 - var7.field397;
                    int var9 = arg0.field398 - var7.field398;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field444 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field420 != 0 || arg0.field421 != 0) && (arg0.field446 == 0 || arg0.field450 > 0)) {
                int var10 = arg0.field397 - (arg0.field420 - this.field1471 - this.field1471) * 64;
                int var11 = arg0.field398 - (arg0.field421 - this.field1472 - this.field1472) * 64;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(Ly;I)V")
    public final void method549(PathingEntity arg0, int arg1) {
        if (arg1 != 3186) {
            this.field1261 = this.field1360.method290();
        }
        arg0.field400 = false;
        if (arg0.field422 != -1) {
            SeqType var3 = SeqType.field1133[arg0.field422];
            ++arg0.field424;
            if (arg0.field423 < var3.field1134 && arg0.field424 > var3.method375(arg0.field423, 41645)) {
                arg0.field424 = 0;
                ++arg0.field423;
            }
            if (arg0.field423 >= var3.field1134) {
                arg0.field424 = 0;
                arg0.field423 = 0;
            }
        }
        if (arg0.field430 != -1 && field1218 >= arg0.field433) {
            if (arg0.field431 < 0) {
                arg0.field431 = 0;
            }
            SeqType var4 = SpotAnimType.field1154[arg0.field430].field1158;
            ++arg0.field432;
            while (arg0.field431 < var4.field1134 && arg0.field432 > var4.method375(arg0.field431, 41645)) {
                arg0.field432 -= var4.method375(arg0.field431, 41645);
                ++arg0.field431;
            }
            if (arg0.field431 >= var4.field1134 && (arg0.field431 < 0 || arg0.field431 >= var4.field1134)) {
                arg0.field430 = -1;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 <= 1) {
            SeqType var5 = SeqType.field1133[arg0.field425];
            if (var5.field1145 == 1 && arg0.field451 > 0 && arg0.field439 <= field1218 && arg0.field440 < field1218) {
                arg0.field428 = 1;
                return;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 == 0) {
            SeqType var6 = SeqType.field1133[arg0.field425];
            ++arg0.field427;
            while (arg0.field426 < var6.field1134 && arg0.field427 > var6.method375(arg0.field426, 41645)) {
                arg0.field427 -= var6.method375(arg0.field426, 41645);
                ++arg0.field426;
            }
            if (arg0.field426 >= var6.field1134) {
                arg0.field426 -= var6.field1138;
                ++arg0.field429;
                if (arg0.field429 >= var6.field1144) {
                    arg0.field425 = -1;
                }
                if (arg0.field426 < 0 || arg0.field426 >= var6.field1134) {
                    arg0.field425 = -1;
                }
            }
            arg0.field400 = var6.field1140;
        }
        if (arg0.field428 > 0) {
            --arg0.field428;
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 != 41329) {
            this.field1636 = -1;
        }
        if (this.field1333) {
            this.field1333 = false;
            this.field1268.method254(0, super.field14, (byte) 76, 4);
            this.field1269.method254(0, super.field14, (byte) 76, 357);
            this.field1270.method254(722, super.field14, (byte) 76, 4);
            this.field1271.method254(743, super.field14, (byte) 76, 205);
            this.field1272.method254(0, super.field14, (byte) 76, 0);
            this.field1273.method254(516, super.field14, (byte) 76, 4);
            this.field1274.method254(516, super.field14, (byte) 76, 205);
            this.field1275.method254(496, super.field14, (byte) 76, 357);
            this.field1276.method254(0, super.field14, (byte) 76, 338);
            this.field1344 = true;
            this.field1525 = true;
            this.field1257 = true;
            this.field1557 = true;
            if (this.field1545 != 2) {
                this.field1280.method254(4, super.field14, (byte) 76, 4);
                this.field1279.method254(550, super.field14, (byte) 76, 4);
            }
        }
        if (this.field1545 == 2) {
            this.method445(0);
        }
        if (this.field1267 && this.field1670 == 1) {
            this.field1344 = true;
        }
        if (this.field1632 != -1) {
            boolean var2 = this.method422(this.field1391, 753, this.field1632);
            if (var2) {
                this.field1344 = true;
            }
        }
        if (this.field1266 == 2) {
            this.field1344 = true;
        }
        if (this.field1311 == 2) {
            this.field1344 = true;
        }
        if (this.field1344) {
            this.method506(true);
            this.field1344 = false;
        }
        if (this.field1427 == -1) {
            this.field1277.field88 = this.field1347 - this.field1498 - 77;
            if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                this.method472(-782, 77, this.field1277, super.field23 - 357, 0, 463, super.field22 - 17, false, this.field1347);
            }
            int var3 = this.field1347 - 77 - this.field1277.field88;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1347 - 77) {
                var3 = this.field1347 - 77;
            }
            if (this.field1498 != var3) {
                this.field1498 = var3;
                this.field1525 = true;
            }
        }
        if (this.field1427 != -1) {
            boolean var4 = this.method422(this.field1391, 753, this.field1427);
            if (var4) {
                this.field1525 = true;
            }
        }
        if (this.field1266 == 3) {
            this.field1525 = true;
        }
        if (this.field1311 == 3) {
            this.field1525 = true;
        }
        if (this.field1245 != null) {
            this.field1525 = true;
        }
        if (this.field1267 && this.field1670 == 2) {
            this.field1525 = true;
        }
        if (this.field1525) {
            this.method471((byte) -29);
            this.field1525 = false;
        }
        if (this.field1545 == 2) {
            this.method511((byte) 5);
            this.field1279.method254(550, super.field14, (byte) 76, 4);
        }
        if (this.field1589 != -1) {
            this.field1257 = true;
        }
        if (this.field1257) {
            if (this.field1589 != -1 && this.field1589 == this.field1429) {
                this.field1589 = -1;
                this.field1259.method213((byte) 117, 94);
                this.field1259.method214(this.field1429);
            }
            this.field1257 = false;
            this.field1408.method253(field1376);
            this.field1596.method198(this.field1486, 0, 0);
            if (this.field1632 == -1) {
                if (this.field1370[this.field1429] != -1) {
                    if (this.field1429 == 0) {
                        this.field1291.method198(this.field1486, 22, 10);
                    }
                    if (this.field1429 == 1) {
                        this.field1292.method198(this.field1486, 54, 8);
                    }
                    if (this.field1429 == 2) {
                        this.field1292.method198(this.field1486, 82, 8);
                    }
                    if (this.field1429 == 3) {
                        this.field1293.method198(this.field1486, 110, 8);
                    }
                    if (this.field1429 == 4) {
                        this.field1295.method198(this.field1486, 153, 8);
                    }
                    if (this.field1429 == 5) {
                        this.field1295.method198(this.field1486, 181, 8);
                    }
                    if (this.field1429 == 6) {
                        this.field1294.method198(this.field1486, 209, 9);
                    }
                }
                if (this.field1370[0] != -1 && (this.field1589 != 0 || field1218 % 20 < 10)) {
                    this.field1368[0].method198(this.field1486, 29, 13);
                }
                if (this.field1370[1] != -1 && (this.field1589 != 1 || field1218 % 20 < 10)) {
                    this.field1368[1].method198(this.field1486, 53, 11);
                }
                if (this.field1370[2] != -1 && (this.field1589 != 2 || field1218 % 20 < 10)) {
                    this.field1368[2].method198(this.field1486, 82, 11);
                }
                if (this.field1370[3] != -1 && (this.field1589 != 3 || field1218 % 20 < 10)) {
                    this.field1368[3].method198(this.field1486, 115, 12);
                }
                if (this.field1370[4] != -1 && (this.field1589 != 4 || field1218 % 20 < 10)) {
                    this.field1368[4].method198(this.field1486, 153, 13);
                }
                if (this.field1370[5] != -1 && (this.field1589 != 5 || field1218 % 20 < 10)) {
                    this.field1368[5].method198(this.field1486, 180, 11);
                }
                if (this.field1370[6] != -1 && (this.field1589 != 6 || field1218 % 20 < 10)) {
                    this.field1368[6].method198(this.field1486, 208, 13);
                }
            }
            this.field1408.method254(516, super.field14, (byte) 76, 160);
            this.field1407.method253(field1376);
            this.field1595.method198(this.field1486, 0, 0);
            if (this.field1632 == -1) {
                if (this.field1370[this.field1429] != -1) {
                    if (this.field1429 == 7) {
                        this.field1626.method198(this.field1486, 42, 0);
                    }
                    if (this.field1429 == 8) {
                        this.field1627.method198(this.field1486, 74, 0);
                    }
                    if (this.field1429 == 9) {
                        this.field1627.method198(this.field1486, 102, 0);
                    }
                    if (this.field1429 == 10) {
                        this.field1628.method198(this.field1486, 130, 1);
                    }
                    if (this.field1429 == 11) {
                        this.field1630.method198(this.field1486, 173, 0);
                    }
                    if (this.field1429 == 12) {
                        this.field1630.method198(this.field1486, 201, 0);
                    }
                    if (this.field1429 == 13) {
                        this.field1629.method198(this.field1486, 229, 0);
                    }
                }
                if (this.field1370[8] != -1 && (this.field1589 != 8 || field1218 % 20 < 10)) {
                    this.field1368[7].method198(this.field1486, 74, 2);
                }
                if (this.field1370[9] != -1 && (this.field1589 != 9 || field1218 % 20 < 10)) {
                    this.field1368[8].method198(this.field1486, 102, 3);
                }
                if (this.field1370[10] != -1 && (this.field1589 != 10 || field1218 % 20 < 10)) {
                    this.field1368[9].method198(this.field1486, 137, 4);
                }
                if (this.field1370[11] != -1 && (this.field1589 != 11 || field1218 % 20 < 10)) {
                    this.field1368[10].method198(this.field1486, 174, 2);
                }
                if (this.field1370[12] != -1 && (this.field1589 != 12 || field1218 % 20 < 10)) {
                    this.field1368[11].method198(this.field1486, 201, 2);
                }
                if (this.field1370[13] != -1 && (this.field1589 != 13 || field1218 % 20 < 10)) {
                    this.field1368[12].method198(this.field1486, 226, 2);
                }
            }
            this.field1407.method254(496, super.field14, (byte) 76, 466);
            this.field1280.method253(field1376);
        }
        if (this.field1557) {
            this.field1557 = false;
            this.field1406.method253(field1376);
            this.field1594.method198(this.field1486, 0, 0);
            this.field1492.method201(0, 55, 28, "Public chat", 16777215, true);
            if (this.field1383 == 0) {
                this.field1492.method201(0, 55, 41, "On", 65280, true);
            }
            if (this.field1383 == 1) {
                this.field1492.method201(0, 55, 41, "Friends", 16776960, true);
            }
            if (this.field1383 == 2) {
                this.field1492.method201(0, 55, 41, "Off", 16711680, true);
            }
            if (this.field1383 == 3) {
                this.field1492.method201(0, 55, 41, "Hide", 65535, true);
            }
            this.field1492.method201(0, 184, 28, "Private chat", 16777215, true);
            if (this.field1388 == 0) {
                this.field1492.method201(0, 184, 41, "On", 65280, true);
            }
            if (this.field1388 == 1) {
                this.field1492.method201(0, 184, 41, "Friends", 16776960, true);
            }
            if (this.field1388 == 2) {
                this.field1492.method201(0, 184, 41, "Off", 16711680, true);
            }
            this.field1492.method201(0, 324, 28, "Trade/duel", 16777215, true);
            if (this.field1221 == 0) {
                this.field1492.method201(0, 324, 41, "On", 65280, true);
            }
            if (this.field1221 == 1) {
                this.field1492.method201(0, 324, 41, "Friends", 16776960, true);
            }
            if (this.field1221 == 2) {
                this.field1492.method201(0, 324, 41, "Off", 16711680, true);
            }
            this.field1492.method201(0, 458, 33, "Report abuse", 16777215, true);
            this.field1406.method254(0, super.field14, (byte) 76, 453);
            this.field1280.method253(field1376);
        }
        this.field1391 = 0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILlb;)V")
    private final void method551(int arg0, int arg1, Packet arg2) {
        this.field1480 = 0;
        this.field1539 = 0;
        int var4 = arg0 + arg1;
        this.method474(var4, this.field1341, arg2);
        this.method433(-196, arg2, var4);
        this.method507(var4, (byte) 4, arg2);
        for (int var5 = 0; var5 < this.field1480; ++var5) {
            int var7 = this.field1481[var5];
            if (field1218 != this.field1675[var7].field442) {
                this.field1675[var7].field453 = null;
                this.field1675[var7] = null;
            }
        }
        if (arg2.field709 != var4) {
            signlink.reporterror(this.field1563 + " size mismatch in getnpcpos - pos:" + arg2.field709 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1676; ++var6) {
                if (this.field1675[this.field1677[var6]] == null) {
                    signlink.reporterror(this.field1563 + " null entry in npc list - pos:" + var6 + " size:" + this.field1676);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "S", descriptor = "(I)V")
    private final void method552(int arg0) {
        if (arg0 != 42825) {
            this.field1232 = null;
        }
        if (this.field1545 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1644.method243(); var2 != null; var2 = (LocSpawned) this.field1644.method245(this.field1374)) {
                if (var2.field738 > 0) {
                    --var2.field738;
                }
                if (var2.field738 == 0) {
                    if (var2.field731 < 0 || World.method30(var2.field731, var2.field733, 469)) {
                        this.method452(var2.field732, var2.field728, var2.field729, var2.field733, false, var2.field731, var2.field727, var2.field730);
                        var2.method106();
                    }
                } else {
                    if (var2.field737 > 0) {
                        --var2.field737;
                    }
                    if (var2.field737 == 0 && var2.field729 >= 1 && var2.field730 >= 1 && var2.field729 <= 102 && var2.field730 <= 102 && (var2.field734 < 0 || World.method30(var2.field734, var2.field736, 469))) {
                        this.method452(var2.field735, var2.field728, var2.field729, var2.field736, false, var2.field734, var2.field727, var2.field730);
                        var2.field737 = -1;
                        if (var2.field734 == var2.field731 && var2.field731 == -1) {
                            var2.method106();
                        } else if (var2.field734 == var2.field731 && var2.field735 == var2.field732 && var2.field736 == var2.field733) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;II)V")
    private final void method553(Packet arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field710 + 10 < arg1 * 8) {
                int var4 = arg0.method235(11, (byte) -96);
                if (var4 != 2047) {
                    if (this.field1536[var4] == null) {
                        this.field1536[var4] = new PlayerEntity();
                        if (this.field1541[var4] != null) {
                            this.field1536[var4].method116(this.field1541[var4], this.field1217);
                        }
                    }
                    this.field1538[this.field1537++] = var4;
                    PlayerEntity var5 = this.field1536[var4];
                    var5.field442 = field1218;
                    int var6 = arg0.method235(5, (byte) -96);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method235(5, (byte) -96);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method235(1, (byte) -96);
                    var5.method110(field1668.field447[0] + var6, var8 == 1, false, field1668.field448[0] + var7);
                    int var9 = arg0.method235(1, (byte) -96);
                    if (var9 == 1) {
                        this.field1540[this.field1539++] = var4;
                    }
                    continue;
                }
            }
            arg0.method236(941);
            int var10 = 7 / arg2;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIB)Z")
    public final boolean method554(byte[] arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            this.field1222 = this.field1360.method290();
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "T", descriptor = "(I)V")
    public final void method555(int arg0) {
        int var2 = 5;
        this.field1301[8] = 0;
        this.field1635 += arg0;
        int var3 = 0;
        while (this.field1301[8] == 0) {
            String var4 = "Unknown problem";
            this.method13("Connecting to web server", 20, 7);
            try {
                DataInputStream var5 = this.method492("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 274);
                Packet var6 = new Packet(new byte[40], (byte) 1);
                var5.readFully(var6.field708, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1301[var7] = var6.method229();
                }
                int var8 = var6.method229();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1301[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1301[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1301[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1301[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1301[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1301[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13("Game updated - please reload page", 10, 7);
                        var11 = 10;
                    } else {
                        this.method13(var4 + " - Will retry in " + var11 + " secs.", 10, 7);
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
                this.field1469 = !this.field1469;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1225[var1] = var0 - 1;
            var0 += var0;
        }
        field1317 = -303;
        field1356 = 2;
        field1376 = true;
        field1428 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1466 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1518 = 7;
        field1550 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1640 = -39788;
        field1652 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1652[var3] = var2 / 4;
        }
        field1653 = 10;
        field1655 = true;
        field1657 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
