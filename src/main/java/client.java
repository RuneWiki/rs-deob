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

    @OriginalMember(owner = "client", name = "K", descriptor = "[I")
    private int[] field1224 = new int[500];

    @OriginalMember(owner = "client", name = "L", descriptor = "[I")
    private int[] field1225 = new int[500];

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field1226 = new int[500];

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field1227 = new int[500];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[J")
    private long[] field1230 = new long[200];

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1236 = -1;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1238 = new CRC32();

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1239 = 1;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[[I")
    private int[][] field1255 = new int[104][104];

    @OriginalMember(owner = "client", name = "qb", descriptor = "[Lib;")
    private Pix32[] field1256 = new Pix32[8];

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1257 = -1;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field1258 = false;

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    private boolean field1259 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1260 = 3353893;

    @OriginalMember(owner = "client", name = "vb", descriptor = "B")
    private byte field1261 = -6;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1262 = 465;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1263 = new int[50];

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private boolean field1264 = false;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "[Ljb;")
    private Pix8[] field1270 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field1271 = false;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private boolean field1280 = false;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field1282 = true;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Lvb;")
    public FileStream[] field1283 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Ljava/lang/String;")
    private String field1285 = "";

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1286 = -1;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field1287 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1296 = -1;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field1297 = false;

    @OriginalMember(owner = "client", name = "ic", descriptor = "[I")
    private int[] field1300 = new int[5];

    @OriginalMember(owner = "client", name = "lc", descriptor = "B")
    private byte field1303 = 1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1311 = 1;

    @OriginalMember(owner = "client", name = "uc", descriptor = "B")
    private byte field1312 = 106;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1315 = 2048;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1316 = 2047;

    @OriginalMember(owner = "client", name = "zc", descriptor = "[Lab;")
    private PlayerEntity[] field1317 = new PlayerEntity[this.field1315];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[I")
    public int[] field1319 = new int[this.field1315];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[I")
    private int[] field1321 = new int[this.field1315];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[Llb;")
    private Packet[] field1322 = new Packet[this.field1315];

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1323 = -1;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Ljava/lang/String;")
    private String field1325 = "";

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[[I")
    private int[][] field1326 = new int[104][104];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1329 = -1;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1333 = 2;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Z")
    private boolean field1339 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1341 = 637;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1350 = 2;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1353 = 1;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1354 = -1;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1355 = new int[200];

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field1358 = new int[50];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[Z")
    private boolean[] field1359 = new boolean[5];

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field1360 = new int[50];

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1363 = 77;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Z")
    private boolean field1365 = false;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1381 = 3;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[Ljc;")
    private CollisionMap[] field1382 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Od", descriptor = "Z")
    private boolean field1384 = false;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    public int[] field1388 = new int[1000];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field1390 = false;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Lob;")
    private LinkList field1391 = new LinkList(-16188);

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Ljava/lang/String;")
    private String field1392 = "";

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1394 = -635;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field1395 = new int[7];

    @OriginalMember(owner = "client", name = "me", descriptor = "[I")
    private int[] field1408 = new int[5];

    @OriginalMember(owner = "client", name = "ne", descriptor = "Lob;")
    private LinkList field1409 = new LinkList(-16188);

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    public int[] field1416 = new int[2000];

    @OriginalMember(owner = "client", name = "ve", descriptor = "B")
    private byte field1417 = 4;

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1421 = 3109;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1422 = 455;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[B")
    private byte[] field1426 = new byte[16384];

    @OriginalMember(owner = "client", name = "Le", descriptor = "[Ljava/lang/String;")
    private String[] field1433 = new String[500];

    @OriginalMember(owner = "client", name = "Me", descriptor = "Llb;")
    private Packet field1434 = Packet.method217(1, 144);

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[I")
    private int[] field1436 = new int[5];

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private boolean field1440 = false;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1445 = -798;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1446 = 5063219;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ld;")
    private Component field1459 = new Component();

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field1460 = new int[151];

    @OriginalMember(owner = "client", name = "of", descriptor = "[Ljava/lang/String;")
    private String[] field1461 = new String[200];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field1462 = new int[5];

    @OriginalMember(owner = "client", name = "rf", descriptor = "Z")
    private boolean field1464 = true;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1467 = 2;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ljava/lang/String;")
    private String field1470 = "";

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljava/lang/String;")
    private String field1471 = "";

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1472 = -1;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Ljava/lang/String;")
    private String field1474 = "";

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Ljava/lang/String;")
    private String field1475 = "";

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1480 = -1;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Z")
    private boolean field1482 = false;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private boolean field1483 = true;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1484 = new int[2000];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[J")
    private long[] field1486 = new long[100];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1488 = 2301979;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field1490 = false;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    private int[] field1491 = new int[151];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[[I")
    private int[][] field1492 = new int[104][104];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1495 = -1;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1497 = new int[5];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private boolean field1498 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[Lib;")
    private Pix32[] field1499 = new Pix32[20];

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field1501 = new int[256];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field1505 = new int[100];

    @OriginalMember(owner = "client", name = "hg", descriptor = "[Ljava/lang/String;")
    private String[] field1506 = new String[100];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[Ljava/lang/String;")
    private String[] field1507 = new String[100];

    @OriginalMember(owner = "client", name = "mg", descriptor = "[Ljb;")
    private Pix8[] field1511 = new Pix8[100];

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private int[] field1512 = new int[Stats.field1160];

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1517 = -1;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1518 = 722;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field1520 = new int[1000];

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field1521 = new int[1000];

    @OriginalMember(owner = "client", name = "yg", descriptor = "Z")
    private boolean field1523 = false;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private final int field1524 = 100;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[I")
    private int[] field1525 = new int[100];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field1527 = new int[33];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Z")
    private boolean field1531 = false;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[[[Lob;")
    private LinkList[][][] field1532 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1533 = 650;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1536 = 50;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field1537 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1538 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1539 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[I")
    private int[] field1540 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field1541 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[I")
    private int[] field1542 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field1543 = new int[this.field1536];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[Ljava/lang/String;")
    private String[] field1544 = new String[this.field1536];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field1545 = new int[33];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field1553 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "dh", descriptor = "[Lib;")
    private Pix32[] field1554 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1559 = false;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Z")
    private boolean field1560 = true;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private boolean field1561 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1562 = -1;

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field1566 = new int[9];

    @OriginalMember(owner = "client", name = "qh", descriptor = "B")
    private byte field1567 = 9;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[Ljava/lang/String;")
    private String[] field1568 = new String[5];

    @OriginalMember(owner = "client", name = "sh", descriptor = "[Z")
    private boolean[] field1569 = new boolean[5];

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private final int[] field1570 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "vh", descriptor = "Ljava/lang/String;")
    private String field1572 = "";

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Z")
    private boolean field1582 = false;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field1595 = new int[Stats.field1160];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    private boolean field1597 = false;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1598 = 78;

    @OriginalMember(owner = "client", name = "bi", descriptor = "Z")
    private boolean field1604 = false;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[I")
    private int[] field1605 = new int[Stats.field1160];

    @OriginalMember(owner = "client", name = "li", descriptor = "Llb;")
    private Packet field1614 = Packet.method217(1, 144);

    @OriginalMember(owner = "client", name = "qi", descriptor = "Z")
    public boolean field1619 = false;

    @OriginalMember(owner = "client", name = "si", descriptor = "Lob;")
    private LinkList field1621 = new LinkList(-16188);

    @OriginalMember(owner = "client", name = "ti", descriptor = "[Lib;")
    private Pix32[] field1622 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ui", descriptor = "B")
    private byte field1623 = 4;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Z")
    private boolean field1627 = true;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Z")
    private boolean field1628 = true;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Ljava/lang/String;")
    private String field1629 = "";

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Llb;")
    private Packet field1631 = Packet.method217(1, 144);

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1635 = -1;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1636 = -1;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1640 = 128;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    public boolean field1644 = true;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1645 = 7759444;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[Lz;")
    private NpcEntity[] field1646 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    public int[] field1648 = new int[16384];

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field1660 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[Ljb;")
    private Pix8[] field1661 = new Pix8[2];

    @OriginalMember(owner = "client", name = "ij", descriptor = "Z")
    private boolean field1663 = false;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[Lib;")
    private Pix32[] field1664 = new Pix32[100];

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field1672 = 4;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1673 = new int[4000];

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1674 = new int[4000];

    @OriginalMember(owner = "client", name = "J", descriptor = "[[I")
    public static final int[][] field1223 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private static boolean field1302 = true;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1380 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private static boolean field1407 = true;

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    public static int[] field1425 = new int[32];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private static int field1427;

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private static boolean field1429;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private static int[] field1431;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    public static final int[] field1509;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private static int field1613;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1617;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljava/lang/String;")
    private static String field1637;

    @OriginalMember(owner = "client", name = "hj", descriptor = "B")
    private static byte field1662;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private static int field1228;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private static int field1231;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private static int field1240;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private static int field1279;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private static int field1340;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private static int field1348;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private static int field1419;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private static int field1448;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private static int field1456;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private static int field1473;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private static int field1487;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private static int field1555;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private static int field1616;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field1624;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private static int field1630;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field1649;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private static int field1650;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client", name = "cc", descriptor = "J")
    private long field1294;

    @OriginalMember(owner = "client", name = "ie", descriptor = "J")
    private long field1404;

    @OriginalMember(owner = "client", name = "hf", descriptor = "J")
    private long field1455;

    @OriginalMember(owner = "client", name = "kf", descriptor = "J")
    private long field1457;

    @OriginalMember(owner = "client", name = "eg", descriptor = "J")
    public long field1503;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Le;")
    private ClientStream field1615;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Lwb;")
    private Isaac field1293;

    @OriginalMember(owner = "client", name = "X", descriptor = "Lxb;")
    private Jagfile field1237;

    @OriginalMember(owner = "client", name = "jg", descriptor = "Lfc;")
    public MouseTracking field1508;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Lub;")
    private OnDemand field1383;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Lib;")
    private Pix32 field1249;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Lib;")
    private Pix32 field1265;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Lib;")
    private Pix32 field1266;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Lib;")
    private Pix32 field1267;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Lib;")
    private Pix32 field1268;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Lib;")
    private Pix32 field1327;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Lib;")
    private Pix32 field1328;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lib;")
    private Pix32 field1330;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lib;")
    private Pix32 field1477;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lib;")
    private Pix32 field1478;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Lib;")
    private Pix32 field1500;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Lib;")
    private Pix32 field1549;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lib;")
    private Pix32 field1550;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Ljb;")
    private Pix8 field1366;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Ljb;")
    private Pix8 field1367;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Ljb;")
    private Pix8 field1368;

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljb;")
    private Pix8 field1451;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Ljb;")
    private Pix8 field1452;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Ljb;")
    private Pix8 field1453;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Ljb;")
    private Pix8 field1551;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Ljb;")
    private Pix8 field1552;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Ljb;")
    private Pix8 field1590;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Ljb;")
    private Pix8 field1591;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Ljb;")
    private Pix8 field1592;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Ljb;")
    private Pix8 field1593;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Ljb;")
    private Pix8 field1594;

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljb;")
    private Pix8 field1606;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Ljb;")
    private Pix8 field1607;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Ljb;")
    private Pix8 field1665;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Ljb;")
    private Pix8 field1666;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Ljb;")
    private Pix8 field1667;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Ljb;")
    private Pix8 field1668;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Ljb;")
    private Pix8 field1669;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Lkb;")
    private PixFont field1396;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lkb;")
    private PixFont field1397;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Lkb;")
    private PixFont field1398;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lkb;")
    private PixFont field1399;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Lqb;")
    private PixMap field1335;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Lqb;")
    private PixMap field1336;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Lqb;")
    private PixMap field1337;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Lqb;")
    private PixMap field1338;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Lqb;")
    private PixMap field1371;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Lqb;")
    private PixMap field1372;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Lqb;")
    private PixMap field1373;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Lqb;")
    private PixMap field1374;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Lqb;")
    private PixMap field1375;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lqb;")
    private PixMap field1376;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lqb;")
    private PixMap field1377;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lqb;")
    private PixMap field1378;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Lqb;")
    private PixMap field1379;

    @OriginalMember(owner = "client", name = "Di", descriptor = "Lqb;")
    private PixMap field1632;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Lqb;")
    private PixMap field1633;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "Lqb;")
    private PixMap field1634;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Lqb;")
    private PixMap field1651;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Lqb;")
    private PixMap field1652;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Lqb;")
    private PixMap field1653;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Lqb;")
    private PixMap field1654;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Lqb;")
    private PixMap field1655;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Lqb;")
    private PixMap field1656;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Lqb;")
    private PixMap field1657;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lqb;")
    private PixMap field1658;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lqb;")
    private PixMap field1659;

    @OriginalMember(owner = "client", name = "V", descriptor = "Lab;")
    public static PlayerEntity field1235;

    @OriginalMember(owner = "client", name = "md", descriptor = "Lr;")
    private World3D field1356;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Ljava/lang/String;")
    private String field1298;

    @OriginalMember(owner = "client", name = "se", descriptor = "Ljava/lang/String;")
    public String field1414;

    @OriginalMember(owner = "client", name = "We", descriptor = "Ljava/lang/String;")
    public String field1444;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Ljava/lang/String;")
    private String field1625;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Ljava/net/Socket;")
    private Socket field1528;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private static boolean field1273;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private static boolean field1342;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    public static boolean field1361;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    public static boolean field1424;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private static boolean field1430;

    @OriginalMember(owner = "client", name = "uj", descriptor = "Z")
    public static boolean field1675;

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field1233;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field1234;

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1243;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1244;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1245;

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1246;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field1385;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1386;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1563;

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field1564;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    private int[] field1565;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field1583;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field1584;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[Ljb;")
    private Pix8[] field1437;

    @OriginalMember(owner = "client", name = "bb", descriptor = "[[B")
    private byte[][] field1241;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[[B")
    private byte[][] field1324;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[[[B")
    private byte[][][] field1489;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[[[I")
    private int[][][] field1626;

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method429(int arg0) {
        if (arg0 != 0) {
            this.field1532 = null;
        }
        for (int var2 = -1; var2 < this.field1318; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1316;
            } else {
                var3 = this.field1319[var2];
            }
            PlayerEntity var4 = this.field1317[var3];
            if (var4 != null) {
                this.method530(0, var4, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (arg6 == 0) {
            if (var8 != 0) {
                int var13 = Model.field600[var8];
                int var14 = Model.field601[var8];
                int var15 = var11 * var14 - arg2 * var13 >> 16;
                var12 = var11 * var13 + arg2 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field600[var9];
                int var17 = Model.field601[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1608 = arg0 - var10;
            this.field1609 = arg4 - var11;
            this.field1610 = arg3 - var12;
            this.field1611 = arg5;
            this.field1612 = arg1;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Z")
    public final boolean method431(int arg0) {
        if (arg0 != 0) {
            this.field1672 = 57;
        }
        if (this.field1615 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1615.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1289 == -1) {
                    this.field1615.method41(this.field1631.field712, 0, 1);
                    this.field1289 = this.field1631.field712[0] & 255;
                    if (this.field1293 != null) {
                        this.field1289 = this.field1289 - this.field1293.method295() & 255;
                    }
                    this.field1288 = Protocol.field1093[this.field1289];
                    --var2;
                }
                if (this.field1288 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1615.method41(this.field1631.field712, 0, 1);
                    this.field1288 = this.field1631.field712[0] & 255;
                    --var2;
                }
                if (this.field1288 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1615.method41(this.field1631.field712, 0, 2);
                    this.field1631.field713 = 0;
                    this.field1288 = this.field1631.method231();
                    var2 -= 2;
                }
                if (var2 < this.field1288) {
                    return false;
                }
                this.field1631.field713 = 0;
                this.field1615.method41(this.field1631.field712, 0, this.field1288);
                this.field1290 = 0;
                this.field1548 = this.field1547;
                this.field1547 = this.field1546;
                this.field1546 = this.field1289;
                if (this.field1289 == 236) {
                    int var3 = this.field1631.method231();
                    this.method537(var3, false);
                    if (this.field1329 != -1) {
                        this.field1329 = -1;
                        this.field1440 = true;
                        this.field1498 = true;
                    }
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1604 = true;
                    }
                    if (this.field1490) {
                        this.field1490 = false;
                        this.field1604 = true;
                    }
                    this.field1495 = var3;
                    this.field1663 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 92) {
                    int var4 = this.field1631.method229();
                    int var5 = this.field1631.method229();
                    int var6 = this.field1631.method229();
                    int var7 = this.field1631.method229();
                    this.field1359[var4] = true;
                    this.field1462[var4] = var5;
                    this.field1497[var4] = var6;
                    this.field1408[var4] = var7;
                    this.field1300[var4] = 0;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 213) {
                    int var8 = this.field1631.method231();
                    byte var9 = this.field1631.method230();
                    this.field1484[var8] = var9;
                    if (this.field1416[var8] != var9) {
                        this.field1416[var8] = var9;
                        this.method474(var8, true);
                        this.field1440 = true;
                        if (this.field1472 != -1) {
                            this.field1604 = true;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 131) {
                    this.field1269 = this.field1631.method229();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 81) {
                    int var10 = this.field1631.method231();
                    int var11 = this.field1631.method231();
                    int var12 = this.field1631.method231();
                    int var13 = this.field1631.method231();
                    Component.field67[var10].field123 = var11;
                    Component.field67[var10].field124 = var12;
                    Component.field67[var10].field122 = var13;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 170) {
                    int var14 = this.field1631.method231();
                    int var15 = this.field1631.method231();
                    if (this.field1369 == var14 && this.field1370 == var15 && this.field1393 == 2) {
                        this.field1289 = -1;
                        return true;
                    }
                    this.field1369 = var14;
                    this.field1370 = var15;
                    this.field1573 = (this.field1369 - 6) * 8;
                    this.field1574 = (this.field1370 - 6) * 8;
                    this.field1447 = false;
                    if ((this.field1369 / 8 == 48 || this.field1369 / 8 == 49) && this.field1370 / 8 == 48) {
                        this.field1447 = true;
                    }
                    if (this.field1369 / 8 == 48 && this.field1370 / 8 == 148) {
                        this.field1447 = true;
                    }
                    this.field1393 = 1;
                    this.field1455 = System.currentTimeMillis();
                    this.field1337.method258(this.field1239);
                    this.field1397.method202("Loading - please wait.", 151, 0, (byte) 0, 257);
                    this.field1397.method202("Loading - please wait.", 150, 16777215, (byte) 0, 256);
                    this.field1337.method259(4, super.field12, -38524, 4);
                    int var16 = 0;
                    for (int var17 = (this.field1369 - 6) / 8; var17 <= (this.field1369 + 6) / 8; ++var17) {
                        for (int var18 = (this.field1370 - 6) / 8; var18 <= (this.field1370 + 6) / 8; ++var18) {
                            ++var16;
                        }
                    }
                    this.field1324 = new byte[var16][];
                    this.field1241 = new byte[var16][];
                    this.field1232 = new int[var16];
                    this.field1233 = new int[var16];
                    this.field1234 = new int[var16];
                    int var19 = 0;
                    for (int var20 = (this.field1369 - 6) / 8; var20 <= (this.field1369 + 6) / 8; ++var20) {
                        for (int var21 = (this.field1370 - 6) / 8; var21 <= (this.field1370 + 6) / 8; ++var21) {
                            this.field1232[var19] = (var20 << 8) + var21;
                            if (!this.field1447 || var21 != 49 && var21 != 149 && var21 != 147 && var20 != 50 && (var20 != 49 || var21 != 47)) {
                                int var22 = this.field1233[var19] = this.field1383.method274(0, false, var21, var20);
                                if (var22 != -1) {
                                    this.field1383.method279(3, var22);
                                }
                                int var23 = this.field1234[var19] = this.field1383.method274(1, false, var21, var20);
                                if (var23 != -1) {
                                    this.field1383.method279(3, var23);
                                }
                                ++var19;
                            } else {
                                this.field1233[var19] = -1;
                                this.field1234[var19] = -1;
                                ++var19;
                            }
                        }
                    }
                    int var24 = this.field1573 - this.field1575;
                    int var25 = this.field1574 - this.field1576;
                    this.field1575 = this.field1573;
                    this.field1576 = this.field1574;
                    for (int var26 = 0; var26 < 16384; ++var26) {
                        NpcEntity var27 = this.field1646[var26];
                        if (var27 != null) {
                            for (int var28 = 0; var28 < 10; ++var28) {
                                var27.field444[var28] -= var24;
                                var27.field445[var28] -= var25;
                            }
                            var27.field394 -= var24 * 128;
                            var27.field395 -= var25 * 128;
                        }
                    }
                    for (int var29 = 0; var29 < this.field1315; ++var29) {
                        PlayerEntity var30 = this.field1317[var29];
                        if (var30 != null) {
                            for (int var31 = 0; var31 < 10; ++var31) {
                                var30.field444[var31] -= var24;
                                var30.field445[var31] -= var25;
                            }
                            var30.field394 -= var24 * 128;
                            var30.field395 -= var25 * 128;
                        }
                    }
                    this.field1384 = true;
                    byte var32 = 0;
                    byte var33 = 104;
                    byte var34 = 1;
                    if (var24 < 0) {
                        var32 = 103;
                        var33 = -1;
                        var34 = -1;
                    }
                    byte var35 = 0;
                    byte var36 = 104;
                    byte var37 = 1;
                    if (var25 < 0) {
                        var35 = 103;
                        var36 = -1;
                        var37 = -1;
                    }
                    for (int var38 = var32; var33 != var38; var38 += var34) {
                        for (int var39 = var35; var36 != var39; var39 += var37) {
                            int var40 = var24 + var38;
                            int var41 = var25 + var39;
                            for (int var42 = 0; var42 < 4; ++var42) {
                                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                                    this.field1532[var42][var38][var39] = this.field1532[var42][var40][var41];
                                } else {
                                    this.field1532[var42][var38][var39] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var43 = (LocSpawned) this.field1391.method248(); var43 != null; var43 = (LocSpawned) this.field1391.method250(8)) {
                        var43.field733 -= var24;
                        var43.field734 -= var25;
                        if (var43.field733 < 0 || var43.field734 < 0 || var43.field733 >= 104 || var43.field734 >= 104) {
                            var43.method106();
                        }
                    }
                    if (this.field1247 != 0) {
                        this.field1247 -= var24;
                        this.field1248 -= var25;
                    }
                    this.field1258 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 214) {
                    int var44 = this.field1631.method231();
                    int var45 = this.field1631.method231();
                    int var46 = var45 >> 10 & 31;
                    int var47 = var45 >> 5 & 31;
                    int var48 = var45 & 31;
                    Component.field67[var44].field110 = (var48 << 3) + (var46 << 19) + (var47 << 11);
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 206) {
                    this.field1301 = this.field1631.method229();
                    this.field1357 = this.field1631.method229();
                    this.field1222 = this.field1631.method229();
                    this.field1259 = true;
                    this.field1604 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 51) {
                    int var49 = this.field1631.method231();
                    boolean var50 = this.field1631.method229() == 1;
                    Component.field67[var49].field88 = var50;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 83) {
                    this.field1247 = 0;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 45) {
                    int var51 = this.field1631.method231();
                    int var52 = this.field1631.method229();
                    int var53 = this.field1631.method231();
                    if (this.field1628 && !field1430 && this.field1420 < 50) {
                        this.field1360[this.field1420] = var51;
                        this.field1263[this.field1420] = var52;
                        this.field1358[this.field1420] = Wave.field919[var51] + var53;
                        ++this.field1420;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 151) {
                    this.field1440 = true;
                    int var54 = this.field1631.method229();
                    int var55 = this.field1631.method234();
                    int var56 = this.field1631.method229();
                    this.field1512[var54] = var55;
                    this.field1595[var54] = var56;
                    this.field1605[var54] = 1;
                    for (int var57 = 0; var57 < 98; ++var57) {
                        if (var55 >= field1431[var57]) {
                            this.field1605[var54] = var57 + 2;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 222 || this.field1289 == 253 || this.field1289 == 191 || this.field1289 == 137 || this.field1289 == 193 || this.field1289 == 30 || this.field1289 == 53 || this.field1289 == 147 || this.field1289 == 2 || this.field1289 == 211 || this.field1289 == 136) {
                    this.method546(this.field1631, -978, this.field1289);
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 98) {
                    int var58 = this.field1631.method229();
                    int var59 = this.field1631.method229();
                    String var60 = this.field1631.method236();
                    if (var58 >= 1 && var58 <= 5) {
                        if (var60.equalsIgnoreCase("null")) {
                            var60 = null;
                        }
                        this.field1568[var58 - 1] = var60;
                        this.field1569[var58 - 1] = var59 == 0;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 44) {
                    this.field1449 = this.field1631.method229();
                    this.field1450 = this.field1631.method229();
                    for (int var61 = this.field1449; var61 < this.field1449 + 8; ++var61) {
                        for (int var62 = this.field1450; var62 < this.field1450 + 8; ++var62) {
                            if (this.field1532[this.field1299][var61][var62] != null) {
                                this.field1532[this.field1299][var61][var62] = null;
                                this.method476(var61, var62);
                            }
                        }
                    }
                    for (LocSpawned var63 = (LocSpawned) this.field1391.method248(); var63 != null; var63 = (LocSpawned) this.field1391.method250(8)) {
                        if (var63.field733 >= this.field1449 && var63.field733 < this.field1449 + 8 && var63.field734 >= this.field1450 && var63.field734 < this.field1450 + 8 && this.field1299 == var63.field731) {
                            var63.field742 = 0;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 181) {
                    this.field1323 = this.field1631.method229();
                    if (this.field1381 == this.field1323) {
                        if (this.field1323 == 3) {
                            this.field1381 = 1;
                        } else {
                            this.field1381 = 3;
                        }
                        this.field1440 = true;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 237) {
                    int var64 = this.field1631.method231();
                    this.method537(var64, false);
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1604 = true;
                    }
                    if (this.field1490) {
                        this.field1490 = false;
                        this.field1604 = true;
                    }
                    this.field1329 = var64;
                    this.field1440 = true;
                    this.field1498 = true;
                    this.field1495 = -1;
                    this.field1663 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 186) {
                    int var65 = this.field1631.method231();
                    int var66 = this.field1631.method232();
                    Component var67 = Component.field67[var65];
                    var67.field120 = var66;
                    if (var66 == -1) {
                        var67.field70 = 0;
                        var67.field71 = 0;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 27) {
                    if (this.field1381 == 12) {
                        this.field1440 = true;
                    }
                    this.field1362 = this.field1631.method229();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 141) {
                    int var68 = this.field1631.method231();
                    int var69 = this.field1631.method229();
                    if (var68 == 65535) {
                        var68 = -1;
                    }
                    this.field1553[var69] = var68;
                    this.field1440 = true;
                    this.field1498 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 228) {
                    this.field1402 = this.field1631.method231() * 30;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 185) {
                    int var70 = this.field1631.method231();
                    int var71 = this.field1631.method231();
                    Component.field67[var70].field116 = 1;
                    Component.field67[var70].field117 = var71;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 149) {
                    long var72 = this.field1631.method235((byte) 5);
                    int var74 = this.field1631.method229();
                    String var75 = JString.method304((byte) 78, JString.method301(var72, (byte) -48));
                    for (int var76 = 0; var76 < this.field1557; ++var76) {
                        if (this.field1230[var76] == var72) {
                            if (this.field1355[var76] != var74) {
                                this.field1355[var76] = var74;
                                this.field1440 = true;
                                if (var74 > 0) {
                                    this.method553(var75 + " has logged in.", 5, false, "");
                                }
                                if (var74 == 0) {
                                    this.method553(var75 + " has logged out.", 5, false, "");
                                }
                            }
                            var75 = null;
                            break;
                        }
                    }
                    if (var75 != null && this.field1557 < 200) {
                        this.field1230[this.field1557] = var72;
                        this.field1461[this.field1557] = var75;
                        this.field1355[this.field1557] = var74;
                        ++this.field1557;
                        this.field1440 = true;
                    }
                    boolean var77 = false;
                    while (!var77) {
                        var77 = true;
                        for (int var78 = 0; var78 < this.field1557 - 1; ++var78) {
                            if (this.field1355[var78] != field1427 && this.field1355[var78 + 1] == field1427 || this.field1355[var78] == 0 && this.field1355[var78 + 1] != 0) {
                                int var79 = this.field1355[var78];
                                this.field1355[var78] = this.field1355[var78 + 1];
                                this.field1355[var78 + 1] = var79;
                                String var80 = this.field1461[var78];
                                this.field1461[var78] = this.field1461[var78 + 1];
                                this.field1461[var78 + 1] = var80;
                                long var81 = this.field1230[var78];
                                this.field1230[var78] = this.field1230[var78 + 1];
                                this.field1230[var78 + 1] = var81;
                                this.field1440 = true;
                                var77 = false;
                            }
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 55) {
                    this.field1415 = this.field1631.method229();
                    if (this.field1415 == 1) {
                        this.field1331 = this.field1631.method231();
                    }
                    if (this.field1415 >= 2 && this.field1415 <= 6) {
                        if (this.field1415 == 2) {
                            this.field1253 = 64;
                            this.field1254 = 64;
                        }
                        if (this.field1415 == 3) {
                            this.field1253 = 0;
                            this.field1254 = 64;
                        }
                        if (this.field1415 == 4) {
                            this.field1253 = 128;
                            this.field1254 = 64;
                        }
                        if (this.field1415 == 5) {
                            this.field1253 = 64;
                            this.field1254 = 0;
                        }
                        if (this.field1415 == 6) {
                            this.field1253 = 64;
                            this.field1254 = 128;
                        }
                        this.field1415 = 2;
                        this.field1250 = this.field1631.method231();
                        this.field1251 = this.field1631.method231();
                        this.field1252 = this.field1631.method229();
                    }
                    if (this.field1415 == 10) {
                        this.field1454 = this.field1631.method231();
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 138) {
                    this.field1258 = false;
                    for (int var83 = 0; var83 < 5; ++var83) {
                        this.field1359[var83] = false;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 241) {
                    this.field1258 = true;
                    this.field1585 = this.field1631.method229();
                    this.field1586 = this.field1631.method229();
                    this.field1587 = this.field1631.method231();
                    this.field1588 = this.field1631.method229();
                    this.field1589 = this.field1631.method229();
                    if (this.field1589 >= 100) {
                        int var84 = this.field1585 * 128 + 64;
                        int var85 = this.field1586 * 128 + 64;
                        int var86 = this.method551(this.field1299, true, var85, var84) - this.field1587;
                        int var87 = var84 - this.field1608;
                        int var88 = var86 - this.field1609;
                        int var89 = var85 - this.field1610;
                        int var90 = (int) Math.sqrt((double) (var87 * var87 + var89 * var89));
                        this.field1611 = (int) (Math.atan2((double) var88, (double) var90) * 325.949D) & 2047;
                        this.field1612 = (int) (Math.atan2((double) var87, (double) var89) * -325.949D) & 2047;
                        if (this.field1611 < 128) {
                            this.field1611 = 128;
                        }
                        if (this.field1611 > 383) {
                            this.field1611 = 383;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 224) {
                    long var91 = this.field1631.method235((byte) 5);
                    int var93 = this.field1631.method234();
                    int var94 = this.field1631.method229();
                    boolean var95 = false;
                    for (int var96 = 0; var96 < 100; ++var96) {
                        if (this.field1525[var96] == var93) {
                            var95 = true;
                            break;
                        }
                    }
                    if (var94 <= 1) {
                        for (int var97 = 0; var97 < this.field1423; ++var97) {
                            if (this.field1486[var97] == var91) {
                                var95 = true;
                                break;
                            }
                        }
                    }
                    if (!var95 && this.field1403 == 0) {
                        try {
                            this.field1525[this.field1465] = var93;
                            this.field1465 = (this.field1465 + 1) % 100;
                            String var98 = WordPack.method306(this.field1288 - 13, this.field1432, this.field1631);
                            String var99 = WordFilter.method401(9384, var98);
                            if (var94 != 2 && var94 != 3) {
                                if (var94 == 1) {
                                    this.method553(var99, 7, false, "@cr1@" + JString.method304((byte) 78, JString.method301(var91, (byte) -48)));
                                } else {
                                    this.method553(var99, 3, false, JString.method304((byte) 78, JString.method301(var91, (byte) -48)));
                                }
                            } else {
                                this.method553(var99, 7, false, "@cr2@" + JString.method304((byte) 78, JString.method301(var91, (byte) -48)));
                            }
                        } catch (Exception var168) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 119) {
                    this.field1534 = this.field1631.method234();
                    this.field1522 = this.field1631.method231();
                    this.field1242 = this.field1631.method229();
                    this.field1405 = this.field1631.method231();
                    this.field1458 = this.field1631.method229();
                    if (this.field1534 != 0 && this.field1495 == -1) {
                        signlink.dnslookup(JString.method303(this.field1534, false));
                        this.method461(-453);
                        short var101 = 650;
                        if (this.field1242 != 201 || this.field1458 == 1) {
                            var101 = 655;
                        }
                        this.field1392 = "";
                        this.field1476 = false;
                        for (int var102 = 0; var102 < Component.field67.length; ++var102) {
                            if (Component.field67[var102] != null && Component.field67[var102].field76 == var101) {
                                this.field1495 = Component.field67[var102].field73;
                                break;
                            }
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 19) {
                    this.field1272 = this.field1631.method229();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 94) {
                    int var103 = this.field1631.method231();
                    Component.field67[var103].field116 = 3;
                    if (field1235.field478 == null) {
                        Component.field67[var103].field117 = (field1235.field460[11] << 5) + (field1235.field460[8] << 10) + (field1235.field460[0] << 15) + (field1235.field461[0] << 25) + (field1235.field461[4] << 20) + field1235.field460[1];
                    } else {
                        Component.field67[var103].field117 = (int) (field1235.field478.field1011 + 305419896L);
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 245) {
                    int var104 = this.field1631.method231();
                    int var105 = this.field1631.method231();
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1604 = true;
                    }
                    if (this.field1490) {
                        this.field1490 = false;
                        this.field1604 = true;
                    }
                    this.field1495 = var104;
                    this.field1329 = var105;
                    this.field1440 = true;
                    this.field1498 = true;
                    this.field1663 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 156) {
                    if (this.field1381 == 12) {
                        this.field1440 = true;
                    }
                    this.field1468 = this.field1631.method232();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 13) {
                    this.field1440 = true;
                    int var106 = this.field1631.method231();
                    Component var107 = Component.field67[var106];
                    while (this.field1631.field713 < this.field1288) {
                        int var108 = this.field1631.method243();
                        int var109 = this.field1631.method231();
                        int var110 = this.field1631.method229();
                        if (var110 == 255) {
                            var110 = this.field1631.method234();
                        }
                        if (var108 >= 0 && var108 < var107.field68.length) {
                            var107.field68[var108] = var109;
                            var107.field69[var108] = var110;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 75) {
                    this.method562(false);
                    this.field1289 = -1;
                    return false;
                }
                if (this.field1289 == 118) {
                    this.field1558 = this.field1631.method229();
                    this.field1440 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 226) {
                    for (int var111 = 0; var111 < this.field1416.length; ++var111) {
                        if (this.field1484[var111] != this.field1416[var111]) {
                            this.field1416[var111] = this.field1484[var111];
                            this.method474(var111, true);
                            this.field1440 = true;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 115) {
                    this.field1258 = true;
                    this.field1274 = this.field1631.method229();
                    this.field1275 = this.field1631.method229();
                    this.field1276 = this.field1631.method231();
                    this.field1277 = this.field1631.method229();
                    this.field1278 = this.field1631.method229();
                    if (this.field1278 >= 100) {
                        this.field1608 = this.field1274 * 128 + 64;
                        this.field1610 = this.field1275 * 128 + 64;
                        this.field1609 = this.method551(this.field1299, true, this.field1610, this.field1608) - this.field1276;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 169) {
                    int var112 = this.field1631.method231();
                    String var113 = this.field1631.method236();
                    Component.field67[var112].field108 = var113;
                    if (this.field1553[this.field1381] == Component.field67[var112].field73) {
                        this.field1440 = true;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 145) {
                    int var114 = this.field1631.method231();
                    int var115 = this.field1631.method234();
                    this.field1484[var114] = var115;
                    if (this.field1416[var114] != var115) {
                        this.field1416[var114] = var115;
                        this.method474(var114, true);
                        this.field1440 = true;
                        if (this.field1472 != -1) {
                            this.field1604 = true;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 7) {
                    int var116 = this.field1631.method231();
                    int var117 = this.field1631.method231();
                    Component.field67[var116].field116 = 2;
                    Component.field67[var116].field117 = var117;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 238) {
                    String var118 = this.field1631.method236();
                    if (var118.endsWith(":tradereq:")) {
                        String var119 = var118.substring(0, var118.indexOf(":"));
                        long var120 = JString.method300(var119);
                        boolean var122 = false;
                        for (int var123 = 0; var123 < this.field1423; ++var123) {
                            if (this.field1486[var123] == var120) {
                                var122 = true;
                                break;
                            }
                        }
                        if (!var122 && this.field1403 == 0) {
                            this.method553("wishes to trade with you.", 4, false, var119);
                        }
                    } else if (var118.endsWith(":duelreq:")) {
                        String var124 = var118.substring(0, var118.indexOf(":"));
                        long var125 = JString.method300(var124);
                        boolean var127 = false;
                        for (int var128 = 0; var128 < this.field1423; ++var128) {
                            if (this.field1486[var128] == var125) {
                                var127 = true;
                                break;
                            }
                        }
                        if (!var127 && this.field1403 == 0) {
                            this.method553("wishes to duel with you.", 8, false, var124);
                        }
                    } else if (!var118.endsWith(":chalreq:")) {
                        this.method553(var118, 0, false, "");
                    } else {
                        String var129 = var118.substring(0, var118.indexOf(":"));
                        long var130 = JString.method300(var129);
                        boolean var132 = false;
                        for (int var133 = 0; var133 < this.field1423; ++var133) {
                            if (this.field1486[var133] == var130) {
                                var132 = true;
                                break;
                            }
                        }
                        if (!var132 && this.field1403 == 0) {
                            String var134 = var118.substring(var118.indexOf(":") + 1, var118.length() - 9);
                            this.method553(var134, 8, false, var129);
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 9) {
                    int var135 = this.field1631.method232();
                    this.field1472 = var135;
                    this.field1604 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 153) {
                    int var136 = this.field1631.method231();
                    int var137 = this.field1631.method231();
                    int var138 = this.field1631.method231();
                    if (var137 == 65535) {
                        Component.field67[var136].field116 = 0;
                        this.field1289 = -1;
                        return true;
                    }
                    ObjType var139 = ObjType.method348(var137);
                    Component.field67[var136].field116 = 4;
                    Component.field67[var136].field117 = var137;
                    Component.field67[var136].field123 = var139.field1057;
                    Component.field67[var136].field124 = var139.field1058;
                    Component.field67[var136].field122 = var139.field1056 * 100 / var138;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 22) {
                    this.field1449 = this.field1631.method229();
                    this.field1450 = this.field1631.method229();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 196) {
                    this.method434(0, this.field1288, this.field1631);
                    this.field1384 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 62) {
                    this.field1418 = false;
                    this.field1490 = true;
                    this.field1325 = "";
                    this.field1604 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 33) {
                    this.field1257 = this.field1631.method231();
                    this.field1504 = this.field1631.method229();
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 108) {
                    this.field1449 = this.field1631.method229();
                    this.field1450 = this.field1631.method229();
                    while (this.field1631.field713 < this.field1288) {
                        int var140 = this.field1631.method229();
                        this.method546(this.field1631, -978, var140);
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 188) {
                    this.field1440 = true;
                    int var141 = this.field1631.method231();
                    Component var142 = Component.field67[var141];
                    int var143 = this.field1631.method231();
                    for (int var144 = 0; var144 < var143; ++var144) {
                        var142.field68[var144] = this.field1631.method231();
                        int var145 = this.field1631.method229();
                        if (var145 == 255) {
                            var145 = this.field1631.method234();
                        }
                        var142.field69[var144] = var145;
                    }
                    for (int var146 = var143; var146 < var142.field68.length; ++var146) {
                        var142.field68[var146] = 0;
                        var142.field69[var146] = 0;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 38) {
                    int var147 = this.field1631.method231();
                    if (var147 == 65535) {
                        var147 = -1;
                    }
                    if (this.field1480 != var147 && this.field1627 && !field1430 && this.field1313 == 0) {
                        this.field1463 = var147;
                        this.field1464 = true;
                        this.field1383.method279(2, this.field1463);
                    }
                    this.field1480 = var147;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 183) {
                    int var148 = this.field1631.method231();
                    int var149 = this.field1631.method231();
                    if (this.field1627 && !field1430) {
                        this.field1463 = var148;
                        this.field1464 = false;
                        this.field1383.method279(2, this.field1463);
                        this.field1313 = var149;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 204) {
                    int var150 = this.field1631.method231();
                    Component var151 = Component.field67[var150];
                    for (int var152 = 0; var152 < var151.field68.length; ++var152) {
                        var151.field68[var152] = -1;
                        var151.field68[var152] = 0;
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 111) {
                    for (int var153 = 0; var153 < this.field1317.length; ++var153) {
                        if (this.field1317[var153] != null) {
                            this.field1317[var153].field422 = -1;
                        }
                    }
                    for (int var154 = 0; var154 < this.field1646.length; ++var154) {
                        if (this.field1646[var154] != null) {
                            this.field1646[var154].field422 = -1;
                        }
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 246) {
                    int var155 = this.field1631.method232();
                    if (var155 >= 0) {
                        this.method537(var155, false);
                    }
                    this.field1517 = var155;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 3) {
                    this.field1381 = this.field1631.method229();
                    this.field1440 = true;
                    this.field1498 = true;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 105) {
                    this.field1423 = this.field1288 / 8;
                    for (int var156 = 0; var156 < this.field1423; ++var156) {
                        this.field1486[var156] = this.field1631.method235((byte) 5);
                    }
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 77) {
                    int var157 = this.field1631.method231();
                    this.method537(var157, false);
                    if (this.field1329 != -1) {
                        this.field1329 = -1;
                        this.field1440 = true;
                        this.field1498 = true;
                    }
                    this.field1236 = var157;
                    this.field1604 = true;
                    this.field1495 = -1;
                    this.field1663 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 195) {
                    this.method516(this.field1631, this.field1288, 0);
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 212) {
                    if (this.field1329 != -1) {
                        this.field1329 = -1;
                        this.field1440 = true;
                        this.field1498 = true;
                    }
                    if (this.field1236 != -1) {
                        this.field1236 = -1;
                        this.field1604 = true;
                    }
                    if (this.field1490) {
                        this.field1490 = false;
                        this.field1604 = true;
                    }
                    this.field1495 = -1;
                    this.field1663 = false;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 130) {
                    int var158 = this.field1631.method231();
                    int var159 = this.field1631.method232();
                    int var160 = this.field1631.method232();
                    Component var161 = Component.field67[var158];
                    var161.field80 = var159;
                    var161.field81 = var160;
                    this.field1289 = -1;
                    return true;
                }
                if (this.field1289 == 85) {
                    int var162 = this.field1631.method231();
                    int var163 = this.field1631.method231();
                    Component var164 = Component.field67[var162];
                    if (var164 != null && var164.field74 == 0) {
                        if (var163 < 0) {
                            var163 = 0;
                        }
                        if (var163 > var164.field86 - var164.field78) {
                            var163 = var164.field86 - var164.field78;
                        }
                        var164.field87 = var163;
                    }
                    this.field1289 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1289 + "," + this.field1288 + " - " + this.field1547 + "," + this.field1548);
                this.method562(false);
            } catch (IOException var169) {
                this.method445((byte) 1);
            } catch (Exception var170) {
                String var166 = "T2 - " + this.field1289 + "," + this.field1547 + "," + this.field1548 + " - " + this.field1288 + "," + (field1235.field444[0] + this.field1573) + "," + (field1235.field445[0] + this.field1574) + " - ";
                for (int var167 = 0; var167 < this.field1288 && var167 < 50; ++var167) {
                    var166 = var166 + this.field1631.field712[var167] + ",";
                }
                signlink.reporterror(var166);
                this.method562(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method432(int arg0, int arg1) {
        int[] var3 = this.field1249.field668;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1489[arg1][var24][var6] & 24) == 0) {
                    this.field1356.method85(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field1489[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field1356.method85(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1249.method181(this.field1239);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1489[arg1][var22][var9] & 24) == 0) {
                    this.method508(var9, var22, arg1, true, var8, var7);
                }
                if (arg1 < 3 && (this.field1489[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method508(var9, var22, arg1 + 1, true, var8, var7);
                }
            }
        }
        this.field1337.method258(this.field1239);
        this.field1519 = 0;
        if (arg0 != 2) {
            this.field1532 = null;
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1356.method79(this.field1299, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method330(var13).field977;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1382[this.field1299].field1103;
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
                        this.field1554[this.field1519] = this.field1664[var14];
                        this.field1520[this.field1519] = var15;
                        this.field1521[this.field1519] = var16;
                        ++this.field1519;
                    }
                }
            }
        }
        ++field1419;
        if (field1419 > 112) {
            field1419 = 0;
            this.field1614.method218(-744, 164);
            this.field1614.method219(50);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method433(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field1289 = this.field1631.method229();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method434(int arg0, int arg1, Packet arg2) {
        this.field1387 = 0;
        this.field1320 = 0;
        this.method459(332, arg2, arg1);
        this.method457(arg2, -41890, arg1);
        this.method544(-576, arg1, arg2);
        int var4 = arg0 + arg1;
        this.method469(arg2, (byte) 2, var4);
        for (int var5 = 0; var5 < this.field1387; ++var5) {
            int var7 = this.field1388[var5];
            if (field1314 != this.field1317[var7].field439) {
                this.field1317[var7] = null;
            }
        }
        if (arg2.field713 != var4) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field713 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1318; ++var6) {
                if (this.field1317[this.field1319[var6]] == null) {
                    signlink.reporterror(this.field1474 + " null entry in pl list - pos:" + var6 + " size:" + this.field1318);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method435(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method436(byte arg0) {
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1621.method248(); var2 != null; var2 = (ProjectileEntity) this.field1621.method250(8)) {
            if (this.field1299 == var2.field500 && field1314 <= var2.field506) {
                if (field1314 >= var2.field505) {
                    if (var2.field509 > 0) {
                        NpcEntity var4 = this.field1646[var2.field509 - 1];
                        if (var4 != null && var4.field394 >= 0 && var4.field394 < 13312 && var4.field395 >= 0 && var4.field395 < 13312) {
                            var2.method120(field1314, this.method551(var2.field500, true, var4.field395, var4.field394) - var2.field504, var4.field395, var4.field394, (byte) 105);
                        }
                    }
                    if (var2.field509 < 0) {
                        int var5 = -var2.field509 - 1;
                        PlayerEntity var6;
                        if (this.field1257 == var5) {
                            var6 = field1235;
                        } else {
                            var6 = this.field1317[var5];
                        }
                        if (var6 != null && var6.field394 >= 0 && var6.field394 < 13312 && var6.field395 >= 0 && var6.field395 < 13312) {
                            var2.method120(field1314, this.method551(var2.field500, true, var6.field395, var6.field394) - var2.field504, var6.field395, var6.field394, (byte) 105);
                        }
                    }
                    var2.method121(true, this.field1526);
                    this.field1356.method61(var2, 6, (int) var2.field512, var2.field519, -1, (int) var2.field511, this.field1299, 60, (int) var2.field513, false);
                }
            } else {
                var2.method106();
            }
        }
        ++field1624;
        if (arg0 != 75) {
            field1407 = !field1407;
        }
        if (field1624 > 1174) {
            field1624 = 0;
            this.field1614.method218(-744, 90);
            this.field1614.method219(0);
            int var3 = this.field1614.field713;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1614.method220(11499);
            }
            this.field1614.method220(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1614.method219(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1614.method219(94);
            }
            this.field1614.method220(51693);
            this.field1614.method219(16);
            this.field1614.method220(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1614.method219(65);
            }
            this.field1614.method219((int) (Math.random() * 256.0D));
            this.field1614.method220(22990);
            this.field1614.method228(this.field1614.field713 - var3, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)Z")
    public final boolean method437(Component arg0, boolean arg1) {
        this.field1619 &= arg1;
        int var3 = arg0.field76;
        if (this.field1558 == 2) {
            if (var3 == 201) {
                this.field1604 = true;
                this.field1490 = false;
                this.field1418 = true;
                this.field1629 = "";
                this.field1510 = 1;
                this.field1572 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1604 = true;
                this.field1490 = false;
                this.field1418 = true;
                this.field1629 = "";
                this.field1510 = 2;
                this.field1572 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1292 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1604 = true;
                this.field1490 = false;
                this.field1418 = true;
                this.field1629 = "";
                this.field1510 = 4;
                this.field1572 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1604 = true;
                this.field1490 = false;
                this.field1418 = true;
                this.field1629 = "";
                this.field1510 = 5;
                this.field1572 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1395[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1122 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1122) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1123[var6].field1129 && IdkType.field1123[var6].field1124 == var4 + (this.field1282 ? 0 : 7)) {
                            this.field1395[var4] = var6;
                            this.field1559 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1436[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1223[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1223[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1436[var7] = var9;
                this.field1559 = true;
            }
            if (var3 == 324 && !this.field1282) {
                this.field1282 = true;
                this.method560(this.field1312);
            }
            if (var3 == 325 && this.field1282) {
                this.field1282 = false;
                this.method560(this.field1312);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1476 = !this.field1476;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method461(-453);
                    if (this.field1392.length() > 0) {
                        this.field1614.method218(-744, 85);
                        this.field1614.method225(JString.method300(this.field1392), (byte) 3);
                        this.field1614.method219(var3 - 601);
                        this.field1614.method219(this.field1476 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1614.method218(-744, 145);
                this.field1614.method219(this.field1282 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1614.method219(this.field1395[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1614.method219(this.field1436[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field1672 = -103;
        }
        if (super.field26 == 1) {
            if (super.field27 >= 6 && super.field27 <= 106 && super.field28 >= 467 && super.field28 <= 499) {
                this.field1301 = (this.field1301 + 1) % 4;
                this.field1259 = true;
                this.field1604 = true;
                this.field1614.method218(-744, 242);
                this.field1614.method219(this.field1301);
                this.field1614.method219(this.field1357);
                this.field1614.method219(this.field1222);
            }
            if (super.field27 >= 135 && super.field27 <= 235 && super.field28 >= 467 && super.field28 <= 499) {
                this.field1357 = (this.field1357 + 1) % 3;
                this.field1259 = true;
                this.field1604 = true;
                this.field1614.method218(-744, 242);
                this.field1614.method219(this.field1301);
                this.field1614.method219(this.field1357);
                this.field1614.method219(this.field1222);
            }
            if (super.field27 >= 273 && super.field27 <= 373 && super.field28 >= 467 && super.field28 <= 499) {
                this.field1222 = (this.field1222 + 1) % 3;
                this.field1259 = true;
                this.field1604 = true;
                this.field1614.method218(-744, 242);
                this.field1614.method219(this.field1301);
                this.field1614.method219(this.field1357);
                this.field1614.method219(this.field1222);
            }
            if (super.field27 >= 412 && super.field27 <= 512 && super.field28 >= 467 && super.field28 <= 499) {
                if (this.field1495 == -1) {
                    this.method461(-453);
                    this.field1392 = "";
                    this.field1476 = false;
                    for (int var2 = 0; var2 < Component.field67.length; ++var2) {
                        if (Component.field67[var2] != null && Component.field67[var2].field76 == 600) {
                            this.field1286 = this.field1495 = Component.field67[var2].field73;
                            return;
                        }
                    }
                    return;
                }
                this.method553("Please close the interface you have open before using 'report abuse'", 0, false, "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;ILab;I)V")
    private final void method439(int arg0, Packet arg1, int arg2, PlayerEntity arg3, int arg4) {
        while (arg0 >= 0) {
            this.field1289 = arg1.method229();
        }
        if ((arg4 & 1) == 1) {
            int var6 = arg1.method229();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(var7, (byte) -93);
            arg1.method238(0, var7, var6, 0);
            this.field1322[arg2] = var8;
            arg3.method116(0, var8);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg1.method231();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg3.field422 == var9) {
                arg3.field426 = 0;
            }
            int var10 = arg1.method229();
            if (arg3.field422 == var9 && var9 != -1) {
                int var11 = SeqType.field1143[var9].field1157;
                if (var11 == 1) {
                    arg3.field423 = 0;
                    arg3.field424 = 0;
                    arg3.field425 = var10;
                    arg3.field426 = 0;
                }
                if (var11 == 2) {
                    arg3.field426 = 0;
                }
            } else if (var9 == -1 || arg3.field422 == -1 || SeqType.field1143[var9].field1151 >= SeqType.field1143[arg3.field422].field1151) {
                arg3.field422 = var9;
                arg3.field423 = 0;
                arg3.field424 = 0;
                arg3.field425 = var10;
                arg3.field426 = 0;
                arg3.field448 = arg3.field443;
            }
        }
        if ((arg4 & 4) == 4) {
            arg3.field416 = arg1.method231();
            if (arg3.field416 == 65535) {
                arg3.field416 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg3.field406 = arg1.method236();
            if (arg3.field406.charAt(0) == '~') {
                arg3.field406 = arg3.field406.substring(1);
                this.method553(arg3.field406, 2, false, arg3.field456);
            } else if (field1235 == arg3) {
                this.method553(arg3.field406, 2, false, arg3.field456);
            }
            arg3.field408 = 0;
            arg3.field409 = 0;
            arg3.field407 = 150;
        }
        if ((arg4 & 16) == 16) {
            int var12 = arg1.method229();
            int var13 = arg1.method229();
            arg3.method114(var12, field1314, -103, var13);
            arg3.field413 = field1314 + 300;
            arg3.field414 = arg1.method229();
            arg3.field415 = arg1.method229();
        }
        if ((arg4 & 32) == 32) {
            arg3.field417 = arg1.method231();
            arg3.field418 = arg1.method231();
        }
        if ((arg4 & 64) == 64) {
            int var14 = arg1.method231();
            int var15 = arg1.method229();
            int var16 = arg1.method229();
            int var17 = arg1.field713;
            if (arg3.field456 != null && arg3.field457) {
                long var18 = JString.method300(arg3.field456);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1423; ++var21) {
                        if (this.field1486[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1403 == 0) {
                    try {
                        String var22 = WordPack.method306(var16, this.field1432, arg1);
                        String var23 = WordFilter.method401(9384, var22);
                        arg3.field406 = var23;
                        arg3.field408 = var14 >> 8;
                        arg3.field409 = var14 & 255;
                        arg3.field407 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method553(var23, 1, false, "@cr1@" + arg3.field456);
                            } else {
                                this.method553(var23, 2, false, arg3.field456);
                            }
                        } else {
                            this.method553(var23, 1, false, "@cr2@" + arg3.field456);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field713 = var16 + var17;
        }
        if ((arg4 & 256) == 256) {
            arg3.field427 = arg1.method231();
            int var25 = arg1.method234();
            arg3.field431 = var25 >> 16;
            arg3.field430 = (var25 & 65535) + field1314;
            arg3.field428 = 0;
            arg3.field429 = 0;
            if (arg3.field430 > field1314) {
                arg3.field428 = -1;
            }
            if (arg3.field427 == 65535) {
                arg3.field427 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg3.field432 = arg1.method229();
            arg3.field434 = arg1.method229();
            arg3.field433 = arg1.method229();
            arg3.field435 = arg1.method229();
            arg3.field436 = arg1.method231() + field1314;
            arg3.field437 = arg1.method231() + field1314;
            arg3.field438 = arg1.method229();
            arg3.method112(956);
        }
        if ((arg4 & 1024) == 1024) {
            int var26 = arg1.method229();
            int var27 = arg1.method229();
            arg3.method114(var26, field1314, -103, var27);
            arg3.field413 = field1314 + 300;
            arg3.field414 = arg1.method229();
            arg3.field415 = arg1.method229();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;II)V")
    public final void method440(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1641 + this.field1466 & 2047;
        this.field1288 += arg0;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field600[var5];
            int var8 = Model.field601[var5];
            int var9 = var7 * 256 / (this.field1352 + 256);
            int var10 = var8 * 256 / (this.field1352 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method192(var11 + 94 - arg1.field673 / 2 + 4, 4, 83 - var12 - arg1.field674 / 2 - 4, this.field1367);
            } else {
                arg1.method186(var11 + 94 - arg1.field673 / 2 + 4, 0, 83 - var12 - arg1.field674 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method441(Component arg0, int arg1) {
        int var3 = arg0.field76;
        int var4 = 9 / arg1;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1433[this.field1571] = "Remove @whi@" + arg0.field108;
                this.field1226[this.field1571] = 884;
                ++this.field1571;
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
            this.field1433[this.field1571] = "Remove @whi@" + this.field1461[var3];
            this.field1226[this.field1571] = 513;
            ++this.field1571;
            this.field1433[this.field1571] = "Message @whi@" + this.field1461[var3];
            this.field1226[this.field1571] = 902;
            ++this.field1571;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;IIZ)V")
    public final void method442(Pix32 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1532 = null;
        }
        int var5 = arg1 * arg1 + arg2 * arg2;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1641 + this.field1466 & 2047;
            int var7 = Model.field600[var6];
            int var8 = Model.field601[var6];
            int var9 = var7 * 256 / (this.field1352 + 256);
            int var10 = var8 * 256 / (this.field1352 + 256);
            int var11 = arg1 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1330.method191(256, 20, 859, 20, 15, var13, 15, var15 + 94 + 4 - 10, 83 - var16 - 20);
        } else {
            this.method440(0, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method443(int arg0) {
        if (arg0 == -7957) {
            if (this.field1578 != 0) {
                PixFont var2 = this.field1397;
                int var3 = 0;
                if (this.field1402 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1507[var4] != null) {
                        int var5 = this.field1505[var4];
                        String var6 = this.field1506[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1357 == 0 || this.field1357 == 1 && this.method557((byte) 9, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method206("From", false, var8, var9, 0);
                            var2.method206("From", false, var8 - 1, var9, 65535);
                            int var10 = var9 + var2.method204((byte) 0, "From ");
                            if (var7 == 1) {
                                this.field1661[0].method199(var10, 0, var8 - 12);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field1661[1].method199(var10, 0, var8 - 12);
                                var10 += 14;
                            }
                            var2.method206(var6 + ": " + this.field1507[var4], false, var8, var10, 0);
                            var2.method206(var6 + ": " + this.field1507[var4], false, var8 - 1, var10, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field1357 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method206(this.field1507[var4], false, var11, 4, 0);
                            var2.method206(this.field1507[var4], false, var11 - 1, 4, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field1357 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method206("To " + var6 + ": " + this.field1507[var4], false, var12, 4, 0);
                            var2.method206("To " + var6 + ": " + this.field1507[var4], false, var12 - 1, 4, 65535);
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        if (this.field1307 == 0) {
            this.field1433[0] = "Cancel";
            if (arg0) {
                this.field1614.method219(132);
            }
            this.field1226[0] = 1106;
            this.field1571 = 1;
            this.method484(205);
            this.field1229 = 0;
            if (super.field20 > 4 && super.field21 > 4 && super.field20 < 516 && super.field21 < 338) {
                if (this.field1495 != -1) {
                    this.method494(4, -3, Component.field67[this.field1495], super.field21, 0, 4, super.field20);
                } else {
                    this.method460((byte) -31);
                }
            }
            if (this.field1502 != this.field1229) {
                this.field1502 = this.field1229;
            }
            this.field1229 = 0;
            if (super.field20 > 553 && super.field21 > 205 && super.field20 < 743 && super.field21 < 466) {
                if (this.field1329 != -1) {
                    this.method494(553, -3, Component.field67[this.field1329], super.field21, 0, 205, super.field20);
                } else if (this.field1553[this.field1381] != -1) {
                    this.method494(553, -3, Component.field67[this.field1553[this.field1381]], super.field21, 0, 205, super.field20);
                }
            }
            if (this.field1389 != this.field1229) {
                this.field1440 = true;
                this.field1389 = this.field1229;
            }
            this.field1229 = 0;
            if (super.field20 > 17 && super.field21 > 357 && super.field20 < 496 && super.field21 < 453) {
                if (this.field1236 != -1) {
                    this.method494(17, -3, Component.field67[this.field1236], super.field21, 0, 357, super.field20);
                } else if (super.field21 < 434 && super.field20 < 426) {
                    this.method452(super.field21 - 357, super.field20 - 17, 0);
                }
            }
            if (this.field1236 != -1 && this.field1638 != this.field1229) {
                this.field1604 = true;
                this.field1638 = this.field1229;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1571 - 1; ++var3) {
                    if (this.field1226[var3] < 1000 && this.field1226[var3 + 1] > 1000) {
                        String var4 = this.field1433[var3];
                        this.field1433[var3] = this.field1433[var3 + 1];
                        this.field1433[var3 + 1] = var4;
                        int var5 = this.field1226[var3];
                        this.field1226[var3] = this.field1226[var3 + 1];
                        this.field1226[var3 + 1] = var5;
                        int var6 = this.field1224[var3];
                        this.field1224[var3] = this.field1224[var3 + 1];
                        this.field1224[var3 + 1] = var6;
                        int var7 = this.field1225[var3];
                        this.field1225[var3] = this.field1225[var3 + 1];
                        this.field1225[var3 + 1] = var7;
                        int var8 = this.field1227[var3];
                        this.field1227[var3] = this.field1227[var3 + 1];
                        this.field1227[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1427 = Integer.parseInt(this.getParameter("nodeid"));
        field1428 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method453(true);
        } else {
            method549(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1429 = false;
        } else {
            field1429 = true;
        }
        this.method2(field1407, 503, 765);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method445(byte arg0) {
        if (arg0 != 1) {
            this.field1672 = -152;
        }
        if (this.field1292 > 0) {
            this.method562(false);
        } else {
            this.field1337.method258(this.field1239);
            this.field1397.method202("Connection lost", 144, 0, (byte) 0, 257);
            this.field1397.method202("Connection lost", 143, 16777215, (byte) 0, 256);
            this.field1397.method202("Please wait - attempting to reestablish", 159, 0, (byte) 0, 257);
            this.field1397.method202("Please wait - attempting to reestablish", 158, 16777215, (byte) 0, 256);
            this.field1337.method259(4, super.field12, -38524, 4);
            this.field1269 = 0;
            this.field1247 = 0;
            ClientStream var2 = this.field1615;
            this.field1619 = false;
            this.field1603 = 0;
            this.method472(this.field1474, this.field1475, true);
            if (!this.field1619) {
                this.method562(false);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1551.method199(arg2, 0, arg5);
        this.field1552.method199(arg2, 0, arg3 + arg5 - 16);
        Pix2D.method157(this.field1488, arg3 - 32, arg5 + 16, 16, (byte) 5, arg2);
        int var7 = (arg3 - 32) * arg3 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg4 / (arg0 - arg3);
        Pix2D.method157(this.field1446, var7, arg5 + 16 + var8, 16, (byte) 5, arg2);
        if (arg1 >= 0) {
            this.field1289 = -1;
        }
        Pix2D.method162(arg5 + 16 + var8, this.field1645, arg2, (byte) 4, var7);
        Pix2D.method162(arg5 + 16 + var8, this.field1645, arg2 + 1, (byte) 4, var7);
        Pix2D.method160(this.field1645, 0, arg5 + 16 + var8, 16, arg2);
        Pix2D.method160(this.field1645, 0, arg5 + 17 + var8, 16, arg2);
        Pix2D.method162(arg5 + 16 + var8, this.field1260, arg2 + 15, (byte) 4, var7);
        Pix2D.method162(arg5 + 17 + var8, this.field1260, arg2 + 14, (byte) 4, var7 - 1);
        Pix2D.method160(this.field1260, 0, arg5 + 15 + var8 + var7, 16, arg2);
        Pix2D.method160(this.field1260, 0, arg5 + 14 + var8 + var7, 15, arg2 + 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public final void method13(int arg0, byte arg1, String arg2) {
        this.field1435 = arg0;
        this.field1625 = arg2;
        this.method449((byte) 3);
        if (this.field1237 == null) {
            super.method13(arg0, (byte) 1, arg2);
        } else {
            this.field1653.method258(this.field1239);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1398.method202("RuneScape is loading - please wait...", var5 / 2 - 26 - var6, 16777215, (byte) 0, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method158(var4 / 2 - 152, var7, 34, 9179409, 304, (byte) -69);
            Pix2D.method158(var4 / 2 - 151, var7 + 1, 32, 0, 302, (byte) -69);
            Pix2D.method157(9179409, 30, var7 + 2, arg0 * 3, (byte) 5, var4 / 2 - 150);
            Pix2D.method157(0, 30, var7 + 2, 300 - arg0 * 3, (byte) 5, arg0 * 3 + (var4 / 2 - 150));
            this.field1398.method202(arg2, var5 / 2 + 5 - var6, 16777215, (byte) 0, var4 / 2);
            this.field1653.method259(202, super.field12, -38524, 171);
            if (arg1 != 1) {
                field1273 = !field1273;
            }
            if (this.field1365) {
                this.field1365 = false;
                if (!this.field1523) {
                    this.field1654.method259(0, super.field12, -38524, 0);
                    this.field1655.method259(637, super.field12, -38524, 0);
                }
                this.field1651.method259(128, super.field12, -38524, 0);
                this.field1652.method259(202, super.field12, -38524, 371);
                this.field1656.method259(0, super.field12, -38524, 265);
                this.field1657.method259(562, super.field12, -38524, 265);
                this.field1658.method259(128, super.field12, -38524, 171);
                this.field1659.method259(562, super.field12, -38524, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method447(int arg0) {
        if (arg0 != 3) {
            this.field1518 = -270;
        }
        for (int var2 = 0; var2 < this.field1420; ++var2) {
            if (this.field1358[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1360[var2] == this.field1296 && this.field1263[var2] == this.field1354) {
                        if (!this.method463((byte) 7)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method319(this.field1263[var2], false, this.field1360[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field713 / 22) > (long) (this.field1406 / 22) + this.field1294) {
                            this.field1406 = var4.field713;
                            this.field1294 = System.currentTimeMillis();
                            if (this.method523(var4.field712, var4.field713, 0)) {
                                this.field1296 = this.field1360[var2];
                                this.field1354 = this.field1263[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1358[var2] != -5) {
                    this.field1358[var2] = -5;
                } else {
                    --this.field1420;
                    for (int var6 = var2; var6 < this.field1420; ++var6) {
                        this.field1360[var6] = this.field1360[var6 + 1];
                        this.field1263[var6] = this.field1263[var6 + 1];
                        this.field1358[var6] = this.field1358[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1358[var2]--;
            }
        }
        if (this.field1313 > 0) {
            this.field1313 -= 20;
            if (this.field1313 < 0) {
                this.field1313 = 0;
            }
            if (this.field1313 == 0 && this.field1627 && !field1430) {
                this.field1463 = this.field1480;
                this.field1464 = true;
                this.field1383.method279(2, this.field1463);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        if (!arg0) {
            int var2 = 5;
            this.field1566[8] = 0;
            int var3 = 0;
            while (this.field1566[8] == 0) {
                String var4 = "Unknown problem";
                this.method13(20, (byte) 1, "Connecting to web server");
                try {
                    DataInputStream var5 = this.method495("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 298);
                    Packet var6 = new Packet(new byte[40], (byte) -93);
                    var5.readFully(var6.field712, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field1566[var7] = var6.method234();
                    }
                    int var8 = var6.method234();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field1566[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field1566[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field1566[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field1566[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field1566[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field1566[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method13(10, (byte) 1, "Game updated - please reload page");
                            var11 = 10;
                        } else {
                            this.method13(10, (byte) 1, var4 + " - Will retry in " + var11 + " secs.");
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
                    this.field1561 = !this.field1561;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method449(byte arg0) {
        if (this.field1651 == null) {
            super.field13 = null;
            this.field1338 = null;
            this.field1336 = null;
            this.field1335 = null;
            this.field1337 = null;
            this.field1632 = null;
            this.field1633 = null;
            this.field1634 = null;
            this.field1654 = new PixMap(this.method11(-290), 0, 265, 128);
            Pix2D.method155(-843);
            if (arg0 == 3) {
                boolean var2 = false;
            } else {
                this.field1289 = -1;
            }
            this.field1655 = new PixMap(this.method11(-290), 0, 265, 128);
            Pix2D.method155(-843);
            this.field1651 = new PixMap(this.method11(-290), 0, 171, 509);
            Pix2D.method155(-843);
            this.field1652 = new PixMap(this.method11(-290), 0, 132, 360);
            Pix2D.method155(-843);
            this.field1653 = new PixMap(this.method11(-290), 0, 200, 360);
            Pix2D.method155(-843);
            this.field1656 = new PixMap(this.method11(-290), 0, 238, 202);
            Pix2D.method155(-843);
            this.field1657 = new PixMap(this.method11(-290), 0, 238, 203);
            Pix2D.method155(-843);
            this.field1658 = new PixMap(this.method11(-290), 0, 94, 74);
            Pix2D.method155(-843);
            this.field1659 = new PixMap(this.method11(-290), 0, 94, 75);
            Pix2D.method155(-843);
            if (this.field1237 != null) {
                this.method512(-323);
                this.method519(field1613);
            }
            this.field1365 = true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method450(int arg0) {
        if (arg0 != 25451) {
            this.field1518 = this.field1293.method295();
        }
        if (this.field1269 == 0) {
            if (super.field26 == 1) {
                int var2 = super.field27 - 25 - 550;
                int var3 = super.field28 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1641 + this.field1466 & 2047;
                    int var5 = Pix3D.field643[var4];
                    int var6 = Pix3D.field644[var4];
                    int var7 = (this.field1352 + 256) * var5 >> 8;
                    int var8 = (this.field1352 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1235.field394 + var9 >> 7;
                    int var12 = field1235.field395 - var10 >> 7;
                    boolean var13 = this.method488(field1235.field445[0], field1235.field444[0], 0, var11, var12, 0, true, 0, 0, (byte) 4, 1, 0);
                    if (var13) {
                        this.field1614.method219(var2);
                        this.field1614.method219(var3);
                        this.field1614.method220(this.field1641);
                        this.field1614.method219(57);
                        this.field1614.method219(this.field1466);
                        this.field1614.method219(this.field1352);
                        this.field1614.method219(89);
                        this.field1614.method220(field1235.field394);
                        this.field1614.method220(field1235.field395);
                        this.field1614.method219(this.field1596);
                        this.field1614.method219(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method451(int arg0, int arg1) {
        if (arg1 >= 3 && arg1 <= 3) {
            if (arg0 < 100000) {
                return String.valueOf(arg0);
            } else {
                return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)V")
    public final void method452(int arg0, int arg1, int arg2) {
        int var4 = 0;
        this.field1288 += arg2;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1507[var5] != null) {
                int var6 = this.field1505[var5];
                int var7 = 70 - var4 * 14 + this.field1438 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1506[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1301 == 0 || this.field1301 == 1 && this.method557((byte) 9, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1235.field456)) {
                        if (this.field1479 >= 1) {
                            this.field1433[this.field1571] = "Report abuse @whi@" + var8;
                            this.field1226[this.field1571] = 524;
                            ++this.field1571;
                        }
                        this.field1433[this.field1571] = "Add ignore @whi@" + var8;
                        this.field1226[this.field1571] = 47;
                        ++this.field1571;
                        this.field1433[this.field1571] = "Add friend @whi@" + var8;
                        this.field1226[this.field1571] = 605;
                        ++this.field1571;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1578 == 0 && (var6 == 7 || this.field1357 == 0 || this.field1357 == 1 && this.method557((byte) 9, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1479 >= 1) {
                            this.field1433[this.field1571] = "Report abuse @whi@" + var8;
                            this.field1226[this.field1571] = 524;
                            ++this.field1571;
                        }
                        this.field1433[this.field1571] = "Add ignore @whi@" + var8;
                        this.field1226[this.field1571] = 47;
                        ++this.field1571;
                        this.field1433[this.field1571] = "Add friend @whi@" + var8;
                        this.field1226[this.field1571] = 605;
                        ++this.field1571;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1222 == 0 || this.field1222 == 1 && this.method557((byte) 9, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1433[this.field1571] = "Accept trade @whi@" + var8;
                        this.field1226[this.field1571] = 507;
                        ++this.field1571;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1578 == 0 && this.field1357 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1222 == 0 || this.field1222 == 1 && this.method557((byte) 9, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1433[this.field1571] = "Accept challenge @whi@" + var8;
                        this.field1226[this.field1571] = 957;
                        ++this.field1571;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public static final void method453(boolean arg0) {
        World3D.field280 = true;
        Pix3D.field634 = true;
        field1430 = true;
        if (arg0) {
            World.field41 = true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method454(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field1289 = -1;
        }
        if (this.field1307 == 0) {
            int var2 = super.field26;
            if (this.field1441 == 1 && super.field27 >= 516 && super.field28 >= 160 && super.field27 <= 765 && super.field28 <= 205) {
                var2 = 0;
            }
            if (this.field1597) {
                if (var2 != 1) {
                    int var3 = super.field20;
                    int var4 = super.field21;
                    if (this.field1343 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1343 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1343 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1344 - 10 || var3 > this.field1346 + this.field1344 + 10 || var4 < this.field1345 - 10 || var4 > this.field1347 + this.field1345 + 10) {
                        this.field1597 = false;
                        if (this.field1343 == 1) {
                            this.field1440 = true;
                        }
                        if (this.field1343 == 2) {
                            this.field1604 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1344;
                    int var6 = this.field1345;
                    int var7 = this.field1346;
                    int var8 = super.field27;
                    int var9 = super.field28;
                    if (this.field1343 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1343 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1343 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1571; ++var11) {
                        int var12 = (this.field1571 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method555(-368, var10);
                    }
                    this.field1597 = false;
                    if (this.field1343 == 1) {
                        this.field1440 = true;
                    }
                    if (this.field1343 == 2) {
                        this.field1604 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1571 > 0) {
                    int var13 = this.field1226[this.field1571 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1224[this.field1571 - 1];
                        int var15 = this.field1225[this.field1571 - 1];
                        Component var16 = Component.field67[var15];
                        if (var16.field94 || var16.field97) {
                            this.field1304 = false;
                            this.field1284 = 0;
                            this.field1305 = var15;
                            this.field1306 = var14;
                            this.field1307 = 2;
                            this.field1308 = super.field27;
                            this.field1309 = super.field28;
                            if (Component.field67[var15].field73 == this.field1495) {
                                this.field1307 = 1;
                            }
                            if (Component.field67[var15].field73 == this.field1236) {
                                this.field1307 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1281 == 1 || this.method496(false, this.field1571 - 1)) && this.field1571 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1571 > 0) {
                    this.method555(-368, this.field1571 - 1);
                }
                if (var2 != 2 || this.field1571 <= 0) {
                    return;
                }
                this.method480((byte) 9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method455(boolean arg0, long arg1) {
        if (arg0) {
            this.field1289 = -1;
        }
        if (arg1 != 0L) {
            if (this.field1557 >= 100 && this.field1504 != 1) {
                this.method553("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, false, "");
            } else if (this.field1557 >= 200) {
                this.method553("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, false, "");
            } else {
                String var4 = JString.method304((byte) 78, JString.method301(arg1, (byte) -48));
                for (int var5 = 0; var5 < this.field1557; ++var5) {
                    if (this.field1230[var5] == arg1) {
                        this.method553(var4 + " is already on your friend list", 0, false, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1423; ++var6) {
                    if (this.field1486[var6] == arg1) {
                        this.method553("Please remove " + var4 + " from your ignore list first", 0, false, "");
                        return;
                    }
                }
                if (!var4.equals(field1235.field456)) {
                    this.field1461[this.field1557] = var4;
                    this.field1230[this.field1557] = arg1;
                    this.field1355[this.field1557] = 0;
                    ++this.field1557;
                    this.field1440 = true;
                    this.field1614.method218(-744, 221);
                    this.field1614.method225(arg1, (byte) 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method456(byte arg0) {
        if (arg0 != 40) {
            this.field1481 = -409;
        }
        this.field1338.method258(this.field1239);
        Pix3D.field645 = this.field1563;
        this.field1368.method199(0, 0, 0);
        if (this.field1418) {
            this.field1398.method202(this.field1572, 40, 0, (byte) 0, 239);
            this.field1398.method202(this.field1629 + "*", 60, 128, (byte) 0, 239);
        } else if (this.field1490) {
            this.field1398.method202("Enter amount:", 40, 0, (byte) 0, 239);
            this.field1398.method202(this.field1325 + "*", 60, 128, (byte) 0, 239);
        } else if (this.field1298 != null) {
            this.field1398.method202(this.field1298, 40, 0, (byte) 0, 239);
            this.field1398.method202("Click to continue", 60, 128, (byte) 0, 239);
        } else if (this.field1236 != -1) {
            this.method522(0, 0, Component.field67[this.field1236], 0, true);
        } else if (this.field1472 != -1) {
            this.method522(0, 0, Component.field67[this.field1472], 0, true);
        } else {
            PixFont var2 = this.field1397;
            int var3 = 0;
            Pix2D.method154(0, 0, 463, false, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1507[var4] != null) {
                    int var6 = this.field1505[var4];
                    int var7 = 70 - var3 * 14 + this.field1438;
                    String var8 = this.field1506[var4];
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
                            var2.method206(this.field1507[var4], false, var7, 4, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1301 == 0 || this.field1301 == 1 && this.method557((byte) 9, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1661[0].method199(var10, 0, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1661[1].method199(var10, 0, var7 - 12);
                                var10 += 14;
                            }
                            var2.method206(var8 + ":", false, var7, var10, 0);
                            int var11 = var10 + var2.method204((byte) 0, var8) + 8;
                            var2.method206(this.field1507[var4], false, var7, var11, 255);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1578 == 0 && (var6 == 7 || this.field1357 == 0 || this.field1357 == 1 && this.method557((byte) 9, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method206("From", false, var7, var12, 0);
                            int var13 = var12 + var2.method204((byte) 0, "From ");
                            if (var9 == 1) {
                                this.field1661[0].method199(var13, 0, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1661[1].method199(var13, 0, var7 - 12);
                                var13 += 14;
                            }
                            var2.method206(var8 + ":", false, var7, var13, 0);
                            int var14 = var13 + var2.method204((byte) 0, var8) + 8;
                            var2.method206(this.field1507[var4], false, var7, var14, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1222 == 0 || this.field1222 == 1 && this.method557((byte) 9, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var8 + " " + this.field1507[var4], false, var7, 4, 8388736);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1578 == 0 && this.field1357 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(this.field1507[var4], false, var7, 4, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1578 == 0 && this.field1357 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206("To " + var8 + ":", false, var7, 4, 0);
                            var2.method206(this.field1507[var4], false, var7, 12 + var2.method204((byte) 0, "To " + var8), 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1222 == 0 || this.field1222 == 1 && this.method557((byte) 9, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method206(var8 + " " + this.field1507[var4], false, var7, 4, 8270336);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method153(true);
            this.field1598 = var3 * 14 + 7;
            if (this.field1598 < 78) {
                this.field1598 = 78;
            }
            this.method446(this.field1598, -784, 463, 77, this.field1598 - this.field1438 - 77, 0);
            String var5;
            if (field1235 != null && field1235.field456 != null) {
                var5 = field1235.field456;
            } else {
                var5 = JString.method304((byte) 78, this.field1474);
            }
            var2.method206(var5 + ":", false, 90, 4, 0);
            var2.method206(this.field1285 + "*", false, 90, 6 + var2.method204((byte) 0, var5 + ": "), 255);
            Pix2D.method160(0, 0, 77, 479, 0);
        }
        if (this.field1597 && this.field1343 == 2) {
            this.method506(true);
        }
        this.field1338.method259(17, super.field12, -38524, 357);
        this.field1337.method258(this.field1239);
        Pix3D.field645 = this.field1565;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method457(Packet arg0, int arg1, int arg2) {
        if (arg1 != -41890) {
            this.field1532 = null;
        }
        int var4 = arg0.method240(0, 8);
        if (var4 < this.field1318) {
            for (int var5 = var4; var5 < this.field1318; ++var5) {
                this.field1388[this.field1387++] = this.field1319[var5];
            }
        }
        if (var4 > this.field1318) {
            signlink.reporterror(this.field1474 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1318 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1319[var6];
                PlayerEntity var8 = this.field1317[var7];
                int var9 = arg0.method240(0, 1);
                if (var9 == 0) {
                    this.field1319[this.field1318++] = var7;
                    var8.field439 = field1314;
                } else {
                    int var10 = arg0.method240(0, 2);
                    if (var10 == 0) {
                        this.field1319[this.field1318++] = var7;
                        var8.field439 = field1314;
                        this.field1321[this.field1320++] = var7;
                    } else if (var10 == 1) {
                        this.field1319[this.field1318++] = var7;
                        var8.field439 = field1314;
                        int var11 = arg0.method240(0, 3);
                        var8.method111(var11, 2, false);
                        int var12 = arg0.method240(0, 1);
                        if (var12 == 1) {
                            this.field1321[this.field1320++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1319[this.field1318++] = var7;
                        var8.field439 = field1314;
                        int var13 = arg0.method240(0, 3);
                        var8.method111(var13, 2, true);
                        int var14 = arg0.method240(0, 3);
                        var8.method111(var14, 2, true);
                        int var15 = arg0.method240(0, 1);
                        if (var15 == 1) {
                            this.field1321[this.field1320++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1388[this.field1387++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    private final void method458(int arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field714 + 21 < arg2 * 8) {
                int var4 = arg1.method240(0, 14);
                if (var4 != 16383) {
                    if (this.field1646[var4] == null) {
                        this.field1646[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1646[var4];
                    this.field1648[this.field1647++] = var4;
                    var5.field439 = field1314;
                    var5.field450 = NpcType.method341(arg1.method240(0, 12));
                    var5.field398 = var5.field450.field1014;
                    var5.field442 = var5.field450.field1036;
                    var5.field401 = var5.field450.field1018;
                    var5.field402 = var5.field450.field1019;
                    var5.field403 = var5.field450.field1020;
                    var5.field404 = var5.field450.field1021;
                    var5.field399 = var5.field450.field1017;
                    int var6 = arg1.method240(0, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method240(0, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method240(0, 1);
                    var5.method110(field1235.field444[0] + var6, false, var8 == 1, field1235.field445[0] + var7);
                    int var9 = arg1.method240(0, 1);
                    if (var9 == 1) {
                        this.field1321[this.field1320++] = var4;
                    }
                    continue;
                }
            }
            arg1.method241(168);
            if (arg0 == 30846) {
                return;
            }
            for (int var10 = 1; var10 > 0; ++var10) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, (byte) 1, "Starting up");
        if (signlink.sunjava) {
            super.field6 = 5;
        }
        if (field1342) {
            this.field1339 = true;
        } else {
            field1342 = true;
            boolean var1 = false;
            String var2 = this.method547(566);
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
                this.field1264 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1283[var3] = new FileStream(signlink.cache_idx[var3], var3 + 1, 7, 500000, signlink.cache_dat);
                    }
                }
                try {
                    this.method448(false);
                    this.field1237 = this.method527(this.field1566[1], (byte) -56, 1, "title screen", "title", 25);
                    this.field1396 = new PixFont(false, "p11_full", this.field1237, 98);
                    this.field1397 = new PixFont(false, "p12_full", this.field1237, 98);
                    this.field1398 = new PixFont(false, "b12_full", this.field1237, 98);
                    this.field1399 = new PixFont(true, "q8_full", this.field1237, 98);
                    this.method512(-323);
                    this.method519(field1613);
                    Jagfile var4 = this.method527(this.field1566[2], (byte) -56, 2, "config", "config", 30);
                    Jagfile var5 = this.method527(this.field1566[3], (byte) -56, 3, "interface", "interface", 35);
                    Jagfile var6 = this.method527(this.field1566[4], (byte) -56, 4, "2d graphics", "media", 40);
                    Jagfile var7 = this.method527(this.field1566[6], (byte) -56, 6, "textures", "textures", 45);
                    Jagfile var8 = this.method527(this.field1566[7], (byte) -56, 7, "chat system", "wordenc", 50);
                    Jagfile var9 = this.method527(this.field1566[8], (byte) -56, 8, "sound effects", "sounds", 55);
                    this.field1489 = new byte[4][104][104];
                    this.field1626 = new int[4][105][105];
                    this.field1356 = new World3D(4, 104, 104, this.field1626, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1382[var10] = new CollisionMap(104, field1662, 104);
                    }
                    this.field1249 = new Pix32(512, 512);
                    Jagfile var11 = this.method527(this.field1566[5], (byte) -56, 5, "update list", "versionlist", 60);
                    this.method13(60, (byte) 1, "Connecting to update server");
                    this.field1383 = new OnDemand();
                    this.field1383.method270(var11, this);
                    AnimFrame.method44(this.field1383.method273(-436));
                    Model.method123(this.field1383.method272(0, 16993), this.field1383);
                    if (!field1430) {
                        this.field1463 = 0;
                        try {
                            this.field1463 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1464 = true;
                        this.field1383.method279(2, this.field1463);
                        while (this.field1383.method280() > 0) {
                            this.method498(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1383.field845 > 3) {
                                this.method435("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, (byte) 1, "Requesting animations");
                    int var12 = this.field1383.method272(1, 16993);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1383.method279(1, var13);
                    }
                    while (this.field1383.method280() > 0) {
                        int var14 = var12 - this.field1383.method280();
                        if (var14 > 0) {
                            this.method13(65, (byte) 1, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method498(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1383.field845 > 3) {
                            this.method435("ondemand");
                            return;
                        }
                    }
                    this.method13(70, (byte) 1, "Requesting models");
                    int var15 = this.field1383.method272(0, 16993);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1383.method277(3, var16);
                        if ((var17 & 1) != 0) {
                            this.field1383.method279(0, var16);
                        }
                    }
                    int var18 = this.field1383.method280();
                    while (this.field1383.method280() > 0) {
                        int var19 = var18 - this.field1383.method280();
                        if (var19 > 0) {
                            this.method13(70, (byte) 1, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method498(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1283[0] != null) {
                        this.method13(75, (byte) 1, "Requesting maps");
                        this.field1383.method279(3, this.field1383.method274(0, false, 48, 47));
                        this.field1383.method279(3, this.field1383.method274(1, false, 48, 47));
                        this.field1383.method279(3, this.field1383.method274(0, false, 48, 48));
                        this.field1383.method279(3, this.field1383.method274(1, false, 48, 48));
                        this.field1383.method279(3, this.field1383.method274(0, false, 48, 49));
                        this.field1383.method279(3, this.field1383.method274(1, false, 48, 49));
                        this.field1383.method279(3, this.field1383.method274(0, false, 47, 47));
                        this.field1383.method279(3, this.field1383.method274(1, false, 47, 47));
                        this.field1383.method279(3, this.field1383.method274(0, false, 47, 48));
                        this.field1383.method279(3, this.field1383.method274(1, false, 47, 48));
                        this.field1383.method279(3, this.field1383.method274(0, false, 148, 48));
                        this.field1383.method279(3, this.field1383.method274(1, false, 148, 48));
                        int var20 = this.field1383.method280();
                        while (this.field1383.method280() > 0) {
                            int var21 = var20 - this.field1383.method280();
                            if (var21 > 0) {
                                this.method13(75, (byte) 1, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method498(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1383.method272(0, 16993);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1383.method277(3, var23);
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
                            this.field1383.method282(var25, 0, field1302, var23);
                        }
                    }
                    this.field1383.method275(0, field1429);
                    if (!field1430) {
                        int var26 = this.field1383.method272(2, 16993);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1383.method278(var27, true)) {
                                this.field1383.method282((byte) 1, 2, field1302, var27);
                            }
                        }
                    }
                    this.method13(80, (byte) 1, "Unpacking media");
                    this.field1366 = new Pix8(var6, "invback", 0);
                    this.field1368 = new Pix8(var6, "chatback", 0);
                    this.field1367 = new Pix8(var6, "mapback", 0);
                    this.field1451 = new Pix8(var6, "backbase1", 0);
                    this.field1452 = new Pix8(var6, "backbase2", 0);
                    this.field1453 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1270[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1500 = new Pix32(var6, "compass", 0);
                    this.field1330 = new Pix32(var6, "mapedge", 0);
                    this.field1330.method183(true);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1511[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1664[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1622[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1499[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1549 = new Pix32(var6, "mapmarker", 0);
                    this.field1550 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1256[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1265 = new Pix32(var6, "mapdots", 0);
                    this.field1266 = new Pix32(var6, "mapdots", 1);
                    this.field1267 = new Pix32(var6, "mapdots", 2);
                    this.field1268 = new Pix32(var6, "mapdots", 3);
                    this.field1551 = new Pix8(var6, "scrollbar", 0);
                    this.field1552 = new Pix8(var6, "scrollbar", 1);
                    this.field1665 = new Pix8(var6, "redstone1", 0);
                    this.field1666 = new Pix8(var6, "redstone2", 0);
                    this.field1667 = new Pix8(var6, "redstone3", 0);
                    this.field1668 = new Pix8(var6, "redstone1", 0);
                    this.field1668.method196(1);
                    this.field1669 = new Pix8(var6, "redstone2", 0);
                    this.field1669.method196(1);
                    this.field1590 = new Pix8(var6, "redstone1", 0);
                    this.field1590.method197(363);
                    this.field1591 = new Pix8(var6, "redstone2", 0);
                    this.field1591.method197(363);
                    this.field1592 = new Pix8(var6, "redstone3", 0);
                    this.field1592.method197(363);
                    this.field1593 = new Pix8(var6, "redstone1", 0);
                    this.field1593.method196(1);
                    this.field1593.method197(363);
                    this.field1594 = new Pix8(var6, "redstone2", 0);
                    this.field1594.method196(1);
                    this.field1594.method197(363);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1661[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1371 = new PixMap(this.method11(-290), 0, var35.field670, var35.field669);
                    var35.method184(0, 0, true);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1372 = new PixMap(this.method11(-290), 0, var36.field670, var36.field669);
                    var36.method184(0, 0, true);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1373 = new PixMap(this.method11(-290), 0, var37.field670, var37.field669);
                    var37.method184(0, 0, true);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1374 = new PixMap(this.method11(-290), 0, var38.field670, var38.field669);
                    var38.method184(0, 0, true);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1375 = new PixMap(this.method11(-290), 0, var39.field670, var39.field669);
                    var39.method184(0, 0, true);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1376 = new PixMap(this.method11(-290), 0, var40.field670, var40.field669);
                    var40.method184(0, 0, true);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1377 = new PixMap(this.method11(-290), 0, var41.field670, var41.field669);
                    var41.method184(0, 0, true);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1378 = new PixMap(this.method11(-290), 0, var42.field670, var42.field669);
                    var42.method184(0, 0, true);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1379 = new PixMap(this.method11(-290), 0, var43.field670, var43.field669);
                    var43.method184(0, 0, true);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1664[var48] != null) {
                            this.field1664[var48].method182(var45 + var47, var46 + var47, 3, var44 + var47);
                        }
                        if (this.field1511[var48] != null) {
                            this.field1511[var48].method198(var45 + var47, var46 + var47, 3, var44 + var47);
                        }
                    }
                    this.method13(83, (byte) 1, "Unpacking textures");
                    Pix3D.method169(var7, (byte) 3);
                    Pix3D.method173(0.8D, false);
                    Pix3D.method168(899, 20);
                    this.method13(86, (byte) 1, "Unpacking config");
                    SeqType.method381(false, var4);
                    LocType.method328(var4);
                    FloType.method371(false, var4);
                    ObjType.method346(var4);
                    NpcType.method339(var4);
                    IdkType.method375(false, var4);
                    SpotAnimType.method384(false, var4);
                    VarpType.method389(false, var4);
                    VarbitType.method387(false, var4);
                    ObjType.field1049 = field1429;
                    if (!field1430) {
                        this.method13(90, (byte) 1, "Unpacking sounds");
                        byte[] var49 = var9.method299("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, (byte) -93);
                        Wave.method318(false, var50);
                    }
                    this.method13(95, (byte) 1, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1396, this.field1397, this.field1398, this.field1399 };
                    Component.method32(var5, var6, var51, (byte) -71);
                    this.method13(100, (byte) 1, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1367.field680[this.field1367.field682 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1527[var52] = var53;
                        this.field1545[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1367.field680[this.field1367.field682 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1460[var56 - 5] = var57 - 25;
                        this.field1491[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method166(96, 479, (byte) 6);
                    this.field1563 = Pix3D.field645;
                    Pix3D.method166(261, 190, (byte) 6);
                    this.field1564 = Pix3D.field645;
                    Pix3D.method166(334, 512, (byte) 6);
                    this.field1565 = Pix3D.field645;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field643[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(512, false, var60, 800, 500, 334);
                    WordFilter.method391(var8);
                    this.field1508 = new MouseTracking(7, this);
                    this.method12(this.field1508, 10);
                    LocEntity.field481 = this;
                    LocType.field950 = this;
                    NpcType.field1005 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1625 + " " + this.field1435);
                    this.field1390 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILlb;I)V")
    private final void method459(int arg0, Packet arg1, int arg2) {
        int var4 = 72 / arg0;
        arg1.method239(true);
        int var5 = arg1.method240(0, 1);
        if (var5 != 0) {
            int var6 = arg1.method240(0, 2);
            if (var6 == 0) {
                this.field1321[this.field1320++] = this.field1316;
            } else if (var6 == 1) {
                int var7 = arg1.method240(0, 3);
                field1235.method111(var7, 2, false);
                int var8 = arg1.method240(0, 1);
                if (var8 == 1) {
                    this.field1321[this.field1320++] = this.field1316;
                }
            } else if (var6 == 2) {
                int var9 = arg1.method240(0, 3);
                field1235.method111(var9, 2, true);
                int var10 = arg1.method240(0, 3);
                field1235.method111(var10, 2, true);
                int var11 = arg1.method240(0, 1);
                if (var11 == 1) {
                    this.field1321[this.field1320++] = this.field1316;
                }
            } else if (var6 == 3) {
                this.field1299 = arg1.method240(0, 2);
                int var12 = arg1.method240(0, 7);
                int var13 = arg1.method240(0, 7);
                int var14 = arg1.method240(0, 1);
                field1235.method110(var12, false, var14 == 1, var13);
                int var15 = arg1.method240(0, 1);
                if (var15 == 1) {
                    this.field1321[this.field1320++] = this.field1316;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (this.field1410 == 0 && this.field1441 == 0) {
            this.field1433[this.field1571] = "Walk here";
            this.field1226[this.field1571] = 718;
            this.field1224[this.field1571] = super.field20;
            this.field1225[this.field1571] = super.field21;
            ++this.field1571;
        }
        int var2 = -1;
        if (arg0 != -31) {
            this.field1532 = null;
        }
        for (int var3 = 0; var3 < Model.field598; ++var3) {
            int var4 = Model.field599[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1356.method80(this.field1299, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method330(var8);
                    if (var9.field991 != null) {
                        var9 = var9.method338(33093);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field1410 == 1) {
                        this.field1433[this.field1571] = "Use " + this.field1414 + " with @cya@" + var9.field960;
                        this.field1226[this.field1571] = 810;
                        this.field1227[this.field1571] = var4;
                        this.field1224[this.field1571] = var5;
                        this.field1225[this.field1571] = var6;
                        ++this.field1571;
                    } else if (this.field1441 == 1) {
                        if ((this.field1443 & 4) == 4) {
                            this.field1433[this.field1571] = this.field1444 + " @cya@" + var9.field960;
                            this.field1226[this.field1571] = 899;
                            this.field1227[this.field1571] = var4;
                            this.field1224[this.field1571] = var5;
                            this.field1225[this.field1571] = var6;
                            ++this.field1571;
                        }
                    } else {
                        if (var9.field976 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field976[var10] != null) {
                                    this.field1433[this.field1571] = var9.field976[var10] + " @cya@" + var9.field960;
                                    if (var10 == 0) {
                                        this.field1226[this.field1571] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1226[this.field1571] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1226[this.field1571] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1226[this.field1571] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1226[this.field1571] = 1071;
                                    }
                                    this.field1227[this.field1571] = var4;
                                    this.field1224[this.field1571] = var5;
                                    this.field1225[this.field1571] = var6;
                                    ++this.field1571;
                                }
                            }
                        }
                        this.field1433[this.field1571] = "Examine @cya@" + var9.field960;
                        this.field1226[this.field1571] = 1381;
                        this.field1227[this.field1571] = var9.field957 << 14;
                        this.field1224[this.field1571] = var5;
                        this.field1225[this.field1571] = var6;
                        ++this.field1571;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1646[var8];
                    if (var11.field450.field1014 == 1 && (var11.field394 & 127) == 64 && (var11.field395 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1647; ++var12) {
                            NpcEntity var15 = this.field1646[this.field1648[var12]];
                            if (var15 != null && var11 != var15 && var15.field450.field1014 == 1 && var11.field394 == var15.field394 && var11.field395 == var15.field395) {
                                this.method526(var15.field450, this.field1648[var12], var5, var6, -769);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1318; ++var13) {
                            PlayerEntity var14 = this.field1317[this.field1319[var13]];
                            if (var14 != null && var11.field394 == var14.field394 && var11.field395 == var14.field395) {
                                this.method515(var6, var5, var14, this.field1319[var13], false);
                            }
                        }
                    }
                    this.method526(var11.field450, var8, var5, var6, -769);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1317[var8];
                    if ((var16.field394 & 127) == 64 && (var16.field395 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1647; ++var17) {
                            NpcEntity var20 = this.field1646[this.field1648[var17]];
                            if (var20 != null && var20.field450.field1014 == 1 && var16.field394 == var20.field394 && var16.field395 == var20.field395) {
                                this.method526(var20.field450, this.field1648[var17], var5, var6, -769);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1318; ++var18) {
                            PlayerEntity var19 = this.field1317[this.field1319[var18]];
                            if (var19 != null && var16 != var19 && var16.field394 == var19.field394 && var16.field395 == var19.field395) {
                                this.method515(var6, var5, var19, this.field1319[var18], false);
                            }
                        }
                    }
                    this.method515(var6, var5, var16, var8, false);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1532[this.field1299][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method249(-139); var22 != null; var22 = (ObjStackEntity) var21.method251((byte) 42)) {
                            ObjType var23 = ObjType.method348(var22.field495);
                            if (this.field1410 == 1) {
                                this.field1433[this.field1571] = "Use " + this.field1414 + " with @lre@" + var23.field1052;
                                this.field1226[this.field1571] = 111;
                                this.field1227[this.field1571] = var22.field495;
                                this.field1224[this.field1571] = var5;
                                this.field1225[this.field1571] = var6;
                                ++this.field1571;
                            } else if (this.field1441 == 1) {
                                if ((this.field1443 & 1) == 1) {
                                    this.field1433[this.field1571] = this.field1444 + " @lre@" + var23.field1052;
                                    this.field1226[this.field1571] = 370;
                                    this.field1227[this.field1571] = var22.field495;
                                    this.field1224[this.field1571] = var5;
                                    this.field1225[this.field1571] = var6;
                                    ++this.field1571;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1066 != null && var23.field1066[var24] != null) {
                                        this.field1433[this.field1571] = var23.field1066[var24] + " @lre@" + var23.field1052;
                                        if (var24 == 0) {
                                            this.field1226[this.field1571] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1226[this.field1571] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1226[this.field1571] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1226[this.field1571] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1226[this.field1571] = 662;
                                        }
                                        this.field1227[this.field1571] = var22.field495;
                                        this.field1224[this.field1571] = var5;
                                        this.field1225[this.field1571] = var6;
                                        ++this.field1571;
                                    } else if (var24 == 2) {
                                        this.field1433[this.field1571] = "Take @lre@" + var23.field1052;
                                        this.field1226[this.field1571] = 617;
                                        this.field1227[this.field1571] = var22.field495;
                                        this.field1224[this.field1571] = var5;
                                        this.field1225[this.field1571] = var6;
                                        ++this.field1571;
                                    }
                                }
                                this.field1433[this.field1571] = "Examine @lre@" + var23.field1052;
                                this.field1226[this.field1571] = 1152;
                                this.field1227[this.field1571] = var22.field495;
                                this.field1224[this.field1571] = var5;
                                this.field1225[this.field1571] = var6;
                                ++this.field1571;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method461(int arg0) {
        this.field1614.method218(-744, 165);
        if (arg0 < 0) {
            if (this.field1329 != -1) {
                this.field1329 = -1;
                this.field1440 = true;
                this.field1663 = false;
                this.field1498 = true;
            }
            if (this.field1236 != -1) {
                this.field1236 = -1;
                this.field1604 = true;
                this.field1663 = false;
            }
            this.field1495 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method462(int arg0) {
        this.field1336.method258(this.field1239);
        if (this.field1269 == 2) {
            byte[] var2 = this.field1367.field680;
            int[] var3 = Pix2D.field621;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1500.method190(0, 0, 33, this.field1545, (byte) 6, this.field1527, 33, 256, this.field1641, 25, 25);
            this.field1337.method258(this.field1239);
        } else {
            int var6 = this.field1641 + this.field1466 & 2047;
            int var7 = field1235.field394 / 32 + 48;
            int var8 = 464 - field1235.field395 / 32;
            this.field1249.method190(5, 25, 151, this.field1491, (byte) 6, this.field1460, 146, this.field1352 + 256, var6, var8, var7);
            this.field1500.method190(0, 0, 33, this.field1545, (byte) 6, this.field1527, 33, 256, this.field1641, 25, 25);
            for (int var9 = 0; var9 < this.field1519; ++var9) {
                int var38 = this.field1520[var9] * 4 + 2 - field1235.field394 / 32;
                int var39 = this.field1521[var9] * 4 + 2 - field1235.field395 / 32;
                this.method440(0, this.field1554[var9], var39, var38);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var34 = 0; var34 < 104; ++var34) {
                    LinkList var35 = this.field1532[this.field1299][var10][var34];
                    if (var35 != null) {
                        int var36 = var10 * 4 + 2 - field1235.field394 / 32;
                        int var37 = var34 * 4 + 2 - field1235.field395 / 32;
                        this.method440(0, this.field1265, var37, var36);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field1647; ++var11) {
                NpcEntity var30 = this.field1646[this.field1648[var11]];
                if (var30 != null && var30.method113(8)) {
                    NpcType var31 = var30.field450;
                    if (var31.field1037 != null) {
                        var31 = var31.method345(false);
                    }
                    if (var31 != null && var31.field1028) {
                        int var32 = var30.field394 / 32 - field1235.field394 / 32;
                        int var33 = var30.field395 / 32 - field1235.field395 / 32;
                        this.method440(0, this.field1266, var33, var32);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1318; ++var12) {
                PlayerEntity var23 = this.field1317[this.field1319[var12]];
                if (var23 != null && var23.method113(8)) {
                    int var24 = var23.field394 / 32 - field1235.field394 / 32;
                    int var25 = var23.field395 / 32 - field1235.field395 / 32;
                    boolean var26 = false;
                    long var27 = JString.method300(var23.field456);
                    for (int var29 = 0; var29 < this.field1557; ++var29) {
                        if (this.field1230[var29] == var27 && this.field1355[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    if (field1235.field479 != 0 && var23.field479 != 0) {
                        if (field1235.field479 == var23.field479) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (var26) {
                        this.method440(0, this.field1268, var25, var24);
                    } else {
                        this.method440(0, this.field1267, var25, var24);
                    }
                }
            }
            if (this.field1415 != 0 && field1314 % 20 < 10) {
                if (this.field1415 == 1 && this.field1331 >= 0 && this.field1331 < this.field1646.length) {
                    NpcEntity var13 = this.field1646[this.field1331];
                    if (var13 != null) {
                        int var14 = var13.field394 / 32 - field1235.field394 / 32;
                        int var15 = var13.field395 / 32 - field1235.field395 / 32;
                        this.method442(this.field1550, var14, var15, false);
                    }
                }
                if (this.field1415 == 2) {
                    int var16 = (this.field1250 - this.field1573) * 4 + 2 - field1235.field394 / 32;
                    int var17 = (this.field1251 - this.field1574) * 4 + 2 - field1235.field395 / 32;
                    this.method442(this.field1550, var16, var17, false);
                }
                if (this.field1415 == 10 && this.field1454 >= 0 && this.field1454 < this.field1317.length) {
                    PlayerEntity var18 = this.field1317[this.field1454];
                    if (var18 != null) {
                        int var19 = var18.field394 / 32 - field1235.field394 / 32;
                        int var20 = var18.field395 / 32 - field1235.field395 / 32;
                        this.method442(this.field1550, var19, var20, false);
                    }
                }
            }
            if (this.field1247 != 0) {
                int var21 = this.field1247 * 4 + 2 - field1235.field394 / 32;
                int var22 = this.field1248 * 4 + 2 - field1235.field395 / 32;
                this.method440(0, this.field1549, var22, var21);
            }
            Pix2D.method157(16777215, 3, 78, 3, (byte) 5, 97);
            this.field1337.method258(this.field1239);
            if (arg0 != 0) {
                this.field1532 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)Z")
    public final boolean method463(byte arg0) {
        if (arg0 != 7) {
            this.field1560 = !this.field1560;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method464(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1273 = !field1273;
        }
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

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method465(boolean arg0) {
        this.field1403 = 0;
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = (field1235.field394 >> 7) + this.field1573;
        int var4 = (field1235.field395 >> 7) + this.field1574;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field1403 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field1403 = 1;
        }
        if (this.field1403 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field1403 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method466(byte arg0) {
        if (this.field1338 == null) {
            this.method487(0);
            super.field13 = null;
            this.field1651 = null;
            this.field1652 = null;
            this.field1653 = null;
            this.field1654 = null;
            this.field1655 = null;
            this.field1656 = null;
            this.field1657 = null;
            this.field1658 = null;
            this.field1659 = null;
            this.field1338 = new PixMap(this.method11(-290), 0, 96, 479);
            this.field1336 = new PixMap(this.method11(-290), 0, 156, 172);
            if (arg0 != -125) {
                this.field1289 = -1;
            }
            Pix2D.method155(-843);
            this.field1367.method199(0, 0, 0);
            this.field1335 = new PixMap(this.method11(-290), 0, 261, 190);
            this.field1337 = new PixMap(this.method11(-290), 0, 334, 512);
            Pix2D.method155(-843);
            this.field1632 = new PixMap(this.method11(-290), 0, 50, 496);
            this.field1633 = new PixMap(this.method11(-290), 0, 37, 269);
            this.field1634 = new PixMap(this.method11(-290), 0, 45, 249);
            this.field1365 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method467(boolean arg0) {
        this.field1619 &= arg0;
        if (field1430 && this.field1393 == 2 && World.field42 != this.field1299) {
            this.field1337.method258(this.field1239);
            this.field1397.method202("Loading - please wait.", 151, 0, (byte) 0, 257);
            this.field1397.method202("Loading - please wait.", 150, 16777215, (byte) 0, 256);
            this.field1337.method259(4, super.field12, -38524, 4);
            this.field1393 = 1;
            this.field1455 = System.currentTimeMillis();
        }
        if (this.field1393 == 1) {
            int var2 = this.method468(true);
            if (var2 != 0 && System.currentTimeMillis() - this.field1455 > 360000L) {
                signlink.reporterror(this.field1474 + " glcfb " + this.field1404 + "," + var2 + "," + field1430 + "," + this.field1283[0] + "," + this.field1383.method280() + "," + this.field1299 + "," + this.field1369 + "," + this.field1370);
                this.field1455 = System.currentTimeMillis();
            }
        }
        if (this.field1393 == 2 && this.field1562 != this.field1299) {
            this.field1562 = this.field1299;
            this.method432(2, this.field1299);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)I")
    public final int method468(boolean arg0) {
        for (int var2 = 0; var2 < this.field1324.length; ++var2) {
            if (this.field1324[var2] == null && this.field1233[var2] != -1) {
                return -1;
            }
            if (this.field1241[var2] == null && this.field1234[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1324.length; ++var4) {
            byte[] var5 = this.field1241[var4];
            if (var5 != null) {
                int var6 = (this.field1232[var4] >> 8) * 64 - this.field1573;
                int var7 = (this.field1232[var4] & 255) * 64 - this.field1574;
                var3 &= World.method16(var6, var7, 0, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1384) {
            return -4;
        } else {
            this.field1393 = 2;
            World.field42 = this.field1299;
            if (!arg0) {
                this.field1614.method219(37);
            }
            this.method505(this.field1533);
            this.field1614.method218(-744, 81);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;BI)V")
    private final void method469(Packet arg0, byte arg1, int arg2) {
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        for (int var6 = 0; var6 < this.field1320; ++var6) {
            int var7 = this.field1321[var6];
            PlayerEntity var8 = this.field1317[var7];
            int var9 = arg0.method229();
            if ((var9 & 128) == 128) {
                var9 += arg0.method229() << 8;
            }
            this.method439(-26, arg0, var7, var8, var9);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method470(byte arg0) {
        if (this.field1571 >= 2 || this.field1410 != 0 || this.field1441 != 0) {
            if (arg0 == 0) {
                boolean var2 = false;
            } else {
                this.field1532 = null;
            }
            String var3;
            if (this.field1410 == 1 && this.field1571 < 2) {
                var3 = "Use " + this.field1414 + " with...";
            } else if (this.field1441 == 1 && this.field1571 < 2) {
                var3 = this.field1444 + "...";
            } else {
                var3 = this.field1433[this.field1571 - 1];
            }
            if (this.field1571 > 2) {
                var3 = var3 + "@whi@ / " + (this.field1571 - 2) + " more options";
            }
            this.field1398.method211(15, 16777215, field1314 / 1000, true, var3, 7, 4);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method471(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1385[(var2 - 2 << 7) + var3] = 255;
            }
        }
        this.field1288 += arg0;
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1385[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1386[var14] = (this.field1385[var14 - 1] + this.field1385[var14 + 1] + this.field1385[var14 - 128] + this.field1385[var14 + 128]) / 4;
            }
        }
        this.field1530 += 128;
        if (this.field1530 > this.field1583.length) {
            this.field1530 -= this.field1583.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method481(16169, this.field1437[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1386[var11 + 128] - this.field1583[this.field1530 + var11 & this.field1583.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1385[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1501[var8] = this.field1501[var8 + 1];
        }
        this.field1501[var2 - 1] = (int) (Math.sin((double) field1314 / 14.0D) * 16.0D + Math.sin((double) field1314 / 15.0D) * 14.0D + Math.sin((double) field1314 / 16.0D) * 12.0D);
        if (this.field1400 > 0) {
            this.field1400 -= 4;
        }
        if (this.field1401 > 0) {
            this.field1401 -= 4;
        }
        if (this.field1400 == 0 && this.field1401 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1400 = 1024;
            }
            if (var9 == 1) {
                this.field1401 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1339 && !this.field1390 && !this.field1264) {
            ++field1577;
            if (arg0 != 9) {
                this.field1532 = null;
            }
            if (!this.field1619) {
                this.method490((byte) 9, false);
            } else {
                this.method536(-24615);
            }
            this.field1351 = 0;
        } else {
            this.method538((byte) 4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method472(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1470 = "";
                this.field1471 = "Connecting to server...";
                this.method490((byte) 9, true);
            }
            this.field1615 = new ClientStream((byte) -52, this.method518(field1428 + 43594), this);
            long var4 = JString.method300(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1614.field713 = 0;
            this.field1614.method219(14);
            this.field1614.method219(var6);
            this.field1615.method42(0, 2, -978, this.field1614.field712);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1615.method39();
            }
            int var8 = this.field1615.method39();
            int var9 = var8;
            if (var8 == 0) {
                this.field1615.method41(this.field1631.field712, 0, 8);
                this.field1631.field713 = 0;
                this.field1404 = this.field1631.method235((byte) 5);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1404 >> 32), (int) this.field1404 };
                this.field1614.field713 = 0;
                this.field1614.method219(10);
                this.field1614.method223(var10[0]);
                this.field1614.method223(var10[1]);
                this.field1614.method223(var10[2]);
                this.field1614.method223(var10[3]);
                this.field1614.method223(signlink.uid);
                this.field1614.method226(arg0);
                this.field1614.method226(arg1);
                this.field1614.method244(field1617, field1380, 0);
                this.field1434.field713 = 0;
                if (arg2) {
                    this.field1434.method219(18);
                } else {
                    this.field1434.method219(16);
                }
                this.field1434.method219(this.field1614.field713 + 36 + 1 + 1 + 2);
                this.field1434.method219(255);
                this.field1434.method220(298);
                this.field1434.method219(field1430 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field1434.method223(this.field1566[var11]);
                }
                this.field1434.method227(false, 0, this.field1614.field712, this.field1614.field713);
                this.field1614.field717 = new Isaac(var10, 668);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field1293 = new Isaac(var10, 668);
                this.field1615.method42(0, this.field1434.field713, -978, this.field1434.field712);
                var8 = this.field1615.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method472(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1479 = this.field1615.method39();
                field1361 = this.field1615.method39() == 1;
                this.field1503 = 0L;
                this.field1639 = 0;
                this.field1508.field999 = 0;
                super.field17 = true;
                this.field1644 = true;
                this.field1619 = true;
                this.field1614.field713 = 0;
                this.field1631.field713 = 0;
                this.field1289 = -1;
                this.field1546 = -1;
                this.field1547 = -1;
                this.field1548 = -1;
                this.field1288 = 0;
                this.field1290 = 0;
                this.field1402 = 0;
                this.field1292 = 0;
                this.field1415 = 0;
                this.field1571 = 0;
                this.field1597 = false;
                super.field18 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field1507[var13] = null;
                }
                this.field1410 = 0;
                this.field1441 = 0;
                this.field1393 = 0;
                this.field1420 = 0;
                this.field1332 = (int) (Math.random() * 100.0D) - 50;
                this.field1349 = (int) (Math.random() * 110.0D) - 55;
                this.field1310 = (int) (Math.random() * 80.0D) - 40;
                this.field1466 = (int) (Math.random() * 120.0D) - 60;
                this.field1352 = (int) (Math.random() * 30.0D) - 20;
                this.field1641 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1269 = 0;
                this.field1562 = -1;
                this.field1247 = 0;
                this.field1248 = 0;
                this.field1318 = 0;
                this.field1647 = 0;
                for (int var14 = 0; var14 < this.field1315; ++var14) {
                    this.field1317[var14] = null;
                    this.field1322[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field1646[var15] = null;
                }
                field1235 = this.field1317[this.field1316] = new PlayerEntity();
                this.field1621.method252();
                this.field1409.method252();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field1532[var16][var17][var18] = null;
                        }
                    }
                }
                this.field1391 = new LinkList(-16188);
                this.field1558 = 0;
                this.field1557 = 0;
                this.field1472 = -1;
                this.field1236 = -1;
                this.field1495 = -1;
                this.field1329 = -1;
                this.field1517 = -1;
                this.field1663 = false;
                this.field1381 = 3;
                this.field1490 = false;
                this.field1597 = false;
                this.field1418 = false;
                this.field1298 = null;
                this.field1272 = 0;
                this.field1323 = -1;
                this.field1282 = true;
                this.method560(this.field1312);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1436[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field1568[var20] = null;
                    this.field1569[var20] = false;
                }
                field1228 = 0;
                field1649 = 0;
                field1448 = 0;
                field1348 = 0;
                field1340 = 0;
                field1456 = 0;
                field1279 = 0;
                field1555 = 0;
                field1487 = 0;
                field1473 = 0;
                this.method466((byte) -125);
            } else if (var8 == 3) {
                this.field1470 = "";
                this.field1471 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1470 = "Your account has been disabled.";
                this.field1471 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1470 = "Your account is already logged in.";
                this.field1471 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1470 = "RuneScape has been updated!";
                this.field1471 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1470 = "This world is full.";
                this.field1471 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1470 = "Unable to connect.";
                this.field1471 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1470 = "Login limit exceeded.";
                this.field1471 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1470 = "Unable to connect.";
                this.field1471 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1471 = "Login server rejected session.";
                this.field1471 = "Please try again.";
            } else if (var8 == 12) {
                this.field1470 = "You need a members account to login to this world.";
                this.field1471 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1470 = "Could not complete login.";
                this.field1471 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1470 = "The server is being updated.";
                this.field1471 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1619 = true;
                this.field1614.field713 = 0;
                this.field1631.field713 = 0;
                this.field1289 = -1;
                this.field1546 = -1;
                this.field1547 = -1;
                this.field1548 = -1;
                this.field1288 = 0;
                this.field1290 = 0;
                this.field1402 = 0;
                this.field1571 = 0;
                this.field1597 = false;
                this.field1455 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1470 = "Login attempts exceeded.";
                this.field1471 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1470 = "You are standing in a members-only area.";
                this.field1471 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1470 = "Invalid loginserver requested";
                this.field1471 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field1603 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field1603;
                            this.method472(arg0, arg1, arg2);
                        } else {
                            this.field1470 = "No response from loginserver";
                            this.field1471 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field1470 = "No response from server";
                        this.field1471 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field1470 = "Unexpected server response";
                    this.field1471 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field1615.method39(); var21 >= 0; --var21) {
                    this.field1470 = "You have only just left another world";
                    this.field1471 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method490((byte) 9, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method472(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field1470 = "";
            this.field1471 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method473(int arg0) {
        int var2 = this.field1274 * 128 + 64;
        int var3 = this.field1275 * 128 + 64;
        int var4 = this.method551(this.field1299, true, var3, var2) - this.field1276;
        if (this.field1608 < var2) {
            this.field1608 += (var2 - this.field1608) * this.field1278 / 1000 + this.field1277;
            if (this.field1608 > var2) {
                this.field1608 = var2;
            }
        }
        if (this.field1608 > var2) {
            this.field1608 -= (this.field1608 - var2) * this.field1278 / 1000 + this.field1277;
            if (this.field1608 < var2) {
                this.field1608 = var2;
            }
        }
        if (this.field1609 < var4) {
            this.field1609 += (var4 - this.field1609) * this.field1278 / 1000 + this.field1277;
            if (this.field1609 > var4) {
                this.field1609 = var4;
            }
        }
        if (this.field1609 > var4) {
            this.field1609 -= (this.field1609 - var4) * this.field1278 / 1000 + this.field1277;
            if (this.field1609 < var4) {
                this.field1609 = var4;
            }
        }
        if (this.field1610 < var3) {
            this.field1610 += (var3 - this.field1610) * this.field1278 / 1000 + this.field1277;
            if (this.field1610 > var3) {
                this.field1610 = var3;
            }
        }
        if (this.field1610 > var3) {
            this.field1610 -= (this.field1610 - var3) * this.field1278 / 1000 + this.field1277;
            if (this.field1610 < var3) {
                this.field1610 = var3;
            }
        }
        int var5 = this.field1585 * 128 + 64;
        int var6 = this.field1586 * 128 + 64;
        int var7 = this.method551(this.field1299, true, var6, var5) - this.field1587;
        if (arg0 < 0) {
            int var8 = var5 - this.field1608;
            int var9 = var7 - this.field1609;
            int var10 = var6 - this.field1610;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field1611 < var12) {
                this.field1611 += (var12 - this.field1611) * this.field1589 / 1000 + this.field1588;
                if (this.field1611 > var12) {
                    this.field1611 = var12;
                }
            }
            if (this.field1611 > var12) {
                this.field1611 -= (this.field1611 - var12) * this.field1589 / 1000 + this.field1588;
                if (this.field1611 < var12) {
                    this.field1611 = var12;
                }
            }
            int var14 = var13 - this.field1612;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field1612 += this.field1589 * var14 / 1000 + this.field1588;
                this.field1612 &= 2047;
            }
            if (var14 < 0) {
                this.field1612 -= -var14 * this.field1589 / 1000 + this.field1588;
                this.field1612 &= 2047;
            }
            int var15 = var13 - this.field1612;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field1612 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method474(int arg0, boolean arg1) {
        int var3 = VarpType.field1190[arg0].field1198;
        if (!arg1) {
            this.field1614.method219(87);
        }
        if (var3 != 0) {
            int var4 = this.field1416[arg0];
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
                ObjType.field1091.method103();
                this.field1365 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1627;
                if (var4 == 0) {
                    this.method475(-34188, this.field1627, 0);
                    this.field1627 = true;
                }
                if (var4 == 1) {
                    this.method475(-34188, this.field1627, -400);
                    this.field1627 = true;
                }
                if (var4 == 2) {
                    this.method475(-34188, this.field1627, -800);
                    this.field1627 = true;
                }
                if (var4 == 3) {
                    this.method475(-34188, this.field1627, -1200);
                    this.field1627 = true;
                }
                if (var4 == 4) {
                    this.field1627 = false;
                }
                if (this.field1627 != var5 && !field1430) {
                    if (this.field1627) {
                        this.field1463 = this.field1480;
                        this.field1464 = true;
                        this.field1383.method279(2, this.field1463);
                    } else {
                        this.method521(-585);
                    }
                    this.field1313 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1628 = true;
                    this.method501(0, 0);
                }
                if (var4 == 1) {
                    this.field1628 = true;
                    this.method501(-400, 0);
                }
                if (var4 == 2) {
                    this.field1628 = true;
                    this.method501(-800, 0);
                }
                if (var4 == 3) {
                    this.field1628 = true;
                    this.method501(-1200, 0);
                }
                if (var4 == 4) {
                    this.field1628 = false;
                }
            }
            if (var3 == 5) {
                this.field1281 = var4;
            }
            if (var3 == 6) {
                this.field1556 = var4;
            }
            if (var3 == 8) {
                this.field1578 = var4;
                this.field1604 = true;
            }
            if (var3 == 9) {
                this.field1334 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method475(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg0 != -34188) {
            this.field1531 = !this.field1531;
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method476(int arg0, int arg1) {
        LinkList var3 = this.field1532[this.field1299][arg0][arg1];
        if (var3 == null) {
            this.field1356.method71(this.field1299, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method248(); var6 != null; var6 = (ObjStackEntity) var3.method250(8)) {
                ObjType var11 = ObjType.method348(var6.field495);
                int var12 = var11.field1064;
                if (var11.field1063) {
                    var12 = (var6.field496 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method246(0, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method248(); var9 != null; var9 = (ObjStackEntity) var3.method250(8)) {
                if (var5.field495 != var9.field495 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field495 != var9.field495 && var7.field495 != var9.field495 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1356.method57(var10, this.method551(this.field1299, true, arg1 * 128 + 64, arg0 * 128 + 64), this.field1299, arg0, (byte) 3, arg1, var7, var5, var8);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method477(boolean arg0, long arg1) {
        this.field1619 &= arg0;
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1557; ++var4) {
                if (this.field1230[var4] == arg1) {
                    --this.field1557;
                    this.field1440 = true;
                    for (int var5 = var4; var5 < this.field1557; ++var5) {
                        this.field1461[var5] = this.field1461[var5 + 1];
                        this.field1355[var5] = this.field1355[var5 + 1];
                        this.field1230[var5] = this.field1230[var5 + 1];
                    }
                    this.field1614.method218(-744, 160);
                    this.field1614.method225(arg1, (byte) 3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)I")
    public final int method478(int arg0) {
        int var2 = 3;
        if (arg0 >= 0) {
            return this.field1445;
        } else {
            if (this.field1611 < 310) {
                int var3 = this.field1608 >> 7;
                int var4 = this.field1610 >> 7;
                int var5 = field1235.field394 >> 7;
                int var6 = field1235.field395 >> 7;
                if ((this.field1489[this.field1299][var3][var4] & 4) != 0) {
                    var2 = this.field1299;
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
                        if ((this.field1489[this.field1299][var3][var4] & 4) != 0) {
                            var2 = this.field1299;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1489[this.field1299][var3][var4] & 4) != 0) {
                                var2 = this.field1299;
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
                        if ((this.field1489[this.field1299][var3][var4] & 4) != 0) {
                            var2 = this.field1299;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1489[this.field1299][var3][var4] & 4) != 0) {
                                var2 = this.field1299;
                            }
                        }
                    }
                }
            }
            if ((this.field1489[this.field1299][field1235.field394 >> 7][field1235.field395 >> 7] & 4) != 0) {
                var2 = this.field1299;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)I")
    public final int method479(int arg0) {
        int var2 = this.method551(this.field1299, true, this.field1610, this.field1608);
        this.field1288 += arg0;
        return var2 - this.field1609 < 800 && (this.field1489[this.field1299][this.field1608 >> 7][this.field1610 >> 7] & 4) != 0 ? this.field1299 : 3;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1660) {
            this.method520(-797);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method480(byte arg0) {
        int var2 = this.field1398.method204((byte) 0, "Choose Option");
        if (arg0 != 9) {
            this.field1533 = 469;
        }
        for (int var3 = 0; var3 < this.field1571; ++var3) {
            int var11 = this.field1398.method204((byte) 0, this.field1433[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1571 * 15 + 21;
        if (super.field27 > 4 && super.field28 > 4 && super.field27 < 516 && super.field28 < 338) {
            int var5 = super.field27 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field28 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1597 = true;
            this.field1343 = 0;
            this.field1344 = var5;
            this.field1345 = var6;
            this.field1346 = var2;
            this.field1347 = this.field1571 * 15 + 22;
        }
        if (super.field27 > 553 && super.field28 > 205 && super.field27 < 743 && super.field28 < 466) {
            int var7 = super.field27 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field28 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1597 = true;
            this.field1343 = 1;
            this.field1344 = var7;
            this.field1345 = var8;
            this.field1346 = var2;
            this.field1347 = this.field1571 * 15 + 22;
        }
        if (super.field27 > 17 && super.field28 > 357 && super.field27 < 496 && super.field28 < 453) {
            int var9 = super.field27 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field28 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1597 = true;
            this.field1343 = 2;
            this.field1344 = var9;
            this.field1345 = var10;
            this.field1346 = var2;
            this.field1347 = this.field1571 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;)V")
    public final void method481(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1583.length; ++var4) {
            this.field1583[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1583[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 16169) {
            this.field1614.method219(180);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1584[var16] = (this.field1583[var16 - 1] + this.field1583[var16 + 1] + this.field1583[var16 - 128] + this.field1583[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1583;
            this.field1583 = this.field1584;
            this.field1584 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field683; ++var8) {
                for (int var9 = 0; var9 < arg1.field682; ++var9) {
                    if (arg1.field680[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field684;
                        int var11 = var8 + 16 + arg1.field685;
                        int var12 = (var11 << 7) + var10;
                        this.field1583[var12] = 0;
                    }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILy;)V")
    public final void method482(boolean arg0, int arg1, PathingEntity arg2) {
        this.field1619 &= arg0;
        this.method483(902, arg2.field394, arg1, arg2.field395);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method551(this.field1299, true, arg3, arg1) - arg2;
            int var6 = arg1 - this.field1608;
            if (arg0 <= 0) {
                field1273 = !field1273;
            }
            int var7 = var5 - this.field1609;
            int var8 = arg3 - this.field1610;
            int var9 = Model.field600[this.field1611];
            int var10 = Model.field601[this.field1611];
            int var11 = Model.field600[this.field1612];
            int var12 = Model.field601[this.field1612];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1635 = (var13 << 9) / var17 + Pix3D.field639;
                this.field1636 = (var16 << 9) / var17 + Pix3D.field640;
            } else {
                this.field1635 = -1;
                this.field1636 = -1;
            }
        } else {
            this.field1635 = -1;
            this.field1636 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method484(int arg0) {
        if (arg0 <= 0) {
            this.field1614.method219(207);
        }
        if (this.field1578 != 0) {
            int var2 = 0;
            if (this.field1402 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1507[var3] != null) {
                    int var4 = this.field1505[var3];
                    String var5 = this.field1506[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1357 == 0 || this.field1357 == 1 && this.method557((byte) 9, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field20 > 4 && super.field21 - 4 > var9 - 10 && super.field21 - 4 <= var9 + 3) {
                            int var10 = this.field1397.method204((byte) 0, "From:  " + var5 + this.field1507[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field20 < var10 + 4) {
                                if (this.field1479 >= 1) {
                                    this.field1433[this.field1571] = "Report abuse @whi@" + var5;
                                    this.field1226[this.field1571] = 2524;
                                    ++this.field1571;
                                }
                                this.field1433[this.field1571] = "Add ignore @whi@" + var5;
                                this.field1226[this.field1571] = 2047;
                                ++this.field1571;
                                this.field1433[this.field1571] = "Add friend @whi@" + var5;
                                this.field1226[this.field1571] = 2605;
                                ++this.field1571;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1357 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method485(boolean arg0) {
        this.method443(-7957);
        if (this.field1602 == 1) {
            this.field1256[this.field1601 / 100].method186(this.field1599 - 8 - 4, 0, this.field1600 - 8 - 4);
        }
        if (this.field1602 == 2) {
            this.field1256[this.field1601 / 100 + 4].method186(this.field1599 - 8 - 4, 0, this.field1600 - 8 - 4);
            ++field1240;
            if (field1240 > 57) {
                field1240 = 0;
                this.field1614.method218(-744, 34);
            }
        }
        if (this.field1517 != -1) {
            this.method552(this.field1526, this.field1517, (byte) 3);
            this.method522(0, 0, Component.field67[this.field1517], 0, true);
        }
        if (this.field1495 != -1) {
            this.method552(this.field1526, this.field1495, (byte) 3);
            this.method522(0, 0, Component.field67[this.field1495], 0, true);
        }
        this.method465(false);
        if (!arg0) {
            this.field1289 = -1;
        }
        if (!this.field1597) {
            this.method444(false);
            this.method470((byte) 0);
        } else if (this.field1343 == 0) {
            this.method506(true);
        }
        if (this.field1272 == 1) {
            this.field1499[1].method186(472, 0, 296);
        }
        if (field1424) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field8 < 15) {
                var4 = 16711680;
            }
            this.field1397.method201("Fps:" + super.field8, var2, var3, true, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field1430) {
                int var8 = 16711680;
            }
            this.field1397.method201("Mem:" + var6 + "k", var2, var12, true, 16776960);
            var12 += 15;
        }
        if (this.field1402 != 0) {
            int var9 = this.field1402 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field1397.method206("System update in: " + var10 + ":0" + var11, false, 329, 4, 16776960);
            } else {
                this.field1397.method206("System update in: " + var10 + ":" + var11, false, 329, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method486(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.field1614.method219(209);
        }
        int var5 = 256 - arg1;
        return ((arg2 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field1523 = false;
        while (this.field1482) {
            this.field1523 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1606 = null;
        this.field1607 = null;
        this.field1437 = null;
        this.field1243 = null;
        this.field1244 = null;
        this.field1245 = null;
        this.field1246 = null;
        this.field1583 = null;
        if (arg0 < 0 || arg0 > 0) {
            this.field1289 = this.field1631.method229();
        }
        this.field1584 = null;
        this.field1385 = null;
        this.field1386 = null;
        this.field1477 = null;
        this.field1478 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZIIBII)Z")
    public final boolean method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field1326[var15][var36] = 0;
                this.field1255[var15][var36] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg0;
        this.field1326[arg1][arg0] = 99;
        this.field1255[arg1][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1673[var18] = arg1;
        int var37 = var18 + 1;
        this.field1674[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field1673.length;
        int[][] var22 = this.field1382[this.field1299].field1103;
        if (this.field1417 == arg9) {
            boolean var23 = false;
        } else {
            field1613 = this.field1293.method295();
        }
        while (var37 != var19) {
            var16 = this.field1673[var19];
            var17 = this.field1674[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg4 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field1382[this.field1299].method368(6, var17, arg5 - 1, var16, arg11, arg4, arg3)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field1382[this.field1299].method369(var17, arg5 - 1, (byte) -94, arg3, arg11, arg4, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg7 != 0 && this.field1382[this.field1299].method370(arg2, this.field1341, arg3, arg4, var16, arg7, arg8, var17)) {
                var20 = true;
                break;
            }
            int var35 = this.field1255[var16][var17] + 1;
            if (var16 > 0 && this.field1326[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1673[var37] = var16 - 1;
                this.field1674[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 - 1][var17] = 2;
                this.field1255[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field1326[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1673[var37] = var16 + 1;
                this.field1674[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 + 1][var17] = 8;
                this.field1255[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field1326[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1673[var37] = var16;
                this.field1674[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16][var17 - 1] = 1;
                this.field1255[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field1326[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1673[var37] = var16;
                this.field1674[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16][var17 + 1] = 4;
                this.field1255[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field1326[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1673[var37] = var16 - 1;
                this.field1674[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 - 1][var17 - 1] = 3;
                this.field1255[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1326[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1673[var37] = var16 + 1;
                this.field1674[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 + 1][var17 - 1] = 9;
                this.field1255[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1326[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1673[var37] = var16 - 1;
                this.field1674[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 - 1][var17 + 1] = 6;
                this.field1255[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1326[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1673[var37] = var16 + 1;
                this.field1674[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field1326[var16 + 1][var17 + 1] = 12;
                this.field1255[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field1596 = 0;
        if (!var20) {
            if (arg6) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg3 - var25; var26 <= arg3 + var25; ++var26) {
                        for (int var27 = arg4 - var25; var27 <= arg4 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field1255[var26][var27] < var24) {
                                var24 = this.field1255[var26][var27];
                                var16 = var26;
                                var17 = var27;
                                this.field1596 = 1;
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
        this.field1673[var28] = var16;
        int var38 = var28 + 1;
        this.field1674[var28] = var17;
        int var29;
        int var30 = var29 = this.field1326[var16][var17];
        while (arg1 != var16 || arg0 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field1673[var38] = var16;
                this.field1674[var38++] = var17;
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
            var30 = this.field1326[var16][var17];
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
            int var32 = this.field1673[var38];
            int var33 = this.field1674[var38];
            if (arg10 == 0) {
                this.field1614.method218(-744, 141);
                this.field1614.method219(var31 + var31 + 3);
            }
            if (arg10 == 1) {
                this.field1614.method218(-744, 196);
                this.field1614.method219(var31 + var31 + 3 + 14);
            }
            if (arg10 == 2) {
                this.field1614.method218(-744, 70);
                this.field1614.method219(var31 + var31 + 3);
            }
            if (super.field30[5] == 1) {
                this.field1614.method219(1);
            } else {
                this.field1614.method219(0);
            }
            this.field1614.method220(this.field1573 + var32);
            this.field1614.method220(this.field1574 + var33);
            this.field1247 = this.field1673[0];
            this.field1248 = this.field1674[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field1614.method219(this.field1673[var38] - var32);
                this.field1614.method219(this.field1674[var38] - var33);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method489(int arg0, boolean arg1) {
        if (arg0 != 45400) {
            this.field1289 = this.field1631.method229();
        }
        for (int var3 = 0; var3 < this.field1647; ++var3) {
            NpcEntity var4 = this.field1646[this.field1648[var3]];
            int var5 = (this.field1648[var3] << 14) + 536870912;
            if (var4 != null && var4.method113(8) && var4.field450.field1032 == arg1) {
                int var6 = var4.field394 >> 7;
                int var7 = var4.field395 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field398 == 1 && (var4.field394 & 127) == 64 && (var4.field395 & 127) == 64) {
                        if (this.field1492[var6][var7] == this.field1496) {
                            continue;
                        }
                        this.field1492[var6][var7] = this.field1496;
                    }
                    this.field1356.method61(var4, 6, var4.field395, var4.field396, var5, var4.field394, this.field1299, (var4.field398 - 1) * 64 + 60, this.method551(this.field1299, true, var4.field395, var4.field394), var4.field397);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method490(byte arg0, boolean arg1) {
        this.method449((byte) 3);
        this.field1653.method258(this.field1239);
        this.field1606.method199(0, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1529 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1396.method203(true, 12737, 7711145, this.field1383.field839, var3 / 2, var5);
            int var6 = var4 / 2 - 20;
            this.field1398.method203(true, 12737, 16776960, "Welcome to RuneScape", var3 / 2, var6);
            int var18 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1607.method199(var7 - 73, 0, var8 - 20);
            this.field1398.method203(true, 12737, 16777215, "New User", var7, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field1607.method199(var9 - 73, 0, var8 - 20);
            this.field1398.method203(true, 12737, 16777215, "Existing User", var9, var8 + 5);
        }
        if (this.field1529 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1470.length() > 0) {
                this.field1398.method203(true, 12737, 16776960, this.field1470, var3 / 2, var10 - 15);
                this.field1398.method203(true, 12737, 16776960, this.field1471, var3 / 2, var10);
                var10 += 30;
            } else {
                this.field1398.method203(true, 12737, 16776960, this.field1471, var3 / 2, var10 - 7);
                var10 += 30;
            }
            this.field1398.method210(var10, var3 / 2 - 90, "Username: " + this.field1474 + (this.field1295 == 0 & field1314 % 40 < 20 ? "@yel@|" : ""), 16777215, true, (byte) 3);
            var10 += 15;
            this.field1398.method210(var10, var3 / 2 - 88, "Password: " + JString.method305(this.field1475, false) + (this.field1295 == 1 & field1314 % 40 < 20 ? "@yel@|" : ""), 16777215, true, (byte) 3);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1607.method199(var11 - 73, 0, var12 - 20);
                this.field1398.method203(true, 12737, 16777215, "Login", var11, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field1607.method199(var13 - 73, 0, var12 - 20);
                this.field1398.method203(true, 12737, 16777215, "Cancel", var13, var12 + 5);
            }
        }
        if (this.field1529 == 3) {
            this.field1398.method203(true, 12737, 16776960, "Create a free account", var3 / 2, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field1398.method203(true, 12737, 16777215, "To create a new account you need to", var3 / 2, var14);
            int var19 = var14 + 15;
            this.field1398.method203(true, 12737, 16777215, "go back to the main RuneScape webpage", var3 / 2, var19);
            int var20 = var19 + 15;
            this.field1398.method203(true, 12737, 16777215, "and choose the red 'create account'", var3 / 2, var20);
            int var21 = var20 + 15;
            this.field1398.method203(true, 12737, 16777215, "button at the top right of that page.", var3 / 2, var21);
            int var22 = var21 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1607.method199(var15 - 73, 0, var16 - 20);
            this.field1398.method203(true, 12737, 16777215, "Cancel", var15, var16 + 5);
        }
        this.field1653.method259(202, super.field12, -38524, 171);
        if (arg0 == 9) {
            boolean var17 = false;
        } else {
            this.method6();
        }
        if (this.field1365) {
            this.field1365 = false;
            this.field1651.method259(128, super.field12, -38524, 0);
            this.field1652.method259(202, super.field12, -38524, 371);
            this.field1656.method259(0, super.field12, -38524, 265);
            this.field1657.method259(562, super.field12, -38524, 265);
            this.field1658.method259(128, super.field12, -38524, 171);
            this.field1659.method259(562, super.field12, -38524, 171);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method491(byte arg0) {
        for (int var2 = -1; var2 < this.field1318; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1316;
            } else {
                var6 = this.field1319[var2];
            }
            PlayerEntity var7 = this.field1317[var6];
            if (var7 != null && var7.field407 > 0) {
                --var7.field407;
                if (var7.field407 == 0) {
                    var7.field406 = null;
                }
            }
        }
        if (arg0 != 24) {
            this.field1289 = this.field1631.method229();
        }
        for (int var3 = 0; var3 < this.field1647; ++var3) {
            int var4 = this.field1648[var3];
            NpcEntity var5 = this.field1646[var4];
            if (var5 != null && var5.field407 > 0) {
                --var5.field407;
                if (var5.field407 == 0) {
                    var5.field406 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method492(byte arg0) {
        ++field1650;
        if (arg0 != 52) {
            field1302 = !field1302;
        }
        if (field1650 > 192) {
            field1650 = 0;
            this.field1614.method218(-744, 24);
            this.field1614.method219(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(234);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1495 != -1 && this.field1495 == this.field1286) {
                        if (var2 == 8 && this.field1392.length() > 0) {
                            this.field1392 = this.field1392.substring(0, this.field1392.length() - 1);
                        }
                        break;
                    }
                    if (this.field1418) {
                        if (var2 >= 32 && var2 <= 122 && this.field1629.length() < 80) {
                            this.field1629 = this.field1629 + (char) var2;
                            this.field1604 = true;
                        }
                        if (var2 == 8 && this.field1629.length() > 0) {
                            this.field1629 = this.field1629.substring(0, this.field1629.length() - 1);
                            this.field1604 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1418 = false;
                            this.field1604 = true;
                            if (this.field1510 == 1) {
                                long var3 = JString.method300(this.field1629);
                                this.method455(false, var3);
                            }
                            if (this.field1510 == 2 && this.field1557 > 0) {
                                long var5 = JString.method300(this.field1629);
                                this.method477(true, var5);
                            }
                            if (this.field1510 == 3 && this.field1629.length() > 0) {
                                this.field1614.method218(-744, 47);
                                this.field1614.method219(0);
                                int var7 = this.field1614.field713;
                                this.field1614.method225(this.field1457, (byte) 3);
                                WordPack.method307(this.field1629, this.field1614, this.field1421);
                                this.field1614.method228(this.field1614.field713 - var7, true);
                                this.field1629 = WordPack.method308(9384, this.field1629);
                                this.field1629 = WordFilter.method401(9384, this.field1629);
                                this.method553(this.field1629, 6, false, JString.method304((byte) 78, JString.method301(this.field1457, (byte) -48)));
                                if (this.field1357 == 2) {
                                    this.field1357 = 1;
                                    this.field1259 = true;
                                    this.field1614.method218(-744, 242);
                                    this.field1614.method219(this.field1301);
                                    this.field1614.method219(this.field1357);
                                    this.field1614.method219(this.field1222);
                                }
                            }
                            if (this.field1510 == 4 && this.field1423 < 100) {
                                long var8 = JString.method300(this.field1629);
                                this.method543(true, var8);
                            }
                            if (this.field1510 == 5 && this.field1423 > 0) {
                                long var10 = JString.method300(this.field1629);
                                this.method542(true, var10);
                            }
                        }
                    } else if (this.field1490) {
                        if (var2 >= 48 && var2 <= 57 && this.field1325.length() < 10) {
                            this.field1325 = this.field1325 + (char) var2;
                            this.field1604 = true;
                        }
                        if (var2 == 8 && this.field1325.length() > 0) {
                            this.field1325 = this.field1325.substring(0, this.field1325.length() - 1);
                            this.field1604 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1325.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1325);
                                } catch (Exception var19) {
                                }
                                this.field1614.method218(-744, 236);
                                this.field1614.method223(var12);
                            }
                            this.field1490 = false;
                            this.field1604 = true;
                        }
                    } else if (this.field1236 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1285.length() < 80) {
                            this.field1285 = this.field1285 + (char) var2;
                            this.field1604 = true;
                        }
                        if (var2 == 8 && this.field1285.length() > 0) {
                            this.field1285 = this.field1285.substring(0, this.field1285.length() - 1);
                            this.field1604 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1285.length() > 0) {
                            if (this.field1479 == 2) {
                                if (this.field1285.equals("::clientdrop")) {
                                    this.method445((byte) 1);
                                }
                                if (this.field1285.equals("::lag")) {
                                    this.method545((byte) 4);
                                }
                                if (this.field1285.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1383.method272(2, 16993); ++var13) {
                                        this.field1383.method282((byte) 1, 2, field1302, var13);
                                    }
                                }
                                if (this.field1285.equals("::fpson")) {
                                    field1424 = true;
                                }
                                if (this.field1285.equals("::fpsoff")) {
                                    field1424 = false;
                                }
                            }
                            if (this.field1285.startsWith("::")) {
                                this.field1614.method218(-744, 248);
                                this.field1614.method219(this.field1285.length() - 1);
                                this.field1614.method226(this.field1285.substring(2));
                            } else {
                                String var14 = this.field1285.toLowerCase();
                                byte var15 = 0;
                                if (var14.startsWith("yellow:")) {
                                    var15 = 0;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var14.startsWith("red:")) {
                                    var15 = 1;
                                    this.field1285 = this.field1285.substring(4);
                                } else if (var14.startsWith("green:")) {
                                    var15 = 2;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var14.startsWith("cyan:")) {
                                    var15 = 3;
                                    this.field1285 = this.field1285.substring(5);
                                } else if (var14.startsWith("purple:")) {
                                    var15 = 4;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var14.startsWith("white:")) {
                                    var15 = 5;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var14.startsWith("flash1:")) {
                                    var15 = 6;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var14.startsWith("flash2:")) {
                                    var15 = 7;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var14.startsWith("flash3:")) {
                                    var15 = 8;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var14.startsWith("glow1:")) {
                                    var15 = 9;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var14.startsWith("glow2:")) {
                                    var15 = 10;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var14.startsWith("glow3:")) {
                                    var15 = 11;
                                    this.field1285 = this.field1285.substring(6);
                                }
                                String var16 = this.field1285.toLowerCase();
                                byte var17 = 0;
                                if (var16.startsWith("wave:")) {
                                    var17 = 1;
                                    this.field1285 = this.field1285.substring(5);
                                } else if (var16.startsWith("wave2:")) {
                                    var17 = 2;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var16.startsWith("shake:")) {
                                    var17 = 3;
                                    this.field1285 = this.field1285.substring(6);
                                } else if (var16.startsWith("scroll:")) {
                                    var17 = 4;
                                    this.field1285 = this.field1285.substring(7);
                                } else if (var16.startsWith("slide:")) {
                                    var17 = 5;
                                    this.field1285 = this.field1285.substring(6);
                                }
                                this.field1614.method218(-744, 37);
                                this.field1614.method219(0);
                                int var18 = this.field1614.field713;
                                this.field1614.method219(var15);
                                this.field1614.method219(var17);
                                WordPack.method307(this.field1285, this.field1614, this.field1421);
                                this.field1614.method228(this.field1614.field713 - var18, true);
                                this.field1285 = WordPack.method308(9384, this.field1285);
                                this.field1285 = WordFilter.method401(9384, this.field1285);
                                field1235.field406 = this.field1285;
                                field1235.field408 = var15;
                                field1235.field409 = var17;
                                field1235.field407 = 150;
                                if (this.field1479 == 2) {
                                    this.method553(field1235.field406, 2, false, "@cr2@" + field1235.field456);
                                } else if (this.field1479 == 1) {
                                    this.method553(field1235.field406, 2, false, "@cr1@" + field1235.field456);
                                } else {
                                    this.method553(field1235.field406, 2, false, field1235.field456);
                                }
                                if (this.field1301 == 2) {
                                    this.field1301 = 3;
                                    this.field1259 = true;
                                    this.field1614.method218(-744, 242);
                                    this.field1614.method219(this.field1301);
                                    this.field1614.method219(this.field1357);
                                    this.field1614.method219(this.field1222);
                                }
                            }
                            this.field1285 = "";
                            this.field1604 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1392.length() < 12) {
                this.field1392 = this.field1392 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        this.field1535 = 0;
        for (int var2 = -1; var2 < this.field1647 + this.field1318; ++var2) {
            PathingEntity var19;
            if (var2 == -1) {
                var19 = field1235;
            } else if (var2 < this.field1318) {
                var19 = this.field1317[this.field1319[var2]];
            } else {
                var19 = this.field1646[this.field1648[var2 - this.field1318]];
            }
            if (var19 != null && var19.method113(8)) {
                if (var19 instanceof NpcEntity) {
                    NpcType var20 = ((NpcEntity) var19).field450;
                    if (var20.field1037 != null) {
                        var20 = var20.method345(false);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field1318) {
                    NpcType var24 = ((NpcEntity) var19).field450;
                    if (var24.field1035 >= 0 && var24.field1035 < this.field1499.length) {
                        this.method482(true, var19.field440 + 15, var19);
                        if (this.field1635 > -1) {
                            this.field1499[var24.field1035].method186(this.field1635 - 12, 0, this.field1636 - 30);
                        }
                    }
                    if (this.field1415 == 1 && this.field1648[var2 - this.field1318] == this.field1331 && field1314 % 20 < 10) {
                        this.method482(true, var19.field440 + 15, var19);
                        if (this.field1635 > -1) {
                            this.field1499[2].method186(this.field1635 - 12, 0, this.field1636 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    PlayerEntity var22 = (PlayerEntity) var19;
                    if (var22.field459 != 0) {
                        this.method482(true, var19.field440 + 15, var19);
                        if (this.field1635 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field459 & 1 << var23) != 0) {
                                    this.field1499[var23].method186(this.field1635 - 12, 0, this.field1636 - var21);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1415 == 10 && this.field1319[var2] == this.field1454) {
                        this.method482(true, var19.field440 + 15, var19);
                        if (this.field1635 > -1) {
                            this.field1499[7].method186(this.field1635 - 12, 0, this.field1636 - var21);
                        }
                    }
                }
                if (var19.field406 != null && (var2 >= this.field1318 || this.field1301 == 0 || this.field1301 == 3 || this.field1301 == 1 && this.method557((byte) 9, ((PlayerEntity) var19).field456))) {
                    this.method482(true, var19.field440, var19);
                    if (this.field1635 > -1 && this.field1535 < this.field1536) {
                        this.field1540[this.field1535] = this.field1398.method205(var19.field406, false) / 2;
                        this.field1539[this.field1535] = this.field1398.field699;
                        this.field1537[this.field1535] = this.field1635;
                        this.field1538[this.field1535] = this.field1636;
                        this.field1541[this.field1535] = var19.field408;
                        this.field1542[this.field1535] = var19.field409;
                        this.field1543[this.field1535] = var19.field407;
                        this.field1544[this.field1535++] = var19.field406;
                        if (this.field1556 == 0 && var19.field409 >= 1 && var19.field409 <= 3) {
                            this.field1539[this.field1535] += 10;
                            this.field1538[this.field1535] += 5;
                        }
                        if (this.field1556 == 0 && var19.field409 == 4) {
                            this.field1540[this.field1535] = 60;
                        }
                        if (this.field1556 == 0 && var19.field409 == 5) {
                            this.field1539[this.field1535] += 5;
                        }
                    }
                }
                if (var19.field413 > field1314) {
                    this.method482(true, var19.field440 + 15, var19);
                    if (this.field1635 > -1) {
                        int var25 = var19.field414 * 30 / var19.field415;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        Pix2D.method157(65280, 5, this.field1636 - 3, var25, (byte) 5, this.field1635 - 15);
                        Pix2D.method157(16711680, 5, this.field1636 - 3, 30 - var25, (byte) 5, this.field1635 - 15 + var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field412[var26] > field1314) {
                        this.method482(true, var19.field440 / 2, var19);
                        if (this.field1635 > -1) {
                            if (var26 == 1) {
                                this.field1636 -= 20;
                            }
                            if (var26 == 2) {
                                this.field1635 -= 15;
                                this.field1636 -= 10;
                            }
                            if (var26 == 3) {
                                this.field1635 += 15;
                                this.field1636 -= 10;
                            }
                            this.field1622[var19.field411[var26]].method186(this.field1635 - 12, 0, this.field1636 - 12);
                            this.field1396.method202(String.valueOf(var19.field410[var26]), this.field1636 + 4, 0, (byte) 0, this.field1635);
                            this.field1396.method202(String.valueOf(var19.field410[var26]), this.field1636 + 3, 16777215, (byte) 0, this.field1635 - 1);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field1613 = this.field1293.method295();
        }
        for (int var3 = 0; var3 < this.field1535; ++var3) {
            int var4 = this.field1537[var3];
            int var5 = this.field1538[var3];
            int var6 = this.field1540[var3];
            int var7 = this.field1539[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field1538[var18] - this.field1539[var18] && var5 - var7 < this.field1538[var18] + 2 && var4 - var6 < this.field1540[var18] + this.field1537[var18] && var4 + var6 > this.field1537[var18] - this.field1540[var18] && this.field1538[var18] - this.field1539[var18] < var5) {
                        var5 = this.field1538[var18] - this.field1539[var18];
                        var8 = true;
                    }
                }
            }
            this.field1635 = this.field1537[var3];
            this.field1636 = this.field1538[var3] = var5;
            String var9 = this.field1544[var3];
            if (this.field1556 == 0) {
                int var10 = 16776960;
                if (this.field1541[var3] < 6) {
                    var10 = this.field1287[this.field1541[var3]];
                }
                if (this.field1541[var3] == 6) {
                    var10 = this.field1496 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1541[var3] == 7) {
                    var10 = this.field1496 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1541[var3] == 8) {
                    var10 = this.field1496 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1541[var3] == 9) {
                    int var11 = 150 - this.field1543[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1541[var3] == 10) {
                    int var12 = 150 - this.field1543[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1541[var3] == 11) {
                    int var13 = 150 - this.field1543[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1542[var3] == 0) {
                    this.field1398.method202(var9, this.field1636 + 1, 0, (byte) 0, this.field1635);
                    this.field1398.method202(var9, this.field1636, var10, (byte) 0, this.field1635);
                }
                if (this.field1542[var3] == 1) {
                    this.field1398.method207(0, this.field1496, -871, this.field1635, var9, this.field1636 + 1);
                    this.field1398.method207(var10, this.field1496, -871, this.field1635, var9, this.field1636);
                }
                if (this.field1542[var3] == 2) {
                    this.field1398.method208(var9, 0, this.field1635, this.field1496, (byte) 96, this.field1636 + 1);
                    this.field1398.method208(var9, var10, this.field1635, this.field1496, (byte) 96, this.field1636);
                }
                if (this.field1542[var3] == 3) {
                    this.field1398.method209(0, var9, this.field1636 + 1, 150 - this.field1543[var3], this.field1496, -160, this.field1635);
                    this.field1398.method209(var10, var9, this.field1636, 150 - this.field1543[var3], this.field1496, -160, this.field1635);
                }
                if (this.field1542[var3] == 4) {
                    int var14 = this.field1398.method205(var9, false);
                    int var15 = (150 - this.field1543[var3]) * (var14 + 100) / 150;
                    Pix2D.method154(this.field1635 - 50, 0, this.field1635 + 50, false, 334);
                    this.field1398.method206(var9, false, this.field1636 + 1, this.field1635 + 50 - var15, 0);
                    this.field1398.method206(var9, false, this.field1636, this.field1635 + 50 - var15, var10);
                    Pix2D.method153(true);
                }
                if (this.field1542[var3] == 5) {
                    int var16 = 150 - this.field1543[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    Pix2D.method154(0, this.field1636 - this.field1398.field699 - 1, 512, false, this.field1636 + 5);
                    this.field1398.method202(var9, this.field1636 + 1 + var17, 0, (byte) 0, this.field1635);
                    this.field1398.method202(var9, this.field1636 + var17, var10, (byte) 0, this.field1635);
                    Pix2D.method153(true);
                }
            } else {
                this.field1398.method202(var9, this.field1636 + 1, 0, (byte) 0, this.field1635);
                this.field1398.method202(var9, this.field1636, 16776960, (byte) 0, this.field1635);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IIII)V")
    public final void method494(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= 0) {
            this.field1289 = this.field1631.method229();
        }
        if (arg2.field74 == 0 && arg2.field89 != null && !arg2.field88) {
            if (arg6 >= arg0 && arg3 >= arg5 && arg6 <= arg2.field77 + arg0 && arg3 <= arg2.field78 + arg5) {
                int var8 = arg2.field89.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg2.field90[var9] + arg0;
                    int var11 = arg2.field91[var9] + arg5 - arg4;
                    Component var12 = Component.field67[arg2.field89[var9]];
                    int var13 = var12.field80 + var10;
                    int var14 = var12.field81 + var11;
                    if ((var12.field85 >= 0 || var12.field112 != 0) && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                        if (var12.field85 >= 0) {
                            this.field1229 = var12.field85;
                        } else {
                            this.field1229 = var12.field72;
                        }
                    }
                    if (var12.field74 == 0) {
                        this.method494(var13, -3, var12, arg3, var12.field87, var14, arg6);
                        if (var12.field86 > var12.field78) {
                            this.method540(-528, var14, var12, var12.field86, var12.field78, true, arg3, arg6, var12.field77 + var13);
                        }
                    } else {
                        if (var12.field75 == 1 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            boolean var15 = false;
                            if (var12.field76 != 0) {
                                var15 = this.method441(var12, 465);
                            }
                            if (!var15) {
                                this.field1433[this.field1571] = var12.field128;
                                this.field1226[this.field1571] = 231;
                                this.field1225[this.field1571] = var12.field72;
                                ++this.field1571;
                            }
                        }
                        if (var12.field75 == 2 && this.field1441 == 0 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            String var16 = var12.field125;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1433[this.field1571] = var16 + " @gre@" + var12.field126;
                            this.field1226[this.field1571] = 274;
                            this.field1225[this.field1571] = var12.field72;
                            ++this.field1571;
                        }
                        if (var12.field75 == 3 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            this.field1433[this.field1571] = "Close";
                            this.field1226[this.field1571] = 737;
                            this.field1225[this.field1571] = var12.field72;
                            ++this.field1571;
                        }
                        if (var12.field75 == 4 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            this.field1433[this.field1571] = var12.field128;
                            this.field1226[this.field1571] = 435;
                            this.field1225[this.field1571] = var12.field72;
                            ++this.field1571;
                        }
                        if (var12.field75 == 5 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            this.field1433[this.field1571] = var12.field128;
                            this.field1226[this.field1571] = 225;
                            this.field1225[this.field1571] = var12.field72;
                            ++this.field1571;
                        }
                        if (var12.field75 == 6 && !this.field1663 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field77 + var13 && arg3 < var12.field78 + var14) {
                            this.field1433[this.field1571] = var12.field128;
                            this.field1226[this.field1571] = 997;
                            this.field1225[this.field1571] = var12.field72;
                            ++this.field1571;
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
                                    if (arg6 >= var20 && arg3 >= var21 && arg6 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field1493 = var17;
                                        this.field1494 = var12.field72;
                                        if (var12.field68[var17] > 0) {
                                            ObjType var22 = ObjType.method348(var12.field68[var17] - 1);
                                            if (this.field1410 == 1 && var12.field95) {
                                                if (this.field1412 != var12.field72 || this.field1411 != var17) {
                                                    this.field1433[this.field1571] = "Use " + this.field1414 + " with @lre@" + var22.field1052;
                                                    this.field1226[this.field1571] = 398;
                                                    this.field1227[this.field1571] = var22.field1050;
                                                    this.field1224[this.field1571] = var17;
                                                    this.field1225[this.field1571] = var12.field72;
                                                    ++this.field1571;
                                                }
                                            } else if (this.field1441 == 1 && var12.field95) {
                                                if ((this.field1443 & 16) == 16) {
                                                    this.field1433[this.field1571] = this.field1444 + " @lre@" + var22.field1052;
                                                    this.field1226[this.field1571] = 563;
                                                    this.field1227[this.field1571] = var22.field1050;
                                                    this.field1224[this.field1571] = var17;
                                                    this.field1225[this.field1571] = var12.field72;
                                                    ++this.field1571;
                                                }
                                            } else {
                                                if (var12.field95) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1067 != null && var22.field1067[var23] != null) {
                                                            this.field1433[this.field1571] = var22.field1067[var23] + " @lre@" + var22.field1052;
                                                            if (var23 == 3) {
                                                                this.field1226[this.field1571] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1226[this.field1571] = 100;
                                                            }
                                                            this.field1227[this.field1571] = var22.field1050;
                                                            this.field1224[this.field1571] = var17;
                                                            this.field1225[this.field1571] = var12.field72;
                                                            ++this.field1571;
                                                        } else if (var23 == 4) {
                                                            this.field1433[this.field1571] = "Drop @lre@" + var22.field1052;
                                                            this.field1226[this.field1571] = 100;
                                                            this.field1227[this.field1571] = var22.field1050;
                                                            this.field1224[this.field1571] = var17;
                                                            this.field1225[this.field1571] = var12.field72;
                                                            ++this.field1571;
                                                        }
                                                    }
                                                }
                                                if (var12.field96) {
                                                    this.field1433[this.field1571] = "Use @lre@" + var22.field1052;
                                                    this.field1226[this.field1571] = 102;
                                                    this.field1227[this.field1571] = var22.field1050;
                                                    this.field1224[this.field1571] = var17;
                                                    this.field1225[this.field1571] = var12.field72;
                                                    ++this.field1571;
                                                }
                                                if (var12.field95 && var22.field1067 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1067[var24] != null) {
                                                            this.field1433[this.field1571] = var22.field1067[var24] + " @lre@" + var22.field1052;
                                                            if (var24 == 0) {
                                                                this.field1226[this.field1571] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1226[this.field1571] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1226[this.field1571] = 795;
                                                            }
                                                            this.field1227[this.field1571] = var22.field1050;
                                                            this.field1224[this.field1571] = var17;
                                                            this.field1225[this.field1571] = var12.field72;
                                                            ++this.field1571;
                                                        }
                                                    }
                                                }
                                                if (var12.field103 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field103[var25] != null) {
                                                            this.field1433[this.field1571] = var12.field103[var25] + " @lre@" + var22.field1052;
                                                            if (var25 == 0) {
                                                                this.field1226[this.field1571] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1226[this.field1571] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1226[this.field1571] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1226[this.field1571] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1226[this.field1571] = 354;
                                                            }
                                                            this.field1227[this.field1571] = var22.field1050;
                                                            this.field1224[this.field1571] = var17;
                                                            this.field1225[this.field1571] = var12.field72;
                                                            ++this.field1571;
                                                        }
                                                    }
                                                }
                                                this.field1433[this.field1571] = "Examine @lre@" + var22.field1052;
                                                this.field1226[this.field1571] = 1328;
                                                this.field1227[this.field1571] = var22.field1050;
                                                this.field1224[this.field1571] = var17;
                                                this.field1225[this.field1571] = var12.field72;
                                                ++this.field1571;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method495(String arg0) throws IOException {
        if (!this.field1561) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1528 != null) {
                try {
                    this.field1528.close();
                } catch (Exception var4) {
                }
                this.field1528 = null;
            }
            this.field1528 = this.method518(43595);
            this.field1528.setSoTimeout(10000);
            InputStream var2 = this.field1528.getInputStream();
            OutputStream var3 = this.field1528.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 298);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1427 = Integer.parseInt(arg0[0]);
                field1428 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method453(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method549(true);
                }
                if (arg0[3].equals("free")) {
                    field1429 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1429 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1((byte) 2, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Z")
    public final boolean method496(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1226[arg1];
            if (arg0) {
                this.field1289 = -1;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    private final void method497(int arg0, int arg1, Packet arg2) {
        if (arg1 != -27674) {
            this.field1239 = this.field1293.method295();
        }
        for (int var4 = 0; var4 < this.field1320; ++var4) {
            int var5 = this.field1321[var4];
            NpcEntity var6 = this.field1646[var5];
            int var7 = arg2.method229();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method229();
                int var9 = arg2.method229();
                var6.method114(var8, field1314, -103, var9);
                var6.field413 = field1314 + 300;
                var6.field414 = arg2.method229();
                var6.field415 = arg2.method229();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method231();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field422 == var10) {
                    var6.field426 = 0;
                }
                int var11 = arg2.method229();
                if (var6.field422 == var10 && var10 != -1) {
                    int var12 = SeqType.field1143[var10].field1157;
                    if (var12 == 1) {
                        var6.field423 = 0;
                        var6.field424 = 0;
                        var6.field425 = var11;
                        var6.field426 = 0;
                    }
                    if (var12 == 2) {
                        var6.field426 = 0;
                    }
                } else if (var10 == -1 || var6.field422 == -1 || SeqType.field1143[var10].field1151 >= SeqType.field1143[var6.field422].field1151) {
                    var6.field422 = var10;
                    var6.field423 = 0;
                    var6.field424 = 0;
                    var6.field425 = var11;
                    var6.field426 = 0;
                    var6.field448 = var6.field443;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field416 = arg2.method231();
                if (var6.field416 == 65535) {
                    var6.field416 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field406 = arg2.method236();
                var6.field407 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method229();
                int var14 = arg2.method229();
                var6.method114(var13, field1314, -103, var14);
                var6.field413 = field1314 + 300;
                var6.field414 = arg2.method229();
                var6.field415 = arg2.method229();
            }
            if ((var7 & 32) == 32) {
                var6.field450 = NpcType.method341(arg2.method231());
                var6.field398 = var6.field450.field1014;
                var6.field442 = var6.field450.field1036;
                var6.field401 = var6.field450.field1018;
                var6.field402 = var6.field450.field1019;
                var6.field403 = var6.field450.field1020;
                var6.field404 = var6.field450.field1021;
                var6.field399 = var6.field450.field1017;
            }
            if ((var7 & 64) == 64) {
                var6.field427 = arg2.method231();
                int var15 = arg2.method234();
                var6.field431 = var15 >> 16;
                var6.field430 = (var15 & 65535) + field1314;
                var6.field428 = 0;
                var6.field429 = 0;
                if (var6.field430 > field1314) {
                    var6.field428 = -1;
                }
                if (var6.field427 == 65535) {
                    var6.field427 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field417 = arg2.method231();
                var6.field418 = arg2.method231();
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method498(boolean arg0) {
        if (!arg0) {
            while (true) {
                OnDemandRequest var2 = this.field1383.method281();
                if (var2 == null) {
                    return;
                }
                if (var2.field726 == 0) {
                    Model.method124((byte) 14, var2.field728, var2.field727);
                    if ((this.field1383.method277(3, var2.field727) & 98) != 0) {
                        this.field1440 = true;
                        if (this.field1236 != -1) {
                            this.field1604 = true;
                        }
                    }
                }
                if (var2.field726 == 1 && var2.field728 != null) {
                    AnimFrame.method45(var2.field728, (byte) 35);
                }
                if (var2.field726 == 2 && this.field1463 == var2.field727 && var2.field728 != null) {
                    this.method510(this.field1464, 455, var2.field728);
                }
                if (var2.field726 == 3 && this.field1393 == 1) {
                    for (int var3 = 0; var3 < this.field1324.length; ++var3) {
                        if (this.field1233[var3] == var2.field727) {
                            this.field1324[var3] = var2.field728;
                            if (var2.field728 == null) {
                                this.field1233[var3] = -1;
                            }
                            break;
                        }
                        if (this.field1234[var3] == var2.field727) {
                            this.field1241[var3] = var2.field728;
                            if (var2.field728 == null) {
                                this.field1234[var3] = -1;
                            }
                            break;
                        }
                    }
                }
                if (var2.field726 == 93 && this.field1383.method276(true, var2.field727)) {
                    World.method17(this.field1383, 326, new Packet(var2.field728, (byte) -93));
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method499(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method6();
        }
        if (field1235.field394 >> 7 == this.field1247 && field1235.field395 >> 7 == this.field1248) {
            this.field1247 = 0;
            ++field1231;
            if (field1231 > 122) {
                field1231 = 0;
                this.field1614.method218(-744, 110);
                this.field1614.method219(62);
            }
        }
        int var3 = this.field1318;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1235;
                var6 = this.field1316 << 14;
            } else {
                var5 = this.field1317[this.field1319[var4]];
                var6 = this.field1319[var4] << 14;
            }
            if (var5 != null && var5.method113(8)) {
                var5.field476 = false;
                if ((field1430 && this.field1318 > 50 || this.field1318 > 200) && !arg0 && var5.field419 == var5.field399) {
                    var5.field476 = true;
                }
                int var7 = var5.field394 >> 7;
                int var8 = var5.field395 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field471 != null && field1314 >= var5.field466 && field1314 < var5.field467) {
                        var5.field476 = false;
                        var5.field465 = this.method551(this.field1299, true, var5.field395, var5.field394);
                        this.field1356.method62(var5.field395, var5.field394, var5.field473, var5.field465, var5.field474, true, var5.field472, var5.field475, this.field1299, var5, var6, 60, var5.field396);
                    } else {
                        if ((var5.field394 & 127) == 64 && (var5.field395 & 127) == 64) {
                            if (this.field1492[var7][var8] == this.field1496) {
                                continue;
                            }
                            this.field1492[var7][var8] = this.field1496;
                        }
                        var5.field465 = this.method551(this.field1299, true, var5.field395, var5.field394);
                        this.field1356.method61(var5, 6, var5.field395, var5.field396, var6, var5.field394, this.field1299, 60, var5.field465, var5.field397);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1356.method80(this.field1299, arg1, arg3, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1616;
            if (field1616 > 1086) {
                field1616 = 0;
                this.field1614.method218(-744, 170);
                this.field1614.method219(0);
                int var10 = this.field1614.field713;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1614.method220(16791);
                }
                this.field1614.method219(254);
                this.field1614.method220((int) (Math.random() * 65536.0D));
                this.field1614.method220(16128);
                this.field1614.method220(52610);
                this.field1614.method220((int) (Math.random() * 65536.0D));
                this.field1614.method220(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1614.method220(35025);
                }
                this.field1614.method220(46628);
                this.field1614.method219((int) (Math.random() * 256.0D));
                this.field1614.method228(this.field1614.field713 - var10, true);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method488(field1235.field445[0], field1235.field444[0], 0, arg1, arg3, var8 + 1, false, 0, 0, (byte) 4, 2, var9);
            } else {
                LocType var11 = LocType.method330(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field965;
                    var13 = var11.field964;
                } else {
                    var12 = var11.field964;
                    var13 = var11.field965;
                }
                int var14 = var11.field987;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method488(field1235.field445[0], field1235.field444[0], var14, arg1, arg3, 0, false, var13, var12, (byte) 4, 2, 0);
            }
            this.field1599 = super.field27;
            this.field1600 = super.field28;
            this.field1602 = 2;
            this.field1601 = 0;
            this.field1614.method218(-744, arg0);
            this.field1614.method220(this.field1573 + arg1);
            this.field1614.method220(this.field1574 + arg3);
            if (arg4 >= 0) {
                this.field1614.method219(164);
            }
            this.field1614.method220(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method501(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 0) {
            this.field1289 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    private final void method502(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (LocSpawned var3 = (LocSpawned) this.field1391.method248(); var3 != null; var3 = (LocSpawned) this.field1391.method250(8)) {
            if (var3.field742 == -1) {
                var3.field741 = 0;
                this.method503(false, var3);
            } else {
                var3.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLnb;)V")
    private final void method503(boolean arg0, LocSpawned arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0) {
            field1407 = !field1407;
        }
        if (arg1.field732 == 0) {
            var3 = this.field1356.method76(arg1.field731, arg1.field733, arg1.field734);
        }
        if (arg1.field732 == 1) {
            var3 = this.field1356.method77(arg1.field733, 0, arg1.field734, arg1.field731);
        }
        if (arg1.field732 == 2) {
            var3 = this.field1356.method78(arg1.field731, arg1.field733, arg1.field734);
        }
        if (arg1.field732 == 3) {
            var3 = this.field1356.method79(arg1.field731, arg1.field733, arg1.field734);
        }
        if (var3 != 0) {
            int var7 = this.field1356.method80(arg1.field731, arg1.field733, arg1.field734, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field735 = var4;
        arg1.field737 = var5;
        arg1.field736 = var6;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        if (!arg0) {
            if (this.field1529 == 0) {
                int var2 = super.field10 / 2 - 80;
                int var3 = super.field11 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field26 == 1 && super.field27 >= var2 - 75 && super.field27 <= var2 + 75 && super.field28 >= var14 - 20 && super.field28 <= var14 + 20) {
                    this.field1529 = 3;
                    this.field1295 = 0;
                }
                int var4 = super.field10 / 2 + 80;
                if (super.field26 == 1 && super.field27 >= var4 - 75 && super.field27 <= var4 + 75 && super.field28 >= var14 - 20 && super.field28 <= var14 + 20) {
                    this.field1470 = "";
                    this.field1471 = "Enter your username & password.";
                    this.field1529 = 2;
                    this.field1295 = 0;
                }
            } else if (this.field1529 == 2) {
                int var5 = super.field11 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field26 == 1 && super.field28 >= var16 - 15 && super.field28 < var16) {
                    this.field1295 = 0;
                }
                var5 = var16 + 15;
                if (super.field26 == 1 && super.field28 >= var5 - 15 && super.field28 < var5) {
                    this.field1295 = 1;
                }
                var5 += 15;
                int var6 = super.field10 / 2 - 80;
                int var7 = super.field11 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field26 == 1 && super.field27 >= var6 - 75 && super.field27 <= var6 + 75 && super.field28 >= var17 - 20 && super.field28 <= var17 + 20) {
                    this.field1603 = 0;
                    this.method472(this.field1474, this.field1475, false);
                    if (this.field1619) {
                        return;
                    }
                }
                int var8 = super.field10 / 2 + 80;
                if (super.field26 == 1 && super.field27 >= var8 - 75 && super.field27 <= var8 + 75 && super.field28 >= var17 - 20 && super.field28 <= var17 + 20) {
                    this.field1529 = 0;
                    this.field1474 = "";
                    this.field1475 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method5(234);
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
                        if (this.field1295 == 0) {
                            if (var9 == 8 && this.field1474.length() > 0) {
                                this.field1474 = this.field1474.substring(0, this.field1474.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1295 = 1;
                            }
                            if (var10) {
                                this.field1474 = this.field1474 + (char) var9;
                            }
                            if (this.field1474.length() > 12) {
                                this.field1474 = this.field1474.substring(0, 12);
                            }
                        } else if (this.field1295 == 1) {
                            if (var9 == 8 && this.field1475.length() > 0) {
                                this.field1475 = this.field1475.substring(0, this.field1475.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1295 = 0;
                            }
                            if (var10) {
                                this.field1475 = this.field1475 + (char) var9;
                            }
                            if (this.field1475.length() > 20) {
                                this.field1475 = this.field1475.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field1529 == 3) {
                    int var12 = super.field10 / 2;
                    int var13 = super.field11 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field26 == 1 && super.field27 >= var12 - 75 && super.field27 <= var12 + 75 && super.field28 >= var18 - 20 && super.field28 <= var18 + 20) {
                        this.field1529 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method505(int arg0) {
        try {
            this.field1562 = -1;
            this.field1409.method252();
            this.field1621.method252();
            Pix3D.method167(-803);
            this.method514(0);
            this.field1356.method50(-571);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1382[var2].method359(214);
            }
            System.gc();
            World var3 = new World(104, this.field1626, 104, this.field1489, 0);
            int var4 = this.field1324.length;
            World.field41 = World3D.field280;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1232[var5] >> 8;
                int var7 = this.field1232[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field41 = false;
                }
            }
            if (World.field41) {
                this.field1356.method51(this.field1299, (byte) 4);
            } else {
                this.field1356.method51(0, (byte) 4);
            }
            this.field1614.method218(-744, 115);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1232[var8] >> 8) * 64 - this.field1573;
                int var10 = (this.field1232[var8] & 255) * 64 - this.field1574;
                byte[] var11 = this.field1324[var8];
                if (var11 != null) {
                    var3.method15(var10, (this.field1370 - 6) * 8, (this.field1369 - 6) * 8, 455, var11, var9);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1232[var12] >> 8) * 64 - this.field1573;
                int var14 = (this.field1232[var12] & 255) * 64 - this.field1574;
                byte[] var15 = this.field1324[var12];
                if (var15 == null && this.field1370 < 800) {
                    var3.method14(var13, 64, 64, var14, 551);
                }
            }
            this.field1614.method218(-744, 115);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1241[var16];
                if (var17 != null) {
                    int var18 = (this.field1232[var16] >> 8) * 64 - this.field1573;
                    int var19 = (this.field1232[var16] & 255) * 64 - this.field1574;
                    var3.method18(this.field1382, var17, (byte) 9, var19, this.field1356, var18);
                }
            }
            this.field1614.method218(-744, 115);
            var3.method20(this.field1356, this.field1382, -808);
            this.field1337.method258(this.field1239);
            this.field1614.method218(-744, 115);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method476(var20, var21);
                }
            }
            this.method502(true);
        } catch (Exception var35) {
        }
        LocType.field994.method103();
        if (field1430 && signlink.cache_dat != null) {
            int var23 = this.field1383.method272(0, 16993);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1383.method277(3, var24);
                if ((var25 & 121) == 0) {
                    Model.method125(-32291, var24);
                }
            }
        }
        System.gc();
        Pix3D.method168(899, 20);
        this.field1383.method283((byte) -75);
        int var26 = 38 / arg0;
        int var27 = (this.field1369 - 6) / 8 - 1;
        int var28 = (this.field1369 + 6) / 8 + 1;
        int var29 = (this.field1370 - 6) / 8 - 1;
        int var30 = (this.field1370 + 6) / 8 + 1;
        if (this.field1447) {
            var27 = 49;
            var28 = 50;
            var29 = 49;
            var30 = 50;
        }
        for (int var31 = var27; var31 <= var28; ++var31) {
            for (int var32 = var29; var32 <= var30; ++var32) {
                if (var27 == var31 || var28 == var31 || var29 == var32 || var30 == var32) {
                    int var33 = this.field1383.method274(0, false, var32, var31);
                    if (var33 != -1) {
                        this.field1383.method284(var33, -43609, 3);
                    }
                    int var34 = this.field1383.method274(1, false, var32, var31);
                    if (var34 != -1) {
                        this.field1383.method284(var34, -43609, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method506(boolean arg0) {
        int var2 = this.field1344;
        int var3 = this.field1345;
        int var4 = this.field1346;
        int var5 = this.field1347;
        int var6 = 6116423;
        Pix2D.method157(var6, var5, var3, var4, (byte) 5, var2);
        Pix2D.method157(0, 16, var3 + 1, var4 - 2, (byte) 5, var2 + 1);
        Pix2D.method158(var2 + 1, var3 + 18, var5 - 19, 0, var4 - 2, (byte) -69);
        this.field1619 &= arg0;
        this.field1398.method206("Choose Option", false, var3 + 14, var2 + 3, var6);
        int var7 = super.field20;
        int var8 = super.field21;
        if (this.field1343 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1343 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1343 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1571; ++var9) {
            int var10 = (this.field1571 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1398.method210(var10, var2 + 3, this.field1433[var9], var11, true, (byte) 3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIII)V")
    private final void method507(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        this.field1619 &= arg4;
        if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
            if (field1430 && this.field1299 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field1356.method76(arg2, arg1, arg3);
            }
            if (arg7 == 1) {
                var9 = this.field1356.method77(arg1, 0, arg3, arg2);
            }
            if (arg7 == 2) {
                var9 = this.field1356.method78(arg2, arg1, arg3);
            }
            if (arg7 == 3) {
                var9 = this.field1356.method79(arg2, arg1, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1356.method80(arg2, arg1, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field1356.method67(arg2, false, arg3, arg1);
                    LocType var17 = LocType.method330(var14);
                    if (var17.field966) {
                        this.field1382[arg2].method364(arg3, arg1, var17.field967, 667, var16, var15);
                    }
                }
                if (arg7 == 1) {
                    this.field1356.method68(arg2, arg1, arg3, false);
                }
                if (arg7 == 2) {
                    this.field1356.method69(arg1, arg2, arg3, (byte) 5);
                    LocType var18 = LocType.method330(var14);
                    if (var18.field964 + arg1 > 103 || var18.field964 + arg3 > 103 || var18.field965 + arg1 > 103 || var18.field965 + arg3 > 103) {
                        return;
                    }
                    if (var18.field966) {
                        this.field1382[arg2].method365(var16, arg1, -49110, var18.field964, var18.field965, var18.field967, arg3);
                    }
                }
                if (arg7 == 3) {
                    this.field1356.method70(-6803, arg3, arg2, arg1);
                    LocType var19 = LocType.method330(var14);
                    if (var19.field966 && var19.field968) {
                        this.field1382[arg2].method367(181, arg3, arg1);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field1489[1][arg1][arg3] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                World.method31(arg0, true, arg2, this.field1356, arg3, this.field1382[arg2], arg5, this.field1626, arg1, var20, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method508(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field1619 &= arg3;
        int var7 = this.field1356.method76(arg2, arg1, arg0);
        if (var7 != 0) {
            int var8 = this.field1356.method80(arg2, arg1, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg5;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field1249.field668;
            int var13 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method330(var14);
            if (var15.field978 != -1) {
                Pix8 var16 = this.field1511[var15.field978];
                if (var16 != null) {
                    int var17 = (var15.field964 * 4 - var16.field682) / 2;
                    int var18 = (var15.field965 * 4 - var16.field683) / 2;
                    var16.method199(arg1 * 4 + 48 + var17, 0, (104 - arg0 - var15.field965) * 4 + 48 + var18);
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
        int var19 = this.field1356.method78(arg2, arg1, arg0);
        if (var19 != 0) {
            int var20 = this.field1356.method80(arg2, arg1, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method330(var23);
            if (var24.field978 != -1) {
                Pix8 var25 = this.field1511[var24.field978];
                if (var25 != null) {
                    int var26 = (var24.field964 * 4 - var25.field682) / 2;
                    int var27 = (var24.field965 * 4 - var25.field683) / 2;
                    var25.method199(arg1 * 4 + 48 + var26, 0, (104 - arg0 - var24.field965) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1249.field668;
                int var30 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field1356.method79(arg2, arg1, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method330(var32);
            if (var33.field978 != -1) {
                Pix8 var34 = this.field1511[var33.field978];
                if (var34 != null) {
                    int var35 = (var33.field964 * 4 - var34.field682) / 2;
                    int var36 = (var33.field965 * 4 - var34.field683) / 2;
                    var34.method199(arg1 * 4 + 48 + var35, 0, (104 - arg0 - var33.field965) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method509(int arg0) {
        while (arg0 >= 0) {
            this.field1614.method219(135);
        }
        try {
            int var2 = field1235.field394 + this.field1332;
            int var3 = field1235.field395 + this.field1349;
            if (this.field1579 - var2 < -500 || this.field1579 - var2 > 500 || this.field1580 - var3 < -500 || this.field1580 - var3 > 500) {
                this.field1579 = var2;
                this.field1580 = var3;
            }
            if (this.field1579 != var2) {
                this.field1579 += (var2 - this.field1579) / 16;
            }
            if (this.field1580 != var3) {
                this.field1580 += (var3 - this.field1580) / 16;
            }
            if (super.field30[1] == 1) {
                this.field1642 += (-24 - this.field1642) / 2;
            } else if (super.field30[2] == 1) {
                this.field1642 += (24 - this.field1642) / 2;
            } else {
                this.field1642 /= 2;
            }
            if (super.field30[3] == 1) {
                this.field1643 += (12 - this.field1643) / 2;
            } else if (super.field30[4] == 1) {
                this.field1643 += (-12 - this.field1643) / 2;
            } else {
                this.field1643 /= 2;
            }
            this.field1641 = this.field1642 / 2 + this.field1641 & 2047;
            this.field1640 += this.field1643 / 2;
            if (this.field1640 < 128) {
                this.field1640 = 128;
            }
            if (this.field1640 > 383) {
                this.field1640 = 383;
            }
            int var4 = this.field1579 >> 7;
            int var5 = this.field1580 >> 7;
            int var6 = this.method551(this.field1299, true, this.field1580, this.field1579);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1299;
                        if (var10 < 3 && (this.field1489[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1626[var10][var8][var9];
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
            if (var12 > this.field1485) {
                this.field1485 += (var12 - this.field1485) / 24;
            } else if (var12 < this.field1485) {
                this.field1485 += (var12 - this.field1485) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1235.field394 + "," + field1235.field395 + "," + this.field1579 + "," + this.field1580 + "," + this.field1369 + "," + this.field1370 + "," + this.field1573 + "," + this.field1574);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)V")
    public final void method510(boolean arg0, int arg1, byte[] arg2) {
        int var4 = 94 / arg1;
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method511(boolean arg0) {
        if (!arg0) {
            this.field1614.method219(222);
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1409.method248(); var2 != null; var2 = (SpotAnimEntity) this.field1409.method250(8)) {
            if (this.field1299 == var2.field607 && !var2.field613) {
                if (field1314 >= var2.field606) {
                    var2.method151(this.field1526, -978);
                    if (var2.field613) {
                        var2.method106();
                    } else {
                        this.field1356.method61(var2, 6, var2.field609, 0, -1, var2.field608, var2.field607, 60, var2.field610, false);
                    }
                }
            } else {
                var2.method106();
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method512(int arg0) {
        byte[] var2 = this.field1237.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1654.method258(this.field1239);
        var3.method184(0, 0, true);
        this.field1655.method258(this.field1239);
        var3.method184(-637, 0, true);
        this.field1651.method258(this.field1239);
        var3.method184(-128, 0, true);
        this.field1652.method258(this.field1239);
        var3.method184(-202, -371, true);
        this.field1653.method258(this.field1239);
        var3.method184(-202, -171, true);
        this.field1656.method258(this.field1239);
        var3.method184(0, -265, true);
        this.field1657.method258(this.field1239);
        var3.method184(-562, -265, true);
        this.field1658.method258(this.field1239);
        var3.method184(-128, -171, true);
        this.field1659.method258(this.field1239);
        var3.method184(-562, -171, true);
        int[] var4 = new int[var3.field669];
        for (int var5 = 0; var5 < var3.field670; ++var5) {
            for (int var10 = 0; var10 < var3.field669; ++var10) {
                var4[var10] = var3.field668[var3.field669 * var5 + (var3.field669 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field669; ++var11) {
                var3.field668[var3.field669 * var5 + var11] = var4[var11];
            }
        }
        this.field1654.method258(this.field1239);
        var3.method184(382, 0, true);
        this.field1655.method258(this.field1239);
        var3.method184(-255, 0, true);
        this.field1651.method258(this.field1239);
        var3.method184(254, 0, true);
        this.field1652.method258(this.field1239);
        var3.method184(180, -371, true);
        while (arg0 >= 0) {
            this.field1289 = this.field1631.method229();
        }
        this.field1653.method258(this.field1239);
        var3.method184(180, -171, true);
        this.field1656.method258(this.field1239);
        var3.method184(382, -265, true);
        this.field1657.method258(this.field1239);
        var3.method184(-180, -265, true);
        this.field1658.method258(this.field1239);
        var3.method184(254, -171, true);
        this.field1659.method258(this.field1239);
        var3.method184(-180, -171, true);
        Pix32 var6 = new Pix32(this.field1237, "logo", 0);
        this.field1651.method258(this.field1239);
        var6.method186(382 - var6.field669 / 2 - 128, 0, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;BI)I")
    public final int method513(Component arg0, byte arg1, int arg2) {
        if (arg1 != -51) {
            this.field1469 = this.field1293.method295();
        }
        if (arg0.field82 != null && arg2 < arg0.field82.length) {
            try {
                int[] var4 = arg0.field82[arg2];
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
                        var9 = this.field1595[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1605[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1512[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field67[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1044 && (!ObjType.method348(var12).field1065 || field1429)) {
                            for (int var13 = 0; var13 < var11.field68.length; ++var13) {
                                if (var12 + 1 == var11.field68[var13]) {
                                    var9 += var11.field69[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1416[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1431[this.field1605[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1416[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1235.field462;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1160; ++var14) {
                            if (Stats.field1162[var14]) {
                                var9 += this.field1605[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field67[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1044 && (!ObjType.method348(var16).field1065 || field1429)) {
                            for (int var17 = 0; var17 < var15.field68.length; ++var17) {
                                if (var15.field68[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1362;
                    }
                    if (var8 == 12) {
                        var9 = this.field1468;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1416[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1180[var20];
                        int var22 = var21.field1182;
                        int var23 = var21.field1183;
                        int var24 = var21.field1184;
                        int var25 = field1425[var24 - var23];
                        var9 = this.field1416[var22] >> var23 & var25;
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
                        var9 = (field1235.field394 >> 7) + this.field1573;
                    }
                    if (var8 == 19) {
                        var9 = (field1235.field395 >> 7) + this.field1574;
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

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method514(int arg0) {
        if (arg0 != 0) {
            this.field1289 = this.field1631.method229();
        }
        LocType.field994.method103();
        LocType.field995.method103();
        NpcType.field1040.method103();
        ObjType.field1090.method103();
        ObjType.field1091.method103();
        PlayerEntity.field480.method103();
        SpotAnimType.field1177.method103();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 == 35628) {
            this.field1365 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILab;IZ)V")
    public final void method515(int arg0, int arg1, PlayerEntity arg2, int arg3, boolean arg4) {
        if (field1235 != arg2) {
            if (this.field1571 < 400) {
                String var6;
                if (arg2.field463 == 0) {
                    var6 = arg2.field456 + method464(arg2.field462, 0, field1235.field462) + " (level-" + arg2.field462 + ")";
                } else {
                    var6 = arg2.field456 + " (skill-" + arg2.field463 + ")";
                }
                if (this.field1410 == 1) {
                    this.field1433[this.field1571] = "Use " + this.field1414 + " with @whi@" + var6;
                    this.field1226[this.field1571] = 275;
                    this.field1227[this.field1571] = arg3;
                    this.field1224[this.field1571] = arg1;
                    this.field1225[this.field1571] = arg0;
                    ++this.field1571;
                } else if (this.field1441 == 1) {
                    if ((this.field1443 & 8) == 8) {
                        this.field1433[this.field1571] = this.field1444 + " @whi@" + var6;
                        this.field1226[this.field1571] = 131;
                        this.field1227[this.field1571] = arg3;
                        this.field1224[this.field1571] = arg1;
                        this.field1225[this.field1571] = arg0;
                        ++this.field1571;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1568[var7] != null) {
                            this.field1433[this.field1571] = this.field1568[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1568[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field462 > field1235.field462) {
                                    var9 = 2000;
                                }
                                if (field1235.field479 != 0 && arg2.field479 != 0) {
                                    if (field1235.field479 == arg2.field479) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1569[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1226[this.field1571] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1226[this.field1571] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1226[this.field1571] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1226[this.field1571] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1226[this.field1571] = var9 + 185;
                            }
                            this.field1227[this.field1571] = arg3;
                            this.field1224[this.field1571] = arg1;
                            this.field1225[this.field1571] = arg0;
                            ++this.field1571;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1571; ++var8) {
                    if (this.field1226[var8] == 718) {
                        this.field1433[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg4) {
                    this.method6();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;II)V")
    private final void method516(Packet arg0, int arg1, int arg2) {
        this.field1387 = 0;
        this.field1320 = 0;
        if (arg2 < 0 || arg2 > 0) {
            this.field1532 = null;
        }
        this.method556(arg1, 816, arg0);
        this.method458(30846, arg0, arg1);
        this.method497(arg1, -27674, arg0);
        for (int var4 = 0; var4 < this.field1387; ++var4) {
            int var6 = this.field1388[var4];
            if (field1314 != this.field1646[var6].field439) {
                this.field1646[var6].field450 = null;
                this.field1646[var6] = null;
            }
        }
        if (arg0.field713 != arg1) {
            signlink.reporterror(this.field1474 + " size mismatch in getnpcpos - pos:" + arg0.field713 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1647; ++var5) {
                if (this.field1646[this.field1648[var5]] == null) {
                    signlink.reporterror(this.field1474 + " null entry in npc list - pos:" + var5 + " size:" + this.field1647);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;Z)Z")
    public final boolean method517(Component arg0, boolean arg1) {
        this.field1619 &= arg1;
        if (arg0.field83 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field83.length; ++var3) {
                int var4 = this.method513(arg0, (byte) -51, var3);
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

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method518(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method519(int arg0) {
        this.field1606 = new Pix8(this.field1237, "titlebox", 0);
        this.field1607 = new Pix8(this.field1237, "titlebutton", 0);
        this.field1437 = new Pix8[12];
        int var2 = 0;
        if (arg0 != -8322) {
            field1613 = -399;
        }
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1437[var3] = new Pix8(this.field1237, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1437[var4] = new Pix8(this.field1237, "runes", (var4 & 3) + 12);
            }
        }
        this.field1477 = new Pix32(128, 265);
        this.field1478 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1477.field668[var5] = this.field1654.field753[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1478.field668[var6] = this.field1655.field753[var6];
        }
        this.field1244 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1244[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1244[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1244[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1244[var10 + 192] = 16777215;
        }
        this.field1245 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1245[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1245[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1245[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1245[var14 + 192] = 16777215;
        }
        this.field1246 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1246[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1246[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1246[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1246[var18 + 192] = 16777215;
        }
        this.field1243 = new int[256];
        this.field1583 = new int[32768];
        this.field1584 = new int[32768];
        this.method481(16169, (Pix8) null);
        this.field1385 = new int[32768];
        this.field1386 = new int[32768];
        this.method13(10, (byte) 1, "Connecting to fileserver");
        if (!this.field1523) {
            this.field1660 = true;
            this.field1523 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method520(int arg0) {
        this.field1482 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1523) {
                ++this.field1620;
                this.method471(0);
                this.method471(0);
                this.method550(this.field1672);
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
        this.field1482 = false;
        if (arg0 >= 0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method521(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 >= 0) {
            this.field1289 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IZ)V")
    public final void method522(int arg0, int arg1, Component arg2, int arg3, boolean arg4) {
        if (arg2.field74 == 0 && arg2.field89 != null) {
            if (!arg2.field88 || this.field1502 == arg2.field72 || this.field1389 == arg2.field72 || this.field1638 == arg2.field72) {
                int var6 = Pix2D.field626;
                int var7 = Pix2D.field624;
                int var8 = Pix2D.field627;
                int var9 = Pix2D.field625;
                Pix2D.method154(arg1, arg3, arg2.field77 + arg1, false, arg2.field78 + arg3);
                int var10 = arg2.field89.length;
                if (arg4) {
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg2.field90[var11] + arg1;
                        int var13 = arg2.field91[var11] + arg3 - arg0;
                        Component var14 = Component.field67[arg2.field89[var11]];
                        int var15 = var14.field80 + var12;
                        int var16 = var14.field81 + var13;
                        if (var14.field76 > 0) {
                            this.method554(var14, false);
                        }
                        if (var14.field74 == 0) {
                            if (var14.field87 > var14.field86 - var14.field78) {
                                var14.field87 = var14.field86 - var14.field78;
                            }
                            if (var14.field87 < 0) {
                                var14.field87 = 0;
                            }
                            this.method522(var14.field87, var15, var14, var16, true);
                            if (var14.field86 > var14.field78) {
                                this.method446(var14.field86, -784, var14.field77 + var15, var14.field78, var14.field87, var16);
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
                                                    var30.method186(var20, 0, var21);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field68[var17] - 1;
                                            if (var20 > Pix2D.field626 - 32 && var20 < Pix2D.field627 && var21 > Pix2D.field624 - 32 && var21 < Pix2D.field625 || this.field1307 != 0 && this.field1306 == var17) {
                                                int var25 = 0;
                                                if (this.field1410 == 1 && this.field1411 == var17 && this.field1412 == var14.field72) {
                                                    var25 = 16777215;
                                                }
                                                Pix32 var26 = ObjType.method354((byte) 9, var25, var24, var14.field69[var17]);
                                                if (var26 != null) {
                                                    if (this.field1307 != 0 && this.field1306 == var17 && this.field1305 == var14.field72) {
                                                        var22 = super.field20 - this.field1308;
                                                        var23 = super.field21 - this.field1309;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field1284 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method188(var21 + var23, var20 + var22, 7, 128);
                                                        if (var21 + var23 < Pix2D.field624 && arg2.field87 > 0) {
                                                            int var27 = (Pix2D.field624 - var21 - var23) * this.field1526 / 3;
                                                            if (var27 > this.field1526 * 10) {
                                                                var27 = this.field1526 * 10;
                                                            }
                                                            if (var27 > arg2.field87) {
                                                                var27 = arg2.field87;
                                                            }
                                                            arg2.field87 -= var27;
                                                            this.field1309 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > Pix2D.field625 && arg2.field87 < arg2.field86 - arg2.field78) {
                                                            int var28 = (var21 + var23 + 32 - Pix2D.field625) * this.field1526 / 3;
                                                            if (var28 > this.field1526 * 10) {
                                                                var28 = this.field1526 * 10;
                                                            }
                                                            if (var28 > arg2.field86 - arg2.field78 - arg2.field87) {
                                                                var28 = arg2.field86 - arg2.field78 - arg2.field87;
                                                            }
                                                            arg2.field87 += var28;
                                                            this.field1309 -= var28;
                                                        }
                                                    } else if (this.field1516 != 0 && this.field1515 == var17 && this.field1514 == var14.field72) {
                                                        var26.method188(var21, var20, 7, 128);
                                                    } else {
                                                        var26.method186(var20, 0, var21);
                                                    }
                                                    if (var26.field673 == 33 || var14.field69[var17] != 1) {
                                                        int var29 = var14.field69[var17];
                                                        this.field1396.method206(method451(var29, 3), false, var21 + 10 + var23, var20 + 1 + var22, 0);
                                                        this.field1396.method206(method451(var29, 3), false, var21 + 9 + var23, var20 + var22, 16776960);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field74 == 3) {
                                boolean var31 = false;
                                if (this.field1638 == var14.field72 || this.field1389 == var14.field72 || this.field1502 == var14.field72) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method517(var14, true)) {
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
                                        Pix2D.method157(var32, var14.field78, var16, var14.field77, (byte) 5, var15);
                                    } else {
                                        Pix2D.method158(var15, var16, var14.field78, var32, var14.field77, (byte) -69);
                                    }
                                } else if (var14.field104) {
                                    Pix2D.method156(14017, var14.field78, var14.field77, 256 - (var14.field79 & 255), var32, var15, var16);
                                } else {
                                    Pix2D.method159(var16, 256 - (var14.field79 & 255), var14.field78, var14.field77, (byte) 72, var32, var15);
                                }
                            } else if (var14.field74 == 4) {
                                PixFont var33 = var14.field107;
                                String var34 = var14.field108;
                                boolean var35 = false;
                                if (this.field1638 == var14.field72 || this.field1389 == var14.field72 || this.field1502 == var14.field72) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method517(var14, true)) {
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
                                if (var14.field75 == 6 && this.field1663) {
                                    var34 = "Please wait...";
                                    var36 = var14.field110;
                                }
                                if (Pix2D.field622 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field699 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method433(-711, this.method513(var14, (byte) -51, 4)) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method433(-711, this.method513(var14, (byte) -51, 3)) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method433(-711, this.method513(var14, (byte) -51, 2)) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method433(-711, this.method513(var14, (byte) -51, 1)) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method433(-711, this.method513(var14, (byte) -51, 0)) + var34.substring(var38 + 2);
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
                                        var33.method203(var14.field106, 12737, var36, var44, var14.field77 / 2 + var15, var37);
                                    } else {
                                        var33.method210(var37, var15, var44, var36, var14.field106, (byte) 3);
                                    }
                                    var37 += var33.field699;
                                }
                            } else if (var14.field74 == 5) {
                                Pix32 var45;
                                if (this.method517(var14, true)) {
                                    var45 = var14.field115;
                                } else {
                                    var45 = var14.field114;
                                }
                                if (var45 != null) {
                                    var45.method186(var15, 0, var16);
                                }
                            } else if (var14.field74 == 6) {
                                int var46 = Pix3D.field639;
                                int var47 = Pix3D.field640;
                                Pix3D.field639 = var14.field77 / 2 + var15;
                                Pix3D.field640 = var14.field78 / 2 + var16;
                                int var48 = Pix3D.field643[var14.field123] * var14.field122 >> 16;
                                int var49 = Pix3D.field644[var14.field123] * var14.field122 >> 16;
                                boolean var50 = this.method517(var14, true);
                                int var51;
                                if (var50) {
                                    var51 = var14.field121;
                                } else {
                                    var51 = var14.field120;
                                }
                                Model var52;
                                if (var51 == -1) {
                                    var52 = var14.method34(-1, -1, var50, 0);
                                } else {
                                    SeqType var53 = SeqType.field1143[var51];
                                    var52 = var14.method34(var53.field1146[var14.field70], var53.field1145[var14.field70], var50, 0);
                                }
                                if (var52 != null) {
                                    var52.method146(0, var14.field124, 0, var14.field123, 0, var48, var49);
                                }
                                Pix3D.field639 = var46;
                                Pix3D.field640 = var47;
                            } else if (var14.field74 == 7) {
                                PixFont var54 = var14.field107;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field78; ++var56) {
                                    for (int var57 = 0; var57 < var14.field77; ++var57) {
                                        if (var14.field68[var55] > 0) {
                                            ObjType var58 = ObjType.method348(var14.field68[var55] - 1);
                                            String var59 = var58.field1052;
                                            if (var58.field1063 || var14.field69[var55] != 1) {
                                                var59 = var59 + " x" + method524(var14.field69[var55], false);
                                            }
                                            int var60 = (var14.field98 + 115) * var57 + var15;
                                            int var61 = (var14.field99 + 12) * var56 + var16;
                                            if (var14.field105) {
                                                var54.method203(var14.field106, 12737, var14.field110, var59, var14.field77 / 2 + var60, var61);
                                            } else {
                                                var54.method210(var61, var60, var59, var14.field110, var14.field106, (byte) 3);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                        }
                    }
                    Pix2D.method154(var6, var7, var8, false, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field1339 && !this.field1390 && !this.field1264) {
            ++field1314;
            if (!this.field1619) {
                this.method504(false);
            } else {
                this.method525(true);
            }
            this.method498(false);
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method523(byte[] arg0, int arg1, int arg2) {
        this.field1288 += arg2;
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method524(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method525(boolean arg0) {
        if (this.field1402 > 1) {
            --this.field1402;
        }
        if (this.field1292 > 0) {
            --this.field1292;
        }
        for (int var2 = 0; var2 < 5 && this.method431(0); ++var2) {
        }
        if (this.field1619) {
            Object var3 = this.field1508.field998;
            synchronized (this.field1508.field998) {
                if (!field1361) {
                    this.field1508.field999 = 0;
                } else if (super.field26 != 0 || this.field1508.field999 >= 40) {
                    this.field1614.method218(-744, 151);
                    this.field1614.method219(0);
                    int var4 = this.field1614.field713;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1508.field999 && var4 - this.field1614.field713 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1508.field1001[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1508.field1000[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1508.field1001[var6] == -1 && this.field1508.field1000[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1670 == var8 && this.field1671 == var7) {
                            if (this.field1639 < 2047) {
                                ++this.field1639;
                            }
                        } else {
                            int var10 = var8 - this.field1670;
                            this.field1670 = var8;
                            int var11 = var7 - this.field1671;
                            this.field1671 = var7;
                            if (this.field1639 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1614.method220((this.field1639 << 12) + (var10 << 6) + var11);
                                this.field1639 = 0;
                            } else if (this.field1639 < 8) {
                                this.field1614.method222((this.field1639 << 19) + 8388608 + var9);
                                this.field1639 = 0;
                            } else {
                                this.field1614.method223((this.field1639 << 19) + -1073741824 + var9);
                                this.field1639 = 0;
                            }
                        }
                    }
                    this.field1614.method228(this.field1614.field713 - var4, true);
                    if (var5 >= this.field1508.field999) {
                        this.field1508.field999 = 0;
                    } else {
                        this.field1508.field999 -= var5;
                        for (int var12 = 0; var12 < this.field1508.field999; ++var12) {
                            this.field1508.field1000[var12] = this.field1508.field1000[var5 + var12];
                            this.field1508.field1001[var12] = this.field1508.field1001[var5 + var12];
                        }
                    }
                }
            }
            if (super.field26 != 0) {
                long var13 = (super.field29 - this.field1503) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1503 = super.field29;
                int var15 = super.field28;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field27;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field26 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1614.method218(-744, 240);
                this.field1614.method223((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1581 > 0) {
                --this.field1581;
            }
            if (super.field30[1] == 1 || super.field30[2] == 1 || super.field30[3] == 1 || super.field30[4] == 1) {
                this.field1582 = true;
            }
            if (this.field1582 && this.field1581 <= 0) {
                this.field1581 = 20;
                this.field1582 = false;
                this.field1614.method218(-744, 169);
                this.field1614.method220(this.field1640);
                this.field1614.method220(this.field1641);
            }
            if (super.field17 && !this.field1644) {
                this.field1644 = true;
                this.field1614.method218(-744, 247);
                this.field1614.method219(1);
            }
            if (!super.field17 && this.field1644) {
                this.field1644 = false;
                this.field1614.method218(-744, 247);
                this.field1614.method219(0);
            }
            this.method467(true);
            this.method541(-6949);
            this.method447(3);
            ++this.field1290;
            if (this.field1290 > 750) {
                this.method445((byte) 1);
            }
            this.method429(0);
            this.method529(49698);
            this.method491((byte) 24);
            ++this.field1526;
            if (this.field1602 != 0) {
                this.field1601 += 20;
                if (this.field1601 >= 400) {
                    this.field1602 = 0;
                }
            }
            if (this.field1516 != 0) {
                ++this.field1513;
                if (this.field1513 >= 15) {
                    if (this.field1516 == 2) {
                        this.field1440 = true;
                    }
                    if (this.field1516 == 3) {
                        this.field1604 = true;
                    }
                    this.field1516 = 0;
                }
            }
            if (this.field1307 != 0) {
                ++this.field1284;
                if (super.field20 > this.field1308 + 5 || super.field20 < this.field1308 - 5 || super.field21 > this.field1309 + 5 || super.field21 < this.field1309 - 5) {
                    this.field1304 = true;
                }
                if (super.field19 == 0) {
                    if (this.field1307 == 2) {
                        this.field1440 = true;
                    }
                    if (this.field1307 == 3) {
                        this.field1604 = true;
                    }
                    this.field1307 = 0;
                    if (this.field1304 && this.field1284 >= 5) {
                        this.field1494 = -1;
                        this.method444(false);
                        if (this.field1494 == this.field1305 && this.field1493 != this.field1306) {
                            Component var20 = Component.field67[this.field1305];
                            byte var21 = 0;
                            if (this.field1334 == 1 && var20.field76 == 206) {
                                var21 = 1;
                            }
                            if (var20.field68[this.field1493] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field97) {
                                int var22 = this.field1306;
                                int var23 = this.field1493;
                                var20.field68[var23] = var20.field68[var22];
                                var20.field69[var23] = var20.field69[var22];
                                var20.field68[var22] = -1;
                                var20.field69[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1306;
                                int var25 = this.field1493;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24 - 1, var24, this.field1261);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24 + 1, var24, this.field1261);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1493, this.field1306, this.field1261);
                            }
                            this.field1614.method218(-744, 38);
                            this.field1614.method220(this.field1305);
                            this.field1614.method220(this.field1306);
                            this.field1614.method220(this.field1493);
                            this.field1614.method219(var21);
                        }
                    } else if ((this.field1281 == 1 || this.method496(false, this.field1571 - 1)) && this.field1571 > 2) {
                        this.method480((byte) 9);
                    } else if (this.field1571 > 0) {
                        this.method555(-368, this.field1571 - 1);
                    }
                    this.field1513 = 10;
                    super.field26 = 0;
                }
            }
            ++field1630;
            if (field1630 > 62) {
                field1630 = 0;
                this.field1614.method218(-744, 6);
            }
            if (World3D.field314 != -1) {
                int var26 = World3D.field314;
                int var27 = World3D.field315;
                boolean var28 = this.method488(field1235.field445[0], field1235.field444[0], 0, var26, var27, 0, true, 0, 0, (byte) 4, 0, 0);
                World3D.field314 = -1;
                if (var28) {
                    this.field1599 = super.field27;
                    this.field1600 = super.field28;
                    this.field1602 = 1;
                    this.field1601 = 0;
                }
            }
            if (super.field26 == 1 && this.field1298 != null) {
                this.field1298 = null;
                this.field1604 = true;
                super.field26 = 0;
            }
            this.method454(5);
            this.method450(25451);
            this.method528((byte) 2);
            if (!arg0) {
                this.method6();
            }
            this.method438(1);
            if (super.field19 == 1 || super.field26 == 1) {
                ++this.field1351;
            }
            if (this.field1393 == 2) {
                this.method509(-798);
            }
            if (this.field1393 == 2 && this.field1258) {
                this.method473(-267);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1300[var29]++;
            }
            this.method492((byte) 52);
            ++super.field18;
            if (super.field18 > 4500) {
                this.field1292 = 250;
                super.field18 -= 500;
                this.field1614.method218(-744, 80);
            }
            ++this.field1439;
            if (this.field1439 > 500) {
                this.field1439 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1332 += this.field1333;
                }
                if ((var30 & 2) == 2) {
                    this.field1349 += this.field1350;
                }
                if ((var30 & 4) == 4) {
                    this.field1310 += this.field1311;
                }
            }
            if (this.field1332 < -50) {
                this.field1333 = 2;
            }
            if (this.field1332 > 50) {
                this.field1333 = -2;
            }
            if (this.field1349 < -55) {
                this.field1350 = 2;
            }
            if (this.field1349 > 55) {
                this.field1350 = -2;
            }
            if (this.field1310 < -40) {
                this.field1311 = 1;
            }
            if (this.field1310 > 40) {
                this.field1311 = -1;
            }
            ++this.field1364;
            if (this.field1364 > 500) {
                this.field1364 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1466 += this.field1467;
                }
                if ((var31 & 2) == 2) {
                    this.field1352 += this.field1353;
                }
            }
            if (this.field1466 < -60) {
                this.field1467 = 2;
            }
            if (this.field1466 > 60) {
                this.field1467 = -2;
            }
            if (this.field1352 < -20) {
                this.field1353 = 1;
            }
            if (this.field1352 > 10) {
                this.field1353 = -1;
            }
            ++this.field1291;
            if (this.field1291 > 50) {
                this.field1614.method218(-744, 115);
            }
            try {
                if (this.field1615 != null && this.field1614.field713 > 0) {
                    this.field1615.method42(0, this.field1614.field713, -978, this.field1614.field712);
                    this.field1614.field713 = 0;
                    this.field1291 = 0;
                }
            } catch (IOException var33) {
                this.method445((byte) 1);
            } catch (Exception var34) {
                this.method562(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lgc;IIII)V")
    public final void method526(NpcType arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1571 < 400) {
            if (arg0.field1037 != null) {
                arg0 = arg0.method345(false);
            }
            if (arg0 != null) {
                String var6 = arg0.field1012;
                if (arg4 >= 0) {
                    this.field1469 = 2;
                }
                if (arg0.field1029 != 0) {
                    var6 = var6 + method464(arg0.field1029, 0, field1235.field462) + " (level-" + arg0.field1029 + ")";
                }
                if (this.field1410 == 1) {
                    this.field1433[this.field1571] = "Use " + this.field1414 + " with @yel@" + var6;
                    this.field1226[this.field1571] = 829;
                    this.field1227[this.field1571] = arg1;
                    this.field1224[this.field1571] = arg2;
                    this.field1225[this.field1571] = arg3;
                    ++this.field1571;
                } else {
                    if (this.field1441 == 1) {
                        if ((this.field1443 & 2) == 2) {
                            this.field1433[this.field1571] = this.field1444 + " @yel@" + var6;
                            this.field1226[this.field1571] = 240;
                            this.field1227[this.field1571] = arg1;
                            this.field1224[this.field1571] = arg2;
                            this.field1225[this.field1571] = arg3;
                            ++this.field1571;
                            return;
                        }
                    } else {
                        if (arg0.field1024 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg0.field1024[var7] != null && !arg0.field1024[var7].equalsIgnoreCase("attack")) {
                                    this.field1433[this.field1571] = arg0.field1024[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1226[this.field1571] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1226[this.field1571] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1226[this.field1571] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1226[this.field1571] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1226[this.field1571] = 793;
                                    }
                                    this.field1227[this.field1571] = arg1;
                                    this.field1224[this.field1571] = arg2;
                                    this.field1225[this.field1571] = arg3;
                                    ++this.field1571;
                                }
                            }
                        }
                        if (arg0.field1024 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg0.field1024[var8] != null && arg0.field1024[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg0.field1029 > field1235.field462) {
                                        var9 = 2000;
                                    }
                                    this.field1433[this.field1571] = arg0.field1024[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1226[this.field1571] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1226[this.field1571] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1226[this.field1571] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1226[this.field1571] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1226[this.field1571] = var9 + 793;
                                    }
                                    this.field1227[this.field1571] = arg1;
                                    this.field1224[this.field1571] = arg2;
                                    this.field1225[this.field1571] = arg3;
                                    ++this.field1571;
                                }
                            }
                        }
                        this.field1433[this.field1571] = "Examine @yel@" + var6;
                        this.field1226[this.field1571] = 1714;
                        this.field1227[this.field1571] = arg1;
                        this.field1224[this.field1571] = arg2;
                        this.field1225[this.field1571] = arg3;
                        ++this.field1571;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILjava/lang/String;Ljava/lang/String;I)Lxb;")
    public final Jagfile method527(int arg0, byte arg1, int arg2, String arg3, String arg4, int arg5) {
        byte[] var7 = null;
        if (arg1 != -56) {
            field1613 = this.field1293.method295();
        }
        int var8 = 5;
        try {
            if (this.field1283[0] != null) {
                var7 = this.field1283[0].method291(210, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1238.reset();
            this.field1238.update(var7);
            int var9 = (int) this.field1238.getValue();
            if (arg0 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(false, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(arg5, (byte) 1, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method495(arg4 + arg0);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, (byte) -93);
                    var17.field713 = 3;
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
                            this.method13(arg5, (byte) 1, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1283[0] != null) {
                            this.field1283[0].method292(var7, arg2, var7.length, -556);
                        }
                    } catch (Exception var29) {
                        this.field1283[0] = null;
                    }
                    if (var7 != null) {
                        this.field1238.reset();
                        this.field1238.update(var7);
                        int var24 = (int) this.field1238.getValue();
                        if (arg0 != var24) {
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
                            this.method13(arg5, (byte) 1, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(arg5, (byte) 1, var12 + " - Retrying in " + var26);
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
                    this.field1561 = !this.field1561;
                }
            }
            return new Jagfile(false, var7);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method528(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (super.field26 == 1) {
                if (super.field27 >= 539 && super.field27 <= 573 && super.field28 >= 169 && super.field28 < 205 && this.field1553[0] != -1) {
                    this.field1440 = true;
                    this.field1381 = 0;
                    this.field1498 = true;
                }
                if (super.field27 >= 569 && super.field27 <= 599 && super.field28 >= 168 && super.field28 < 205 && this.field1553[1] != -1) {
                    this.field1440 = true;
                    this.field1381 = 1;
                    this.field1498 = true;
                }
                if (super.field27 >= 597 && super.field27 <= 627 && super.field28 >= 168 && super.field28 < 205 && this.field1553[2] != -1) {
                    this.field1440 = true;
                    this.field1381 = 2;
                    this.field1498 = true;
                }
                if (super.field27 >= 625 && super.field27 <= 669 && super.field28 >= 168 && super.field28 < 203 && this.field1553[3] != -1) {
                    this.field1440 = true;
                    this.field1381 = 3;
                    this.field1498 = true;
                }
                if (super.field27 >= 666 && super.field27 <= 696 && super.field28 >= 168 && super.field28 < 205 && this.field1553[4] != -1) {
                    this.field1440 = true;
                    this.field1381 = 4;
                    this.field1498 = true;
                }
                if (super.field27 >= 694 && super.field27 <= 724 && super.field28 >= 168 && super.field28 < 205 && this.field1553[5] != -1) {
                    this.field1440 = true;
                    this.field1381 = 5;
                    this.field1498 = true;
                }
                if (super.field27 >= 722 && super.field27 <= 756 && super.field28 >= 169 && super.field28 < 205 && this.field1553[6] != -1) {
                    this.field1440 = true;
                    this.field1381 = 6;
                    this.field1498 = true;
                }
                if (super.field27 >= 540 && super.field27 <= 574 && super.field28 >= 466 && super.field28 < 502 && this.field1553[7] != -1) {
                    this.field1440 = true;
                    this.field1381 = 7;
                    this.field1498 = true;
                }
                if (super.field27 >= 572 && super.field27 <= 602 && super.field28 >= 466 && super.field28 < 503 && this.field1553[8] != -1) {
                    this.field1440 = true;
                    this.field1381 = 8;
                    this.field1498 = true;
                }
                if (super.field27 >= 599 && super.field27 <= 629 && super.field28 >= 466 && super.field28 < 503 && this.field1553[9] != -1) {
                    this.field1440 = true;
                    this.field1381 = 9;
                    this.field1498 = true;
                }
                if (super.field27 >= 627 && super.field27 <= 671 && super.field28 >= 467 && super.field28 < 502 && this.field1553[10] != -1) {
                    this.field1440 = true;
                    this.field1381 = 10;
                    this.field1498 = true;
                }
                if (super.field27 >= 669 && super.field27 <= 699 && super.field28 >= 466 && super.field28 < 503 && this.field1553[11] != -1) {
                    this.field1440 = true;
                    this.field1381 = 11;
                    this.field1498 = true;
                }
                if (super.field27 >= 696 && super.field27 <= 726 && super.field28 >= 466 && super.field28 < 503 && this.field1553[12] != -1) {
                    this.field1440 = true;
                    this.field1381 = 12;
                    this.field1498 = true;
                }
                if (super.field27 >= 724 && super.field27 <= 758 && super.field28 >= 466 && super.field28 < 502 && this.field1553[13] != -1) {
                    this.field1440 = true;
                    this.field1381 = 13;
                    this.field1498 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method529(int arg0) {
        for (int var2 = 0; var2 < this.field1647; ++var2) {
            int var3 = this.field1648[var2];
            NpcEntity var4 = this.field1646[var3];
            if (var4 != null) {
                this.method530(0, var4, var4.field450.field1014);
            }
        }
        if (arg0 != 49698) {
            this.field1289 = this.field1631.method229();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;I)V")
    public final void method530(int arg0, PathingEntity arg1, int arg2) {
        this.field1288 += arg0;
        if (arg1.field394 < 128 || arg1.field395 < 128 || arg1.field394 >= 13184 || arg1.field395 >= 13184) {
            arg1.field422 = -1;
            arg1.field427 = -1;
            arg1.field436 = 0;
            arg1.field437 = 0;
            arg1.field394 = arg1.field444[0] * 128 + arg1.field398 * 64;
            arg1.field395 = arg1.field445[0] * 128 + arg1.field398 * 64;
            arg1.method112(956);
        }
        if (field1235 == arg1 && (arg1.field394 < 1536 || arg1.field395 < 1536 || arg1.field394 >= 11776 || arg1.field395 >= 11776)) {
            arg1.field422 = -1;
            arg1.field427 = -1;
            arg1.field436 = 0;
            arg1.field437 = 0;
            arg1.field394 = arg1.field444[0] * 128 + arg1.field398 * 64;
            arg1.field395 = arg1.field445[0] * 128 + arg1.field398 * 64;
            arg1.method112(956);
        }
        if (arg1.field436 > field1314) {
            this.method531(arg1, -718);
        } else if (arg1.field437 >= field1314) {
            this.method532(arg1, (byte) 39);
        } else {
            this.method533(arg1, 180);
        }
        this.method534(arg1, this.field1531);
        this.method535(arg1, true);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method531(PathingEntity arg0, int arg1) {
        int var3 = arg0.field436 - field1314;
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg0.field432 * 128 + arg0.field398 * 64;
        int var6 = arg0.field434 * 128 + arg0.field398 * 64;
        arg0.field394 += (var5 - arg0.field394) / var3;
        arg0.field395 += (var6 - arg0.field395) / var3;
        arg0.field447 = 0;
        if (arg0.field438 == 0) {
            arg0.field441 = 1024;
        }
        if (arg0.field438 == 1) {
            arg0.field441 = 1536;
        }
        if (arg0.field438 == 2) {
            arg0.field441 = 0;
        }
        if (arg0.field438 == 3) {
            arg0.field441 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;B)V")
    public final void method532(PathingEntity arg0, byte arg1) {
        if (field1314 == arg0.field437 || arg0.field422 == -1 || arg0.field425 != 0 || arg0.field424 + 1 > SeqType.field1143[arg0.field422].method382((byte) -97, arg0.field423)) {
            int var3 = arg0.field437 - arg0.field436;
            int var4 = field1314 - arg0.field436;
            int var5 = arg0.field432 * 128 + arg0.field398 * 64;
            int var6 = arg0.field434 * 128 + arg0.field398 * 64;
            int var7 = arg0.field433 * 128 + arg0.field398 * 64;
            int var8 = arg0.field435 * 128 + arg0.field398 * 64;
            arg0.field394 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field395 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field447 = 0;
        if (arg1 == 39) {
            if (arg0.field438 == 0) {
                arg0.field441 = 1024;
            }
            if (arg0.field438 == 1) {
                arg0.field441 = 1536;
            }
            if (arg0.field438 == 2) {
                arg0.field441 = 0;
            }
            if (arg0.field438 == 3) {
                arg0.field441 = 512;
            }
            arg0.field396 = arg0.field441;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;I)V")
    public final void method533(PathingEntity arg0, int arg1) {
        arg0.field419 = arg0.field399;
        if (arg0.field443 == 0) {
            arg0.field447 = 0;
        } else {
            if (arg0.field422 != -1 && arg0.field425 == 0) {
                SeqType var3 = SeqType.field1143[arg0.field422];
                if (arg0.field448 > 0 && var3.field1155 == 0) {
                    ++arg0.field447;
                    return;
                }
                if (arg0.field448 <= 0 && var3.field1156 == 0) {
                    ++arg0.field447;
                    return;
                }
            }
            int var4 = arg0.field394;
            int var5 = arg0.field395;
            int var6 = arg0.field444[arg0.field443 - 1] * 128 + arg0.field398 * 64;
            int var7 = arg0.field445[arg0.field443 - 1] * 128 + arg0.field398 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field441 = 1280;
                    } else if (var5 > var7) {
                        arg0.field441 = 1792;
                    } else {
                        arg0.field441 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field441 = 768;
                    } else if (var5 > var7) {
                        arg0.field441 = 256;
                    } else {
                        arg0.field441 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field441 = 1024;
                } else {
                    arg0.field441 = 0;
                }
                int var8 = arg0.field441 - arg0.field396 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field402;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field401;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field404;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field403;
                }
                if (var9 == -1) {
                    var9 = arg0.field401;
                }
                arg0.field419 = var9;
                int var10 = 4;
                int var11 = 84 / arg1;
                if (arg0.field441 != arg0.field396 && arg0.field416 == -1 && arg0.field442 != 0) {
                    var10 = 2;
                }
                if (arg0.field443 > 2) {
                    var10 = 6;
                }
                if (arg0.field443 > 3) {
                    var10 = 8;
                }
                if (arg0.field447 > 0 && arg0.field443 > 1) {
                    var10 = 8;
                    --arg0.field447;
                }
                if (arg0.field446[arg0.field443 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field419 == arg0.field401 && arg0.field405 != -1) {
                    arg0.field419 = arg0.field405;
                }
                if (var4 < var6) {
                    arg0.field394 += var10;
                    if (arg0.field394 > var6) {
                        arg0.field394 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field394 -= var10;
                    if (arg0.field394 < var6) {
                        arg0.field394 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field395 += var10;
                    if (arg0.field395 > var7) {
                        arg0.field395 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field395 -= var10;
                    if (arg0.field395 < var7) {
                        arg0.field395 = var7;
                    }
                }
                if (arg0.field394 == var6 && arg0.field395 == var7) {
                    --arg0.field443;
                    if (arg0.field448 > 0) {
                        --arg0.field448;
                        return;
                    }
                }
            } else {
                arg0.field394 = var6;
                arg0.field395 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method534(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            this.field1421 = -223;
        }
        if (arg0.field442 != 0) {
            if (arg0.field416 != -1 && arg0.field416 < 32768) {
                NpcEntity var3 = this.field1646[arg0.field416];
                if (var3 != null) {
                    int var4 = arg0.field394 - var3.field394;
                    int var5 = arg0.field395 - var3.field395;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field441 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field416 >= 32768) {
                int var6 = arg0.field416 - 32768;
                if (this.field1257 == var6) {
                    var6 = this.field1316;
                }
                PlayerEntity var7 = this.field1317[var6];
                if (var7 != null) {
                    int var8 = arg0.field394 - var7.field394;
                    int var9 = arg0.field395 - var7.field395;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field441 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field417 != 0 || arg0.field418 != 0) && (arg0.field443 == 0 || arg0.field447 > 0)) {
                int var10 = arg0.field394 - (arg0.field417 - this.field1573 - this.field1573) * 64;
                int var11 = arg0.field395 - (arg0.field418 - this.field1574 - this.field1574) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field441 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field417 = 0;
                arg0.field418 = 0;
            }
            int var12 = arg0.field441 - arg0.field396 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field442 && var12 <= 2048 - arg0.field442) {
                    if (var12 > 1024) {
                        arg0.field396 -= arg0.field442;
                    } else {
                        arg0.field396 += arg0.field442;
                    }
                } else {
                    arg0.field396 = arg0.field441;
                }
                arg0.field396 &= 2047;
                if (arg0.field419 == arg0.field399 && arg0.field441 != arg0.field396) {
                    if (arg0.field400 != -1) {
                        arg0.field419 = arg0.field400;
                        return;
                    }
                    arg0.field419 = arg0.field401;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;Z)V")
    public final void method535(PathingEntity arg0, boolean arg1) {
        this.field1619 &= arg1;
        arg0.field397 = false;
        if (arg0.field419 != -1) {
            SeqType var3 = SeqType.field1143[arg0.field419];
            ++arg0.field421;
            if (arg0.field420 < var3.field1144 && arg0.field421 > var3.method382((byte) -97, arg0.field420)) {
                arg0.field421 = 0;
                ++arg0.field420;
            }
            if (arg0.field420 >= var3.field1144) {
                arg0.field421 = 0;
                arg0.field420 = 0;
            }
        }
        if (arg0.field427 != -1 && field1314 >= arg0.field430) {
            if (arg0.field428 < 0) {
                arg0.field428 = 0;
            }
            SeqType var4 = SpotAnimType.field1165[arg0.field427].field1169;
            ++arg0.field429;
            while (arg0.field428 < var4.field1144 && arg0.field429 > var4.method382((byte) -97, arg0.field428)) {
                arg0.field429 -= var4.method382((byte) -97, arg0.field428);
                ++arg0.field428;
            }
            if (arg0.field428 >= var4.field1144 && (arg0.field428 < 0 || arg0.field428 >= var4.field1144)) {
                arg0.field427 = -1;
            }
        }
        if (arg0.field422 != -1 && arg0.field425 <= 1) {
            SeqType var5 = SeqType.field1143[arg0.field422];
            if (var5.field1155 == 1 && arg0.field448 > 0 && arg0.field436 <= field1314 && arg0.field437 < field1314) {
                arg0.field425 = 1;
                return;
            }
        }
        if (arg0.field422 != -1 && arg0.field425 == 0) {
            SeqType var6 = SeqType.field1143[arg0.field422];
            ++arg0.field424;
            while (arg0.field423 < var6.field1144 && arg0.field424 > var6.method382((byte) -97, arg0.field423)) {
                arg0.field424 -= var6.method382((byte) -97, arg0.field423);
                ++arg0.field423;
            }
            if (arg0.field423 >= var6.field1144) {
                arg0.field423 -= var6.field1148;
                ++arg0.field426;
                if (arg0.field426 >= var6.field1154) {
                    arg0.field422 = -1;
                }
                if (arg0.field423 < 0 || arg0.field423 >= var6.field1144) {
                    arg0.field422 = -1;
                }
            }
            arg0.field397 = var6.field1150;
        }
        if (arg0.field425 > 0) {
            --arg0.field425;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method536(int arg0) {
        if (arg0 != -24615) {
            this.field1614.method219(95);
        }
        if (this.field1365) {
            this.field1365 = false;
            this.field1371.method259(0, super.field12, -38524, 4);
            this.field1372.method259(0, super.field12, -38524, 357);
            this.field1373.method259(722, super.field12, -38524, 4);
            this.field1374.method259(743, super.field12, -38524, 205);
            this.field1375.method259(0, super.field12, -38524, 0);
            this.field1376.method259(516, super.field12, -38524, 4);
            this.field1377.method259(516, super.field12, -38524, 205);
            this.field1378.method259(496, super.field12, -38524, 357);
            this.field1379.method259(0, super.field12, -38524, 338);
            this.field1440 = true;
            this.field1604 = true;
            this.field1498 = true;
            this.field1259 = true;
            if (this.field1393 != 2) {
                this.field1337.method259(4, super.field12, -38524, 4);
                this.field1336.method259(550, super.field12, -38524, 4);
            }
        }
        if (this.field1393 == 2) {
            this.method548(-754);
        }
        if (this.field1597 && this.field1343 == 1) {
            this.field1440 = true;
        }
        if (this.field1329 != -1) {
            boolean var2 = this.method552(this.field1526, this.field1329, (byte) 3);
            if (var2) {
                this.field1440 = true;
            }
        }
        if (this.field1516 == 2) {
            this.field1440 = true;
        }
        if (this.field1307 == 2) {
            this.field1440 = true;
        }
        if (this.field1440) {
            this.method561(586);
            this.field1440 = false;
        }
        if (this.field1236 == -1) {
            this.field1459.field87 = this.field1598 - this.field1438 - 77;
            if (super.field20 > 448 && super.field20 < 560 && super.field21 > 332) {
                this.method540(-528, 0, this.field1459, this.field1598, 77, false, super.field21 - 357, super.field20 - 17, 463);
            }
            int var3 = this.field1598 - 77 - this.field1459.field87;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1598 - 77) {
                var3 = this.field1598 - 77;
            }
            if (this.field1438 != var3) {
                this.field1438 = var3;
                this.field1604 = true;
            }
        }
        if (this.field1236 != -1) {
            boolean var4 = this.method552(this.field1526, this.field1236, (byte) 3);
            if (var4) {
                this.field1604 = true;
            }
        }
        if (this.field1516 == 3) {
            this.field1604 = true;
        }
        if (this.field1307 == 3) {
            this.field1604 = true;
        }
        if (this.field1298 != null) {
            this.field1604 = true;
        }
        if (this.field1597 && this.field1343 == 2) {
            this.field1604 = true;
        }
        if (this.field1604) {
            this.method456((byte) 40);
            this.field1604 = false;
        }
        if (this.field1393 == 2) {
            this.method462(0);
            this.field1336.method259(550, super.field12, -38524, 4);
        }
        if (this.field1323 != -1) {
            this.field1498 = true;
        }
        if (this.field1498) {
            if (this.field1323 != -1 && this.field1381 == this.field1323) {
                this.field1323 = -1;
                this.field1614.method218(-744, 36);
                this.field1614.method219(this.field1381);
            }
            this.field1498 = false;
            this.field1634.method258(this.field1239);
            this.field1453.method199(0, 0, 0);
            if (this.field1329 == -1) {
                if (this.field1553[this.field1381] != -1) {
                    if (this.field1381 == 0) {
                        this.field1665.method199(22, 0, 10);
                    }
                    if (this.field1381 == 1) {
                        this.field1666.method199(54, 0, 8);
                    }
                    if (this.field1381 == 2) {
                        this.field1666.method199(82, 0, 8);
                    }
                    if (this.field1381 == 3) {
                        this.field1667.method199(110, 0, 8);
                    }
                    if (this.field1381 == 4) {
                        this.field1669.method199(153, 0, 8);
                    }
                    if (this.field1381 == 5) {
                        this.field1669.method199(181, 0, 8);
                    }
                    if (this.field1381 == 6) {
                        this.field1668.method199(209, 0, 9);
                    }
                }
                if (this.field1553[0] != -1 && (this.field1323 != 0 || field1314 % 20 < 10)) {
                    this.field1270[0].method199(29, 0, 13);
                }
                if (this.field1553[1] != -1 && (this.field1323 != 1 || field1314 % 20 < 10)) {
                    this.field1270[1].method199(53, 0, 11);
                }
                if (this.field1553[2] != -1 && (this.field1323 != 2 || field1314 % 20 < 10)) {
                    this.field1270[2].method199(82, 0, 11);
                }
                if (this.field1553[3] != -1 && (this.field1323 != 3 || field1314 % 20 < 10)) {
                    this.field1270[3].method199(115, 0, 12);
                }
                if (this.field1553[4] != -1 && (this.field1323 != 4 || field1314 % 20 < 10)) {
                    this.field1270[4].method199(153, 0, 13);
                }
                if (this.field1553[5] != -1 && (this.field1323 != 5 || field1314 % 20 < 10)) {
                    this.field1270[5].method199(180, 0, 11);
                }
                if (this.field1553[6] != -1 && (this.field1323 != 6 || field1314 % 20 < 10)) {
                    this.field1270[6].method199(208, 0, 13);
                }
            }
            this.field1634.method259(516, super.field12, -38524, 160);
            this.field1633.method258(this.field1239);
            this.field1452.method199(0, 0, 0);
            if (this.field1329 == -1) {
                if (this.field1553[this.field1381] != -1) {
                    if (this.field1381 == 7) {
                        this.field1590.method199(42, 0, 0);
                    }
                    if (this.field1381 == 8) {
                        this.field1591.method199(74, 0, 0);
                    }
                    if (this.field1381 == 9) {
                        this.field1591.method199(102, 0, 0);
                    }
                    if (this.field1381 == 10) {
                        this.field1592.method199(130, 0, 1);
                    }
                    if (this.field1381 == 11) {
                        this.field1594.method199(173, 0, 0);
                    }
                    if (this.field1381 == 12) {
                        this.field1594.method199(201, 0, 0);
                    }
                    if (this.field1381 == 13) {
                        this.field1593.method199(229, 0, 0);
                    }
                }
                if (this.field1553[8] != -1 && (this.field1323 != 8 || field1314 % 20 < 10)) {
                    this.field1270[7].method199(74, 0, 2);
                }
                if (this.field1553[9] != -1 && (this.field1323 != 9 || field1314 % 20 < 10)) {
                    this.field1270[8].method199(102, 0, 3);
                }
                if (this.field1553[10] != -1 && (this.field1323 != 10 || field1314 % 20 < 10)) {
                    this.field1270[9].method199(137, 0, 4);
                }
                if (this.field1553[11] != -1 && (this.field1323 != 11 || field1314 % 20 < 10)) {
                    this.field1270[10].method199(174, 0, 2);
                }
                if (this.field1553[12] != -1 && (this.field1323 != 12 || field1314 % 20 < 10)) {
                    this.field1270[11].method199(201, 0, 2);
                }
                if (this.field1553[13] != -1 && (this.field1323 != 13 || field1314 % 20 < 10)) {
                    this.field1270[12].method199(226, 0, 2);
                }
            }
            this.field1633.method259(496, super.field12, -38524, 466);
            this.field1337.method258(this.field1239);
        }
        if (this.field1259) {
            this.field1259 = false;
            this.field1632.method258(this.field1239);
            this.field1451.method199(0, 0, 0);
            this.field1397.method203(true, 12737, 16777215, "Public chat", 55, 28);
            if (this.field1301 == 0) {
                this.field1397.method203(true, 12737, 65280, "On", 55, 41);
            }
            if (this.field1301 == 1) {
                this.field1397.method203(true, 12737, 16776960, "Friends", 55, 41);
            }
            if (this.field1301 == 2) {
                this.field1397.method203(true, 12737, 16711680, "Off", 55, 41);
            }
            if (this.field1301 == 3) {
                this.field1397.method203(true, 12737, 65535, "Hide", 55, 41);
            }
            this.field1397.method203(true, 12737, 16777215, "Private chat", 184, 28);
            if (this.field1357 == 0) {
                this.field1397.method203(true, 12737, 65280, "On", 184, 41);
            }
            if (this.field1357 == 1) {
                this.field1397.method203(true, 12737, 16776960, "Friends", 184, 41);
            }
            if (this.field1357 == 2) {
                this.field1397.method203(true, 12737, 16711680, "Off", 184, 41);
            }
            this.field1397.method203(true, 12737, 16777215, "Trade/compete", 324, 28);
            if (this.field1222 == 0) {
                this.field1397.method203(true, 12737, 65280, "On", 324, 41);
            }
            if (this.field1222 == 1) {
                this.field1397.method203(true, 12737, 16776960, "Friends", 324, 41);
            }
            if (this.field1222 == 2) {
                this.field1397.method203(true, 12737, 16711680, "Off", 324, 41);
            }
            this.field1397.method203(true, 12737, 16777215, "Report abuse", 458, 33);
            this.field1632.method259(0, super.field12, -38524, 453);
            this.field1337.method258(this.field1239);
        }
        this.field1526 = 0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IZ)V")
    public final void method537(int arg0, boolean arg1) {
        Component var3 = Component.field67[arg0];
        for (int var4 = 0; var4 < var3.field89.length && var3.field89[var4] != -1; ++var4) {
            Component var5 = Component.field67[var3.field89[var4]];
            if (var5.field74 == 1) {
                this.method537(var5.field72, false);
            }
            var5.field70 = 0;
            var5.field71 = 0;
        }
        if (arg1) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method538(byte arg0) {
        Graphics var2 = this.method11(-290).getGraphics();
        var2.setColor(Color.black);
        if (this.field1623 != arg0) {
            this.field1289 = -1;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method4(15425, 1);
        if (this.field1390) {
            this.field1523 = false;
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
        if (this.field1264) {
            this.field1523 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1339) {
            this.field1523 = false;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method539(int arg0, int arg1) {
        this.field1288 += arg1;
        if (!field1430) {
            if (Pix3D.field653[17] >= arg0) {
                Pix8 var3 = Pix3D.field647[17];
                int var4 = var3.field683 * var3.field682 - 1;
                int var5 = this.field1526 * var3.field682 * 2;
                byte[] var6 = var3.field680;
                byte[] var7 = this.field1426;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field680 = var7;
                this.field1426 = var6;
                Pix3D.method171((byte) -95, 17);
            }
            if (Pix3D.field653[24] >= arg0) {
                Pix8 var9 = Pix3D.field647[24];
                int var10 = var9.field683 * var9.field682 - 1;
                int var11 = this.field1526 * var9.field682 * 2;
                byte[] var12 = var9.field680;
                byte[] var13 = this.field1426;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field680 = var13;
                this.field1426 = var12;
                Pix3D.method171((byte) -95, 24);
            }
            if (Pix3D.field653[34] >= arg0) {
                Pix8 var15 = Pix3D.field647[34];
                int var16 = var15.field683 * var15.field682 - 1;
                int var17 = this.field1526 * var15.field682 * 2;
                byte[] var18 = var15.field680;
                byte[] var19 = this.field1426;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field680 = var19;
                this.field1426 = var18;
                Pix3D.method171((byte) -95, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field15 != null) {
                    return new URL("http://127.0.0.1:" + (field1428 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IIZIII)V")
    public final void method540(int arg0, int arg1, Component arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        while (arg0 >= 0) {
            this.field1289 = this.field1631.method229();
        }
        if (this.field1297) {
            this.field1618 = 32;
        } else {
            this.field1618 = 0;
        }
        this.field1297 = false;
        if (arg7 >= arg8 && arg7 < arg8 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
            arg2.field87 -= this.field1351 * 4;
            if (arg5) {
                this.field1440 = true;
                return;
            }
        } else if (arg7 >= arg8 && arg7 < arg8 + 16 && arg6 >= arg1 + arg4 - 16 && arg6 < arg1 + arg4) {
            arg2.field87 += this.field1351 * 4;
            if (arg5) {
                this.field1440 = true;
                return;
            }
        } else {
            if (arg7 < arg8 - this.field1618 || arg7 >= arg8 + 16 + this.field1618 || arg6 < arg1 + 16 || arg6 >= arg1 + arg4 - 16 || this.field1351 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg1 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg2.field87 = (arg3 - arg4) * var11 / var12;
            if (arg5) {
                this.field1440 = true;
            }
            this.field1297 = true;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    private final void method541(int arg0) {
        if (arg0 != -6949) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1393 == 2) {
            for (LocSpawned var3 = (LocSpawned) this.field1391.method248(); var3 != null; var3 = (LocSpawned) this.field1391.method250(8)) {
                if (var3.field742 > 0) {
                    --var3.field742;
                }
                if (var3.field742 == 0) {
                    if (var3.field735 < 0 || World.method30(var3.field735, var3.field737, (byte) 3)) {
                        this.method507(var3.field736, var3.field733, var3.field731, var3.field734, true, var3.field737, var3.field735, var3.field732);
                        var3.method106();
                    }
                } else {
                    if (var3.field741 > 0) {
                        --var3.field741;
                    }
                    if (var3.field741 == 0 && var3.field733 >= 1 && var3.field734 >= 1 && var3.field733 <= 102 && var3.field734 <= 102 && (var3.field738 < 0 || World.method30(var3.field738, var3.field740, (byte) 3))) {
                        this.method507(var3.field739, var3.field733, var3.field731, var3.field734, true, var3.field740, var3.field738, var3.field732);
                        var3.field741 = -1;
                        if (var3.field738 == var3.field735 && var3.field735 == -1) {
                            var3.method106();
                        } else if (var3.field738 == var3.field735 && var3.field739 == var3.field736 && var3.field740 == var3.field737) {
                            var3.method106();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZJ)V")
    public final void method542(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1423; ++var4) {
                if (this.field1486[var4] == arg1) {
                    --this.field1423;
                    this.field1440 = true;
                    for (int var5 = var4; var5 < this.field1423; ++var5) {
                        this.field1486[var5] = this.field1486[var5 + 1];
                    }
                    this.field1614.method218(-744, 104);
                    this.field1614.method225(arg1, (byte) 3);
                    break;
                }
            }
            this.field1619 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZJ)V")
    public final void method543(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1423 >= 100) {
                this.method553("Your ignore list is full. Max of 100 hit", 0, false, "");
            } else {
                String var4 = JString.method304((byte) 78, JString.method301(arg1, (byte) -48));
                if (!arg0) {
                    this.field1341 = -2;
                }
                for (int var5 = 0; var5 < this.field1423; ++var5) {
                    if (this.field1486[var5] == arg1) {
                        this.method553(var4 + " is already on your ignore list", 0, false, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1557; ++var6) {
                    if (this.field1230[var6] == arg1) {
                        this.method553("Please remove " + var4 + " from your friend list first", 0, false, "");
                        return;
                    }
                }
                this.field1486[this.field1423++] = arg1;
                this.field1440 = true;
                this.field1614.method218(-744, 158);
                this.field1614.method225(arg1, (byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILlb;)V")
    private final void method544(int arg0, int arg1, Packet arg2) {
        while (arg0 >= 0) {
            this.field1421 = -68;
        }
        while (arg2.field714 + 10 < arg1 * 8) {
            int var4 = arg2.method240(0, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field1317[var4] == null) {
                this.field1317[var4] = new PlayerEntity();
                if (this.field1322[var4] != null) {
                    this.field1317[var4].method116(0, this.field1322[var4]);
                }
            }
            this.field1319[this.field1318++] = var4;
            PlayerEntity var5 = this.field1317[var4];
            var5.field439 = field1314;
            int var6 = arg2.method240(0, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method240(0, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method240(0, 1);
            var5.method110(field1235.field444[0] + var6, false, var8 == 1, field1235.field445[0] + var7);
            int var9 = arg2.method240(0, 1);
            if (var9 == 1) {
                this.field1321[this.field1320++] = var4;
            }
        }
        arg2.method241(168);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public void method545(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1620);
        if (this.field1383 != null) {
            System.out.println("Od-cycle:" + this.field1383.field854);
        }
        System.out.println("loop-cycle:" + field1314);
        System.out.println("draw-cycle:" + field1577);
        System.out.println("ptype:" + this.field1289);
        System.out.println("psize:" + this.field1288);
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1289 = -1;
        }
        if (this.field1615 != null) {
            this.field1615.method43((byte) 4);
        }
        super.field9 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        while (arg0 >= 0) {
            this.field1363 = this.field1293.method295();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field15 != null) {
            return super.field15;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Llb;II)V")
    public final void method546(Packet arg0, int arg1, int arg2) {
        if (arg1 < 0) {
            if (arg2 != 136 && arg2 != 211) {
                if (arg2 == 2) {
                    int var4 = arg0.method229();
                    int var5 = (var4 >> 4 & 7) + this.field1449;
                    int var6 = (var4 & 7) + this.field1450;
                    int var7 = arg0.method229();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1570[var8];
                    int var11 = arg0.method231();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1626[this.field1299][var5][var6];
                        int var13 = this.field1626[this.field1299][var5 + 1][var6];
                        int var14 = this.field1626[this.field1299][var5 + 1][var6 + 1];
                        int var15 = this.field1626[this.field1299][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1356.method72(0, this.field1299, var6, var5);
                            if (var16 != null) {
                                int var17 = var16.field271 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field269 = new LocEntity(var11, false, 2, var9 + 4, var13, (byte) 86, var17, var14, var12, var15);
                                    var16.field270 = new LocEntity(var11, false, 2, var9 + 1 & 3, var13, (byte) 86, var17, var14, var12, var15);
                                } else {
                                    var16.field269 = new LocEntity(var11, false, var8, var9, var13, (byte) 86, var17, var14, var12, var15);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1356.method73(var5, this.field1299, var6, (byte) -20);
                            if (var18 != null) {
                                var18.field162 = new LocEntity(var11, false, 4, 0, var13, (byte) 86, var18.field163 >> 14 & 32767, var14, var12, var15);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1356.method74(var6, this.field1299, var5, (byte) 2);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field254 = new LocEntity(var11, false, var8, var9, var13, (byte) 86, var19.field262 >> 14 & 32767, var14, var12, var15);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1356.method75(var6, -461, var5, this.field1299);
                            if (var20 != null) {
                                var20.field193 = new LocEntity(var11, false, 22, var9, var13, (byte) 86, var20.field194 >> 14 & 32767, var14, var12, var15);
                            }
                        }
                    }
                } else if (arg2 == 147) {
                    int var21 = arg0.method229();
                    int var22 = (var21 >> 4 & 7) + this.field1449;
                    int var23 = (var21 & 7) + this.field1450;
                    int var24 = arg0.method231();
                    int var25 = arg0.method231();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field495 = var24;
                        var26.field496 = var25;
                        if (this.field1532[this.field1299][var22][var23] == null) {
                            this.field1532[this.field1299][var22][var23] = new LinkList(-16188);
                        }
                        this.field1532[this.field1299][var22][var23].method245(var26);
                        this.method476(var22, var23);
                    }
                } else if (arg2 == 53) {
                    int var27 = arg0.method229();
                    int var28 = (var27 >> 4 & 7) + this.field1449;
                    int var29 = (var27 & 7) + this.field1450;
                    int var30 = arg0.method231();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1532[this.field1299][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method248(); var32 != null; var32 = (ObjStackEntity) var31.method250(8)) {
                                if ((var30 & 32767) == var32.field495) {
                                    var32.method106();
                                    break;
                                }
                            }
                            if (var31.method248() == null) {
                                this.field1532[this.field1299][var28][var29] = null;
                            }
                            this.method476(var28, var29);
                        }
                    }
                } else if (arg2 == 30) {
                    int var33 = arg0.method229();
                    int var34 = (var33 >> 4 & 7) + this.field1449;
                    int var35 = (var33 & 7) + this.field1450;
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
                        ProjectileEntity var50 = new ProjectileEntity(var46, var38, this.method551(this.field1299, true, var47, var46) - var40, var47, 0, var41, var39, field1314 + var43, var45, field1314 + var42, this.field1299, var44);
                        var50.method120(field1314 + var42, this.method551(this.field1299, true, var49, var48) - var41, var49, var48, (byte) 105);
                        this.field1621.method245(var50);
                    }
                } else if (arg2 == 193) {
                    int var51 = arg0.method229();
                    int var52 = (var51 >> 4 & 7) + this.field1449;
                    int var53 = (var51 & 7) + this.field1450;
                    int var54 = arg0.method231();
                    int var55 = arg0.method229();
                    int var56 = arg0.method231();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(var56, this.field1299, var57, var54, -74, this.method551(this.field1299, true, var58, var57) - var55, field1314, var58);
                        this.field1409.method245(var59);
                    }
                } else if (arg2 == 137) {
                    int var60 = arg0.method229();
                    int var61 = (var60 >> 4 & 7) + this.field1449;
                    int var62 = (var60 & 7) + this.field1450;
                    int var63 = arg0.method231();
                    int var64 = arg0.method231();
                    int var65 = arg0.method231();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1257 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field495 = var63;
                        var66.field496 = var64;
                        if (this.field1532[this.field1299][var61][var62] == null) {
                            this.field1532[this.field1299][var61][var62] = new LinkList(-16188);
                        }
                        this.field1532[this.field1299][var61][var62].method245(var66);
                        this.method476(var61, var62);
                    }
                } else {
                    if (arg2 == 191) {
                        int var67 = arg0.method229();
                        int var68 = (var67 >> 4 & 7) + this.field1449;
                        int var69 = (var67 & 7) + this.field1450;
                        int var70 = arg0.method229();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1570[var71];
                        int var74 = arg0.method231();
                        int var75 = arg0.method231();
                        int var76 = arg0.method231();
                        int var77 = arg0.method231();
                        byte var78 = arg0.method230();
                        byte var79 = arg0.method230();
                        byte var80 = arg0.method230();
                        byte var81 = arg0.method230();
                        PlayerEntity var82;
                        if (this.field1257 == var77) {
                            var82 = field1235;
                        } else {
                            var82 = this.field1317[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method330(var74);
                            int var84 = this.field1626[this.field1299][var68][var69];
                            int var85 = this.field1626[this.field1299][var68 + 1][var69];
                            int var86 = this.field1626[this.field1299][var68 + 1][var69 + 1];
                            int var87 = this.field1626[this.field1299][var68][var69 + 1];
                            Model var88 = var83.method336(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method559(var69, false, -1, var76 + 1, var75 + 1, var68, 0, var73, this.field1299, 0);
                                var82.field466 = field1314 + var75;
                                var82.field467 = field1314 + var76;
                                var82.field471 = var88;
                                int var89 = var83.field964;
                                int var90 = var83.field965;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field965;
                                    var90 = var83.field964;
                                }
                                var82.field468 = var68 * 128 + var89 * 64;
                                var82.field470 = var69 * 128 + var90 * 64;
                                var82.field469 = this.method551(this.field1299, true, var82.field470, var82.field468);
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
                                var82.field472 = var68 + var78;
                                var82.field474 = var68 + var80;
                                var82.field473 = var69 + var79;
                                var82.field475 = var69 + var81;
                            }
                        }
                    }
                    if (arg2 != 253) {
                        if (arg2 == 222) {
                            int var101 = arg0.method229();
                            int var102 = (var101 >> 4 & 7) + this.field1449;
                            int var103 = (var101 & 7) + this.field1450;
                            int var104 = arg0.method231();
                            int var105 = arg0.method229();
                            int var106 = var105 >> 4 & 15;
                            int var107 = var105 & 7;
                            if (field1235.field444[0] >= var102 - var106 && field1235.field444[0] <= var102 + var106 && field1235.field445[0] >= var103 - var106 && field1235.field445[0] <= var103 + var106 && this.field1628 && !field1430 && this.field1420 < 50) {
                                this.field1360[this.field1420] = var104;
                                this.field1263[this.field1420] = var107;
                                this.field1358[this.field1420] = Wave.field919[var104];
                                ++this.field1420;
                                return;
                            }
                        }
                    } else {
                        int var93 = arg0.method229();
                        int var94 = (var93 >> 4 & 7) + this.field1449;
                        int var95 = (var93 & 7) + this.field1450;
                        int var96 = arg0.method231();
                        int var97 = arg0.method231();
                        int var98 = arg0.method231();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1532[this.field1299][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method248(); var100 != null; var100 = (ObjStackEntity) var99.method250(8)) {
                                    if ((var96 & 32767) == var100.field495 && var100.field496 == var97) {
                                        var100.field496 = var98;
                                        break;
                                    }
                                }
                                this.method476(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var108 = arg0.method229();
                int var109 = (var108 >> 4 & 7) + this.field1449;
                int var110 = (var108 & 7) + this.field1450;
                int var111 = arg0.method229();
                int var112 = var111 >> 2;
                int var113 = var111 & 3;
                int var114 = this.field1570[var112];
                int var115;
                if (arg2 == 211) {
                    var115 = -1;
                } else {
                    var115 = arg0.method231();
                }
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    this.method559(var110, false, var115, -1, 0, var109, var112, var114, this.field1299, var113);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)Ljava/lang/String;")
    public final String method547(int arg0) {
        if (arg0 <= 0) {
            this.field1289 = this.field1631.method229();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field15 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method548(int arg0) {
        ++this.field1496;
        this.method499(true, true);
        this.method489(45400, true);
        this.method499(false, true);
        while (arg0 >= 0) {
            this.field1614.method219(183);
        }
        this.method489(45400, false);
        this.method436((byte) 75);
        this.method511(true);
        if (!this.field1258) {
            int var2 = this.field1640;
            if (this.field1485 / 256 > var2) {
                var2 = this.field1485 / 256;
            }
            if (this.field1359[4] && this.field1497[4] + 128 > var2) {
                var2 = this.field1497[4] + 128;
            }
            int var3 = this.field1641 + this.field1310 & 2047;
            this.method430(this.field1579, var3, var2 * 3 + 600, this.field1580, this.method551(this.field1299, true, field1235.field395, field1235.field394) - 50, var2, 0);
        }
        int var4;
        if (!this.field1258) {
            var4 = this.method478(-817);
        } else {
            var4 = this.method479(0);
        }
        int var5 = this.field1608;
        int var6 = this.field1609;
        int var7 = this.field1610;
        int var8 = this.field1611;
        int var9 = this.field1612;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1359[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1462[var10] * 2 + 1) - (double) this.field1462[var10] + Math.sin((double) this.field1408[var10] / 100.0D * (double) this.field1300[var10]) * (double) this.field1497[var10]);
                if (var10 == 0) {
                    this.field1608 += var12;
                }
                if (var10 == 1) {
                    this.field1609 += var12;
                }
                if (var10 == 2) {
                    this.field1610 += var12;
                }
                if (var10 == 3) {
                    this.field1612 = this.field1612 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1611 += var12;
                    if (this.field1611 < 128) {
                        this.field1611 = 128;
                    }
                    if (this.field1611 > 383) {
                        this.field1611 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field654;
        Model.field595 = true;
        Model.field598 = 0;
        Model.field596 = super.field20 - 4;
        Model.field597 = super.field21 - 4;
        Pix2D.method155(-843);
        this.field1356.method89(var4, this.field1611, this.field1610, -295, this.field1612, this.field1608, this.field1609);
        this.field1356.method64(true);
        this.method493(false);
        this.method558(-36148);
        this.method539(var11, 0);
        this.method485(true);
        this.field1337.method259(4, super.field12, -38524, 4);
        this.field1608 = var5;
        this.field1609 = var6;
        this.field1610 = var7;
        this.field1611 = var8;
        this.field1612 = var9;
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public static final void method549(boolean arg0) {
        if (!arg0) {
            field1273 = !field1273;
        }
        World3D.field280 = false;
        Pix3D.field634 = false;
        field1430 = false;
        World.field41 = false;
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method550(int arg0) {
        short var2 = 256;
        if (this.field1400 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1400 > 768) {
                    this.field1243[var3] = this.method486(false, 1024 - this.field1400, this.field1245[var3], this.field1244[var3]);
                } else if (this.field1400 > 256) {
                    this.field1243[var3] = this.field1245[var3];
                } else {
                    this.field1243[var3] = this.method486(false, 256 - this.field1400, this.field1244[var3], this.field1245[var3]);
                }
            }
        } else if (this.field1401 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1401 > 768) {
                    this.field1243[var4] = this.method486(false, 1024 - this.field1401, this.field1246[var4], this.field1244[var4]);
                } else if (this.field1401 > 256) {
                    this.field1243[var4] = this.field1246[var4];
                } else {
                    this.field1243[var4] = this.method486(false, 256 - this.field1401, this.field1244[var4], this.field1246[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1243[var5] = this.field1244[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1654.field753[var6] = this.field1477.field668[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1501[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1385[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1243[var26];
                    int var30 = this.field1654.field753[var8];
                    this.field1654.field753[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 != 4) {
            field1302 = !field1302;
        }
        this.field1654.method259(0, super.field12, -38524, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1655.field753[var10] = this.field1478.field668[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1501[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1385[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1243[var18];
                    int var22 = this.field1655.field753[var16];
                    this.field1655.field753[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1655.method259(637, super.field12, -38524, 0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method551(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field1489[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field1626[var7][var5][var6] + this.field1626[var7][var5 + 1][var6] * var8 >> 7;
            this.field1619 &= arg1;
            int var11 = (128 - var8) * this.field1626[var7][var5][var6 + 1] + this.field1626[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Z")
    public final boolean method552(int arg0, int arg1, byte arg2) {
        boolean var4 = false;
        if (arg2 != 3) {
            throw new NullPointerException();
        } else {
            Component var5 = Component.field67[arg1];
            for (int var6 = 0; var6 < var5.field89.length && var5.field89[var6] != -1; ++var6) {
                Component var7 = Component.field67[var5.field89[var6]];
                if (var7.field74 == 1) {
                    var4 |= this.method552(arg0, var7.field72, (byte) 3);
                }
                if (var7.field74 == 6 && (var7.field120 != -1 || var7.field121 != -1)) {
                    boolean var8 = this.method517(var7, true);
                    int var9;
                    if (var8) {
                        var9 = var7.field121;
                    } else {
                        var9 = var7.field120;
                    }
                    if (var9 != -1) {
                        SeqType var10 = SeqType.field1143[var9];
                        var7.field71 += arg0;
                        while (var7.field71 > var10.method382((byte) -97, var7.field70)) {
                            var7.field71 -= var10.method382((byte) -97, var7.field70) + 1;
                            ++var7.field70;
                            if (var7.field70 >= var10.field1144) {
                                var7.field70 -= var10.field1148;
                                if (var7.field70 < 0 || var7.field70 >= var10.field1144) {
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
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
    public final void method553(String arg0, int arg1, boolean arg2, String arg3) {
        if (arg1 == 0 && this.field1472 != -1) {
            this.field1298 = arg0;
            super.field26 = 0;
        }
        if (this.field1236 == -1) {
            this.field1604 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1505[var5] = this.field1505[var5 - 1];
            this.field1506[var5] = this.field1506[var5 - 1];
            this.field1507[var5] = this.field1507[var5 - 1];
        }
        this.field1505[0] = arg1;
        if (arg2) {
            this.field1532 = null;
        }
        this.field1506[0] = arg3;
        this.field1507[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Ld;Z)V")
    public final void method554(Component arg0, boolean arg1) {
        int var3 = arg0.field76;
        if (arg1) {
            this.field1481 = this.field1293.method295();
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1557;
                if (this.field1558 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field108 = "";
                    arg0.field75 = 0;
                } else {
                    if (this.field1355[var3] == 0) {
                        arg0.field108 = "@red@Offline";
                    } else if (this.field1355[var3] == field1427) {
                        arg0.field108 = "@gre@World-" + (this.field1355[var3] - 9);
                    } else {
                        arg0.field108 = "@yel@World-" + (this.field1355[var3] - 9);
                    }
                    arg0.field75 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1557;
                if (this.field1558 != 2) {
                    var6 = 0;
                }
                arg0.field86 = var6 * 15 + 20;
                if (arg0.field86 <= arg0.field78) {
                    arg0.field86 = arg0.field78 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field1558 == 0) {
                    arg0.field108 = "Loading ignore list";
                    arg0.field75 = 0;
                } else if (var3 == 1 && this.field1558 == 0) {
                    arg0.field108 = "Please wait...";
                    arg0.field75 = 0;
                } else {
                    int var7 = this.field1423;
                    if (this.field1558 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field108 = "";
                        arg0.field75 = 0;
                    } else {
                        arg0.field108 = JString.method304((byte) 78, JString.method301(this.field1486[var3], (byte) -48));
                        arg0.field75 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field86 = this.field1423 * 15 + 20;
                if (arg0.field86 <= arg0.field78) {
                    arg0.field86 = arg0.field78 + 1;
                }
            } else if (var3 == 327) {
                arg0.field123 = 150;
                arg0.field124 = (int) (Math.sin((double) field1314 / 40.0D) * 256.0D) & 2047;
                if (this.field1559) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field1395[var8];
                        if (var15 >= 0 && !IdkType.field1123[var15].method377(this.field1363)) {
                            return;
                        }
                    }
                    this.field1559 = false;
                    Model[] var9 = new Model[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field1395[var11];
                        if (var14 >= 0) {
                            var9[var10++] = IdkType.field1123[var14].method378(this.field1303);
                        }
                    }
                    Model var12 = new Model(var9, var10, false);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field1436[var13] != 0) {
                            var12.method140(field1223[var13][0], field1223[var13][this.field1436[var13]]);
                            if (var13 == 1) {
                                var12.method140(field1509[0], field1509[this.field1436[var13]]);
                            }
                        }
                    }
                    var12.method133(5);
                    var12.method134(0, SeqType.field1143[field1235.field399].field1145[0]);
                    var12.method143(64, 850, -30, -50, -30, true);
                    arg0.field116 = 5;
                    arg0.field117 = 0;
                    Component.method36(var12, 5, false, 0);
                }
            } else if (var3 == 324) {
                if (this.field1327 == null) {
                    this.field1327 = arg0.field114;
                    this.field1328 = arg0.field115;
                }
                if (this.field1282) {
                    arg0.field114 = this.field1328;
                } else {
                    arg0.field114 = this.field1327;
                }
            } else if (var3 == 325) {
                if (this.field1327 == null) {
                    this.field1327 = arg0.field114;
                    this.field1328 = arg0.field115;
                }
                if (this.field1282) {
                    arg0.field114 = this.field1327;
                } else {
                    arg0.field114 = this.field1328;
                }
            } else if (var3 == 600) {
                arg0.field108 = this.field1392;
                if (field1314 % 20 < 10) {
                    arg0.field108 = arg0.field108 + "|";
                } else {
                    arg0.field108 = arg0.field108 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1479 >= 1) {
                        if (this.field1476) {
                            arg0.field110 = 16711680;
                            arg0.field108 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field110 = 16777215;
                            arg0.field108 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field108 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1534 != 0) {
                        String var16;
                        if (this.field1522 == 0) {
                            var16 = "earlier today";
                        } else if (this.field1522 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field1522 + " days ago";
                        }
                        arg0.field108 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg0.field108 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1405 == 0) {
                        arg0.field108 = "0 unread messages";
                        arg0.field110 = 16776960;
                    }
                    if (this.field1405 == 1) {
                        arg0.field108 = "1 unread message";
                        arg0.field110 = 65280;
                    }
                    if (this.field1405 > 1) {
                        arg0.field108 = this.field1405 + " unread messages";
                        arg0.field110 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1242 == 201) {
                        if (this.field1458 == 1) {
                            arg0.field108 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field108 = "";
                        }
                    } else if (this.field1242 == 200) {
                        arg0.field108 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field1242 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field1242 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field1242 + " days ago";
                        }
                        arg0.field108 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1242 == 201) {
                        if (this.field1458 == 1) {
                            arg0.field108 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field108 = "";
                        }
                    } else if (this.field1242 == 200) {
                        arg0.field108 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field108 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1242 == 201) {
                        if (this.field1458 == 1) {
                            arg0.field108 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field108 = "";
                        }
                    } else if (this.field1242 == 200) {
                        arg0.field108 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field108 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1558 == 0) {
            arg0.field108 = "Loading friend list";
            arg0.field75 = 0;
        } else if (var3 == 1 && this.field1558 == 1) {
            arg0.field108 = "Connecting to friendserver";
            arg0.field75 = 0;
        } else if (var3 == 2 && this.field1558 != 2) {
            arg0.field108 = "Please wait...";
            arg0.field75 = 0;
        } else {
            int var4 = this.field1557;
            if (this.field1558 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field108 = "";
                arg0.field75 = 0;
            } else {
                arg0.field108 = this.field1461[var3];
                arg0.field75 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1615 != null) {
                this.field1615.method38();
            }
        } catch (Exception var2) {
        }
        this.field1615 = null;
        this.method521(-585);
        if (this.field1508 != null) {
            this.field1508.field997 = false;
        }
        this.field1508 = null;
        this.field1383.method271();
        this.field1383 = null;
        this.field1614 = null;
        this.field1434 = null;
        this.field1631 = null;
        this.field1232 = null;
        this.field1324 = null;
        this.field1241 = null;
        this.field1233 = null;
        this.field1234 = null;
        this.field1626 = null;
        this.field1489 = null;
        this.field1356 = null;
        this.field1382 = null;
        this.field1326 = null;
        this.field1255 = null;
        this.field1673 = null;
        this.field1674 = null;
        this.field1426 = null;
        this.field1335 = null;
        this.field1336 = null;
        this.field1337 = null;
        this.field1338 = null;
        this.field1632 = null;
        this.field1633 = null;
        this.field1634 = null;
        this.field1371 = null;
        this.field1372 = null;
        this.field1373 = null;
        this.field1374 = null;
        this.field1375 = null;
        this.field1376 = null;
        this.field1377 = null;
        this.field1378 = null;
        this.field1379 = null;
        this.field1366 = null;
        this.field1367 = null;
        this.field1368 = null;
        this.field1451 = null;
        this.field1452 = null;
        this.field1453 = null;
        this.field1270 = null;
        this.field1665 = null;
        this.field1666 = null;
        this.field1667 = null;
        this.field1668 = null;
        this.field1669 = null;
        this.field1590 = null;
        this.field1591 = null;
        this.field1592 = null;
        this.field1593 = null;
        this.field1594 = null;
        this.field1500 = null;
        this.field1622 = null;
        this.field1499 = null;
        this.field1256 = null;
        this.field1265 = null;
        this.field1266 = null;
        this.field1267 = null;
        this.field1268 = null;
        this.field1511 = null;
        this.field1664 = null;
        this.field1492 = null;
        this.field1317 = null;
        this.field1319 = null;
        this.field1321 = null;
        this.field1322 = null;
        this.field1388 = null;
        this.field1646 = null;
        this.field1648 = null;
        this.field1532 = null;
        this.field1391 = null;
        this.field1621 = null;
        this.field1409 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1226 = null;
        this.field1227 = null;
        this.field1433 = null;
        this.field1416 = null;
        this.field1520 = null;
        this.field1521 = null;
        this.field1554 = null;
        this.field1249 = null;
        this.field1461 = null;
        this.field1230 = null;
        this.field1355 = null;
        this.field1654 = null;
        this.field1655 = null;
        this.field1651 = null;
        this.field1652 = null;
        this.field1653 = null;
        this.field1656 = null;
        this.field1657 = null;
        this.field1619 &= arg0;
        this.field1658 = null;
        this.field1659 = null;
        this.method487(0);
        LocType.method329(false);
        NpcType.method340(false);
        ObjType.method347(false);
        FloType.field1106 = null;
        IdkType.field1123 = null;
        Component.field67 = null;
        UnkType.field1130 = null;
        SeqType.field1143 = null;
        SpotAnimType.field1165 = null;
        SpotAnimType.field1177 = null;
        VarpType.field1190 = null;
        super.field13 = null;
        PlayerEntity.field480 = null;
        Pix3D.method164(false);
        World3D.method49(false);
        Model.method122(false);
        AnimFrame.method46(false);
        System.gc();
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method555(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1490) {
                this.field1490 = false;
                this.field1604 = true;
            }
            int var3 = this.field1224[arg1];
            int var4 = this.field1225[arg1];
            int var5 = this.field1226[arg1];
            int var6 = this.field1227[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 810 && this.method500(215, var3, var6, var4, this.field1394)) {
                this.field1614.method220(this.field1413);
                this.field1614.method220(this.field1411);
                this.field1614.method220(this.field1412);
            }
            if (var5 == 398) {
                this.field1614.method218(-744, 101);
                this.field1614.method220(var6);
                this.field1614.method220(var3);
                this.field1614.method220(var4);
                this.field1614.method220(this.field1413);
                this.field1614.method220(this.field1411);
                this.field1614.method220(this.field1412);
                this.field1513 = 0;
                this.field1514 = var4;
                this.field1515 = var3;
                this.field1516 = 2;
                if (Component.field67[var4].field73 == this.field1495) {
                    this.field1516 = 1;
                }
                if (Component.field67[var4].field73 == this.field1236) {
                    this.field1516 = 3;
                }
            }
            if (var5 == 111) {
                boolean var7 = this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 0, 0, (byte) 4, 2, 0);
                if (!var7) {
                    this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 1, 1, (byte) 4, 2, 0);
                }
                this.field1599 = super.field27;
                this.field1600 = super.field28;
                this.field1602 = 2;
                this.field1601 = 0;
                this.field1614.method218(-744, 163);
                this.field1614.method220(this.field1573 + var3);
                this.field1614.method220(this.field1574 + var4);
                this.field1614.method220(var6);
                this.field1614.method220(this.field1413);
                this.field1614.method220(this.field1411);
                this.field1614.method220(this.field1412);
            }
            if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                NpcEntity var9 = this.field1646[var6];
                if (var9 != null) {
                    this.method488(field1235.field445[0], field1235.field444[0], 0, var9.field444[0], var9.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                    this.field1599 = super.field27;
                    this.field1600 = super.field28;
                    this.field1602 = 2;
                    this.field1601 = 0;
                    if (var5 == 793) {
                        this.field1614.method218(-744, 188);
                    }
                    if (var5 == 852) {
                        this.field1614.method218(-744, 22);
                    }
                    if (var5 == 209) {
                        this.field1614.method218(-744, 4);
                    }
                    if (var5 == 242) {
                        this.field1614.method218(-744, 35);
                    }
                    if (var5 == 309) {
                        this.field1614.method218(-744, 239);
                    }
                    this.field1614.method220(var6);
                }
            }
            if (var5 == 1071) {
                this.method500(253, var3, var6, var4, this.field1394);
            }
            if (var5 == 743) {
                ++field1649;
                if (field1649 >= 124) {
                    this.field1614.method218(-744, 173);
                    this.field1614.method220(37954);
                }
                this.method500(98, var3, var6, var4, this.field1394);
            }
            if (var5 == 275) {
                PlayerEntity var10 = this.field1317[var6];
                if (var10 != null) {
                    this.method488(field1235.field445[0], field1235.field444[0], 0, var10.field444[0], var10.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                    this.field1599 = super.field27;
                    this.field1600 = super.field28;
                    this.field1602 = 2;
                    this.field1601 = 0;
                    this.field1614.method218(-744, 136);
                    this.field1614.method220(var6);
                    this.field1614.method220(this.field1413);
                    this.field1614.method220(this.field1411);
                    this.field1614.method220(this.field1412);
                }
            }
            if (var5 == 357) {
                this.method500(5, var3, var6, var4, this.field1394);
            }
            if (var5 == 829) {
                NpcEntity var11 = this.field1646[var6];
                if (var11 != null) {
                    this.method488(field1235.field445[0], field1235.field444[0], 0, var11.field444[0], var11.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                    this.field1599 = super.field27;
                    this.field1600 = super.field28;
                    this.field1602 = 2;
                    this.field1601 = 0;
                    this.field1614.method218(-744, 120);
                    this.field1614.method220(var6);
                    this.field1614.method220(this.field1413);
                    this.field1614.method220(this.field1411);
                    this.field1614.method220(this.field1412);
                }
            }
            if (var5 == 274) {
                Component var12 = Component.field67[var4];
                this.field1441 = 1;
                this.field1442 = var4;
                this.field1443 = var12.field127;
                this.field1410 = 0;
                this.field1440 = true;
                String var13 = var12.field125;
                if (var13.indexOf(" ") != -1) {
                    var13 = var13.substring(0, var13.indexOf(" "));
                }
                String var14 = var12.field125;
                if (var14.indexOf(" ") != -1) {
                    var14 = var14.substring(var14.indexOf(" ") + 1);
                }
                this.field1444 = var13 + " " + var12.field126 + " " + var14;
                if (this.field1443 == 16) {
                    this.field1440 = true;
                    this.field1381 = 3;
                    this.field1498 = true;
                }
            } else {
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var15 = this.field1433[arg1];
                    int var16 = var15.indexOf("@whi@");
                    if (var16 != -1) {
                        long var17 = JString.method300(var15.substring(var16 + 5).trim());
                        if (var5 == 605) {
                            this.method455(false, var17);
                        }
                        if (var5 == 47) {
                            this.method543(true, var17);
                        }
                        if (var5 == 513) {
                            this.method477(true, var17);
                        }
                        if (var5 == 884) {
                            this.method542(true, var17);
                        }
                    }
                }
                if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                    if (var5 == 100) {
                        this.field1614.method218(-744, 127);
                    }
                    if (var5 == 694) {
                        this.field1614.method218(-744, 64);
                    }
                    if (var5 == 795) {
                        this.field1614.method218(-744, 213);
                    }
                    if (var5 == 962) {
                        this.field1614.method218(-744, 156);
                    }
                    if (var5 == 681) {
                        ++field1487;
                        if (field1487 >= 116) {
                            this.field1614.method218(-744, 152);
                            this.field1614.method222(13018169);
                        }
                        this.field1614.method218(-744, 254);
                    }
                    this.field1614.method220(var6);
                    this.field1614.method220(var3);
                    this.field1614.method220(var4);
                    this.field1513 = 0;
                    this.field1514 = var4;
                    this.field1515 = var3;
                    this.field1516 = 2;
                    if (Component.field67[var4].field73 == this.field1495) {
                        this.field1516 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1236) {
                        this.field1516 = 3;
                    }
                }
                if (var5 == 737) {
                    this.method461(-453);
                }
                if (var5 == 370) {
                    boolean var19 = this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 0, 0, (byte) 4, 2, 0);
                    if (!var19) {
                        this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 1, 1, (byte) 4, 2, 0);
                    }
                    this.field1599 = super.field27;
                    this.field1600 = super.field28;
                    this.field1602 = 2;
                    this.field1601 = 0;
                    this.field1614.method218(-744, 195);
                    this.field1614.method220(this.field1573 + var3);
                    this.field1614.method220(this.field1574 + var4);
                    this.field1614.method220(var6);
                    this.field1614.method220(this.field1442);
                }
                if (var5 == 1381) {
                    int var21 = var6 >> 14 & 32767;
                    LocType var22 = LocType.method330(var21);
                    String var23;
                    if (var22.field961 != null) {
                        var23 = new String(var22.field961);
                    } else {
                        var23 = "It's a " + var22.field960 + ".";
                    }
                    this.method553(var23, 0, false, "");
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var24 = this.field1317[var6];
                    if (var24 != null) {
                        this.method488(field1235.field445[0], field1235.field444[0], 0, var24.field444[0], var24.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                        this.field1599 = super.field27;
                        this.field1600 = super.field28;
                        this.field1602 = 2;
                        this.field1601 = 0;
                        if (var5 == 185) {
                            this.field1614.method218(-744, 83);
                        }
                        if (var5 == 387) {
                            field1340 += var6;
                            if (field1340 >= 66) {
                                this.field1614.method218(-744, 222);
                                this.field1614.method219(154);
                            }
                            this.field1614.method218(-744, 241);
                        }
                        if (var5 == 499) {
                            this.field1614.method218(-744, 40);
                        }
                        if (var5 == 639) {
                            ++field1348;
                            if (field1348 >= 52) {
                                this.field1614.method218(-744, 0);
                                this.field1614.method219(131);
                            }
                            this.field1614.method218(-744, 10);
                        }
                        if (var5 == 27) {
                            this.field1614.method218(-744, 17);
                        }
                        this.field1614.method220(var6);
                    }
                }
                if (var5 == 721) {
                    field1228 += var4;
                    if (field1228 >= 139) {
                        this.field1614.method218(-744, 202);
                        this.field1614.method223(0);
                    }
                    this.method500(207, var3, var6, var4, this.field1394);
                }
                if (var5 == 997 && !this.field1663) {
                    this.field1614.method218(-744, 223);
                    this.field1614.method220(var4);
                    this.field1663 = true;
                }
                if (var5 == 435) {
                    this.field1614.method218(-744, 62);
                    this.field1614.method220(var4);
                    Component var25 = Component.field67[var4];
                    if (var25.field82 != null && var25.field82[0][0] == 5) {
                        int var26 = var25.field82[0][1];
                        this.field1416[var26] = 1 - this.field1416[var26];
                        this.method474(var26, true);
                        this.field1440 = true;
                    }
                }
                if (var5 == 102) {
                    this.field1410 = 1;
                    this.field1411 = var3;
                    this.field1412 = var4;
                    this.field1413 = var6;
                    this.field1414 = ObjType.method348(var6).field1052;
                    this.field1441 = 0;
                    this.field1440 = true;
                } else {
                    if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                        boolean var27 = this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 0, 0, (byte) 4, 2, 0);
                        if (!var27) {
                            this.method488(field1235.field445[0], field1235.field444[0], 0, var3, var4, 0, false, 1, 1, (byte) 4, 2, 0);
                        }
                        this.field1599 = super.field27;
                        this.field1600 = super.field28;
                        this.field1602 = 2;
                        this.field1601 = 0;
                        if (var5 == 139) {
                            if ((var3 & 3) == 0) {
                                ++field1279;
                            }
                            if (field1279 >= 123) {
                                this.field1614.method218(-744, 58);
                                this.field1614.method223(0);
                            }
                            this.field1614.method218(-744, 27);
                        }
                        if (var5 == 617) {
                            this.field1614.method218(-744, 60);
                        }
                        if (var5 == 662) {
                            field1448 += this.field1574;
                            if (field1448 >= 118) {
                                this.field1614.method218(-744, 26);
                                this.field1614.method223(0);
                            }
                            this.field1614.method218(-744, 211);
                        }
                        if (var5 == 224) {
                            field1555 += var4;
                            if (field1555 >= 75) {
                                this.field1614.method218(-744, 41);
                                this.field1614.method219(19);
                            }
                            this.field1614.method218(-744, 123);
                        }
                        if (var5 == 778) {
                            this.field1614.method218(-744, 42);
                        }
                        this.field1614.method220(this.field1573 + var3);
                        this.field1614.method220(this.field1574 + var4);
                        this.field1614.method220(var6);
                    }
                    if (var5 == 524) {
                        String var29 = this.field1433[arg1];
                        int var30 = var29.indexOf("@whi@");
                        if (var30 != -1) {
                            if (this.field1495 == -1) {
                                this.method461(-453);
                                this.field1392 = var29.substring(var30 + 5).trim();
                                this.field1476 = false;
                                for (int var31 = 0; var31 < Component.field67.length; ++var31) {
                                    if (Component.field67[var31] != null && Component.field67[var31].field76 == 600) {
                                        this.field1286 = this.field1495 = Component.field67[var31].field73;
                                        break;
                                    }
                                }
                            } else {
                                this.method553("Please close the interface you have open before using 'report abuse'", 0, false, "");
                            }
                        }
                    }
                    if (var5 == 902) {
                        String var32 = this.field1433[arg1];
                        int var33 = var32.indexOf("@whi@");
                        if (var33 != -1) {
                            long var34 = JString.method300(var32.substring(var33 + 5).trim());
                            int var36 = -1;
                            for (int var37 = 0; var37 < this.field1557; ++var37) {
                                if (this.field1230[var37] == var34) {
                                    var36 = var37;
                                    break;
                                }
                            }
                            if (var36 != -1 && this.field1355[var36] > 0) {
                                this.field1604 = true;
                                this.field1490 = false;
                                this.field1418 = true;
                                this.field1629 = "";
                                this.field1510 = 3;
                                this.field1457 = this.field1230[var36];
                                this.field1572 = "Enter message to send to " + this.field1461[var36];
                            }
                        }
                    }
                    if (var5 == 1152) {
                        ObjType var38 = ObjType.method348(var6);
                        String var39;
                        if (var38.field1053 != null) {
                            var39 = new String(var38.field1053);
                        } else {
                            var39 = "It's a " + var38.field1052 + ".";
                        }
                        this.method553(var39, 0, false, "");
                    }
                    if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                        if (var5 == 113) {
                            this.field1614.method218(-744, 88);
                        }
                        if (var5 == 555) {
                            this.field1614.method218(-744, 130);
                        }
                        if (var5 == 354) {
                            this.field1614.method218(-744, 87);
                        }
                        if (var5 == 582) {
                            if ((var6 & 3) == 0) {
                                ++field1456;
                            }
                            if (field1456 >= 133) {
                                this.field1614.method218(-744, 203);
                                this.field1614.method220(6118);
                            }
                            this.field1614.method218(-744, 198);
                        }
                        if (var5 == 331) {
                            this.field1614.method218(-744, 125);
                        }
                        this.field1614.method220(var6);
                        this.field1614.method220(var3);
                        this.field1614.method220(var4);
                        this.field1513 = 0;
                        this.field1514 = var4;
                        this.field1515 = var3;
                        this.field1516 = 2;
                        if (Component.field67[var4].field73 == this.field1495) {
                            this.field1516 = 1;
                        }
                        if (Component.field67[var4].field73 == this.field1236) {
                            this.field1516 = 3;
                        }
                    }
                    if (var5 == 507 || var5 == 957) {
                        String var40 = this.field1433[arg1];
                        int var41 = var40.indexOf("@whi@");
                        if (var41 != -1) {
                            String var42 = var40.substring(var41 + 5).trim();
                            String var43 = JString.method304((byte) 78, JString.method301(JString.method300(var42), (byte) -48));
                            boolean var44 = false;
                            for (int var45 = 0; var45 < this.field1318; ++var45) {
                                PlayerEntity var46 = this.field1317[this.field1319[var45]];
                                if (var46 != null && var46.field456 != null && var46.field456.equalsIgnoreCase(var43)) {
                                    this.method488(field1235.field445[0], field1235.field444[0], 0, var46.field444[0], var46.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                                    if (var5 == 507) {
                                        field1340 += var6;
                                        if (field1340 >= 66) {
                                            this.field1614.method218(-744, 222);
                                            this.field1614.method219(154);
                                        }
                                        this.field1614.method218(-744, 241);
                                    }
                                    if (var5 == 957) {
                                        ++field1348;
                                        if (field1348 >= 52) {
                                            this.field1614.method218(-744, 0);
                                            this.field1614.method219(131);
                                        }
                                        this.field1614.method218(-744, 10);
                                    }
                                    this.field1614.method220(this.field1319[var45]);
                                    var44 = true;
                                    break;
                                }
                            }
                            if (!var44) {
                                this.method553("Unable to find " + var43, 0, false, "");
                            }
                        }
                    }
                    if (var5 == 718) {
                        if (!this.field1597) {
                            this.field1356.method88(super.field27 - 4, super.field28 - 4, -193);
                        } else {
                            this.field1356.method88(var3 - 4, var4 - 4, -193);
                        }
                    }
                    if (var5 == 131) {
                        PlayerEntity var47 = this.field1317[var6];
                        if (var47 != null) {
                            this.method488(field1235.field445[0], field1235.field444[0], 0, var47.field444[0], var47.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                            this.field1599 = super.field27;
                            this.field1600 = super.field28;
                            this.field1602 = 2;
                            this.field1601 = 0;
                            this.field1614.method218(-744, 97);
                            this.field1614.method220(var6);
                            this.field1614.method220(this.field1442);
                        }
                    }
                    if (var5 == 625) {
                        this.method500(238, var3, var6, var4, this.field1394);
                    }
                    if (var5 == 1714) {
                        NpcEntity var48 = this.field1646[var6];
                        if (var48 != null) {
                            NpcType var49 = var48.field450;
                            if (var49.field1037 != null) {
                                var49 = var49.method345(false);
                            }
                            if (var49 != null) {
                                String var50;
                                if (var49.field1013 != null) {
                                    var50 = new String(var49.field1013);
                                } else {
                                    var50 = "It's a " + var49.field1012 + ".";
                                }
                                this.method553(var50, 0, false, "");
                            }
                        }
                    }
                    if (var5 == 225) {
                        this.field1614.method218(-744, 62);
                        this.field1614.method220(var4);
                        Component var51 = Component.field67[var4];
                        if (var51.field82 != null && var51.field82[0][0] == 5) {
                            int var52 = var51.field82[0][1];
                            if (this.field1416[var52] != var51.field84[0]) {
                                this.field1416[var52] = var51.field84[0];
                                this.method474(var52, true);
                                this.field1440 = true;
                            }
                        }
                    }
                    if (var5 == 231) {
                        Component var53 = Component.field67[var4];
                        boolean var54 = true;
                        if (var53.field76 > 0) {
                            var54 = this.method437(var53, true);
                        }
                        if (var54) {
                            this.field1614.method218(-744, 62);
                            this.field1614.method220(var4);
                        }
                    }
                    if (var5 == 563) {
                        this.field1614.method218(-744, 199);
                        this.field1614.method220(var6);
                        this.field1614.method220(var3);
                        this.field1614.method220(var4);
                        this.field1614.method220(this.field1442);
                        this.field1513 = 0;
                        this.field1514 = var4;
                        this.field1515 = var3;
                        this.field1516 = 2;
                        if (Component.field67[var4].field73 == this.field1495) {
                            this.field1516 = 1;
                        }
                        if (Component.field67[var4].field73 == this.field1236) {
                            this.field1516 = 3;
                        }
                    }
                    if (var5 == 240) {
                        NpcEntity var55 = this.field1646[var6];
                        if (var55 != null) {
                            this.method488(field1235.field445[0], field1235.field444[0], 0, var55.field444[0], var55.field445[0], 0, false, 1, 1, (byte) 4, 2, 0);
                            this.field1599 = super.field27;
                            this.field1600 = super.field28;
                            this.field1602 = 2;
                            this.field1601 = 0;
                            this.field1614.method218(-744, 100);
                            this.field1614.method220(var6);
                            this.field1614.method220(this.field1442);
                        }
                    }
                    if (var5 == 1328) {
                        ObjType var56 = ObjType.method348(var6);
                        Component var57 = Component.field67[var4];
                        String var58;
                        if (var57 != null && var57.field69[var3] >= 100000) {
                            var58 = var57.field69[var3] + " x " + var56.field1052;
                        } else if (var56.field1053 != null) {
                            var58 = new String(var56.field1053);
                        } else {
                            var58 = "It's a " + var56.field1052 + ".";
                        }
                        this.method553(var58, 0, false, "");
                    }
                    if (var5 == 899 && this.method500(124, var3, var6, var4, this.field1394)) {
                        this.field1614.method220(this.field1442);
                    }
                    this.field1410 = 0;
                    this.field1441 = 0;
                    this.field1440 = true;
                    while (arg0 >= 0) {
                        for (int var59 = 1; var59 > 0; ++var59) {
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILlb;)V")
    private final void method556(int arg0, int arg1, Packet arg2) {
        arg2.method239(true);
        int var4 = arg2.method240(0, 8);
        if (var4 < this.field1647) {
            for (int var5 = var4; var5 < this.field1647; ++var5) {
                this.field1388[this.field1387++] = this.field1648[var5];
            }
        }
        if (var4 > this.field1647) {
            signlink.reporterror(this.field1474 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1647 = 0;
            int var6 = 75 / arg1;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1648[var7];
                NpcEntity var9 = this.field1646[var8];
                int var10 = arg2.method240(0, 1);
                if (var10 == 0) {
                    this.field1648[this.field1647++] = var8;
                    var9.field439 = field1314;
                } else {
                    int var11 = arg2.method240(0, 2);
                    if (var11 == 0) {
                        this.field1648[this.field1647++] = var8;
                        var9.field439 = field1314;
                        this.field1321[this.field1320++] = var8;
                    } else if (var11 == 1) {
                        this.field1648[this.field1647++] = var8;
                        var9.field439 = field1314;
                        int var12 = arg2.method240(0, 3);
                        var9.method111(var12, 2, false);
                        int var13 = arg2.method240(0, 1);
                        if (var13 == 1) {
                            this.field1321[this.field1320++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1648[this.field1647++] = var8;
                        var9.field439 = field1314;
                        int var14 = arg2.method240(0, 3);
                        var9.method111(var14, 2, true);
                        int var15 = arg2.method240(0, 3);
                        var9.method111(var15, 2, true);
                        int var16 = arg2.method240(0, 1);
                        if (var16 == 1) {
                            this.field1321[this.field1320++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1388[this.field1387++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method557(byte arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1557; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1461[var3])) {
                    return true;
                }
            }
            if (this.field1567 != arg0) {
                throw new NullPointerException();
            } else {
                return arg1.equalsIgnoreCase(field1235.field456);
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (arg0 == -36148) {
            if (this.field1415 == 2) {
                this.method483(902, (this.field1250 - this.field1573 << 7) + this.field1253, this.field1252 * 2, (this.field1251 - this.field1574 << 7) + this.field1254);
                if (this.field1635 > -1 && field1314 % 20 < 10) {
                    this.field1499[2].method186(this.field1635 - 12, 0, this.field1636 - 28);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIIIII)V")
    private final void method559(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        LocSpawned var12 = (LocSpawned) this.field1391.method248();
        if (arg1) {
            this.field1289 = -1;
        }
        while (var12 != null) {
            if (var12.field731 == arg8 && var12.field733 == arg5 && var12.field734 == arg0 && var12.field732 == arg7) {
                var11 = var12;
                break;
            }
            var12 = (LocSpawned) this.field1391.method250(8);
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field731 = arg8;
            var11.field732 = arg7;
            var11.field733 = arg5;
            var11.field734 = arg0;
            this.method503(false, var11);
            this.field1391.method245(var11);
        }
        var11.field738 = arg2;
        var11.field740 = arg6;
        var11.field739 = arg9;
        var11.field741 = arg4;
        var11.field742 = arg3;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method560(byte arg0) {
        if (arg0 != 106) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1559 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field1395[var3] = -1;
            for (int var4 = 0; var4 < IdkType.field1122; ++var4) {
                if (!IdkType.field1123[var4].field1129 && IdkType.field1123[var4].field1124 == var3 + (this.field1282 ? 0 : 7)) {
                    this.field1395[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method561(int arg0) {
        this.field1335.method258(this.field1239);
        Pix3D.field645 = this.field1564;
        this.field1366.method199(0, 0, 0);
        if (this.field1329 != -1) {
            this.method522(0, 0, Component.field67[this.field1329], 0, true);
        } else if (this.field1553[this.field1381] != -1) {
            this.method522(0, 0, Component.field67[this.field1553[this.field1381]], 0, true);
        }
        if (this.field1597 && this.field1343 == 1) {
            this.method506(true);
        }
        this.field1335.method259(553, super.field12, -38524, 205);
        this.field1337.method258(this.field1239);
        int var2 = 67 / arg0;
        Pix3D.field645 = this.field1565;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method562(boolean arg0) {
        if (arg0) {
            this.field1289 = this.field1631.method229();
        }
        try {
            if (this.field1615 != null) {
                this.field1615.method38();
            }
        } catch (Exception var3) {
        }
        this.field1615 = null;
        this.field1619 = false;
        this.field1529 = 0;
        this.field1474 = "";
        this.field1475 = "";
        this.method514(0);
        this.field1356.method50(-571);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1382[var2].method359(214);
        }
        System.gc();
        this.method521(-585);
        this.field1480 = -1;
        this.field1463 = -1;
        this.field1313 = 0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1425[var1] = var0 - 1;
            var0 += var0;
        }
        field1427 = 10;
        field1429 = true;
        field1431 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1431[var3] = var2 / 4;
        }
        field1509 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1613 = -8322;
        field1617 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1637 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1662 = 3;
    }
}
