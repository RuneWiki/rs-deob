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

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1231 = -1;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1232 = -6835;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field1234 = new int[50];

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1236 = -1;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[Ljava/lang/String;")
    private String[] field1237 = new String[5];

    @OriginalMember(owner = "client", name = "R", descriptor = "[Z")
    private boolean[] field1238 = new boolean[5];

    @OriginalMember(owner = "client", name = "S", descriptor = "B")
    private byte field1239 = 69;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1243 = new int[1000];

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field1244 = new int[1000];

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Lib;")
    private Pix32[] field1249 = new Pix32[8];

    @OriginalMember(owner = "client", name = "db", descriptor = "Llb;")
    private Packet field1250 = Packet.method217(1, 0);

    @OriginalMember(owner = "client", name = "fb", descriptor = "B")
    private byte field1252 = 5;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Lob;")
    private LinkList field1254 = new LinkList(-794);

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1255 = -906;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1265 = 1;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field1266 = new int[50];

    @OriginalMember(owner = "client", name = "ub", descriptor = "B")
    private byte field1267 = 66;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1268 = -1;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1272 = 128;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    public boolean field1277 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1278 = 5;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private final int[] field1279 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field1280 = false;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private int[] field1281 = new int[100];

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[Ljava/lang/String;")
    private String[] field1282 = new String[100];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[Ljava/lang/String;")
    private String[] field1283 = new String[100];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Z")
    private boolean field1285 = false;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field1292 = true;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[Lib;")
    private Pix32[] field1293 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field1294 = new int[33];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "B")
    private byte field1295 = 1;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/lang/String;")
    private String field1296 = "";

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Ljava/lang/String;")
    private String field1297 = "";

    @OriginalMember(owner = "client", name = "Zb", descriptor = "B")
    private byte field1298 = 107;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[Z")
    private boolean[] field1299 = new boolean[5];

    @OriginalMember(owner = "client", name = "ec", descriptor = "Z")
    public boolean field1303 = true;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1304 = 26816;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[Lvb;")
    public FileStream[] field1305 = new FileStream[5];

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1308 = 3;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[Lz;")
    private NpcEntity[] field1309 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    public int[] field1311 = new int[16384];

    @OriginalMember(owner = "client", name = "nc", descriptor = "Z")
    private boolean field1312 = false;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1314 = 50;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[I")
    private int[] field1315 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private int[] field1316 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field1317 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field1318 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field1319 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[I")
    private int[] field1320 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[I")
    private int[] field1321 = new int[this.field1314];

    @OriginalMember(owner = "client", name = "xc", descriptor = "[Ljava/lang/String;")
    private String[] field1322 = new String[this.field1314];

    @OriginalMember(owner = "client", name = "zc", descriptor = "Z")
    private boolean field1324 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1327 = 16935;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1328 = -1;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field1334 = new int[4000];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    private int[] field1335 = new int[4000];

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[[[Lob;")
    private LinkList[][][] field1337 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    private int[] field1344 = new int[Stats.field1161];

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1352 = 2;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field1353 = true;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[J")
    private long[] field1360 = new long[200];

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1362 = 2048;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1363 = 2047;

    @OriginalMember(owner = "client", name = "nd", descriptor = "[Lab;")
    private PlayerEntity[] field1364 = new PlayerEntity[this.field1362];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    public int[] field1366 = new int[this.field1362];

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field1368 = new int[this.field1362];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[Llb;")
    private Packet[] field1369 = new Packet[this.field1362];

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1370 = -1;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Z")
    private boolean field1375 = false;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field1377 = false;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Z")
    private boolean field1384 = false;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Z")
    private boolean field1385 = false;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Llb;")
    private Packet field1386 = Packet.method217(1, 0);

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private boolean field1387 = true;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1393 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private boolean field1400 = false;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Ljava/lang/String;")
    private String field1401 = "";

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1403 = -1;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1404 = -1;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1412 = -521;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Ljava/lang/String;")
    private String field1413 = "";

    @OriginalMember(owner = "client", name = "le", descriptor = "Ljava/lang/String;")
    private String field1414 = "";

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1417 = 2;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1418 = -540;

    @OriginalMember(owner = "client", name = "we", descriptor = "B")
    private byte field1425 = 1;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1426 = new CRC32();

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field1431 = false;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Z")
    private boolean field1442 = false;

    @OriginalMember(owner = "client", name = "Se", descriptor = "[I")
    private int[] field1447 = new int[9];

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field1448 = new int[5];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[[I")
    private int[][] field1449 = new int[104][104];

    @OriginalMember(owner = "client", name = "We", descriptor = "[Ljava/lang/String;")
    private String[] field1451 = new String[200];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1454 = 9;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1462 = 7759444;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1469 = 417;

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field1470 = new int[151];

    @OriginalMember(owner = "client", name = "tf", descriptor = "[Ljb;")
    private Pix8[] field1473 = new Pix8[13];

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private boolean field1474 = true;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Z")
    private boolean field1480 = false;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Z")
    private boolean field1481 = false;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Z")
    private boolean field1482 = false;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private boolean field1483 = true;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field1487 = false;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1489 = -1;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1500 = -1;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Lob;")
    private LinkList field1503 = new LinkList(-794);

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1504 = new int[7];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Ljava/lang/String;")
    private String field1505 = "";

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1507 = 2;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    public int[] field1509 = new int[1000];

    @OriginalMember(owner = "client", name = "jg", descriptor = "Z")
    private boolean field1515 = false;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1519 = -1;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[Lib;")
    private Pix32[] field1528 = new Pix32[20];

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field1529 = new int[2000];

    @OriginalMember(owner = "client", name = "yg", descriptor = "Z")
    private boolean field1530 = true;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Ljava/lang/String;")
    private String field1531 = "";

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field1532 = new int[5];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field1535 = new int[5];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[J")
    private long[] field1536 = new long[100];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1537 = new int[5];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Ld;")
    private Component field1538 = new Component();

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1539 = -13424;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    private boolean field1550 = false;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[Ljb;")
    private Pix8[] field1551 = new Pix8[100];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field1555 = false;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    public int[] field1556 = new int[2000];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[I")
    private int[] field1558 = new int[Stats.field1161];

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private boolean field1559 = false;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[Ljb;")
    private Pix8[] field1560 = new Pix8[2];

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field1561 = true;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Z")
    private boolean field1564 = true;

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    private int[] field1565 = new int[256];

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1566 = true;

    @OriginalMember(owner = "client", name = "jh", descriptor = "[B")
    private byte[] field1567 = new byte[16384];

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1572 = 2301979;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1573 = -606;

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    private boolean field1577 = true;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private boolean field1578 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field1579 = new int[33];

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1582 = 1;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1583 = -1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1584 = new int[500];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field1585 = new int[500];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1586 = new int[500];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1587 = new int[500];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    private int[] field1588 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[Lib;")
    private Pix32[] field1589 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1591 = -1;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[I")
    private int[] field1593 = new int[5];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private final int field1594 = 100;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    private int[] field1595 = new int[100];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Llb;")
    private Packet field1596 = Packet.method217(1, 0);

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lob;")
    private LinkList field1599 = new LinkList(-794);

    @OriginalMember(owner = "client", name = "Xh", descriptor = "B")
    private byte field1607 = 8;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[[I")
    private int[][] field1612 = new int[104][104];

    @OriginalMember(owner = "client", name = "di", descriptor = "[[I")
    private int[][] field1613 = new int[104][104];

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1614 = true;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field1617 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1618 = -9666;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1624 = 78;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Z")
    private boolean field1634 = false;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[Ljava/lang/String;")
    private String[] field1636 = new String[500];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field1637 = new int[200];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Ljava/lang/String;")
    private String field1638 = "";

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field1639 = new int[151];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Z")
    private boolean field1640 = false;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1643 = 3353893;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1644 = -1;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private boolean field1645 = false;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1646 = -1;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[Ljc;")
    private CollisionMap[] field1647 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    private boolean field1651 = false;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field1652 = new int[50];

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1670 = 5063219;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Z")
    private boolean field1672 = true;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Z")
    private boolean field1675 = false;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[Lib;")
    private Pix32[] field1676 = new Pix32[100];

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field1683 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Ljava/lang/String;")
    private String field1685 = "";

    @OriginalMember(owner = "client", name = "yj", descriptor = "Z")
    private boolean field1686 = false;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "B")
    private byte field1694 = 6;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field1696 = new int[Stats.field1161];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1259 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Db", descriptor = "Z")
    private static boolean field1276 = true;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field1389 = 10;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Z")
    private static boolean field1391 = true;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Ljava/lang/String;")
    private static String field1430 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    public static final int[] field1450 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "rf", descriptor = "[[I")
    public static final int[][] field1471 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    private static int[] field1574 = new int[99];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private static int field1601;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1616;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[I")
    public static int[] field1673;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Z")
    private static boolean field1692;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private static int field1233;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private static int field1270;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private static int field1338;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private static int field1345;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private static int field1376;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field1394;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private static int field1402;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private static int field1411;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private static int field1443;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private static int field1444;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private static int field1557;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private static int field1568;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private static int field1575;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private static int field1602;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private static int field1635;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1671;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private static int field1693;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private static int field1695;

    @OriginalMember(owner = "client", name = "gb", descriptor = "J")
    public long field1253;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "J")
    private long field1378;

    @OriginalMember(owner = "client", name = "me", descriptor = "J")
    private long field1415;

    @OriginalMember(owner = "client", name = "Re", descriptor = "J")
    private long field1446;

    @OriginalMember(owner = "client", name = "qj", descriptor = "J")
    private long field1678;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Le;")
    private ClientStream field1485;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Lwb;")
    private Isaac field1372;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lxb;")
    private Jagfile field1484;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lfc;")
    public MouseTracking field1534;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Lub;")
    private OnDemand field1424;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Lib;")
    private Pix32 field1323;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lib;")
    private Pix32 field1396;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lib;")
    private Pix32 field1397;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Lib;")
    private Pix32 field1398;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Lib;")
    private Pix32 field1399;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lib;")
    private Pix32 field1516;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lib;")
    private Pix32 field1517;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lib;")
    private Pix32 field1562;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Lib;")
    private Pix32 field1563;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Lib;")
    private Pix32 field1570;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lib;")
    private Pix32 field1605;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Lib;")
    private Pix32 field1653;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Lib;")
    private Pix32 field1654;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Ljb;")
    private Pix8 field1379;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Ljb;")
    private Pix8 field1380;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Ljb;")
    private Pix8 field1381;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Ljb;")
    private Pix8 field1438;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Ljb;")
    private Pix8 field1439;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Ljb;")
    private Pix8 field1440;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Ljb;")
    private Pix8 field1464;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Ljb;")
    private Pix8 field1465;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ljb;")
    private Pix8 field1466;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Ljb;")
    private Pix8 field1467;

    @OriginalMember(owner = "client", name = "of", descriptor = "Ljb;")
    private Pix8 field1468;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Ljb;")
    private Pix8 field1553;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljb;")
    private Pix8 field1554;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Ljb;")
    private Pix8 field1597;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Ljb;")
    private Pix8 field1598;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Ljb;")
    private Pix8 field1655;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "Ljb;")
    private Pix8 field1656;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Ljb;")
    private Pix8 field1657;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Ljb;")
    private Pix8 field1658;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Ljb;")
    private Pix8 field1659;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Lkb;")
    private PixFont field1495;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Lkb;")
    private PixFont field1496;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lkb;")
    private PixFont field1497;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lkb;")
    private PixFont field1498;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Lqb;")
    private PixMap field1260;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Lqb;")
    private PixMap field1261;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Lqb;")
    private PixMap field1262;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Lqb;")
    private PixMap field1434;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Lqb;")
    private PixMap field1435;

    @OriginalMember(owner = "client", name = "He", descriptor = "Lqb;")
    private PixMap field1436;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Lqb;")
    private PixMap field1437;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lqb;")
    private PixMap field1541;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Lqb;")
    private PixMap field1542;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lqb;")
    private PixMap field1543;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Lqb;")
    private PixMap field1544;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lqb;")
    private PixMap field1545;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Lqb;")
    private PixMap field1546;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Lqb;")
    private PixMap field1547;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Lqb;")
    private PixMap field1548;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Lqb;")
    private PixMap field1549;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Lqb;")
    private PixMap field1661;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Lqb;")
    private PixMap field1662;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Lqb;")
    private PixMap field1663;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Lqb;")
    private PixMap field1664;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lqb;")
    private PixMap field1665;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lqb;")
    private PixMap field1666;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Lqb;")
    private PixMap field1667;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lqb;")
    private PixMap field1668;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Lqb;")
    private PixMap field1669;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lab;")
    public static PlayerEntity field1263;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Lr;")
    private World3D field1569;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Ljava/lang/String;")
    private String field1251;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Ljava/lang/String;")
    public String field1349;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Ljava/lang/String;")
    public String field1409;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Ljava/lang/String;")
    private String field1600;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljava/net/Socket;")
    private Socket field1478;

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    public static boolean field1361;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private static boolean field1388;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Z")
    private static boolean field1392;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Z")
    private static boolean field1494;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Z")
    private static boolean field1552;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Z")
    private static boolean field1633;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    public static boolean field1660;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Z")
    public static boolean field1697;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field1256;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field1427;

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field1428;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field1432;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field1433;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field1526;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field1527;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1679;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1680;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1681;

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field1682;

    @OriginalMember(owner = "client", name = "wj", descriptor = "[Ljb;")
    private Pix8[] field1684;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[[B")
    private byte[][] field1472;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[[B")
    private byte[][] field1592;

    @OriginalMember(owner = "client", name = "ic", descriptor = "[[[B")
    private byte[][][] field1307;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[[[I")
    private int[][][] field1343;

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1485 != null) {
                this.field1485.method38();
            }
        } catch (Exception var2) {
        }
        this.field1485 = null;
        this.method532((byte) -111);
        if (this.field1534 != null) {
            this.field1534.field998 = false;
        }
        this.field1534 = null;
        this.field1424.method271();
        this.field1424 = null;
        this.field1250 = null;
        this.field1386 = null;
        this.field1596 = null;
        this.field1256 = null;
        this.field1592 = null;
        this.field1472 = null;
        this.field1257 = null;
        this.field1258 = null;
        this.field1343 = null;
        this.field1307 = null;
        this.field1569 = null;
        this.field1647 = null;
        this.field1612 = null;
        this.field1449 = null;
        this.field1334 = null;
        this.field1335 = null;
        this.field1567 = null;
        this.field1434 = null;
        this.field1435 = null;
        this.field1436 = null;
        this.field1437 = null;
        this.field1260 = null;
        this.field1261 = null;
        this.field1262 = null;
        this.field1541 = null;
        this.field1542 = null;
        this.field1543 = null;
        this.field1544 = null;
        this.field1545 = null;
        this.field1546 = null;
        this.field1547 = null;
        this.field1548 = null;
        this.field1549 = null;
        this.field1379 = null;
        this.field1380 = null;
        this.field1381 = null;
        this.field1438 = null;
        this.field1439 = null;
        this.field1440 = null;
        this.field1473 = null;
        this.field1464 = null;
        this.field1465 = null;
        this.field1466 = null;
        this.field1467 = null;
        this.field1468 = null;
        this.field1655 = null;
        this.field1656 = null;
        this.field1657 = null;
        this.field1658 = null;
        this.field1659 = null;
        this.field1570 = null;
        this.field1589 = null;
        this.field1528 = null;
        this.field1249 = null;
        this.field1396 = null;
        this.field1397 = null;
        this.field1398 = null;
        this.field1399 = null;
        this.field1551 = null;
        this.field1676 = null;
        this.field1613 = null;
        this.field1364 = null;
        this.field1366 = null;
        if (arg0 == -2) {
            this.field1368 = null;
            this.field1369 = null;
            this.field1509 = null;
            this.field1309 = null;
            this.field1311 = null;
            this.field1337 = null;
            this.field1599 = null;
            this.field1503 = null;
            this.field1254 = null;
            this.field1584 = null;
            this.field1585 = null;
            this.field1586 = null;
            this.field1587 = null;
            this.field1636 = null;
            this.field1556 = null;
            this.field1243 = null;
            this.field1244 = null;
            this.field1293 = null;
            this.field1605 = null;
            this.field1451 = null;
            this.field1360 = null;
            this.field1637 = null;
            this.field1664 = null;
            this.field1665 = null;
            this.field1661 = null;
            this.field1662 = null;
            this.field1663 = null;
            this.field1666 = null;
            this.field1667 = null;
            this.field1668 = null;
            this.field1669 = null;
            this.method442(-630);
            LocType.method329((byte) 4);
            NpcType.method340((byte) 4);
            ObjType.method347((byte) 4);
            FloType.field1109 = null;
            IdkType.field1124 = null;
            Component.field73 = null;
            UnkType.field1131 = null;
            SeqType.field1144 = null;
            SpotAnimType.field1166 = null;
            SpotAnimType.field1178 = null;
            VarpType.field1193 = null;
            super.field15 = null;
            PlayerEntity.field486 = null;
            Pix3D.method164((byte) 4);
            World3D.method49((byte) 4);
            Model.method122((byte) 4);
            AnimFrame.method46((byte) 4);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method429(int arg0) {
        if (arg0 != 3) {
            this.field1330 = this.field1596.method229();
        }
        if (field1392 && this.field1642 == 2 && World.field46 != this.field1501) {
            this.field1436.method258(false);
            this.field1496.method202(257, -33071, 0, "Loading - please wait.", 151);
            this.field1496.method202(256, -33071, 16777215, "Loading - please wait.", 150);
            this.field1436.method259(4, true, 4, super.field14);
            this.field1642 = 1;
            this.field1415 = System.currentTimeMillis();
        }
        if (this.field1642 == 1) {
            int var2 = this.method430(-467);
            if (var2 != 0 && System.currentTimeMillis() - this.field1415 > 360000L) {
                signlink.reporterror(this.field1413 + " glcfb " + this.field1446 + "," + var2 + "," + field1392 + "," + this.field1305[0] + "," + this.field1424.method280() + "," + this.field1501 + "," + this.field1510 + "," + this.field1511);
                this.field1415 = System.currentTimeMillis();
            }
        }
        if (this.field1642 == 2 && this.field1519 != this.field1501) {
            this.field1519 = this.field1501;
            this.method527(false, this.field1501);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)I")
    public final int method430(int arg0) {
        for (int var2 = 0; var2 < this.field1592.length; ++var2) {
            if (this.field1592[var2] == null && this.field1257[var2] != -1) {
                return -1;
            }
            if (this.field1472[var2] == null && this.field1258[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1592.length; ++var4) {
            byte[] var5 = this.field1472[var4];
            if (var5 != null) {
                int var6 = (this.field1256[var4] >> 8) * 64 - this.field1245;
                int var7 = (this.field1256[var4] & 255) * 64 - this.field1246;
                var3 &= World.method16(var7, var6, true, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1480) {
            return -4;
        } else {
            this.field1642 = 2;
            World.field46 = this.field1501;
            this.method458(this.field1573);
            this.field1250.method218(218, 837);
            while (arg0 >= 0) {
                this.field1250.method219(14);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method431(int arg0) {
        LocType.field995.method103();
        LocType.field996.method103();
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        NpcType.field1040.method103();
        ObjType.field1093.method103();
        ObjType.field1094.method103();
        PlayerEntity.field486.method103();
        SpotAnimType.field1178.method103();
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public void method432(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1671);
        if (this.field1424 != null) {
            System.out.println("Od-cycle:" + this.field1424.field848);
        }
        System.out.println("loop-cycle:" + field1300);
        System.out.println("draw-cycle:" + field1371);
        System.out.println("ptype:" + this.field1330);
        if (arg0 >= 0) {
            this.field1255 = this.field1372.method295();
        }
        System.out.println("psize:" + this.field1329);
        if (this.field1485 != null) {
            this.field1485.method43(-56);
        }
        super.field11 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != 0) {
            this.field1250.method219(133);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field17 != null ? super.field17 : this;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method433(int arg0) {
        this.field1329 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field17 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (arg0 == 48999) {
            if (this.field1502 != 0) {
                PixFont var2 = this.field1496;
                int var3 = 0;
                if (this.field1625 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1283[var4] != null) {
                        int var5 = this.field1281[var4];
                        String var6 = this.field1282[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1540 == 0 || this.field1540 == 1 && this.method517(this.field1486, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method206(var8, 0, var9, "From", 3);
                            var2.method206(var8 - 1, 65535, var9, "From", 3);
                            int var10 = var9 + var2.method204("From ", 0);
                            if (var7 == 1) {
                                this.field1560[0].method199(var10, var8 - 12, false);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field1560[1].method199(var10, var8 - 12, false);
                                var10 += 14;
                            }
                            var2.method206(var8, 0, var10, var6 + ": " + this.field1283[var4], 3);
                            var2.method206(var8 - 1, 65535, var10, var6 + ": " + this.field1283[var4], 3);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field1540 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method206(var11, 0, 4, this.field1283[var4], 3);
                            var2.method206(var11 - 1, 65535, 4, this.field1283[var4], 3);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field1540 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method206(var12, 0, 4, "To " + var6 + ": " + this.field1283[var4], 3);
                            var2.method206(var12 - 1, 65535, 4, "To " + var6 + ": " + this.field1283[var4], 3);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public final void method13(int arg0, String arg1, boolean arg2) {
        this.field1325 = arg0;
        this.field1600 = arg1;
        this.method547(-23747);
        if (this.field1484 == null) {
            super.method13(arg0, arg1, true);
        } else {
            this.field1663.method258(false);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1497.method202(var4 / 2, -33071, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            if (!arg2) {
                field1601 = this.field1372.method295();
            }
            Pix2D.method158(34, var7, 9179409, 304, 3, var4 / 2 - 152);
            Pix2D.method158(32, var7 + 1, 0, 302, 3, var4 / 2 - 151);
            Pix2D.method157(9179409, 30, arg0 * 3, var4 / 2 - 150, var7 + 2, this.field1267);
            Pix2D.method157(0, 30, 300 - arg0 * 3, arg0 * 3 + (var4 / 2 - 150), var7 + 2, this.field1267);
            this.field1497.method202(var4 / 2, -33071, 16777215, arg1, var5 / 2 + 5 - var6);
            this.field1663.method259(171, true, 202, super.field14);
            if (this.field1675) {
                this.field1675 = false;
                if (!this.field1385) {
                    this.field1664.method259(0, true, 0, super.field14);
                    this.field1665.method259(0, true, 637, super.field14);
                }
                this.field1661.method259(0, true, 128, super.field14);
                this.field1662.method259(371, true, 202, super.field14);
                this.field1666.method259(265, true, 0, super.field14);
                this.field1667.method259(265, true, 562, super.field14);
                this.field1668.method259(171, true, 128, super.field14);
                this.field1669.method259(171, true, 562, super.field14);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method435(int arg0) {
        if (this.field1405 == 0 && this.field1346 == 0) {
            this.field1636[this.field1499] = "Walk here";
            this.field1586[this.field1499] = 718;
            this.field1584[this.field1499] = super.field22;
            this.field1585[this.field1499] = super.field23;
            ++this.field1499;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field607; ++var3) {
            int var4 = Model.field608[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1569.method80(this.field1501, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method330(var8);
                    if (var9.field992 != null) {
                        var9 = var9.method338((byte) -115);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field1405 == 1) {
                        this.field1636[this.field1499] = "Use " + this.field1409 + " with @cya@" + var9.field961;
                        this.field1586[this.field1499] = 810;
                        this.field1587[this.field1499] = var4;
                        this.field1584[this.field1499] = var5;
                        this.field1585[this.field1499] = var6;
                        ++this.field1499;
                    } else if (this.field1346 == 1) {
                        if ((this.field1348 & 4) == 4) {
                            this.field1636[this.field1499] = this.field1349 + " @cya@" + var9.field961;
                            this.field1586[this.field1499] = 899;
                            this.field1587[this.field1499] = var4;
                            this.field1584[this.field1499] = var5;
                            this.field1585[this.field1499] = var6;
                            ++this.field1499;
                        }
                    } else {
                        if (var9.field977 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field977[var10] != null) {
                                    this.field1636[this.field1499] = var9.field977[var10] + " @cya@" + var9.field961;
                                    if (var10 == 0) {
                                        this.field1586[this.field1499] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1586[this.field1499] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1586[this.field1499] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1586[this.field1499] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1586[this.field1499] = 1071;
                                    }
                                    this.field1587[this.field1499] = var4;
                                    this.field1584[this.field1499] = var5;
                                    this.field1585[this.field1499] = var6;
                                    ++this.field1499;
                                }
                            }
                        }
                        this.field1636[this.field1499] = "Examine @cya@" + var9.field961;
                        this.field1586[this.field1499] = 1381;
                        this.field1587[this.field1499] = var9.field958 << 14;
                        this.field1584[this.field1499] = var5;
                        this.field1585[this.field1499] = var6;
                        ++this.field1499;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1309[var8];
                    if (var11.field458.field1014 == 1 && (var11.field402 & 127) == 64 && (var11.field403 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1310; ++var12) {
                            NpcEntity var15 = this.field1309[this.field1311[var12]];
                            if (var15 != null && var11 != var15 && var15.field458.field1014 == 1 && var11.field402 == var15.field402 && var11.field403 == var15.field403) {
                                this.method501(var15.field458, this.field1311[var12], var6, this.field1387, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1365; ++var13) {
                            PlayerEntity var14 = this.field1364[this.field1366[var13]];
                            if (var14 != null && var11.field402 == var14.field402 && var11.field403 == var14.field403) {
                                this.method562((byte) -95, var6, var5, this.field1366[var13], var14);
                            }
                        }
                    }
                    this.method501(var11.field458, var8, var6, this.field1387, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1364[var8];
                    if ((var16.field402 & 127) == 64 && (var16.field403 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1310; ++var17) {
                            NpcEntity var20 = this.field1309[this.field1311[var17]];
                            if (var20 != null && var20.field458.field1014 == 1 && var16.field402 == var20.field402 && var16.field403 == var20.field403) {
                                this.method501(var20.field458, this.field1311[var17], var6, this.field1387, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1365; ++var18) {
                            PlayerEntity var19 = this.field1364[this.field1366[var18]];
                            if (var19 != null && var16 != var19 && var16.field402 == var19.field402 && var16.field403 == var19.field403) {
                                this.method562((byte) -95, var6, var5, this.field1366[var18], var19);
                            }
                        }
                    }
                    this.method562((byte) -95, var6, var5, var8, var16);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1337[this.field1501][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method249(true); var22 != null; var22 = (ObjStackEntity) var21.method251(320)) {
                            ObjType var23 = ObjType.method348(var22.field504);
                            if (this.field1405 == 1) {
                                this.field1636[this.field1499] = "Use " + this.field1409 + " with @lre@" + var23.field1055;
                                this.field1586[this.field1499] = 111;
                                this.field1587[this.field1499] = var22.field504;
                                this.field1584[this.field1499] = var5;
                                this.field1585[this.field1499] = var6;
                                ++this.field1499;
                            } else if (this.field1346 == 1) {
                                if ((this.field1348 & 1) == 1) {
                                    this.field1636[this.field1499] = this.field1349 + " @lre@" + var23.field1055;
                                    this.field1586[this.field1499] = 370;
                                    this.field1587[this.field1499] = var22.field504;
                                    this.field1584[this.field1499] = var5;
                                    this.field1585[this.field1499] = var6;
                                    ++this.field1499;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1069 != null && var23.field1069[var24] != null) {
                                        this.field1636[this.field1499] = var23.field1069[var24] + " @lre@" + var23.field1055;
                                        if (var24 == 0) {
                                            this.field1586[this.field1499] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1586[this.field1499] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1586[this.field1499] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1586[this.field1499] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1586[this.field1499] = 662;
                                        }
                                        this.field1587[this.field1499] = var22.field504;
                                        this.field1584[this.field1499] = var5;
                                        this.field1585[this.field1499] = var6;
                                        ++this.field1499;
                                    } else if (var24 == 2) {
                                        this.field1636[this.field1499] = "Take @lre@" + var23.field1055;
                                        this.field1586[this.field1499] = 617;
                                        this.field1587[this.field1499] = var22.field504;
                                        this.field1584[this.field1499] = var5;
                                        this.field1585[this.field1499] = var6;
                                        ++this.field1499;
                                    }
                                }
                                this.field1636[this.field1499] = "Examine @lre@" + var23.field1055;
                                this.field1586[this.field1499] = 1152;
                                this.field1587[this.field1499] = var22.field504;
                                this.field1584[this.field1499] = var5;
                                this.field1585[this.field1499] = var6;
                                ++this.field1499;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -38604) {
            this.field1337 = null;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1312) {
            this.method480(842);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public static final void method436(int arg0) {
        World3D.field288 = true;
        Pix3D.field639 = true;
        field1392 = true;
        if (arg0 < 7 || arg0 > 7) {
            field1276 = !field1276;
        }
        World.field45 = true;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    private final void method437(int arg0) {
        if (arg0 >= 0) {
            this.field1250.method219(23);
        }
        if (this.field1642 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1599.method248(); var2 != null; var2 = (LocSpawned) this.field1599.method250(true)) {
                if (var2.field741 > 0) {
                    --var2.field741;
                }
                if (var2.field741 == 0) {
                    if (var2.field734 < 0 || World.method30(262, var2.field736, var2.field734)) {
                        this.method461(var2.field731, var2.field736, -5266, var2.field733, var2.field735, var2.field734, var2.field730, var2.field732);
                        var2.method106();
                    }
                } else {
                    if (var2.field740 > 0) {
                        --var2.field740;
                    }
                    if (var2.field740 == 0 && var2.field732 >= 1 && var2.field733 >= 1 && var2.field732 <= 102 && var2.field733 <= 102 && (var2.field737 < 0 || World.method30(262, var2.field739, var2.field737))) {
                        this.method461(var2.field731, var2.field739, -5266, var2.field733, var2.field738, var2.field737, var2.field730, var2.field732);
                        var2.field740 = -1;
                        if (var2.field737 == var2.field734 && var2.field734 == -1) {
                            var2.method106();
                        } else if (var2.field737 == var2.field734 && var2.field738 == var2.field735 && var2.field739 == var2.field736) {
                            var2.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method438(boolean arg0) {
        Graphics var2 = this.method11(0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, true);
        if (arg0) {
            if (this.field1481) {
                this.field1385 = false;
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
            if (this.field1375) {
                this.field1385 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field1645) {
                this.field1385 = false;
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

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method439(int arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1503.method248();
        if (arg0 < 8 || arg0 > 8) {
            field1601 = this.field1372.method295();
        }
        while (var2 != null) {
            if (this.field1501 == var2.field509 && field1300 <= var2.field515) {
                if (field1300 >= var2.field514) {
                    if (var2.field518 > 0) {
                        NpcEntity var4 = this.field1309[var2.field518 - 1];
                        if (var4 != null && var4.field402 >= 0 && var4.field402 < 13312 && var4.field403 >= 0 && var4.field403 < 13312) {
                            var2.method120(field1300, true, this.method510(var4.field402, var4.field403, (byte) 51, var2.field509) - var2.field513, var4.field403, var4.field402);
                        }
                    }
                    if (var2.field518 < 0) {
                        int var5 = -var2.field518 - 1;
                        PlayerEntity var6;
                        if (this.field1328 == var5) {
                            var6 = field1263;
                        } else {
                            var6 = this.field1364[var5];
                        }
                        if (var6 != null && var6.field402 >= 0 && var6.field402 < 13312 && var6.field403 >= 0 && var6.field403 < 13312) {
                            var2.method120(field1300, true, this.method510(var6.field402, var6.field403, (byte) 51, var2.field509) - var2.field513, var6.field403, var6.field402);
                        }
                    }
                    var2.method121(7, this.field1477);
                    this.field1569.method61(false, this.field1501, (int) var2.field521, 60, -1, var2, (int) var2.field522, 1, var2.field528, (int) var2.field520);
                }
            } else {
                var2.method106();
            }
            var2 = (ProjectileEntity) this.field1503.method250(true);
        }
        ++field1345;
        if (field1345 > 1174) {
            field1345 = 0;
            this.field1250.method218(63, 837);
            this.field1250.method219(0);
            int var3 = this.field1250.field712;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1250.method220(11499);
            }
            this.field1250.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1250.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1250.method219(94);
            }
            this.field1250.method220(51693);
            this.field1250.method219(16);
            this.field1250.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1250.method219(65);
            }
            this.field1250.method219((int) (Math.random() * 256.0D));
            this.field1250.method220(22990);
            this.field1250.method228(1, this.field1250.field712 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method440(String arg0, String arg1, int arg2, int arg3) {
        if (arg2 == 0 && this.field1500 != -1) {
            this.field1251 = arg1;
            super.field28 = 0;
        }
        if (this.field1236 == -1) {
            this.field1683 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1281[var5] = this.field1281[var5 - 1];
            this.field1282[var5] = this.field1282[var5 - 1];
            this.field1283[var5] = this.field1283[var5 - 1];
        }
        this.field1281[0] = arg2;
        this.field1282[0] = arg0;
        if (arg3 <= 0) {
            this.field1278 = this.field1372.method295();
        }
        this.field1283[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (!this.field1645 && !this.field1481 && !this.field1375) {
            ++field1371;
            this.field1277 &= arg0;
            if (!this.field1277) {
                this.method457(-545, false);
            } else {
                this.method450((byte) 1);
            }
            this.field1641 = 0;
        } else {
            this.method438(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)V")
    public final void method441(Component arg0, int arg1) {
        int var3 = arg0.field82;
        int var4 = 32 / arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field1288;
                if (this.field1289 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg0.field114 = "";
                    arg0.field81 = 0;
                } else {
                    if (this.field1637[var3] == 0) {
                        arg0.field114 = "@red@Offline";
                    } else if (this.field1637[var3] == field1389) {
                        arg0.field114 = "@gre@World-" + (this.field1637[var3] - 9);
                    } else {
                        arg0.field114 = "@yel@World-" + (this.field1637[var3] - 9);
                    }
                    arg0.field81 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field1288;
                if (this.field1289 != 2) {
                    var7 = 0;
                }
                arg0.field92 = var7 * 15 + 20;
                if (arg0.field92 <= arg0.field84) {
                    arg0.field92 = arg0.field84 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1289 == 0) {
                    arg0.field114 = "Loading ignore list";
                    arg0.field81 = 0;
                } else if (var3 == 1 && this.field1289 == 0) {
                    arg0.field114 = "Please wait...";
                    arg0.field81 = 0;
                } else {
                    int var8 = this.field1580;
                    if (this.field1289 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg0.field114 = "";
                        arg0.field81 = 0;
                    } else {
                        arg0.field114 = JString.method304(false, JString.method301(false, this.field1536[var3]));
                        arg0.field81 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field92 = this.field1580 * 15 + 20;
                if (arg0.field92 <= arg0.field84) {
                    arg0.field92 = arg0.field84 + 1;
                }
            } else if (var3 == 327) {
                arg0.field129 = 150;
                arg0.field130 = (int) (Math.sin((double) field1300 / 40.0D) * 256.0D) & 2047;
                if (this.field1525) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field1504[var9];
                        if (var16 >= 0 && !IdkType.field1124[var16].method377(0)) {
                            return;
                        }
                    }
                    this.field1525 = false;
                    Model[] var10 = new Model[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field1504[var12];
                        if (var15 >= 0) {
                            var10[var11++] = IdkType.field1124[var15].method378((byte) 3);
                        }
                    }
                    Model var13 = new Model(var10, this.field1327, var11);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field1535[var14] != 0) {
                            var13.method140(field1471[var14][0], field1471[var14][this.field1535[var14]]);
                            if (var14 == 1) {
                                var13.method140(field1450[0], field1450[this.field1535[var14]]);
                            }
                        }
                    }
                    var13.method133(861);
                    var13.method134((byte) -54, SeqType.field1144[field1263.field407].field1146[0]);
                    var13.method143(64, 850, -30, -50, -30, true);
                    arg0.field122 = 5;
                    arg0.field123 = 0;
                    Component.method36(-677, 5, var13, 0);
                }
            } else if (var3 == 324) {
                if (this.field1653 == null) {
                    this.field1653 = arg0.field120;
                    this.field1654 = arg0.field121;
                }
                if (this.field1564) {
                    arg0.field120 = this.field1654;
                } else {
                    arg0.field120 = this.field1653;
                }
            } else if (var3 == 325) {
                if (this.field1653 == null) {
                    this.field1653 = arg0.field120;
                    this.field1654 = arg0.field121;
                }
                if (this.field1564) {
                    arg0.field120 = this.field1653;
                } else {
                    arg0.field120 = this.field1654;
                }
            } else if (var3 == 600) {
                arg0.field114 = this.field1685;
                if (field1300 % 20 < 10) {
                    arg0.field114 = arg0.field114 + "|";
                } else {
                    arg0.field114 = arg0.field114 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1395 >= 1) {
                        if (this.field1280) {
                            arg0.field116 = 16711680;
                            arg0.field114 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field116 = 16777215;
                            arg0.field114 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field114 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1518 != 0) {
                        String var17;
                        if (this.field1463 == 0) {
                            var17 = "earlier today";
                        } else if (this.field1463 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field1463 + " days ago";
                        }
                        arg0.field114 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg0.field114 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1590 == 0) {
                        arg0.field114 = "0 unread messages";
                        arg0.field116 = 16776960;
                    }
                    if (this.field1590 == 1) {
                        arg0.field114 = "1 unread message";
                        arg0.field116 = 65280;
                    }
                    if (this.field1590 > 1) {
                        arg0.field114 = this.field1590 + " unread messages";
                        arg0.field116 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1690 == 201) {
                        if (this.field1342 == 1) {
                            arg0.field114 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field114 = "";
                        }
                    } else if (this.field1690 == 200) {
                        arg0.field114 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field1690 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field1690 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field1690 + " days ago";
                        }
                        arg0.field114 = var18 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1690 == 201) {
                        if (this.field1342 == 1) {
                            arg0.field114 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field114 = "";
                        }
                    } else if (this.field1690 == 200) {
                        arg0.field114 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field114 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1690 == 201) {
                        if (this.field1342 == 1) {
                            arg0.field114 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field114 = "";
                        }
                    } else if (this.field1690 == 200) {
                        arg0.field114 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field114 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1289 == 0) {
            arg0.field114 = "Loading friend list";
            arg0.field81 = 0;
        } else if (var3 == 1 && this.field1289 == 1) {
            arg0.field114 = "Connecting to friendserver";
            arg0.field81 = 0;
        } else if (var3 == 2 && this.field1289 != 2) {
            arg0.field114 = "Please wait...";
            arg0.field81 = 0;
        } else {
            int var5 = this.field1288;
            if (this.field1289 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg0.field114 = "";
                arg0.field81 = 0;
            } else {
                arg0.field114 = this.field1451[var3];
                arg0.field81 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method442(int arg0) {
        this.field1385 = false;
        while (this.field1431) {
            this.field1385 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1553 = null;
        this.field1554 = null;
        this.field1684 = null;
        this.field1679 = null;
        this.field1680 = null;
        this.field1681 = null;
        this.field1682 = null;
        this.field1526 = null;
        this.field1527 = null;
        while (arg0 >= 0) {
            this.field1269 = this.field1372.method295();
        }
        this.field1432 = null;
        this.field1433 = null;
        this.field1562 = null;
        this.field1563 = null;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method443(boolean arg0) {
        if (arg0) {
            for (int var2 = 0; var2 < this.field1310; ++var2) {
                int var3 = this.field1311[var2];
                NpcEntity var4 = this.field1309[var3];
                if (var4 != null) {
                    this.method444(-43008, var4.field458.field1014, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILy;)V")
    public final void method444(int arg0, int arg1, PathingEntity arg2) {
        if (arg2.field402 < 128 || arg2.field403 < 128 || arg2.field402 >= 13184 || arg2.field403 >= 13184) {
            arg2.field430 = -1;
            arg2.field435 = -1;
            arg2.field444 = 0;
            arg2.field445 = 0;
            arg2.field402 = arg2.field452[0] * 128 + arg2.field406 * 64;
            arg2.field403 = arg2.field453[0] * 128 + arg2.field406 * 64;
            arg2.method112(0);
        }
        if (field1263 == arg2 && (arg2.field402 < 1536 || arg2.field403 < 1536 || arg2.field402 >= 11776 || arg2.field403 >= 11776)) {
            arg2.field430 = -1;
            arg2.field435 = -1;
            arg2.field444 = 0;
            arg2.field445 = 0;
            arg2.field402 = arg2.field452[0] * 128 + arg2.field406 * 64;
            arg2.field403 = arg2.field453[0] * 128 + arg2.field406 * 64;
            arg2.method112(0);
        }
        if (arg2.field444 > field1300) {
            this.method445(0, arg2);
        } else if (arg2.field445 >= field1300) {
            this.method446(7, arg2);
        } else {
            this.method447(arg2, 113);
        }
        this.method448(arg2, 11971);
        if (arg0 != -43008) {
            this.field1573 = -289;
        }
        this.method449((byte) 104, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method445(int arg0, PathingEntity arg1) {
        int var3 = arg1.field444 - field1300;
        int var4 = arg1.field440 * 128 + arg1.field406 * 64;
        int var5 = arg1.field442 * 128 + arg1.field406 * 64;
        arg1.field402 += (var4 - arg1.field402) / var3;
        arg1.field403 += (var5 - arg1.field403) / var3;
        this.field1329 += arg0;
        arg1.field455 = 0;
        if (arg1.field446 == 0) {
            arg1.field449 = 1024;
        }
        if (arg1.field446 == 1) {
            arg1.field449 = 1536;
        }
        if (arg1.field446 == 2) {
            arg1.field449 = 0;
        }
        if (arg1.field446 == 3) {
            arg1.field449 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILy;)V")
    public final void method446(int arg0, PathingEntity arg1) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1330 = -1;
        }
        if (field1300 == arg1.field445 || arg1.field430 == -1 || arg1.field433 != 0 || arg1.field432 + 1 > SeqType.field1144[arg1.field430].method382(arg1.field431, -86)) {
            int var3 = arg1.field445 - arg1.field444;
            int var4 = field1300 - arg1.field444;
            int var5 = arg1.field440 * 128 + arg1.field406 * 64;
            int var6 = arg1.field442 * 128 + arg1.field406 * 64;
            int var7 = arg1.field441 * 128 + arg1.field406 * 64;
            int var8 = arg1.field443 * 128 + arg1.field406 * 64;
            arg1.field402 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field403 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field455 = 0;
        if (arg1.field446 == 0) {
            arg1.field449 = 1024;
        }
        if (arg1.field446 == 1) {
            arg1.field449 = 1536;
        }
        if (arg1.field446 == 2) {
            arg1.field449 = 0;
        }
        if (arg1.field446 == 3) {
            arg1.field449 = 512;
        }
        arg1.field404 = arg1.field449;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method447(PathingEntity arg0, int arg1) {
        arg0.field427 = arg0.field407;
        if (arg0.field451 == 0) {
            arg0.field455 = 0;
        } else {
            if (arg0.field430 != -1 && arg0.field433 == 0) {
                SeqType var3 = SeqType.field1144[arg0.field430];
                if (arg0.field456 > 0 && var3.field1156 == 0) {
                    ++arg0.field455;
                    return;
                }
                if (arg0.field456 <= 0 && var3.field1157 == 0) {
                    ++arg0.field455;
                    return;
                }
            }
            int var4 = arg0.field402;
            int var5 = arg0.field403;
            int var6 = arg0.field452[arg0.field451 - 1] * 128 + arg0.field406 * 64;
            int var7 = arg0.field453[arg0.field451 - 1] * 128 + arg0.field406 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field449 = 1280;
                    } else if (var5 > var7) {
                        arg0.field449 = 1792;
                    } else {
                        arg0.field449 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field449 = 768;
                    } else if (var5 > var7) {
                        arg0.field449 = 256;
                    } else {
                        arg0.field449 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field449 = 1024;
                } else {
                    arg0.field449 = 0;
                }
                int var8 = arg0.field449 - arg0.field404 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field410;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field409;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field412;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field411;
                }
                if (var9 == -1) {
                    var9 = arg0.field409;
                }
                arg0.field427 = var9;
                int var10 = 40 / arg1;
                int var11 = 4;
                if (arg0.field449 != arg0.field404 && arg0.field424 == -1 && arg0.field450 != 0) {
                    var11 = 2;
                }
                if (arg0.field451 > 2) {
                    var11 = 6;
                }
                if (arg0.field451 > 3) {
                    var11 = 8;
                }
                if (arg0.field455 > 0 && arg0.field451 > 1) {
                    var11 = 8;
                    --arg0.field455;
                }
                if (arg0.field454[arg0.field451 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg0.field427 == arg0.field409 && arg0.field413 != -1) {
                    arg0.field427 = arg0.field413;
                }
                if (var4 < var6) {
                    arg0.field402 += var11;
                    if (arg0.field402 > var6) {
                        arg0.field402 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field402 -= var11;
                    if (arg0.field402 < var6) {
                        arg0.field402 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field403 += var11;
                    if (arg0.field403 > var7) {
                        arg0.field403 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field403 -= var11;
                    if (arg0.field403 < var7) {
                        arg0.field403 = var7;
                    }
                }
                if (arg0.field402 == var6 && arg0.field403 == var7) {
                    --arg0.field451;
                    if (arg0.field456 > 0) {
                        --arg0.field456;
                        return;
                    }
                }
            } else {
                arg0.field402 = var6;
                arg0.field403 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method448(PathingEntity arg0, int arg1) {
        if (arg1 != 11971) {
            field1601 = this.field1372.method295();
        }
        if (arg0.field450 != 0) {
            if (arg0.field424 != -1 && arg0.field424 < 32768) {
                NpcEntity var3 = this.field1309[arg0.field424];
                if (var3 != null) {
                    int var4 = arg0.field402 - var3.field402;
                    int var5 = arg0.field403 - var3.field403;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field449 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field424 >= 32768) {
                int var6 = arg0.field424 - 32768;
                if (this.field1328 == var6) {
                    var6 = this.field1363;
                }
                PlayerEntity var7 = this.field1364[var6];
                if (var7 != null) {
                    int var8 = arg0.field402 - var7.field402;
                    int var9 = arg0.field403 - var7.field403;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field449 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field425 != 0 || arg0.field426 != 0) && (arg0.field451 == 0 || arg0.field455 > 0)) {
                int var10 = arg0.field402 - (arg0.field425 - this.field1245 - this.field1245) * 64;
                int var11 = arg0.field403 - (arg0.field426 - this.field1246 - this.field1246) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field449 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field425 = 0;
                arg0.field426 = 0;
            }
            int var12 = arg0.field449 - arg0.field404 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field450 && var12 <= 2048 - arg0.field450) {
                    if (var12 > 1024) {
                        arg0.field404 -= arg0.field450;
                    } else {
                        arg0.field404 += arg0.field450;
                    }
                } else {
                    arg0.field404 = arg0.field449;
                }
                arg0.field404 &= 2047;
                if (arg0.field427 == arg0.field407 && arg0.field449 != arg0.field404) {
                    if (arg0.field408 != -1) {
                        arg0.field427 = arg0.field408;
                        return;
                    }
                    arg0.field427 = arg0.field409;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLy;)V")
    public final void method449(byte arg0, PathingEntity arg1) {
        if (arg0 != 104) {
            this.field1232 = -118;
        }
        arg1.field405 = false;
        if (arg1.field427 != -1) {
            SeqType var3 = SeqType.field1144[arg1.field427];
            ++arg1.field429;
            if (arg1.field428 < var3.field1145 && arg1.field429 > var3.method382(arg1.field428, -86)) {
                arg1.field429 = 0;
                ++arg1.field428;
            }
            if (arg1.field428 >= var3.field1145) {
                arg1.field429 = 0;
                arg1.field428 = 0;
            }
        }
        if (arg1.field435 != -1 && field1300 >= arg1.field438) {
            if (arg1.field436 < 0) {
                arg1.field436 = 0;
            }
            SeqType var4 = SpotAnimType.field1166[arg1.field435].field1170;
            ++arg1.field437;
            while (arg1.field436 < var4.field1145 && arg1.field437 > var4.method382(arg1.field436, -86)) {
                arg1.field437 -= var4.method382(arg1.field436, -86);
                ++arg1.field436;
            }
            if (arg1.field436 >= var4.field1145 && (arg1.field436 < 0 || arg1.field436 >= var4.field1145)) {
                arg1.field435 = -1;
            }
        }
        if (arg1.field430 != -1 && arg1.field433 <= 1) {
            SeqType var5 = SeqType.field1144[arg1.field430];
            if (var5.field1156 == 1 && arg1.field456 > 0 && arg1.field444 <= field1300 && arg1.field445 < field1300) {
                arg1.field433 = 1;
                return;
            }
        }
        if (arg1.field430 != -1 && arg1.field433 == 0) {
            SeqType var6 = SeqType.field1144[arg1.field430];
            ++arg1.field432;
            while (arg1.field431 < var6.field1145 && arg1.field432 > var6.method382(arg1.field431, -86)) {
                arg1.field432 -= var6.method382(arg1.field431, -86);
                ++arg1.field431;
            }
            if (arg1.field431 >= var6.field1145) {
                arg1.field431 -= var6.field1149;
                ++arg1.field434;
                if (arg1.field434 >= var6.field1155) {
                    arg1.field430 = -1;
                }
                if (arg1.field431 < 0 || arg1.field431 >= var6.field1145) {
                    arg1.field430 = -1;
                }
            }
            arg1.field405 = var6.field1151;
        }
        if (arg1.field433 > 0) {
            --arg1.field433;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method450(byte arg0) {
        if (this.field1675) {
            this.field1675 = false;
            this.field1541.method259(4, true, 0, super.field14);
            this.field1542.method259(357, true, 0, super.field14);
            this.field1543.method259(4, true, 722, super.field14);
            this.field1544.method259(205, true, 743, super.field14);
            this.field1545.method259(0, true, 0, super.field14);
            this.field1546.method259(4, true, 516, super.field14);
            this.field1547.method259(205, true, 516, super.field14);
            this.field1548.method259(357, true, 496, super.field14);
            this.field1549.method259(338, true, 0, super.field14);
            this.field1634 = true;
            this.field1683 = true;
            this.field1377 = true;
            this.field1559 = true;
            if (this.field1642 != 2) {
                this.field1436.method259(4, true, 4, super.field14);
                this.field1435.method259(4, true, 550, super.field14);
            }
        }
        if (this.field1642 == 2) {
            this.method536(0);
        }
        if (this.field1578 && this.field1457 == 1) {
            this.field1634 = true;
        }
        if (this.field1489 != -1) {
            boolean var2 = this.method557(1, this.field1477, this.field1489);
            if (var2) {
                this.field1634 = true;
            }
        }
        if (this.field1611 == 2) {
            this.field1634 = true;
        }
        if (this.field1630 == 2) {
            this.field1634 = true;
        }
        if (this.field1634) {
            this.method534((byte) 3);
            this.field1634 = false;
        }
        if (this.field1236 == -1) {
            this.field1538.field93 = this.field1624 - this.field1441 - 77;
            if (super.field22 > 448 && super.field22 < 560 && super.field23 > 332) {
                this.method473(this.field1624, 0, super.field23 - 357, super.field22 - 17, 77, this.field1445, this.field1538, false, 463);
            }
            int var3 = this.field1624 - 77 - this.field1538.field93;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1624 - 77) {
                var3 = this.field1624 - 77;
            }
            if (this.field1441 != var3) {
                this.field1441 = var3;
                this.field1683 = true;
            }
        }
        if (this.field1236 != -1) {
            boolean var4 = this.method557(1, this.field1477, this.field1236);
            if (var4) {
                this.field1683 = true;
            }
        }
        if (this.field1611 == 3) {
            this.field1683 = true;
        }
        if (this.field1630 == 3) {
            this.field1683 = true;
        }
        if (this.field1251 != null) {
            this.field1683 = true;
        }
        if (this.field1578 && this.field1457 == 2) {
            this.field1683 = true;
        }
        if (this.field1683) {
            this.method550(0);
            this.field1683 = false;
        }
        if (this.field1642 == 2) {
            this.method500(false);
            this.field1435.method259(4, true, 550, super.field14);
        }
        if (this.field1644 != -1) {
            this.field1377 = true;
        }
        if (this.field1377) {
            if (this.field1644 != -1 && this.field1644 == this.field1308) {
                this.field1644 = -1;
                this.field1250.method218(53, 837);
                this.field1250.method219(this.field1308);
            }
            this.field1377 = false;
            this.field1262.method258(false);
            this.field1440.method199(0, 0, false);
            if (this.field1489 == -1) {
                if (this.field1393[this.field1308] != -1) {
                    if (this.field1308 == 0) {
                        this.field1464.method199(22, 10, false);
                    }
                    if (this.field1308 == 1) {
                        this.field1465.method199(54, 8, false);
                    }
                    if (this.field1308 == 2) {
                        this.field1465.method199(82, 8, false);
                    }
                    if (this.field1308 == 3) {
                        this.field1466.method199(110, 8, false);
                    }
                    if (this.field1308 == 4) {
                        this.field1468.method199(153, 8, false);
                    }
                    if (this.field1308 == 5) {
                        this.field1468.method199(181, 8, false);
                    }
                    if (this.field1308 == 6) {
                        this.field1467.method199(209, 9, false);
                    }
                }
                if (this.field1393[0] != -1 && (this.field1644 != 0 || field1300 % 20 < 10)) {
                    this.field1473[0].method199(29, 13, false);
                }
                if (this.field1393[1] != -1 && (this.field1644 != 1 || field1300 % 20 < 10)) {
                    this.field1473[1].method199(53, 11, false);
                }
                if (this.field1393[2] != -1 && (this.field1644 != 2 || field1300 % 20 < 10)) {
                    this.field1473[2].method199(82, 11, false);
                }
                if (this.field1393[3] != -1 && (this.field1644 != 3 || field1300 % 20 < 10)) {
                    this.field1473[3].method199(115, 12, false);
                }
                if (this.field1393[4] != -1 && (this.field1644 != 4 || field1300 % 20 < 10)) {
                    this.field1473[4].method199(153, 13, false);
                }
                if (this.field1393[5] != -1 && (this.field1644 != 5 || field1300 % 20 < 10)) {
                    this.field1473[5].method199(180, 11, false);
                }
                if (this.field1393[6] != -1 && (this.field1644 != 6 || field1300 % 20 < 10)) {
                    this.field1473[6].method199(208, 13, false);
                }
            }
            this.field1262.method259(160, true, 516, super.field14);
            this.field1261.method258(false);
            this.field1439.method199(0, 0, false);
            if (this.field1489 == -1) {
                if (this.field1393[this.field1308] != -1) {
                    if (this.field1308 == 7) {
                        this.field1655.method199(42, 0, false);
                    }
                    if (this.field1308 == 8) {
                        this.field1656.method199(74, 0, false);
                    }
                    if (this.field1308 == 9) {
                        this.field1656.method199(102, 0, false);
                    }
                    if (this.field1308 == 10) {
                        this.field1657.method199(130, 1, false);
                    }
                    if (this.field1308 == 11) {
                        this.field1659.method199(173, 0, false);
                    }
                    if (this.field1308 == 12) {
                        this.field1659.method199(201, 0, false);
                    }
                    if (this.field1308 == 13) {
                        this.field1658.method199(229, 0, false);
                    }
                }
                if (this.field1393[8] != -1 && (this.field1644 != 8 || field1300 % 20 < 10)) {
                    this.field1473[7].method199(74, 2, false);
                }
                if (this.field1393[9] != -1 && (this.field1644 != 9 || field1300 % 20 < 10)) {
                    this.field1473[8].method199(102, 3, false);
                }
                if (this.field1393[10] != -1 && (this.field1644 != 10 || field1300 % 20 < 10)) {
                    this.field1473[9].method199(137, 4, false);
                }
                if (this.field1393[11] != -1 && (this.field1644 != 11 || field1300 % 20 < 10)) {
                    this.field1473[10].method199(174, 2, false);
                }
                if (this.field1393[12] != -1 && (this.field1644 != 12 || field1300 % 20 < 10)) {
                    this.field1473[11].method199(201, 2, false);
                }
                if (this.field1393[13] != -1 && (this.field1644 != 13 || field1300 % 20 < 10)) {
                    this.field1473[12].method199(226, 2, false);
                }
            }
            this.field1261.method259(466, true, 496, super.field14);
            this.field1436.method258(false);
        }
        if (this.field1559) {
            this.field1559 = false;
            this.field1260.method258(false);
            this.field1438.method199(0, 0, false);
            this.field1496.method203(55, true, 16777215, "Public chat", 28, -836);
            if (this.field1240 == 0) {
                this.field1496.method203(55, true, 65280, "On", 41, -836);
            }
            if (this.field1240 == 1) {
                this.field1496.method203(55, true, 16776960, "Friends", 41, -836);
            }
            if (this.field1240 == 2) {
                this.field1496.method203(55, true, 16711680, "Off", 41, -836);
            }
            if (this.field1240 == 3) {
                this.field1496.method203(55, true, 65535, "Hide", 41, -836);
            }
            this.field1496.method203(184, true, 16777215, "Private chat", 28, -836);
            if (this.field1540 == 0) {
                this.field1496.method203(184, true, 65280, "On", 41, -836);
            }
            if (this.field1540 == 1) {
                this.field1496.method203(184, true, 16776960, "Friends", 41, -836);
            }
            if (this.field1540 == 2) {
                this.field1496.method203(184, true, 16711680, "Off", 41, -836);
            }
            this.field1496.method203(324, true, 16777215, "Trade/compete", 28, -836);
            if (this.field1410 == 0) {
                this.field1496.method203(324, true, 65280, "On", 41, -836);
            }
            if (this.field1410 == 1) {
                this.field1496.method203(324, true, 16776960, "Friends", 41, -836);
            }
            if (this.field1410 == 2) {
                this.field1496.method203(324, true, 16711680, "Off", 41, -836);
            }
            this.field1496.method203(458, true, 16777215, "Report abuse", 33, -836);
            this.field1260.method259(453, true, 0, super.field14);
            this.field1436.method258(false);
        }
        this.field1477 = 0;
        if (arg0 != 1) {
            this.field1250.method219(130);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method451(boolean arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1254.method248();
        if (arg0) {
            this.field1442 = !this.field1442;
        }
        while (var2 != null) {
            if (this.field1501 == var2.field616 && !var2.field622) {
                if (field1300 >= var2.field615) {
                    var2.method151((byte) -24, this.field1477);
                    if (var2.field622) {
                        var2.method106();
                    } else {
                        this.field1569.method61(false, var2.field616, var2.field618, 60, -1, var2, var2.field619, 1, 0, var2.field617);
                    }
                }
            } else {
                var2.method106();
            }
            var2 = (SpotAnimEntity) this.field1254.method250(true);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method452(boolean arg0) {
        if (this.field1333 > 0) {
            this.method554(this.field1607);
        } else {
            this.field1436.method258(false);
            this.field1496.method202(257, -33071, 0, "Connection lost", 144);
            this.field1496.method202(256, -33071, 16777215, "Connection lost", 143);
            this.field1496.method202(257, -33071, 0, "Please wait - attempting to reestablish", 159);
            this.field1496.method202(256, -33071, 16777215, "Please wait - attempting to reestablish", 158);
            this.field1436.method259(4, true, 4, super.field14);
            this.field1284 = 0;
            this.field1603 = 0;
            if (arg0) {
                field1388 = !field1388;
            }
            ClientStream var2 = this.field1485;
            this.field1277 = false;
            this.method490(this.field1413, this.field1414, true);
            if (!this.field1277) {
                this.method554(this.field1607);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILnb;)V")
    private final void method453(int arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field731 == 0) {
            var3 = this.field1569.method76(arg1.field730, arg1.field732, arg1.field733);
        }
        if (arg1.field731 == 1) {
            var3 = this.field1569.method77(192, arg1.field732, arg1.field733, arg1.field730);
        }
        if (arg1.field731 == 2) {
            var3 = this.field1569.method78(arg1.field730, arg1.field732, arg1.field733);
        }
        if (arg1.field731 == 3) {
            var3 = this.field1569.method79(arg1.field730, arg1.field732, arg1.field733);
        }
        if (var3 != 0) {
            int var7 = this.field1569.method80(arg1.field730, arg1.field732, arg1.field733, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field734 = var4;
        arg1.field736 = var5;
        if (arg0 != 26816) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        arg1.field735 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;I)Lxb;")
    public final Jagfile method454(int arg0, int arg1, int arg2, String arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1305[0] != null) {
                var7 = this.field1305[0].method291(false, arg5);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1426.reset();
            this.field1426.update(var7);
            int var9 = (int) this.field1426.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, 44340);
        } else {
            int var11 = 0;
            if (arg1 >= 0) {
                throw new NullPointerException();
            } else {
                while (var7 == null) {
                    String var12 = "Unknown error";
                    this.method13(arg0, "Requesting " + arg4, true);
                    Object var13 = null;
                    try {
                        int var14 = 0;
                        DataInputStream var15 = this.method463(arg3 + arg2);
                        byte[] var16 = new byte[6];
                        var15.readFully(var16, 0, 6);
                        Packet var17 = new Packet(var16, field1388);
                        var17.field712 = 3;
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
                                this.method13(arg0, "Loading " + arg4 + " - " + var23 + "%", true);
                            }
                            var14 = var23;
                        }
                        var15.close();
                        try {
                            if (this.field1305[0] != null) {
                                this.field1305[0].method292(var7.length, arg5, 0, var7);
                            }
                        } catch (Exception var29) {
                            this.field1305[0] = null;
                        }
                        if (var7 != null) {
                            this.field1426.reset();
                            this.field1426.update(var7);
                            int var24 = (int) this.field1426.getValue();
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
                                this.method13(arg0, "Game updated - please reload page", true);
                                var26 = 10;
                            } else {
                                this.method13(arg0, var12 + " - Retrying in " + var26, true);
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
                        this.field1487 = !this.field1487;
                    }
                }
                return new Jagfile(var7, 44340);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method455(int arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field713 + 21 < arg0 * 8) {
                int var4 = arg2.method240(14, 45621);
                if (var4 != 16383) {
                    if (this.field1309[var4] == null) {
                        this.field1309[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1309[var4];
                    this.field1311[this.field1310++] = var4;
                    var5.field447 = field1300;
                    var5.field458 = NpcType.method341(arg2.method240(12, 45621));
                    var5.field406 = var5.field458.field1014;
                    var5.field450 = var5.field458.field1036;
                    var5.field409 = var5.field458.field1018;
                    var5.field410 = var5.field458.field1019;
                    var5.field411 = var5.field458.field1020;
                    var5.field412 = var5.field458.field1021;
                    var5.field407 = var5.field458.field1017;
                    int var6 = arg2.method240(5, 45621);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method240(5, 45621);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method240(1, 45621);
                    var5.method110(field1263.field452[0] + var6, var8 == 1, 1, field1263.field453[0] + var7);
                    int var9 = arg2.method240(1, 45621);
                    if (var9 == 1) {
                        this.field1368[this.field1367++] = var4;
                    }
                    continue;
                }
            }
            arg2.method241((byte) 0);
            int var10 = 96 / arg1;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method456(byte arg0) {
        if (arg0 != 5) {
            this.field1539 = this.field1372.method295();
        }
        if (super.field28 == 1) {
            if (super.field29 >= 6 && super.field29 <= 106 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1240 = (this.field1240 + 1) % 4;
                this.field1559 = true;
                this.field1683 = true;
                this.field1250.method218(158, 837);
                this.field1250.method219(this.field1240);
                this.field1250.method219(this.field1540);
                this.field1250.method219(this.field1410);
            }
            if (super.field29 >= 135 && super.field29 <= 235 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1540 = (this.field1540 + 1) % 3;
                this.field1559 = true;
                this.field1683 = true;
                this.field1250.method218(158, 837);
                this.field1250.method219(this.field1240);
                this.field1250.method219(this.field1540);
                this.field1250.method219(this.field1410);
            }
            if (super.field29 >= 273 && super.field29 <= 373 && super.field30 >= 467 && super.field30 <= 499) {
                this.field1410 = (this.field1410 + 1) % 3;
                this.field1559 = true;
                this.field1683 = true;
                this.field1250.method218(158, 837);
                this.field1250.method219(this.field1240);
                this.field1250.method219(this.field1540);
                this.field1250.method219(this.field1410);
            }
            if (super.field29 >= 412 && super.field29 <= 512 && super.field30 >= 467 && super.field30 <= 499) {
                if (this.field1268 == -1) {
                    this.method482(true);
                    this.field1685 = "";
                    this.field1280 = false;
                    for (int var2 = 0; var2 < Component.field73.length; ++var2) {
                        if (Component.field73[var2] != null && Component.field73[var2].field82 == 600) {
                            this.field1370 = this.field1268 = Component.field73[var2].field79;
                            return;
                        }
                    }
                    return;
                }
                this.method440("", "Please close the interface you have open before using 'report abuse'", 0, 811);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method457(int arg0, boolean arg1) {
        this.method547(-23747);
        this.field1663.method258(false);
        if (arg0 >= 0) {
            this.field1250.method219(229);
        }
        this.field1553.method199(0, 0, false);
        short var3 = 360;
        short var4 = 200;
        if (this.field1479 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1495.method203(var3 / 2, true, 7711145, this.field1424.field833, var5, -836);
            int var6 = var4 / 2 - 20;
            this.field1497.method203(var3 / 2, true, 16776960, "Welcome to RuneScape", var6, -836);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1554.method199(var7 - 73, var8 - 20, false);
            this.field1497.method203(var7, true, 16777215, "New User", var8 + 5, -836);
            int var9 = var3 / 2 + 80;
            this.field1554.method199(var9 - 73, var8 - 20, false);
            this.field1497.method203(var9, true, 16777215, "Existing User", var8 + 5, -836);
        }
        if (this.field1479 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1296.length() > 0) {
                this.field1497.method203(var3 / 2, true, 16776960, this.field1296, var10 - 15, -836);
                this.field1497.method203(var3 / 2, true, 16776960, this.field1297, var10, -836);
                var10 += 30;
            } else {
                this.field1497.method203(var3 / 2, true, 16776960, this.field1297, var10 - 7, -836);
                var10 += 30;
            }
            this.field1497.method210(16777215, var3 / 2 - 90, true, var10, "Username: " + this.field1413 + (this.field1341 == 0 & field1300 % 40 < 20 ? "@yel@|" : ""), 1);
            var10 += 15;
            this.field1497.method210(16777215, var3 / 2 - 88, true, var10, "Password: " + JString.method305((byte) 1, this.field1414) + (this.field1341 == 1 & field1300 % 40 < 20 ? "@yel@|" : ""), 1);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1554.method199(var11 - 73, var12 - 20, false);
                this.field1497.method203(var11, true, 16777215, "Login", var12 + 5, -836);
                int var13 = var3 / 2 + 80;
                this.field1554.method199(var13 - 73, var12 - 20, false);
                this.field1497.method203(var13, true, 16777215, "Cancel", var12 + 5, -836);
            }
        }
        if (this.field1479 == 3) {
            this.field1497.method203(var3 / 2, true, 16776960, "Create a free account", var4 / 2 - 60, -836);
            int var14 = var4 / 2 - 35;
            this.field1497.method203(var3 / 2, true, 16777215, "To create a new account you need to", var14, -836);
            int var18 = var14 + 15;
            this.field1497.method203(var3 / 2, true, 16777215, "go back to the main RuneScape webpage", var18, -836);
            int var19 = var18 + 15;
            this.field1497.method203(var3 / 2, true, 16777215, "and choose the red 'create account'", var19, -836);
            int var20 = var19 + 15;
            this.field1497.method203(var3 / 2, true, 16777215, "button at the top right of that page.", var20, -836);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1554.method199(var15 - 73, var16 - 20, false);
            this.field1497.method203(var15, true, 16777215, "Cancel", var16 + 5, -836);
        }
        this.field1663.method259(171, true, 202, super.field14);
        if (this.field1675) {
            this.field1675 = false;
            this.field1661.method259(0, true, 128, super.field14);
            this.field1662.method259(371, true, 202, super.field14);
            this.field1666.method259(265, true, 0, super.field14);
            this.field1667.method259(265, true, 562, super.field14);
            this.field1668.method259(171, true, 128, super.field14);
            this.field1669.method259(171, true, 562, super.field14);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method458(int arg0) {
        try {
            this.field1519 = -1;
            this.field1254.method252();
            this.field1503.method252();
            Pix3D.method167(-21028);
            this.method431(0);
            this.field1569.method50(712);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1647[var2].method359(false);
            }
            System.gc();
            World var3 = new World(this.field1307, true, 104, 104, this.field1343);
            int var4 = this.field1592.length;
            World.field45 = World3D.field288;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1256[var5] >> 8;
                int var7 = this.field1256[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field45 = false;
                }
            }
            if (World.field45) {
                this.field1569.method51(this.field1501, 4);
            } else {
                this.field1569.method51(0, 4);
            }
            this.field1250.method218(146, 837);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1256[var8] >> 8) * 64 - this.field1245;
                int var10 = (this.field1256[var8] & 255) * 64 - this.field1246;
                byte[] var11 = this.field1592[var8];
                if (var11 != null) {
                    var3.method15(var11, var10, (this.field1511 - 6) * 8, 0, (this.field1510 - 6) * 8, var9);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1256[var12] >> 8) * 64 - this.field1245;
                int var14 = (this.field1256[var12] & 255) * 64 - this.field1246;
                byte[] var15 = this.field1592[var12];
                if (var15 == null && this.field1511 < 800) {
                    var3.method14(64, var13, 64, this.field1550, var14);
                }
            }
            this.field1250.method218(146, 837);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1472[var16];
                if (var17 != null) {
                    int var18 = (this.field1256[var16] >> 8) * 64 - this.field1245;
                    int var19 = (this.field1256[var16] & 255) * 64 - this.field1246;
                    var3.method18(this.field1569, var17, -808, var18, var19, this.field1647);
                }
            }
            this.field1250.method218(146, 837);
            var3.method20(true, this.field1647, this.field1569);
            this.field1436.method258(false);
            this.field1250.method218(146, 837);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method511(var20, var21);
                }
            }
            this.method531(false);
        } catch (Exception var35) {
        }
        LocType.field995.method103();
        if (field1392 && signlink.cache_dat != null) {
            int var23 = this.field1424.method272(2136, 0);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1424.method277(var24, 3);
                if ((var25 & 121) == 0) {
                    Model.method125(10308, var24);
                }
            }
        }
        System.gc();
        Pix3D.method168(20, true);
        this.field1424.method283(false);
        int var26 = (this.field1510 - 6) / 8 - 1;
        int var27 = (this.field1510 + 6) / 8 + 1;
        int var28 = (this.field1511 - 6) / 8 - 1;
        int var29 = (this.field1511 + 6) / 8 + 1;
        if (arg0 >= 0) {
            for (int var30 = 1; var30 > 0; ++var30) {
            }
        }
        if (this.field1555) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var31 = var26; var31 <= var27; ++var31) {
            for (int var32 = var28; var32 <= var29; ++var32) {
                if (var26 == var31 || var27 == var31 || var28 == var32 || var29 == var32) {
                    int var33 = this.field1424.method274(0, var32, -28157, var31);
                    if (var33 != -1) {
                        this.field1424.method284(633, var33, 3);
                    }
                    int var34 = this.field1424.method274(1, var32, -28157, var31);
                    if (var34 != -1) {
                        this.field1424.method284(633, var34, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method459(long arg0, byte arg1) {
        if (arg1 != 121) {
            this.method6();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1580; ++var4) {
                if (this.field1536[var4] == arg0) {
                    --this.field1580;
                    this.field1634 = true;
                    for (int var5 = var4; var5 < this.field1580; ++var5) {
                        this.field1536[var5] = this.field1536[var5 + 1];
                    }
                    this.field1250.method218(228, 837);
                    this.field1250.method225(this.field1239, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg0 & 2047;
        if (arg2 == -9666) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg1;
            if (var8 != 0) {
                int var13 = Model.field609[var8];
                int var14 = Model.field610[var8];
                int var15 = var11 * var14 - arg1 * var13 >> 16;
                var12 = var11 * var13 + arg1 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field609[var9];
                int var17 = Model.field610[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1355 = arg3 - var10;
            this.field1356 = arg5 - var11;
            this.field1357 = arg4 - var12;
            this.field1358 = arg6;
            this.field1359 = arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -5266) {
            this.field1445 = 389;
        }
        if (arg7 >= 1 && arg3 >= 1 && arg7 <= 102 && arg3 <= 102) {
            if (field1392 && this.field1501 != arg6) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field1569.method76(arg6, arg7, arg3);
            }
            if (arg0 == 1) {
                var9 = this.field1569.method77(192, arg7, arg3, arg6);
            }
            if (arg0 == 2) {
                var9 = this.field1569.method78(arg6, arg7, arg3);
            }
            if (arg0 == 3) {
                var9 = this.field1569.method79(arg6, arg7, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1569.method80(arg6, arg7, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field1569.method67(arg7, (byte) -46, arg3, arg6);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field967) {
                        this.field1647[arg6].method364(arg7, arg3, var15, var16, var17.field968, (byte) 8);
                    }
                }
                if (arg0 == 1) {
                    this.field1569.method68(arg3, arg7, arg6, 0);
                }
                if (arg0 == 2) {
                    this.field1569.method69(arg3, arg6, 119, arg7);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field965 + arg7 > 103 || var18.field965 + arg3 > 103 || var18.field966 + arg7 > 103 || var18.field966 + arg3 > 103) {
                        return;
                    }
                    if (var18.field967) {
                        this.field1647[arg6].method365(var18.field965, -34457, var18.field966, arg3, var16, var18.field968, arg7);
                    }
                }
                if (arg0 == 3) {
                    this.field1569.method70(arg3, true, arg7, arg6);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field967 && var19.field969) {
                        this.field1647[arg6].method367(0, arg3, arg7);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg6;
                if (arg6 < 3 && (this.field1307[1][arg7][arg3] & 2) == 2) {
                    var20 = arg6 + 1;
                }
                World.method31(var20, arg6, this.field1343, arg1, true, this.field1647[arg6], arg7, arg4, this.field1569, arg5, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method462(boolean arg0) {
        if (this.field1630 == 0) {
            int var2 = super.field28;
            if (arg0) {
                if (this.field1346 == 1 && super.field29 >= 516 && super.field30 >= 160 && super.field29 <= 765 && super.field30 <= 205) {
                    var2 = 0;
                }
                if (this.field1578) {
                    if (var2 != 1) {
                        int var3 = super.field22;
                        int var4 = super.field23;
                        if (this.field1457 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field1457 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field1457 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field1458 - 10 || var3 > this.field1460 + this.field1458 + 10 || var4 < this.field1459 - 10 || var4 > this.field1461 + this.field1459 + 10) {
                            this.field1578 = false;
                            if (this.field1457 == 1) {
                                this.field1634 = true;
                            }
                            if (this.field1457 == 2) {
                                this.field1683 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1458;
                        int var6 = this.field1459;
                        int var7 = this.field1460;
                        int var8 = super.field29;
                        int var9 = super.field30;
                        if (this.field1457 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field1457 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field1457 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1499; ++var11) {
                            int var12 = (this.field1499 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method543(-117, var10);
                        }
                        this.field1578 = false;
                        if (this.field1457 == 1) {
                            this.field1634 = true;
                        }
                        if (this.field1457 == 2) {
                            this.field1683 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1499 > 0) {
                        int var13 = this.field1586[this.field1499 - 1];
                        if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                            int var14 = this.field1584[this.field1499 - 1];
                            int var15 = this.field1585[this.field1499 - 1];
                            Component var16 = Component.field73[var15];
                            if (var16.field100 || var16.field103) {
                                this.field1617 = false;
                                this.field1271 = 0;
                                this.field1628 = var15;
                                this.field1629 = var14;
                                this.field1630 = 2;
                                this.field1631 = super.field29;
                                this.field1632 = super.field30;
                                if (Component.field73[var15].field79 == this.field1268) {
                                    this.field1630 = 1;
                                }
                                if (Component.field73[var15].field79 == this.field1236) {
                                    this.field1630 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1382 == 1 || this.method502(this.field1499 - 1, -540)) && this.field1499 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1499 > 0) {
                        this.method543(-117, this.field1499 - 1);
                    }
                    if (var2 != 2 || this.field1499 <= 0) {
                        return;
                    }
                    this.method513(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method463(String arg0) throws IOException {
        if (!this.field1487) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1478 != null) {
                try {
                    this.field1478.close();
                } catch (Exception var4) {
                }
                this.field1478 = null;
            }
            this.field1478 = this.method485(43595);
            this.field1478.setSoTimeout(10000);
            InputStream var2 = this.field1478.getInputStream();
            OutputStream var3 = this.field1478.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, "Starting up", true);
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        if (field1494) {
            this.field1645 = true;
        } else {
            field1494 = true;
            boolean var1 = false;
            String var2 = this.method433(0);
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
                this.field1375 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1305[var3] = new FileStream(signlink.cache_dat, 500000, var3 + 1, signlink.cache_idx[var3], -16770);
                    }
                }
                try {
                    this.method481(false);
                    this.field1484 = this.method454(25, -963, this.field1447[1], "title", "title screen", 1);
                    this.field1495 = new PixFont(false, "p11_full", this.field1484, 4);
                    this.field1496 = new PixFont(false, "p12_full", this.field1484, 4);
                    this.field1497 = new PixFont(false, "b12_full", this.field1484, 4);
                    this.field1498 = new PixFont(true, "q8_full", this.field1484, 4);
                    this.method471(191);
                    this.method494(0);
                    Jagfile var4 = this.method454(30, -963, this.field1447[2], "config", "config", 2);
                    Jagfile var5 = this.method454(35, -963, this.field1447[3], "interface", "interface", 3);
                    Jagfile var6 = this.method454(40, -963, this.field1447[4], "media", "2d graphics", 4);
                    Jagfile var7 = this.method454(45, -963, this.field1447[6], "textures", "textures", 6);
                    Jagfile var8 = this.method454(50, -963, this.field1447[7], "wordenc", "chat system", 7);
                    Jagfile var9 = this.method454(55, -963, this.field1447[8], "sounds", "sound effects", 8);
                    this.field1307 = new byte[4][104][104];
                    this.field1343 = new int[4][105][105];
                    this.field1569 = new World3D(this.field1343, 104, false, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1647[var10] = new CollisionMap(1, 104, 104);
                    }
                    this.field1605 = new Pix32(512, 512);
                    Jagfile var11 = this.method454(60, -963, this.field1447[5], "versionlist", "update list", 5);
                    this.method13(60, "Connecting to update server", true);
                    this.field1424 = new OnDemand();
                    this.field1424.method270(var11, this);
                    AnimFrame.method44(this.field1424.method273(0));
                    Model.method123(this.field1424.method272(2136, 0), this.field1424);
                    if (!field1392) {
                        this.field1576 = 0;
                        try {
                            this.field1576 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1577 = true;
                        this.field1424.method279(2, this.field1576);
                        while (this.field1424.method280() > 0) {
                            this.method497((byte) -126);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1424.field839 > 3) {
                                this.method504("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, "Requesting animations", true);
                    int var12 = this.field1424.method272(2136, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1424.method279(1, var13);
                    }
                    while (this.field1424.method280() > 0) {
                        int var14 = var12 - this.field1424.method280();
                        if (var14 > 0) {
                            this.method13(65, "Loading animations - " + var14 * 100 / var12 + "%", true);
                        }
                        this.method497((byte) -126);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1424.field839 > 3) {
                            this.method504("ondemand");
                            return;
                        }
                    }
                    this.method13(70, "Requesting models", true);
                    int var15 = this.field1424.method272(2136, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1424.method277(var16, 3);
                        if ((var17 & 1) != 0) {
                            this.field1424.method279(0, var16);
                        }
                    }
                    int var18 = this.field1424.method280();
                    while (this.field1424.method280() > 0) {
                        int var19 = var18 - this.field1424.method280();
                        if (var19 > 0) {
                            this.method13(70, "Loading models - " + var19 * 100 / var18 + "%", true);
                        }
                        this.method497((byte) -126);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1305[0] != null) {
                        this.method13(75, "Requesting maps", true);
                        this.field1424.method279(3, this.field1424.method274(0, 48, -28157, 47));
                        this.field1424.method279(3, this.field1424.method274(1, 48, -28157, 47));
                        this.field1424.method279(3, this.field1424.method274(0, 48, -28157, 48));
                        this.field1424.method279(3, this.field1424.method274(1, 48, -28157, 48));
                        this.field1424.method279(3, this.field1424.method274(0, 48, -28157, 49));
                        this.field1424.method279(3, this.field1424.method274(1, 48, -28157, 49));
                        this.field1424.method279(3, this.field1424.method274(0, 47, -28157, 47));
                        this.field1424.method279(3, this.field1424.method274(1, 47, -28157, 47));
                        this.field1424.method279(3, this.field1424.method274(0, 47, -28157, 48));
                        this.field1424.method279(3, this.field1424.method274(1, 47, -28157, 48));
                        this.field1424.method279(3, this.field1424.method274(0, 148, -28157, 48));
                        this.field1424.method279(3, this.field1424.method274(1, 148, -28157, 48));
                        int var20 = this.field1424.method280();
                        while (this.field1424.method280() > 0) {
                            int var21 = var20 - this.field1424.method280();
                            if (var21 > 0) {
                                this.method13(75, "Loading maps - " + var21 * 100 / var20 + "%", true);
                            }
                            this.method497((byte) -126);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1424.method272(2136, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1424.method277(var23, 3);
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
                            this.field1424.method282(349, var25, 0, var23);
                        }
                    }
                    this.field1424.method275(0, field1391);
                    if (!field1392) {
                        int var26 = this.field1424.method272(2136, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1424.method278(field1633, var27)) {
                                this.field1424.method282(349, (byte) 1, 2, var27);
                            }
                        }
                    }
                    this.method13(80, "Unpacking media", true);
                    this.field1379 = new Pix8(var6, "invback", 0);
                    this.field1381 = new Pix8(var6, "chatback", 0);
                    this.field1380 = new Pix8(var6, "mapback", 0);
                    this.field1438 = new Pix8(var6, "backbase1", 0);
                    this.field1439 = new Pix8(var6, "backbase2", 0);
                    this.field1440 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1473[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1570 = new Pix32(var6, "compass", 0);
                    this.field1323 = new Pix32(var6, "mapedge", 0);
                    this.field1323.method183(0);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1551[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1676[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1589[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1528[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1516 = new Pix32(var6, "mapmarker", 0);
                    this.field1517 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1249[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1396 = new Pix32(var6, "mapdots", 0);
                    this.field1397 = new Pix32(var6, "mapdots", 1);
                    this.field1398 = new Pix32(var6, "mapdots", 2);
                    this.field1399 = new Pix32(var6, "mapdots", 3);
                    this.field1597 = new Pix8(var6, "scrollbar", 0);
                    this.field1598 = new Pix8(var6, "scrollbar", 1);
                    this.field1464 = new Pix8(var6, "redstone1", 0);
                    this.field1465 = new Pix8(var6, "redstone2", 0);
                    this.field1466 = new Pix8(var6, "redstone3", 0);
                    this.field1467 = new Pix8(var6, "redstone1", 0);
                    this.field1467.method196(4);
                    this.field1468 = new Pix8(var6, "redstone2", 0);
                    this.field1468.method196(4);
                    this.field1655 = new Pix8(var6, "redstone1", 0);
                    this.field1655.method197(-289);
                    this.field1656 = new Pix8(var6, "redstone2", 0);
                    this.field1656.method197(-289);
                    this.field1657 = new Pix8(var6, "redstone3", 0);
                    this.field1657.method197(-289);
                    this.field1658 = new Pix8(var6, "redstone1", 0);
                    this.field1658.method196(4);
                    this.field1658.method197(-289);
                    this.field1659 = new Pix8(var6, "redstone2", 0);
                    this.field1659.method196(4);
                    this.field1659.method197(-289);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1560[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1541 = new PixMap(this.method11(0), var35.field671, var35.field672, -707);
                    var35.method184(field1692, 0, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1542 = new PixMap(this.method11(0), var36.field671, var36.field672, -707);
                    var36.method184(field1692, 0, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1543 = new PixMap(this.method11(0), var37.field671, var37.field672, -707);
                    var37.method184(field1692, 0, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1544 = new PixMap(this.method11(0), var38.field671, var38.field672, -707);
                    var38.method184(field1692, 0, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1545 = new PixMap(this.method11(0), var39.field671, var39.field672, -707);
                    var39.method184(field1692, 0, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1546 = new PixMap(this.method11(0), var40.field671, var40.field672, -707);
                    var40.method184(field1692, 0, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1547 = new PixMap(this.method11(0), var41.field671, var41.field672, -707);
                    var41.method184(field1692, 0, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1548 = new PixMap(this.method11(0), var42.field671, var42.field672, -707);
                    var42.method184(field1692, 0, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1549 = new PixMap(this.method11(0), var43.field671, var43.field672, -707);
                    var43.method184(field1692, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1676[var48] != null) {
                            this.field1676[var48].method182((byte) 3, var46 + var47, var45 + var47, var44 + var47);
                        }
                        if (this.field1551[var48] != null) {
                            this.field1551[var48].method198((byte) 3, var46 + var47, var45 + var47, var44 + var47);
                        }
                    }
                    this.method13(83, "Unpacking textures", true);
                    Pix3D.method169(var7, 0);
                    Pix3D.method173(0.8D, -669);
                    Pix3D.method168(20, true);
                    this.method13(86, "Unpacking config", true);
                    SeqType.method381(var4, 5);
                    LocType.method328(var4);
                    FloType.method371(var4, 5);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(var4, 5);
                    SpotAnimType.method384(var4, 5);
                    VarpType.method389(var4, 5);
                    VarbitType.method387(var4, 5);
                    ObjType.field1052 = field1391;
                    if (!field1392) {
                        this.method13(90, "Unpacking sounds", true);
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, field1388);
                        Wave.method318(var50, 5);
                    }
                    this.method13(95, "Unpacking interfaces", true);
                    PixFont[] var51 = new PixFont[] { this.field1495, this.field1496, this.field1497, this.field1498 };
                    Component.method32(var5, field1601, var51, var6);
                    this.method13(100, "Preparing game engine", true);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1380.field681[this.field1380.field683 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1579[var52] = var53;
                        this.field1294[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1380.field681[this.field1380.field683 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1470[var56 - 5] = var57 - 25;
                        this.field1639[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(479, 96, -323);
                    this.field1427 = Pix3D.field650;
                    Pix3D.method166(190, 261, -323);
                    this.field1428 = Pix3D.field650;
                    Pix3D.method166(512, 334, -323);
                    this.field1429 = Pix3D.field650;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field648[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(334, var60, 500, 800, 512, -574);
                    WordFilter.method391(var8);
                    this.field1534 = new MouseTracking(-648, this);
                    this.method12(this.field1534, 10);
                    LocEntity.field489 = this;
                    LocType.field951 = this;
                    NpcType.field1005 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1600 + " " + this.field1325);
                    this.field1481 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method464(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            field1552 = !field1552;
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method465(int arg0) {
        World3D.field288 = false;
        Pix3D.field639 = false;
        field1392 = false;
        World.field45 = false;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method466(int arg0) {
        int var2 = 21 / arg0;
        for (int var3 = -1; var3 < this.field1365; ++var3) {
            int var7;
            if (var3 == -1) {
                var7 = this.field1363;
            } else {
                var7 = this.field1366[var3];
            }
            PlayerEntity var8 = this.field1364[var7];
            if (var8 != null && var8.field415 > 0) {
                --var8.field415;
                if (var8.field415 == 0) {
                    var8.field414 = null;
                }
            }
        }
        for (int var4 = 0; var4 < this.field1310; ++var4) {
            int var5 = this.field1311[var4];
            NpcEntity var6 = this.field1309[var5];
            if (var6 != null && var6.field415 > 0) {
                --var6.field415;
                if (var6.field415 == 0) {
                    var6.field414 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;III)V")
    public final void method467(int arg0, Component arg1, int arg2, int arg3, int arg4) {
        if (arg1.field80 == 0 && arg1.field95 != null) {
            if (!arg1.field94 || this.field1350 == arg1.field78 || this.field1373 == arg1.field78 || this.field1287 == arg1.field78) {
                int var6 = Pix2D.field632;
                int var7 = Pix2D.field630;
                int var8 = Pix2D.field633;
                int var9 = Pix2D.field631;
                if (arg3 >= 0) {
                    this.method6();
                }
                Pix2D.method154(arg1.field84 + arg0, arg1.field83 + arg2, arg2, -226, arg0);
                int var10 = arg1.field95.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field96[var11] + arg2;
                    int var13 = arg1.field97[var11] + arg0 - arg4;
                    Component var14 = Component.field73[arg1.field95[var11]];
                    int var15 = var14.field86 + var12;
                    int var16 = var14.field87 + var13;
                    if (var14.field82 > 0) {
                        this.method441(var14, 125);
                    }
                    if (var14.field80 == 0) {
                        if (var14.field93 > var14.field92 - var14.field84) {
                            var14.field93 = var14.field92 - var14.field84;
                        }
                        if (var14.field93 < 0) {
                            var14.field93 = 0;
                        }
                        this.method467(var16, var14, var15, -28, var14.field93);
                        if (var14.field92 > var14.field84) {
                            this.method508(var14.field84, var16, var14.field92, this.field1566, var14.field83 + var15, var14.field93);
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
                                                var30.method186(var20, var21, false);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field74[var17] - 1;
                                        if (var20 > Pix2D.field632 - 32 && var20 < Pix2D.field633 && var21 > Pix2D.field630 - 32 && var21 < Pix2D.field631 || this.field1630 != 0 && this.field1629 == var17) {
                                            int var25 = 0;
                                            if (this.field1405 == 1 && this.field1406 == var17 && this.field1407 == var14.field78) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method354(true, var24, var14.field75[var17], var25);
                                            if (var26 != null) {
                                                if (this.field1630 != 0 && this.field1629 == var17 && this.field1628 == var14.field78) {
                                                    var22 = super.field22 - this.field1631;
                                                    var23 = super.field23 - this.field1632;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1271 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method188(var21 + var23, 47048, 128, var20 + var22);
                                                    if (var21 + var23 < Pix2D.field630 && arg1.field93 > 0) {
                                                        int var27 = (Pix2D.field630 - var21 - var23) * this.field1477 / 3;
                                                        if (var27 > this.field1477 * 10) {
                                                            var27 = this.field1477 * 10;
                                                        }
                                                        if (var27 > arg1.field93) {
                                                            var27 = arg1.field93;
                                                        }
                                                        arg1.field93 -= var27;
                                                        this.field1632 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field631 && arg1.field93 < arg1.field92 - arg1.field84) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field631) * this.field1477 / 3;
                                                        if (var28 > this.field1477 * 10) {
                                                            var28 = this.field1477 * 10;
                                                        }
                                                        if (var28 > arg1.field92 - arg1.field84 - arg1.field93) {
                                                            var28 = arg1.field92 - arg1.field84 - arg1.field93;
                                                        }
                                                        arg1.field93 += var28;
                                                        this.field1632 -= var28;
                                                    }
                                                } else if (this.field1611 != 0 && this.field1610 == var17 && this.field1609 == var14.field78) {
                                                    var26.method188(var21, 47048, 128, var20);
                                                } else {
                                                    var26.method186(var20, var21, false);
                                                }
                                                if (var26.field675 == 33 || var14.field75[var17] != 1) {
                                                    int var29 = var14.field75[var17];
                                                    this.field1495.method206(var21 + 10 + var23, 0, var20 + 1 + var22, method483(this.field1400, var29), 3);
                                                    this.field1495.method206(var21 + 9 + var23, 16776960, var20 + var22, method483(this.field1400, var29), 3);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field80 == 3) {
                            boolean var31 = false;
                            if (this.field1287 == var14.field78 || this.field1373 == var14.field78 || this.field1350 == var14.field78) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method505(0, var14)) {
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
                                    Pix2D.method157(var32, var14.field84, var14.field83, var15, var16, this.field1267);
                                } else {
                                    Pix2D.method158(var14.field84, var16, var32, var14.field83, 3, var15);
                                }
                            } else if (var14.field110) {
                                Pix2D.method156(var32, var14.field84, var14.field83, 755, var15, var16, 256 - (var14.field85 & 255));
                            } else {
                                Pix2D.method159(var14.field83, var14.field84, 0, var32, var16, 256 - (var14.field85 & 255), var15);
                            }
                        } else if (var14.field80 == 4) {
                            PixFont var33 = var14.field113;
                            String var34 = var14.field114;
                            boolean var35 = false;
                            if (this.field1287 == var14.field78 || this.field1373 == var14.field78 || this.field1350 == var14.field78) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method505(0, var14)) {
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
                            if (var14.field81 == 6 && this.field1482) {
                                var34 = "Please wait...";
                                var36 = var14.field116;
                            }
                            if (Pix2D.field628 == 479) {
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
                                                                        var34 = var34.substring(0, var42) + this.method535(28242, this.method474(this.field1295, var14, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method535(28242, this.method474(this.field1295, var14, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method535(28242, this.method474(this.field1295, var14, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method535(28242, this.method474(this.field1295, var14, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method535(28242, this.method474(this.field1295, var14, 0)) + var34.substring(var38 + 2);
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
                                    var33.method203(var14.field83 / 2 + var15, var14.field112, var36, var44, var37, -836);
                                } else {
                                    var33.method210(var36, var15, var14.field112, var37, var44, 1);
                                }
                                var37 += var33.field698;
                            }
                        } else if (var14.field80 == 5) {
                            Pix32 var45;
                            if (this.method505(0, var14)) {
                                var45 = var14.field121;
                            } else {
                                var45 = var14.field120;
                            }
                            if (var45 != null) {
                                var45.method186(var15, var16, false);
                            }
                        } else if (var14.field80 == 6) {
                            int var46 = Pix3D.field644;
                            int var47 = Pix3D.field645;
                            Pix3D.field644 = var14.field83 / 2 + var15;
                            Pix3D.field645 = var14.field84 / 2 + var16;
                            int var48 = Pix3D.field648[var14.field129] * var14.field128 >> 16;
                            int var49 = Pix3D.field649[var14.field129] * var14.field128 >> 16;
                            boolean var50 = this.method505(0, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field127;
                            } else {
                                var51 = var14.field126;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34((byte) 3, -1, -1, var50);
                            } else {
                                SeqType var53 = SeqType.field1144[var51];
                                var52 = var14.method34((byte) 3, var53.field1147[var14.field76], var53.field1146[var14.field76], var50);
                            }
                            if (var52 != null) {
                                var52.method146(0, var14.field130, 0, var14.field129, 0, var48, var49);
                            }
                            Pix3D.field644 = var46;
                            Pix3D.field645 = var47;
                        } else if (var14.field80 == 7) {
                            PixFont var54 = var14.field113;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field84; ++var56) {
                                for (int var57 = 0; var57 < var14.field83; ++var57) {
                                    if (var14.field74[var55] > 0) {
                                        ObjType var58 = ObjType.method348(var14.field74[var55] - 1);
                                        String var59 = var58.field1055;
                                        if (var58.field1066 || var14.field75[var55] != 1) {
                                            var59 = var59 + " x" + method477((byte) 5, var14.field75[var55]);
                                        }
                                        int var60 = (var14.field104 + 115) * var57 + var15;
                                        int var61 = (var14.field105 + 12) * var56 + var16;
                                        if (var14.field111) {
                                            var54.method203(var14.field83 / 2 + var60, var14.field112, var14.field116, var59, var61, -836);
                                        } else {
                                            var54.method210(var14.field116, var60, var14.field112, var61, var59, 1);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method154(var9, var8, var6, -226, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method468(int arg0) {
        ++field1635;
        this.field1329 += arg0;
        if (field1635 > 192) {
            field1635 = 0;
            this.field1250.method218(57, 837);
            this.field1250.method219(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1268 != -1 && this.field1370 == this.field1268) {
                        if (var2 == 8 && this.field1685.length() > 0) {
                            this.field1685 = this.field1685.substring(0, this.field1685.length() - 1);
                        }
                        break;
                    }
                    if (this.field1515) {
                        if (var2 >= 32 && var2 <= 122 && this.field1505.length() < 80) {
                            this.field1505 = this.field1505 + (char) var2;
                            this.field1683 = true;
                        }
                        if (var2 == 8 && this.field1505.length() > 0) {
                            this.field1505 = this.field1505.substring(0, this.field1505.length() - 1);
                            this.field1683 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1515 = false;
                            this.field1683 = true;
                            if (this.field1571 == 1) {
                                long var3 = JString.method300(this.field1505);
                                this.method549(6, var3);
                            }
                            if (this.field1571 == 2 && this.field1288 > 0) {
                                long var5 = JString.method300(this.field1505);
                                this.method521(this.field1442, var5);
                            }
                            if (this.field1571 == 3 && this.field1505.length() > 0) {
                                this.field1250.method218(236, 837);
                                this.field1250.method219(0);
                                int var7 = this.field1250.field712;
                                this.field1250.method225(this.field1239, this.field1678);
                                WordPack.method307(this.field1250, -41401, this.field1505);
                                this.field1250.method228(1, this.field1250.field712 - var7);
                                this.field1505 = WordPack.method308(0, this.field1505);
                                this.field1505 = WordFilter.method401(0, this.field1505);
                                this.method440(JString.method304(false, JString.method301(false, this.field1678)), this.field1505, 6, 811);
                                if (this.field1540 == 2) {
                                    this.field1540 = 1;
                                    this.field1559 = true;
                                    this.field1250.method218(158, 837);
                                    this.field1250.method219(this.field1240);
                                    this.field1250.method219(this.field1540);
                                    this.field1250.method219(this.field1410);
                                }
                            }
                            if (this.field1571 == 4 && this.field1580 < 100) {
                                long var8 = JString.method300(this.field1505);
                                this.method548(var8, 9);
                            }
                            if (this.field1571 == 5 && this.field1580 > 0) {
                                long var10 = JString.method300(this.field1505);
                                this.method459(var10, (byte) 121);
                            }
                        }
                    } else if (this.field1285) {
                        if (var2 >= 48 && var2 <= 57 && this.field1531.length() < 10) {
                            this.field1531 = this.field1531 + (char) var2;
                            this.field1683 = true;
                        }
                        if (var2 == 8 && this.field1531.length() > 0) {
                            this.field1531 = this.field1531.substring(0, this.field1531.length() - 1);
                            this.field1683 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1531.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1531);
                                } catch (Exception var19) {
                                }
                                this.field1250.method218(12, 837);
                                this.field1250.method223(var12);
                            }
                            this.field1285 = false;
                            this.field1683 = true;
                        }
                    } else if (this.field1236 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1401.length() < 80) {
                            this.field1401 = this.field1401 + (char) var2;
                            this.field1683 = true;
                        }
                        if (var2 == 8 && this.field1401.length() > 0) {
                            this.field1401 = this.field1401.substring(0, this.field1401.length() - 1);
                            this.field1683 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1401.length() > 0) {
                            if (this.field1395 == 2) {
                                if (this.field1401.equals("::clientdrop")) {
                                    this.method452(false);
                                }
                                if (this.field1401.equals("::lag")) {
                                    this.method432(-56);
                                }
                                if (this.field1401.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1424.method272(2136, 2); ++var13) {
                                        this.field1424.method282(349, (byte) 1, 2, var13);
                                    }
                                }
                                if (this.field1401.equals("::fpson")) {
                                    field1660 = true;
                                }
                                if (this.field1401.equals("::fpsoff")) {
                                    field1660 = false;
                                }
                            }
                            if (this.field1401.startsWith("::")) {
                                this.field1250.method218(95, 837);
                                this.field1250.method219(this.field1401.length() - 1);
                                this.field1250.method226(this.field1401.substring(2));
                            } else {
                                String var14 = this.field1401.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1401 = this.field1401.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1401 = this.field1401.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1401 = this.field1401.substring(6);
                                }
                                String var16 = this.field1401.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field1401 = this.field1401.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field1401 = this.field1401.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field1401 = this.field1401.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field1401 = this.field1401.substring(6);
                                }
                                this.field1250.method218(29, 837);
                                this.field1250.method219(0);
                                int var18 = this.field1250.field712;
                                this.field1250.method219(var15);
                                this.field1250.method219(var17);
                                WordPack.method307(this.field1250, -41401, this.field1401);
                                this.field1250.method228(1, this.field1250.field712 - var18);
                                this.field1401 = WordPack.method308(0, this.field1401);
                                this.field1401 = WordFilter.method401(0, this.field1401);
                                field1263.field414 = this.field1401;
                                field1263.field416 = var15;
                                field1263.field417 = var17;
                                field1263.field415 = 150;
                                if (this.field1395 == 2) {
                                    this.method440("@cr2@" + field1263.field462, field1263.field414, 2, 811);
                                } else if (this.field1395 == 1) {
                                    this.method440("@cr1@" + field1263.field462, field1263.field414, 2, 811);
                                } else {
                                    this.method440(field1263.field462, field1263.field414, 2, 811);
                                }
                                if (this.field1240 == 2) {
                                    this.field1240 = 3;
                                    this.field1559 = true;
                                    this.field1250.method218(158, 837);
                                    this.field1250.method219(this.field1240);
                                    this.field1250.method219(this.field1540);
                                    this.field1250.method219(this.field1410);
                                }
                            }
                            this.field1401 = "";
                            this.field1683 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1685.length() < 12) {
                this.field1685 = this.field1685 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ZI)V")
    private final void method469(Packet arg0, boolean arg1, int arg2) {
        int var4 = arg0.method240(8, 45621);
        if (var4 < this.field1365) {
            for (int var5 = var4; var5 < this.field1365; ++var5) {
                this.field1509[this.field1508++] = this.field1366[var5];
            }
        }
        if (var4 > this.field1365) {
            signlink.reporterror(this.field1413 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1365 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1366[var6];
                PlayerEntity var8 = this.field1364[var7];
                int var9 = arg0.method240(1, 45621);
                if (var9 == 0) {
                    this.field1366[this.field1365++] = var7;
                    var8.field447 = field1300;
                } else {
                    int var10 = arg0.method240(2, 45621);
                    if (var10 == 0) {
                        this.field1366[this.field1365++] = var7;
                        var8.field447 = field1300;
                        this.field1368[this.field1367++] = var7;
                    } else if (var10 == 1) {
                        this.field1366[this.field1365++] = var7;
                        var8.field447 = field1300;
                        int var11 = arg0.method240(3, 45621);
                        var8.method111(var11, false, 31409);
                        int var12 = arg0.method240(1, 45621);
                        if (var12 == 1) {
                            this.field1368[this.field1367++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1366[this.field1365++] = var7;
                        var8.field447 = field1300;
                        int var13 = arg0.method240(3, 45621);
                        var8.method111(var13, true, 31409);
                        int var14 = arg0.method240(3, 45621);
                        var8.method111(var14, true, 31409);
                        int var15 = arg0.method240(1, 45621);
                        if (var15 == 1) {
                            this.field1368[this.field1367++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1509[this.field1508++] = var7;
                    }
                }
            }
            this.field1277 &= arg1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method470(boolean arg0) {
        this.field1313 = 0;
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = -1; var3 < this.field1365 + this.field1310; ++var3) {
            PathingEntity var20;
            if (var3 == -1) {
                var20 = field1263;
            } else if (var3 < this.field1365) {
                var20 = this.field1364[this.field1366[var3]];
            } else {
                var20 = this.field1309[this.field1311[var3 - this.field1365]];
            }
            if (var20 != null && var20.method113(this.field1640)) {
                if (var20 instanceof NpcEntity) {
                    NpcType var21 = ((NpcEntity) var20).field458;
                    if (var21.field1037 != null) {
                        var21 = var21.method345(-13461);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field1365) {
                    NpcType var25 = ((NpcEntity) var20).field458;
                    if (var25.field1035 >= 0 && var25.field1035 < this.field1528.length) {
                        this.method538(var20.field448 + 15, var20, (byte) -102);
                        if (this.field1403 > -1) {
                            this.field1528[var25.field1035].method186(this.field1403 - 12, this.field1404 - 30, false);
                        }
                    }
                    if (this.field1488 == 1 && this.field1311[var3 - this.field1365] == this.field1241 && field1300 % 20 < 10) {
                        this.method538(var20.field448 + 15, var20, (byte) -102);
                        if (this.field1403 > -1) {
                            this.field1528[2].method186(this.field1403 - 12, this.field1404 - 28, false);
                        }
                    }
                } else {
                    int var22 = 30;
                    PlayerEntity var23 = (PlayerEntity) var20;
                    if (var23.field465 != 0) {
                        this.method538(var20.field448 + 15, var20, (byte) -102);
                        if (this.field1403 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field465 & 1 << var24) != 0) {
                                    this.field1528[var24].method186(this.field1403 - 12, this.field1404 - var22, false);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field1488 == 10 && this.field1366[var3] == this.field1691) {
                        this.method538(var20.field448 + 15, var20, (byte) -102);
                        if (this.field1403 > -1) {
                            this.field1528[7].method186(this.field1403 - 12, this.field1404 - var22, false);
                        }
                    }
                }
                if (var20.field414 != null && (var3 >= this.field1365 || this.field1240 == 0 || this.field1240 == 3 || this.field1240 == 1 && this.method517(this.field1486, ((PlayerEntity) var20).field462))) {
                    this.method538(var20.field448, var20, (byte) -102);
                    if (this.field1403 > -1 && this.field1313 < this.field1314) {
                        this.field1318[this.field1313] = this.field1497.method205((byte) 7, var20.field414) / 2;
                        this.field1317[this.field1313] = this.field1497.field698;
                        this.field1315[this.field1313] = this.field1403;
                        this.field1316[this.field1313] = this.field1404;
                        this.field1319[this.field1313] = var20.field416;
                        this.field1320[this.field1313] = var20.field417;
                        this.field1321[this.field1313] = var20.field415;
                        this.field1322[this.field1313++] = var20.field414;
                        if (this.field1290 == 0 && var20.field417 >= 1 && var20.field417 <= 3) {
                            this.field1317[this.field1313] += 10;
                            this.field1316[this.field1313] += 5;
                        }
                        if (this.field1290 == 0 && var20.field417 == 4) {
                            this.field1318[this.field1313] = 60;
                        }
                        if (this.field1290 == 0 && var20.field417 == 5) {
                            this.field1317[this.field1313] += 5;
                        }
                    }
                }
                if (var20.field421 > field1300) {
                    this.method538(var20.field448 + 15, var20, (byte) -102);
                    if (this.field1403 > -1) {
                        int var26 = var20.field422 * 30 / var20.field423;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        Pix2D.method157(65280, 5, var26, this.field1403 - 15, this.field1404 - 3, this.field1267);
                        Pix2D.method157(16711680, 5, 30 - var26, this.field1403 - 15 + var26, this.field1404 - 3, this.field1267);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field420[var27] > field1300) {
                        this.method538(var20.field448 / 2, var20, (byte) -102);
                        if (this.field1403 > -1) {
                            if (var27 == 1) {
                                this.field1404 -= 20;
                            }
                            if (var27 == 2) {
                                this.field1403 -= 15;
                                this.field1404 -= 10;
                            }
                            if (var27 == 3) {
                                this.field1403 += 15;
                                this.field1404 -= 10;
                            }
                            this.field1589[var20.field419[var27]].method186(this.field1403 - 12, this.field1404 - 12, false);
                            this.field1495.method202(this.field1403, -33071, 0, String.valueOf(var20.field418[var27]), this.field1404 + 4);
                            this.field1495.method202(this.field1403 - 1, -33071, 16777215, String.valueOf(var20.field418[var27]), this.field1404 + 3);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field1313; ++var4) {
            int var5 = this.field1315[var4];
            int var6 = this.field1316[var4];
            int var7 = this.field1318[var4];
            int var8 = this.field1317[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field1316[var19] - this.field1317[var19] && var6 - var8 < this.field1316[var19] + 2 && var5 - var7 < this.field1318[var19] + this.field1315[var19] && var5 + var7 > this.field1315[var19] - this.field1318[var19] && this.field1316[var19] - this.field1317[var19] < var6) {
                        var6 = this.field1316[var19] - this.field1317[var19];
                        var9 = true;
                    }
                }
            }
            this.field1403 = this.field1315[var4];
            this.field1404 = this.field1316[var4] = var6;
            String var10 = this.field1322[var4];
            if (this.field1290 == 0) {
                int var11 = 16776960;
                if (this.field1319[var4] < 6) {
                    var11 = this.field1588[this.field1319[var4]];
                }
                if (this.field1319[var4] == 6) {
                    var11 = this.field1677 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1319[var4] == 7) {
                    var11 = this.field1677 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1319[var4] == 8) {
                    var11 = this.field1677 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1319[var4] == 9) {
                    int var12 = 150 - this.field1321[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1319[var4] == 10) {
                    int var13 = 150 - this.field1321[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1319[var4] == 11) {
                    int var14 = 150 - this.field1321[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1320[var4] == 0) {
                    this.field1497.method202(this.field1403, -33071, 0, var10, this.field1404 + 1);
                    this.field1497.method202(this.field1403, -33071, var11, var10, this.field1404);
                }
                if (this.field1320[var4] == 1) {
                    this.field1497.method207(this.field1677, 0, (byte) 0, this.field1403, this.field1404 + 1, var10);
                    this.field1497.method207(this.field1677, var11, (byte) 0, this.field1403, this.field1404, var10);
                }
                if (this.field1320[var4] == 2) {
                    this.field1497.method208(this.field1404 + 1, var10, this.field1403, false, this.field1677, 0);
                    this.field1497.method208(this.field1404, var10, this.field1403, false, this.field1677, var11);
                }
                if (this.field1320[var4] == 3) {
                    this.field1497.method209(150 - this.field1321[var4], this.field1677, -32105, var10, 0, this.field1404 + 1, this.field1403);
                    this.field1497.method209(150 - this.field1321[var4], this.field1677, -32105, var10, var11, this.field1404, this.field1403);
                }
                if (this.field1320[var4] == 4) {
                    int var15 = this.field1497.method205((byte) 7, var10);
                    int var16 = (150 - this.field1321[var4]) * (var15 + 100) / 150;
                    Pix2D.method154(334, this.field1403 + 50, this.field1403 - 50, -226, 0);
                    this.field1497.method206(this.field1404 + 1, 0, this.field1403 + 50 - var16, var10, 3);
                    this.field1497.method206(this.field1404, var11, this.field1403 + 50 - var16, var10, 3);
                    Pix2D.method153((byte) 3);
                }
                if (this.field1320[var4] == 5) {
                    int var17 = 150 - this.field1321[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    Pix2D.method154(this.field1404 + 5, 512, 0, -226, this.field1404 - this.field1497.field698 - 1);
                    this.field1497.method202(this.field1403, -33071, 0, var10, this.field1404 + 1 + var18);
                    this.field1497.method202(this.field1403, -33071, var11, var10, this.field1404 + var18);
                    Pix2D.method153((byte) 3);
                }
            } else {
                this.field1497.method202(this.field1403, -33071, 0, var10, this.field1404 + 1);
                this.field1497.method202(this.field1403, -33071, 16776960, var10, this.field1404);
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method471(int arg0) {
        byte[] var2 = this.field1484.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1664.method258(false);
        var3.method184(field1692, 0, 0);
        this.field1665.method258(false);
        var3.method184(field1692, -637, 0);
        this.field1661.method258(false);
        var3.method184(field1692, -128, 0);
        this.field1662.method258(false);
        var3.method184(field1692, -202, -371);
        this.field1663.method258(false);
        var3.method184(field1692, -202, -171);
        this.field1666.method258(false);
        var3.method184(field1692, 0, -265);
        this.field1667.method258(false);
        var3.method184(field1692, -562, -265);
        this.field1668.method258(false);
        var3.method184(field1692, -128, -171);
        this.field1669.method258(false);
        var3.method184(field1692, -562, -171);
        int[] var4 = new int[var3.field671];
        for (int var5 = 0; var5 < var3.field672; ++var5) {
            for (int var10 = 0; var10 < var3.field671; ++var10) {
                var4[var10] = var3.field670[var3.field671 * var5 + (var3.field671 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field671; ++var11) {
                var3.field670[var3.field671 * var5 + var11] = var4[var11];
            }
        }
        this.field1664.method258(false);
        var3.method184(field1692, 382, 0);
        this.field1665.method258(false);
        var3.method184(field1692, -255, 0);
        this.field1661.method258(false);
        var3.method184(field1692, 254, 0);
        this.field1662.method258(false);
        var3.method184(field1692, 180, -371);
        this.field1663.method258(false);
        var3.method184(field1692, 180, -171);
        this.field1666.method258(false);
        var3.method184(field1692, 382, -265);
        this.field1667.method258(false);
        var3.method184(field1692, -180, -265);
        this.field1668.method258(false);
        var3.method184(field1692, 254, -171);
        this.field1669.method258(false);
        var3.method184(field1692, -180, -171);
        Pix32 var6 = new Pix32(this.field1484, "logo", 0);
        this.field1661.method258(false);
        var6.method186(382 - var6.field671 / 2 - 128, 18, false);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (arg0 <= 0) {
            field1388 = !field1388;
        } else {
            if (Linkable.field368) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLlb;)V")
    private final void method472(int arg0, byte arg1, Packet arg2) {
        this.field1508 = 0;
        this.field1367 = 0;
        this.method537(arg2, (byte) -50, arg0);
        this.method469(arg2, true, arg0);
        this.method528(arg0, true, arg2);
        if (arg1 == -14) {
            this.method541(arg0, (byte) 107, arg2);
            for (int var4 = 0; var4 < this.field1508; ++var4) {
                int var6 = this.field1509[var4];
                if (field1300 != this.field1364[var6].field447) {
                    this.field1364[var6] = null;
                }
            }
            if (arg2.field712 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field712 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1365; ++var5) {
                    if (this.field1364[this.field1366[var5]] == null) {
                        signlink.reporterror(this.field1413 + " null entry in pl list - pos:" + var5 + " size:" + this.field1365);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILd;ZI)V")
    public final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6, boolean arg7, int arg8) {
        if (this.field1354) {
            this.field1374 = 32;
        } else {
            this.field1374 = 0;
        }
        this.field1354 = false;
        this.field1329 += arg5;
        if (arg3 >= arg8 && arg3 < arg8 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
            arg6.field93 -= this.field1641 * 4;
            if (arg7) {
                this.field1634 = true;
                return;
            }
        } else if (arg3 >= arg8 && arg3 < arg8 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
            arg6.field93 += this.field1641 * 4;
            if (arg7) {
                this.field1634 = true;
                return;
            }
        } else {
            if (arg3 < arg8 - this.field1374 || arg3 >= arg8 + 16 + this.field1374 || arg2 < arg1 + 16 || arg2 >= arg1 + arg4 - 16 || this.field1641 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg2 - arg1 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg6.field93 = (arg0 - arg4) * var11 / var12;
            if (arg7) {
                this.field1634 = true;
            }
            this.field1354 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;I)I")
    public final int method474(byte arg0, Component arg1, int arg2) {
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field1618 = 448;
        }
        if (arg1.field88 != null && arg2 < arg1.field88.length) {
            try {
                int[] var5 = arg1.field88[arg2];
                int var6 = 0;
                int var7 = 0;
                byte var8 = 0;
                while (true) {
                    int var9 = var5[var7++];
                    int var10 = 0;
                    byte var11 = 0;
                    if (var9 == 0) {
                        return var6;
                    }
                    if (var9 == 1) {
                        var10 = this.field1558[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field1696[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field1344[var5[var7++]];
                    }
                    if (var9 == 4) {
                        Component var12 = Component.field73[var5[var7++]];
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < ObjType.field1047 && (!ObjType.method348(var13).field1068 || field1391)) {
                            for (int var14 = 0; var14 < var12.field74.length; ++var14) {
                                if (var13 + 1 == var12.field74[var14]) {
                                    var10 += var12.field75[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field1556[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field1574[this.field1696[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field1556[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field1263.field468;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < Stats.field1161; ++var15) {
                            if (Stats.field1163[var15]) {
                                var10 += this.field1696[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        Component var16 = Component.field73[var5[var7++]];
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < ObjType.field1047 && (!ObjType.method348(var17).field1068 || field1391)) {
                            for (int var18 = 0; var18 < var16.field74.length; ++var18) {
                                if (var16.field74[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field1306;
                    }
                    if (var9 == 12) {
                        var10 = this.field1606;
                    }
                    if (var9 == 13) {
                        int var19 = this.field1556[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        VarbitType var22 = VarbitType.field1182[var21];
                        int var23 = var22.field1184;
                        int var24 = var22.field1185;
                        int var25 = var22.field1186;
                        int var26 = field1673[var25 - var24];
                        var10 = this.field1556[var23] >> var24 & var26;
                    }
                    if (var9 == 15) {
                        var11 = 1;
                    }
                    if (var9 == 16) {
                        var11 = 2;
                    }
                    if (var9 == 17) {
                        var11 = 3;
                    }
                    if (var9 == 18) {
                        var10 = (field1263.field402 >> 7) + this.field1245;
                    }
                    if (var9 == 19) {
                        var10 = (field1263.field403 >> 7) + this.field1246;
                    }
                    if (var9 == 20) {
                        var10 = var5[var7++];
                    }
                    if (var11 == 0) {
                        if (var8 == 0) {
                            var6 += var10;
                        }
                        if (var8 == 1) {
                            var6 -= var10;
                        }
                        if (var8 == 2 && var10 != 0) {
                            var6 /= var10;
                        }
                        if (var8 == 3) {
                            var6 *= var10;
                        }
                        var8 = 0;
                    } else {
                        var8 = var11;
                    }
                }
            } catch (Exception var27) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZII)V")
    private final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1599.method248(); var12 != null; var12 = (LocSpawned) this.field1599.method250(true)) {
            if (var12.field730 == arg4 && var12.field732 == arg3 && var12.field733 == arg2 && var12.field731 == arg0) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field730 = arg4;
            var11.field731 = arg0;
            var11.field732 = arg3;
            var11.field733 = arg2;
            this.method453(this.field1304, var11);
            this.field1599.method245(var11);
        }
        var11.field737 = arg5;
        var11.field739 = arg1;
        var11.field738 = arg8;
        var11.field740 = arg6;
        var11.field741 = arg9;
        if (!arg7) {
            this.field1337 = null;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method10(byte arg0) {
        if (arg0 == 12) {
            this.field1675 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILlb;)V")
    private final void method476(byte arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1367; ++var4) {
            int var5 = this.field1368[var4];
            NpcEntity var6 = this.field1309[var5];
            int var7 = arg2.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method229();
                int var9 = arg2.method229();
                var6.method114(16040, var8, var9, field1300);
                var6.field421 = field1300 + 300;
                var6.field422 = arg2.method229();
                var6.field423 = arg2.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field430 == var10) {
                    var6.field434 = 0;
                }
                int var11 = arg2.method229();
                if (var6.field430 == var10 && var10 != -1) {
                    int var12 = SeqType.field1144[var10].field1158;
                    if (var12 == 1) {
                        var6.field431 = 0;
                        var6.field432 = 0;
                        var6.field433 = var11;
                        var6.field434 = 0;
                    }
                    if (var12 == 2) {
                        var6.field434 = 0;
                    }
                } else if (var10 == -1 || var6.field430 == -1 || SeqType.field1144[var10].field1152 >= SeqType.field1144[var6.field430].field1152) {
                    var6.field430 = var10;
                    var6.field431 = 0;
                    var6.field432 = 0;
                    var6.field433 = var11;
                    var6.field434 = 0;
                    var6.field456 = var6.field451;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field424 = arg2.method231();
                if (var6.field424 == 65535) {
                    var6.field424 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field414 = arg2.method236();
                var6.field415 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method229();
                int var14 = arg2.method229();
                var6.method114(16040, var13, var14, field1300);
                var6.field421 = field1300 + 300;
                var6.field422 = arg2.method229();
                var6.field423 = arg2.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field458 = NpcType.method341(arg2.method231());
                var6.field406 = var6.field458.field1014;
                var6.field450 = var6.field458.field1036;
                var6.field409 = var6.field458.field1018;
                var6.field410 = var6.field458.field1019;
                var6.field411 = var6.field458.field1020;
                var6.field412 = var6.field458.field1021;
                var6.field407 = var6.field458.field1017;
            }
            if ((var7 & 64) == 64) {
                var6.field435 = arg2.method231();
                int var15 = arg2.method234();
                var6.field439 = var15 >> 16;
                var6.field438 = (var15 & 65535) + field1300;
                var6.field436 = 0;
                var6.field437 = 0;
                if (var6.field438 > field1300) {
                    var6.field436 = -1;
                }
                if (var6.field435 == 65535) {
                    var6.field435 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field425 = arg2.method231();
                var6.field426 = arg2.method231();
            }
        }
        if (arg0 != 9) {
            this.field1330 = arg2.method229();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method477(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 == 5) {
            boolean var4 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLlb;I)V")
    public final void method478(byte arg0, Packet arg1, int arg2) {
        if (arg0 != -96) {
            this.method6();
        }
        if (arg2 != 99 && arg2 != 131) {
            if (arg2 == 82) {
                int var4 = arg1.method229();
                int var5 = (var4 >> 4 & 7) + this.field1455;
                int var6 = (var4 & 7) + this.field1456;
                int var7 = arg1.method229();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1279[var8];
                int var11 = arg1.method231();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1343[this.field1501][var5][var6];
                    int var13 = this.field1343[this.field1501][var5 + 1][var6];
                    int var14 = this.field1343[this.field1501][var5 + 1][var6 + 1];
                    int var15 = this.field1343[this.field1501][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1569.method72((byte) -53, var6, this.field1501, var5);
                        if (var16 != null) {
                            int var17 = var16.field278 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field276 = new LocEntity(-7033, var17, var12, false, var15, var11, 2, var14, var9 + 4, var13);
                                var16.field277 = new LocEntity(-7033, var17, var12, false, var15, var11, 2, var14, var9 + 1 & 3, var13);
                            } else {
                                var16.field276 = new LocEntity(-7033, var17, var12, false, var15, var11, var8, var14, var9, var13);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1569.method73(var6, this.field1501, var5, (byte) 3);
                        if (var18 != null) {
                            var18.field168 = new LocEntity(-7033, var18.field169 >> 14 & 32767, var12, false, var15, var11, 4, var14, 0, var13);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1569.method74(var6, 0, this.field1501, var5);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field261 = new LocEntity(-7033, var19.field269 >> 14 & 32767, var12, false, var15, var11, var8, var14, var9, var13);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1569.method75(this.field1501, var5, 27, var6);
                        if (var20 != null) {
                            var20.field200 = new LocEntity(-7033, var20.field201 >> 14 & 32767, var12, false, var15, var11, 22, var14, var9, var13);
                        }
                    }
                }
            } else if (arg2 == 42) {
                int var21 = arg1.method229();
                int var22 = (var21 >> 4 & 7) + this.field1455;
                int var23 = (var21 & 7) + this.field1456;
                int var24 = arg1.method231();
                int var25 = arg1.method231();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field504 = var24;
                    var26.field505 = var25;
                    if (this.field1337[this.field1501][var22][var23] == null) {
                        this.field1337[this.field1501][var22][var23] = new LinkList(-794);
                    }
                    this.field1337[this.field1501][var22][var23].method245(var26);
                    this.method511(var22, var23);
                }
            } else if (arg2 == 139) {
                int var27 = arg1.method229();
                int var28 = (var27 >> 4 & 7) + this.field1455;
                int var29 = (var27 & 7) + this.field1456;
                int var30 = arg1.method231();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1337[this.field1501][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250(true)) {
                            if ((var30 & 32767) == var32.field504) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method248() == null) {
                            this.field1337[this.field1501][var28][var29] = null;
                        }
                        this.method511(var28, var29);
                    }
                }
            } else if (arg2 == 164) {
                int var33 = arg1.method229();
                int var34 = (var33 >> 4 & 7) + this.field1455;
                int var35 = (var33 & 7) + this.field1456;
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
                    ProjectileEntity var50 = new ProjectileEntity(this.method510(var46, var47, (byte) 51, this.field1501) - var40, 1, var45, var44, var38, var46, this.field1501, var39, var41, var47, field1300 + var43, field1300 + var42);
                    var50.method120(field1300 + var42, true, this.method510(var48, var49, (byte) 51, this.field1501) - var41, var49, var48);
                    this.field1503.method245(var50);
                }
            } else if (arg2 == 127) {
                int var51 = arg1.method229();
                int var52 = (var51 >> 4 & 7) + this.field1455;
                int var53 = (var51 & 7) + this.field1456;
                int var54 = arg1.method231();
                int var55 = arg1.method229();
                int var56 = arg1.method231();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(this.method510(var57, var58, (byte) 51, this.field1501) - var55, var58, field1300, 0, var56, this.field1501, var57, var54);
                    this.field1254.method245(var59);
                }
            } else if (arg2 == 138) {
                int var60 = arg1.method229();
                int var61 = (var60 >> 4 & 7) + this.field1455;
                int var62 = (var60 & 7) + this.field1456;
                int var63 = arg1.method231();
                int var64 = arg1.method231();
                int var65 = arg1.method231();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1328 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field504 = var63;
                    var66.field505 = var64;
                    if (this.field1337[this.field1501][var61][var62] == null) {
                        this.field1337[this.field1501][var61][var62] = new LinkList(-794);
                    }
                    this.field1337[this.field1501][var61][var62].method245(var66);
                    this.method511(var61, var62);
                }
            } else {
                if (arg2 == 91) {
                    int var67 = arg1.method229();
                    int var68 = (var67 >> 4 & 7) + this.field1455;
                    int var69 = (var67 & 7) + this.field1456;
                    int var70 = arg1.method229();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1279[var71];
                    int var74 = arg1.method231();
                    int var75 = arg1.method231();
                    int var76 = arg1.method231();
                    int var77 = arg1.method231();
                    byte var78 = arg1.method230();
                    byte var79 = arg1.method230();
                    byte var80 = arg1.method230();
                    byte var81 = arg1.method230();
                    PlayerEntity var82;
                    if (this.field1328 == var77) {
                        var82 = field1263;
                    } else {
                        var82 = this.field1364[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method330(var74);
                        int var84 = this.field1343[this.field1501][var68][var69];
                        int var85 = this.field1343[this.field1501][var68 + 1][var69];
                        int var86 = this.field1343[this.field1501][var68 + 1][var69 + 1];
                        int var87 = this.field1343[this.field1501][var68][var69 + 1];
                        Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method475(var73, 0, var69, var68, this.field1501, -1, var75 + 1, true, 0, var76 + 1);
                            var82.field472 = field1300 + var75;
                            var82.field473 = field1300 + var76;
                            var82.field477 = var88;
                            int var89 = var83.field965;
                            int var90 = var83.field966;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field966;
                                var90 = var83.field965;
                            }
                            var82.field474 = var68 * 128 + var89 * 64;
                            var82.field476 = var69 * 128 + var90 * 64;
                            var82.field475 = this.method510(var82.field474, var82.field476, (byte) 51, this.field1501);
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
                            var82.field478 = var68 + var78;
                            var82.field480 = var68 + var80;
                            var82.field479 = var69 + var79;
                            var82.field481 = var69 + var81;
                        }
                    }
                }
                if (arg2 != 193) {
                    if (arg2 == 196) {
                        int var101 = arg1.method229();
                        int var102 = (var101 >> 4 & 7) + this.field1455;
                        int var103 = (var101 & 7) + this.field1456;
                        int var104 = arg1.method231();
                        int var105 = arg1.method229();
                        int var106 = var105 >> 4 & 15;
                        int var107 = var105 & 7;
                        if (field1263.field452[0] >= var102 - var106 && field1263.field452[0] <= var102 + var106 && field1263.field453[0] >= var103 - var106 && field1263.field453[0] <= var103 + var106 && this.field1474 && !field1392 && this.field1533 < 50) {
                            this.field1652[this.field1533] = var104;
                            this.field1266[this.field1533] = var107;
                            this.field1234[this.field1533] = Wave.field915[var104];
                            ++this.field1533;
                            return;
                        }
                    }
                } else {
                    int var93 = arg1.method229();
                    int var94 = (var93 >> 4 & 7) + this.field1455;
                    int var95 = (var93 & 7) + this.field1456;
                    int var96 = arg1.method231();
                    int var97 = arg1.method231();
                    int var98 = arg1.method231();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1337[this.field1501][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250(true)) {
                                if ((var96 & 32767) == var100.field504 && var100.field505 == var97) {
                                    var100.field505 = var98;
                                    break;
                                }
                            }
                            this.method511(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var108 = arg1.method229();
            int var109 = (var108 >> 4 & 7) + this.field1455;
            int var110 = (var108 & 7) + this.field1456;
            int var111 = arg1.method229();
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = this.field1279[var112];
            int var115;
            if (arg2 == 131) {
                var115 = -1;
            } else {
                var115 = arg1.method231();
            }
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                this.method475(var114, var112, var110, var109, this.field1501, var115, 0, true, var113, -1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method479(int arg0) {
        short var2 = 256;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 10; var4 < 117; ++var4) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field1432[(var2 - 2 << 7) + var4] = 255;
            }
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field1432[var18] = 192;
        }
        for (int var6 = 1; var6 < var2 - 1; ++var6) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var6 << 7) + var14;
                this.field1433[var15] = (this.field1432[var15 - 1] + this.field1432[var15 + 1] + this.field1432[var15 - 128] + this.field1432[var15 + 128]) / 4;
            }
        }
        this.field1452 += 128;
        if (this.field1452 > this.field1526.length) {
            this.field1452 -= this.field1526.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method524(-298, this.field1684[var7]);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field1433[var12 + 128] - this.field1526[this.field1452 + var12 & this.field1526.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field1432[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field1565[var9] = this.field1565[var9 + 1];
        }
        this.field1565[var2 - 1] = (int) (Math.sin((double) field1300 / 14.0D) * 16.0D + Math.sin((double) field1300 / 15.0D) * 14.0D + Math.sin((double) field1300 / 16.0D) * 12.0D);
        if (this.field1301 > 0) {
            this.field1301 -= 4;
        }
        if (this.field1302 > 0) {
            this.field1302 -= 4;
        }
        if (this.field1301 == 0 && this.field1302 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field1301 = 1024;
            }
            if (var10 == 1) {
                this.field1302 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method480(int arg0) {
        this.field1431 = true;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            long var3 = System.currentTimeMillis();
            int var5 = 0;
            int var6 = 20;
            while (this.field1385) {
                ++this.field1671;
                this.method479(0);
                this.method479(0);
                this.method489(-616);
                ++var5;
                if (var5 > 10) {
                    long var7 = System.currentTimeMillis();
                    int var9 = (int) (var7 - var3) / 10 - var6;
                    var6 = 40 - var9;
                    if (var6 < 5) {
                        var6 = 5;
                    }
                    var5 = 0;
                    var3 = var7;
                }
                try {
                    Thread.sleep((long) var6);
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field1431 = false;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        if (arg0) {
            this.field1330 = this.field1596.method229();
        }
        int var2 = 5;
        this.field1447[8] = 0;
        int var3 = 0;
        while (this.field1447[8] == 0) {
            String var4 = "Unknown problem";
            this.method13(20, "Connecting to web server", true);
            try {
                DataInputStream var5 = this.method463("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 295);
                Packet var6 = new Packet(new byte[40], field1388);
                var5.readFully(var6.field711, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field1447[var7] = var6.method234();
                }
                int var8 = var6.method234();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field1447[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field1447[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field1447[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field1447[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field1447[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1447[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method13(10, "Game updated - please reload page", true);
                        var11 = 10;
                    } else {
                        this.method13(10, var4 + " - Will retry in " + var11 + " secs.", true);
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
                this.field1487 = !this.field1487;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        this.field1250.method218(84, 837);
        if (!arg0) {
            this.field1250.method219(7);
        }
        if (this.field1489 != -1) {
            this.field1489 = -1;
            this.field1634 = true;
            this.field1482 = false;
            this.field1377 = true;
        }
        if (this.field1236 != -1) {
            this.field1236 = -1;
            this.field1683 = true;
            this.field1482 = false;
        }
        this.field1268 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method483(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Z")
    public final boolean method484(int arg0) {
        this.field1329 += arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method485(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIIIIIZI)Z")
    public final boolean method486(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1612[var15][var35] = 0;
                this.field1449[var15][var35] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg9;
        this.field1612[arg7][arg9] = 99;
        this.field1449[arg7][arg9] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1334[var18] = arg7;
        int var36 = var18 + 1;
        this.field1335[var18] = arg9;
        boolean var20 = false;
        int var21 = this.field1334.length;
        int[][] var22 = this.field1647[this.field1501].field1105;
        this.field1277 &= arg4;
        while (var36 != var19) {
            var16 = this.field1334[var19];
            var17 = this.field1335[var19];
            var19 = (var19 + 1) % var21;
            if (arg1 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field1647[this.field1501].method368((byte) 5, arg2, var17, var16, arg5 - 1, arg1, arg8)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field1647[this.field1501].method369(47044, var16, arg8, arg5 - 1, arg2, var17, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg6 != 0 && this.field1647[this.field1501].method370(true, var17, arg6, var16, arg1, arg3, arg11, arg2)) {
                var20 = true;
                break;
            }
            int var34 = this.field1449[var16][var17] + 1;
            if (var16 > 0 && this.field1612[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1334[var36] = var16 - 1;
                this.field1335[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 - 1][var17] = 2;
                this.field1449[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1612[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1334[var36] = var16 + 1;
                this.field1335[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 + 1][var17] = 8;
                this.field1449[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1612[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1334[var36] = var16;
                this.field1335[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16][var17 - 1] = 1;
                this.field1449[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1612[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1334[var36] = var16;
                this.field1335[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16][var17 + 1] = 4;
                this.field1449[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1612[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1334[var36] = var16 - 1;
                this.field1335[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 - 1][var17 - 1] = 3;
                this.field1449[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1612[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1334[var36] = var16 + 1;
                this.field1335[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 + 1][var17 - 1] = 9;
                this.field1449[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1612[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1334[var36] = var16 - 1;
                this.field1335[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 - 1][var17 + 1] = 6;
                this.field1449[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1612[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1334[var36] = var16 + 1;
                this.field1335[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1612[var16 + 1][var17 + 1] = 12;
                this.field1449[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1627 = 0;
        if (!var20) {
            if (arg10) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg1 - var24; var25 <= arg1 + var24; ++var25) {
                        for (int var26 = arg2 - var24; var26 <= arg2 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1449[var25][var26] < var23) {
                                var23 = this.field1449[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1627 = 1;
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
        this.field1334[var27] = var16;
        int var37 = var27 + 1;
        this.field1335[var27] = var17;
        int var28;
        int var29 = var28 = this.field1612[var16][var17];
        while (arg7 != var16 || arg9 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1334[var37] = var16;
                this.field1335[var37++] = var17;
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
            var29 = this.field1612[var16][var17];
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
            int var31 = this.field1334[var37];
            int var32 = this.field1335[var37];
            if (arg0 == 0) {
                this.field1250.method218(201, 837);
                this.field1250.method219(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field1250.method218(77, 837);
                this.field1250.method219(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field1250.method218(41, 837);
                this.field1250.method219(var30 + var30 + 3);
            }
            if (super.field32[5] == 1) {
                this.field1250.method219(1);
            } else {
                this.field1250.method219(0);
            }
            this.field1250.method220(this.field1245 + var31);
            this.field1250.method220(this.field1246 + var32);
            this.field1603 = this.field1334[0];
            this.field1604 = this.field1335[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1250.method219(this.field1334[var37] - var31);
                this.field1250.method219(this.field1335[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;I)Z")
    public final boolean method487(Component arg0, int arg1) {
        int var3 = arg0.field82;
        if (arg1 != 0) {
            this.field1454 = 0;
        }
        if (this.field1289 == 2) {
            if (var3 == 201) {
                this.field1683 = true;
                this.field1285 = false;
                this.field1515 = true;
                this.field1505 = "";
                this.field1571 = 1;
                this.field1638 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1683 = true;
                this.field1285 = false;
                this.field1515 = true;
                this.field1505 = "";
                this.field1571 = 2;
                this.field1638 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1333 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1683 = true;
                this.field1285 = false;
                this.field1515 = true;
                this.field1505 = "";
                this.field1571 = 4;
                this.field1638 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1683 = true;
                this.field1285 = false;
                this.field1515 = true;
                this.field1505 = "";
                this.field1571 = 5;
                this.field1638 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1504[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1123 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1123) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1124[var6].field1130 && IdkType.field1124[var6].field1125 == var4 + (this.field1564 ? 0 : 7)) {
                            this.field1504[var4] = var6;
                            this.field1525 = true;
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
                        var9 = field1471[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1471[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1535[var7] = var9;
                this.field1525 = true;
            }
            if (var3 == 324 && !this.field1564) {
                this.field1564 = true;
                this.method546((byte) 3);
            }
            if (var3 == 325 && this.field1564) {
                this.field1564 = false;
                this.method546((byte) 3);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1280 = !this.field1280;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method482(true);
                    if (this.field1685.length() > 0) {
                        this.field1250.method218(91, 837);
                        this.field1250.method225(this.field1239, JString.method300(this.field1685));
                        this.field1250.method219(var3 - 601);
                        this.field1250.method219(this.field1280 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1250.method218(169, 837);
                this.field1250.method219(this.field1564 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1250.method219(this.field1504[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1250.method219(this.field1535[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        this.field1277 &= arg0;
        if (this.field1284 == 0) {
            if (super.field28 == 1) {
                int var2 = super.field29 - 25 - 550;
                int var3 = super.field30 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1351 + this.field1273 & 2047;
                    int var5 = Pix3D.field648[var4];
                    int var6 = Pix3D.field649[var4];
                    int var7 = (this.field1581 + 256) * var5 >> 8;
                    int var8 = (this.field1581 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1263.field402 + var9 >> 7;
                    int var12 = field1263.field403 - var10 >> 7;
                    boolean var13 = this.method486(1, var11, var12, 0, true, 0, 0, field1263.field452[0], 0, field1263.field453[0], true, 0);
                    if (var13) {
                        this.field1250.method219(var2);
                        this.field1250.method219(var3);
                        this.field1250.method220(this.field1273);
                        this.field1250.method219(57);
                        this.field1250.method219(this.field1351);
                        this.field1250.method219(this.field1581);
                        this.field1250.method219(89);
                        this.field1250.method220(field1263.field402);
                        this.field1250.method220(field1263.field403);
                        this.field1250.method219(this.field1627);
                        this.field1250.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method489(int arg0) {
        short var2 = 256;
        if (this.field1301 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1301 > 768) {
                    this.field1679[var3] = this.method530(this.field1681[var3], 1024 - this.field1301, 908, this.field1680[var3]);
                } else if (this.field1301 > 256) {
                    this.field1679[var3] = this.field1681[var3];
                } else {
                    this.field1679[var3] = this.method530(this.field1680[var3], 256 - this.field1301, 908, this.field1681[var3]);
                }
            }
        } else if (this.field1302 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1302 > 768) {
                    this.field1679[var4] = this.method530(this.field1682[var4], 1024 - this.field1302, 908, this.field1680[var4]);
                } else if (this.field1302 > 256) {
                    this.field1679[var4] = this.field1682[var4];
                } else {
                    this.field1679[var4] = this.method530(this.field1680[var4], 256 - this.field1302, 908, this.field1682[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1679[var5] = this.field1680[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1664.field750[var6] = this.field1562.field670[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1565[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1432[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1679[var26];
                    int var30 = this.field1664.field750[var8];
                    this.field1664.field750[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 != -616) {
            this.field1330 = -1;
        }
        this.field1664.method259(0, true, 0, super.field14);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1665.field750[var10] = this.field1563.field670[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1565[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1432[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1679[var18];
                    int var22 = this.field1665.field750[var16];
                    this.field1665.field750[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1665.method259(0, true, 637, super.field14);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method490(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1296 = "";
                this.field1297 = "Connecting to server...";
                this.method457(-545, true);
            }
            this.field1485 = new ClientStream((byte) -9, this, this.method485(field1390 + 43594));
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1250.field712 = 0;
            this.field1250.method219(14);
            this.field1250.method219(var6);
            this.field1485.method42(2, 0, this.field1250.field711, 459);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1485.method39();
            }
            int var8 = this.field1485.method39();
            if (var8 == 0) {
                this.field1485.method41(this.field1596.field711, 0, 8);
                this.field1596.field712 = 0;
                this.field1446 = this.field1596.method235((byte) -39);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1446 >> 32), (int) this.field1446 };
                this.field1250.field712 = 0;
                this.field1250.method219(10);
                this.field1250.method223(var9[0]);
                this.field1250.method223(var9[1]);
                this.field1250.method223(var9[2]);
                this.field1250.method223(var9[3]);
                this.field1250.method223(signlink.uid);
                this.field1250.method226(arg0);
                this.field1250.method226(arg1);
                this.field1250.method244(field1259, true, field1616);
                this.field1386.field712 = 0;
                if (arg2) {
                    this.field1386.method219(18);
                } else {
                    this.field1386.method219(16);
                }
                this.field1386.method219(this.field1250.field712 + 36 + 1 + 1 + 2);
                this.field1386.method219(255);
                this.field1386.method220(295);
                this.field1386.method219(field1392 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1386.method223(this.field1447[var10]);
                }
                this.field1386.method227(this.field1250.field712, 0, this.field1250.field711, true);
                this.field1250.field716 = new Isaac(true, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1372 = new Isaac(true, var9);
                this.field1485.method42(this.field1386.field712, 0, this.field1386.field711, 459);
                var8 = this.field1485.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method490(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1395 = this.field1485.method39();
                field1361 = this.field1485.method39() == 1;
                this.field1253 = 0L;
                this.field1453 = 0;
                this.field1534.field1000 = 0;
                super.field19 = true;
                this.field1303 = true;
                this.field1277 = true;
                this.field1250.field712 = 0;
                this.field1596.field712 = 0;
                this.field1330 = -1;
                this.field1687 = -1;
                this.field1688 = -1;
                this.field1689 = -1;
                this.field1329 = 0;
                this.field1331 = 0;
                this.field1625 = 0;
                this.field1333 = 0;
                this.field1488 = 0;
                this.field1499 = 0;
                this.field1578 = false;
                super.field20 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1283[var12] = null;
                }
                this.field1405 = 0;
                this.field1346 = 0;
                this.field1642 = 0;
                this.field1533 = 0;
                this.field1506 = (int) (Math.random() * 100.0D) - 50;
                this.field1416 = (int) (Math.random() * 110.0D) - 55;
                this.field1264 = (int) (Math.random() * 80.0D) - 40;
                this.field1351 = (int) (Math.random() * 120.0D) - 60;
                this.field1581 = (int) (Math.random() * 30.0D) - 20;
                this.field1273 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1284 = 0;
                this.field1519 = -1;
                this.field1603 = 0;
                this.field1604 = 0;
                this.field1365 = 0;
                this.field1310 = 0;
                for (int var13 = 0; var13 < this.field1362; ++var13) {
                    this.field1364[var13] = null;
                    this.field1369[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1309[var14] = null;
                }
                field1263 = this.field1364[this.field1363] = new PlayerEntity();
                this.field1503.method252();
                this.field1254.method252();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1337[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1599 = new LinkList(-794);
                this.field1289 = 0;
                this.field1288 = 0;
                this.field1500 = -1;
                this.field1236 = -1;
                this.field1268 = -1;
                this.field1489 = -1;
                this.field1646 = -1;
                this.field1482 = false;
                this.field1308 = 3;
                this.field1285 = false;
                this.field1578 = false;
                this.field1515 = false;
                this.field1251 = null;
                this.field1626 = 0;
                this.field1644 = -1;
                this.field1564 = true;
                this.method546((byte) 3);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1535[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1237[var19] = null;
                    this.field1238[var19] = false;
                }
                field1402 = 0;
                field1411 = 0;
                field1602 = 0;
                field1557 = 0;
                field1376 = 0;
                field1233 = 0;
                field1695 = 0;
                field1693 = 0;
                field1568 = 0;
                field1444 = 0;
                this.method556((byte) 6);
            } else if (var8 == 3) {
                this.field1296 = "";
                this.field1297 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1296 = "Your account has been disabled.";
                this.field1297 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1296 = "Your account is already logged in.";
                this.field1297 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1296 = "RuneScape has been updated!";
                this.field1297 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1296 = "This world is full.";
                this.field1297 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1296 = "Unable to connect.";
                this.field1297 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1296 = "Login limit exceeded.";
                this.field1297 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1296 = "Unable to connect.";
                this.field1297 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1297 = "Login server rejected session.";
                this.field1297 = "Please try again.";
            } else if (var8 == 12) {
                this.field1296 = "You need a members account to login to this world.";
                this.field1297 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1296 = "Could not complete login.";
                this.field1297 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1296 = "The server is being updated.";
                this.field1297 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1277 = true;
                this.field1250.field712 = 0;
                this.field1596.field712 = 0;
                this.field1330 = -1;
                this.field1687 = -1;
                this.field1688 = -1;
                this.field1689 = -1;
                this.field1329 = 0;
                this.field1331 = 0;
                this.field1625 = 0;
                this.field1499 = 0;
                this.field1578 = false;
                this.field1415 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1296 = "Login attempts exceeded.";
                this.field1297 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1296 = "You are standing in a members-only area.";
                this.field1297 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1296 = "Invalid loginserver requested";
                this.field1297 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1296 = "No response from server";
                    this.field1297 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1296 = "Unexpected server response";
                    this.field1297 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1485.method39(); var20 >= 0; --var20) {
                    this.field1296 = "You have only just left another world";
                    this.field1297 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method457(-545, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method490(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1296 = "";
            this.field1297 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method491(byte arg0) {
        if (this.field1488 == 2) {
            this.method539(true, this.field1621 * 2, (this.field1620 - this.field1246 << 7) + this.field1623, (this.field1619 - this.field1245 << 7) + this.field1622);
            if (arg0 != 46) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (this.field1403 > -1 && field1300 % 20 < 10) {
                this.field1528[2].method186(this.field1403 - 12, this.field1404 - 28, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (this.field1502 != 0) {
            int var2 = 0;
            if (arg0 == 31570) {
                if (this.field1625 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field1283[var3] != null) {
                        int var4 = this.field1281[var3];
                        String var5 = this.field1282[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1540 == 0 || this.field1540 == 1 && this.method517(this.field1486, var5))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field22 > 4 && super.field23 - 4 > var9 - 10 && super.field23 - 4 <= var9 + 3) {
                                int var10 = this.field1496.method204("From:  " + var5 + this.field1283[var3], 0) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field22 < var10 + 4) {
                                    if (this.field1395 >= 1) {
                                        this.field1636[this.field1499] = "Report abuse @whi@" + var5;
                                        this.field1586[this.field1499] = 2524;
                                        ++this.field1499;
                                    }
                                    this.field1636[this.field1499] = "Add ignore @whi@" + var5;
                                    this.field1586[this.field1499] = 2047;
                                    ++this.field1499;
                                    this.field1636[this.field1499] = "Add friend @whi@" + var5;
                                    this.field1586[this.field1499] = 2605;
                                    ++this.field1499;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field1540 < 2) {
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method493(int arg0, int arg1, byte[] arg2) {
        if (arg1 <= 0) {
            this.field1483 = !this.field1483;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.field1553 = new Pix8(this.field1484, "titlebox", 0);
        this.field1329 += arg0;
        this.field1554 = new Pix8(this.field1484, "titlebutton", 0);
        this.field1684 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1684[var3] = new Pix8(this.field1484, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1684[var4] = new Pix8(this.field1484, "runes", (var4 & 3) + 12);
            }
        }
        this.field1562 = new Pix32(128, 265);
        this.field1563 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1562.field670[var5] = this.field1664.field750[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1563.field670[var6] = this.field1665.field750[var6];
        }
        this.field1680 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1680[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1680[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1680[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1680[var10 + 192] = 16777215;
        }
        this.field1681 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1681[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1681[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1681[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1681[var14 + 192] = 16777215;
        }
        this.field1682 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1682[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1682[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1682[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1682[var18 + 192] = 16777215;
        }
        this.field1679 = new int[256];
        this.field1526 = new int[32768];
        this.field1527 = new int[32768];
        this.method524(-298, (Pix8) null);
        this.field1432 = new int[32768];
        this.field1433 = new int[32768];
        this.method13(10, "Connecting to fileserver", true);
        if (!this.field1385) {
            this.field1312 = true;
            this.field1385 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method495(int arg0, int arg1) {
        if (arg1 > 0) {
            Component var3 = Component.field73[arg0];
            for (int var4 = 0; var4 < var3.field95.length && var3.field95[var4] != -1; ++var4) {
                Component var5 = Component.field73[var3.field95[var4]];
                if (var5.field80 == 1) {
                    this.method495(var5.field78, this.field1469);
                }
                var5.field76 = 0;
                var5.field77 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (this.field1539 == arg0) {
            for (int var2 = -1; var2 < this.field1365; ++var2) {
                int var3;
                if (var2 == -1) {
                    var3 = this.field1363;
                } else {
                    var3 = this.field1366[var2];
                }
                PlayerEntity var4 = this.field1364[var3];
                if (var4 != null) {
                    this.method444(-43008, 1, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method497(byte arg0) {
        if (arg0 != -126) {
            field1601 = this.field1372.method295();
        }
        while (true) {
            OnDemandRequest var2 = this.field1424.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field725 == 0) {
                Model.method124(var2.field726, (byte) 2, var2.field727);
                if ((this.field1424.method277(var2.field726, 3) & 98) != 0) {
                    this.field1634 = true;
                    if (this.field1236 != -1) {
                        this.field1683 = true;
                    }
                }
            }
            if (var2.field725 == 1 && var2.field727 != null) {
                AnimFrame.method45(255, var2.field727);
            }
            if (var2.field725 == 2 && this.field1576 == var2.field726 && var2.field727 != null) {
                this.method516(this.field1577, var2.field727, 399);
            }
            if (var2.field725 == 3 && this.field1642 == 1) {
                for (int var3 = 0; var3 < this.field1592.length; ++var3) {
                    if (this.field1257[var3] == var2.field726) {
                        this.field1592[var3] = var2.field727;
                        if (var2.field727 == null) {
                            this.field1257[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1258[var3] == var2.field726) {
                        this.field1472[var3] = var2.field727;
                        if (var2.field727 == null) {
                            this.field1258[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field725 == 93 && this.field1424.method276((byte) 9, var2.field726)) {
                World.method17(371, this.field1424, new Packet(var2.field727, field1388));
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method498(int arg0, int arg1) {
        int var3 = VarpType.field1193[arg0].field1201;
        int var4 = 16 / arg1;
        if (var3 != 0) {
            int var5 = this.field1556[arg0];
            if (var3 == 1) {
                if (var5 == 1) {
                    Pix3D.method173(0.9D, -669);
                }
                if (var5 == 2) {
                    Pix3D.method173(0.8D, -669);
                }
                if (var5 == 3) {
                    Pix3D.method173(0.7D, -669);
                }
                if (var5 == 4) {
                    Pix3D.method173(0.6D, -669);
                }
                ObjType.field1094.method103();
                this.field1675 = true;
            }
            if (var3 == 3) {
                boolean var6 = this.field1353;
                if (var5 == 0) {
                    this.method542(this.field1353, (byte) -78, 0);
                    this.field1353 = true;
                }
                if (var5 == 1) {
                    this.method542(this.field1353, (byte) -78, -400);
                    this.field1353 = true;
                }
                if (var5 == 2) {
                    this.method542(this.field1353, (byte) -78, -800);
                    this.field1353 = true;
                }
                if (var5 == 3) {
                    this.method542(this.field1353, (byte) -78, -1200);
                    this.field1353 = true;
                }
                if (var5 == 4) {
                    this.field1353 = false;
                }
                if (this.field1353 != var6 && !field1392) {
                    if (this.field1353) {
                        this.field1576 = this.field1583;
                        this.field1577 = true;
                        this.field1424.method279(2, this.field1576);
                    } else {
                        this.method532((byte) -111);
                    }
                    this.field1514 = 0;
                }
            }
            if (var3 == 4) {
                if (var5 == 0) {
                    this.field1474 = true;
                    this.method559((byte) 2, 0);
                }
                if (var5 == 1) {
                    this.field1474 = true;
                    this.method559((byte) 2, -400);
                }
                if (var5 == 2) {
                    this.field1474 = true;
                    this.method559((byte) 2, -800);
                }
                if (var5 == 3) {
                    this.field1474 = true;
                    this.method559((byte) 2, -1200);
                }
                if (var5 == 4) {
                    this.field1474 = false;
                }
            }
            if (var3 == 5) {
                this.field1382 = var5;
            }
            if (var3 == 6) {
                this.field1290 = var5;
            }
            if (var3 == 8) {
                this.field1502 = var5;
                this.field1683 = true;
            }
            if (var3 == 9) {
                this.field1383 = var5;
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method499(int arg0) {
        for (int var2 = 0; var2 < this.field1533; ++var2) {
            if (this.field1234[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1652[var2] == this.field1591 && this.field1266[var2] == this.field1231) {
                        if (!this.method484(0)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(this.field1266[var2], this.field1652[var2], 8);
                        if (System.currentTimeMillis() + (long) (var4.field712 / 22) > (long) (this.field1476 / 22) + this.field1378) {
                            this.field1476 = var4.field712;
                            this.field1378 = System.currentTimeMillis();
                            if (this.method493(var4.field712, 875, var4.field711)) {
                                this.field1591 = this.field1652[var2];
                                this.field1231 = this.field1266[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1234[var2] != -5) {
                    this.field1234[var2] = -5;
                } else {
                    --this.field1533;
                    for (int var6 = var2; var6 < this.field1533; ++var6) {
                        this.field1652[var6] = this.field1652[var6 + 1];
                        this.field1266[var6] = this.field1266[var6 + 1];
                        this.field1234[var6] = this.field1234[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1234[var2]--;
            }
        }
        if (arg0 == 34790) {
            if (this.field1514 > 0) {
                this.field1514 -= 20;
                if (this.field1514 < 0) {
                    this.field1514 = 0;
                }
                if (this.field1514 == 0 && this.field1353 && !field1392) {
                    this.field1576 = this.field1583;
                    this.field1577 = true;
                    this.field1424.method279(2, this.field1576);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method500(boolean arg0) {
        this.field1435.method258(false);
        if (this.field1284 == 2) {
            byte[] var2 = this.field1380.field681;
            int[] var3 = Pix2D.field627;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1570.method190(33, 25, 256, 33, 25, this.field1294, 0, 0, this.field1579, 606, this.field1273);
            this.field1436.method258(false);
        } else {
            int var6 = this.field1351 + this.field1273 & 2047;
            int var7 = field1263.field402 / 32 + 48;
            int var8 = 464 - field1263.field403 / 32;
            this.field1605.method190(146, var8, this.field1581 + 256, 151, var7, this.field1639, 25, 5, this.field1470, 606, var6);
            if (arg0) {
                this.field1330 = this.field1596.method229();
            }
            this.field1570.method190(33, 25, 256, 33, 25, this.field1294, 0, 0, this.field1579, 606, this.field1273);
            for (int var9 = 0; var9 < this.field1242; ++var9) {
                int var38 = this.field1243[var9] * 4 + 2 - field1263.field402 / 32;
                int var39 = this.field1244[var9] * 4 + 2 - field1263.field403 / 32;
                this.method520(var38, this.field1293[var9], 83, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var34 = 0; var34 < 104; ++var34) {
                    LinkList var35 = this.field1337[this.field1501][var10][var34];
                    if (var35 != null) {
                        int var36 = var10 * 4 + 2 - field1263.field402 / 32;
                        int var37 = var34 * 4 + 2 - field1263.field403 / 32;
                        this.method520(var36, this.field1396, 83, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field1310; ++var11) {
                NpcEntity var30 = this.field1309[this.field1311[var11]];
                if (var30 != null && var30.method113(this.field1640)) {
                    NpcType var31 = var30.field458;
                    if (var31.field1037 != null) {
                        var31 = var31.method345(-13461);
                    }
                    if (var31 != null && var31.field1028) {
                        int var32 = var30.field402 / 32 - field1263.field402 / 32;
                        int var33 = var30.field403 / 32 - field1263.field403 / 32;
                        this.method520(var32, this.field1397, 83, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1365; ++var12) {
                PlayerEntity var23 = this.field1364[this.field1366[var12]];
                if (var23 != null && var23.method113(this.field1640)) {
                    int var24 = var23.field402 / 32 - field1263.field402 / 32;
                    int var25 = var23.field403 / 32 - field1263.field403 / 32;
                    boolean var26 = false;
                    long var27 = JString.method300(var23.field462);
                    for (int var29 = 0; var29 < this.field1288; ++var29) {
                        if (this.field1360[var29] == var27 && this.field1637[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    if (field1263.field485 != 0 && var23.field485 != 0) {
                        if (field1263.field485 == var23.field485) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (var26) {
                        this.method520(var24, this.field1399, 83, var25);
                    } else {
                        this.method520(var24, this.field1398, 83, var25);
                    }
                }
            }
            if (this.field1488 != 0 && field1300 % 20 < 10) {
                if (this.field1488 == 1 && this.field1241 >= 0 && this.field1241 < this.field1309.length) {
                    NpcEntity var13 = this.field1309[this.field1241];
                    if (var13 != null) {
                        int var14 = var13.field402 / 32 - field1263.field402 / 32;
                        int var15 = var13.field403 / 32 - field1263.field403 / 32;
                        this.method523(this.field1517, var15, 0, var14);
                    }
                }
                if (this.field1488 == 2) {
                    int var16 = (this.field1619 - this.field1245) * 4 + 2 - field1263.field402 / 32;
                    int var17 = (this.field1620 - this.field1246) * 4 + 2 - field1263.field403 / 32;
                    this.method523(this.field1517, var17, 0, var16);
                }
                if (this.field1488 == 10 && this.field1691 >= 0 && this.field1691 < this.field1364.length) {
                    PlayerEntity var18 = this.field1364[this.field1691];
                    if (var18 != null) {
                        int var19 = var18.field402 / 32 - field1263.field402 / 32;
                        int var20 = var18.field403 / 32 - field1263.field403 / 32;
                        this.method523(this.field1517, var20, 0, var19);
                    }
                }
            }
            if (this.field1603 != 0) {
                int var21 = this.field1603 * 4 + 2 - field1263.field402 / 32;
                int var22 = this.field1604 * 4 + 2 - field1263.field403 / 32;
                this.method520(var21, this.field1516, 83, var22);
            }
            Pix2D.method157(16777215, 3, 3, 97, 78, this.field1267);
            this.field1436.method258(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lgc;IIZI)V")
    public final void method501(NpcType arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field1388 = !field1388;
        }
        if (this.field1499 < 400) {
            if (arg0.field1037 != null) {
                arg0 = arg0.method345(-13461);
            }
            if (arg0 != null) {
                String var6 = arg0.field1012;
                if (arg0.field1029 != 0) {
                    var6 = var6 + method464(field1263.field468, -370, arg0.field1029) + " (level-" + arg0.field1029 + ")";
                }
                if (this.field1405 == 1) {
                    this.field1636[this.field1499] = "Use " + this.field1409 + " with @yel@" + var6;
                    this.field1586[this.field1499] = 829;
                    this.field1587[this.field1499] = arg1;
                    this.field1584[this.field1499] = arg4;
                    this.field1585[this.field1499] = arg2;
                    ++this.field1499;
                } else {
                    if (this.field1346 == 1) {
                        if ((this.field1348 & 2) == 2) {
                            this.field1636[this.field1499] = this.field1349 + " @yel@" + var6;
                            this.field1586[this.field1499] = 240;
                            this.field1587[this.field1499] = arg1;
                            this.field1584[this.field1499] = arg4;
                            this.field1585[this.field1499] = arg2;
                            ++this.field1499;
                            return;
                        }
                    } else {
                        if (arg0.field1024 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg0.field1024[var7] != null && !arg0.field1024[var7].equalsIgnoreCase("attack")) {
                                    this.field1636[this.field1499] = arg0.field1024[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1586[this.field1499] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1586[this.field1499] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1586[this.field1499] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1586[this.field1499] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1586[this.field1499] = 793;
                                    }
                                    this.field1587[this.field1499] = arg1;
                                    this.field1584[this.field1499] = arg4;
                                    this.field1585[this.field1499] = arg2;
                                    ++this.field1499;
                                }
                            }
                        }
                        if (arg0.field1024 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg0.field1024[var8] != null && arg0.field1024[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg0.field1029 > field1263.field468) {
                                        var9 = 2000;
                                    }
                                    this.field1636[this.field1499] = arg0.field1024[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1586[this.field1499] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1586[this.field1499] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1586[this.field1499] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1586[this.field1499] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1586[this.field1499] = var9 + 793;
                                    }
                                    this.field1587[this.field1499] = arg1;
                                    this.field1584[this.field1499] = arg4;
                                    this.field1585[this.field1499] = arg2;
                                    ++this.field1499;
                                }
                            }
                        }
                        this.field1636[this.field1499] = "Examine @yel@" + var6;
                        this.field1586[this.field1499] = 1714;
                        this.field1587[this.field1499] = arg1;
                        this.field1584[this.field1499] = arg4;
                        this.field1585[this.field1499] = arg2;
                        ++this.field1499;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Z")
    public final boolean method502(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1586[arg0];
            if (arg1 >= 0) {
                this.field1330 = this.field1596.method229();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method503(int arg0) {
        if (arg0 < 0) {
            int var2 = this.field1458;
            int var3 = this.field1459;
            int var4 = this.field1460;
            int var5 = this.field1461;
            int var6 = 6116423;
            Pix2D.method157(var6, var5, var4, var2, var3, this.field1267);
            Pix2D.method157(0, 16, var4 - 2, var2 + 1, var3 + 1, this.field1267);
            Pix2D.method158(var5 - 19, var3 + 18, 0, var4 - 2, 3, var2 + 1);
            this.field1497.method206(var3 + 14, var6, var2 + 3, "Choose Option", 3);
            int var7 = super.field22;
            int var8 = super.field23;
            if (this.field1457 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field1457 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field1457 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field1499; ++var9) {
                int var10 = (this.field1499 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field1497.method210(var11, var2 + 3, true, var10, this.field1636[var9], 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1645 && !this.field1481 && !this.field1375) {
            ++field1300;
            if (!this.field1277) {
                this.method533((byte) 5);
            } else {
                this.method540((byte) 5);
            }
            this.method497((byte) -126);
            int var2 = 66 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method504(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method505(int arg0, Component arg1) {
        if (arg1.field89 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field89.length; ++var3) {
                int var4 = this.method474(this.field1295, arg1, var3);
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
            if (arg0 != 0) {
                field1552 = !field1552;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method506(int arg0, int arg1, int arg2) {
        int var4 = 0;
        int var5 = 13 / arg1;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field1283[var6] != null) {
                int var7 = this.field1281[var6];
                int var8 = 70 - var4 * 14 + this.field1441 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field1282[var6];
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
                    ++var4;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1240 == 0 || this.field1240 == 1 && this.method517(this.field1486, var9))) {
                    if (arg2 > var8 - 14 && arg2 <= var8 && !var9.equals(field1263.field462)) {
                        if (this.field1395 >= 1) {
                            this.field1636[this.field1499] = "Report abuse @whi@" + var9;
                            this.field1586[this.field1499] = 524;
                            ++this.field1499;
                        }
                        this.field1636[this.field1499] = "Add ignore @whi@" + var9;
                        this.field1586[this.field1499] = 47;
                        ++this.field1499;
                        this.field1636[this.field1499] = "Add friend @whi@" + var9;
                        this.field1586[this.field1499] = 605;
                        ++this.field1499;
                    }
                    ++var4;
                }
                if ((var7 == 3 || var7 == 7) && this.field1502 == 0 && (var7 == 7 || this.field1540 == 0 || this.field1540 == 1 && this.method517(this.field1486, var9))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        if (this.field1395 >= 1) {
                            this.field1636[this.field1499] = "Report abuse @whi@" + var9;
                            this.field1586[this.field1499] = 524;
                            ++this.field1499;
                        }
                        this.field1636[this.field1499] = "Add ignore @whi@" + var9;
                        this.field1586[this.field1499] = 47;
                        ++this.field1499;
                        this.field1636[this.field1499] = "Add friend @whi@" + var9;
                        this.field1586[this.field1499] = 605;
                        ++this.field1499;
                    }
                    ++var4;
                }
                if (var7 == 4 && (this.field1410 == 0 || this.field1410 == 1 && this.method517(this.field1486, var9))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field1636[this.field1499] = "Accept trade @whi@" + var9;
                        this.field1586[this.field1499] = 507;
                        ++this.field1499;
                    }
                    ++var4;
                }
                if ((var7 == 5 || var7 == 6) && this.field1502 == 0 && this.field1540 < 2) {
                    ++var4;
                }
                if (var7 == 8 && (this.field1410 == 0 || this.field1410 == 1 && this.method517(this.field1486, var9))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field1636[this.field1499] = "Accept challenge @whi@" + var9;
                        this.field1586[this.field1499] = 957;
                        ++this.field1499;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)Z")
    public final boolean method507(boolean arg0) {
        this.field1277 &= arg0;
        if (this.field1485 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1485.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1330 == -1) {
                    this.field1485.method41(this.field1596.field711, 0, 1);
                    this.field1330 = this.field1596.field711[0] & 255;
                    if (this.field1372 != null) {
                        this.field1330 = this.field1330 - this.field1372.method295() & 255;
                    }
                    this.field1329 = Protocol.field1096[this.field1330];
                    --var2;
                }
                if (this.field1329 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1485.method41(this.field1596.field711, 0, 1);
                    this.field1329 = this.field1596.field711[0] & 255;
                    --var2;
                }
                if (this.field1329 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1485.method41(this.field1596.field711, 0, 2);
                    this.field1596.field712 = 0;
                    this.field1329 = this.field1596.method231();
                    var2 -= 2;
                }
                if (var2 < this.field1329) {
                    return false;
                }
                this.field1596.field712 = 0;
                this.field1485.method41(this.field1596.field711, 0, this.field1329);
                this.field1331 = 0;
                this.field1689 = this.field1688;
                this.field1688 = this.field1687;
                this.field1687 = this.field1330;
                if (this.field1330 == 89) {
                    this.field1686 = true;
                    this.field1419 = this.field1596.method229();
                    this.field1420 = this.field1596.method229();
                    this.field1421 = this.field1596.method231();
                    this.field1422 = this.field1596.method229();
                    this.field1423 = this.field1596.method229();
                    if (this.field1423 >= 100) {
                        this.field1355 = this.field1419 * 128 + 64;
                        this.field1357 = this.field1420 * 128 + 64;
                        this.field1356 = this.method510(this.field1355, this.field1357, (byte) 51, this.field1501) - this.field1421;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 20) {
                    this.field1240 = this.field1596.method229();
                    this.field1540 = this.field1596.method229();
                    this.field1410 = this.field1596.method229();
                    this.field1559 = true;
                    this.field1683 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 140) {
                    this.method472(this.field1329, (byte) -14, this.field1596);
                    this.field1480 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 38) {
                    int var3 = this.field1596.method231();
                    int var4 = this.field1596.method231();
                    Component.field73[var3].field122 = 1;
                    Component.field73[var3].field123 = var4;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 90) {
                    int var5 = this.field1596.method231();
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    if (this.field1583 != var5 && this.field1353 && !field1392 && this.field1514 == 0) {
                        this.field1576 = var5;
                        this.field1577 = true;
                        this.field1424.method279(2, this.field1576);
                    }
                    this.field1583 = var5;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 84) {
                    int var6 = this.field1596.method231();
                    int var7 = this.field1596.method231();
                    if (this.field1353 && !field1392) {
                        this.field1576 = var6;
                        this.field1577 = false;
                        this.field1424.method279(2, this.field1576);
                        this.field1514 = var7;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 10) {
                    this.field1686 = true;
                    this.field1520 = this.field1596.method229();
                    this.field1521 = this.field1596.method229();
                    this.field1522 = this.field1596.method231();
                    this.field1523 = this.field1596.method229();
                    this.field1524 = this.field1596.method229();
                    if (this.field1524 >= 100) {
                        int var8 = this.field1520 * 128 + 64;
                        int var9 = this.field1521 * 128 + 64;
                        int var10 = this.method510(var8, var9, (byte) 51, this.field1501) - this.field1522;
                        int var11 = var8 - this.field1355;
                        int var12 = var10 - this.field1356;
                        int var13 = var9 - this.field1357;
                        int var14 = (int) Math.sqrt((double) (var11 * var11 + var13 * var13));
                        this.field1358 = (int) (Math.atan2((double) var12, (double) var14) * 325.949D) & 2047;
                        this.field1359 = (int) (Math.atan2((double) var11, (double) var13) * -325.949D) & 2047;
                        if (this.field1358 < 128) {
                            this.field1358 = 128;
                        }
                        if (this.field1358 > 383) {
                            this.field1358 = 383;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 29) {
                    int var15 = this.field1596.method232();
                    this.field1500 = var15;
                    this.field1683 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 106) {
                    long var16 = this.field1596.method235((byte) -39);
                    int var18 = this.field1596.method229();
                    String var19 = JString.method304(false, JString.method301(false, var16));
                    for (int var20 = 0; var20 < this.field1288; ++var20) {
                        if (this.field1360[var20] == var16) {
                            if (this.field1637[var20] != var18) {
                                this.field1637[var20] = var18;
                                this.field1634 = true;
                                if (var18 > 0) {
                                    this.method440("", var19 + " has logged in.", 5, 811);
                                }
                                if (var18 == 0) {
                                    this.method440("", var19 + " has logged out.", 5, 811);
                                }
                            }
                            var19 = null;
                            break;
                        }
                    }
                    if (var19 != null && this.field1288 < 200) {
                        this.field1360[this.field1288] = var16;
                        this.field1451[this.field1288] = var19;
                        this.field1637[this.field1288] = var18;
                        ++this.field1288;
                        this.field1634 = true;
                    }
                    boolean var21 = false;
                    while (!var21) {
                        var21 = true;
                        for (int var22 = 0; var22 < this.field1288 - 1; ++var22) {
                            if (this.field1637[var22] != field1389 && this.field1637[var22 + 1] == field1389 || this.field1637[var22] == 0 && this.field1637[var22 + 1] != 0) {
                                int var23 = this.field1637[var22];
                                this.field1637[var22] = this.field1637[var22 + 1];
                                this.field1637[var22 + 1] = var23;
                                String var24 = this.field1451[var22];
                                this.field1451[var22] = this.field1451[var22 + 1];
                                this.field1451[var22 + 1] = var24;
                                long var25 = this.field1360[var22];
                                this.field1360[var22] = this.field1360[var22 + 1];
                                this.field1360[var22 + 1] = var25;
                                this.field1634 = true;
                                var21 = false;
                            }
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 108) {
                    int var27 = this.field1596.method231();
                    Component.field73[var27].field122 = 3;
                    if (field1263.field484 == null) {
                        Component.field73[var27].field123 = (field1263.field466[11] << 5) + (field1263.field466[8] << 10) + (field1263.field466[0] << 15) + (field1263.field467[0] << 25) + (field1263.field467[4] << 20) + field1263.field466[1];
                    } else {
                        Component.field73[var27].field123 = (int) (field1263.field484.field1011 + 305419896L);
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 13) {
                    int var28 = this.field1596.method231();
                    String var29 = this.field1596.method236();
                    Component.field73[var28].field114 = var29;
                    if (this.field1393[this.field1308] == Component.field73[var28].field79) {
                        this.field1634 = true;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 79) {
                    this.field1289 = this.field1596.method229();
                    this.field1634 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 163) {
                    int var30 = this.field1596.method231();
                    int var31 = this.field1596.method231();
                    Component var32 = Component.field73[var30];
                    if (var32 != null && var32.field80 == 0) {
                        if (var31 < 0) {
                            var31 = 0;
                        }
                        if (var31 > var32.field92 - var32.field84) {
                            var31 = var32.field92 - var32.field84;
                        }
                        var32.field93 = var31;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 195) {
                    this.field1603 = 0;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 50) {
                    this.field1308 = this.field1596.method229();
                    this.field1634 = true;
                    this.field1377 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 191) {
                    int var33 = this.field1596.method231();
                    this.method495(var33, this.field1469);
                    if (this.field1489 != -1) {
                        this.field1489 = -1;
                        this.field1634 = true;
                        this.field1377 = true;
                    }
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1683 = true;
                    }
                    if (this.field1285) {
                        this.field1285 = false;
                        this.field1683 = true;
                    }
                    this.field1268 = var33;
                    this.field1482 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 53) {
                    int var34 = this.field1596.method229();
                    int var35 = this.field1596.method229();
                    String var36 = this.field1596.method236();
                    if (var34 >= 1 && var34 <= 5) {
                        if (var36.equalsIgnoreCase("null")) {
                            var36 = null;
                        }
                        this.field1237[var34 - 1] = var36;
                        this.field1238[var34 - 1] = var35 == 0;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 171) {
                    this.field1644 = this.field1596.method229();
                    if (this.field1644 == this.field1308) {
                        if (this.field1644 == 3) {
                            this.field1308 = 1;
                        } else {
                            this.field1308 = 3;
                        }
                        this.field1634 = true;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 40) {
                    int var37 = this.field1596.method231();
                    int var38 = this.field1596.method231();
                    if (this.field1510 == var37 && this.field1511 == var38 && this.field1642 == 2) {
                        this.field1330 = -1;
                        return true;
                    }
                    this.field1510 = var37;
                    this.field1511 = var38;
                    this.field1245 = (this.field1510 - 6) * 8;
                    this.field1246 = (this.field1511 - 6) * 8;
                    this.field1555 = false;
                    if ((this.field1510 / 8 == 48 || this.field1510 / 8 == 49) && this.field1511 / 8 == 48) {
                        this.field1555 = true;
                    }
                    if (this.field1510 / 8 == 48 && this.field1511 / 8 == 148) {
                        this.field1555 = true;
                    }
                    this.field1642 = 1;
                    this.field1415 = System.currentTimeMillis();
                    this.field1436.method258(false);
                    this.field1496.method202(257, -33071, 0, "Loading - please wait.", 151);
                    this.field1496.method202(256, -33071, 16777215, "Loading - please wait.", 150);
                    this.field1436.method259(4, true, 4, super.field14);
                    int var39 = 0;
                    for (int var40 = (this.field1510 - 6) / 8; var40 <= (this.field1510 + 6) / 8; ++var40) {
                        for (int var41 = (this.field1511 - 6) / 8; var41 <= (this.field1511 + 6) / 8; ++var41) {
                            ++var39;
                        }
                    }
                    this.field1592 = new byte[var39][];
                    this.field1472 = new byte[var39][];
                    this.field1256 = new int[var39];
                    this.field1257 = new int[var39];
                    this.field1258 = new int[var39];
                    int var42 = 0;
                    for (int var43 = (this.field1510 - 6) / 8; var43 <= (this.field1510 + 6) / 8; ++var43) {
                        for (int var44 = (this.field1511 - 6) / 8; var44 <= (this.field1511 + 6) / 8; ++var44) {
                            this.field1256[var42] = (var43 << 8) + var44;
                            if (!this.field1555 || var44 != 49 && var44 != 149 && var44 != 147 && var43 != 50 && (var43 != 49 || var44 != 47)) {
                                int var45 = this.field1257[var42] = this.field1424.method274(0, var44, -28157, var43);
                                if (var45 != -1) {
                                    this.field1424.method279(3, var45);
                                }
                                int var46 = this.field1258[var42] = this.field1424.method274(1, var44, -28157, var43);
                                if (var46 != -1) {
                                    this.field1424.method279(3, var46);
                                }
                                ++var42;
                            } else {
                                this.field1257[var42] = -1;
                                this.field1258[var42] = -1;
                                ++var42;
                            }
                        }
                    }
                    int var47 = this.field1245 - this.field1247;
                    int var48 = this.field1246 - this.field1248;
                    this.field1247 = this.field1245;
                    this.field1248 = this.field1246;
                    for (int var49 = 0; var49 < 16384; ++var49) {
                        NpcEntity var50 = this.field1309[var49];
                        if (var50 != null) {
                            for (int var51 = 0; var51 < 10; ++var51) {
                                var50.field452[var51] -= var47;
                                var50.field453[var51] -= var48;
                            }
                            var50.field402 -= var47 * 128;
                            var50.field403 -= var48 * 128;
                        }
                    }
                    for (int var52 = 0; var52 < this.field1362; ++var52) {
                        PlayerEntity var53 = this.field1364[var52];
                        if (var53 != null) {
                            for (int var54 = 0; var54 < 10; ++var54) {
                                var53.field452[var54] -= var47;
                                var53.field453[var54] -= var48;
                            }
                            var53.field402 -= var47 * 128;
                            var53.field403 -= var48 * 128;
                        }
                    }
                    this.field1480 = true;
                    byte var55 = 0;
                    byte var56 = 104;
                    byte var57 = 1;
                    if (var47 < 0) {
                        var55 = 103;
                        var56 = -1;
                        var57 = -1;
                    }
                    byte var58 = 0;
                    byte var59 = 104;
                    byte var60 = 1;
                    if (var48 < 0) {
                        var58 = 103;
                        var59 = -1;
                        var60 = -1;
                    }
                    for (int var61 = var55; var56 != var61; var61 += var57) {
                        for (int var62 = var58; var59 != var62; var62 += var60) {
                            int var63 = var47 + var61;
                            int var64 = var48 + var62;
                            for (int var65 = 0; var65 < 4; ++var65) {
                                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                                    this.field1337[var65][var61][var62] = this.field1337[var65][var63][var64];
                                } else {
                                    this.field1337[var65][var61][var62] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var66 = (LocSpawned) this.field1599.method248(); var66 != null; var66 = (LocSpawned) this.field1599.method250(true)) {
                        var66.field732 -= var47;
                        var66.field733 -= var48;
                        if (var66.field732 < 0 || var66.field733 < 0 || var66.field732 >= 104 || var66.field733 >= 104) {
                            var66.method106();
                        }
                    }
                    if (this.field1603 != 0) {
                        this.field1603 -= var47;
                        this.field1604 -= var48;
                    }
                    this.field1686 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 87) {
                    int var67 = this.field1596.method231();
                    this.method495(var67, this.field1469);
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1683 = true;
                    }
                    if (this.field1285) {
                        this.field1285 = false;
                        this.field1683 = true;
                    }
                    this.field1489 = var67;
                    this.field1634 = true;
                    this.field1377 = true;
                    this.field1268 = -1;
                    this.field1482 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 59) {
                    String var68 = this.field1596.method236();
                    if (var68.endsWith(":tradereq:")) {
                        String var69 = var68.substring(0, var68.indexOf(":"));
                        long var70 = JString.method300(var69);
                        boolean var72 = false;
                        for (int var73 = 0; var73 < this.field1580; ++var73) {
                            if (this.field1536[var73] == var70) {
                                var72 = true;
                                break;
                            }
                        }
                        if (!var72 && this.field1235 == 0) {
                            this.method440(var69, "wishes to trade with you.", 4, 811);
                        }
                    } else if (var68.endsWith(":duelreq:")) {
                        String var74 = var68.substring(0, var68.indexOf(":"));
                        long var75 = JString.method300(var74);
                        boolean var77 = false;
                        for (int var78 = 0; var78 < this.field1580; ++var78) {
                            if (this.field1536[var78] == var75) {
                                var77 = true;
                                break;
                            }
                        }
                        if (!var77 && this.field1235 == 0) {
                            this.method440(var74, "wishes to duel with you.", 8, 811);
                        }
                    } else if (!var68.endsWith(":chalreq:")) {
                        this.method440("", var68, 0, 811);
                    } else {
                        String var79 = var68.substring(0, var68.indexOf(":"));
                        long var80 = JString.method300(var79);
                        boolean var82 = false;
                        for (int var83 = 0; var83 < this.field1580; ++var83) {
                            if (this.field1536[var83] == var80) {
                                var82 = true;
                                break;
                            }
                        }
                        if (!var82 && this.field1235 == 0) {
                            String var84 = var68.substring(var68.indexOf(":") + 1, var68.length() - 9);
                            this.method440(var79, var84, 8, 811);
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 77) {
                    this.field1580 = this.field1329 / 8;
                    for (int var85 = 0; var85 < this.field1580; ++var85) {
                        this.field1536[var85] = this.field1596.method235((byte) -39);
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 213) {
                    this.field1488 = this.field1596.method229();
                    if (this.field1488 == 1) {
                        this.field1241 = this.field1596.method231();
                    }
                    if (this.field1488 >= 2 && this.field1488 <= 6) {
                        if (this.field1488 == 2) {
                            this.field1622 = 64;
                            this.field1623 = 64;
                        }
                        if (this.field1488 == 3) {
                            this.field1622 = 0;
                            this.field1623 = 64;
                        }
                        if (this.field1488 == 4) {
                            this.field1622 = 128;
                            this.field1623 = 64;
                        }
                        if (this.field1488 == 5) {
                            this.field1622 = 64;
                            this.field1623 = 0;
                        }
                        if (this.field1488 == 6) {
                            this.field1622 = 64;
                            this.field1623 = 128;
                        }
                        this.field1488 = 2;
                        this.field1619 = this.field1596.method231();
                        this.field1620 = this.field1596.method231();
                        this.field1621 = this.field1596.method229();
                    }
                    if (this.field1488 == 10) {
                        this.field1691 = this.field1596.method231();
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 237) {
                    int var86 = this.field1596.method231();
                    int var87 = this.field1596.method231();
                    int var88 = var87 >> 10 & 31;
                    int var89 = var87 >> 5 & 31;
                    int var90 = var87 & 31;
                    Component.field73[var86].field116 = (var90 << 3) + (var88 << 19) + (var89 << 11);
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 65) {
                    this.field1455 = this.field1596.method229();
                    this.field1456 = this.field1596.method229();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 194) {
                    this.field1626 = this.field1596.method229();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 220) {
                    int var91 = this.field1596.method231();
                    int var92 = this.field1596.method231();
                    Component.field73[var91].field122 = 2;
                    Component.field73[var91].field123 = var92;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 165) {
                    if (this.field1489 != -1) {
                        this.field1489 = -1;
                        this.field1634 = true;
                        this.field1377 = true;
                    }
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1683 = true;
                    }
                    if (this.field1285) {
                        this.field1285 = false;
                        this.field1683 = true;
                    }
                    this.field1268 = -1;
                    this.field1482 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 133) {
                    int var93 = this.field1596.method231();
                    int var94 = this.field1596.method232();
                    Component var95 = Component.field73[var93];
                    var95.field126 = var94;
                    if (var94 == -1) {
                        var95.field76 = 0;
                        var95.field77 = 0;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 14) {
                    if (this.field1308 == 12) {
                        this.field1634 = true;
                    }
                    this.field1606 = this.field1596.method232();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 67) {
                    this.method522(true, this.field1596, this.field1329);
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 22) {
                    int var96 = this.field1596.method231();
                    int var97 = this.field1596.method232();
                    int var98 = this.field1596.method232();
                    Component var99 = Component.field73[var96];
                    var99.field86 = var97;
                    var99.field87 = var98;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 103) {
                    int var100 = this.field1596.method232();
                    if (var100 >= 0) {
                        this.method495(var100, this.field1469);
                    }
                    this.field1646 = var100;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 115) {
                    int var101 = this.field1596.method231();
                    int var102 = this.field1596.method231();
                    int var103 = this.field1596.method231();
                    if (var102 == 65535) {
                        Component.field73[var101].field122 = 0;
                        this.field1330 = -1;
                        return true;
                    }
                    ObjType var104 = ObjType.method348(var102);
                    Component.field73[var101].field122 = 4;
                    Component.field73[var101].field123 = var102;
                    Component.field73[var101].field129 = var104.field1060;
                    Component.field73[var101].field130 = var104.field1061;
                    Component.field73[var101].field128 = var104.field1059 * 100 / var103;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 110) {
                    int var105 = this.field1596.method231();
                    this.method495(var105, this.field1469);
                    if (this.field1489 != -1) {
                        this.field1489 = -1;
                        this.field1634 = true;
                        this.field1377 = true;
                    }
                    this.field1236 = var105;
                    this.field1683 = true;
                    this.field1268 = -1;
                    this.field1482 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 196 || this.field1330 == 193 || this.field1330 == 91 || this.field1330 == 138 || this.field1330 == 127 || this.field1330 == 164 || this.field1330 == 139 || this.field1330 == 42 || this.field1330 == 82 || this.field1330 == 131 || this.field1330 == 99) {
                    this.method478((byte) -96, this.field1596, this.field1330);
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 219) {
                    this.field1686 = false;
                    for (int var106 = 0; var106 < 5; ++var106) {
                        this.field1299[var106] = false;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 247) {
                    int var107 = this.field1596.method231();
                    int var108 = this.field1596.method229();
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    this.field1393[var108] = var107;
                    this.field1634 = true;
                    this.field1377 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 214) {
                    int var109 = this.field1596.method231();
                    int var110 = this.field1596.method234();
                    this.field1529[var109] = var110;
                    if (this.field1556[var109] != var110) {
                        this.field1556[var109] = var110;
                        this.method498(var109, 179);
                        this.field1634 = true;
                        if (this.field1500 != -1) {
                            this.field1683 = true;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 85) {
                    this.field1328 = this.field1596.method231();
                    this.field1475 = this.field1596.method229();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 24) {
                    if (this.field1308 == 12) {
                        this.field1634 = true;
                    }
                    this.field1306 = this.field1596.method229();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 125) {
                    this.field1455 = this.field1596.method229();
                    this.field1456 = this.field1596.method229();
                    for (int var111 = this.field1455; var111 < this.field1455 + 8; ++var111) {
                        for (int var112 = this.field1456; var112 < this.field1456 + 8; ++var112) {
                            if (this.field1337[this.field1501][var111][var112] != null) {
                                this.field1337[this.field1501][var111][var112] = null;
                                this.method511(var111, var112);
                            }
                        }
                    }
                    for (LocSpawned var113 = (LocSpawned) this.field1599.method248(); var113 != null; var113 = (LocSpawned) this.field1599.method250(true)) {
                        if (var113.field732 >= this.field1455 && var113.field732 < this.field1455 + 8 && var113.field733 >= this.field1456 && var113.field733 < this.field1456 + 8 && this.field1501 == var113.field730) {
                            var113.field741 = 0;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 142) {
                    this.field1455 = this.field1596.method229();
                    this.field1456 = this.field1596.method229();
                    while (this.field1596.field712 < this.field1329) {
                        int var114 = this.field1596.method229();
                        this.method478((byte) -96, this.field1596, var114);
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 224) {
                    this.method554(this.field1607);
                    this.field1330 = -1;
                    return false;
                }
                if (this.field1330 == 1) {
                    this.field1625 = this.field1596.method231() * 30;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 68) {
                    this.field1518 = this.field1596.method234();
                    this.field1463 = this.field1596.method231();
                    this.field1690 = this.field1596.method229();
                    this.field1590 = this.field1596.method231();
                    this.field1342 = this.field1596.method229();
                    if (this.field1518 != 0 && this.field1268 == -1) {
                        signlink.dnslookup(JString.method303(this.field1252, this.field1518));
                        this.method482(true);
                        short var115 = 650;
                        if (this.field1690 != 201 || this.field1342 == 1) {
                            var115 = 655;
                        }
                        this.field1685 = "";
                        this.field1280 = false;
                        for (int var116 = 0; var116 < Component.field73.length; ++var116) {
                            if (Component.field73[var116] != null && Component.field73[var116].field82 == var115) {
                                this.field1268 = Component.field73[var116].field79;
                                break;
                            }
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 111) {
                    int var117 = this.field1596.method231();
                    int var118 = this.field1596.method231();
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1683 = true;
                    }
                    if (this.field1285) {
                        this.field1285 = false;
                        this.field1683 = true;
                    }
                    this.field1268 = var117;
                    this.field1489 = var118;
                    this.field1634 = true;
                    this.field1377 = true;
                    this.field1482 = false;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 7) {
                    this.field1515 = false;
                    this.field1285 = true;
                    this.field1531 = "";
                    this.field1683 = true;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 232) {
                    this.field1634 = true;
                    int var119 = this.field1596.method231();
                    Component var120 = Component.field73[var119];
                    int var121 = this.field1596.method231();
                    for (int var122 = 0; var122 < var121; ++var122) {
                        var120.field74[var122] = this.field1596.method231();
                        int var123 = this.field1596.method229();
                        if (var123 == 255) {
                            var123 = this.field1596.method234();
                        }
                        var120.field75[var122] = var123;
                    }
                    for (int var124 = var121; var124 < var120.field74.length; ++var124) {
                        var120.field74[var124] = 0;
                        var120.field75[var124] = 0;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 74) {
                    long var125 = this.field1596.method235((byte) -39);
                    int var127 = this.field1596.method234();
                    int var128 = this.field1596.method229();
                    boolean var129 = false;
                    for (int var130 = 0; var130 < 100; ++var130) {
                        if (this.field1595[var130] == var127) {
                            var129 = true;
                            break;
                        }
                    }
                    if (var128 <= 1) {
                        for (int var131 = 0; var131 < this.field1580; ++var131) {
                            if (this.field1536[var131] == var125) {
                                var129 = true;
                                break;
                            }
                        }
                    }
                    if (!var129 && this.field1235 == 0) {
                        try {
                            this.field1595[this.field1336] = var127;
                            this.field1336 = (this.field1336 + 1) % 100;
                            String var132 = WordPack.method306(this.field1596, this.field1329 - 13, 0);
                            String var133 = WordFilter.method401(0, var132);
                            if (var128 != 2 && var128 != 3) {
                                if (var128 == 1) {
                                    this.method440("@cr1@" + JString.method304(false, JString.method301(false, var125)), var133, 7, 811);
                                } else {
                                    this.method440(JString.method304(false, JString.method301(false, var125)), var133, 3, 811);
                                }
                            } else {
                                this.method440("@cr2@" + JString.method304(false, JString.method301(false, var125)), var133, 7, 811);
                            }
                        } catch (Exception var164) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 154) {
                    int var135 = this.field1596.method231();
                    int var136 = this.field1596.method229();
                    int var137 = this.field1596.method231();
                    if (this.field1474 && !field1392 && this.field1533 < 50) {
                        this.field1652[this.field1533] = var135;
                        this.field1266[this.field1533] = var136;
                        this.field1234[this.field1533] = Wave.field915[var135] + var137;
                        ++this.field1533;
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 246) {
                    int var138 = this.field1596.method229();
                    int var139 = this.field1596.method229();
                    int var140 = this.field1596.method229();
                    int var141 = this.field1596.method229();
                    this.field1299[var138] = true;
                    this.field1448[var138] = var139;
                    this.field1537[var138] = var140;
                    this.field1532[var138] = var141;
                    this.field1593[var138] = 0;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 81) {
                    this.field1634 = true;
                    int var142 = this.field1596.method231();
                    Component var143 = Component.field73[var142];
                    while (this.field1596.field712 < this.field1329) {
                        int var144 = this.field1596.method243();
                        int var145 = this.field1596.method231();
                        int var146 = this.field1596.method229();
                        if (var146 == 255) {
                            var146 = this.field1596.method234();
                        }
                        if (var144 >= 0 && var144 < var143.field74.length) {
                            var143.field74[var144] = var145;
                            var143.field75[var144] = var146;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 23) {
                    int var147 = this.field1596.method231();
                    boolean var148 = this.field1596.method229() == 1;
                    Component.field73[var147].field94 = var148;
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 3) {
                    this.field1634 = true;
                    int var149 = this.field1596.method229();
                    int var150 = this.field1596.method234();
                    int var151 = this.field1596.method229();
                    this.field1344[var149] = var150;
                    this.field1558[var149] = var151;
                    this.field1696[var149] = 1;
                    for (int var152 = 0; var152 < 98; ++var152) {
                        if (var150 >= field1574[var152]) {
                            this.field1696[var149] = var152 + 2;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 159) {
                    for (int var153 = 0; var153 < this.field1556.length; ++var153) {
                        if (this.field1556[var153] != this.field1529[var153]) {
                            this.field1556[var153] = this.field1529[var153];
                            this.method498(var153, 179);
                            this.field1634 = true;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 182) {
                    int var154 = this.field1596.method231();
                    byte var155 = this.field1596.method230();
                    this.field1529[var154] = var155;
                    if (this.field1556[var154] != var155) {
                        this.field1556[var154] = var155;
                        this.method498(var154, 179);
                        this.field1634 = true;
                        if (this.field1500 != -1) {
                            this.field1683 = true;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 151) {
                    for (int var156 = 0; var156 < this.field1364.length; ++var156) {
                        if (this.field1364[var156] != null) {
                            this.field1364[var156].field430 = -1;
                        }
                    }
                    for (int var157 = 0; var157 < this.field1309.length; ++var157) {
                        if (this.field1309[var157] != null) {
                            this.field1309[var157].field430 = -1;
                        }
                    }
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 153) {
                    this.field1284 = this.field1596.method229();
                    this.field1330 = -1;
                    return true;
                }
                if (this.field1330 == 126) {
                    int var158 = this.field1596.method231();
                    Component var159 = Component.field73[var158];
                    for (int var160 = 0; var160 < var159.field74.length; ++var160) {
                        var159.field74[var160] = -1;
                        var159.field74[var160] = 0;
                    }
                    this.field1330 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1330 + "," + this.field1329 + " - " + this.field1688 + "," + this.field1689);
                this.method554(this.field1607);
            } catch (IOException var165) {
                this.method452(false);
            } catch (Exception var166) {
                String var162 = "T2 - " + this.field1330 + "," + this.field1688 + "," + this.field1689 + " - " + this.field1329 + "," + (field1263.field452[0] + this.field1245) + "," + (field1263.field453[0] + this.field1246) + " - ";
                for (int var163 = 0; var163 < this.field1329 && var163 < 50; ++var163) {
                    var162 = var162 + this.field1596.field711[var163] + ",";
                }
                signlink.reporterror(var162);
                this.method554(this.field1607);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method508(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field1597.method199(arg4, arg1, false);
        this.field1598.method199(arg4, arg0 + arg1 - 16, false);
        Pix2D.method157(this.field1572, arg0 - 32, 16, arg4, arg1 + 16, this.field1267);
        int var7 = (arg0 - 32) * arg0 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg0 - 32 - var7) * arg5 / (arg2 - arg0);
        Pix2D.method157(this.field1670, var7, 16, arg4, arg1 + 16 + var8, this.field1267);
        Pix2D.method162(arg4, 830, arg1 + 16 + var8, this.field1462, var7);
        Pix2D.method162(arg4 + 1, 830, arg1 + 16 + var8, this.field1462, var7);
        Pix2D.method160(arg4, this.field1462, arg1 + 16 + var8, 16, 1);
        Pix2D.method160(arg4, this.field1462, arg1 + 17 + var8, 16, 1);
        Pix2D.method162(arg4 + 15, 830, arg1 + 16 + var8, this.field1643, var7);
        Pix2D.method162(arg4 + 14, 830, arg1 + 17 + var8, this.field1643, var7 - 1);
        this.field1277 &= arg3;
        Pix2D.method160(arg4, this.field1643, arg1 + 15 + var8 + var7, 16, 1);
        Pix2D.method160(arg4 + 1, this.field1643, arg1 + 14 + var8 + var7, 15, 1);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method509(int arg0) {
        if (this.field1499 >= 2 || this.field1405 != 0 || this.field1346 != 0) {
            String var2;
            if (this.field1405 == 1 && this.field1499 < 2) {
                var2 = "Use " + this.field1409 + " with...";
            } else if (this.field1346 == 1 && this.field1499 < 2) {
                var2 = this.field1349 + "...";
            } else {
                var2 = this.field1636[this.field1499 - 1];
            }
            if (this.field1499 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1499 - 2) + " more options";
            }
            this.field1497.method211(this.field1454, 4, 16777215, var2, field1300 / 1000, 15, true);
            if (arg0 < 7 || arg0 > 7) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method510(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1307[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field1343[var7][var5][var6] + this.field1343[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1343[var7][var5][var6 + 1] + this.field1343[var7][var5 + 1][var6 + 1] * var8 >> 7;
            if (arg2 != 51) {
                this.method6();
            }
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        LinkList var3 = this.field1337[this.field1501][arg0][arg1];
        if (var3 == null) {
            this.field1569.method71(this.field1501, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250(true)) {
                ObjType var11 = ObjType.method348(var6.field504);
                int var12 = var11.field1067;
                if (var11.field1066) {
                    var12 = (var6.field505 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(var5, (byte) 23);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250(true)) {
                if (var5.field504 != var9.field504 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field504 != var9.field504 && var7.field504 != var9.field504 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1569.method57(var5, arg1, this.method510(arg0 * 128 + 64, arg1 * 128 + 64, (byte) 51, this.field1501), var8, var7, 0, this.field1501, var10, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method512(int arg0) {
        int var2 = this.field1419 * 128 + 64;
        int var3 = this.field1420 * 128 + 64;
        int var4 = this.method510(var2, var3, (byte) 51, this.field1501) - this.field1421;
        this.field1329 += arg0;
        if (this.field1355 < var2) {
            this.field1355 += (var2 - this.field1355) * this.field1423 / 1000 + this.field1422;
            if (this.field1355 > var2) {
                this.field1355 = var2;
            }
        }
        if (this.field1355 > var2) {
            this.field1355 -= (this.field1355 - var2) * this.field1423 / 1000 + this.field1422;
            if (this.field1355 < var2) {
                this.field1355 = var2;
            }
        }
        if (this.field1356 < var4) {
            this.field1356 += (var4 - this.field1356) * this.field1423 / 1000 + this.field1422;
            if (this.field1356 > var4) {
                this.field1356 = var4;
            }
        }
        if (this.field1356 > var4) {
            this.field1356 -= (this.field1356 - var4) * this.field1423 / 1000 + this.field1422;
            if (this.field1356 < var4) {
                this.field1356 = var4;
            }
        }
        if (this.field1357 < var3) {
            this.field1357 += (var3 - this.field1357) * this.field1423 / 1000 + this.field1422;
            if (this.field1357 > var3) {
                this.field1357 = var3;
            }
        }
        if (this.field1357 > var3) {
            this.field1357 -= (this.field1357 - var3) * this.field1423 / 1000 + this.field1422;
            if (this.field1357 < var3) {
                this.field1357 = var3;
            }
        }
        int var5 = this.field1520 * 128 + 64;
        int var6 = this.field1521 * 128 + 64;
        int var7 = this.method510(var5, var6, (byte) 51, this.field1501) - this.field1522;
        int var8 = var5 - this.field1355;
        int var9 = var7 - this.field1356;
        int var10 = var6 - this.field1357;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1358 < var12) {
            this.field1358 += (var12 - this.field1358) * this.field1524 / 1000 + this.field1523;
            if (this.field1358 > var12) {
                this.field1358 = var12;
            }
        }
        if (this.field1358 > var12) {
            this.field1358 -= (this.field1358 - var12) * this.field1524 / 1000 + this.field1523;
            if (this.field1358 < var12) {
                this.field1358 = var12;
            }
        }
        int var14 = var13 - this.field1359;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1359 += this.field1524 * var14 / 1000 + this.field1523;
            this.field1359 &= 2047;
        }
        if (var14 < 0) {
            this.field1359 -= -var14 * this.field1524 / 1000 + this.field1523;
            this.field1359 &= 2047;
        }
        int var15 = var13 - this.field1359;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1359 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
        int var2 = this.field1497.method204("Choose Option", 0);
        for (int var3 = 0; var3 < this.field1499; ++var3) {
            int var11 = this.field1497.method204(this.field1636[var3], 0);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0) {
            this.field1330 = -1;
        }
        var2 += 8;
        int var4 = this.field1499 * 15 + 21;
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
            this.field1578 = true;
            this.field1457 = 0;
            this.field1458 = var5;
            this.field1459 = var6;
            this.field1460 = var2;
            this.field1461 = this.field1499 * 15 + 22;
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
            this.field1578 = true;
            this.field1457 = 1;
            this.field1458 = var7;
            this.field1459 = var8;
            this.field1460 = var2;
            this.field1461 = this.field1499 * 15 + 22;
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
            this.field1578 = true;
            this.field1457 = 2;
            this.field1458 = var9;
            this.field1459 = var10;
            this.field1460 = var2;
            this.field1461 = this.field1499 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IB)V")
    private final void method514(Packet arg0, int arg1, byte arg2) {
        arg0.method239(0);
        int var4 = arg0.method240(8, 45621);
        if (arg2 == 6) {
            boolean var5 = false;
        } else {
            this.method6();
        }
        if (var4 < this.field1310) {
            for (int var6 = var4; var6 < this.field1310; ++var6) {
                this.field1509[this.field1508++] = this.field1311[var6];
            }
        }
        if (var4 > this.field1310) {
            signlink.reporterror(this.field1413 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1310 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1311[var7];
                NpcEntity var9 = this.field1309[var8];
                int var10 = arg0.method240(1, 45621);
                if (var10 == 0) {
                    this.field1311[this.field1310++] = var8;
                    var9.field447 = field1300;
                } else {
                    int var11 = arg0.method240(2, 45621);
                    if (var11 == 0) {
                        this.field1311[this.field1310++] = var8;
                        var9.field447 = field1300;
                        this.field1368[this.field1367++] = var8;
                    } else if (var11 == 1) {
                        this.field1311[this.field1310++] = var8;
                        var9.field447 = field1300;
                        int var12 = arg0.method240(3, 45621);
                        var9.method111(var12, false, 31409);
                        int var13 = arg0.method240(1, 45621);
                        if (var13 == 1) {
                            this.field1368[this.field1367++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1311[this.field1310++] = var8;
                        var9.field447 = field1300;
                        int var14 = arg0.method240(3, 45621);
                        var9.method111(var14, true, 31409);
                        int var15 = arg0.method240(3, 45621);
                        var9.method111(var15, true, 31409);
                        int var16 = arg0.method240(1, 45621);
                        if (var16 == 1) {
                            this.field1368[this.field1367++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1509[this.field1508++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIII)V")
    public final void method515(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1569.method76(arg3, arg4, arg2);
        if (arg0 != -39) {
            this.field1561 = !this.field1561;
        }
        if (var7 != 0) {
            int var8 = this.field1569.method80(arg3, arg4, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field1605.field670;
            int var13 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field979 != -1) {
                Pix8 var16 = this.field1551[var15.field979];
                if (var16 != null) {
                    int var17 = (var15.field965 * 4 - var16.field683) / 2;
                    int var18 = (var15.field966 * 4 - var16.field684) / 2;
                    var16.method199(arg4 * 4 + 48 + var17, (104 - arg2 - var15.field966) * 4 + 48 + var18, false);
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
        int var19 = this.field1569.method78(arg3, arg4, arg2);
        if (var19 != 0) {
            int var20 = this.field1569.method80(arg3, arg4, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field979 != -1) {
                Pix8 var25 = this.field1551[var24.field979];
                if (var25 != null) {
                    int var26 = (var24.field965 * 4 - var25.field683) / 2;
                    int var27 = (var24.field966 * 4 - var25.field684) / 2;
                    var25.method199(arg4 * 4 + 48 + var26, (104 - arg2 - var24.field966) * 4 + 48 + var27, false);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1605.field670;
                int var30 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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
        int var31 = this.field1569.method79(arg3, arg4, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field979 != -1) {
                Pix8 var34 = this.field1551[var33.field979];
                if (var34 != null) {
                    int var35 = (var33.field965 * 4 - var34.field683) / 2;
                    int var36 = (var33.field966 * 4 - var34.field684) / 2;
                    var34.method199(arg4 * 4 + 48 + var35, (104 - arg2 - var33.field966) * 4 + 48 + var36, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BI)V")
    public final void method516(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 > 0) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 295);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1389 = Integer.parseInt(arg0[0]);
                field1390 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method436(7);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method465(0);
                }
                if (arg0[3].equals("free")) {
                    field1391 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1391 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 503, -18184);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method517(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field1232 = this.field1372.method295();
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1288; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1451[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field1263.field462);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ZIILab;)V")
    private final void method518(Packet arg0, boolean arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg1) {
            this.method6();
        }
        if ((arg3 & 1) == 1) {
            int var6 = arg0.method229();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(var7, field1388);
            arg0.method238(var7, 3, var6, 0);
            this.field1369[arg2] = var8;
            arg4.method116(var8, true);
        }
        if ((arg3 & 2) == 2) {
            int var9 = arg0.method231();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field430 == var9) {
                arg4.field434 = 0;
            }
            int var10 = arg0.method229();
            if (arg4.field430 == var9 && var9 != -1) {
                int var11 = SeqType.field1144[var9].field1158;
                if (var11 == 1) {
                    arg4.field431 = 0;
                    arg4.field432 = 0;
                    arg4.field433 = var10;
                    arg4.field434 = 0;
                }
                if (var11 == 2) {
                    arg4.field434 = 0;
                }
            } else if (var9 == -1 || arg4.field430 == -1 || SeqType.field1144[var9].field1152 >= SeqType.field1144[arg4.field430].field1152) {
                arg4.field430 = var9;
                arg4.field431 = 0;
                arg4.field432 = 0;
                arg4.field433 = var10;
                arg4.field434 = 0;
                arg4.field456 = arg4.field451;
            }
        }
        if ((arg3 & 4) == 4) {
            arg4.field424 = arg0.method231();
            if (arg4.field424 == 65535) {
                arg4.field424 = -1;
            }
        }
        if ((arg3 & 8) == 8) {
            arg4.field414 = arg0.method236();
            if (arg4.field414.charAt(0) == '~') {
                arg4.field414 = arg4.field414.substring(1);
                this.method440(arg4.field462, arg4.field414, 2, 811);
            } else if (field1263 == arg4) {
                this.method440(arg4.field462, arg4.field414, 2, 811);
            }
            arg4.field416 = 0;
            arg4.field417 = 0;
            arg4.field415 = 150;
        }
        if ((arg3 & 16) == 16) {
            int var12 = arg0.method229();
            int var13 = arg0.method229();
            arg4.method114(16040, var12, var13, field1300);
            arg4.field421 = field1300 + 300;
            arg4.field422 = arg0.method229();
            arg4.field423 = arg0.method229();
        }
        if ((arg3 & 32) == 32) {
            arg4.field425 = arg0.method231();
            arg4.field426 = arg0.method231();
        }
        if ((arg3 & 64) == 64) {
            int var14 = arg0.method231();
            int var15 = arg0.method229();
            int var16 = arg0.method229();
            int var17 = arg0.field712;
            if (arg4.field462 != null && arg4.field463) {
                long var18 = JString.method300(arg4.field462);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1580; ++var21) {
                        if (this.field1536[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1235 == 0) {
                    try {
                        String var22 = WordPack.method306(arg0, var16, 0);
                        String var23 = WordFilter.method401(0, var22);
                        arg4.field414 = var23;
                        arg4.field416 = var14 >> 8;
                        arg4.field417 = var14 & 255;
                        arg4.field415 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method440("@cr1@" + arg4.field462, var23, 1, 811);
                            } else {
                                this.method440(arg4.field462, var23, 2, 811);
                            }
                        } else {
                            this.method440("@cr2@" + arg4.field462, var23, 1, 811);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field712 = var16 + var17;
        }
        if ((arg3 & 256) == 256) {
            arg4.field435 = arg0.method231();
            int var25 = arg0.method234();
            arg4.field439 = var25 >> 16;
            arg4.field438 = (var25 & 65535) + field1300;
            arg4.field436 = 0;
            arg4.field437 = 0;
            if (arg4.field438 > field1300) {
                arg4.field436 = -1;
            }
            if (arg4.field435 == 65535) {
                arg4.field435 = -1;
            }
        }
        if ((arg3 & 512) == 512) {
            arg4.field440 = arg0.method229();
            arg4.field442 = arg0.method229();
            arg4.field441 = arg0.method229();
            arg4.field443 = arg0.method229();
            arg4.field444 = arg0.method231() + field1300;
            arg4.field445 = arg0.method231() + field1300;
            arg4.field446 = arg0.method229();
            arg4.method112(0);
        }
        if ((arg3 & 1024) == 1024) {
            int var26 = arg0.method229();
            int var27 = arg0.method229();
            arg4.method114(16040, var26, var27, field1300);
            arg4.field421 = field1300 + 300;
            arg4.field422 = arg0.method229();
            arg4.field423 = arg0.method229();
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method519(int arg0) {
        this.method434(48999);
        if (arg0 >= 0) {
            this.field1539 = this.field1372.method295();
        }
        if (this.field1493 == 1) {
            this.field1249[this.field1492 / 100].method186(this.field1490 - 8 - 4, this.field1491 - 8 - 4, false);
        }
        if (this.field1493 == 2) {
            this.field1249[this.field1492 / 100 + 4].method186(this.field1490 - 8 - 4, this.field1491 - 8 - 4, false);
            ++field1575;
            if (field1575 > 57) {
                field1575 = 0;
                this.field1250.method218(254, 837);
            }
        }
        if (this.field1646 != -1) {
            this.method557(1, this.field1477, this.field1646);
            this.method467(0, Component.field73[this.field1646], 0, -28, 0);
        }
        if (this.field1268 != -1) {
            this.method557(1, this.field1477, this.field1268);
            this.method467(0, Component.field73[this.field1268], 0, -28, 0);
        }
        this.method545(false);
        if (!this.field1578) {
            this.method544(this.field1614);
            this.method509(7);
        } else if (this.field1457 == 0) {
            this.method503(-567);
        }
        if (this.field1626 == 1) {
            this.field1528[1].method186(472, 296, false);
        }
        if (field1660) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field10 < 15) {
                var4 = 16711680;
            }
            this.field1496.method201(var3, var4, var2, 341, "Fps:" + super.field10);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field1392) {
                int var8 = 16711680;
            }
            this.field1496.method201(var12, 16776960, var2, 341, "Mem:" + var6 + "k");
            var12 += 15;
        }
        if (this.field1625 != 0) {
            int var9 = this.field1625 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field1496.method206(329, 16776960, 4, "System update in: " + var10 + ":0" + var11, 3);
            } else {
                this.field1496.method206(329, 16776960, 4, "System update in: " + var10 + ":" + var11, 3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;II)V")
    public final void method520(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1351 + this.field1273 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field609[var5];
            int var8 = Model.field610[var5];
            int var9 = var7 * 256 / (this.field1581 + 256);
            int var10 = var8 * 256 / (this.field1581 + 256);
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            int var13 = 45 / arg2;
            if (var6 > 2500) {
                arg1.method192(var11 + 94 - arg1.field675 / 2 + 4, 83 - var12 - arg1.field676 / 2 - 4, (byte) 53, this.field1380);
            } else {
                arg1.method186(var11 + 94 - arg1.field675 / 2 + 4, 83 - var12 - arg1.field676 / 2 - 4, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method521(boolean arg0, long arg1) {
        if (!arg0) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field1288; ++var4) {
                    if (this.field1360[var4] == arg1) {
                        --this.field1288;
                        this.field1634 = true;
                        for (int var5 = var4; var5 < this.field1288; ++var5) {
                            this.field1451[var5] = this.field1451[var5 + 1];
                            this.field1637[var5] = this.field1637[var5 + 1];
                            this.field1360[var5] = this.field1360[var5 + 1];
                        }
                        this.field1250.method218(214, 837);
                        this.field1250.method225(this.field1239, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLlb;I)V")
    private final void method522(boolean arg0, Packet arg1, int arg2) {
        this.field1508 = 0;
        this.field1367 = 0;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method514(arg1, arg2, (byte) 6);
        this.method455(arg2, 491, arg1);
        this.method476((byte) 9, arg2, arg1);
        for (int var5 = 0; var5 < this.field1508; ++var5) {
            int var7 = this.field1509[var5];
            if (field1300 != this.field1309[var7].field447) {
                this.field1309[var7].field458 = null;
                this.field1309[var7] = null;
            }
        }
        if (arg1.field712 != arg2) {
            signlink.reporterror(this.field1413 + " size mismatch in getnpcpos - pos:" + arg1.field712 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1310; ++var6) {
                if (this.field1309[this.field1311[var6]] == null) {
                    signlink.reporterror(this.field1413 + " null entry in npc list - pos:" + var6 + " size:" + this.field1310);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;III)V")
    public final void method523(Pix32 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field1692 = !field1692;
        }
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1351 + this.field1273 & 2047;
            int var7 = Model.field609[var6];
            int var8 = Model.field610[var6];
            int var9 = var7 * 256 / (this.field1581 + 256);
            int var10 = var8 * 256 / (this.field1581 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1323.method191(15, -869, 15, 20, 256, var13, var15 + 94 + 4 - 10, 83 - var16 - 20, 20);
        } else {
            this.method520(arg3, arg0, 83, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method524(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1526.length; ++var4) {
            this.field1526[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1526[var17] = (int) (Math.random() * 256.0D);
        }
        while (arg0 >= 0) {
            this.field1330 = this.field1596.method229();
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1527[var16] = (this.field1526[var16 - 1] + this.field1526[var16 + 1] + this.field1526[var16 - 128] + this.field1526[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1526;
            this.field1526 = this.field1527;
            this.field1527 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field684; ++var8) {
                for (int var9 = 0; var9 < arg1.field683; ++var9) {
                    if (arg1.field681[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field685;
                        int var11 = var8 + 16 + arg1.field686;
                        int var12 = (var11 << 7) + var10;
                        this.field1526[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)I")
    public final int method525(byte arg0) {
        int var2 = 3;
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field1561 = !this.field1561;
        }
        if (this.field1358 < 310) {
            int var4 = this.field1355 >> 7;
            int var5 = this.field1357 >> 7;
            int var6 = field1263.field402 >> 7;
            int var7 = field1263.field403 >> 7;
            if ((this.field1307[this.field1501][var4][var5] & 4) != 0) {
                var2 = this.field1501;
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
                    if ((this.field1307[this.field1501][var4][var5] & 4) != 0) {
                        var2 = this.field1501;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field1307[this.field1501][var4][var5] & 4) != 0) {
                            var2 = this.field1501;
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
                    if ((this.field1307[this.field1501][var4][var5] & 4) != 0) {
                        var2 = this.field1501;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1307[this.field1501][var4][var5] & 4) != 0) {
                            var2 = this.field1501;
                        }
                    }
                }
            }
        }
        if ((this.field1307[this.field1501][field1263.field402 >> 7][field1263.field403 >> 7] & 4) != 0) {
            var2 = this.field1501;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)I")
    public final int method526(int arg0) {
        int var2 = this.method510(this.field1355, this.field1357, (byte) 51, this.field1501);
        while (arg0 >= 0) {
            this.field1250.method219(8);
        }
        return var2 - this.field1356 < 800 && (this.field1307[this.field1501][this.field1355 >> 7][this.field1357 >> 7] & 4) != 0 ? this.field1501 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method527(boolean arg0, int arg1) {
        int[] var3 = this.field1605.field670;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1307[arg1][var24][var6] & 24) == 0) {
                    this.field1569.method85(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1307[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1569.method85(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1605.method181(false);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1307[arg1][var22][var9] & 24) == 0) {
                    this.method515((byte) -39, var7, var9, arg1, var22, var8);
                }
                if (arg1 < 3 && (this.field1307[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method515((byte) -39, var7, var9, arg1 + 1, var22, var8);
                }
            }
        }
        this.field1436.method258(false);
        if (!arg0) {
            this.field1242 = 0;
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    int var12 = this.field1569.method79(this.field1501, var10, var11);
                    if (var12 != 0) {
                        int var13 = var12 >> 14 & 32767;
                        int var14 = LocType.method330(var13).field978;
                        if (var14 >= 0) {
                            int var15 = var10;
                            int var16 = var11;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                byte var17 = 104;
                                byte var18 = 104;
                                int[][] var19 = this.field1647[this.field1501].field1105;
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
                            this.field1293[this.field1242] = this.field1676[var14];
                            this.field1243[this.field1242] = var15;
                            this.field1244[this.field1242] = var16;
                            ++this.field1242;
                        }
                    }
                }
            }
            ++field1338;
            if (field1338 > 112) {
                field1338 = 0;
                this.field1250.method218(39, 837);
                this.field1250.method219(50);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLlb;)V")
    private final void method528(int arg0, boolean arg1, Packet arg2) {
        if (!arg1) {
            this.field1672 = !this.field1672;
        }
        while (arg2.field713 + 10 < arg0 * 8) {
            int var4 = arg2.method240(11, 45621);
            if (var4 == 2047) {
                break;
            }
            if (this.field1364[var4] == null) {
                this.field1364[var4] = new PlayerEntity();
                if (this.field1369[var4] != null) {
                    this.field1364[var4].method116(this.field1369[var4], true);
                }
            }
            this.field1366[this.field1365++] = var4;
            PlayerEntity var5 = this.field1364[var4];
            var5.field447 = field1300;
            int var6 = arg2.method240(5, 45621);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method240(5, 45621);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method240(1, 45621);
            var5.method110(field1263.field452[0] + var6, var8 == 1, 1, field1263.field453[0] + var7);
            int var9 = arg2.method240(1, 45621);
            if (var9 == 1) {
                this.field1368[this.field1367++] = var4;
            }
        }
        arg2.method241((byte) 0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method529(byte arg0) {
        if (this.field1298 != arg0) {
            this.field1330 = this.field1596.method229();
        }
        try {
            int var2 = field1263.field402 + this.field1506;
            int var3 = field1263.field403 + this.field1416;
            if (this.field1648 - var2 < -500 || this.field1648 - var2 > 500 || this.field1649 - var3 < -500 || this.field1649 - var3 > 500) {
                this.field1648 = var2;
                this.field1649 = var3;
            }
            if (this.field1648 != var2) {
                this.field1648 += (var2 - this.field1648) / 16;
            }
            if (this.field1649 != var3) {
                this.field1649 += (var3 - this.field1649) / 16;
            }
            if (super.field32[1] == 1) {
                this.field1274 += (-24 - this.field1274) / 2;
            } else if (super.field32[2] == 1) {
                this.field1274 += (24 - this.field1274) / 2;
            } else {
                this.field1274 /= 2;
            }
            if (super.field32[3] == 1) {
                this.field1275 += (12 - this.field1275) / 2;
            } else if (super.field32[4] == 1) {
                this.field1275 += (-12 - this.field1275) / 2;
            } else {
                this.field1275 /= 2;
            }
            this.field1273 = this.field1274 / 2 + this.field1273 & 2047;
            this.field1272 += this.field1275 / 2;
            if (this.field1272 < 128) {
                this.field1272 = 128;
            }
            if (this.field1272 > 383) {
                this.field1272 = 383;
            }
            int var4 = this.field1648 >> 7;
            int var5 = this.field1649 >> 7;
            int var6 = this.method510(this.field1648, this.field1649, (byte) 51, this.field1501);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1501;
                        if (var10 < 3 && (this.field1307[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1343[var10][var8][var9];
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
            if (var12 > this.field1291) {
                this.field1291 += (var12 - this.field1291) / 24;
            } else if (var12 < this.field1291) {
                this.field1291 += (var12 - this.field1291) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1263.field402 + "," + field1263.field403 + "," + this.field1648 + "," + this.field1649 + "," + this.field1510 + "," + this.field1511 + "," + this.field1245 + "," + this.field1246);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method530(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        int var6 = 37 / arg2;
        return ((arg0 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    private final void method531(boolean arg0) {
        if (!arg0) {
            for (LocSpawned var2 = (LocSpawned) this.field1599.method248(); var2 != null; var2 = (LocSpawned) this.field1599.method250(true)) {
                if (var2.field741 == -1) {
                    var2.field740 = 0;
                    this.method453(this.field1304, var2);
                } else {
                    var2.method106();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method532(byte arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != -111) {
            this.field1330 = this.field1596.method229();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method533(byte arg0) {
        if (arg0 != 5) {
            this.field1337 = null;
        }
        if (this.field1479 == 0) {
            int var2 = super.field12 / 2 - 80;
            int var3 = super.field13 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field28 == 1 && super.field29 >= var2 - 75 && super.field29 <= var2 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1479 = 3;
                this.field1341 = 0;
            }
            int var4 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var4 - 75 && super.field29 <= var4 + 75 && super.field30 >= var14 - 20 && super.field30 <= var14 + 20) {
                this.field1296 = "";
                this.field1297 = "Enter your username & password.";
                this.field1479 = 2;
                this.field1341 = 0;
            }
        } else if (this.field1479 == 2) {
            int var5 = super.field13 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field28 == 1 && super.field30 >= var16 - 15 && super.field30 < var16) {
                this.field1341 = 0;
            }
            var5 = var16 + 15;
            if (super.field28 == 1 && super.field30 >= var5 - 15 && super.field30 < var5) {
                this.field1341 = 1;
            }
            var5 += 15;
            int var6 = super.field12 / 2 - 80;
            int var7 = super.field13 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field28 == 1 && super.field29 >= var6 - 75 && super.field29 <= var6 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.method490(this.field1413, this.field1414, false);
                if (this.field1277) {
                    return;
                }
            }
            int var8 = super.field12 / 2 + 80;
            if (super.field28 == 1 && super.field29 >= var8 - 75 && super.field29 <= var8 + 75 && super.field30 >= var17 - 20 && super.field30 <= var17 + 20) {
                this.field1479 = 0;
                this.field1413 = "";
                this.field1414 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1430.length(); ++var11) {
                        if (var9 == field1430.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1341 == 0) {
                        if (var9 == 8 && this.field1413.length() > 0) {
                            this.field1413 = this.field1413.substring(0, this.field1413.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1341 = 1;
                        }
                        if (var10) {
                            this.field1413 = this.field1413 + (char) var9;
                        }
                        if (this.field1413.length() > 12) {
                            this.field1413 = this.field1413.substring(0, 12);
                        }
                    } else if (this.field1341 == 1) {
                        if (var9 == 8 && this.field1414.length() > 0) {
                            this.field1414 = this.field1414.substring(0, this.field1414.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1341 = 0;
                        }
                        if (var10) {
                            this.field1414 = this.field1414 + (char) var9;
                        }
                        if (this.field1414.length() > 20) {
                            this.field1414 = this.field1414.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1479 == 3) {
                int var12 = super.field12 / 2;
                int var13 = super.field13 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field28 == 1 && super.field29 >= var12 - 75 && super.field29 <= var12 + 75 && super.field30 >= var18 - 20 && super.field30 <= var18 + 20) {
                    this.field1479 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method534(byte arg0) {
        this.field1434.method258(false);
        if (arg0 != 3) {
            this.field1486 = this.field1372.method295();
        }
        Pix3D.field650 = this.field1428;
        this.field1379.method199(0, 0, false);
        if (this.field1489 != -1) {
            this.method467(0, Component.field73[this.field1489], 0, -28, 0);
        } else if (this.field1393[this.field1308] != -1) {
            this.method467(0, Component.field73[this.field1393[this.field1308]], 0, -28, 0);
        }
        if (this.field1578 && this.field1457 == 1) {
            this.method503(-567);
        }
        this.field1434.method259(205, true, 553, super.field14);
        this.field1436.method258(false);
        Pix3D.field650 = this.field1429;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method535(int arg0, int arg1) {
        if (arg0 != 28242) {
            this.field1618 = 302;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method536(int arg0) {
        ++this.field1677;
        this.method555(true, -18210);
        this.method560(298, true);
        this.method555(false, -18210);
        this.method560(298, false);
        if (arg0 < 0 || arg0 > 0) {
            this.field1330 = -1;
        }
        this.method439(8);
        this.method451(false);
        if (!this.field1686) {
            int var2 = this.field1272;
            if (this.field1291 / 256 > var2) {
                var2 = this.field1291 / 256;
            }
            if (this.field1299[4] && this.field1537[4] + 128 > var2) {
                var2 = this.field1537[4] + 128;
            }
            int var3 = this.field1273 + this.field1264 & 2047;
            this.method460(var3, var2 * 3 + 600, this.field1618, this.field1648, this.field1649, this.method510(field1263.field402, field1263.field403, (byte) 51, this.field1501) - 50, var2);
        }
        int var4;
        if (!this.field1686) {
            var4 = this.method525((byte) 5);
        } else {
            var4 = this.method526(-521);
        }
        int var5 = this.field1355;
        int var6 = this.field1356;
        int var7 = this.field1357;
        int var8 = this.field1358;
        int var9 = this.field1359;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1299[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1448[var10] * 2 + 1) - (double) this.field1448[var10] + Math.sin((double) this.field1532[var10] / 100.0D * (double) this.field1593[var10]) * (double) this.field1537[var10]);
                if (var10 == 0) {
                    this.field1355 += var12;
                }
                if (var10 == 1) {
                    this.field1356 += var12;
                }
                if (var10 == 2) {
                    this.field1357 += var12;
                }
                if (var10 == 3) {
                    this.field1359 = this.field1359 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1358 += var12;
                    if (this.field1358 < 128) {
                        this.field1358 = 128;
                    }
                    if (this.field1358 > 383) {
                        this.field1358 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field659;
        Model.field604 = true;
        Model.field607 = 0;
        Model.field605 = super.field22 - 4;
        Model.field606 = super.field23 - 4;
        Pix2D.method155(4);
        this.field1569.method89(this.field1355, this.field1358, this.field1357, var4, this.field1359, this.field1278, this.field1356);
        this.field1569.method64(-584);
        this.method470(this.field1326);
        this.method491((byte) 46);
        this.method561(false, var11);
        this.method519(-906);
        this.field1436.method259(4, true, 4, super.field14);
        this.field1355 = var5;
        this.field1356 = var6;
        this.field1357 = var7;
        this.field1358 = var8;
        this.field1359 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;BI)V")
    private final void method537(Packet arg0, byte arg1, int arg2) {
        arg0.method239(0);
        if (arg1 != -50) {
            this.field1337 = null;
        }
        int var4 = arg0.method240(1, 45621);
        if (var4 != 0) {
            int var5 = arg0.method240(2, 45621);
            if (var5 == 0) {
                this.field1368[this.field1367++] = this.field1363;
            } else if (var5 == 1) {
                int var6 = arg0.method240(3, 45621);
                field1263.method111(var6, false, 31409);
                int var7 = arg0.method240(1, 45621);
                if (var7 == 1) {
                    this.field1368[this.field1367++] = this.field1363;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method240(3, 45621);
                field1263.method111(var8, true, 31409);
                int var9 = arg0.method240(3, 45621);
                field1263.method111(var9, true, 31409);
                int var10 = arg0.method240(1, 45621);
                if (var10 == 1) {
                    this.field1368[this.field1367++] = this.field1363;
                }
            } else if (var5 == 3) {
                this.field1501 = arg0.method240(2, 45621);
                int var11 = arg0.method240(7, 45621);
                int var12 = arg0.method240(7, 45621);
                int var13 = arg0.method240(1, 45621);
                field1263.method110(var11, var13 == 1, 1, var12);
                int var14 = arg0.method240(1, 45621);
                if (var14 == 1) {
                    this.field1368[this.field1367++] = this.field1363;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;B)V")
    public final void method538(int arg0, PathingEntity arg1, byte arg2) {
        this.method539(true, arg0, arg1.field403, arg1.field402);
        if (arg2 == -102) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)V")
    public final void method539(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method510(arg3, arg2, (byte) 51, this.field1501) - arg1;
            int var6 = arg3 - this.field1355;
            int var7 = var5 - this.field1356;
            this.field1277 &= arg0;
            int var8 = arg2 - this.field1357;
            int var9 = Model.field609[this.field1358];
            int var10 = Model.field610[this.field1358];
            int var11 = Model.field609[this.field1359];
            int var12 = Model.field610[this.field1359];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1403 = (var13 << 9) / var17 + Pix3D.field644;
                this.field1404 = (var16 << 9) / var17 + Pix3D.field645;
            } else {
                this.field1403 = -1;
                this.field1404 = -1;
            }
        } else {
            this.field1403 = -1;
            this.field1404 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method540(byte arg0) {
        if (this.field1625 > 1) {
            --this.field1625;
        }
        if (this.field1333 > 0) {
            --this.field1333;
        }
        for (int var2 = 0; var2 < 5 && this.method507(this.field1672); ++var2) {
        }
        if (this.field1277) {
            Object var3 = this.field1534.field999;
            synchronized (this.field1534.field999) {
                if (!field1361) {
                    this.field1534.field1000 = 0;
                } else if (super.field28 != 0 || this.field1534.field1000 >= 40) {
                    this.field1250.method218(1, 837);
                    this.field1250.method219(0);
                    int var4 = this.field1250.field712;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1534.field1000 && var4 - this.field1250.field712 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1534.field1002[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1534.field1001[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1534.field1002[var6] == -1 && this.field1534.field1001[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1512 == var8 && this.field1513 == var7) {
                            if (this.field1453 < 2047) {
                                ++this.field1453;
                            }
                        } else {
                            int var10 = var8 - this.field1512;
                            this.field1512 = var8;
                            int var11 = var7 - this.field1513;
                            this.field1513 = var7;
                            if (this.field1453 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1250.method220((this.field1453 << 12) + (var10 << 6) + var11);
                                this.field1453 = 0;
                            } else if (this.field1453 < 8) {
                                this.field1250.method222((this.field1453 << 19) + 8388608 + var9);
                                this.field1453 = 0;
                            } else {
                                this.field1250.method223((this.field1453 << 19) + -1073741824 + var9);
                                this.field1453 = 0;
                            }
                        }
                    }
                    this.field1250.method228(1, this.field1250.field712 - var4);
                    if (var5 >= this.field1534.field1000) {
                        this.field1534.field1000 = 0;
                    } else {
                        this.field1534.field1000 -= var5;
                        for (int var12 = 0; var12 < this.field1534.field1000; ++var12) {
                            this.field1534.field1001[var12] = this.field1534.field1001[var5 + var12];
                            this.field1534.field1002[var12] = this.field1534.field1002[var5 + var12];
                        }
                    }
                }
            }
            if (super.field28 != 0) {
                long var13 = (super.field31 - this.field1253) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1253 = super.field31;
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
                this.field1250.method218(131, 837);
                this.field1250.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1650 > 0) {
                --this.field1650;
            }
            if (super.field32[1] == 1 || super.field32[2] == 1 || super.field32[3] == 1 || super.field32[4] == 1) {
                this.field1651 = true;
            }
            if (this.field1651 && this.field1650 <= 0) {
                this.field1650 = 20;
                this.field1651 = false;
                this.field1250.method218(65, 837);
                this.field1250.method220(this.field1272);
                this.field1250.method220(this.field1273);
            }
            if (super.field19 && !this.field1303) {
                this.field1303 = true;
                this.field1250.method218(60, 837);
                this.field1250.method219(1);
            }
            if (!super.field19 && this.field1303) {
                this.field1303 = false;
                this.field1250.method218(60, 837);
                this.field1250.method219(0);
            }
            this.method429(3);
            this.method437(-867);
            this.method499(34790);
            ++this.field1331;
            if (this.field1331 > 750) {
                this.method452(false);
            }
            this.method496(this.field1539);
            this.method443(true);
            this.method466(747);
            ++this.field1477;
            if (this.field1493 != 0) {
                this.field1492 += 20;
                if (this.field1492 >= 400) {
                    this.field1493 = 0;
                }
            }
            if (this.field1611 != 0) {
                ++this.field1608;
                if (this.field1608 >= 15) {
                    if (this.field1611 == 2) {
                        this.field1634 = true;
                    }
                    if (this.field1611 == 3) {
                        this.field1683 = true;
                    }
                    this.field1611 = 0;
                }
            }
            if (this.field1630 != 0) {
                ++this.field1271;
                if (super.field22 > this.field1631 + 5 || super.field22 < this.field1631 - 5 || super.field23 > this.field1632 + 5 || super.field23 < this.field1632 - 5) {
                    this.field1617 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1630 == 2) {
                        this.field1634 = true;
                    }
                    if (this.field1630 == 3) {
                        this.field1683 = true;
                    }
                    this.field1630 = 0;
                    if (this.field1617 && this.field1271 >= 5) {
                        this.field1340 = -1;
                        this.method544(this.field1614);
                        if (this.field1628 == this.field1340 && this.field1629 != this.field1339) {
                            Component var20 = Component.field73[this.field1628];
                            byte var21 = 0;
                            if (this.field1383 == 1 && var20.field82 == 206) {
                                var21 = 1;
                            }
                            if (var20.field74[this.field1339] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field103) {
                                int var22 = this.field1629;
                                int var23 = this.field1339;
                                var20.field74[var23] = var20.field74[var22];
                                var20.field75[var23] = var20.field75[var22];
                                var20.field74[var22] = -1;
                                var20.field75[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1629;
                                int var25 = this.field1339;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24, 244, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24, 244, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1629, 244, this.field1339);
                            }
                            this.field1250.method218(28, 837);
                            this.field1250.method220(this.field1628);
                            this.field1250.method220(this.field1629);
                            this.field1250.method220(this.field1339);
                            this.field1250.method219(var21);
                        }
                    } else if ((this.field1382 == 1 || this.method502(this.field1499 - 1, -540)) && this.field1499 > 2) {
                        this.method513(false);
                    } else if (this.field1499 > 0) {
                        this.method543(-117, this.field1499 - 1);
                    }
                    this.field1608 = 10;
                    super.field28 = 0;
                }
            }
            ++field1394;
            if (field1394 > 62) {
                field1394 = 0;
                this.field1250.method218(153, 837);
            }
            if (World3D.field322 != -1) {
                int var26 = World3D.field322;
                int var27 = World3D.field323;
                boolean var28 = this.method486(0, var26, var27, 0, true, 0, 0, field1263.field452[0], 0, field1263.field453[0], true, 0);
                World3D.field322 = -1;
                if (var28) {
                    this.field1490 = super.field29;
                    this.field1491 = super.field30;
                    this.field1493 = 1;
                    this.field1492 = 0;
                }
            }
            if (super.field28 == 1 && this.field1251 != null) {
                this.field1251 = null;
                this.field1683 = true;
                super.field28 = 0;
            }
            this.method462(true);
            this.method488(this.field1530);
            this.method552(this.field1232);
            this.method456((byte) 5);
            if (super.field21 == 1 || super.field28 == 1) {
                ++this.field1641;
            }
            if (this.field1642 == 2) {
                this.method529(this.field1298);
            }
            if (this.field1642 == 2 && this.field1686) {
                this.method512(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1593[var29]++;
            }
            this.method468(this.field1269);
            ++super.field20;
            if (super.field20 > 4500) {
                this.field1333 = 250;
                super.field20 -= 500;
                this.field1250.method218(36, 837);
            }
            ++this.field1286;
            if (this.field1286 > 500) {
                this.field1286 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1506 += this.field1507;
                }
                if ((var30 & 2) == 2) {
                    this.field1416 += this.field1417;
                }
                if ((var30 & 4) == 4) {
                    this.field1264 += this.field1265;
                }
            }
            if (this.field1506 < -50) {
                this.field1507 = 2;
            }
            if (this.field1506 > 50) {
                this.field1507 = -2;
            }
            if (this.field1416 < -55) {
                this.field1417 = 2;
            }
            if (this.field1416 > 55) {
                this.field1417 = -2;
            }
            if (this.field1264 < -40) {
                this.field1265 = 1;
            }
            if (this.field1264 > 40) {
                this.field1265 = -1;
            }
            ++this.field1674;
            if (arg0 == 5) {
                boolean var31 = false;
                if (this.field1674 > 500) {
                    this.field1674 = 0;
                    int var32 = (int) (Math.random() * 8.0D);
                    if ((var32 & 1) == 1) {
                        this.field1351 += this.field1352;
                    }
                    if ((var32 & 2) == 2) {
                        this.field1581 += this.field1582;
                    }
                }
                if (this.field1351 < -60) {
                    this.field1352 = 2;
                }
                if (this.field1351 > 60) {
                    this.field1352 = -2;
                }
                if (this.field1581 < -20) {
                    this.field1582 = 1;
                }
                if (this.field1581 > 10) {
                    this.field1582 = -1;
                }
                ++this.field1332;
                if (this.field1332 > 50) {
                    this.field1250.method218(146, 837);
                }
                try {
                    if (this.field1485 != null && this.field1250.field712 > 0) {
                        this.field1485.method42(this.field1250.field712, 0, this.field1250.field711, 459);
                        this.field1250.field712 = 0;
                        this.field1332 = 0;
                    }
                } catch (IOException var34) {
                    this.method452(false);
                } catch (Exception var35) {
                    this.method554(this.field1607);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBLlb;)V")
    private final void method541(int arg0, byte arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1367; ++var4) {
            int var5 = this.field1368[var4];
            PlayerEntity var6 = this.field1364[var5];
            int var7 = arg2.method229();
            if ((var7 & 128) == 128) {
                var7 += arg2.method229() << 8;
            }
            this.method518(arg2, false, var5, var7, var6);
        }
        if (arg1 != 107) {
            this.field1445 = 464;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZBI)V")
    public final void method542(boolean arg0, byte arg1, int arg2) {
        if (arg1 != -78) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method543(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 >= 0) {
            if (this.field1285) {
                this.field1285 = false;
                this.field1683 = true;
            }
            int var4 = this.field1584[arg1];
            int var5 = this.field1585[arg1];
            int var6 = this.field1586[arg1];
            int var7 = this.field1587[arg1];
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (var6 == 899 && this.method558(156, (byte) 6, var7, var5, var4)) {
                this.field1250.method220(this.field1347);
            }
            if (var6 == 582 || var6 == 113 || var6 == 555 || var6 == 331 || var6 == 354) {
                if (var6 == 113) {
                    this.field1250.method218(105, 837);
                }
                if (var6 == 555) {
                    this.field1250.method218(86, 837);
                }
                if (var6 == 354) {
                    this.field1250.method218(255, 837);
                }
                if (var6 == 582) {
                    if ((var7 & 3) == 0) {
                        ++field1233;
                    }
                    if (field1233 >= 133) {
                        this.field1250.method218(134, 837);
                        this.field1250.method220(6118);
                    }
                    this.field1250.method218(202, 837);
                }
                if (var6 == 331) {
                    this.field1250.method218(112, 837);
                }
                this.field1250.method220(var7);
                this.field1250.method220(var4);
                this.field1250.method220(var5);
                this.field1608 = 0;
                this.field1609 = var5;
                this.field1610 = var4;
                this.field1611 = 2;
                if (Component.field73[var5].field79 == this.field1268) {
                    this.field1611 = 1;
                }
                if (Component.field73[var5].field79 == this.field1236) {
                    this.field1611 = 3;
                }
            }
            if (var6 == 625) {
                this.method558(85, (byte) 6, var7, var5, var4);
            }
            if (var6 == 1328) {
                ObjType var8 = ObjType.method348(var7);
                Component var9 = Component.field73[var5];
                String var10;
                if (var9 != null && var9.field75[var4] >= 100000) {
                    var10 = var9.field75[var4] + " x " + var8.field1055;
                } else if (var8.field1056 != null) {
                    var10 = new String(var8.field1056);
                } else {
                    var10 = "It's a " + var8.field1055 + ".";
                }
                this.method440("", var10, 0, 811);
            }
            if (var6 == 829) {
                NpcEntity var11 = this.field1309[var7];
                if (var11 != null) {
                    this.method486(2, var11.field452[0], var11.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                    this.field1490 = super.field29;
                    this.field1491 = super.field30;
                    this.field1493 = 2;
                    this.field1492 = 0;
                    this.field1250.method218(120, 837);
                    this.field1250.method220(var7);
                    this.field1250.method220(this.field1408);
                    this.field1250.method220(this.field1406);
                    this.field1250.method220(this.field1407);
                }
            }
            if (var6 == 242 || var6 == 209 || var6 == 309 || var6 == 852 || var6 == 793) {
                NpcEntity var12 = this.field1309[var7];
                if (var12 != null) {
                    this.method486(2, var12.field452[0], var12.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                    this.field1490 = super.field29;
                    this.field1491 = super.field30;
                    this.field1493 = 2;
                    this.field1492 = 0;
                    if (var6 == 852) {
                        this.field1250.method218(50, 837);
                    }
                    if (var6 == 793) {
                        this.field1250.method218(196, 837);
                    }
                    if (var6 == 242) {
                        this.field1250.method218(138, 837);
                    }
                    if (var6 == 209) {
                        this.field1250.method218(64, 837);
                    }
                    if (var6 == 309) {
                        this.field1250.method218(99, 837);
                    }
                    this.field1250.method220(var7);
                }
            }
            if (var6 == 435) {
                this.field1250.method218(107, 837);
                this.field1250.method220(var5);
                Component var13 = Component.field73[var5];
                if (var13.field88 != null && var13.field88[0][0] == 5) {
                    int var14 = var13.field88[0][1];
                    this.field1556[var14] = 1 - this.field1556[var14];
                    this.method498(var14, 179);
                    this.field1634 = true;
                }
            }
            if (var6 == 231) {
                Component var15 = Component.field73[var5];
                boolean var16 = true;
                if (var15.field82 > 0) {
                    var16 = this.method487(var15, 0);
                }
                if (var16) {
                    this.field1250.method218(107, 837);
                    this.field1250.method220(var5);
                }
            }
            if (var6 == 810 && this.method558(111, (byte) 6, var7, var5, var4)) {
                this.field1250.method220(this.field1408);
                this.field1250.method220(this.field1406);
                this.field1250.method220(this.field1407);
            }
            if (var6 == 639 || var6 == 499 || var6 == 27 || var6 == 387 || var6 == 185) {
                PlayerEntity var17 = this.field1364[var7];
                if (var17 != null) {
                    this.method486(2, var17.field452[0], var17.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                    this.field1490 = super.field29;
                    this.field1491 = super.field30;
                    this.field1493 = 2;
                    this.field1492 = 0;
                    if (var6 == 185) {
                        this.field1250.method218(89, 837);
                    }
                    if (var6 == 27) {
                        this.field1250.method218(123, 837);
                    }
                    if (var6 == 639) {
                        ++field1557;
                        if (field1557 >= 52) {
                            this.field1250.method218(210, 837);
                            this.field1250.method219(131);
                        }
                        this.field1250.method218(38, 837);
                    }
                    if (var6 == 499) {
                        this.field1250.method218(124, 837);
                    }
                    if (var6 == 387) {
                        field1376 += var7;
                        if (field1376 >= 66) {
                            this.field1250.method218(246, 837);
                            this.field1250.method219(154);
                        }
                        this.field1250.method218(171, 837);
                    }
                    this.field1250.method220(var7);
                }
            }
            if (var6 == 1381) {
                int var18 = var7 >> 14 & 32767;
                LocType var19 = LocType.method330(var18);
                String var20;
                if (var19.field962 != null) {
                    var20 = new String(var19.field962);
                } else {
                    var20 = "It's a " + var19.field961 + ".";
                }
                this.method440("", var20, 0, 811);
            }
            if (var6 == 605 || var6 == 47 || var6 == 513 || var6 == 884) {
                String var21 = this.field1636[arg1];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    long var23 = JString.method300(var21.substring(var22 + 5).trim());
                    if (var6 == 605) {
                        this.method549(6, var23);
                    }
                    if (var6 == 47) {
                        this.method548(var23, 9);
                    }
                    if (var6 == 513) {
                        this.method521(this.field1442, var23);
                    }
                    if (var6 == 884) {
                        this.method459(var23, (byte) 121);
                    }
                }
            }
            if (var6 == 274) {
                Component var25 = Component.field73[var5];
                this.field1346 = 1;
                this.field1347 = var5;
                this.field1348 = var25.field133;
                this.field1405 = 0;
                this.field1634 = true;
                String var26 = var25.field131;
                if (var26.indexOf(" ") != -1) {
                    var26 = var26.substring(0, var26.indexOf(" "));
                }
                String var27 = var25.field131;
                if (var27.indexOf(" ") != -1) {
                    var27 = var27.substring(var27.indexOf(" ") + 1);
                }
                this.field1349 = var26 + " " + var25.field132 + " " + var27;
                if (this.field1348 == 16) {
                    this.field1634 = true;
                    this.field1308 = 3;
                    this.field1377 = true;
                }
            } else {
                if (var6 == 1152) {
                    ObjType var28 = ObjType.method348(var7);
                    String var29;
                    if (var28.field1056 != null) {
                        var29 = new String(var28.field1056);
                    } else {
                        var29 = "It's a " + var28.field1055 + ".";
                    }
                    this.method440("", var29, 0, 811);
                }
                if (var6 == 1714) {
                    NpcEntity var30 = this.field1309[var7];
                    if (var30 != null) {
                        NpcType var31 = var30.field458;
                        if (var31.field1037 != null) {
                            var31 = var31.method345(-13461);
                        }
                        if (var31 != null) {
                            String var32;
                            if (var31.field1013 != null) {
                                var32 = new String(var31.field1013);
                            } else {
                                var32 = "It's a " + var31.field1012 + ".";
                            }
                            this.method440("", var32, 0, 811);
                        }
                    }
                }
                if (var6 == 743) {
                    ++field1411;
                    if (field1411 >= 124) {
                        this.field1250.method218(129, 837);
                        this.field1250.method220(37954);
                    }
                    this.method558(250, (byte) 6, var7, var5, var4);
                }
                if (var6 == 737) {
                    this.method482(true);
                }
                if (var6 == 240) {
                    NpcEntity var33 = this.field1309[var7];
                    if (var33 != null) {
                        this.method486(2, var33.field452[0], var33.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        this.field1490 = super.field29;
                        this.field1491 = super.field30;
                        this.field1493 = 2;
                        this.field1492 = 0;
                        this.field1250.method218(58, 837);
                        this.field1250.method220(var7);
                        this.field1250.method220(this.field1347);
                    }
                }
                if (var6 == 102) {
                    this.field1405 = 1;
                    this.field1406 = var4;
                    this.field1407 = var5;
                    this.field1408 = var7;
                    this.field1409 = ObjType.method348(var7).field1055;
                    this.field1346 = 0;
                    this.field1634 = true;
                } else {
                    if (var6 == 357) {
                        this.method558(172, (byte) 6, var7, var5, var4);
                    }
                    if (var6 == 1071) {
                        this.method558(165, (byte) 6, var7, var5, var4);
                    }
                    if (var6 == 225) {
                        this.field1250.method218(107, 837);
                        this.field1250.method220(var5);
                        Component var34 = Component.field73[var5];
                        if (var34.field88 != null && var34.field88[0][0] == 5) {
                            int var35 = var34.field88[0][1];
                            if (this.field1556[var35] != var34.field90[0]) {
                                this.field1556[var35] = var34.field90[0];
                                this.method498(var35, 179);
                                this.field1634 = true;
                            }
                        }
                    }
                    if (var6 == 275) {
                        PlayerEntity var36 = this.field1364[var7];
                        if (var36 != null) {
                            this.method486(2, var36.field452[0], var36.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                            this.field1490 = super.field29;
                            this.field1491 = super.field30;
                            this.field1493 = 2;
                            this.field1492 = 0;
                            this.field1250.method218(15, 837);
                            this.field1250.method220(var7);
                            this.field1250.method220(this.field1408);
                            this.field1250.method220(this.field1406);
                            this.field1250.method220(this.field1407);
                        }
                    }
                    if (var6 == 139 || var6 == 778 || var6 == 617 || var6 == 224 || var6 == 662) {
                        boolean var37 = this.method486(2, var4, var5, 0, true, 0, 0, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        if (!var37) {
                            this.method486(2, var4, var5, 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        }
                        this.field1490 = super.field29;
                        this.field1491 = super.field30;
                        this.field1493 = 2;
                        this.field1492 = 0;
                        if (var6 == 778) {
                            this.field1250.method218(52, 837);
                        }
                        if (var6 == 139) {
                            if ((var4 & 3) == 0) {
                                ++field1695;
                            }
                            if (field1695 >= 123) {
                                this.field1250.method218(20, 837);
                                this.field1250.method223(0);
                            }
                            this.field1250.method218(122, 837);
                        }
                        if (var6 == 662) {
                            field1602 += this.field1246;
                            if (field1602 >= 118) {
                                this.field1250.method218(100, 837);
                                this.field1250.method223(0);
                            }
                            this.field1250.method218(222, 837);
                        }
                        if (var6 == 224) {
                            field1693 += var5;
                            if (field1693 >= 75) {
                                this.field1250.method218(198, 837);
                                this.field1250.method219(19);
                            }
                            this.field1250.method218(251, 837);
                        }
                        if (var6 == 617) {
                            this.field1250.method218(170, 837);
                        }
                        this.field1250.method220(this.field1245 + var4);
                        this.field1250.method220(this.field1246 + var5);
                        this.field1250.method220(var7);
                    }
                    if (var6 == 131) {
                        PlayerEntity var39 = this.field1364[var7];
                        if (var39 != null) {
                            this.method486(2, var39.field452[0], var39.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                            this.field1490 = super.field29;
                            this.field1491 = super.field30;
                            this.field1493 = 2;
                            this.field1492 = 0;
                            this.field1250.method218(189, 837);
                            this.field1250.method220(var7);
                            this.field1250.method220(this.field1347);
                        }
                    }
                    if (var6 == 563) {
                        this.field1250.method218(47, 837);
                        this.field1250.method220(var7);
                        this.field1250.method220(var4);
                        this.field1250.method220(var5);
                        this.field1250.method220(this.field1347);
                        this.field1608 = 0;
                        this.field1609 = var5;
                        this.field1610 = var4;
                        this.field1611 = 2;
                        if (Component.field73[var5].field79 == this.field1268) {
                            this.field1611 = 1;
                        }
                        if (Component.field73[var5].field79 == this.field1236) {
                            this.field1611 = 3;
                        }
                    }
                    if (var6 == 370) {
                        boolean var40 = this.method486(2, var4, var5, 0, true, 0, 0, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        if (!var40) {
                            this.method486(2, var4, var5, 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        }
                        this.field1490 = super.field29;
                        this.field1491 = super.field30;
                        this.field1493 = 2;
                        this.field1492 = 0;
                        this.field1250.method218(46, 837);
                        this.field1250.method220(this.field1245 + var4);
                        this.field1250.method220(this.field1246 + var5);
                        this.field1250.method220(var7);
                        this.field1250.method220(this.field1347);
                    }
                    if (var6 == 902) {
                        String var42 = this.field1636[arg1];
                        int var43 = var42.indexOf("@whi@");
                        if (var43 != -1) {
                            long var44 = JString.method300(var42.substring(var43 + 5).trim());
                            int var46 = -1;
                            for (int var47 = 0; var47 < this.field1288; ++var47) {
                                if (this.field1360[var47] == var44) {
                                    var46 = var47;
                                    break;
                                }
                            }
                            if (var46 != -1 && this.field1637[var46] > 0) {
                                this.field1683 = true;
                                this.field1285 = false;
                                this.field1515 = true;
                                this.field1505 = "";
                                this.field1571 = 3;
                                this.field1678 = this.field1360[var46];
                                this.field1638 = "Enter message to send to " + this.field1451[var46];
                            }
                        }
                    }
                    if (var6 == 721) {
                        field1402 += var5;
                        if (field1402 >= 139) {
                            this.field1250.method218(73, 837);
                            this.field1250.method223(0);
                        }
                        this.method558(187, (byte) 6, var7, var5, var4);
                    }
                    if (var6 == 524) {
                        String var48 = this.field1636[arg1];
                        int var49 = var48.indexOf("@whi@");
                        if (var49 != -1) {
                            if (this.field1268 == -1) {
                                this.method482(true);
                                this.field1685 = var48.substring(var49 + 5).trim();
                                this.field1280 = false;
                                for (int var50 = 0; var50 < Component.field73.length; ++var50) {
                                    if (Component.field73[var50] != null && Component.field73[var50].field82 == 600) {
                                        this.field1370 = this.field1268 = Component.field73[var50].field79;
                                        break;
                                    }
                                }
                            } else {
                                this.method440("", "Please close the interface you have open before using 'report abuse'", 0, 811);
                            }
                        }
                    }
                    if (var6 == 718) {
                        if (!this.field1578) {
                            this.field1569.method88(this.field1425, super.field29 - 4, super.field30 - 4);
                        } else {
                            this.field1569.method88(this.field1425, var4 - 4, var5 - 4);
                        }
                    }
                    if (var6 == 398) {
                        this.field1250.method218(93, 837);
                        this.field1250.method220(var7);
                        this.field1250.method220(var4);
                        this.field1250.method220(var5);
                        this.field1250.method220(this.field1408);
                        this.field1250.method220(this.field1406);
                        this.field1250.method220(this.field1407);
                        this.field1608 = 0;
                        this.field1609 = var5;
                        this.field1610 = var4;
                        this.field1611 = 2;
                        if (Component.field73[var5].field79 == this.field1268) {
                            this.field1611 = 1;
                        }
                        if (Component.field73[var5].field79 == this.field1236) {
                            this.field1611 = 3;
                        }
                    }
                    if (var6 == 694 || var6 == 962 || var6 == 795 || var6 == 681 || var6 == 100) {
                        if (var6 == 681) {
                            ++field1568;
                            if (field1568 >= 116) {
                                this.field1250.method218(252, 837);
                                this.field1250.method222(13018169);
                            }
                            this.field1250.method218(76, 837);
                        }
                        if (var6 == 694) {
                            this.field1250.method218(88, 837);
                        }
                        if (var6 == 962) {
                            this.field1250.method218(149, 837);
                        }
                        if (var6 == 100) {
                            this.field1250.method218(215, 837);
                        }
                        if (var6 == 795) {
                            this.field1250.method218(219, 837);
                        }
                        this.field1250.method220(var7);
                        this.field1250.method220(var4);
                        this.field1250.method220(var5);
                        this.field1608 = 0;
                        this.field1609 = var5;
                        this.field1610 = var4;
                        this.field1611 = 2;
                        if (Component.field73[var5].field79 == this.field1268) {
                            this.field1611 = 1;
                        }
                        if (Component.field73[var5].field79 == this.field1236) {
                            this.field1611 = 3;
                        }
                    }
                    if (var6 == 507 || var6 == 957) {
                        String var51 = this.field1636[arg1];
                        int var52 = var51.indexOf("@whi@");
                        if (var52 != -1) {
                            String var53 = var51.substring(var52 + 5).trim();
                            String var54 = JString.method304(false, JString.method301(false, JString.method300(var53)));
                            boolean var55 = false;
                            for (int var56 = 0; var56 < this.field1365; ++var56) {
                                PlayerEntity var57 = this.field1364[this.field1366[var56]];
                                if (var57 != null && var57.field462 != null && var57.field462.equalsIgnoreCase(var54)) {
                                    this.method486(2, var57.field452[0], var57.field453[0], 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                                    if (var6 == 507) {
                                        field1376 += var7;
                                        if (field1376 >= 66) {
                                            this.field1250.method218(246, 837);
                                            this.field1250.method219(154);
                                        }
                                        this.field1250.method218(171, 837);
                                    }
                                    if (var6 == 957) {
                                        ++field1557;
                                        if (field1557 >= 52) {
                                            this.field1250.method218(210, 837);
                                            this.field1250.method219(131);
                                        }
                                        this.field1250.method218(38, 837);
                                    }
                                    this.field1250.method220(this.field1366[var56]);
                                    var55 = true;
                                    break;
                                }
                            }
                            if (!var55) {
                                this.method440("", "Unable to find " + var54, 0, 811);
                            }
                        }
                    }
                    if (var6 == 111) {
                        boolean var58 = this.method486(2, var4, var5, 0, true, 0, 0, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        if (!var58) {
                            this.method486(2, var4, var5, 1, true, 0, 1, field1263.field452[0], 0, field1263.field453[0], false, 0);
                        }
                        this.field1490 = super.field29;
                        this.field1491 = super.field30;
                        this.field1493 = 2;
                        this.field1492 = 0;
                        this.field1250.method218(59, 837);
                        this.field1250.method220(this.field1245 + var4);
                        this.field1250.method220(this.field1246 + var5);
                        this.field1250.method220(var7);
                        this.field1250.method220(this.field1408);
                        this.field1250.method220(this.field1406);
                        this.field1250.method220(this.field1407);
                    }
                    if (var6 == 997 && !this.field1482) {
                        this.field1250.method218(27, 837);
                        this.field1250.method220(var5);
                        this.field1482 = true;
                    }
                    this.field1405 = 0;
                    this.field1346 = 0;
                    this.field1634 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method544(boolean arg0) {
        if (this.field1630 == 0) {
            this.field1636[0] = "Cancel";
            if (!arg0) {
                this.method6();
            }
            this.field1586[0] = 1106;
            this.field1499 = 1;
            this.method492(31570);
            this.field1615 = 0;
            if (super.field22 > 4 && super.field23 > 4 && super.field22 < 516 && super.field23 < 338) {
                if (this.field1268 != -1) {
                    this.method553(0, 4, 5973, Component.field73[this.field1268], super.field22, 4, super.field23);
                } else {
                    this.method435(-38604);
                }
            }
            if (this.field1615 != this.field1350) {
                this.field1350 = this.field1615;
            }
            this.field1615 = 0;
            if (super.field22 > 553 && super.field23 > 205 && super.field22 < 743 && super.field23 < 466) {
                if (this.field1489 != -1) {
                    this.method553(0, 553, 5973, Component.field73[this.field1489], super.field22, 205, super.field23);
                } else if (this.field1393[this.field1308] != -1) {
                    this.method553(0, 553, 5973, Component.field73[this.field1393[this.field1308]], super.field22, 205, super.field23);
                }
            }
            if (this.field1615 != this.field1373) {
                this.field1634 = true;
                this.field1373 = this.field1615;
            }
            this.field1615 = 0;
            if (super.field22 > 17 && super.field23 > 357 && super.field22 < 496 && super.field23 < 453) {
                if (this.field1236 != -1) {
                    this.method553(0, 17, 5973, Component.field73[this.field1236], super.field22, 357, super.field23);
                } else if (super.field23 < 434 && super.field22 < 426) {
                    this.method506(super.field22 - 17, 571, super.field23 - 357);
                }
            }
            if (this.field1236 != -1 && this.field1615 != this.field1287) {
                this.field1683 = true;
                this.field1287 = this.field1615;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1499 - 1; ++var3) {
                    if (this.field1586[var3] < 1000 && this.field1586[var3 + 1] > 1000) {
                        String var4 = this.field1636[var3];
                        this.field1636[var3] = this.field1636[var3 + 1];
                        this.field1636[var3 + 1] = var4;
                        int var5 = this.field1586[var3];
                        this.field1586[var3] = this.field1586[var3 + 1];
                        this.field1586[var3 + 1] = var5;
                        int var6 = this.field1584[var3];
                        this.field1584[var3] = this.field1584[var3 + 1];
                        this.field1584[var3 + 1] = var6;
                        int var7 = this.field1585[var3];
                        this.field1585[var3] = this.field1585[var3 + 1];
                        this.field1585[var3 + 1] = var7;
                        int var8 = this.field1587[var3];
                        this.field1587[var3] = this.field1587[var3 + 1];
                        this.field1587[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method545(boolean arg0) {
        this.field1235 = 0;
        if (arg0) {
            this.field1486 = -114;
        }
        int var2 = (field1263.field402 >> 7) + this.field1245;
        int var3 = (field1263.field403 >> 7) + this.field1246;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1235 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1235 = 1;
        }
        if (this.field1235 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1235 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method546(byte arg0) {
        this.field1525 = true;
        if (arg0 != 3) {
            this.field1337 = null;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1504[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1123; ++var3) {
                if (!IdkType.field1124[var3].field1130 && IdkType.field1124[var3].field1125 == var2 + (this.field1564 ? 0 : 7)) {
                    this.field1504[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method547(int arg0) {
        if (arg0 != -23747) {
            this.field1250.method219(49);
        }
        if (this.field1661 == null) {
            super.field15 = null;
            this.field1437 = null;
            this.field1435 = null;
            this.field1434 = null;
            this.field1436 = null;
            this.field1260 = null;
            this.field1261 = null;
            this.field1262 = null;
            this.field1664 = new PixMap(this.method11(0), 128, 265, -707);
            Pix2D.method155(4);
            this.field1665 = new PixMap(this.method11(0), 128, 265, -707);
            Pix2D.method155(4);
            this.field1661 = new PixMap(this.method11(0), 509, 171, -707);
            Pix2D.method155(4);
            this.field1662 = new PixMap(this.method11(0), 360, 132, -707);
            Pix2D.method155(4);
            this.field1663 = new PixMap(this.method11(0), 360, 200, -707);
            Pix2D.method155(4);
            this.field1666 = new PixMap(this.method11(0), 202, 238, -707);
            Pix2D.method155(4);
            this.field1667 = new PixMap(this.method11(0), 203, 238, -707);
            Pix2D.method155(4);
            this.field1668 = new PixMap(this.method11(0), 74, 94, -707);
            Pix2D.method155(4);
            this.field1669 = new PixMap(this.method11(0), 75, 94, -707);
            Pix2D.method155(4);
            if (this.field1484 != null) {
                this.method471(191);
                this.method494(0);
            }
            this.field1675 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method548(long arg0, int arg1) {
        if (arg1 != 9) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg0 != 0L) {
            if (this.field1580 >= 100) {
                this.method440("", "Your ignore list is full. Max of 100 hit", 0, 811);
            } else {
                String var5 = JString.method304(false, JString.method301(false, arg0));
                for (int var6 = 0; var6 < this.field1580; ++var6) {
                    if (this.field1536[var6] == arg0) {
                        this.method440("", var5 + " is already on your ignore list", 0, 811);
                        return;
                    }
                }
                for (int var7 = 0; var7 < this.field1288; ++var7) {
                    if (this.field1360[var7] == arg0) {
                        this.method440("", "Please remove " + var5 + " from your friend list first", 0, 811);
                        return;
                    }
                }
                this.field1536[this.field1580++] = arg0;
                this.field1634 = true;
                this.field1250.method218(32, 837);
                this.field1250.method225(this.field1239, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method549(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1288 >= 100 && this.field1475 != 1) {
                this.method440("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, 811);
            } else if (this.field1288 >= 200) {
                this.method440("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, 811);
            } else {
                String var4 = JString.method304(false, JString.method301(false, arg1));
                for (int var5 = 0; var5 < this.field1288; ++var5) {
                    if (this.field1360[var5] == arg1) {
                        this.method440("", var4 + " is already on your friend list", 0, 811);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1580; ++var6) {
                    if (this.field1536[var6] == arg1) {
                        this.method440("", "Please remove " + var4 + " from your ignore list first", 0, 811);
                        return;
                    }
                }
                if (arg0 < 6 || arg0 > 6) {
                    this.field1330 = -1;
                }
                if (!var4.equals(field1263.field462)) {
                    this.field1451[this.field1288] = var4;
                    this.field1360[this.field1288] = arg1;
                    this.field1637[this.field1288] = 0;
                    ++this.field1288;
                    this.field1634 = true;
                    this.field1250.method218(176, 837);
                    this.field1250.method225(this.field1239, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1389 = Integer.parseInt(this.getParameter("nodeid"));
        field1390 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method436(7);
        } else {
            method465(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1391 = false;
        } else {
            field1391 = true;
        }
        this.method2(503, 765, (byte) -111);
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method550(int arg0) {
        this.field1437.method258(false);
        Pix3D.field650 = this.field1427;
        this.field1381.method199(0, 0, false);
        if (this.field1515) {
            this.field1497.method202(239, -33071, 0, this.field1638, 40);
            this.field1497.method202(239, -33071, 128, this.field1505 + "*", 60);
        } else if (this.field1285) {
            this.field1497.method202(239, -33071, 0, "Enter amount:", 40);
            this.field1497.method202(239, -33071, 128, this.field1531 + "*", 60);
        } else if (this.field1251 != null) {
            this.field1497.method202(239, -33071, 0, this.field1251, 40);
            this.field1497.method202(239, -33071, 128, "Click to continue", 60);
        } else if (this.field1236 != -1) {
            this.method467(0, Component.field73[this.field1236], 0, -28, 0);
        } else if (this.field1500 != -1) {
            this.method467(0, Component.field73[this.field1500], 0, -28, 0);
        } else {
            PixFont var2 = this.field1496;
            int var3 = 0;
            Pix2D.method154(77, 463, 0, -226, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1283[var4] != null) {
                    int var6 = this.field1281[var4];
                    int var7 = 70 - var3 * 14 + this.field1441;
                    String var8 = this.field1282[var4];
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
                            var2.method206(var7, 0, 4, this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1240 == 0 || this.field1240 == 1 && this.method517(this.field1486, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1560[0].method199(var10, var7 - 12, false);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1560[1].method199(var10, var7 - 12, false);
                                var10 += 14;
                            }
                            var2.method206(var7, 0, var10, var8 + ":", 3);
                            int var11 = var10 + var2.method204(var8, 0) + 8;
                            var2.method206(var7, 255, var11, this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1502 == 0 && (var6 == 7 || this.field1540 == 0 || this.field1540 == 1 && this.method517(this.field1486, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method206(var7, 0, var12, "From", 3);
                            int var13 = var12 + var2.method204("From ", 0);
                            if (var9 == 1) {
                                this.field1560[0].method199(var13, var7 - 12, false);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1560[1].method199(var13, var7 - 12, false);
                                var13 += 14;
                            }
                            var2.method206(var7, 0, var13, var8 + ":", 3);
                            int var14 = var13 + var2.method204(var8, 0) + 8;
                            var2.method206(var7, 8388608, var14, this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1410 == 0 || this.field1410 == 1 && this.method517(this.field1486, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, 8388736, 4, var8 + " " + this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1502 == 0 && this.field1540 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, 8388608, 4, this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1502 == 0 && this.field1540 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, 0, 4, "To " + var8 + ":", 3);
                            var2.method206(var7, 8388608, 12 + var2.method204("To " + var8, 0), this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1410 == 0 || this.field1410 == 1 && this.method517(this.field1486, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var7, 8270336, 4, var8 + " " + this.field1283[var4], 3);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method153((byte) 3);
            this.field1624 = var3 * 14 + 7;
            if (this.field1624 < 78) {
                this.field1624 = 78;
            }
            this.method508(77, 0, this.field1624, this.field1566, 463, this.field1624 - this.field1441 - 77);
            String var5;
            if (field1263 != null && field1263.field462 != null) {
                var5 = field1263.field462;
            } else {
                var5 = JString.method304(false, this.field1413);
            }
            var2.method206(90, 0, 4, var5 + ":", 3);
            var2.method206(90, 255, 6 + var2.method204(var5 + ": ", 0), this.field1401 + "*", 3);
            Pix2D.method160(0, 0, 77, 479, 1);
        }
        if (this.field1578 && this.field1457 == 2) {
            this.method503(-567);
        }
        this.field1437.method259(357, true, 17, super.field14);
        this.field1436.method258(false);
        this.field1329 += arg0;
        Pix3D.field650 = this.field1429;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Ld;I)Z")
    public final boolean method551(Component arg0, int arg1) {
        int var3 = arg0.field82;
        while (arg1 >= 0) {
            this.field1469 = this.field1372.method295();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1636[this.field1499] = "Remove @whi@" + arg0.field114;
                this.field1586[this.field1499] = 884;
                ++this.field1499;
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
            this.field1636[this.field1499] = "Remove @whi@" + this.field1451[var3];
            this.field1586[this.field1499] = 513;
            ++this.field1499;
            this.field1636[this.field1499] = "Message @whi@" + this.field1451[var3];
            this.field1586[this.field1499] = 902;
            ++this.field1499;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method552(int arg0) {
        if (arg0 == -6835) {
            if (super.field28 == 1) {
                if (super.field29 >= 539 && super.field29 <= 573 && super.field30 >= 169 && super.field30 < 205 && this.field1393[0] != -1) {
                    this.field1634 = true;
                    this.field1308 = 0;
                    this.field1377 = true;
                }
                if (super.field29 >= 569 && super.field29 <= 599 && super.field30 >= 168 && super.field30 < 205 && this.field1393[1] != -1) {
                    this.field1634 = true;
                    this.field1308 = 1;
                    this.field1377 = true;
                }
                if (super.field29 >= 597 && super.field29 <= 627 && super.field30 >= 168 && super.field30 < 205 && this.field1393[2] != -1) {
                    this.field1634 = true;
                    this.field1308 = 2;
                    this.field1377 = true;
                }
                if (super.field29 >= 625 && super.field29 <= 669 && super.field30 >= 168 && super.field30 < 203 && this.field1393[3] != -1) {
                    this.field1634 = true;
                    this.field1308 = 3;
                    this.field1377 = true;
                }
                if (super.field29 >= 666 && super.field29 <= 696 && super.field30 >= 168 && super.field30 < 205 && this.field1393[4] != -1) {
                    this.field1634 = true;
                    this.field1308 = 4;
                    this.field1377 = true;
                }
                if (super.field29 >= 694 && super.field29 <= 724 && super.field30 >= 168 && super.field30 < 205 && this.field1393[5] != -1) {
                    this.field1634 = true;
                    this.field1308 = 5;
                    this.field1377 = true;
                }
                if (super.field29 >= 722 && super.field29 <= 756 && super.field30 >= 169 && super.field30 < 205 && this.field1393[6] != -1) {
                    this.field1634 = true;
                    this.field1308 = 6;
                    this.field1377 = true;
                }
                if (super.field29 >= 540 && super.field29 <= 574 && super.field30 >= 466 && super.field30 < 502 && this.field1393[7] != -1) {
                    this.field1634 = true;
                    this.field1308 = 7;
                    this.field1377 = true;
                }
                if (super.field29 >= 572 && super.field29 <= 602 && super.field30 >= 466 && super.field30 < 503 && this.field1393[8] != -1) {
                    this.field1634 = true;
                    this.field1308 = 8;
                    this.field1377 = true;
                }
                if (super.field29 >= 599 && super.field29 <= 629 && super.field30 >= 466 && super.field30 < 503 && this.field1393[9] != -1) {
                    this.field1634 = true;
                    this.field1308 = 9;
                    this.field1377 = true;
                }
                if (super.field29 >= 627 && super.field29 <= 671 && super.field30 >= 467 && super.field30 < 502 && this.field1393[10] != -1) {
                    this.field1634 = true;
                    this.field1308 = 10;
                    this.field1377 = true;
                }
                if (super.field29 >= 669 && super.field29 <= 699 && super.field30 >= 466 && super.field30 < 503 && this.field1393[11] != -1) {
                    this.field1634 = true;
                    this.field1308 = 11;
                    this.field1377 = true;
                }
                if (super.field29 >= 696 && super.field29 <= 726 && super.field30 >= 466 && super.field30 < 503 && this.field1393[12] != -1) {
                    this.field1634 = true;
                    this.field1308 = 12;
                    this.field1377 = true;
                }
                if (super.field29 >= 724 && super.field29 <= 758 && super.field30 >= 466 && super.field30 < 502 && this.field1393[13] != -1) {
                    this.field1634 = true;
                    this.field1308 = 13;
                    this.field1377 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;III)V")
    public final void method553(int arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 5973) {
            this.field1614 = !this.field1614;
        }
        if (arg3.field80 == 0 && arg3.field95 != null && !arg3.field94) {
            if (arg4 >= arg1 && arg6 >= arg5 && arg4 <= arg3.field83 + arg1 && arg6 <= arg3.field84 + arg5) {
                int var8 = arg3.field95.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field96[var9] + arg1;
                    int var11 = arg3.field97[var9] + arg5 - arg0;
                    Component var12 = Component.field73[arg3.field95[var9]];
                    int var13 = var12.field86 + var10;
                    int var14 = var12.field87 + var11;
                    if ((var12.field91 >= 0 || var12.field118 != 0) && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                        if (var12.field91 >= 0) {
                            this.field1615 = var12.field91;
                        } else {
                            this.field1615 = var12.field78;
                        }
                    }
                    if (var12.field80 == 0) {
                        this.method553(var12.field93, var13, 5973, var12, arg4, var14, arg6);
                        if (var12.field92 > var12.field84) {
                            this.method473(var12.field92, var14, arg6, arg4, var12.field84, this.field1445, var12, true, var12.field83 + var13);
                        }
                    } else {
                        if (var12.field81 == 1 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            boolean var15 = false;
                            if (var12.field82 != 0) {
                                var15 = this.method551(var12, -246);
                            }
                            if (!var15) {
                                this.field1636[this.field1499] = var12.field134;
                                this.field1586[this.field1499] = 231;
                                this.field1585[this.field1499] = var12.field78;
                                ++this.field1499;
                            }
                        }
                        if (var12.field81 == 2 && this.field1346 == 0 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            String var16 = var12.field131;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1636[this.field1499] = var16 + " @gre@" + var12.field132;
                            this.field1586[this.field1499] = 274;
                            this.field1585[this.field1499] = var12.field78;
                            ++this.field1499;
                        }
                        if (var12.field81 == 3 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            this.field1636[this.field1499] = "Close";
                            this.field1586[this.field1499] = 737;
                            this.field1585[this.field1499] = var12.field78;
                            ++this.field1499;
                        }
                        if (var12.field81 == 4 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            this.field1636[this.field1499] = var12.field134;
                            this.field1586[this.field1499] = 435;
                            this.field1585[this.field1499] = var12.field78;
                            ++this.field1499;
                        }
                        if (var12.field81 == 5 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            this.field1636[this.field1499] = var12.field134;
                            this.field1586[this.field1499] = 225;
                            this.field1585[this.field1499] = var12.field78;
                            ++this.field1499;
                        }
                        if (var12.field81 == 6 && !this.field1482 && arg4 >= var13 && arg6 >= var14 && arg4 < var12.field83 + var13 && arg6 < var12.field84 + var14) {
                            this.field1636[this.field1499] = var12.field134;
                            this.field1586[this.field1499] = 997;
                            this.field1585[this.field1499] = var12.field78;
                            ++this.field1499;
                        }
                        if (var12.field80 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field84; ++var18) {
                                for (int var19 = 0; var19 < var12.field83; ++var19) {
                                    int var20 = (var12.field104 + 32) * var19 + var13;
                                    int var21 = (var12.field105 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field107[var17];
                                        var21 += var12.field108[var17];
                                    }
                                    if (arg4 >= var20 && arg6 >= var21 && arg4 < var20 + 32 && arg6 < var21 + 32) {
                                        this.field1339 = var17;
                                        this.field1340 = var12.field78;
                                        if (var12.field74[var17] > 0) {
                                            ObjType var22 = ObjType.method348(var12.field74[var17] - 1);
                                            if (this.field1405 == 1 && var12.field101) {
                                                if (this.field1407 != var12.field78 || this.field1406 != var17) {
                                                    this.field1636[this.field1499] = "Use " + this.field1409 + " with @lre@" + var22.field1055;
                                                    this.field1586[this.field1499] = 398;
                                                    this.field1587[this.field1499] = var22.field1053;
                                                    this.field1584[this.field1499] = var17;
                                                    this.field1585[this.field1499] = var12.field78;
                                                    ++this.field1499;
                                                }
                                            } else if (this.field1346 == 1 && var12.field101) {
                                                if ((this.field1348 & 16) == 16) {
                                                    this.field1636[this.field1499] = this.field1349 + " @lre@" + var22.field1055;
                                                    this.field1586[this.field1499] = 563;
                                                    this.field1587[this.field1499] = var22.field1053;
                                                    this.field1584[this.field1499] = var17;
                                                    this.field1585[this.field1499] = var12.field78;
                                                    ++this.field1499;
                                                }
                                            } else {
                                                if (var12.field101) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1070 != null && var22.field1070[var23] != null) {
                                                            this.field1636[this.field1499] = var22.field1070[var23] + " @lre@" + var22.field1055;
                                                            if (var23 == 3) {
                                                                this.field1586[this.field1499] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1586[this.field1499] = 100;
                                                            }
                                                            this.field1587[this.field1499] = var22.field1053;
                                                            this.field1584[this.field1499] = var17;
                                                            this.field1585[this.field1499] = var12.field78;
                                                            ++this.field1499;
                                                        } else if (var23 == 4) {
                                                            this.field1636[this.field1499] = "Drop @lre@" + var22.field1055;
                                                            this.field1586[this.field1499] = 100;
                                                            this.field1587[this.field1499] = var22.field1053;
                                                            this.field1584[this.field1499] = var17;
                                                            this.field1585[this.field1499] = var12.field78;
                                                            ++this.field1499;
                                                        }
                                                    }
                                                }
                                                if (var12.field102) {
                                                    this.field1636[this.field1499] = "Use @lre@" + var22.field1055;
                                                    this.field1586[this.field1499] = 102;
                                                    this.field1587[this.field1499] = var22.field1053;
                                                    this.field1584[this.field1499] = var17;
                                                    this.field1585[this.field1499] = var12.field78;
                                                    ++this.field1499;
                                                }
                                                if (var12.field101 && var22.field1070 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1070[var24] != null) {
                                                            this.field1636[this.field1499] = var22.field1070[var24] + " @lre@" + var22.field1055;
                                                            if (var24 == 0) {
                                                                this.field1586[this.field1499] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1586[this.field1499] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1586[this.field1499] = 795;
                                                            }
                                                            this.field1587[this.field1499] = var22.field1053;
                                                            this.field1584[this.field1499] = var17;
                                                            this.field1585[this.field1499] = var12.field78;
                                                            ++this.field1499;
                                                        }
                                                    }
                                                }
                                                if (var12.field109 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field109[var25] != null) {
                                                            this.field1636[this.field1499] = var12.field109[var25] + " @lre@" + var22.field1055;
                                                            if (var25 == 0) {
                                                                this.field1586[this.field1499] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1586[this.field1499] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1586[this.field1499] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1586[this.field1499] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1586[this.field1499] = 354;
                                                            }
                                                            this.field1587[this.field1499] = var22.field1053;
                                                            this.field1584[this.field1499] = var17;
                                                            this.field1585[this.field1499] = var12.field78;
                                                            ++this.field1499;
                                                        }
                                                    }
                                                }
                                                this.field1636[this.field1499] = "Examine @lre@" + var22.field1055;
                                                this.field1586[this.field1499] = 1328;
                                                this.field1587[this.field1499] = var22.field1053;
                                                this.field1584[this.field1499] = var17;
                                                this.field1585[this.field1499] = var12.field78;
                                                ++this.field1499;
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

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method554(byte arg0) {
        try {
            if (this.field1485 != null) {
                this.field1485.method38();
            }
        } catch (Exception var3) {
        }
        this.field1485 = null;
        this.field1277 = false;
        this.field1479 = 0;
        this.field1413 = "";
        if (arg0 != 8) {
            this.field1330 = this.field1596.method229();
        }
        this.field1414 = "";
        this.method431(0);
        this.field1569.method50(712);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1647[var2].method359(false);
        }
        System.gc();
        this.method532((byte) -111);
        this.field1583 = -1;
        this.field1576 = -1;
        this.field1514 = 0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method555(boolean arg0, int arg1) {
        if (field1263.field402 >> 7 == this.field1603 && field1263.field403 >> 7 == this.field1604) {
            this.field1603 = 0;
            ++field1443;
            if (field1443 > 122) {
                field1443 = 0;
                this.field1250.method218(174, 837);
                this.field1250.method219(62);
            }
        }
        int var3 = this.field1365;
        if (arg1 != -18210) {
            this.field1232 = this.field1372.method295();
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1263;
                var6 = this.field1363 << 14;
            } else {
                var5 = this.field1364[this.field1366[var4]];
                var6 = this.field1366[var4] << 14;
            }
            if (var5 != null && var5.method113(this.field1640)) {
                var5.field482 = false;
                if ((field1392 && this.field1365 > 50 || this.field1365 > 200) && !arg0 && var5.field427 == var5.field407) {
                    var5.field482 = true;
                }
                int var7 = var5.field402 >> 7;
                int var8 = var5.field403 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field477 != null && field1300 >= var5.field472 && field1300 < var5.field473) {
                        var5.field482 = false;
                        var5.field471 = this.method510(var5.field402, var5.field403, (byte) 51, this.field1501);
                        this.field1569.method62(-3283, var6, var5, var5.field480, this.field1501, var5.field471, 60, var5.field479, var5.field403, var5.field481, var5.field402, var5.field404, var5.field478);
                    } else {
                        if ((var5.field402 & 127) == 64 && (var5.field403 & 127) == 64) {
                            if (this.field1613[var7][var8] == this.field1677) {
                                continue;
                            }
                            this.field1613[var7][var8] = this.field1677;
                        }
                        var5.field471 = this.method510(var5.field402, var5.field403, (byte) 51, this.field1501);
                        this.field1569.method61(var5.field405, this.field1501, var5.field403, 60, var6, var5, var5.field471, 1, var5.field404, var5.field402);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method556(byte arg0) {
        if (this.field1437 == null) {
            this.method442(-630);
            super.field15 = null;
            this.field1661 = null;
            this.field1662 = null;
            this.field1663 = null;
            this.field1664 = null;
            this.field1665 = null;
            this.field1666 = null;
            this.field1667 = null;
            this.field1668 = null;
            if (arg0 == 6) {
                boolean var2 = false;
            } else {
                this.field1250.method219(188);
            }
            this.field1669 = null;
            this.field1437 = new PixMap(this.method11(0), 479, 96, -707);
            this.field1435 = new PixMap(this.method11(0), 172, 156, -707);
            Pix2D.method155(4);
            this.field1380.method199(0, 0, false);
            this.field1434 = new PixMap(this.method11(0), 190, 261, -707);
            this.field1436 = new PixMap(this.method11(0), 512, 334, -707);
            Pix2D.method155(4);
            this.field1260 = new PixMap(this.method11(0), 496, 50, -707);
            this.field1261 = new PixMap(this.method11(0), 269, 37, -707);
            this.field1262 = new PixMap(this.method11(0), 249, 45, -707);
            this.field1675 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Z")
    public final boolean method557(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            throw new NullPointerException();
        } else {
            boolean var4 = false;
            Component var5 = Component.field73[arg2];
            for (int var6 = 0; var6 < var5.field95.length && var5.field95[var6] != -1; ++var6) {
                Component var7 = Component.field73[var5.field95[var6]];
                if (var7.field80 == 1) {
                    var4 |= this.method557(1, arg1, var7.field78);
                }
                if (var7.field80 == 6 && (var7.field126 != -1 || var7.field127 != -1)) {
                    boolean var8 = this.method505(0, var7);
                    int var9;
                    if (var8) {
                        var9 = var7.field127;
                    } else {
                        var9 = var7.field126;
                    }
                    if (var9 != -1) {
                        SeqType var10 = SeqType.field1144[var9];
                        var7.field77 += arg1;
                        while (var7.field77 > var10.method382(var7.field76, -86)) {
                            var7.field77 -= var10.method382(var7.field76, -86) + 1;
                            ++var7.field76;
                            if (var7.field76 >= var10.field1145) {
                                var7.field76 -= var10.field1149;
                                if (var7.field76 < 0 || var7.field76 >= var10.field1145) {
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
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field17 != null) {
                    return new URL("http://127.0.0.1:" + (field1390 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIII)Z")
    public final boolean method558(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1569.method80(this.field1501, arg4, arg3, arg2);
        if (this.field1694 != arg1) {
            this.field1250.method219(88);
        }
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1270;
            if (field1270 > 1086) {
                field1270 = 0;
                this.field1250.method218(162, 837);
                this.field1250.method219(0);
                int var10 = this.field1250.field712;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1250.method220(16791);
                }
                this.field1250.method219(254);
                this.field1250.method220((int) (Math.random() * 65536.0D));
                this.field1250.method220(16128);
                this.field1250.method220(52610);
                this.field1250.method220((int) (Math.random() * 65536.0D));
                this.field1250.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1250.method220(35025);
                }
                this.field1250.method220(46628);
                this.field1250.method219((int) (Math.random() * 256.0D));
                this.field1250.method228(1, this.field1250.field712 - var10);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method486(2, arg4, arg3, 0, true, var8 + 1, 0, field1263.field452[0], var9, field1263.field453[0], false, 0);
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
                this.method486(2, arg4, arg3, var12, true, 0, var13, field1263.field452[0], 0, field1263.field453[0], false, var14);
            }
            this.field1490 = super.field29;
            this.field1491 = super.field30;
            this.field1493 = 2;
            this.field1492 = 0;
            this.field1250.method218(arg0, 837);
            this.field1250.method220(this.field1245 + arg4);
            this.field1250.method220(this.field1246 + arg3);
            this.field1250.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method559(byte arg0, int arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field1550 = !this.field1550;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method560(int arg0, boolean arg1) {
        if (arg0 <= 0) {
            this.field1337 = null;
        }
        for (int var3 = 0; var3 < this.field1310; ++var3) {
            NpcEntity var4 = this.field1309[this.field1311[var3]];
            int var5 = (this.field1311[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(this.field1640) && var4.field458.field1032 == arg1) {
                int var6 = var4.field402 >> 7;
                int var7 = var4.field403 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field406 == 1 && (var4.field402 & 127) == 64 && (var4.field403 & 127) == 64) {
                        if (this.field1613[var6][var7] == this.field1677) {
                            continue;
                        }
                        this.field1613[var6][var7] = this.field1677;
                    }
                    this.field1569.method61(var4.field405, this.field1501, var4.field403, (var4.field406 - 1) * 64 + 60, var5, var4, this.method510(var4.field402, var4.field403, (byte) 51, this.field1501), 1, var4.field404, var4.field402);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method561(boolean arg0, int arg1) {
        if (!arg0) {
            if (!field1392) {
                if (Pix3D.field658[17] >= arg1) {
                    Pix8 var3 = Pix3D.field652[17];
                    int var4 = var3.field684 * var3.field683 - 1;
                    int var5 = this.field1477 * var3.field683 * 2;
                    byte[] var6 = var3.field681;
                    byte[] var7 = this.field1567;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field681 = var7;
                    this.field1567 = var6;
                    Pix3D.method171(17, (byte) 86);
                }
                if (Pix3D.field658[24] >= arg1) {
                    Pix8 var9 = Pix3D.field652[24];
                    int var10 = var9.field684 * var9.field683 - 1;
                    int var11 = this.field1477 * var9.field683 * 2;
                    byte[] var12 = var9.field681;
                    byte[] var13 = this.field1567;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field681 = var13;
                    this.field1567 = var12;
                    Pix3D.method171(24, (byte) 86);
                    return;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIILab;)V")
    public final void method562(byte arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg0 != -95) {
            this.method6();
        }
        if (field1263 != arg4) {
            if (this.field1499 < 400) {
                String var6;
                if (arg4.field469 == 0) {
                    var6 = arg4.field462 + method464(field1263.field468, -370, arg4.field468) + " (level-" + arg4.field468 + ")";
                } else {
                    var6 = arg4.field462 + " (skill-" + arg4.field469 + ")";
                }
                if (this.field1405 == 1) {
                    this.field1636[this.field1499] = "Use " + this.field1409 + " with @whi@" + var6;
                    this.field1586[this.field1499] = 275;
                    this.field1587[this.field1499] = arg3;
                    this.field1584[this.field1499] = arg2;
                    this.field1585[this.field1499] = arg1;
                    ++this.field1499;
                } else if (this.field1346 == 1) {
                    if ((this.field1348 & 8) == 8) {
                        this.field1636[this.field1499] = this.field1349 + " @whi@" + var6;
                        this.field1586[this.field1499] = 131;
                        this.field1587[this.field1499] = arg3;
                        this.field1584[this.field1499] = arg2;
                        this.field1585[this.field1499] = arg1;
                        ++this.field1499;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1237[var7] != null) {
                            this.field1636[this.field1499] = this.field1237[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1237[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field468 > field1263.field468) {
                                    var9 = 2000;
                                }
                                if (field1263.field485 != 0 && arg4.field485 != 0) {
                                    if (field1263.field485 == arg4.field485) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1238[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1586[this.field1499] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1586[this.field1499] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1586[this.field1499] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1586[this.field1499] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1586[this.field1499] = var9 + 185;
                            }
                            this.field1587[this.field1499] = arg3;
                            this.field1584[this.field1499] = arg2;
                            this.field1585[this.field1499] = arg1;
                            ++this.field1499;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1499; ++var8) {
                    if (this.field1586[var8] == 718) {
                        this.field1636[var8] = "Walk here @whi@" + var6;
                        return;
                    }
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
            field1574[var1] = var0 / 4;
        }
        field1601 = -14830;
        field1616 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1673 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1673[var3] = var2 - 1;
            var2 += var2;
        }
        field1692 = true;
    }
}
