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

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1223 = 3;

    @OriginalMember(owner = "client", name = "M", descriptor = "[J")
    private long[] field1224 = new long[200];

    @OriginalMember(owner = "client", name = "O", descriptor = "B")
    private byte field1226 = 8;

    @OriginalMember(owner = "client", name = "P", descriptor = "Z")
    private boolean field1227 = false;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[Lib;")
    private Pix32[] field1228 = new Pix32[8];

    @OriginalMember(owner = "client", name = "R", descriptor = "Z")
    private boolean field1229 = false;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private boolean field1231 = false;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field1233 = new int[1000];

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1234 = new int[1000];

    @OriginalMember(owner = "client", name = "ab", descriptor = "[Lib;")
    private Pix32[] field1238 = new Pix32[100];

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1240 = 753;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1242 = -1;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1243 = -1;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1246 = -1;

    @OriginalMember(owner = "client", name = "jb", descriptor = "B")
    private byte field1247 = 8;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1248 = 2048;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1249 = 2047;

    @OriginalMember(owner = "client", name = "mb", descriptor = "[Lab;")
    private PlayerEntity[] field1250 = new PlayerEntity[this.field1248];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    public int[] field1252 = new int[this.field1248];

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field1254 = new int[this.field1248];

    @OriginalMember(owner = "client", name = "rb", descriptor = "[Llb;")
    private Packet[] field1255 = new Packet[this.field1248];

    @OriginalMember(owner = "client", name = "sb", descriptor = "B")
    private byte field1256 = 48;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private final int[] field1258 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "vb", descriptor = "[I")
    private int[] field1259 = new int[100];

    @OriginalMember(owner = "client", name = "wb", descriptor = "[Ljava/lang/String;")
    private String[] field1260 = new String[100];

    @OriginalMember(owner = "client", name = "xb", descriptor = "[Ljava/lang/String;")
    private String[] field1261 = new String[100];

    @OriginalMember(owner = "client", name = "yb", descriptor = "[Lvb;")
    public FileStream[] field1262 = new FileStream[5];

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    private boolean field1263 = true;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1265 = -1;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "[I")
    private int[] field1266 = new int[50];

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lob;")
    private LinkList field1267 = new LinkList(464);

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1268 = 2301979;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[Lib;")
    private Pix32[] field1269 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field1271 = false;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private int[] field1272 = new int[256];

    @OriginalMember(owner = "client", name = "Jb", descriptor = "B")
    private byte field1273 = -41;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[Ljava/lang/String;")
    private String[] field1274 = new String[5];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[Z")
    private boolean[] field1275 = new boolean[5];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Z")
    private boolean field1276 = true;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private boolean field1278 = true;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Ljava/lang/String;")
    private String field1283 = "";

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private boolean field1286 = false;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client", name = "bc", descriptor = "[Ljc;")
    private CollisionMap[] field1291 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1293 = 1;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1296 = new int[Stats.field1162];

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field1298 = false;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Llb;")
    private Packet field1301 = Packet.method217(1, (byte) 38);

    @OriginalMember(owner = "client", name = "nc", descriptor = "Ljava/lang/String;")
    private String field1303 = "";

    @OriginalMember(owner = "client", name = "tc", descriptor = "[Lib;")
    private Pix32[] field1309 = new Pix32[20];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field1310 = new int[50];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[[[Lob;")
    private LinkList[][][] field1312 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljava/lang/String;")
    private String field1314 = "";

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljava/lang/String;")
    private String field1315 = "";

    @OriginalMember(owner = "client", name = "Gc", descriptor = "B")
    private byte field1322 = 4;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1323 = new CRC32();

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field1324 = new int[4000];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1325 = new int[4000];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1328 = 2;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Z")
    private boolean field1332 = true;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1333 = 7759444;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Lob;")
    private LinkList field1335 = new LinkList(464);

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field1338 = true;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1339 = -1;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1341 = 50;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1342 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field1343 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "cd", descriptor = "[I")
    private int[] field1344 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "dd", descriptor = "[I")
    private int[] field1345 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    private int[] field1346 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1347 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1348 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[Ljava/lang/String;")
    private String[] field1349 = new String[this.field1341];

    @OriginalMember(owner = "client", name = "id", descriptor = "[Lz;")
    private NpcEntity[] field1350 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    public int[] field1352 = new int[16384];

    @OriginalMember(owner = "client", name = "ld", descriptor = "Z")
    public boolean field1353 = true;

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    public int[] field1355 = new int[1000];

    @OriginalMember(owner = "client", name = "od", descriptor = "B")
    private byte field1356 = 1;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Llb;")
    private Packet field1357 = Packet.method217(1, (byte) 38);

    @OriginalMember(owner = "client", name = "rd", descriptor = "[B")
    private byte[] field1359 = new byte[16384];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1375 = -867;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1376 = -1;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[I")
    private int[] field1377 = new int[7];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field1381 = false;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Ljava/lang/String;")
    private String field1382 = "";

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Llb;")
    private Packet field1383 = Packet.method217(1, (byte) 38);

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field1384 = true;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Ljava/lang/String;")
    private String field1396 = "";

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field1400 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "[Ljb;")
    private Pix8[] field1401 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ie", descriptor = "[[I")
    private int[][] field1402 = new int[104][104];

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1403 = 19639;

    @OriginalMember(owner = "client", name = "ke", descriptor = "[I")
    private int[] field1404 = new int[9];

    @OriginalMember(owner = "client", name = "le", descriptor = "B")
    private byte field1405 = 9;

    @OriginalMember(owner = "client", name = "se", descriptor = "[I")
    private int[] field1412 = new int[33];

    @OriginalMember(owner = "client", name = "te", descriptor = "B")
    private byte field1413 = 1;

    @OriginalMember(owner = "client", name = "ve", descriptor = "B")
    private byte field1415 = 16;

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field1416 = new int[5];

    @OriginalMember(owner = "client", name = "xe", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Z")
    private boolean field1432 = false;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1433 = 3;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1434 = 3353893;

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field1439 = new int[200];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private boolean field1440 = false;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    public boolean field1450 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1466 = -1;

    @OriginalMember(owner = "client", name = "xf", descriptor = "[I")
    private int[] field1468 = new int[500];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field1469 = new int[500];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field1470 = new int[500];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field1471 = new int[500];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[[I")
    private int[][] field1477 = new int[104][104];

    @OriginalMember(owner = "client", name = "If", descriptor = "[Ljb;")
    private Pix8[] field1479 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Ljava/lang/String;")
    private String field1480 = "";

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private boolean field1481 = false;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "B")
    private byte field1482 = 1;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field1484 = false;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field1486 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[Lib;")
    private Pix32[] field1488 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field1491 = new int[Stats.field1162];

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field1503 = false;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1515 = -1;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1516 = -38693;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Ljava/lang/String;")
    private String field1520 = "";

    @OriginalMember(owner = "client", name = "yg", descriptor = "Ljava/lang/String;")
    private String field1521 = "";

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1526 = -1;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1528 = 2;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[Ljava/lang/String;")
    private String[] field1532 = new String[200];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "B")
    private byte field1533 = 73;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1545 = 6;

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field1550 = new int[5];

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field1554 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "gh", descriptor = "[J")
    private long[] field1555 = new long[100];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[[I")
    private int[][] field1556 = new int[104][104];

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1557 = true;

    @OriginalMember(owner = "client", name = "jh", descriptor = "B")
    private byte field1558 = -5;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Lob;")
    private LinkList field1559 = new LinkList(464);

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1561 = 1;

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field1562 = new int[5];

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    private boolean field1568 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field1570 = new int[5];

    @OriginalMember(owner = "client", name = "xh", descriptor = "B")
    private byte field1572 = 1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1575 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private final int field1578 = 100;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    private int[] field1579 = new int[100];

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[Ljava/lang/String;")
    private String[] field1580 = new String[500];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[Ljb;")
    private Pix8[] field1582 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Ld;")
    private Component field1583 = new Component();

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Z")
    private boolean field1585 = false;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    private int[] field1591 = new int[151];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    private int[] field1592 = new int[2000];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    public int[] field1593 = new int[2000];

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field1594 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1598 = 2;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1601 = 5063219;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Z")
    private boolean field1603 = false;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1605 = false;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1607 = -1;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Z")
    private boolean field1611 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1612 = -1;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field1618 = new int[5];

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1620 = 9;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1624 = 78;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1625 = -1;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    private boolean field1627 = false;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1628 = 128;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field1635 = false;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field1636 = new int[50];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1637 = -1;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1639 = -1;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field1641 = new int[33];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[Z")
    private boolean[] field1642 = new boolean[5];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field1643 = true;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field1654 = false;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field1669 = 9;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1672 = new int[151];

    @OriginalMember(owner = "client", name = "zj", descriptor = "[I")
    private int[] field1678 = new int[Stats.field1162];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field1680 = false;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "B")
    private byte field1686 = -42;

    @OriginalMember(owner = "client", name = "S", descriptor = "B")
    private static byte field1230 = -69;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private static int field1365 = 35850;

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private static boolean field1449 = true;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[I")
    private static int[] field1478 = new int[99];

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private static int field1497;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private static boolean field1499;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Ljava/lang/String;")
    private static String field1514;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    public static final int[] field1547;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[[I")
    public static final int[][] field1549;

    @OriginalMember(owner = "client", name = "ch", descriptor = "B")
    private static byte field1551;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "B")
    private static byte field1581;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1606;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1610;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private static int field1621;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private static int field1670;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    public static int[] field1671;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private static int field1257;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private static int field1290;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private static int field1294;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private static int field1295;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private static int field1299;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private static int field1304;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private static int field1334;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private static int field1379;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field1414;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private static int field1418;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private static int field1552;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private static int field1553;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private static int field1573;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private static int field1574;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private static int field1613;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field1622;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private static int field1665;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private static int field1668;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "J")
    private long field1288;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "J")
    public long field1319;

    @OriginalMember(owner = "client", name = "oh", descriptor = "J")
    private long field1563;

    @OriginalMember(owner = "client", name = "uh", descriptor = "J")
    private long field1569;

    @OriginalMember(owner = "client", name = "kj", descriptor = "J")
    private long field1663;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Le;")
    private ClientStream field1576;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lwb;")
    private Isaac field1239;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Lxb;")
    private Jagfile field1661;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Lfc;")
    public MouseTracking field1378;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Lub;")
    private OnDemand field1679;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Lib;")
    private Pix32 field1284;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Lib;")
    private Pix32 field1285;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lib;")
    private Pix32 field1399;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Lib;")
    private Pix32 field1502;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Lib;")
    private Pix32 field1535;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lib;")
    private Pix32 field1536;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Lib;")
    private Pix32 field1638;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Lib;")
    private Pix32 field1666;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Lib;")
    private Pix32 field1667;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Lib;")
    private Pix32 field1687;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Lib;")
    private Pix32 field1688;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "Lib;")
    private Pix32 field1689;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Lib;")
    private Pix32 field1690;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Ljb;")
    private Pix8 field1360;

    @OriginalMember(owner = "client", name = "td", descriptor = "Ljb;")
    private Pix8 field1361;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Ljb;")
    private Pix8 field1362;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Ljb;")
    private Pix8 field1363;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Ljb;")
    private Pix8 field1364;

    @OriginalMember(owner = "client", name = "af", descriptor = "Ljb;")
    private Pix8 field1446;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljb;")
    private Pix8 field1447;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Ljb;")
    private Pix8 field1448;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Ljb;")
    private Pix8 field1451;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Ljb;")
    private Pix8 field1452;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Ljb;")
    private Pix8 field1453;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Ljb;")
    private Pix8 field1454;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Ljb;")
    private Pix8 field1455;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Ljb;")
    private Pix8 field1543;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Ljb;")
    private Pix8 field1544;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Ljb;")
    private Pix8 field1681;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Ljb;")
    private Pix8 field1682;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Ljb;")
    private Pix8 field1683;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Ljb;")
    private Pix8 field1684;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Ljb;")
    private Pix8 field1685;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Lkb;")
    private PixFont field1279;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Lkb;")
    private PixFont field1280;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Lkb;")
    private PixFont field1281;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Lkb;")
    private PixFont field1282;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Lqb;")
    private PixMap field1366;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lqb;")
    private PixMap field1367;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Lqb;")
    private PixMap field1368;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Lqb;")
    private PixMap field1369;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Lqb;")
    private PixMap field1370;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Lqb;")
    private PixMap field1371;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Lqb;")
    private PixMap field1372;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Lqb;")
    private PixMap field1373;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lqb;")
    private PixMap field1374;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lqb;")
    private PixMap field1459;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lqb;")
    private PixMap field1460;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Lqb;")
    private PixMap field1461;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lqb;")
    private PixMap field1462;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Lqb;")
    private PixMap field1505;

    @OriginalMember(owner = "client", name = "jg", descriptor = "Lqb;")
    private PixMap field1506;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lqb;")
    private PixMap field1507;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lqb;")
    private PixMap field1508;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Lqb;")
    private PixMap field1509;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Lqb;")
    private PixMap field1510;

    @OriginalMember(owner = "client", name = "og", descriptor = "Lqb;")
    private PixMap field1511;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lqb;")
    private PixMap field1512;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lqb;")
    private PixMap field1513;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Lqb;")
    private PixMap field1614;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lqb;")
    private PixMap field1615;

    @OriginalMember(owner = "client", name = "pi", descriptor = "Lqb;")
    private PixMap field1616;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lab;")
    public static PlayerEntity field1534;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Lr;")
    private World3D field1501;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Ljava/lang/String;")
    private String field1336;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Ljava/lang/String;")
    private String field1337;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Ljava/lang/String;")
    public String field1424;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Ljava/lang/String;")
    public String field1475;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ljava/net/Socket;")
    private Socket field1457;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Z")
    private static boolean field1297;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private static boolean field1500;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    public static boolean field1546;

    @OriginalMember(owner = "client", name = "di", descriptor = "Z")
    public static boolean field1604;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "Z")
    public static boolean field1691;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[I")
    private int[] field1320;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[I")
    private int[] field1321;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field1517;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field1518;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field1519;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field1530;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field1531;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field1632;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[I")
    private int[] field1633;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field1646;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    private int[] field1647;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field1648;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    private int[] field1649;

    @OriginalMember(owner = "client", name = "N", descriptor = "[Ljb;")
    private Pix8[] field1225;

    @OriginalMember(owner = "client", name = "db", descriptor = "[[B")
    private byte[][] field1241;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[[B")
    private byte[][] field1577;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[[[B")
    private byte[][][] field1307;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[[[I")
    private int[][][] field1584;

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method429(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1503) {
                this.field1503 = false;
                this.field1432 = true;
            }
            int var3 = this.field1468[arg1];
            int var4 = this.field1469[arg1];
            int var5 = this.field1470[arg1];
            int var6 = this.field1471[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 737) {
                this.method432(true);
            }
            if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                String var7 = this.field1580[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = JString.method300(var7.substring(var8 + 5).trim());
                    if (var5 == 605) {
                        this.method509(7, var9);
                    }
                    if (var5 == 47) {
                        this.method553(var9, 571);
                    }
                    if (var5 == 513) {
                        this.method430(var9, this.field1686);
                    }
                    if (var5 == 884) {
                        this.method458(false, var9);
                    }
                }
            }
            if (var5 == 902) {
                String var11 = this.field1580[arg1];
                int var12 = var11.indexOf("@whi@");
                if (var12 != -1) {
                    long var13 = JString.method300(var11.substring(var12 + 5).trim());
                    int var15 = -1;
                    for (int var16 = 0; var16 < this.field1537; ++var16) {
                        if (this.field1224[var16] == var13) {
                            var15 = var16;
                            break;
                        }
                    }
                    if (var15 != -1 && this.field1439[var15] > 0) {
                        this.field1432 = true;
                        this.field1503 = false;
                        this.field1481 = true;
                        this.field1480 = "";
                        this.field1330 = 3;
                        this.field1563 = this.field1224[var15];
                        this.field1283 = "Enter message to send to " + this.field1532[var15];
                    }
                }
            }
            if (var5 == 370) {
                boolean var17 = this.method516(var4, var3, field1534.field456[0], 0, 0, 0, 0, 2, 4, 0, false, field1534.field457[0]);
                if (!var17) {
                    this.method516(var4, var3, field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                }
                this.field1522 = super.field30;
                this.field1523 = super.field31;
                this.field1525 = 2;
                this.field1524 = 0;
                this.field1383.method218(195, 0);
                this.field1383.method220(this.field1426 + var3);
                this.field1383.method220(this.field1427 + var4);
                this.field1383.method220(var6);
                this.field1383.method220(this.field1473);
            }
            if (var5 == 357) {
                this.method536(var6, 0, 5, var4, var3);
            }
            if (var5 == 743) {
                ++field1574;
                if (field1574 >= 124) {
                    this.field1383.method218(173, 0);
                    this.field1383.method220(37954);
                }
                this.method536(var6, 0, 98, var4, var3);
            }
            if (var5 == 275) {
                PlayerEntity var19 = this.field1250[var6];
                if (var19 != null) {
                    this.method516(var19.field457[0], var19.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                    this.field1522 = super.field30;
                    this.field1523 = super.field31;
                    this.field1525 = 2;
                    this.field1524 = 0;
                    this.field1383.method218(136, 0);
                    this.field1383.method220(var6);
                    this.field1383.method220(this.field1423);
                    this.field1383.method220(this.field1421);
                    this.field1383.method220(this.field1422);
                }
            }
            if (var5 == 1152) {
                ObjType var20 = ObjType.method348(var6);
                String var21;
                if (var20.field1057 != null) {
                    var21 = new String(var20.field1057);
                } else {
                    var21 = "It's a " + var20.field1056 + ".";
                }
                this.method484((byte) -97, "", var21, 0);
            }
            if (var5 == 102) {
                this.field1420 = 1;
                this.field1421 = var3;
                this.field1422 = var4;
                this.field1423 = var6;
                this.field1424 = ObjType.method348(var6).field1056;
                this.field1472 = 0;
                this.field1605 = true;
            } else {
                if (var5 == 1071) {
                    this.method536(var6, 0, 253, var4, var3);
                }
                if (var5 == 810 && this.method536(var6, 0, 215, var4, var3)) {
                    this.field1383.method220(this.field1423);
                    this.field1383.method220(this.field1421);
                    this.field1383.method220(this.field1422);
                }
                if (var5 == 563) {
                    this.field1383.method218(199, 0);
                    this.field1383.method220(var6);
                    this.field1383.method220(var3);
                    this.field1383.method220(var4);
                    this.field1383.method220(this.field1473);
                    this.field1435 = 0;
                    this.field1436 = var4;
                    this.field1437 = var3;
                    this.field1438 = 2;
                    if (Component.field73[var4].field79 == this.field1612) {
                        this.field1438 = 1;
                    }
                    if (Component.field73[var4].field79 == this.field1265) {
                        this.field1438 = 3;
                    }
                }
                if (var5 == 997 && !this.field1654) {
                    this.field1383.method218(223, 0);
                    this.field1383.method220(var4);
                    this.field1654 = true;
                }
                if (var5 == 131) {
                    PlayerEntity var22 = this.field1250[var6];
                    if (var22 != null) {
                        this.method516(var22.field457[0], var22.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        this.field1383.method218(97, 0);
                        this.field1383.method220(var6);
                        this.field1383.method220(this.field1473);
                    }
                }
                if (var5 == 524) {
                    String var23 = this.field1580[arg1];
                    int var24 = var23.indexOf("@whi@");
                    if (var24 != -1) {
                        if (this.field1612 == -1) {
                            this.method432(true);
                            this.field1303 = var23.substring(var24 + 5).trim();
                            this.field1657 = false;
                            for (int var25 = 0; var25 < Component.field73.length; ++var25) {
                                if (Component.field73[var25] != null && Component.field73[var25].field82 == 600) {
                                    this.field1466 = this.field1612 = Component.field73[var25].field79;
                                    break;
                                }
                            }
                        } else {
                            this.method484((byte) -97, "", "Please close the interface you have open before using 'report abuse'", 0);
                        }
                    }
                }
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 354) {
                        this.field1383.method218(87, 0);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1622;
                        }
                        if (field1622 >= 133) {
                            this.field1383.method218(203, 0);
                            this.field1383.method220(6118);
                        }
                        this.field1383.method218(198, 0);
                    }
                    if (var5 == 555) {
                        this.field1383.method218(130, 0);
                    }
                    if (var5 == 113) {
                        this.field1383.method218(88, 0);
                    }
                    if (var5 == 331) {
                        this.field1383.method218(125, 0);
                    }
                    this.field1383.method220(var6);
                    this.field1383.method220(var3);
                    this.field1383.method220(var4);
                    this.field1435 = 0;
                    this.field1436 = var4;
                    this.field1437 = var3;
                    this.field1438 = 2;
                    if (Component.field73[var4].field79 == this.field1612) {
                        this.field1438 = 1;
                    }
                    if (Component.field73[var4].field79 == this.field1265) {
                        this.field1438 = 3;
                    }
                }
                if (var5 == 899 && this.method536(var6, 0, 124, var4, var3)) {
                    this.field1383.method220(this.field1473);
                }
                if (var5 == 225) {
                    this.field1383.method218(62, 0);
                    this.field1383.method220(var4);
                    Component var26 = Component.field73[var4];
                    if (var26.field88 != null && var26.field88[0][0] == 5) {
                        int var27 = var26.field88[0][1];
                        if (this.field1593[var27] != var26.field90[0]) {
                            this.field1593[var27] = var26.field90[0];
                            this.method465(this.field1240, var27);
                            this.field1605 = true;
                        }
                    }
                }
                if (var5 == 625) {
                    this.method536(var6, 0, 238, var4, var3);
                }
                if (var5 == 1714) {
                    NpcEntity var28 = this.field1350[var6];
                    if (var28 != null) {
                        NpcType var29 = var28.field464;
                        if (var29.field1041 != null) {
                            var29 = var29.method345(930);
                        }
                        if (var29 != null) {
                            String var30;
                            if (var29.field1017 != null) {
                                var30 = new String(var29.field1017);
                            } else {
                                var30 = "It's a " + var29.field1016 + ".";
                            }
                            this.method484((byte) -97, "", var30, 0);
                        }
                    }
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var31 = this.field1250[var6];
                    if (var31 != null) {
                        this.method516(var31.field457[0], var31.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        if (var5 == 387) {
                            field1290 += var6;
                            if (field1290 >= 66) {
                                this.field1383.method218(222, 0);
                                this.field1383.method219(154);
                            }
                            this.field1383.method218(241, 0);
                        }
                        if (var5 == 185) {
                            this.field1383.method218(83, 0);
                        }
                        if (var5 == 27) {
                            this.field1383.method218(17, 0);
                        }
                        if (var5 == 499) {
                            this.field1383.method218(40, 0);
                        }
                        if (var5 == 639) {
                            ++field1418;
                            if (field1418 >= 52) {
                                this.field1383.method218(0, 0);
                                this.field1383.method219(131);
                            }
                            this.field1383.method218(10, 0);
                        }
                        this.field1383.method220(var6);
                    }
                }
                if (var5 == 240) {
                    NpcEntity var32 = this.field1350[var6];
                    if (var32 != null) {
                        this.method516(var32.field457[0], var32.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        this.field1383.method218(100, 0);
                        this.field1383.method220(var6);
                        this.field1383.method220(this.field1473);
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var33 = this.field1350[var6];
                    if (var33 != null) {
                        this.method516(var33.field457[0], var33.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        if (var5 == 209) {
                            this.field1383.method218(4, 0);
                        }
                        if (var5 == 852) {
                            this.field1383.method218(22, 0);
                        }
                        if (var5 == 793) {
                            this.field1383.method218(188, 0);
                        }
                        if (var5 == 242) {
                            this.field1383.method218(35, 0);
                        }
                        if (var5 == 309) {
                            this.field1383.method218(239, 0);
                        }
                        this.field1383.method220(var6);
                    }
                }
                if (var5 == 274) {
                    Component var34 = Component.field73[var4];
                    this.field1472 = 1;
                    this.field1473 = var4;
                    this.field1474 = var34.field133;
                    this.field1420 = 0;
                    this.field1605 = true;
                    String var35 = var34.field131;
                    if (var35.indexOf(" ") != -1) {
                        var35 = var35.substring(0, var35.indexOf(" "));
                    }
                    String var36 = var34.field131;
                    if (var36.indexOf(" ") != -1) {
                        var36 = var36.substring(var36.indexOf(" ") + 1);
                    }
                    this.field1475 = var35 + " " + var34.field132 + " " + var36;
                    if (this.field1474 == 16) {
                        this.field1605 = true;
                        this.field1433 = 3;
                        this.field1400 = true;
                    }
                } else {
                    if (var5 == 721) {
                        field1299 += var4;
                        if (field1299 >= 139) {
                            this.field1383.method218(202, 0);
                            this.field1383.method223(0);
                        }
                        this.method536(var6, 0, 207, var4, var3);
                    }
                    if (var5 == 507 || var5 == 957) {
                        String var37 = this.field1580[arg1];
                        int var38 = var37.indexOf("@whi@");
                        if (var38 != -1) {
                            String var39 = var37.substring(var38 + 5).trim();
                            String var40 = JString.method304(JString.method301(JString.method300(var39), this.field1223), -4015);
                            boolean var41 = false;
                            for (int var42 = 0; var42 < this.field1251; ++var42) {
                                PlayerEntity var43 = this.field1250[this.field1252[var42]];
                                if (var43 != null && var43.field471 != null && var43.field471.equalsIgnoreCase(var40)) {
                                    this.method516(var43.field457[0], var43.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                                    if (var5 == 507) {
                                        field1290 += var6;
                                        if (field1290 >= 66) {
                                            this.field1383.method218(222, 0);
                                            this.field1383.method219(154);
                                        }
                                        this.field1383.method218(241, 0);
                                    }
                                    if (var5 == 957) {
                                        ++field1418;
                                        if (field1418 >= 52) {
                                            this.field1383.method218(0, 0);
                                            this.field1383.method219(131);
                                        }
                                        this.field1383.method218(10, 0);
                                    }
                                    this.field1383.method220(this.field1252[var42]);
                                    var41 = true;
                                    break;
                                }
                            }
                            if (!var41) {
                                this.method484((byte) -97, "", "Unable to find " + var40, 0);
                            }
                        }
                    }
                    if (var5 == 435) {
                        this.field1383.method218(62, 0);
                        this.field1383.method220(var4);
                        Component var44 = Component.field73[var4];
                        if (var44.field88 != null && var44.field88[0][0] == 5) {
                            int var45 = var44.field88[0][1];
                            this.field1593[var45] = 1 - this.field1593[var45];
                            this.method465(this.field1240, var45);
                            this.field1605 = true;
                        }
                    }
                    if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                        boolean var46 = this.method516(var4, var3, field1534.field456[0], 0, 0, 0, 0, 2, 4, 0, false, field1534.field457[0]);
                        if (!var46) {
                            this.method516(var4, var3, field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        }
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        if (var5 == 662) {
                            field1295 += this.field1427;
                            if (field1295 >= 118) {
                                this.field1383.method218(26, 0);
                                this.field1383.method223(0);
                            }
                            this.field1383.method218(211, 0);
                        }
                        if (var5 == 617) {
                            this.field1383.method218(60, 0);
                        }
                        if (var5 == 778) {
                            this.field1383.method218(42, 0);
                        }
                        if (var5 == 139) {
                            if ((var3 & 3) == 0) {
                                ++field1304;
                            }
                            if (field1304 >= 123) {
                                this.field1383.method218(58, 0);
                                this.field1383.method223(0);
                            }
                            this.field1383.method218(27, 0);
                        }
                        if (var5 == 224) {
                            field1665 += var4;
                            if (field1665 >= 75) {
                                this.field1383.method218(41, 0);
                                this.field1383.method219(19);
                            }
                            this.field1383.method218(123, 0);
                        }
                        this.field1383.method220(this.field1426 + var3);
                        this.field1383.method220(this.field1427 + var4);
                        this.field1383.method220(var6);
                    }
                    if (var5 == 231) {
                        Component var48 = Component.field73[var4];
                        boolean var49 = true;
                        if (var48.field82 > 0) {
                            var49 = this.method481(var48, false);
                        }
                        if (var49) {
                            this.field1383.method218(62, 0);
                            this.field1383.method220(var4);
                        }
                    }
                    if (var5 == 1381) {
                        int var50 = var6 >> 14 & 32767;
                        LocType var51 = LocType.method330(var50);
                        String var52;
                        if (var51.field964 != null) {
                            var52 = new String(var51.field964);
                        } else {
                            var52 = "It's a " + var51.field963 + ".";
                        }
                        this.method484((byte) -97, "", var52, 0);
                    }
                    if (var5 == 829) {
                        NpcEntity var53 = this.field1350[var6];
                        if (var53 != null) {
                            this.method516(var53.field457[0], var53.field456[0], field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                            this.field1522 = super.field30;
                            this.field1523 = super.field31;
                            this.field1525 = 2;
                            this.field1524 = 0;
                            this.field1383.method218(120, 0);
                            this.field1383.method220(var6);
                            this.field1383.method220(this.field1423);
                            this.field1383.method220(this.field1421);
                            this.field1383.method220(this.field1422);
                        }
                    }
                    if (var5 == 111) {
                        boolean var54 = this.method516(var4, var3, field1534.field456[0], 0, 0, 0, 0, 2, 4, 0, false, field1534.field457[0]);
                        if (!var54) {
                            this.method516(var4, var3, field1534.field456[0], 0, 1, 0, 0, 2, 4, 1, false, field1534.field457[0]);
                        }
                        this.field1522 = super.field30;
                        this.field1523 = super.field31;
                        this.field1525 = 2;
                        this.field1524 = 0;
                        this.field1383.method218(163, 0);
                        this.field1383.method220(this.field1426 + var3);
                        this.field1383.method220(this.field1427 + var4);
                        this.field1383.method220(var6);
                        this.field1383.method220(this.field1423);
                        this.field1383.method220(this.field1421);
                        this.field1383.method220(this.field1422);
                    }
                    if (var5 == 398) {
                        this.field1383.method218(101, 0);
                        this.field1383.method220(var6);
                        this.field1383.method220(var3);
                        this.field1383.method220(var4);
                        this.field1383.method220(this.field1423);
                        this.field1383.method220(this.field1421);
                        this.field1383.method220(this.field1422);
                        this.field1435 = 0;
                        this.field1436 = var4;
                        this.field1437 = var3;
                        this.field1438 = 2;
                        if (Component.field73[var4].field79 == this.field1612) {
                            this.field1438 = 1;
                        }
                        if (Component.field73[var4].field79 == this.field1265) {
                            this.field1438 = 3;
                        }
                    }
                    if (var5 == 718) {
                        if (!this.field1381) {
                            this.field1501.method88(3818, super.field30 - 4, super.field31 - 4);
                        } else {
                            this.field1501.method88(3818, var3 - 4, var4 - 4);
                        }
                    }
                    if (var5 == 1328) {
                        ObjType var56 = ObjType.method348(var6);
                        Component var57 = Component.field73[var4];
                        String var58;
                        if (var57 != null && var57.field75[var3] >= 100000) {
                            var58 = var57.field75[var3] + " x " + var56.field1056;
                        } else if (var56.field1057 != null) {
                            var58 = new String(var56.field1057);
                        } else {
                            var58 = "It's a " + var56.field1056 + ".";
                        }
                        this.method484((byte) -97, "", var58, 0);
                    }
                    if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                        if (var5 == 795) {
                            this.field1383.method218(213, 0);
                        }
                        if (var5 == 694) {
                            this.field1383.method218(64, 0);
                        }
                        if (var5 == 681) {
                            ++field1257;
                            if (field1257 >= 116) {
                                this.field1383.method218(152, 0);
                                this.field1383.method222(13018169);
                            }
                            this.field1383.method218(254, 0);
                        }
                        if (var5 == 100) {
                            this.field1383.method218(127, 0);
                        }
                        if (var5 == 962) {
                            this.field1383.method218(156, 0);
                        }
                        this.field1383.method220(var6);
                        this.field1383.method220(var3);
                        this.field1383.method220(var4);
                        this.field1435 = 0;
                        this.field1436 = var4;
                        this.field1437 = var3;
                        this.field1438 = 2;
                        if (Component.field73[var4].field79 == this.field1612) {
                            this.field1438 = 1;
                        }
                        if (Component.field73[var4].field79 == this.field1265) {
                            this.field1438 = 3;
                        }
                    }
                    this.field1420 = 0;
                    this.field1472 = 0;
                    this.field1605 = true;
                    if (arg0 != 7) {
                        this.field1383.method219(115);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method430(long arg0, byte arg1) {
        if (arg1 == -42) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field1537; ++var4) {
                    if (this.field1224[var4] == arg0) {
                        --this.field1537;
                        this.field1605 = true;
                        for (int var5 = var4; var5 < this.field1537; ++var5) {
                            this.field1532[var5] = this.field1532[var5 + 1];
                            this.field1439[var5] = this.field1439[var5 + 1];
                            this.field1224[var5] = this.field1224[var5 + 1];
                        }
                        this.field1383.method218(160, 0);
                        this.field1383.method225(arg0, 359);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLib;II)V")
    public final void method431(boolean arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1629 + this.field1527 & 2047;
        this.field1450 &= arg0;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field616[var5];
            int var8 = Model.field617[var5];
            int var9 = var7 * 256 / (this.field1292 + 256);
            int var10 = var8 * 256 / (this.field1292 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method192(83 - var12 - arg1.field687 / 2 - 4, this.field1447, (byte) 7, var11 + 94 - arg1.field686 / 2 + 4);
            } else {
                arg1.method186(var11 + 94 - arg1.field686 / 2 + 4, true, 83 - var12 - arg1.field687 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method432(boolean arg0) {
        this.field1383.method218(165, 0);
        if (arg0) {
            if (this.field1607 != -1) {
                this.field1607 = -1;
                this.field1605 = true;
                this.field1654 = false;
                this.field1400 = true;
            }
            if (this.field1265 != -1) {
                this.field1265 = -1;
                this.field1432 = true;
                this.field1654 = false;
            }
            this.field1612 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lab;IIII)V")
    public final void method433(PlayerEntity arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field1534 != arg0) {
            if (this.field1483 < 400) {
                if (arg2 != 11712) {
                    for (int var6 = 1; var6 > 0; ++var6) {
                    }
                }
                String var7;
                if (arg0.field478 == 0) {
                    var7 = arg0.field471 + method547(field1534.field477, -198, arg0.field477) + " (level-" + arg0.field477 + ")";
                } else {
                    var7 = arg0.field471 + " (skill-" + arg0.field478 + ")";
                }
                if (this.field1420 == 1) {
                    this.field1580[this.field1483] = "Use " + this.field1424 + " with @whi@" + var7;
                    this.field1470[this.field1483] = 275;
                    this.field1471[this.field1483] = arg1;
                    this.field1468[this.field1483] = arg4;
                    this.field1469[this.field1483] = arg3;
                    ++this.field1483;
                } else if (this.field1472 == 1) {
                    if ((this.field1474 & 8) == 8) {
                        this.field1580[this.field1483] = this.field1475 + " @whi@" + var7;
                        this.field1470[this.field1483] = 131;
                        this.field1471[this.field1483] = arg1;
                        this.field1468[this.field1483] = arg4;
                        this.field1469[this.field1483] = arg3;
                        ++this.field1483;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field1274[var8] != null) {
                            this.field1580[this.field1483] = this.field1274[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field1274[var8].equalsIgnoreCase("attack")) {
                                if (arg0.field477 > field1534.field477) {
                                    var10 = 2000;
                                }
                                if (field1534.field494 != 0 && arg0.field494 != 0) {
                                    if (field1534.field494 == arg0.field494) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field1275[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field1470[this.field1483] = var10 + 639;
                            }
                            if (var8 == 1) {
                                this.field1470[this.field1483] = var10 + 499;
                            }
                            if (var8 == 2) {
                                this.field1470[this.field1483] = var10 + 27;
                            }
                            if (var8 == 3) {
                                this.field1470[this.field1483] = var10 + 387;
                            }
                            if (var8 == 4) {
                                this.field1470[this.field1483] = var10 + 185;
                            }
                            this.field1471[this.field1483] = arg1;
                            this.field1468[this.field1483] = arg4;
                            this.field1469[this.field1483] = arg3;
                            ++this.field1483;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field1483; ++var9) {
                    if (this.field1470[var9] == 718) {
                        this.field1580[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;BI)V")
    private final void method434(Packet arg0, byte arg1, int arg2) {
        this.field1354 = 0;
        this.field1253 = 0;
        this.method561(arg2, arg0, 0);
        this.method535(arg2, true, arg0);
        if (this.field1356 != arg1) {
            this.field1384 = !this.field1384;
        }
        this.method530(arg0, arg2, false);
        this.method460(arg0, (byte) -18, arg2);
        for (int var4 = 0; var4 < this.field1354; ++var4) {
            int var6 = this.field1355[var4];
            if (field1311 != this.field1250[var6].field451) {
                this.field1250[var6] = null;
            }
        }
        if (arg0.field722 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field722 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1251; ++var5) {
                if (this.field1250[this.field1252[var5]] == null) {
                    signlink.reporterror(this.field1314 + " null entry in pl list - pos:" + var5 + " size:" + this.field1251);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method435(boolean arg0) {
        if (this.field1445 > 0) {
            this.method503(-5861);
        } else {
            this.field1461.method258(6745);
            this.field1280.method202("Connection lost", false, 0, 257, 144);
            this.field1280.method202("Connection lost", false, 16777215, 256, 143);
            this.field1280.method202("Please wait - attempting to reestablish", false, 0, 257, 159);
            if (!arg0) {
                this.field1442 = this.field1357.method229();
            }
            this.field1280.method202("Please wait - attempting to reestablish", false, 16777215, 256, 158);
            this.field1461.method259(4, 4, super.field15, this.field1411);
            this.field1548 = 0;
            this.field1397 = 0;
            ClientStream var2 = this.field1576;
            this.field1450 = false;
            this.field1305 = 0;
            this.method488(this.field1314, this.field1315, true);
            if (!this.field1450) {
                this.method503(-5861);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method436(boolean arg0) {
        if (this.field1658 > 1) {
            --this.field1658;
        }
        if (this.field1445 > 0) {
            --this.field1445;
        }
        for (int var2 = 0; var2 < 5 && this.method557((byte) 6); ++var2) {
        }
        if (this.field1450) {
            Object var3 = this.field1378.field1001;
            synchronized (this.field1378.field1001) {
                if (!field1546) {
                    this.field1378.field1002 = 0;
                } else if (super.field29 != 0 || this.field1378.field1002 >= 40) {
                    this.field1383.method218(151, 0);
                    this.field1383.method219(0);
                    int var4 = this.field1383.field722;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1378.field1002 && var4 - this.field1383.field722 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1378.field1004[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1378.field1003[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1378.field1004[var6] == -1 && this.field1378.field1003[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1599 == var8 && this.field1600 == var7) {
                            if (this.field1395 < 2047) {
                                ++this.field1395;
                            }
                        } else {
                            int var10 = var8 - this.field1599;
                            this.field1599 = var8;
                            int var11 = var7 - this.field1600;
                            this.field1600 = var7;
                            if (this.field1395 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1383.method220((this.field1395 << 12) + (var10 << 6) + var11);
                                this.field1395 = 0;
                            } else if (this.field1395 < 8) {
                                this.field1383.method222((this.field1395 << 19) + 8388608 + var9);
                                this.field1395 = 0;
                            } else {
                                this.field1383.method223((this.field1395 << 19) + -1073741824 + var9);
                                this.field1395 = 0;
                            }
                        }
                    }
                    this.field1383.method228(this.field1383.field722 - var4, -486);
                    if (var5 >= this.field1378.field1002) {
                        this.field1378.field1002 = 0;
                    } else {
                        this.field1378.field1002 -= var5;
                        for (int var12 = 0; var12 < this.field1378.field1002; ++var12) {
                            this.field1378.field1003[var12] = this.field1378.field1003[var5 + var12];
                            this.field1378.field1004[var12] = this.field1378.field1004[var5 + var12];
                        }
                    }
                }
            }
            if (super.field29 != 0) {
                long var13 = (super.field32 - this.field1319) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1319 = super.field32;
                int var15 = super.field31;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field30;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field29 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1383.method218(240, 0);
                this.field1383.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1567 > 0) {
                --this.field1567;
            }
            if (super.field33[1] == 1 || super.field33[2] == 1 || super.field33[3] == 1 || super.field33[4] == 1) {
                this.field1568 = true;
            }
            if (this.field1568 && this.field1567 <= 0) {
                this.field1567 = 20;
                this.field1568 = false;
                this.field1383.method218(169, 0);
                this.field1383.method220(this.field1628);
                this.field1383.method220(this.field1629);
            }
            if (super.field20 && !this.field1353) {
                this.field1353 = true;
                this.field1383.method218(247, 0);
                this.field1383.method219(1);
            }
            if (!super.field20 && this.field1353) {
                this.field1353 = false;
                this.field1383.method218(247, 0);
                this.field1383.method219(0);
            }
            this.method491(9);
            this.method537(true);
            this.method541(true);
            ++this.field1443;
            if (this.field1443 > 750) {
                this.method435(this.field1338);
            }
            this.method527(535);
            this.method441((byte) -16);
            this.method439(-9963);
            ++this.field1490;
            if (this.field1525 != 0) {
                this.field1524 += 20;
                if (this.field1524 >= 400) {
                    this.field1525 = 0;
                }
            }
            if (this.field1438 != 0) {
                ++this.field1435;
                if (this.field1435 >= 15) {
                    if (this.field1438 == 2) {
                        this.field1605 = true;
                    }
                    if (this.field1438 == 3) {
                        this.field1432 = true;
                    }
                    this.field1438 = 0;
                }
            }
            if (this.field1494 != 0) {
                ++this.field1602;
                if (super.field23 > this.field1495 + 5 || super.field23 < this.field1495 - 5 || super.field24 > this.field1496 + 5 || super.field24 < this.field1496 - 5) {
                    this.field1326 = true;
                }
                if (super.field22 == 0) {
                    if (this.field1494 == 2) {
                        this.field1605 = true;
                    }
                    if (this.field1494 == 3) {
                        this.field1432 = true;
                    }
                    this.field1494 = 0;
                    if (this.field1326 && this.field1602 >= 5) {
                        this.field1317 = -1;
                        this.method496(0);
                        if (this.field1492 == this.field1317 && this.field1493 != this.field1316) {
                            Component var20 = Component.field73[this.field1492];
                            byte var21 = 0;
                            if (this.field1626 == 1 && var20.field82 == 206) {
                                var21 = 1;
                            }
                            if (var20.field74[this.field1316] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field103) {
                                int var22 = this.field1493;
                                int var23 = this.field1316;
                                var20.field74[var23] = var20.field74[var22];
                                var20.field75[var23] = var20.field75[var22];
                                var20.field74[var22] = -1;
                                var20.field75[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1493;
                                int var25 = this.field1316;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24, (byte) 2, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24, (byte) 2, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1493, (byte) 2, this.field1316);
                            }
                            this.field1383.method218(38, 0);
                            this.field1383.method220(this.field1492);
                            this.field1383.method220(this.field1493);
                            this.field1383.method220(this.field1316);
                            this.field1383.method219(var21);
                        }
                    } else if ((this.field1318 == 1 || this.method556(field1553, this.field1483 - 1)) && this.field1483 > 2) {
                        this.method523(false);
                    } else if (this.field1483 > 0) {
                        this.method429((byte) 7, this.field1483 - 1);
                    }
                    this.field1435 = 10;
                    super.field29 = 0;
                }
            }
            ++field1379;
            if (field1379 > 62) {
                field1379 = 0;
                this.field1383.method218(6, 0);
            }
            if (World3D.field323 != -1) {
                int var26 = World3D.field323;
                int var27 = World3D.field324;
                boolean var28 = this.method516(var27, var26, field1534.field456[0], 0, 0, 0, 0, 0, 4, 0, true, field1534.field457[0]);
                World3D.field323 = -1;
                if (var28) {
                    this.field1522 = super.field30;
                    this.field1523 = super.field31;
                    this.field1525 = 1;
                    this.field1524 = 0;
                }
            }
            if (super.field29 == 1 && this.field1337 != null) {
                this.field1337 = null;
                this.field1432 = true;
                super.field29 = 0;
            }
            this.method560(this.field1298);
            this.method531(17250);
            this.field1450 &= arg0;
            this.method528(1639);
            this.method463(256);
            if (super.field22 == 1 || super.field29 == 1) {
                ++this.field1277;
            }
            if (this.field1617 == 2) {
                this.method438(-38787);
            }
            if (this.field1617 == 2 && this.field1264) {
                this.method548((byte) 2);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1562[var29]++;
            }
            this.method474(538);
            ++super.field21;
            if (super.field21 > 4500) {
                this.field1445 = 250;
                super.field21 -= 500;
                this.field1383.method218(80, 0);
            }
            ++this.field1644;
            if (this.field1644 > 500) {
                this.field1644 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1327 += this.field1328;
                }
                if ((var30 & 2) == 2) {
                    this.field1597 += this.field1598;
                }
                if ((var30 & 4) == 4) {
                    this.field1560 += this.field1561;
                }
            }
            if (this.field1327 < -50) {
                this.field1328 = 2;
            }
            if (this.field1327 > 50) {
                this.field1328 = -2;
            }
            if (this.field1597 < -55) {
                this.field1598 = 2;
            }
            if (this.field1597 > 55) {
                this.field1598 = -2;
            }
            if (this.field1560 < -40) {
                this.field1561 = 1;
            }
            if (this.field1560 > 40) {
                this.field1561 = -1;
            }
            ++this.field1485;
            if (this.field1485 > 500) {
                this.field1485 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1527 += this.field1528;
                }
                if ((var31 & 2) == 2) {
                    this.field1292 += this.field1293;
                }
            }
            if (this.field1527 < -60) {
                this.field1528 = 2;
            }
            if (this.field1527 > 60) {
                this.field1528 = -2;
            }
            if (this.field1292 < -20) {
                this.field1293 = 1;
            }
            if (this.field1292 > 10) {
                this.field1293 = -1;
            }
            ++this.field1444;
            if (this.field1444 > 50) {
                this.field1383.method218(115, 0);
            }
            try {
                if (this.field1576 != null && this.field1383.field722 > 0) {
                    this.field1576.method42(this.field1383.field722, (byte) 3, 0, this.field1383.field721);
                    this.field1383.field722 = 0;
                    this.field1444 = 0;
                }
            } catch (IOException var33) {
                this.method435(this.field1338);
            } catch (Exception var34) {
                this.method503(-5861);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method437(String arg0) throws IOException {
        if (!this.field1329) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1457 != null) {
                try {
                    this.field1457.close();
                } catch (Exception var4) {
                }
                this.field1457 = null;
            }
            this.field1457 = this.method500(43595);
            this.field1457.setSoTimeout(10000);
            InputStream var2 = this.field1457.getInputStream();
            OutputStream var3 = this.field1457.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 != -38787) {
            this.field1375 = this.field1239.method295();
        }
        try {
            int var2 = field1534.field406 + this.field1327;
            int var3 = field1534.field407 + this.field1597;
            if (this.field1565 - var2 < -500 || this.field1565 - var2 > 500 || this.field1566 - var3 < -500 || this.field1566 - var3 > 500) {
                this.field1565 = var2;
                this.field1566 = var3;
            }
            if (this.field1565 != var2) {
                this.field1565 += (var2 - this.field1565) / 16;
            }
            if (this.field1566 != var3) {
                this.field1566 += (var3 - this.field1566) / 16;
            }
            if (super.field33[1] == 1) {
                this.field1630 += (-24 - this.field1630) / 2;
            } else if (super.field33[2] == 1) {
                this.field1630 += (24 - this.field1630) / 2;
            } else {
                this.field1630 /= 2;
            }
            if (super.field33[3] == 1) {
                this.field1631 += (12 - this.field1631) / 2;
            } else if (super.field33[4] == 1) {
                this.field1631 += (-12 - this.field1631) / 2;
            } else {
                this.field1631 /= 2;
            }
            this.field1629 = this.field1630 / 2 + this.field1629 & 2047;
            this.field1628 += this.field1631 / 2;
            if (this.field1628 < 128) {
                this.field1628 = 128;
            }
            if (this.field1628 > 383) {
                this.field1628 = 383;
            }
            int var4 = this.field1565 >> 7;
            int var5 = this.field1566 >> 7;
            int var6 = this.method532(this.field1565, this.field1542, (byte) 8, this.field1566);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1542;
                        if (var10 < 3 && (this.field1307[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1584[var10][var8][var9];
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
            if (var12 > this.field1662) {
                this.field1662 += (var12 - this.field1662) / 24;
            } else if (var12 < this.field1662) {
                this.field1662 += (var12 - this.field1662) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1534.field406 + "," + field1534.field407 + "," + this.field1565 + "," + this.field1566 + "," + this.field1659 + "," + this.field1660 + "," + this.field1426 + "," + this.field1427);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method439(int arg0) {
        for (int var2 = -1; var2 < this.field1251; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1249;
            } else {
                var6 = this.field1252[var2];
            }
            PlayerEntity var7 = this.field1250[var6];
            if (var7 != null && var7.field419 > 0) {
                --var7.field419;
                if (var7.field419 == 0) {
                    var7.field418 = null;
                }
            }
        }
        if (arg0 == -9963) {
            for (int var3 = 0; var3 < this.field1351; ++var3) {
                int var4 = this.field1352[var3];
                NpcEntity var5 = this.field1350[var4];
                if (var5 != null && var5.field419 > 0) {
                    --var5.field419;
                    if (var5.field419 == 0) {
                        var5.field418 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1576 != null) {
                this.field1576.method38();
            }
        } catch (Exception var2) {
        }
        this.field1576 = null;
        this.method562(0);
        if (this.field1378 != null) {
            this.field1378.field1000 = false;
        }
        this.field1378 = null;
        this.field1679.method271();
        this.field1679 = null;
        this.field1383 = null;
        this.field1301 = null;
        this.field1357 = null;
        this.field1529 = null;
        this.field1241 = null;
        this.field1577 = null;
        this.field1530 = null;
        this.field1531 = null;
        this.field1584 = null;
        this.field1307 = null;
        this.field1501 = null;
        this.field1291 = null;
        this.field1477 = null;
        this.field1402 = null;
        this.field1324 = null;
        this.field1325 = null;
        this.field1359 = null;
        this.field1459 = null;
        this.field1460 = null;
        this.field1461 = null;
        this.field1462 = null;
        this.field1614 = null;
        this.field1615 = null;
        this.field1616 = null;
        this.field1366 = null;
        this.field1367 = null;
        this.field1368 = null;
        if (!arg0) {
            this.field1369 = null;
            this.field1370 = null;
            this.field1371 = null;
            this.field1372 = null;
            this.field1373 = null;
            this.field1374 = null;
            this.field1446 = null;
            this.field1447 = null;
            this.field1448 = null;
            this.field1681 = null;
            this.field1682 = null;
            this.field1683 = null;
            this.field1582 = null;
            this.field1360 = null;
            this.field1361 = null;
            this.field1362 = null;
            this.field1363 = null;
            this.field1364 = null;
            this.field1451 = null;
            this.field1452 = null;
            this.field1453 = null;
            this.field1454 = null;
            this.field1455 = null;
            this.field1502 = null;
            this.field1309 = null;
            this.field1488 = null;
            this.field1228 = null;
            this.field1687 = null;
            this.field1688 = null;
            this.field1689 = null;
            this.field1690 = null;
            this.field1479 = null;
            this.field1238 = null;
            this.field1556 = null;
            this.field1250 = null;
            this.field1252 = null;
            this.field1254 = null;
            this.field1255 = null;
            this.field1355 = null;
            this.field1350 = null;
            this.field1352 = null;
            this.field1312 = null;
            this.field1559 = null;
            this.field1267 = null;
            this.field1335 = null;
            this.field1468 = null;
            this.field1469 = null;
            this.field1470 = null;
            this.field1471 = null;
            this.field1580 = null;
            this.field1593 = null;
            this.field1233 = null;
            this.field1234 = null;
            this.field1269 = null;
            this.field1399 = null;
            this.field1532 = null;
            this.field1224 = null;
            this.field1439 = null;
            this.field1508 = null;
            this.field1509 = null;
            this.field1505 = null;
            this.field1506 = null;
            this.field1507 = null;
            this.field1510 = null;
            this.field1511 = null;
            this.field1512 = null;
            this.field1513 = null;
            this.method486(0);
            LocType.method329(true);
            NpcType.method340(true);
            ObjType.method347(true);
            FloType.field1111 = null;
            IdkType.field1127 = null;
            Component.field73 = null;
            UnkType.field1134 = null;
            SeqType.field1145 = null;
            SpotAnimType.field1166 = null;
            SpotAnimType.field1178 = null;
            VarpType.field1192 = null;
            super.field16 = null;
            PlayerEntity.field495 = null;
            Pix3D.method164(true);
            World3D.method49(true);
            Model.method122(true);
            AnimFrame.method46(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.method6();
        }
        if (!this.field1627 && !this.field1680 && !this.field1611) {
            ++field1313;
            if (!this.field1450) {
                this.method507(false, false);
            } else {
                this.method448(-287);
            }
            this.field1277 = 0;
        } else {
            this.method478(-509);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIZ)V")
    public final void method440(int arg0, int arg1, boolean arg2) {
        if (arg0 != 1) {
            this.field1442 = this.field1357.method229();
        }
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method441(byte arg0) {
        if (arg0 != -16) {
            this.field1442 = -1;
        }
        for (int var2 = 0; var2 < this.field1351; ++var2) {
            int var3 = this.field1352[var2];
            NpcEntity var4 = this.field1350[var3];
            if (var4 != null) {
                this.method442(var4, var4.field464.field1018, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;IZ)V")
    public final void method442(PathingEntity arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field1312 = null;
        }
        if (arg0.field406 < 128 || arg0.field407 < 128 || arg0.field406 >= 13184 || arg0.field407 >= 13184) {
            arg0.field434 = -1;
            arg0.field439 = -1;
            arg0.field448 = 0;
            arg0.field449 = 0;
            arg0.field406 = arg0.field456[0] * 128 + arg0.field410 * 64;
            arg0.field407 = arg0.field457[0] * 128 + arg0.field410 * 64;
            arg0.method112(513);
        }
        if (field1534 == arg0 && (arg0.field406 < 1536 || arg0.field407 < 1536 || arg0.field406 >= 11776 || arg0.field407 >= 11776)) {
            arg0.field434 = -1;
            arg0.field439 = -1;
            arg0.field448 = 0;
            arg0.field449 = 0;
            arg0.field406 = arg0.field456[0] * 128 + arg0.field410 * 64;
            arg0.field407 = arg0.field457[0] * 128 + arg0.field410 * 64;
            arg0.method112(513);
        }
        if (arg0.field448 > field1311) {
            this.method443(0, arg0);
        } else if (arg0.field449 >= field1311) {
            this.method444(arg0, 841);
        } else {
            this.method445((byte) 13, arg0);
        }
        this.method446((byte) 5, arg0);
        this.method447(true, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method443(int arg0, PathingEntity arg1) {
        int var3 = arg1.field448 - field1311;
        int var4 = arg1.field444 * 128 + arg1.field410 * 64;
        int var5 = arg1.field446 * 128 + arg1.field410 * 64;
        arg1.field406 += (var4 - arg1.field406) / var3;
        arg1.field407 += (var5 - arg1.field407) / var3;
        arg1.field459 = 0;
        if (arg0 != 0) {
            this.field1312 = null;
        }
        if (arg1.field450 == 0) {
            arg1.field453 = 1024;
        }
        if (arg1.field450 == 1) {
            arg1.field453 = 1536;
        }
        if (arg1.field450 == 2) {
            arg1.field453 = 0;
        }
        if (arg1.field450 == 3) {
            arg1.field453 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method444(PathingEntity arg0, int arg1) {
        if (field1311 == arg0.field449 || arg0.field434 == -1 || arg0.field437 != 0 || arg0.field436 + 1 > SeqType.field1145[arg0.field434].method382(arg0.field435, this.field1384)) {
            int var3 = arg0.field449 - arg0.field448;
            int var4 = field1311 - arg0.field448;
            int var5 = arg0.field444 * 128 + arg0.field410 * 64;
            int var6 = arg0.field446 * 128 + arg0.field410 * 64;
            int var7 = arg0.field445 * 128 + arg0.field410 * 64;
            int var8 = arg0.field447 * 128 + arg0.field410 * 64;
            arg0.field406 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field407 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field459 = 0;
        if (arg0.field450 == 0) {
            arg0.field453 = 1024;
        }
        if (arg0.field450 == 1) {
            arg0.field453 = 1536;
        }
        if (arg0.field450 == 2) {
            arg0.field453 = 0;
        }
        if (arg0.field450 == 3) {
            arg0.field453 = 512;
        }
        arg0.field408 = arg0.field453;
        int var9 = 23 / arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLy;)V")
    public final void method445(byte arg0, PathingEntity arg1) {
        arg1.field431 = arg1.field411;
        if (arg0 != 13) {
            this.field1442 = -1;
        }
        if (arg1.field455 == 0) {
            arg1.field459 = 0;
        } else {
            if (arg1.field434 != -1 && arg1.field437 == 0) {
                SeqType var3 = SeqType.field1145[arg1.field434];
                if (arg1.field460 > 0 && var3.field1157 == 0) {
                    ++arg1.field459;
                    return;
                }
                if (arg1.field460 <= 0 && var3.field1158 == 0) {
                    ++arg1.field459;
                    return;
                }
            }
            int var4 = arg1.field406;
            int var5 = arg1.field407;
            int var6 = arg1.field456[arg1.field455 - 1] * 128 + arg1.field410 * 64;
            int var7 = arg1.field457[arg1.field455 - 1] * 128 + arg1.field410 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field453 = 1280;
                    } else if (var5 > var7) {
                        arg1.field453 = 1792;
                    } else {
                        arg1.field453 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field453 = 768;
                    } else if (var5 > var7) {
                        arg1.field453 = 256;
                    } else {
                        arg1.field453 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field453 = 1024;
                } else {
                    arg1.field453 = 0;
                }
                int var8 = arg1.field453 - arg1.field408 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field414;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field413;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field416;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field415;
                }
                if (var9 == -1) {
                    var9 = arg1.field413;
                }
                arg1.field431 = var9;
                int var10 = 4;
                if (arg1.field453 != arg1.field408 && arg1.field428 == -1 && arg1.field454 != 0) {
                    var10 = 2;
                }
                if (arg1.field455 > 2) {
                    var10 = 6;
                }
                if (arg1.field455 > 3) {
                    var10 = 8;
                }
                if (arg1.field459 > 0 && arg1.field455 > 1) {
                    var10 = 8;
                    --arg1.field459;
                }
                if (arg1.field458[arg1.field455 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field431 == arg1.field413 && arg1.field417 != -1) {
                    arg1.field431 = arg1.field417;
                }
                if (var4 < var6) {
                    arg1.field406 += var10;
                    if (arg1.field406 > var6) {
                        arg1.field406 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field406 -= var10;
                    if (arg1.field406 < var6) {
                        arg1.field406 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field407 += var10;
                    if (arg1.field407 > var7) {
                        arg1.field407 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field407 -= var10;
                    if (arg1.field407 < var7) {
                        arg1.field407 = var7;
                    }
                }
                if (arg1.field406 == var6 && arg1.field407 == var7) {
                    --arg1.field455;
                    if (arg1.field460 > 0) {
                        --arg1.field460;
                        return;
                    }
                }
            } else {
                arg1.field406 = var6;
                arg1.field407 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLy;)V")
    public final void method446(byte arg0, PathingEntity arg1) {
        if (arg0 != 5) {
            this.field1312 = null;
        }
        if (arg1.field454 != 0) {
            if (arg1.field428 != -1 && arg1.field428 < 32768) {
                NpcEntity var3 = this.field1350[arg1.field428];
                if (var3 != null) {
                    int var4 = arg1.field406 - var3.field406;
                    int var5 = arg1.field407 - var3.field407;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field453 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field428 >= 32768) {
                int var6 = arg1.field428 - 32768;
                if (this.field1637 == var6) {
                    var6 = this.field1249;
                }
                PlayerEntity var7 = this.field1250[var6];
                if (var7 != null) {
                    int var8 = arg1.field406 - var7.field406;
                    int var9 = arg1.field407 - var7.field407;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field453 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field429 != 0 || arg1.field430 != 0) && (arg1.field455 == 0 || arg1.field459 > 0)) {
                int var10 = arg1.field406 - (arg1.field429 - this.field1426 - this.field1426) * 64;
                int var11 = arg1.field407 - (arg1.field430 - this.field1427 - this.field1427) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field453 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field429 = 0;
                arg1.field430 = 0;
            }
            int var12 = arg1.field453 - arg1.field408 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field454 && var12 <= 2048 - arg1.field454) {
                    if (var12 > 1024) {
                        arg1.field408 -= arg1.field454;
                    } else {
                        arg1.field408 += arg1.field454;
                    }
                } else {
                    arg1.field408 = arg1.field453;
                }
                arg1.field408 &= 2047;
                if (arg1.field431 == arg1.field411 && arg1.field453 != arg1.field408) {
                    if (arg1.field412 != -1) {
                        arg1.field431 = arg1.field412;
                        return;
                    }
                    arg1.field431 = arg1.field413;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLy;)V")
    public final void method447(boolean arg0, PathingEntity arg1) {
        if (!arg0) {
            this.field1603 = !this.field1603;
        }
        arg1.field409 = false;
        if (arg1.field431 != -1) {
            SeqType var3 = SeqType.field1145[arg1.field431];
            ++arg1.field433;
            if (arg1.field432 < var3.field1146 && arg1.field433 > var3.method382(arg1.field432, this.field1384)) {
                arg1.field433 = 0;
                ++arg1.field432;
            }
            if (arg1.field432 >= var3.field1146) {
                arg1.field433 = 0;
                arg1.field432 = 0;
            }
        }
        if (arg1.field439 != -1 && field1311 >= arg1.field442) {
            if (arg1.field440 < 0) {
                arg1.field440 = 0;
            }
            SeqType var4 = SpotAnimType.field1166[arg1.field439].field1170;
            ++arg1.field441;
            while (arg1.field440 < var4.field1146 && arg1.field441 > var4.method382(arg1.field440, this.field1384)) {
                arg1.field441 -= var4.method382(arg1.field440, this.field1384);
                ++arg1.field440;
            }
            if (arg1.field440 >= var4.field1146 && (arg1.field440 < 0 || arg1.field440 >= var4.field1146)) {
                arg1.field439 = -1;
            }
        }
        if (arg1.field434 != -1 && arg1.field437 <= 1) {
            SeqType var5 = SeqType.field1145[arg1.field434];
            if (var5.field1157 == 1 && arg1.field460 > 0 && arg1.field448 <= field1311 && arg1.field449 < field1311) {
                arg1.field437 = 1;
                return;
            }
        }
        if (arg1.field434 != -1 && arg1.field437 == 0) {
            SeqType var6 = SeqType.field1145[arg1.field434];
            ++arg1.field436;
            while (arg1.field435 < var6.field1146 && arg1.field436 > var6.method382(arg1.field435, this.field1384)) {
                arg1.field436 -= var6.method382(arg1.field435, this.field1384);
                ++arg1.field435;
            }
            if (arg1.field435 >= var6.field1146) {
                arg1.field435 -= var6.field1150;
                ++arg1.field438;
                if (arg1.field438 >= var6.field1156) {
                    arg1.field434 = -1;
                }
                if (arg1.field435 < 0 || arg1.field435 >= var6.field1146) {
                    arg1.field434 = -1;
                }
            }
            arg1.field409 = var6.field1152;
        }
        if (arg1.field437 > 0) {
            --arg1.field437;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (arg0 >= 0) {
            this.field1263 = !this.field1263;
        }
        if (this.field1486) {
            this.field1486 = false;
            this.field1366.method259(0, 4, super.field15, this.field1411);
            this.field1367.method259(0, 357, super.field15, this.field1411);
            this.field1368.method259(722, 4, super.field15, this.field1411);
            this.field1369.method259(743, 205, super.field15, this.field1411);
            this.field1370.method259(0, 0, super.field15, this.field1411);
            this.field1371.method259(516, 4, super.field15, this.field1411);
            this.field1372.method259(516, 205, super.field15, this.field1411);
            this.field1373.method259(496, 357, super.field15, this.field1411);
            this.field1374.method259(0, 338, super.field15, this.field1411);
            this.field1605 = true;
            this.field1432 = true;
            this.field1400 = true;
            this.field1440 = true;
            if (this.field1617 != 2) {
                this.field1461.method259(4, 4, super.field15, this.field1411);
                this.field1460.method259(550, 4, super.field15, this.field1411);
            }
        }
        if (this.field1617 == 2) {
            this.method538(false);
        }
        if (this.field1381 && this.field1586 == 1) {
            this.field1605 = true;
        }
        if (this.field1607 != -1) {
            boolean var2 = this.method519(this.field1490, this.field1607, 0);
            if (var2) {
                this.field1605 = true;
            }
        }
        if (this.field1438 == 2) {
            this.field1605 = true;
        }
        if (this.field1494 == 2) {
            this.field1605 = true;
        }
        if (this.field1605) {
            this.method468(field1449);
            this.field1605 = false;
        }
        if (this.field1265 == -1) {
            this.field1583.field93 = this.field1624 - this.field1541 - 77;
            if (super.field23 > 448 && super.field23 < 560 && super.field24 > 332) {
                this.method467(0, false, 77, this.field1583, (byte) 8, super.field24 - 357, this.field1624, super.field23 - 17, 463);
            }
            int var3 = this.field1624 - 77 - this.field1583.field93;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1624 - 77) {
                var3 = this.field1624 - 77;
            }
            if (this.field1541 != var3) {
                this.field1541 = var3;
                this.field1432 = true;
            }
        }
        if (this.field1265 != -1) {
            boolean var4 = this.method519(this.field1490, this.field1265, 0);
            if (var4) {
                this.field1432 = true;
            }
        }
        if (this.field1438 == 3) {
            this.field1432 = true;
        }
        if (this.field1494 == 3) {
            this.field1432 = true;
        }
        if (this.field1337 != null) {
            this.field1432 = true;
        }
        if (this.field1381 && this.field1586 == 2) {
            this.field1432 = true;
        }
        if (this.field1432) {
            this.method456((byte) 2);
            this.field1432 = false;
        }
        if (this.field1617 == 2) {
            this.method473((byte) 1);
            this.field1460.method259(550, 4, super.field15, this.field1411);
        }
        if (this.field1625 != -1) {
            this.field1400 = true;
        }
        if (this.field1400) {
            if (this.field1625 != -1 && this.field1625 == this.field1433) {
                this.field1625 = -1;
                this.field1383.method218(36, 0);
                this.field1383.method219(this.field1433);
            }
            this.field1400 = false;
            this.field1616.method258(6745);
            this.field1683.method199(0, true, 0);
            if (this.field1607 == -1) {
                if (this.field1554[this.field1433] != -1) {
                    if (this.field1433 == 0) {
                        this.field1360.method199(22, true, 10);
                    }
                    if (this.field1433 == 1) {
                        this.field1361.method199(54, true, 8);
                    }
                    if (this.field1433 == 2) {
                        this.field1361.method199(82, true, 8);
                    }
                    if (this.field1433 == 3) {
                        this.field1362.method199(110, true, 8);
                    }
                    if (this.field1433 == 4) {
                        this.field1364.method199(153, true, 8);
                    }
                    if (this.field1433 == 5) {
                        this.field1364.method199(181, true, 8);
                    }
                    if (this.field1433 == 6) {
                        this.field1363.method199(209, true, 9);
                    }
                }
                if (this.field1554[0] != -1 && (this.field1625 != 0 || field1311 % 20 < 10)) {
                    this.field1582[0].method199(29, true, 13);
                }
                if (this.field1554[1] != -1 && (this.field1625 != 1 || field1311 % 20 < 10)) {
                    this.field1582[1].method199(53, true, 11);
                }
                if (this.field1554[2] != -1 && (this.field1625 != 2 || field1311 % 20 < 10)) {
                    this.field1582[2].method199(82, true, 11);
                }
                if (this.field1554[3] != -1 && (this.field1625 != 3 || field1311 % 20 < 10)) {
                    this.field1582[3].method199(115, true, 12);
                }
                if (this.field1554[4] != -1 && (this.field1625 != 4 || field1311 % 20 < 10)) {
                    this.field1582[4].method199(153, true, 13);
                }
                if (this.field1554[5] != -1 && (this.field1625 != 5 || field1311 % 20 < 10)) {
                    this.field1582[5].method199(180, true, 11);
                }
                if (this.field1554[6] != -1 && (this.field1625 != 6 || field1311 % 20 < 10)) {
                    this.field1582[6].method199(208, true, 13);
                }
            }
            this.field1616.method259(516, 160, super.field15, this.field1411);
            this.field1615.method258(6745);
            this.field1682.method199(0, true, 0);
            if (this.field1607 == -1) {
                if (this.field1554[this.field1433] != -1) {
                    if (this.field1433 == 7) {
                        this.field1451.method199(42, true, 0);
                    }
                    if (this.field1433 == 8) {
                        this.field1452.method199(74, true, 0);
                    }
                    if (this.field1433 == 9) {
                        this.field1452.method199(102, true, 0);
                    }
                    if (this.field1433 == 10) {
                        this.field1453.method199(130, true, 1);
                    }
                    if (this.field1433 == 11) {
                        this.field1455.method199(173, true, 0);
                    }
                    if (this.field1433 == 12) {
                        this.field1455.method199(201, true, 0);
                    }
                    if (this.field1433 == 13) {
                        this.field1454.method199(229, true, 0);
                    }
                }
                if (this.field1554[8] != -1 && (this.field1625 != 8 || field1311 % 20 < 10)) {
                    this.field1582[7].method199(74, true, 2);
                }
                if (this.field1554[9] != -1 && (this.field1625 != 9 || field1311 % 20 < 10)) {
                    this.field1582[8].method199(102, true, 3);
                }
                if (this.field1554[10] != -1 && (this.field1625 != 10 || field1311 % 20 < 10)) {
                    this.field1582[9].method199(137, true, 4);
                }
                if (this.field1554[11] != -1 && (this.field1625 != 11 || field1311 % 20 < 10)) {
                    this.field1582[10].method199(174, true, 2);
                }
                if (this.field1554[12] != -1 && (this.field1625 != 12 || field1311 % 20 < 10)) {
                    this.field1582[11].method199(201, true, 2);
                }
                if (this.field1554[13] != -1 && (this.field1625 != 13 || field1311 % 20 < 10)) {
                    this.field1582[12].method199(226, true, 2);
                }
            }
            this.field1615.method259(496, 466, super.field15, this.field1411);
            this.field1461.method258(6745);
        }
        if (this.field1440) {
            this.field1440 = false;
            this.field1614.method258(6745);
            this.field1681.method199(0, true, 0);
            this.field1280.method203(28, (byte) 4, 55, "Public chat", 16777215, true);
            if (this.field1300 == 0) {
                this.field1280.method203(41, (byte) 4, 55, "On", 65280, true);
            }
            if (this.field1300 == 1) {
                this.field1280.method203(41, (byte) 4, 55, "Friends", 16776960, true);
            }
            if (this.field1300 == 2) {
                this.field1280.method203(41, (byte) 4, 55, "Off", 16711680, true);
            }
            if (this.field1300 == 3) {
                this.field1280.method203(41, (byte) 4, 55, "Hide", 65535, true);
            }
            this.field1280.method203(28, (byte) 4, 184, "Private chat", 16777215, true);
            if (this.field1664 == 0) {
                this.field1280.method203(41, (byte) 4, 184, "On", 65280, true);
            }
            if (this.field1664 == 1) {
                this.field1280.method203(41, (byte) 4, 184, "Friends", 16776960, true);
            }
            if (this.field1664 == 2) {
                this.field1280.method203(41, (byte) 4, 184, "Off", 16711680, true);
            }
            this.field1280.method203(28, (byte) 4, 324, "Trade/compete", 16777215, true);
            if (this.field1596 == 0) {
                this.field1280.method203(41, (byte) 4, 324, "On", 65280, true);
            }
            if (this.field1596 == 1) {
                this.field1280.method203(41, (byte) 4, 324, "Friends", 16776960, true);
            }
            if (this.field1596 == 2) {
                this.field1280.method203(41, (byte) 4, 324, "Off", 16711680, true);
            }
            this.field1280.method203(33, (byte) 4, 458, "Report abuse", 16777215, true);
            this.field1614.method259(0, 453, super.field15, this.field1411);
            this.field1461.method258(6745);
        }
        this.field1490 = 0;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
        this.field1684 = new Pix8(this.field1661, "titlebox", 0);
        if (!arg0) {
            this.field1383.method219(141);
        }
        this.field1685 = new Pix8(this.field1661, "titlebutton", 0);
        this.field1225 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1225[var3] = new Pix8(this.field1661, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1225[var4] = new Pix8(this.field1661, "runes", (var4 & 3) + 12);
            }
        }
        this.field1666 = new Pix32(128, 265);
        this.field1667 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1666.field681[var5] = this.field1508.field757[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1667.field681[var6] = this.field1509.field757[var6];
        }
        this.field1647 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1647[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1647[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1647[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1647[var10 + 192] = 16777215;
        }
        this.field1648 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1648[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1648[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1648[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1648[var14 + 192] = 16777215;
        }
        this.field1649 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1649[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1649[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1649[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1649[var18 + 192] = 16777215;
        }
        this.field1646 = new int[256];
        this.field1320 = new int[32768];
        this.field1321 = new int[32768];
        this.method511(23272, (Pix8) null);
        this.field1632 = new int[32768];
        this.field1633 = new int[32768];
        this.method13(10, (byte) -37, "Connecting to fileserver");
        if (!this.field1286) {
            this.field1594 = true;
            this.field1286 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = Model.field616[var8];
            int var14 = Model.field617[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field616[var9];
            int var17 = Model.field617[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1385 = arg6 - var10;
        this.field1386 = arg0 - var11;
        this.field1387 = arg4 - var12;
        this.field1388 = arg2;
        this.field1389 = arg3;
        if (arg5 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method451(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (this.field1403 != arg0) {
            this.field1442 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public static final void method452(boolean arg0) {
        World3D.field289 = false;
        Pix3D.field654 = false;
        field1500 = false;
        if (!arg0) {
            World.field43 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1543.method199(arg3, true, arg4);
        if (arg2 < 0) {
            this.field1544.method199(arg3, true, arg1 + arg4 - 16);
            Pix2D.method157(this.field1268, arg4 + 16, arg1 - 32, -917, arg3, 16);
            int var7 = (arg1 - 32) * arg1 / arg0;
            if (var7 < 8) {
                var7 = 8;
            }
            int var8 = (arg1 - 32 - var7) * arg5 / (arg0 - arg1);
            Pix2D.method157(this.field1601, arg4 + 16 + var8, var7, -917, arg3, 16);
            Pix2D.method162(this.field1333, arg3, var7, -40022, arg4 + 16 + var8);
            Pix2D.method162(this.field1333, arg3 + 1, var7, -40022, arg4 + 16 + var8);
            Pix2D.method160(16, this.field1333, -380, arg4 + 16 + var8, arg3);
            Pix2D.method160(16, this.field1333, -380, arg4 + 17 + var8, arg3);
            Pix2D.method162(this.field1434, arg3 + 15, var7, -40022, arg4 + 16 + var8);
            Pix2D.method162(this.field1434, arg3 + 14, var7 - 1, -40022, arg4 + 17 + var8);
            Pix2D.method160(16, this.field1434, -380, arg4 + 15 + var8 + var7, arg3);
            Pix2D.method160(15, this.field1434, -380, arg4 + 14 + var8 + var7, arg3 + 1);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method454(int arg0) {
        while (arg0 >= 0) {
            this.field1442 = -1;
        }
        this.field1229 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1377[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1126; ++var3) {
                if (!IdkType.field1127[var3].field1133 && IdkType.field1127[var3].field1128 == var2 + (this.field1278 ? 0 : 7)) {
                    this.field1377[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public final void method13(int arg0, byte arg1, String arg2) {
        this.field1270 = arg0;
        this.field1336 = arg2;
        this.method482(0);
        if (this.field1661 == null) {
            super.method13(arg0, (byte) -37, arg2);
        } else {
            this.field1507.method258(6745);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1281.method202("RuneScape is loading - please wait...", false, 16777215, var4 / 2, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(9179409, -393, 304, 34, var4 / 2 - 152, var7);
            Pix2D.method158(0, -393, 302, 32, var4 / 2 - 151, var7 + 1);
            Pix2D.method157(9179409, var7 + 2, 30, -917, var4 / 2 - 150, arg0 * 3);
            Pix2D.method157(0, var7 + 2, 30, -917, arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3);
            this.field1281.method202(arg2, false, 16777215, var4 / 2, var5 / 2 + 5 - var6);
            this.field1507.method259(202, 171, super.field15, this.field1411);
            if (arg1 == -37) {
                if (this.field1486) {
                    this.field1486 = false;
                    if (!this.field1286) {
                        this.field1508.method259(0, 0, super.field15, this.field1411);
                        this.field1509.method259(637, 0, super.field15, this.field1411);
                    }
                    this.field1505.method259(128, 0, super.field15, this.field1411);
                    this.field1506.method259(202, 371, super.field15, this.field1411);
                    this.field1510.method259(0, 265, super.field15, this.field1411);
                    this.field1511.method259(562, 265, super.field15, this.field1411);
                    this.field1512.method259(128, 171, super.field15, this.field1411);
                    this.field1513.method259(562, 171, super.field15, this.field1411);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method455(int arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1267.method248(); var2 != null; var2 = (ProjectileEntity) this.field1267.method250(true)) {
            if (this.field1542 == var2.field518 && field1311 <= var2.field524) {
                if (field1311 >= var2.field523) {
                    if (var2.field527 > 0) {
                        NpcEntity var4 = this.field1350[var2.field527 - 1];
                        if (var4 != null && var4.field406 >= 0 && var4.field406 < 13312 && var4.field407 >= 0 && var4.field407 < 13312) {
                            var2.method120(this.method532(var4.field406, var2.field518, (byte) 8, var4.field407) - var2.field522, var4.field407, 0, var4.field406, field1311);
                        }
                    }
                    if (var2.field527 < 0) {
                        int var5 = -var2.field527 - 1;
                        PlayerEntity var6;
                        if (this.field1637 == var5) {
                            var6 = field1534;
                        } else {
                            var6 = this.field1250[var5];
                        }
                        if (var6 != null && var6.field406 >= 0 && var6.field406 < 13312 && var6.field407 >= 0 && var6.field407 < 13312) {
                            var2.method120(this.method532(var6.field406, var2.field518, (byte) 8, var6.field407) - var2.field522, var6.field407, 0, var6.field406, field1311);
                        }
                    }
                    var2.method121(false, this.field1490);
                    this.field1501.method61(false, var2.field537, (int) var2.field530, (int) var2.field529, -1, 60, 0, this.field1542, var2, (int) var2.field531);
                }
            } else {
                var2.method106();
            }
        }
        ++field1552;
        if (arg0 != -4798) {
            this.field1442 = -1;
        }
        if (field1552 > 1174) {
            field1552 = 0;
            this.field1383.method218(90, 0);
            this.field1383.method219(0);
            int var3 = this.field1383.field722;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1383.method220(11499);
            }
            this.field1383.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1383.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1383.method219(94);
            }
            this.field1383.method220(51693);
            this.field1383.method219(16);
            this.field1383.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1383.method219(65);
            }
            this.field1383.method219((int) (Math.random() * 256.0D));
            this.field1383.method220(22990);
            this.field1383.method228(this.field1383.field722 - var3, -486);
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field18 != null) {
                    return new URL("http://127.0.0.1:" + (field1498 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method456(byte arg0) {
        if (arg0 != 2) {
            this.field1383.method219(124);
        }
        this.field1462.method258(6745);
        Pix3D.field665 = this.field1517;
        this.field1448.method199(0, true, 0);
        if (this.field1481) {
            this.field1281.method202(this.field1283, false, 0, 239, 40);
            this.field1281.method202(this.field1480 + "*", false, 128, 239, 60);
        } else if (this.field1503) {
            this.field1281.method202("Enter amount:", false, 0, 239, 40);
            this.field1281.method202(this.field1382 + "*", false, 128, 239, 60);
        } else if (this.field1337 != null) {
            this.field1281.method202(this.field1337, false, 0, 239, 40);
            this.field1281.method202("Click to continue", false, 128, 239, 60);
        } else if (this.field1265 != -1) {
            this.method515(0, 0, 1, 0, Component.field73[this.field1265]);
        } else if (this.field1339 != -1) {
            this.method515(0, 0, 1, 0, Component.field73[this.field1339]);
        } else {
            PixFont var2 = this.field1280;
            int var3 = 0;
            Pix2D.method154(77, 0, -134, 463, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1261[var4] != null) {
                    int var6 = this.field1259[var4];
                    int var7 = 70 - var3 * 14 + this.field1541;
                    String var8 = this.field1260[var4];
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
                            var2.method206(var7, this.field1261[var4], 0, -56, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1300 == 0 || this.field1300 == 1 && this.method514(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1401[0].method199(var10, true, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1401[1].method199(var10, true, var7 - 12);
                                var10 += 14;
                            }
                            var2.method206(var7, var8 + ":", 0, -56, var10);
                            int var11 = var10 + var2.method204(var8, (byte) 86) + 8;
                            var2.method206(var7, this.field1261[var4], 255, -56, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1306 == 0 && (var6 == 7 || this.field1664 == 0 || this.field1664 == 1 && this.method514(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method206(var7, "From", 0, -56, var12);
                            int var13 = var12 + var2.method204("From ", (byte) 86);
                            if (var9 == 1) {
                                this.field1401[0].method199(var13, true, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1401[1].method199(var13, true, var7 - 12);
                                var13 += 14;
                            }
                            var2.method206(var7, var8 + ":", 0, -56, var13);
                            int var14 = var13 + var2.method204(var8, (byte) 86) + 8;
                            var2.method206(var7, this.field1261[var4], 8388608, -56, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1596 == 0 || this.field1596 == 1 && this.method514(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, var8 + " " + this.field1261[var4], 8388736, -56, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1306 == 0 && this.field1664 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, this.field1261[var4], 8388608, -56, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1306 == 0 && this.field1664 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, "To " + var8 + ":", 0, -56, 4);
                            var2.method206(var7, this.field1261[var4], 8388608, -56, 12 + var2.method204("To " + var8, (byte) 86));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1596 == 0 || this.field1596 == 1 && this.method514(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, var8 + " " + this.field1261[var4], 8270336, -56, 4);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method153(false);
            this.field1624 = var3 * 14 + 7;
            if (this.field1624 < 78) {
                this.field1624 = 78;
            }
            this.method453(this.field1624, 77, -143, 463, 0, this.field1624 - this.field1541 - 77);
            String var5;
            if (field1534 != null && field1534.field471 != null) {
                var5 = field1534.field471;
            } else {
                var5 = JString.method304(this.field1314, -4015);
            }
            var2.method206(90, var5 + ":", 0, -56, 4);
            var2.method206(90, this.field1396 + "*", 255, -56, 6 + var2.method204(var5 + ": ", (byte) 86));
            Pix2D.method160(479, 0, -380, 77, 0);
        }
        if (this.field1381 && this.field1586 == 2) {
            this.method543(107);
        }
        this.field1462.method259(17, 357, super.field15, this.field1411);
        this.field1461.method258(6745);
        Pix3D.field665 = this.field1519;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;B)V")
    public final void method457(int arg0, Packet arg1, byte arg2) {
        if (arg2 != -20) {
            this.field1484 = !this.field1484;
        }
        if (arg0 != 136 && arg0 != 211) {
            if (arg0 == 2) {
                int var4 = arg1.method229();
                int var5 = (var4 >> 4 & 7) + this.field1651;
                int var6 = (var4 & 7) + this.field1652;
                int var7 = arg1.method229();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1258[var8];
                int var11 = arg1.method231();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1584[this.field1542][var5][var6];
                    int var13 = this.field1584[this.field1542][var5 + 1][var6];
                    int var14 = this.field1584[this.field1542][var5 + 1][var6 + 1];
                    int var15 = this.field1584[this.field1542][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1501.method72(var6, this.field1542, true, var5);
                        if (var16 != null) {
                            int var17 = var16.field278 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field276 = new LocEntity(2, var17, var12, var15, var9 + 4, var11, false, var13, var14, (byte) 87);
                                var16.field277 = new LocEntity(2, var17, var12, var15, var9 + 1 & 3, var11, false, var13, var14, (byte) 87);
                            } else {
                                var16.field276 = new LocEntity(var8, var17, var12, var15, var9, var11, false, var13, var14, (byte) 87);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1501.method73(var6, true, var5, this.field1542);
                        if (var18 != null) {
                            var18.field169 = new LocEntity(4, var18.field170 >> 14 & 32767, var12, var15, 0, var11, false, var13, var14, (byte) 87);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1501.method74(this.field1542, var5, var6, 374);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field261 = new LocEntity(var8, var19.field269 >> 14 & 32767, var12, var15, var9, var11, false, var13, var14, (byte) 87);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1501.method75(var5, this.field1542, var6, 518);
                        if (var20 != null) {
                            var20.field200 = new LocEntity(22, var20.field201 >> 14 & 32767, var12, var15, var9, var11, false, var13, var14, (byte) 87);
                        }
                    }
                }
            } else if (arg0 == 147) {
                int var21 = arg1.method229();
                int var22 = (var21 >> 4 & 7) + this.field1651;
                int var23 = (var21 & 7) + this.field1652;
                int var24 = arg1.method231();
                int var25 = arg1.method231();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field512 = var24;
                    var26.field513 = var25;
                    if (this.field1312[this.field1542][var22][var23] == null) {
                        this.field1312[this.field1542][var22][var23] = new LinkList(464);
                    }
                    this.field1312[this.field1542][var22][var23].method245(var26);
                    this.method470(var22, var23);
                }
            } else if (arg0 == 53) {
                int var27 = arg1.method229();
                int var28 = (var27 >> 4 & 7) + this.field1651;
                int var29 = (var27 & 7) + this.field1652;
                int var30 = arg1.method231();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1312[this.field1542][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250(true)) {
                            if ((var30 & 32767) == var32.field512) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method248() == null) {
                            this.field1312[this.field1542][var28][var29] = null;
                        }
                        this.method470(var28, var29);
                    }
                }
            } else if (arg0 == 30) {
                int var33 = arg1.method229();
                int var34 = (var33 >> 4 & 7) + this.field1651;
                int var35 = (var33 & 7) + this.field1652;
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
                    ProjectileEntity var50 = new ProjectileEntity(field1311 + var43, this.method532(var46, this.field1542, (byte) 8, var47) - var40, field1311 + var42, var39, var38, (byte) 0, var46, var41, this.field1542, var44, var47, var45);
                    var50.method120(this.method532(var48, this.field1542, (byte) 8, var49) - var41, var49, 0, var48, field1311 + var42);
                    this.field1267.method245(var50);
                }
            } else if (arg0 == 193) {
                int var51 = arg1.method229();
                int var52 = (var51 >> 4 & 7) + this.field1651;
                int var53 = (var51 & 7) + this.field1652;
                int var54 = arg1.method231();
                int var55 = arg1.method229();
                int var56 = arg1.method231();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity((byte) -99, field1311, this.method532(var57, this.field1542, (byte) 8, var58) - var55, var57, this.field1542, var54, var56, var58);
                    this.field1335.method245(var59);
                }
            } else if (arg0 == 137) {
                int var60 = arg1.method229();
                int var61 = (var60 >> 4 & 7) + this.field1651;
                int var62 = (var60 & 7) + this.field1652;
                int var63 = arg1.method231();
                int var64 = arg1.method231();
                int var65 = arg1.method231();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1637 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field512 = var63;
                    var66.field513 = var64;
                    if (this.field1312[this.field1542][var61][var62] == null) {
                        this.field1312[this.field1542][var61][var62] = new LinkList(464);
                    }
                    this.field1312[this.field1542][var61][var62].method245(var66);
                    this.method470(var61, var62);
                }
            } else {
                if (arg0 == 191) {
                    int var67 = arg1.method229();
                    int var68 = (var67 >> 4 & 7) + this.field1651;
                    int var69 = (var67 & 7) + this.field1652;
                    int var70 = arg1.method229();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1258[var71];
                    int var74 = arg1.method231();
                    int var75 = arg1.method231();
                    int var76 = arg1.method231();
                    int var77 = arg1.method231();
                    byte var78 = arg1.method230();
                    byte var79 = arg1.method230();
                    byte var80 = arg1.method230();
                    byte var81 = arg1.method230();
                    PlayerEntity var82;
                    if (this.field1637 == var77) {
                        var82 = field1534;
                    } else {
                        var82 = this.field1250[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method330(var74);
                        int var84 = this.field1584[this.field1542][var68][var69];
                        int var85 = this.field1584[this.field1542][var68 + 1][var69];
                        int var86 = this.field1584[this.field1542][var68 + 1][var69 + 1];
                        int var87 = this.field1584[this.field1542][var68][var69 + 1];
                        Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method526(var73, var69, 0, -1, 0, var76 + 1, var75 + 1, 0, this.field1542, var68);
                            var82.field481 = field1311 + var75;
                            var82.field482 = field1311 + var76;
                            var82.field486 = var88;
                            int var89 = var83.field967;
                            int var90 = var83.field968;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field968;
                                var90 = var83.field967;
                            }
                            var82.field483 = var68 * 128 + var89 * 64;
                            var82.field485 = var69 * 128 + var90 * 64;
                            var82.field484 = this.method532(var82.field483, this.field1542, (byte) 8, var82.field485);
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
                            var82.field487 = var68 + var78;
                            var82.field489 = var68 + var80;
                            var82.field488 = var69 + var79;
                            var82.field490 = var69 + var81;
                        }
                    }
                }
                if (arg0 != 253) {
                    if (arg0 == 222) {
                        int var101 = arg1.method229();
                        int var102 = (var101 >> 4 & 7) + this.field1651;
                        int var103 = (var101 & 7) + this.field1652;
                        int var104 = arg1.method231();
                        int var105 = arg1.method229();
                        int var106 = var105 >> 4 & 15;
                        int var107 = var105 & 7;
                        if (field1534.field456[0] >= var102 - var106 && field1534.field456[0] <= var102 + var106 && field1534.field457[0] >= var103 - var106 && field1534.field457[0] <= var103 + var106 && this.field1557 && !field1500 && this.field1650 < 50) {
                            this.field1266[this.field1650] = var104;
                            this.field1636[this.field1650] = var107;
                            this.field1310[this.field1650] = Wave.field915[var104];
                            ++this.field1650;
                            return;
                        }
                    }
                } else {
                    int var93 = arg1.method229();
                    int var94 = (var93 >> 4 & 7) + this.field1651;
                    int var95 = (var93 & 7) + this.field1652;
                    int var96 = arg1.method231();
                    int var97 = arg1.method231();
                    int var98 = arg1.method231();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1312[this.field1542][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250(true)) {
                                if ((var96 & 32767) == var100.field512 && var100.field513 == var97) {
                                    var100.field513 = var98;
                                    break;
                                }
                            }
                            this.method470(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var108 = arg1.method229();
            int var109 = (var108 >> 4 & 7) + this.field1651;
            int var110 = (var108 & 7) + this.field1652;
            int var111 = arg1.method229();
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = this.field1258[var112];
            int var115;
            if (arg0 == 211) {
                var115 = -1;
            } else {
                var115 = arg1.method231();
            }
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                this.method526(var114, var110, 0, var115, var113, -1, 0, var112, this.field1542, var109);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method458(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1608; ++var4) {
                if (this.field1555[var4] == arg1) {
                    --this.field1608;
                    this.field1605 = true;
                    for (int var5 = var4; var5 < this.field1608; ++var5) {
                        this.field1555[var5] = this.field1555[var5 + 1];
                    }
                    this.field1383.method218(104, 0);
                    this.field1383.method225(arg1, 359);
                    break;
                }
            }
            if (arg0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZII)V")
    private final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            this.field1312 = null;
        }
        if (arg4 >= 1 && arg7 >= 1 && arg4 <= 102 && arg7 <= 102) {
            if (field1500 && this.field1542 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field1501.method76(arg3, arg4, arg7);
            }
            if (arg0 == 1) {
                var9 = this.field1501.method77(arg3, arg4, 939, arg7);
            }
            if (arg0 == 2) {
                var9 = this.field1501.method78(arg3, arg4, arg7);
            }
            if (arg0 == 3) {
                var9 = this.field1501.method79(arg3, arg4, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field1501.method80(arg3, arg4, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field1501.method67(0, arg3, arg4, arg7);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field969) {
                        this.field1291[arg3].method364(var15, 93, var16, arg7, var17.field970, arg4);
                    }
                }
                if (arg0 == 1) {
                    this.field1501.method68(arg3, 812, arg7, arg4);
                }
                if (arg0 == 2) {
                    this.field1501.method69(arg4, arg7, -443, arg3);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field967 + arg4 > 103 || var18.field967 + arg7 > 103 || var18.field968 + arg4 > 103 || var18.field968 + arg7 > 103) {
                        return;
                    }
                    if (var18.field969) {
                        this.field1291[arg3].method365(var18.field967, var18.field970, (byte) 4, var16, arg4, arg7, var18.field968);
                    }
                }
                if (arg0 == 3) {
                    this.field1501.method70(-297, arg4, arg7, arg3);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field969 && var19.field971) {
                        this.field1291[arg3].method367(arg4, -5814, arg7);
                    }
                }
            }
            if (arg2 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field1307[1][arg4][arg7] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                World.method31(-389, arg7, var20, arg6, this.field1291[arg3], arg4, arg3, this.field1584, this.field1501, arg1, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;BI)V")
    private final void method460(Packet arg0, byte arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1253; ++var4) {
            int var5 = this.field1254[var4];
            PlayerEntity var6 = this.field1250[var5];
            int var7 = arg0.method229();
            if ((var7 & 128) == 128) {
                var7 += arg0.method229() << 8;
            }
            this.method494(var7, arg0, false, var5, var6);
        }
        if (arg1 != -18) {
            this.field1442 = arg0.method229();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)Ljava/lang/String;")
    public final String method461(boolean arg0) {
        if (arg0) {
            this.field1442 = this.field1357.method229();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field18 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 297);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1497 = Integer.parseInt(arg0[0]);
                field1498 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method471((byte) 66);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method452(false);
                }
                if (arg0[3].equals("free")) {
                    field1499 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1499 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(-46694, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method462(byte arg0) {
        try {
            this.field1376 = -1;
            this.field1335.method252();
            this.field1267.method252();
            Pix3D.method167(true);
            this.method480(0);
            this.field1501.method50((byte) 7);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1291[var2].method359(3);
            }
            System.gc();
            World var3 = new World(104, this.field1584, 104, this.field1307, this.field1585);
            int var4 = this.field1241.length;
            World.field43 = World3D.field289;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1529[var5] >> 8;
                int var7 = this.field1529[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field43 = false;
                }
            }
            if (World.field43) {
                this.field1501.method51(0, this.field1542);
            } else {
                this.field1501.method51(0, 0);
            }
            this.field1383.method218(115, 0);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1529[var8] >> 8) * 64 - this.field1426;
                int var10 = (this.field1529[var8] & 255) * 64 - this.field1427;
                byte[] var11 = this.field1241[var8];
                if (var11 != null) {
                    var3.method15((this.field1659 - 6) * 8, (this.field1660 - 6) * 8, true, var9, var11, var10);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1529[var12] >> 8) * 64 - this.field1426;
                int var14 = (this.field1529[var12] & 255) * 64 - this.field1427;
                byte[] var15 = this.field1241[var12];
                if (var15 == null && this.field1660 < 800) {
                    var3.method14(var13, 64, var14, 64, 1);
                }
            }
            this.field1383.method218(115, 0);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1577[var16];
                if (var17 != null) {
                    int var18 = (this.field1529[var16] >> 8) * 64 - this.field1426;
                    int var19 = (this.field1529[var16] & 255) * 64 - this.field1427;
                    var3.method18(true, this.field1501, var19, var17, this.field1291, var18);
                }
            }
            this.field1383.method218(115, 0);
            var3.method20(true, this.field1291, this.field1501);
            this.field1461.method258(6745);
            this.field1383.method218(115, 0);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method470(var20, var21);
                }
            }
            this.method540(43);
        } catch (Exception var35) {
        }
        LocType.field997.method103();
        if (arg0 == 1) {
            boolean var23 = false;
        } else {
            this.field1223 = -143;
        }
        if (field1500 && signlink.cache_dat != null) {
            int var24 = this.field1679.method272(0, 763);
            for (int var25 = 0; var25 < var24; ++var25) {
                int var26 = this.field1679.method277(var25, true);
                if ((var26 & 121) == 0) {
                    Model.method125(512, var25);
                }
            }
        }
        System.gc();
        Pix3D.method168(20, -728);
        this.field1679.method283(-44242);
        int var27 = (this.field1659 - 6) / 8 - 1;
        int var28 = (this.field1659 + 6) / 8 + 1;
        int var29 = (this.field1660 - 6) / 8 - 1;
        int var30 = (this.field1660 + 6) / 8 + 1;
        if (this.field1539) {
            var27 = 49;
            var28 = 50;
            var29 = 49;
            var30 = 50;
        }
        for (int var31 = var27; var31 <= var28; ++var31) {
            for (int var32 = var29; var32 <= var30; ++var32) {
                if (var27 == var31 || var28 == var31 || var29 == var32 || var30 == var32) {
                    int var33 = this.field1679.method274(true, var32, var31, 0);
                    if (var33 != -1) {
                        this.field1679.method284(false, 3, var33);
                    }
                    int var34 = this.field1679.method274(true, var32, var31, 1);
                    if (var34 != -1) {
                        this.field1679.method284(false, 3, var34);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method463(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field29 == 1) {
            if (super.field30 >= 6 && super.field30 <= 106 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1300 = (this.field1300 + 1) % 4;
                this.field1440 = true;
                this.field1432 = true;
                this.field1383.method218(242, 0);
                this.field1383.method219(this.field1300);
                this.field1383.method219(this.field1664);
                this.field1383.method219(this.field1596);
            }
            if (super.field30 >= 135 && super.field30 <= 235 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1664 = (this.field1664 + 1) % 3;
                this.field1440 = true;
                this.field1432 = true;
                this.field1383.method218(242, 0);
                this.field1383.method219(this.field1300);
                this.field1383.method219(this.field1664);
                this.field1383.method219(this.field1596);
            }
            if (super.field30 >= 273 && super.field30 <= 373 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1596 = (this.field1596 + 1) % 3;
                this.field1440 = true;
                this.field1432 = true;
                this.field1383.method218(242, 0);
                this.field1383.method219(this.field1300);
                this.field1383.method219(this.field1664);
                this.field1383.method219(this.field1596);
            }
            if (super.field30 >= 412 && super.field30 <= 512 && super.field31 >= 467 && super.field31 <= 499) {
                if (this.field1612 == -1) {
                    this.method432(true);
                    this.field1303 = "";
                    this.field1657 = false;
                    for (int var3 = 0; var3 < Component.field73.length; ++var3) {
                        if (Component.field73[var3] != null && Component.field73[var3].field82 == 600) {
                            this.field1466 = this.field1612 = Component.field73[var3].field79;
                            return;
                        }
                    }
                    return;
                }
                this.method484((byte) -97, "", "Please close the interface you have open before using 'report abuse'", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method464(int arg0, Packet arg1, int arg2) {
        if (arg2 != 466) {
            this.field1375 = -76;
        }
        for (int var4 = 0; var4 < this.field1253; ++var4) {
            int var5 = this.field1254[var4];
            NpcEntity var6 = this.field1350[var5];
            int var7 = arg1.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg1.method229();
                int var9 = arg1.method229();
                var6.method114(field1311, 8573, var8, var9);
                var6.field425 = field1311 + 300;
                var6.field426 = arg1.method229();
                var6.field427 = arg1.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg1.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field434 == var10) {
                    var6.field438 = 0;
                }
                int var11 = arg1.method229();
                if (var6.field434 == var10 && var10 != -1) {
                    int var12 = SeqType.field1145[var10].field1159;
                    if (var12 == 1) {
                        var6.field435 = 0;
                        var6.field436 = 0;
                        var6.field437 = var11;
                        var6.field438 = 0;
                    }
                    if (var12 == 2) {
                        var6.field438 = 0;
                    }
                } else if (var10 == -1 || var6.field434 == -1 || SeqType.field1145[var10].field1153 >= SeqType.field1145[var6.field434].field1153) {
                    var6.field434 = var10;
                    var6.field435 = 0;
                    var6.field436 = 0;
                    var6.field437 = var11;
                    var6.field438 = 0;
                    var6.field460 = var6.field455;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field428 = arg1.method231();
                if (var6.field428 == 65535) {
                    var6.field428 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field418 = arg1.method236();
                var6.field419 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg1.method229();
                int var14 = arg1.method229();
                var6.method114(field1311, 8573, var13, var14);
                var6.field425 = field1311 + 300;
                var6.field426 = arg1.method229();
                var6.field427 = arg1.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field464 = NpcType.method341(arg1.method231());
                var6.field410 = var6.field464.field1018;
                var6.field454 = var6.field464.field1040;
                var6.field413 = var6.field464.field1022;
                var6.field414 = var6.field464.field1023;
                var6.field415 = var6.field464.field1024;
                var6.field416 = var6.field464.field1025;
                var6.field411 = var6.field464.field1021;
            }
            if ((var7 & 64) == 64) {
                var6.field439 = arg1.method231();
                int var15 = arg1.method234();
                var6.field443 = var15 >> 16;
                var6.field442 = (var15 & 65535) + field1311;
                var6.field440 = 0;
                var6.field441 = 0;
                if (var6.field442 > field1311) {
                    var6.field440 = -1;
                }
                if (var6.field439 == 65535) {
                    var6.field439 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field429 = arg1.method231();
                var6.field430 = arg1.method231();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method465(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = VarpType.field1192[arg1].field1200;
        if (var4 != 0) {
            int var5 = this.field1593[arg1];
            if (var4 == 1) {
                if (var5 == 1) {
                    Pix3D.method173(false, 0.9D);
                }
                if (var5 == 2) {
                    Pix3D.method173(false, 0.8D);
                }
                if (var5 == 3) {
                    Pix3D.method173(false, 0.7D);
                }
                if (var5 == 4) {
                    Pix3D.method173(false, 0.6D);
                }
                ObjType.field1095.method103();
                this.field1486 = true;
            }
            if (var4 == 3) {
                boolean var6 = this.field1276;
                if (var5 == 0) {
                    this.method440(1, 0, this.field1276);
                    this.field1276 = true;
                }
                if (var5 == 1) {
                    this.method440(1, -400, this.field1276);
                    this.field1276 = true;
                }
                if (var5 == 2) {
                    this.method440(1, -800, this.field1276);
                    this.field1276 = true;
                }
                if (var5 == 3) {
                    this.method440(1, -1200, this.field1276);
                    this.field1276 = true;
                }
                if (var5 == 4) {
                    this.field1276 = false;
                }
                if (this.field1276 != var6 && !field1500) {
                    if (this.field1276) {
                        this.field1331 = this.field1246;
                        this.field1332 = true;
                        this.field1679.method279(2, this.field1331);
                    } else {
                        this.method562(0);
                    }
                    this.field1425 = 0;
                }
            }
            if (var4 == 4) {
                if (var5 == 0) {
                    this.field1557 = true;
                    this.method451(19639, 0);
                }
                if (var5 == 1) {
                    this.field1557 = true;
                    this.method451(19639, -400);
                }
                if (var5 == 2) {
                    this.field1557 = true;
                    this.method451(19639, -800);
                }
                if (var5 == 3) {
                    this.field1557 = true;
                    this.method451(19639, -1200);
                }
                if (var5 == 4) {
                    this.field1557 = false;
                }
            }
            if (var4 == 5) {
                this.field1318 = var5;
            }
            if (var4 == 6) {
                this.field1623 = var5;
            }
            if (var4 == 8) {
                this.field1306 = var5;
                this.field1432 = true;
            }
            if (var4 == 9) {
                this.field1626 = var5;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method466(int arg0, int arg1) {
        int[] var3 = this.field1399.field681;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1307[arg1][var24][var6] & 24) == 0) {
                    this.field1501.method85(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1307[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1501.method85(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1399.method181(6745);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1307[arg1][var22][var9] & 24) == 0) {
                    this.method539((byte) 1, var22, var8, var7, arg1, var9);
                }
                if (arg1 < 3 && (this.field1307[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method539((byte) 1, var22, var8, var7, arg1 + 1, var9);
                }
            }
        }
        if (arg0 != 0) {
            this.field1383.method219(83);
        }
        this.field1461.method258(6745);
        this.field1232 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1501.method79(this.field1542, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method330(var13).field980;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1291[this.field1542].field1109;
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
                        this.field1269[this.field1232] = this.field1238[var14];
                        this.field1233[this.field1232] = var15;
                        this.field1234[this.field1232] = var16;
                        ++this.field1232;
                    }
                }
            }
        }
        ++field1573;
        if (field1573 > 112) {
            field1573 = 0;
            this.field1383.method218(164, 0);
            this.field1383.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        if (arg0) {
            this.field1383.method219(209);
        }
        this.field1486 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZILd;BIIII)V")
    public final void method467(int arg0, boolean arg1, int arg2, Component arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field1417) {
            this.field1244 = 32;
        } else {
            this.field1244 = 0;
        }
        this.field1417 = false;
        if (this.field1247 == arg4) {
            boolean var10 = false;
        } else {
            this.field1375 = -406;
        }
        if (arg7 >= arg8 && arg7 < arg8 + 16 && arg5 >= arg0 && arg5 < arg0 + 16) {
            arg3.field93 -= this.field1277 * 4;
            if (arg1) {
                this.field1605 = true;
                return;
            }
        } else if (arg7 >= arg8 && arg7 < arg8 + 16 && arg5 >= arg0 + arg2 - 16 && arg5 < arg0 + arg2) {
            arg3.field93 += this.field1277 * 4;
            if (arg1) {
                this.field1605 = true;
                return;
            }
        } else {
            if (arg7 < arg8 - this.field1244 || arg7 >= arg8 + 16 + this.field1244 || arg5 < arg0 + 16 || arg5 >= arg0 + arg2 - 16 || this.field1277 <= 0) {
                return;
            }
            int var11 = (arg2 - 32) * arg2 / arg6;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg5 - arg0 - 16 - var11 / 2;
            int var13 = arg2 - 32 - var11;
            arg3.field93 = (arg6 - arg2) * var12 / var13;
            if (arg1) {
                this.field1605 = true;
            }
            this.field1417 = true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method468(boolean arg0) {
        this.field1459.method258(6745);
        Pix3D.field665 = this.field1518;
        if (!arg0) {
            this.field1442 = this.field1357.method229();
        }
        this.field1446.method199(0, true, 0);
        if (this.field1607 != -1) {
            this.method515(0, 0, 1, 0, Component.field73[this.field1607]);
        } else if (this.field1554[this.field1433] != -1) {
            this.method515(0, 0, 1, 0, Component.field73[this.field1554[this.field1433]]);
        }
        if (this.field1381 && this.field1586 == 1) {
            this.method543(107);
        }
        this.field1459.method259(553, 205, super.field15, this.field1411);
        this.field1461.method258(6745);
        Pix3D.field665 = this.field1519;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILd;)I")
    public final int method469(byte arg0, int arg1, Component arg2) {
        if (arg0 != 96) {
            this.method6();
        }
        if (arg2.field88 != null && arg1 < arg2.field88.length) {
            try {
                int[] var4 = arg2.field88[arg1];
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
                        var9 = this.field1678[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1491[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1296[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field73[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1048 && (!ObjType.method348(var12).field1069 || field1499)) {
                            for (int var13 = 0; var13 < var11.field74.length; ++var13) {
                                if (var12 + 1 == var11.field74[var13]) {
                                    var9 += var11.field75[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1593[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1478[this.field1491[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1593[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1534.field477;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1162; ++var14) {
                            if (Stats.field1164[var14]) {
                                var9 += this.field1491[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field73[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1048 && (!ObjType.method348(var16).field1069 || field1499)) {
                            for (int var17 = 0; var17 < var15.field74.length; ++var17) {
                                if (var15.field74[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1358;
                    }
                    if (var8 == 12) {
                        var9 = this.field1653;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1593[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1182[var20];
                        int var22 = var21.field1184;
                        int var23 = var21.field1185;
                        int var24 = var21.field1186;
                        int var25 = field1671[var24 - var23];
                        var9 = this.field1593[var22] >> var23 & var25;
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
                        var9 = (field1534.field406 >> 7) + this.field1426;
                    }
                    if (var8 == 19) {
                        var9 = (field1534.field407 >> 7) + this.field1427;
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

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method470(int arg0, int arg1) {
        LinkList var3 = this.field1312[this.field1542][arg0][arg1];
        if (var3 == null) {
            this.field1501.method71(this.field1542, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250(true)) {
                ObjType var11 = ObjType.method348(var6.field512);
                int var12 = var11.field1068;
                if (var11.field1067) {
                    var12 = (var6.field513 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(false, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250(true)) {
                if (var5.field512 != var9.field512 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field512 != var9.field512 && var7.field512 != var9.field512 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1501.method57(arg0, var5, var7, var8, this.method532(arg0 * 128 + 64, this.field1542, (byte) 8, arg1 * 128 + 64), (byte) 29, var10, this.field1542, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public static final void method471(byte arg0) {
        World3D.field289 = true;
        Pix3D.field654 = true;
        field1500 = true;
        World.field43 = true;
        if (arg0 != 66) {
            field1670 = -32;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method472(int arg0, Packet arg1, int arg2) {
        arg1.method239((byte) 7);
        if (arg2 < this.field1545 || arg2 > this.field1545) {
            this.field1442 = arg1.method229();
        }
        int var4 = arg1.method240(8, this.field1405);
        if (var4 < this.field1351) {
            for (int var5 = var4; var5 < this.field1351; ++var5) {
                this.field1355[this.field1354++] = this.field1352[var5];
            }
        }
        if (var4 > this.field1351) {
            signlink.reporterror(this.field1314 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1351 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1352[var6];
                NpcEntity var8 = this.field1350[var7];
                int var9 = arg1.method240(1, this.field1405);
                if (var9 == 0) {
                    this.field1352[this.field1351++] = var7;
                    var8.field451 = field1311;
                } else {
                    int var10 = arg1.method240(2, this.field1405);
                    if (var10 == 0) {
                        this.field1352[this.field1351++] = var7;
                        var8.field451 = field1311;
                        this.field1254[this.field1253++] = var7;
                    } else if (var10 == 1) {
                        this.field1352[this.field1351++] = var7;
                        var8.field451 = field1311;
                        int var11 = arg1.method240(3, this.field1405);
                        var8.method111(false, false, var11);
                        int var12 = arg1.method240(1, this.field1405);
                        if (var12 == 1) {
                            this.field1254[this.field1253++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1352[this.field1351++] = var7;
                        var8.field451 = field1311;
                        int var13 = arg1.method240(3, this.field1405);
                        var8.method111(true, false, var13);
                        int var14 = arg1.method240(3, this.field1405);
                        var8.method111(true, false, var14);
                        int var15 = arg1.method240(1, this.field1405);
                        if (var15 == 1) {
                            this.field1254[this.field1253++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1355[this.field1354++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method473(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1442 = -1;
        }
        this.field1460.method258(6745);
        if (this.field1548 == 2) {
            byte[] var3 = this.field1447.field692;
            int[] var4 = Pix2D.field639;
            int var5 = var3.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                if (var3[var6] == 0) {
                    var4[var6] = 0;
                }
            }
            this.field1502.method190(this.field1629, 33, 25, this.field1641, 0, 0, 256, 25, this.field1412, 0, 33);
            this.field1461.method258(6745);
        } else {
            int var7 = this.field1629 + this.field1527 & 2047;
            int var8 = field1534.field406 / 32 + 48;
            int var9 = 464 - field1534.field407 / 32;
            this.field1399.method190(var7, 146, var9, this.field1672, 0, 25, this.field1292 + 256, var8, this.field1591, 5, 151);
            this.field1502.method190(this.field1629, 33, 25, this.field1641, 0, 0, 256, 25, this.field1412, 0, 33);
            for (int var10 = 0; var10 < this.field1232; ++var10) {
                int var39 = this.field1233[var10] * 4 + 2 - field1534.field406 / 32;
                int var40 = this.field1234[var10] * 4 + 2 - field1534.field407 / 32;
                this.method431(true, this.field1269[var10], var40, var39);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    LinkList var36 = this.field1312[this.field1542][var11][var35];
                    if (var36 != null) {
                        int var37 = var11 * 4 + 2 - field1534.field406 / 32;
                        int var38 = var35 * 4 + 2 - field1534.field407 / 32;
                        this.method431(true, this.field1687, var38, var37);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1351; ++var12) {
                NpcEntity var31 = this.field1350[this.field1352[var12]];
                if (var31 != null && var31.method113(false)) {
                    NpcType var32 = var31.field464;
                    if (var32.field1041 != null) {
                        var32 = var32.method345(930);
                    }
                    if (var32 != null && var32.field1032) {
                        int var33 = var31.field406 / 32 - field1534.field406 / 32;
                        int var34 = var31.field407 / 32 - field1534.field407 / 32;
                        this.method431(true, this.field1688, var34, var33);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field1251; ++var13) {
                PlayerEntity var24 = this.field1250[this.field1252[var13]];
                if (var24 != null && var24.method113(false)) {
                    int var25 = var24.field406 / 32 - field1534.field406 / 32;
                    int var26 = var24.field407 / 32 - field1534.field407 / 32;
                    boolean var27 = false;
                    long var28 = JString.method300(var24.field471);
                    for (int var30 = 0; var30 < this.field1537; ++var30) {
                        if (this.field1224[var30] == var28 && this.field1439[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    if (field1534.field494 != 0 && var24.field494 != 0) {
                        if (field1534.field494 == var24.field494) {
                            var27 = true;
                        } else {
                            var27 = false;
                        }
                    }
                    if (var27) {
                        this.method431(true, this.field1690, var26, var25);
                    } else {
                        this.method431(true, this.field1689, var26, var25);
                    }
                }
            }
            if (this.field1564 != 0 && field1311 % 20 < 10) {
                if (this.field1564 == 1 && this.field1430 >= 0 && this.field1430 < this.field1350.length) {
                    NpcEntity var14 = this.field1350[this.field1430];
                    if (var14 != null) {
                        int var15 = var14.field406 / 32 - field1534.field406 / 32;
                        int var16 = var14.field407 / 32 - field1534.field407 / 32;
                        this.method534(var15, var16, this.field1285, 6);
                    }
                }
                if (this.field1564 == 2) {
                    int var17 = (this.field1673 - this.field1426) * 4 + 2 - field1534.field406 / 32;
                    int var18 = (this.field1674 - this.field1427) * 4 + 2 - field1534.field407 / 32;
                    this.method534(var17, var18, this.field1285, 6);
                }
                if (this.field1564 == 10 && this.field1609 >= 0 && this.field1609 < this.field1250.length) {
                    PlayerEntity var19 = this.field1250[this.field1609];
                    if (var19 != null) {
                        int var20 = var19.field406 / 32 - field1534.field406 / 32;
                        int var21 = var19.field407 / 32 - field1534.field407 / 32;
                        this.method534(var20, var21, this.field1285, 6);
                    }
                }
            }
            if (this.field1397 != 0) {
                int var22 = this.field1397 * 4 + 2 - field1534.field406 / 32;
                int var23 = this.field1398 * 4 + 2 - field1534.field407 / 32;
                this.method431(true, this.field1284, var23, var22);
            }
            Pix2D.method157(16777215, 78, 3, -917, 97, 3);
            this.field1461.method258(6745);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method474(int arg0) {
        int var2 = 98 / arg0;
        ++field1668;
        if (field1668 > 192) {
            field1668 = 0;
            this.field1383.method218(24, 0);
            this.field1383.method219(232);
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method5((byte) 28);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field1612 != -1 && this.field1612 == this.field1466) {
                        if (var3 == 8 && this.field1303.length() > 0) {
                            this.field1303 = this.field1303.substring(0, this.field1303.length() - 1);
                        }
                        break;
                    }
                    if (this.field1481) {
                        if (var3 >= 32 && var3 <= 122 && this.field1480.length() < 80) {
                            this.field1480 = this.field1480 + (char) var3;
                            this.field1432 = true;
                        }
                        if (var3 == 8 && this.field1480.length() > 0) {
                            this.field1480 = this.field1480.substring(0, this.field1480.length() - 1);
                            this.field1432 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field1481 = false;
                            this.field1432 = true;
                            if (this.field1330 == 1) {
                                long var4 = JString.method300(this.field1480);
                                this.method509(7, var4);
                            }
                            if (this.field1330 == 2 && this.field1537 > 0) {
                                long var6 = JString.method300(this.field1480);
                                this.method430(var6, this.field1686);
                            }
                            if (this.field1330 == 3 && this.field1480.length() > 0) {
                                this.field1383.method218(47, 0);
                                this.field1383.method219(0);
                                int var8 = this.field1383.field722;
                                this.field1383.method225(this.field1563, 359);
                                WordPack.method307(this.field1480, (byte) 92, this.field1383);
                                this.field1383.method228(this.field1383.field722 - var8, -486);
                                this.field1480 = WordPack.method308(this.field1375, this.field1480);
                                this.field1480 = WordFilter.method401(this.field1375, this.field1480);
                                this.method484((byte) -97, JString.method304(JString.method301(this.field1563, this.field1223), -4015), this.field1480, 6);
                                if (this.field1664 == 2) {
                                    this.field1664 = 1;
                                    this.field1440 = true;
                                    this.field1383.method218(242, 0);
                                    this.field1383.method219(this.field1300);
                                    this.field1383.method219(this.field1664);
                                    this.field1383.method219(this.field1596);
                                }
                            }
                            if (this.field1330 == 4 && this.field1608 < 100) {
                                long var9 = JString.method300(this.field1480);
                                this.method553(var9, 571);
                            }
                            if (this.field1330 == 5 && this.field1608 > 0) {
                                long var11 = JString.method300(this.field1480);
                                this.method458(false, var11);
                            }
                        }
                    } else if (this.field1503) {
                        if (var3 >= 48 && var3 <= 57 && this.field1382.length() < 10) {
                            this.field1382 = this.field1382 + (char) var3;
                            this.field1432 = true;
                        }
                        if (var3 == 8 && this.field1382.length() > 0) {
                            this.field1382 = this.field1382.substring(0, this.field1382.length() - 1);
                            this.field1432 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field1382.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field1382);
                                } catch (Exception var20) {
                                }
                                this.field1383.method218(236, 0);
                                this.field1383.method223(var13);
                            }
                            this.field1503 = false;
                            this.field1432 = true;
                        }
                    } else if (this.field1265 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field1396.length() < 80) {
                            this.field1396 = this.field1396 + (char) var3;
                            this.field1432 = true;
                        }
                        if (var3 == 8 && this.field1396.length() > 0) {
                            this.field1396 = this.field1396.substring(0, this.field1396.length() - 1);
                            this.field1432 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field1396.length() > 0) {
                            if (this.field1487 == 2) {
                                if (this.field1396.equals("::clientdrop")) {
                                    this.method435(this.field1338);
                                }
                                if (this.field1396.equals("::lag")) {
                                    this.method493((byte) 3);
                                }
                                if (this.field1396.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field1679.method272(2, 763); ++var14) {
                                        this.field1679.method282(var14, false, (byte) 1, 2);
                                    }
                                }
                                if (this.field1396.equals("::fpson")) {
                                    field1604 = true;
                                }
                                if (this.field1396.equals("::fpsoff")) {
                                    field1604 = false;
                                }
                            }
                            if (this.field1396.startsWith("::")) {
                                this.field1383.method218(248, 0);
                                this.field1383.method219(this.field1396.length() - 1);
                                this.field1383.method226(this.field1396.substring(2));
                            } else {
                                String var15 = this.field1396.toLowerCase();
                                byte var16 = 0;
                                if (var15.startsWith("yellow:")) {
                                    var16 = 0;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var15.startsWith("red:")) {
                                    var16 = 1;
                                    this.field1396 = this.field1396.substring(4);
                                } else if (var15.startsWith("green:")) {
                                    var16 = 2;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var15.startsWith("cyan:")) {
                                    var16 = 3;
                                    this.field1396 = this.field1396.substring(5);
                                } else if (var15.startsWith("purple:")) {
                                    var16 = 4;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var15.startsWith("white:")) {
                                    var16 = 5;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var15.startsWith("flash1:")) {
                                    var16 = 6;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var15.startsWith("flash2:")) {
                                    var16 = 7;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var15.startsWith("flash3:")) {
                                    var16 = 8;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var15.startsWith("glow1:")) {
                                    var16 = 9;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var15.startsWith("glow2:")) {
                                    var16 = 10;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var15.startsWith("glow3:")) {
                                    var16 = 11;
                                    this.field1396 = this.field1396.substring(6);
                                }
                                String var17 = this.field1396.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("wave:")) {
                                    var18 = 1;
                                    this.field1396 = this.field1396.substring(5);
                                } else if (var17.startsWith("wave2:")) {
                                    var18 = 2;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var17.startsWith("shake:")) {
                                    var18 = 3;
                                    this.field1396 = this.field1396.substring(6);
                                } else if (var17.startsWith("scroll:")) {
                                    var18 = 4;
                                    this.field1396 = this.field1396.substring(7);
                                } else if (var17.startsWith("slide:")) {
                                    var18 = 5;
                                    this.field1396 = this.field1396.substring(6);
                                }
                                this.field1383.method218(37, 0);
                                this.field1383.method219(0);
                                int var19 = this.field1383.field722;
                                this.field1383.method219(var16);
                                this.field1383.method219(var18);
                                WordPack.method307(this.field1396, (byte) 92, this.field1383);
                                this.field1383.method228(this.field1383.field722 - var19, -486);
                                this.field1396 = WordPack.method308(this.field1375, this.field1396);
                                this.field1396 = WordFilter.method401(this.field1375, this.field1396);
                                field1534.field418 = this.field1396;
                                field1534.field420 = var16;
                                field1534.field421 = var18;
                                field1534.field419 = 150;
                                if (this.field1487 == 2) {
                                    this.method484((byte) -97, "@cr2@" + field1534.field471, field1534.field418, 2);
                                } else if (this.field1487 == 1) {
                                    this.method484((byte) -97, "@cr1@" + field1534.field471, field1534.field418, 2);
                                } else {
                                    this.method484((byte) -97, field1534.field471, field1534.field418, 2);
                                }
                                if (this.field1300 == 2) {
                                    this.field1300 = 3;
                                    this.field1440 = true;
                                    this.field1383.method218(242, 0);
                                    this.field1383.method219(this.field1300);
                                    this.field1383.method219(this.field1664);
                                    this.field1383.method219(this.field1596);
                                }
                            }
                            this.field1396 = "";
                            this.field1432 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field1303.length() < 12) {
                this.field1303 = this.field1303 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)V")
    public final void method475(boolean arg0, Component arg1) {
        int var3 = arg1.field82;
        if (arg0) {
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field1537;
                    if (this.field1538 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg1.field114 = "";
                        arg1.field81 = 0;
                    } else {
                        if (this.field1439[var3] == 0) {
                            arg1.field114 = "@red@Offline";
                        } else if (this.field1439[var3] == field1497) {
                            arg1.field114 = "@gre@World-" + (this.field1439[var3] - 9);
                        } else {
                            arg1.field114 = "@yel@World-" + (this.field1439[var3] - 9);
                        }
                        arg1.field81 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field1537;
                    if (this.field1538 != 2) {
                        var6 = 0;
                    }
                    arg1.field92 = var6 * 15 + 20;
                    if (arg1.field92 <= arg1.field84) {
                        arg1.field92 = arg1.field84 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field1538 == 0) {
                        arg1.field114 = "Loading ignore list";
                        arg1.field81 = 0;
                    } else if (var3 == 1 && this.field1538 == 0) {
                        arg1.field114 = "Please wait...";
                        arg1.field81 = 0;
                    } else {
                        int var7 = this.field1608;
                        if (this.field1538 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg1.field114 = "";
                            arg1.field81 = 0;
                        } else {
                            arg1.field114 = JString.method304(JString.method301(this.field1555[var3], this.field1223), -4015);
                            arg1.field81 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg1.field92 = this.field1608 * 15 + 20;
                    if (arg1.field92 <= arg1.field84) {
                        arg1.field92 = arg1.field84 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field129 = 150;
                    arg1.field130 = (int) (Math.sin((double) field1311 / 40.0D) * 256.0D) & 2047;
                    if (this.field1229) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field1377[var8];
                            if (var15 >= 0 && !IdkType.field1127[var15].method377(0)) {
                                return;
                            }
                        }
                        this.field1229 = false;
                        Model[] var9 = new Model[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field1377[var11];
                            if (var14 >= 0) {
                                var9[var10++] = IdkType.field1127[var14].method378((byte) 5);
                            }
                        }
                        Model var12 = new Model(var9, this.field1273, var10);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field1550[var13] != 0) {
                                var12.method140(field1549[var13][0], field1549[var13][this.field1550[var13]]);
                                if (var13 == 1) {
                                    var12.method140(field1547[0], field1547[this.field1550[var13]]);
                                }
                            }
                        }
                        var12.method133(true);
                        var12.method134(true, SeqType.field1145[field1534.field411].field1147[0]);
                        var12.method143(64, 850, -30, -50, -30, true);
                        arg1.field122 = 5;
                        arg1.field123 = 0;
                        Component.method36(var12, 0, 0, 5);
                    }
                } else if (var3 == 324) {
                    if (this.field1535 == null) {
                        this.field1535 = arg1.field120;
                        this.field1536 = arg1.field121;
                    }
                    if (this.field1278) {
                        arg1.field120 = this.field1536;
                    } else {
                        arg1.field120 = this.field1535;
                    }
                } else if (var3 == 325) {
                    if (this.field1535 == null) {
                        this.field1535 = arg1.field120;
                        this.field1536 = arg1.field121;
                    }
                    if (this.field1278) {
                        arg1.field120 = this.field1535;
                    } else {
                        arg1.field120 = this.field1536;
                    }
                } else if (var3 == 600) {
                    arg1.field114 = this.field1303;
                    if (field1311 % 20 < 10) {
                        arg1.field114 = arg1.field114 + "|";
                    } else {
                        arg1.field114 = arg1.field114 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field1487 >= 1) {
                            if (this.field1657) {
                                arg1.field116 = 16711680;
                                arg1.field114 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field116 = 16777215;
                                arg1.field114 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field114 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field1431 != 0) {
                            String var16;
                            if (this.field1467 == 0) {
                                var16 = "earlier today";
                            } else if (this.field1467 == 1) {
                                var16 = "yesterday";
                            } else {
                                var16 = this.field1467 + " days ago";
                            }
                            arg1.field114 = "You last logged in " + var16 + " from: " + signlink.dns;
                        } else {
                            arg1.field114 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field1595 == 0) {
                            arg1.field114 = "0 unread messages";
                            arg1.field116 = 16776960;
                        }
                        if (this.field1595 == 1) {
                            arg1.field114 = "1 unread message";
                            arg1.field116 = 65280;
                        }
                        if (this.field1595 > 1) {
                            arg1.field114 = this.field1595 + " unread messages";
                            arg1.field116 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field1380 == 201) {
                            if (this.field1456 == 1) {
                                arg1.field114 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg1.field114 = "";
                            }
                        } else if (this.field1380 == 200) {
                            arg1.field114 = "You have not yet set any password recovery questions.";
                        } else {
                            String var17;
                            if (this.field1380 == 0) {
                                var17 = "Earlier today";
                            } else if (this.field1380 == 1) {
                                var17 = "Yesterday";
                            } else {
                                var17 = this.field1380 + " days ago";
                            }
                            arg1.field114 = var17 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field1380 == 201) {
                            if (this.field1456 == 1) {
                                arg1.field114 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg1.field114 = "";
                            }
                        } else if (this.field1380 == 200) {
                            arg1.field114 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg1.field114 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field1380 == 201) {
                            if (this.field1456 == 1) {
                                arg1.field114 = "@whi@this world but member benefits are unavailable whilst here.";
                            } else {
                                arg1.field114 = "";
                            }
                        } else if (this.field1380 == 200) {
                            arg1.field114 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg1.field114 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else if (var3 == 1 && this.field1538 == 0) {
                arg1.field114 = "Loading friend list";
                arg1.field81 = 0;
            } else if (var3 == 1 && this.field1538 == 1) {
                arg1.field114 = "Connecting to friendserver";
                arg1.field81 = 0;
            } else if (var3 == 2 && this.field1538 != 2) {
                arg1.field114 = "Please wait...";
                arg1.field81 = 0;
            } else {
                int var4 = this.field1537;
                if (this.field1538 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg1.field114 = "";
                    arg1.field81 = 0;
                } else {
                    arg1.field114 = this.field1532[var3];
                    arg1.field81 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method476(int arg0, byte arg1) {
        if (this.field1256 != arg1) {
            this.field1619 = this.field1239.method295();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILgc;I)V")
    public final void method477(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (arg2 <= 0) {
            this.field1411 = -322;
        }
        if (this.field1483 < 400) {
            if (arg3.field1041 != null) {
                arg3 = arg3.method345(930);
            }
            if (arg3 != null) {
                String var6 = arg3.field1016;
                if (arg3.field1033 != 0) {
                    var6 = var6 + method547(field1534.field477, -198, arg3.field1033) + " (level-" + arg3.field1033 + ")";
                }
                if (this.field1420 == 1) {
                    this.field1580[this.field1483] = "Use " + this.field1424 + " with @yel@" + var6;
                    this.field1470[this.field1483] = 829;
                    this.field1471[this.field1483] = arg0;
                    this.field1468[this.field1483] = arg4;
                    this.field1469[this.field1483] = arg1;
                    ++this.field1483;
                } else {
                    if (this.field1472 == 1) {
                        if ((this.field1474 & 2) == 2) {
                            this.field1580[this.field1483] = this.field1475 + " @yel@" + var6;
                            this.field1470[this.field1483] = 240;
                            this.field1471[this.field1483] = arg0;
                            this.field1468[this.field1483] = arg4;
                            this.field1469[this.field1483] = arg1;
                            ++this.field1483;
                            return;
                        }
                    } else {
                        if (arg3.field1028 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg3.field1028[var7] != null && !arg3.field1028[var7].equalsIgnoreCase("attack")) {
                                    this.field1580[this.field1483] = arg3.field1028[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1470[this.field1483] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1470[this.field1483] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1470[this.field1483] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1470[this.field1483] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1470[this.field1483] = 793;
                                    }
                                    this.field1471[this.field1483] = arg0;
                                    this.field1468[this.field1483] = arg4;
                                    this.field1469[this.field1483] = arg1;
                                    ++this.field1483;
                                }
                            }
                        }
                        if (arg3.field1028 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg3.field1028[var8] != null && arg3.field1028[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg3.field1033 > field1534.field477) {
                                        var9 = 2000;
                                    }
                                    this.field1580[this.field1483] = arg3.field1028[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1470[this.field1483] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1470[this.field1483] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1470[this.field1483] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1470[this.field1483] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1470[this.field1483] = var9 + 793;
                                    }
                                    this.field1471[this.field1483] = arg0;
                                    this.field1468[this.field1483] = arg4;
                                    this.field1469[this.field1483] = arg1;
                                    ++this.field1483;
                                }
                            }
                        }
                        this.field1580[this.field1483] = "Examine @yel@" + var6;
                        this.field1470[this.field1483] = 1714;
                        this.field1471[this.field1483] = arg0;
                        this.field1468[this.field1483] = arg4;
                        this.field1469[this.field1483] = arg1;
                        ++this.field1483;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method478(int arg0) {
        Graphics var2 = this.method11(19330).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(-577, 1);
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1680) {
            this.field1286 = false;
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
        if (this.field1611) {
            this.field1286 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1627) {
            this.field1286 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method479(int arg0, Component arg1) {
        if (arg1.field89 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field89.length; ++var3) {
                int var4 = this.method469((byte) 96, var3, arg1);
                int var5 = arg1.field90[var3];
                if (arg1.field89[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field89[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field89[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            this.field1441 += arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method480(int arg0) {
        LocType.field997.method103();
        LocType.field998.method103();
        NpcType.field1044.method103();
        ObjType.field1094.method103();
        ObjType.field1095.method103();
        PlayerEntity.field495.method103();
        SpotAnimType.field1178.method103();
        this.field1441 += arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method481(Component arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg0.field82;
        if (this.field1538 == 2) {
            if (var4 == 201) {
                this.field1432 = true;
                this.field1503 = false;
                this.field1481 = true;
                this.field1480 = "";
                this.field1330 = 1;
                this.field1283 = "Enter name of friend to add to list";
            }
            if (var4 == 202) {
                this.field1432 = true;
                this.field1503 = false;
                this.field1481 = true;
                this.field1480 = "";
                this.field1330 = 2;
                this.field1283 = "Enter name of friend to delete from list";
            }
        }
        if (var4 == 205) {
            this.field1445 = 250;
            return true;
        } else {
            if (var4 == 501) {
                this.field1432 = true;
                this.field1503 = false;
                this.field1481 = true;
                this.field1480 = "";
                this.field1330 = 4;
                this.field1283 = "Enter name of player to add to list";
            }
            if (var4 == 502) {
                this.field1432 = true;
                this.field1503 = false;
                this.field1481 = true;
                this.field1480 = "";
                this.field1330 = 5;
                this.field1283 = "Enter name of player to delete from list";
            }
            if (var4 >= 300 && var4 <= 313) {
                int var5 = (var4 - 300) / 2;
                int var6 = var4 & 1;
                int var7 = this.field1377[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = IdkType.field1126 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= IdkType.field1126) {
                                var7 = 0;
                            }
                        }
                        if (!IdkType.field1127[var7].field1133 && IdkType.field1127[var7].field1128 == var5 + (this.field1278 ? 0 : 7)) {
                            this.field1377[var5] = var7;
                            this.field1229 = true;
                            break;
                        }
                    }
                }
            }
            if (var4 >= 314 && var4 <= 323) {
                int var8 = (var4 - 314) / 2;
                int var9 = var4 & 1;
                int var10 = this.field1550[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field1549[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field1549[var8].length) {
                        var10 = 0;
                    }
                }
                this.field1550[var8] = var10;
                this.field1229 = true;
            }
            if (var4 == 324 && !this.field1278) {
                this.field1278 = true;
                this.method454(-487);
            }
            if (var4 == 325 && this.field1278) {
                this.field1278 = false;
                this.method454(-487);
            }
            if (var4 != 326) {
                if (var4 == 613) {
                    this.field1657 = !this.field1657;
                }
                if (var4 >= 601 && var4 <= 612) {
                    this.method432(true);
                    if (this.field1303.length() > 0) {
                        this.field1383.method218(85, 0);
                        this.field1383.method225(JString.method300(this.field1303), 359);
                        this.field1383.method219(var4 - 601);
                        this.field1383.method219(this.field1657 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1383.method218(145, 0);
                this.field1383.method219(this.field1278 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field1383.method219(this.field1377[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field1383.method219(this.field1550[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method482(int arg0) {
        if (this.field1505 == null) {
            super.field16 = null;
            this.field1462 = null;
            this.field1460 = null;
            this.field1459 = null;
            this.field1461 = null;
            this.field1614 = null;
            this.field1615 = null;
            this.field1616 = null;
            this.field1508 = new PixMap(500, 128, this.method11(19330), 265);
            Pix2D.method155(true);
            this.field1509 = new PixMap(500, 128, this.method11(19330), 265);
            Pix2D.method155(true);
            this.field1505 = new PixMap(500, 509, this.method11(19330), 171);
            Pix2D.method155(true);
            this.field1506 = new PixMap(500, 360, this.method11(19330), 132);
            Pix2D.method155(true);
            this.field1507 = new PixMap(500, 360, this.method11(19330), 200);
            Pix2D.method155(true);
            this.field1510 = new PixMap(500, 202, this.method11(19330), 238);
            Pix2D.method155(true);
            this.field1511 = new PixMap(500, 203, this.method11(19330), 238);
            Pix2D.method155(true);
            this.field1512 = new PixMap(500, 74, this.method11(19330), 94);
            Pix2D.method155(true);
            this.field1513 = new PixMap(500, 75, this.method11(19330), 94);
            Pix2D.method155(true);
            if (this.field1661 != null) {
                this.method551(field1621);
                this.method449(true);
            }
            this.field1486 = true;
            this.field1441 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method483(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 256 - arg2;
        if (arg3 != 4) {
            this.field1442 = -1;
        }
        return ((arg0 & 16711935) * var5 + (arg1 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg1 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
    public final void method484(byte arg0, String arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field1339 != -1) {
            this.field1337 = arg2;
            super.field29 = 0;
        }
        if (this.field1265 == -1) {
            this.field1432 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1259[var5] = this.field1259[var5 - 1];
            this.field1260[var5] = this.field1260[var5 - 1];
            this.field1261[var5] = this.field1261[var5 - 1];
        }
        this.field1259[0] = arg3;
        this.field1260[0] = arg1;
        this.field1261[0] = arg2;
        if (arg0 != -97) {
            this.field1545 = this.field1239.method295();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method485(String arg0) {
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method486(int arg0) {
        this.field1286 = false;
        while (this.field1231) {
            this.field1286 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1684 = null;
        this.field1685 = null;
        this.field1225 = null;
        this.field1441 += arg0;
        this.field1646 = null;
        this.field1647 = null;
        this.field1648 = null;
        this.field1649 = null;
        this.field1320 = null;
        this.field1321 = null;
        this.field1632 = null;
        this.field1633 = null;
        this.field1666 = null;
        this.field1667 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method487(boolean arg0, byte arg1) {
        if (field1534.field406 >> 7 == this.field1397 && field1534.field407 >> 7 == this.field1398) {
            this.field1397 = 0;
            ++field1613;
            if (field1613 > 122) {
                field1613 = 0;
                this.field1383.method218(110, 0);
                this.field1383.method219(62);
            }
        }
        int var3 = this.field1251;
        if (arg1 != 58) {
            this.field1384 = !this.field1384;
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1534;
                var6 = this.field1249 << 14;
            } else {
                var5 = this.field1250[this.field1252[var4]];
                var6 = this.field1252[var4] << 14;
            }
            if (var5 != null && var5.method113(false)) {
                var5.field491 = false;
                if ((field1500 && this.field1251 > 50 || this.field1251 > 200) && !arg0 && var5.field431 == var5.field411) {
                    var5.field491 = true;
                }
                int var7 = var5.field406 >> 7;
                int var8 = var5.field407 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field486 != null && field1311 >= var5.field481 && field1311 < var5.field482) {
                        var5.field491 = false;
                        var5.field480 = this.method532(var5.field406, this.field1542, (byte) 8, var5.field407);
                        this.field1501.method62(var6, var5.field487, var5, var5.field490, this.field1542, 20027, 60, var5.field488, var5.field480, var5.field407, var5.field408, var5.field489, var5.field406);
                    } else {
                        if ((var5.field406 & 127) == 64 && (var5.field407 & 127) == 64) {
                            if (this.field1556[var7][var8] == this.field1463) {
                                continue;
                            }
                            this.field1556[var7][var8] = this.field1463;
                        }
                        var5.field480 = this.method532(var5.field406, this.field1542, (byte) 8, var5.field407);
                        this.field1501.method61(var5.field409, var5.field408, var5.field407, var5.field406, var6, 60, 0, this.field1542, var5, var5.field480);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method488(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1520 = "";
                this.field1521 = "Connecting to server...";
                this.method507(false, true);
            }
            this.field1576 = new ClientStream(-323, this.method500(field1498 + 43594), this);
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1383.field722 = 0;
            this.field1383.method219(14);
            this.field1383.method219(var6);
            this.field1576.method42(2, (byte) 3, 0, this.field1383.field721);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1576.method39();
            }
            int var8 = this.field1576.method39();
            int var9 = var8;
            if (var8 == 0) {
                this.field1576.method41(this.field1357.field721, 0, 8);
                this.field1357.field722 = 0;
                this.field1663 = this.field1357.method235(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1663 >> 32), (int) this.field1663 };
                this.field1383.field722 = 0;
                this.field1383.method219(10);
                this.field1383.method223(var10[0]);
                this.field1383.method223(var10[1]);
                this.field1383.method223(var10[2]);
                this.field1383.method223(var10[3]);
                this.field1383.method223(signlink.uid);
                this.field1383.method226(arg0);
                this.field1383.method226(arg1);
                this.field1383.method244(field1606, (byte) 7, field1610);
                this.field1301.field722 = 0;
                if (arg2) {
                    this.field1301.method219(18);
                } else {
                    this.field1301.method219(16);
                }
                this.field1301.method219(this.field1383.field722 + 36 + 1 + 1 + 2);
                this.field1301.method219(255);
                this.field1301.method220(297);
                this.field1301.method219(field1500 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field1301.method223(this.field1404[var11]);
                }
                this.field1301.method227(0, 1, this.field1383.field721, this.field1383.field722);
                this.field1383.field726 = new Isaac((byte) 99, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field1239 = new Isaac((byte) 99, var10);
                this.field1576.method42(this.field1301.field722, (byte) 3, 0, this.field1301.field721);
                var8 = this.field1576.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method488(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1487 = this.field1576.method39();
                field1546 = this.field1576.method39() == 1;
                this.field1319 = 0L;
                this.field1395 = 0;
                this.field1378.field1002 = 0;
                super.field20 = true;
                this.field1353 = true;
                this.field1450 = true;
                this.field1383.field722 = 0;
                this.field1357.field722 = 0;
                this.field1442 = -1;
                this.field1235 = -1;
                this.field1236 = -1;
                this.field1237 = -1;
                this.field1441 = 0;
                this.field1443 = 0;
                this.field1658 = 0;
                this.field1445 = 0;
                this.field1564 = 0;
                this.field1483 = 0;
                this.field1381 = false;
                super.field21 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field1261[var13] = null;
                }
                this.field1420 = 0;
                this.field1472 = 0;
                this.field1617 = 0;
                this.field1650 = 0;
                this.field1327 = (int) (Math.random() * 100.0D) - 50;
                this.field1597 = (int) (Math.random() * 110.0D) - 55;
                this.field1560 = (int) (Math.random() * 80.0D) - 40;
                this.field1527 = (int) (Math.random() * 120.0D) - 60;
                this.field1292 = (int) (Math.random() * 30.0D) - 20;
                this.field1629 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1548 = 0;
                this.field1376 = -1;
                this.field1397 = 0;
                this.field1398 = 0;
                this.field1251 = 0;
                this.field1351 = 0;
                for (int var14 = 0; var14 < this.field1248; ++var14) {
                    this.field1250[var14] = null;
                    this.field1255[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field1350[var15] = null;
                }
                field1534 = this.field1250[this.field1249] = new PlayerEntity();
                this.field1267.method252();
                this.field1335.method252();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field1312[var16][var17][var18] = null;
                        }
                    }
                }
                this.field1559 = new LinkList(464);
                this.field1538 = 0;
                this.field1537 = 0;
                this.field1339 = -1;
                this.field1265 = -1;
                this.field1612 = -1;
                this.field1607 = -1;
                this.field1526 = -1;
                this.field1654 = false;
                this.field1433 = 3;
                this.field1503 = false;
                this.field1381 = false;
                this.field1481 = false;
                this.field1337 = null;
                this.field1308 = 0;
                this.field1625 = -1;
                this.field1278 = true;
                this.method454(-487);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1550[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field1274[var20] = null;
                    this.field1275[var20] = false;
                }
                field1299 = 0;
                field1574 = 0;
                field1295 = 0;
                field1418 = 0;
                field1290 = 0;
                field1622 = 0;
                field1304 = 0;
                field1665 = 0;
                field1257 = 0;
                field1294 = 0;
                this.method502(true);
            } else if (var8 == 3) {
                this.field1520 = "";
                this.field1521 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1520 = "Your account has been disabled.";
                this.field1521 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1520 = "Your account is already logged in.";
                this.field1521 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1520 = "RuneScape has been updated!";
                this.field1521 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1520 = "This world is full.";
                this.field1521 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1520 = "Unable to connect.";
                this.field1521 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1520 = "Login limit exceeded.";
                this.field1521 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1520 = "Unable to connect.";
                this.field1521 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1521 = "Login server rejected session.";
                this.field1521 = "Please try again.";
            } else if (var8 == 12) {
                this.field1520 = "You need a members account to login to this world.";
                this.field1521 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1520 = "Could not complete login.";
                this.field1521 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1520 = "The server is being updated.";
                this.field1521 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1450 = true;
                this.field1383.field722 = 0;
                this.field1357.field722 = 0;
                this.field1442 = -1;
                this.field1235 = -1;
                this.field1236 = -1;
                this.field1237 = -1;
                this.field1441 = 0;
                this.field1443 = 0;
                this.field1658 = 0;
                this.field1483 = 0;
                this.field1381 = false;
                this.field1569 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1520 = "Login attempts exceeded.";
                this.field1521 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1520 = "You are standing in a members-only area.";
                this.field1521 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1520 = "Invalid loginserver requested";
                this.field1521 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field1305 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field1305;
                            this.method488(arg0, arg1, arg2);
                        } else {
                            this.field1520 = "No response from loginserver";
                            this.field1521 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field1520 = "No response from server";
                        this.field1521 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field1520 = "Unexpected server response";
                    this.field1521 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field1576.method39(); var21 >= 0; --var21) {
                    this.field1520 = "You have only just left another world";
                    this.field1521 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method507(false, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method488(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field1520 = "";
            this.field1521 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method489(Component arg0, byte arg1) {
        int var3 = arg0.field82;
        if (this.field1558 != arg1) {
            throw new NullPointerException();
        } else if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1580[this.field1483] = "Remove @whi@" + arg0.field114;
                this.field1470[this.field1483] = 884;
                ++this.field1483;
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
            this.field1580[this.field1483] = "Remove @whi@" + this.field1532[var3];
            this.field1470[this.field1483] = 513;
            ++this.field1483;
            this.field1580[this.field1483] = "Message @whi@" + this.field1532[var3];
            this.field1470[this.field1483] = 902;
            ++this.field1483;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method490(boolean arg0) {
        if (arg0) {
            this.field1383.method219(99);
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1335.method248(); var2 != null; var2 = (SpotAnimEntity) this.field1335.method250(true)) {
            if (this.field1542 == var2.field627 && !var2.field633) {
                if (field1311 >= var2.field626) {
                    var2.method151(this.field1490, true);
                    if (var2.field633) {
                        var2.method106();
                    } else {
                        this.field1501.method61(false, 0, var2.field629, var2.field628, -1, 60, 0, var2.field627, var2, var2.field630);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (this.field1669 != arg0) {
            this.field1442 = this.field1357.method229();
        }
        if (field1500 && this.field1617 == 2 && World.field44 != this.field1542) {
            this.field1461.method258(6745);
            this.field1280.method202("Loading - please wait.", false, 0, 257, 151);
            this.field1280.method202("Loading - please wait.", false, 16777215, 256, 150);
            this.field1461.method259(4, 4, super.field15, this.field1411);
            this.field1617 = 1;
            this.field1569 = System.currentTimeMillis();
        }
        if (this.field1617 == 1) {
            int var2 = this.method492(false);
            if (var2 != 0 && System.currentTimeMillis() - this.field1569 > 360000L) {
                signlink.reporterror(this.field1314 + " glcfb " + this.field1663 + "," + var2 + "," + field1500 + "," + this.field1262[0] + "," + this.field1679.method280() + "," + this.field1542 + "," + this.field1659 + "," + this.field1660);
                this.field1569 = System.currentTimeMillis();
            }
        }
        if (this.field1617 == 2 && this.field1542 != this.field1376) {
            this.field1376 = this.field1542;
            this.method466(this.field1619, this.field1542);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)I")
    public final int method492(boolean arg0) {
        for (int var2 = 0; var2 < this.field1241.length; ++var2) {
            if (this.field1241[var2] == null && this.field1530[var2] != -1) {
                return -1;
            }
            if (this.field1577[var2] == null && this.field1531[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0) {
            return this.field1411;
        } else {
            for (int var4 = 0; var4 < this.field1241.length; ++var4) {
                byte[] var5 = this.field1577[var4];
                if (var5 != null) {
                    int var6 = (this.field1529[var4] >> 8) * 64 - this.field1426;
                    int var7 = (this.field1529[var4] & 255) * 64 - this.field1427;
                    var3 &= World.method16(var7, var5, (byte) 40, var6);
                }
            }
            if (!var3) {
                return -3;
            } else if (this.field1289) {
                return -4;
            } else {
                this.field1617 = 2;
                World.field44 = this.field1542;
                this.method462((byte) 1);
                this.field1383.method218(81, 0);
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public void method493(byte arg0) {
        if (arg0 != 3) {
            this.field1619 = 77;
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1287);
        if (this.field1679 != null) {
            System.out.println("Od-cycle:" + this.field1679.field855);
        }
        System.out.println("loop-cycle:" + field1311);
        System.out.println("draw-cycle:" + field1313);
        System.out.println("ptype:" + this.field1442);
        System.out.println("psize:" + this.field1441);
        if (this.field1576 != null) {
            this.field1576.method43((byte) 3);
        }
        super.field12 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != 19330) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field18 != null ? super.field18 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;ZILab;)V")
    private final void method494(int arg0, Packet arg1, boolean arg2, int arg3, PlayerEntity arg4) {
        if (arg2) {
            this.field1312 = null;
        }
        if ((arg0 & 1) == 1) {
            int var6 = arg1.method229();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(-49365, var7);
            arg1.method238(var6, var7, 0, 36);
            this.field1255[arg3] = var8;
            arg4.method116(var8, (byte) 50);
        }
        if ((arg0 & 2) == 2) {
            int var9 = arg1.method231();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field434 == var9) {
                arg4.field438 = 0;
            }
            int var10 = arg1.method229();
            if (arg4.field434 == var9 && var9 != -1) {
                int var11 = SeqType.field1145[var9].field1159;
                if (var11 == 1) {
                    arg4.field435 = 0;
                    arg4.field436 = 0;
                    arg4.field437 = var10;
                    arg4.field438 = 0;
                }
                if (var11 == 2) {
                    arg4.field438 = 0;
                }
            } else if (var9 == -1 || arg4.field434 == -1 || SeqType.field1145[var9].field1153 >= SeqType.field1145[arg4.field434].field1153) {
                arg4.field434 = var9;
                arg4.field435 = 0;
                arg4.field436 = 0;
                arg4.field437 = var10;
                arg4.field438 = 0;
                arg4.field460 = arg4.field455;
            }
        }
        if ((arg0 & 4) == 4) {
            arg4.field428 = arg1.method231();
            if (arg4.field428 == 65535) {
                arg4.field428 = -1;
            }
        }
        if ((arg0 & 8) == 8) {
            arg4.field418 = arg1.method236();
            if (arg4.field418.charAt(0) == '~') {
                arg4.field418 = arg4.field418.substring(1);
                this.method484((byte) -97, arg4.field471, arg4.field418, 2);
            } else if (field1534 == arg4) {
                this.method484((byte) -97, arg4.field471, arg4.field418, 2);
            }
            arg4.field420 = 0;
            arg4.field421 = 0;
            arg4.field419 = 150;
        }
        if ((arg0 & 16) == 16) {
            int var12 = arg1.method229();
            int var13 = arg1.method229();
            arg4.method114(field1311, 8573, var12, var13);
            arg4.field425 = field1311 + 300;
            arg4.field426 = arg1.method229();
            arg4.field427 = arg1.method229();
        }
        if ((arg0 & 32) == 32) {
            arg4.field429 = arg1.method231();
            arg4.field430 = arg1.method231();
        }
        if ((arg0 & 64) == 64) {
            int var14 = arg1.method231();
            int var15 = arg1.method229();
            int var16 = arg1.method229();
            int var17 = arg1.field722;
            if (arg4.field471 != null && arg4.field472) {
                long var18 = JString.method300(arg4.field471);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1608; ++var21) {
                        if (this.field1555[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1504 == 0) {
                    try {
                        String var22 = WordPack.method306(var16, arg1, 964);
                        String var23 = WordFilter.method401(this.field1375, var22);
                        arg4.field418 = var23;
                        arg4.field420 = var14 >> 8;
                        arg4.field421 = var14 & 255;
                        arg4.field419 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method484((byte) -97, "@cr1@" + arg4.field471, var23, 1);
                            } else {
                                this.method484((byte) -97, arg4.field471, var23, 2);
                            }
                        } else {
                            this.method484((byte) -97, "@cr2@" + arg4.field471, var23, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field722 = var16 + var17;
        }
        if ((arg0 & 256) == 256) {
            arg4.field439 = arg1.method231();
            int var25 = arg1.method234();
            arg4.field443 = var25 >> 16;
            arg4.field442 = (var25 & 65535) + field1311;
            arg4.field440 = 0;
            arg4.field441 = 0;
            if (arg4.field442 > field1311) {
                arg4.field440 = -1;
            }
            if (arg4.field439 == 65535) {
                arg4.field439 = -1;
            }
        }
        if ((arg0 & 512) == 512) {
            arg4.field444 = arg1.method229();
            arg4.field446 = arg1.method229();
            arg4.field445 = arg1.method229();
            arg4.field447 = arg1.method229();
            arg4.field448 = arg1.method231() + field1311;
            arg4.field449 = arg1.method231() + field1311;
            arg4.field450 = arg1.method229();
            arg4.method112(513);
        }
        if ((arg0 & 1024) == 1024) {
            int var26 = arg1.method229();
            int var27 = arg1.method229();
            arg4.method114(field1311, 8573, var26, var27);
            arg4.field425 = field1311 + 300;
            arg4.field426 = arg1.method229();
            arg4.field427 = arg1.method229();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILlb;I)V")
    private final void method495(int arg0, Packet arg1, int arg2) {
        this.field1354 = 0;
        this.field1253 = 0;
        this.method472(arg2, arg1, 6);
        int var4 = 28 / arg0;
        this.method513(0, arg2, arg1);
        this.method464(arg2, arg1, 466);
        for (int var5 = 0; var5 < this.field1354; ++var5) {
            int var7 = this.field1355[var5];
            if (field1311 != this.field1350[var7].field451) {
                this.field1350[var7].field464 = null;
                this.field1350[var7] = null;
            }
        }
        if (arg1.field722 != arg2) {
            signlink.reporterror(this.field1314 + " size mismatch in getnpcpos - pos:" + arg1.field722 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1351; ++var6) {
                if (this.field1350[this.field1352[var6]] == null) {
                    signlink.reporterror(this.field1314 + " null entry in npc list - pos:" + var6 + " size:" + this.field1351);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (this.field1494 == 0) {
            this.field1580[0] = "Cancel";
            this.field1470[0] = 1106;
            this.field1483 = 1;
            this.method555((byte) 56);
            this.field1634 = 0;
            this.field1441 += arg0;
            if (super.field23 > 4 && super.field24 > 4 && super.field23 < 516 && super.field24 < 338) {
                if (this.field1612 != -1) {
                    this.method542(0, Component.field73[this.field1612], (byte) 0, 4, 4, super.field23, super.field24);
                } else {
                    this.method508((byte) 6);
                }
            }
            if (this.field1645 != this.field1634) {
                this.field1645 = this.field1634;
            }
            this.field1634 = 0;
            if (super.field23 > 553 && super.field24 > 205 && super.field23 < 743 && super.field24 < 466) {
                if (this.field1607 != -1) {
                    this.method542(0, Component.field73[this.field1607], (byte) 0, 205, 553, super.field23, super.field24);
                } else if (this.field1554[this.field1433] != -1) {
                    this.method542(0, Component.field73[this.field1554[this.field1433]], (byte) 0, 205, 553, super.field23, super.field24);
                }
            }
            if (this.field1634 != this.field1419) {
                this.field1605 = true;
                this.field1419 = this.field1634;
            }
            this.field1634 = 0;
            if (super.field23 > 17 && super.field24 > 357 && super.field23 < 496 && super.field24 < 453) {
                if (this.field1265 != -1) {
                    this.method542(0, Component.field73[this.field1265], (byte) 0, 357, 17, super.field23, super.field24);
                } else if (super.field24 < 434 && super.field23 < 426) {
                    this.method501(super.field23 - 17, super.field24 - 357, -5661);
                }
            }
            if (this.field1265 != -1 && this.field1634 != this.field1489) {
                this.field1432 = true;
                this.field1489 = this.field1634;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1483 - 1; ++var3) {
                    if (this.field1470[var3] < 1000 && this.field1470[var3 + 1] > 1000) {
                        String var4 = this.field1580[var3];
                        this.field1580[var3] = this.field1580[var3 + 1];
                        this.field1580[var3 + 1] = var4;
                        int var5 = this.field1470[var3];
                        this.field1470[var3] = this.field1470[var3 + 1];
                        this.field1470[var3 + 1] = var5;
                        int var6 = this.field1468[var3];
                        this.field1468[var3] = this.field1468[var3 + 1];
                        this.field1468[var3 + 1] = var6;
                        int var7 = this.field1469[var3];
                        this.field1469[var3] = this.field1469[var3 + 1];
                        this.field1469[var3 + 1] = var7;
                        int var8 = this.field1471[var3];
                        this.field1471[var3] = this.field1471[var3 + 1];
                        this.field1471[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLy;)V")
    public final void method497(int arg0, byte arg1, PathingEntity arg2) {
        if (arg1 != 122) {
            field1365 = this.field1239.method295();
        }
        this.method498(arg2.field406, arg0, arg2.field407, 7);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var5 = this.method532(arg0, this.field1542, (byte) 8, arg2) - arg1;
            int var6 = arg0 - this.field1385;
            if (arg3 < 7 || arg3 > 7) {
                this.field1442 = this.field1357.method229();
            }
            int var7 = var5 - this.field1386;
            int var8 = arg2 - this.field1387;
            int var9 = Model.field616[this.field1388];
            int var10 = Model.field617[this.field1388];
            int var11 = Model.field616[this.field1389];
            int var12 = Model.field617[this.field1389];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1242 = (var13 << 9) / var17 + Pix3D.field659;
                this.field1243 = (var16 << 9) / var17 + Pix3D.field660;
            } else {
                this.field1242 = -1;
                this.field1243 = -1;
            }
        } else {
            this.field1242 = -1;
            this.field1243 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method499(int arg0) {
        short var2 = 256;
        while (arg0 >= 0) {
            field1621 = this.field1239.method295();
        }
        if (this.field1655 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1655 > 768) {
                    this.field1646[var3] = this.method483(this.field1647[var3], this.field1648[var3], 1024 - this.field1655, this.field1322);
                } else if (this.field1655 > 256) {
                    this.field1646[var3] = this.field1648[var3];
                } else {
                    this.field1646[var3] = this.method483(this.field1648[var3], this.field1647[var3], 256 - this.field1655, this.field1322);
                }
            }
        } else if (this.field1656 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1656 > 768) {
                    this.field1646[var4] = this.method483(this.field1647[var4], this.field1649[var4], 1024 - this.field1656, this.field1322);
                } else if (this.field1656 > 256) {
                    this.field1646[var4] = this.field1649[var4];
                } else {
                    this.field1646[var4] = this.method483(this.field1649[var4], this.field1647[var4], 256 - this.field1656, this.field1322);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1646[var5] = this.field1647[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1508.field757[var6] = this.field1666.field681[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1272[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1632[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1646[var26];
                    int var30 = this.field1508.field757[var8];
                    this.field1508.field757[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1508.method259(0, 0, super.field15, this.field1411);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1509.field757[var10] = this.field1667.field681[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1272[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1632[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1646[var18];
                    int var22 = this.field1509.field757[var16];
                    this.field1509.field757[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1509.method259(637, 0, super.field15, this.field1411);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method500(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method501(int arg0, int arg1, int arg2) {
        if (arg2 != -5661) {
            this.field1442 = this.field1357.method229();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1261[var5] != null) {
                int var6 = this.field1259[var5];
                int var7 = 70 - var4 * 14 + this.field1541 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1260[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1300 == 0 || this.field1300 == 1 && this.method514(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field1534.field471)) {
                        if (this.field1487 >= 1) {
                            this.field1580[this.field1483] = "Report abuse @whi@" + var8;
                            this.field1470[this.field1483] = 524;
                            ++this.field1483;
                        }
                        this.field1580[this.field1483] = "Add ignore @whi@" + var8;
                        this.field1470[this.field1483] = 47;
                        ++this.field1483;
                        this.field1580[this.field1483] = "Add friend @whi@" + var8;
                        this.field1470[this.field1483] = 605;
                        ++this.field1483;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1306 == 0 && (var6 == 7 || this.field1664 == 0 || this.field1664 == 1 && this.method514(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field1487 >= 1) {
                            this.field1580[this.field1483] = "Report abuse @whi@" + var8;
                            this.field1470[this.field1483] = 524;
                            ++this.field1483;
                        }
                        this.field1580[this.field1483] = "Add ignore @whi@" + var8;
                        this.field1470[this.field1483] = 47;
                        ++this.field1483;
                        this.field1580[this.field1483] = "Add friend @whi@" + var8;
                        this.field1470[this.field1483] = 605;
                        ++this.field1483;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1596 == 0 || this.field1596 == 1 && this.method514(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1580[this.field1483] = "Accept trade @whi@" + var8;
                        this.field1470[this.field1483] = 507;
                        ++this.field1483;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1306 == 0 && this.field1664 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1596 == 0 || this.field1596 == 1 && this.method514(false, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1580[this.field1483] = "Accept challenge @whi@" + var8;
                        this.field1470[this.field1483] = 957;
                        ++this.field1483;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method502(boolean arg0) {
        if (this.field1462 == null) {
            this.method486(0);
            super.field16 = null;
            this.field1505 = null;
            this.field1506 = null;
            this.field1507 = null;
            this.field1508 = null;
            this.field1509 = null;
            this.field1450 &= arg0;
            this.field1510 = null;
            this.field1511 = null;
            this.field1512 = null;
            this.field1513 = null;
            this.field1462 = new PixMap(500, 479, this.method11(19330), 96);
            this.field1460 = new PixMap(500, 172, this.method11(19330), 156);
            Pix2D.method155(true);
            this.field1447.method199(0, true, 0);
            this.field1459 = new PixMap(500, 190, this.method11(19330), 261);
            this.field1461 = new PixMap(500, 512, this.method11(19330), 334);
            Pix2D.method155(true);
            this.field1614 = new PixMap(500, 496, this.method11(19330), 50);
            this.field1615 = new PixMap(500, 269, this.method11(19330), 37);
            this.field1616 = new PixMap(500, 249, this.method11(19330), 45);
            this.field1486 = true;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method503(int arg0) {
        try {
            if (this.field1576 != null) {
                this.field1576.method38();
            }
        } catch (Exception var3) {
        }
        this.field1576 = null;
        if (field1670 == arg0) {
            this.field1450 = false;
            this.field1458 = 0;
            this.field1314 = "";
            this.field1315 = "";
            this.method480(0);
            this.field1501.method50((byte) 7);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1291[var2].method359(3);
            }
            System.gc();
            this.method562(0);
            this.field1246 = -1;
            this.field1331 = -1;
            this.field1425 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        if (this.field1306 != 0) {
            PixFont var2 = this.field1280;
            if (arg0) {
                this.field1411 = -454;
            }
            int var3 = 0;
            if (this.field1658 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1261[var4] != null) {
                    int var5 = this.field1259[var4];
                    String var6 = this.field1260[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1664 == 0 || this.field1664 == 1 && this.method514(false, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method206(var8, "From", 0, -56, var9);
                        var2.method206(var8 - 1, "From", 65535, -56, var9);
                        int var10 = var9 + var2.method204("From ", (byte) 86);
                        if (var7 == 1) {
                            this.field1401[0].method199(var10, true, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1401[1].method199(var10, true, var8 - 12);
                            var10 += 14;
                        }
                        var2.method206(var8, var6 + ": " + this.field1261[var4], 0, -56, var10);
                        var2.method206(var8 - 1, var6 + ": " + this.field1261[var4], 65535, -56, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1664 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method206(var11, this.field1261[var4], 0, -56, 4);
                        var2.method206(var11 - 1, this.field1261[var4], 65535, -56, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1664 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method206(var12, "To " + var6 + ": " + this.field1261[var4], 0, -56, 4);
                        var2.method206(var12 - 1, "To " + var6 + ": " + this.field1261[var4], 65535, -56, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method505(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != 8) {
            field1553 = -482;
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

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method506(int arg0) {
        if (this.field1483 >= 2 || this.field1420 != 0 || this.field1472 != 0) {
            String var2;
            if (this.field1420 == 1 && this.field1483 < 2) {
                var2 = "Use " + this.field1424 + " with...";
            } else if (this.field1472 == 1 && this.field1483 < 2) {
                var2 = this.field1475 + "...";
            } else {
                var2 = this.field1580[this.field1483 - 1];
            }
            if (this.field1483 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1483 - 2) + " more options";
            }
            this.field1281.method211(var2, field1311 / 1000, (byte) 5, 15, true, 16777215, 4);
            while (arg0 >= 0) {
                this.field1312 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method507(boolean arg0, boolean arg1) {
        if (arg0) {
            field1449 = true;
        }
        this.method482(0);
        this.field1507.method258(6745);
        this.field1684.method199(0, true, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1458 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1279.method203(var5, (byte) 4, var3 / 2, this.field1679.field840, 7711145, true);
            int var6 = var4 / 2 - 20;
            this.field1281.method203(var6, (byte) 4, var3 / 2, "Welcome to RuneScape", 16776960, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1685.method199(var7 - 73, true, var8 - 20);
            this.field1281.method203(var8 + 5, (byte) 4, var7, "New User", 16777215, true);
            int var9 = var3 / 2 + 80;
            this.field1685.method199(var9 - 73, true, var8 - 20);
            this.field1281.method203(var8 + 5, (byte) 4, var9, "Existing User", 16777215, true);
        }
        if (this.field1458 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1520.length() > 0) {
                this.field1281.method203(var10 - 15, (byte) 4, var3 / 2, this.field1520, 16776960, true);
                this.field1281.method203(var10, (byte) 4, var3 / 2, this.field1521, 16776960, true);
                var10 += 30;
            } else {
                this.field1281.method203(var10 - 7, (byte) 4, var3 / 2, this.field1521, 16776960, true);
                var10 += 30;
            }
            this.field1281.method210("Username: " + this.field1314 + (this.field1640 == 0 & field1311 % 40 < 20 ? "@yel@|" : ""), (byte) 5, 16777215, var10, true, var3 / 2 - 90);
            var10 += 15;
            this.field1281.method210("Password: " + JString.method305(this.field1315, -107) + (this.field1640 == 1 & field1311 % 40 < 20 ? "@yel@|" : ""), (byte) 5, 16777215, var10, true, var3 / 2 - 88);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1685.method199(var11 - 73, true, var12 - 20);
                this.field1281.method203(var12 + 5, (byte) 4, var11, "Login", 16777215, true);
                int var13 = var3 / 2 + 80;
                this.field1685.method199(var13 - 73, true, var12 - 20);
                this.field1281.method203(var12 + 5, (byte) 4, var13, "Cancel", 16777215, true);
            }
        }
        if (this.field1458 == 3) {
            this.field1281.method203(var4 / 2 - 60, (byte) 4, var3 / 2, "Create a free account", 16776960, true);
            int var14 = var4 / 2 - 35;
            this.field1281.method203(var14, (byte) 4, var3 / 2, "To create a new account you need to", 16777215, true);
            int var18 = var14 + 15;
            this.field1281.method203(var18, (byte) 4, var3 / 2, "go back to the main RuneScape webpage", 16777215, true);
            int var19 = var18 + 15;
            this.field1281.method203(var19, (byte) 4, var3 / 2, "and choose the red 'create account'", 16777215, true);
            int var20 = var19 + 15;
            this.field1281.method203(var20, (byte) 4, var3 / 2, "button at the top right of that page.", 16777215, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1685.method199(var15 - 73, true, var16 - 20);
            this.field1281.method203(var16 + 5, (byte) 4, var15, "Cancel", 16777215, true);
        }
        this.field1507.method259(202, 171, super.field15, this.field1411);
        if (this.field1486) {
            this.field1486 = false;
            this.field1505.method259(128, 0, super.field15, this.field1411);
            this.field1506.method259(202, 371, super.field15, this.field1411);
            this.field1510.method259(0, 265, super.field15, this.field1411);
            this.field1511.method259(562, 265, super.field15, this.field1411);
            this.field1512.method259(128, 171, super.field15, this.field1411);
            this.field1513.method259(562, 171, super.field15, this.field1411);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method508(byte arg0) {
        if (this.field1420 == 0 && this.field1472 == 0) {
            this.field1580[this.field1483] = "Walk here";
            this.field1470[this.field1483] = 718;
            this.field1468[this.field1483] = super.field23;
            this.field1469[this.field1483] = super.field24;
            ++this.field1483;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field614; ++var3) {
            int var4 = Model.field615[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1501.method80(this.field1542, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method330(var8);
                    if (var9.field994 != null) {
                        var9 = var9.method338(0);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field1420 == 1) {
                        this.field1580[this.field1483] = "Use " + this.field1424 + " with @cya@" + var9.field963;
                        this.field1470[this.field1483] = 810;
                        this.field1471[this.field1483] = var4;
                        this.field1468[this.field1483] = var5;
                        this.field1469[this.field1483] = var6;
                        ++this.field1483;
                    } else if (this.field1472 == 1) {
                        if ((this.field1474 & 4) == 4) {
                            this.field1580[this.field1483] = this.field1475 + " @cya@" + var9.field963;
                            this.field1470[this.field1483] = 899;
                            this.field1471[this.field1483] = var4;
                            this.field1468[this.field1483] = var5;
                            this.field1469[this.field1483] = var6;
                            ++this.field1483;
                        }
                    } else {
                        if (var9.field979 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field979[var10] != null) {
                                    this.field1580[this.field1483] = var9.field979[var10] + " @cya@" + var9.field963;
                                    if (var10 == 0) {
                                        this.field1470[this.field1483] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1470[this.field1483] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1470[this.field1483] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1470[this.field1483] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1470[this.field1483] = 1071;
                                    }
                                    this.field1471[this.field1483] = var4;
                                    this.field1468[this.field1483] = var5;
                                    this.field1469[this.field1483] = var6;
                                    ++this.field1483;
                                }
                            }
                        }
                        this.field1580[this.field1483] = "Examine @cya@" + var9.field963;
                        this.field1470[this.field1483] = 1381;
                        this.field1471[this.field1483] = var9.field960 << 14;
                        this.field1468[this.field1483] = var5;
                        this.field1469[this.field1483] = var6;
                        ++this.field1483;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1350[var8];
                    if (var11.field464.field1018 == 1 && (var11.field406 & 127) == 64 && (var11.field407 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1351; ++var12) {
                            NpcEntity var15 = this.field1350[this.field1352[var12]];
                            if (var15 != null && var11 != var15 && var15.field464.field1018 == 1 && var11.field406 == var15.field406 && var11.field407 == var15.field407) {
                                this.method477(this.field1352[var12], var6, 176, var15.field464, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1251; ++var13) {
                            PlayerEntity var14 = this.field1250[this.field1252[var13]];
                            if (var14 != null && var11.field406 == var14.field406 && var11.field407 == var14.field407) {
                                this.method433(var14, this.field1252[var13], 11712, var6, var5);
                            }
                        }
                    }
                    this.method477(var8, var6, 176, var11.field464, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1250[var8];
                    if ((var16.field406 & 127) == 64 && (var16.field407 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1351; ++var17) {
                            NpcEntity var20 = this.field1350[this.field1352[var17]];
                            if (var20 != null && var20.field464.field1018 == 1 && var16.field406 == var20.field406 && var16.field407 == var20.field407) {
                                this.method477(this.field1352[var17], var6, 176, var20.field464, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1251; ++var18) {
                            PlayerEntity var19 = this.field1250[this.field1252[var18]];
                            if (var19 != null && var16 != var19 && var16.field406 == var19.field406 && var16.field407 == var19.field407) {
                                this.method433(var19, this.field1252[var18], 11712, var6, var5);
                            }
                        }
                    }
                    this.method433(var16, var8, 11712, var6, var5);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1312[this.field1542][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method249(true); var22 != null; var22 = (ObjStackEntity) var21.method251(this.field1533)) {
                            ObjType var23 = ObjType.method348(var22.field512);
                            if (this.field1420 == 1) {
                                this.field1580[this.field1483] = "Use " + this.field1424 + " with @lre@" + var23.field1056;
                                this.field1470[this.field1483] = 111;
                                this.field1471[this.field1483] = var22.field512;
                                this.field1468[this.field1483] = var5;
                                this.field1469[this.field1483] = var6;
                                ++this.field1483;
                            } else if (this.field1472 == 1) {
                                if ((this.field1474 & 1) == 1) {
                                    this.field1580[this.field1483] = this.field1475 + " @lre@" + var23.field1056;
                                    this.field1470[this.field1483] = 370;
                                    this.field1471[this.field1483] = var22.field512;
                                    this.field1468[this.field1483] = var5;
                                    this.field1469[this.field1483] = var6;
                                    ++this.field1483;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1070 != null && var23.field1070[var24] != null) {
                                        this.field1580[this.field1483] = var23.field1070[var24] + " @lre@" + var23.field1056;
                                        if (var24 == 0) {
                                            this.field1470[this.field1483] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1470[this.field1483] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1470[this.field1483] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1470[this.field1483] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1470[this.field1483] = 662;
                                        }
                                        this.field1471[this.field1483] = var22.field512;
                                        this.field1468[this.field1483] = var5;
                                        this.field1469[this.field1483] = var6;
                                        ++this.field1483;
                                    } else if (var24 == 2) {
                                        this.field1580[this.field1483] = "Take @lre@" + var23.field1056;
                                        this.field1470[this.field1483] = 617;
                                        this.field1471[this.field1483] = var22.field512;
                                        this.field1468[this.field1483] = var5;
                                        this.field1469[this.field1483] = var6;
                                        ++this.field1483;
                                    }
                                }
                                this.field1580[this.field1483] = "Examine @lre@" + var23.field1056;
                                this.field1470[this.field1483] = 1152;
                                this.field1471[this.field1483] = var22.field512;
                                this.field1468[this.field1483] = var5;
                                this.field1469[this.field1483] = var6;
                                ++this.field1483;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 6) {
            this.field1383.method219(123);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method509(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1537 >= 100 && this.field1540 != 1) {
                this.method484((byte) -97, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field1537 >= 200) {
                this.method484((byte) -97, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = JString.method304(JString.method301(arg1, this.field1223), -4015);
                if (arg0 == 7) {
                    for (int var5 = 0; var5 < this.field1537; ++var5) {
                        if (this.field1224[var5] == arg1) {
                            this.method484((byte) -97, "", var4 + " is already on your friend list", 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field1608; ++var6) {
                        if (this.field1555[var6] == arg1) {
                            this.method484((byte) -97, "", "Please remove " + var4 + " from your ignore list first", 0);
                            return;
                        }
                    }
                    if (!var4.equals(field1534.field471)) {
                        this.field1532[this.field1537] = var4;
                        this.field1224[this.field1537] = arg1;
                        this.field1439[this.field1537] = 0;
                        ++this.field1537;
                        this.field1605 = true;
                        this.field1383.method218(221, 0);
                        this.field1383.method225(arg1, 359);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method510(int arg0, int arg1) {
        Component var3 = Component.field73[arg0];
        for (int var4 = 0; var4 < var3.field95.length && var3.field95[var4] != -1; ++var4) {
            Component var5 = Component.field73[var3.field95[var4]];
            if (var5.field80 == 1) {
                this.method510(var5.field78, 0);
            }
            var5.field76 = 0;
            var5.field77 = 0;
        }
        if (arg1 != 0) {
            this.field1312 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method511(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1320.length; ++var4) {
            this.field1320[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1320[var18] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 23272) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field1321[var17] = (this.field1320[var17 - 1] + this.field1320[var17 + 1] + this.field1320[var17 - 128] + this.field1320[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field1320;
            this.field1320 = this.field1321;
            this.field1321 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field695; ++var9) {
                for (int var10 = 0; var10 < arg1.field694; ++var10) {
                    if (arg1.field692[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field696;
                        int var12 = var9 + 16 + arg1.field697;
                        int var13 = (var12 << 7) + var11;
                        this.field1320[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method512(int arg0) {
        this.field1231 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1286) {
                ++this.field1287;
                this.method518(-961);
                this.method518(-961);
                this.method499(-527);
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
        this.field1231 = false;
        while (arg0 >= 0) {
            this.field1603 = !this.field1603;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method513(int arg0, int arg1, Packet arg2) {
        if (arg0 == 0) {
            while (arg2.field723 + 21 < arg1 * 8) {
                int var4 = arg2.method240(14, this.field1405);
                if (var4 == 16383) {
                    break;
                }
                if (this.field1350[var4] == null) {
                    this.field1350[var4] = new NpcEntity();
                }
                NpcEntity var5 = this.field1350[var4];
                this.field1352[this.field1351++] = var4;
                var5.field451 = field1311;
                var5.field464 = NpcType.method341(arg2.method240(12, this.field1405));
                var5.field410 = var5.field464.field1018;
                var5.field454 = var5.field464.field1040;
                var5.field413 = var5.field464.field1022;
                var5.field414 = var5.field464.field1023;
                var5.field415 = var5.field464.field1024;
                var5.field416 = var5.field464.field1025;
                var5.field411 = var5.field464.field1021;
                int var6 = arg2.method240(5, this.field1405);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method240(5, this.field1405);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg2.method240(1, this.field1405);
                var5.method110(var8 == 1, 0, field1534.field456[0] + var6, field1534.field457[0] + var7);
                int var9 = arg2.method240(1, this.field1405);
                if (var9 == 1) {
                    this.field1254[this.field1253++] = var4;
                }
            }
            arg2.method241(-22602);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method514(boolean arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1537; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1532[var3])) {
                    return true;
                }
            }
            if (arg0) {
                this.field1619 = this.field1239.method295();
            }
            return arg1.equalsIgnoreCase(field1534.field471);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILd;)V")
    public final void method515(int arg0, int arg1, int arg2, int arg3, Component arg4) {
        if (arg4.field80 == 0 && arg4.field95 != null) {
            if (!arg4.field94 || this.field1645 == arg4.field78 || this.field1419 == arg4.field78 || this.field1489 == arg4.field78) {
                int var6 = Pix2D.field644;
                int var7 = Pix2D.field642;
                int var8 = Pix2D.field645;
                int var9 = Pix2D.field643;
                Pix2D.method154(arg4.field84 + arg0, arg0, -134, arg4.field83 + arg3, arg3);
                int var10 = arg4.field95.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field96[var11] + arg3;
                    int var13 = arg4.field97[var11] + arg0 - arg1;
                    Component var14 = Component.field73[arg4.field95[var11]];
                    int var15 = var14.field86 + var12;
                    int var16 = var14.field87 + var13;
                    if (var14.field82 > 0) {
                        this.method475(true, var14);
                    }
                    if (var14.field80 == 0) {
                        if (var14.field93 > var14.field92 - var14.field84) {
                            var14.field93 = var14.field92 - var14.field84;
                        }
                        if (var14.field93 < 0) {
                            var14.field93 = 0;
                        }
                        this.method515(var16, var14.field93, 1, var15, var14);
                        if (var14.field92 > var14.field84) {
                            this.method453(var14.field92, var14.field84, -143, var14.field83 + var15, var16, var14.field93);
                        }
                    } else if (var14.field80 != 1) {
                        if (var14.field80 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field84; ++var18) {
                                for (int var19 = 0; var19 < var14.field83; ++var19) {
                                    int var20 = (var14.field104 + 32) * var19 + var15;
                                    int var21 = (var14.field105 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field107[var17];
                                        var21 += var14.field108[var17];
                                    }
                                    if (var14.field74[var17] <= 0) {
                                        if (var14.field106 != null && var17 < 20) {
                                            Pix32 var30 = var14.field106[var17];
                                            if (var30 != null) {
                                                var30.method186(var20, true, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field74[var17] - 1;
                                        if (var20 > Pix2D.field644 - 32 && var20 < Pix2D.field645 && var21 > Pix2D.field642 - 32 && var21 < Pix2D.field643 || this.field1494 != 0 && this.field1493 == var17) {
                                            int var25 = 0;
                                            if (this.field1420 == 1 && this.field1421 == var17 && this.field1422 == var14.field78) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(var14.field75[var17], var24, (byte) 117, var25);
                                            if (var26 != null) {
                                                if (this.field1494 != 0 && this.field1493 == var17 && this.field1492 == var14.field78) {
                                                    var22 = super.field23 - this.field1495;
                                                    var23 = super.field24 - this.field1496;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1602 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method188(var20 + var22, 128, var21 + var23, (byte) 6);
                                                    if (var21 + var23 < Pix2D.field642 && arg4.field93 > 0) {
                                                        int var27 = (Pix2D.field642 - var21 - var23) * this.field1490 / 3;
                                                        if (var27 > this.field1490 * 10) {
                                                            var27 = this.field1490 * 10;
                                                        }
                                                        if (var27 > arg4.field93) {
                                                            var27 = arg4.field93;
                                                        }
                                                        arg4.field93 -= var27;
                                                        this.field1496 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field643 && arg4.field93 < arg4.field92 - arg4.field84) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field643) * this.field1490 / 3;
                                                        if (var28 > this.field1490 * 10) {
                                                            var28 = this.field1490 * 10;
                                                        }
                                                        if (var28 > arg4.field92 - arg4.field84 - arg4.field93) {
                                                            var28 = arg4.field92 - arg4.field84 - arg4.field93;
                                                        }
                                                        arg4.field93 += var28;
                                                        this.field1496 -= var28;
                                                    }
                                                } else if (this.field1438 != 0 && this.field1437 == var17 && this.field1436 == var14.field78) {
                                                    var26.method188(var20, 128, var21, (byte) 6);
                                                } else {
                                                    var26.method186(var20, true, var21);
                                                }
                                                if (var26.field686 == 33 || var14.field75[var17] != 1) {
                                                    int var29 = var14.field75[var17];
                                                    this.field1279.method206(var21 + 10 + var23, method559(var29, this.field1226), 0, -56, var20 + 1 + var22);
                                                    this.field1279.method206(var21 + 9 + var23, method559(var29, this.field1226), 16776960, -56, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field80 == 3) {
                            boolean var31 = false;
                            if (this.field1489 == var14.field78 || this.field1419 == var14.field78 || this.field1645 == var14.field78) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method479(0, var14)) {
                                var32 = var14.field117;
                                if (var31 && var14.field119 != 0) {
                                    var32 = var14.field119;
                                }
                            } else {
                                var32 = var14.field116;
                                if (var31 && var14.field118 != 0) {
                                    var32 = var14.field118;
                                }
                            }
                            if (var14.field85 == 0) {
                                if (var14.field110) {
                                    Pix2D.method157(var32, var16, var14.field84, -917, var15, var14.field83);
                                } else {
                                    Pix2D.method158(var32, -393, var14.field83, var14.field84, var15, var16);
                                }
                            } else if (var14.field110) {
                                Pix2D.method156(var14.field83, var16, 256 - (var14.field85 & 255), false, var32, var15, var14.field84);
                            } else {
                                Pix2D.method159(256 - (var14.field85 & 255), this.field1620, var14.field84, var14.field83, var32, var15, var16);
                            }
                        } else if (var14.field80 == 4) {
                            PixFont var33 = var14.field113;
                            String var34 = var14.field114;
                            boolean var35 = false;
                            if (this.field1489 == var14.field78 || this.field1419 == var14.field78 || this.field1645 == var14.field78) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method479(0, var14)) {
                                var36 = var14.field117;
                                if (var35 && var14.field119 != 0) {
                                    var36 = var14.field119;
                                }
                                if (var14.field115.length() > 0) {
                                    var34 = var14.field115;
                                }
                            } else {
                                var36 = var14.field116;
                                if (var35 && var14.field118 != 0) {
                                    var36 = var14.field118;
                                }
                            }
                            if (var14.field81 == 6 && this.field1654) {
                                var34 = "Please wait...";
                                var36 = var14.field116;
                            }
                            if (Pix2D.field640 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field711 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method476(this.method469((byte) 96, 4, var14), (byte) 48) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method476(this.method469((byte) 96, 3, var14), (byte) 48) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method476(this.method469((byte) 96, 2, var14), (byte) 48) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method476(this.method469((byte) 96, 1, var14), (byte) 48) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method476(this.method469((byte) 96, 0, var14), (byte) 48) + var34.substring(var38 + 2);
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
                                if (var14.field111) {
                                    var33.method203(var37, (byte) 4, var14.field83 / 2 + var15, var44, var36, var14.field112);
                                } else {
                                    var33.method210(var44, (byte) 5, var36, var37, var14.field112, var15);
                                }
                                var37 += var33.field711;
                            }
                        } else if (var14.field80 == 5) {
                            Pix32 var45;
                            if (this.method479(0, var14)) {
                                var45 = var14.field121;
                            } else {
                                var45 = var14.field120;
                            }
                            if (var45 != null) {
                                var45.method186(var15, true, var16);
                            }
                        } else if (var14.field80 == 6) {
                            int var46 = Pix3D.field659;
                            int var47 = Pix3D.field660;
                            Pix3D.field659 = var14.field83 / 2 + var15;
                            Pix3D.field660 = var14.field84 / 2 + var16;
                            int var48 = Pix3D.field663[var14.field129] * var14.field128 >> 16;
                            int var49 = Pix3D.field664[var14.field129] * var14.field128 >> 16;
                            boolean var50 = this.method479(0, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field127;
                            } else {
                                var51 = var14.field126;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, -1, false, var50);
                            } else {
                                SeqType var53 = SeqType.field1145[var51];
                                var52 = var14.method34(var53.field1147[var14.field76], var53.field1148[var14.field76], false, var50);
                            }
                            if (var52 != null) {
                                var52.method146(0, var14.field130, 0, var14.field129, 0, var48, var49);
                            }
                            Pix3D.field659 = var46;
                            Pix3D.field660 = var47;
                        } else if (var14.field80 == 7) {
                            PixFont var54 = var14.field113;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field84; ++var56) {
                                for (int var57 = 0; var57 < var14.field83; ++var57) {
                                    if (var14.field74[var55] > 0) {
                                        ObjType var58 = ObjType.method348(var14.field74[var55] - 1);
                                        String var59 = var58.field1056;
                                        if (var58.field1067 || var14.field75[var55] != 1) {
                                            var59 = var59 + " x" + method505(8, var14.field75[var55]);
                                        }
                                        int var60 = (var14.field104 + 115) * var57 + var15;
                                        int var61 = (var14.field105 + 12) * var56 + var16;
                                        if (var14.field111) {
                                            var54.method203(var61, (byte) 4, var14.field83 / 2 + var60, var59, var14.field116, var14.field112);
                                        } else {
                                            var54.method210(var59, (byte) 5, var14.field116, var61, var14.field112, var60);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method154(var9, var7, -134, var8, var6);
                if (arg2 != 1) {
                    field1553 = 415;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public final boolean method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1477[var15][var35] = 0;
                this.field1402[var15][var35] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg11;
        this.field1477[arg2][arg11] = 99;
        this.field1402[arg2][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1324[var18] = arg2;
        int var36 = var18 + 1;
        this.field1325[var18] = arg11;
        boolean var20 = false;
        int var21 = this.field1324.length;
        int[][] var22 = this.field1291[this.field1542].field1109;
        while (var36 != var19) {
            var16 = this.field1324[var19];
            var17 = this.field1325[var19];
            var19 = (var19 + 1) % var21;
            if (arg1 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field1291[this.field1542].method368(-47208, var17, var16, arg5, arg1, arg0, arg3 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field1291[this.field1542].method369(var16, arg0, arg5, arg1, var17, arg3 - 1, 0)) {
                    var20 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg4 != 0 && this.field1291[this.field1542].method370(arg0, arg6, arg9, arg4, var17, var16, 0, arg1)) {
                var20 = true;
                break;
            }
            int var34 = this.field1402[var16][var17] + 1;
            if (var16 > 0 && this.field1477[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1324[var36] = var16 - 1;
                this.field1325[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 - 1][var17] = 2;
                this.field1402[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1477[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1324[var36] = var16 + 1;
                this.field1325[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 + 1][var17] = 8;
                this.field1402[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1477[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1324[var36] = var16;
                this.field1325[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16][var17 - 1] = 1;
                this.field1402[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1477[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1324[var36] = var16;
                this.field1325[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16][var17 + 1] = 4;
                this.field1402[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1477[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1324[var36] = var16 - 1;
                this.field1325[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 - 1][var17 - 1] = 3;
                this.field1402[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1477[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1324[var36] = var16 + 1;
                this.field1325[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 + 1][var17 - 1] = 9;
                this.field1402[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1477[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1324[var36] = var16 - 1;
                this.field1325[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 - 1][var17 + 1] = 6;
                this.field1402[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1477[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1324[var36] = var16 + 1;
                this.field1325[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1477[var16 + 1][var17 + 1] = 12;
                this.field1402[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1464 = 0;
        if (!var20) {
            if (arg10) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg1 - var24; var25 <= arg1 + var24; ++var25) {
                        for (int var26 = arg0 - var24; var26 <= arg0 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1402[var25][var26] < var23) {
                                var23 = this.field1402[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1464 = 1;
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
        if (arg8 != 4) {
            this.field1312 = null;
        }
        this.field1324[var27] = var16;
        int var37 = var27 + 1;
        this.field1325[var27] = var17;
        int var28;
        int var29 = var28 = this.field1477[var16][var17];
        while (arg2 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1324[var37] = var16;
                this.field1325[var37++] = var17;
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
            var29 = this.field1477[var16][var17];
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
            int var31 = this.field1324[var37];
            int var32 = this.field1325[var37];
            if (arg7 == 0) {
                this.field1383.method218(141, 0);
                this.field1383.method219(var30 + var30 + 3);
            }
            if (arg7 == 1) {
                this.field1383.method218(196, 0);
                this.field1383.method219(var30 + var30 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field1383.method218(70, 0);
                this.field1383.method219(var30 + var30 + 3);
            }
            if (super.field33[5] == 1) {
                this.field1383.method219(1);
            } else {
                this.field1383.method219(0);
            }
            this.field1383.method220(this.field1426 + var31);
            this.field1383.method220(this.field1427 + var32);
            this.field1397 = this.field1324[0];
            this.field1398 = this.field1325[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1383.method219(this.field1324[var37] - var31);
                this.field1383.method219(this.field1325[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method517(int arg0, boolean arg1) {
        if (this.field1516 != arg0) {
            this.field1442 = -1;
        }
        for (int var3 = 0; var3 < this.field1351; ++var3) {
            NpcEntity var4 = this.field1350[this.field1352[var3]];
            int var5 = (this.field1352[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(false) && var4.field464.field1036 == arg1) {
                int var6 = var4.field406 >> 7;
                int var7 = var4.field407 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field410 == 1 && (var4.field406 & 127) == 64 && (var4.field407 & 127) == 64) {
                        if (this.field1556[var6][var7] == this.field1463) {
                            continue;
                        }
                        this.field1556[var6][var7] = this.field1463;
                    }
                    this.field1501.method61(var4.field409, var4.field408, var4.field407, var4.field406, var5, (var4.field410 - 1) * 64 + 60, 0, this.field1542, var4, this.method532(var4.field406, this.field1542, (byte) 8, var4.field407));
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1497 = Integer.parseInt(this.getParameter("nodeid"));
        field1498 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method471((byte) 66);
        } else {
            method452(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1499 = false;
        } else {
            field1499 = true;
        }
        this.method2(765, 503, false);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method518(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1632[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1632[var17] = 192;
        }
        if (arg0 < 0) {
            for (int var5 = 1; var5 < var2 - 1; ++var5) {
                for (int var13 = 1; var13 < 127; ++var13) {
                    int var14 = (var5 << 7) + var13;
                    this.field1633[var14] = (this.field1632[var14 - 1] + this.field1632[var14 + 1] + this.field1632[var14 - 128] + this.field1632[var14 + 128]) / 4;
                }
            }
            this.field1465 += 128;
            if (this.field1465 > this.field1320.length) {
                this.field1465 -= this.field1320.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method511(23272, this.field1225[var6]);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field1633[var11 + 128] - this.field1320[this.field1465 + var11 & this.field1320.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field1632[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field1272[var8] = this.field1272[var8 + 1];
            }
            this.field1272[var2 - 1] = (int) (Math.sin((double) field1311 / 14.0D) * 16.0D + Math.sin((double) field1311 / 15.0D) * 14.0D + Math.sin((double) field1311 / 16.0D) * 12.0D);
            if (this.field1655 > 0) {
                this.field1655 -= 4;
            }
            if (this.field1656 > 0) {
                this.field1656 -= 4;
            }
            if (this.field1655 == 0 && this.field1656 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field1655 = 1024;
                }
                if (var9 == 1) {
                    this.field1656 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method519(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field73[arg1];
        for (int var6 = 0; var6 < var5.field95.length && var5.field95[var6] != -1; ++var6) {
            Component var7 = Component.field73[var5.field95[var6]];
            if (var7.field80 == 1) {
                var4 |= this.method519(arg0, var7.field78, 0);
            }
            if (var7.field80 == 6 && (var7.field126 != -1 || var7.field127 != -1)) {
                boolean var8 = this.method479(0, var7);
                int var9;
                if (var8) {
                    var9 = var7.field127;
                } else {
                    var9 = var7.field126;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1145[var9];
                    var7.field77 += arg0;
                    while (var7.field77 > var10.method382(var7.field76, this.field1384)) {
                        var7.field77 -= var10.method382(var7.field76, this.field1384) + 1;
                        ++var7.field76;
                        if (var7.field76 >= var10.field1146) {
                            var7.field76 -= var10.field1150;
                            if (var7.field76 < 0 || var7.field76 >= var10.field1146) {
                                var7.field76 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 != 0) {
            this.field1619 = -21;
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method520(int arg0) {
        int var2 = 5;
        this.field1404[8] = 0;
        int var3 = 0;
        while (arg0 >= 0) {
            this.method6();
        }
        while (this.field1404[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(20, (byte) -37, "Connecting to web server");
            try {
                DataInputStream var5 = this.method437("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 297);
                Packet var6 = new Packet(-49365, new byte[40]);
                var5.readFully(var6.field721, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1404[var7] = var6.method234();
                }
                int var8 = var6.method234();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1404[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1404[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1404[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1404[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1404[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1404[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(10, (byte) -37, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method13(10, (byte) -37, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field1329 = !this.field1329;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method521(boolean arg0) {
        if (!arg0) {
            this.field1383.method219(30);
        }
        while (true) {
            OnDemandRequest var2 = this.field1679.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field735 == 0) {
                Model.method124(var2.field737, (byte) -125, var2.field736);
                if ((this.field1679.method277(var2.field736, true) & 98) != 0) {
                    this.field1605 = true;
                    if (this.field1265 != -1) {
                        this.field1432 = true;
                    }
                }
            }
            if (var2.field735 == 1 && var2.field737 != null) {
                AnimFrame.method45(var2.field737, (byte) 107);
            }
            if (var2.field735 == 2 && this.field1331 == var2.field736 && var2.field737 != null) {
                this.method524(false, var2.field737, this.field1332);
            }
            if (var2.field735 == 3 && this.field1617 == 1) {
                for (int var3 = 0; var3 < this.field1241.length; ++var3) {
                    if (this.field1530[var3] == var2.field736) {
                        this.field1241[var3] = var2.field737;
                        if (var2.field737 == null) {
                            this.field1530[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1531[var3] == var2.field736) {
                        this.field1577[var3] = var2.field737;
                        if (var2.field737 == null) {
                            this.field1531[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field735 == 93 && this.field1679.method276(28967, var2.field736)) {
                World.method17(new Packet(-49365, var2.field737), this.field1679, -108);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method522(boolean arg0) {
        if (this.field1564 == 2) {
            this.method498((this.field1673 - this.field1426 << 7) + this.field1676, this.field1675 * 2, (this.field1674 - this.field1427 << 7) + this.field1677, 7);
            if (arg0) {
                field1449 = true;
            }
            if (this.field1242 > -1 && field1311 % 20 < 10) {
                this.field1488[2].method186(this.field1242 - 12, true, this.field1243 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method523(boolean arg0) {
        int var2 = this.field1281.method204("Choose Option", (byte) 86);
        for (int var3 = 0; var3 < this.field1483; ++var3) {
            int var11 = this.field1281.method204(this.field1580[var3], (byte) 86);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1483 * 15 + 21;
        if (!arg0) {
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
                this.field1381 = true;
                this.field1586 = 0;
                this.field1587 = var5;
                this.field1588 = var6;
                this.field1589 = var2;
                this.field1590 = this.field1483 * 15 + 22;
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
                this.field1381 = true;
                this.field1586 = 1;
                this.field1587 = var7;
                this.field1588 = var8;
                this.field1589 = var2;
                this.field1590 = this.field1483 * 15 + 22;
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
                this.field1381 = true;
                this.field1586 = 2;
                this.field1587 = var9;
                this.field1588 = var10;
                this.field1589 = var2;
                this.field1590 = this.field1483 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BZ)V")
    public final void method524(boolean arg0, byte[] arg1, boolean arg2) {
        if (arg0) {
            this.field1302 = 460;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;I)V")
    private final void method525(LocSpawned arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field741 == 0) {
            var3 = this.field1501.method76(arg0.field740, arg0.field742, arg0.field743);
        }
        if (arg0.field741 == 1) {
            var3 = this.field1501.method77(arg0.field740, arg0.field742, 939, arg0.field743);
        }
        if (arg0.field741 == 2) {
            var3 = this.field1501.method78(arg0.field740, arg0.field742, arg0.field743);
        }
        if (arg0.field741 == 3) {
            var3 = this.field1501.method79(arg0.field740, arg0.field742, arg0.field743);
        }
        if (var3 != 0) {
            int var7 = this.field1501.method80(arg0.field740, arg0.field742, arg0.field743, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field744 = var4;
        arg0.field746 = var5;
        arg0.field745 = var6;
        if (arg1 != -17769) {
            this.field1619 = -211;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        this.field1441 += arg2;
        for (LocSpawned var12 = (LocSpawned) this.field1559.method248(); var12 != null; var12 = (LocSpawned) this.field1559.method250(true)) {
            if (var12.field740 == arg8 && var12.field742 == arg9 && var12.field743 == arg1 && var12.field741 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field740 = arg8;
            var11.field741 = arg0;
            var11.field742 = arg9;
            var11.field743 = arg1;
            this.method525(var11, -17769);
            this.field1559.method245(var11);
        }
        var11.field747 = arg3;
        var11.field749 = arg7;
        var11.field748 = arg4;
        var11.field750 = arg6;
        var11.field751 = arg5;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method527(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        for (int var2 = -1; var2 < this.field1251; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1249;
            } else {
                var3 = this.field1252[var2];
            }
            PlayerEntity var4 = this.field1250[var3];
            if (var4 != null) {
                this.method442(var4, 1, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method528(int arg0) {
        if (arg0 != 1639) {
            this.field1442 = -1;
        }
        if (super.field29 == 1) {
            if (super.field30 >= 539 && super.field30 <= 573 && super.field31 >= 169 && super.field31 < 205 && this.field1554[0] != -1) {
                this.field1605 = true;
                this.field1433 = 0;
                this.field1400 = true;
            }
            if (super.field30 >= 569 && super.field30 <= 599 && super.field31 >= 168 && super.field31 < 205 && this.field1554[1] != -1) {
                this.field1605 = true;
                this.field1433 = 1;
                this.field1400 = true;
            }
            if (super.field30 >= 597 && super.field30 <= 627 && super.field31 >= 168 && super.field31 < 205 && this.field1554[2] != -1) {
                this.field1605 = true;
                this.field1433 = 2;
                this.field1400 = true;
            }
            if (super.field30 >= 625 && super.field30 <= 669 && super.field31 >= 168 && super.field31 < 203 && this.field1554[3] != -1) {
                this.field1605 = true;
                this.field1433 = 3;
                this.field1400 = true;
            }
            if (super.field30 >= 666 && super.field30 <= 696 && super.field31 >= 168 && super.field31 < 205 && this.field1554[4] != -1) {
                this.field1605 = true;
                this.field1433 = 4;
                this.field1400 = true;
            }
            if (super.field30 >= 694 && super.field30 <= 724 && super.field31 >= 168 && super.field31 < 205 && this.field1554[5] != -1) {
                this.field1605 = true;
                this.field1433 = 5;
                this.field1400 = true;
            }
            if (super.field30 >= 722 && super.field30 <= 756 && super.field31 >= 169 && super.field31 < 205 && this.field1554[6] != -1) {
                this.field1605 = true;
                this.field1433 = 6;
                this.field1400 = true;
            }
            if (super.field30 >= 540 && super.field30 <= 574 && super.field31 >= 466 && super.field31 < 502 && this.field1554[7] != -1) {
                this.field1605 = true;
                this.field1433 = 7;
                this.field1400 = true;
            }
            if (super.field30 >= 572 && super.field30 <= 602 && super.field31 >= 466 && super.field31 < 503 && this.field1554[8] != -1) {
                this.field1605 = true;
                this.field1433 = 8;
                this.field1400 = true;
            }
            if (super.field30 >= 599 && super.field30 <= 629 && super.field31 >= 466 && super.field31 < 503 && this.field1554[9] != -1) {
                this.field1605 = true;
                this.field1433 = 9;
                this.field1400 = true;
            }
            if (super.field30 >= 627 && super.field30 <= 671 && super.field31 >= 467 && super.field31 < 502 && this.field1554[10] != -1) {
                this.field1605 = true;
                this.field1433 = 10;
                this.field1400 = true;
            }
            if (super.field30 >= 669 && super.field30 <= 699 && super.field31 >= 466 && super.field31 < 503 && this.field1554[11] != -1) {
                this.field1605 = true;
                this.field1433 = 11;
                this.field1400 = true;
            }
            if (super.field30 >= 696 && super.field30 <= 726 && super.field31 >= 466 && super.field31 < 503 && this.field1554[12] != -1) {
                this.field1605 = true;
                this.field1433 = 12;
                this.field1400 = true;
            }
            if (super.field30 >= 724 && super.field30 <= 758 && super.field31 >= 466 && super.field31 < 502 && this.field1554[13] != -1) {
                this.field1605 = true;
                this.field1433 = 13;
                this.field1400 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;II)Lxb;")
    public final Jagfile method529(boolean arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        if (!arg0) {
            this.field1383.method219(148);
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1262[0] != null) {
                var7 = this.field1262[0].method291(arg1, false);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1323.reset();
            this.field1323.update(var7);
            int var9 = (int) this.field1323.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(false, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(arg4, (byte) -37, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method437(arg2 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(-49365, var16);
                    var17.field722 = 3;
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
                            this.method13(arg4, (byte) -37, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1262[0] != null) {
                            this.field1262[0].method292(arg1, (byte) 9, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field1262[0] = null;
                    }
                    if (var7 != null) {
                        this.field1323.reset();
                        this.field1323.update(var7);
                        int var24 = (int) this.field1323.getValue();
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
                            this.method13(arg4, (byte) -37, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(arg4, (byte) -37, var12 + " - Retrying in " + var26);
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
                    this.field1329 = !this.field1329;
                }
            }
            return new Jagfile(false, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IZ)V")
    private final void method530(Packet arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1375 = -64;
        }
        while (arg0.field723 + 10 < arg1 * 8) {
            int var4 = arg0.method240(11, this.field1405);
            if (var4 == 2047) {
                break;
            }
            if (this.field1250[var4] == null) {
                this.field1250[var4] = new PlayerEntity();
                if (this.field1255[var4] != null) {
                    this.field1250[var4].method116(this.field1255[var4], (byte) 50);
                }
            }
            this.field1252[this.field1251++] = var4;
            PlayerEntity var5 = this.field1250[var4];
            var5.field451 = field1311;
            int var6 = arg0.method240(5, this.field1405);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method240(5, this.field1405);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method240(1, this.field1405);
            var5.method110(var8 == 1, 0, field1534.field456[0] + var6, field1534.field457[0] + var7);
            int var9 = arg0.method240(1, this.field1405);
            if (var9 == 1) {
                this.field1254[this.field1253++] = var4;
            }
        }
        arg0.method241(-22602);
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method531(int arg0) {
        if (arg0 != 17250) {
            field1449 = true;
        }
        if (this.field1548 == 0) {
            if (super.field29 == 1) {
                int var2 = super.field30 - 25 - 550;
                int var3 = super.field31 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1629 + this.field1527 & 2047;
                    int var5 = Pix3D.field663[var4];
                    int var6 = Pix3D.field664[var4];
                    int var7 = (this.field1292 + 256) * var5 >> 8;
                    int var8 = (this.field1292 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1534.field406 + var9 >> 7;
                    int var12 = field1534.field407 - var10 >> 7;
                    boolean var13 = this.method516(var12, var11, field1534.field456[0], 0, 0, 0, 0, 1, 4, 0, true, field1534.field457[0]);
                    if (var13) {
                        this.field1383.method219(var2);
                        this.field1383.method219(var3);
                        this.field1383.method220(this.field1629);
                        this.field1383.method219(57);
                        this.field1383.method219(this.field1527);
                        this.field1383.method219(this.field1292);
                        this.field1383.method219(89);
                        this.field1383.method220(field1534.field406);
                        this.field1383.method220(field1534.field407);
                        this.field1383.method219(this.field1464);
                        this.field1383.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method532(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field1307[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field1584[var7][var5][var6] + this.field1584[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1584[var7][var5][var6 + 1] + this.field1584[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg2 != 8) {
                this.field1643 = !this.field1643;
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method533(int arg0) {
        int var2 = 9 / arg0;
        this.field1340 = 0;
        for (int var3 = -1; var3 < this.field1351 + this.field1251; ++var3) {
            PathingEntity var20;
            if (var3 == -1) {
                var20 = field1534;
            } else if (var3 < this.field1251) {
                var20 = this.field1250[this.field1252[var3]];
            } else {
                var20 = this.field1350[this.field1352[var3 - this.field1251]];
            }
            if (var20 != null && var20.method113(false)) {
                if (var20 instanceof NpcEntity) {
                    NpcType var21 = ((NpcEntity) var20).field464;
                    if (var21.field1041 != null) {
                        var21 = var21.method345(930);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field1251) {
                    NpcType var25 = ((NpcEntity) var20).field464;
                    if (var25.field1039 >= 0 && var25.field1039 < this.field1488.length) {
                        this.method497(var20.field452 + 15, (byte) 122, var20);
                        if (this.field1242 > -1) {
                            this.field1488[var25.field1039].method186(this.field1242 - 12, true, this.field1243 - 30);
                        }
                    }
                    if (this.field1564 == 1 && this.field1352[var3 - this.field1251] == this.field1430 && field1311 % 20 < 10) {
                        this.method497(var20.field452 + 15, (byte) 122, var20);
                        if (this.field1242 > -1) {
                            this.field1488[2].method186(this.field1242 - 12, true, this.field1243 - 28);
                        }
                    }
                } else {
                    int var22 = 30;
                    PlayerEntity var23 = (PlayerEntity) var20;
                    if (var23.field474 != 0) {
                        this.method497(var20.field452 + 15, (byte) 122, var20);
                        if (this.field1242 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field474 & 1 << var24) != 0) {
                                    this.field1488[var24].method186(this.field1242 - 12, true, this.field1243 - var22);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field1564 == 10 && this.field1252[var3] == this.field1609) {
                        this.method497(var20.field452 + 15, (byte) 122, var20);
                        if (this.field1242 > -1) {
                            this.field1488[7].method186(this.field1242 - 12, true, this.field1243 - var22);
                        }
                    }
                }
                if (var20.field418 != null && (var3 >= this.field1251 || this.field1300 == 0 || this.field1300 == 3 || this.field1300 == 1 && this.method514(false, ((PlayerEntity) var20).field471))) {
                    this.method497(var20.field452, (byte) 122, var20);
                    if (this.field1242 > -1 && this.field1340 < this.field1341) {
                        this.field1345[this.field1340] = this.field1281.method205(var20.field418, (byte) -73) / 2;
                        this.field1344[this.field1340] = this.field1281.field711;
                        this.field1342[this.field1340] = this.field1242;
                        this.field1343[this.field1340] = this.field1243;
                        this.field1346[this.field1340] = var20.field420;
                        this.field1347[this.field1340] = var20.field421;
                        this.field1348[this.field1340] = var20.field419;
                        this.field1349[this.field1340++] = var20.field418;
                        if (this.field1623 == 0 && var20.field421 >= 1 && var20.field421 <= 3) {
                            this.field1344[this.field1340] += 10;
                            this.field1343[this.field1340] += 5;
                        }
                        if (this.field1623 == 0 && var20.field421 == 4) {
                            this.field1345[this.field1340] = 60;
                        }
                        if (this.field1623 == 0 && var20.field421 == 5) {
                            this.field1344[this.field1340] += 5;
                        }
                    }
                }
                if (var20.field425 > field1311) {
                    this.method497(var20.field452 + 15, (byte) 122, var20);
                    if (this.field1242 > -1) {
                        int var26 = var20.field426 * 30 / var20.field427;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        Pix2D.method157(65280, this.field1243 - 3, 5, -917, this.field1242 - 15, var26);
                        Pix2D.method157(16711680, this.field1243 - 3, 5, -917, this.field1242 - 15 + var26, 30 - var26);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field424[var27] > field1311) {
                        this.method497(var20.field452 / 2, (byte) 122, var20);
                        if (this.field1242 > -1) {
                            if (var27 == 1) {
                                this.field1243 -= 20;
                            }
                            if (var27 == 2) {
                                this.field1242 -= 15;
                                this.field1243 -= 10;
                            }
                            if (var27 == 3) {
                                this.field1242 += 15;
                                this.field1243 -= 10;
                            }
                            this.field1309[var20.field423[var27]].method186(this.field1242 - 12, true, this.field1243 - 12);
                            this.field1279.method202(String.valueOf(var20.field422[var27]), false, 0, this.field1242, this.field1243 + 4);
                            this.field1279.method202(String.valueOf(var20.field422[var27]), false, 16777215, this.field1242 - 1, this.field1243 + 3);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field1340; ++var4) {
            int var5 = this.field1342[var4];
            int var6 = this.field1343[var4];
            int var7 = this.field1345[var4];
            int var8 = this.field1344[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field1343[var19] - this.field1344[var19] && var6 - var8 < this.field1343[var19] + 2 && var5 - var7 < this.field1345[var19] + this.field1342[var19] && var5 + var7 > this.field1342[var19] - this.field1345[var19] && this.field1343[var19] - this.field1344[var19] < var6) {
                        var6 = this.field1343[var19] - this.field1344[var19];
                        var9 = true;
                    }
                }
            }
            this.field1242 = this.field1342[var4];
            this.field1243 = this.field1343[var4] = var6;
            String var10 = this.field1349[var4];
            if (this.field1623 == 0) {
                int var11 = 16776960;
                if (this.field1346[var4] < 6) {
                    var11 = this.field1575[this.field1346[var4]];
                }
                if (this.field1346[var4] == 6) {
                    var11 = this.field1463 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1346[var4] == 7) {
                    var11 = this.field1463 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1346[var4] == 8) {
                    var11 = this.field1463 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1346[var4] == 9) {
                    int var12 = 150 - this.field1348[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1346[var4] == 10) {
                    int var13 = 150 - this.field1348[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1346[var4] == 11) {
                    int var14 = 150 - this.field1348[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1347[var4] == 0) {
                    this.field1281.method202(var10, false, 0, this.field1242, this.field1243 + 1);
                    this.field1281.method202(var10, false, var11, this.field1242, this.field1243);
                }
                if (this.field1347[var4] == 1) {
                    this.field1281.method207(var10, this.field1243 + 1, this.field1242, this.field1463, false, 0);
                    this.field1281.method207(var10, this.field1243, this.field1242, this.field1463, false, var11);
                }
                if (this.field1347[var4] == 2) {
                    this.field1281.method208(39024, var10, 0, this.field1463, this.field1243 + 1, this.field1242);
                    this.field1281.method208(39024, var10, var11, this.field1463, this.field1243, this.field1242);
                }
                if (this.field1347[var4] == 3) {
                    this.field1281.method209(0, false, this.field1242, var10, this.field1243 + 1, this.field1463, 150 - this.field1348[var4]);
                    this.field1281.method209(var11, false, this.field1242, var10, this.field1243, this.field1463, 150 - this.field1348[var4]);
                }
                if (this.field1347[var4] == 4) {
                    int var15 = this.field1281.method205(var10, (byte) -73);
                    int var16 = (150 - this.field1348[var4]) * (var15 + 100) / 150;
                    Pix2D.method154(334, 0, -134, this.field1242 + 50, this.field1242 - 50);
                    this.field1281.method206(this.field1243 + 1, var10, 0, -56, this.field1242 + 50 - var16);
                    this.field1281.method206(this.field1243, var10, var11, -56, this.field1242 + 50 - var16);
                    Pix2D.method153(false);
                }
                if (this.field1347[var4] == 5) {
                    int var17 = 150 - this.field1348[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    Pix2D.method154(this.field1243 + 5, this.field1243 - this.field1281.field711 - 1, -134, 512, 0);
                    this.field1281.method202(var10, false, 0, this.field1242, this.field1243 + 1 + var18);
                    this.field1281.method202(var10, false, var11, this.field1242, this.field1243 + var18);
                    Pix2D.method153(false);
                }
            } else {
                this.field1281.method202(var10, false, 0, this.field1242, this.field1243 + 1);
                this.field1281.method202(var10, false, 16776960, this.field1242, this.field1243);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILib;I)V")
    public final void method534(int arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (arg3 == 6) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field1629 + this.field1527 & 2047;
                int var7 = Model.field616[var6];
                int var8 = Model.field617[var6];
                int var9 = var7 * 256 / (this.field1292 + 256);
                int var10 = var8 * 256 / (this.field1292 + 256);
                int var11 = arg0 * var10 + arg1 * var9 >> 16;
                int var12 = arg1 * var10 - arg0 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field1638.method191(20, 15, 20, 15, 256, var15 + 94 + 4 - 10, var13, 0, 83 - var16 - 20);
            } else {
                this.method431(true, arg2, arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLlb;)V")
    private final void method535(int arg0, boolean arg1, Packet arg2) {
        int var4 = arg2.method240(8, this.field1405);
        if (var4 < this.field1251) {
            for (int var5 = var4; var5 < this.field1251; ++var5) {
                this.field1355[this.field1354++] = this.field1252[var5];
            }
        }
        if (var4 > this.field1251) {
            signlink.reporterror(this.field1314 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1251 = 0;
            if (!arg1) {
                this.method6();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1252[var6];
                PlayerEntity var8 = this.field1250[var7];
                int var9 = arg2.method240(1, this.field1405);
                if (var9 == 0) {
                    this.field1252[this.field1251++] = var7;
                    var8.field451 = field1311;
                } else {
                    int var10 = arg2.method240(2, this.field1405);
                    if (var10 == 0) {
                        this.field1252[this.field1251++] = var7;
                        var8.field451 = field1311;
                        this.field1254[this.field1253++] = var7;
                    } else if (var10 == 1) {
                        this.field1252[this.field1251++] = var7;
                        var8.field451 = field1311;
                        int var11 = arg2.method240(3, this.field1405);
                        var8.method111(false, false, var11);
                        int var12 = arg2.method240(1, this.field1405);
                        if (var12 == 1) {
                            this.field1254[this.field1253++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1252[this.field1251++] = var7;
                        var8.field451 = field1311;
                        int var13 = arg2.method240(3, this.field1405);
                        var8.method111(true, false, var13);
                        int var14 = arg2.method240(3, this.field1405);
                        var8.method111(true, false, var14);
                        int var15 = arg2.method240(1, this.field1405);
                        if (var15 == 1) {
                            this.field1254[this.field1253++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1355[this.field1354++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1501.method80(this.field1542, arg4, arg3, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1414;
            if (field1414 > 1086) {
                field1414 = 0;
                this.field1383.method218(170, 0);
                this.field1383.method219(0);
                int var10 = this.field1383.field722;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1383.method220(16791);
                }
                this.field1383.method219(254);
                this.field1383.method220((int) (Math.random() * 65536.0D));
                this.field1383.method220(16128);
                this.field1383.method220(52610);
                this.field1383.method220((int) (Math.random() * 65536.0D));
                this.field1383.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1383.method220(35025);
                }
                this.field1383.method220(46628);
                this.field1383.method219((int) (Math.random() * 256.0D));
                this.field1383.method228(this.field1383.field722 - var10, -486);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method516(arg3, arg4, field1534.field456[0], var8 + 1, 0, var9, 0, 2, 4, 0, false, field1534.field457[0]);
            } else {
                LocType var11 = LocType.method330(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field968;
                    var13 = var11.field967;
                } else {
                    var12 = var11.field967;
                    var13 = var11.field968;
                }
                int var14 = var11.field990;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method516(arg3, arg4, field1534.field456[0], 0, var13, 0, var14, 2, 4, var12, false, field1534.field457[0]);
            }
            this.field1522 = super.field30;
            this.field1523 = super.field31;
            this.field1525 = 2;
            this.field1524 = 0;
            this.field1383.method218(arg2, 0);
            this.field1383.method220(this.field1426 + arg4);
            this.field1383.method220(this.field1427 + arg3);
            if (arg1 != 0) {
                this.field1619 = this.field1239.method295();
            }
            this.field1383.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    private final void method537(boolean arg0) {
        if (arg0) {
            if (this.field1617 == 2) {
                for (LocSpawned var2 = (LocSpawned) this.field1559.method248(); var2 != null; var2 = (LocSpawned) this.field1559.method250(true)) {
                    if (var2.field751 > 0) {
                        --var2.field751;
                    }
                    if (var2.field751 == 0) {
                        if (var2.field744 < 0 || World.method30((byte) 6, var2.field746, var2.field744)) {
                            this.method459(var2.field741, var2.field746, var2.field744, var2.field740, var2.field742, false, var2.field745, var2.field743);
                            var2.method106();
                        }
                    } else {
                        if (var2.field750 > 0) {
                            --var2.field750;
                        }
                        if (var2.field750 == 0 && var2.field742 >= 1 && var2.field743 >= 1 && var2.field742 <= 102 && var2.field743 <= 102 && (var2.field747 < 0 || World.method30((byte) 6, var2.field749, var2.field747))) {
                            this.method459(var2.field741, var2.field749, var2.field747, var2.field740, var2.field742, false, var2.field748, var2.field743);
                            var2.field750 = -1;
                            if (var2.field747 == var2.field744 && var2.field744 == -1) {
                                var2.method106();
                            } else if (var2.field747 == var2.field744 && var2.field748 == var2.field745 && var2.field749 == var2.field746) {
                                var2.method106();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method538(boolean arg0) {
        ++this.field1463;
        this.method487(true, (byte) 58);
        this.method517(-38693, true);
        this.method487(false, (byte) 58);
        this.method517(-38693, false);
        this.method455(-4798);
        this.method490(false);
        if (!this.field1264) {
            int var2 = this.field1628;
            if (this.field1662 / 256 > var2) {
                var2 = this.field1662 / 256;
            }
            if (this.field1642[4] && this.field1618[4] + 128 > var2) {
                var2 = this.field1618[4] + 128;
            }
            int var3 = this.field1629 + this.field1560 & 2047;
            this.method450(this.method532(field1534.field406, this.field1542, (byte) 8, field1534.field407) - 50, var2 * 3 + 600, var2, var3, this.field1566, -177, this.field1565);
        }
        int var4;
        if (!this.field1264) {
            var4 = this.method544(0);
        } else {
            var4 = this.method545(0);
        }
        int var5 = this.field1385;
        int var6 = this.field1386;
        int var7 = this.field1387;
        int var8 = this.field1388;
        int var9 = this.field1389;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1642[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1570[var10] * 2 + 1) - (double) this.field1570[var10] + Math.sin((double) this.field1416[var10] / 100.0D * (double) this.field1562[var10]) * (double) this.field1618[var10]);
                if (var10 == 0) {
                    this.field1385 += var12;
                }
                if (var10 == 1) {
                    this.field1386 += var12;
                }
                if (var10 == 2) {
                    this.field1387 += var12;
                }
                if (var10 == 3) {
                    this.field1389 = this.field1389 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1388 += var12;
                    if (this.field1388 < 128) {
                        this.field1388 = 128;
                    }
                    if (this.field1388 > 383) {
                        this.field1388 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field674;
        Model.field611 = true;
        Model.field614 = 0;
        Model.field612 = super.field23 - 4;
        Model.field613 = super.field24 - 4;
        Pix2D.method155(true);
        this.field1501.method89(false, this.field1386, this.field1388, this.field1387, this.field1389, this.field1385, var4);
        this.field1501.method64(-32698);
        this.method533(164);
        this.method522(false);
        this.method552(var11, true);
        this.method549((byte) 8);
        this.field1461.method259(4, 4, super.field15, this.field1411);
        this.field1385 = var5;
        this.field1386 = var6;
        this.field1387 = var7;
        if (!arg0) {
            this.field1388 = var8;
            this.field1389 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIII)V")
    public final void method539(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1501.method76(arg4, arg1, arg5);
        if (this.field1572 != arg0) {
            this.field1635 = !this.field1635;
        }
        if (var7 != 0) {
            int var8 = this.field1501.method80(arg4, arg1, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field1399.field681;
            int var13 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field981 != -1) {
                Pix8 var16 = this.field1479[var15.field981];
                if (var16 != null) {
                    int var17 = (var15.field967 * 4 - var16.field694) / 2;
                    int var18 = (var15.field968 * 4 - var16.field695) / 2;
                    var16.method199(arg1 * 4 + 48 + var17, true, (104 - arg5 - var15.field968) * 4 + 48 + var18);
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
        int var19 = this.field1501.method78(arg4, arg1, arg5);
        if (var19 != 0) {
            int var20 = this.field1501.method80(arg4, arg1, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field981 != -1) {
                Pix8 var25 = this.field1479[var24.field981];
                if (var25 != null) {
                    int var26 = (var24.field967 * 4 - var25.field694) / 2;
                    int var27 = (var24.field968 * 4 - var25.field695) / 2;
                    var25.method199(arg1 * 4 + 48 + var26, true, (104 - arg5 - var24.field968) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1399.field681;
                int var30 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field1501.method79(arg4, arg1, arg5);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field981 != -1) {
                Pix8 var34 = this.field1479[var33.field981];
                if (var34 != null) {
                    int var35 = (var33.field967 * 4 - var34.field694) / 2;
                    int var36 = (var33.field968 * 4 - var34.field695) / 2;
                    var34.method199(arg1 * 4 + 48 + var35, true, (104 - arg5 - var33.field968) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    private final void method540(int arg0) {
        if (arg0 <= 0) {
            this.field1223 = -19;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1559.method248(); var2 != null; var2 = (LocSpawned) this.field1559.method250(true)) {
            if (var2.field751 == -1) {
                var2.field750 = 0;
                this.method525(var2, -17769);
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(Z)V")
    public final void method541(boolean arg0) {
        for (int var2 = 0; var2 < this.field1650; ++var2) {
            if (this.field1310[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1266[var2] == this.field1515 && this.field1636[var2] == this.field1639) {
                        if (!this.method558(484)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319((byte) 2, this.field1636[var2], this.field1266[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field722 / 22) > (long) (this.field1245 / 22) + this.field1288) {
                            this.field1245 = var4.field722;
                            this.field1288 = System.currentTimeMillis();
                            if (this.method550(this.field1482, var4.field722, var4.field721)) {
                                this.field1515 = this.field1266[var2];
                                this.field1639 = this.field1636[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1310[var2] != -5) {
                    this.field1310[var2] = -5;
                } else {
                    --this.field1650;
                    for (int var6 = var2; var6 < this.field1650; ++var6) {
                        this.field1266[var6] = this.field1266[var6 + 1];
                        this.field1636[var6] = this.field1636[var6 + 1];
                        this.field1310[var6] = this.field1310[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1310[var2]--;
            }
        }
        if (arg0) {
            if (this.field1425 > 0) {
                this.field1425 -= 20;
                if (this.field1425 < 0) {
                    this.field1425 = 0;
                }
                if (this.field1425 == 0 && this.field1276 && !field1500) {
                    this.field1331 = this.field1246;
                    this.field1332 = true;
                    this.field1679.method279(2, this.field1331);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;BIIII)V")
    public final void method542(int arg0, Component arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1.field80 == 0 && arg1.field95 != null && !arg1.field94) {
            if (arg5 >= arg4 && arg6 >= arg3 && arg5 <= arg1.field83 + arg4 && arg6 <= arg1.field84 + arg3) {
                int var8 = arg1.field95.length;
                if (arg2 == 0) {
                    boolean var9 = false;
                } else {
                    this.field1669 = this.field1239.method295();
                }
                for (int var10 = 0; var10 < var8; ++var10) {
                    int var11 = arg1.field96[var10] + arg4;
                    int var12 = arg1.field97[var10] + arg3 - arg0;
                    Component var13 = Component.field73[arg1.field95[var10]];
                    int var14 = var13.field86 + var11;
                    int var15 = var13.field87 + var12;
                    if ((var13.field91 >= 0 || var13.field118 != 0) && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                        if (var13.field91 >= 0) {
                            this.field1634 = var13.field91;
                        } else {
                            this.field1634 = var13.field78;
                        }
                    }
                    if (var13.field80 == 0) {
                        this.method542(var13.field93, var13, (byte) 0, var15, var14, arg5, arg6);
                        if (var13.field92 > var13.field84) {
                            this.method467(var15, true, var13.field84, var13, (byte) 8, arg6, var13.field92, arg5, var13.field83 + var14);
                        }
                    } else {
                        if (var13.field81 == 1 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            boolean var16 = false;
                            if (var13.field82 != 0) {
                                var16 = this.method489(var13, (byte) -5);
                            }
                            if (!var16) {
                                this.field1580[this.field1483] = var13.field134;
                                this.field1470[this.field1483] = 231;
                                this.field1469[this.field1483] = var13.field78;
                                ++this.field1483;
                            }
                        }
                        if (var13.field81 == 2 && this.field1472 == 0 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            String var17 = var13.field131;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field1580[this.field1483] = var17 + " @gre@" + var13.field132;
                            this.field1470[this.field1483] = 274;
                            this.field1469[this.field1483] = var13.field78;
                            ++this.field1483;
                        }
                        if (var13.field81 == 3 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            this.field1580[this.field1483] = "Close";
                            this.field1470[this.field1483] = 737;
                            this.field1469[this.field1483] = var13.field78;
                            ++this.field1483;
                        }
                        if (var13.field81 == 4 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            this.field1580[this.field1483] = var13.field134;
                            this.field1470[this.field1483] = 435;
                            this.field1469[this.field1483] = var13.field78;
                            ++this.field1483;
                        }
                        if (var13.field81 == 5 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            this.field1580[this.field1483] = var13.field134;
                            this.field1470[this.field1483] = 225;
                            this.field1469[this.field1483] = var13.field78;
                            ++this.field1483;
                        }
                        if (var13.field81 == 6 && !this.field1654 && arg5 >= var14 && arg6 >= var15 && arg5 < var13.field83 + var14 && arg6 < var13.field84 + var15) {
                            this.field1580[this.field1483] = var13.field134;
                            this.field1470[this.field1483] = 997;
                            this.field1469[this.field1483] = var13.field78;
                            ++this.field1483;
                        }
                        if (var13.field80 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field84; ++var19) {
                                for (int var20 = 0; var20 < var13.field83; ++var20) {
                                    int var21 = (var13.field104 + 32) * var20 + var14;
                                    int var22 = (var13.field105 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field107[var18];
                                        var22 += var13.field108[var18];
                                    }
                                    if (arg5 >= var21 && arg6 >= var22 && arg5 < var21 + 32 && arg6 < var22 + 32) {
                                        this.field1316 = var18;
                                        this.field1317 = var13.field78;
                                        if (var13.field74[var18] > 0) {
                                            ObjType var23 = ObjType.method348(var13.field74[var18] - 1);
                                            if (this.field1420 == 1 && var13.field101) {
                                                if (this.field1422 != var13.field78 || this.field1421 != var18) {
                                                    this.field1580[this.field1483] = "Use " + this.field1424 + " with @lre@" + var23.field1056;
                                                    this.field1470[this.field1483] = 398;
                                                    this.field1471[this.field1483] = var23.field1054;
                                                    this.field1468[this.field1483] = var18;
                                                    this.field1469[this.field1483] = var13.field78;
                                                    ++this.field1483;
                                                }
                                            } else if (this.field1472 == 1 && var13.field101) {
                                                if ((this.field1474 & 16) == 16) {
                                                    this.field1580[this.field1483] = this.field1475 + " @lre@" + var23.field1056;
                                                    this.field1470[this.field1483] = 563;
                                                    this.field1471[this.field1483] = var23.field1054;
                                                    this.field1468[this.field1483] = var18;
                                                    this.field1469[this.field1483] = var13.field78;
                                                    ++this.field1483;
                                                }
                                            } else {
                                                if (var13.field101) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1071 != null && var23.field1071[var24] != null) {
                                                            this.field1580[this.field1483] = var23.field1071[var24] + " @lre@" + var23.field1056;
                                                            if (var24 == 3) {
                                                                this.field1470[this.field1483] = 681;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field1470[this.field1483] = 100;
                                                            }
                                                            this.field1471[this.field1483] = var23.field1054;
                                                            this.field1468[this.field1483] = var18;
                                                            this.field1469[this.field1483] = var13.field78;
                                                            ++this.field1483;
                                                        } else if (var24 == 4) {
                                                            this.field1580[this.field1483] = "Drop @lre@" + var23.field1056;
                                                            this.field1470[this.field1483] = 100;
                                                            this.field1471[this.field1483] = var23.field1054;
                                                            this.field1468[this.field1483] = var18;
                                                            this.field1469[this.field1483] = var13.field78;
                                                            ++this.field1483;
                                                        }
                                                    }
                                                }
                                                if (var13.field102) {
                                                    this.field1580[this.field1483] = "Use @lre@" + var23.field1056;
                                                    this.field1470[this.field1483] = 102;
                                                    this.field1471[this.field1483] = var23.field1054;
                                                    this.field1468[this.field1483] = var18;
                                                    this.field1469[this.field1483] = var13.field78;
                                                    ++this.field1483;
                                                }
                                                if (var13.field101 && var23.field1071 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1071[var25] != null) {
                                                            this.field1580[this.field1483] = var23.field1071[var25] + " @lre@" + var23.field1056;
                                                            if (var25 == 0) {
                                                                this.field1470[this.field1483] = 694;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1470[this.field1483] = 962;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1470[this.field1483] = 795;
                                                            }
                                                            this.field1471[this.field1483] = var23.field1054;
                                                            this.field1468[this.field1483] = var18;
                                                            this.field1469[this.field1483] = var13.field78;
                                                            ++this.field1483;
                                                        }
                                                    }
                                                }
                                                if (var13.field109 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field109[var26] != null) {
                                                            this.field1580[this.field1483] = var13.field109[var26] + " @lre@" + var23.field1056;
                                                            if (var26 == 0) {
                                                                this.field1470[this.field1483] = 582;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field1470[this.field1483] = 113;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field1470[this.field1483] = 555;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field1470[this.field1483] = 331;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field1470[this.field1483] = 354;
                                                            }
                                                            this.field1471[this.field1483] = var23.field1054;
                                                            this.field1468[this.field1483] = var18;
                                                            this.field1469[this.field1483] = var13.field78;
                                                            ++this.field1483;
                                                        }
                                                    }
                                                }
                                                this.field1580[this.field1483] = "Examine @lre@" + var23.field1056;
                                                this.field1470[this.field1483] = 1328;
                                                this.field1471[this.field1483] = var23.field1054;
                                                this.field1468[this.field1483] = var18;
                                                this.field1469[this.field1483] = var13.field78;
                                                ++this.field1483;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method543(int arg0) {
        int var2 = this.field1587;
        int var3 = this.field1588;
        int var4 = this.field1589;
        int var5 = this.field1590;
        int var6 = 6116423;
        Pix2D.method157(var6, var3, var5, -917, var2, var4);
        Pix2D.method157(0, var3 + 1, 16, -917, var2 + 1, var4 - 2);
        Pix2D.method158(0, -393, var4 - 2, var5 - 19, var2 + 1, var3 + 18);
        this.field1281.method206(var3 + 14, "Choose Option", var6, -56, var2 + 3);
        int var7 = super.field23;
        int var8 = super.field24;
        if (this.field1586 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1586 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1586 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1483; ++var9) {
            int var11 = (this.field1483 - 1 - var9) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3) {
                var12 = 16776960;
            }
            this.field1281.method210(this.field1580[var9], (byte) 5, var12, var11, true, var2 + 3);
        }
        int var10 = 35 / arg0;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)I")
    public final int method544(int arg0) {
        this.field1441 += arg0;
        int var2 = 3;
        if (this.field1388 < 310) {
            int var3 = this.field1385 >> 7;
            int var4 = this.field1387 >> 7;
            int var5 = field1534.field406 >> 7;
            int var6 = field1534.field407 >> 7;
            if ((this.field1307[this.field1542][var3][var4] & 4) != 0) {
                var2 = this.field1542;
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
                    if ((this.field1307[this.field1542][var3][var4] & 4) != 0) {
                        var2 = this.field1542;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1307[this.field1542][var3][var4] & 4) != 0) {
                            var2 = this.field1542;
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
                    if ((this.field1307[this.field1542][var3][var4] & 4) != 0) {
                        var2 = this.field1542;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1307[this.field1542][var3][var4] & 4) != 0) {
                            var2 = this.field1542;
                        }
                    }
                }
            }
        }
        if ((this.field1307[this.field1542][field1534.field406 >> 7][field1534.field407 >> 7] & 4) != 0) {
            var2 = this.field1542;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)I")
    public final int method545(int arg0) {
        this.field1441 += arg0;
        int var2 = this.method532(this.field1385, this.field1542, (byte) 8, this.field1387);
        return var2 - this.field1386 < 800 && (this.field1307[this.field1542][this.field1385 >> 7][this.field1387 >> 7] & 4) != 0 ? this.field1542 : 3;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method546(byte arg0) {
        if (this.field1415 != arg0) {
            this.field1603 = !this.field1603;
        }
        if (this.field1458 == 0) {
            int var2 = super.field13 / 2 - 80;
            int var3 = super.field14 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field29 == 1 && super.field30 >= var2 - 75 && super.field30 <= var2 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1458 = 3;
                this.field1640 = 0;
            }
            int var4 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var4 - 75 && super.field30 <= var4 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1520 = "";
                this.field1521 = "Enter your username & password.";
                this.field1458 = 2;
                this.field1640 = 0;
            }
        } else if (this.field1458 == 2) {
            int var5 = super.field14 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field29 == 1 && super.field31 >= var16 - 15 && super.field31 < var16) {
                this.field1640 = 0;
            }
            var5 = var16 + 15;
            if (super.field29 == 1 && super.field31 >= var5 - 15 && super.field31 < var5) {
                this.field1640 = 1;
            }
            var5 += 15;
            int var6 = super.field13 / 2 - 80;
            int var7 = super.field14 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field29 == 1 && super.field30 >= var6 - 75 && super.field30 <= var6 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.field1305 = 0;
                this.method488(this.field1314, this.field1315, false);
                if (this.field1450) {
                    return;
                }
            }
            int var8 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var8 - 75 && super.field30 <= var8 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.field1458 = 0;
                this.field1314 = "";
                this.field1315 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) 28);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1514.length(); ++var11) {
                        if (var9 == field1514.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1640 == 0) {
                        if (var9 == 8 && this.field1314.length() > 0) {
                            this.field1314 = this.field1314.substring(0, this.field1314.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1640 = 1;
                        }
                        if (var10) {
                            this.field1314 = this.field1314 + (char) var9;
                        }
                        if (this.field1314.length() > 12) {
                            this.field1314 = this.field1314.substring(0, 12);
                        }
                    } else if (this.field1640 == 1) {
                        if (var9 == 8 && this.field1315.length() > 0) {
                            this.field1315 = this.field1315.substring(0, this.field1315.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1640 = 0;
                        }
                        if (var10) {
                            this.field1315 = this.field1315 + (char) var9;
                        }
                        if (this.field1315.length() > 20) {
                            this.field1315 = this.field1315.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1458 == 3) {
                int var12 = super.field13 / 2;
                int var13 = super.field14 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field29 == 1 && super.field30 >= var12 - 75 && super.field30 <= var12 + 75 && super.field31 >= var18 - 20 && super.field31 <= var18 + 20) {
                    this.field1458 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method547(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method548(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = this.field1406 * 128 + 64;
        int var5 = this.field1407 * 128 + 64;
        int var6 = this.method532(var4, this.field1542, (byte) 8, var5) - this.field1408;
        if (this.field1385 < var4) {
            this.field1385 += (var4 - this.field1385) * this.field1410 / 1000 + this.field1409;
            if (this.field1385 > var4) {
                this.field1385 = var4;
            }
        }
        if (this.field1385 > var4) {
            this.field1385 -= (this.field1385 - var4) * this.field1410 / 1000 + this.field1409;
            if (this.field1385 < var4) {
                this.field1385 = var4;
            }
        }
        if (this.field1386 < var6) {
            this.field1386 += (var6 - this.field1386) * this.field1410 / 1000 + this.field1409;
            if (this.field1386 > var6) {
                this.field1386 = var6;
            }
        }
        if (this.field1386 > var6) {
            this.field1386 -= (this.field1386 - var6) * this.field1410 / 1000 + this.field1409;
            if (this.field1386 < var6) {
                this.field1386 = var6;
            }
        }
        if (this.field1387 < var5) {
            this.field1387 += (var5 - this.field1387) * this.field1410 / 1000 + this.field1409;
            if (this.field1387 > var5) {
                this.field1387 = var5;
            }
        }
        if (this.field1387 > var5) {
            this.field1387 -= (this.field1387 - var5) * this.field1410 / 1000 + this.field1409;
            if (this.field1387 < var5) {
                this.field1387 = var5;
            }
        }
        int var7 = this.field1390 * 128 + 64;
        int var8 = this.field1391 * 128 + 64;
        int var9 = this.method532(var7, this.field1542, (byte) 8, var8) - this.field1392;
        int var10 = var7 - this.field1385;
        int var11 = var9 - this.field1386;
        int var12 = var8 - this.field1387;
        int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
        int var14 = (int) (Math.atan2((double) var11, (double) var13) * 325.949D) & 2047;
        int var15 = (int) (Math.atan2((double) var10, (double) var12) * -325.949D) & 2047;
        if (var14 < 128) {
            var14 = 128;
        }
        if (var14 > 383) {
            var14 = 383;
        }
        if (this.field1388 < var14) {
            this.field1388 += (var14 - this.field1388) * this.field1394 / 1000 + this.field1393;
            if (this.field1388 > var14) {
                this.field1388 = var14;
            }
        }
        if (this.field1388 > var14) {
            this.field1388 -= (this.field1388 - var14) * this.field1394 / 1000 + this.field1393;
            if (this.field1388 < var14) {
                this.field1388 = var14;
            }
        }
        int var16 = var15 - this.field1389;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 > 0) {
            this.field1389 += this.field1394 * var16 / 1000 + this.field1393;
            this.field1389 &= 2047;
        }
        if (var16 < 0) {
            this.field1389 -= -var16 * this.field1394 / 1000 + this.field1393;
            this.field1389 &= 2047;
        }
        int var17 = var15 - this.field1389;
        if (var17 > 1024) {
            var17 -= 2048;
        }
        if (var17 < -1024) {
            var17 += 2048;
        }
        if (var17 < 0 && var16 > 0 || var17 > 0 && var16 < 0) {
            this.field1389 = var15;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method549(byte arg0) {
        this.method504(false);
        if (arg0 != 8) {
            this.field1442 = this.field1357.method229();
        }
        if (this.field1525 == 1) {
            this.field1228[this.field1524 / 100].method186(this.field1522 - 8 - 4, true, this.field1523 - 8 - 4);
        }
        if (this.field1525 == 2) {
            this.field1228[this.field1524 / 100 + 4].method186(this.field1522 - 8 - 4, true, this.field1523 - 8 - 4);
            ++field1334;
            if (field1334 > 57) {
                field1334 = 0;
                this.field1383.method218(34, 0);
            }
        }
        if (this.field1526 != -1) {
            this.method519(this.field1490, this.field1526, 0);
            this.method515(0, 0, 1, 0, Component.field73[this.field1526]);
        }
        if (this.field1612 != -1) {
            this.method519(this.field1490, this.field1612, 0);
            this.method515(0, 0, 1, 0, Component.field73[this.field1612]);
        }
        this.method554(false);
        if (!this.field1381) {
            this.method496(0);
            this.method506(-62);
        } else if (this.field1586 == 0) {
            this.method543(107);
        }
        if (this.field1308 == 1) {
            this.field1488[1].method186(472, true, 296);
        }
        if (field1604) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field11 < 15) {
                var4 = 16711680;
            }
            this.field1280.method201(var2, var4, var3, "Fps:" + super.field11, (byte) 9);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field1500) {
                int var8 = 16711680;
            }
            this.field1280.method201(var2, 16776960, var12, "Mem:" + var6 + "k", (byte) 9);
            var12 += 15;
        }
        if (this.field1658 != 0) {
            int var9 = this.field1658 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field1280.method206(329, "System update in: " + var10 + ":0" + var11, 16776960, -56, 4);
            } else {
                this.field1280.method206(329, "System update in: " + var10 + ":" + var11, 16776960, -56, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI[B)Z")
    public final boolean method550(byte arg0, int arg1, byte[] arg2) {
        if (arg0 != 1) {
            this.field1442 = -1;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method551(int arg0) {
        byte[] var2 = this.field1661.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1508.method258(6745);
        var3.method184(-30783, 0, 0);
        this.field1509.method258(6745);
        var3.method184(-30783, -637, 0);
        this.field1505.method258(6745);
        var3.method184(-30783, -128, 0);
        this.field1506.method258(6745);
        var3.method184(-30783, -202, -371);
        this.field1507.method258(6745);
        var3.method184(-30783, -202, -171);
        this.field1510.method258(6745);
        var3.method184(-30783, 0, -265);
        this.field1511.method258(6745);
        var3.method184(-30783, -562, -265);
        this.field1512.method258(6745);
        var3.method184(-30783, -128, -171);
        this.field1513.method258(6745);
        var3.method184(-30783, -562, -171);
        int[] var4 = new int[var3.field682];
        for (int var5 = 0; var5 < var3.field683; ++var5) {
            for (int var10 = 0; var10 < var3.field682; ++var10) {
                var4[var10] = var3.field681[var3.field682 * var5 + (var3.field682 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field682; ++var11) {
                var3.field681[var3.field682 * var5 + var11] = var4[var11];
            }
        }
        this.field1508.method258(6745);
        var3.method184(-30783, 382, 0);
        this.field1509.method258(6745);
        var3.method184(-30783, -255, 0);
        this.field1505.method258(6745);
        var3.method184(-30783, 254, 0);
        if (arg0 != 12601) {
            this.field1442 = -1;
        }
        this.field1506.method258(6745);
        var3.method184(-30783, 180, -371);
        this.field1507.method258(6745);
        var3.method184(-30783, 180, -171);
        this.field1510.method258(6745);
        var3.method184(-30783, 382, -265);
        this.field1511.method258(6745);
        var3.method184(-30783, -180, -265);
        this.field1512.method258(6745);
        var3.method184(-30783, 254, -171);
        this.field1513.method258(6745);
        var3.method184(-30783, -180, -171);
        Pix32 var6 = new Pix32(this.field1661, "logo", 0);
        this.field1505.method258(6745);
        var6.method186(382 - var6.field682 / 2 - 128, true, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (Linkable.field367) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method552(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1411 = 492;
        }
        if (!field1500) {
            if (Pix3D.field673[17] >= arg0) {
                Pix8 var3 = Pix3D.field667[17];
                int var4 = var3.field695 * var3.field694 - 1;
                int var5 = this.field1490 * var3.field694 * 2;
                byte[] var6 = var3.field692;
                byte[] var7 = this.field1359;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field692 = var7;
                this.field1359 = var6;
                Pix3D.method171(0, 17);
            }
            if (Pix3D.field673[24] >= arg0) {
                Pix8 var9 = Pix3D.field667[24];
                int var10 = var9.field695 * var9.field694 - 1;
                int var11 = this.field1490 * var9.field694 * 2;
                byte[] var12 = var9.field692;
                byte[] var13 = this.field1359;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field692 = var13;
                this.field1359 = var12;
                Pix3D.method171(0, 24);
            }
            if (Pix3D.field673[34] >= arg0) {
                Pix8 var15 = Pix3D.field667[34];
                int var16 = var15.field695 * var15.field694 - 1;
                int var17 = this.field1490 * var15.field694 * 2;
                byte[] var18 = var15.field692;
                byte[] var19 = this.field1359;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field692 = var19;
                this.field1359 = var18;
                Pix3D.method171(0, 34);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method553(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1608 >= 100) {
                this.method484((byte) -97, "", "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = JString.method304(JString.method301(arg0, this.field1223), -4015);
                if (arg1 > 0) {
                    for (int var5 = 0; var5 < this.field1608; ++var5) {
                        if (this.field1555[var5] == arg0) {
                            this.method484((byte) -97, "", var4 + " is already on your ignore list", 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field1537; ++var6) {
                        if (this.field1224[var6] == arg0) {
                            this.method484((byte) -97, "", "Please remove " + var4 + " from your friend list first", 0);
                            return;
                        }
                    }
                    this.field1555[this.field1608++] = arg0;
                    this.field1605 = true;
                    this.field1383.method218(158, 0);
                    this.field1383.method225(arg0, 359);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        if (arg0) {
            field1553 = this.field1239.method295();
        }
        this.field1504 = 0;
        int var2 = (field1534.field406 >> 7) + this.field1426;
        int var3 = (field1534.field407 >> 7) + this.field1427;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1504 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1504 = 1;
        }
        if (this.field1504 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1504 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method555(byte arg0) {
        if (this.field1306 != 0) {
            int var2 = 0;
            if (arg0 != 56) {
                this.field1384 = !this.field1384;
            }
            if (this.field1658 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1261[var3] != null) {
                    int var4 = this.field1259[var3];
                    String var5 = this.field1260[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1664 == 0 || this.field1664 == 1 && this.method514(false, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field23 > 4 && super.field24 - 4 > var9 - 10 && super.field24 - 4 <= var9 + 3) {
                            int var10 = this.field1280.method204("From:  " + var5 + this.field1261[var3], (byte) 86) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field23 < var10 + 4) {
                                if (this.field1487 >= 1) {
                                    this.field1580[this.field1483] = "Report abuse @whi@" + var5;
                                    this.field1470[this.field1483] = 2524;
                                    ++this.field1483;
                                }
                                this.field1580[this.field1483] = "Add ignore @whi@" + var5;
                                this.field1470[this.field1483] = 2047;
                                ++this.field1483;
                                this.field1580[this.field1483] = "Add friend @whi@" + var5;
                                this.field1470[this.field1483] = 2605;
                                ++this.field1483;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1664 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Z")
    public final boolean method556(int arg0, int arg1) {
        this.field1441 += arg0;
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1470[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)Z")
    public final boolean method557(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1576 == null) {
            return false;
        } else {
            try {
                int var4 = this.field1576.method40();
                if (var4 == 0) {
                    return false;
                }
                if (this.field1442 == -1) {
                    this.field1576.method41(this.field1357.field721, 0, 1);
                    this.field1442 = this.field1357.field721[0] & 255;
                    if (this.field1239 != null) {
                        this.field1442 = this.field1442 - this.field1239.method295() & 255;
                    }
                    this.field1441 = Protocol.field1097[this.field1442];
                    --var4;
                }
                if (this.field1441 == -1) {
                    if (var4 <= 0) {
                        return false;
                    }
                    this.field1576.method41(this.field1357.field721, 0, 1);
                    this.field1441 = this.field1357.field721[0] & 255;
                    --var4;
                }
                if (this.field1441 == -2) {
                    if (var4 <= 1) {
                        return false;
                    }
                    this.field1576.method41(this.field1357.field721, 0, 2);
                    this.field1357.field722 = 0;
                    this.field1441 = this.field1357.method231();
                    var4 -= 2;
                }
                if (var4 < this.field1441) {
                    return false;
                }
                this.field1357.field722 = 0;
                this.field1576.method41(this.field1357.field721, 0, this.field1441);
                this.field1443 = 0;
                this.field1237 = this.field1236;
                this.field1236 = this.field1235;
                this.field1235 = this.field1442;
                if (this.field1442 == 55) {
                    this.field1564 = this.field1357.method229();
                    if (this.field1564 == 1) {
                        this.field1430 = this.field1357.method231();
                    }
                    if (this.field1564 >= 2 && this.field1564 <= 6) {
                        if (this.field1564 == 2) {
                            this.field1676 = 64;
                            this.field1677 = 64;
                        }
                        if (this.field1564 == 3) {
                            this.field1676 = 0;
                            this.field1677 = 64;
                        }
                        if (this.field1564 == 4) {
                            this.field1676 = 128;
                            this.field1677 = 64;
                        }
                        if (this.field1564 == 5) {
                            this.field1676 = 64;
                            this.field1677 = 0;
                        }
                        if (this.field1564 == 6) {
                            this.field1676 = 64;
                            this.field1677 = 128;
                        }
                        this.field1564 = 2;
                        this.field1673 = this.field1357.method231();
                        this.field1674 = this.field1357.method231();
                        this.field1675 = this.field1357.method229();
                    }
                    if (this.field1564 == 10) {
                        this.field1609 = this.field1357.method231();
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 130) {
                    int var5 = this.field1357.method231();
                    int var6 = this.field1357.method232();
                    int var7 = this.field1357.method232();
                    Component var8 = Component.field73[var5];
                    var8.field86 = var6;
                    var8.field87 = var7;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 118) {
                    this.field1538 = this.field1357.method229();
                    this.field1605 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 236) {
                    int var9 = this.field1357.method231();
                    this.method510(var9, 0);
                    if (this.field1607 != -1) {
                        this.field1607 = -1;
                        this.field1605 = true;
                        this.field1400 = true;
                    }
                    if (this.field1265 != -1) {
                        this.field1265 = -1;
                        this.field1432 = true;
                    }
                    if (this.field1503) {
                        this.field1503 = false;
                        this.field1432 = true;
                    }
                    this.field1612 = var9;
                    this.field1654 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 38) {
                    int var10 = this.field1357.method231();
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    if (this.field1246 != var10 && this.field1276 && !field1500 && this.field1425 == 0) {
                        this.field1331 = var10;
                        this.field1332 = true;
                        this.field1679.method279(2, this.field1331);
                    }
                    this.field1246 = var10;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 183) {
                    int var11 = this.field1357.method231();
                    int var12 = this.field1357.method231();
                    if (this.field1276 && !field1500) {
                        this.field1331 = var11;
                        this.field1332 = false;
                        this.field1679.method279(2, this.field1331);
                        this.field1425 = var12;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 228) {
                    this.field1658 = this.field1357.method231() * 30;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 131) {
                    this.field1548 = this.field1357.method229();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 241) {
                    this.field1264 = true;
                    this.field1390 = this.field1357.method229();
                    this.field1391 = this.field1357.method229();
                    this.field1392 = this.field1357.method231();
                    this.field1393 = this.field1357.method229();
                    this.field1394 = this.field1357.method229();
                    if (this.field1394 >= 100) {
                        int var13 = this.field1390 * 128 + 64;
                        int var14 = this.field1391 * 128 + 64;
                        int var15 = this.method532(var13, this.field1542, (byte) 8, var14) - this.field1392;
                        int var16 = var13 - this.field1385;
                        int var17 = var15 - this.field1386;
                        int var18 = var14 - this.field1387;
                        int var19 = (int) Math.sqrt((double) (var16 * var16 + var18 * var18));
                        this.field1388 = (int) (Math.atan2((double) var17, (double) var19) * 325.949D) & 2047;
                        this.field1389 = (int) (Math.atan2((double) var16, (double) var18) * -325.949D) & 2047;
                        if (this.field1388 < 128) {
                            this.field1388 = 128;
                        }
                        if (this.field1388 > 383) {
                            this.field1388 = 383;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 224) {
                    long var20 = this.field1357.method235(false);
                    int var22 = this.field1357.method234();
                    int var23 = this.field1357.method229();
                    boolean var24 = false;
                    for (int var25 = 0; var25 < 100; ++var25) {
                        if (this.field1579[var25] == var22) {
                            var24 = true;
                            break;
                        }
                    }
                    if (var23 <= 1) {
                        for (int var26 = 0; var26 < this.field1608; ++var26) {
                            if (this.field1555[var26] == var20) {
                                var24 = true;
                                break;
                            }
                        }
                    }
                    if (!var24 && this.field1504 == 0) {
                        try {
                            this.field1579[this.field1571] = var22;
                            this.field1571 = (this.field1571 + 1) % 100;
                            String var27 = WordPack.method306(this.field1441 - 13, this.field1357, 964);
                            String var28 = WordFilter.method401(this.field1375, var27);
                            if (var23 != 2 && var23 != 3) {
                                if (var23 == 1) {
                                    this.method484((byte) -97, "@cr1@" + JString.method304(JString.method301(var20, this.field1223), -4015), var28, 7);
                                } else {
                                    this.method484((byte) -97, JString.method304(JString.method301(var20, this.field1223), -4015), var28, 3);
                                }
                            } else {
                                this.method484((byte) -97, "@cr2@" + JString.method304(JString.method301(var20, this.field1223), -4015), var28, 7);
                            }
                        } catch (Exception var170) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 51) {
                    int var30 = this.field1357.method231();
                    boolean var31 = this.field1357.method229() == 1;
                    Component.field73[var30].field94 = var31;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 7) {
                    int var32 = this.field1357.method231();
                    int var33 = this.field1357.method231();
                    Component.field73[var32].field122 = 2;
                    Component.field73[var32].field123 = var33;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 188) {
                    this.field1605 = true;
                    int var34 = this.field1357.method231();
                    Component var35 = Component.field73[var34];
                    int var36 = this.field1357.method231();
                    for (int var37 = 0; var37 < var36; ++var37) {
                        var35.field74[var37] = this.field1357.method231();
                        int var38 = this.field1357.method229();
                        if (var38 == 255) {
                            var38 = this.field1357.method234();
                        }
                        var35.field75[var37] = var38;
                    }
                    for (int var39 = var36; var39 < var35.field74.length; ++var39) {
                        var35.field74[var39] = 0;
                        var35.field75[var39] = 0;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 149) {
                    long var40 = this.field1357.method235(false);
                    int var42 = this.field1357.method229();
                    String var43 = JString.method304(JString.method301(var40, this.field1223), -4015);
                    for (int var44 = 0; var44 < this.field1537; ++var44) {
                        if (this.field1224[var44] == var40) {
                            if (this.field1439[var44] != var42) {
                                this.field1439[var44] = var42;
                                this.field1605 = true;
                                if (var42 > 0) {
                                    this.method484((byte) -97, "", var43 + " has logged in.", 5);
                                }
                                if (var42 == 0) {
                                    this.method484((byte) -97, "", var43 + " has logged out.", 5);
                                }
                            }
                            var43 = null;
                            break;
                        }
                    }
                    if (var43 != null && this.field1537 < 200) {
                        this.field1224[this.field1537] = var40;
                        this.field1532[this.field1537] = var43;
                        this.field1439[this.field1537] = var42;
                        ++this.field1537;
                        this.field1605 = true;
                    }
                    boolean var45 = false;
                    while (!var45) {
                        var45 = true;
                        for (int var46 = 0; var46 < this.field1537 - 1; ++var46) {
                            if (this.field1439[var46] != field1497 && this.field1439[var46 + 1] == field1497 || this.field1439[var46] == 0 && this.field1439[var46 + 1] != 0) {
                                int var47 = this.field1439[var46];
                                this.field1439[var46] = this.field1439[var46 + 1];
                                this.field1439[var46 + 1] = var47;
                                String var48 = this.field1532[var46];
                                this.field1532[var46] = this.field1532[var46 + 1];
                                this.field1532[var46 + 1] = var48;
                                long var49 = this.field1224[var46];
                                this.field1224[var46] = this.field1224[var46 + 1];
                                this.field1224[var46 + 1] = var49;
                                this.field1605 = true;
                                var45 = false;
                            }
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 108) {
                    this.field1651 = this.field1357.method229();
                    this.field1652 = this.field1357.method229();
                    while (this.field1357.field722 < this.field1441) {
                        int var51 = this.field1357.method229();
                        this.method457(var51, this.field1357, (byte) -20);
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 83) {
                    this.field1397 = 0;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 44) {
                    this.field1651 = this.field1357.method229();
                    this.field1652 = this.field1357.method229();
                    for (int var52 = this.field1651; var52 < this.field1651 + 8; ++var52) {
                        for (int var53 = this.field1652; var53 < this.field1652 + 8; ++var53) {
                            if (this.field1312[this.field1542][var52][var53] != null) {
                                this.field1312[this.field1542][var52][var53] = null;
                                this.method470(var52, var53);
                            }
                        }
                    }
                    for (LocSpawned var54 = (LocSpawned) this.field1559.method248(); var54 != null; var54 = (LocSpawned) this.field1559.method250(true)) {
                        if (var54.field742 >= this.field1651 && var54.field742 < this.field1651 + 8 && var54.field743 >= this.field1652 && var54.field743 < this.field1652 + 8 && this.field1542 == var54.field740) {
                            var54.field751 = 0;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 214) {
                    int var55 = this.field1357.method231();
                    int var56 = this.field1357.method231();
                    int var57 = var56 >> 10 & 31;
                    int var58 = var56 >> 5 & 31;
                    int var59 = var56 & 31;
                    Component.field73[var55].field116 = (var59 << 3) + (var57 << 19) + (var58 << 11);
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 9) {
                    int var60 = this.field1357.method232();
                    this.field1339 = var60;
                    this.field1432 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 13) {
                    this.field1605 = true;
                    int var61 = this.field1357.method231();
                    Component var62 = Component.field73[var61];
                    while (this.field1357.field722 < this.field1441) {
                        int var63 = this.field1357.method243();
                        int var64 = this.field1357.method231();
                        int var65 = this.field1357.method229();
                        if (var65 == 255) {
                            var65 = this.field1357.method234();
                        }
                        if (var63 >= 0 && var63 < var62.field74.length) {
                            var62.field74[var63] = var64;
                            var62.field75[var63] = var65;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 3) {
                    this.field1433 = this.field1357.method229();
                    this.field1605 = true;
                    this.field1400 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 85) {
                    int var66 = this.field1357.method231();
                    int var67 = this.field1357.method231();
                    Component var68 = Component.field73[var66];
                    if (var68 != null && var68.field80 == 0) {
                        if (var67 < 0) {
                            var67 = 0;
                        }
                        if (var67 > var68.field92 - var68.field84) {
                            var67 = var68.field92 - var68.field84;
                        }
                        var68.field93 = var67;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 181) {
                    this.field1625 = this.field1357.method229();
                    if (this.field1625 == this.field1433) {
                        if (this.field1625 == 3) {
                            this.field1433 = 1;
                        } else {
                            this.field1433 = 3;
                        }
                        this.field1605 = true;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 81) {
                    int var69 = this.field1357.method231();
                    int var70 = this.field1357.method231();
                    int var71 = this.field1357.method231();
                    int var72 = this.field1357.method231();
                    Component.field73[var69].field129 = var70;
                    Component.field73[var69].field130 = var71;
                    Component.field73[var69].field128 = var72;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 151) {
                    this.field1605 = true;
                    int var73 = this.field1357.method229();
                    int var74 = this.field1357.method234();
                    int var75 = this.field1357.method229();
                    this.field1296[var73] = var74;
                    this.field1678[var73] = var75;
                    this.field1491[var73] = 1;
                    for (int var76 = 0; var76 < 98; ++var76) {
                        if (var74 >= field1478[var76]) {
                            this.field1491[var73] = var76 + 2;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 185) {
                    int var77 = this.field1357.method231();
                    int var78 = this.field1357.method231();
                    Component.field73[var77].field122 = 1;
                    Component.field73[var77].field123 = var78;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 245) {
                    int var79 = this.field1357.method231();
                    int var80 = this.field1357.method231();
                    if (this.field1265 != -1) {
                        this.field1265 = -1;
                        this.field1432 = true;
                    }
                    if (this.field1503) {
                        this.field1503 = false;
                        this.field1432 = true;
                    }
                    this.field1612 = var79;
                    this.field1607 = var80;
                    this.field1605 = true;
                    this.field1400 = true;
                    this.field1654 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 195) {
                    this.method495(459, this.field1357, this.field1441);
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 77) {
                    int var81 = this.field1357.method231();
                    this.method510(var81, 0);
                    if (this.field1607 != -1) {
                        this.field1607 = -1;
                        this.field1605 = true;
                        this.field1400 = true;
                    }
                    this.field1265 = var81;
                    this.field1432 = true;
                    this.field1612 = -1;
                    this.field1654 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 238) {
                    String var82 = this.field1357.method236();
                    if (var82.endsWith(":tradereq:")) {
                        String var83 = var82.substring(0, var82.indexOf(":"));
                        long var84 = JString.method300(var83);
                        boolean var86 = false;
                        for (int var87 = 0; var87 < this.field1608; ++var87) {
                            if (this.field1555[var87] == var84) {
                                var86 = true;
                                break;
                            }
                        }
                        if (!var86 && this.field1504 == 0) {
                            this.method484((byte) -97, var83, "wishes to trade with you.", 4);
                        }
                    } else if (var82.endsWith(":duelreq:")) {
                        String var88 = var82.substring(0, var82.indexOf(":"));
                        long var89 = JString.method300(var88);
                        boolean var91 = false;
                        for (int var92 = 0; var92 < this.field1608; ++var92) {
                            if (this.field1555[var92] == var89) {
                                var91 = true;
                                break;
                            }
                        }
                        if (!var91 && this.field1504 == 0) {
                            this.method484((byte) -97, var88, "wishes to duel with you.", 8);
                        }
                    } else if (!var82.endsWith(":chalreq:")) {
                        this.method484((byte) -97, "", var82, 0);
                    } else {
                        String var93 = var82.substring(0, var82.indexOf(":"));
                        long var94 = JString.method300(var93);
                        boolean var96 = false;
                        for (int var97 = 0; var97 < this.field1608; ++var97) {
                            if (this.field1555[var97] == var94) {
                                var96 = true;
                                break;
                            }
                        }
                        if (!var96 && this.field1504 == 0) {
                            String var98 = var82.substring(var82.indexOf(":") + 1, var82.length() - 9);
                            this.method484((byte) -97, var93, var98, 8);
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 33) {
                    this.field1637 = this.field1357.method231();
                    this.field1540 = this.field1357.method229();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 75) {
                    this.method503(-5861);
                    this.field1442 = -1;
                    return false;
                }
                if (this.field1442 == 153) {
                    int var99 = this.field1357.method231();
                    int var100 = this.field1357.method231();
                    int var101 = this.field1357.method231();
                    if (var100 == 65535) {
                        Component.field73[var99].field122 = 0;
                        this.field1442 = -1;
                        return true;
                    }
                    ObjType var102 = ObjType.method348(var100);
                    Component.field73[var99].field122 = 4;
                    Component.field73[var99].field123 = var100;
                    Component.field73[var99].field129 = var102.field1061;
                    Component.field73[var99].field130 = var102.field1062;
                    Component.field73[var99].field128 = var102.field1060 * 100 / var101;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 105) {
                    this.field1608 = this.field1441 / 8;
                    for (int var103 = 0; var103 < this.field1608; ++var103) {
                        this.field1555[var103] = this.field1357.method235(false);
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 111) {
                    for (int var104 = 0; var104 < this.field1250.length; ++var104) {
                        if (this.field1250[var104] != null) {
                            this.field1250[var104].field434 = -1;
                        }
                    }
                    for (int var105 = 0; var105 < this.field1350.length; ++var105) {
                        if (this.field1350[var105] != null) {
                            this.field1350[var105].field434 = -1;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 222 || this.field1442 == 253 || this.field1442 == 191 || this.field1442 == 137 || this.field1442 == 193 || this.field1442 == 30 || this.field1442 == 53 || this.field1442 == 147 || this.field1442 == 2 || this.field1442 == 211 || this.field1442 == 136) {
                    this.method457(this.field1442, this.field1357, (byte) -20);
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 98) {
                    int var106 = this.field1357.method229();
                    int var107 = this.field1357.method229();
                    String var108 = this.field1357.method236();
                    if (var106 >= 1 && var106 <= 5) {
                        if (var108.equalsIgnoreCase("null")) {
                            var108 = null;
                        }
                        this.field1274[var106 - 1] = var108;
                        this.field1275[var106 - 1] = var107 == 0;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 22) {
                    this.field1651 = this.field1357.method229();
                    this.field1652 = this.field1357.method229();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 145) {
                    int var109 = this.field1357.method231();
                    int var110 = this.field1357.method234();
                    this.field1592[var109] = var110;
                    if (this.field1593[var109] != var110) {
                        this.field1593[var109] = var110;
                        this.method465(this.field1240, var109);
                        this.field1605 = true;
                        if (this.field1339 != -1) {
                            this.field1432 = true;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 186) {
                    int var111 = this.field1357.method231();
                    int var112 = this.field1357.method232();
                    Component var113 = Component.field73[var111];
                    var113.field126 = var112;
                    if (var112 == -1) {
                        var113.field76 = 0;
                        var113.field77 = 0;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 156) {
                    if (this.field1433 == 12) {
                        this.field1605 = true;
                    }
                    this.field1653 = this.field1357.method232();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 92) {
                    int var114 = this.field1357.method229();
                    int var115 = this.field1357.method229();
                    int var116 = this.field1357.method229();
                    int var117 = this.field1357.method229();
                    this.field1642[var114] = true;
                    this.field1570[var114] = var115;
                    this.field1618[var114] = var116;
                    this.field1416[var114] = var117;
                    this.field1562[var114] = 0;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 212) {
                    if (this.field1607 != -1) {
                        this.field1607 = -1;
                        this.field1605 = true;
                        this.field1400 = true;
                    }
                    if (this.field1265 != -1) {
                        this.field1265 = -1;
                        this.field1432 = true;
                    }
                    if (this.field1503) {
                        this.field1503 = false;
                        this.field1432 = true;
                    }
                    this.field1612 = -1;
                    this.field1654 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 206) {
                    this.field1300 = this.field1357.method229();
                    this.field1664 = this.field1357.method229();
                    this.field1596 = this.field1357.method229();
                    this.field1440 = true;
                    this.field1432 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 170) {
                    int var118 = this.field1357.method231();
                    int var119 = this.field1357.method231();
                    if (this.field1659 == var118 && this.field1660 == var119 && this.field1617 == 2) {
                        this.field1442 = -1;
                        return true;
                    }
                    this.field1659 = var118;
                    this.field1660 = var119;
                    this.field1426 = (this.field1659 - 6) * 8;
                    this.field1427 = (this.field1660 - 6) * 8;
                    this.field1539 = false;
                    if ((this.field1659 / 8 == 48 || this.field1659 / 8 == 49) && this.field1660 / 8 == 48) {
                        this.field1539 = true;
                    }
                    if (this.field1659 / 8 == 48 && this.field1660 / 8 == 148) {
                        this.field1539 = true;
                    }
                    this.field1617 = 1;
                    this.field1569 = System.currentTimeMillis();
                    this.field1461.method258(6745);
                    this.field1280.method202("Loading - please wait.", false, 0, 257, 151);
                    this.field1280.method202("Loading - please wait.", false, 16777215, 256, 150);
                    this.field1461.method259(4, 4, super.field15, this.field1411);
                    int var120 = 0;
                    for (int var121 = (this.field1659 - 6) / 8; var121 <= (this.field1659 + 6) / 8; ++var121) {
                        for (int var122 = (this.field1660 - 6) / 8; var122 <= (this.field1660 + 6) / 8; ++var122) {
                            ++var120;
                        }
                    }
                    this.field1241 = new byte[var120][];
                    this.field1577 = new byte[var120][];
                    this.field1529 = new int[var120];
                    this.field1530 = new int[var120];
                    this.field1531 = new int[var120];
                    int var123 = 0;
                    for (int var124 = (this.field1659 - 6) / 8; var124 <= (this.field1659 + 6) / 8; ++var124) {
                        for (int var125 = (this.field1660 - 6) / 8; var125 <= (this.field1660 + 6) / 8; ++var125) {
                            this.field1529[var123] = (var124 << 8) + var125;
                            if (!this.field1539 || var125 != 49 && var125 != 149 && var125 != 147 && var124 != 50 && (var124 != 49 || var125 != 47)) {
                                int var126 = this.field1530[var123] = this.field1679.method274(true, var125, var124, 0);
                                if (var126 != -1) {
                                    this.field1679.method279(3, var126);
                                }
                                int var127 = this.field1531[var123] = this.field1679.method274(true, var125, var124, 1);
                                if (var127 != -1) {
                                    this.field1679.method279(3, var127);
                                }
                                ++var123;
                            } else {
                                this.field1530[var123] = -1;
                                this.field1531[var123] = -1;
                                ++var123;
                            }
                        }
                    }
                    int var128 = this.field1426 - this.field1428;
                    int var129 = this.field1427 - this.field1429;
                    this.field1428 = this.field1426;
                    this.field1429 = this.field1427;
                    for (int var130 = 0; var130 < 16384; ++var130) {
                        NpcEntity var131 = this.field1350[var130];
                        if (var131 != null) {
                            for (int var132 = 0; var132 < 10; ++var132) {
                                var131.field456[var132] -= var128;
                                var131.field457[var132] -= var129;
                            }
                            var131.field406 -= var128 * 128;
                            var131.field407 -= var129 * 128;
                        }
                    }
                    for (int var133 = 0; var133 < this.field1248; ++var133) {
                        PlayerEntity var134 = this.field1250[var133];
                        if (var134 != null) {
                            for (int var135 = 0; var135 < 10; ++var135) {
                                var134.field456[var135] -= var128;
                                var134.field457[var135] -= var129;
                            }
                            var134.field406 -= var128 * 128;
                            var134.field407 -= var129 * 128;
                        }
                    }
                    this.field1289 = true;
                    byte var136 = 0;
                    byte var137 = 104;
                    byte var138 = 1;
                    if (var128 < 0) {
                        var136 = 103;
                        var137 = -1;
                        var138 = -1;
                    }
                    byte var139 = 0;
                    byte var140 = 104;
                    byte var141 = 1;
                    if (var129 < 0) {
                        var139 = 103;
                        var140 = -1;
                        var141 = -1;
                    }
                    for (int var142 = var136; var137 != var142; var142 += var138) {
                        for (int var143 = var139; var140 != var143; var143 += var141) {
                            int var144 = var128 + var142;
                            int var145 = var129 + var143;
                            for (int var146 = 0; var146 < 4; ++var146) {
                                if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                                    this.field1312[var146][var142][var143] = this.field1312[var146][var144][var145];
                                } else {
                                    this.field1312[var146][var142][var143] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var147 = (LocSpawned) this.field1559.method248(); var147 != null; var147 = (LocSpawned) this.field1559.method250(true)) {
                        var147.field742 -= var128;
                        var147.field743 -= var129;
                        if (var147.field742 < 0 || var147.field743 < 0 || var147.field742 >= 104 || var147.field743 >= 104) {
                            var147.method106();
                        }
                    }
                    if (this.field1397 != 0) {
                        this.field1397 -= var128;
                        this.field1398 -= var129;
                    }
                    this.field1264 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 141) {
                    int var148 = this.field1357.method231();
                    int var149 = this.field1357.method229();
                    if (var148 == 65535) {
                        var148 = -1;
                    }
                    this.field1554[var149] = var148;
                    this.field1605 = true;
                    this.field1400 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 226) {
                    for (int var150 = 0; var150 < this.field1593.length; ++var150) {
                        if (this.field1593[var150] != this.field1592[var150]) {
                            this.field1593[var150] = this.field1592[var150];
                            this.method465(this.field1240, var150);
                            this.field1605 = true;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 138) {
                    this.field1264 = false;
                    for (int var151 = 0; var151 < 5; ++var151) {
                        this.field1642[var151] = false;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 196) {
                    this.method434(this.field1357, this.field1413, this.field1441);
                    this.field1289 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 62) {
                    this.field1481 = false;
                    this.field1503 = true;
                    this.field1382 = "";
                    this.field1432 = true;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 246) {
                    int var152 = this.field1357.method232();
                    if (var152 >= 0) {
                        this.method510(var152, 0);
                    }
                    this.field1526 = var152;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 19) {
                    this.field1308 = this.field1357.method229();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 204) {
                    int var153 = this.field1357.method231();
                    Component var154 = Component.field73[var153];
                    for (int var155 = 0; var155 < var154.field74.length; ++var155) {
                        var154.field74[var155] = -1;
                        var154.field74[var155] = 0;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 94) {
                    int var156 = this.field1357.method231();
                    Component.field73[var156].field122 = 3;
                    if (field1534.field493 == null) {
                        Component.field73[var156].field123 = (field1534.field475[11] << 5) + (field1534.field475[8] << 10) + (field1534.field475[0] << 15) + (field1534.field476[0] << 25) + (field1534.field476[4] << 20) + field1534.field475[1];
                    } else {
                        Component.field73[var156].field123 = (int) (field1534.field493.field1015 + 305419896L);
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 213) {
                    int var157 = this.field1357.method231();
                    byte var158 = this.field1357.method230();
                    this.field1592[var157] = var158;
                    if (this.field1593[var157] != var158) {
                        this.field1593[var157] = var158;
                        this.method465(this.field1240, var157);
                        this.field1605 = true;
                        if (this.field1339 != -1) {
                            this.field1432 = true;
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 119) {
                    this.field1431 = this.field1357.method234();
                    this.field1467 = this.field1357.method231();
                    this.field1380 = this.field1357.method229();
                    this.field1595 = this.field1357.method231();
                    this.field1456 = this.field1357.method229();
                    if (this.field1431 != 0 && this.field1612 == -1) {
                        signlink.dnslookup(JString.method303(this.field1431, true));
                        this.method432(true);
                        short var159 = 650;
                        if (this.field1380 != 201 || this.field1456 == 1) {
                            var159 = 655;
                        }
                        this.field1303 = "";
                        this.field1657 = false;
                        for (int var160 = 0; var160 < Component.field73.length; ++var160) {
                            if (Component.field73[var160] != null && Component.field73[var160].field82 == var159) {
                                this.field1612 = Component.field73[var160].field79;
                                break;
                            }
                        }
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 27) {
                    if (this.field1433 == 12) {
                        this.field1605 = true;
                    }
                    this.field1358 = this.field1357.method229();
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 237) {
                    int var161 = this.field1357.method231();
                    this.method510(var161, 0);
                    if (this.field1265 != -1) {
                        this.field1265 = -1;
                        this.field1432 = true;
                    }
                    if (this.field1503) {
                        this.field1503 = false;
                        this.field1432 = true;
                    }
                    this.field1607 = var161;
                    this.field1605 = true;
                    this.field1400 = true;
                    this.field1612 = -1;
                    this.field1654 = false;
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 45) {
                    int var162 = this.field1357.method231();
                    int var163 = this.field1357.method229();
                    int var164 = this.field1357.method231();
                    if (this.field1557 && !field1500 && this.field1650 < 50) {
                        this.field1266[this.field1650] = var162;
                        this.field1636[this.field1650] = var163;
                        this.field1310[this.field1650] = Wave.field915[var162] + var164;
                        ++this.field1650;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 115) {
                    this.field1264 = true;
                    this.field1406 = this.field1357.method229();
                    this.field1407 = this.field1357.method229();
                    this.field1408 = this.field1357.method231();
                    this.field1409 = this.field1357.method229();
                    this.field1410 = this.field1357.method229();
                    if (this.field1410 >= 100) {
                        this.field1385 = this.field1406 * 128 + 64;
                        this.field1387 = this.field1407 * 128 + 64;
                        this.field1386 = this.method532(this.field1385, this.field1542, (byte) 8, this.field1387) - this.field1408;
                    }
                    this.field1442 = -1;
                    return true;
                }
                if (this.field1442 == 169) {
                    int var165 = this.field1357.method231();
                    String var166 = this.field1357.method236();
                    Component.field73[var165].field114 = var166;
                    if (this.field1554[this.field1433] == Component.field73[var165].field79) {
                        this.field1605 = true;
                    }
                    this.field1442 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1442 + "," + this.field1441 + " - " + this.field1236 + "," + this.field1237);
                this.method503(-5861);
            } catch (IOException var171) {
                this.method435(this.field1338);
            } catch (Exception var172) {
                String var168 = "T2 - " + this.field1442 + "," + this.field1236 + "," + this.field1237 + " - " + this.field1441 + "," + (field1534.field456[0] + this.field1426) + "," + (field1534.field457[0] + this.field1427) + " - ";
                for (int var169 = 0; var169 < this.field1441 && var169 < 50; ++var169) {
                    var168 = var168 + this.field1357.field721[var169] + ",";
                }
                signlink.reporterror(var168);
                this.method503(-5861);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)Z")
    public final boolean method558(int arg0) {
        if (arg0 <= 0) {
            this.field1302 = -109;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (arg0) {
            this.field1312 = null;
        }
        if (!this.field1627 && !this.field1680 && !this.field1611) {
            ++field1311;
            if (!this.field1450) {
                this.method546((byte) 16);
            } else {
                this.method436(true);
            }
            this.method521(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, (byte) -37, "Starting up");
        if (signlink.sunjava) {
            super.field9 = 5;
        }
        if (field1297) {
            this.field1627 = true;
        } else {
            field1297 = true;
            boolean var1 = false;
            String var2 = this.method461(false);
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
                this.field1611 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1262[var3] = new FileStream(-490, signlink.cache_idx[var3], signlink.cache_dat, 500000, var3 + 1);
                    }
                }
                try {
                    this.method520(-763);
                    this.field1661 = this.method529(true, 1, "title", "title screen", 25, this.field1404[1]);
                    this.field1279 = new PixFont(false, false, "p11_full", this.field1661);
                    this.field1280 = new PixFont(false, false, "p12_full", this.field1661);
                    this.field1281 = new PixFont(false, false, "b12_full", this.field1661);
                    this.field1282 = new PixFont(true, false, "q8_full", this.field1661);
                    this.method551(field1621);
                    this.method449(true);
                    Jagfile var4 = this.method529(true, 2, "config", "config", 30, this.field1404[2]);
                    Jagfile var5 = this.method529(true, 3, "interface", "interface", 35, this.field1404[3]);
                    Jagfile var6 = this.method529(true, 4, "media", "2d graphics", 40, this.field1404[4]);
                    Jagfile var7 = this.method529(true, 6, "textures", "textures", 45, this.field1404[6]);
                    Jagfile var8 = this.method529(true, 7, "wordenc", "chat system", 50, this.field1404[7]);
                    Jagfile var9 = this.method529(true, 8, "sounds", "sound effects", 55, this.field1404[8]);
                    this.field1307 = new byte[4][104][104];
                    this.field1584 = new int[4][105][105];
                    this.field1501 = new World3D(this.field1584, 104, 4, 119, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1291[var10] = new CollisionMap(true, 104, 104);
                    }
                    this.field1399 = new Pix32(512, 512);
                    Jagfile var11 = this.method529(true, 5, "versionlist", "update list", 60, this.field1404[5]);
                    this.method13(60, (byte) -37, "Connecting to update server");
                    this.field1679 = new OnDemand();
                    this.field1679.method270(var11, this);
                    AnimFrame.method44(this.field1679.method273(9));
                    Model.method123(this.field1679.method272(0, 763), this.field1679);
                    if (!field1500) {
                        this.field1331 = 0;
                        try {
                            this.field1331 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1332 = true;
                        this.field1679.method279(2, this.field1331);
                        while (this.field1679.method280() > 0) {
                            this.method521(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1679.field846 > 3) {
                                this.method485("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, (byte) -37, "Requesting animations");
                    int var12 = this.field1679.method272(1, 763);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1679.method279(1, var13);
                    }
                    while (this.field1679.method280() > 0) {
                        int var14 = var12 - this.field1679.method280();
                        if (var14 > 0) {
                            this.method13(65, (byte) -37, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method521(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1679.field846 > 3) {
                            this.method485("ondemand");
                            return;
                        }
                    }
                    this.method13(70, (byte) -37, "Requesting models");
                    int var15 = this.field1679.method272(0, 763);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1679.method277(var16, true);
                        if ((var17 & 1) != 0) {
                            this.field1679.method279(0, var16);
                        }
                    }
                    int var18 = this.field1679.method280();
                    while (this.field1679.method280() > 0) {
                        int var19 = var18 - this.field1679.method280();
                        if (var19 > 0) {
                            this.method13(70, (byte) -37, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method521(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1262[0] != null) {
                        this.method13(75, (byte) -37, "Requesting maps");
                        this.field1679.method279(3, this.field1679.method274(true, 48, 47, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 48, 47, 1));
                        this.field1679.method279(3, this.field1679.method274(true, 48, 48, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 48, 48, 1));
                        this.field1679.method279(3, this.field1679.method274(true, 48, 49, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 48, 49, 1));
                        this.field1679.method279(3, this.field1679.method274(true, 47, 47, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 47, 47, 1));
                        this.field1679.method279(3, this.field1679.method274(true, 47, 48, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 47, 48, 1));
                        this.field1679.method279(3, this.field1679.method274(true, 148, 48, 0));
                        this.field1679.method279(3, this.field1679.method274(true, 148, 48, 1));
                        int var20 = this.field1679.method280();
                        while (this.field1679.method280() > 0) {
                            int var21 = var20 - this.field1679.method280();
                            if (var21 > 0) {
                                this.method13(75, (byte) -37, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method521(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1679.method272(0, 763);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1679.method277(var23, true);
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
                            this.field1679.method282(var23, false, var25, 0);
                        }
                    }
                    this.field1679.method275(field1365, field1499);
                    if (!field1500) {
                        int var26 = this.field1679.method272(2, 763);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1679.method278(true, var27)) {
                                this.field1679.method282(var27, false, (byte) 1, 2);
                            }
                        }
                    }
                    this.method13(80, (byte) -37, "Unpacking media");
                    this.field1446 = new Pix8(var6, "invback", 0);
                    this.field1448 = new Pix8(var6, "chatback", 0);
                    this.field1447 = new Pix8(var6, "mapback", 0);
                    this.field1681 = new Pix8(var6, "backbase1", 0);
                    this.field1682 = new Pix8(var6, "backbase2", 0);
                    this.field1683 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1582[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1502 = new Pix32(var6, "compass", 0);
                    this.field1638 = new Pix32(var6, "mapedge", 0);
                    this.field1638.method183(true);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1479[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1238[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1309[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1488[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1284 = new Pix32(var6, "mapmarker", 0);
                    this.field1285 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1228[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1687 = new Pix32(var6, "mapdots", 0);
                    this.field1688 = new Pix32(var6, "mapdots", 1);
                    this.field1689 = new Pix32(var6, "mapdots", 2);
                    this.field1690 = new Pix32(var6, "mapdots", 3);
                    this.field1543 = new Pix8(var6, "scrollbar", 0);
                    this.field1544 = new Pix8(var6, "scrollbar", 1);
                    this.field1360 = new Pix8(var6, "redstone1", 0);
                    this.field1361 = new Pix8(var6, "redstone2", 0);
                    this.field1362 = new Pix8(var6, "redstone3", 0);
                    this.field1363 = new Pix8(var6, "redstone1", 0);
                    this.field1363.method196(field1551);
                    this.field1364 = new Pix8(var6, "redstone2", 0);
                    this.field1364.method196(field1551);
                    this.field1451 = new Pix8(var6, "redstone1", 0);
                    this.field1451.method197((byte) 2);
                    this.field1452 = new Pix8(var6, "redstone2", 0);
                    this.field1452.method197((byte) 2);
                    this.field1453 = new Pix8(var6, "redstone3", 0);
                    this.field1453.method197((byte) 2);
                    this.field1454 = new Pix8(var6, "redstone1", 0);
                    this.field1454.method196(field1551);
                    this.field1454.method197((byte) 2);
                    this.field1455 = new Pix8(var6, "redstone2", 0);
                    this.field1455.method196(field1551);
                    this.field1455.method197((byte) 2);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1401[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1366 = new PixMap(500, var35.field682, this.method11(19330), var35.field683);
                    var35.method184(-30783, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1367 = new PixMap(500, var36.field682, this.method11(19330), var36.field683);
                    var36.method184(-30783, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1368 = new PixMap(500, var37.field682, this.method11(19330), var37.field683);
                    var37.method184(-30783, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1369 = new PixMap(500, var38.field682, this.method11(19330), var38.field683);
                    var38.method184(-30783, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1370 = new PixMap(500, var39.field682, this.method11(19330), var39.field683);
                    var39.method184(-30783, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1371 = new PixMap(500, var40.field682, this.method11(19330), var40.field683);
                    var40.method184(-30783, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1372 = new PixMap(500, var41.field682, this.method11(19330), var41.field683);
                    var41.method184(-30783, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1373 = new PixMap(500, var42.field682, this.method11(19330), var42.field683);
                    var42.method184(-30783, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1374 = new PixMap(500, var43.field682, this.method11(19330), var43.field683);
                    var43.method184(-30783, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1238[var48] != null) {
                            this.field1238[var48].method182(var44 + var47, var45 + var47, var46 + var47, 908);
                        }
                        if (this.field1479[var48] != null) {
                            this.field1479[var48].method198(var44 + var47, var45 + var47, var46 + var47, 908);
                        }
                    }
                    this.method13(83, (byte) -37, "Unpacking textures");
                    Pix3D.method169(var7, field1230);
                    Pix3D.method173(false, 0.8D);
                    Pix3D.method168(20, -728);
                    this.method13(86, (byte) -37, "Unpacking config");
                    SeqType.method381(var4, false);
                    LocType.method328(var4);
                    FloType.method371(var4, false);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(var4, false);
                    SpotAnimType.method384(var4, false);
                    VarpType.method389(var4, false);
                    VarbitType.method387(var4, false);
                    ObjType.field1053 = field1499;
                    if (!field1500) {
                        this.method13(90, (byte) -37, "Unpacking sounds");
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(-49365, var49);
                        Wave.method318(var50, false);
                    }
                    this.method13(95, (byte) -37, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1279, this.field1280, this.field1281, this.field1282 };
                    Component.method32(var6, false, var5, var51);
                    this.method13(100, (byte) -37, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1447.field692[this.field1447.field694 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1641[var52] = var53;
                        this.field1412[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1447.field692[this.field1447.field694 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1672[var56 - 5] = var57 - 25;
                        this.field1591[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(96, 479, -49366);
                    this.field1517 = Pix3D.field665;
                    Pix3D.method166(261, 190, -49366);
                    this.field1518 = Pix3D.field665;
                    Pix3D.method166(334, 512, -49366);
                    this.field1519 = Pix3D.field665;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field663[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(7, 500, var60, 334, 800, 512);
                    WordFilter.method391(var8);
                    this.field1378 = new MouseTracking(489, this);
                    this.method12(this.field1378, 10);
                    LocEntity.field498 = this;
                    LocType.field953 = this;
                    NpcType.field1009 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1336 + " " + this.field1270);
                    this.field1680 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    private static final String method559(int arg0, byte arg1) {
        if (field1581 != arg1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(Z)V")
    public final void method560(boolean arg0) {
        if (this.field1494 == 0) {
            int var2 = super.field29;
            if (arg0) {
                this.field1442 = this.field1357.method229();
            }
            if (this.field1472 == 1 && super.field30 >= 516 && super.field31 >= 160 && super.field30 <= 765 && super.field31 <= 205) {
                var2 = 0;
            }
            if (this.field1381) {
                if (var2 != 1) {
                    int var3 = super.field23;
                    int var4 = super.field24;
                    if (this.field1586 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1586 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1586 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1587 - 10 || var3 > this.field1589 + this.field1587 + 10 || var4 < this.field1588 - 10 || var4 > this.field1590 + this.field1588 + 10) {
                        this.field1381 = false;
                        if (this.field1586 == 1) {
                            this.field1605 = true;
                        }
                        if (this.field1586 == 2) {
                            this.field1432 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1587;
                    int var6 = this.field1588;
                    int var7 = this.field1589;
                    int var8 = super.field30;
                    int var9 = super.field31;
                    if (this.field1586 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1586 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1586 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1483; ++var11) {
                        int var12 = (this.field1483 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method429((byte) 7, var10);
                    }
                    this.field1381 = false;
                    if (this.field1586 == 1) {
                        this.field1605 = true;
                    }
                    if (this.field1586 == 2) {
                        this.field1432 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1483 > 0) {
                    int var13 = this.field1470[this.field1483 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1468[this.field1483 - 1];
                        int var15 = this.field1469[this.field1483 - 1];
                        Component var16 = Component.field73[var15];
                        if (var16.field100 || var16.field103) {
                            this.field1326 = false;
                            this.field1602 = 0;
                            this.field1492 = var15;
                            this.field1493 = var14;
                            this.field1494 = 2;
                            this.field1495 = super.field30;
                            this.field1496 = super.field31;
                            if (Component.field73[var15].field79 == this.field1612) {
                                this.field1494 = 1;
                            }
                            if (Component.field73[var15].field79 == this.field1265) {
                                this.field1494 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1318 == 1 || this.method556(field1553, this.field1483 - 1)) && this.field1483 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1483 > 0) {
                    this.method429((byte) 7, this.field1483 - 1);
                }
                if (var2 != 2 || this.field1483 <= 0) {
                    return;
                }
                this.method523(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILlb;I)V")
    private final void method561(int arg0, Packet arg1, int arg2) {
        arg1.method239((byte) 7);
        if (arg2 != 0) {
            this.field1383.method219(36);
        }
        int var4 = arg1.method240(1, this.field1405);
        if (var4 != 0) {
            int var5 = arg1.method240(2, this.field1405);
            if (var5 == 0) {
                this.field1254[this.field1253++] = this.field1249;
            } else if (var5 == 1) {
                int var6 = arg1.method240(3, this.field1405);
                field1534.method111(false, false, var6);
                int var7 = arg1.method240(1, this.field1405);
                if (var7 == 1) {
                    this.field1254[this.field1253++] = this.field1249;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method240(3, this.field1405);
                field1534.method111(true, false, var8);
                int var9 = arg1.method240(3, this.field1405);
                field1534.method111(true, false, var9);
                int var10 = arg1.method240(1, this.field1405);
                if (var10 == 1) {
                    this.field1254[this.field1253++] = this.field1249;
                }
            } else if (var5 == 3) {
                this.field1542 = arg1.method240(2, this.field1405);
                int var11 = arg1.method240(7, this.field1405);
                int var12 = arg1.method240(7, this.field1405);
                int var13 = arg1.method240(1, this.field1405);
                field1534.method110(var13 == 1, 0, var11, var12);
                int var14 = arg1.method240(1, this.field1405);
                if (var14 == 1) {
                    this.field1254[this.field1253++] = this.field1249;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1594) {
            this.method512(-974);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method562(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1478[var1] = var0 / 4;
        }
        field1497 = 10;
        field1499 = true;
        field1514 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1547 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1549 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1551 = 3;
        field1581 = 8;
        field1606 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1610 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1621 = 12601;
        field1670 = -5861;
        field1671 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1671[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
