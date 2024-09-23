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

    @OriginalMember(owner = "client", name = "K", descriptor = "[I")
    private int[] field1211 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1213 = -1;

    @OriginalMember(owner = "client", name = "U", descriptor = "[J")
    private long[] field1221 = new long[200];

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1223 = -1;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private final int[] field1224 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "mb", descriptor = "[[I")
    private int[][] field1239 = new int[104][104];

    @OriginalMember(owner = "client", name = "nb", descriptor = "B")
    private byte field1240 = 2;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1246 = 128;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1250 = new int[256];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Z")
    private boolean field1253 = false;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field1254 = new int[Stats.field1147];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field1260 = false;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Lob;")
    private LinkList field1265 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private boolean field1266 = false;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private boolean field1267 = false;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[I")
    private int[] field1269 = new int[100];

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Ljava/lang/String;")
    private String[] field1270 = new String[100];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[Ljava/lang/String;")
    private String[] field1271 = new String[100];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field1273 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field1274 = new int[33];

    @OriginalMember(owner = "client", name = "bc", descriptor = "[Ljc;")
    private CollisionMap[] field1280 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    private boolean field1281 = true;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1282 = 862;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field1283 = new int[50];

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field1284 = true;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[Ljava/lang/String;")
    private String[] field1285 = new String[200];

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field1286 = new int[Stats.field1147];

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field1287 = true;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1293 = 5;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Ljava/lang/String;")
    private String field1294 = "";

    @OriginalMember(owner = "client", name = "qc", descriptor = "Ljava/lang/String;")
    private String field1295 = "";

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1299 = 3353893;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1305 = -217;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[I")
    private int[] field1306 = new int[151];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[I")
    private int[] field1307 = new int[Stats.field1147];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[I")
    private int[] field1308 = new int[50];

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1310 = 797;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Lob;")
    private LinkList field1313 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Ljava/lang/String;")
    private String field1318 = "";

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1320 = 4697;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Z")
    private boolean field1321 = true;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1323 = -1;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Llb;")
    private Packet field1324 = Packet.method212(1, (byte) 5);

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[I")
    private int[] field1326 = new int[200];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field1329 = new int[4000];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private int[] field1330 = new int[4000];

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field1332 = new int[2000];

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field1334 = false;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private boolean field1336 = false;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1337 = new int[151];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[I")
    private int[] field1338 = new int[7];

    @OriginalMember(owner = "client", name = "id", descriptor = "B")
    private byte field1339 = 5;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1340 = 1016;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[[[Lob;")
    private LinkList[][][] field1341 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    private int[] field1346 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "td", descriptor = "Z")
    private boolean field1350 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[Ljava/lang/String;")
    private String[] field1353 = new String[5];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[Z")
    private boolean[] field1354 = new boolean[5];

    @OriginalMember(owner = "client", name = "yd", descriptor = "[J")
    private long[] field1355 = new long[100];

    @OriginalMember(owner = "client", name = "zd", descriptor = "[Lib;")
    private Pix32[] field1356 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field1357 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[[I")
    private int[][] field1363 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[Lvb;")
    public FileStream[] field1378 = new FileStream[5];

    @OriginalMember(owner = "client", name = "fe", descriptor = "Llb;")
    private Packet field1388 = Packet.method212(1, (byte) 5);

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1390 = 2;

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private int[] field1392 = new int[5];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1397 = 475;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1399 = new int[5];

    @OriginalMember(owner = "client", name = "re", descriptor = "[Lib;")
    private Pix32[] field1400 = new Pix32[100];

    @OriginalMember(owner = "client", name = "se", descriptor = "B")
    private byte field1401 = -25;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1410 = -1;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1411 = -1;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private final int field1413 = 100;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field1414 = new int[100];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field1431 = new int[5];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Ljava/lang/String;")
    private String field1432 = "";

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1434 = 1;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1437 = -29945;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1438 = 100;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    private boolean field1439 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[I")
    private int[] field1446 = new int[33];

    @OriginalMember(owner = "client", name = "nf", descriptor = "Ljava/lang/String;")
    private String field1447 = "";

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1448 = 539;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[I")
    public int[] field1456 = new int[1000];

    @OriginalMember(owner = "client", name = "yf", descriptor = "Z")
    private boolean field1458 = false;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1465 = -1;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1467 = 50;

    @OriginalMember(owner = "client", name = "If", descriptor = "[I")
    private int[] field1468 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field1469 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    private int[] field1470 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1471 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1472 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field1473 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field1474 = new int[this.field1467];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[Ljava/lang/String;")
    private String[] field1475 = new String[this.field1467];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Lob;")
    private LinkList field1479 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1481 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1482 = 3;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client", name = "ag", descriptor = "B")
    private byte field1486 = 6;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[B")
    private byte[] field1487 = new byte[16384];

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1488 = -1;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1489 = -1;

    @OriginalMember(owner = "client", name = "eg", descriptor = "B")
    private byte field1490 = -50;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[Ljava/lang/String;")
    private String[] field1499 = new String[500];

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    private boolean field1505 = false;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field1506 = new int[2000];

    @OriginalMember(owner = "client", name = "vg", descriptor = "Z")
    private boolean field1507 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    public boolean field1512 = false;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1513 = 604;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Z")
    private boolean field1514 = false;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Ljava/lang/String;")
    private String field1515 = "";

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Ljava/lang/String;")
    private String field1516 = "";

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1518 = 2301979;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Z")
    private boolean field1522 = false;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1523 = 78;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[Lib;")
    private Pix32[] field1528 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "B")
    private byte field1529 = -75;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[Lib;")
    private Pix32[] field1532 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1534 = -1;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Llb;")
    private Packet field1535 = Packet.method212(1, (byte) 5);

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field1536 = true;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[Lib;")
    private Pix32[] field1537 = new Pix32[20];

    @OriginalMember(owner = "client", name = "eh", descriptor = "Z")
    private boolean field1542 = false;

    @OriginalMember(owner = "client", name = "jh", descriptor = "[Lz;")
    private NpcEntity[] field1547 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "lh", descriptor = "[I")
    public int[] field1549 = new int[16384];

    @OriginalMember(owner = "client", name = "mh", descriptor = "Ljava/lang/String;")
    private String field1550 = "";

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field1557 = new int[9];

    @OriginalMember(owner = "client", name = "wh", descriptor = "Z")
    private boolean field1560 = false;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1562 = new int[500];

    @OriginalMember(owner = "client", name = "zh", descriptor = "[I")
    private int[] field1563 = new int[500];

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1564 = new int[500];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field1565 = new int[500];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field1566 = true;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1568 = 2;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1569 = -1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[Ljb;")
    private Pix8[] field1585 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[Z")
    private boolean[] field1588 = new boolean[5];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1589 = 7759444;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1591 = 1;

    @OriginalMember(owner = "client", name = "di", descriptor = "Z")
    private boolean field1593 = false;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1594 = -1;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1595 = 5063219;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    private String field1602 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field1604 = new int[1000];

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field1605 = new int[1000];

    @OriginalMember(owner = "client", name = "ri", descriptor = "Ld;")
    private Component field1607 = new Component();

    @OriginalMember(owner = "client", name = "si", descriptor = "Z")
    private boolean field1608 = false;

    @OriginalMember(owner = "client", name = "vi", descriptor = "B")
    private byte field1611 = 5;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    public boolean field1616 = true;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field1617 = new int[5];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[Ljb;")
    private Pix8[] field1618 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Z")
    private boolean field1620 = false;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[[I")
    private int[][] field1621 = new int[104][104];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "Z")
    private boolean field1622 = false;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1625 = 978;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1629 = 2;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[Ljb;")
    private Pix8[] field1631 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1632 = new CRC32();

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1640 = -1;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1641 = 2048;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1642 = 2047;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[Lab;")
    private PlayerEntity[] field1643 = new PlayerEntity[this.field1641];

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    public int[] field1645 = new int[this.field1641];

    @OriginalMember(owner = "client", name = "fj", descriptor = "[I")
    private int[] field1647 = new int[this.field1641];

    @OriginalMember(owner = "client", name = "gj", descriptor = "[Llb;")
    private Packet[] field1648 = new Packet[this.field1641];

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field1655 = new int[5];

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Z")
    private boolean field1660 = false;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Z")
    private boolean field1664 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private int[] field1665 = new int[50];

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    public static final int[] field1216 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "rb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1244 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private static int field1319 = 946;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Ljava/lang/String;")
    private static String field1322 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    private static int[] field1369 = new int[99];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private static int field1461;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private static boolean field1463;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private static int[] field1498;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[[I")
    public static final int[][] field1538;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private static boolean field1539;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1630;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private static int field1231;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private static int field1272;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private static int field1279;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private static int field1333;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private static int field1335;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private static int field1364;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private static int field1376;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field1387;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private static int field1445;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private static int field1459;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private static int field1476;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private static int field1477;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private static int field1496;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private static int field1504;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private static int field1524;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private static int field1592;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private static int field1626;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1661;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private static int field1666;

    @OriginalMember(owner = "client", name = "De", descriptor = "J")
    private long field1412;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "J")
    private long field1519;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "J")
    public long field1584;

    @OriginalMember(owner = "client", name = "Si", descriptor = "J")
    private long field1634;

    @OriginalMember(owner = "client", name = "qj", descriptor = "J")
    private long field1658;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Le;")
    private ClientStream field1573;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lwb;")
    private Isaac field1478;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Lxb;")
    private Jagfile field1635;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Lfc;")
    public MouseTracking field1430;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lub;")
    private OnDemand field1583;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Lib;")
    private Pix32 field1217;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Lib;")
    private Pix32 field1251;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Lib;")
    private Pix32 field1252;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lib;")
    private Pix32 field1351;

    @OriginalMember(owner = "client", name = "af", descriptor = "Lib;")
    private Pix32 field1435;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Lib;")
    private Pix32 field1436;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lib;")
    private Pix32 field1525;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Lib;")
    private Pix32 field1526;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Lib;")
    private Pix32 field1543;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Lib;")
    private Pix32 field1544;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Lib;")
    private Pix32 field1545;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Lib;")
    private Pix32 field1546;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Lib;")
    private Pix32 field1553;

    @OriginalMember(owner = "client", name = "R", descriptor = "Ljb;")
    private Pix8 field1218;

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljb;")
    private Pix8 field1219;

    @OriginalMember(owner = "client", name = "T", descriptor = "Ljb;")
    private Pix8 field1220;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Ljb;")
    private Pix8 field1300;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Ljb;")
    private Pix8 field1301;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Ljb;")
    private Pix8 field1302;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljb;")
    private Pix8 field1303;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljb;")
    private Pix8 field1304;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Ljb;")
    private Pix8 field1361;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Ljb;")
    private Pix8 field1362;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Ljb;")
    private Pix8 field1570;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Ljb;")
    private Pix8 field1571;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Ljb;")
    private Pix8 field1572;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Ljb;")
    private Pix8 field1597;

    @OriginalMember(owner = "client", name = "ii", descriptor = "Ljb;")
    private Pix8 field1598;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Ljb;")
    private Pix8 field1599;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Ljb;")
    private Pix8 field1600;

    @OriginalMember(owner = "client", name = "li", descriptor = "Ljb;")
    private Pix8 field1601;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "Ljb;")
    private Pix8 field1623;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljb;")
    private Pix8 field1624;

    @OriginalMember(owner = "client", name = "te", descriptor = "Lkb;")
    private PixFont field1402;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Lkb;")
    private PixFont field1403;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Lkb;")
    private PixFont field1404;

    @OriginalMember(owner = "client", name = "we", descriptor = "Lkb;")
    private PixFont field1405;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lqb;")
    private PixMap field1365;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Lqb;")
    private PixMap field1366;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Lqb;")
    private PixMap field1367;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Lqb;")
    private PixMap field1368;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Lqb;")
    private PixMap field1419;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Lqb;")
    private PixMap field1420;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Lqb;")
    private PixMap field1421;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Lqb;")
    private PixMap field1422;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lqb;")
    private PixMap field1423;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lqb;")
    private PixMap field1424;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Lqb;")
    private PixMap field1425;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Lqb;")
    private PixMap field1426;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Lqb;")
    private PixMap field1427;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Lqb;")
    private PixMap field1554;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Lqb;")
    private PixMap field1555;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Lqb;")
    private PixMap field1556;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Lqb;")
    private PixMap field1574;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Lqb;")
    private PixMap field1575;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Lqb;")
    private PixMap field1576;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Lqb;")
    private PixMap field1577;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Lqb;")
    private PixMap field1578;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lqb;")
    private PixMap field1579;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Lqb;")
    private PixMap field1580;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Lqb;")
    private PixMap field1581;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Lqb;")
    private PixMap field1582;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Lab;")
    public static PlayerEntity field1311;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Lr;")
    private World3D field1314;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Ljava/lang/String;")
    public String field1229;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Ljava/lang/String;")
    public String field1259;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Ljava/lang/String;")
    private String field1609;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Ljava/lang/String;")
    private String field1614;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Ljava/net/Socket;")
    private Socket field1359;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Z")
    public static boolean field1243;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private static boolean field1428;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private static boolean field1464;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Z")
    private static boolean field1596;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    public static boolean field1667;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1233;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field1276;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field1277;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1342;

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    private int[] field1344;

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field1345;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field1379;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field1380;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field1637;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    private int[] field1638;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field1639;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[Ljb;")
    private Pix8[] field1659;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[[B")
    private byte[][] field1533;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[[B")
    private byte[][] field1663;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[[[B")
    private byte[][][] field1558;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[[[I")
    private int[][][] field1454;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILd;)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3, Component arg4) {
        if (arg4.field77 == 0 && arg4.field92 != null) {
            if (!arg4.field91 || this.field1418 == arg4.field75 || this.field1661 == arg4.field75 || this.field1444 == arg4.field75) {
                int var6 = Pix2D.field619;
                int var7 = Pix2D.field617;
                int var8 = Pix2D.field620;
                int var9 = Pix2D.field618;
                Pix2D.method153(0, arg2, arg4.field80 + arg2, arg3, arg4.field81 + arg3);
                int var10 = arg4.field92.length;
                this.field1234 += arg0;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field93[var11] + arg2;
                    int var13 = arg4.field94[var11] + arg3 - arg1;
                    Component var14 = Component.field70[arg4.field92[var11]];
                    int var15 = var14.field83 + var12;
                    int var16 = var14.field84 + var13;
                    if (var14.field79 > 0) {
                        this.method497(field1596, var14);
                    }
                    if (var14.field77 == 0) {
                        if (var14.field90 > var14.field89 - var14.field81) {
                            var14.field90 = var14.field89 - var14.field81;
                        }
                        if (var14.field90 < 0) {
                            var14.field90 = 0;
                        }
                        this.method422(0, var14.field90, var15, var16, var14);
                        if (var14.field89 > var14.field81) {
                            this.method425(var14.field90, 161, var14.field80 + var15, var14.field81, var14.field89, var16);
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
                                                var30.method185(var21, var20, 0);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field71[var17] - 1;
                                        if (var20 > Pix2D.field619 - 32 && var20 < Pix2D.field620 && var21 > Pix2D.field617 - 32 && var21 < Pix2D.field618 || this.field1651 != 0 && this.field1650 == var17) {
                                            int var25 = 0;
                                            if (this.field1255 == 1 && this.field1256 == var17 && this.field1257 == var14.field75) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method347(var24, var25, 4302, var14.field72[var17]);
                                            if (var26 != null) {
                                                if (this.field1651 != 0 && this.field1650 == var17 && this.field1649 == var14.field75) {
                                                    var22 = super.field22 - this.field1652;
                                                    var23 = super.field23 - this.field1653;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1619 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method187(var20 + var22, 128, var21 + var23, (byte) -113);
                                                    if (var21 + var23 < Pix2D.field617 && arg4.field90 > 0) {
                                                        int var27 = (Pix2D.field617 - var21 - var23) * this.field1222 / 3;
                                                        if (var27 > this.field1222 * 10) {
                                                            var27 = this.field1222 * 10;
                                                        }
                                                        if (var27 > arg4.field90) {
                                                            var27 = arg4.field90;
                                                        }
                                                        arg4.field90 -= var27;
                                                        this.field1653 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field618 && arg4.field90 < arg4.field89 - arg4.field81) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field618) * this.field1222 / 3;
                                                        if (var28 > this.field1222 * 10) {
                                                            var28 = this.field1222 * 10;
                                                        }
                                                        if (var28 > arg4.field89 - arg4.field81 - arg4.field90) {
                                                            var28 = arg4.field89 - arg4.field81 - arg4.field90;
                                                        }
                                                        arg4.field90 += var28;
                                                        this.field1653 -= var28;
                                                    }
                                                } else if (this.field1511 != 0 && this.field1510 == var17 && this.field1509 == var14.field75) {
                                                    var26.method187(var20, 128, var21, (byte) -113);
                                                } else {
                                                    var26.method185(var21, var20, 0);
                                                }
                                                if (var26.field663 == 33 || var14.field72[var17] != 1) {
                                                    int var29 = var14.field72[var17];
                                                    this.field1402.method203(var20 + 1 + var22, 474, 0, method494(3, var29), var21 + 10 + var23);
                                                    this.field1402.method203(var20 + var22, 474, 16776960, method494(3, var29), var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field77 == 3) {
                            boolean var31 = false;
                            if (this.field1444 == var14.field75 || this.field1661 == var14.field75 || this.field1418 == var14.field75) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method438(110, var14)) {
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
                                    Pix2D.method156(var32, var14.field80, 0, var16, var14.field81, var15);
                                } else {
                                    Pix2D.method157(var14.field80, -17527, var14.field81, var15, var16, var32);
                                }
                            } else if (var14.field107) {
                                Pix2D.method155(var14.field80, var32, 256 - (var14.field82 & 255), var15, (byte) 42, var16, var14.field81);
                            } else {
                                Pix2D.method158(256 - (var14.field82 & 255), var15, 1, var14.field81, var32, var16, var14.field80);
                            }
                        } else if (var14.field77 == 4) {
                            PixFont var33 = var14.field110;
                            String var34 = var14.field111;
                            boolean var35 = false;
                            if (this.field1444 == var14.field75 || this.field1661 == var14.field75 || this.field1418 == var14.field75) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method438(110, var14)) {
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
                            if (var14.field78 == 6 && this.field1260) {
                                var34 = "Please wait...";
                                var36 = var14.field113;
                            }
                            if (Pix2D.field615 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field685 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method511(0, this.method475(true, var14, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method511(0, this.method475(true, var14, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method511(0, this.method475(true, var14, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method511(0, this.method475(true, var14, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method511(0, this.method475(true, var14, 0)) + var34.substring(var38 + 2);
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
                                    var33.method201(var44, var37, var36, 0, var14.field109, var14.field80 / 2 + var15);
                                } else {
                                    var33.method205(var44, var37, 0, var36, var15, var14.field109);
                                }
                                var37 += var33.field685;
                            }
                        } else if (var14.field77 == 5) {
                            Pix32 var45;
                            if (this.method438(110, var14)) {
                                var45 = var14.field118;
                            } else {
                                var45 = var14.field117;
                            }
                            if (var45 != null) {
                                var45.method185(var16, var15, 0);
                            }
                        } else if (var14.field77 == 6) {
                            int var46 = Pix3D.field634;
                            int var47 = Pix3D.field635;
                            Pix3D.field634 = var14.field80 / 2 + var15;
                            Pix3D.field635 = var14.field81 / 2 + var16;
                            int var48 = Pix3D.field638[var14.field126] * var14.field125 >> 16;
                            int var49 = Pix3D.field639[var14.field126] * var14.field125 >> 16;
                            boolean var50 = this.method438(110, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field124;
                            } else {
                                var51 = var14.field123;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, var50, 0, -1);
                            } else {
                                SeqType var53 = SeqType.field1131[var51];
                                var52 = var14.method34(var53.field1133[var14.field73], var50, 0, var53.field1134[var14.field73]);
                            }
                            if (var52 != null) {
                                var52.method145(0, var14.field127, 0, var14.field126, 0, var48, var49);
                            }
                            Pix3D.field634 = var46;
                            Pix3D.field635 = var47;
                        } else if (var14.field77 == 7) {
                            PixFont var54 = var14.field110;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field81; ++var56) {
                                for (int var57 = 0; var57 < var14.field80; ++var57) {
                                    if (var14.field71[var55] > 0) {
                                        ObjType var58 = ObjType.method341(var14.field71[var55] - 1);
                                        String var59 = var58.field1040;
                                        if (var58.field1051 || var14.field72[var55] != 1) {
                                            var59 = var59 + " x" + method435(1, var14.field72[var55]);
                                        }
                                        int var60 = (var14.field101 + 115) * var57 + var15;
                                        int var61 = (var14.field102 + 12) * var56 + var16;
                                        if (var14.field108) {
                                            var54.method201(var59, var61, var14.field113, 0, var14.field109, var14.field80 / 2 + var60);
                                        } else {
                                            var54.method205(var59, var61, 0, var14.field113, var60, var14.field109);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method153(0, var6, var8, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1505) {
            this.method452(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method423(int arg0) {
        LocType.field983.method103();
        LocType.field984.method103();
        NpcType.field1027.method103();
        ObjType.field1077.method103();
        ObjType.field1078.method103();
        PlayerEntity.field478.method103();
        int var2 = 89 / arg0;
        SpotAnimType.field1165.method103();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (arg0 != 47692) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field28 == 1) {
            int var3 = super.field29 - 25 - 550;
            int var4 = super.field30 - 5 - 4;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                var4 -= 75;
                int var5 = this.field1628 + this.field1247 & 2047;
                int var6 = Pix3D.field638[var5];
                int var7 = Pix3D.field639[var5];
                int var8 = (this.field1433 + 256) * var6 >> 8;
                int var9 = (this.field1433 + 256) * var7 >> 8;
                int var10 = var3 * var9 + var4 * var8 >> 11;
                int var11 = var4 * var9 - var3 * var8 >> 11;
                int var12 = field1311.field393 + var10 >> 7;
                int var13 = field1311.field394 - var11 >> 7;
                boolean var14 = this.method429(var13, 1, 1, field1311.field444[0], 0, true, var12, 0, field1311.field443[0], 0, 0, 0);
                if (var14) {
                    this.field1324.method214(var3);
                    this.field1324.method214(var4);
                    this.field1324.method215(this.field1247);
                    this.field1324.method214(57);
                    this.field1324.method214(this.field1628);
                    this.field1324.method214(this.field1433);
                    this.field1324.method214(89);
                    this.field1324.method215(field1311.field393);
                    this.field1324.method215(field1311.field394);
                    this.field1324.method214(this.field1654);
                    this.field1324.method214(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1623.method198(arg5, arg2, 0);
        this.field1624.method198(arg3 + arg5 - 16, arg2, 0);
        Pix2D.method156(this.field1518, 16, 0, arg5 + 16, arg3 - 32, arg2);
        int var7 = (arg3 - 32) * arg3 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg0 / (arg4 - arg3);
        Pix2D.method156(this.field1595, 16, 0, arg5 + 16 + var8, var7, arg2);
        Pix2D.method161(var7, arg5 + 16 + var8, this.field1240, arg2, this.field1589);
        Pix2D.method161(var7, arg5 + 16 + var8, this.field1240, arg2 + 1, this.field1589);
        Pix2D.method159(3, arg2, this.field1589, arg5 + 16 + var8, 16);
        Pix2D.method159(3, arg2, this.field1589, arg5 + 17 + var8, 16);
        Pix2D.method161(var7, arg5 + 16 + var8, this.field1240, arg2 + 15, this.field1299);
        Pix2D.method161(var7 - 1, arg5 + 17 + var8, this.field1240, arg2 + 14, this.field1299);
        Pix2D.method159(3, arg2, this.field1299, arg5 + 15 + var8 + var7, 16);
        int var9 = 91 / arg1;
        Pix2D.method159(3, arg2 + 1, this.field1299, arg5 + 14 + var8 + var7, 15);
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIII)V")
    public final void method426(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0) {
            int var8 = 2048 - arg4 & 2047;
            int var9 = 2048 - arg6 & 2047;
            int var10 = 0;
            int var11 = 0;
            int var12 = arg2;
            if (var8 != 0) {
                int var13 = Model.field595[var8];
                int var14 = Model.field596[var8];
                int var15 = var11 * var14 - arg2 * var13 >> 16;
                var12 = var11 * var13 + arg2 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field595[var9];
                int var17 = Model.field596[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1491 = arg1 - var10;
            this.field1492 = arg5 - var11;
            this.field1493 = arg3 - var12;
            this.field1494 = arg4;
            this.field1495 = arg6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method427(String arg0) throws IOException {
        if (!this.field1273) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1359 != null) {
                try {
                    this.field1359.close();
                } catch (Exception var4) {
                }
                this.field1359 = null;
            }
            this.field1359 = this.method530(43595);
            this.field1359.setSoTimeout(10000);
            InputStream var2 = this.field1359.getInputStream();
            OutputStream var3 = this.field1359.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)Z")
    public final boolean method428(byte[] arg0, int arg1, boolean arg2) {
        this.field1512 &= arg2;
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public final boolean method429(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1363[var15][var35] = 0;
                this.field1239[var15][var35] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg3;
        this.field1363[arg8][arg3] = 99;
        this.field1239[arg8][arg3] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1329[var18] = arg8;
        int var36 = var18 + 1;
        this.field1330[var18] = arg3;
        boolean var20 = false;
        int var21 = this.field1329.length;
        if (arg1 < 1 || arg1 > 1) {
            this.field1305 = 469;
        }
        int[][] var22 = this.field1280[this.field1636].field1090;
        while (var36 != var19) {
            var16 = this.field1329[var19];
            var17 = this.field1330[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field1280[this.field1636].method361(var16, arg6, arg4, 2, arg10 - 1, var17, arg0)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field1280[this.field1636].method362(var16, var17, arg4, arg0, false, arg10 - 1, arg6)) {
                    var20 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg11 != 0 && this.field1280[this.field1636].method363(arg7, var17, -103, arg0, arg6, arg9, var16, arg11)) {
                var20 = true;
                break;
            }
            int var34 = this.field1239[var16][var17] + 1;
            if (var16 > 0 && this.field1363[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1329[var36] = var16 - 1;
                this.field1330[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 - 1][var17] = 2;
                this.field1239[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1363[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1329[var36] = var16 + 1;
                this.field1330[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 + 1][var17] = 8;
                this.field1239[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1363[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1329[var36] = var16;
                this.field1330[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16][var17 - 1] = 1;
                this.field1239[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1363[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1329[var36] = var16;
                this.field1330[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16][var17 + 1] = 4;
                this.field1239[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1363[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1329[var36] = var16 - 1;
                this.field1330[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 - 1][var17 - 1] = 3;
                this.field1239[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1363[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1329[var36] = var16 + 1;
                this.field1330[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 + 1][var17 - 1] = 9;
                this.field1239[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1363[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1329[var36] = var16 - 1;
                this.field1330[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 - 1][var17 + 1] = 6;
                this.field1239[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1363[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1329[var36] = var16 + 1;
                this.field1330[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1363[var16 + 1][var17 + 1] = 12;
                this.field1239[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1654 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg0 - var24; var26 <= arg0 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1239[var25][var26] < var23) {
                                var23 = this.field1239[var25][var26];
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
        this.field1329[var27] = var16;
        int var37 = var27 + 1;
        this.field1330[var27] = var17;
        int var28;
        int var29 = var28 = this.field1363[var16][var17];
        while (arg8 != var16 || arg3 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1329[var37] = var16;
                this.field1330[var37++] = var17;
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
            var29 = this.field1363[var16][var17];
        }
        if (var37 <= 0) {
            if (arg2 == 1) {
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
            int var31 = this.field1329[var37];
            int var32 = this.field1330[var37];
            if (arg2 == 0) {
                this.field1324.method213(6, (byte) 48);
                this.field1324.method214(var30 + var30 + 3);
            }
            if (arg2 == 1) {
                this.field1324.method213(220, (byte) 48);
                this.field1324.method214(var30 + var30 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field1324.method213(127, (byte) 48);
                this.field1324.method214(var30 + var30 + 3);
            }
            if (super.field32[5] == 1) {
                this.field1324.method214(1);
            } else {
                this.field1324.method214(0);
            }
            this.field1324.method215(this.field1393 + var31);
            this.field1324.method215(this.field1394 + var32);
            this.field1551 = this.field1329[0];
            this.field1552 = this.field1330[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1324.method214(this.field1329[var37] - var31);
                this.field1324.method214(this.field1330[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method430(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
            try {
                if (this.field1573 != null) {
                    this.field1573.method38();
                }
            } catch (Exception var4) {
            }
            this.field1573 = null;
            this.field1512 = false;
            this.field1360 = 0;
            this.field1294 = "";
            this.field1295 = "";
            this.method423(627);
            this.field1314.method50(0);
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field1280[var3].method352(true);
            }
            System.gc();
            this.method543((byte) 0);
            this.field1484 = -1;
            this.field1559 = -1;
            this.field1497 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method431(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field1311.field393 + this.field1567;
            int var4 = field1311.field394 + this.field1389;
            if (this.field1261 - var3 < -500 || this.field1261 - var3 > 500 || this.field1262 - var4 < -500 || this.field1262 - var4 > 500) {
                this.field1261 = var3;
                this.field1262 = var4;
            }
            if (this.field1261 != var3) {
                this.field1261 += (var3 - this.field1261) / 16;
            }
            if (this.field1262 != var4) {
                this.field1262 += (var4 - this.field1262) / 16;
            }
            if (super.field32[1] == 1) {
                this.field1248 += (-24 - this.field1248) / 2;
            } else if (super.field32[2] == 1) {
                this.field1248 += (24 - this.field1248) / 2;
            } else {
                this.field1248 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field1249 += (12 - this.field1249) / 2;
            } else if (super.field32[4] == 1) {
                this.field1249 += (-12 - this.field1249) / 2;
            } else {
                this.field1249 /= 2;
            }
            this.field1247 = this.field1248 / 2 + this.field1247 & 2047;
            this.field1246 += this.field1249 / 2;
            if (this.field1246 < 128) {
                this.field1246 = 128;
            }
            if (this.field1246 > 383) {
                this.field1246 = 383;
            }
            int var5 = this.field1261 >> 7;
            int var6 = this.field1262 >> 7;
            int var7 = this.method525(this.field1636, this.field1261, (byte) -51, this.field1262);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field1636;
                        if (var11 < 3 && (this.field1558[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field1454[var11][var9][var10];
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
            if (var13 > this.field1633) {
                this.field1633 += (var13 - this.field1633) / 24;
            } else if (var13 < this.field1633) {
                this.field1633 += (var13 - this.field1633) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field1311.field393 + "," + field1311.field394 + "," + this.field1261 + "," + this.field1262 + "," + this.field1214 + "," + this.field1215 + "," + this.field1393 + "," + this.field1394);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public static final void method432(int arg0) {
        World3D.field281 = true;
        if (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        Pix3D.field629 = true;
        field1464 = true;
        World.field43 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        if (field1311.field393 >> 7 == this.field1551 && field1311.field394 >> 7 == this.field1552) {
            this.field1551 = 0;
            ++field1459;
            if (field1459 > 122) {
                field1459 = 0;
                this.field1324.method213(36, (byte) 48);
                this.field1324.method214(62);
            }
        }
        int var3 = this.field1644;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg1) {
                var5 = field1311;
                var6 = this.field1642 << 14;
            } else {
                var5 = this.field1643[this.field1645[var4]];
                var6 = this.field1645[var4] << 14;
            }
            if (var5 != null && var5.method113(-948)) {
                var5.field475 = false;
                if ((field1464 && this.field1644 > 50 || this.field1644 > 200) && !arg1 && var5.field418 == var5.field398) {
                    var5.field475 = true;
                }
                int var7 = var5.field393 >> 7;
                int var8 = var5.field394 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field470 != null && field1610 >= var5.field465 && field1610 < var5.field466) {
                        var5.field475 = false;
                        var5.field464 = this.method525(this.field1636, var5.field393, (byte) -51, var5.field394);
                        this.field1314.method62(var5.field393, var5.field474, var5, var6, -838, var5.field394, var5.field395, var5.field473, 60, var5.field464, var5.field471, this.field1636, var5.field472);
                    } else {
                        if ((var5.field393 & 127) == 64 && (var5.field394 & 127) == 64) {
                            if (this.field1621[var7][var8] == this.field1457) {
                                continue;
                            }
                            this.field1621[var7][var8] = this.field1457;
                        }
                        var5.field464 = this.method525(this.field1636, var5.field393, (byte) -51, var5.field394);
                        this.field1314.method61(var5.field395, var5.field394, var5.field396, var5.field393, true, var5.field464, var5, this.field1636, 60, var6);
                    }
                }
            }
        }
        if (arg0 != 92) {
            this.field1437 = 72;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method434(boolean arg0) {
        this.field1365.method253(-328);
        if (arg0) {
            this.field1341 = null;
        }
        Pix3D.field640 = this.field1638;
        this.field1218.method198(0, 0, 0);
        if (this.field1569 != -1) {
            this.method422(0, 0, 0, 0, Component.field70[this.field1569]);
        } else if (this.field1346[this.field1482] != -1) {
            this.method422(0, 0, 0, 0, Component.field70[this.field1346[this.field1482]]);
        }
        if (this.field1439 && this.field1371 == 1) {
            this.method547(false);
        }
        this.field1365.method254(553, 205, super.field14, -884);
        this.field1367.method253(-328);
        Pix3D.field640 = this.field1639;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String method435(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 < 1 || arg0 > 1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
            var2 = var2.substring(0, var4) + "," + var2.substring(var4);
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method436(Packet arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field703 + 10 < arg2 * 8) {
                int var4 = arg0.method235(0, 11);
                if (var4 != 2047) {
                    if (this.field1643[var4] == null) {
                        this.field1643[var4] = new PlayerEntity();
                        if (this.field1648[var4] != null) {
                            this.field1643[var4].method116((byte) 1, this.field1648[var4]);
                        }
                    }
                    this.field1645[this.field1644++] = var4;
                    PlayerEntity var5 = this.field1643[var4];
                    var5.field438 = field1610;
                    int var6 = arg0.method235(0, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method235(0, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method235(0, 1);
                    var5.method110(field1311.field443[0] + var6, var8 == 1, field1311.field444[0] + var7, -42455);
                    int var9 = arg0.method235(0, 1);
                    if (var9 == 1) {
                        this.field1647[this.field1646++] = var4;
                    }
                    continue;
                }
            }
            arg0.method236(-413);
            int var10 = 31 / arg1;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method437(byte arg0) {
        for (int var2 = 0; var2 < this.field1325; ++var2) {
            if (this.field1308[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1665[var2] == this.field1488 && this.field1283[var2] == this.field1223) {
                        if (!this.method490((byte) 2)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method314(false, this.field1665[var2], this.field1283[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field702 / 22) > (long) (this.field1606 / 22) + this.field1634) {
                            this.field1606 = var4.field702;
                            this.field1634 = System.currentTimeMillis();
                            if (this.method428(var4.field701, var4.field702, true)) {
                                this.field1488 = this.field1665[var2];
                                this.field1223 = this.field1283[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1308[var2] != -5) {
                    this.field1308[var2] = -5;
                } else {
                    --this.field1325;
                    for (int var6 = var2; var6 < this.field1325; ++var6) {
                        this.field1665[var6] = this.field1665[var6 + 1];
                        this.field1283[var6] = this.field1283[var6 + 1];
                        this.field1308[var6] = this.field1308[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1308[var2]--;
            }
        }
        if (arg0 != 107) {
            field1272 = this.field1478.method290();
        }
        if (this.field1497 > 0) {
            this.field1497 -= 20;
            if (this.field1497 < 0) {
                this.field1497 = 0;
            }
            if (this.field1497 == 0 && this.field1281 && !field1464) {
                this.field1559 = this.field1484;
                this.field1560 = false;
                this.field1583.method274(2, this.field1559);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method438(int arg0, Component arg1) {
        if (arg1.field86 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field86.length; ++var3) {
                int var4 = this.method475(true, arg1, var3);
                int var5 = arg1.field87[var3];
                if (arg1.field86[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field86[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field86[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 <= 0) {
                this.field1235 = this.field1388.method224();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method439(int arg0) {
        this.field1348 = 0;
        int var2 = (field1311.field393 >> 7) + this.field1393;
        int var3 = (field1311.field394 >> 7) + this.field1394;
        if (arg0 == 0) {
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field1348 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field1348 = 1;
            }
            if (this.field1348 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field1348 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (this.field1245 != 0) {
            int var2 = 0;
            if (this.field1398 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1271[var3] != null) {
                    int var4 = this.field1269[var3];
                    String var5 = this.field1270[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1278 == 0 || this.field1278 == 1 && this.method445(this.field1662, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field22 > 4 && super.field23 - 4 > var9 - 10 && super.field23 - 4 <= var9 + 3) {
                            int var10 = this.field1403.method202("From:  " + var5 + this.field1271[var3], true) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field22 < var10 + 4) {
                                if (this.field1561 >= 1) {
                                    this.field1499[this.field1268] = "Report abuse @whi@" + var5;
                                    this.field1564[this.field1268] = 2524;
                                    ++this.field1268;
                                }
                                this.field1499[this.field1268] = "Add ignore @whi@" + var5;
                                this.field1564[this.field1268] = 2047;
                                ++this.field1268;
                                this.field1499[this.field1268] = "Add friend @whi@" + var5;
                                this.field1564[this.field1268] = 2605;
                                ++this.field1268;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1278 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 45332) {
                this.field1324.method214(107);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;BI)V")
    private final void method441(Packet arg0, byte arg1, int arg2) {
        while (true) {
            if (arg0.field703 + 21 < arg2 * 8) {
                int var4 = arg0.method235(0, 14);
                if (var4 != 16383) {
                    if (this.field1547[var4] == null) {
                        this.field1547[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1547[var4];
                    this.field1549[this.field1548++] = var4;
                    var5.field438 = field1610;
                    var5.field449 = NpcType.method335(arg0.method235(0, 11));
                    var5.field397 = var5.field449.field1004;
                    var5.field441 = var5.field449.field1026;
                    var5.field400 = var5.field449.field1008;
                    var5.field401 = var5.field449.field1009;
                    var5.field402 = var5.field449.field1010;
                    var5.field403 = var5.field449.field1011;
                    var5.field398 = var5.field449.field1007;
                    int var6 = arg0.method235(0, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method235(0, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method110(field1311.field443[0] + var6, false, field1311.field444[0] + var7, -42455);
                    int var8 = arg0.method235(0, 1);
                    if (var8 == 1) {
                        this.field1647[this.field1646++] = var4;
                    }
                    continue;
                }
            }
            arg0.method236(-413);
            if (arg1 != 3) {
                this.field1324.method214(183);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method442(int arg0, Packet arg1, int arg2) {
        arg1.method234(this.field1625);
        int var4 = arg1.method235(0, 8);
        if (var4 < this.field1548) {
            for (int var5 = var4; var5 < this.field1548; ++var5) {
                this.field1456[this.field1455++] = this.field1549[var5];
            }
        }
        if (var4 > this.field1548) {
            signlink.reporterror(this.field1294 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1548 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field1549[var6];
                NpcEntity var9 = this.field1547[var8];
                int var10 = arg1.method235(0, 1);
                if (var10 == 0) {
                    this.field1549[this.field1548++] = var8;
                    var9.field438 = field1610;
                } else {
                    int var11 = arg1.method235(0, 2);
                    if (var11 == 0) {
                        this.field1549[this.field1548++] = var8;
                        var9.field438 = field1610;
                        this.field1647[this.field1646++] = var8;
                    } else if (var11 == 1) {
                        this.field1549[this.field1548++] = var8;
                        var9.field438 = field1610;
                        int var12 = arg1.method235(0, 3);
                        var9.method111(var12, 591, false);
                        int var13 = arg1.method235(0, 1);
                        if (var13 == 1) {
                            this.field1647[this.field1646++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1549[this.field1548++] = var8;
                        var9.field438 = field1610;
                        int var14 = arg1.method235(0, 3);
                        var9.method111(var14, 591, true);
                        int var15 = arg1.method235(0, 3);
                        var9.method111(var15, 591, true);
                        int var16 = arg1.method235(0, 1);
                        if (var16 == 1) {
                            this.field1647[this.field1646++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1456[this.field1455++] = var8;
                    }
                }
            }
            if (arg0 < 8 || arg0 > 8) {
                for (int var7 = 1; var7 > 0; ++var7) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method443(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1340 = this.field1478.method290();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILd;)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg2 != 33973) {
            this.field1235 = -1;
        }
        if (arg6.field77 == 0 && arg6.field92 != null && !arg6.field91) {
            if (arg5 >= arg4 && arg0 >= arg3 && arg5 <= arg6.field80 + arg4 && arg0 <= arg6.field81 + arg3) {
                int var8 = arg6.field92.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field93[var9] + arg4;
                    int var11 = arg6.field94[var9] + arg3 - arg1;
                    Component var12 = Component.field70[arg6.field92[var9]];
                    int var13 = var12.field83 + var10;
                    int var14 = var12.field84 + var11;
                    if ((var12.field88 >= 0 || var12.field115 != 0) && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                        if (var12.field88 >= 0) {
                            this.field1312 = var12.field88;
                        } else {
                            this.field1312 = var12.field75;
                        }
                    }
                    if (var12.field77 == 0) {
                        this.method444(arg0, var12.field90, 33973, var14, var13, arg5, var12);
                        if (var12.field89 > var12.field81) {
                            this.method473(var12, false, var12.field80 + var13, var12.field81, var14, var12.field89, true, arg5, arg0);
                        }
                    } else {
                        if (var12.field78 == 1 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            boolean var15 = false;
                            if (var12.field79 != 0) {
                                var15 = this.method512(var12, (byte) 78);
                            }
                            if (!var15) {
                                this.field1499[this.field1268] = var12.field131;
                                this.field1564[this.field1268] = 231;
                                this.field1563[this.field1268] = var12.field75;
                                ++this.field1268;
                            }
                        }
                        if (var12.field78 == 2 && this.field1226 == 0 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            String var16 = var12.field128;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1499[this.field1268] = var16 + " @gre@" + var12.field129;
                            this.field1564[this.field1268] = 274;
                            this.field1563[this.field1268] = var12.field75;
                            ++this.field1268;
                        }
                        if (var12.field78 == 3 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1499[this.field1268] = "Close";
                            this.field1564[this.field1268] = 737;
                            this.field1563[this.field1268] = var12.field75;
                            ++this.field1268;
                        }
                        if (var12.field78 == 4 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1499[this.field1268] = var12.field131;
                            this.field1564[this.field1268] = 435;
                            this.field1563[this.field1268] = var12.field75;
                            ++this.field1268;
                        }
                        if (var12.field78 == 5 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1499[this.field1268] = var12.field131;
                            this.field1564[this.field1268] = 225;
                            this.field1563[this.field1268] = var12.field75;
                            ++this.field1268;
                        }
                        if (var12.field78 == 6 && !this.field1260 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1499[this.field1268] = var12.field131;
                            this.field1564[this.field1268] = 997;
                            this.field1563[this.field1268] = var12.field75;
                            ++this.field1268;
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
                                    if (arg5 >= var20 && arg0 >= var21 && arg5 < var20 + 32 && arg0 < var21 + 32) {
                                        this.field1296 = var17;
                                        this.field1297 = var12.field75;
                                        if (var12.field71[var17] > 0) {
                                            ObjType var22 = ObjType.method341(var12.field71[var17] - 1);
                                            if (this.field1255 == 1 && var12.field98) {
                                                if (this.field1257 != var12.field75 || this.field1256 != var17) {
                                                    this.field1499[this.field1268] = "Use " + this.field1259 + " with @lre@" + var22.field1040;
                                                    this.field1564[this.field1268] = 398;
                                                    this.field1565[this.field1268] = var22.field1038;
                                                    this.field1562[this.field1268] = var17;
                                                    this.field1563[this.field1268] = var12.field75;
                                                    ++this.field1268;
                                                }
                                            } else if (this.field1226 == 1 && var12.field98) {
                                                if ((this.field1228 & 16) == 16) {
                                                    this.field1499[this.field1268] = this.field1229 + " @lre@" + var22.field1040;
                                                    this.field1564[this.field1268] = 563;
                                                    this.field1565[this.field1268] = var22.field1038;
                                                    this.field1562[this.field1268] = var17;
                                                    this.field1563[this.field1268] = var12.field75;
                                                    ++this.field1268;
                                                }
                                            } else {
                                                if (var12.field98) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1055 != null && var22.field1055[var23] != null) {
                                                            this.field1499[this.field1268] = var22.field1055[var23] + " @lre@" + var22.field1040;
                                                            if (var23 == 3) {
                                                                this.field1564[this.field1268] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1564[this.field1268] = 100;
                                                            }
                                                            this.field1565[this.field1268] = var22.field1038;
                                                            this.field1562[this.field1268] = var17;
                                                            this.field1563[this.field1268] = var12.field75;
                                                            ++this.field1268;
                                                        } else if (var23 == 4) {
                                                            this.field1499[this.field1268] = "Drop @lre@" + var22.field1040;
                                                            this.field1564[this.field1268] = 100;
                                                            this.field1565[this.field1268] = var22.field1038;
                                                            this.field1562[this.field1268] = var17;
                                                            this.field1563[this.field1268] = var12.field75;
                                                            ++this.field1268;
                                                        }
                                                    }
                                                }
                                                if (var12.field99) {
                                                    this.field1499[this.field1268] = "Use @lre@" + var22.field1040;
                                                    this.field1564[this.field1268] = 102;
                                                    this.field1565[this.field1268] = var22.field1038;
                                                    this.field1562[this.field1268] = var17;
                                                    this.field1563[this.field1268] = var12.field75;
                                                    ++this.field1268;
                                                }
                                                if (var12.field98 && var22.field1055 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1055[var24] != null) {
                                                            this.field1499[this.field1268] = var22.field1055[var24] + " @lre@" + var22.field1040;
                                                            if (var24 == 0) {
                                                                this.field1564[this.field1268] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1564[this.field1268] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1564[this.field1268] = 795;
                                                            }
                                                            this.field1565[this.field1268] = var22.field1038;
                                                            this.field1562[this.field1268] = var17;
                                                            this.field1563[this.field1268] = var12.field75;
                                                            ++this.field1268;
                                                        }
                                                    }
                                                }
                                                if (var12.field106 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field106[var25] != null) {
                                                            this.field1499[this.field1268] = var12.field106[var25] + " @lre@" + var22.field1040;
                                                            if (var25 == 0) {
                                                                this.field1564[this.field1268] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1564[this.field1268] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1564[this.field1268] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1564[this.field1268] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1564[this.field1268] = 354;
                                                            }
                                                            this.field1565[this.field1268] = var22.field1038;
                                                            this.field1562[this.field1268] = var17;
                                                            this.field1563[this.field1268] = var12.field75;
                                                            ++this.field1268;
                                                        }
                                                    }
                                                }
                                                this.field1499[this.field1268] = "Examine @lre@" + var22.field1040;
                                                this.field1564[this.field1268] = 1328;
                                                this.field1565[this.field1268] = var22.field1038;
                                                this.field1562[this.field1268] = var17;
                                                this.field1563[this.field1268] = var12.field75;
                                                ++this.field1268;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method445(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1415; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1285[var3])) {
                    return true;
                }
            }
            this.field1234 += arg0;
            return arg1.equalsIgnoreCase(field1311.field455);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;II)V")
    public final void method446(Packet arg0, int arg1, int arg2) {
        int var4 = 94 / arg1;
        if (arg2 != 70 && arg2 != 88) {
            if (arg2 == 30) {
                int var5 = arg0.method224();
                int var6 = (var5 >> 4 & 7) + this.field1315;
                int var7 = (var5 & 7) + this.field1316;
                int var8 = arg0.method224();
                int var9 = var8 >> 2;
                int var10 = var8 & 3;
                int var11 = this.field1224[var9];
                int var12 = arg0.method226();
                if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                    int var13 = this.field1454[this.field1636][var6][var7];
                    int var14 = this.field1454[this.field1636][var6 + 1][var7];
                    int var15 = this.field1454[this.field1636][var6 + 1][var7 + 1];
                    int var16 = this.field1454[this.field1636][var6][var7 + 1];
                    if (var11 == 0) {
                        Wall var17 = this.field1314.method72(var7, var6, this.field1636, 542);
                        if (var17 != null) {
                            int var18 = var17.field273 >> 14 & 32767;
                            if (var9 == 2) {
                                var17.field271 = new LocEntity(var18, 2, var14, (byte) 3, var12, var13, false, var10 + 4, var16, var15);
                                var17.field272 = new LocEntity(var18, 2, var14, (byte) 3, var12, var13, false, var10 + 1 & 3, var16, var15);
                            } else {
                                var17.field271 = new LocEntity(var18, var9, var14, (byte) 3, var12, var13, false, var10, var16, var15);
                            }
                        }
                    }
                    if (var11 == 1) {
                        Decor var19 = this.field1314.method73(this.field1636, var6, var7, (byte) 40);
                        if (var19 != null) {
                            var19.field164 = new LocEntity(var19.field165 >> 14 & 32767, 4, var14, (byte) 3, var12, var13, false, 0, var16, var15);
                        }
                    }
                    if (var11 == 2) {
                        Location var20 = this.field1314.method74(var6, var7, -699, this.field1636);
                        if (var9 == 11) {
                            var9 = 10;
                        }
                        if (var20 != null) {
                            var20.field256 = new LocEntity(var20.field264 >> 14 & 32767, var9, var14, (byte) 3, var12, var13, false, var10, var16, var15);
                        }
                    }
                    if (var11 == 3) {
                        GroundDecor var21 = this.field1314.method75(this.field1636, var7, var6, this.field1230);
                        if (var21 != null) {
                            var21.field195 = new LocEntity(var21.field196 >> 14 & 32767, 22, var14, (byte) 3, var12, var13, false, var10, var16, var15);
                        }
                    }
                }
            } else if (arg2 == 120) {
                int var22 = arg0.method224();
                int var23 = (var22 >> 4 & 7) + this.field1315;
                int var24 = (var22 & 7) + this.field1316;
                int var25 = arg0.method226();
                int var26 = arg0.method226();
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    ObjStackEntity var27 = new ObjStackEntity();
                    var27.field491 = var25;
                    var27.field492 = var26;
                    if (this.field1341[this.field1636][var23][var24] == null) {
                        this.field1341[this.field1636][var23][var24] = new LinkList((byte) 5);
                    }
                    this.field1341[this.field1636][var23][var24].method240(var27);
                    this.method491(var23, var24);
                }
            } else if (arg2 == 115) {
                int var28 = arg0.method224();
                int var29 = (var28 >> 4 & 7) + this.field1315;
                int var30 = (var28 & 7) + this.field1316;
                int var31 = arg0.method226();
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    LinkList var32 = this.field1341[this.field1636][var29][var30];
                    if (var32 != null) {
                        for (ObjStackEntity var33 = (ObjStackEntity) var32.method243(); var33 != null; var33 = (ObjStackEntity) var32.method245(30869)) {
                            if ((var31 & 32767) == var33.field491) {
                                var33.method106();
                                break;
                            }
                        }
                        if (var32.method243() == null) {
                            this.field1341[this.field1636][var29][var30] = null;
                        }
                        this.method491(var29, var30);
                    }
                }
            } else if (arg2 == 37) {
                int var34 = arg0.method224();
                int var35 = (var34 >> 4 & 7) + this.field1315;
                int var36 = (var34 & 7) + this.field1316;
                int var37 = var35 + arg0.method225();
                int var38 = var36 + arg0.method225();
                int var39 = arg0.method227();
                int var40 = arg0.method226();
                int var41 = arg0.method224() * 4;
                int var42 = arg0.method224() * 4;
                int var43 = arg0.method226();
                int var44 = arg0.method226();
                int var45 = arg0.method224();
                int var46 = arg0.method224();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    ProjectileEntity var51 = new ProjectileEntity(var48, var45, var42, var39, this.method525(this.field1636, var47, (byte) -51, var48) - var41, field1610 + var44, var40, var46, this.field1612, field1610 + var43, this.field1636, var47);
                    var51.method119(this.method525(this.field1636, var49, (byte) -51, var50) - var42, field1610 + var43, var50, var49, -126);
                    this.field1313.method240(var51);
                }
            } else if (arg2 == 114) {
                int var52 = arg0.method224();
                int var53 = (var52 >> 4 & 7) + this.field1315;
                int var54 = (var52 & 7) + this.field1316;
                int var55 = arg0.method226();
                int var56 = arg0.method224();
                int var57 = arg0.method226();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    SpotAnimEntity var60 = new SpotAnimEntity(var57, var58, this.method525(this.field1636, var58, (byte) -51, var59) - var56, this.field1636, field1610, var55, -954, var59);
                    this.field1479.method240(var60);
                }
            } else if (arg2 == 8) {
                int var61 = arg0.method224();
                int var62 = (var61 >> 4 & 7) + this.field1315;
                int var63 = (var61 & 7) + this.field1316;
                int var64 = arg0.method226();
                int var65 = arg0.method226();
                int var66 = arg0.method226();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && this.field1534 != var66) {
                    ObjStackEntity var67 = new ObjStackEntity();
                    var67.field491 = var64;
                    var67.field492 = var65;
                    if (this.field1341[this.field1636][var62][var63] == null) {
                        this.field1341[this.field1636][var62][var63] = new LinkList((byte) 5);
                    }
                    this.field1341[this.field1636][var62][var63].method240(var67);
                    this.method491(var62, var63);
                }
            } else {
                if (arg2 == 218) {
                    int var68 = arg0.method224();
                    int var69 = (var68 >> 4 & 7) + this.field1315;
                    int var70 = (var68 & 7) + this.field1316;
                    int var71 = arg0.method224();
                    int var72 = var71 >> 2;
                    int var73 = var71 & 3;
                    int var74 = this.field1224[var72];
                    int var75 = arg0.method226();
                    int var76 = arg0.method226();
                    int var77 = arg0.method226();
                    int var78 = arg0.method226();
                    byte var79 = arg0.method225();
                    byte var80 = arg0.method225();
                    byte var81 = arg0.method225();
                    byte var82 = arg0.method225();
                    PlayerEntity var83;
                    if (this.field1534 == var78) {
                        var83 = field1311;
                    } else {
                        var83 = this.field1643[var78];
                    }
                    if (var83 != null) {
                        LocType var84 = LocType.method325(var75);
                        int var85 = this.field1454[this.field1636][var69][var70];
                        int var86 = this.field1454[this.field1636][var69 + 1][var70];
                        int var87 = this.field1454[this.field1636][var69 + 1][var70 + 1];
                        int var88 = this.field1454[this.field1636][var69][var70 + 1];
                        Model var89 = var84.method331(var72, var73, var85, var86, var87, var88, -1);
                        if (var89 != null) {
                            this.method524(var77 + 1, 0, var76 + 1, 776, var69, 0, -1, var70, var74, this.field1636);
                            var83.field465 = field1610 + var76;
                            var83.field466 = field1610 + var77;
                            var83.field470 = var89;
                            int var90 = var84.field956;
                            int var91 = var84.field957;
                            if (var73 == 1 || var73 == 3) {
                                var90 = var84.field957;
                                var91 = var84.field956;
                            }
                            var83.field467 = var69 * 128 + var90 * 64;
                            var83.field469 = var70 * 128 + var91 * 64;
                            var83.field468 = this.method525(this.field1636, var83.field467, (byte) -51, var83.field469);
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
                            var83.field471 = var69 + var79;
                            var83.field473 = var69 + var81;
                            var83.field472 = var70 + var80;
                            var83.field474 = var70 + var82;
                        }
                    }
                }
                if (arg2 == 98) {
                    int var94 = arg0.method224();
                    int var95 = (var94 >> 4 & 7) + this.field1315;
                    int var96 = (var94 & 7) + this.field1316;
                    int var97 = arg0.method226();
                    int var98 = arg0.method226();
                    int var99 = arg0.method226();
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        LinkList var100 = this.field1341[this.field1636][var95][var96];
                        if (var100 != null) {
                            for (ObjStackEntity var101 = (ObjStackEntity) var100.method243(); var101 != null; var101 = (ObjStackEntity) var100.method245(30869)) {
                                if ((var97 & 32767) == var101.field491 && var101.field492 == var98) {
                                    var101.field492 = var99;
                                    break;
                                }
                            }
                            this.method491(var95, var96);
                        }
                    }
                }
            }
        } else {
            int var102 = arg0.method224();
            int var103 = (var102 >> 4 & 7) + this.field1315;
            int var104 = (var102 & 7) + this.field1316;
            int var105 = arg0.method224();
            int var106 = var105 >> 2;
            int var107 = var105 & 3;
            int var108 = this.field1224[var106];
            int var109;
            if (arg2 == 88) {
                var109 = -1;
            } else {
                var109 = arg0.method226();
            }
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                this.method524(-1, var106, 0, 776, var103, var107, var109, var104, var108, this.field1636);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method447(long arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field1415; ++var4) {
                    if (this.field1221[var4] == arg0) {
                        --this.field1415;
                        this.field1253 = true;
                        for (int var5 = var4; var5 < this.field1415; ++var5) {
                            this.field1285[var5] = this.field1285[var5 + 1];
                            this.field1326[var5] = this.field1326[var5 + 1];
                            this.field1221[var5] = this.field1221[var5 + 1];
                        }
                        this.field1324.method213(84, (byte) 48);
                        this.field1324.method220(arg0, true);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ZI)V")
    private final void method448(Packet arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1612 = this.field1478.method290();
        }
        this.field1455 = 0;
        this.field1646 = 0;
        this.method442(8, arg0, arg2);
        this.method441(arg0, (byte) 3, arg2);
        this.method470(arg0, this.field1282, arg2);
        for (int var4 = 0; var4 < this.field1455; ++var4) {
            int var6 = this.field1456[var4];
            if (field1610 != this.field1547[var6].field438) {
                this.field1547[var6].field449 = null;
                this.field1547[var6] = null;
            }
        }
        if (arg0.field702 != arg2) {
            signlink.reporterror(this.field1294 + " size mismatch in getnpcpos - pos:" + arg0.field702 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1548; ++var5) {
                if (this.field1547[this.field1549[var5]] == null) {
                    signlink.reporterror(this.field1294 + " null entry in npc list - pos:" + var5 + " size:" + this.field1548);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method449(byte arg0) {
        if (arg0 != -22) {
            this.field1566 = !this.field1566;
        }
        if (this.field1651 == 0) {
            int var2 = super.field28;
            if (this.field1226 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                var2 = 0;
            }
            if (this.field1439) {
                if (var2 != 1) {
                    int var3 = super.field22;
                    int var4 = super.field23;
                    if (this.field1371 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1371 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1371 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1372 - 10 || var3 > this.field1374 + this.field1372 + 10 || var4 < this.field1373 - 10 || var4 > this.field1375 + this.field1373 + 10) {
                        this.field1439 = false;
                        if (this.field1371 == 1) {
                            this.field1253 = true;
                        }
                        if (this.field1371 == 2) {
                            this.field1336 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1372;
                    int var6 = this.field1373;
                    int var7 = this.field1374;
                    int var8 = super.field29;
                    int var9 = super.field30;
                    if (this.field1371 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1371 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1371 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1268; ++var11) {
                        int var12 = (this.field1268 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method486(0, var10);
                    }
                    this.field1439 = false;
                    if (this.field1371 == 1) {
                        this.field1253 = true;
                    }
                    if (this.field1371 == 2) {
                        this.field1336 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1268 > 0) {
                    int var13 = this.field1564[this.field1268 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1562[this.field1268 - 1];
                        int var15 = this.field1563[this.field1268 - 1];
                        Component var16 = Component.field70[var15];
                        if (var16.field97 || var16.field100) {
                            this.field1327 = false;
                            this.field1619 = 0;
                            this.field1649 = var15;
                            this.field1650 = var14;
                            this.field1651 = 2;
                            this.field1652 = super.field29;
                            this.field1653 = super.field30;
                            if (Component.field70[var15].field76 == this.field1481) {
                                this.field1651 = 1;
                            }
                            if (Component.field70[var15].field76 == this.field1465) {
                                this.field1651 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1460 == 1 || this.method549(false, this.field1268 - 1)) && this.field1268 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1268 > 0) {
                    this.method486(0, this.field1268 - 1);
                }
                if (var2 != 2 || this.field1268 <= 0) {
                    return;
                }
                this.method538(-26623);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method450(int arg0) {
        if (arg0 != -48789) {
            this.field1235 = -1;
        }
        this.field1324.method213(58, (byte) 48);
        if (this.field1569 != -1) {
            this.field1569 = -1;
            this.field1253 = true;
            this.field1260 = false;
            this.field1458 = true;
        }
        if (this.field1465 != -1) {
            this.field1465 = -1;
            this.field1336 = true;
            this.field1260 = false;
        }
        this.field1481 = -1;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method451(byte arg0) {
        this.field1522 = true;
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1305 = this.field1478.method290();
        }
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field1338[var3] = -1;
            for (int var4 = 0; var4 < IdkType.field1109; ++var4) {
                if (!IdkType.field1110[var4].field1116 && IdkType.field1110[var4].field1111 == var3 + (this.field1284 ? 0 : 7)) {
                    this.field1338[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method452(int arg0) {
        this.field1507 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1527) {
                ++this.field1483;
                this.method496(7);
                this.method496(7);
                this.method540(false);
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
        this.field1507 = false;
        if (arg0 != 0) {
            this.field1531 = -360;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method453(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1305 = -247;
        }
        if (!field1464) {
            if (Pix3D.field648[17] >= arg0) {
                Pix8 var3 = Pix3D.field642[17];
                int var4 = var3.field672 * var3.field671 - 1;
                int var5 = this.field1222 * var3.field671 * 2;
                byte[] var6 = var3.field669;
                byte[] var7 = this.field1487;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field669 = var7;
                this.field1487 = var6;
                Pix3D.method170(17, -788);
            }
            if (Pix3D.field648[24] >= arg0) {
                Pix8 var9 = Pix3D.field642[24];
                int var10 = var9.field672 * var9.field671 - 1;
                int var11 = this.field1222 * var9.field671 * 2;
                byte[] var12 = var9.field669;
                byte[] var13 = this.field1487;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field669 = var13;
                this.field1487 = var12;
                Pix3D.method170(24, -788);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field1377 && !this.field1593 && !this.field1350) {
            ++field1610;
            if (!arg0) {
                this.field1235 = this.field1388.method224();
            }
            if (!this.field1512) {
                this.method548((byte) 39);
            } else {
                this.method455(0);
            }
            this.method457((byte) 58);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method454(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1310 = this.field1478.method290();
        }
        int[] var3 = this.field1553.field658;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1558[arg0][var24][var6] & 24) == 0) {
                    this.field1314.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1558[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1314.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1553.method180(-328);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1558[arg0][var22][var9] & 24) == 0) {
                    this.method498(var8, -414, arg0, var22, var9, var7);
                }
                if (arg0 < 3 && (this.field1558[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method498(var8, -414, arg0 + 1, var22, var9, var7);
                }
            }
        }
        this.field1367.method253(-328);
        this.field1603 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1314.method79(this.field1636, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method325(var13).field969;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1280[this.field1636].field1090;
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
                        this.field1356[this.field1603] = this.field1400[var14];
                        this.field1604[this.field1603] = var15;
                        this.field1605[this.field1603] = var16;
                        ++this.field1603;
                    }
                }
            }
        }
        ++field1476;
        if (field1476 > 112) {
            field1476 = 0;
            this.field1324.method213(4, (byte) 48);
            this.field1324.method214(50);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method455(int arg0) {
        if (this.field1398 > 1) {
            --this.field1398;
        }
        if (this.field1238 > 0) {
            --this.field1238;
        }
        for (int var2 = 0; var2 < 5 && this.method521(this.field1401); ++var2) {
        }
        if (this.field1512) {
            Object var3 = this.field1430.field987;
            synchronized (this.field1430.field987) {
                if (!field1243) {
                    this.field1430.field988 = 0;
                } else if (super.field28 != 0 || this.field1430.field988 >= 40) {
                    this.field1324.method213(232, (byte) 48);
                    this.field1324.method214(0);
                    int var4 = this.field1324.field702;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1430.field988 && var4 - this.field1324.field702 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1430.field990[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1430.field989[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1430.field990[var6] == -1 && this.field1430.field989[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1440 == var8 && this.field1441 == var7) {
                            if (this.field1352 < 2047) {
                                ++this.field1352;
                            }
                        } else {
                            int var10 = var8 - this.field1440;
                            this.field1440 = var8;
                            int var11 = var7 - this.field1441;
                            this.field1441 = var7;
                            if (this.field1352 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1324.method215((this.field1352 << 12) + (var10 << 6) + var11);
                                this.field1352 = 0;
                            } else if (this.field1352 < 8) {
                                this.field1324.method217((this.field1352 << 19) + 8388608 + var9);
                                this.field1352 = 0;
                            } else {
                                this.field1324.method218((this.field1352 << 19) + -1073741824 + var9);
                                this.field1352 = 0;
                            }
                        }
                    }
                    this.field1324.method223(this.field1324.field702 - var4, 0);
                    if (var5 >= this.field1430.field988) {
                        this.field1430.field988 = 0;
                    } else {
                        this.field1430.field988 -= var5;
                        for (int var12 = 0; var12 < this.field1430.field988; ++var12) {
                            this.field1430.field989[var12] = this.field1430.field989[var5 + var12];
                            this.field1430.field990[var12] = this.field1430.field990[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field1584) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1584 = super.field31;
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
                this.field1324.method213(234, (byte) 48);
                this.field1324.method218((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1263 > 0) {
                --this.field1263;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field1264 = true;
            }
            if (this.field1264 && this.field1263 <= 0) {
                this.field1263 = 20;
                this.field1264 = false;
                this.field1324.method213(91, (byte) 48);
                this.field1324.method215(this.field1246);
                this.field1324.method215(this.field1247);
            }
            if (super.field19 && !this.field1616) {
                this.field1616 = true;
                this.field1324.method213(8, (byte) 48);
                this.field1324.method214(1);
            }
            if (!super.field19 && this.field1616) {
                this.field1616 = false;
                this.field1324.method213(8, (byte) 48);
                this.field1324.method214(0);
            }
            this.method476(876);
            this.method469((byte) 61);
            this.method437((byte) 107);
            ++this.field1236;
            if (this.field1236 > 750) {
                this.method492(-35099);
            }
            this.method539(-529);
            this.method502(false);
            this.method481((byte) 105);
            ++this.field1222;
            if (this.field1503 != 0) {
                this.field1502 += 20;
                if (this.field1502 >= 400) {
                    this.field1503 = 0;
                }
            }
            if (this.field1511 != 0) {
                ++this.field1508;
                if (this.field1508 >= 15) {
                    if (this.field1511 == 2) {
                        this.field1253 = true;
                    }
                    if (this.field1511 == 3) {
                        this.field1336 = true;
                    }
                    this.field1511 = 0;
                }
            }
            if (this.field1651 != 0) {
                ++this.field1619;
                if (super.field22 > this.field1652 + 5 || super.field22 < this.field1652 - 5 || super.field23 > this.field1653 + 5 || super.field23 < this.field1653 - 5) {
                    this.field1327 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1651 == 2) {
                        this.field1253 = true;
                    }
                    if (this.field1651 == 3) {
                        this.field1336 = true;
                    }
                    this.field1651 = 0;
                    if (this.field1327 && this.field1619 >= 5) {
                        this.field1297 = -1;
                        this.method514((byte) 9);
                        if (this.field1649 == this.field1297 && this.field1650 != this.field1296) {
                            Component var20 = Component.field70[this.field1649];
                            byte var21 = 0;
                            if (this.field1212 == 1 && var20.field79 == 206) {
                                var21 = 1;
                            }
                            if (var20.field71[this.field1296] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field100) {
                                int var22 = this.field1650;
                                int var23 = this.field1296;
                                var20.field71[var23] = var20.field71[var22];
                                var20.field72[var23] = var20.field72[var22];
                                var20.field71[var22] = -1;
                                var20.field72[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1650;
                                int var25 = this.field1296;
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
                                var20.method33(0, this.field1296, this.field1650);
                            }
                            this.field1324.method213(176, (byte) 48);
                            this.field1324.method215(this.field1649);
                            this.field1324.method215(this.field1650);
                            this.field1324.method215(this.field1296);
                            this.field1324.method214(var21);
                        }
                    } else if ((this.field1460 == 1 || this.method549(false, this.field1268 - 1)) && this.field1268 > 2) {
                        this.method538(-26623);
                    } else if (this.field1268 > 0) {
                        this.method486(0, this.field1268 - 1);
                    }
                    this.field1508 = 10;
                    super.field28 = 0;
                }
            }
            ++field1231;
            if (field1231 > 62) {
                field1231 = 0;
                this.field1324.method213(182, (byte) 48);
            }
            if (World3D.field315 != -1) {
                int var26 = World3D.field315;
                int var27 = World3D.field316;
                boolean var28 = this.method429(var27, 1, 0, field1311.field444[0], 0, true, var26, 0, field1311.field443[0], 0, 0, 0);
                World3D.field315 = -1;
                if (var28) {
                    this.field1500 = super.field29;
                    this.field1501 = super.field30;
                    this.field1503 = 1;
                    this.field1502 = 0;
                }
            }
            if (super.field28 == 1 && this.field1609 != null) {
                this.field1609 = null;
                this.field1336 = true;
                super.field28 = 0;
            }
            this.method449((byte) -22);
            this.field1234 += arg0;
            this.method424(47692);
            this.method482(this.field1266);
            this.method545((byte) -44);
            if (super.field21 == 1 || super.field28 == 1) {
                ++this.field1391;
            }
            if (this.field1485 == 2) {
                this.method431(true);
            }
            if (this.field1485 == 2 && this.field1242) {
                this.method527(this.field1657);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1431[var29]++;
            }
            this.method493(false);
            ++super.field20;
            if (super.field20 > 4500) {
                this.field1238 = 250;
                super.field20 -= 500;
                this.field1324.method213(144, (byte) 48);
            }
            ++this.field1429;
            if (this.field1429 > 500) {
                this.field1429 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1567 += this.field1568;
                }
                if ((var30 & 2) == 2) {
                    this.field1389 += this.field1390;
                }
                if ((var30 & 4) == 4) {
                    this.field1590 += this.field1591;
                }
            }
            if (this.field1567 < -50) {
                this.field1568 = 2;
            }
            if (this.field1567 > 50) {
                this.field1568 = -2;
            }
            if (this.field1389 < -55) {
                this.field1390 = 2;
            }
            if (this.field1389 > 55) {
                this.field1390 = -2;
            }
            if (this.field1590 < -40) {
                this.field1591 = 1;
            }
            if (this.field1590 > 40) {
                this.field1591 = -1;
            }
            ++this.field1541;
            if (this.field1541 > 500) {
                this.field1541 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1628 += this.field1629;
                }
                if ((var31 & 2) == 2) {
                    this.field1433 += this.field1434;
                }
            }
            if (this.field1628 < -60) {
                this.field1629 = 2;
            }
            if (this.field1628 > 60) {
                this.field1629 = -2;
            }
            if (this.field1433 < -20) {
                this.field1434 = 1;
            }
            if (this.field1433 > 10) {
                this.field1434 = -1;
            }
            ++this.field1237;
            if (this.field1237 > 50) {
                this.field1324.method213(239, (byte) 48);
            }
            try {
                if (this.field1573 != null && this.field1324.field702 > 0) {
                    this.field1573.method42(-991, this.field1324.field702, this.field1324.field701, 0);
                    this.field1324.field702 = 0;
                    this.field1237 = 0;
                }
            } catch (IOException var33) {
                this.method492(-35099);
            } catch (Exception var34) {
                this.method430(this.field1611);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method456(boolean arg0) {
        this.field1512 &= arg0;
        if (this.field1381 == 2) {
            this.method553(this.field1384 * 2, (this.field1383 - this.field1394 << 7) + this.field1386, -604, (this.field1382 - this.field1393 << 7) + this.field1385);
            if (this.field1410 > -1 && field1610 % 20 < 10) {
                this.field1537[2].method185(this.field1411 - 28, this.field1410 - 12, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method457(byte arg0) {
        if (arg0 == 58) {
            while (true) {
                OnDemandRequest var2 = this.field1583.method276();
                if (var2 == null) {
                    return;
                }
                if (var2.field715 == 0) {
                    Model.method123(var2.field717, var2.field716, -568);
                    if ((this.field1583.method272(false, var2.field716) & 98) != 0) {
                        this.field1253 = true;
                        if (this.field1465 != -1) {
                            this.field1336 = true;
                        }
                    }
                }
                if (var2.field715 == 1 && var2.field717 != null) {
                    AnimFrame.method45(var2.field717, 384);
                }
                if (var2.field715 == 2 && this.field1559 == var2.field716 && var2.field717 != null) {
                    this.method523((byte) 2, var2.field717, this.field1560);
                }
                if (var2.field715 == 3 && this.field1485 == 1) {
                    for (int var3 = 0; var3 < this.field1533.length; ++var3) {
                        if (this.field1276[var3] == var2.field716) {
                            this.field1533[var3] = var2.field717;
                            if (var2.field717 == null) {
                                this.field1276[var3] = -1;
                            }
                            break;
                        }
                        if (this.field1277[var3] == var2.field716) {
                            this.field1663[var3] = var2.field717;
                            if (var2.field717 == null) {
                                this.field1277[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field715 == 93 && this.field1583.method271((byte) 5, var2.field716)) {
                    World.method17(new Packet((byte) 3, var2.field717), this.field1583, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method458(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1615; ++var4) {
                if (this.field1355[var4] == arg0) {
                    --this.field1615;
                    this.field1253 = true;
                    for (int var5 = var4; var5 < this.field1615; ++var5) {
                        this.field1355[var5] = this.field1355[var5 + 1];
                    }
                    this.field1324.method213(193, (byte) 48);
                    this.field1324.method220(arg0, true);
                    break;
                }
            }
            if (arg1 <= 0) {
                this.field1566 = !this.field1566;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public static final void method459(int arg0) {
        World3D.field281 = false;
        Pix3D.field629 = false;
        field1464 = false;
        if (arg0 <= 0) {
            field1539 = !field1539;
        }
        World.field43 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILgc;I)V")
    public final void method460(int arg0, byte arg1, int arg2, NpcType arg3, int arg4) {
        if (this.field1268 < 400) {
            String var6 = arg3.field1002;
            if (arg1 != 5) {
                this.field1235 = -1;
            }
            if (arg3.field1019 != 0) {
                var6 = var6 + method468(arg3.field1019, field1311.field461, this.field1529) + " (level-" + arg3.field1019 + ")";
            }
            if (this.field1255 == 1) {
                this.field1499[this.field1268] = "Use " + this.field1259 + " with @yel@" + var6;
                this.field1564[this.field1268] = 829;
                this.field1565[this.field1268] = arg4;
                this.field1562[this.field1268] = arg2;
                this.field1563[this.field1268] = arg0;
                ++this.field1268;
            } else {
                if (this.field1226 == 1) {
                    if ((this.field1228 & 2) == 2) {
                        this.field1499[this.field1268] = this.field1229 + " @yel@" + var6;
                        this.field1564[this.field1268] = 240;
                        this.field1565[this.field1268] = arg4;
                        this.field1562[this.field1268] = arg2;
                        this.field1563[this.field1268] = arg0;
                        ++this.field1268;
                        return;
                    }
                } else {
                    if (arg3.field1014 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg3.field1014[var7] != null && !arg3.field1014[var7].equalsIgnoreCase("attack")) {
                                this.field1499[this.field1268] = arg3.field1014[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1564[this.field1268] = 242;
                                }
                                if (var7 == 1) {
                                    this.field1564[this.field1268] = 209;
                                }
                                if (var7 == 2) {
                                    this.field1564[this.field1268] = 309;
                                }
                                if (var7 == 3) {
                                    this.field1564[this.field1268] = 852;
                                }
                                if (var7 == 4) {
                                    this.field1564[this.field1268] = 793;
                                }
                                this.field1565[this.field1268] = arg4;
                                this.field1562[this.field1268] = arg2;
                                this.field1563[this.field1268] = arg0;
                                ++this.field1268;
                            }
                        }
                    }
                    if (arg3.field1014 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg3.field1014[var8] != null && arg3.field1014[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg3.field1019 > field1311.field461) {
                                    var9 = 2000;
                                }
                                this.field1499[this.field1268] = arg3.field1014[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1564[this.field1268] = var9 + 242;
                                }
                                if (var8 == 1) {
                                    this.field1564[this.field1268] = var9 + 209;
                                }
                                if (var8 == 2) {
                                    this.field1564[this.field1268] = var9 + 309;
                                }
                                if (var8 == 3) {
                                    this.field1564[this.field1268] = var9 + 852;
                                }
                                if (var8 == 4) {
                                    this.field1564[this.field1268] = var9 + 793;
                                }
                                this.field1565[this.field1268] = arg4;
                                this.field1562[this.field1268] = arg2;
                                this.field1563[this.field1268] = arg0;
                                ++this.field1268;
                            }
                        }
                    }
                    this.field1499[this.field1268] = "Examine @yel@" + var6;
                    this.field1564[this.field1268] = 1714;
                    this.field1565[this.field1268] = arg4;
                    this.field1562[this.field1268] = arg2;
                    this.field1563[this.field1268] = arg0;
                    ++this.field1268;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1542 = true;
        int var2 = 33 / arg0;
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method461(int arg0) {
        if (arg0 <= 0) {
            this.field1657 = !this.field1657;
        }
        this.field1366.method253(-328);
        int var2 = this.field1628 + this.field1247 & 2047;
        int var3 = field1311.field393 / 32 + 48;
        int var4 = 464 - field1311.field394 / 32;
        this.field1553.method189(-11653, var3, 151, 5, this.field1306, this.field1433 + 256, 25, var2, 146, var4, this.field1337);
        this.field1351.method189(-11653, 25, 33, 0, this.field1446, 256, 0, this.field1247, 33, 25, this.field1274);
        for (int var5 = 0; var5 < this.field1603; ++var5) {
            int var33 = this.field1604[var5] * 4 + 2 - field1311.field393 / 32;
            int var34 = this.field1605[var5] * 4 + 2 - field1311.field394 / 32;
            this.method516(var34, var33, 0, this.field1356[var5]);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var29 = 0; var29 < 104; ++var29) {
                LinkList var30 = this.field1341[this.field1636][var6][var29];
                if (var30 != null) {
                    int var31 = var6 * 4 + 2 - field1311.field393 / 32;
                    int var32 = var29 * 4 + 2 - field1311.field394 / 32;
                    this.method516(var32, var31, 0, this.field1543);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1548; ++var7) {
            NpcEntity var26 = this.field1547[this.field1549[var7]];
            if (var26 != null && var26.method113(-948) && var26.field449.field1018) {
                int var27 = var26.field393 / 32 - field1311.field393 / 32;
                int var28 = var26.field394 / 32 - field1311.field394 / 32;
                this.method516(var28, var27, 0, this.field1544);
            }
        }
        for (int var8 = 0; var8 < this.field1644; ++var8) {
            PlayerEntity var19 = this.field1643[this.field1645[var8]];
            if (var19 != null && var19.method113(-948)) {
                int var20 = var19.field393 / 32 - field1311.field393 / 32;
                int var21 = var19.field394 / 32 - field1311.field394 / 32;
                boolean var22 = false;
                long var23 = JString.method295(var19.field455);
                for (int var25 = 0; var25 < this.field1415; ++var25) {
                    if (this.field1221[var25] == var23 && this.field1326[var25] != 0) {
                        var22 = true;
                        break;
                    }
                }
                if (var22) {
                    this.method516(var21, var20, 0, this.field1546);
                } else {
                    this.method516(var21, var20, 0, this.field1545);
                }
            }
        }
        if (this.field1381 != 0 && field1610 % 20 < 10) {
            if (this.field1381 == 1 && this.field1298 >= 0 && this.field1298 < this.field1547.length) {
                NpcEntity var9 = this.field1547[this.field1298];
                if (var9 != null) {
                    int var10 = var9.field393 / 32 - field1311.field393 / 32;
                    int var11 = var9.field394 / 32 - field1311.field394 / 32;
                    this.method528(this.field1436, var10, (byte) 6, var11);
                }
            }
            if (this.field1381 == 2) {
                int var12 = (this.field1382 - this.field1393) * 4 + 2 - field1311.field393 / 32;
                int var13 = (this.field1383 - this.field1394) * 4 + 2 - field1311.field394 / 32;
                this.method528(this.field1436, var12, (byte) 6, var13);
            }
            if (this.field1381 == 10 && this.field1656 >= 0 && this.field1656 < this.field1643.length) {
                PlayerEntity var14 = this.field1643[this.field1656];
                if (var14 != null) {
                    int var15 = var14.field393 / 32 - field1311.field393 / 32;
                    int var16 = var14.field394 / 32 - field1311.field394 / 32;
                    this.method528(this.field1436, var15, (byte) 6, var16);
                }
            }
        }
        if (this.field1551 != 0) {
            int var17 = this.field1551 * 4 + 2 - field1311.field393 / 32;
            int var18 = this.field1552 * 4 + 2 - field1311.field394 / 32;
            this.method516(var18, var17, 0, this.field1435);
        }
        Pix2D.method156(16777215, 3, 0, 78, 3, 97);
        this.field1367.method253(-328);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method462(int arg0) {
        this.field1466 = 0;
        for (int var2 = -1; var2 < this.field1644 + this.field1548; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1311;
            } else if (var2 < this.field1644) {
                var17 = this.field1643[this.field1645[var2]];
            } else {
                var17 = this.field1547[this.field1549[var2 - this.field1644]];
            }
            if (var17 != null && var17.method113(-948)) {
                if (var2 >= this.field1644) {
                    NpcType var21 = ((NpcEntity) var17).field449;
                    if (var21.field1025 >= 0 && var21.field1025 < this.field1537.length) {
                        this.method552((byte) -100, var17.field439 + 15, var17);
                        if (this.field1410 > -1) {
                            this.field1537[var21.field1025].method185(this.field1411 - 30, this.field1410 - 12, 0);
                        }
                    }
                    if (this.field1381 == 1 && this.field1549[var2 - this.field1644] == this.field1298 && field1610 % 20 < 10) {
                        this.method552((byte) -100, var17.field439 + 15, var17);
                        if (this.field1410 > -1) {
                            this.field1537[2].method185(this.field1411 - 28, this.field1410 - 12, 0);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field458 != 0) {
                        this.method552((byte) -100, var17.field439 + 15, var17);
                        if (this.field1410 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field458 & 1 << var20) != 0) {
                                    this.field1537[var20].method185(this.field1411 - var18, this.field1410 - 12, 0);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1381 == 10 && this.field1645[var2] == this.field1656) {
                        this.method552((byte) -100, var17.field439 + 15, var17);
                        if (this.field1410 > -1) {
                            this.field1537[7].method185(this.field1411 - var18, this.field1410 - 12, 0);
                        }
                    }
                }
                if (var17.field405 != null && (var2 >= this.field1644 || this.field1370 == 0 || this.field1370 == 3 || this.field1370 == 1 && this.method445(this.field1662, ((PlayerEntity) var17).field455))) {
                    this.method552((byte) -100, var17.field439, var17);
                    if (this.field1410 > -1 && this.field1466 < this.field1467) {
                        this.field1471[this.field1466] = this.field1404.method202(var17.field405, true) / 2;
                        this.field1470[this.field1466] = this.field1404.field685;
                        this.field1468[this.field1466] = this.field1410;
                        this.field1469[this.field1466] = this.field1411;
                        this.field1472[this.field1466] = var17.field407;
                        this.field1473[this.field1466] = var17.field408;
                        this.field1474[this.field1466] = var17.field406;
                        this.field1475[this.field1466++] = var17.field405;
                        if (this.field1309 == 0 && var17.field408 == 1) {
                            this.field1470[this.field1466] += 10;
                            this.field1469[this.field1466] += 5;
                        }
                        if (this.field1309 == 0 && var17.field408 == 2) {
                            this.field1471[this.field1466] = 60;
                        }
                    }
                }
                if (var17.field412 > field1610) {
                    this.method552((byte) -100, var17.field439 + 15, var17);
                    if (this.field1410 > -1) {
                        int var22 = var17.field413 * 30 / var17.field414;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method156(65280, var22, 0, this.field1411 - 3, 5, this.field1410 - 15);
                        Pix2D.method156(16711680, 30 - var22, 0, this.field1411 - 3, 5, this.field1410 - 15 + var22);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field411[var23] > field1610) {
                        this.method552((byte) -100, var17.field439 / 2, var17);
                        if (this.field1410 > -1) {
                            if (var23 == 1) {
                                this.field1411 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1410 -= 15;
                                this.field1411 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1410 += 15;
                                this.field1411 -= 10;
                            }
                            this.field1532[var17.field410[var23]].method185(this.field1411 - 12, this.field1410 - 12, 0);
                            this.field1402.method200(this.field1410, this.field1411 + 4, (byte) 1, 0, String.valueOf(var17.field409[var23]));
                            this.field1402.method200(this.field1410 - 1, this.field1411 + 3, (byte) 1, 16777215, String.valueOf(var17.field409[var23]));
                        }
                    }
                }
            }
        }
        if (arg0 != 5) {
            this.field1235 = -1;
        }
        for (int var3 = 0; var3 < this.field1466; ++var3) {
            int var4 = this.field1468[var3];
            int var5 = this.field1469[var3];
            int var6 = this.field1471[var3];
            int var7 = this.field1470[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1469[var16] - this.field1470[var16] && var5 - var7 < this.field1469[var16] + 2 && var4 - var6 < this.field1471[var16] + this.field1468[var16] && var4 + var6 > this.field1468[var16] - this.field1471[var16] && this.field1469[var16] - this.field1470[var16] < var5) {
                        var5 = this.field1469[var16] - this.field1470[var16];
                        var8 = true;
                    }
                }
            }
            this.field1410 = this.field1468[var3];
            this.field1411 = this.field1469[var3] = var5;
            String var9 = this.field1475[var3];
            if (this.field1309 == 0) {
                int var10 = 16776960;
                if (this.field1472[var3] < 6) {
                    var10 = this.field1211[this.field1472[var3]];
                }
                if (this.field1472[var3] == 6) {
                    var10 = this.field1457 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1472[var3] == 7) {
                    var10 = this.field1457 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1472[var3] == 8) {
                    var10 = this.field1457 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1472[var3] == 9) {
                    int var11 = 150 - this.field1474[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1472[var3] == 10) {
                    int var12 = 150 - this.field1474[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1472[var3] == 11) {
                    int var13 = 150 - this.field1474[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1473[var3] == 0) {
                    this.field1404.method200(this.field1410, this.field1411 + 1, (byte) 1, 0, var9);
                    this.field1404.method200(this.field1410, this.field1411, (byte) 1, var10, var9);
                }
                if (this.field1473[var3] == 1) {
                    this.field1404.method204(this.field1457, 0, this.field1410, -435, var9, this.field1411 + 1);
                    this.field1404.method204(this.field1457, var10, this.field1410, -435, var9, this.field1411);
                }
                if (this.field1473[var3] == 2) {
                    int var14 = this.field1404.method202(var9, true);
                    int var15 = (150 - this.field1474[var3]) * (var14 + 100) / 150;
                    Pix2D.method153(0, this.field1410 - 50, this.field1410 + 50, 0, 334);
                    this.field1404.method203(this.field1410 + 50 - var15, 474, 0, var9, this.field1411 + 1);
                    this.field1404.method203(this.field1410 + 50 - var15, 474, var10, var9, this.field1411);
                    Pix2D.method152(-29844);
                }
            } else {
                this.field1404.method200(this.field1410, this.field1411 + 1, (byte) 1, 0, var9);
                this.field1404.method200(this.field1410, this.field1411, (byte) 1, 16776960, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method463(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field1266 = !this.field1266;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1271[var5] != null) {
                int var6 = this.field1269[var5];
                int var7 = 70 - var4 * 14 + this.field1613 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1270[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1370 == 0 || this.field1370 == 1 && this.method445(this.field1662, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field1311.field455)) {
                        if (this.field1561 >= 1) {
                            this.field1499[this.field1268] = "Report abuse @whi@" + var8;
                            this.field1564[this.field1268] = 524;
                            ++this.field1268;
                        }
                        this.field1499[this.field1268] = "Add ignore @whi@" + var8;
                        this.field1564[this.field1268] = 47;
                        ++this.field1268;
                        this.field1499[this.field1268] = "Add friend @whi@" + var8;
                        this.field1564[this.field1268] = 605;
                        ++this.field1268;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1245 == 0 && (var6 == 7 || this.field1278 == 0 || this.field1278 == 1 && this.method445(this.field1662, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1561 >= 1) {
                            this.field1499[this.field1268] = "Report abuse @whi@" + var8;
                            this.field1564[this.field1268] = 524;
                            ++this.field1268;
                        }
                        this.field1499[this.field1268] = "Add ignore @whi@" + var8;
                        this.field1564[this.field1268] = 47;
                        ++this.field1268;
                        this.field1499[this.field1268] = "Add friend @whi@" + var8;
                        this.field1564[this.field1268] = 605;
                        ++this.field1268;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1520 == 0 || this.field1520 == 1 && this.method445(this.field1662, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1499[this.field1268] = "Accept trade @whi@" + var8;
                        this.field1564[this.field1268] = 507;
                        ++this.field1268;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1245 == 0 && this.field1278 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1520 == 0 || this.field1520 == 1 && this.method445(this.field1662, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1499[this.field1268] = "Accept duel @whi@" + var8;
                        this.field1564[this.field1268] = 957;
                        ++this.field1268;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method464(int arg0) {
        int var2 = 12 / arg0;
        if (this.field1574 == null) {
            super.field15 = null;
            this.field1368 = null;
            this.field1366 = null;
            this.field1365 = null;
            this.field1367 = null;
            this.field1554 = null;
            this.field1555 = null;
            this.field1556 = null;
            this.field1577 = new PixMap(128, false, this.method11(0), 265);
            Pix2D.method154(true);
            this.field1578 = new PixMap(128, false, this.method11(0), 265);
            Pix2D.method154(true);
            this.field1574 = new PixMap(509, false, this.method11(0), 171);
            Pix2D.method154(true);
            this.field1575 = new PixMap(360, false, this.method11(0), 132);
            Pix2D.method154(true);
            this.field1576 = new PixMap(360, false, this.method11(0), 200);
            Pix2D.method154(true);
            this.field1579 = new PixMap(202, false, this.method11(0), 238);
            Pix2D.method154(true);
            this.field1580 = new PixMap(203, false, this.method11(0), 238);
            Pix2D.method154(true);
            this.field1581 = new PixMap(74, false, this.method11(0), 94);
            Pix2D.method154(true);
            this.field1582 = new PixMap(75, false, this.method11(0), 94);
            Pix2D.method154(true);
            if (this.field1635 != null) {
                this.method489(12681);
                this.method466(8);
            }
            this.field1542 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method465(int arg0, boolean arg1) {
        this.method464(467);
        this.field1576.method253(-328);
        this.field1361.method198(0, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg0 != -13247) {
            this.field1305 = this.field1478.method290();
        }
        if (this.field1360 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1402.method201(this.field1583.field829, var5, 7711145, 0, true, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field1404.method201("Welcome to RuneScape", var6, 16776960, 0, true, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1362.method198(var8 - 20, var7 - 73, 0);
            this.field1404.method201("New User", var8 + 5, 16777215, 0, true, var7);
            int var9 = var3 / 2 + 80;
            this.field1362.method198(var8 - 20, var9 - 73, 0);
            this.field1404.method201("Existing User", var8 + 5, 16777215, 0, true, var9);
        }
        if (this.field1360 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1515.length() > 0) {
                this.field1404.method201(this.field1515, var10 - 15, 16776960, 0, true, var3 / 2);
                this.field1404.method201(this.field1516, var10, 16776960, 0, true, var3 / 2);
                var10 += 30;
            } else {
                this.field1404.method201(this.field1516, var10 - 7, 16776960, 0, true, var3 / 2);
                var10 += 30;
            }
            this.field1404.method205("Username: " + this.field1294 + (this.field1480 == 0 & field1610 % 40 < 20 ? "@yel@|" : ""), var10, 0, 16777215, var3 / 2 - 90, true);
            var10 += 15;
            this.field1404.method205("Password: " + JString.method301(this.field1295, this.field1531) + (this.field1480 == 1 & field1610 % 40 < 20 ? "@yel@|" : ""), var10, 0, 16777215, var3 / 2 - 88, true);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1362.method198(var12 - 20, var11 - 73, 0);
                this.field1404.method201("Login", var12 + 5, 16777215, 0, true, var11);
                int var13 = var3 / 2 + 80;
                this.field1362.method198(var12 - 20, var13 - 73, 0);
                this.field1404.method201("Cancel", var12 + 5, 16777215, 0, true, var13);
            }
        }
        if (this.field1360 == 3) {
            this.field1404.method201("Create a free account", var4 / 2 - 60, 16776960, 0, true, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field1404.method201("To create a new account you need to", var14, 16777215, 0, true, var3 / 2);
            int var18 = var14 + 15;
            this.field1404.method201("go back to the main RuneScape webpage", var18, 16777215, 0, true, var3 / 2);
            int var19 = var18 + 15;
            this.field1404.method201("and choose the red 'create account'", var19, 16777215, 0, true, var3 / 2);
            int var20 = var19 + 15;
            this.field1404.method201("button at the top right of that page.", var20, 16777215, 0, true, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1362.method198(var16 - 20, var15 - 73, 0);
            this.field1404.method201("Cancel", var16 + 5, 16777215, 0, true, var15);
        }
        this.field1576.method254(202, 171, super.field14, -884);
        if (this.field1542) {
            this.field1542 = false;
            this.field1574.method254(128, 0, super.field14, -884);
            this.field1575.method254(202, 371, super.field14, -884);
            this.field1579.method254(0, 265, super.field14, -884);
            this.field1580.method254(562, 265, super.field14, -884);
            this.field1581.method254(128, 171, super.field14, -884);
            this.field1582.method254(562, 171, super.field14, -884);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method466(int arg0) {
        this.field1361 = new Pix8(this.field1635, "titlebox", 0);
        this.field1362 = new Pix8(this.field1635, "titlebutton", 0);
        this.field1659 = new Pix8[12];
        if (arg0 != 8) {
            field1272 = this.field1478.method290();
        }
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1659[var3] = new Pix8(this.field1635, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1659[var4] = new Pix8(this.field1635, "runes", (var4 & 3) + 12);
            }
        }
        this.field1525 = new Pix32(128, 265);
        this.field1526 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1525.field658[var5] = this.field1577.field744[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1526.field658[var6] = this.field1578.field744[var6];
        }
        this.field1343 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1343[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1343[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1343[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1343[var10 + 192] = 16777215;
        }
        this.field1344 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1344[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1344[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1344[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1344[var14 + 192] = 16777215;
        }
        this.field1345 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1345[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1345[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1345[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1345[var18 + 192] = 16777215;
        }
        this.field1342 = new int[256];
        this.field1232 = new int[32768];
        this.field1233 = new int[32768];
        this.method479(602, (Pix8) null);
        this.field1379 = new int[32768];
        this.field1380 = new int[32768];
        this.method13(4, 10, "Connecting to fileserver");
        if (!this.field1527) {
            this.field1505 = true;
            this.field1527 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZI)V")
    public final void method467(boolean arg0, boolean arg1, int arg2) {
        this.field1512 &= arg1;
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        if (arg0 >= 4 && arg0 <= 4) {
            this.field1443 = arg1;
            this.field1614 = arg2;
            this.method464(467);
            if (this.field1635 == null) {
                super.method13(4, arg1, arg2);
            } else {
                this.field1576.method253(-328);
                short var4 = 360;
                short var5 = 200;
                byte var6 = 20;
                this.field1404.method200(var4 / 2, var5 / 2 - 26 - var6, (byte) 1, 16777215, "RuneScape is loading - please wait...");
                int var7 = var5 / 2 - 18 - var6;
                Pix2D.method157(304, -17527, 34, var4 / 2 - 152, var7, 9179409);
                Pix2D.method157(302, -17527, 32, var4 / 2 - 151, var7 + 1, 0);
                Pix2D.method156(9179409, arg1 * 3, 0, var7 + 2, 30, var4 / 2 - 150);
                Pix2D.method156(0, 300 - arg1 * 3, 0, var7 + 2, 30, arg1 * 3 + (var4 / 2 - 150));
                this.field1404.method200(var4 / 2, var5 / 2 + 5 - var6, (byte) 1, 16777215, arg2);
                this.field1576.method254(202, 171, super.field14, -884);
                if (this.field1542) {
                    this.field1542 = false;
                    if (!this.field1527) {
                        this.field1577.method254(0, 0, super.field14, -884);
                        this.field1578.method254(637, 0, super.field14, -884);
                    }
                    this.field1574.method254(128, 0, super.field14, -884);
                    this.field1575.method254(202, 371, super.field14, -884);
                    this.field1579.method254(0, 265, super.field14, -884);
                    this.field1580.method254(562, 265, super.field14, -884);
                    this.field1581.method254(128, 171, super.field14, -884);
                    this.field1582.method254(562, 171, super.field14, -884);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method468(int arg0, int arg1, byte arg2) {
        if (arg2 != -75) {
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    private final void method469(byte arg0) {
        if (arg0 != 61) {
            this.field1540 = this.field1478.method290();
        }
        if (this.field1485 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1265.method243(); var2 != null; var2 = (LocSpawned) this.field1265.method245(30869)) {
                if (var2.field731 > 0) {
                    --var2.field731;
                }
                if (var2.field731 == 0) {
                    if (var2.field724 < 0 || World.method30((byte) 4, var2.field726, var2.field724)) {
                        this.method484(var2.field724, var2.field721, var2.field720, var2.field723, var2.field722, var2.field726, 7, var2.field725);
                        var2.method106();
                    }
                } else {
                    if (var2.field730 > 0) {
                        --var2.field730;
                    }
                    if (var2.field730 == 0 && var2.field722 >= 1 && var2.field723 >= 1 && var2.field722 <= 102 && var2.field723 <= 102 && (var2.field727 < 0 || World.method30((byte) 4, var2.field729, var2.field727))) {
                        this.method484(var2.field727, var2.field721, var2.field720, var2.field723, var2.field722, var2.field729, 7, var2.field728);
                        var2.field730 = -1;
                        if (var2.field727 == var2.field724 && var2.field724 == -1) {
                            var2.method106();
                        } else if (var2.field727 == var2.field724 && var2.field728 == var2.field725 && var2.field729 == var2.field726) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Llb;II)V")
    private final void method470(Packet arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field1235 = -1;
        }
        for (int var4 = 0; var4 < this.field1646; ++var4) {
            int var5 = this.field1647[var4];
            NpcEntity var6 = this.field1547[var5];
            int var7 = arg0.method224();
            if ((var7 & 1) == 1) {
                int var8 = arg0.method224();
                int var9 = arg0.method224();
                var6.method114(field1610, var9, var8, (byte) 0);
                var6.field412 = field1610 + 300;
                var6.field413 = arg0.method224();
                var6.field414 = arg0.method224();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg0.method226();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field421 == var10) {
                    var6.field425 = 0;
                }
                int var11 = arg0.method224();
                if (var6.field421 == var10 && var10 != -1) {
                    int var12 = SeqType.field1131[var10].field1145;
                    if (var12 == 1) {
                        var6.field422 = 0;
                        var6.field423 = 0;
                        var6.field424 = var11;
                        var6.field425 = 0;
                    }
                    if (var12 == 2) {
                        var6.field425 = 0;
                    }
                } else if (var10 == -1 || var6.field421 == -1 || SeqType.field1131[var10].field1139 >= SeqType.field1131[var6.field421].field1139) {
                    var6.field421 = var10;
                    var6.field422 = 0;
                    var6.field423 = 0;
                    var6.field424 = var11;
                    var6.field425 = 0;
                    var6.field447 = var6.field442;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field415 = arg0.method226();
                if (var6.field415 == 65535) {
                    var6.field415 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field405 = arg0.method231();
                var6.field406 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg0.method224();
                int var14 = arg0.method224();
                var6.method114(field1610, var14, var13, (byte) 0);
                var6.field412 = field1610 + 300;
                var6.field413 = arg0.method224();
                var6.field414 = arg0.method224();
            }
            if ((var7 & 32) == 32) {
                var6.field449 = NpcType.method335(arg0.method226());
                var6.field397 = var6.field449.field1004;
                var6.field441 = var6.field449.field1026;
                var6.field400 = var6.field449.field1008;
                var6.field401 = var6.field449.field1009;
                var6.field402 = var6.field449.field1010;
                var6.field403 = var6.field449.field1011;
                var6.field398 = var6.field449.field1007;
            }
            if ((var7 & 64) == 64) {
                var6.field426 = arg0.method226();
                int var15 = arg0.method229();
                var6.field430 = var15 >> 16;
                var6.field429 = (var15 & 65535) + field1610;
                var6.field427 = 0;
                var6.field428 = 0;
                if (var6.field429 > field1610) {
                    var6.field427 = -1;
                }
                if (var6.field426 == 65535) {
                    var6.field426 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field416 = arg0.method226();
                var6.field417 = arg0.method226();
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method471(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.method6();
        }
        if (this.field1268 >= 2 || this.field1255 != 0 || this.field1226 != 0) {
            String var2;
            if (this.field1255 == 1 && this.field1268 < 2) {
                var2 = "Use " + this.field1259 + " with...";
            } else if (this.field1226 == 1 && this.field1268 < 2) {
                var2 = this.field1229 + "...";
            } else {
                var2 = this.field1499[this.field1268 - 1];
            }
            if (this.field1268 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1268 - 2) + " more options";
            }
            this.field1404.method206(true, field1610 / 1000, var2, 16777215, false, 4, 15);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method472(Component arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1293 = -356;
        }
        int var3 = arg0.field79;
        if (this.field1416 == 2) {
            if (var3 == 201) {
                this.field1336 = true;
                this.field1664 = false;
                this.field1357 = true;
                this.field1447 = "";
                this.field1225 = 1;
                this.field1432 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1336 = true;
                this.field1664 = false;
                this.field1357 = true;
                this.field1447 = "";
                this.field1225 = 2;
                this.field1432 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1238 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1336 = true;
                this.field1664 = false;
                this.field1357 = true;
                this.field1447 = "";
                this.field1225 = 4;
                this.field1432 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1336 = true;
                this.field1664 = false;
                this.field1357 = true;
                this.field1447 = "";
                this.field1225 = 5;
                this.field1432 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1338[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1109 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1109) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1110[var6].field1116 && IdkType.field1110[var6].field1111 == var4 + (this.field1284 ? 0 : 7)) {
                            this.field1338[var4] = var6;
                            this.field1522 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1617[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1538[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1538[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1617[var7] = var9;
                this.field1522 = true;
            }
            if (var3 == 324 && !this.field1284) {
                this.field1284 = true;
                this.method451((byte) 3);
            }
            if (var3 == 325 && this.field1284) {
                this.field1284 = false;
                this.method451((byte) 3);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1267 = !this.field1267;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method450(-48789);
                    if (this.field1318.length() > 0) {
                        this.field1324.method213(203, (byte) 48);
                        this.field1324.method220(JString.method295(this.field1318), true);
                        this.field1324.method214(var3 - 601);
                        this.field1324.method214(this.field1267 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1324.method213(13, (byte) 48);
                this.field1324.method214(this.field1284 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1324.method214(this.field1338[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1324.method214(this.field1617[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;ZIIIIZII)V")
    public final void method473(Component arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (this.field1660) {
            this.field1328 = 32;
        } else {
            this.field1328 = 0;
        }
        this.field1660 = false;
        if (arg1) {
            this.field1531 = this.field1478.method290();
        }
        if (arg7 >= arg2 && arg7 < arg2 + 16 && arg8 >= arg4 && arg8 < arg4 + 16) {
            arg0.field90 -= this.field1391 * 4;
            if (arg6) {
                this.field1253 = true;
                return;
            }
        } else if (arg7 >= arg2 && arg7 < arg2 + 16 && arg8 >= arg3 + arg4 - 16 && arg8 < arg3 + arg4) {
            arg0.field90 += this.field1391 * 4;
            if (arg6) {
                this.field1253 = true;
                return;
            }
        } else {
            if (arg7 < arg2 - this.field1328 || arg7 >= arg2 + 16 + this.field1328 || arg8 < arg4 + 16 || arg8 >= arg3 + arg4 - 16 || this.field1391 <= 0) {
                return;
            }
            int var10 = (arg3 - 32) * arg3 / arg5;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg4 - 16 - var10 / 2;
            int var12 = arg3 - 32 - var10;
            arg0.field90 = (arg5 - arg3) * var11 / var12;
            if (arg6) {
                this.field1253 = true;
            }
            this.field1660 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1377 && !this.field1593 && !this.field1350) {
            ++field1347;
            if (arg0 != 81) {
                this.field1341 = null;
            }
            if (!this.field1512) {
                this.method465(-13247, false);
            } else {
                this.method509(-511);
            }
            this.field1391 = 0;
        } else {
            this.method541((byte) 5);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method474(int arg0, int arg1) {
        int var3 = 82 / arg1;
        Component var4 = Component.field70[arg0];
        for (int var5 = 0; var5 < var4.field92.length && var4.field92[var5] != -1; ++var5) {
            Component var6 = Component.field70[var4.field92[var5]];
            if (var6.field77 == 1) {
                this.method474(var6.field75, 962);
            }
            var6.field73 = 0;
            var6.field74 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;I)I")
    public final int method475(boolean arg0, Component arg1, int arg2) {
        this.field1512 &= arg0;
        if (arg1.field85 != null && arg2 < arg1.field85.length) {
            try {
                int[] var4 = arg1.field85[arg2];
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
                        var9 = this.field1307[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1286[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1254[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field70[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1032 && (!ObjType.method341(var12).field1053 || field1463)) {
                            for (int var13 = 0; var13 < var11.field71.length; ++var13) {
                                if (var12 + 1 == var11.field71[var13]) {
                                    var9 += var11.field72[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1332[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1369[this.field1286[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1332[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1311.field461;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1147; ++var14) {
                            if (Stats.field1149[var14]) {
                                var9 += this.field1286[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field70[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1032 && (!ObjType.method341(var16).field1053 || field1463)) {
                            for (int var17 = 0; var17 < var15.field71.length; ++var17) {
                                if (var15.field71[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1349;
                    }
                    if (var8 == 12) {
                        var9 = this.field1317;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1332[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1168[var20];
                        int var22 = var21.field1170;
                        int var23 = var21.field1171;
                        int var24 = var21.field1172;
                        int var25 = field1498[var24 - var23];
                        var9 = this.field1332[var22] >> var23 & var25;
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
                        var9 = (field1311.field393 >> 7) + this.field1393;
                    }
                    if (var8 == 19) {
                        var9 = (field1311.field394 >> 7) + this.field1394;
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

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method476(int arg0) {
        int var2 = 21 / arg0;
        if (field1464 && this.field1485 == 2 && World.field44 != this.field1636) {
            this.field1367.method253(-328);
            this.field1403.method200(257, 151, (byte) 1, 0, "Loading - please wait.");
            this.field1403.method200(256, 150, (byte) 1, 16777215, "Loading - please wait.");
            this.field1367.method254(4, 4, super.field14, -884);
            this.field1485 = 1;
            this.field1658 = System.currentTimeMillis();
        }
        if (this.field1485 == 1) {
            int var3 = this.method477(475);
            if (var3 != 0 && System.currentTimeMillis() - this.field1658 > 360000L) {
                signlink.reporterror(this.field1294 + " glcfb " + this.field1412 + "," + var3 + "," + field1464 + "," + this.field1378[0] + "," + this.field1583.method275() + "," + this.field1636 + "," + this.field1214 + "," + this.field1215);
                this.field1658 = System.currentTimeMillis();
            }
        }
        if (this.field1485 == 2 && this.field1636 != this.field1213) {
            this.field1213 = this.field1636;
            this.method454(this.field1636, 707);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)I")
    public final int method477(int arg0) {
        for (int var2 = 0; var2 < this.field1533.length; ++var2) {
            if (this.field1533[var2] == null && this.field1276[var2] != -1) {
                return -1;
            }
            if (this.field1663[var2] == null && this.field1277[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1533.length; ++var4) {
            byte[] var6 = this.field1663[var4];
            if (var6 != null) {
                int var7 = (this.field1275[var4] >> 8) * 64 - this.field1393;
                int var8 = (this.field1275[var4] & 255) * 64 - this.field1394;
                var3 &= World.method16(var8, var6, -972, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1622) {
            return -4;
        } else {
            this.field1485 = 2;
            World.field44 = this.field1636;
            this.method531(0);
            this.field1324.method213(134, (byte) 48);
            int var5 = 84 / arg0;
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method478(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1415 >= 100 && this.field1241 != 1) {
                this.method526(-638, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field1415 >= 200) {
                this.method526(-638, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = JString.method299(584, JString.method296(-206, arg1));
                for (int var5 = 0; var5 < this.field1415; ++var5) {
                    if (this.field1221[var5] == arg1) {
                        this.method526(-638, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1615; ++var6) {
                    if (this.field1355[var6] == arg1) {
                        this.method526(-638, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field1311.field455)) {
                    this.field1285[this.field1415] = var4;
                    this.field1221[this.field1415] = arg1;
                    this.field1326[this.field1415] = 0;
                    ++this.field1415;
                    this.field1253 = true;
                    this.field1324.method213(9, (byte) 48);
                    this.field1324.method220(arg1, true);
                    if (arg0 != 18804) {
                        this.field1340 = this.field1478.method290();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method479(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1232.length; ++var4) {
            this.field1232[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1232[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field1233[var17] = (this.field1232[var17 - 1] + this.field1232[var17 + 1] + this.field1232[var17 - 128] + this.field1232[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field1232;
            this.field1232 = this.field1233;
            this.field1233 = var15;
        }
        int var7 = 5 / arg0;
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field672; ++var9) {
                for (int var10 = 0; var10 < arg1.field671; ++var10) {
                    if (arg1.field669[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field673;
                        int var12 = var9 + 16 + arg1.field674;
                        int var13 = (var12 << 7) + var11;
                        this.field1232[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method480(int arg0) {
        if (arg0 < 0) {
            if (this.field1255 == 0 && this.field1226 == 0) {
                this.field1499[this.field1268] = "Walk here";
                this.field1564[this.field1268] = 718;
                this.field1562[this.field1268] = super.field22;
                this.field1563[this.field1268] = super.field23;
                ++this.field1268;
            }
            int var2 = -1;
            for (int var3 = 0; var3 < Model.field593; ++var3) {
                int var4 = Model.field594[var3];
                int var5 = var4 & 127;
                int var6 = var4 >> 7 & 127;
                int var7 = var4 >> 29 & 3;
                int var8 = var4 >> 14 & 32767;
                if (var2 != var4) {
                    var2 = var4;
                    if (var7 == 2 && this.field1314.method80(this.field1636, var5, var6, var4) >= 0) {
                        LocType var9 = LocType.method325(var8);
                        if (this.field1255 == 1) {
                            this.field1499[this.field1268] = "Use " + this.field1259 + " with @cya@" + var9.field952;
                            this.field1564[this.field1268] = 810;
                            this.field1565[this.field1268] = var4;
                            this.field1562[this.field1268] = var5;
                            this.field1563[this.field1268] = var6;
                            ++this.field1268;
                        } else if (this.field1226 == 1) {
                            if ((this.field1228 & 4) == 4) {
                                this.field1499[this.field1268] = this.field1229 + " @cya@" + var9.field952;
                                this.field1564[this.field1268] = 899;
                                this.field1565[this.field1268] = var4;
                                this.field1562[this.field1268] = var5;
                                this.field1563[this.field1268] = var6;
                                ++this.field1268;
                            }
                        } else {
                            if (var9.field968 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var9.field968[var10] != null) {
                                        this.field1499[this.field1268] = var9.field968[var10] + " @cya@" + var9.field952;
                                        if (var10 == 0) {
                                            this.field1564[this.field1268] = 625;
                                        }
                                        if (var10 == 1) {
                                            this.field1564[this.field1268] = 721;
                                        }
                                        if (var10 == 2) {
                                            this.field1564[this.field1268] = 743;
                                        }
                                        if (var10 == 3) {
                                            this.field1564[this.field1268] = 357;
                                        }
                                        if (var10 == 4) {
                                            this.field1564[this.field1268] = 1071;
                                        }
                                        this.field1565[this.field1268] = var4;
                                        this.field1562[this.field1268] = var5;
                                        this.field1563[this.field1268] = var6;
                                        ++this.field1268;
                                    }
                                }
                            }
                            this.field1499[this.field1268] = "Examine @cya@" + var9.field952;
                            this.field1564[this.field1268] = 1381;
                            this.field1565[this.field1268] = var4;
                            this.field1562[this.field1268] = var5;
                            this.field1563[this.field1268] = var6;
                            ++this.field1268;
                        }
                    }
                    if (var7 == 1) {
                        NpcEntity var11 = this.field1547[var8];
                        if (var11.field449.field1004 == 1 && (var11.field393 & 127) == 64 && (var11.field394 & 127) == 64) {
                            for (int var12 = 0; var12 < this.field1548; ++var12) {
                                NpcEntity var15 = this.field1547[this.field1549[var12]];
                                if (var15 != null && var11 != var15 && var15.field449.field1004 == 1 && var11.field393 == var15.field393 && var11.field394 == var15.field394) {
                                    this.method460(var6, (byte) 5, var5, var15.field449, this.field1549[var12]);
                                }
                            }
                            for (int var13 = 0; var13 < this.field1644; ++var13) {
                                PlayerEntity var14 = this.field1643[this.field1645[var13]];
                                if (var14 != null && var11.field393 == var14.field393 && var11.field394 == var14.field394) {
                                    this.method495(var14, this.field1645[var13], (byte) 4, var6, var5);
                                }
                            }
                        }
                        this.method460(var6, (byte) 5, var5, var11.field449, var8);
                    }
                    if (var7 == 0) {
                        PlayerEntity var16 = this.field1643[var8];
                        if ((var16.field393 & 127) == 64 && (var16.field394 & 127) == 64) {
                            for (int var17 = 0; var17 < this.field1548; ++var17) {
                                NpcEntity var20 = this.field1547[this.field1549[var17]];
                                if (var20 != null && var20.field449.field1004 == 1 && var16.field393 == var20.field393 && var16.field394 == var20.field394) {
                                    this.method460(var6, (byte) 5, var5, var20.field449, this.field1549[var17]);
                                }
                            }
                            for (int var18 = 0; var18 < this.field1644; ++var18) {
                                PlayerEntity var19 = this.field1643[this.field1645[var18]];
                                if (var19 != null && var16 != var19 && var16.field393 == var19.field393 && var16.field394 == var19.field394) {
                                    this.method495(var19, this.field1645[var18], (byte) 4, var6, var5);
                                }
                            }
                        }
                        this.method495(var16, var8, (byte) 4, var6, var5);
                    }
                    if (var7 == 3) {
                        LinkList var21 = this.field1341[this.field1636][var5][var6];
                        if (var21 != null) {
                            for (ObjStackEntity var22 = (ObjStackEntity) var21.method244(this.field1287); var22 != null; var22 = (ObjStackEntity) var21.method246((byte) 2)) {
                                ObjType var23 = ObjType.method341(var22.field491);
                                if (this.field1255 == 1) {
                                    this.field1499[this.field1268] = "Use " + this.field1259 + " with @lre@" + var23.field1040;
                                    this.field1564[this.field1268] = 111;
                                    this.field1565[this.field1268] = var22.field491;
                                    this.field1562[this.field1268] = var5;
                                    this.field1563[this.field1268] = var6;
                                    ++this.field1268;
                                } else if (this.field1226 == 1) {
                                    if ((this.field1228 & 1) == 1) {
                                        this.field1499[this.field1268] = this.field1229 + " @lre@" + var23.field1040;
                                        this.field1564[this.field1268] = 370;
                                        this.field1565[this.field1268] = var22.field491;
                                        this.field1562[this.field1268] = var5;
                                        this.field1563[this.field1268] = var6;
                                        ++this.field1268;
                                    }
                                } else {
                                    for (int var24 = 4; var24 >= 0; --var24) {
                                        if (var23.field1054 != null && var23.field1054[var24] != null) {
                                            this.field1499[this.field1268] = var23.field1054[var24] + " @lre@" + var23.field1040;
                                            if (var24 == 0) {
                                                this.field1564[this.field1268] = 139;
                                            }
                                            if (var24 == 1) {
                                                this.field1564[this.field1268] = 778;
                                            }
                                            if (var24 == 2) {
                                                this.field1564[this.field1268] = 617;
                                            }
                                            if (var24 == 3) {
                                                this.field1564[this.field1268] = 224;
                                            }
                                            if (var24 == 4) {
                                                this.field1564[this.field1268] = 662;
                                            }
                                            this.field1565[this.field1268] = var22.field491;
                                            this.field1562[this.field1268] = var5;
                                            this.field1563[this.field1268] = var6;
                                            ++this.field1268;
                                        } else if (var24 == 2) {
                                            this.field1499[this.field1268] = "Take @lre@" + var23.field1040;
                                            this.field1564[this.field1268] = 617;
                                            this.field1565[this.field1268] = var22.field491;
                                            this.field1562[this.field1268] = var5;
                                            this.field1563[this.field1268] = var6;
                                            ++this.field1268;
                                        }
                                    }
                                    this.field1499[this.field1268] = "Examine @lre@" + var23.field1040;
                                    this.field1564[this.field1268] = 1152;
                                    this.field1565[this.field1268] = var22.field491;
                                    this.field1562[this.field1268] = var5;
                                    this.field1563[this.field1268] = var6;
                                    ++this.field1268;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method481(byte arg0) {
        for (int var2 = -1; var2 < this.field1644; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1642;
            } else {
                var6 = this.field1645[var2];
            }
            PlayerEntity var7 = this.field1643[var6];
            if (var7 != null && var7.field406 > 0) {
                --var7.field406;
                if (var7.field406 == 0) {
                    var7.field405 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1548; ++var3) {
            int var4 = this.field1549[var3];
            NpcEntity var5 = this.field1547[var4];
            if (var5 != null && var5.field406 > 0) {
                --var5.field406;
                if (var5.field406 == 0) {
                    var5.field405 = null;
                }
            }
        }
        if (arg0 == 105) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        if (!arg0) {
            if (super.field28 == 1) {
                if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field1346[0] != -1) {
                    this.field1253 = true;
                    this.field1482 = 0;
                    this.field1458 = true;
                }
                if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field1346[1] != -1) {
                    this.field1253 = true;
                    this.field1482 = 1;
                    this.field1458 = true;
                }
                if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field1346[2] != -1) {
                    this.field1253 = true;
                    this.field1482 = 2;
                    this.field1458 = true;
                }
                if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field1346[3] != -1) {
                    this.field1253 = true;
                    this.field1482 = 3;
                    this.field1458 = true;
                }
                if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field1346[4] != -1) {
                    this.field1253 = true;
                    this.field1482 = 4;
                    this.field1458 = true;
                }
                if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field1346[5] != -1) {
                    this.field1253 = true;
                    this.field1482 = 5;
                    this.field1458 = true;
                }
                if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field1346[6] != -1) {
                    this.field1253 = true;
                    this.field1482 = 6;
                    this.field1458 = true;
                }
                if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field1346[7] != -1) {
                    this.field1253 = true;
                    this.field1482 = 7;
                    this.field1458 = true;
                }
                if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field1346[8] != -1) {
                    this.field1253 = true;
                    this.field1482 = 8;
                    this.field1458 = true;
                }
                if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field1346[9] != -1) {
                    this.field1253 = true;
                    this.field1482 = 9;
                    this.field1458 = true;
                }
                if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field1346[10] != -1) {
                    this.field1253 = true;
                    this.field1482 = 10;
                    this.field1458 = true;
                }
                if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field1346[11] != -1) {
                    this.field1253 = true;
                    this.field1482 = 11;
                    this.field1458 = true;
                }
                if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field1346[12] != -1) {
                    this.field1253 = true;
                    this.field1482 = 12;
                    this.field1458 = true;
                }
                if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field1346[13] != -1) {
                    this.field1253 = true;
                    this.field1482 = 13;
                    this.field1458 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method483(int arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1313.method243(); var2 != null; var2 = (ProjectileEntity) this.field1313.method245(30869)) {
            if (this.field1636 == var2.field496 && field1610 <= var2.field502) {
                if (field1610 >= var2.field501) {
                    if (var2.field505 > 0) {
                        NpcEntity var5 = this.field1547[var2.field505 - 1];
                        if (var5 != null && var5.field393 >= 0 && var5.field393 < 13312 && var5.field394 >= 0 && var5.field394 < 13312) {
                            var2.method119(this.method525(var2.field496, var5.field393, (byte) -51, var5.field394) - var2.field500, field1610, var5.field394, var5.field393, -126);
                        }
                    }
                    if (var2.field505 < 0) {
                        int var6 = -var2.field505 - 1;
                        PlayerEntity var7;
                        if (this.field1534 == var6) {
                            var7 = field1311;
                        } else {
                            var7 = this.field1643[var6];
                        }
                        if (var7 != null && var7.field393 >= 0 && var7.field393 < 13312 && var7.field394 >= 0 && var7.field394 < 13312) {
                            var2.method119(this.method525(var2.field496, var7.field393, (byte) -51, var7.field394) - var2.field500, field1610, var7.field394, var7.field393, -126);
                        }
                    }
                    var2.method120(this.field1438, this.field1222);
                    this.field1314.method61(var2.field515, (int) var2.field508, false, (int) var2.field507, true, (int) var2.field509, var2, this.field1636, 60, -1);
                }
            } else {
                var2.method106();
            }
        }
        ++field1626;
        int var3 = 27 / arg0;
        if (field1626 > 1174) {
            field1626 = 0;
            this.field1324.method213(51, (byte) 48);
            this.field1324.method214(0);
            int var4 = this.field1324.field702;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1324.method215(11499);
            }
            this.field1324.method215(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1324.method214(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1324.method214(94);
            }
            this.field1324.method215(51693);
            this.field1324.method214(16);
            this.field1324.method215(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1324.method214(65);
            }
            this.field1324.method214((int) (Math.random() * 256.0D));
            this.field1324.method215(22990);
            this.field1324.method223(this.field1324.field702 - var4, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 < 7 || arg6 > 7) {
            this.field1341 = null;
        }
        if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
            if (field1464 && this.field1636 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg1 == 0) {
                var9 = this.field1314.method76(arg2, arg4, arg3);
            }
            if (arg1 == 1) {
                var9 = this.field1314.method77(arg2, arg4, (byte) 79, arg3);
            }
            if (arg1 == 2) {
                var9 = this.field1314.method78(arg2, arg4, arg3);
            }
            if (arg1 == 3) {
                var9 = this.field1314.method79(arg2, arg4, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1314.method80(arg2, arg4, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg1 == 0) {
                    this.field1314.method67((byte) 4, arg4, arg2, arg3);
                    LocType var17 = LocType.method325(var14);
                    if (var17.field958) {
                        this.field1280[arg2].method357(var15, arg4, var16, arg3, 0, var17.field959);
                    }
                }
                if (arg1 == 1) {
                    this.field1314.method68(arg2, arg4, -139, arg3);
                }
                if (arg1 == 2) {
                    this.field1314.method69(arg2, arg4, -23, arg3);
                    LocType var18 = LocType.method325(var14);
                    if (var18.field956 + arg4 > 103 || var18.field956 + arg3 > 103 || var18.field957 + arg4 > 103 || var18.field957 + arg3 > 103) {
                        return;
                    }
                    if (var18.field958) {
                        this.field1280[arg2].method358(false, arg3, var18.field957, var16, arg4, var18.field959, var18.field956);
                    }
                }
                if (arg1 == 3) {
                    this.field1314.method70(arg2, arg4, -276, arg3);
                    LocType var19 = LocType.method325(var14);
                    if (var19.field958 && var19.field960) {
                        this.field1280[arg2].method360(arg3, arg4, 7);
                    }
                }
            }
            if (arg0 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field1558[1][arg4][arg3] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                World.method31(arg2, arg4, arg0, arg5, this.field1314, this.field1280[arg2], var20, arg7, arg3, this.field1454, (byte) -6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method485(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method235(0, 8);
        if (var4 < this.field1644) {
            for (int var5 = var4; var5 < this.field1644; ++var5) {
                this.field1456[this.field1455++] = this.field1645[var5];
            }
        }
        if (var4 > this.field1644) {
            signlink.reporterror(this.field1294 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1644 = 0;
            while (arg2 >= 0) {
                this.field1417 = !this.field1417;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1645[var6];
                PlayerEntity var8 = this.field1643[var7];
                int var9 = arg1.method235(0, 1);
                if (var9 == 0) {
                    this.field1645[this.field1644++] = var7;
                    var8.field438 = field1610;
                } else {
                    int var10 = arg1.method235(0, 2);
                    if (var10 == 0) {
                        this.field1645[this.field1644++] = var7;
                        var8.field438 = field1610;
                        this.field1647[this.field1646++] = var7;
                    } else if (var10 == 1) {
                        this.field1645[this.field1644++] = var7;
                        var8.field438 = field1610;
                        int var11 = arg1.method235(0, 3);
                        var8.method111(var11, 591, false);
                        int var12 = arg1.method235(0, 1);
                        if (var12 == 1) {
                            this.field1647[this.field1646++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1645[this.field1644++] = var7;
                        var8.field438 = field1610;
                        int var13 = arg1.method235(0, 3);
                        var8.method111(var13, 591, true);
                        int var14 = arg1.method235(0, 3);
                        var8.method111(var14, 591, true);
                        int var15 = arg1.method235(0, 1);
                        if (var15 == 1) {
                            this.field1647[this.field1646++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1456[this.field1455++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method486(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1664) {
                this.field1664 = false;
                this.field1336 = true;
            }
            int var3 = this.field1562[arg1];
            int var4 = this.field1563[arg1];
            int var5 = this.field1564[arg1];
            int var6 = this.field1565[arg1];
            if (arg0 == 0) {
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 737) {
                    this.method450(-48789);
                }
                if (var5 == 111) {
                    boolean var7 = this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 0, field1311.field443[0], 0, 0, 0);
                    if (!var7) {
                        this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 1, field1311.field443[0], 0, 0, 1);
                    }
                    this.field1500 = super.field29;
                    this.field1501 = super.field30;
                    this.field1503 = 2;
                    this.field1502 = 0;
                    this.field1324.method213(245, (byte) 48);
                    this.field1324.method215(this.field1393 + var3);
                    this.field1324.method215(this.field1394 + var4);
                    this.field1324.method215(var6);
                    this.field1324.method215(this.field1258);
                    this.field1324.method215(this.field1256);
                    this.field1324.method215(this.field1257);
                }
                if (var5 == 810 && this.method520(var4, var3, 240, var6, -21331)) {
                    this.field1324.method215(this.field1258);
                    this.field1324.method215(this.field1256);
                    this.field1324.method215(this.field1257);
                }
                if (var5 == 1328) {
                    ObjType var9 = ObjType.method341(var6);
                    Component var10 = Component.field70[var4];
                    String var11;
                    if (var10 != null && var10.field72[var3] >= 100000) {
                        var11 = var10.field72[var3] + " x " + var9.field1040;
                    } else if (var9.field1041 != null) {
                        var11 = new String(var9.field1041);
                    } else {
                        var11 = "It's a " + var9.field1040 + ".";
                    }
                    this.method526(-638, 0, var11, "");
                }
                if (var5 == 231) {
                    Component var12 = Component.field70[var4];
                    boolean var13 = true;
                    if (var12.field79 > 0) {
                        var13 = this.method472(var12, -805);
                    }
                    if (var13) {
                        this.field1324.method213(244, (byte) 48);
                        this.field1324.method215(var4);
                    }
                }
                if (var5 == 563) {
                    this.field1324.method213(102, (byte) 48);
                    this.field1324.method215(var6);
                    this.field1324.method215(var3);
                    this.field1324.method215(var4);
                    this.field1324.method215(this.field1227);
                    this.field1508 = 0;
                    this.field1509 = var4;
                    this.field1510 = var3;
                    this.field1511 = 2;
                    if (Component.field70[var4].field76 == this.field1481) {
                        this.field1511 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1465) {
                        this.field1511 = 3;
                    }
                }
                if (var5 == 1152) {
                    ObjType var14 = ObjType.method341(var6);
                    String var15;
                    if (var14.field1041 != null) {
                        var15 = new String(var14.field1041);
                    } else {
                        var15 = "It's a " + var14.field1040 + ".";
                    }
                    this.method526(-638, 0, var15, "");
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 331) {
                        this.field1324.method213(160, (byte) 48);
                    }
                    if (var5 == 113) {
                        this.field1324.method213(70, (byte) 48);
                    }
                    if (var5 == 555) {
                        this.field1324.method213(59, (byte) 48);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1445;
                        }
                        if (field1445 >= 133) {
                            this.field1324.method213(131, (byte) 48);
                            this.field1324.method215(6118);
                        }
                        this.field1324.method213(181, (byte) 48);
                    }
                    if (var5 == 354) {
                        this.field1324.method213(62, (byte) 48);
                    }
                    this.field1324.method215(var6);
                    this.field1324.method215(var3);
                    this.field1324.method215(var4);
                    this.field1508 = 0;
                    this.field1509 = var4;
                    this.field1510 = var3;
                    this.field1511 = 2;
                    if (Component.field70[var4].field76 == this.field1481) {
                        this.field1511 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1465) {
                        this.field1511 = 3;
                    }
                }
                if (var5 == 1381) {
                    int var16 = var6 >> 14 & 32767;
                    LocType var17 = LocType.method325(var16);
                    String var18;
                    if (var17.field953 != null) {
                        var18 = new String(var17.field953);
                    } else {
                        var18 = "It's a " + var17.field952 + ".";
                    }
                    this.method526(-638, 0, var18, "");
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var19 = this.field1547[var6];
                    if (var19 != null) {
                        this.method429(var19.field444[0], 1, 2, field1311.field444[0], 0, false, var19.field443[0], 1, field1311.field443[0], 0, 0, 1);
                        this.field1500 = super.field29;
                        this.field1501 = super.field30;
                        this.field1503 = 2;
                        this.field1502 = 0;
                        if (var5 == 309) {
                            this.field1324.method213(69, (byte) 48);
                        }
                        if (var5 == 242) {
                            this.field1324.method213(143, (byte) 48);
                        }
                        if (var5 == 852) {
                            this.field1324.method213(122, (byte) 48);
                        }
                        if (var5 == 209) {
                            this.field1324.method213(195, (byte) 48);
                        }
                        if (var5 == 793) {
                            this.field1324.method213(118, (byte) 48);
                        }
                        this.field1324.method215(var6);
                    }
                }
                if (var5 == 102) {
                    this.field1255 = 1;
                    this.field1256 = var3;
                    this.field1257 = var4;
                    this.field1258 = var6;
                    this.field1259 = ObjType.method341(var6).field1040;
                    this.field1226 = 0;
                    this.field1253 = true;
                } else {
                    if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                        if (var5 == 100) {
                            this.field1324.method213(74, (byte) 48);
                        }
                        if (var5 == 694) {
                            this.field1324.method213(243, (byte) 48);
                        }
                        if (var5 == 681) {
                            ++field1666;
                            if (field1666 >= 116) {
                                this.field1324.method213(162, (byte) 48);
                                this.field1324.method217(13018169);
                            }
                            this.field1324.method213(163, (byte) 48);
                        }
                        if (var5 == 962) {
                            this.field1324.method213(228, (byte) 48);
                        }
                        if (var5 == 795) {
                            this.field1324.method213(80, (byte) 48);
                        }
                        this.field1324.method215(var6);
                        this.field1324.method215(var3);
                        this.field1324.method215(var4);
                        this.field1508 = 0;
                        this.field1509 = var4;
                        this.field1510 = var3;
                        this.field1511 = 2;
                        if (Component.field70[var4].field76 == this.field1481) {
                            this.field1511 = 1;
                        }
                        if (Component.field70[var4].field76 == this.field1465) {
                            this.field1511 = 3;
                        }
                    }
                    if (var5 == 370) {
                        boolean var20 = this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 0, field1311.field443[0], 0, 0, 0);
                        if (!var20) {
                            this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 1, field1311.field443[0], 0, 0, 1);
                        }
                        this.field1500 = super.field29;
                        this.field1501 = super.field30;
                        this.field1503 = 2;
                        this.field1502 = 0;
                        this.field1324.method213(202, (byte) 48);
                        this.field1324.method215(this.field1393 + var3);
                        this.field1324.method215(this.field1394 + var4);
                        this.field1324.method215(var6);
                        this.field1324.method215(this.field1227);
                    }
                    if (var5 == 225) {
                        this.field1324.method213(244, (byte) 48);
                        this.field1324.method215(var4);
                        Component var22 = Component.field70[var4];
                        if (var22.field85 != null && var22.field85[0][0] == 5) {
                            int var23 = var22.field85[0][1];
                            if (this.field1332[var23] != var22.field87[0]) {
                                this.field1332[var23] = var22.field87[0];
                                this.method535(var23, -742);
                                this.field1253 = true;
                            }
                        }
                    }
                    if (var5 == 625) {
                        this.method520(var4, var3, 33, var6, -21331);
                    }
                    if (var5 == 718) {
                        if (!this.field1439) {
                            this.field1314.method88(super.field30 - 4, (byte) 9, super.field29 - 4);
                        } else {
                            this.field1314.method88(var4 - 4, (byte) 9, var3 - 4);
                        }
                    }
                    if (var5 == 275) {
                        PlayerEntity var24 = this.field1643[var6];
                        if (var24 != null) {
                            this.method429(var24.field444[0], 1, 2, field1311.field444[0], 0, false, var24.field443[0], 1, field1311.field443[0], 0, 0, 1);
                            this.field1500 = super.field29;
                            this.field1501 = super.field30;
                            this.field1503 = 2;
                            this.field1502 = 0;
                            this.field1324.method213(113, (byte) 48);
                            this.field1324.method215(var6);
                            this.field1324.method215(this.field1258);
                            this.field1324.method215(this.field1256);
                            this.field1324.method215(this.field1257);
                        }
                    }
                    if (var5 == 721) {
                        field1333 += var4;
                        if (field1333 >= 139) {
                            this.field1324.method213(28, (byte) 48);
                            this.field1324.method218(0);
                        }
                        this.method520(var4, var3, 213, var6, -21331);
                    }
                    if (var5 == 899 && this.method520(var4, var3, 26, var6, -21331)) {
                        this.field1324.method215(this.field1227);
                    }
                    if (var5 == 743) {
                        ++field1364;
                        if (field1364 >= 124) {
                            this.field1324.method213(77, (byte) 48);
                            this.field1324.method215(37954);
                        }
                        this.method520(var4, var3, 98, var6, -21331);
                    }
                    if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                        PlayerEntity var25 = this.field1643[var6];
                        if (var25 != null) {
                            this.method429(var25.field444[0], 1, 2, field1311.field444[0], 0, false, var25.field443[0], 1, field1311.field443[0], 0, 0, 1);
                            this.field1500 = super.field29;
                            this.field1501 = super.field30;
                            this.field1503 = 2;
                            this.field1502 = 0;
                            if (var5 == 499) {
                                this.field1324.method213(17, (byte) 48);
                            }
                            if (var5 == 639) {
                                ++field1376;
                                if (field1376 >= 52) {
                                    this.field1324.method213(121, (byte) 48);
                                    this.field1324.method214(131);
                                }
                                this.field1324.method213(192, (byte) 48);
                            }
                            if (var5 == 27) {
                                this.field1324.method213(18, (byte) 48);
                            }
                            if (var5 == 387) {
                                field1504 += var6;
                                if (field1504 >= 66) {
                                    this.field1324.method213(233, (byte) 48);
                                    this.field1324.method214(154);
                                }
                                this.field1324.method213(72, (byte) 48);
                            }
                            if (var5 == 185) {
                                this.field1324.method213(230, (byte) 48);
                            }
                            this.field1324.method215(var6);
                        }
                    }
                    if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                        String var26 = this.field1499[arg1];
                        int var27 = var26.indexOf("@whi@");
                        if (var27 != -1) {
                            long var28 = JString.method295(var26.substring(var27 + 5).trim());
                            if (var5 == 605) {
                                this.method478(18804, var28);
                            }
                            if (var5 == 47) {
                                this.method487(0, var28);
                            }
                            if (var5 == 513) {
                                this.method447(var28, -964);
                            }
                            if (var5 == 884) {
                                this.method458(var28, 604);
                            }
                        }
                    }
                    if (var5 == 435) {
                        this.field1324.method213(244, (byte) 48);
                        this.field1324.method215(var4);
                        Component var30 = Component.field70[var4];
                        if (var30.field85 != null && var30.field85[0][0] == 5) {
                            int var31 = var30.field85[0][1];
                            this.field1332[var31] = 1 - this.field1332[var31];
                            this.method535(var31, -742);
                            this.field1253 = true;
                        }
                    }
                    if (var5 == 131) {
                        PlayerEntity var32 = this.field1643[var6];
                        if (var32 != null) {
                            this.method429(var32.field444[0], 1, 2, field1311.field444[0], 0, false, var32.field443[0], 1, field1311.field443[0], 0, 0, 1);
                            this.field1500 = super.field29;
                            this.field1501 = super.field30;
                            this.field1503 = 2;
                            this.field1502 = 0;
                            this.field1324.method213(68, (byte) 48);
                            this.field1324.method215(var6);
                            this.field1324.method215(this.field1227);
                        }
                    }
                    if (var5 == 274) {
                        Component var33 = Component.field70[var4];
                        this.field1226 = 1;
                        this.field1227 = var4;
                        this.field1228 = var33.field130;
                        this.field1255 = 0;
                        this.field1253 = true;
                        String var34 = var33.field128;
                        if (var34.indexOf(" ") != -1) {
                            var34 = var34.substring(0, var34.indexOf(" "));
                        }
                        String var35 = var33.field128;
                        if (var35.indexOf(" ") != -1) {
                            var35 = var35.substring(var35.indexOf(" ") + 1);
                        }
                        this.field1229 = var34 + " " + var33.field129 + " " + var35;
                        if (this.field1228 == 16) {
                            this.field1253 = true;
                            this.field1482 = 3;
                            this.field1458 = true;
                        }
                    } else {
                        if (var5 == 524) {
                            String var36 = this.field1499[arg1];
                            int var37 = var36.indexOf("@whi@");
                            if (var37 != -1) {
                                this.method450(-48789);
                                this.field1318 = var36.substring(var37 + 5).trim();
                                this.field1267 = false;
                                for (int var38 = 0; var38 < Component.field70.length; ++var38) {
                                    if (Component.field70[var38] != null && Component.field70[var38].field79 == 600) {
                                        this.field1594 = this.field1481 = Component.field70[var38].field76;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var5 == 357) {
                            this.method520(var4, var3, 87, var6, -21331);
                        }
                        if (var5 == 1071) {
                            this.method520(var4, var3, 147, var6, -21331);
                        }
                        if (var5 == 240) {
                            NpcEntity var39 = this.field1547[var6];
                            if (var39 != null) {
                                this.method429(var39.field444[0], 1, 2, field1311.field444[0], 0, false, var39.field443[0], 1, field1311.field443[0], 0, 0, 1);
                                this.field1500 = super.field29;
                                this.field1501 = super.field30;
                                this.field1503 = 2;
                                this.field1502 = 0;
                                this.field1324.method213(231, (byte) 48);
                                this.field1324.method215(var6);
                                this.field1324.method215(this.field1227);
                            }
                        }
                        if (var5 == 1714) {
                            NpcEntity var40 = this.field1547[var6];
                            if (var40 != null) {
                                String var41;
                                if (var40.field449.field1003 != null) {
                                    var41 = new String(var40.field449.field1003);
                                } else {
                                    var41 = "It's a " + var40.field449.field1002 + ".";
                                }
                                this.method526(-638, 0, var41, "");
                            }
                        }
                        if (var5 == 902) {
                            String var42 = this.field1499[arg1];
                            int var43 = var42.indexOf("@whi@");
                            if (var43 != -1) {
                                long var44 = JString.method295(var42.substring(var43 + 5).trim());
                                int var46 = -1;
                                for (int var47 = 0; var47 < this.field1415; ++var47) {
                                    if (this.field1221[var47] == var44) {
                                        var46 = var47;
                                        break;
                                    }
                                }
                                if (var46 != -1 && this.field1326[var46] > 0) {
                                    this.field1336 = true;
                                    this.field1664 = false;
                                    this.field1357 = true;
                                    this.field1447 = "";
                                    this.field1225 = 3;
                                    this.field1519 = this.field1221[var46];
                                    this.field1432 = "Enter message to send to " + this.field1285[var46];
                                }
                            }
                        }
                        if (var5 == 507 || var5 == 957) {
                            String var48 = this.field1499[arg1];
                            int var49 = var48.indexOf("@whi@");
                            if (var49 != -1) {
                                String var50 = var48.substring(var49 + 5).trim();
                                String var51 = JString.method299(584, JString.method296(-206, JString.method295(var50)));
                                boolean var52 = false;
                                for (int var53 = 0; var53 < this.field1644; ++var53) {
                                    PlayerEntity var54 = this.field1643[this.field1645[var53]];
                                    if (var54 != null && var54.field455 != null && var54.field455.equalsIgnoreCase(var51)) {
                                        this.method429(var54.field444[0], 1, 2, field1311.field444[0], 0, false, var54.field443[0], 1, field1311.field443[0], 0, 0, 1);
                                        if (var5 == 507) {
                                            field1504 += var6;
                                            if (field1504 >= 66) {
                                                this.field1324.method213(233, (byte) 48);
                                                this.field1324.method214(154);
                                            }
                                            this.field1324.method213(72, (byte) 48);
                                        }
                                        if (var5 == 957) {
                                            ++field1376;
                                            if (field1376 >= 52) {
                                                this.field1324.method213(121, (byte) 48);
                                                this.field1324.method214(131);
                                            }
                                            this.field1324.method213(192, (byte) 48);
                                        }
                                        this.field1324.method215(this.field1645[var53]);
                                        var52 = true;
                                        break;
                                    }
                                }
                                if (!var52) {
                                    this.method526(-638, 0, "Unable to find " + var51, "");
                                }
                            }
                        }
                        if (var5 == 997 && !this.field1260) {
                            this.field1324.method213(146, (byte) 48);
                            this.field1324.method215(var4);
                            this.field1260 = true;
                        }
                        if (var5 == 829) {
                            NpcEntity var55 = this.field1547[var6];
                            if (var55 != null) {
                                this.method429(var55.field444[0], 1, 2, field1311.field444[0], 0, false, var55.field443[0], 1, field1311.field443[0], 0, 0, 1);
                                this.field1500 = super.field29;
                                this.field1501 = super.field30;
                                this.field1503 = 2;
                                this.field1502 = 0;
                                this.field1324.method213(119, (byte) 48);
                                this.field1324.method215(var6);
                                this.field1324.method215(this.field1258);
                                this.field1324.method215(this.field1256);
                                this.field1324.method215(this.field1257);
                            }
                        }
                        if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                            boolean var56 = this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 0, field1311.field443[0], 0, 0, 0);
                            if (!var56) {
                                this.method429(var4, 1, 2, field1311.field444[0], 0, false, var3, 1, field1311.field443[0], 0, 0, 1);
                            }
                            this.field1500 = super.field29;
                            this.field1501 = super.field30;
                            this.field1503 = 2;
                            this.field1502 = 0;
                            if (var5 == 662) {
                                field1477 += this.field1394;
                                if (field1477 >= 118) {
                                    this.field1324.method213(56, (byte) 48);
                                    this.field1324.method218(0);
                                }
                                this.field1324.method213(97, (byte) 48);
                            }
                            if (var5 == 224) {
                                field1335 += var4;
                                if (field1335 >= 75) {
                                    this.field1324.method213(206, (byte) 48);
                                    this.field1324.method214(19);
                                }
                                this.field1324.method213(47, (byte) 48);
                            }
                            if (var5 == 139) {
                                if ((var3 & 3) == 0) {
                                    ++field1524;
                                }
                                if (field1524 >= 123) {
                                    this.field1324.method213(187, (byte) 48);
                                    this.field1324.method218(0);
                                }
                                this.field1324.method213(141, (byte) 48);
                            }
                            if (var5 == 778) {
                                this.field1324.method213(67, (byte) 48);
                            }
                            if (var5 == 617) {
                                this.field1324.method213(178, (byte) 48);
                            }
                            this.field1324.method215(this.field1393 + var3);
                            this.field1324.method215(this.field1394 + var4);
                            this.field1324.method215(var6);
                        }
                        if (var5 == 398) {
                            this.field1324.method213(200, (byte) 48);
                            this.field1324.method215(var6);
                            this.field1324.method215(var3);
                            this.field1324.method215(var4);
                            this.field1324.method215(this.field1258);
                            this.field1324.method215(this.field1256);
                            this.field1324.method215(this.field1257);
                            this.field1508 = 0;
                            this.field1509 = var4;
                            this.field1510 = var3;
                            this.field1511 = 2;
                            if (Component.field70[var4].field76 == this.field1481) {
                                this.field1511 = 1;
                            }
                            if (Component.field70[var4].field76 == this.field1465) {
                                this.field1511 = 3;
                            }
                        }
                        this.field1255 = 0;
                        this.field1226 = 0;
                        this.field1253 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method487(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1615 >= 100) {
                this.method526(-638, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = JString.method299(584, JString.method296(-206, arg1));
                for (int var5 = 0; var5 < this.field1615; ++var5) {
                    if (this.field1355[var5] == arg1) {
                        this.method526(-638, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1415; ++var6) {
                    if (this.field1221[var6] == arg1) {
                        this.method526(-638, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field1355[this.field1615++] = arg1;
                this.field1253 = true;
                this.field1324.method213(189, (byte) 48);
                this.field1324.method220(arg1, true);
                this.field1234 += arg0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method488(int arg0) {
        if (this.field1368 == null) {
            this.method542(this.field1305);
            super.field15 = null;
            this.field1574 = null;
            this.field1575 = null;
            this.field1576 = null;
            this.field1577 = null;
            this.field1578 = null;
            if (arg0 <= 0) {
                this.field1324.method214(254);
            }
            this.field1579 = null;
            this.field1580 = null;
            this.field1581 = null;
            this.field1582 = null;
            this.field1368 = new PixMap(479, false, this.method11(0), 96);
            this.field1366 = new PixMap(172, false, this.method11(0), 156);
            Pix2D.method154(true);
            this.field1219.method198(0, 0, 0);
            this.field1365 = new PixMap(190, false, this.method11(0), 261);
            this.field1367 = new PixMap(512, false, this.method11(0), 334);
            Pix2D.method154(true);
            this.field1554 = new PixMap(496, false, this.method11(0), 50);
            this.field1555 = new PixMap(269, false, this.method11(0), 37);
            this.field1556 = new PixMap(249, false, this.method11(0), 45);
            this.field1542 = true;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1461 = Integer.parseInt(this.getParameter("nodeid"));
        field1462 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method432(-794);
        } else {
            method459(215);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1463 = false;
        } else {
            field1463 = true;
        }
        this.method2(503, (byte) 0, 765);
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method489(int arg0) {
        byte[] var2 = this.field1635.method294("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1577.method253(-328);
        var3.method183(-47173, 0, 0);
        this.field1578.method253(-328);
        var3.method183(-47173, 0, -637);
        this.field1574.method253(-328);
        var3.method183(-47173, 0, -128);
        this.field1575.method253(-328);
        if (arg0 != 12681) {
            this.field1235 = -1;
        }
        var3.method183(-47173, -371, -202);
        this.field1576.method253(-328);
        var3.method183(-47173, -171, -202);
        this.field1579.method253(-328);
        var3.method183(-47173, -265, 0);
        this.field1580.method253(-328);
        var3.method183(-47173, -265, -562);
        this.field1581.method253(-328);
        var3.method183(-47173, -171, -128);
        this.field1582.method253(-328);
        var3.method183(-47173, -171, -562);
        int[] var4 = new int[var3.field659];
        for (int var5 = 0; var5 < var3.field660; ++var5) {
            for (int var10 = 0; var10 < var3.field659; ++var10) {
                var4[var10] = var3.field658[var3.field659 * var5 + (var3.field659 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field659; ++var11) {
                var3.field658[var3.field659 * var5 + var11] = var4[var11];
            }
        }
        this.field1577.method253(-328);
        var3.method183(-47173, 0, 382);
        this.field1578.method253(-328);
        var3.method183(-47173, 0, -255);
        this.field1574.method253(-328);
        var3.method183(-47173, 0, 254);
        this.field1575.method253(-328);
        var3.method183(-47173, -371, 180);
        this.field1576.method253(-328);
        var3.method183(-47173, -171, 180);
        this.field1579.method253(-328);
        var3.method183(-47173, -265, 382);
        this.field1580.method253(-328);
        var3.method183(-47173, -265, -180);
        this.field1581.method253(-328);
        var3.method183(-47173, -171, 254);
        this.field1582.method253(-328);
        var3.method183(-47173, -171, -180);
        Pix32 var6 = new Pix32(this.field1635, "logo", 0);
        this.field1574.method253(-328);
        var6.method185(18, 382 - var6.field659 / 2 - 128, 0);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)Z")
    public final boolean method490(byte arg0) {
        if (arg0 != 2) {
            this.field1324.method214(187);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method491(int arg0, int arg1) {
        LinkList var3 = this.field1341[this.field1636][arg0][arg1];
        if (var3 == null) {
            this.field1314.method71(this.field1636, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method243(); var6 != null; var6 = (ObjStackEntity) var3.method245(30869)) {
                ObjType var11 = ObjType.method341(var6.field491);
                int var12 = var11.field1052;
                if (var11.field1051) {
                    var12 = (var6.field492 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method241(var5, 1);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method243(); var9 != null; var9 = (ObjStackEntity) var3.method245(30869)) {
                if (var5.field491 != var9.field491 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field491 != var9.field491 && var7.field491 != var9.field491 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1314.method57(var8, var10, this.field1636, arg0, var7, var5, this.method525(this.field1636, arg0 * 128 + 64, (byte) -51, arg1 * 128 + 64), false, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (this.field1238 > 0) {
            this.method430(this.field1611);
        } else {
            this.field1367.method253(-328);
            this.field1403.method200(257, 144, (byte) 1, 0, "Connection lost");
            this.field1403.method200(256, 143, (byte) 1, 16777215, "Connection lost");
            this.field1403.method200(257, 159, (byte) 1, 0, "Please wait - attempting to reestablish");
            this.field1403.method200(256, 158, (byte) 1, 16777215, "Please wait - attempting to reestablish");
            if (arg0 != -35099) {
                this.field1235 = this.field1388.method224();
            }
            this.field1367.method254(4, 4, super.field14, -884);
            this.field1551 = 0;
            ClientStream var2 = this.field1573;
            this.field1512 = false;
            this.method546(this.field1294, this.field1295, true);
            if (!this.field1512) {
                this.method430(this.field1611);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field1279;
        if (!arg0) {
            if (field1279 > 192) {
                field1279 = 0;
                this.field1324.method213(226, (byte) 48);
                this.field1324.method214(232);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5(false);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1481 != -1 && this.field1594 == this.field1481) {
                            if (var2 == 8 && this.field1318.length() > 0) {
                                this.field1318 = this.field1318.substring(0, this.field1318.length() - 1);
                            }
                            break;
                        }
                        if (this.field1357) {
                            if (var2 >= 32 && var2 <= 122 && this.field1447.length() < 80) {
                                this.field1447 = this.field1447 + (char) var2;
                                this.field1336 = true;
                            }
                            if (var2 == 8 && this.field1447.length() > 0) {
                                this.field1447 = this.field1447.substring(0, this.field1447.length() - 1);
                                this.field1336 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1357 = false;
                                this.field1336 = true;
                                if (this.field1225 == 1) {
                                    long var3 = JString.method295(this.field1447);
                                    this.method478(18804, var3);
                                }
                                if (this.field1225 == 2 && this.field1415 > 0) {
                                    long var5 = JString.method295(this.field1447);
                                    this.method447(var5, -964);
                                }
                                if (this.field1225 == 3 && this.field1447.length() > 0) {
                                    this.field1324.method213(214, (byte) 48);
                                    this.field1324.method214(0);
                                    int var7 = this.field1324.field702;
                                    this.field1324.method220(this.field1519, true);
                                    WordPack.method303(this.field1310, this.field1324, this.field1447);
                                    this.field1324.method223(this.field1324.field702 - var7, 0);
                                    this.field1447 = JString.method300(this.field1447, 0);
                                    this.field1447 = WordFilter.method394(this.field1447, this.field1490);
                                    this.method526(-638, 6, this.field1447, JString.method299(584, JString.method296(-206, this.field1519)));
                                    if (this.field1278 == 2) {
                                        this.field1278 = 1;
                                        this.field1514 = true;
                                        this.field1324.method213(129, (byte) 48);
                                        this.field1324.method214(this.field1370);
                                        this.field1324.method214(this.field1278);
                                        this.field1324.method214(this.field1520);
                                    }
                                }
                                if (this.field1225 == 4 && this.field1615 < 100) {
                                    long var8 = JString.method295(this.field1447);
                                    this.method487(0, var8);
                                }
                                if (this.field1225 == 5 && this.field1615 > 0) {
                                    long var10 = JString.method295(this.field1447);
                                    this.method458(var10, 604);
                                }
                            }
                        } else if (this.field1664) {
                            if (var2 >= 48 && var2 <= 57 && this.field1550.length() < 10) {
                                this.field1550 = this.field1550 + (char) var2;
                                this.field1336 = true;
                            }
                            if (var2 == 8 && this.field1550.length() > 0) {
                                this.field1550 = this.field1550.substring(0, this.field1550.length() - 1);
                                this.field1336 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1550.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1550);
                                    } catch (Exception var17) {
                                    }
                                    this.field1324.method213(161, (byte) 48);
                                    this.field1324.method218(var12);
                                }
                                this.field1664 = false;
                                this.field1336 = true;
                            }
                        } else if (this.field1465 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1602.length() < 80) {
                                this.field1602 = this.field1602 + (char) var2;
                                this.field1336 = true;
                            }
                            if (var2 == 8 && this.field1602.length() > 0) {
                                this.field1602 = this.field1602.substring(0, this.field1602.length() - 1);
                                this.field1336 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1602.length() > 0) {
                                if (this.field1561 == 2) {
                                    if (this.field1602.equals("::clientdrop")) {
                                        this.method492(-35099);
                                    }
                                    if (this.field1602.equals("::lag")) {
                                        this.method517(740);
                                    }
                                    if (this.field1602.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field1583.method267(-561, 2); ++var13) {
                                            this.field1583.method277(2, var13, (byte) 1, 954);
                                        }
                                    }
                                }
                                if (this.field1602.startsWith("::")) {
                                    this.field1324.method213(86, (byte) 48);
                                    this.field1324.method214(this.field1602.length() - 1);
                                    this.field1324.method221(this.field1602.substring(2));
                                } else {
                                    byte var14 = 0;
                                    if (this.field1602.startsWith("yellow:")) {
                                        var14 = 0;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    if (this.field1602.startsWith("red:")) {
                                        var14 = 1;
                                        this.field1602 = this.field1602.substring(4);
                                    }
                                    if (this.field1602.startsWith("green:")) {
                                        var14 = 2;
                                        this.field1602 = this.field1602.substring(6);
                                    }
                                    if (this.field1602.startsWith("cyan:")) {
                                        var14 = 3;
                                        this.field1602 = this.field1602.substring(5);
                                    }
                                    if (this.field1602.startsWith("purple:")) {
                                        var14 = 4;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    if (this.field1602.startsWith("white:")) {
                                        var14 = 5;
                                        this.field1602 = this.field1602.substring(6);
                                    }
                                    if (this.field1602.startsWith("flash1:")) {
                                        var14 = 6;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    if (this.field1602.startsWith("flash2:")) {
                                        var14 = 7;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    if (this.field1602.startsWith("flash3:")) {
                                        var14 = 8;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    if (this.field1602.startsWith("glow1:")) {
                                        var14 = 9;
                                        this.field1602 = this.field1602.substring(6);
                                    }
                                    if (this.field1602.startsWith("glow2:")) {
                                        var14 = 10;
                                        this.field1602 = this.field1602.substring(6);
                                    }
                                    if (this.field1602.startsWith("glow3:")) {
                                        var14 = 11;
                                        this.field1602 = this.field1602.substring(6);
                                    }
                                    byte var15 = 0;
                                    if (this.field1602.startsWith("wave:")) {
                                        var15 = 1;
                                        this.field1602 = this.field1602.substring(5);
                                    }
                                    if (this.field1602.startsWith("scroll:")) {
                                        var15 = 2;
                                        this.field1602 = this.field1602.substring(7);
                                    }
                                    this.field1324.method213(83, (byte) 48);
                                    this.field1324.method214(0);
                                    int var16 = this.field1324.field702;
                                    this.field1324.method214(var14);
                                    this.field1324.method214(var15);
                                    WordPack.method303(this.field1310, this.field1324, this.field1602);
                                    this.field1324.method223(this.field1324.field702 - var16, 0);
                                    this.field1602 = JString.method300(this.field1602, 0);
                                    this.field1602 = WordFilter.method394(this.field1602, this.field1490);
                                    field1311.field405 = this.field1602;
                                    field1311.field407 = var14;
                                    field1311.field408 = var15;
                                    field1311.field406 = 150;
                                    if (this.field1561 == 2) {
                                        this.method526(-638, 2, field1311.field405, "@cr2@" + field1311.field455);
                                    } else if (this.field1561 == 1) {
                                        this.method526(-638, 2, field1311.field405, "@cr1@" + field1311.field455);
                                    } else {
                                        this.method526(-638, 2, field1311.field405, field1311.field455);
                                    }
                                    if (this.field1370 == 2) {
                                        this.field1370 = 3;
                                        this.field1514 = true;
                                        this.field1324.method213(129, (byte) 48);
                                        this.field1324.method214(this.field1370);
                                        this.field1324.method214(this.field1278);
                                        this.field1324.method214(this.field1520);
                                    }
                                }
                                this.field1602 = "";
                                this.field1336 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1318.length() < 12) {
                    this.field1318 = this.field1318 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method494(int arg0, int arg1) {
        if (arg0 != 3) {
            field1596 = !field1596;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lab;IBII)V")
    public final void method495(PlayerEntity arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == 4) {
            boolean var6 = false;
        } else {
            field1539 = !field1539;
        }
        if (field1311 != arg0) {
            if (this.field1268 < 400) {
                String var7;
                if (arg0.field462 == 0) {
                    var7 = arg0.field455 + method468(arg0.field461, field1311.field461, this.field1529) + " (level-" + arg0.field461 + ")";
                } else {
                    var7 = arg0.field455 + " (skill-" + arg0.field462 + ")";
                }
                if (this.field1255 == 1) {
                    this.field1499[this.field1268] = "Use " + this.field1259 + " with @whi@" + var7;
                    this.field1564[this.field1268] = 275;
                    this.field1565[this.field1268] = arg1;
                    this.field1562[this.field1268] = arg4;
                    this.field1563[this.field1268] = arg3;
                    ++this.field1268;
                } else if (this.field1226 == 1) {
                    if ((this.field1228 & 8) == 8) {
                        this.field1499[this.field1268] = this.field1229 + " @whi@" + var7;
                        this.field1564[this.field1268] = 131;
                        this.field1565[this.field1268] = arg1;
                        this.field1562[this.field1268] = arg4;
                        this.field1563[this.field1268] = arg3;
                        ++this.field1268;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field1353[var8] != null) {
                            this.field1499[this.field1268] = this.field1353[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field1353[var8].equalsIgnoreCase("attack")) {
                                if (arg0.field461 > field1311.field461) {
                                    var10 = 2000;
                                }
                            } else if (this.field1354[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field1564[this.field1268] = var10 + 639;
                            }
                            if (var8 == 1) {
                                this.field1564[this.field1268] = var10 + 499;
                            }
                            if (var8 == 2) {
                                this.field1564[this.field1268] = var10 + 27;
                            }
                            if (var8 == 3) {
                                this.field1564[this.field1268] = var10 + 387;
                            }
                            if (var8 == 4) {
                                this.field1564[this.field1268] = var10 + 185;
                            }
                            this.field1565[this.field1268] = arg1;
                            this.field1562[this.field1268] = arg4;
                            this.field1563[this.field1268] = arg3;
                            ++this.field1268;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field1268; ++var9) {
                    if (this.field1564[var9] == 718) {
                        this.field1499[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method496(int arg0) {
        short var2 = 256;
        if (arg0 == 7) {
            for (int var3 = 10; var3 < 117; ++var3) {
                int var18 = (int) (Math.random() * 100.0D);
                if (var18 < 50) {
                    this.field1379[(var2 - 2 << 7) + var3] = 255;
                }
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                int var15 = (int) (Math.random() * 124.0D) + 2;
                int var16 = (int) (Math.random() * 128.0D) + 128;
                int var17 = (var16 << 7) + var15;
                this.field1379[var17] = 192;
            }
            for (int var5 = 1; var5 < var2 - 1; ++var5) {
                for (int var13 = 1; var13 < 127; ++var13) {
                    int var14 = (var5 << 7) + var13;
                    this.field1380[var14] = (this.field1379[var14 - 1] + this.field1379[var14 + 1] + this.field1379[var14 - 128] + this.field1379[var14 + 128]) / 4;
                }
            }
            this.field1358 += 128;
            if (this.field1358 > this.field1232.length) {
                this.field1358 -= this.field1232.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method479(602, this.field1659[var6]);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field1380[var11 + 128] - this.field1232[this.field1358 + var11 & this.field1232.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field1379[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field1250[var8] = this.field1250[var8 + 1];
            }
            this.field1250[var2 - 1] = (int) (Math.sin((double) field1610 / 14.0D) * 16.0D + Math.sin((double) field1610 / 15.0D) * 14.0D + Math.sin((double) field1610 / 16.0D) * 12.0D);
            if (this.field1586 > 0) {
                this.field1586 -= 4;
            }
            if (this.field1587 > 0) {
                this.field1587 -= 4;
            }
            if (this.field1586 == 0 && this.field1587 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field1586 = 1024;
                }
                if (var9 == 1) {
                    this.field1587 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)V")
    public final void method497(boolean arg0, Component arg1) {
        if (arg0) {
            this.field1282 = this.field1478.method290();
        }
        int var3 = arg1.field79;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1415;
                if (this.field1416 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field111 = "";
                    arg1.field78 = 0;
                } else {
                    if (this.field1326[var3] == 0) {
                        arg1.field111 = "@red@Offline";
                    } else if (this.field1326[var3] == field1461) {
                        arg1.field111 = "@gre@World-" + (this.field1326[var3] - 9);
                    } else {
                        arg1.field111 = "@yel@World-" + (this.field1326[var3] - 9);
                    }
                    arg1.field78 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1415;
                if (this.field1416 != 2) {
                    var6 = 0;
                }
                arg1.field89 = var6 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1615) {
                    arg1.field111 = "";
                    arg1.field78 = 0;
                } else {
                    arg1.field111 = JString.method299(584, JString.method296(-206, this.field1355[var3]));
                    arg1.field78 = 1;
                }
            } else if (var3 == 503) {
                arg1.field89 = this.field1615 * 15 + 20;
                if (arg1.field89 <= arg1.field81) {
                    arg1.field89 = arg1.field81 + 1;
                }
            } else if (var3 == 327) {
                arg1.field126 = 150;
                arg1.field127 = (int) (Math.sin((double) field1610 / 40.0D) * 256.0D) & 2047;
                if (this.field1522) {
                    for (int var7 = 0; var7 < 7; ++var7) {
                        int var14 = this.field1338[var7];
                        if (var14 >= 0 && !IdkType.field1110[var14].method370(0)) {
                            return;
                        }
                    }
                    this.field1522 = false;
                    Model[] var8 = new Model[7];
                    int var9 = 0;
                    for (int var10 = 0; var10 < 7; ++var10) {
                        int var13 = this.field1338[var10];
                        if (var13 >= 0) {
                            var8[var9++] = IdkType.field1110[var13].method371((byte) 68);
                        }
                    }
                    Model var11 = new Model(var9, var8, this.field1320);
                    for (int var12 = 0; var12 < 5; ++var12) {
                        if (this.field1617[var12] != 0) {
                            var11.method139(field1538[var12][0], field1538[var12][this.field1617[var12]]);
                            if (var12 == 1) {
                                var11.method139(field1216[0], field1216[this.field1617[var12]]);
                            }
                        }
                    }
                    var11.method132(1);
                    var11.method133(SeqType.field1131[field1311.field398].field1133[0], false);
                    var11.method142(64, 850, -30, -50, -30, true);
                    arg1.field119 = 5;
                    arg1.field120 = 0;
                    Component.method36(5, (byte) -55, 0, var11);
                }
            } else if (var3 == 324) {
                if (this.field1251 == null) {
                    this.field1251 = arg1.field117;
                    this.field1252 = arg1.field118;
                }
                if (this.field1284) {
                    arg1.field117 = this.field1252;
                } else {
                    arg1.field117 = this.field1251;
                }
            } else if (var3 == 325) {
                if (this.field1251 == null) {
                    this.field1251 = arg1.field117;
                    this.field1252 = arg1.field118;
                }
                if (this.field1284) {
                    arg1.field117 = this.field1251;
                } else {
                    arg1.field117 = this.field1252;
                }
            } else if (var3 == 600) {
                arg1.field111 = this.field1318;
                if (field1610 % 20 < 10) {
                    arg1.field111 = arg1.field111 + "|";
                } else {
                    arg1.field111 = arg1.field111 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1561 >= 1) {
                        if (this.field1267) {
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
                    if (this.field1406 != 0) {
                        String var15;
                        if (this.field1627 == 0) {
                            var15 = "earlier today";
                        } else if (this.field1627 == 1) {
                            var15 = "yesterday";
                        } else {
                            var15 = this.field1627 + " days ago";
                        }
                        arg1.field111 = "You last logged in " + var15 + " from: " + signlink.dns;
                    } else {
                        arg1.field111 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1530 == 0) {
                        arg1.field111 = "0 unread messages";
                        arg1.field113 = 16776960;
                    }
                    if (this.field1530 == 1) {
                        arg1.field111 = "1 unread message";
                        arg1.field113 = 65280;
                    }
                    if (this.field1530 > 1) {
                        arg1.field111 = this.field1530 + " unread messages";
                        arg1.field113 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1331 == 201) {
                        if (this.field1521 == 1) {
                            arg1.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1331 == 200) {
                        arg1.field111 = "You have not yet set any password recovery questions.";
                    } else {
                        String var16;
                        if (this.field1331 == 0) {
                            var16 = "Earlier today";
                        } else if (this.field1331 == 1) {
                            var16 = "Yesterday";
                        } else {
                            var16 = this.field1331 + " days ago";
                        }
                        arg1.field111 = var16 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1331 == 201) {
                        if (this.field1521 == 1) {
                            arg1.field111 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1331 == 200) {
                        arg1.field111 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field111 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1331 == 201) {
                        if (this.field1521 == 1) {
                            arg1.field111 = "@whi@this world but member benefits are unavailabe whilst here.";
                        } else {
                            arg1.field111 = "";
                        }
                    } else if (this.field1331 == 200) {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field111 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1416 == 0) {
            arg1.field111 = "Loading friend list";
            arg1.field78 = 0;
        } else if (var3 == 1 && this.field1416 == 1) {
            arg1.field111 = "Connecting to friendserver";
            arg1.field78 = 0;
        } else if (var3 == 2 && this.field1416 != 2) {
            arg1.field111 = "Please wait...";
            arg1.field78 = 0;
        } else {
            int var4 = this.field1415;
            if (this.field1416 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field111 = "";
                arg1.field78 = 0;
            } else {
                arg1.field111 = this.field1285[var3];
                arg1.field78 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1314.method76(arg2, arg3, arg4);
        if (var7 != 0) {
            int var8 = this.field1314.method80(arg2, arg3, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg5;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field1553.field658;
            int var13 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method325(var14);
            if (var15.field970 != -1) {
                Pix8 var16 = this.field1585[var15.field970];
                if (var16 != null) {
                    int var17 = (var15.field956 * 4 - var16.field671) / 2;
                    int var18 = (var15.field957 * 4 - var16.field672) / 2;
                    var16.method198((104 - arg4 - var15.field957) * 4 + 48 + var18, arg3 * 4 + 48 + var17, 0);
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
        int var19 = this.field1314.method78(arg2, arg3, arg4);
        if (var19 != 0) {
            int var20 = this.field1314.method80(arg2, arg3, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method325(var23);
            if (var24.field970 != -1) {
                Pix8 var25 = this.field1585[var24.field970];
                if (var25 != null) {
                    int var26 = (var24.field956 * 4 - var25.field671) / 2;
                    int var27 = (var24.field957 * 4 - var25.field672) / 2;
                    var25.method198((104 - arg4 - var24.field957) * 4 + 48 + var27, arg3 * 4 + 48 + var26, 0);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1553.field658;
                int var30 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
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
        int var31 = this.field1314.method79(arg2, arg3, arg4);
        while (arg1 >= 0) {
            this.field1437 = -163;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method325(var32);
            if (var33.field970 != -1) {
                Pix8 var34 = this.field1585[var33.field970];
                if (var34 != null) {
                    int var35 = (var33.field956 * 4 - var34.field671) / 2;
                    int var36 = (var33.field957 * 4 - var34.field672) / 2;
                    var34.method198((104 - arg4 - var33.field957) * 4 + 48 + var36, arg3 * 4 + 48 + var35, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)Lxb;")
    public final Jagfile method499(int arg0, String arg1, int arg2, int arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1378[0] != null) {
                var7 = this.field1378[0].method286(arg3, -32477);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1632.reset();
            this.field1632.update(var7);
            int var9 = (int) this.field1632.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, 451);
        } else {
            int var11 = 0;
            if (arg0 != 5693) {
                this.field1417 = !this.field1417;
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(4, arg4, "Requesting " + arg1);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method427(arg5 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet((byte) 3, var16);
                    var17.field702 = 3;
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
                            this.method13(4, arg4, "Loading " + arg1 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1378[0] != null) {
                            this.field1378[0].method287(var7, arg3, var7.length, 870);
                        }
                    } catch (Exception var29) {
                        this.field1378[0] = null;
                    }
                    if (var7 != null) {
                        this.field1632.reset();
                        this.field1632.update(var7);
                        int var24 = (int) this.field1632.getValue();
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
                            this.method13(4, arg4, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(4, arg4, var12 + " - Retrying in " + var26);
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
                    this.field1273 = !this.field1273;
                }
            }
            return new Jagfile(var7, 451);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;B)V")
    private final void method500(LocSpawned arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 33) {
            this.field1341 = null;
        }
        if (arg0.field721 == 0) {
            var3 = this.field1314.method76(arg0.field720, arg0.field722, arg0.field723);
        }
        if (arg0.field721 == 1) {
            var3 = this.field1314.method77(arg0.field720, arg0.field722, (byte) 79, arg0.field723);
        }
        if (arg0.field721 == 2) {
            var3 = this.field1314.method78(arg0.field720, arg0.field722, arg0.field723);
        }
        if (arg0.field721 == 3) {
            var3 = this.field1314.method79(arg0.field720, arg0.field722, arg0.field723);
        }
        if (var3 != 0) {
            int var7 = this.field1314.method80(arg0.field720, arg0.field722, arg0.field723, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field724 = var4;
        arg0.field726 = var5;
        arg0.field725 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method501(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1548; ++var3) {
            NpcEntity var4 = this.field1547[this.field1549[var3]];
            int var5 = (this.field1549[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(-948) && var4.field449.field1022 == arg0) {
                int var6 = var4.field393 >> 7;
                int var7 = var4.field394 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field397 == 1 && (var4.field393 & 127) == 64 && (var4.field394 & 127) == 64) {
                        if (this.field1621[var6][var7] == this.field1457) {
                            continue;
                        }
                        this.field1621[var6][var7] = this.field1457;
                    }
                    this.field1314.method61(var4.field395, var4.field394, var4.field396, var4.field393, true, this.method525(this.field1636, var4.field393, (byte) -51, var4.field394), var4, this.field1636, (var4.field397 - 1) * 64 + 60, var5);
                }
            }
        }
        if (arg1 >= 0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method502(boolean arg0) {
        for (int var2 = 0; var2 < this.field1548; ++var2) {
            int var3 = this.field1549[var2];
            NpcEntity var4 = this.field1547[var3];
            if (var4 != null) {
                this.method503(true, var4.field449.field1004, var4);
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILy;)V")
    public final void method503(boolean arg0, int arg1, PathingEntity arg2) {
        if (arg2.field393 < 128 || arg2.field394 < 128 || arg2.field393 >= 13184 || arg2.field394 >= 13184) {
            arg2.field421 = -1;
            arg2.field426 = -1;
            arg2.field435 = 0;
            arg2.field436 = 0;
            arg2.field393 = arg2.field443[0] * 128 + arg2.field397 * 64;
            arg2.field394 = arg2.field444[0] * 128 + arg2.field397 * 64;
            arg2.method112(0);
        }
        if (field1311 == arg2 && (arg2.field393 < 1536 || arg2.field394 < 1536 || arg2.field393 >= 11776 || arg2.field394 >= 11776)) {
            arg2.field421 = -1;
            arg2.field426 = -1;
            arg2.field435 = 0;
            arg2.field436 = 0;
            arg2.field393 = arg2.field443[0] * 128 + arg2.field397 * 64;
            arg2.field394 = arg2.field444[0] * 128 + arg2.field397 * 64;
            arg2.method112(0);
        }
        if (arg2.field435 > field1610) {
            this.method504(arg2, this.field1540);
        } else if (arg2.field436 >= field1610) {
            this.method505(arg2, -224);
        } else {
            this.method506((byte) -116, arg2);
        }
        this.method507(arg2, false);
        if (!arg0) {
            this.field1266 = !this.field1266;
        }
        this.method508(572, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method504(PathingEntity arg0, int arg1) {
        int var3 = arg0.field435 - field1610;
        int var4 = arg0.field431 * 128 + arg0.field397 * 64;
        int var5 = arg0.field433 * 128 + arg0.field397 * 64;
        arg0.field393 += (var4 - arg0.field393) / var3;
        if (arg1 != 0) {
            this.method6();
        }
        arg0.field394 += (var5 - arg0.field394) / var3;
        arg0.field446 = 0;
        if (arg0.field437 == 0) {
            arg0.field440 = 1024;
        }
        if (arg0.field437 == 1) {
            arg0.field440 = 1536;
        }
        if (arg0.field437 == 2) {
            arg0.field440 = 0;
        }
        if (arg0.field437 == 3) {
            arg0.field440 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method505(PathingEntity arg0, int arg1) {
        if (field1610 == arg0.field436 || arg0.field421 == -1 || arg0.field424 != 0 || arg0.field423 + 1 > SeqType.field1131[arg0.field421].method375(0, arg0.field422)) {
            int var3 = arg0.field436 - arg0.field435;
            int var4 = field1610 - arg0.field435;
            int var5 = arg0.field431 * 128 + arg0.field397 * 64;
            int var6 = arg0.field433 * 128 + arg0.field397 * 64;
            int var7 = arg0.field432 * 128 + arg0.field397 * 64;
            int var8 = arg0.field434 * 128 + arg0.field397 * 64;
            arg0.field393 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field394 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field446 = 0;
        while (arg1 >= 0) {
            this.field1305 = -204;
        }
        if (arg0.field437 == 0) {
            arg0.field440 = 1024;
        }
        if (arg0.field437 == 1) {
            arg0.field440 = 1536;
        }
        if (arg0.field437 == 2) {
            arg0.field440 = 0;
        }
        if (arg0.field437 == 3) {
            arg0.field440 = 512;
        }
        arg0.field395 = arg0.field440;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLy;)V")
    public final void method506(byte arg0, PathingEntity arg1) {
        arg1.field418 = arg1.field398;
        if (arg1.field442 == 0) {
            arg1.field446 = 0;
        } else {
            if (arg1.field421 != -1 && arg1.field424 == 0) {
                SeqType var3 = SeqType.field1131[arg1.field421];
                if (arg1.field447 > 0 && var3.field1143 == 0) {
                    ++arg1.field446;
                    return;
                }
                if (arg1.field447 <= 0 && var3.field1144 == 0) {
                    ++arg1.field446;
                    return;
                }
            }
            int var4 = arg1.field393;
            int var5 = arg1.field394;
            int var6 = arg1.field443[arg1.field442 - 1] * 128 + arg1.field397 * 64;
            int var7 = arg1.field444[arg1.field442 - 1] * 128 + arg1.field397 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field440 = 1280;
                    } else if (var5 > var7) {
                        arg1.field440 = 1792;
                    } else {
                        arg1.field440 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field440 = 768;
                    } else if (var5 > var7) {
                        arg1.field440 = 256;
                    } else {
                        arg1.field440 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field440 = 1024;
                } else {
                    arg1.field440 = 0;
                }
                int var8 = arg1.field440 - arg1.field395 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field401;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field400;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field403;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field402;
                }
                if (var9 == -1) {
                    var9 = arg1.field400;
                }
                arg1.field418 = var9;
                if (arg0 != -116) {
                    for (int var10 = 1; var10 > 0; ++var10) {
                    }
                }
                int var11 = 4;
                if (arg1.field440 != arg1.field395 && arg1.field415 == -1 && arg1.field441 != 0) {
                    var11 = 2;
                }
                if (arg1.field442 > 2) {
                    var11 = 6;
                }
                if (arg1.field442 > 3) {
                    var11 = 8;
                }
                if (arg1.field446 > 0 && arg1.field442 > 1) {
                    var11 = 8;
                    --arg1.field446;
                }
                if (arg1.field445[arg1.field442 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field418 == arg1.field400 && arg1.field404 != -1) {
                    arg1.field418 = arg1.field404;
                }
                if (var4 < var6) {
                    arg1.field393 += var11;
                    if (arg1.field393 > var6) {
                        arg1.field393 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field393 -= var11;
                    if (arg1.field393 < var6) {
                        arg1.field393 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field394 += var11;
                    if (arg1.field394 > var7) {
                        arg1.field394 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field394 -= var11;
                    if (arg1.field394 < var7) {
                        arg1.field394 = var7;
                    }
                }
                if (arg1.field393 == var6 && arg1.field394 == var7) {
                    --arg1.field442;
                    if (arg1.field447 > 0) {
                        --arg1.field447;
                        return;
                    }
                }
            } else {
                arg1.field393 = var6;
                arg1.field394 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method507(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            this.field1235 = -1;
        }
        if (arg0.field441 != 0) {
            if (arg0.field415 != -1 && arg0.field415 < 32768) {
                NpcEntity var3 = this.field1547[arg0.field415];
                if (var3 != null) {
                    int var4 = arg0.field393 - var3.field393;
                    int var5 = arg0.field394 - var3.field394;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field440 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field415 >= 32768) {
                int var6 = arg0.field415 - 32768;
                if (this.field1534 == var6) {
                    var6 = this.field1642;
                }
                PlayerEntity var7 = this.field1643[var6];
                if (var7 != null) {
                    int var8 = arg0.field393 - var7.field393;
                    int var9 = arg0.field394 - var7.field394;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field440 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field416 != 0 || arg0.field417 != 0) && (arg0.field442 == 0 || arg0.field446 > 0)) {
                int var10 = arg0.field393 - (arg0.field416 - this.field1393 - this.field1393) * 64;
                int var11 = arg0.field394 - (arg0.field417 - this.field1394 - this.field1394) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field440 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field416 = 0;
                arg0.field417 = 0;
            }
            int var12 = arg0.field440 - arg0.field395 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field441 && var12 <= 2048 - arg0.field441) {
                    if (var12 > 1024) {
                        arg0.field395 -= arg0.field441;
                    } else {
                        arg0.field395 += arg0.field441;
                    }
                } else {
                    arg0.field395 = arg0.field440;
                }
                arg0.field395 &= 2047;
                if (arg0.field418 == arg0.field398 && arg0.field440 != arg0.field395) {
                    if (arg0.field399 != -1) {
                        arg0.field418 = arg0.field399;
                        return;
                    }
                    arg0.field418 = arg0.field400;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method508(int arg0, PathingEntity arg1) {
        int var3 = 77 / arg0;
        arg1.field396 = false;
        if (arg1.field418 != -1) {
            SeqType var4 = SeqType.field1131[arg1.field418];
            ++arg1.field420;
            if (arg1.field419 < var4.field1132 && arg1.field420 > var4.method375(0, arg1.field419)) {
                arg1.field420 = 0;
                ++arg1.field419;
            }
            if (arg1.field419 >= var4.field1132) {
                arg1.field420 = 0;
                arg1.field419 = 0;
            }
        }
        if (arg1.field426 != -1 && field1610 >= arg1.field429) {
            if (arg1.field427 < 0) {
                arg1.field427 = 0;
            }
            SeqType var5 = SpotAnimType.field1153[arg1.field426].field1157;
            ++arg1.field428;
            while (arg1.field427 < var5.field1132 && arg1.field428 > var5.method375(0, arg1.field427)) {
                arg1.field428 -= var5.method375(0, arg1.field427);
                ++arg1.field427;
            }
            if (arg1.field427 >= var5.field1132 && (arg1.field427 < 0 || arg1.field427 >= var5.field1132)) {
                arg1.field426 = -1;
            }
        }
        if (arg1.field421 != -1 && arg1.field424 <= 1) {
            SeqType var6 = SeqType.field1131[arg1.field421];
            if (var6.field1143 == 1 && arg1.field447 > 0 && arg1.field435 <= field1610 && arg1.field436 < field1610) {
                arg1.field424 = 1;
                return;
            }
        }
        if (arg1.field421 != -1 && arg1.field424 == 0) {
            SeqType var7 = SeqType.field1131[arg1.field421];
            ++arg1.field423;
            while (arg1.field422 < var7.field1132 && arg1.field423 > var7.method375(0, arg1.field422)) {
                arg1.field423 -= var7.method375(0, arg1.field422);
                ++arg1.field422;
            }
            if (arg1.field422 >= var7.field1132) {
                arg1.field422 -= var7.field1136;
                ++arg1.field425;
                if (arg1.field425 >= var7.field1142) {
                    arg1.field421 = -1;
                }
                if (arg1.field422 < 0 || arg1.field422 >= var7.field1132) {
                    arg1.field421 = -1;
                }
            }
            arg1.field396 = var7.field1138;
        }
        if (arg1.field424 > 0) {
            --arg1.field424;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method509(int arg0) {
        if (this.field1542) {
            this.field1542 = false;
            this.field1419.method254(0, 4, super.field14, -884);
            this.field1420.method254(0, 357, super.field14, -884);
            this.field1421.method254(722, 4, super.field14, -884);
            this.field1422.method254(743, 205, super.field14, -884);
            this.field1423.method254(0, 0, super.field14, -884);
            this.field1424.method254(516, 4, super.field14, -884);
            this.field1425.method254(516, 205, super.field14, -884);
            this.field1426.method254(496, 357, super.field14, -884);
            this.field1427.method254(0, 338, super.field14, -884);
            this.field1253 = true;
            this.field1336 = true;
            this.field1458 = true;
            this.field1514 = true;
            if (this.field1485 != 2) {
                this.field1367.method254(4, 4, super.field14, -884);
                this.field1366.method254(550, 4, super.field14, -884);
            }
        }
        if (this.field1485 == 2) {
            this.method537(true);
        }
        if (this.field1439 && this.field1371 == 1) {
            this.field1253 = true;
        }
        if (this.field1569 != -1) {
            boolean var2 = this.method513(this.field1569, 68, this.field1222);
            if (var2) {
                this.field1253 = true;
            }
        }
        if (this.field1511 == 2) {
            this.field1253 = true;
        }
        if (this.field1651 == 2) {
            this.field1253 = true;
        }
        if (this.field1253) {
            this.method434(false);
            this.field1253 = false;
        }
        if (this.field1465 == -1) {
            this.field1607.field90 = this.field1523 - this.field1613 - 77;
            if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                this.method473(this.field1607, false, 463, 77, 0, this.field1523, false, super.field22 - 17, super.field23 - 357);
            }
            int var3 = this.field1523 - 77 - this.field1607.field90;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1523 - 77) {
                var3 = this.field1523 - 77;
            }
            if (this.field1613 != var3) {
                this.field1613 = var3;
                this.field1336 = true;
            }
        }
        if (this.field1465 != -1) {
            boolean var4 = this.method513(this.field1465, 68, this.field1222);
            if (var4) {
                this.field1336 = true;
            }
        }
        if (this.field1511 == 3) {
            this.field1336 = true;
        }
        if (this.field1651 == 3) {
            this.field1336 = true;
        }
        if (this.field1609 != null) {
            this.field1336 = true;
        }
        if (this.field1439 && this.field1371 == 2) {
            this.field1336 = true;
        }
        if (this.field1336) {
            this.method510(703);
            this.field1336 = false;
        }
        if (this.field1485 == 2) {
            this.method461(729);
            this.field1366.method254(550, 4, super.field14, -884);
        }
        if (this.field1323 != -1) {
            this.field1458 = true;
        }
        if (this.field1458) {
            if (this.field1323 != -1 && this.field1482 == this.field1323) {
                this.field1323 = -1;
                this.field1324.method213(201, (byte) 48);
                this.field1324.method214(this.field1482);
            }
            this.field1458 = false;
            this.field1556.method253(-328);
            this.field1572.method198(0, 0, 0);
            if (this.field1569 == -1) {
                if (this.field1346[this.field1482] != -1) {
                    if (this.field1482 == 0) {
                        this.field1300.method198(10, 22, 0);
                    }
                    if (this.field1482 == 1) {
                        this.field1301.method198(8, 54, 0);
                    }
                    if (this.field1482 == 2) {
                        this.field1301.method198(8, 82, 0);
                    }
                    if (this.field1482 == 3) {
                        this.field1302.method198(8, 110, 0);
                    }
                    if (this.field1482 == 4) {
                        this.field1304.method198(8, 153, 0);
                    }
                    if (this.field1482 == 5) {
                        this.field1304.method198(8, 181, 0);
                    }
                    if (this.field1482 == 6) {
                        this.field1303.method198(9, 209, 0);
                    }
                }
                if (this.field1346[0] != -1 && (this.field1323 != 0 || field1610 % 20 < 10)) {
                    this.field1618[0].method198(13, 29, 0);
                }
                if (this.field1346[1] != -1 && (this.field1323 != 1 || field1610 % 20 < 10)) {
                    this.field1618[1].method198(11, 53, 0);
                }
                if (this.field1346[2] != -1 && (this.field1323 != 2 || field1610 % 20 < 10)) {
                    this.field1618[2].method198(11, 82, 0);
                }
                if (this.field1346[3] != -1 && (this.field1323 != 3 || field1610 % 20 < 10)) {
                    this.field1618[3].method198(12, 115, 0);
                }
                if (this.field1346[4] != -1 && (this.field1323 != 4 || field1610 % 20 < 10)) {
                    this.field1618[4].method198(13, 153, 0);
                }
                if (this.field1346[5] != -1 && (this.field1323 != 5 || field1610 % 20 < 10)) {
                    this.field1618[5].method198(11, 180, 0);
                }
                if (this.field1346[6] != -1 && (this.field1323 != 6 || field1610 % 20 < 10)) {
                    this.field1618[6].method198(13, 208, 0);
                }
            }
            this.field1556.method254(516, 160, super.field14, -884);
            this.field1555.method253(-328);
            this.field1571.method198(0, 0, 0);
            if (this.field1569 == -1) {
                if (this.field1346[this.field1482] != -1) {
                    if (this.field1482 == 7) {
                        this.field1597.method198(0, 42, 0);
                    }
                    if (this.field1482 == 8) {
                        this.field1598.method198(0, 74, 0);
                    }
                    if (this.field1482 == 9) {
                        this.field1598.method198(0, 102, 0);
                    }
                    if (this.field1482 == 10) {
                        this.field1599.method198(1, 130, 0);
                    }
                    if (this.field1482 == 11) {
                        this.field1601.method198(0, 173, 0);
                    }
                    if (this.field1482 == 12) {
                        this.field1601.method198(0, 201, 0);
                    }
                    if (this.field1482 == 13) {
                        this.field1600.method198(0, 229, 0);
                    }
                }
                if (this.field1346[8] != -1 && (this.field1323 != 8 || field1610 % 20 < 10)) {
                    this.field1618[7].method198(2, 74, 0);
                }
                if (this.field1346[9] != -1 && (this.field1323 != 9 || field1610 % 20 < 10)) {
                    this.field1618[8].method198(3, 102, 0);
                }
                if (this.field1346[10] != -1 && (this.field1323 != 10 || field1610 % 20 < 10)) {
                    this.field1618[9].method198(4, 137, 0);
                }
                if (this.field1346[11] != -1 && (this.field1323 != 11 || field1610 % 20 < 10)) {
                    this.field1618[10].method198(2, 174, 0);
                }
                if (this.field1346[12] != -1 && (this.field1323 != 12 || field1610 % 20 < 10)) {
                    this.field1618[11].method198(2, 201, 0);
                }
                if (this.field1346[13] != -1 && (this.field1323 != 13 || field1610 % 20 < 10)) {
                    this.field1618[12].method198(2, 226, 0);
                }
            }
            this.field1555.method254(496, 466, super.field14, -884);
            this.field1367.method253(-328);
        }
        if (this.field1514) {
            this.field1514 = false;
            this.field1554.method253(-328);
            this.field1570.method198(0, 0, 0);
            this.field1403.method201("Public chat", 28, 16777215, 0, true, 55);
            if (this.field1370 == 0) {
                this.field1403.method201("On", 41, 65280, 0, true, 55);
            }
            if (this.field1370 == 1) {
                this.field1403.method201("Friends", 41, 16776960, 0, true, 55);
            }
            if (this.field1370 == 2) {
                this.field1403.method201("Off", 41, 16711680, 0, true, 55);
            }
            if (this.field1370 == 3) {
                this.field1403.method201("Hide", 41, 65535, 0, true, 55);
            }
            this.field1403.method201("Private chat", 28, 16777215, 0, true, 184);
            if (this.field1278 == 0) {
                this.field1403.method201("On", 41, 65280, 0, true, 184);
            }
            if (this.field1278 == 1) {
                this.field1403.method201("Friends", 41, 16776960, 0, true, 184);
            }
            if (this.field1278 == 2) {
                this.field1403.method201("Off", 41, 16711680, 0, true, 184);
            }
            this.field1403.method201("Trade/duel", 28, 16777215, 0, true, 324);
            if (this.field1520 == 0) {
                this.field1403.method201("On", 41, 65280, 0, true, 324);
            }
            if (this.field1520 == 1) {
                this.field1403.method201("Friends", 41, 16776960, 0, true, 324);
            }
            if (this.field1520 == 2) {
                this.field1403.method201("Off", 41, 16711680, 0, true, 324);
            }
            this.field1403.method201("Report abuse", 33, 16777215, 0, true, 458);
            this.field1554.method254(0, 453, super.field14, -884);
            this.field1367.method253(-328);
        }
        this.field1222 = 0;
        if (arg0 >= 0) {
            this.field1341 = null;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method510(int arg0) {
        int var2 = 79 / arg0;
        this.field1368.method253(-328);
        Pix3D.field640 = this.field1637;
        this.field1220.method198(0, 0, 0);
        if (this.field1357) {
            this.field1404.method200(239, 40, (byte) 1, 0, this.field1432);
            this.field1404.method200(239, 60, (byte) 1, 128, this.field1447 + "*");
        } else if (this.field1664) {
            this.field1404.method200(239, 40, (byte) 1, 0, "Enter amount:");
            this.field1404.method200(239, 60, (byte) 1, 128, this.field1550 + "*");
        } else if (this.field1609 != null) {
            this.field1404.method200(239, 40, (byte) 1, 0, this.field1609);
            this.field1404.method200(239, 60, (byte) 1, 128, "Click to continue");
        } else if (this.field1465 != -1) {
            this.method422(0, 0, 0, 0, Component.field70[this.field1465]);
        } else if (this.field1640 != -1) {
            this.method422(0, 0, 0, 0, Component.field70[this.field1640]);
        } else {
            PixFont var3 = this.field1403;
            int var4 = 0;
            Pix2D.method153(0, 0, 463, 0, 77);
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1271[var5] != null) {
                    int var7 = this.field1269[var5];
                    int var8 = 70 - var4 * 14 + this.field1613;
                    String var9 = this.field1270[var5];
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
                            var3.method203(4, 474, 0, this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1370 == 0 || this.field1370 == 1 && this.method445(this.field1662, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field1631[0].method198(var8 - 12, var11, 0);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field1631[1].method198(var8 - 12, var11, 0);
                                var11 += 14;
                            }
                            var3.method203(var11, 474, 0, var9 + ":", var8);
                            int var12 = var11 + var3.method202(var9, true) + 8;
                            var3.method203(var12, 474, 255, this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field1245 == 0 && (var7 == 7 || this.field1278 == 0 || this.field1278 == 1 && this.method445(this.field1662, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method203(var13, 474, 0, "From", var8);
                            int var14 = var13 + var3.method202("From ", true);
                            if (var10 == 1) {
                                this.field1631[0].method198(var8 - 12, var14, 0);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field1631[1].method198(var8 - 12, var14, 0);
                                var14 += 14;
                            }
                            var3.method203(var14, 474, 0, var9 + ":", var8);
                            int var15 = var14 + var3.method202(var9, true) + 8;
                            var3.method203(var15, 474, 8388608, this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if (var7 == 4 && (this.field1520 == 0 || this.field1520 == 1 && this.method445(this.field1662, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method203(4, 474, 8388736, var9 + " " + this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if (var7 == 5 && this.field1245 == 0 && this.field1278 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method203(4, 474, 8388608, this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if (var7 == 6 && this.field1245 == 0 && this.field1278 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method203(4, 474, 0, "To " + var9 + ":", var8);
                            var3.method203(12 + var3.method202("To " + var9, true), 474, 8388608, this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                    if (var7 == 8 && (this.field1520 == 0 || this.field1520 == 1 && this.method445(this.field1662, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method203(4, 474, 8270336, var9 + " " + this.field1271[var5], var8);
                        }
                        ++var4;
                    }
                }
            }
            Pix2D.method152(-29844);
            this.field1523 = var4 * 14 + 7;
            if (this.field1523 < 78) {
                this.field1523 = 78;
            }
            this.method425(this.field1523 - this.field1613 - 77, 161, 463, 77, this.field1523, 0);
            String var6;
            if (field1311 != null && field1311.field455 != null) {
                var6 = field1311.field455;
            } else {
                var6 = JString.method299(584, this.field1294);
            }
            var3.method203(4, 474, 0, var6 + ":", 90);
            var3.method203(6 + var3.method202(var6 + ": ", true), 474, 255, this.field1602 + "*", 90);
            Pix2D.method159(3, 0, 0, 77, 479);
        }
        if (this.field1439 && this.field1371 == 2) {
            this.method547(false);
        }
        this.field1368.method254(17, 357, super.field14, -884);
        this.field1367.method253(-328);
        Pix3D.field640 = this.field1639;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)Ljava/lang/String;")
    public final String method511(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1324.method214(145);
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method512(Component arg0, byte arg1) {
        if (arg1 != 78) {
            this.field1235 = this.field1388.method224();
        }
        int var3 = arg0.field79;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1499[this.field1268] = "Remove @whi@" + arg0.field111;
                this.field1564[this.field1268] = 884;
                ++this.field1268;
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
            this.field1499[this.field1268] = "Remove @whi@" + this.field1285[var3];
            this.field1564[this.field1268] = 513;
            ++this.field1268;
            this.field1499[this.field1268] = "Message @whi@" + this.field1285[var3];
            this.field1564[this.field1268] = 902;
            ++this.field1268;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Z")
    public final boolean method513(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field70[arg0];
        for (int var6 = 0; var6 < var5.field92.length && var5.field92[var6] != -1; ++var6) {
            Component var7 = Component.field70[var5.field92[var6]];
            if (var7.field77 == 1) {
                var4 |= this.method513(var7.field75, 68, arg2);
            }
            if (var7.field77 == 6 && (var7.field123 != -1 || var7.field124 != -1)) {
                boolean var8 = this.method438(110, var7);
                int var9;
                if (var8) {
                    var9 = var7.field124;
                } else {
                    var9 = var7.field123;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1131[var9];
                    var7.field74 += arg2;
                    while (var7.field74 > var10.method375(0, var7.field73)) {
                        var7.field74 -= var10.method375(0, var7.field73) + 1;
                        ++var7.field73;
                        if (var7.field73 >= var10.field1132) {
                            var7.field73 -= var10.field1136;
                            if (var7.field73 < 0 || var7.field73 >= var10.field1132) {
                                var7.field73 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        int var11 = 96 / arg1;
        return var4;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method514(byte arg0) {
        if (this.field1651 == 0) {
            this.field1499[0] = "Cancel";
            if (arg0 == 9) {
                boolean var2 = false;
            } else {
                this.field1324.method214(206);
            }
            this.field1564[0] = 1106;
            this.field1268 = 1;
            this.method440(45332);
            this.field1312 = 0;
            if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                if (this.field1481 != -1) {
                    this.method444(super.field23, 0, 33973, 4, 4, super.field22, Component.field70[this.field1481]);
                } else {
                    this.method480(-899);
                }
            }
            if (this.field1418 != this.field1312) {
                this.field1418 = this.field1312;
            }
            this.field1312 = 0;
            if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                if (this.field1569 != -1) {
                    this.method444(super.field23, 0, 33973, 205, 553, super.field22, Component.field70[this.field1569]);
                } else if (this.field1346[this.field1482] != -1) {
                    this.method444(super.field23, 0, 33973, 205, 553, super.field22, Component.field70[this.field1346[this.field1482]]);
                }
            }
            if (this.field1661 != this.field1312) {
                this.field1253 = true;
                this.field1661 = this.field1312;
            }
            this.field1312 = 0;
            if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                if (this.field1465 != -1) {
                    this.method444(super.field23, 0, 33973, 357, 17, super.field22, Component.field70[this.field1465]);
                } else if (super.field23 < 434 && super.field22 < 426) {
                    this.method463(false, super.field22 - 17, super.field23 - 357);
                }
            }
            if (this.field1465 != -1 && this.field1444 != this.field1312) {
                this.field1336 = true;
                this.field1444 = this.field1312;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field1268 - 1; ++var4) {
                    if (this.field1564[var4] < 1000 && this.field1564[var4 + 1] > 1000) {
                        String var5 = this.field1499[var4];
                        this.field1499[var4] = this.field1499[var4 + 1];
                        this.field1499[var4 + 1] = var5;
                        int var6 = this.field1564[var4];
                        this.field1564[var4] = this.field1564[var4 + 1];
                        this.field1564[var4 + 1] = var6;
                        int var7 = this.field1562[var4];
                        this.field1562[var4] = this.field1562[var4 + 1];
                        this.field1562[var4 + 1] = var7;
                        int var8 = this.field1563[var4];
                        this.field1563[var4] = this.field1563[var4 + 1];
                        this.field1563[var4 + 1] = var8;
                        int var9 = this.field1565[var4];
                        this.field1565[var4] = this.field1565[var4 + 1];
                        this.field1565[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method515(int arg0) {
        if (this.field1245 != 0) {
            PixFont var2 = this.field1403;
            int var3 = 0;
            if (arg0 == 1016) {
                if (this.field1398 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1271[var4] != null) {
                        int var5 = this.field1269[var4];
                        String var6 = this.field1270[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1278 == 0 || this.field1278 == 1 && this.method445(this.field1662, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method203(var9, 474, 0, "From", var8);
                            var2.method203(var9, 474, 65535, "From", var8 - 1);
                            int var10 = var9 + var2.method202("From ", true);
                            if (var7 == 1) {
                                this.field1631[0].method198(var8 - 12, var10, 0);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field1631[1].method198(var8 - 12, var10, 0);
                                var10 += 14;
                            }
                            var2.method203(var10, 474, 0, var6 + ": " + this.field1271[var4], var8);
                            var2.method203(var10, 474, 65535, var6 + ": " + this.field1271[var4], var8 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field1278 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method203(4, 474, 0, this.field1271[var4], var11);
                            var2.method203(4, 474, 65535, this.field1271[var4], var11 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field1278 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method203(4, 474, 0, "To " + var6 + ": " + this.field1271[var4], var12);
                            var2.method203(4, 474, 65535, "To " + var6 + ": " + this.field1271[var4], var12 - 1);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILib;)V")
    public final void method516(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = this.field1628 + this.field1247 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = Model.field595[var5];
            int var8 = Model.field596[var5];
            int var9 = var7 * 256 / (this.field1433 + 256);
            int var10 = var8 * 256 / (this.field1433 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (arg2 < 0 || arg2 > 0) {
                this.field1438 = -172;
            }
            if (var6 > 2500) {
                arg3.method191(83 - var12 - arg3.field664 / 2 - 4, var11 + 94 - arg3.field663 / 2 + 4, 686, this.field1219);
            } else {
                arg3.method185(83 - var12 - arg3.field664 / 2 - 4, var11 + 94 - arg3.field663 / 2 + 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public void method517(int arg0) {
        if (arg0 <= 0) {
            this.field1340 = this.field1478.method290();
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1483);
        if (this.field1583 != null) {
            System.out.println("Od-cycle:" + this.field1583.field843);
        }
        System.out.println("loop-cycle:" + field1610);
        System.out.println("draw-cycle:" + field1347);
        System.out.println("ptype:" + this.field1235);
        System.out.println("psize:" + this.field1234);
        if (this.field1573 != null) {
            this.field1573.method43(740);
        }
        super.field11 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        this.field1234 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)I")
    public final int method518(int arg0) {
        this.field1234 += arg0;
        int var2 = 3;
        if (this.field1494 < 310) {
            int var3 = this.field1491 >> 7;
            int var4 = this.field1493 >> 7;
            int var5 = field1311.field393 >> 7;
            int var6 = field1311.field394 >> 7;
            if ((this.field1558[this.field1636][var3][var4] & 4) != 0) {
                var2 = this.field1636;
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
                    if ((this.field1558[this.field1636][var3][var4] & 4) != 0) {
                        var2 = this.field1636;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1558[this.field1636][var3][var4] & 4) != 0) {
                            var2 = this.field1636;
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
                    if ((this.field1558[this.field1636][var3][var4] & 4) != 0) {
                        var2 = this.field1636;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1558[this.field1636][var3][var4] & 4) != 0) {
                            var2 = this.field1636;
                        }
                    }
                }
            }
        }
        if ((this.field1558[this.field1636][field1311.field393 >> 7][field1311.field394 >> 7] & 4) != 0) {
            var2 = this.field1636;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)I")
    public final int method519(int arg0) {
        int var2 = this.method525(this.field1636, this.field1491, (byte) -51, this.field1493);
        while (arg0 >= 0) {
            this.method6();
        }
        return var2 - this.field1492 < 800 && (this.field1558[this.field1636][this.field1491 >> 7][this.field1493 >> 7] & 4) != 0 ? this.field1636 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg3 >> 14 & 32767;
        int var7 = this.field1314.method80(this.field1636, arg1, arg0, arg3);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1496;
            if (field1496 > 1086) {
                field1496 = 0;
                this.field1324.method213(225, (byte) 48);
                this.field1324.method214(0);
                int var10 = this.field1324.field702;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1324.method215(16791);
                }
                this.field1324.method214(254);
                this.field1324.method215((int) (Math.random() * 65536.0D));
                this.field1324.method215(16128);
                this.field1324.method215(52610);
                this.field1324.method215((int) (Math.random() * 65536.0D));
                this.field1324.method215(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1324.method215(35025);
                }
                this.field1324.method215(46628);
                this.field1324.method214((int) (Math.random() * 256.0D));
                this.field1324.method223(this.field1324.field702 - var10, 0);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method429(arg0, 1, 2, field1311.field444[0], var9, false, arg1, 0, field1311.field443[0], 0, var8 + 1, 0);
            } else {
                LocType var11 = LocType.method325(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field957;
                    var13 = var11.field956;
                } else {
                    var12 = var11.field956;
                    var13 = var11.field957;
                }
                int var14 = var11.field979;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method429(arg0, 1, 2, field1311.field444[0], 0, false, arg1, var12, field1311.field443[0], var14, 0, var13);
            }
            this.field1500 = super.field29;
            this.field1501 = super.field30;
            this.field1503 = 2;
            this.field1502 = 0;
            this.field1324.method213(arg2, (byte) 48);
            this.field1324.method215(this.field1393 + arg1);
            this.field1324.method215(this.field1394 + arg0);
            this.field1324.method215(var6);
            if (arg4 != -21331) {
                this.field1662 = this.field1478.method290();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)Z")
    public final boolean method521(byte arg0) {
        if (arg0 != -25) {
            this.field1417 = !this.field1417;
        }
        if (this.field1573 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1573.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1235 == -1) {
                    this.field1573.method41(this.field1388.field701, 0, 1);
                    this.field1235 = this.field1388.field701[0] & 255;
                    if (this.field1478 != null) {
                        this.field1235 = this.field1235 - this.field1478.method290() & 255;
                    }
                    this.field1234 = Protocol.field1080[this.field1235];
                    --var2;
                }
                if (this.field1234 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1573.method41(this.field1388.field701, 0, 1);
                    this.field1234 = this.field1388.field701[0] & 255;
                    --var2;
                }
                if (this.field1234 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1573.method41(this.field1388.field701, 0, 2);
                    this.field1388.field702 = 0;
                    this.field1234 = this.field1388.method226();
                    var2 -= 2;
                }
                if (var2 < this.field1234) {
                    return false;
                }
                this.field1388.field702 = 0;
                this.field1573.method41(this.field1388.field701, 0, this.field1234);
                this.field1236 = 0;
                this.field1409 = this.field1408;
                this.field1408 = this.field1407;
                this.field1407 = this.field1235;
                if (this.field1235 == 163) {
                    int var3 = this.field1388.method226();
                    if (var3 == 65535) {
                        var3 = -1;
                    }
                    if (this.field1484 != var3 && this.field1281 && !field1464 && this.field1497 == 0) {
                        this.field1559 = var3;
                        this.field1560 = true;
                        this.field1583.method274(2, this.field1559);
                    }
                    this.field1484 = var3;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 242) {
                    int var4 = this.field1388.method226();
                    int var5 = this.field1388.method226();
                    if (this.field1281 && !field1464) {
                        this.field1559 = var4;
                        this.field1560 = false;
                        this.field1583.method274(2, this.field1559);
                        this.field1497 = var5;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 196) {
                    int var6 = this.field1388.method226();
                    int var7 = this.field1388.method229();
                    this.field1506[var6] = var7;
                    if (this.field1332[var6] != var7) {
                        this.field1332[var6] = var7;
                        this.method535(var6, -742);
                        this.field1253 = true;
                        if (this.field1640 != -1) {
                            this.field1336 = true;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 14) {
                    int var8 = this.field1388.method226();
                    int var9 = this.field1388.method226();
                    Component var10 = Component.field70[var8];
                    if (var10 != null && var10.field77 == 0) {
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var9 > var10.field89 - var10.field81) {
                            var9 = var10.field89 - var10.field81;
                        }
                        var10.field90 = var9;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 87) {
                    this.method532(false, this.field1234, this.field1388);
                    this.field1622 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 111) {
                    long var11 = this.field1388.method230(203);
                    int var13 = this.field1388.method224();
                    String var14 = JString.method299(584, JString.method296(-206, var11));
                    for (int var15 = 0; var15 < this.field1415; ++var15) {
                        if (this.field1221[var15] == var11) {
                            if (this.field1326[var15] != var13) {
                                this.field1326[var15] = var13;
                                this.field1253 = true;
                                if (var13 > 0) {
                                    this.method526(-638, 5, var14 + " has logged in.", "");
                                }
                                if (var13 == 0) {
                                    this.method526(-638, 5, var14 + " has logged out.", "");
                                }
                            }
                            var14 = null;
                            break;
                        }
                    }
                    if (var14 != null && this.field1415 < 200) {
                        this.field1221[this.field1415] = var11;
                        this.field1285[this.field1415] = var14;
                        this.field1326[this.field1415] = var13;
                        ++this.field1415;
                        this.field1253 = true;
                    }
                    boolean var16 = false;
                    while (!var16) {
                        var16 = true;
                        for (int var17 = 0; var17 < this.field1415 - 1; ++var17) {
                            if (this.field1326[var17] != field1461 && this.field1326[var17 + 1] == field1461 || this.field1326[var17] == 0 && this.field1326[var17 + 1] != 0) {
                                int var18 = this.field1326[var17];
                                this.field1326[var17] = this.field1326[var17 + 1];
                                this.field1326[var17 + 1] = var18;
                                String var19 = this.field1285[var17];
                                this.field1285[var17] = this.field1285[var17 + 1];
                                this.field1285[var17 + 1] = var19;
                                long var20 = this.field1221[var17];
                                this.field1221[var17] = this.field1221[var17 + 1];
                                this.field1221[var17 + 1] = var20;
                                this.field1253 = true;
                                var16 = false;
                            }
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 91) {
                    int var22 = this.field1388.method226();
                    int var23 = this.field1388.method224();
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    this.field1346[var23] = var22;
                    this.field1253 = true;
                    this.field1458 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 28) {
                    this.field1253 = true;
                    int var24 = this.field1388.method226();
                    Component var25 = Component.field70[var24];
                    int var26 = this.field1388.method224();
                    for (int var27 = 0; var27 < var26; ++var27) {
                        var25.field71[var27] = this.field1388.method226();
                        int var28 = this.field1388.method224();
                        if (var28 == 255) {
                            var28 = this.field1388.method229();
                        }
                        var25.field72[var27] = var28;
                    }
                    for (int var29 = var26; var29 < var25.field71.length; ++var29) {
                        var25.field71[var29] = 0;
                        var25.field72[var29] = 0;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 213) {
                    this.field1534 = this.field1388.method226();
                    this.field1241 = this.field1388.method224();
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 222) {
                    int var30 = this.field1388.method226();
                    int var31 = this.field1388.method226();
                    int var32 = this.field1388.method226();
                    ObjType var33 = ObjType.method341(var31);
                    Component.field70[var30].field119 = 4;
                    Component.field70[var30].field120 = var31;
                    Component.field70[var30].field126 = var33.field1045;
                    Component.field70[var30].field127 = var33.field1046;
                    Component.field70[var30].field125 = var33.field1044 * 100 / var32;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 63) {
                    this.field1615 = this.field1234 / 8;
                    for (int var34 = 0; var34 < this.field1615; ++var34) {
                        this.field1355[var34] = this.field1388.method230(203);
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 64) {
                    this.field1381 = this.field1388.method224();
                    if (this.field1381 == 1) {
                        this.field1298 = this.field1388.method226();
                    }
                    if (this.field1381 >= 2 && this.field1381 <= 6) {
                        if (this.field1381 == 2) {
                            this.field1385 = 64;
                            this.field1386 = 64;
                        }
                        if (this.field1381 == 3) {
                            this.field1385 = 0;
                            this.field1386 = 64;
                        }
                        if (this.field1381 == 4) {
                            this.field1385 = 128;
                            this.field1386 = 64;
                        }
                        if (this.field1381 == 5) {
                            this.field1385 = 64;
                            this.field1386 = 0;
                        }
                        if (this.field1381 == 6) {
                            this.field1385 = 64;
                            this.field1386 = 128;
                        }
                        this.field1381 = 2;
                        this.field1382 = this.field1388.method226();
                        this.field1383 = this.field1388.method226();
                        this.field1384 = this.field1388.method224();
                    }
                    if (this.field1381 == 10) {
                        this.field1656 = this.field1388.method226();
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 197) {
                    int var35 = this.field1388.method226();
                    this.method474(var35, 962);
                    if (this.field1569 != -1) {
                        this.field1569 = -1;
                        this.field1253 = true;
                        this.field1458 = true;
                    }
                    if (this.field1465 != -1) {
                        this.field1465 = -1;
                        this.field1336 = true;
                    }
                    if (this.field1664) {
                        this.field1664 = false;
                        this.field1336 = true;
                    }
                    this.field1481 = var35;
                    this.field1260 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 255) {
                    this.field1416 = this.field1388.method224();
                    this.field1253 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 5) {
                    this.field1357 = false;
                    this.field1664 = true;
                    this.field1550 = "";
                    this.field1336 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 187) {
                    int var36 = this.field1388.method226();
                    this.method474(var36, 962);
                    if (this.field1465 != -1) {
                        this.field1465 = -1;
                        this.field1336 = true;
                    }
                    if (this.field1664) {
                        this.field1664 = false;
                        this.field1336 = true;
                    }
                    this.field1569 = var36;
                    this.field1253 = true;
                    this.field1458 = true;
                    this.field1481 = -1;
                    this.field1260 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 161) {
                    int var37 = this.field1388.method226();
                    Component.field70[var37].field119 = 3;
                    Component.field70[var37].field120 = (field1311.field459[8] << 6) + (field1311.field459[0] << 12) + (field1311.field460[0] << 24) + (field1311.field460[4] << 18) + field1311.field459[11];
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 174) {
                    if (this.field1569 != -1) {
                        this.field1569 = -1;
                        this.field1253 = true;
                        this.field1458 = true;
                    }
                    if (this.field1465 != -1) {
                        this.field1465 = -1;
                        this.field1336 = true;
                    }
                    if (this.field1664) {
                        this.field1664 = false;
                        this.field1336 = true;
                    }
                    this.field1481 = -1;
                    this.field1260 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 0) {
                    this.field1242 = true;
                    this.field1449 = this.field1388.method224();
                    this.field1450 = this.field1388.method224();
                    this.field1451 = this.field1388.method226();
                    this.field1452 = this.field1388.method224();
                    this.field1453 = this.field1388.method224();
                    if (this.field1453 >= 100) {
                        int var38 = this.field1449 * 128 + 64;
                        int var39 = this.field1450 * 128 + 64;
                        int var40 = this.method525(this.field1636, var38, (byte) -51, var39) - this.field1451;
                        int var41 = var38 - this.field1491;
                        int var42 = var40 - this.field1492;
                        int var43 = var39 - this.field1493;
                        int var44 = (int) Math.sqrt((double) (var41 * var41 + var43 * var43));
                        this.field1494 = (int) (Math.atan2((double) var42, (double) var44) * 325.949D) & 2047;
                        this.field1495 = (int) (Math.atan2((double) var41, (double) var43) * -325.949D) & 2047;
                        if (this.field1494 < 128) {
                            this.field1494 = 128;
                        }
                        if (this.field1494 > 383) {
                            this.field1494 = 383;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 141) {
                    int var45 = this.field1388.method226();
                    this.method474(var45, 962);
                    if (this.field1569 != -1) {
                        this.field1569 = -1;
                        this.field1253 = true;
                        this.field1458 = true;
                    }
                    this.field1465 = var45;
                    this.field1336 = true;
                    this.field1481 = -1;
                    this.field1260 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 173) {
                    this.field1315 = this.field1388.method224();
                    this.field1316 = this.field1388.method224();
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 209) {
                    int var46 = this.field1388.method226();
                    int var47 = this.field1388.method226();
                    if (this.field1214 == var46 && this.field1215 == var47 && this.field1485 == 2) {
                        this.field1235 = -1;
                        return true;
                    }
                    this.field1214 = var46;
                    this.field1215 = var47;
                    this.field1393 = (this.field1214 - 6) * 8;
                    this.field1394 = (this.field1215 - 6) * 8;
                    this.field1608 = false;
                    if ((this.field1214 / 8 == 48 || this.field1214 / 8 == 49) && this.field1215 / 8 == 48) {
                        this.field1608 = true;
                    }
                    if (this.field1214 / 8 == 48 && this.field1215 / 8 == 148) {
                        this.field1608 = true;
                    }
                    this.field1485 = 1;
                    this.field1658 = System.currentTimeMillis();
                    this.field1367.method253(-328);
                    this.field1403.method200(257, 151, (byte) 1, 0, "Loading - please wait.");
                    this.field1403.method200(256, 150, (byte) 1, 16777215, "Loading - please wait.");
                    this.field1367.method254(4, 4, super.field14, -884);
                    int var48 = 0;
                    for (int var49 = (this.field1214 - 6) / 8; var49 <= (this.field1214 + 6) / 8; ++var49) {
                        for (int var50 = (this.field1215 - 6) / 8; var50 <= (this.field1215 + 6) / 8; ++var50) {
                            ++var48;
                        }
                    }
                    this.field1533 = new byte[var48][];
                    this.field1663 = new byte[var48][];
                    this.field1275 = new int[var48];
                    this.field1276 = new int[var48];
                    this.field1277 = new int[var48];
                    int var51 = 0;
                    for (int var52 = (this.field1214 - 6) / 8; var52 <= (this.field1214 + 6) / 8; ++var52) {
                        for (int var53 = (this.field1215 - 6) / 8; var53 <= (this.field1215 + 6) / 8; ++var53) {
                            this.field1275[var51] = (var52 << 8) + var53;
                            if (this.field1608 && (var53 == 49 || var53 == 149 || var53 == 147 || var52 == 50 || var52 == 49 && var53 == 47)) {
                                this.field1276[var51] = -1;
                                this.field1277[var51] = -1;
                                ++var51;
                            } else {
                                int var54 = this.field1276[var51] = this.field1583.method269(false, var53, 0, var52);
                                if (var54 != -1) {
                                    this.field1583.method274(3, var54);
                                }
                                int var55 = this.field1277[var51] = this.field1583.method269(false, var53, 1, var52);
                                if (var55 != -1) {
                                    this.field1583.method274(3, var55);
                                }
                                ++var51;
                            }
                        }
                    }
                    int var56 = this.field1393 - this.field1395;
                    int var57 = this.field1394 - this.field1396;
                    this.field1395 = this.field1393;
                    this.field1396 = this.field1394;
                    for (int var58 = 0; var58 < 16384; ++var58) {
                        NpcEntity var59 = this.field1547[var58];
                        if (var59 != null) {
                            for (int var60 = 0; var60 < 10; ++var60) {
                                var59.field443[var60] -= var56;
                                var59.field444[var60] -= var57;
                            }
                            var59.field393 -= var56 * 128;
                            var59.field394 -= var57 * 128;
                        }
                    }
                    for (int var61 = 0; var61 < this.field1641; ++var61) {
                        PlayerEntity var62 = this.field1643[var61];
                        if (var62 != null) {
                            for (int var63 = 0; var63 < 10; ++var63) {
                                var62.field443[var63] -= var56;
                                var62.field444[var63] -= var57;
                            }
                            var62.field393 -= var56 * 128;
                            var62.field394 -= var57 * 128;
                        }
                    }
                    this.field1622 = true;
                    byte var64 = 0;
                    byte var65 = 104;
                    byte var66 = 1;
                    if (var56 < 0) {
                        var64 = 103;
                        var65 = -1;
                        var66 = -1;
                    }
                    byte var67 = 0;
                    byte var68 = 104;
                    byte var69 = 1;
                    if (var57 < 0) {
                        var67 = 103;
                        var68 = -1;
                        var69 = -1;
                    }
                    for (int var70 = var64; var65 != var70; var70 += var66) {
                        for (int var71 = var67; var68 != var71; var71 += var69) {
                            int var72 = var56 + var70;
                            int var73 = var57 + var71;
                            for (int var74 = 0; var74 < 4; ++var74) {
                                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                                    this.field1341[var74][var70][var71] = this.field1341[var74][var72][var73];
                                } else {
                                    this.field1341[var74][var70][var71] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var75 = (LocSpawned) this.field1265.method243(); var75 != null; var75 = (LocSpawned) this.field1265.method245(30869)) {
                        var75.field722 -= var56;
                        var75.field723 -= var57;
                        if (var75.field722 < 0 || var75.field723 < 0 || var75.field722 >= 104 || var75.field723 >= 104) {
                            var75.method106();
                        }
                    }
                    if (this.field1551 != 0) {
                        this.field1551 -= var56;
                        this.field1552 -= var57;
                    }
                    this.field1242 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 146) {
                    this.field1406 = this.field1388.method229();
                    this.field1627 = this.field1388.method226();
                    this.field1331 = this.field1388.method224();
                    this.field1530 = this.field1388.method226();
                    this.field1521 = this.field1388.method224();
                    if (this.field1406 != 0 && this.field1481 == -1) {
                        signlink.dnslookup(JString.method298(939, this.field1406));
                        this.method450(-48789);
                        short var76 = 650;
                        if (this.field1331 != 201 || this.field1521 == 1) {
                            var76 = 655;
                        }
                        this.field1318 = "";
                        this.field1267 = false;
                        for (int var77 = 0; var77 < Component.field70.length; ++var77) {
                            if (Component.field70[var77] != null && Component.field70[var77].field79 == var76) {
                                this.field1481 = Component.field70[var77].field76;
                                break;
                            }
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 3) {
                    int var78 = this.field1388.method226();
                    int var79 = this.field1388.method226();
                    Component.field70[var78].field119 = 2;
                    Component.field70[var78].field120 = var79;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 239) {
                    int var80 = this.field1388.method227();
                    this.field1640 = var80;
                    this.field1336 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 85) {
                    int var81 = this.field1388.method227();
                    if (var81 >= 0) {
                        this.method474(var81, 962);
                    }
                    this.field1489 = var81;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 95) {
                    int var82 = this.field1388.method226();
                    int var83 = this.field1388.method227();
                    Component var84 = Component.field70[var82];
                    var84.field123 = var83;
                    if (var83 == -1) {
                        var84.field73 = 0;
                        var84.field74 = 0;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 21) {
                    this.method430(this.field1611);
                    this.field1235 = -1;
                    return false;
                }
                if (this.field1235 == 249) {
                    int var85 = this.field1388.method226();
                    int var86 = this.field1388.method226();
                    if (this.field1465 != -1) {
                        this.field1465 = -1;
                        this.field1336 = true;
                    }
                    if (this.field1664) {
                        this.field1664 = false;
                        this.field1336 = true;
                    }
                    this.field1481 = var85;
                    this.field1569 = var86;
                    this.field1253 = true;
                    this.field1458 = true;
                    this.field1260 = false;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 41) {
                    int var87 = this.field1388.method226();
                    String var88 = this.field1388.method231();
                    Component.field70[var87].field111 = var88;
                    if (this.field1346[this.field1482] == Component.field70[var87].field76) {
                        this.field1253 = true;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 75) {
                    this.field1517 = this.field1388.method224();
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 98 || this.field1235 == 218 || this.field1235 == 8 || this.field1235 == 114 || this.field1235 == 37 || this.field1235 == 115 || this.field1235 == 120 || this.field1235 == 30 || this.field1235 == 88 || this.field1235 == 70) {
                    this.method446(this.field1388, 675, this.field1235);
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 138) {
                    this.field1482 = this.field1388.method224();
                    this.field1253 = true;
                    this.field1458 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 136) {
                    this.field1253 = true;
                    int var89 = this.field1388.method224();
                    int var90 = this.field1388.method229();
                    int var91 = this.field1388.method224();
                    this.field1254[var89] = var90;
                    this.field1307[var89] = var91;
                    this.field1286[var89] = 1;
                    for (int var92 = 0; var92 < 98; ++var92) {
                        if (var90 >= field1369[var92]) {
                            this.field1286[var89] = var92 + 2;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 38) {
                    int var93 = this.field1388.method226();
                    int var94 = this.field1388.method226();
                    int var95 = var94 >> 10 & 31;
                    int var96 = var94 >> 5 & 31;
                    int var97 = var94 & 31;
                    Component.field70[var93].field113 = (var97 << 3) + (var95 << 19) + (var96 << 11);
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 25) {
                    int var98 = this.field1388.method226();
                    int var99 = this.field1388.method224();
                    int var100 = this.field1388.method226();
                    if (this.field1321 && !field1464 && this.field1325 < 50) {
                        this.field1665[this.field1325] = var98;
                        this.field1283[this.field1325] = var99;
                        this.field1308[this.field1325] = Wave.field905[var98] + var100;
                        ++this.field1325;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 55) {
                    this.field1242 = true;
                    this.field1288 = this.field1388.method224();
                    this.field1289 = this.field1388.method224();
                    this.field1290 = this.field1388.method226();
                    this.field1291 = this.field1388.method224();
                    this.field1292 = this.field1388.method224();
                    if (this.field1292 >= 100) {
                        this.field1491 = this.field1288 * 128 + 64;
                        this.field1493 = this.field1289 * 128 + 64;
                        this.field1492 = this.method525(this.field1636, this.field1491, (byte) -51, this.field1493) - this.field1290;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 167) {
                    this.field1242 = false;
                    for (int var101 = 0; var101 < 5; ++var101) {
                        this.field1588[var101] = false;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 227) {
                    int var102 = this.field1388.method226();
                    boolean var103 = this.field1388.method224() == 1;
                    Component.field70[var102].field91 = var103;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 164) {
                    if (this.field1482 == 12) {
                        this.field1253 = true;
                    }
                    this.field1317 = this.field1388.method227();
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 140) {
                    for (int var104 = 0; var104 < this.field1332.length; ++var104) {
                        if (this.field1506[var104] != this.field1332[var104]) {
                            this.field1332[var104] = this.field1506[var104];
                            this.method535(var104, -742);
                            this.field1253 = true;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 94) {
                    if (this.field1482 == 12) {
                        this.field1253 = true;
                    }
                    this.field1349 = this.field1388.method224();
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 143) {
                    this.field1398 = this.field1388.method226() * 30;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 168) {
                    int var105 = this.field1388.method226();
                    Component var106 = Component.field70[var105];
                    for (int var107 = 0; var107 < var106.field71.length; ++var107) {
                        var106.field71[var107] = -1;
                        var106.field71[var107] = 0;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 61) {
                    this.field1315 = this.field1388.method224();
                    this.field1316 = this.field1388.method224();
                    while (this.field1388.field702 < this.field1234) {
                        int var108 = this.field1388.method224();
                        this.method446(this.field1388, 675, var108);
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 58) {
                    this.field1323 = this.field1388.method224();
                    if (this.field1482 == this.field1323) {
                        if (this.field1323 == 3) {
                            this.field1482 = 1;
                        } else {
                            this.field1482 = 3;
                        }
                        this.field1253 = true;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 204) {
                    int var109 = this.field1388.method224();
                    int var110 = this.field1388.method224();
                    String var111 = this.field1388.method231();
                    if (var109 >= 1 && var109 <= 5) {
                        if (var111.equalsIgnoreCase("null")) {
                            var111 = null;
                        }
                        this.field1353[var109 - 1] = var111;
                        this.field1354[var109 - 1] = var110 == 0;
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 24) {
                    this.field1370 = this.field1388.method224();
                    this.field1278 = this.field1388.method224();
                    this.field1520 = this.field1388.method224();
                    this.field1514 = true;
                    this.field1336 = true;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 73) {
                    String var112 = this.field1388.method231();
                    if (var112.endsWith(":tradereq:")) {
                        String var113 = var112.substring(0, var112.indexOf(":"));
                        long var114 = JString.method295(var113);
                        boolean var116 = false;
                        for (int var117 = 0; var117 < this.field1615; ++var117) {
                            if (this.field1355[var117] == var114) {
                                var116 = true;
                                break;
                            }
                        }
                        if (!var116 && this.field1348 == 0) {
                            this.method526(-638, 4, "wishes to trade with you.", var113);
                        }
                    } else if (!var112.endsWith(":duelreq:")) {
                        this.method526(-638, 0, var112, "");
                    } else {
                        String var118 = var112.substring(0, var112.indexOf(":"));
                        long var119 = JString.method295(var118);
                        boolean var121 = false;
                        for (int var122 = 0; var122 < this.field1615; ++var122) {
                            if (this.field1355[var122] == var119) {
                                var121 = true;
                                break;
                            }
                        }
                        if (!var121 && this.field1348 == 0) {
                            this.method526(-638, 8, "wishes to duel with you.", var118);
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 225) {
                    int var123 = this.field1388.method224();
                    int var124 = this.field1388.method224();
                    int var125 = this.field1388.method224();
                    int var126 = this.field1388.method224();
                    this.field1588[var123] = true;
                    this.field1392[var123] = var124;
                    this.field1655[var123] = var125;
                    this.field1399[var123] = var126;
                    this.field1431[var123] = 0;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 170) {
                    this.field1253 = true;
                    int var127 = this.field1388.method226();
                    Component var128 = Component.field70[var127];
                    while (this.field1388.field702 < this.field1234) {
                        int var129 = this.field1388.method224();
                        int var130 = this.field1388.method226();
                        int var131 = this.field1388.method224();
                        if (var131 == 255) {
                            var131 = this.field1388.method229();
                        }
                        if (var129 >= 0 && var129 < var128.field71.length) {
                            var128.field71[var129] = var130;
                            var128.field72[var129] = var131;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 108) {
                    this.field1551 = 0;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 60) {
                    long var132 = this.field1388.method230(203);
                    int var134 = this.field1388.method229();
                    int var135 = this.field1388.method224();
                    boolean var136 = false;
                    for (int var137 = 0; var137 < 100; ++var137) {
                        if (this.field1414[var137] == var134) {
                            var136 = true;
                            break;
                        }
                    }
                    if (var135 <= 1) {
                        for (int var138 = 0; var138 < this.field1615; ++var138) {
                            if (this.field1355[var138] == var132) {
                                var136 = true;
                                break;
                            }
                        }
                    }
                    if (!var136 && this.field1348 == 0) {
                        try {
                            this.field1414[this.field1442] = var134;
                            this.field1442 = (this.field1442 + 1) % 100;
                            String var139 = WordPack.method302(this.field1234 - 13, this.field1388, this.field1486);
                            String var140 = WordFilter.method394(var139, this.field1490);
                            if (var135 != 2 && var135 != 3) {
                                if (var135 == 1) {
                                    this.method526(-638, 7, var140, "@cr1@" + JString.method299(584, JString.method296(-206, var132)));
                                } else {
                                    this.method526(-638, 3, var140, JString.method299(584, JString.method296(-206, var132)));
                                }
                            } else {
                                this.method526(-638, 7, var140, "@cr2@" + JString.method299(584, JString.method296(-206, var132)));
                            }
                        } catch (Exception var158) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 186) {
                    int var142 = this.field1388.method226();
                    byte var143 = this.field1388.method225();
                    this.field1506[var142] = var143;
                    if (this.field1332[var142] != var143) {
                        this.field1332[var142] = var143;
                        this.method535(var142, -742);
                        this.field1253 = true;
                        if (this.field1640 != -1) {
                            this.field1336 = true;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 211) {
                    int var144 = this.field1388.method226();
                    int var145 = this.field1388.method226();
                    Component.field70[var144].field119 = 1;
                    Component.field70[var144].field120 = var145;
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 159) {
                    this.field1315 = this.field1388.method224();
                    this.field1316 = this.field1388.method224();
                    for (int var146 = this.field1315; var146 < this.field1315 + 8; ++var146) {
                        for (int var147 = this.field1316; var147 < this.field1316 + 8; ++var147) {
                            if (this.field1341[this.field1636][var146][var147] != null) {
                                this.field1341[this.field1636][var146][var147] = null;
                                this.method491(var146, var147);
                            }
                        }
                    }
                    for (LocSpawned var148 = (LocSpawned) this.field1265.method243(); var148 != null; var148 = (LocSpawned) this.field1265.method245(30869)) {
                        if (var148.field722 >= this.field1315 && var148.field722 < this.field1315 + 8 && var148.field723 >= this.field1316 && var148.field723 < this.field1316 + 8 && this.field1636 == var148.field720) {
                            var148.field731 = 0;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 123) {
                    this.method448(this.field1388, false, this.field1234);
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 203) {
                    for (int var149 = 0; var149 < this.field1643.length; ++var149) {
                        if (this.field1643[var149] != null) {
                            this.field1643[var149].field421 = -1;
                        }
                    }
                    for (int var150 = 0; var150 < this.field1547.length; ++var150) {
                        if (this.field1547[var150] != null) {
                            this.field1547[var150].field421 = -1;
                        }
                    }
                    this.field1235 = -1;
                    return true;
                }
                if (this.field1235 == 27) {
                    int var151 = this.field1388.method226();
                    int var152 = this.field1388.method227();
                    int var153 = this.field1388.method227();
                    Component var154 = Component.field70[var151];
                    var154.field83 = var152;
                    var154.field84 = var153;
                    this.field1235 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1235 + "," + this.field1234 + " - " + this.field1408 + "," + this.field1409);
                this.method430(this.field1611);
            } catch (IOException var159) {
                this.method492(-35099);
            } catch (Exception var160) {
                String var156 = "T2 - " + this.field1235 + "," + this.field1408 + "," + this.field1409 + " - " + this.field1234 + "," + (field1311.field443[0] + this.field1393) + "," + (field1311.field444[0] + this.field1394) + " - ";
                for (int var157 = 0; var157 < this.field1234 && var157 < 50; ++var157) {
                    var156 = var156 + this.field1388.field701[var157] + ",";
                }
                signlink.reporterror(var156);
                this.method430(this.field1611);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    private final void method522(int arg0) {
        if (arg0 != 49343) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (LocSpawned var3 = (LocSpawned) this.field1265.method243(); var3 != null; var3 = (LocSpawned) this.field1265.method245(30869)) {
            if (var3.field731 == -1) {
                var3.field730 = 0;
                this.method500(var3, (byte) 33);
            } else {
                var3.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BZ)V")
    public final void method523(byte arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (arg0 == 2) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1265.method243(); var12 != null; var12 = (LocSpawned) this.field1265.method245(30869)) {
            if (var12.field720 == arg9 && var12.field722 == arg4 && var12.field723 == arg7 && var12.field721 == arg8) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field720 = arg9;
            var11.field721 = arg8;
            var11.field722 = arg4;
            var11.field723 = arg7;
            this.method500(var11, (byte) 33);
            this.field1265.method240(var11);
        }
        var11.field727 = arg6;
        var11.field729 = arg1;
        var11.field728 = arg5;
        var11.field730 = arg2;
        var11.field731 = arg0;
        int var13 = 93 / arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method525(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field1558[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field1454[var7][var5][var6] + this.field1454[var7][var5 + 1][var6] * var8 >> 7;
            if (arg2 != -51) {
                this.field1235 = this.field1388.method224();
            }
            int var11 = (128 - var8) * this.field1454[var7][var5][var6 + 1] + this.field1454[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method526(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1640 != -1) {
            this.field1609 = arg2;
            super.field28 = 0;
        }
        if (this.field1465 == -1) {
            this.field1336 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1269[var5] = this.field1269[var5 - 1];
            this.field1270[var5] = this.field1270[var5 - 1];
            this.field1271[var5] = this.field1271[var5 - 1];
        }
        this.field1269[0] = arg1;
        this.field1270[0] = arg3;
        this.field1271[0] = arg2;
        if (arg0 >= 0) {
            this.field1341 = null;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method527(boolean arg0) {
        int var2 = this.field1288 * 128 + 64;
        int var3 = this.field1289 * 128 + 64;
        int var4 = this.method525(this.field1636, var2, (byte) -51, var3) - this.field1290;
        if (this.field1491 < var2) {
            this.field1491 += (var2 - this.field1491) * this.field1292 / 1000 + this.field1291;
            if (this.field1491 > var2) {
                this.field1491 = var2;
            }
        }
        if (this.field1491 > var2) {
            this.field1491 -= (this.field1491 - var2) * this.field1292 / 1000 + this.field1291;
            if (this.field1491 < var2) {
                this.field1491 = var2;
            }
        }
        if (this.field1492 < var4) {
            this.field1492 += (var4 - this.field1492) * this.field1292 / 1000 + this.field1291;
            if (this.field1492 > var4) {
                this.field1492 = var4;
            }
        }
        if (this.field1492 > var4) {
            this.field1492 -= (this.field1492 - var4) * this.field1292 / 1000 + this.field1291;
            if (this.field1492 < var4) {
                this.field1492 = var4;
            }
        }
        if (this.field1493 < var3) {
            this.field1493 += (var3 - this.field1493) * this.field1292 / 1000 + this.field1291;
            if (this.field1493 > var3) {
                this.field1493 = var3;
            }
        }
        if (this.field1493 > var3) {
            this.field1493 -= (this.field1493 - var3) * this.field1292 / 1000 + this.field1291;
            if (this.field1493 < var3) {
                this.field1493 = var3;
            }
        }
        int var5 = this.field1449 * 128 + 64;
        int var6 = this.field1450 * 128 + 64;
        if (!arg0) {
            int var7 = this.method525(this.field1636, var5, (byte) -51, var6) - this.field1451;
            int var8 = var5 - this.field1491;
            int var9 = var7 - this.field1492;
            int var10 = var6 - this.field1493;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field1494 < var12) {
                this.field1494 += (var12 - this.field1494) * this.field1453 / 1000 + this.field1452;
                if (this.field1494 > var12) {
                    this.field1494 = var12;
                }
            }
            if (this.field1494 > var12) {
                this.field1494 -= (this.field1494 - var12) * this.field1453 / 1000 + this.field1452;
                if (this.field1494 < var12) {
                    this.field1494 = var12;
                }
            }
            int var14 = var13 - this.field1495;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field1495 += this.field1453 * var14 / 1000 + this.field1452;
                this.field1495 &= 2047;
            }
            if (var14 < 0) {
                this.field1495 -= -var14 * this.field1453 / 1000 + this.field1452;
                this.field1495 &= 2047;
            }
            int var15 = var13 - this.field1495;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field1495 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;IBI)V")
    public final void method528(Pix32 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 6) {
            boolean var5 = false;
        } else {
            this.field1320 = 408;
        }
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field1628 + this.field1247 & 2047;
            int var8 = Model.field595[var7];
            int var9 = Model.field596[var7];
            int var10 = var8 * 256 / (this.field1433 + 256);
            int var11 = var9 * 256 / (this.field1433 + 256);
            int var12 = arg1 * var11 + arg3 * var10 >> 16;
            int var13 = arg3 * var11 - arg1 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field1217.method190(var16 + 94 + 4 - 10, 83 - var17 - 20, 15, (byte) 61, 20, 256, 15, 20, var14);
        } else {
            this.method516(arg3, arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method529(int arg0) {
        if (arg0 == 5) {
            this.method515(this.field1340);
            if (this.field1503 == 1) {
                this.field1528[this.field1502 / 100].method185(this.field1501 - 8 - 4, this.field1500 - 8 - 4, 0);
            }
            if (this.field1503 == 2) {
                this.field1528[this.field1502 / 100 + 4].method185(this.field1501 - 8 - 4, this.field1500 - 8 - 4, 0);
                ++field1592;
                if (field1592 > 57) {
                    field1592 = 0;
                    this.field1324.method213(100, (byte) 48);
                }
            }
            if (this.field1489 != -1) {
                this.method513(this.field1489, 68, this.field1222);
                this.method422(0, 0, 0, 0, Component.field70[this.field1489]);
            }
            if (this.field1481 != -1) {
                this.method513(this.field1481, 68, this.field1222);
                this.method422(0, 0, 0, 0, Component.field70[this.field1481]);
            }
            this.method439(0);
            if (!this.field1439) {
                this.method514((byte) 9);
                this.method471(2);
            } else if (this.field1371 == 0) {
                this.method547(false);
            }
            if (this.field1517 == 1) {
                this.field1537[1].method185(296, 472, 0);
            }
            if (this.field1398 != 0) {
                int var2 = this.field1398 / 50;
                int var3 = var2 / 60;
                int var4 = var2 % 60;
                if (var4 < 10) {
                    this.field1403.method203(4, 474, 16776960, "System update in: " + var3 + ":0" + var4, 329);
                } else {
                    this.field1403.method203(4, 474, 16776960, "System update in: " + var3 + ":" + var4, 329);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method530(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method531(int arg0) {
        this.field1234 += arg0;
        try {
            this.field1213 = -1;
            this.field1479.method247();
            this.field1313.method247();
            Pix3D.method166(-291);
            this.method423(627);
            this.field1314.method50(0);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1280[var2].method352(true);
            }
            System.gc();
            World var3 = new World((byte) 5, 104, this.field1558, this.field1454, 104);
            int var4 = this.field1533.length;
            World.field43 = World3D.field281;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1275[var5] >> 8;
                int var7 = this.field1275[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field43 = false;
                }
            }
            if (World.field43) {
                this.field1314.method51(this.field1636, -837);
            } else {
                this.field1314.method51(0, -837);
            }
            this.field1324.method213(239, (byte) 48);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1275[var8] >> 8) * 64 - this.field1393;
                int var10 = (this.field1275[var8] & 255) * 64 - this.field1394;
                byte[] var11 = this.field1533[var8];
                if (var11 != null) {
                    var3.method15(this.field1566, var9, (this.field1214 - 6) * 8, (this.field1215 - 6) * 8, var11, var10);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1275[var12] >> 8) * 64 - this.field1393;
                int var14 = (this.field1275[var12] & 255) * 64 - this.field1394;
                byte[] var15 = this.field1533[var12];
                if (var15 == null && this.field1215 < 800) {
                    var3.method14(64, (byte) -117, 64, var13, var14);
                }
            }
            this.field1324.method213(239, (byte) 48);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1663[var16];
                if (var17 != null) {
                    int var18 = (this.field1275[var16] >> 8) * 64 - this.field1393;
                    int var19 = (this.field1275[var16] & 255) * 64 - this.field1394;
                    var3.method18(var18, this.field1314, (byte) 7, this.field1280, var17, var19);
                }
            }
            this.field1324.method213(239, (byte) 48);
            var3.method20(3, this.field1314, this.field1280);
            this.field1367.method253(-328);
            this.field1324.method213(239, (byte) 48);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method491(var20, var21);
                }
            }
            this.method522(49343);
        } catch (Exception var34) {
        }
        LocType.field983.method103();
        if (field1464 && signlink.cache_dat != null) {
            int var23 = this.field1583.method267(-561, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1583.method272(false, var24);
                if ((var25 & 121) == 0) {
                    Model.method124(5, var24);
                }
            }
        }
        System.gc();
        Pix3D.method167(20, 0);
        this.field1583.method278(21906);
        int var26 = (this.field1214 - 6) / 8 - 1;
        int var27 = (this.field1214 + 6) / 8 + 1;
        int var28 = (this.field1215 - 6) / 8 - 1;
        int var29 = (this.field1215 + 6) / 8 + 1;
        if (this.field1608) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1583.method269(false, var31, 0, var30);
                    if (var32 != -1) {
                        this.field1583.method279(3, var32, false);
                    }
                    int var33 = this.field1583.method269(false, var31, 1, var30);
                    if (var33 != -1) {
                        this.field1583.method279(3, var33, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILlb;)V")
    private final void method532(boolean arg0, int arg1, Packet arg2) {
        this.field1455 = 0;
        this.field1646 = 0;
        if (!arg0) {
            this.method544(387, arg2, arg1);
            this.method485(arg1, arg2, -839);
            this.method436(arg2, 823, arg1);
            this.method533(arg1, true, arg2);
            for (int var4 = 0; var4 < this.field1455; ++var4) {
                int var6 = this.field1456[var4];
                if (field1610 != this.field1643[var6].field438) {
                    this.field1643[var6] = null;
                }
            }
            if (arg2.field702 != arg1) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field702 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1644; ++var5) {
                    if (this.field1643[this.field1645[var5]] == null) {
                        signlink.reporterror(this.field1294 + " null entry in pl list - pos:" + var5 + " size:" + this.field1644);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 270);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1461 = Integer.parseInt(arg0[0]);
                field1462 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method432(-794);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method459(215);
                }
                if (arg0[3].equals("free")) {
                    field1463 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1463 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, (byte) -12, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLlb;)V")
    private final void method533(int arg0, boolean arg1, Packet arg2) {
        if (arg1) {
            for (int var4 = 0; var4 < this.field1646; ++var4) {
                int var5 = this.field1647[var4];
                PlayerEntity var6 = this.field1643[var5];
                int var7 = arg2.method224();
                if ((var7 & 128) == 128) {
                    var7 += arg2.method224() << 8;
                }
                this.method536(var5, -639, var6, arg2, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method534(byte arg0) {
        if (arg0 != -4) {
            this.field1235 = -1;
        }
        int var2 = 5;
        this.field1557[8] = 0;
        int var3 = 0;
        while (this.field1557[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(4, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method427("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 270);
                Packet var6 = new Packet((byte) 3, new byte[40]);
                var5.readFully(var6.field701, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1557[var7] = var6.method229();
                }
                int var8 = var6.method229();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1557[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1557[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1557[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1557[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1557[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1557[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(4, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method13(4, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field1273 = !this.field1273;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(II)V")
    public final void method535(int arg0, int arg1) {
        int var3 = VarpType.field1174[arg0].field1182;
        while (arg1 >= 0) {
            this.field1341 = null;
        }
        if (var3 != 0) {
            int var4 = this.field1332[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method172(29674, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method172(29674, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method172(29674, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method172(29674, 0.6D);
                }
                ObjType.field1078.method103();
                this.field1542 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1281;
                if (var4 == 0) {
                    this.method467(this.field1281, true, 0);
                    this.field1281 = true;
                }
                if (var4 == 1) {
                    this.method467(this.field1281, true, -400);
                    this.field1281 = true;
                }
                if (var4 == 2) {
                    this.method467(this.field1281, true, -800);
                    this.field1281 = true;
                }
                if (var4 == 3) {
                    this.method467(this.field1281, true, -1200);
                    this.field1281 = true;
                }
                if (var4 == 4) {
                    this.field1281 = false;
                }
                if (this.field1281 != var5 && !field1464) {
                    if (this.field1281) {
                        this.field1559 = this.field1484;
                        this.field1560 = false;
                        this.field1583.method274(2, this.field1559);
                    } else {
                        this.method543((byte) 0);
                    }
                    this.field1497 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1321 = true;
                    this.method443(0, 261);
                }
                if (var4 == 1) {
                    this.field1321 = true;
                    this.method443(-400, 261);
                }
                if (var4 == 2) {
                    this.field1321 = true;
                    this.method443(-800, 261);
                }
                if (var4 == 3) {
                    this.field1321 = true;
                    this.method443(-1200, 261);
                }
                if (var4 == 4) {
                    this.field1321 = false;
                }
            }
            if (var3 == 5) {
                this.field1460 = var4;
            }
            if (var3 == 6) {
                this.field1309 = var4;
            }
            if (var3 == 8) {
                this.field1245 = var4;
                this.field1336 = true;
            }
            if (var3 == 9) {
                this.field1212 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILab;Llb;I)V")
    private final void method536(int arg0, int arg1, PlayerEntity arg2, Packet arg3, int arg4) {
        if (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg4 & 1) == 1) {
            int var7 = arg3.method224();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet((byte) 3, var8);
            arg3.method233(4, var7, 0, var8);
            this.field1648[arg0] = var9;
            arg2.method116((byte) 1, var9);
        }
        if ((arg4 & 2) == 2) {
            int var10 = arg3.method226();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg2.field421 == var10) {
                arg2.field425 = 0;
            }
            int var11 = arg3.method224();
            if (arg2.field421 == var10 && var10 != -1) {
                int var12 = SeqType.field1131[var10].field1145;
                if (var12 == 1) {
                    arg2.field422 = 0;
                    arg2.field423 = 0;
                    arg2.field424 = var11;
                    arg2.field425 = 0;
                }
                if (var12 == 2) {
                    arg2.field425 = 0;
                }
            } else if (var10 == -1 || arg2.field421 == -1 || SeqType.field1131[var10].field1139 >= SeqType.field1131[arg2.field421].field1139) {
                arg2.field421 = var10;
                arg2.field422 = 0;
                arg2.field423 = 0;
                arg2.field424 = var11;
                arg2.field425 = 0;
                arg2.field447 = arg2.field442;
            }
        }
        if ((arg4 & 4) == 4) {
            arg2.field415 = arg3.method226();
            if (arg2.field415 == 65535) {
                arg2.field415 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg2.field405 = arg3.method231();
            arg2.field407 = 0;
            arg2.field408 = 0;
            arg2.field406 = 150;
            this.method526(-638, 2, arg2.field405, arg2.field455);
        }
        if ((arg4 & 16) == 16) {
            int var13 = arg3.method224();
            int var14 = arg3.method224();
            arg2.method114(field1610, var14, var13, (byte) 0);
            arg2.field412 = field1610 + 300;
            arg2.field413 = arg3.method224();
            arg2.field414 = arg3.method224();
        }
        if ((arg4 & 32) == 32) {
            arg2.field416 = arg3.method226();
            arg2.field417 = arg3.method226();
        }
        if ((arg4 & 64) == 64) {
            int var15 = arg3.method226();
            int var16 = arg3.method224();
            int var17 = arg3.method224();
            int var18 = arg3.field702;
            if (arg2.field455 != null && arg2.field456) {
                long var19 = JString.method295(arg2.field455);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field1615; ++var22) {
                        if (this.field1355[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field1348 == 0) {
                    try {
                        String var23 = WordPack.method302(var17, arg3, this.field1486);
                        String var24 = WordFilter.method394(var23, this.field1490);
                        arg2.field405 = var24;
                        arg2.field407 = var15 >> 8;
                        arg2.field408 = var15 & 255;
                        arg2.field406 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method526(-638, 1, var24, "@cr1@" + arg2.field455);
                            } else {
                                this.method526(-638, 2, var24, arg2.field455);
                            }
                        } else {
                            this.method526(-638, 1, var24, "@cr2@" + arg2.field455);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field702 = var17 + var18;
        }
        if ((arg4 & 256) == 256) {
            arg2.field426 = arg3.method226();
            int var26 = arg3.method229();
            arg2.field430 = var26 >> 16;
            arg2.field429 = (var26 & 65535) + field1610;
            arg2.field427 = 0;
            arg2.field428 = 0;
            if (arg2.field429 > field1610) {
                arg2.field427 = -1;
            }
            if (arg2.field426 == 65535) {
                arg2.field426 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg2.field431 = arg3.method224();
            arg2.field433 = arg3.method224();
            arg2.field432 = arg3.method224();
            arg2.field434 = arg3.method224();
            arg2.field435 = arg3.method226() + field1610;
            arg2.field436 = arg3.method226() + field1610;
            arg2.field437 = arg3.method224();
            arg2.method112(0);
        }
        if ((arg4 & 1024) == 1024) {
            int var27 = arg3.method224();
            int var28 = arg3.method224();
            arg2.method114(field1610, var28, var27, (byte) 0);
            arg2.field412 = field1610 + 300;
            arg2.field413 = arg3.method224();
            arg2.field414 = arg3.method224();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method537(boolean arg0) {
        ++this.field1457;
        this.method433((byte) 92, true);
        this.field1512 &= arg0;
        this.method501(true, -868);
        this.method433((byte) 92, false);
        this.method501(false, -868);
        this.method483(539);
        this.method551(0);
        if (!this.field1242) {
            int var2 = this.field1246;
            if (this.field1633 / 256 > var2) {
                var2 = this.field1633 / 256;
            }
            if (this.field1588[4] && this.field1655[4] + 128 > var2) {
                var2 = this.field1655[4] + 128;
            }
            int var3 = this.field1590 + this.field1247 & 2047;
            this.method426(true, this.field1261, var2 * 3 + 600, this.field1262, var2, this.method525(this.field1636, field1311.field393, (byte) -51, field1311.field394) - 50, var3);
        }
        int var4;
        if (!this.field1242) {
            var4 = this.method518(0);
        } else {
            var4 = this.method519(-693);
        }
        int var5 = this.field1491;
        int var6 = this.field1492;
        int var7 = this.field1493;
        int var8 = this.field1494;
        int var9 = this.field1495;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1588[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1392[var10] * 2 + 1) - (double) this.field1392[var10] + Math.sin((double) this.field1399[var10] / 100.0D * (double) this.field1431[var10]) * (double) this.field1655[var10]);
                if (var10 == 0) {
                    this.field1491 += var12;
                }
                if (var10 == 1) {
                    this.field1492 += var12;
                }
                if (var10 == 2) {
                    this.field1493 += var12;
                }
                if (var10 == 3) {
                    this.field1495 = this.field1495 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1494 += var12;
                    if (this.field1494 < 128) {
                        this.field1494 = 128;
                    }
                    if (this.field1494 > 383) {
                        this.field1494 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field649;
        Model.field590 = true;
        Model.field593 = 0;
        Model.field591 = super.field22 - 4;
        Model.field592 = super.field23 - 4;
        Pix2D.method154(true);
        this.field1314.method89(var4, -207, this.field1491, this.field1494, this.field1495, this.field1492, this.field1493);
        this.field1314.method64(this.field1437);
        this.method462(5);
        this.method456(true);
        this.method453(var11, 0);
        this.method529(this.field1293);
        this.field1367.method254(4, 4, super.field14, -884);
        this.field1491 = var5;
        this.field1492 = var6;
        this.field1493 = var7;
        this.field1494 = var8;
        this.field1495 = var9;
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (arg0 != -26623) {
            this.field1235 = -1;
        }
        int var2 = this.field1404.method202("Choose Option", true);
        for (int var3 = 0; var3 < this.field1268; ++var3) {
            int var11 = this.field1404.method202(this.field1499[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1268 * 15 + 21;
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
            this.field1439 = true;
            this.field1371 = 0;
            this.field1372 = var5;
            this.field1373 = var6;
            this.field1374 = var2;
            this.field1375 = this.field1268 * 15 + 22;
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
            this.field1439 = true;
            this.field1371 = 1;
            this.field1372 = var7;
            this.field1373 = var8;
            this.field1374 = var2;
            this.field1375 = this.field1268 * 15 + 22;
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
            this.field1439 = true;
            this.field1371 = 2;
            this.field1372 = var9;
            this.field1373 = var10;
            this.field1374 = var2;
            this.field1375 = this.field1268 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method539(int arg0) {
        for (int var2 = -1; var2 < this.field1644; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1642;
            } else {
                var3 = this.field1645[var2];
            }
            PlayerEntity var4 = this.field1643[var3];
            if (var4 != null) {
                this.method503(true, 1, var4);
            }
        }
        while (arg0 >= 0) {
            this.field1235 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method540(boolean arg0) {
        if (arg0) {
            this.field1417 = !this.field1417;
        }
        short var2 = 256;
        if (this.field1586 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1586 > 768) {
                    this.field1342[var3] = this.method550(this.field1343[var3], -33251, this.field1344[var3], 1024 - this.field1586);
                } else if (this.field1586 > 256) {
                    this.field1342[var3] = this.field1344[var3];
                } else {
                    this.field1342[var3] = this.method550(this.field1344[var3], -33251, this.field1343[var3], 256 - this.field1586);
                }
            }
        } else if (this.field1587 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1587 > 768) {
                    this.field1342[var4] = this.method550(this.field1343[var4], -33251, this.field1345[var4], 1024 - this.field1587);
                } else if (this.field1587 > 256) {
                    this.field1342[var4] = this.field1345[var4];
                } else {
                    this.field1342[var4] = this.method550(this.field1345[var4], -33251, this.field1343[var4], 256 - this.field1587);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1342[var5] = this.field1343[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1577.field744[var6] = this.field1525.field658[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1250[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1379[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1342[var26];
                    int var30 = this.field1577.field744[var8];
                    this.field1577.field744[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1577.method254(0, 0, super.field14, -884);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1578.field744[var10] = this.field1526.field658[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1250[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1379[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1342[var18];
                    int var22 = this.field1578.field744[var16];
                    this.field1578.field744[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1578.method254(637, 0, super.field14, -884);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method541(byte arg0) {
        if (this.field1339 == arg0) {
            boolean var2 = false;
        } else {
            this.method6();
        }
        Graphics var3 = this.method11(0).getGraphics();
        var3.setColor(Color.black);
        var3.fillRect(0, 0, 765, 503);
        this.method4(1, (byte) -48);
        if (this.field1593) {
            this.field1527 = false;
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
        if (this.field1350) {
            this.field1527 = false;
            var3.setFont(new Font("Helvetica", 1, 20));
            var3.setColor(Color.white);
            var3.drawString("Error - unable to load game!", 50, 50);
            var3.drawString("To play RuneScape make sure you play from", 50, 100);
            var3.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1377) {
            this.field1527 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(4, 20, "Starting up");
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field1428) {
            this.field1377 = true;
        } else {
            field1428 = true;
            boolean var1 = false;
            String var2 = this.method554(7);
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
                this.field1350 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1378[var3] = new FileStream(500000, signlink.cache_idx[var3], signlink.cache_dat, var3 + 1, 0);
                    }
                }
                try {
                    this.method534((byte) -4);
                    this.field1635 = this.method499(5693, "title screen", this.field1557[1], 1, 25, "title");
                    this.field1402 = new PixFont(this.field1635, field1319, "p11_full", false);
                    this.field1403 = new PixFont(this.field1635, field1319, "p12_full", false);
                    this.field1404 = new PixFont(this.field1635, field1319, "b12_full", false);
                    this.field1405 = new PixFont(this.field1635, field1319, "q8_full", true);
                    this.method489(12681);
                    this.method466(8);
                    Jagfile var4 = this.method499(5693, "config", this.field1557[2], 2, 30, "config");
                    Jagfile var5 = this.method499(5693, "interface", this.field1557[3], 3, 35, "interface");
                    Jagfile var6 = this.method499(5693, "2d graphics", this.field1557[4], 4, 40, "media");
                    Jagfile var7 = this.method499(5693, "textures", this.field1557[6], 6, 45, "textures");
                    Jagfile var8 = this.method499(5693, "chat system", this.field1557[7], 7, 50, "wordenc");
                    Jagfile var9 = this.method499(5693, "sound effects", this.field1557[8], 8, 55, "sounds");
                    this.field1558 = new byte[4][104][104];
                    this.field1454 = new int[4][105][105];
                    this.field1314 = new World3D(4, this.field1454, false, 104, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1280[var10] = new CollisionMap(104, -340, 104);
                    }
                    this.field1553 = new Pix32(512, 512);
                    Jagfile var11 = this.method499(5693, "update list", this.field1557[5], 5, 60, "versionlist");
                    this.method13(4, 60, "Connecting to update server");
                    this.field1583 = new OnDemand();
                    this.field1583.method265(var11, this);
                    AnimFrame.method44(this.field1583.method268(8));
                    Model.method122(this.field1583.method267(-561, 0), this.field1583);
                    if (!field1464) {
                        this.field1559 = 0;
                        try {
                            this.field1559 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1560 = false;
                        this.field1583.method274(2, this.field1559);
                        while (this.field1583.method275() > 0) {
                            this.method457((byte) 58);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                        }
                    }
                    this.method13(4, 65, "Requesting animations");
                    int var12 = this.field1583.method267(-561, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1583.method274(1, var13);
                    }
                    while (this.field1583.method275() > 0) {
                        int var14 = var12 - this.field1583.method275();
                        if (var14 > 0) {
                            this.method13(4, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method457((byte) 58);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                    }
                    this.method13(4, 70, "Requesting models");
                    int var15 = this.field1583.method267(-561, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1583.method272(false, var16);
                        if ((var17 & 1) != 0) {
                            this.field1583.method274(0, var16);
                        }
                    }
                    int var18 = this.field1583.method275();
                    while (this.field1583.method275() > 0) {
                        int var19 = var18 - this.field1583.method275();
                        if (var19 > 0) {
                            this.method13(4, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method457((byte) 58);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1378[0] != null) {
                        this.method13(4, 75, "Requesting maps");
                        this.field1583.method274(3, this.field1583.method269(false, 48, 0, 47));
                        this.field1583.method274(3, this.field1583.method269(false, 48, 1, 47));
                        this.field1583.method274(3, this.field1583.method269(false, 48, 0, 48));
                        this.field1583.method274(3, this.field1583.method269(false, 48, 1, 48));
                        this.field1583.method274(3, this.field1583.method269(false, 48, 0, 49));
                        this.field1583.method274(3, this.field1583.method269(false, 48, 1, 49));
                        this.field1583.method274(3, this.field1583.method269(false, 47, 0, 47));
                        this.field1583.method274(3, this.field1583.method269(false, 47, 1, 47));
                        this.field1583.method274(3, this.field1583.method269(false, 47, 0, 48));
                        this.field1583.method274(3, this.field1583.method269(false, 47, 1, 48));
                        this.field1583.method274(3, this.field1583.method269(false, 148, 0, 48));
                        this.field1583.method274(3, this.field1583.method269(false, 148, 1, 48));
                        int var20 = this.field1583.method275();
                        while (this.field1583.method275() > 0) {
                            int var21 = var20 - this.field1583.method275();
                            if (var21 > 0) {
                                this.method13(4, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method457((byte) 58);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1583.method267(-561, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1583.method272(false, var23);
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
                            this.field1583.method277(0, var23, var25, 954);
                        }
                    }
                    this.field1583.method270(field1463, 733);
                    if (!field1464) {
                        int var26 = this.field1583.method267(-561, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1583.method273(var27, true)) {
                                this.field1583.method277(2, var27, (byte) 1, 954);
                            }
                        }
                    }
                    this.method13(4, 80, "Unpacking media");
                    this.field1218 = new Pix8(var6, "invback", 0);
                    this.field1220 = new Pix8(var6, "chatback", 0);
                    this.field1219 = new Pix8(var6, "mapback", 0);
                    this.field1570 = new Pix8(var6, "backbase1", 0);
                    this.field1571 = new Pix8(var6, "backbase2", 0);
                    this.field1572 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1618[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1351 = new Pix32(var6, "compass", 0);
                    this.field1217 = new Pix32(var6, "mapedge", 0);
                    this.field1217.method182(2);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1585[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1400[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1532[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1537[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1435 = new Pix32(var6, "mapmarker", 0);
                    this.field1436 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1528[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1543 = new Pix32(var6, "mapdots", 0);
                    this.field1544 = new Pix32(var6, "mapdots", 1);
                    this.field1545 = new Pix32(var6, "mapdots", 2);
                    this.field1546 = new Pix32(var6, "mapdots", 3);
                    this.field1623 = new Pix8(var6, "scrollbar", 0);
                    this.field1624 = new Pix8(var6, "scrollbar", 1);
                    this.field1300 = new Pix8(var6, "redstone1", 0);
                    this.field1301 = new Pix8(var6, "redstone2", 0);
                    this.field1302 = new Pix8(var6, "redstone3", 0);
                    this.field1303 = new Pix8(var6, "redstone1", 0);
                    this.field1303.method195(5);
                    this.field1304 = new Pix8(var6, "redstone2", 0);
                    this.field1304.method195(5);
                    this.field1597 = new Pix8(var6, "redstone1", 0);
                    this.field1597.method196(-43068);
                    this.field1598 = new Pix8(var6, "redstone2", 0);
                    this.field1598.method196(-43068);
                    this.field1599 = new Pix8(var6, "redstone3", 0);
                    this.field1599.method196(-43068);
                    this.field1600 = new Pix8(var6, "redstone1", 0);
                    this.field1600.method195(5);
                    this.field1600.method196(-43068);
                    this.field1601 = new Pix8(var6, "redstone2", 0);
                    this.field1601.method195(5);
                    this.field1601.method196(-43068);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1631[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1419 = new PixMap(var35.field659, false, this.method11(0), var35.field660);
                    var35.method183(-47173, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1420 = new PixMap(var36.field659, false, this.method11(0), var36.field660);
                    var36.method183(-47173, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1421 = new PixMap(var37.field659, false, this.method11(0), var37.field660);
                    var37.method183(-47173, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1422 = new PixMap(var38.field659, false, this.method11(0), var38.field660);
                    var38.method183(-47173, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1423 = new PixMap(var39.field659, false, this.method11(0), var39.field660);
                    var39.method183(-47173, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1424 = new PixMap(var40.field659, false, this.method11(0), var40.field660);
                    var40.method183(-47173, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1425 = new PixMap(var41.field659, false, this.method11(0), var41.field660);
                    var41.method183(-47173, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1426 = new PixMap(var42.field659, false, this.method11(0), var42.field660);
                    var42.method183(-47173, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1427 = new PixMap(var43.field659, false, this.method11(0), var43.field660);
                    var43.method183(-47173, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1400[var48] != null) {
                            this.field1400[var48].method181(var44 + var47, var45 + var47, true, var46 + var47);
                        }
                        if (this.field1585[var48] != null) {
                            this.field1585[var48].method197(var44 + var47, var45 + var47, true, var46 + var47);
                        }
                    }
                    this.method13(4, 83, "Unpacking textures");
                    Pix3D.method168(var7, 4);
                    Pix3D.method172(29674, 0.8D);
                    Pix3D.method167(20, 0);
                    this.method13(4, 86, "Unpacking config");
                    SeqType.method374(645, var4);
                    LocType.method323(var4);
                    FloType.method364(645, var4);
                    ObjType.method339(var4);
                    NpcType.method333(var4);
                    IdkType.method368(645, var4);
                    SpotAnimType.method377(645, var4);
                    VarpType.method382(645, var4);
                    VarbitType.method380(645, var4);
                    ObjType.field1037 = field1463;
                    if (!field1464) {
                        this.method13(4, 90, "Unpacking sounds");
                        byte[] var49 = var9.method294("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet((byte) 3, var49);
                        Wave.method313(645, var50);
                    }
                    this.method13(4, 95, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1402, this.field1403, this.field1404, this.field1405 };
                    Component.method32((byte) -2, var6, var5, var51);
                    this.method13(4, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1219.field669[this.field1219.field671 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1274[var52] = var53;
                        this.field1446[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1219.field669[this.field1219.field671 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field1337[var56 - 5] = var57 - 25;
                        this.field1306[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method165(479, 96, 573);
                    this.field1637 = Pix3D.field640;
                    Pix3D.method165(190, 261, 573);
                    this.field1638 = Pix3D.field640;
                    Pix3D.method165(512, 334, 573);
                    this.field1639 = Pix3D.field640;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field638[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(var60, 500, 800, 512, true, 334);
                    WordFilter.method384(var8);
                    this.field1430 = new MouseTracking(this, field1272);
                    this.method12(this.field1430, 10);
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1614 + " " + this.field1443);
                    this.field1593 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method542(int arg0) {
        this.field1527 = false;
        while (this.field1507) {
            this.field1527 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1361 = null;
        this.field1362 = null;
        this.field1659 = null;
        this.field1342 = null;
        this.field1343 = null;
        this.field1344 = null;
        this.field1345 = null;
        this.field1232 = null;
        this.field1233 = null;
        this.field1379 = null;
        this.field1380 = null;
        this.field1525 = null;
        while (arg0 >= 0) {
            this.field1324.method214(241);
        }
        this.field1526 = null;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method543(byte arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field1462 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILlb;I)V")
    private final void method544(int arg0, Packet arg1, int arg2) {
        arg1.method234(this.field1625);
        int var4 = arg1.method235(0, 1);
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 != 0) {
            int var6 = arg1.method235(0, 2);
            if (var6 == 0) {
                this.field1647[this.field1646++] = this.field1642;
            } else if (var6 == 1) {
                int var7 = arg1.method235(0, 3);
                field1311.method111(var7, 591, false);
                int var8 = arg1.method235(0, 1);
                if (var8 == 1) {
                    this.field1647[this.field1646++] = this.field1642;
                }
            } else if (var6 == 2) {
                int var9 = arg1.method235(0, 3);
                field1311.method111(var9, 591, true);
                int var10 = arg1.method235(0, 3);
                field1311.method111(var10, 591, true);
                int var11 = arg1.method235(0, 1);
                if (var11 == 1) {
                    this.field1647[this.field1646++] = this.field1642;
                }
            } else if (var6 == 3) {
                this.field1636 = arg1.method235(0, 2);
                int var12 = arg1.method235(0, 7);
                int var13 = arg1.method235(0, 7);
                int var14 = arg1.method235(0, 1);
                field1311.method110(var12, var14 == 1, var13, -42455);
                int var15 = arg1.method235(0, 1);
                if (var15 == 1) {
                    this.field1647[this.field1646++] = this.field1642;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method545(byte arg0) {
        if (arg0 != -44) {
            this.field1324.method214(20);
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1370 = (this.field1370 + 1) % 4;
                this.field1514 = true;
                this.field1336 = true;
                this.field1324.method213(129, (byte) 48);
                this.field1324.method214(this.field1370);
                this.field1324.method214(this.field1278);
                this.field1324.method214(this.field1520);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1278 = (this.field1278 + 1) % 3;
                this.field1514 = true;
                this.field1336 = true;
                this.field1324.method213(129, (byte) 48);
                this.field1324.method214(this.field1370);
                this.field1324.method214(this.field1278);
                this.field1324.method214(this.field1520);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1520 = (this.field1520 + 1) % 3;
                this.field1514 = true;
                this.field1336 = true;
                this.field1324.method213(129, (byte) 48);
                this.field1324.method214(this.field1370);
                this.field1324.method214(this.field1278);
                this.field1324.method214(this.field1520);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                this.method450(-48789);
                this.field1318 = "";
                this.field1267 = false;
                for (int var2 = 0; var2 < Component.field70.length; ++var2) {
                    if (Component.field70[var2] != null && Component.field70[var2].field79 == 600) {
                        this.field1594 = this.field1481 = Component.field70[var2].field76;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1573 != null) {
                this.field1573.method38();
            }
        } catch (Exception var2) {
        }
        this.field1573 = null;
        this.method543((byte) 0);
        if (this.field1430 != null) {
            this.field1430.field986 = false;
        }
        this.field1430 = null;
        this.field1583.method266();
        this.field1583 = null;
        this.field1324 = null;
        this.field1535 = null;
        this.field1388 = null;
        this.field1275 = null;
        this.field1533 = null;
        this.field1663 = null;
        this.field1276 = null;
        this.field1277 = null;
        this.field1454 = null;
        this.field1558 = null;
        this.field1314 = null;
        this.field1280 = null;
        this.field1363 = null;
        this.field1239 = null;
        this.field1329 = null;
        this.field1330 = null;
        this.field1487 = null;
        this.field1365 = null;
        this.field1366 = null;
        this.field1367 = null;
        this.field1368 = null;
        this.field1554 = null;
        this.field1555 = null;
        this.field1556 = null;
        this.field1419 = null;
        this.field1420 = null;
        this.field1421 = null;
        this.field1422 = null;
        this.field1423 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1426 = null;
        this.field1427 = null;
        this.field1218 = null;
        this.field1219 = null;
        this.field1220 = null;
        this.field1570 = null;
        this.field1571 = null;
        this.field1572 = null;
        this.field1618 = null;
        this.field1300 = null;
        this.field1301 = null;
        this.field1302 = null;
        this.field1303 = null;
        this.field1304 = null;
        this.field1597 = null;
        this.field1598 = null;
        this.field1599 = null;
        this.field1600 = null;
        this.field1601 = null;
        this.field1351 = null;
        this.field1532 = null;
        this.field1537 = null;
        this.field1528 = null;
        this.field1543 = null;
        this.field1544 = null;
        this.field1545 = null;
        this.field1546 = null;
        this.field1585 = null;
        this.field1400 = null;
        this.field1621 = null;
        this.field1643 = null;
        this.field1645 = null;
        this.field1647 = null;
        this.field1648 = null;
        this.field1456 = null;
        this.field1547 = null;
        this.field1549 = null;
        this.field1341 = null;
        this.field1265 = null;
        this.field1313 = null;
        this.field1479 = null;
        this.field1562 = null;
        this.field1563 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1499 = null;
        this.field1332 = null;
        this.field1604 = null;
        this.field1605 = null;
        this.field1356 = null;
        this.field1553 = null;
        this.field1285 = null;
        this.field1221 = null;
        this.field1326 = null;
        this.field1577 = null;
        this.field1578 = null;
        this.field1574 = null;
        this.field1575 = null;
        this.field1576 = null;
        this.field1579 = null;
        this.field1580 = null;
        this.field1581 = null;
        this.field1582 = null;
        this.method542(this.field1305);
        LocType.method324((byte) 5);
        NpcType.method334((byte) 5);
        if (arg0 == 0) {
            ObjType.method340((byte) 5);
            FloType.field1093 = null;
            IdkType.field1110 = null;
            Component.field70 = null;
            UnkType.field1117 = null;
            SeqType.field1131 = null;
            SpotAnimType.field1153 = null;
            SpotAnimType.field1165 = null;
            VarpType.field1174 = null;
            super.field15 = null;
            PlayerEntity.field478 = null;
            Pix3D.method163((byte) 5);
            World3D.method49((byte) 5);
            Model.method121((byte) 5);
            AnimFrame.method46((byte) 5);
            System.gc();
            if (Linkable.field360) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method546(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1515 = "";
                this.field1516 = "Connecting to server...";
                this.method465(-13247, true);
            }
            this.field1573 = new ClientStream(this, 557, this.method530(field1462 + 43594));
            long var4 = JString.method295(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1324.field702 = 0;
            this.field1324.method214(14);
            this.field1324.method214(var6);
            this.field1573.method42(-991, 2, this.field1324.field701, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1573.method39();
            }
            int var8 = this.field1573.method39();
            if (var8 == 0) {
                this.field1573.method41(this.field1388.field701, 0, 8);
                this.field1388.field702 = 0;
                this.field1412 = this.field1388.method230(203);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1412 >> 32), (int) this.field1412 };
                this.field1324.field702 = 0;
                this.field1324.method214(10);
                this.field1324.method218(var9[0]);
                this.field1324.method218(var9[1]);
                this.field1324.method218(var9[2]);
                this.field1324.method218(var9[3]);
                this.field1324.method218(signlink.uid);
                this.field1324.method221(arg0);
                this.field1324.method221(arg1);
                this.field1324.method239(4, field1630, field1244);
                this.field1535.field702 = 0;
                if (arg2) {
                    this.field1535.method214(18);
                } else {
                    this.field1535.method214(16);
                }
                this.field1535.method214(this.field1324.field702 + 36 + 1 + 1 + 2);
                this.field1535.method214(255);
                this.field1535.method215(270);
                this.field1535.method214(field1464 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1535.method218(this.field1557[var10]);
                }
                this.field1535.method222(8, this.field1324.field701, 0, this.field1324.field702);
                this.field1324.field706 = new Isaac(0, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1478 = new Isaac(0, var9);
                this.field1573.method42(-991, this.field1535.field702, this.field1535.field701, 0);
                var8 = this.field1573.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method546(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1561 = this.field1573.method39();
                field1243 = this.field1573.method39() == 1;
                this.field1584 = 0L;
                this.field1352 = 0;
                this.field1430.field988 = 0;
                super.field19 = true;
                this.field1616 = true;
                this.field1512 = true;
                this.field1324.field702 = 0;
                this.field1388.field702 = 0;
                this.field1235 = -1;
                this.field1407 = -1;
                this.field1408 = -1;
                this.field1409 = -1;
                this.field1234 = 0;
                this.field1236 = 0;
                this.field1398 = 0;
                this.field1238 = 0;
                this.field1381 = 0;
                this.field1268 = 0;
                this.field1439 = false;
                super.field20 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1271[var12] = null;
                }
                this.field1255 = 0;
                this.field1226 = 0;
                this.field1485 = 0;
                this.field1325 = 0;
                this.field1567 = (int) (Math.random() * 100.0D) - 50;
                this.field1389 = (int) (Math.random() * 110.0D) - 55;
                this.field1590 = (int) (Math.random() * 80.0D) - 40;
                this.field1628 = (int) (Math.random() * 120.0D) - 60;
                this.field1433 = (int) (Math.random() * 30.0D) - 20;
                this.field1247 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1213 = -1;
                this.field1551 = 0;
                this.field1552 = 0;
                this.field1644 = 0;
                this.field1548 = 0;
                for (int var13 = 0; var13 < this.field1641; ++var13) {
                    this.field1643[var13] = null;
                    this.field1648[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1547[var14] = null;
                }
                field1311 = this.field1643[this.field1642] = new PlayerEntity();
                this.field1313.method247();
                this.field1479.method247();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1341[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1265 = new LinkList((byte) 5);
                this.field1416 = 0;
                this.field1415 = 0;
                this.field1640 = -1;
                this.field1465 = -1;
                this.field1481 = -1;
                this.field1569 = -1;
                this.field1489 = -1;
                this.field1260 = false;
                this.field1482 = 3;
                this.field1664 = false;
                this.field1439 = false;
                this.field1357 = false;
                this.field1609 = null;
                this.field1517 = 0;
                this.field1323 = -1;
                this.field1284 = true;
                this.method451((byte) 3);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1617[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1353[var19] = null;
                    this.field1354[var19] = false;
                }
                field1333 = 0;
                field1364 = 0;
                field1477 = 0;
                field1376 = 0;
                field1504 = 0;
                field1445 = 0;
                field1524 = 0;
                field1335 = 0;
                field1666 = 0;
                field1387 = 0;
                this.method488(584);
            } else if (var8 == 3) {
                this.field1515 = "";
                this.field1516 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1515 = "Your account has been disabled.";
                this.field1516 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1515 = "Your account is already logged in.";
                this.field1516 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1515 = "RuneScape has been updated!";
                this.field1516 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1515 = "This world is full.";
                this.field1516 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1515 = "Unable to connect.";
                this.field1516 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1515 = "Login limit exceeded.";
                this.field1516 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1515 = "Unable to connect.";
                this.field1516 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1516 = "Login server rejected session.";
                this.field1516 = "Please try again.";
            } else if (var8 == 12) {
                this.field1515 = "You need a members account to login to this world.";
                this.field1516 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1515 = "Could not complete login.";
                this.field1516 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1515 = "The server is being updated.";
                this.field1516 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1512 = true;
                this.field1324.field702 = 0;
                this.field1388.field702 = 0;
                this.field1235 = -1;
                this.field1407 = -1;
                this.field1408 = -1;
                this.field1409 = -1;
                this.field1234 = 0;
                this.field1236 = 0;
                this.field1398 = 0;
                this.field1268 = 0;
                this.field1439 = false;
                this.field1658 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1515 = "Login attempts exceeded.";
                this.field1516 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1515 = "You are standing in a members-only area.";
                this.field1516 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1515 = "Invalid loginserver requested";
                this.field1516 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1515 = "No response from server";
                    this.field1516 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1515 = "Unexpected server response";
                    this.field1516 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1573.method39(); var20 >= 0; --var20) {
                    this.field1515 = "You have only just left another world";
                    this.field1516 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method465(-13247, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method546(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1515 = "";
            this.field1516 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method547(boolean arg0) {
        int var2 = this.field1372;
        int var3 = this.field1373;
        int var4 = this.field1374;
        int var5 = this.field1375;
        int var6 = 6116423;
        Pix2D.method156(var6, var4, 0, var3, var5, var2);
        Pix2D.method156(0, var4 - 2, 0, var3 + 1, 16, var2 + 1);
        Pix2D.method157(var4 - 2, -17527, var5 - 19, var2 + 1, var3 + 18, 0);
        if (arg0) {
            this.field1397 = -499;
        }
        this.field1404.method203(var2 + 3, 474, var6, "Choose Option", var3 + 14);
        int var7 = super.field22;
        int var8 = super.field23;
        if (this.field1371 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1371 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1371 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1268; ++var9) {
            int var10 = (this.field1268 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1404.method205(this.field1499[var9], var10, 0, var11, var2 + 3, true);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method548(byte arg0) {
        if (arg0 != 39) {
            this.field1235 = this.field1388.method224();
        }
        if (this.field1360 == 0) {
            int var2 = super.field12 / 2 - 80;
            int var3 = super.field13 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field28 == 1 && super.field29 >= var2 - 75 && super.field29 <= var2 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1360 = 3;
                this.field1480 = 0;
            }
            int var4 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var4 - 75 && super.field29 <= var4 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1515 = "";
                this.field1516 = "Enter your username & password.";
                this.field1360 = 2;
                this.field1480 = 0;
            }
        } else if (this.field1360 == 2) {
            int var5 = super.field13 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field28 == 1 && super.field30 >= var16 - 15 && super.field30 < var16) {
                this.field1480 = 0;
            }
            var5 = var16 + 15;
            if (super.field28 == 1 && super.field30 >= var5 - 15 && super.field30 < var5) {
                this.field1480 = 1;
            }
            var5 += 15;
            int var6 = super.field12 / 2 - 80;
            int var7 = super.field13 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field28 == 1 && super.field29 >= var6 - 75 && super.field29 <= var6 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.method546(this.field1294, this.field1295, false);
                if (this.field1512) {
                    return;
                }
            }
            int var8 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var8 - 75 && super.field29 <= var8 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.field1360 = 0;
                this.field1294 = "";
                this.field1295 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(false);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1322.length(); ++var11) {
                        if (var9 == field1322.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1480 == 0) {
                        if (var9 == 8 && this.field1294.length() > 0) {
                            this.field1294 = this.field1294.substring(0, this.field1294.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1480 = 1;
                        }
                        if (var10) {
                            this.field1294 = this.field1294 + (char) var9;
                        }
                        if (this.field1294.length() > 12) {
                            this.field1294 = this.field1294.substring(0, 12);
                        }
                    } else if (this.field1480 == 1) {
                        if (var9 == 8 && this.field1295.length() > 0) {
                            this.field1295 = this.field1295.substring(0, this.field1295.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1480 = 0;
                        }
                        if (var10) {
                            this.field1295 = this.field1295 + (char) var9;
                        }
                        if (this.field1295.length() > 20) {
                            this.field1295 = this.field1295.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1360 == 3) {
                int var12 = super.field12 / 2;
                int var13 = super.field13 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field28 == 1 && super.field29 >= var12 - 75 && super.field29 <= var12 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                    this.field1360 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Z")
    public final boolean method549(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1564[arg1];
            if (arg0) {
                this.method6();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method550(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        return arg1 != -33251 ? this.field1305 : ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method551(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1479.method243();
        if (arg0 != 0) {
            this.field1293 = 426;
        }
        while (var2 != null) {
            if (this.field1636 == var2.field602 && !var2.field608) {
                if (field1610 >= var2.field601) {
                    var2.method150(8, this.field1222);
                    if (var2.field608) {
                        var2.method106();
                    } else {
                        this.field1314.method61(0, var2.field604, false, var2.field603, true, var2.field605, var2, var2.field602, 60, -1);
                    }
                }
            } else {
                var2.method106();
            }
            var2 = (SpotAnimEntity) this.field1479.method245(30869);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILy;)V")
    public final void method552(byte arg0, int arg1, PathingEntity arg2) {
        if (arg0 == -100) {
            this.method553(arg1, arg2.field394, -604, arg2.field393);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method525(this.field1636, arg3, (byte) -51, arg1) - arg0;
            if (arg2 < 0) {
                int var6 = arg3 - this.field1491;
                int var7 = var5 - this.field1492;
                int var8 = arg1 - this.field1493;
                int var9 = Model.field595[this.field1494];
                int var10 = Model.field596[this.field1494];
                int var11 = Model.field595[this.field1495];
                int var12 = Model.field596[this.field1495];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field1410 = (var13 << 9) / var17 + Pix3D.field634;
                    this.field1411 = (var16 << 9) / var17 + Pix3D.field635;
                } else {
                    this.field1410 = -1;
                    this.field1411 = -1;
                }
            }
        } else {
            this.field1410 = -1;
            this.field1411 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)Ljava/lang/String;")
    public final String method554(int arg0) {
        if (arg0 != 7) {
            this.field1513 = this.field1478.method290();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field17 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1369[var1] = var0 / 4;
        }
        field1461 = 10;
        field1463 = true;
        field1498 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1498[var3] = var2 - 1;
            var2 += var2;
        }
        field1538 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1539 = true;
        field1630 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
